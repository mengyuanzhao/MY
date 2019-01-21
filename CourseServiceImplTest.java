package cn.yrcti.sup.modular.system.service.impl;

import cn.yrcti.sup.base.BaseJunit;
import cn.yrcti.sup.modular.system.model.Course;
import cn.yrcti.sup.modular.system.service.ICourseService;
import com.baomidou.mybatisplus.plugins.Page;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

import java.awt.*;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @author zhaomengyuanzmy
 * @since  2019-1-18
 */

public class CourseServiceImplTest extends BaseJunit  {

    @Resource
    ICourseService CourseService;

    /**
     * 测试获取所有课程列表
     */
    @Test
    public void list(){
        Page p = new Page(1,10);
        List<Map<String, Object>> list = this.CourseService.list(p,null,null,null);
    }

    /**
     * 测试根据申请记录id查询课程名称kcmc
     */
    @Test
    public void selectKcName(){
        Course c = this.CourseService.selectKcName(-1);
        assertNull(c);
    }

    /**
     * 测试获得推荐状态
     */
    @Test
    public void getRecommStatus(){
        int id1 = this.CourseService.getRecommStatus(1);
        assertNotNull(id1);
    }

    /**
     * 测试设置推荐状态
     */
    @Test
    public void setRecommStatus(){
        int id2 = this.CourseService.setRecommStatus(1,1);
        assertEquals(1,id2);
        assertEquals(2,id2); 
    }

    /**
     * 测试api获得课程列表
     */
    @Test
    public void getCourses(){

    }

    /**
     * 测试根据课程号获得课程
     */
    @Test
    public void getCourseByNum(){

    }

    /**
     *测试将过期的课程过滤掉，条件：学年!=当前年份|学期!=当前学期|当前周次不属于课程周次
     */
    @Test
    public void filterCourse(){

    }

    /**
     * 测试根据时间进行筛选
     */
    @Test
    public void filterCourseByTime(){

    }

    /**
     * 测试获得该课程在本学期的所有上课时间(基于当前时间)
     */
    @Test
    public void getCourseTimeList(){

    }
}
