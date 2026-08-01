package com.alibaba.fastjson2;

import java.lang.reflect.Array;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2870 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f9074;

    public C2870(int i) {
        this.f9074 = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        if (obj == null) {
            return null;
        }
        boolean z = obj instanceof List;
        int i = this.f9074;
        if (z) {
            return ((List) obj).get(i);
        }
        if (obj.getClass().isArray()) {
            return Array.get(obj, i);
        }
        return null;
    }
}
