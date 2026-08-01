package com.alibaba.fastjson2.function.impl;

import com.alibaba.fastjson2.C1607k;
import com.alibaba.fastjson2.JSONArray;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class ToDouble implements Function {
    final Double defaultValue;

    public ToDouble(Double d10) {
        this.defaultValue = d10;
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        if (obj == null) {
            return this.defaultValue;
        }
        if (obj instanceof Boolean) {
            return Double.valueOf(((Boolean) obj).booleanValue() ? 1.0d : 0.0d);
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            return str.isEmpty() ? this.defaultValue : Double.valueOf(Double.parseDouble(str));
        }
        if (!(obj instanceof List)) {
            C1607k.m6296a("can not cast to Double ", obj.getClass());
            return null;
        }
        List list = (List) obj;
        JSONArray jSONArray = new JSONArray(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            jSONArray.add(apply(list.get(i10)));
        }
        return jSONArray;
    }
}
