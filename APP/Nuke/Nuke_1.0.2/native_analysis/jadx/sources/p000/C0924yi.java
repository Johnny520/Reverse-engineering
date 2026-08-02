package p000;

/* JADX INFO: renamed from: yi */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0924yi extends th1 {

    /* JADX INFO: renamed from: v */
    public g23 f13465v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C0963zi f13466w;

    public C0924yi(C0963zi c0963zi) {
        this.f13466w = c0963zi;
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: E0 */
    public final void mo212E0() {
        C0963zi c0963zi = this.f13466w;
        c0963zi.f13915a = this;
        if (c0963zi.f13916b != null) {
            m6280M0();
        }
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: F0 */
    public final void mo213F0() {
        C0963zi c0963zi = this.f13466w;
        if (c0963zi.f13915a == this) {
            c0963zi.f13915a = null;
        }
        g23 g23Var = this.f13465v;
        if (g23Var != null) {
            g23Var.m1790b();
        }
        this.f13465v = null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: M0 */
    public final void m6280M0() {
        C0115d2 c0115d2 = new C0115d2(4, this, this.f13466w);
        r61 r61VarM4933c0 = sp0.m4933c0(this);
        int i = r61VarM4933c0.f9385i;
        q62 rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) u61.m5471a(r61VarM4933c0)).getRectManager();
        h23 h23Var = rectManager.f8752c;
        h23Var.getClass();
        zj1 zj1Var = h23Var.f3801a;
        g23 g23Var = new g23(h23Var, i, this, c0115d2);
        Object objM6022b = zj1Var.m6022b(i);
        if (objM6022b == null) {
            zj1Var.m6421h(i, g23Var);
            objM6022b = g23Var;
        }
        g23 g23Var2 = (g23) objM6022b;
        if (g23Var2 != g23Var) {
            while (true) {
                g23 g23Var3 = g23Var2.f3288d;
                if (g23Var3 == null) {
                    break;
                } else {
                    g23Var2 = g23Var3;
                }
            }
            g23Var2.f3288d = g23Var;
        }
        if (sp0.m4933c0(this.f10757h).f9390n) {
            rectManager.f8751b.m1311t(i, true);
        }
        rectManager.f8754e = true;
        rectManager.m4066i();
        this.f13465v = g23Var;
    }
}
