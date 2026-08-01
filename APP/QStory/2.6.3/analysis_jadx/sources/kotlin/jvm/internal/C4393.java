package kotlin.jvm.internal;

import java.util.Collections;
import java.util.List;
import kotlin.reflect.KVariance;
import p034.AbstractC6347;

/* JADX INFO: renamed from: kotlin.jvm.internal.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4393 extends AbstractC4394 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public volatile List f12970;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final KVariance f12971;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f12972;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4393(Object obj, KVariance kVariance) {
        super(obj);
        obj.getClass();
        kVariance.getClass();
        this.f12972 = "PluginConfigT";
        this.f12971 = kVariance;
    }

    @Override // kotlin.jvm.internal.AbstractC4394
    public final List getUpperBounds() {
        List list = this.f12970;
        if (list != null) {
            return list;
        }
        C4397 c4397 = AbstractC4396.f12975;
        List listM11928 = AbstractC6347.m11928(c4397.mo8919(c4397.mo8917(Object.class), Collections.EMPTY_LIST, true));
        this.f12970 = listM11928;
        return listM11928;
    }

    @Override // kotlin.jvm.internal.AbstractC4394
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final KVariance mo8900() {
        return this.f12971;
    }

    @Override // kotlin.jvm.internal.AbstractC4394
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String mo8901() {
        return this.f12972;
    }
}
