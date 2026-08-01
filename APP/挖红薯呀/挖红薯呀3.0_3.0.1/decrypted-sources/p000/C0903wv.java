package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: wv */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0903wv implements InterfaceC0817uv {

    /* JADX INFO: renamed from: a */
    public final float[] f7193a;

    /* JADX INFO: renamed from: b */
    public final float[] f7194b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0903wv(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            C0921xc.m5131l("Array lengths must match and be nonzero");
            throw null;
        }
        this.f7193a = fArr;
        this.f7194b = fArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0817uv
    /* JADX INFO: renamed from: a */
    public final float mo2685a(float f) {
        return C0675r3.m3373c(f, this.f7194b, this.f7193a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0817uv
    /* JADX INFO: renamed from: b */
    public final float mo2686b(float f) {
        return C0675r3.m3373c(f, this.f7193a, this.f7194b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0903wv)) {
            return false;
        }
        C0903wv c0903wv = (C0903wv) obj;
        return Arrays.equals(this.f7193a, c0903wv.f7193a) && Arrays.equals(this.f7194b, c0903wv.f7194b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Arrays.hashCode(this.f7194b) + (Arrays.hashCode(this.f7193a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f7193a);
        string.getClass();
        sb.append(string);
        sb.append(", toDpValues=");
        String string2 = Arrays.toString(this.f7194b);
        string2.getClass();
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }
}
