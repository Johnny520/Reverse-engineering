package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class s70 implements zd0 {

    /* JADX INFO: renamed from: d */
    public final n70 f5664d;

    /* JADX INFO: renamed from: e */
    public final y41 f5665e;

    /* JADX INFO: renamed from: f */
    public final o70 f5666f;

    /* JADX INFO: renamed from: g */
    public final ug0 f5667g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s70(n70 n70Var, y41 y41Var) {
        this.f5664d = n70Var;
        this.f5665e = y41Var;
        this.f5666f = (o70) n70Var.f4202b.invoke();
        v20.m4386a();
        this.f5667g = new ug0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.zd0
    /* JADX INFO: renamed from: E */
    public final yd0 mo1278E(int i, int i2, Map map, InterfaceC0742sw interfaceC0742sw, InterfaceC0742sw interfaceC0742sw2) {
        return this.f5665e.mo1278E(i, i2, map, interfaceC0742sw, interfaceC0742sw2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: F */
    public final int mo641F(float f) {
        return this.f5665e.mo641F(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: M */
    public final long mo644M(long j) {
        return this.f5665e.mo644M(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: P */
    public final float mo645P(long j) {
        return this.f5665e.mo645P(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.zd0
    /* JADX INFO: renamed from: Q */
    public final yd0 mo1279Q(int i, int i2, Map map, InterfaceC0742sw interfaceC0742sw) {
        return this.f5665e.mo1279Q(i, i2, map, interfaceC0742sw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: Z */
    public final long mo647Z(float f) {
        return this.f5665e.mo647Z(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    /* JADX INFO: renamed from: a */
    public final List m4009a(int i) {
        ug0 ug0Var = this.f5667g;
        List list = (List) ug0Var.m4248b(i);
        if (list != null) {
            return list;
        }
        o70 o70Var = this.f5666f;
        Object objMo2793c = o70Var.mo2793c(i);
        List listMo1280w = this.f5665e.mo1280w(this.f5664d.m2634a(i, objMo2793c, o70Var.mo2794d(i)), objMo2793c);
        ug0Var.m4330i(i, listMo1280w);
        return listMo1280w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: b */
    public final float mo48b() {
        return this.f5665e.mo48b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: f0 */
    public final float mo652f0(int i) {
        return this.f5665e.mo652f0(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l30
    public final k50 getLayoutDirection() {
        return this.f5665e.getLayoutDirection();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: h */
    public final float mo49h() {
        return this.f5665e.mo49h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: i0 */
    public final float mo653i0(float f) {
        return this.f5665e.mo653i0(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l30
    /* JADX INFO: renamed from: m */
    public final boolean mo53m() {
        return this.f5665e.mo53m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: o */
    public final long mo187o(float f) {
        return this.f5665e.mo187o(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: p */
    public final float mo654p(float f) {
        return this.f5665e.mo654p(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: y */
    public final float mo188y(long j) {
        return this.f5665e.mo188y(j);
    }
}
