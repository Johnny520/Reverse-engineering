package p237;

import java.security.MessageDigest;
import p238.AbstractC8818;
import p302.InterfaceC9222;

/* JADX INFO: renamed from: 飘花落叶言楪世哲兰子苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8805 implements InterfaceC9222 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f22394;

    public C8805(Object obj) {
        AbstractC8818.m14028(obj, "Argument must not be null");
        this.f22394 = obj;
    }

    @Override // p302.InterfaceC9222
    public final boolean equals(Object obj) {
        if (obj instanceof C8805) {
            return this.f22394.equals(((C8805) obj).f22394);
        }
        return false;
    }

    @Override // p302.InterfaceC9222
    public final int hashCode() {
        return this.f22394.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f22394 + '}';
    }

    @Override // p302.InterfaceC9222
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7028(MessageDigest messageDigest) {
        messageDigest.update(this.f22394.toString().getBytes(InterfaceC9222.f23615));
    }
}
