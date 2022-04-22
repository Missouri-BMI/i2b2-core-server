package edu.harvard.i2b2.crc.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import edu.harvard.i2b2.crc.datavo.pm.ParamType;

public class HiveCellParam  { //implements RowMapper<ParamType>{

	public ParamType mapRow(ResultSet rs, int rowNum) throws SQLException {

		ParamType param = new ParamType();
		param.setId(rs.getInt("id".toUpperCase()));
		param.setName(rs.getString("param_name_cd".toUpperCase()));
		param.setValue(rs.getString("value".toUpperCase()));
		param.setDatatype(rs.getString("datatype_cd".toUpperCase()));
		return param;

	}
}
