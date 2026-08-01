package p163l;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p117i.AbstractC3071m;
import p117i.AbstractC3075o;

/* JADX INFO: renamed from: l.x3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4386x3 implements InterfaceC4356r3 {

    /* JADX INFO: renamed from: a */
    public final AbstractC3071m f12833a;

    /* JADX INFO: renamed from: b */
    public final AbstractC3075o f12834b;

    /* JADX INFO: renamed from: c */
    public final int f12835c;

    /* JADX INFO: renamed from: d */
    public final int f12836d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC4288e0 f12837e;

    /* JADX INFO: renamed from: f */
    public final int f12838f;

    /* JADX INFO: renamed from: g */
    public int[] f12839g;

    /* JADX INFO: renamed from: h */
    public float[] f12840h;

    /* JADX INFO: renamed from: i */
    public AbstractC4357s f12841i;

    /* JADX INFO: renamed from: j */
    public AbstractC4357s f12842j;

    /* JADX INFO: renamed from: k */
    public AbstractC4357s f12843k;

    /* JADX INFO: renamed from: l */
    public AbstractC4357s f12844l;

    /* JADX INFO: renamed from: m */
    public float[] f12845m;

    /* JADX INFO: renamed from: n */
    public float[] f12846n;

    /* JADX INFO: renamed from: o */
    public C4377w f12847o;

    public C4386x3(AbstractC3071m abstractC3071m, AbstractC3075o abstractC3075o, int i10, int i11, InterfaceC4288e0 interfaceC4288e0, int i12) {
        this.f12833a = abstractC3071m;
        this.f12834b = abstractC3075o;
        this.f12835c = i10;
        this.f12836d = i11;
        this.f12837e = interfaceC4288e0;
        this.f12838f = i12;
        this.f12839g = AbstractC4346p3.f12703a;
        this.f12840h = AbstractC4346p3.f12704b;
        this.f12845m = AbstractC4346p3.f12704b;
        this.f12846n = AbstractC4346p3.f12704b;
        this.f12847o = AbstractC4346p3.f12705c;
    }

    @Override // p163l.InterfaceC4341o3
    /* JADX INFO: renamed from: d */
    public AbstractC4357s mo16779d(long j10, AbstractC4357s abstractC4357s, AbstractC4357s abstractC4357s2, AbstractC4357s abstractC4357s3) {
        AbstractC4357s abstractC4357sM17155c;
        AbstractC4357s abstractC4357sM17155c2;
        int iM17055e = (int) AbstractC4346p3.m17055e(this, j10 / 1000000);
        C4381w3 c4381w3 = (C4381w3) this.f12834b.m11449b(iM17055e);
        if (c4381w3 != null) {
            return c4381w3.m17155c();
        }
        if (iM17055e >= mo16782g()) {
            return abstractC4357s2;
        }
        if (iM17055e <= 0) {
            return abstractC4357s;
        }
        m17163k(abstractC4357s, abstractC4357s2, abstractC4357s3);
        AbstractC4357s abstractC4357s4 = this.f12841i;
        abstractC4357s4.getClass();
        int i10 = 0;
        if (this.f12847o != AbstractC4346p3.f12705c) {
            float fM17161i = m17161i(iM17055e);
            float[] fArr = this.f12845m;
            this.f12847o.m17137a(fM17161i, fArr);
            int length = fArr.length;
            while (i10 < length) {
                abstractC4357s4.mo17036e(i10, fArr[i10]);
                i10++;
            }
            return abstractC4357s4;
        }
        int iM17160h = m17160h(iM17055e);
        float fM17162j = m17162j(iM17160h, iM17055e, true);
        C4381w3 c4381w32 = (C4381w3) this.f12834b.m11449b(this.f12833a.m11417e(iM17160h));
        if (c4381w32 != null && (abstractC4357sM17155c2 = c4381w32.m17155c()) != null) {
            abstractC4357s = abstractC4357sM17155c2;
        }
        C4381w3 c4381w33 = (C4381w3) this.f12834b.m11449b(this.f12833a.m11417e(iM17160h + 1));
        if (c4381w33 != null && (abstractC4357sM17155c = c4381w33.m17155c()) != null) {
            abstractC4357s2 = abstractC4357sM17155c;
        }
        int iMo17033b = abstractC4357s4.mo17033b();
        while (i10 < iMo17033b) {
            abstractC4357s4.mo17036e(i10, (abstractC4357s.mo17032a(i10) * (1 - fM17162j)) + (abstractC4357s2.mo17032a(i10) * fM17162j));
            i10++;
        }
        return abstractC4357s4;
    }

    @Override // p163l.InterfaceC4341o3
    /* JADX INFO: renamed from: e */
    public AbstractC4357s mo16780e(long j10, AbstractC4357s abstractC4357s, AbstractC4357s abstractC4357s2, AbstractC4357s abstractC4357s3) {
        long jM17055e = AbstractC4346p3.m17055e(this, j10 / 1000000);
        if (jM17055e < 0) {
            return abstractC4357s3;
        }
        m17163k(abstractC4357s, abstractC4357s2, abstractC4357s3);
        AbstractC4357s abstractC4357s4 = this.f12842j;
        abstractC4357s4.getClass();
        int i10 = 0;
        if (this.f12847o != AbstractC4346p3.f12705c) {
            float fM17161i = m17161i((int) jM17055e);
            float[] fArr = this.f12846n;
            this.f12847o.m17138b(fM17161i, fArr);
            int length = fArr.length;
            while (i10 < length) {
                abstractC4357s4.mo17036e(i10, fArr[i10]);
                i10++;
            }
        } else {
            AbstractC4357s abstractC4357sM17057g = AbstractC4346p3.m17057g(this, jM17055e - 1, abstractC4357s, abstractC4357s2, abstractC4357s3);
            AbstractC4357s abstractC4357sM17057g2 = AbstractC4346p3.m17057g(this, jM17055e, abstractC4357s, abstractC4357s2, abstractC4357s3);
            int iMo17033b = abstractC4357sM17057g.mo17033b();
            while (i10 < iMo17033b) {
                abstractC4357s4.mo17036e(i10, (abstractC4357sM17057g.mo17032a(i10) - abstractC4357sM17057g2.mo17032a(i10)) * 1000.0f);
                i10++;
            }
        }
        return abstractC4357s4;
    }

    @Override // p163l.InterfaceC4356r3
    /* JADX INFO: renamed from: f */
    public int mo16781f() {
        return this.f12836d;
    }

    @Override // p163l.InterfaceC4356r3
    /* JADX INFO: renamed from: g */
    public int mo16782g() {
        return this.f12835c;
    }

    /* JADX INFO: renamed from: h */
    public final int m17160h(int i10) {
        int iM11412b = AbstractC3071m.m11412b(this.f12833a, i10, 0, 0, 6, null);
        return iM11412b < -1 ? -(iM11412b + 2) : iM11412b;
    }

    /* JADX INFO: renamed from: i */
    public final float m17161i(int i10) {
        return m17162j(m17160h(i10), i10, false);
    }

    /* JADX INFO: renamed from: j */
    public final float m17162j(int i10, int i11, boolean z10) {
        InterfaceC4288e0 interfaceC4288e0M17154b;
        float f10;
        AbstractC3071m abstractC3071m = this.f12833a;
        if (i10 >= abstractC3071m.f8151b - 1) {
            f10 = i11;
        } else {
            int iM11417e = abstractC3071m.m11417e(i10);
            int iM11417e2 = this.f12833a.m11417e(i10 + 1);
            if (i11 == iM11417e) {
                f10 = iM11417e;
            } else {
                int i12 = iM11417e2 - iM11417e;
                C4381w3 c4381w3 = (C4381w3) this.f12834b.m11449b(iM11417e);
                if (c4381w3 == null || (interfaceC4288e0M17154b = c4381w3.m17154b()) == null) {
                    interfaceC4288e0M17154b = this.f12837e;
                }
                float f11 = i12;
                float fMo16839a = interfaceC4288e0M17154b.mo16839a((i11 - iM11417e) / f11);
                if (z10) {
                    return fMo16839a;
                }
                f10 = (f11 * fMo16839a) + iM11417e;
            }
        }
        return f10 / 1000;
    }

    /* JADX INFO: renamed from: k */
    public final void m17163k(AbstractC4357s abstractC4357s, AbstractC4357s abstractC4357s2, AbstractC4357s abstractC4357s3) {
        float[] fArr;
        boolean z10 = this.f12847o != AbstractC4346p3.f12705c;
        if (this.f12841i == null) {
            this.f12841i = AbstractC4362t.m17121g(abstractC4357s);
            this.f12842j = AbstractC4362t.m17121g(abstractC4357s3);
            int i10 = this.f12833a.f8151b;
            float[] fArr2 = new float[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                fArr2[i11] = this.f12833a.m11417e(i11) / 1000;
            }
            this.f12840h = fArr2;
            int i12 = this.f12833a.f8151b;
            int[] iArr = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                C4381w3 c4381w3 = (C4381w3) this.f12834b.m11449b(this.f12833a.m11417e(i13));
                int iM17153a = c4381w3 != null ? c4381w3.m17153a() : this.f12838f;
                if (!AbstractC4372v.m17126c(iM17153a, AbstractC4372v.f12793a.m17129a())) {
                    z10 = true;
                }
                iArr[i13] = iM17153a;
            }
            this.f12839g = iArr;
        }
        if (z10) {
            if (this.f12847o != AbstractC4346p3.f12705c && AbstractC1061t.m3842c(this.f12843k, abstractC4357s) && AbstractC1061t.m3842c(this.f12844l, abstractC4357s2)) {
                return;
            }
            this.f12843k = abstractC4357s;
            this.f12844l = abstractC4357s2;
            int iMo17033b = (abstractC4357s.mo17033b() % 2) + abstractC4357s.mo17033b();
            this.f12845m = new float[iMo17033b];
            this.f12846n = new float[iMo17033b];
            int i14 = this.f12833a.f8151b;
            float[][] fArr3 = new float[i14][];
            for (int i15 = 0; i15 < i14; i15++) {
                int iM11417e = this.f12833a.m11417e(i15);
                C4381w3 c4381w32 = (C4381w3) this.f12834b.m11449b(iM11417e);
                if (iM11417e == 0 && c4381w32 == null) {
                    fArr = new float[iMo17033b];
                    for (int i16 = 0; i16 < iMo17033b; i16++) {
                        fArr[i16] = abstractC4357s.mo17032a(i16);
                    }
                } else if (iM11417e == mo16782g() && c4381w32 == null) {
                    fArr = new float[iMo17033b];
                    for (int i17 = 0; i17 < iMo17033b; i17++) {
                        fArr[i17] = abstractC4357s2.mo17032a(i17);
                    }
                } else {
                    c4381w32.getClass();
                    AbstractC4357s abstractC4357sM17155c = c4381w32.m17155c();
                    float[] fArr4 = new float[iMo17033b];
                    for (int i18 = 0; i18 < iMo17033b; i18++) {
                        fArr4[i18] = abstractC4357sM17155c.mo17032a(i18);
                    }
                    fArr = fArr4;
                }
                fArr3[i15] = fArr;
            }
            this.f12847o = new C4377w(this.f12839g, this.f12840h, fArr3);
        }
    }

    public /* synthetic */ C4386x3(AbstractC3071m abstractC3071m, AbstractC3075o abstractC3075o, int i10, int i11, InterfaceC4288e0 interfaceC4288e0, int i12, AbstractC1043k abstractC1043k) {
        this(abstractC3071m, abstractC3075o, i10, i11, interfaceC4288e0, i12);
    }
}
