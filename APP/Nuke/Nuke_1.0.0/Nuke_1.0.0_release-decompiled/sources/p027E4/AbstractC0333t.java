package p027E4;

import p118X3.InterfaceC1694d;

/* JADX INFO: renamed from: E4.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0333t {

    /* JADX INFO: renamed from: a */
    public final C0305T f1054a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1694d f1055b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0327n f1056c;

    public AbstractC0333t(C0305T c0305t, InterfaceC1694d interfaceC1694d, InterfaceC0327n interfaceC0327n) {
        this.f1054a = c0305t;
        this.f1055b = interfaceC1694d;
        this.f1056c = interfaceC0327n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0125, code lost:
    
        throw p027E4.AbstractC0315b0.m542m(r28, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", r14);
     */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x090a A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p027E4.AbstractC0333t m553b(p014C1.C0240b r26, java.lang.Class r27, java.lang.reflect.Method r28) {
        /*
            Method dump skipped, instruction units count: 2855
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p027E4.AbstractC0333t.m553b(C1.b, java.lang.Class, java.lang.reflect.Method):E4.t");
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo552a(C0289C c0289c, Object[] objArr);
}
