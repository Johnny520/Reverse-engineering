package kotlin.reflect.jvm.internal;

import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC5171;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5226;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5902 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5902 f14955 = new C5902(EmptyList.INSTANCE, AbstractC5171.m9335(), null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5902 f14956;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Map f14957;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f14958;

    public C5902(List list, Map map, C5902 c5902) {
        this.f14958 = list;
        this.f14957 = map;
        this.f14956 = c5902;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC5226 m10649(int i) {
        AbstractC5226 abstractC5226 = (AbstractC5226) this.f14957.get(Integer.valueOf(i));
        if (abstractC5226 != null) {
            return abstractC5226;
        }
        C5902 c5902 = this.f14956;
        if (c5902 != null) {
            return c5902.m10649(i);
        }
        return null;
    }
}
