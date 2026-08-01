package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g21 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1845d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ float f1846e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ wt0 f1847f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ny0 f1848g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC0742sw f1849h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ g21(float f, wt0 wt0Var, ny0 ny0Var, InterfaceC0742sw interfaceC0742sw, int i) {
        this.f1845d = i;
        this.f1846e = f;
        this.f1847f = wt0Var;
        this.f1848g = ny0Var;
        this.f1849h = interfaceC0742sw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        float fMo1511a;
        int i = this.f1845d;
        na1 na1Var = na1.f4229a;
        InterfaceC0742sw interfaceC0742sw = this.f1849h;
        ny0 ny0Var = this.f1848g;
        wt0 wt0Var = this.f1847f;
        float f = this.f1846e;
        C0793u7 c0793u7 = (C0793u7) obj;
        switch (i) {
            case 0:
                float fAbs = Math.abs(((Number) c0793u7.f6150e.getValue()).floatValue());
                float fAbs2 = Math.abs(f);
                gp0 gp0Var = c0793u7.f6150e;
                if (fAbs < fAbs2) {
                    j50.m1656f(c0793u7, ny0Var, interfaceC0742sw, ((Number) gp0Var.getValue()).floatValue() - wt0Var.f7189d);
                    wt0Var.f7189d = ((Number) gp0Var.getValue()).floatValue();
                } else {
                    float fM1660j = j50.m1660j(((Number) gp0Var.getValue()).floatValue(), f);
                    j50.m1656f(c0793u7, ny0Var, interfaceC0742sw, fM1660j - wt0Var.f7189d);
                    c0793u7.m4285a();
                    wt0Var.f7189d = fM1660j;
                }
                break;
            default:
                float fM1660j2 = j50.m1660j(((Number) c0793u7.f6150e.getValue()).floatValue(), f);
                float f2 = fM1660j2 - wt0Var.f7189d;
                try {
                    fMo1511a = ny0Var.mo1511a(f2);
                } catch (CancellationException unused) {
                    c0793u7.m4285a();
                    fMo1511a = 0.0f;
                }
                interfaceC0742sw.invoke(Float.valueOf(fMo1511a));
                if (Math.abs(f2 - fMo1511a) > 0.5f || fM1660j2 != ((Number) c0793u7.f6150e.getValue()).floatValue()) {
                    c0793u7.m4285a();
                }
                wt0Var.f7189d += fMo1511a;
                break;
        }
        return na1Var;
    }
}
