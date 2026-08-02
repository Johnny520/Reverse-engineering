package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class mw1 extends yh1 {
    public final lw1 a;
    public final cl b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public mw1(lw1 lw1Var, cl clVar) {
        this.a = lw1Var;
        this.b = clVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw1)) {
            return false;
        }
        mw1 mw1Var = (mw1) obj;
        if (!t11.l(this.a, mw1Var.a)) {
            return false;
        }
        rk rkVar = sn.n;
        return rkVar.equals(rkVar) && Float.compare(1.0f, 1.0f) == 0 && t11.l(this.b, mw1Var.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final th1 f() {
        rk rkVar = sn.n;
        nw1 nw1Var = new nw1();
        nw1Var.v = this.a;
        nw1Var.w = true;
        nw1Var.x = rkVar;
        nw1Var.y = i00.a;
        nw1Var.z = 1.0f;
        nw1Var.A = this.b;
        return nw1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final void g(th1 th1Var) {
        nw1 nw1Var = (nw1) th1Var;
        boolean z = nw1Var.w;
        lw1 lw1Var = this.a;
        boolean z2 = (z && gr2.a(nw1Var.v.d(), lw1Var.d())) ? false : true;
        nw1Var.v = lw1Var;
        nw1Var.w = true;
        nw1Var.x = sn.n;
        nw1Var.y = i00.a;
        nw1Var.z = 1.0f;
        nw1Var.A = this.b;
        if (z2) {
            gf1.A(nw1Var);
        }
        ci0.M(nw1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iC = vi0.c(1.0f, (i00.a.hashCode() + ((Float.hashCode(0.0f) + (Float.hashCode(0.0f) * 31) + hk1.d(this.a.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        cl clVar = this.b;
        return iC + (clVar == null ? 0 : clVar.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=true, alignment=" + sn.n + ", contentScale=" + i00.a + ", alpha=1.0, colorFilter=" + this.b + ')';
    }
}
