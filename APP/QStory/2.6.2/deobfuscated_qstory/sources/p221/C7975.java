package p221;

import java.security.MessageDigest;
import p222.AbstractC7988;
import p286.InterfaceC8392;

/* JADX INFO: renamed from: 飘花落叶言楪世哲兰子苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7975 implements InterfaceC8392 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f22052;

    public C7975(Object obj) {
        AbstractC7988.m13441(obj, "Argument must not be null");
        this.f22052 = obj;
    }

    @Override // p286.InterfaceC8392
    public final boolean equals(Object obj) {
        if (obj instanceof C7975) {
            return this.f22052.equals(((C7975) obj).f22052);
        }
        return false;
    }

    @Override // p286.InterfaceC8392
    public final int hashCode() {
        return this.f22052.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f22052 + '}';
    }

    @Override // p286.InterfaceC8392
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6410(MessageDigest messageDigest) {
        messageDigest.update(this.f22052.toString().getBytes(InterfaceC8392.f23271));
    }
}
