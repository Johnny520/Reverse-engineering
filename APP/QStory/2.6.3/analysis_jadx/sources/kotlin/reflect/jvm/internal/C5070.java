package kotlin.reflect.jvm.internal;

import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC4339;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5070 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5070 f14610 = new C5070(EmptyList.INSTANCE, AbstractC4339.m8776(), null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5070 f14611;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Map f14612;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f14613;

    public C5070(List list, Map map, C5070 c5070) {
        this.f14613 = list;
        this.f14612 = map;
        this.f14611 = c5070;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC4394 m10090(int i) {
        AbstractC4394 abstractC4394 = (AbstractC4394) this.f14612.get(Integer.valueOf(i));
        if (abstractC4394 != null) {
            return abstractC4394;
        }
        C5070 c5070 = this.f14611;
        if (c5070 != null) {
            return c5070.m10090(i);
        }
        return null;
    }
}
