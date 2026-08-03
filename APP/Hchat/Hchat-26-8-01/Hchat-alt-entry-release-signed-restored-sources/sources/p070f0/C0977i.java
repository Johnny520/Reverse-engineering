package p070f0;

import android.view.autofill.AutofillValue;
import mg.InterfaceC2842d;
import p000a.AbstractC0000a;
import p020b5.C0192k;
import p041d1.C0676v;
import p072f2.AbstractC1049l;
import p072f2.AbstractC1058u;
import p072f2.AbstractC1060w;
import p072f2.C1038a;
import p072f2.C1061x;
import p072f2.InterfaceC1062y;
import p100h0.C1511d1;
import p119i2.AbstractC1923e0;
import p119i2.C1926g;
import p119i2.C1939m0;
import p190n2.C2865a;
import p190n2.C2869d;
import p190n2.C2874i;
import p190n2.C2875j;
import p190n2.C2884s;
import p190n2.C2890y;
import p190n2.C2891z;
import p276sf.C3967n;
import p321w.C4629q0;
import p321w.C4642w;
import p339x1.AbstractC5615j;
import p339x1.InterfaceC5665z1;
import p373z0.C6065e;
import p373z0.C6066f;
import p373z0.C6071k;
import p373z0.C6072l;
import p373z0.InterfaceC6073m;

/* JADX INFO: renamed from: f0.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0977i extends AbstractC5615j implements InterfaceC5665z1 {

    /* JADX INFO: renamed from: A */
    public C0192k f3080A;

    /* JADX INFO: renamed from: B */
    public C1511d1 f3081B;

    /* JADX INFO: renamed from: C */
    public C2875j f3082C;

    /* JADX INFO: renamed from: D */
    public C0676v f3083D;

    /* JADX INFO: renamed from: w */
    public C2891z f3084w;

    /* JADX INFO: renamed from: x */
    public C2884s f3085x;

    /* JADX INFO: renamed from: y */
    public C4629q0 f3086y;

    /* JADX INFO: renamed from: z */
    public boolean f3087z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n1 */
    public static void m2405n1(C4629q0 c4629q0, String str, boolean z9) {
        if (z9) {
            C2890y c2890y = c4629q0.f15330e;
            C4642w c4642w = c4629q0.f15347v;
            if (c2890y == null) {
                int length = str.length();
                c4642w.invoke(new C2884s(4, str, AbstractC1923e0.m4784b(length, length)));
            } else {
                C2884s c2884sM634l = c4629q0.f15329d.m634l(AbstractC0000a.m101y0(new C2869d(), new C2865a(str, 1)));
                c2890y.m6292a(null, c2884sM634l);
                c4642w.invoke(c2884sM634l);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5665z1
    /* JADX INFO: renamed from: S0 */
    public final boolean mo1609S0() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5665z1
    /* JADX INFO: renamed from: X0 */
    public final void mo1610X0(InterfaceC1062y interfaceC1062y) {
        C1926g c1926g = this.f3085x.f9316a;
        InterfaceC2842d[] interfaceC2842dArr = AbstractC1060w.f3404a;
        C1061x c1061x = AbstractC1058u.f3364E;
        InterfaceC2842d[] interfaceC2842dArr2 = AbstractC1060w.f3404a;
        InterfaceC2842d interfaceC2842d = interfaceC2842dArr2[18];
        interfaceC1062y.mo2644a(c1061x, c1926g);
        C1926g c1926g2 = this.f3084w.f9345a;
        C1061x c1061x2 = AbstractC1058u.f3365F;
        InterfaceC2842d interfaceC2842d2 = interfaceC2842dArr2[19];
        interfaceC1062y.mo2644a(c1061x2, c1926g2);
        long j3 = this.f3085x.f9317b;
        C1061x c1061x3 = AbstractC1058u.f3366G;
        InterfaceC2842d interfaceC2842d3 = interfaceC2842dArr2[20];
        interfaceC1062y.mo2644a(c1061x3, new C1939m0(j3));
        C1061x c1061x4 = AbstractC1058u.f3393r;
        InterfaceC2842d interfaceC2842d4 = interfaceC2842dArr2[9];
        interfaceC1062y.mo2644a(c1061x4, C6071k.f24550a);
        C6066f c6066f = new C6066f(AutofillValue.forText(this.f3085x.f9316a));
        C1061x c1061x5 = AbstractC1058u.f3394s;
        InterfaceC2842d interfaceC2842d5 = interfaceC2842dArr2[10];
        interfaceC1062y.mo2644a(c1061x5, c6066f);
        AbstractC1060w.m2679b(interfaceC1062y, new C0975g(this, 0));
        int i9 = this.f3082C.f9296d;
        if (i9 == 6) {
            InterfaceC6073m.f24556a.getClass();
            C6065e c6065e = C6072l.f24554c;
            C1061x c1061x6 = AbstractC1058u.f3392q;
            InterfaceC2842d interfaceC2842d6 = interfaceC2842dArr2[8];
            interfaceC1062y.mo2644a(c1061x6, c6065e);
        } else if (i9 == 7 || i9 == 8) {
            InterfaceC6073m.f24556a.getClass();
            C6065e c6065e2 = C6072l.f24553b;
            C1061x c1061x7 = AbstractC1058u.f3392q;
            InterfaceC2842d interfaceC2842d7 = interfaceC2842dArr2[8];
            interfaceC1062y.mo2644a(c1061x7, c6065e2);
        } else if (i9 == 4) {
            InterfaceC6073m.f24556a.getClass();
            C6065e c6065e3 = C6072l.f24555d;
            C1061x c1061x8 = AbstractC1058u.f3392q;
            InterfaceC2842d interfaceC2842d8 = interfaceC2842dArr2[8];
            interfaceC1062y.mo2644a(c1061x8, c6065e3);
        }
        if (!this.f3087z) {
            interfaceC1062y.mo2644a(AbstractC1058u.f3385j, C3967n.f12976a);
        }
        boolean z9 = this.f3087z;
        C1061x c1061x9 = AbstractC1058u.f3373N;
        InterfaceC2842d interfaceC2842d9 = interfaceC2842dArr2[28];
        interfaceC1062y.mo2644a(c1061x9, Boolean.valueOf(z9));
        AbstractC1060w.m2678a(interfaceC1062y, new C0975g(this, 1));
        int i10 = 2;
        if (z9) {
            interfaceC1062y.mo2644a(AbstractC1049l.f3325k, new C1038a(null, new C0975g(this, i10)));
            interfaceC1062y.mo2644a(AbstractC1049l.f3329o, new C1038a(null, new C0975g(this, interfaceC1062y)));
        }
        interfaceC1062y.mo2644a(AbstractC1049l.f3324j, new C1038a(null, new C0976h(this, 0)));
        int i11 = this.f3082C.f9297e;
        C0974f c0974f = new C0974f(this, 6);
        interfaceC1062y.mo2644a(AbstractC1058u.f3367H, new C2874i(i11));
        interfaceC1062y.mo2644a(AbstractC1049l.f3330p, new C1038a(null, c0974f));
        interfaceC1062y.mo2644a(AbstractC1049l.f3316b, new C1038a(null, new C0974f(this, 7)));
        interfaceC1062y.mo2644a(AbstractC1049l.f3317c, new C1038a(null, new C0974f(this, 1)));
        if (!C1939m0.m4813c(this.f3085x.f9317b)) {
            interfaceC1062y.mo2644a(AbstractC1049l.f3331q, new C1038a(null, new C0974f(this, 2)));
            if (this.f3087z) {
                interfaceC1062y.mo2644a(AbstractC1049l.f3332r, new C1038a(null, new C0974f(this, 3)));
            }
        }
        if (this.f3087z) {
            interfaceC1062y.mo2644a(AbstractC1049l.f3333s, new C1038a(null, new C0974f(this, 5)));
        }
    }
}
