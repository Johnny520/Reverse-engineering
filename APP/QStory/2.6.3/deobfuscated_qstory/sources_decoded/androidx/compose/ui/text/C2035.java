package androidx.compose.ui.text;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2035 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final /* synthetic */ int f6002 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long f6003 = AbstractC2048.m3770(0, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f6004;

    public /* synthetic */ C2035(long j) {
        this.f6004 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final int m3750(long j) {
        return Math.max((int) (j >> 32), (int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final int m3751(long j) {
        return m3750(j) - m3757(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final boolean m3752(long j) {
        return ((int) (j >> 32)) == ((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean m3753(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m3754(Object obj, long j) {
        return (obj instanceof C2035) && j == ((C2035) obj).f6004;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m3755(long j, long j2) {
        return (m3757(j) <= m3757(j2)) & (m3750(j2) <= m3750(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final boolean m3756(long j) {
        return ((int) (j >> 32)) > ((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final int m3757(long j) {
        return Math.min((int) (j >> 32), (int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static String m3758(long j) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return AbstractC0053.m156(sb, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        return m3754(obj, this.f6004);
    }

    public final int hashCode() {
        return Long.hashCode(this.f6004);
    }

    public final String toString() {
        return m3758(this.f6004);
    }
}
