package com.alibaba.fastjson2;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3706 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C3706 f9435 = new C3706(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C3706 f9436 = new C3706(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f9437;

    public /* synthetic */ C3706(int i) {
        this.f9437 = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f9437) {
            case 0:
                if (obj == null) {
                    return -1;
                }
                if (obj instanceof Collection) {
                    return Integer.valueOf(((Collection) obj).size());
                }
                if (obj.getClass().isArray()) {
                    return Integer.valueOf(Array.getLength(obj));
                }
                if (obj instanceof Map) {
                    return Integer.valueOf(((Map) obj).size());
                }
                if (obj instanceof C3754) {
                    return Integer.valueOf(((C3754) obj).f9605.size());
                }
                return 1;
            case 1:
                return C3705.m6510(obj);
            default:
                return null;
        }
    }
}
