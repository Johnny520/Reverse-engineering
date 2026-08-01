package p204;

import java.util.Arrays;
import p075.C6958;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7890 implements InterfaceC7892 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float[] f21854;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float[] f21855;

    public C7890(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            C5925.m11310("Array lengths must match and be nonzero");
            throw null;
        }
        this.f21855 = fArr;
        this.f21854 = fArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C7890)) {
            return false;
        }
        C7890 c7890 = (C7890) obj;
        return Arrays.equals(this.f21855, c7890.f21855) && Arrays.equals(this.f21854, c7890.f21854);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f21854) + (Arrays.hashCode(this.f21855) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f21855);
        string.getClass();
        sb.append(string);
        sb.append(", toDpValues=");
        String string2 = Arrays.toString(this.f21854);
        string2.getClass();
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }

    @Override // p204.InterfaceC7892
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float mo13313(float f) {
        return C6958.m12258(f, this.f21855, this.f21854);
    }

    @Override // p204.InterfaceC7892
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float mo13314(float f) {
        return C6958.m12258(f, this.f21854, this.f21855);
    }
}
