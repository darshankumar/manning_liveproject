package com.manning.live.cakefactory.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.manning.live.cakefactory.domain.Item;
import com.manning.live.cakefactory.domain.ItemRepository;

@Component
public class CatalogServiceImpl implements CatalogService {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	ItemRepository itemRepository;

	@Override
	public List<Item> getAllItem() {
		List<Item> ilist = new ArrayList<Item>();
		Item item1 = new Item(1, "Honey1");
		Item item2 = new Item(2, "Honey2");
		Item item3 = new Item(2, "Honey3");
		Item item4 = new Item(2, "Honey4");
		Item item5 = new Item(2, "Honey5");
		Item item6 = new Item(2, "Honey6");
		ilist.add(item1);
		ilist.add(item2);
		ilist.add(item3);
		ilist.add(item4);
		ilist.add(item5);
		ilist.add(item6);

		return ilist;
	}

	@Override
	public List<Item> getAllItemDB() {
		String itemSql = "SELECT ID,ITEM_NAME FROM ITEMS";
		RowMapper<Item> rowMapper = (rs, num) -> {
			return new Item(rs.getInt("ID"), rs.getString("ITEM_NAME"));
		};
		List<Item> ilist = jdbcTemplate.query(itemSql, rowMapper);
		return ilist;
	}
	
	@Override
	public List<Item> getAllItemByRepo() {
		List<Item> ilist = new ArrayList<Item>();
		Iterable<Item> all = itemRepository.findAll();
		all.forEach(ilist::add);
		return ilist;
	}
}
