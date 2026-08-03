package p182m7;

import java.io.IOException;
import p047d7.C0719b;
import p089g1.C1275d;
import p136j8.C2104o;
import p166l7.C2522j;
import p209o7.AbstractC3071e;
import p229p7.C3332b;
import p241q7.C3445b;
import p379z7.C6107c;

/* JADX INFO: renamed from: m7.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2798k extends AbstractC3071e {

    /* JADX INFO: renamed from: m */
    public final C2809v f9053m;

    /* JADX INFO: renamed from: n */
    public final C2807t f9054n;

    /* JADX INFO: renamed from: o */
    public final C0719b f9055o;

    /* JADX INFO: renamed from: p */
    public final C2799l f9056p;

    /* JADX INFO: renamed from: q */
    public final C0719b f9057q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2798k() {
        super(5);
        C0719b c0719b = new C0719b(null, 1);
        C2809v c2809v = new C2809v(c0719b);
        this.f9053m = c2809v;
        C2799l c2799l = new C2799l();
        C2807t c2807t = new C2807t(c2799l);
        this.f9054n = c2807t;
        C0719b c0719b2 = new C0719b(null, 2);
        this.f9055o = c0719b2;
        this.f9056p = c2799l;
        this.f9057q = c0719b;
        m6540P(0, c2809v);
        m6540P(1, c2807t);
        m6540P(2, c0719b2);
        m6540P(3, c2799l);
        m6540P(4, c0719b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:37:0x00c5 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [d7.b, o7.b] */
    /* JADX WARN: Type inference failed for: r3v15, types: [d7.b, o7.b] */
    /* JADX WARN: Type inference failed for: r3v18, types: [d7.b, o7.b] */
    /* JADX WARN: Type inference failed for: r3v27, types: [d7.b, o7.b] */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.lang.Object, m7.v, o7.b] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v12, types: [m7.l] */
    /* JADX WARN: Type inference failed for: r5v13, types: [k7.a] */
    /* JADX WARN: Type inference failed for: r5v14, types: [k7.a, m7.x] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [l7.j] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, k7.a, m7.u] */
    /* JADX WARN: Type inference failed for: r5v2, types: [m7.m] */
    /* JADX WARN: Type inference failed for: r5v20, types: [m7.t] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v3, types: [k7.a, m7.q] */
    /* JADX WARN: Type inference failed for: r5v5, types: [m7.x] */
    /* JADX WARN: Type inference failed for: r5v6, types: [k7.a, m7.f] */
    /* JADX WARN: Type inference failed for: r5v7, types: [k7.a, m7.x] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [l7.j] */
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
    @Override // p152k7.AbstractC2333c, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public final void mo1893B(C3445b c3445b) throws IOException {
        boolean z9 = false;
        C6107c c6107c = new C6107c(0);
        boolean z10 = false;
        while (c3445b.m7227b()) {
            C3332b c3332bM7054T = C3332b.m7054T(c3445b);
            ?? c2797j = 0;
            c2797j = 0;
            c2797j = 0;
            if (!z9) {
                int iM7051Q = c3332bM7054T.m7051Q();
                if (iM7051Q == 7) {
                    c2797j = this.f9054n;
                    z9 = true;
                } else {
                    if (iM7051Q == 8) {
                        C2104o.m5285j(c3332bM7054T, "END element detected before START: ");
                        return;
                    }
                    if (iM7051Q == 5) {
                        ?? r32 = this.f9053m;
                        r32.getClass();
                        C2800m c2800m = new C2800m();
                        c2797j = new C2808u(c2800m);
                        C2800m c2800m2 = c2797j.f9076s;
                        if (c2800m2 != c2800m) {
                            C1275d.m3412f(c2797j, "Invalid start namespace: ");
                            return;
                        }
                        c2800m.f9058q = c2797j;
                        r32.mo6519M(c2797j);
                        r32.f9077n.mo6519M(c2800m);
                        c6107c.add(c2800m2);
                    } else if (iM7051Q == 6) {
                        c2797j = c6107c.isEmpty() ? 0 : (C2800m) c6107c.remove(c6107c.size() - 1);
                        if (c2797j == 0) {
                            c2797j = new C2522j(1);
                            z9 = true;
                            z10 = true;
                        }
                    } else {
                        if (iM7051Q != 9) {
                            C2104o.m5285j(c3332bM7054T, "Unexpected chunk: ");
                            return;
                        }
                        AbstractC2796i abstractC2796iM6194S = ((C2797j) m5554v(C2797j.class)).m6194S();
                        abstractC2796iM6194S.getClass();
                        c2797j = new C2811x(new C2810w(), 0);
                        abstractC2796iM6194S.mo6185R().mo6519M(c2797j);
                    }
                }
            } else if (!z10) {
                int iM7051Q2 = c3332bM7054T.m7051Q();
                if (iM7051Q2 == 8) {
                    c2797j = this.f9056p;
                    z10 = true;
                } else if (iM7051Q2 == 6) {
                    c2797j = c6107c.isEmpty() ? 0 : (C2800m) c6107c.remove(c6107c.size() - 1);
                    if (c2797j == 0) {
                        c2797j = new C2522j(1);
                    }
                } else if (iM7051Q2 == 7 || iM7051Q2 == 5) {
                    C2797j c2797j2 = (C2797j) m5554v(C2797j.class);
                    c2797j2.getClass();
                    c2797j = new C2797j(new C2798k());
                    c2797j2.mo6185R().mo6519M(c2797j);
                } else if (iM7051Q2 == 9) {
                    C2797j c2797j3 = (C2797j) m5554v(C2797j.class);
                    c2797j3.getClass();
                    c2797j = new C2811x(new C2810w(), 0);
                    c2797j3.mo6185R().mo6519M(c2797j);
                } else if (iM7051Q2 == 4) {
                    C2797j c2797j4 = (C2797j) m5554v(C2797j.class);
                    c2797j4.getClass();
                    c2797j = new C2793f();
                    c2797j4.mo6185R().mo6519M(c2797j);
                } else {
                    c2797j = ((C2797j) m5554v(C2797j.class)).m6195T(1);
                }
            } else if (!c6107c.isEmpty() && c3332bM7054T.m7051Q() == 6 && !c6107c.isEmpty()) {
                c2797j = (C2800m) c6107c.remove(c6107c.size() - 1);
            }
            if (c2797j == 0) {
                return;
            }
            c2797j.m5545G(c3445b);
            z10 = z10;
        }
    }
}
