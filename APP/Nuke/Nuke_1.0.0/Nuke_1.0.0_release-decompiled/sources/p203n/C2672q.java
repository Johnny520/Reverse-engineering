package p203n;

import p011B4.AbstractC0231b;
import p211o0.AbstractC2767z;

/* JADX INFO: renamed from: n.q */
/* JADX INFO: loaded from: classes.dex */
public final class C2672q implements InterfaceC2675t {

    /* JADX INFO: renamed from: d */
    public final float f8527d;

    /* JADX INFO: renamed from: e */
    public final float f8528e;

    /* JADX INFO: renamed from: f */
    public final float f8529f;

    /* JADX INFO: renamed from: g */
    public final float f8530g;

    /* JADX INFO: renamed from: h */
    public final float f8531h;

    /* JADX INFO: renamed from: i */
    public final float f8532i;

    public C2672q(float f2, float f5, float f6, float f7) {
        int iM4930C;
        this.f8527d = f2;
        this.f8528e = f5;
        this.f8529f = f6;
        this.f8530g = f7;
        if (!((Float.isNaN(f2) || Float.isNaN(f5) || Float.isNaN(f6) || Float.isNaN(f7)) ? false : true)) {
            AbstractC2624G.m4574a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f2 + ", " + f5 + ", " + f6 + ", " + f7 + '.');
        }
        float[] fArr = new float[5];
        float f8 = (f5 - 0.0f) * 3.0f;
        float f9 = (f7 - f5) * 3.0f;
        float f10 = (1.0f - f7) * 3.0f;
        double d5 = f8;
        double d6 = f9;
        double d7 = f10;
        double d8 = d6 * 2.0d;
        double d9 = (d5 - d8) + d7;
        if (d9 == 0.0d) {
            iM4930C = d6 == d7 ? 0 : AbstractC2767z.m4930C((float) ((d8 - d7) / (d8 - (d7 * 2.0d))), fArr, 0);
        } else {
            double d10 = -Math.sqrt((d6 * d6) - (d7 * d5));
            double d11 = (-d5) + d6;
            int iM4930C2 = AbstractC2767z.m4930C((float) ((-(d10 + d11)) / d9), fArr, 0);
            int iM4930C3 = AbstractC2767z.m4930C((float) ((d10 - d11) / d9), fArr, iM4930C2) + iM4930C2;
            if (iM4930C3 > 1) {
                float f11 = fArr[0];
                float f12 = fArr[1];
                if (f11 > f12) {
                    fArr[0] = f12;
                    fArr[1] = f11;
                } else if (f11 == f12) {
                    iM4930C = iM4930C3 - 1;
                }
                iM4930C = iM4930C3;
            } else {
                iM4930C = iM4930C3;
            }
        }
        float f13 = (f9 - f8) * 2.0f;
        int iM4930C4 = AbstractC2767z.m4930C((-f13) / (((f10 - f9) * 2.0f) - f13), fArr, iM4930C) + iM4930C;
        float fMin = Math.min(0.0f, 1.0f);
        float fMax = Math.max(0.0f, 1.0f);
        for (int i5 = 0; i5 < iM4930C4; i5++) {
            float f14 = fArr[i5];
            float f15 = (((((((((f5 - f7) * 3.0f) + 1.0f) - 0.0f) * f14) + (((f7 - (f5 * 2.0f)) + 0.0f) * 3.0f)) * f14) + f8) * f14) + 0.0f;
            fMin = Math.min(fMin, f15);
            fMax = Math.max(fMax, f15);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
        this.f8531h = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        this.f8532i = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0092 A[PHI: r3
  0x0092: PHI (r3v28 float) = (r3v5 float), (r3v16 float), (r3v21 float), (r3v32 float), (r3v37 float) binds: [B:128:0x0236, B:117:0x0206, B:92:0x01bb, B:47:0x00e5, B:22:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0162 A[PHI: r12
  0x0162: PHI (r12v41 float) = (r12v25 float), (r12v36 float) binds: [B:68:0x0160, B:81:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p203n.InterfaceC2675t
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float mo600a(float r27) {
        /*
            Method dump skipped, instruction units count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p203n.C2672q.mo600a(float):float");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2672q)) {
            return false;
        }
        C2672q c2672q = (C2672q) obj;
        return this.f8527d == c2672q.f8527d && this.f8528e == c2672q.f8528e && this.f8529f == c2672q.f8529f && this.f8530g == c2672q.f8530g;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8530g) + AbstractC0231b.m390a(this.f8529f, AbstractC0231b.m390a(this.f8528e, Float.hashCode(this.f8527d) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CubicBezierEasing(a=");
        sb.append(this.f8527d);
        sb.append(", b=");
        sb.append(this.f8528e);
        sb.append(", c=");
        sb.append(this.f8529f);
        sb.append(", d=");
        return AbstractC0231b.m401l(sb, this.f8530g, ')');
    }
}
