package p112;

import androidx.activity.AbstractC0053;
import io.ktor.client.plugins.AbstractC3932;

/* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7327 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7327 f19541 = new C7327(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f19542;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f19543;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f19544;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f19545;

    public C7327(float f, float f2, float f3, float f4) {
        this.f19545 = f;
        this.f19544 = f2;
        this.f19543 = f3;
        this.f19542 = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7327)) {
            return false;
        }
        C7327 c7327 = (C7327) obj;
        return Float.compare(this.f19545, c7327.f19545) == 0 && Float.compare(this.f19544, c7327.f19544) == 0 && Float.compare(this.f19543, c7327.f19543) == 0 && Float.compare(this.f19542, c7327.f19542) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19542) + AbstractC0053.m144(AbstractC0053.m144(Float.hashCode(this.f19545) * 31, this.f19544, 31), this.f19543, 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + AbstractC3932.m8302(this.f19545) + ", " + AbstractC3932.m8302(this.f19544) + ", " + AbstractC3932.m8302(this.f19543) + ", " + AbstractC3932.m8302(this.f19542) + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m12489() {
        return (this.f19545 >= this.f19543) | (this.f19544 >= this.f19542);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C7327 m12490(C7327 c7327) {
        return new C7327(Math.max(this.f19545, c7327.f19545), Math.max(this.f19544, c7327.f19544), Math.min(this.f19543, c7327.f19543), Math.min(this.f19542, c7327.f19542));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long m12491() {
        return (((long) Float.floatToRawIntBits(this.f19545)) << 32) | (((long) Float.floatToRawIntBits(this.f19544)) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long m12492() {
        float f = this.f19543 - this.f19545;
        return (((long) Float.floatToRawIntBits(this.f19542 - this.f19544)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long m12493() {
        float f = this.f19543;
        float f2 = this.f19545;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.f19542;
        float f5 = this.f19544;
        return (((long) Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m12494(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat >= this.f19545) & (fIntBitsToFloat < this.f19543) & (fIntBitsToFloat2 >= this.f19544) & (fIntBitsToFloat2 < this.f19542);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C7327 m12495(float f, float f2) {
        return new C7327(this.f19545 + f, this.f19544 + f2, this.f19543 + f, this.f19542 + f2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m12496(C7327 c7327) {
        return (this.f19545 < c7327.f19543) & (c7327.f19545 < this.f19543) & (this.f19544 < c7327.f19542) & (c7327.f19544 < this.f19542);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C7327 m12497(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new C7327(Float.intBitsToFloat(i) + this.f19545, Float.intBitsToFloat(i2) + this.f19544, Float.intBitsToFloat(i) + this.f19543, Float.intBitsToFloat(i2) + this.f19542);
    }
}
