package p174m;

import ac.AbstractC0063p;
import okio.C3193a;
import p005a5.C0016a;
import p007a7.AbstractC0018a;
import p057e1.C0807b;
import p069f.C0933f0;
import p069f.C0967y;
import p136j8.C2104o;
import p224p1.C3286a;
import p224p1.C3287b;
import p267s1.C3890d0;
import p339x1.AbstractC5618k;

/* JADX INFO: renamed from: m.b1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2578b1 {

    /* JADX INFO: renamed from: a */
    public final AbstractC2639p0 f8352a;

    /* JADX INFO: renamed from: b */
    public C2667w0 f8353b;

    /* JADX INFO: renamed from: c */
    public C2679z0 f8354c;

    /* JADX INFO: renamed from: d */
    public C2675y0 f8355d;

    /* JADX INFO: renamed from: e */
    public C2671x0 f8356e;

    /* JADX INFO: renamed from: f */
    public AbstractC0018a f8357f;

    /* JADX INFO: renamed from: g */
    public C2571a f8358g;

    /* JADX INFO: renamed from: h */
    public long f8359h = 9205357640488583168L;

    /* JADX INFO: renamed from: i */
    public C2575a3 f8360i;

    /* JADX INFO: renamed from: j */
    public final C0016a f8361j;

    /* JADX INFO: renamed from: k */
    public final C0016a f8362k;

    /* JADX INFO: renamed from: l */
    public long f8363l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2578b1(AbstractC2639p0 abstractC2639p0) {
        this.f8352a = abstractC2639p0;
        C0016a c0016a = new C0016a((byte) 0, 7);
        c0016a.f56i = new C0933f0();
        this.f8361j = c0016a;
        C0016a c0016a2 = new C0016a((byte) 0, 8);
        c0016a2.f56i = new C0967y();
        this.f8362k = c0016a2;
        this.f8363l = 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m6044c(C2578b1 c2578b1, C3287b c3287b, long j3, long j4, int i9) {
        if ((i9 & 4) != 0) {
            j4 = 0;
        }
        AbstractC2639p0 abstractC2639p0 = c2578b1.f8352a;
        C2675y0 c2675y0 = c2578b1.f8355d;
        if (c2675y0 == null) {
            c2675y0 = new C2675y0();
            c2675y0.f8728b = null;
            c2675y0.f8729c = Long.MAX_VALUE;
            c2675y0.f8730d = false;
            c2578b1.f8355d = c2675y0;
        }
        c2675y0.f8728b = c3287b;
        c2675y0.f8729c = j3;
        C2575a3 c2575a3 = c2578b1.f8360i;
        EnumC2640p1 enumC2640p1 = abstractC2639p0.f8618w;
        if (c2575a3 == null) {
            c2578b1.f8360i = new C2575a3(enumC2640p1);
        } else {
            c2575a3.f8347a = enumC2640p1;
            c2575a3.f8348b = j4;
        }
        c2675y0.f8730d = false;
        c2578b1.f8357f = c2675y0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m6045a() {
        C2667w0 c2667w0 = this.f8353b;
        EnumC2663v0 enumC2663v0 = EnumC2663v0.f8702i;
        if (c2667w0 == null) {
            c2667w0 = new C2667w0();
            c2667w0.f8714b = enumC2663v0;
            c2667w0.f8715c = false;
            this.f8353b = c2667w0;
        }
        c2667w0.f8714b = enumC2663v0;
        c2667w0.f8715c = false;
        this.f8357f = c2667w0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m6046b(C3287b c3287b, long j3, C2575a3 c2575a3) {
        C2671x0 c2671x0 = this.f8356e;
        if (c2671x0 == null) {
            c2671x0 = new C2671x0();
            c2671x0.f8720b = null;
            c2671x0.f8721c = Long.MAX_VALUE;
            this.f8356e = c2671x0;
        }
        c2671x0.f8720b = c3287b;
        c2671x0.f8721c = j3;
        c2575a3.f8348b = 0L;
        this.f8357f = c2671x0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final C2571a m6047d() {
        C2571a c2571a = this.f8358g;
        if (c2571a != null) {
            return c2571a;
        }
        C2104o.m5294t("Velocity Tracker not initialized.");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m6048e(C3287b c3287b, C3286a c3286a, long j3) {
        AbstractC2639p0 abstractC2639p0 = this.f8352a;
        long jMo8859P = AbstractC5618k.m10166v(abstractC2639p0).mo8859P(0L);
        if (!C0807b.m2039b(this.f8359h, 9205357640488583168L) && !C0807b.m2039b(jMo8859P, this.f8359h)) {
            this.f8363l = C0807b.m2042e(this.f8363l, C0807b.m2041d(jMo8859P, this.f8359h));
        }
        this.f8359h = jMo8859P;
        EnumC2640p1 enumC2640p1 = abstractC2639p0.f8618w;
        enumC2640p1.getClass();
        C2647r0 c2647r0 = AbstractC2651s0.f8654a;
        if (Math.abs(Float.intBitsToFloat((int) (enumC2640p1 == EnumC2640p1.f8622g ? j3 & 4294967295L : j3 >> 32))) > 2.0f) {
            AbstractC0063p.m409b(m6047d(), c3287b, abstractC2639p0.f8618w, c3286a, this.f8361j, this.f8363l);
            C0016a c0016a = this.f8362k;
            C0967y c0967y = (C0967y) c0016a.f56i;
            int i9 = c0967y.f3044b;
            if (i9 == 3) {
                int i10 = c0016a.f55h;
                c0016a.f55h = i10 + 1;
                if (i10 < 0 || i10 >= i9) {
                    C3193a.m6820i("Index must be between 0 and size");
                    return;
                } else {
                    long[] jArr = c0967y.f3043a;
                    long j4 = jArr[i10];
                    jArr[i10] = j3;
                }
            } else {
                c0967y.m2386a(j3);
            }
            if (c0016a.f55h == 3) {
                c0016a.f55h = 0;
            }
            long[] jArr2 = c0967y.f3043a;
            int i11 = c0967y.f3044b;
            float fIntBitsToFloat = 0.0f;
            float fIntBitsToFloat2 = 0.0f;
            for (int i12 = 0; i12 < i11; i12++) {
                fIntBitsToFloat2 += Float.intBitsToFloat((int) (jArr2[i12] >> 32));
            }
            int i13 = c0967y.f3044b;
            float f3 = fIntBitsToFloat2 / i13;
            long[] jArr3 = c0967y.f3043a;
            for (int i14 = 0; i14 < i13; i14++) {
                fIntBitsToFloat += Float.intBitsToFloat((int) (jArr3[i14] & 4294967295L));
            }
            abstractC2639p0.m6108v1(new C2674y((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat / c0967y.f3044b)) & 4294967295L), true));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m6049f(C3287b c3287b, C3287b c3287b2, C3286a c3286a, long j3) {
        if (this.f8358g == null) {
            this.f8358g = new C2571a(17);
        }
        this.f8363l = 0L;
        C2571a c2571aM6047d = m6047d();
        AbstractC2639p0 abstractC2639p0 = this.f8352a;
        AbstractC0063p.m409b(c2571aM6047d, c3287b, abstractC2639p0.f8618w, c3286a, this.f8361j, this.f8363l);
        long jM2041d = C0807b.m2041d(AbstractC0063p.m399I(c3287b2, abstractC2639p0.f8618w, c3286a), j3);
        if (((Boolean) abstractC2639p0.f8619x.invoke(new C3890d0(1))).booleanValue()) {
            this.f8359h = AbstractC5618k.m10166v(abstractC2639p0).mo8859P(0L);
            abstractC2639p0.m6108v1(new C2678z(jM2041d));
        }
        C0016a c0016a = this.f8362k;
        c0016a.f55h = 0;
        ((C0967y) c0016a.f56i).f3044b = 0;
    }
}
