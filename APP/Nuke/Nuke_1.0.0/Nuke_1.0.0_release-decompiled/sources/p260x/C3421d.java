package p260x;

import p000A.C0010F;
import p041H0.AbstractC0567L;
import p041H0.AbstractC0601k;
import p041H0.C0564I;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p082Q0.C1168b;
import p082Q0.C1170d;
import p082Q0.C1171e;
import p169h0.AbstractC2206o;
import p186k.C2439u;

/* JADX INFO: renamed from: x.d */
/* JADX INFO: loaded from: classes.dex */
public final class C3421d extends AbstractC2206o {

    /* JADX INFO: renamed from: r */
    public C1170d f10700r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ C3422e f10701s;

    public C3421d(C3422e c3422e) {
        this.f10701s = c3422e;
    }

    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: B0 */
    public final void mo143B0() {
        C3422e c3422e = this.f10701s;
        c3422e.f10702a = this;
        if (c3422e.f10703b != null) {
            m5687J0();
        }
    }

    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: C0 */
    public final void mo144C0() {
        C3422e c3422e = this.f10701s;
        if (c3422e.f10702a == this) {
            c3422e.f10702a = null;
        }
        C1170d c1170d = this.f10700r;
        if (c1170d != null) {
            c1170d.m2215b();
        }
        this.f10700r = null;
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
    /* JADX INFO: renamed from: J0 */
    public final void m5687J0() {
        C0010F c0010f = new C0010F(24, this, this.f10701s);
        C0564I c0564iM1044t = AbstractC0601k.m1044t(this);
        int i5 = c0564iM1044t.f1712e;
        C1168b rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0567L.m866a(c0564iM1044t)).getRectManager();
        C1171e c1171e = rectManager.f3821b;
        c1171e.getClass();
        C2439u c2439u = c1171e.f3845a;
        C1170d c1170d = new C1170d(c1171e, i5, this, c0010f);
        Object objM4318b = c2439u.m4318b(i5);
        if (objM4318b == null) {
            c2439u.m4344h(i5, c1170d);
            objM4318b = c1170d;
        }
        C1170d c1170d2 = (C1170d) objM4318b;
        if (c1170d2 != c1170d) {
            while (true) {
                C1170d c1170d3 = c1170d2.f3840d;
                if (c1170d3 == null) {
                    break;
                } else {
                    c1170d2 = c1170d3;
                }
            }
            c1170d2.f3840d = c1170d;
        }
        if (AbstractC0601k.m1044t(this.f7186d).f1718k) {
            rectManager.f3820a.m1354t(i5, true);
        }
        rectManager.f3823d = true;
        rectManager.m2213i();
        this.f10700r = c1170d;
    }
}
