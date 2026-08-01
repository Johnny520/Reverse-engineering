package top.suzhelan.qstory.entity;

import com.alibaba.fastjson2.InterfaceC2915;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class QSResult<T> implements Serializable {
    private int action;
    private int code;
    private T data;
    private String msg;

    public int getAction() {
        return this.action;
    }

    public int getCode() {
        return this.code;
    }

    public T getData() {
        return this.data;
    }

    public String getMsg() {
        return this.msg;
    }

    public boolean isSuccess() {
        return getCode() == 200;
    }

    public QSResult<T> setAction(int i) {
        this.action = i;
        return this;
    }

    public QSResult<T> setCode(int i) {
        this.code = i;
        return this;
    }

    public QSResult<T> setData(T t) {
        this.data = t;
        return this;
    }

    public QSResult<T> setMsg(String str) {
        this.msg = str;
        return this;
    }

    public String toString() {
        return InterfaceC2915.m6317(this);
    }
}
