package com.manning.live.cakefactory.service;

import java.util.List;

import com.manning.live.cakefactory.domain.Item;

public interface CatalogService {

	public List<Item> getAllItem();
	
	public List<Item> getAllItemDB();
	
	public List<Item> getAllItemByRepo();
}
