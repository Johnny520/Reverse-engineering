package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import p082.C7034;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4868 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7034 f14161;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC4463 f14162;

    public C4868(InterfaceC4463 interfaceC4463, C7034 c7034) {
        interfaceC4463.getClass();
        c7034.getClass();
        this.f14162 = interfaceC4463;
        this.f14161 = c7034;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4868)) {
            return false;
        }
        C4868 c4868 = (C4868) obj;
        return AbstractC4395.m8907(c4868.f14162, this.f14162) && AbstractC4395.m8907(c4868.f14161, this.f14161);
    }

    public final int hashCode() {
        int iHashCode = this.f14162.hashCode();
        return this.f14161.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.f14162 + ", typeAttr=" + this.f14161 + ')';
    }
}
