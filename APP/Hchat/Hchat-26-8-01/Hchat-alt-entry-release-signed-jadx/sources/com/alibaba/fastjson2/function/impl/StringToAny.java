package com.alibaba.fastjson2.function.impl;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.IOUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import okhttp3.HttpUrl;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class StringToAny implements Function {
    final Object defaultValue;
    final Class targetClass;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public StringToAny(Class cls, Object obj) {
        this.targetClass = cls;
        this.defaultValue = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Function
    public Object apply(Object obj) {
        String str = (String) obj;
        if (str == null || "null".equals(str) || HttpUrl.FRAGMENT_ENCODE_SET.equals(str)) {
            return this.defaultValue;
        }
        Class cls = this.targetClass;
        if (cls == Byte.TYPE || cls == Byte.class) {
            return Byte.valueOf(Byte.parseByte(str));
        }
        if (cls == Short.TYPE || cls == Short.class) {
            return Short.valueOf(Short.parseShort(str));
        }
        if (cls == Integer.TYPE || cls == Integer.class) {
            return Integer.valueOf(Integer.parseInt(str));
        }
        if (cls == Long.TYPE || cls == Long.class) {
            return (IOUtils.isNumber(str) || str.length() != 19) ? Long.valueOf(Long.parseLong(str)) : Long.valueOf(DateUtils.parseMillis(str, DateUtils.DEFAULT_ZONE_ID));
        }
        if (cls == Float.TYPE || cls == Float.class) {
            return Float.valueOf(Float.parseFloat(str));
        }
        if (cls == Double.TYPE || cls == Double.class) {
            return Double.valueOf(Double.parseDouble(str));
        }
        if (cls == Character.TYPE || cls == Character.class) {
            return Character.valueOf(str.charAt(0));
        }
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            return Boolean.valueOf("true".equals(str));
        }
        if (cls == BigDecimal.class) {
            return new BigDecimal(str);
        }
        if (cls == BigInteger.class) {
            return new BigInteger(str);
        }
        if ((cls == Collections.class || cls == List.class || cls == JSONArray.class) && HttpUrl.PATH_SEGMENT_ENCODE_SET_URI.equals(str)) {
            return new JSONArray();
        }
        C0086a.m454m("can not convert to ", this.targetClass, ", value : ", str);
        return null;
    }
}
