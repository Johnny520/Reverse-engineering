package p221;

import java.security.MessageDigest;
import p222.AbstractC7989;
import p286.InterfaceC8393;

/* JADX INFO: renamed from: 飘花落叶言楪世哲兰子苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7976 implements InterfaceC8393 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f22049;

    public C7976(Object obj) {
        AbstractC7989.m13469(obj, "Argument must not be null");
        this.f22049 = obj;
    }

    @Override // p286.InterfaceC8393
    public final boolean equals(Object obj) {
        if (obj instanceof C7976) {
            return this.f22049.equals(((C7976) obj).f22049);
        }
        return false;
    }

    @Override // p286.InterfaceC8393
    public final int hashCode() {
        return this.f22049.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f22049 + '}';
    }

    @Override // p286.InterfaceC8393
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6468(MessageDigest messageDigest) {
        messageDigest.update(this.f22049.toString().getBytes(InterfaceC8393.f23270));
    }
}
