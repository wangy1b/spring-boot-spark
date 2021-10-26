package com.wyb.springbootspark.vo;

import com.wyb.springbootspark.entity.SparkApplicationParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
// @AllArgsConstructor
public class DataBaseExtractorVo extends SparkApplicationParam {
    /**
     * 数据库连接地址
     */
    private String url;
    /**
     * 数据库连接账号
     */
    private String userName;
    /**
     * 数据库密码
     */
    private String password;
    /**
     * 指定的表名
     */
    private String table;
    /**
     * 目标文件类型
     */
    private String targetFileType;
    /**
     * 目标文件保存路径
     */
    private String targetFilePath;

    public DataBaseExtractorVo(String mainClass, String jarPath, String master, String driverMemory, String executorMemory, String executorCores, Map<String, String> otherConfParams, String url, String userName, String password, String table, String targetFileType, String targetFilePath) {
        super(mainClass, jarPath, master, driverMemory, executorMemory, executorCores, otherConfParams);
        this.url = url;
        this.userName = userName;
        this.password = password;
        this.table = table;
        this.targetFileType = targetFileType;
        this.targetFilePath = targetFilePath;
    }
}