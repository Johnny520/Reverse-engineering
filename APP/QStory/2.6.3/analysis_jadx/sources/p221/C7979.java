package p221;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p222.AbstractC7989;
import p286.InterfaceC8393;

/* JADX INFO: renamed from: 飘花落叶言楪世哲兰子苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7979 implements InterfaceC8393 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8393 f22052;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f22053;

    public C7979(int i, InterfaceC8393 interfaceC8393) {
        this.f22053 = i;
        this.f22052 = interfaceC8393;
    }

    @Override // p286.InterfaceC8393
    public final boolean equals(Object obj) {
        if (!(obj instanceof C7979)) {
            return false;
        }
        C7979 c7979 = (C7979) obj;
        return this.f22053 == c7979.f22053 && this.f22052.equals(c7979.f22052);
    }

    @Override // p286.InterfaceC8393
    public final int hashCode() {
        return AbstractC7989.m13476(this.f22053, this.f22052);
    }

    @Override // p286.InterfaceC8393
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6468(MessageDigest messageDigest) {
        this.f22052.mo6468(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f22053).array());
    }
}
