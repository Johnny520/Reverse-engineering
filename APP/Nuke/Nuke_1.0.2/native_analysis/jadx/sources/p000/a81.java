package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a81 implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f112h = 0;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ t81 f113i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f114j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f115k;

    public /* synthetic */ a81(int i, t81 t81Var, Object obj) {
        this.f113i = t81Var;
        this.f114j = i;
        this.f115k = obj;
    }

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
    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f112h;
        a83 a83Var = a83.f116a;
        Object obj3 = this.f115k;
        int i2 = this.f114j;
        t81 t81Var = this.f113i;
        InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.m1961R();
                } else {
                    t81Var.m5131a(i2, obj3, go0Var, 0);
                }
                break;
            default:
                num.getClass();
                t81Var.m5131a(i2, obj3, interfaceC0596px, pp0.m3902N(1));
                break;
        }
        return a83Var;
    }

    public /* synthetic */ a81(t81 t81Var, int i, Object obj, int i2) {
        this.f113i = t81Var;
        this.f114j = i;
        this.f115k = obj;
    }
}
