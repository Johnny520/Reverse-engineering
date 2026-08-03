package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.output.AbstractC0203e;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.data.C0194b;
import fun.box001.internal.dexformat.writer.data.C0195c;
import fun.box001.internal.dexformat.writer.data.InterfaceC0197e;

/* JADX INFO: renamed from: g.I */
/* JADX INFO: loaded from: classes.dex */
public final class C0086I extends AbstractC0080C {

    /* JADX INFO: renamed from: e */
    private final InterfaceC0197e f327e;

    public C0086I(C0194b r3) {
        super(4, (r3.m504B() * 2) + 4);
        this.f327e = r3;
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
    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: a */
    public final void mo242a(C0100k r5) {
        C0113x r52 = r5.m307q();
        InterfaceC0197e r0 = this.f327e;
        int r1 = ((AbstractC0203e) r0).m504B();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        r52.m335x(r0.mo403b(r2));
        r2 = r2 + 1;
        goto L3
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
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
    @Override // fun.box001.internal.dexformat.instructions.AbstractC0080C
    /* JADX INFO: renamed from: e */
    protected final int mo234e(AbstractC0080C r9) {
        InterfaceC0197e r92 = ((C0086I) r9).f327e;
        C0194b r0 = C0194b.f722c;
        InterfaceC0197e r02 = this.f327e;
        int r1 = ((AbstractC0203e) r02).m504B();
        int r2 = ((AbstractC0203e) r92).m504B();
        int r3 = Math.min(r1, r2);
        int r5 = 0;
    L3:
        if (r5 >= r3) goto L8;
        int r6 = r02.mo403b(r5).m467b(r92.mo403b(r5));
        if (r6 != 0) goto L16;
        r5 = r5 + 1;
        goto L3
    L16:
        return r6;
    L8:
        if (r1 == r2) goto L18;
        if (r1 >= r2) goto L12;
        return -1;
    L12:
        return 1;
    L18:
        return 0;
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
        C0194b r0 = C0194b.f722c;
        InterfaceC0197e r02 = this.f327e;
        int r1 = ((AbstractC0203e) r02).m504B();
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r1) goto L5;
        r3 = (r3 * 31) + r02.mo403b(r2).hashCode();
        r2 = r2 + 1;
        goto L3
    L5:
        return r3;
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
    @Override // fun.box001.internal.dexformat.instructions.AbstractC0080C
    /* JADX INFO: renamed from: l */
    protected final void mo241l(C0100k r9, C0202d r10) {
        C0113x r92 = r9.m307q();
        InterfaceC0197e r0 = this.f327e;
        int r1 = ((AbstractC0203e) r0).m504B();
        int r3 = 0;
        if (r10.m486d() == false) goto L7;
        r10.m484b(0, m237h() + " type_list");
        r10.m484b(4, "  size: ".concat(RuntimeDexGenerator.m13s(r1)));
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L7;
        C0195c r4 = r0.mo403b(r2);
        r10.m484b(2, "  " + RuntimeDexGenerator.m11q(r92.m331t(r4)) + " // " + r4.mo107a());
        r2 = r2 + 1;
    L7:
        r10.m497q(r1);
    L8:
        if (r3 >= r1) goto L10;
        r10.m498r(r92.m331t(r0.mo403b(r3)));
        r3 = r3 + 1;
        goto L8
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC0197e m254m() {
        return this.f327e;
    }
}
