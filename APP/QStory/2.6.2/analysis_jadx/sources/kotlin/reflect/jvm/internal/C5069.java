package kotlin.reflect.jvm.internal;

import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC4338;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4393;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5069 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5069 f14610 = new C5069(EmptyList.INSTANCE, AbstractC4338.m8781(), null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5069 f14611;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Map f14612;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f14613;

    public C5069(List list, Map map, C5069 c5069) {
        this.f14613 = list;
        this.f14612 = map;
        this.f14611 = c5069;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC4393 m10086(int i) {
        AbstractC4393 abstractC4393 = (AbstractC4393) this.f14612.get(Integer.valueOf(i));
        if (abstractC4393 != null) {
            return abstractC4393;
        }
        C5069 c5069 = this.f14611;
        if (c5069 != null) {
            return c5069.m10086(i);
        }
        return null;
    }
}
