package com.alibaba.fastjson2;

import java.lang.reflect.Array;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2869 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f9072;

    public C2869(int i) {
        this.f9072 = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        if (obj == null) {
            return null;
        }
        boolean z = obj instanceof List;
        int i = this.f9072;
        if (z) {
            return ((List) obj).get(i);
        }
        if (obj.getClass().isArray()) {
            return Array.get(obj, i);
        }
        return null;
    }
}
