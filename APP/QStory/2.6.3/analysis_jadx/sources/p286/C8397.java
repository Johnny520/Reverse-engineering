package p286;

import java.security.MessageDigest;
import p222.C7983;

/* JADX INFO: renamed from: 飘花落叶言楪子兰哲苏世.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8397 implements InterfaceC8393 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7983 f23272 = new C7983(0);

    @Override // p286.InterfaceC8393
    public final boolean equals(Object obj) {
        if (obj instanceof C8397) {
            return this.f23272.equals(((C8397) obj).f23272);
        }
        return false;
    }

    @Override // p286.InterfaceC8393
    public final int hashCode() {
        return this.f23272.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f23272 + '}';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m13964(C8398 c8398) {
        C7983 c7983 = this.f23272;
        return c7983.containsKey(c8398) ? c7983.get(c8398) : c8398.f23277;
    }

    @Override // p286.InterfaceC8393
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6468(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            C7983 c7983 = this.f23272;
            if (i >= c7983.f994) {
                return;
            }
            C8398 c8398 = (C8398) c7983.m862(i);
            Object objM871 = this.f23272.m871(i);
            InterfaceC8391 interfaceC8391 = c8398.f23276;
            if (c8398.f23274 == null) {
                c8398.f23274 = c8398.f23275.getBytes(InterfaceC8393.f23270);
            }
            interfaceC8391.mo6591(c8398.f23274, objM871, messageDigest);
            i++;
        }
    }
}
