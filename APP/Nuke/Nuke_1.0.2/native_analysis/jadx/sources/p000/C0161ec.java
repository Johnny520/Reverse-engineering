package p000;

import android.graphics.Canvas;

/* JADX INFO: renamed from: ec */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0161ec extends w51 implements in0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f2384i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f2385j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f2386k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f2387l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0161ec(ab3 ab3Var, r61 r61Var, ab3 ab3Var2) {
        super(1);
        this.f2384i = 0;
        this.f2385j = ab3Var;
        this.f2387l = r61Var;
        this.f2386k = ab3Var2;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f2384i;
        a83 a83Var = a83.f116a;
        boolean zBooleanValue = false;
        m33Var = null;
        m33 m33Var = null;
        Object obj2 = this.f2387l;
        Object obj3 = this.f2386k;
        Object obj4 = this.f2385j;
        switch (i) {
            case 0:
                ab3 ab3Var = (ab3) obj4;
                r61 r61Var = (r61) obj2;
                ab3 ab3Var2 = (ab3) obj3;
                InterfaceC0627qp interfaceC0627qpM430q = ((nc0) obj).mo3274E().m430q();
                if (ab3Var.getView().getVisibility() != 8) {
                    ab3Var.f4530F = true;
                    zv1 zv1Var = r61Var.f9397u;
                    ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = zv1Var instanceof ViewTreeObserverOnGlobalLayoutListenerC0045b7 ? (ViewTreeObserverOnGlobalLayoutListenerC0045b7) zv1Var : null;
                    if (viewTreeObserverOnGlobalLayoutListenerC0045b7 != null) {
                        Canvas canvasM1806a = AbstractC0229g6.m1806a(interfaceC0627qpM430q);
                        viewTreeObserverOnGlobalLayoutListenerC0045b7.getAndroidViewsHandler$ui().getClass();
                        ab3Var2.draw(canvasM1806a);
                    }
                    ab3Var.f4530F = false;
                }
                return a83Var;
            case 1:
                d43 d43Var = (d43) obj;
                gb0 gb0Var = (gb0) d43Var;
                if (!((ViewOnDragListenerC0534o8) ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) sp0.m4939f0((gb0) obj3)).getDragAndDropManager()).f7577b.contains(gb0Var) || !AbstractC0691se.m4852w(gb0Var, AbstractC0731te.m5180I((C0485n4) obj2))) {
                    return c43.f1146h;
                }
                ((o72) obj4).f7574i = d43Var;
                return c43.f1148j;
            case 2:
                ca2 ca2Var = (ca2) obj;
                gu2 gu2Var = (gu2) obj3;
                gu2 gu2Var2 = (gu2) obj4;
                ca2Var.m719c(gu2Var2 != null ? ((Number) gu2Var2.getValue()).floatValue() : 1.0f);
                ca2Var.m726k(gu2Var != null ? ((Number) gu2Var.getValue()).floatValue() : 1.0f);
                ca2Var.m727l(gu2Var != null ? ((Number) gu2Var.getValue()).floatValue() : 1.0f);
                gu2 gu2Var3 = (gu2) obj2;
                ca2Var.m731r(gu2Var3 != null ? ((m33) gu2Var3.getValue()).f6466a : m33.f6464b);
                return a83Var;
            case 3:
                z33 z33Var = ((sf0) obj3).f10101a;
                ph0 ph0Var = (ph0) obj2;
                int iOrdinal = ((if0) obj).ordinal();
                if (iOrdinal == 0) {
                    cd2 cd2Var = z33Var.f13713b;
                    if (cd2Var != null) {
                        m33Var = new m33(cd2Var.f1489a);
                    } else {
                        cd2 cd2Var2 = ph0Var.f8350a.f13713b;
                        if (cd2Var2 != null) {
                            m33Var = new m33(cd2Var2.f1489a);
                        }
                    }
                } else if (iOrdinal == 1) {
                    m33Var = (m33) obj4;
                } else {
                    if (iOrdinal != 2) {
                        c80.m675s();
                        return null;
                    }
                    cd2 cd2Var3 = ph0Var.f8350a.f13713b;
                    if (cd2Var3 != null) {
                        m33Var = new m33(cd2Var3.f1489a);
                    } else {
                        cd2 cd2Var4 = z33Var.f13713b;
                        if (cd2Var4 != null) {
                            m33Var = new m33(cd2Var4.f1489a);
                        }
                    }
                }
                return new m33(m33Var != null ? m33Var.f6466a : m33.f6464b);
            default:
                pl0 pl0Var = (pl0) obj;
                if (!t11.m5086l(pl0Var, (pl0) obj4)) {
                    if (t11.m5086l(pl0Var, ((bl0) obj3).f926c)) {
                        C0676s.m4653l("Focus search landed at the root.");
                        return null;
                    }
                    zBooleanValue = ((Boolean) ((in0) obj2).mo5j(pl0Var)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0161ec(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.f2384i = i;
        this.f2385j = obj;
        this.f2386k = obj2;
        this.f2387l = obj3;
    }
}
