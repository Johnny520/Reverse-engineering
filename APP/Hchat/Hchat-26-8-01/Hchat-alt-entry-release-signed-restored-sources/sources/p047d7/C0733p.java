package p047d7;

import p076f7.C1080a;
import p095g7.C1357a;
import p152k7.AbstractC2331a;
import p209o7.C3073g;
import p241q7.InterfaceC3444a;
import p257r7.C3716f;

/* JADX INFO: renamed from: d7.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0733p extends AbstractC0727j implements InterfaceC3444a {

    /* JADX INFO: renamed from: n */
    public final C3716f f2185n;

    /* JADX INFO: renamed from: o */
    public final C3073g f2186o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0733p() {
        super(2, true);
        C3716f c3716f = new C3716f(false);
        this.f2185n = c3716f;
        C3073g c3073g = new C3073g();
        this.f2186o = c3073g;
        m6539P(c3716f);
        m6539P(c3073g);
        c3716f.f7660j = this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public final C0732o m1925S() {
        int i9 = this.f2185n.f12083n;
        for (int i10 = 0; i10 < 7; i10++) {
            C0732o c0732o = C0732o.f2181p[i10];
            if (i9 == c0732o.f2183h) {
                return c0732o;
            }
        }
        return new C0732o(null, i9, 99);
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
    @Override // p241q7.InterfaceC3444a
    /* JADX INFO: renamed from: m */
    public final void mo1926m(AbstractC2331a abstractC2331a) {
        AbstractC0734q c1080a;
        if (abstractC2331a == this.f2185n) {
            C0732o c0732oM1925S = m1925S();
            C0732o c0732o = C0732o.f2175j;
            if (c0732oM1925S == c0732o) {
                c1080a = new C1357a(c0732o);
                c1080a.m6539P(new C0722e(1, false));
            } else {
                C0732o c0732o2 = C0732o.f2176k;
                if (c0732oM1925S == c0732o2) {
                    c1080a = new C1080a(c0732o2);
                } else {
                    C0732o c0732o3 = C0732o.f2177l;
                    if (c0732oM1925S == c0732o3) {
                        c1080a = new C1080a(c0732o3);
                    } else {
                        C0732o c0732o4 = C0732o.f2178m;
                        if (c0732oM1925S == c0732o4) {
                            c1080a = new C1080a(c0732o4);
                        } else {
                            C0732o c0732o5 = C0732o.f2179n;
                            c1080a = c0732oM1925S == c0732o5 ? new C1080a(c0732o5) : c0732oM1925S == C0732o.f2180o ? new C0735r() : new C0735r(c0732oM1925S);
                        }
                    }
                }
            }
            this.f2186o.m6541P(c1080a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p047d7.AbstractC0727j
    public final String toString() {
        return m1925S() + ", scheme: " + ((AbstractC0734q) this.f2186o.f9940k);
    }
}
