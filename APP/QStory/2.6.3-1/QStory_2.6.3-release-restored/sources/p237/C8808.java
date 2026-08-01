package p237;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p238.AbstractC8818;
import p302.InterfaceC9222;

/* JADX INFO: renamed from: 飘花落叶言楪世哲兰子苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8808 implements InterfaceC9222 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC9222 f22397;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f22398;

    public C8808(int i, InterfaceC9222 interfaceC9222) {
        this.f22398 = i;
        this.f22397 = interfaceC9222;
    }

    @Override // p302.InterfaceC9222
    public final boolean equals(Object obj) {
        if (!(obj instanceof C8808)) {
            return false;
        }
        C8808 c8808 = (C8808) obj;
        return this.f22398 == c8808.f22398 && this.f22397.equals(c8808.f22397);
    }

    @Override // p302.InterfaceC9222
    public final int hashCode() {
        return AbstractC8818.m14035(this.f22398, this.f22397);
    }

    @Override // p302.InterfaceC9222
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7028(MessageDigest messageDigest) {
        this.f22397.mo7028(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f22398).array());
    }
}
