package p174m;

import androidx.lifecycle.C0119x;
import gg.C1422r;
import p020b5.C0184c;
import p071f1.C1003g;
import p071f1.C1017n;
import p071f1.InterfaceC0998d0;
import p071f1.InterfaceC1031u;
import p085fg.InterfaceC1231l;
import p101h1.InterfaceC1567d;
import p116i.C1739c;
import p116i.C1760j;
import p116i.C1769m;
import p117i0.InterfaceC1809a1;
import p136j8.C2104o;
import p276sf.C3967n;
import p339x1.C5610h0;

/* JADX INFO: renamed from: m.e3 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2595e3 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f8405g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ float f8406h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f8407i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f8408j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2595e3(float f3, Object obj, Object obj2, int i9) {
        this.f8405g = i9;
        this.f8406h = f3;
        this.f8407i = obj;
        this.f8408j = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d6 A[PHI: r3
  0x00d6: PHI (r3v7 float) = (r3v4 float), (r3v11 float) binds: [B:27:0x00eb, B:20:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010f  */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        long jRound;
        float fFloatValue;
        float f3;
        switch (this.f8405g) {
            case 0:
                C2605g3 c2605g3 = (C2605g3) this.f8407i;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f8408j;
                long jLongValue = ((Long) obj).longValue();
                if (c2605g3.f8442b == Long.MIN_VALUE) {
                    c2605g3.f8442b = jLongValue;
                }
                float f10 = c2605g3.f8445e;
                C1769m c1769m = new C1769m(f10);
                float f11 = this.f8406h;
                C1769m c1769m2 = C2605g3.f8440f;
                if (f11 == 0.0f) {
                    jRound = c2605g3.f8441a.mo595b(new C1769m(f10), c1769m2, c2605g3.f8443c);
                } else {
                    double d10 = (jLongValue - c2605g3.f8442b) / f11;
                    if (Double.isNaN(d10)) {
                        C2104o.m5294t("Cannot round NaN value.");
                        return null;
                    }
                    jRound = Math.round(d10);
                }
                long j3 = jRound;
                float f12 = ((C1769m) c2605g3.f8441a.mo612w(j3, c1769m, c1769m2, c2605g3.f8443c)).f5910a;
                c2605g3.f8443c = (C1769m) c2605g3.f8441a.mo607n(j3, c1769m, c1769m2, c2605g3.f8443c);
                c2605g3.f8442b = jLongValue;
                float f13 = c2605g3.f8445e - f12;
                c2605g3.f8445e = f12;
                interfaceC1231l.invoke(Float.valueOf(f13));
                return C3967n.f12976a;
            case 1:
                C1422r c1422r = (C1422r) this.f8407i;
                C2621k2 c2621k2 = (C2621k2) this.f8408j;
                C1760j c1760j = (C1760j) obj;
                float f14 = this.f8406h;
                float f15 = 0.0f;
                if (f14 > 0.0f) {
                    fFloatValue = ((Number) c1760j.f5880e.getValue()).floatValue();
                    if (fFloatValue <= f14) {
                        f14 = fFloatValue;
                    }
                    f15 = f14;
                    f3 = f15 - c1422r.f4735g;
                    if (f3 == ((InterfaceC2660u1) c2621k2.f8531b).mo6077a(f3) || f15 != ((Number) c1760j.f5880e.getValue()).floatValue()) {
                        c1760j.m4409a();
                    }
                    c1422r.f4735g += f3;
                    break;
                } else {
                    if (f14 < 0.0f) {
                        fFloatValue = ((Number) c1760j.f5880e.getValue()).floatValue();
                        if (fFloatValue >= f14) {
                        }
                        f15 = f14;
                    }
                    f3 = f15 - c1422r.f4735g;
                    if (f3 == ((InterfaceC2660u1) c2621k2.f8531b).mo6077a(f3)) {
                        c1760j.m4409a();
                        c1422r.f4735g += f3;
                        break;
                    }
                }
                break;
            case 2:
                float f16 = this.f8406h;
                C1003g c1003g = (C1003g) this.f8407i;
                C1017n c1017n = (C1017n) this.f8408j;
                C5610h0 c5610h0 = (C5610h0) obj;
                c5610h0.m10064e();
                C0184c c0184c = c5610h0.f22833g.f5220h;
                long jM825v = c0184c.m825v();
                c0184c.m819p().mo2487e();
                try {
                    C0119x c0119x = (C0119x) c0184c.f469a;
                    c0119x.m598c0(f16, 0.0f);
                    InterfaceC1031u interfaceC1031uM819p = ((C0184c) c0119x.f310h).m819p();
                    int i9 = (int) 0;
                    interfaceC1031uM819p.mo2494m(Float.intBitsToFloat(i9), Float.intBitsToFloat(i9));
                    interfaceC1031uM819p.mo2495n();
                    interfaceC1031uM819p.mo2494m(-Float.intBitsToFloat(i9), -Float.intBitsToFloat(i9));
                    InterfaceC1567d.m4084U(c5610h0, c1003g, 0L, 0.0f, c1017n, 0, 46);
                } finally {
                    c0184c.m819p().mo2497p();
                    c0184c.m803U(jM825v);
                }
                break;
            default:
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f8407i;
                C1739c c1739c = (C1739c) this.f8408j;
                InterfaceC0998d0 interfaceC0998d0 = (InterfaceC0998d0) obj;
                interfaceC0998d0.getClass();
                interfaceC0998d0.mo2539g(((Number) c1739c.m4360d()).floatValue() * (((Number) interfaceC1809a1.getValue()).intValue() > 0 ? (interfaceC0998d0.mo1333d() * this.f8406h) + ((Number) interfaceC1809a1.getValue()).intValue() : 500.0f));
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C2595e3(Object obj, float f3, Object obj2, int i9) {
        this.f8405g = i9;
        this.f8407i = obj;
        this.f8406h = f3;
        this.f8408j = obj2;
    }
}
