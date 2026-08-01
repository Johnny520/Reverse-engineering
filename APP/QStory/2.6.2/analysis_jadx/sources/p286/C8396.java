package p286;

import java.security.MessageDigest;
import p222.C7982;

/* JADX INFO: renamed from: 飘花落叶言楪子兰哲苏世.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8396 implements InterfaceC8392 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7982 f23273 = new C7982(0);

    @Override // p286.InterfaceC8392
    public final boolean equals(Object obj) {
        if (obj instanceof C8396) {
            return this.f23273.equals(((C8396) obj).f23273);
        }
        return false;
    }

    @Override // p286.InterfaceC8392
    public final int hashCode() {
        return this.f23273.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f23273 + '}';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m13947(C8397 c8397) {
        C7982 c7982 = this.f23273;
        return c7982.containsKey(c8397) ? c7982.get(c8397) : c8397.f23278;
    }

    @Override // p286.InterfaceC8392
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6410(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            C7982 c7982 = this.f23273;
            if (i >= c7982.f994) {
                return;
            }
            C8397 c8397 = (C8397) c7982.m861(i);
            Object objM870 = this.f23273.m870(i);
            InterfaceC8390 interfaceC8390 = c8397.f23277;
            if (c8397.f23275 == null) {
                c8397.f23275 = c8397.f23276.getBytes(InterfaceC8392.f23271);
            }
            interfaceC8390.mo6531(c8397.f23275, objM870, messageDigest);
            i++;
        }
    }
}
