package androidx.compose.ui.text;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2035 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final /* synthetic */ int f6001 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long f6002 = AbstractC2048.m3760(0, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f6003;

    public /* synthetic */ C2035(long j) {
        this.f6003 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final int m3740(long j) {
        return Math.max((int) (j >> 32), (int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final int m3741(long j) {
        return m3740(j) - m3747(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final boolean m3742(long j) {
        return ((int) (j >> 32)) == ((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean m3743(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m3744(Object obj, long j) {
        return (obj instanceof C2035) && j == ((C2035) obj).f6003;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m3745(long j, long j2) {
        return (m3747(j) <= m3747(j2)) & (m3740(j2) <= m3740(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final boolean m3746(long j) {
        return ((int) (j >> 32)) > ((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final int m3747(long j) {
        return Math.min((int) (j >> 32), (int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static String m3748(long j) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return AbstractC0053.m154(sb, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        return m3744(obj, this.f6003);
    }

    public final int hashCode() {
        return Long.hashCode(this.f6003);
    }

    public final String toString() {
        return m3748(this.f6003);
    }
}
