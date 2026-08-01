package p209;

import p205.C7898;
import p205.C7900;
import p392.AbstractC9124;

/* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7927 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7927 f21957 = new C7927(AbstractC9124.m14670(0), AbstractC9124.m14670(0));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f21958;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f21959;

    public C7927(long j, long j2) {
        this.f21959 = j;
        this.f21958 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7927)) {
            return false;
        }
        C7927 c7927 = (C7927) obj;
        return C7898.m13317(this.f21959, c7927.f21959) && C7898.m13317(this.f21958, c7927.f21958);
    }

    public final int hashCode() {
        C7900[] c7900Arr = C7898.f21870;
        return Long.hashCode(this.f21958) + (Long.hashCode(this.f21959) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) C7898.m13314(this.f21959)) + ", restLine=" + ((Object) C7898.m13314(this.f21958)) + ')';
    }
}
