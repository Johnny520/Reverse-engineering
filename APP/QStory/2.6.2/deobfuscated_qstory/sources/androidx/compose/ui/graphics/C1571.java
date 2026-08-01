package androidx.compose.ui.graphics;

import android.graphics.Shader;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1571 extends AbstractC1598 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f4619;

    public C1571(long j) {
        this.f4619 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1571) {
            return C1599.m2939(this.f4619, ((C1571) obj).f4619);
        }
        return false;
    }

    public final int hashCode() {
        int i = C1599.f4698;
        return Long.hashCode(this.f4619);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) C1599.m2944(this.f4619)) + ')';
    }

    @Override // androidx.compose.ui.graphics.AbstractC1598
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo2841(float f, long j, C1609 c1609) {
        c1609.m2949(1.0f);
        long jM2940 = this.f4619;
        if (f != 1.0f) {
            jM2940 = C1599.m2940(C1599.m2938(jM2940) * f, jM2940);
        }
        c1609.m2959(jM2940);
        if (((Shader) c1609.f4714) != null) {
            c1609.m2962(null);
        }
    }
}
