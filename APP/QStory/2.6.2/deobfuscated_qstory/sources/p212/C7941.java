package p212;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7941 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f21987;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f21988;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f21989;

    public C7941(int i, int i2, boolean z) {
        this.f21989 = i;
        this.f21988 = i2;
        this.f21987 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7941)) {
            return false;
        }
        C7941 c7941 = (C7941) obj;
        return this.f21989 == c7941.f21989 && this.f21988 == c7941.f21988 && this.f21987 == c7941.f21987;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21987) + AbstractC0053.m143(this.f21988, Integer.hashCode(this.f21989) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BidiRun(start=");
        sb.append(this.f21989);
        sb.append(", end=");
        sb.append(this.f21988);
        sb.append(", isRtl=");
        return AbstractC0053.m150(sb, this.f21987, ')');
    }
}
