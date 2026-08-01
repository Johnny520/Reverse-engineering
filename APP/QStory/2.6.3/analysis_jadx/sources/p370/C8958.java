package p370;

import kotlin.jvm.internal.AbstractC4395;
import org.luckypray.dexkit.wrap.InterfaceC5733;

/* JADX INFO: renamed from: 飘花落叶言苏子哲兰世楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8958 implements InterfaceC8964 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5733 f25159;

    public C8958(InterfaceC5733 interfaceC5733) {
        interfaceC5733.getClass();
        this.f25159 = interfaceC5733;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8958) && AbstractC4395.m8907(this.f25159, ((C8958) obj).f25159);
    }

    public final int hashCode() {
        return this.f25159.hashCode();
    }

    public final String toString() {
        return "Value(value=" + this.f25159 + ")";
    }
}
