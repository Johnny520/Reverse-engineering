package p011;

import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6199 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Throwable f17059;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6201 f17060;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6201 f17061;

    public /* synthetic */ C6199(InterfaceC6201 interfaceC6201, Throwable th, int i) {
        this(interfaceC6201, (C6196) null, (i & 4) != 0 ? null : th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6199)) {
            return false;
        }
        C6199 c6199 = (C6199) obj;
        return AbstractC4395.m8907(this.f17061, c6199.f17061) && AbstractC4395.m8907(this.f17060, c6199.f17060) && AbstractC4395.m8907(this.f17059, c6199.f17059);
    }

    public final int hashCode() {
        int iHashCode = this.f17061.hashCode() * 31;
        InterfaceC6201 interfaceC6201 = this.f17060;
        int iHashCode2 = (iHashCode + (interfaceC6201 == null ? 0 : interfaceC6201.hashCode())) * 31;
        Throwable th = this.f17059;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.f17061 + ", nextPlan=" + this.f17060 + ", throwable=" + this.f17059 + ')';
    }

    public C6199(InterfaceC6201 interfaceC6201, C6196 c6196, Throwable th) {
        this.f17061 = interfaceC6201;
        this.f17060 = c6196;
        this.f17059 = th;
    }
}
