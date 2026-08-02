package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fm0 implements dm0 {

    /* JADX INFO: renamed from: a */
    public final float[] f3053a;

    /* JADX INFO: renamed from: b */
    public final float[] f3054b;

    public fm0(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            C0676s.m4651j("Array lengths must match and be nonzero");
            throw null;
        }
        this.f3053a = fArr;
        this.f3054b = fArr2;
    }

    @Override // p000.dm0
    /* JADX INFO: renamed from: a */
    public final float mo123a(float f) {
        return C0160eb.m1318s(f, this.f3054b, this.f3053a);
    }

    @Override // p000.dm0
    /* JADX INFO: renamed from: b */
    public final float mo124b(float f) {
        return C0160eb.m1318s(f, this.f3053a, this.f3054b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof fm0)) {
            return false;
        }
        fm0 fm0Var = (fm0) obj;
        return Arrays.equals(this.f3053a, fm0Var.f3053a) && Arrays.equals(this.f3054b, fm0Var.f3054b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3054b) + (Arrays.hashCode(this.f3053a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f3053a);
        string.getClass();
        sb.append(string);
        sb.append(", toDpValues=");
        String string2 = Arrays.toString(this.f3054b);
        string2.getClass();
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }
}
