package androidx.compose.p001ui.graphics;

import android.graphics.Shader;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2406 extends AbstractC2433 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f4965;

    public C2406(long j) {
        this.f4965 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2406) {
            return C2434.m3509(this.f4965, ((C2406) obj).f4965);
        }
        return false;
    }

    public final int hashCode() {
        int i = C2434.f5044;
        return Long.hashCode(this.f4965);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) C2434.m3514(this.f4965)) + ')';
    }

    @Override // androidx.compose.p001ui.graphics.AbstractC2433
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo3411(float f, long j, C2444 c2444) {
        c2444.m3519(1.0f);
        long jM3510 = this.f4965;
        if (f != 1.0f) {
            jM3510 = C2434.m3510(C2434.m3508(jM3510) * f, jM3510);
        }
        c2444.m3529(jM3510);
        if (((Shader) c2444.f5060) != null) {
            c2444.m3532(null);
        }
    }
}
