package p128;

import androidx.activity.AbstractC0900;
import p069.AbstractC7390;

/* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8157 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8157 f19881 = new C8157(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f19882;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f19883;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f19884;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f19885;

    public C8157(float f, float f2, float f3, float f4) {
        this.f19885 = f;
        this.f19884 = f2;
        this.f19883 = f3;
        this.f19882 = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8157)) {
            return false;
        }
        C8157 c8157 = (C8157) obj;
        return Float.compare(this.f19885, c8157.f19885) == 0 && Float.compare(this.f19884, c8157.f19884) == 0 && Float.compare(this.f19883, c8157.f19883) == 0 && Float.compare(this.f19882, c8157.f19882) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19882) + AbstractC0900.m705(AbstractC0900.m705(Float.hashCode(this.f19885) * 31, this.f19884, 31), this.f19883, 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + AbstractC7390.m12623(this.f19885) + ", " + AbstractC7390.m12623(this.f19884) + ", " + AbstractC7390.m12623(this.f19883) + ", " + AbstractC7390.m12623(this.f19882) + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m13075() {
        return (this.f19885 >= this.f19883) | (this.f19884 >= this.f19882);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8157 m13076(C8157 c8157) {
        return new C8157(Math.max(this.f19885, c8157.f19885), Math.max(this.f19884, c8157.f19884), Math.min(this.f19883, c8157.f19883), Math.min(this.f19882, c8157.f19882));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long m13077() {
        return (((long) Float.floatToRawIntBits(this.f19885)) << 32) | (((long) Float.floatToRawIntBits(this.f19884)) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long m13078() {
        float f = this.f19883 - this.f19885;
        return (((long) Float.floatToRawIntBits(this.f19882 - this.f19884)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long m13079() {
        float f = this.f19883;
        float f2 = this.f19885;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.f19882;
        float f5 = this.f19884;
        return (((long) Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m13080(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat >= this.f19885) & (fIntBitsToFloat < this.f19883) & (fIntBitsToFloat2 >= this.f19884) & (fIntBitsToFloat2 < this.f19882);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C8157 m13081(float f, float f2) {
        return new C8157(this.f19885 + f, this.f19884 + f2, this.f19883 + f, this.f19882 + f2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m13082(C8157 c8157) {
        return (this.f19885 < c8157.f19883) & (c8157.f19885 < this.f19883) & (this.f19884 < c8157.f19882) & (c8157.f19884 < this.f19882);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C8157 m13083(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new C8157(Float.intBitsToFloat(i) + this.f19885, Float.intBitsToFloat(i2) + this.f19884, Float.intBitsToFloat(i) + this.f19883, Float.intBitsToFloat(i2) + this.f19882);
    }
}
