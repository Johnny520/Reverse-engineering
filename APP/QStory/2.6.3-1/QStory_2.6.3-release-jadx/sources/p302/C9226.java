package p302;

import java.security.MessageDigest;
import p238.C8812;

/* JADX INFO: renamed from: 飘花落叶言楪子兰哲苏世.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9226 implements InterfaceC9222 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8812 f23617 = new C8812(0);

    @Override // p302.InterfaceC9222
    public final boolean equals(Object obj) {
        if (obj instanceof C9226) {
            return this.f23617.equals(((C9226) obj).f23617);
        }
        return false;
    }

    @Override // p302.InterfaceC9222
    public final int hashCode() {
        return this.f23617.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f23617 + '}';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m14523(C9227 c9227) {
        C8812 c8812 = this.f23617;
        return c8812.containsKey(c9227) ? c8812.get(c9227) : c9227.f23622;
    }

    @Override // p302.InterfaceC9222
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7028(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            C8812 c8812 = this.f23617;
            if (i >= c8812.f1339) {
                return;
            }
            C9227 c9227 = (C9227) c8812.m1422(i);
            Object objM1431 = this.f23617.m1431(i);
            InterfaceC9220 interfaceC9220 = c9227.f23621;
            if (c9227.f23619 == null) {
                c9227.f23619 = c9227.f23620.getBytes(InterfaceC9222.f23615);
            }
            interfaceC9220.mo7151(c9227.f23619, objM1431, messageDigest);
            i++;
        }
    }
}
