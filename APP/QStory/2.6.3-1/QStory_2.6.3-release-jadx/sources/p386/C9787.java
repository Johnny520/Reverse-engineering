package p386;

import kotlin.jvm.internal.AbstractC5227;
import org.luckypray.dexkit.wrap.InterfaceC6563;

/* JADX INFO: renamed from: 飘花落叶言苏子哲兰世楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9787 implements InterfaceC9793 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6563 f25504;

    public C9787(InterfaceC6563 interfaceC6563) {
        interfaceC6563.getClass();
        this.f25504 = interfaceC6563;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9787) && AbstractC5227.m9466(this.f25504, ((C9787) obj).f25504);
    }

    public final int hashCode() {
        return this.f25504.hashCode();
    }

    public final String toString() {
        return "Value(value=" + this.f25504 + ")";
    }
}
