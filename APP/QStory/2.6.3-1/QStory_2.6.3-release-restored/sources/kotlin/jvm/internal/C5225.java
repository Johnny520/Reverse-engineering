package kotlin.jvm.internal;

import java.util.Collections;
import java.util.List;
import kotlin.reflect.KVariance;
import p050.AbstractC7176;

/* JADX INFO: renamed from: kotlin.jvm.internal.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5225 extends AbstractC5226 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public volatile List f13315;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final KVariance f13316;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f13317;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5225(Object obj, KVariance kVariance) {
        super(obj);
        obj.getClass();
        kVariance.getClass();
        this.f13317 = "PluginConfigT";
        this.f13316 = kVariance;
    }

    @Override // kotlin.jvm.internal.AbstractC5226
    public final List getUpperBounds() {
        List list = this.f13315;
        if (list != null) {
            return list;
        }
        C5229 c5229 = AbstractC5228.f13320;
        List listM12487 = AbstractC7176.m12487(c5229.mo9478(c5229.mo9476(Object.class), Collections.EMPTY_LIST, true));
        this.f13315 = listM12487;
        return listM12487;
    }

    @Override // kotlin.jvm.internal.AbstractC5226
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final KVariance mo9459() {
        return this.f13316;
    }

    @Override // kotlin.jvm.internal.AbstractC5226
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String mo9460() {
        return this.f13317;
    }
}
