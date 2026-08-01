package p000;

/* JADX INFO: renamed from: n9 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0503n9 extends oe0 {

    /* JADX INFO: renamed from: r */
    public d81 f4209r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ C0542o9 f4210s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0503n9(C0542o9 c0542o9) {
        this.f4210s = c0542o9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: o0 */
    public final void mo656o0() {
        C0542o9 c0542o9 = this.f4210s;
        c0542o9.f4487a = this;
        if (c0542o9.f4488b != null) {
            m2637w0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: p0 */
    public final void mo657p0() {
        C0542o9 c0542o9 = this.f4210s;
        if (c0542o9.f4487a == this) {
            c0542o9.f4487a = null;
        }
        d81 d81Var = this.f4209r;
        if (d81Var != null) {
            d81Var.m662b();
        }
        this.f4209r = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    /* JADX INFO: renamed from: w0 */
    public final void m2637w0() {
        C0073c c0073c = new C0073c(1, this, this.f4210s);
        b60 b60VarM3039Q = pf1.m3039Q(this);
        int i = b60VarM3039Q.f406e;
        ut0 rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) e60.m789a(b60VarM3039Q)).getRectManager();
        e81 e81Var = rectManager.f6298b;
        e81Var.getClass();
        ug0 ug0Var = e81Var.f1343a;
        d81 d81Var = new d81(e81Var, i, this, c0073c);
        Object objM4248b = ug0Var.m4248b(i);
        if (objM4248b == null) {
            ug0Var.m4330i(i, d81Var);
            objM4248b = d81Var;
        }
        d81 d81Var2 = (d81) objM4248b;
        if (d81Var2 != d81Var) {
            while (true) {
                d81 d81Var3 = d81Var2.f998d;
                if (d81Var3 == null) {
                    break;
                } else {
                    d81Var2 = d81Var3;
                }
            }
            d81Var2.f998d = d81Var;
        }
        if (pf1.m3039Q(this.f4529d).f412k) {
            rectManager.f6297a.m4254f(i, true);
        }
        rectManager.f6300d = true;
        rectManager.m4354j();
        this.f4209r = d81Var;
    }
}
