package kotlinx.coroutines.channels;

import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6041 extends C6042 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Throwable f15142;

    public C6041(Throwable th) {
        this.f15142 = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6041) {
            return AbstractC5227.m9466(this.f15142, ((C6041) obj).f15142);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f15142;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // kotlinx.coroutines.channels.C6042
    public final String toString() {
        return "Closed(" + this.f15142 + ')';
    }
}
