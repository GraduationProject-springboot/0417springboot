package com.entity.vo;

import com.entity.ZhaopinEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 工作岗位
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zhaopin")
public class ZhaopinVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 招聘信息名称
     */

    @TableField(value = "zhaopin_name")
    private String zhaopinName;


    /**
     * 招聘信息照片
     */

    @TableField(value = "zhaopin_photo")
    private String zhaopinPhoto;


    /**
     * 薪资待遇
     */

    @TableField(value = "zhaopin_daiyu")
    private String zhaopinDaiyu;


    /**
     * 上班地点
     */

    @TableField(value = "zhaopin_address")
    private String zhaopinAddress;


    /**
     * 联系人
     */

    @TableField(value = "lianxiren_name")
    private String lianxirenName;


    /**
     * 招聘电话
     */

    @TableField(value = "zhaopin_phone")
    private String zhaopinPhone;


    /**
     * 招聘岗位
     */

    @TableField(value = "zhaopin_types")
    private Integer zhaopinTypes;


    /**
     * 招聘人数
     */

    @TableField(value = "zhaopin_renshu_number")
    private Integer zhaopinRenshuNumber;


    /**
     * 招聘信息详情
     */

    @TableField(value = "zhaopin_content")
    private String zhaopinContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：招聘信息名称
	 */
    public String getZhaopinName() {
        return zhaopinName;
    }


    /**
	 * 获取：招聘信息名称
	 */

    public void setZhaopinName(String zhaopinName) {
        this.zhaopinName = zhaopinName;
    }
    /**
	 * 设置：招聘信息照片
	 */
    public String getZhaopinPhoto() {
        return zhaopinPhoto;
    }


    /**
	 * 获取：招聘信息照片
	 */

    public void setZhaopinPhoto(String zhaopinPhoto) {
        this.zhaopinPhoto = zhaopinPhoto;
    }
    /**
	 * 设置：薪资待遇
	 */
    public String getZhaopinDaiyu() {
        return zhaopinDaiyu;
    }


    /**
	 * 获取：薪资待遇
	 */

    public void setZhaopinDaiyu(String zhaopinDaiyu) {
        this.zhaopinDaiyu = zhaopinDaiyu;
    }
    /**
	 * 设置：上班地点
	 */
    public String getZhaopinAddress() {
        return zhaopinAddress;
    }


    /**
	 * 获取：上班地点
	 */

    public void setZhaopinAddress(String zhaopinAddress) {
        this.zhaopinAddress = zhaopinAddress;
    }
    /**
	 * 设置：联系人
	 */
    public String getLianxirenName() {
        return lianxirenName;
    }


    /**
	 * 获取：联系人
	 */

    public void setLianxirenName(String lianxirenName) {
        this.lianxirenName = lianxirenName;
    }
    /**
	 * 设置：招聘电话
	 */
    public String getZhaopinPhone() {
        return zhaopinPhone;
    }


    /**
	 * 获取：招聘电话
	 */

    public void setZhaopinPhone(String zhaopinPhone) {
        this.zhaopinPhone = zhaopinPhone;
    }
    /**
	 * 设置：招聘岗位
	 */
    public Integer getZhaopinTypes() {
        return zhaopinTypes;
    }


    /**
	 * 获取：招聘岗位
	 */

    public void setZhaopinTypes(Integer zhaopinTypes) {
        this.zhaopinTypes = zhaopinTypes;
    }
    /**
	 * 设置：招聘人数
	 */
    public Integer getZhaopinRenshuNumber() {
        return zhaopinRenshuNumber;
    }


    /**
	 * 获取：招聘人数
	 */

    public void setZhaopinRenshuNumber(Integer zhaopinRenshuNumber) {
        this.zhaopinRenshuNumber = zhaopinRenshuNumber;
    }
    /**
	 * 设置：招聘信息详情
	 */
    public String getZhaopinContent() {
        return zhaopinContent;
    }


    /**
	 * 获取：招聘信息详情
	 */

    public void setZhaopinContent(String zhaopinContent) {
        this.zhaopinContent = zhaopinContent;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
