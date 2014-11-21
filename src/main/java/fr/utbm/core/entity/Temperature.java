package fr.utbm.core.entity;

import fr.utbm.core.CoreDateFormat;
import fr.utbm.dao.DaoFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Temperature {
	private int id;
	private Sensor sensor;
	private float value;
	private Date date;

	public Temperature() {
	}

	public Temperature(Sensor sensor, float value, Date date) {
		this.sensor = sensor;
		this.value = value;
		this.date = date;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Sensor getSensor() {
		return this.sensor;
	}

	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}

	public float getValue() {
		return this.value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return String.valueOf(getValue());
	}

	public void setSensorId(int id) {
		setSensor(DaoFactory.getSensorDao().findById(id));
	}

	public String getFormattedDate() {
		SimpleDateFormat dateFormat = new CoreDateFormat();
		return dateFormat.format(getDate());
	}
}
