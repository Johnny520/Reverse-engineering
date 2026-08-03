package p265s;

import p069f.C0965w;
import p090g2.C1293b;
import p090g2.C1295d;
import p090g2.C1296e;
import p174m.C2576b;
import p339x1.AbstractC5613i0;
import p339x1.AbstractC5618k;
import p339x1.C5602f0;
import p356y0.AbstractC5852n;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: s.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3821d extends AbstractC5852n {

    /* JADX INFO: renamed from: u */
    public C1295d f12530u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C3824e f12531v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3821d(C3824e c3824e) {
        this.f12531v = c3824e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: c1 */
    public final void mo1323c1() {
        C3824e c3824e = this.f12531v;
        c3824e.f12538a = this;
        if (c3824e.f12539b != null) {
            m8007k1();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: d1 */
    public final void mo743d1() {
        C3824e c3824e = this.f12531v;
        if (c3824e.f12538a == this) {
            c3824e.f12538a = null;
        }
        C1295d c1295d = this.f12530u;
        if (c1295d != null) {
            c1295d.m3441b();
        }
        this.f12530u = null;
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
    /* JADX INFO: renamed from: k1 */
    public final void m8007k1() {
        C2576b c2576b = new C2576b(this, 12, this.f12531v);
        C5602f0 c5602f0M10167w = AbstractC5618k.m10167w(this);
        int i9 = c5602f0M10167w.f22791h;
        C1293b rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5613i0.m10067a(c5602f0M10167w)).getRectManager();
        C1296e c1296e = rectManager.f4316c;
        c1296e.getClass();
        C0965w c0965w = c1296e.f4340a;
        C1295d c1295d = new C1295d(c1296e, i9, this, c2576b);
        Object objM2313b = c0965w.m2313b(i9);
        if (objM2313b == null) {
            c0965w.m2379h(i9, c1295d);
            objM2313b = c1295d;
        }
        C1295d c1295d2 = (C1295d) objM2313b;
        if (c1295d2 != c1295d) {
            while (true) {
                C1295d c1295d3 = c1295d2.f4335d;
                if (c1295d3 == null) {
                    break;
                } else {
                    c1295d2 = c1295d3;
                }
            }
            c1295d2.f4335d = c1295d;
        }
        if (AbstractC5618k.m10167w(this.f23788g).f22796m) {
            rectManager.f4315b.m348N(i9, true);
        }
        rectManager.f4318e = true;
        rectManager.m3439i();
        this.f12530u = c1295d;
    }
}
