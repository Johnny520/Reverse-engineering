package kotlin.jvm.internal;

import java.util.Collections;
import java.util.List;
import kotlin.reflect.KVariance;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlin.jvm.internal.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4392 extends AbstractC4393 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public volatile List f12966;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final KVariance f12967;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f12968;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4392(Object obj, KVariance kVariance) {
        super(obj);
        obj.getClass();
        kVariance.getClass();
        this.f12968 = "PluginConfigT";
        this.f12967 = kVariance;
    }

    @Override // kotlin.jvm.internal.AbstractC4393
    public final List getUpperBounds() {
        List list = this.f12966;
        if (list != null) {
            return list;
        }
        C4396 c4396 = AbstractC4395.f12971;
        List listM13660 = AbstractC8189.m13660(c4396.mo8929(c4396.mo8927(Object.class), Collections.EMPTY_LIST, true));
        this.f12966 = listM13660;
        return listM13660;
    }

    @Override // kotlin.jvm.internal.AbstractC4393
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final KVariance mo8910() {
        return this.f12967;
    }

    @Override // kotlin.jvm.internal.AbstractC4393
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String mo8911() {
        return this.f12968;
    }
}
