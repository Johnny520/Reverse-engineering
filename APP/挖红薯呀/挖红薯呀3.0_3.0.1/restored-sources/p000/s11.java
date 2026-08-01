package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s11 {

    /* JADX INFO: renamed from: a */
    public static final C0701rt f5620a = new C0701rt(EnumC0062bo.f550e);

    /* JADX INFO: renamed from: b */
    public static final C0701rt f5621b;

    /* JADX INFO: renamed from: c */
    public static final re1 f5622c;

    /* JADX INFO: renamed from: d */
    public static final re1 f5623d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0062bo enumC0062bo = EnumC0062bo.f551f;
        f5621b = new C0701rt(enumC0062bo);
        C0276ha c0276ha = C0496n2.f4149i;
        f5622c = new re1(enumC0062bo, new C0956ya(12, c0276ha), c0276ha);
        C0276ha c0276ha2 = C0496n2.f4145e;
        f5623d = new re1(enumC0062bo, new C0956ya(12, c0276ha2), c0276ha2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final pe0 m3998a(pe0 pe0Var, float f, float f2) {
        return pe0Var.mo2499c(new sa1(f, f2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final pe0 m3999b(pe0 pe0Var, float f) {
        return pe0Var.mo2499c(new r11(0.0f, f, 0.0f, f, 5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final pe0 m4000c(pe0 pe0Var, float f) {
        return pe0Var.mo2499c(new r11(f, f, f, f, true));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static pe0 m4001d(pe0 pe0Var) {
        return pe0Var.mo2499c(new r11(280.0f, Float.NaN, 560.0f, Float.NaN, true));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final pe0 m4002e(float f) {
        return new r11(f, 0.0f, f, 0.0f, 10);
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
    /* JADX INFO: renamed from: f */
    public static pe0 m4003f(pe0 pe0Var) {
        re1 re1Var;
        C0276ha c0276ha = C0496n2.f4149i;
        if (c0276ha.equals(c0276ha)) {
            re1Var = f5622c;
        } else if (c0276ha.equals(C0496n2.f4145e)) {
            re1Var = f5623d;
        } else {
            re1Var = new re1(EnumC0062bo.f551f, new C0956ya(12, c0276ha), c0276ha);
        }
        return pe0Var.mo2499c(re1Var);
    }
}
