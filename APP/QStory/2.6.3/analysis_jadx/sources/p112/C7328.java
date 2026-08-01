package p112;

import androidx.activity.AbstractC0053;
import p053.AbstractC6561;

/* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7328 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7328 f19536 = new C7328(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f19537;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f19538;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f19539;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f19540;

    public C7328(float f, float f2, float f3, float f4) {
        this.f19540 = f;
        this.f19539 = f2;
        this.f19538 = f3;
        this.f19537 = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7328)) {
            return false;
        }
        C7328 c7328 = (C7328) obj;
        return Float.compare(this.f19540, c7328.f19540) == 0 && Float.compare(this.f19539, c7328.f19539) == 0 && Float.compare(this.f19538, c7328.f19538) == 0 && Float.compare(this.f19537, c7328.f19537) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19537) + AbstractC0053.m145(AbstractC0053.m145(Float.hashCode(this.f19540) * 31, this.f19539, 31), this.f19538, 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + AbstractC6561.m12064(this.f19540) + ", " + AbstractC6561.m12064(this.f19539) + ", " + AbstractC6561.m12064(this.f19538) + ", " + AbstractC6561.m12064(this.f19537) + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m12516() {
        return (this.f19540 >= this.f19538) | (this.f19539 >= this.f19537);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C7328 m12517(C7328 c7328) {
        return new C7328(Math.max(this.f19540, c7328.f19540), Math.max(this.f19539, c7328.f19539), Math.min(this.f19538, c7328.f19538), Math.min(this.f19537, c7328.f19537));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long m12518() {
        return (((long) Float.floatToRawIntBits(this.f19540)) << 32) | (((long) Float.floatToRawIntBits(this.f19539)) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long m12519() {
        float f = this.f19538 - this.f19540;
        return (((long) Float.floatToRawIntBits(this.f19537 - this.f19539)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long m12520() {
        float f = this.f19538;
        float f2 = this.f19540;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.f19537;
        float f5 = this.f19539;
        return (((long) Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m12521(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat >= this.f19540) & (fIntBitsToFloat < this.f19538) & (fIntBitsToFloat2 >= this.f19539) & (fIntBitsToFloat2 < this.f19537);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C7328 m12522(float f, float f2) {
        return new C7328(this.f19540 + f, this.f19539 + f2, this.f19538 + f, this.f19537 + f2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m12523(C7328 c7328) {
        return (this.f19540 < c7328.f19538) & (c7328.f19540 < this.f19538) & (this.f19539 < c7328.f19537) & (c7328.f19539 < this.f19537);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C7328 m12524(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new C7328(Float.intBitsToFloat(i) + this.f19540, Float.intBitsToFloat(i2) + this.f19539, Float.intBitsToFloat(i) + this.f19538, Float.intBitsToFloat(i2) + this.f19537);
    }
}
