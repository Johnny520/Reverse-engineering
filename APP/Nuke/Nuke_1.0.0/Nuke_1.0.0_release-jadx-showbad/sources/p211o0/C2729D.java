package p211o0;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.List;
import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;
import p204n0.C2683b;

/* JADX INFO: renamed from: o0.D */
/* JADX INFO: loaded from: classes.dex */
public final class C2729D extends AbstractC2736K {

    /* JADX INFO: renamed from: c */
    public final List f8672c;

    /* JADX INFO: renamed from: d */
    public final long f8673d;

    /* JADX INFO: renamed from: e */
    public final long f8674e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2729D(List list, long j5, long j6) {
        this.f8672c = list;
        this.f8673d = j5;
        this.f8674e = j6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p211o0.AbstractC2736K
    /* JADX INFO: renamed from: b */
    public final Shader mo4781b(long j5) {
        long j6 = this.f8673d;
        int i5 = (int) (j6 >> 32);
        if (Float.intBitsToFloat(i5) == Float.POSITIVE_INFINITY) {
            i5 = (int) (j5 >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i5);
        int i6 = (int) (j6 & 4294967295L);
        if (Float.intBitsToFloat(i6) == Float.POSITIVE_INFINITY) {
            i6 = (int) (j5 & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i6);
        long j7 = this.f8674e;
        int i7 = (int) (j7 >> 32);
        if (Float.intBitsToFloat(i7) == Float.POSITIVE_INFINITY) {
            i7 = (int) (j5 >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i7);
        int i8 = (int) (j7 & 4294967295L);
        if (Float.intBitsToFloat(i8) == Float.POSITIVE_INFINITY) {
            i8 = (int) (j5 & 4294967295L);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i8);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
        List list = this.f8672c;
        if (list.size() < 2) {
            throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
        }
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L));
        int size = list.size();
        int[] iArr = new int[size];
        for (int i9 = 0; i9 < size; i9++) {
            iArr[i9] = AbstractC2767z.m4952w(((C2762u) list.get(i9)).f8764a);
        }
        return new LinearGradient(fIntBitsToFloat5, fIntBitsToFloat6, fIntBitsToFloat7, fIntBitsToFloat8, iArr, (float[]) null, AbstractC2767z.m4951v(0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2729D)) {
            return false;
        }
        C2729D c2729d = (C2729D) obj;
        return AbstractC1665j.m2981a(this.f8672c, c2729d.f8672c) && C2683b.m4644b(this.f8673d, c2729d.f8673d) && C2683b.m4644b(this.f8674e, c2729d.f8674e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(0) + AbstractC0231b.m392c(AbstractC0231b.m392c(this.f8672c.hashCode() * 961, 31, this.f8673d), 31, this.f8674e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str;
        long j5 = this.f8673d;
        String str2 = "";
        if (((((j5 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) C2683b.m4649g(j5)) + ", ";
        } else {
            str = "";
        }
        long j6 = this.f8674e;
        if (((((j6 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) C2683b.m4649g(j6)) + ", ";
        }
        return "LinearGradient(colors=" + this.f8672c + ", stops=null, " + str + str2 + "tileMode=" + ((Object) "Clamp") + ')';
    }
}
