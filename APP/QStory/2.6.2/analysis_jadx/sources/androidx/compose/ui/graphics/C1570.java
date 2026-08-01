package androidx.compose.ui.graphics;

import androidx.activity.AbstractC0053;
import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1570 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C1570 f4615 = new C1570(0.0f, AbstractC1581.m2870(4278190080L), 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4616;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f4617;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f4618;

    public C1570(float f, long j, long j2) {
        this.f4618 = j;
        this.f4617 = j2;
        this.f4616 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1570)) {
            return false;
        }
        C1570 c1570 = (C1570) obj;
        return C1599.m2939(this.f4618, c1570.f4618) && C7328.m12501(this.f4617, c1570.f4617) && this.f4616 == c1570.f4616;
    }

    public final int hashCode() {
        int i = C1599.f4698;
        return Float.hashCode(this.f4616) + AbstractC0053.m141(Long.hashCode(this.f4618) * 31, 31, this.f4617);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        AbstractC0053.m138(this.f4618, sb, ", offset=");
        sb.append((Object) C7328.m12504(this.f4617));
        sb.append(", blurRadius=");
        return AbstractC0053.m157(sb, this.f4616, ')');
    }
}
