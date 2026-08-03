package p071f1;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.List;
import okhttp3.HttpUrl;
import p057e1.C0807b;
import p068eh.AbstractC0921a;
import p136j8.C2104o;

/* JADX INFO: renamed from: f1.h0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1006h0 extends AbstractC1022p0 {

    /* JADX INFO: renamed from: c */
    public final List f3185c;

    /* JADX INFO: renamed from: d */
    public final long f3186d;

    /* JADX INFO: renamed from: e */
    public final long f3187e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1006h0(List list, long j3, long j4) {
        this.f3185c = list;
        this.f3186d = j3;
        this.f3187e = j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.AbstractC1022p0
    /* JADX INFO: renamed from: b */
    public final Shader mo2592b(long j3) {
        long j4 = this.f3186d;
        int i9 = (int) (j4 >> 32);
        if (Float.intBitsToFloat(i9) == Float.POSITIVE_INFINITY) {
            i9 = (int) (j3 >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i9);
        int i10 = (int) (j4 & 4294967295L);
        if (Float.intBitsToFloat(i10) == Float.POSITIVE_INFINITY) {
            i10 = (int) (j3 & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10);
        long j5 = this.f3187e;
        int i11 = (int) (j5 >> 32);
        if (Float.intBitsToFloat(i11) == Float.POSITIVE_INFINITY) {
            i11 = (int) (j3 >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i11);
        int i12 = (int) (j5 & 4294967295L);
        if (Float.intBitsToFloat(i12) == Float.POSITIVE_INFINITY) {
            i12 = (int) (j3 & 4294967295L);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i12);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
        List list = this.f3185c;
        if (list.size() < 2) {
            C2104o.m5294t("colors must have length of at least 2 if colorStops is omitted.");
            return null;
        }
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L));
        int size = list.size();
        int[] iArr = new int[size];
        for (int i13 = 0; i13 < size; i13++) {
            iArr[i13] = AbstractC0996c0.m2526w(((C1034w) list.get(i13)).f3265a);
        }
        return new LinearGradient(fIntBitsToFloat5, fIntBitsToFloat6, fIntBitsToFloat7, fIntBitsToFloat8, iArr, (float[]) null, AbstractC0996c0.m2525v(0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1006h0)) {
            return false;
        }
        C1006h0 c1006h0 = (C1006h0) obj;
        return this.f3185c.equals(c1006h0.f3185c) && C0807b.m2039b(this.f3186d, c1006h0.f3186d) && C0807b.m2039b(this.f3187e, c1006h0.f3187e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(0) + AbstractC0921a.m2243f(AbstractC0921a.m2243f(this.f3185c.hashCode() * 961, 31, this.f3186d), 31, this.f3187e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str;
        long j3 = this.f3186d;
        long j4 = (((j3 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L);
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (j4 == 0) {
            str = "start=" + ((Object) C0807b.m2044g(j3)) + ", ";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        long j5 = this.f3187e;
        if (((((j5 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) C0807b.m2044g(j5)) + ", ";
        }
        return "LinearGradient(colors=" + this.f3185c + ", stops=null, " + str + str2 + "tileMode=" + ((Object) "Clamp") + ')';
    }
}
