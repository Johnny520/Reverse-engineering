package p006g;

import p000a.AbstractC0001b;
import p011l.C0194b;
import p011l.C0195c;
import p011l.InterfaceC0197e;
import p013n.AbstractC0203e;
import p013n.C0202d;

/* JADX INFO: renamed from: g.I */
/* JADX INFO: loaded from: classes.dex */
public final class C0086I extends AbstractC0080C {

    /* JADX INFO: renamed from: e */
    private final InterfaceC0197e f327e;

    public C0086I(C0194b c0194b) {
        super(4, (c0194b.m504B() * 2) + 4);
        this.f327e = c0194b;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // p006g.AbstractC0108s
    /* JADX INFO: renamed from: a */
    public final void mo242a(C0100k c0100k) {
        C0113x c0113xM307q = c0100k.m307q();
        InterfaceC0197e interfaceC0197e = this.f327e;
        int iM504B = ((AbstractC0203e) interfaceC0197e).m504B();
        for (int i2 = 0; i2 < iM504B; i2++) {
            c0113xM307q.m335x(interfaceC0197e.mo403b(i2));
        }
    }

    @Override // p006g.AbstractC0108s
    /* JADX INFO: renamed from: b */
    public final EnumC0109t mo243b() {
        return EnumC0109t.f415k;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // p006g.AbstractC0080C
    /* JADX INFO: renamed from: e */
    protected final int mo234e(AbstractC0080C abstractC0080C) {
        InterfaceC0197e interfaceC0197e = ((C0086I) abstractC0080C).f327e;
        C0194b c0194b = C0194b.f722c;
        InterfaceC0197e interfaceC0197e2 = this.f327e;
        int iM504B = ((AbstractC0203e) interfaceC0197e2).m504B();
        int iM504B2 = ((AbstractC0203e) interfaceC0197e).m504B();
        int iMin = Math.min(iM504B, iM504B2);
        for (int i2 = 0; i2 < iMin; i2++) {
            int iCompareTo = interfaceC0197e2.mo403b(i2).compareTo(interfaceC0197e.mo403b(i2));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (iM504B == iM504B2) {
            return 0;
        }
        return iM504B < iM504B2 ? -1 : 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final int hashCode() {
        C0194b c0194b = C0194b.f722c;
        InterfaceC0197e interfaceC0197e = this.f327e;
        int iM504B = ((AbstractC0203e) interfaceC0197e).m504B();
        int iHashCode = 0;
        for (int i2 = 0; i2 < iM504B; i2++) {
            iHashCode = (iHashCode * 31) + interfaceC0197e.mo403b(i2).hashCode();
        }
        return iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // p006g.AbstractC0080C
    /* JADX INFO: renamed from: l */
    protected final void mo241l(C0100k c0100k, C0202d c0202d) {
        C0113x c0113xM307q = c0100k.m307q();
        InterfaceC0197e interfaceC0197e = this.f327e;
        int iM504B = ((AbstractC0203e) interfaceC0197e).m504B();
        if (c0202d.m486d()) {
            c0202d.m484b(0, m237h() + " type_list");
            c0202d.m484b(4, "  size: ".concat(AbstractC0001b.m13s(iM504B)));
            for (int i2 = 0; i2 < iM504B; i2++) {
                C0195c c0195cMo403b = interfaceC0197e.mo403b(i2);
                c0202d.m484b(2, "  " + AbstractC0001b.m11q(c0113xM307q.m331t(c0195cMo403b)) + " // " + c0195cMo403b.mo107a());
            }
        }
        c0202d.m497q(iM504B);
        for (int i3 = 0; i3 < iM504B; i3++) {
            c0202d.m498r(c0113xM307q.m331t(interfaceC0197e.mo403b(i3)));
        }
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC0197e m254m() {
        return this.f327e;
    }
}
