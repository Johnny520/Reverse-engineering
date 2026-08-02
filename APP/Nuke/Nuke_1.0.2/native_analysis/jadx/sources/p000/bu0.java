package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bu0 extends yh1 {
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
        if ((obj instanceof bu0 ? (bu0) obj : null) == null) {
            return false;
        }
        C0583pk c0583pk = C0700sn.f10234v;
        return c0583pk.equals(c0583pk);
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        C0583pk c0583pk = C0700sn.f10234v;
        cu0 cu0Var = new cu0();
        cu0Var.f1736v = c0583pk;
        return cu0Var;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        ((cu0) th1Var).f1736v = C0700sn.f10234v;
    }

    public final int hashCode() {
        return Float.hashCode(0.0f);
    }
}
