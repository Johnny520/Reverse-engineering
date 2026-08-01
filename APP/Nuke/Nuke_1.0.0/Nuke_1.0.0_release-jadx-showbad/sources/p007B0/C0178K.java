package p007B0;

import p000A.AbstractC0070k0;
import p011B4.AbstractC0231b;
import p041H0.AbstractC0582a0;
import p041H0.C0603l;
import p117X2.AbstractC1665j;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: B0.K */
/* JADX INFO: loaded from: classes.dex */
public final class C0178K extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final C0603l f623a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0178K(C0603l c0603l) {
        this.f623a = c0603l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        return new C0179L(AbstractC0070k0.f303b, this.f623a);
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
        if (!(obj instanceof C0178K)) {
            return false;
        }
        C0178K c0178k = (C0178K) obj;
        C0187a c0187a = AbstractC0070k0.f303b;
        return c0187a.equals(c0187a) && AbstractC1665j.m2981a(this.f623a, c0178k.f623a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C0179L c0179l = (C0179L) abstractC2206o;
        C0187a c0187a = AbstractC0070k0.f303b;
        if (!AbstractC1665j.m2981a(c0179l.f676s, c0187a)) {
            c0179l.f676s = c0187a;
            if (c0179l.f677t) {
                c0179l.m297L0();
            }
        }
        c0179l.f675r = this.f623a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM395f = AbstractC0231b.m395f(1022 * 31, 31, false);
        C0603l c0603l = this.f623a;
        return iM395f + (c0603l != null ? c0603l.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + AbstractC0070k0.f303b + ", overrideDescendants=false, touchBoundsExpansion=" + this.f623a + ')';
    }
}
