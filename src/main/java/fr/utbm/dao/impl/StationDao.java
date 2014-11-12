package fr.utbm.dao.impl;// default package
// Generated 31 oct. 2014 13:51:02 by Hibernate Tools 3.4.0.CR1

import fr.utbm.core.entity.Station;
import fr.utbm.dao.HibernateDao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;

/**
 * Home object for domain model class Station.
 *
 * @author Hibernate Tools
 * @see .Station
 */
public class StationDao extends HibernateDao {

	private static final Log log = LogFactory.getLog(StationDao.class);

	public void persist(Station transientInstance) {
		log.debug("persisting Station instance");
		super.persist(transientInstance);
	}

	public void update(Station instance) {
		log.debug("attaching dirty Station instance");
		super.update(instance);
	}

	public void delete(Station persistentInstance) {
		log.debug("deleting Station instance");
		super.delete(persistentInstance);
	}

	public Station findById(int id) {
		log.debug("getting Station instance with id: " + id);
		return (Station) super.get(Station.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Station> getAll() {
		log.debug("getting all Station instances");
		return (List<Station>) super.getAll(Station.class);
	}
}
