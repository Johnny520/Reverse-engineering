package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.JSONObject;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class MapMultiValueType<T extends Map> implements Type {
    public final Class<T> mapType;
    private final Map<String, Type> valueTypes;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MapMultiValueType(Class<T> cls, String str, Type type) {
        HashMap map = new HashMap();
        this.valueTypes = map;
        this.mapType = cls;
        map.put(str, type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: of */
    public static MapMultiValueType<JSONObject> m1776of(String str, Type type) {
        return new MapMultiValueType<>(JSONObject.class, str, type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Type getType(String str) {
        return this.valueTypes.get(str);
    }

    /* JADX INFO: renamed from: of */
    public static MapMultiValueType<JSONObject> m1777of(Map<String, Type> map) {
        return new MapMultiValueType<>(JSONObject.class, map);
    }

    /* JADX INFO: renamed from: of */
    public static <T extends Map> MapMultiValueType<T> m1774of(Class<T> cls, String str, Type type) {
        return new MapMultiValueType<>(cls, str, type);
    }

    /* JADX INFO: renamed from: of */
    public static <T extends Map> MapMultiValueType<T> m1775of(Class<T> cls, Map<String, Type> map) {
        return new MapMultiValueType<>(cls, map);
    }

    public MapMultiValueType(Class<T> cls, Map<String, Type> map) {
        HashMap map2 = new HashMap();
        this.valueTypes = map2;
        this.mapType = cls;
        map2.putAll(map);
    }
}
