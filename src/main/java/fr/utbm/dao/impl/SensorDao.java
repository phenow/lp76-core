package fr.utbm.dao.impl;// default package
// Generated 31 oct. 2014 13:51:02 by Hibernate Tools 3.4.0.CR1

import fr.utbm.core.entity.Sensor;
import fr.utbm.dao.HibernateDao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;

/**
 * Home object for domain model class Sensor.
 *
 * @author Hibernate Tools
 * @see .Sensor
 */
public class SensorDao extends HibernateDao {

	private static final Log log = LogFactory.getLog(SensorDao.class);

	public void persist(Sensor transientInstance) {
		log.debug("persisting Sensor instance");
		super.persist(transientInstance);
	}

	public void update(Sensor instance) {
		log.debug("attaching dirty Sensor instance");
		super.update(instance);
	}

	public void delete(Sensor persistentInstance) {
		log.debug("deleting Sensor instance");
		super.delete(persistentInstance);
	}

	public Sensor findById(int id) {
		log.debug("getting Sensor instance with id: " + id);
		return (Sensor) super.get(Sensor.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Sensor> getAll() {
		log.debug("getting all Sensor instances");
		return (List<Sensor>) super.getAll(Sensor.class);
	}
}
