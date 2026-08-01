package p075;

import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;

/* JADX INFO: renamed from: 飘花落叶言世子楪苏哲兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7686 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5919 f18642;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5925 f18643;

    public C7686(InterfaceC5925 interfaceC5925, InterfaceC5919 interfaceC5919) {
        interfaceC5925.getClass();
        this.f18643 = interfaceC5925;
        this.f18642 = interfaceC5919;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7686)) {
            return false;
        }
        InterfaceC5919 interfaceC5919 = this.f18642;
        if (interfaceC5919 == null) {
            C7686 c7686 = (C7686) obj;
            if (c7686.f18642 == null) {
                return AbstractC5227.m9466(this.f18643, c7686.f18643);
            }
        }
        return AbstractC5227.m9466(interfaceC5919, ((C7686) obj).f18642);
    }

    public final int hashCode() {
        InterfaceC5919 interfaceC5919 = this.f18642;
        return interfaceC5919 != null ? interfaceC5919.hashCode() : this.f18643.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeInfo(");
        Object obj = this.f18642;
        if (obj == null) {
            obj = this.f18643;
        }
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }
}
