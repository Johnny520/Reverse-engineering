package p000A;

import com.bumptech.glide.AbstractC1926h;
import p092S0.C1259L;
import p095T.C1357e;
import p095T.C1358e0;
import p095T.C1360f0;
import p095T.C1366i0;
import p117X2.AbstractC1678w;
import p204n0.C2684c;
import p227r.EnumC2983d0;

/* JADX INFO: renamed from: A.O0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0029O0 {

    /* JADX INFO: renamed from: g */
    public static final C0038T0 f141g;

    /* JADX INFO: renamed from: a */
    public final C1358e0 f142a;

    /* JADX INFO: renamed from: b */
    public final C1358e0 f143b = new C1358e0(0.0f);

    /* JADX INFO: renamed from: c */
    public final C1360f0 f144c = new C1360f0(0);

    /* JADX INFO: renamed from: d */
    public C2684c f145d = C2684c.f8557e;

    /* JADX INFO: renamed from: e */
    public long f146e = C1259L.f4536b;

    /* JADX INFO: renamed from: f */
    public final C1366i0 f147f;

    static {
        C0027N0 c0027n0 = new C0027N0(0);
        C0071l c0071l = new C0071l(8);
        C0002B c0002b = new C0002B(15, c0027n0);
        AbstractC1678w.m2998b(1, c0071l);
        f141g = new C0038T0(29, c0002b, c0071l);
    }

    public C0029O0(EnumC2983d0 enumC2983d0, float f2) {
        this.f142a = new C1358e0(f2);
        this.f147f = new C1366i0(enumC2983d0, C1357e.f4798j);
    }

    /* JADX INFO: renamed from: a */
    public final void m18a(EnumC2983d0 enumC2983d0, C2684c c2684c, int i5, int i6) {
        float f2 = i6 - i5;
        this.f143b.m2508h(f2);
        float f5 = c2684c.f8558a;
        float f6 = c2684c.f8559b;
        C2684c c2684c2 = this.f145d;
        float f7 = c2684c2.f8558a;
        C1358e0 c1358e0 = this.f142a;
        if (f5 != f7 || f6 != c2684c2.f8559b) {
            boolean z5 = enumC2983d0 == EnumC2983d0.f9447d;
            if (z5) {
                f5 = f6;
            }
            float f8 = z5 ? c2684c.f8561d : c2684c.f8560c;
            float fM2507g = c1358e0.m2507g();
            float f9 = i5;
            float f10 = fM2507g + f9;
            c1358e0.m2508h(c1358e0.m2507g() + ((f8 <= f10 && (f5 >= fM2507g || f8 - f5 <= f9)) ? (f5 >= fM2507g || f8 - f5 > f9) ? 0.0f : f5 - fM2507g : f8 - f10));
            this.f145d = c2684c;
        }
        c1358e0.m2508h(AbstractC1926h.m3567j(c1358e0.m2507g(), 0.0f, f2));
        this.f144c.m2510h(i5);
    }
}
