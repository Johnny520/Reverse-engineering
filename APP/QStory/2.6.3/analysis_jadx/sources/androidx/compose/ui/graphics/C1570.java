package androidx.compose.ui.graphics;

import androidx.activity.AbstractC0053;
import p112.C7329;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1570 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C1570 f4616 = new C1570(0.0f, AbstractC1581.m2880(4278190080L), 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4617;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f4618;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f4619;

    public C1570(float f, long j, long j2) {
        this.f4619 = j;
        this.f4618 = j2;
        this.f4617 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1570)) {
            return false;
        }
        C1570 c1570 = (C1570) obj;
        return C1599.m2949(this.f4619, c1570.f4619) && C7329.m12528(this.f4618, c1570.f4618) && this.f4617 == c1570.f4617;
    }

    public final int hashCode() {
        int i = C1599.f4699;
        return Float.hashCode(this.f4617) + AbstractC0053.m142(Long.hashCode(this.f4619) * 31, 31, this.f4618);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        AbstractC0053.m138(this.f4619, sb, ", offset=");
        sb.append((Object) C7329.m12531(this.f4618));
        sb.append(", blurRadius=");
        return AbstractC0053.m155(sb, this.f4617, ')');
    }
}
