package p128;

import androidx.activity.AbstractC0900;
import p025.AbstractC7012;
import p050.AbstractC7176;
import p069.AbstractC7390;
import p267.AbstractC9004;

/* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8156 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long f19873;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long f19874;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f19875;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f19876;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f19877;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f19878;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final long f19879;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long f19880;

    static {
        AbstractC9004.m14191(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public C8156(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.f19878 = f;
        this.f19877 = f2;
        this.f19876 = f3;
        this.f19875 = f4;
        this.f19874 = j;
        this.f19873 = j2;
        this.f19880 = j3;
        this.f19879 = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8156)) {
            return false;
        }
        C8156 c8156 = (C8156) obj;
        return Float.compare(this.f19878, c8156.f19878) == 0 && Float.compare(this.f19877, c8156.f19877) == 0 && Float.compare(this.f19876, c8156.f19876) == 0 && Float.compare(this.f19875, c8156.f19875) == 0 && AbstractC7176.m12459(this.f19874, c8156.f19874) && AbstractC7176.m12459(this.f19873, c8156.f19873) && AbstractC7176.m12459(this.f19880, c8156.f19880) && AbstractC7176.m12459(this.f19879, c8156.f19879);
    }

    public final int hashCode() {
        return Long.hashCode(this.f19879) + AbstractC0900.m702(AbstractC0900.m702(AbstractC0900.m702(AbstractC0900.m705(AbstractC0900.m705(AbstractC0900.m705(Float.hashCode(this.f19878) * 31, this.f19877, 31), this.f19876, 31), this.f19875, 31), 31, this.f19874), 31, this.f19873), 31, this.f19880);
    }

    public final String toString() {
        String str = AbstractC7390.m12623(this.f19878) + ", " + AbstractC7390.m12623(this.f19877) + ", " + AbstractC7390.m12623(this.f19876) + ", " + AbstractC7390.m12623(this.f19875);
        long j = this.f19874;
        long j2 = this.f19873;
        boolean zM12459 = AbstractC7176.m12459(j, j2);
        long j3 = this.f19880;
        long j4 = this.f19879;
        if (!zM12459 || !AbstractC7176.m12459(j2, j3) || !AbstractC7176.m12459(j3, j4)) {
            StringBuilder sbM12144 = AbstractC7012.m12144("RoundRect(rect=", str, ", topLeft=");
            sbM12144.append((Object) AbstractC7176.m12461(j));
            sbM12144.append(", topRight=");
            sbM12144.append((Object) AbstractC7176.m12461(j2));
            sbM12144.append(", bottomRight=");
            sbM12144.append((Object) AbstractC7176.m12461(j3));
            sbM12144.append(", bottomLeft=");
            sbM12144.append((Object) AbstractC7176.m12461(j4));
            sbM12144.append(')');
            return sbM12144.toString();
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            StringBuilder sbM121442 = AbstractC7012.m12144("RoundRect(rect=", str, ", radius=");
            sbM121442.append(AbstractC7390.m12623(Float.intBitsToFloat(i)));
            sbM121442.append(')');
            return sbM121442.toString();
        }
        StringBuilder sbM121443 = AbstractC7012.m12144("RoundRect(rect=", str, ", x=");
        sbM121443.append(AbstractC7390.m12623(Float.intBitsToFloat(i)));
        sbM121443.append(", y=");
        sbM121443.append(AbstractC7390.m12623(Float.intBitsToFloat(i2)));
        sbM121443.append(')');
        return sbM121443.toString();
    }
}
