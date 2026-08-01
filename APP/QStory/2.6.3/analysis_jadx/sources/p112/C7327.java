package p112;

import androidx.activity.AbstractC0053;
import p009.AbstractC6183;
import p034.AbstractC6347;
import p053.AbstractC6561;
import p251.AbstractC8175;

/* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7327 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long f19528;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long f19529;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f19530;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f19531;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f19532;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f19533;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final long f19534;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long f19535;

    static {
        AbstractC8175.m13632(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public C7327(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.f19533 = f;
        this.f19532 = f2;
        this.f19531 = f3;
        this.f19530 = f4;
        this.f19529 = j;
        this.f19528 = j2;
        this.f19535 = j3;
        this.f19534 = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7327)) {
            return false;
        }
        C7327 c7327 = (C7327) obj;
        return Float.compare(this.f19533, c7327.f19533) == 0 && Float.compare(this.f19532, c7327.f19532) == 0 && Float.compare(this.f19531, c7327.f19531) == 0 && Float.compare(this.f19530, c7327.f19530) == 0 && AbstractC6347.m11900(this.f19529, c7327.f19529) && AbstractC6347.m11900(this.f19528, c7327.f19528) && AbstractC6347.m11900(this.f19535, c7327.f19535) && AbstractC6347.m11900(this.f19534, c7327.f19534);
    }

    public final int hashCode() {
        return Long.hashCode(this.f19534) + AbstractC0053.m142(AbstractC0053.m142(AbstractC0053.m142(AbstractC0053.m145(AbstractC0053.m145(AbstractC0053.m145(Float.hashCode(this.f19533) * 31, this.f19532, 31), this.f19531, 31), this.f19530, 31), 31, this.f19529), 31, this.f19528), 31, this.f19535);
    }

    public final String toString() {
        String str = AbstractC6561.m12064(this.f19533) + ", " + AbstractC6561.m12064(this.f19532) + ", " + AbstractC6561.m12064(this.f19531) + ", " + AbstractC6561.m12064(this.f19530);
        long j = this.f19529;
        long j2 = this.f19528;
        boolean zM11900 = AbstractC6347.m11900(j, j2);
        long j3 = this.f19535;
        long j4 = this.f19534;
        if (!zM11900 || !AbstractC6347.m11900(j2, j3) || !AbstractC6347.m11900(j3, j4)) {
            StringBuilder sbM11585 = AbstractC6183.m11585("RoundRect(rect=", str, ", topLeft=");
            sbM11585.append((Object) AbstractC6347.m11902(j));
            sbM11585.append(", topRight=");
            sbM11585.append((Object) AbstractC6347.m11902(j2));
            sbM11585.append(", bottomRight=");
            sbM11585.append((Object) AbstractC6347.m11902(j3));
            sbM11585.append(", bottomLeft=");
            sbM11585.append((Object) AbstractC6347.m11902(j4));
            sbM11585.append(')');
            return sbM11585.toString();
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            StringBuilder sbM115852 = AbstractC6183.m11585("RoundRect(rect=", str, ", radius=");
            sbM115852.append(AbstractC6561.m12064(Float.intBitsToFloat(i)));
            sbM115852.append(')');
            return sbM115852.toString();
        }
        StringBuilder sbM115853 = AbstractC6183.m11585("RoundRect(rect=", str, ", x=");
        sbM115853.append(AbstractC6561.m12064(Float.intBitsToFloat(i)));
        sbM115853.append(", y=");
        sbM115853.append(AbstractC6561.m12064(Float.intBitsToFloat(i2)));
        sbM115853.append(')');
        return sbM115853.toString();
    }
}
