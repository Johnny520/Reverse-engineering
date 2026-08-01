package p013;

import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲苏子.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6175 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Throwable f16855;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6174 f16856;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6174 f16857;

    public /* synthetic */ C6175(InterfaceC6174 interfaceC6174, Throwable th, int i) {
        this(interfaceC6174, (C6171) null, (i & 4) != 0 ? null : th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6175)) {
            return false;
        }
        C6175 c6175 = (C6175) obj;
        return AbstractC4394.m8917(this.f16857, c6175.f16857) && AbstractC4394.m8917(this.f16856, c6175.f16856) && AbstractC4394.m8917(this.f16855, c6175.f16855);
    }

    public final int hashCode() {
        int iHashCode = this.f16857.hashCode() * 31;
        InterfaceC6174 interfaceC6174 = this.f16856;
        int iHashCode2 = (iHashCode + (interfaceC6174 == null ? 0 : interfaceC6174.hashCode())) * 31;
        Throwable th = this.f16855;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.f16857 + ", nextPlan=" + this.f16856 + ", throwable=" + this.f16855 + ')';
    }

    public C6175(InterfaceC6174 interfaceC6174, C6171 c6171, Throwable th) {
        this.f16857 = interfaceC6174;
        this.f16856 = c6171;
        this.f16855 = th;
    }
}
