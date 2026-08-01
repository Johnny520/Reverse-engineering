package p367;

import kotlin.jvm.internal.AbstractC4394;
import org.luckypray.dexkit.wrap.InterfaceC5732;

/* JADX INFO: renamed from: 飘花落叶言苏子兰楪世哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8949 implements InterfaceC8955 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5732 f25158;

    public C8949(InterfaceC5732 interfaceC5732) {
        interfaceC5732.getClass();
        this.f25158 = interfaceC5732;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8949) && AbstractC4394.m8917(this.f25158, ((C8949) obj).f25158);
    }

    public final int hashCode() {
        return this.f25158.hashCode();
    }

    public final String toString() {
        return "Value(value=" + this.f25158 + ")";
    }
}
