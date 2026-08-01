package p112;

import p053.AbstractC6561;

/* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7330 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public float f19545 = 0.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f19544 = 0.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f19543 = 0.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float f19542 = 0.0f;

    public final String toString() {
        return "MutableRect(" + AbstractC6561.m12064(this.f19545) + ", " + AbstractC6561.m12064(this.f19544) + ", " + AbstractC6561.m12064(this.f19543) + ", " + AbstractC6561.m12064(this.f19542) + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12533(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.f19545 += fIntBitsToFloat;
        this.f19544 += fIntBitsToFloat2;
        this.f19543 += fIntBitsToFloat;
        this.f19542 += fIntBitsToFloat2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m12534() {
        return (this.f19545 >= this.f19543) | (this.f19544 >= this.f19542);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12535(float f, float f2, float f3, float f4) {
        this.f19545 = Math.max(f, this.f19545);
        this.f19544 = Math.max(f2, this.f19544);
        this.f19543 = Math.min(f3, this.f19543);
        this.f19542 = Math.min(f4, this.f19542);
    }
}
