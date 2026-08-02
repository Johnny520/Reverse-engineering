package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cw2 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final db0 f1758a;

    public cw2(db0 db0Var) {
        this.f1758a = db0Var;
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
        if (!(obj instanceof cw2)) {
            return false;
        }
        cw2 cw2Var = (cw2) obj;
        C0270ha c0270ha = t11.f10488j;
        return c0270ha.equals(c0270ha) && t11.m5086l(this.f1758a, cw2Var.f1758a);
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        return new dw2(t11.f10488j, this.f1758a);
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        dw2 dw2Var = (dw2) th1Var;
        C0270ha c0270ha = t11.f10488j;
        if (!t11.m5086l(dw2Var.f12650w, c0270ha)) {
            dw2Var.f12650w = c0270ha;
            if (dw2Var.f12651x) {
                dw2Var.m5999O0();
            }
        }
        dw2Var.f12649v = this.f1758a;
    }

    public final int hashCode() {
        int iM2205d = hk1.m2205d(1022 * 31, 31, false);
        db0 db0Var = this.f1758a;
        return iM2205d + (db0Var != null ? db0Var.hashCode() : 0);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + t11.f10488j + ", overrideDescendants=false, touchBoundsExpansion=" + this.f1758a + ')';
    }
}
