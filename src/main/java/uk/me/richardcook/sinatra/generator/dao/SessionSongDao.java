package uk.me.richardcook.sinatra.generator.dao;

import uk.me.richardcook.sinatra.generator.model.SessionSong;
import uk.me.richardcook.sinatra.generator.model.SessionSongJoined;

import java.util.List;

public interface SessionSongDao {

	List<SessionSong> findForSession( int id );

	List<Integer> findIdsForSession( int id );

	List<SessionSong> findAll();

	SessionSong find( int id );

	void save( SessionSong sessionSong );

	void update( SessionSong sessionSong );

	SessionSong findBySessionPosition( Integer session, Integer position );

	List<Integer> getIdsForSession( int id );

	void delete( int id );

	List<SessionSongJoined> findAllJoined();

	List<SessionSongJoined> findForSessionJoined( int id );
}
