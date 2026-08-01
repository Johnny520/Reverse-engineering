package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import p098.C7863;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5700 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7863 f14506;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5295 f14507;

    public C5700(InterfaceC5295 interfaceC5295, C7863 c7863) {
        interfaceC5295.getClass();
        c7863.getClass();
        this.f14507 = interfaceC5295;
        this.f14506 = c7863;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5700)) {
            return false;
        }
        C5700 c5700 = (C5700) obj;
        return AbstractC5227.m9466(c5700.f14507, this.f14507) && AbstractC5227.m9466(c5700.f14506, this.f14506);
    }

    public final int hashCode() {
        int iHashCode = this.f14507.hashCode();
        return this.f14506.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.f14507 + ", typeAttr=" + this.f14506 + ')';
    }
}
