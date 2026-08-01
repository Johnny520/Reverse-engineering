package p056;

import kotlin.jvm.internal.AbstractC4394;
import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6612 implements InterfaceC6735 {
    public static final C6613 Companion = new C6613();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f17991;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6782 f17992;

    public /* synthetic */ C6612(int i, InterfaceC6782 interfaceC6782, String str) {
        if (1 != (i & 1)) {
            AbstractC7143.m12393(i, 1, C6617.f18000.getDescriptor());
            throw null;
        }
        this.f17992 = interfaceC6782;
        if ((i & 2) == 0) {
            this.f17991 = "resource";
        } else {
            this.f17991 = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6612) && AbstractC4394.m8917(this.f17992, ((C6612) obj).f17992);
    }

    public final int hashCode() {
        return this.f17992.hashCode();
    }

    public final String toString() {
        return "EmbeddedResource(resource=" + this.f17992 + ')';
    }
}
