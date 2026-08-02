package p000;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bb1 extends zp2 {

    /* JADX INFO: renamed from: c */
    public final List f757c;

    /* JADX INFO: renamed from: d */
    public final long f758d;

    /* JADX INFO: renamed from: e */
    public final long f759e;

    public bb1(List list, long j, long j2) {
        this.f757c = list;
        this.f758d = j;
        this.f759e = j2;
    }

    @Override // p000.zp2
    /* JADX INFO: renamed from: b */
    public final Shader mo507b(long j) {
        long j2 = this.f758d;
        int i = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        long j3 = this.f759e;
        int i3 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i4);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
        List list = this.f757c;
        if (list.size() < 2) {
            C0676s.m4651j("colors must have length of at least 2 if colorStops is omitted.");
            return null;
        }
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L));
        int size = list.size();
        int[] iArr = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr[i5] = sp0.m4947j0(((C0363ju) list.get(i5)).f5219a);
        }
        return new LinearGradient(fIntBitsToFloat5, fIntBitsToFloat6, fIntBitsToFloat7, fIntBitsToFloat8, iArr, (float[]) null, Shader.TileMode.CLAMP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb1)) {
            return false;
        }
        bb1 bb1Var = (bb1) obj;
        return t11.m5086l(this.f757c, bb1Var.f757c) && rs1.m4609b(this.f758d, bb1Var.f758d) && rs1.m4609b(this.f759e, bb1Var.f759e);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + hk1.m2204c(hk1.m2204c(this.f757c.hashCode() * 961, 31, this.f758d), 31, this.f759e);
    }

    public final String toString() {
        String str;
        long j = this.f758d;
        String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) rs1.m4614g(j)) + ", ";
        } else {
            str = "";
        }
        long j2 = this.f759e;
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) rs1.m4614g(j2)) + ", ";
        }
        return "LinearGradient(colors=" + this.f757c + ", stops=null, " + str + str2 + "tileMode=" + ((Object) "Clamp") + ')';
    }
}
