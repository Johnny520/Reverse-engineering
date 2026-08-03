package p279t1;

import okio.C3193a;
import p092g4.AbstractC1341a;
import p136j8.C2104o;
import p292u1.AbstractC4229a;

/* JADX INFO: renamed from: t1.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4084d {

    /* JADX INFO: renamed from: a */
    public final boolean f13529a;

    /* JADX INFO: renamed from: b */
    public final EnumC4083c f13530b;

    /* JADX INFO: renamed from: c */
    public final int f13531c;

    /* JADX INFO: renamed from: d */
    public final C4081a[] f13532d;

    /* JADX INFO: renamed from: e */
    public int f13533e;

    /* JADX INFO: renamed from: f */
    public final float[] f13534f;

    /* JADX INFO: renamed from: g */
    public final float[] f13535g;

    /* JADX INFO: renamed from: h */
    public final float[] f13536h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4084d(boolean z9, EnumC4083c enumC4083c) {
        int i9;
        this.f13529a = z9;
        this.f13530b = enumC4083c;
        if (z9 && enumC4083c.equals(EnumC4083c.f13526g)) {
            C2104o.m5276A("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int iOrdinal = enumC4083c.ordinal();
        if (iOrdinal == 0) {
            i9 = 3;
        } else {
            if (iOrdinal != 1) {
                C3193a.m6822k();
                throw null;
            }
            i9 = 2;
        }
        this.f13531c = i9;
        this.f13532d = new C4081a[20];
        this.f13534f = new float[20];
        this.f13535g = new float[20];
        this.f13536h = new float[3];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m8265a(long j3, float f3) {
        int i9 = (this.f13533e + 1) % 20;
        this.f13533e = i9;
        C4081a[] c4081aArr = this.f13532d;
        C4081a c4081a = c4081aArr[i9];
        if (c4081a != null) {
            c4081a.f13521a = j3;
            c4081a.f13522b = f3;
        } else {
            C4081a c4081a2 = new C4081a();
            c4081a2.f13521a = j3;
            c4081a2.f13522b = f3;
            c4081aArr[i9] = c4081a2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final float m8266b(float f3) {
        EnumC4083c enumC4083c;
        float[] fArr;
        float[] fArr2;
        float f10;
        boolean z9;
        int i9;
        float fSignum;
        float f11 = f3;
        float f12 = 0.0f;
        if (f11 <= 0.0f) {
            AbstractC4229a.m8494b("maximumVelocity should be a positive value. You specified=" + f11);
        }
        int i10 = this.f13533e;
        C4081a[] c4081aArr = this.f13532d;
        C4081a c4081a = c4081aArr[i10];
        if (c4081a == null) {
            f10 = 0.0f;
        } else {
            int i11 = 0;
            C4081a c4081a2 = c4081a;
            while (true) {
                C4081a c4081a3 = c4081aArr[i10];
                boolean z10 = this.f13529a;
                enumC4083c = this.f13530b;
                fArr = this.f13534f;
                fArr2 = this.f13535g;
                if (c4081a3 == null) {
                    f10 = f12;
                    z9 = z10;
                    i9 = 1;
                    break;
                }
                long j3 = c4081a.f13521a;
                f10 = f12;
                int i12 = i10;
                long j4 = c4081a3.f13521a;
                float f13 = j3 - j4;
                z9 = z10;
                i9 = 1;
                float fAbs = Math.abs(j4 - c4081a2.f13521a);
                c4081a2 = (enumC4083c == EnumC4083c.f13526g || z9) ? c4081a3 : c4081a;
                if (f13 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i11] = c4081a3.f13522b;
                fArr2[i11] = -f13;
                i10 = (i12 == 0 ? 20 : i12) - 1;
                i11++;
                if (i11 >= 20) {
                    break;
                }
                f12 = f10;
            }
            if (i11 >= this.f13531c) {
                int iOrdinal = enumC4083c.ordinal();
                if (iOrdinal == 0) {
                    try {
                        float[] fArr3 = this.f13536h;
                        AbstractC1341a.m3575F(fArr2, fArr, i11, fArr3);
                        fSignum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f10;
                    }
                } else {
                    if (iOrdinal != i9) {
                        C3193a.m6822k();
                        return 0.0f;
                    }
                    int i13 = i11 - i9;
                    float f14 = fArr2[i13];
                    int i14 = i13;
                    float fAbs2 = f10;
                    while (i14 > 0) {
                        int i15 = i14 - 1;
                        float f15 = fArr2[i15];
                        if (f14 != f15) {
                            float f16 = (z9 ? -fArr[i15] : fArr[i14] - fArr[i15]) / (f14 - f15);
                            fAbs2 += Math.abs(f16) * (f16 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2))));
                            if (i14 == i13) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i14--;
                        f14 = f15;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2));
                }
                f12 = fSignum * 1000;
            } else {
                f12 = f10;
            }
        }
        if (f12 == f10 || Float.isNaN(f12)) {
            return f10;
        }
        if (f12 <= f10) {
            f11 = -f11;
            if (f12 >= f11) {
                return f12;
            }
        } else if (f12 <= f11) {
            f11 = f12;
        }
        return f11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0003: CONSTRUCTOR false, (wrap:t1.c:0x0000: SGET  A[WRAPPED] (LINE:65) t1.c.g t1.c) A[MD:(boolean, t1.c):void (m)] (LINE:65) call: t1.d.<init>(boolean, t1.c):void type: THIS */
    public /* synthetic */ C4084d() {
        this(false, EnumC4083c.f13526g);
    }

    public C4084d(int i9) {
        this(true, EnumC4083c.f13527h);
    }
}
