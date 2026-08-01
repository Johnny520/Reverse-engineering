package p221;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p222.AbstractC7988;
import p286.InterfaceC8392;

/* JADX INFO: renamed from: 飘花落叶言楪世哲兰子苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7978 implements InterfaceC8392 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8392 f22055;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f22056;

    public C7978(int i, InterfaceC8392 interfaceC8392) {
        this.f22056 = i;
        this.f22055 = interfaceC8392;
    }

    @Override // p286.InterfaceC8392
    public final boolean equals(Object obj) {
        if (!(obj instanceof C7978)) {
            return false;
        }
        C7978 c7978 = (C7978) obj;
        return this.f22056 == c7978.f22056 && this.f22055.equals(c7978.f22055);
    }

    @Override // p286.InterfaceC8392
    public final int hashCode() {
        return AbstractC7988.m13448(this.f22056, this.f22055);
    }

    @Override // p286.InterfaceC8392
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6410(MessageDigest messageDigest) {
        this.f22055.mo6410(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f22056).array());
    }
}
