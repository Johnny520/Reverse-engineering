package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yi extends th1 {
    public g23 v;
    public final /* synthetic */ zi w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yi(zi ziVar) {
        this.w = ziVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void E0() {
        zi ziVar = this.w;
        ziVar.a = this;
        if (ziVar.b != null) {
            M0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void F0() {
        zi ziVar = this.w;
        if (ziVar.a == this) {
            ziVar.a = null;
        }
        g23 g23Var = this.v;
        if (g23Var != null) {
            g23Var.b();
        }
        this.v = null;
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
    public final void M0() {
        d2 d2Var = new d2(4, this, this.w);
        r61 r61VarC0 = sp0.c0(this);
        int i = r61VarC0.i;
        q62 rectManager = ((b7) u61.a(r61VarC0)).getRectManager();
        h23 h23Var = rectManager.c;
        h23Var.getClass();
        zj1 zj1Var = h23Var.a;
        g23 g23Var = new g23(h23Var, i, this, d2Var);
        Object objB = zj1Var.b(i);
        if (objB == null) {
            zj1Var.h(i, g23Var);
            objB = g23Var;
        }
        g23 g23Var2 = (g23) objB;
        if (g23Var2 != g23Var) {
            while (true) {
                g23 g23Var3 = g23Var2.d;
                if (g23Var3 == null) {
                    break;
                } else {
                    g23Var2 = g23Var3;
                }
            }
            g23Var2.d = g23Var;
        }
        if (sp0.c0(this.h).n) {
            rectManager.b.t(i, true);
        }
        rectManager.e = true;
        rectManager.i();
        this.v = g23Var;
    }
}
