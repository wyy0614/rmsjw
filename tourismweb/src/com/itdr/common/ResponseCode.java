package com.itdr.common;

public class ResponseCode <T>{

    private Integer status;
    private T data;
    private String msg;

    //多个构造函数
    private ResponseCode(T data){
        this.status = 200;
        this.data = data;
    }

    private ResponseCode(Integer status,String msg){
        this.status = status;
        this.msg = msg;
    }

    //成功获取数据的方法
    public static <T> ResponseCode toSuccess(T data){
        return new ResponseCode(data);
    }
    //失败返回信息的方法
    public static <T> ResponseCode todefeated(Integer status,String msg){
        return new ResponseCode(status,msg);
    }

    public static <T> ResponseCode todefeated(String msg){
        return new ResponseCode(100,msg);
    }

    @Override
    public String toString() {
        return "ResponseCode{" +
                "status=" + status +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}
