package p013C0;

import p023E0.AbstractC0277a;
import p027E4.C0330q;
import p128a.AbstractC1785a;

/* JADX INFO: renamed from: C0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0238e {

    /* JADX INFO: renamed from: a */
    public final boolean f798a;

    /* JADX INFO: renamed from: b */
    public final EnumC0237d f799b;

    /* JADX INFO: renamed from: c */
    public final int f800c;

    /* JADX INFO: renamed from: d */
    public final C0234a[] f801d;

    /* JADX INFO: renamed from: e */
    public int f802e;

    /* JADX INFO: renamed from: f */
    public final float[] f803f;

    /* JADX INFO: renamed from: g */
    public final float[] f804g;

    /* JADX INFO: renamed from: h */
    public final float[] f805h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0238e(boolean z5, EnumC0237d enumC0237d) {
        int i5;
        this.f798a = z5;
        this.f799b = enumC0237d;
        if (z5 && enumC0237d.equals(EnumC0237d.f795d)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int iOrdinal = enumC0237d.ordinal();
        if (iOrdinal == 0) {
            i5 = 3;
        } else {
            if (iOrdinal != 1) {
                throw new C0330q();
            }
            i5 = 2;
        }
        this.f800c = i5;
        this.f801d = new C0234a[20];
        this.f803f = new float[20];
        this.f804g = new float[20];
        this.f805h = new float[3];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m422a(float f2, long j5) {
        int i5 = (this.f802e + 1) % 20;
        this.f802e = i5;
        C0234a[] c0234aArr = this.f801d;
        C0234a c0234a = c0234aArr[i5];
        if (c0234a != null) {
            c0234a.f787a = j5;
            c0234a.f788b = f2;
        } else {
            C0234a c0234a2 = new C0234a();
            c0234a2.f787a = j5;
            c0234a2.f788b = f2;
            c0234aArr[i5] = c0234a2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final float m423b(float f2) {
        EnumC0237d enumC0237d;
        float[] fArr;
        float[] fArr2;
        float f5;
        boolean z5;
        int i5;
        float fSignum;
        float f6 = f2;
        float f7 = 0.0f;
        if (f6 <= 0.0f) {
            AbstractC0277a.m483b("maximumVelocity should be a positive value. You specified=" + f6);
        }
        int i6 = this.f802e;
        C0234a[] c0234aArr = this.f801d;
        C0234a c0234a = c0234aArr[i6];
        if (c0234a == null) {
            f5 = 0.0f;
        } else {
            int i7 = 0;
            C0234a c0234a2 = c0234a;
            while (true) {
                C0234a c0234a3 = c0234aArr[i6];
                boolean z6 = this.f798a;
                enumC0237d = this.f799b;
                fArr = this.f803f;
                fArr2 = this.f804g;
                if (c0234a3 == null) {
                    f5 = f7;
                    z5 = z6;
                    i5 = 1;
                    break;
                }
                long j5 = c0234a.f787a;
                f5 = f7;
                int i8 = i6;
                long j6 = c0234a3.f787a;
                float f8 = j5 - j6;
                z5 = z6;
                i5 = 1;
                float fAbs = Math.abs(j6 - c0234a2.f787a);
                c0234a2 = (enumC0237d == EnumC0237d.f795d || z5) ? c0234a3 : c0234a;
                if (f8 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i7] = c0234a3.f788b;
                fArr2[i7] = -f8;
                i6 = (i8 == 0 ? 20 : i8) - 1;
                i7++;
                if (i7 >= 20) {
                    break;
                }
                f7 = f5;
            }
            if (i7 >= this.f800c) {
                int iOrdinal = enumC0237d.ordinal();
                if (iOrdinal == 0) {
                    try {
                        float[] fArr3 = this.f805h;
                        AbstractC1785a.m3255q(fArr2, fArr, i7, fArr3);
                        fSignum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f5;
                    }
                } else {
                    if (iOrdinal != i5) {
                        throw new C0330q();
                    }
                    int i9 = i7 - i5;
                    float f9 = fArr2[i9];
                    int i10 = i9;
                    float fAbs2 = f5;
                    while (i10 > 0) {
                        int i11 = i10 - 1;
                        float f10 = fArr2[i11];
                        if (f9 != f10) {
                            float f11 = (z5 ? -fArr[i11] : fArr[i10] - fArr[i11]) / (f9 - f10);
                            fAbs2 += Math.abs(f11) * (f11 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2))));
                            if (i10 == i9) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i10--;
                        f9 = f10;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2));
                }
                f7 = fSignum * 1000;
            } else {
                f7 = f5;
            }
        }
        if (f7 == f5 || Float.isNaN(f7)) {
            return f5;
        }
        if (f7 <= f5) {
            f6 = -f6;
            if (f7 >= f6) {
                return f7;
            }
        } else if (f7 <= f6) {
            f6 = f7;
        }
        return f6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0003: CONSTRUCTOR false, (wrap:C0.d:0x0000: SGET  A[WRAPPED] (LINE:13) C0.d.d C0.d) A[MD:(boolean, C0.d):void (m)] (LINE:13) call: C0.e.<init>(boolean, C0.d):void type: THIS */
    public /* synthetic */ C0238e() {
        this(false, EnumC0237d.f795d);
    }

    public C0238e(int i5) {
        this(true, EnumC0237d.f796e);
    }
}
