package p079;

import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4497;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.storage.C4847;
import p046.C6482;
import p101.C7265;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7004 extends AbstractC7009 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5088[] f18810 = {new PropertyReference1Impl(C7004.class, "fragments", "getFragments()Ljava/util/List;", 0), new PropertyReference1Impl(C7004.class, "empty", "getEmpty()Z", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4847 f18811;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C4687 f18812;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C4847 f18813;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C7265 f18814;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6988 f18815;

    /* JADX WARN: Illegal instructions before constructor call */
    public C7004(C6988 c6988, C4687 c4687, C4845 c4845) {
        c4687.getClass();
        c4845.getClass();
        C4686 c4686 = c4687.f13696;
        super(C6482.f17768, c4686.m9314() ? C4686.f13689 : c4686.m9318());
        this.f18815 = c6988;
        this.f18812 = c4687;
        this.f18811 = new C4847(c4845, new C7007(this, 0));
        this.f18813 = new C4847(c4845, new C7007(this, 1));
        this.f18814 = new C7265(c4845, new C7007(this, 2));
    }

    public final boolean equals(Object obj) {
        C7004 c7004 = obj instanceof C7004 ? (C7004) obj : null;
        return c7004 != null && AbstractC4395.m8907(this.f18812, c7004.f18812) && AbstractC4395.m8907(this.f18815, c7004.f18815);
    }

    public final int hashCode() {
        return this.f18812.hashCode() + (this.f18815.hashCode() * 31);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final Object mo9027(InterfaceC4497 interfaceC4497, Object obj) {
        return interfaceC4497.mo284(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC4499 mo9028() {
        C4687 c4687 = this.f18812;
        if (c4687.f13696.m9314()) {
            return null;
        }
        return this.f18815.mo9062(c4687.m9320());
    }
}
