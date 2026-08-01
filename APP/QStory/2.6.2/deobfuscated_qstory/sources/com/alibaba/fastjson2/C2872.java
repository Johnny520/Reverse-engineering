package com.alibaba.fastjson2;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2872 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C2872 f9088 = new C2872(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C2872 f9089 = new C2872(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f9090;

    public /* synthetic */ C2872(int i) {
        this.f9090 = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f9090) {
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
                if (obj instanceof C2920) {
                    return Integer.valueOf(((C2920) obj).f9258.size());
                }
                return 1;
            case 1:
                return C2871.m5905(obj);
            default:
                return null;
        }
    }
}
