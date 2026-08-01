package p112;

import io.ktor.client.plugins.AbstractC3932;

/* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7329 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public float f19550 = 0.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f19549 = 0.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f19548 = 0.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float f19547 = 0.0f;

    public final String toString() {
        return "MutableRect(" + AbstractC3932.m8302(this.f19550) + ", " + AbstractC3932.m8302(this.f19549) + ", " + AbstractC3932.m8302(this.f19548) + ", " + AbstractC3932.m8302(this.f19547) + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12506(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.f19550 += fIntBitsToFloat;
        this.f19549 += fIntBitsToFloat2;
        this.f19548 += fIntBitsToFloat;
        this.f19547 += fIntBitsToFloat2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m12507() {
        return (this.f19550 >= this.f19548) | (this.f19549 >= this.f19547);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12508(float f, float f2, float f3, float f4) {
        this.f19550 = Math.max(f, this.f19550);
        this.f19549 = Math.max(f2, this.f19549);
        this.f19548 = Math.min(f3, this.f19548);
        this.f19547 = Math.min(f4, this.f19547);
    }
}
