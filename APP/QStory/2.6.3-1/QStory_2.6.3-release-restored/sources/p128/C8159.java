package p128;

import p069.AbstractC7390;

/* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8159 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public float f19890 = 0.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f19889 = 0.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f19888 = 0.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float f19887 = 0.0f;

    public final String toString() {
        return "MutableRect(" + AbstractC7390.m12623(this.f19890) + ", " + AbstractC7390.m12623(this.f19889) + ", " + AbstractC7390.m12623(this.f19888) + ", " + AbstractC7390.m12623(this.f19887) + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13092(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.f19890 += fIntBitsToFloat;
        this.f19889 += fIntBitsToFloat2;
        this.f19888 += fIntBitsToFloat;
        this.f19887 += fIntBitsToFloat2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m13093() {
        return (this.f19890 >= this.f19888) | (this.f19889 >= this.f19887);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13094(float f, float f2, float f3, float f4) {
        this.f19890 = Math.max(f, this.f19890);
        this.f19889 = Math.max(f2, this.f19889);
        this.f19888 = Math.min(f3, this.f19888);
        this.f19887 = Math.min(f4, this.f19887);
    }
}
