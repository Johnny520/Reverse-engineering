package p095T;

import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p186k.C2408E;
import p186k.C2444z;

/* JADX INFO: renamed from: T.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1388t0 {

    /* JADX INFO: renamed from: a */
    public C1397y f4925a;

    /* JADX INFO: renamed from: b */
    public int f4926b;

    /* JADX INFO: renamed from: c */
    public C1349a f4927c;

    /* JADX INFO: renamed from: d */
    public InterfaceC1603e f4928d;

    /* JADX INFO: renamed from: e */
    public int f4929e;

    /* JADX INFO: renamed from: f */
    public C2444z f4930f;

    /* JADX INFO: renamed from: g */
    public C2408E f4931g;

    public C1388t0(C1397y c1397y) {
        this.f4925a = c1397y;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2640a(C1311F c1311f, C2408E c2408e) {
        AbstractC1665j.m2983c(c1311f, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        InterfaceC1334Q0 interfaceC1334Q0 = c1311f.f4683f;
        if (interfaceC1334Q0 == null) {
            interfaceC1334Q0 = C1357e.f4798j;
        }
        return !interfaceC1334Q0.mo2498a(c1311f.m2413h().f4678f, c2408e.m4272g(c1311f));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2641b() {
        if (this.f4925a != null) {
            C1349a c1349a = this.f4927c;
            if (c1349a != null ? c1349a.m2499a() : false) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final EnumC1331P m2642c(Object obj) {
        EnumC1331P enumC1331PM2665s;
        C1397y c1397y = this.f4925a;
        return (c1397y == null || (enumC1331PM2665s = c1397y.m2665s(this, obj)) == null) ? EnumC1331P.f4758d : enumC1331PM2665s;
    }

    /* JADX INFO: renamed from: d */
    public final void m2643d() {
        C1397y c1397y = this.f4925a;
        if (c1397y != null) {
            c1397y.f4969r = true;
            c1397y.f4974w.m69i();
        }
        this.f4925a = null;
        this.f4930f = null;
        this.f4931g = null;
        this.f4928d = null;
    }

    /* JADX INFO: renamed from: e */
    public final void m2644e(boolean z5) {
        int i5 = this.f4926b;
        this.f4926b = z5 ? i5 | 32 : i5 & (-33);
    }
}
