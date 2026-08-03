package p004e;

import java.util.BitSet;
import p000a.AbstractC0001b;
import p009j.C0162m;
import p009j.C0164o;
import p009j.C0168s;
import p012m.C0198a;
import p013n.C0202d;

/* JADX INFO: renamed from: e.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0033j {

    /* JADX INFO: renamed from: a */
    private int f103a;

    /* JADX INFO: renamed from: b */
    private final C0035l f104b;

    /* JADX INFO: renamed from: c */
    private final C0168s f105c;

    /* JADX INFO: renamed from: d */
    private final C0164o f106d;

    public AbstractC0033j(C0035l c0035l, C0168s c0168s, C0164o c0164o) {
        if (c0035l == null) {
            throw new NullPointerException("opcode == null");
        }
        if (c0168s == null) {
            throw new NullPointerException("position == null");
        }
        if (c0164o == null) {
            throw new NullPointerException("registers == null");
        }
        this.f103a = -1;
        this.f104b = c0035l;
        this.f105c = c0168s;
        this.f106d = c0164o;
    }

    /* JADX INFO: renamed from: r */
    public static C0021E m131r(C0168s c0168s, C0162m c0162m, C0162m c0162m2) {
        boolean z = c0162m.m382g() == 1;
        boolean zM474l = c0162m.mo379c().m474l();
        int iM384i = c0162m.m384i();
        return new C0021E((c0162m2.m384i() | iM384i) < 16 ? zM474l ? AbstractC0036m.f212j : z ? AbstractC0036m.f194d : AbstractC0036m.f203g : iM384i < 256 ? zM474l ? AbstractC0036m.f215k : z ? AbstractC0036m.f197e : AbstractC0036m.f206h : zM474l ? AbstractC0036m.f218l : z ? AbstractC0036m.f200f : AbstractC0036m.f209i, c0168s, C0164o.m397I(c0162m, c0162m2));
    }

    /* JADX INFO: renamed from: a */
    protected abstract String mo84a();

    /* JADX INFO: renamed from: b */
    public abstract int mo91b();

    /* JADX INFO: renamed from: c */
    public String mo115c() {
        throw new UnsupportedOperationException("Not supported.");
    }

    /* JADX INFO: renamed from: d */
    public String mo116d() {
        throw new UnsupportedOperationException("Not supported.");
    }

    /* JADX INFO: renamed from: e */
    public final C0038o m132e(BitSet bitSet) {
        boolean z = bitSet.get(0);
        if (m142o()) {
            bitSet.set(0);
        }
        C0164o c0164oM399K = this.f106d.m399K(bitSet);
        if (m142o()) {
            bitSet.set(0, z);
        }
        if (c0164oM399K.m504B() == 0) {
            return null;
        }
        return new C0038o(this.f105c, c0164oM399K);
    }

    /* JADX INFO: renamed from: f */
    public final C0021E m133f(BitSet bitSet) {
        if (!m142o() || bitSet.get(0)) {
            return null;
        }
        C0162m c0162mP = this.f106d.m513p(0);
        return m131r(this.f105c, c0162mP, c0162mP.m390r(0));
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC0033j m134g(BitSet bitSet) {
        return mo86w(this.f106d.m400L(m142o(), bitSet));
    }

    /* JADX INFO: renamed from: h */
    public final int m135h() {
        int i2 = this.f103a;
        if (i2 >= 0) {
            return i2;
        }
        throw new RuntimeException("address not yet known");
    }

    /* JADX INFO: renamed from: i */
    public final AbstractC0033j m136i() {
        return mo86w(this.f106d.m400L(m142o(), null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0, types: [j.o, n.e] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.BitSet] */
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
    /* JADX INFO: renamed from: j */
    public final int m137j(BitSet bitSet) {
        ?? M142o = m142o();
        ?? r1 = this.f106d;
        int iM504B = r1.m504B();
        int iM382g = 0;
        int iM382g2 = (M142o == 0 || bitSet.get(0)) ? 0 : r1.m513p(0).m382g();
        while (M142o < iM504B) {
            if (!bitSet.get(M142o)) {
                iM382g = r1.m513p(M142o).m382g() + iM382g;
            }
            M142o++;
        }
        return Math.max(iM382g, iM382g2);
    }

    /* JADX INFO: renamed from: k */
    public final C0035l m138k() {
        return this.f104b;
    }

    /* JADX INFO: renamed from: l */
    public final C0168s m139l() {
        return this.f105c;
    }

    /* JADX INFO: renamed from: m */
    public final C0164o m140m() {
        return this.f106d;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m141n() {
        return this.f103a >= 0;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m142o() {
        return this.f104b.m157g();
    }

    /* JADX INFO: renamed from: p */
    public final String m143p() {
        int i2 = this.f103a;
        return i2 != -1 ? String.format("%04x", Integer.valueOf(i2)) : AbstractC0001b.m13s(System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: q */
    protected abstract String mo112q();

    /* JADX INFO: renamed from: s */
    public final void m144s(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("address < 0");
        }
        this.f103a = i2;
    }

    /* JADX INFO: renamed from: t */
    public AbstractC0033j m145t(C0198a c0198a) {
        C0164o c0164o = this.f106d;
        int iM504B = c0164o.m504B();
        C0164o c0164o2 = new C0164o(iM504B);
        for (int i2 = 0; i2 < iM504B; i2++) {
            c0164o2.m521x(i2, c0198a.m476b(c0164o.m513p(i2)));
        }
        c0164o2.m536g();
        if (!c0164o2.equals(c0164o)) {
            c0164o = c0164o2;
        }
        return mo86w(c0164o);
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder(100);
        sb.append(m143p());
        sb.append(' ');
        sb.append(this.f105c);
        sb.append(": ");
        sb.append(this.f104b.m153c());
        C0164o c0164o = this.f106d;
        if (c0164o.m504B() != 0) {
            sb.append(c0164o.m505C(" ", null));
            z = true;
        } else {
            z = false;
        }
        String strMo84a = mo84a();
        if (strMo84a != null) {
            if (z) {
                sb.append(',');
            }
            sb.append(' ');
            sb.append(strMo84a);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public abstract AbstractC0033j mo85u(C0035l c0035l);

    /* JADX INFO: renamed from: v */
    public abstract AbstractC0033j mo92v(int i2);

    /* JADX INFO: renamed from: w */
    public abstract AbstractC0033j mo86w(C0164o c0164o);

    /* JADX INFO: renamed from: x */
    public abstract void mo93x(C0202d c0202d);
}
