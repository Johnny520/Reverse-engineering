package p209;

import androidx.window.area.AbstractC2567;
import p205.C7899;
import p205.C7901;

/* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7928 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7928 f21954 = new C7928(AbstractC2567.m5080(0), AbstractC2567.m5080(0));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f21955;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f21956;

    public C7928(long j, long j2) {
        this.f21956 = j;
        this.f21955 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7928)) {
            return false;
        }
        C7928 c7928 = (C7928) obj;
        return C7899.m13345(this.f21956, c7928.f21956) && C7899.m13345(this.f21955, c7928.f21955);
    }

    public final int hashCode() {
        C7901[] c7901Arr = C7899.f21867;
        return Long.hashCode(this.f21955) + (Long.hashCode(this.f21956) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) C7899.m13342(this.f21956)) + ", restLine=" + ((Object) C7899.m13342(this.f21955)) + ')';
    }
}
