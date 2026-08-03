package com.alibaba.fastjson2.util;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class MapMultiValueType<T extends java.util.Map> implements java.lang.reflect.Type {
    public final java.lang.Class<T> mapType;
    private final java.util.Map<java.lang.String, java.lang.reflect.Type> valueTypes;

    public MapMultiValueType(java.lang.Class<T> r2, java.lang.String r3, java.lang.reflect.Type r4) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.valueTypes = r0
            r1.mapType = r2
            r0.put(r3, r4)
            return
    }

    public MapMultiValueType(java.lang.Class<T> r2, java.util.Map<java.lang.String, java.lang.reflect.Type> r3) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.valueTypes = r0
            r1.mapType = r2
            r0.putAll(r3)
            return
    }

    public static <T extends java.util.Map> com.alibaba.fastjson2.util.MapMultiValueType<T> of(java.lang.Class<T> r1, java.lang.String r2, java.lang.reflect.Type r3) {
            com.alibaba.fastjson2.util.MapMultiValueType r0 = new com.alibaba.fastjson2.util.MapMultiValueType
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static <T extends java.util.Map> com.alibaba.fastjson2.util.MapMultiValueType<T> of(java.lang.Class<T> r1, java.util.Map<java.lang.String, java.lang.reflect.Type> r2) {
            com.alibaba.fastjson2.util.MapMultiValueType r0 = new com.alibaba.fastjson2.util.MapMultiValueType
            r0.<init>(r1, r2)
            return r0
    }

    public static com.alibaba.fastjson2.util.MapMultiValueType<com.alibaba.fastjson2.JSONObject> of(java.lang.String r2, java.lang.reflect.Type r3) {
            com.alibaba.fastjson2.util.MapMultiValueType r0 = new com.alibaba.fastjson2.util.MapMultiValueType
            java.lang.Class<com.alibaba.fastjson2.JSONObject> r1 = com.alibaba.fastjson2.JSONObject.class
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static com.alibaba.fastjson2.util.MapMultiValueType<com.alibaba.fastjson2.JSONObject> of(java.util.Map<java.lang.String, java.lang.reflect.Type> r2) {
            com.alibaba.fastjson2.util.MapMultiValueType r0 = new com.alibaba.fastjson2.util.MapMultiValueType
            java.lang.Class<com.alibaba.fastjson2.JSONObject> r1 = com.alibaba.fastjson2.JSONObject.class
            r0.<init>(r1, r2)
            return r0
    }

    public java.lang.reflect.Type getType(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.reflect.Type> r0 = r1.valueTypes
            java.lang.Object r2 = r0.get(r2)
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            return r2
    }
}
