package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Offer;

@Repository
public class OfferDAO {
	// 전형적으로 사용되는 틀
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public int getRowCount() {
		String sqlStatement = "select count(*) from offers";
		return jdbcTemplate.queryForObject(sqlStatement, Integer.class);

	}

	public Offer getOffer(String name) {
		String sqlStatement = "select * from offers where name=?";
		return jdbcTemplate.queryForObject(sqlStatement, new Object[] { name }, new RowMapper<Offer>() {
			// class inisiate 한번쓰고 버리기때문에 익명클래스(Anonymous class) 로 사용

			@Override
			public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {// method declare
				Offer offer = new Offer();

				offer.setId(rs.getInt("id"));
				offer.setName(rs.getString("name"));
				offer.setEmail(rs.getString("email"));
				offer.setText(rs.getString("text"));

				return offer;
			}

		});
	}

	// query and return multiple objects
	public List<Offer> getOffers() {
		String sqlStatement = "select * from offers";
		return jdbcTemplate.query(sqlStatement, new RowMapper<Offer>() {
			// class inisiate 한번쓰고 버리기때문에 익명클래스(Anonymous class) 로 사용

			@Override
			public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {// method declare
				Offer offer = new Offer();

				offer.setId(rs.getInt("id"));
				offer.setName(rs.getString("name"));
				offer.setEmail(rs.getString("email"));
				offer.setText(rs.getString("text"));

				return offer;
			}

		});// 10개면 10번불리고 1개면 1번물려서 리스트로들어감
	}

	public boolean insert(Offer offer) {
		String name = offer.getName();
		String email = offer.getEmail();
		String text = offer.getText();

		String sqlStatement = "insert into offers (name, email, text) values (?, ?, ?)";

		// update하면 int형으로 몇개가 insert되었는지 리턴됨 하나넣었으므로 1이면 정상
		return (jdbcTemplate.update(sqlStatement, new Object[] { name, email, text }) == 1);

	}

	public boolean update(Offer offer) {

		int id = offer.getId();
		String name = offer.getName();
		String email = offer.getEmail();
		String text = offer.getText();

		String sqlStatement = "update offers set name=?, email=?, text=? where id=?";

		return (jdbcTemplate.update(sqlStatement, new Object[] { name, email, text, id }) == 1);

	}

	public boolean delete(int id) {
		String sqlStatement = "delete from offers where id=?";

		return (jdbcTemplate.update(sqlStatement, new Object[] { id }) == 1);
	}
}
