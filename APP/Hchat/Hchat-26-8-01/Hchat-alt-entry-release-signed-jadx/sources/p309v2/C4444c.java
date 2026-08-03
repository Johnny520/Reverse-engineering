package p309v2;

import java.util.Arrays;
import p136j8.C2104o;
import p304uf.C4330d;

/* JADX INFO: renamed from: v2.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4444c implements InterfaceC4442a {

    /* JADX INFO: renamed from: a */
    public final float[] f14754a;

    /* JADX INFO: renamed from: b */
    public final float[] f14755b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4444c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            C2104o.m5294t("Array lengths must match and be nonzero");
            throw null;
        }
        this.f14754a = fArr;
        this.f14755b = fArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p309v2.InterfaceC4442a
    /* JADX INFO: renamed from: a */
    public final float mo8536a(float f3) {
        return C4330d.m8753c(f3, this.f14755b, this.f14754a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p309v2.InterfaceC4442a
    /* JADX INFO: renamed from: b */
    public final float mo8537b(float f3) {
        return C4330d.m8753c(f3, this.f14754a, this.f14755b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C4444c)) {
            return false;
        }
        C4444c c4444c = (C4444c) obj;
        return Arrays.equals(this.f14754a, c4444c.f14754a) && Arrays.equals(this.f14755b, c4444c.f14755b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Arrays.hashCode(this.f14755b) + (Arrays.hashCode(this.f14754a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f14754a);
        string.getClass();
        sb2.append(string);
        sb2.append(", toDpValues=");
        String string2 = Arrays.toString(this.f14755b);
        string2.getClass();
        sb2.append(string2);
        sb2.append('}');
        return sb2.toString();
    }
}
