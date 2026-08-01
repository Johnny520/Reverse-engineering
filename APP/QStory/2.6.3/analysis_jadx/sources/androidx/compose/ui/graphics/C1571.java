package androidx.compose.ui.graphics;

import android.graphics.Shader;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1571 extends AbstractC1598 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f4620;

    public C1571(long j) {
        this.f4620 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1571) {
            return C1599.m2949(this.f4620, ((C1571) obj).f4620);
        }
        return false;
    }

    public final int hashCode() {
        int i = C1599.f4699;
        return Long.hashCode(this.f4620);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) C1599.m2954(this.f4620)) + ')';
    }

    @Override // androidx.compose.ui.graphics.AbstractC1598
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo2851(float f, long j, C1609 c1609) {
        c1609.m2959(1.0f);
        long jM2950 = this.f4620;
        if (f != 1.0f) {
            jM2950 = C1599.m2950(C1599.m2948(jM2950) * f, jM2950);
        }
        c1609.m2969(jM2950);
        if (((Shader) c1609.f4715) != null) {
            c1609.m2972(null);
        }
    }
}
