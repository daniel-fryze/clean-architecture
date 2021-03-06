package com.github.andbed.cleanarch.eventtype.infrastructure.repository.db.jpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.github.andbed.cleanarch.eventtype.core.boundary.provide.EventTypeRequestModel;
import com.github.andbed.cleanarch.eventtype.core.boundary.require.EventTypesFinder;
import com.github.andbed.cleanarch.eventtype.core.boundary.require.EventTypesPersister;
import com.github.andbed.cleanarch.eventtype.core.entity.EventType;

public class EventTypeRepository implements EventTypesFinder, EventTypesPersister {

	public EventTypeRepository() {
	}

	@Override
	public List<EventType> findAll(Optional<EventTypeRequestModel> requestModel) {
		String query = createQueryBasedOnParams(requestModel);
		return runQueryOnDB(query);
	}

	private List<EventType> runQueryOnDB(String query) {
		return new ArrayList<EventType>();
	}

	private String createQueryBasedOnParams(Optional<EventTypeRequestModel> params) {
		return "";
	}

	@Override
	public void persist(List<EventType> eventTypes) {
	}

}
