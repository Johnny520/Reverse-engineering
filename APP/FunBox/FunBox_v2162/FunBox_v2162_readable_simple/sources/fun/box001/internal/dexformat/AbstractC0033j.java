package fun.box001.internal.dexformat;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.io.C0198a;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.C0162m;
import fun.box001.internal.dexformat.writer.C0164o;
import fun.box001.internal.dexformat.writer.C0168s;
import java.util.BitSet;

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

    public AbstractC0033j(C0035l r2, C0168s r3, C0164o r4) {
        if (r2 == null) goto L13;
        if (r3 == null) goto L11;
        if (r4 == null) goto L9;
        this.f103a = -1;
        this.f104b = r2;
        this.f105c = r3;
        this.f106d = r4;
        return;
    L9:
        throw new NullPointerException("registers == null");
    L11:
        throw new NullPointerException("position == null");
    L13:
        throw new NullPointerException("opcode == null");
    }

    /* JADX INFO: renamed from: r */
    public static C0021E m131r(C0168s r5, C0162m r6, C0162m r7) {
        boolean r1 = true;
        if (r6.m382g() == 1) goto L6;
        r1 = false;
    L6:
        boolean r0 = r6.mo379c().m474l();
        int r2 = r6.m384i();
        if ((r7.m384i() | r2) >= 16) goto L14;
        if (r0 == false) goto L10;
        C0035l r02 = AbstractC0036m.f212j;
    L26:
        return new C0021E(r02, r5, C0164o.m397I(r6, r7));
    L10:
        if (r1 == false) goto L12;
        r02 = AbstractC0036m.f194d;
        goto L26
    L12:
        r02 = AbstractC0036m.f203g;
        goto L26
    L14:
        if (r2 >= 256) goto L20;
        if (r0 == false) goto L17;
        r02 = AbstractC0036m.f215k;
        goto L26
    L17:
        if (r1 == false) goto L19;
        r02 = AbstractC0036m.f197e;
        goto L26
    L19:
        r02 = AbstractC0036m.f206h;
        goto L26
    L20:
        if (r0 == false) goto L22;
        r02 = AbstractC0036m.f218l;
        goto L26
    L22:
        if (r1 == false) goto L24;
        r02 = AbstractC0036m.f200f;
        goto L26
    L24:
        r02 = AbstractC0036m.f209i;
        goto L26
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
    public final C0038o m132e(BitSet r5) {
        boolean r1 = r5.get(0);
        if (m142o() == false) goto L5;
        r5.set(0);
    L5:
        C0164o r2 = this.f106d.m399K(r5);
        if (m142o() == false) goto L9;
        r5.set(0, r1);
    L9:
        if (r2.m504B() != 0) goto L13;
        return null;
    L13:
        return new C0038o(this.f105c, r2);
    }

    /* JADX INFO: renamed from: f */
    public final C0021E m133f(BitSet r3) {
        if (m142o() == true) goto L5;
        return null;
    L5:
        if (r3.get(0) == true) goto L10;
        C0162m r32 = this.f106d.m513p(0);
        C0162m r0 = r32.m390r(0);
        return m131r(this.f105c, r32, r0);
    L10:
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC0033j m134g(BitSet r3) {
        boolean r0 = m142o();
        return mo86w(this.f106d.m400L(r0, r3));
    }

    /* JADX INFO: renamed from: h */
    public final int m135h() {
        int r0 = this.f103a;
        if (r0 < 0) goto L6;
        return r0;
    L6:
        throw new RuntimeException("address not yet known");
    }

    /* JADX INFO: renamed from: i */
    public final AbstractC0033j m136i() {
        boolean r0 = m142o();
        return mo86w(this.f106d.m400L(r0, null));
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
    public final int m137j(BitSet r7) {
        ?? r0 = m142o();
        ?? r1 = this.f106d;
        int r2 = r1.m504B();
        int r3 = 0;
        if (r0 != 0) goto L5;
    L7:
        int r4 = 0;
    L8:
        if (r0 >= r2) goto L14;
        if (r7.get(r0) == true) goto L12;
        r3 = r1.m513p(r0).m382g() + r3;
    L12:
        r0 = r0 + 1;
        goto L8
    L14:
        return Math.max(r3, r4);
    L5:
        if (r7.get(0) == true) goto L7;
        r4 = r1.m513p(0).m382g();
        goto L8
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
        if (this.f103a < 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m142o() {
        return this.f104b.m157g();
    }

    /* JADX INFO: renamed from: p */
    public final String m143p() {
        int r0 = this.f103a;
        if (r0 == (-1)) goto L7;
        return String.format("%04x", new Object[]{Integer.valueOf(r0)});
    L7:
        return RuntimeDexGenerator.m13s(System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: q */
    protected abstract String mo112q();

    /* JADX INFO: renamed from: s */
    public final void m144s(int r2) {
        if (r2 < 0) goto L6;
        this.f103a = r2;
        return;
    L6:
        throw new IllegalArgumentException("address < 0");
    }

    /* JADX INFO: renamed from: t */
    public AbstractC0033j m145t(C0198a r6) {
        C0164o r0 = this.f106d;
        int r1 = r0.m504B();
        C0164o r2 = new C0164o(r1);
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L5;
        r2.m521x(r3, r6.m476b(r0.m513p(r3)));
        r3 = r3 + 1;
        goto L3
    L5:
        r2.m536g();
        if (r2.equals(r0) == true) goto L10;
        r0 = r2;
    L10:
        return mo86w(r0);
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder(100);
        r0.append(m143p());
        r0.append(' ');
        r0.append(this.f105c);
        r0.append(": ");
        r0.append(this.f104b.m153c());
        C0164o r2 = this.f106d;
        if (r2.m504B() == 0) goto L5;
        r0.append(r2.m505C(" ", null));
        boolean r22 = true;
    L6:
        String r3 = mo84a();
        if (r3 == null) goto L12;
        if (r22 == false) goto L10;
        r0.append(',');
    L10:
        r0.append(' ');
        r0.append(r3);
    L12:
        return r0.toString();
    L5:
        r22 = false;
        goto L6
    }

    /* JADX INFO: renamed from: u */
    public abstract AbstractC0033j mo85u(C0035l r1);

    /* JADX INFO: renamed from: v */
    public abstract AbstractC0033j mo92v(int r1);

    /* JADX INFO: renamed from: w */
    public abstract AbstractC0033j mo86w(C0164o r1);

    /* JADX INFO: renamed from: x */
    public abstract void mo93x(C0202d r1);
}
