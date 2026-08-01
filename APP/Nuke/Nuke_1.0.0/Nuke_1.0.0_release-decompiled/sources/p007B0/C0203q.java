package p007B0;

import p041H0.AbstractC0582a0;
import p117X2.AbstractC1665j;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: B0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0203q extends AbstractC0582a0 {
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        return new C0204r(AbstractC0208v.f709b, null);
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
        if (!(obj instanceof C0203q)) {
            return false;
        }
        C0187a c0187a = AbstractC0208v.f709b;
        return c0187a.equals(c0187a);
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C0204r c0204r = (C0204r) abstractC2206o;
        C0187a c0187a = AbstractC0208v.f709b;
        if (AbstractC1665j.m2981a(c0204r.f676s, c0187a)) {
            return;
        }
        c0204r.f676s = c0187a;
        if (c0204r.f677t) {
            c0204r.m297L0();
        }
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (1008 * 31);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + AbstractC0208v.f709b + ", overrideDescendants=false)";
    }
}
