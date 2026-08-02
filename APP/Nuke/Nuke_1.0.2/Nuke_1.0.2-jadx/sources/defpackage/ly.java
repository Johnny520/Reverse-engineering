package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ly {
    public static final tu2 a = new tu2(q7.w);
    public static final tu2 b = new tu2(q7.x);
    public static final tu2 c = new tu2(q7.z);
    public static final tu2 d = new tu2(q7.y);
    public static final tu2 e = new tu2(q7.B);
    public static final tu2 f = new tu2(q7.A);
    public static final tu2 g = new tu2(q7.H);
    public static final tu2 h = new tu2(q7.D);
    public static final tu2 i = new tu2(q7.E);
    public static final tu2 j = new tu2(q7.G);
    public static final tu2 k = new tu2(q7.F);
    public static final tu2 l = new tu2(q7.I);
    public static final tu2 m = new tu2(q7.J);
    public static final tu2 n = new tu2(q7.K);
    public static final tu2 o = new tu2(q7.M);
    public static final tu2 p;
    public static final tu2 q;
    public static final tu2 r;
    public static final tu2 s;
    public static final tu2 t;
    public static final tu2 u;
    public static final tu2 v;
    public static final my w;
    public static final tu2 x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        p7.C(new dy(1));
        p = new tu2(jy.l);
        q = new tu2(jy.k);
        r = new tu2(jy.m);
        s = new tu2(jy.n);
        t = new tu2(jy.o);
        u = new tu2(jy.p);
        v = new tu2(q7.L);
        w = new my(jy.j);
        x = new tu2(q7.C);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(zv1 zv1Var, z8 z8Var, mn0 mn0Var, px pxVar, int i2) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(1925803616);
        int i3 = i2 | (go0Var.f(zv1Var) ? 4 : 2) | (go0Var.f(z8Var) ? 32 : 16) | (go0Var.h(mn0Var) ? 256 : 128);
        if (go0Var.O(i3 & 1, (i3 & 147) != 146)) {
            b7 b7Var = (b7) zv1Var;
            f42 f42VarA = a.a(b7Var.m4getAccessibilityManager());
            f42 f42VarA2 = b.a(b7Var.getAutofill());
            f42 f42VarA3 = d.a(b7Var.getAutofillManager());
            f42 f42VarA4 = c.a(b7Var.getAutofillTree());
            f42 f42VarA5 = e.a(b7Var.m6getClipboardManager());
            f42 f42VarA6 = f.a(b7Var.m5getClipboard());
            f42 f42VarA7 = h.a(b7Var.getDensity());
            f42 f42VarA8 = i.a(b7Var.getFocusOwner());
            f42 f42VarA9 = j.a(b7Var.getFontLoader());
            f42VarA9.f = false;
            f42 f42VarA10 = k.a(b7Var.getFontFamilyResolver());
            f42VarA10.f = false;
            ci0.b(new f42[]{f42VarA, f42VarA2, f42VarA3, f42VarA4, f42VarA5, f42VarA6, f42VarA7, f42VarA8, f42VarA9, f42VarA10, l.a(b7Var.getHapticFeedBack()), m.a(b7Var.getInputModeManager()), n.a(b7Var.getLayoutDirection()), p.a(b7Var.getTextInputService()), q.a(b7Var.getSoftwareKeyboardController()), r.a(b7Var.getTextToolbar()), s.a(z8Var), t.a(b7Var.getViewConfiguration()), u.a(b7Var.getWindowInfo()), v.a(b7Var.getPointerIconService()), g.a(b7Var.getGraphicsContext()), ec1.a.a(b7Var.getRetainedValuesStore()), o.a(b7Var.getLocaleList())}, mn0Var, go0Var, ((i3 >> 3) & 112) | 8);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new ky(zv1Var, z8Var, mn0Var, i2, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
