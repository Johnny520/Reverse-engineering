package p267s1;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p321w.AbstractC4634s;
import p339x1.AbstractC5658x0;
import p339x1.C5621l;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: s1.e0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3892e0 extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final C5621l f12763a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3892e0(C5621l c5621l) {
        this.f12763a = c5621l;
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
        if (!(obj instanceof C3892e0)) {
            return false;
        }
        C3892e0 c3892e0 = (C3892e0) obj;
        C3883a c3883a = AbstractC4634s.f15371e;
        return c3883a.equals(c3883a) && AbstractC1416l.m3825a(this.f12763a, c3892e0.f12763a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        return new C3894f0(AbstractC4634s.f15371e, this.f12763a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C3894f0 c3894f0 = (C3894f0) abstractC5852n;
        C3883a c3883a = AbstractC4634s.f15371e;
        if (!AbstractC1416l.m3825a(c3894f0.f12765v, c3883a)) {
            c3894f0.f12765v = c3883a;
            if (c3894f0.f12766w) {
                c3894f0.m8082m1();
            }
        }
        c3894f0.f12764u = this.f12763a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2245h = AbstractC0921a.m2245h(1022 * 31, 31, false);
        C5621l c5621l = this.f12763a;
        return iM2245h + (c5621l != null ? c5621l.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + AbstractC4634s.f15371e + ", overrideDescendants=false, touchBoundsExpansion=" + this.f12763a + ')';
    }
}
