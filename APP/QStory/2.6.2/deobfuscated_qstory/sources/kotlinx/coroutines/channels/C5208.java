package kotlinx.coroutines.channels;

import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5208 extends C5209 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Throwable f14797;

    public C5208(Throwable th) {
        this.f14797 = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5208) {
            return AbstractC4394.m8917(this.f14797, ((C5208) obj).f14797);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f14797;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // kotlinx.coroutines.channels.C5209
    public final String toString() {
        return "Closed(" + this.f14797 + ')';
    }
}
