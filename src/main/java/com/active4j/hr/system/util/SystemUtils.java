package com.active4j.hr.system.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.active4j.hr.system.entity.SysDicValueEntity;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;

/**
 * 系统工具类
 * @author teli_
 *
 */
public class SystemUtils {

	/**
	 * 数据字典map
	 */
	public static Map<String, List<SysDicValueEntity>> Sys_dictionary = new HashMap<String, List<SysDicValueEntity>>();
	
	/**
	 * 存入数据字典
	 * @param key
	 * @param map
	 */
	public static void putDictionary(String key, List<SysDicValueEntity> lst) {
		Sys_dictionary.put(key, lst);
	}
	
	/**
	 * 根据字典代码取得字典
	 * @param key
	 * @return
	 */
	public static List<SysDicValueEntity> getDictionaryLst(String key) {
		return Sys_dictionary.get(key);
	}
	
	
	/**
	 * 部门Id 名称
	 */
	public static Map<String, String> mapDept = new HashMap<String, String>();
	
	/**
	 * 存放部门信息
	 * @param id
	 * @param name
	 */
	public static void putDept(String id, String name) {
		mapDept.put(id, name);
	}
	
	/**
	 * 根据Id获取部门名称
	 * @param id
	 * @return
	 */
	public static String getDeptNameById(String id) {
		return StringUtils.isEmpty(mapDept.get(id)) ? "" : mapDept.get(id);
	}
	
	
}
