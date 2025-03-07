package com.dao;

import com.entity.ShujigoumaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShujigoumaiView;

/**
 * 书籍购买 Dao 接口
 *
 * @author 
 */
public interface ShujigoumaiDao extends BaseMapper<ShujigoumaiEntity> {

   List<ShujigoumaiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
