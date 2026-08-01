package kotlinx.coroutines.channels;

import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5209 extends C5210 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Throwable f14797;

    public C5209(Throwable th) {
        this.f14797 = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5209) {
            return AbstractC4395.m8907(this.f14797, ((C5209) obj).f14797);
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

    @Override // kotlinx.coroutines.channels.C5210
    public final String toString() {
        return "Closed(" + this.f14797 + ')';
    }
}
