package p154k5;

import bsh.C1193i2;
import bsh.C1259t2;
import java.util.BitSet;
import okhttp3.internal.url._UrlKt;
import p239q5.C6267r;
import p239q5.C6268s;
import p239q5.C6274y;
import p280t5.AbstractC8125p;
import p309v5.AbstractC8826h;
import p309v5.C8838t;
import p309v5.InterfaceC8819a;
import p376zd.C9987e;

/* JADX INFO: renamed from: k5.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3976j {

    /* JADX INFO: renamed from: a */
    public int f11481a;

    /* JADX INFO: renamed from: b */
    public final C3978l f11482b;

    /* JADX INFO: renamed from: c */
    public final C6274y f11483c;

    /* JADX INFO: renamed from: d */
    public final C6268s f11484d;

    public AbstractC3976j(C3978l c3978l, C6274y c6274y, C6268s c6268s) {
        if (c3978l == null) {
            C1259t2.m5095a("opcode == null");
            throw null;
        }
        if (c6274y == null) {
            C1259t2.m5095a("position == null");
            throw null;
        }
        if (c6268s == null) {
            C1259t2.m5095a("registers == null");
            throw null;
        }
        this.f11481a = -1;
        this.f11482b = c3978l;
        this.f11483c = c6274y;
        this.f11484d = c6268s;
    }

    /* JADX INFO: renamed from: t */
    public static C3963b0 m15768t(C6274y c6274y, C6267r c6267r, C6267r c6267r2) {
        boolean z10 = c6267r.m24751n() == 1;
        boolean zM28411E = c6267r.getType().m28411E();
        int iM24754t = c6267r.m24754t();
        return new C3963b0((c6267r2.m24754t() | iM24754t) < 16 ? zM28411E ? AbstractC3979m.f11640j : z10 ? AbstractC3979m.f11610d : AbstractC3979m.f11625g : iM24754t < 256 ? zM28411E ? AbstractC3979m.f11645k : z10 ? AbstractC3979m.f11615e : AbstractC3979m.f11630h : zM28411E ? AbstractC3979m.f11650l : z10 ? AbstractC3979m.f11620f : AbstractC3979m.f11635i, c6274y, C6268s.m24768K(c6267r, c6267r2));
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo15678a();

    /* JADX INFO: renamed from: b */
    public abstract int mo15679b();

    /* JADX INFO: renamed from: c */
    public String mo15755c() {
        throw new UnsupportedOperationException("Not supported.");
    }

    /* JADX INFO: renamed from: d */
    public String mo15756d() {
        throw new UnsupportedOperationException("Not supported.");
    }

    /* JADX INFO: renamed from: e */
    public AbstractC3976j m15769e(BitSet bitSet) {
        C6268s c6268s = this.f11484d;
        boolean z10 = bitSet.get(0);
        if (m15780p()) {
            bitSet.set(0);
        }
        C6268s c6268sM24773M = c6268s.m24773M(bitSet);
        if (m15780p()) {
            bitSet.set(0, z10);
        }
        if (c6268sM24773M.size() == 0) {
            return null;
        }
        return new C3981o(this.f11483c, c6268sM24773M);
    }

    /* JADX INFO: renamed from: f */
    public AbstractC3976j m15770f(BitSet bitSet) {
        if (!m15780p() || bitSet.get(0)) {
            return null;
        }
        C6267r c6267rM24769G = this.f11484d.m24769G(0);
        return m15768t(this.f11483c, c6267rM24769G, c6267rM24769G.m24745J(0));
    }

    /* JADX INFO: renamed from: g */
    public AbstractC3976j m15771g(BitSet bitSet) {
        return mo15681y(this.f11484d.m24774N(0, m15780p(), bitSet));
    }

    /* JADX INFO: renamed from: h */
    public final int m15772h() {
        int i10 = this.f11481a;
        if (i10 >= 0) {
            return i10;
        }
        C1193i2.m4438a("address not yet known");
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public AbstractC3976j m15773i() {
        return mo15681y(this.f11484d.m24774N(0, m15780p(), null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [q5.s] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.BitSet] */
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
    public final int m15774j(BitSet bitSet) {
        ?? M15780p = m15780p();
        int size = this.f11484d.size();
        int iM24751n = 0;
        int iM24751n2 = (M15780p == 0 || bitSet.get(0)) ? 0 : this.f11484d.m24769G(0).m24751n();
        while (M15780p < size) {
            if (!bitSet.get(M15780p)) {
                iM24751n += this.f11484d.m24769G(M15780p).m24751n();
            }
            M15780p++;
        }
        return Math.max(iM24751n, iM24751n2);
    }

    /* JADX INFO: renamed from: k */
    public final int m15775k() {
        return m15772h() + mo15679b();
    }

    /* JADX INFO: renamed from: l */
    public final C3978l m15776l() {
        return this.f11482b;
    }

    /* JADX INFO: renamed from: m */
    public final C6274y m15777m() {
        return this.f11483c;
    }

    /* JADX INFO: renamed from: n */
    public final C6268s m15778n() {
        return this.f11484d;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m15779o() {
        return this.f11481a >= 0;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m15780p() {
        return this.f11482b.m15798g();
    }

    /* JADX INFO: renamed from: q */
    public final String m15781q() {
        int i10 = this.f11481a;
        return i10 != -1 ? String.format("%04x", Integer.valueOf(i10)) : AbstractC8826h.m33901j(System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: r */
    public final String m15782r(String str, int i10, boolean z10) {
        String strMo15680s = mo15680s(z10);
        if (strMo15680s == null) {
            return null;
        }
        String str2 = str + m15781q() + ": ";
        int length = str2.length();
        return C8838t.m33932h(str2, length, _UrlKt.FRAGMENT_ENCODE_SET, strMo15680s, i10 == 0 ? strMo15680s.length() : i10 - length);
    }

    /* JADX INFO: renamed from: s */
    public abstract String mo15680s(boolean z10);

    public final String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append(m15781q());
        sb2.append(' ');
        sb2.append(this.f11483c);
        sb2.append(": ");
        sb2.append(this.f11482b.m15794c());
        if (this.f11484d.size() != 0) {
            sb2.append(this.f11484d.m33884B(" ", ", ", null));
            z10 = true;
        } else {
            z10 = false;
        }
        String strMo15678a = mo15678a();
        if (strMo15678a != null) {
            if (z10) {
                sb2.append(',');
            }
            sb2.append(' ');
            sb2.append(strMo15678a);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m15783u(int i10) {
        if (i10 >= 0) {
            this.f11481a = i10;
        } else {
            C9987e.m38645a("address < 0");
        }
    }

    /* JADX INFO: renamed from: v */
    public AbstractC3976j mo15784v(AbstractC8125p abstractC8125p) {
        return mo15681y(abstractC8125p.m31444c(m15778n()));
    }

    /* JADX INFO: renamed from: w */
    public abstract AbstractC3976j mo15716w(C3978l c3978l);

    /* JADX INFO: renamed from: x */
    public abstract AbstractC3976j mo15748x(int i10);

    /* JADX INFO: renamed from: y */
    public abstract AbstractC3976j mo15681y(C6268s c6268s);

    /* JADX INFO: renamed from: z */
    public abstract void mo15682z(InterfaceC8819a interfaceC8819a);
}
