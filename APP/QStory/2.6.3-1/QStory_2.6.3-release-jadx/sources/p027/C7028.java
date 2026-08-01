package p027;

import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7028 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Throwable f17404;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7030 f17405;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7030 f17406;

    public /* synthetic */ C7028(InterfaceC7030 interfaceC7030, Throwable th, int i) {
        this(interfaceC7030, (C7025) null, (i & 4) != 0 ? null : th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7028)) {
            return false;
        }
        C7028 c7028 = (C7028) obj;
        return AbstractC5227.m9466(this.f17406, c7028.f17406) && AbstractC5227.m9466(this.f17405, c7028.f17405) && AbstractC5227.m9466(this.f17404, c7028.f17404);
    }

    public final int hashCode() {
        int iHashCode = this.f17406.hashCode() * 31;
        InterfaceC7030 interfaceC7030 = this.f17405;
        int iHashCode2 = (iHashCode + (interfaceC7030 == null ? 0 : interfaceC7030.hashCode())) * 31;
        Throwable th = this.f17404;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.f17406 + ", nextPlan=" + this.f17405 + ", throwable=" + this.f17404 + ')';
    }

    public C7028(InterfaceC7030 interfaceC7030, C7025 c7025, Throwable th) {
        this.f17406 = interfaceC7030;
        this.f17405 = c7025;
        this.f17404 = th;
    }
}
