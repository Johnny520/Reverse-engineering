package com.alibaba.fastjson2.function.impl;

import com.alibaba.fastjson2.C1607k;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class ToBoolean implements Function {
    final Boolean defaultValue;

    public ToBoolean(Boolean bool) {
        this.defaultValue = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.Function
    public Object apply(Object obj) {
        if (obj == null) {
            return this.defaultValue;
        }
        if (obj instanceof Boolean) {
            return obj;
        }
        if (obj instanceof Number) {
            return Boolean.valueOf(((Number) obj).intValue() == 1);
        }
        if (obj instanceof String) {
            switch ((String) obj) {
                case "F":
                case "N":
                case "NO":
                case "No":
                case "no":
                case "FALSE":
                case "False":
                case "false":
                    return Boolean.FALSE;
                case "T":
                case "Y":
                case "YES":
                case "Yes":
                case "yes":
                case "TRUE":
                case "True":
                case "true":
                    return Boolean.TRUE;
                case "null":
                    return this.defaultValue;
            }
        }
        C1607k.m6296a("can not cast to Byte ", obj.getClass());
        return null;
    }
}
