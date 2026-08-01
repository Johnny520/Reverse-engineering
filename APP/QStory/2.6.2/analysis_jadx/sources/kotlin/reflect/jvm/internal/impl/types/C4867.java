package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import p082.C7033;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4867 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7033 f14157;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC4462 f14158;

    public C4867(InterfaceC4462 interfaceC4462, C7033 c7033) {
        interfaceC4462.getClass();
        c7033.getClass();
        this.f14158 = interfaceC4462;
        this.f14157 = c7033;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4867)) {
            return false;
        }
        C4867 c4867 = (C4867) obj;
        return AbstractC4394.m8917(c4867.f14158, this.f14158) && AbstractC4394.m8917(c4867.f14157, this.f14157);
    }

    public final int hashCode() {
        int iHashCode = this.f14158.hashCode();
        return this.f14157.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.f14158 + ", typeAttr=" + this.f14157 + ')';
    }
}
