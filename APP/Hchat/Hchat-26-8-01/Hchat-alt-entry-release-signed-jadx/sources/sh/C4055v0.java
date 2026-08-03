package sh;

import mg.InterfaceC2842d;
import p072f2.AbstractC1049l;
import p072f2.AbstractC1058u;
import p072f2.AbstractC1060w;
import p072f2.C1038a;
import p072f2.C1045h;
import p072f2.C1061x;
import p072f2.InterfaceC1062y;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p129ig.AbstractC2043a;
import p172lg.C2561a;
import p174m.C2576b;
import p259r9.AbstractC3754e0;
import p276sf.C3967n;

/* JADX INFO: renamed from: sh.v0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4055v0 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f13408g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ float f13409h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2561a f13410i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f13411j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f13412k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4055v0(float f3, C2561a c2561a, int i9, InterfaceC1809a1 interfaceC1809a1) {
        this.f13409h = f3;
        this.f13410i = c2561a;
        this.f13411j = i9;
        this.f13412k = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        int i9 = this.f13408g;
        Object obj2 = this.f13412k;
        int i10 = this.f13411j;
        C2561a c2561a = this.f13410i;
        float f3 = this.f13409h;
        switch (i9) {
            case 0:
                float[] fArr = (float[]) obj2;
                float fM7907q = AbstractC3754e0.m7907q(((Float) obj).floatValue(), 0.0f, 1.0f);
                float f10 = c2561a.f8310a;
                float f11 = c2561a.f8311b;
                float fM3176C = AbstractC1184v0.m3176C(f10, f11, fM7907q);
                if (i10 > 0) {
                    int i11 = i10 + 1;
                    double d10 = f10;
                    fM3176C = (float) ((((((double) f11) - d10) * ((double) AbstractC3754e0.m7909r(AbstractC2043a.m5018X(fM7907q * i11), 0, i11))) / ((double) i11)) + d10);
                } else if (fArr.length != 0) {
                    float f12 = fArr[0];
                    float fAbs = Math.abs(f12 - fM7907q);
                    int length = fArr.length;
                    for (int i12 = 1; i12 < length; i12++) {
                        float f13 = fArr[i12];
                        float fAbs2 = Math.abs(f13 - fM7907q);
                        if (fAbs2 < fAbs) {
                            f12 = f13;
                            fAbs = fAbs2;
                        }
                    }
                    if (fAbs < f3) {
                        fM3176C = AbstractC1184v0.m3176C(f10, f11, f12);
                    }
                }
                return Float.valueOf(fM3176C);
            default:
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) obj2;
                InterfaceC1062y interfaceC1062y = (InterfaceC1062y) obj;
                interfaceC1062y.getClass();
                C1045h c1045h = new C1045h(f3, new C2561a(c2561a.f8310a, c2561a.f8311b), i10 > 0 ? i10 : 0);
                InterfaceC2842d[] interfaceC2842dArr = AbstractC1060w.f3404a;
                C1061x c1061x = AbstractC1058u.f3378c;
                InterfaceC2842d interfaceC2842d = AbstractC1060w.f3404a[1];
                interfaceC1062y.mo2644a(c1061x, c1045h);
                interfaceC1062y.mo2644a(AbstractC1049l.f3323i, new C1038a(null, new C2576b(c2561a, 16, interfaceC1809a1)));
                return C3967n.f12976a;
        }
    }

    public /* synthetic */ C4055v0(C2561a c2561a, int i9, float[] fArr, float f3) {
        this.f13410i = c2561a;
        this.f13411j = i9;
        this.f13412k = fArr;
        this.f13409h = f3;
    }
}
