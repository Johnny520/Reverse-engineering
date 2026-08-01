package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.JSONObject;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class MapMultiValueType<T extends Map> implements Type {
    private final Class<T> mapType;
    private final Map<String, Type> valueTypes;

    public MapMultiValueType(Class<T> cls, String str, Type type) {
        HashMap map = new HashMap();
        this.valueTypes = map;
        this.mapType = cls;
        map.put(str, type);
    }

    /* JADX INFO: renamed from: of */
    public static MapMultiValueType<JSONObject> m6500of(String str, Type type) {
        return new MapMultiValueType<>(JSONObject.class, str, type);
    }

    public Class<T> getMapType() {
        return this.mapType;
    }

    public Type getType(String str) {
        return this.valueTypes.get(str);
    }

    /* JADX INFO: renamed from: of */
    public static MapMultiValueType<JSONObject> m6501of(Map<String, Type> map) {
        return new MapMultiValueType<>(JSONObject.class, map);
    }

    /* JADX INFO: renamed from: of */
    public static <T extends Map> MapMultiValueType<T> m6498of(Class<T> cls, String str, Type type) {
        return new MapMultiValueType<>(cls, str, type);
    }

    /* JADX INFO: renamed from: of */
    public static <T extends Map> MapMultiValueType<T> m6499of(Class<T> cls, Map<String, Type> map) {
        return new MapMultiValueType<>(cls, map);
    }

    public MapMultiValueType(Class<T> cls, Map<String, Type> map) {
        HashMap map2 = new HashMap();
        this.valueTypes = map2;
        this.mapType = cls;
        map2.putAll(map);
    }
}
