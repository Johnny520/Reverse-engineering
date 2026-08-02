package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class mw1 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final lw1 f6910a;

    /* JADX INFO: renamed from: b */
    public final C0095cl f6911b;

    public mw1(lw1 lw1Var, C0095cl c0095cl) {
        this.f6910a = lw1Var;
        this.f6911b = c0095cl;
    }

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
        if (!t11.m5086l(this.f6910a, mw1Var.f6910a)) {
            return false;
        }
        C0659rk c0659rk = C0700sn.f10226n;
        return c0659rk.equals(c0659rk) && Float.compare(1.0f, 1.0f) == 0 && t11.m5086l(this.f6911b, mw1Var.f6911b);
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        C0659rk c0659rk = C0700sn.f10226n;
        nw1 nw1Var = new nw1();
        nw1Var.f7350v = this.f6910a;
        nw1Var.f7351w = true;
        nw1Var.f7352x = c0659rk;
        nw1Var.f7353y = i00.f4201a;
        nw1Var.f7354z = 1.0f;
        nw1Var.f7349A = this.f6911b;
        return nw1Var;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        nw1 nw1Var = (nw1) th1Var;
        boolean z = nw1Var.f7351w;
        lw1 lw1Var = this.f6910a;
        boolean z2 = (z && gr2.m2019a(nw1Var.f7350v.mo2977d(), lw1Var.mo2977d())) ? false : true;
        nw1Var.f7350v = lw1Var;
        nw1Var.f7351w = true;
        nw1Var.f7352x = C0700sn.f10226n;
        nw1Var.f7353y = i00.f4201a;
        nw1Var.f7354z = 1.0f;
        nw1Var.f7349A = this.f6911b;
        if (z2) {
            gf1.m1853A(nw1Var);
        }
        ci0.m788M(nw1Var);
    }

    public final int hashCode() {
        int iM5684c = vi0.m5684c(1.0f, (i00.f4201a.hashCode() + ((Float.hashCode(0.0f) + (Float.hashCode(0.0f) * 31) + hk1.m2205d(this.f6910a.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        C0095cl c0095cl = this.f6911b;
        return iM5684c + (c0095cl == null ? 0 : c0095cl.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f6910a + ", sizeToIntrinsics=true, alignment=" + C0700sn.f10226n + ", contentScale=" + i00.f4201a + ", alpha=1.0, colorFilter=" + this.f6911b + ')';
    }
}
