package com.wyb.springbootspark.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import java.util.Map;

@Data
// @NoArgsConstructor
public class SparkApplicationParam {

    /**
     * 任务的主类
     */
    private String mainClass;
    /**
     * jar包路径
     */
    private String jarPath;
    // @Value("${spark.master:yarn}")
    private String master;
    // @Value("${spark.deploy.mode:cluster}")
    // private String deployMode;
    // @Value("${spark.driver.memory:1g}")
    private String driverMemory;
    // @Value("${spark.executor.memory:1g}")
    private String executorMemory;
    // @Value("${spark.executor.cores:1}")
    private String executorCores;

    /**
     * 其他配置：传递给spark job的参数
     */
    private Map<String, String> otherConfParams;

    public SparkApplicationParam() {
    }


    public String getMainClass() {
        return mainClass;
    }

    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }

    public String getJarPath() {
        return jarPath;
    }

    public void setJarPath(String jarPath) {
        this.jarPath = jarPath;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public String getDriverMemory() {
        return driverMemory;
    }

    public void setDriverMemory(String driverMemory) {
        this.driverMemory = driverMemory;
    }

    public String getExecutorMemory() {
        return executorMemory;
    }

    public void setExecutorMemory(String executorMemory) {
        this.executorMemory = executorMemory;
    }

    public String getExecutorCores() {
        return executorCores;
    }

    public void setExecutorCores(String executorCores) {
        this.executorCores = executorCores;
    }

    public Map<String, String> getOtherConfParams() {
        return otherConfParams;
    }

    public void setOtherConfParams(Map<String, String> otherConfParams) {
        this.otherConfParams = otherConfParams;
    }


    public SparkApplicationParam(String mainClass, String jarPath, String master, String driverMemory, String executorMemory, String executorCores, Map<String, String> otherConfParams) {
        this.mainClass = mainClass;
        this.jarPath = jarPath;
        this.master = master;
        this.driverMemory = driverMemory;
        this.executorMemory = executorMemory;
        this.executorCores = executorCores;
        this.otherConfParams = otherConfParams;
    }

    /**
     * 调用该方法可获取spark任务的设置参数
     * @return SparkApplicationParam
     */
    public SparkApplicationParam getSparkApplicationParam(){
        // return new SparkApplicationParam(mainClass, jarPath, master, deployMode, driverMemory, executorMemory, executorCores, otherConfParams);
        return new SparkApplicationParam(mainClass, jarPath, master, driverMemory, executorMemory, executorCores, otherConfParams);
    }




    @Override
    public String toString() {
        return "SparkApplicationParam{" +
                "mainClass='" + mainClass + '\'' +
                ", jarPath='" + jarPath + '\'' +
                ", master='" + master + '\'' +
                ", driverMemory='" + driverMemory + '\'' +
                ", executorMemory='" + executorMemory + '\'' +
                ", executorCores='" + executorCores + '\'' +
                ", otherConfParams=" + otherConfParams +
                '}';
    }
}