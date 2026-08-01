package p000;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class x71 {

    /* JADX INFO: renamed from: a */
    private static final C0429lf f7279a;

    /* JADX INFO: renamed from: b */
    private static final C0429lf f7280b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        long jM1305d = C0281hf.m1305d();
        long jM1310i = C0281hf.m1310i();
        long jM1306e = C0281hf.m1306e();
        long jM1310i2 = C0281hf.m1310i();
        long jM1307f = C0281hf.m1307f();
        long jM1310i3 = C0281hf.m1310i();
        long jM1308g = C0281hf.m1308g();
        long jM1309h = C0281hf.m1309h();
        long jM1312k = C0281hf.m1312k();
        long jM1310i4 = C0281hf.m1310i();
        long jM1313l = C0281hf.m1313l();
        long jM1311j = C0281hf.m1311j();
        g41 g41Var = AbstractC0510nf.f4248a;
        f7279a = new C0429lf(jM1305d, jM1310i, jM1306e, jM1310i2, AbstractC0244gf.f1945d, jM1307f, jM1310i3, AbstractC0244gf.f1963v, AbstractC0244gf.f1951j, AbstractC0244gf.f1938F, AbstractC0244gf.f1954m, AbstractC0244gf.f1939G, AbstractC0244gf.f1955n, jM1308g, jM1309h, jM1312k, jM1310i4, jM1313l, jM1311j, jM1305d, AbstractC0244gf.f1946e, AbstractC0244gf.f1944c, AbstractC0244gf.f1942a, AbstractC0244gf.f1947f, AbstractC0244gf.f1943b, AbstractC0244gf.f1948g, AbstractC0244gf.f1958q, AbstractC0244gf.f1959r, AbstractC0244gf.f1962u, AbstractC0244gf.f1966y, AbstractC0244gf.f1937E, AbstractC0244gf.f1967z, AbstractC0244gf.f1933A, AbstractC0244gf.f1934B, AbstractC0244gf.f1935C, AbstractC0244gf.f1936D, AbstractC0244gf.f1960s, AbstractC0244gf.f1961t, AbstractC0244gf.f1949h, AbstractC0244gf.f1950i, AbstractC0244gf.f1964w, AbstractC0244gf.f1965x, AbstractC0244gf.f1952k, AbstractC0244gf.f1953l, AbstractC0244gf.f1940H, AbstractC0244gf.f1941I, AbstractC0244gf.f1956o, AbstractC0244gf.f1957p);
        f7280b = AbstractC0510nf.m2699e(C0281hf.m1305d(), C0281hf.m1316o(), C0281hf.m1307f(), C0281hf.m1316o(), C0281hf.m1306e(), C0281hf.m1316o(), C0281hf.m1314m(), C0281hf.m1315n(), C0281hf.m1318q(), C0281hf.m1316o(), C0281hf.m1319r(), C0281hf.m1317p(), -516208);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c9  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5092c(final boolean z, InterfaceC0904ww interfaceC0904ww, InterfaceC0356ji interfaceC0356ji, int i, int i2) {
        int i3;
        InterfaceC0904ww interfaceC0904ww2;
        final View view;
        interfaceC0904ww.getClass();
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(1807873992);
        if ((i & 6) == 0) {
            i3 = (((i2 & 1) == 0 && c0616pi.m3106g(z)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c0616pi.m3108h(interfaceC0904ww) ? 32 : 16;
        }
        boolean z2 = true;
        if (c0616pi.m3082O(i3 & 1, (i3 & 19) != 18)) {
            c0616pi.m3087T();
            if ((i & 1) == 0 || c0616pi.m3128y()) {
                if ((i2 & 1) != 0) {
                    z = (((Configuration) c0616pi.m3112j(AbstractC0676r4.f5290a)).uiMode & 48) == 32;
                    i3 &= -15;
                }
                c0616pi.m3120q();
                final C0429lf c0429lf = !z ? f7279a : f7280b;
                view = (View) c0616pi.m3112j(AbstractC0676r4.f5294e);
                if (view.isInEditMode()) {
                    c0616pi.m3090W(-515538959);
                    boolean zM3108h = c0616pi.m3108h(view) | c0616pi.m3104f(c0429lf);
                    if ((((i3 & 14) ^ 6) <= 4 || !c0616pi.m3106g(z)) && (i3 & 6) != 4) {
                        z2 = false;
                    }
                    boolean z3 = zM3108h | z2;
                    Object objM3080L = c0616pi.m3080L();
                    if (z3 || objM3080L == C0320ii.f2572a) {
                        objM3080L = new InterfaceC0298hw() { // from class: w71
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p000.InterfaceC0298hw
                            public final Object invoke() {
                                return x71.m5093d(view, c0429lf, z);
                            }
                        };
                        c0616pi.m3107g0(objM3080L);
                    }
                    s91.m4040e((InterfaceC0298hw) objM3080L, c0616pi);
                } else {
                    c0616pi.m3090W(-517202822);
                }
                c0616pi.m3119p(false);
                interfaceC0904ww2 = interfaceC0904ww;
                qd0.m3214b(c0429lf, null, t91.m4193a(), interfaceC0904ww2, c0616pi, ((i3 << 6) & 7168) | 384);
            } else {
                c0616pi.m3085R();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                c0616pi.m3120q();
                if (!z) {
                }
                view = (View) c0616pi.m3112j(AbstractC0676r4.f5294e);
                if (view.isInEditMode()) {
                }
                c0616pi.m3119p(false);
                interfaceC0904ww2 = interfaceC0904ww;
                qd0.m3214b(c0429lf, null, t91.m4193a(), interfaceC0904ww2, c0616pi, ((i3 << 6) & 7168) | 384);
            }
        } else {
            interfaceC0904ww2 = interfaceC0904ww;
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new vc0(z, interfaceC0904ww2, i, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final na1 m5093d(View view, C0429lf c0429lf, boolean z) {
        Context context = view.getContext();
        context.getClass();
        Window window = ((Activity) context).getWindow();
        window.setStatusBarColor(p30.m2987W(c0429lf.f3465n));
        (Build.VERSION.SDK_INT >= 35 ? new ce1(window) : new C0111d(window)).mo511r(!z);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final na1 m5094e(boolean z, InterfaceC0904ww interfaceC0904ww, int i, int i2, InterfaceC0356ji interfaceC0356ji, int i3) {
        m5092c(z, interfaceC0904ww, interfaceC0356ji, j50.m1649A(i | 1), i2);
        return na1.f4229a;
    }
}
