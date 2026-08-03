package fun.box001.internal.dexformat;

import fun.box001.internal.collections.C0016a;
import fun.box001.internal.dexbridge.C0000a;
import fun.box001.internal.dexformat.io.C0198a;
import fun.box001.internal.dexformat.writer.C0162m;
import fun.box001.internal.dexformat.writer.C0164o;
import fun.box001.internal.dexformat.writer.C0165p;
import fun.box001.internal.dexformat.writer.code.AbstractC0171a;
import fun.box001.internal.dexformat.writer.code.AbstractC0186p;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: e.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0047x {

    /* JADX INFO: renamed from: a */
    private final C0016a f271a;

    /* JADX INFO: renamed from: b */
    private final int f272b;

    /* JADX INFO: renamed from: c */
    private ArrayList f273c;

    /* JADX INFO: renamed from: d */
    private boolean f274d;

    /* JADX INFO: renamed from: e */
    private int f275e;

    /* JADX INFO: renamed from: f */
    private int f276f;

    /* JADX INFO: renamed from: g */
    private final int f277g;

    public C0047x(C0016a r1, int r2, int r3, int r4) {
        this.f271a = r1;
        this.f272b = r3;
        this.f273c = new ArrayList(r2);
        this.f275e = -1;
        this.f274d = false;
        this.f277g = r4;
    }

    /* JADX INFO: renamed from: b */
    private void m200b() {
        int r0 = this.f273c.size();
        int r1 = 0;
    L4:
        if (r1 >= r0) goto L9;
        AbstractC0033j r3 = (AbstractC0033j) this.f273c.get(r1);
        if ((r3 instanceof C0029f) == true) goto L8;
        this.f273c.set(r1, r3.mo92v(1));
    L8:
        r1 = r1 + 1;
        goto L4
    L9:
        this.f275e++;
    }

    /* JADX INFO: renamed from: d */
    private C0035l m201d(AbstractC0033j r4) {
        C0035l r0 = m202e(r4.m136i(), r4.m138k());
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new C0000a("No expanded opcode for " + r4);
    }

    /* JADX INFO: renamed from: e */
    private C0035l m202e(AbstractC0033j r2, C0035l r3) {
    L2:
        if (r3 == null) goto L7;
        if (r3.m152b().mo180i(r2) == true) goto L5;
        r3 = AbstractC0036m.m158a(r3);
        goto L2
    L5:
        this.f271a.getClass();
    L7:
        return r3;
    }

    /* JADX INFO: renamed from: k */
    private boolean m203k(C0035l[] r10) {
        int r0 = this.f275e;
        if (r0 >= 0) goto L5;
        r0 = 0;
    L5:
        boolean r2 = false;
    L6:
        int r3 = this.f273c.size();
        int r4 = this.f275e;
        int r5 = 0;
    L7:
        if (r5 >= r3) goto L17;
        AbstractC0033j r6 = (AbstractC0033j) this.f273c.get(r5);
        C0035l r7 = r10[r5];
        C0035l r8 = m202e(r6, r7);
        if (r8 != null) goto L13;
        int r62 = r6.m137j(m201d(r6).m152b().mo177f(r6));
        if (r62 <= r4) goto L15;
        r4 = r62;
    L15:
        r10[r5] = r8;
    L16:
        r5 = r5 + 1;
        goto L7
    L13:
        if (r7 != r8) goto L15;
    L17:
        if (r0 >= r4) goto L18;
        int r02 = r4 - r0;
        int r22 = this.f273c.size();
        int r32 = 0;
    L21:
        if (r32 >= r22) goto L26;
        AbstractC0033j r52 = (AbstractC0033j) this.f273c.get(r32);
        if ((r52 instanceof C0029f) == true) goto L25;
        this.f273c.set(r32, r52.mo92v(r02));
    L25:
        r32 = r32 + 1;
        goto L21
    L26:
        r2 = true;
        r0 = r4;
        goto L6
    L18:
        this.f275e = r0;
        return r2;
    }

    /* JADX INFO: renamed from: a */
    public final void m204a(AbstractC0033j r5) {
        this.f273c.add(r5);
        if (this.f274d == true) goto L6;
        r5.m139l().getClass();
    L6:
        if ((r5 instanceof AbstractC0044u) == false) goto L14;
        C0165p r52 = ((AbstractC0044u) r5).m193y();
        int r0 = r52.m410p();
        int r2 = 0;
    L8:
        if (r2 >= r0) goto L23;
        if (r52.m405k(r2) != null) goto L12;
        r2 = r2 + 1;
        goto L8
    L12:
        throw null;
    L23:
        return;
    L14:
        if ((r5 instanceof AbstractC0045v) == true) goto L16;
        return;
    L16:
        if (((AbstractC0045v) r5).m194y() == null) goto L22;
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public final void m205c(InterfaceC0031h r5) {
        Iterator r0 = this.f273c.iterator();
    L4:
        if (r0.hasNext() == false) goto L15;
        AbstractC0033j r1 = (AbstractC0033j) r0.next();
        if ((r1 instanceof C0030g) == false) goto L4;
        C0030g r12 = (C0030g) r1;
        AbstractC0171a r2 = r12.m117y();
        int r3 = r5.mo119a(r2);
        if (r3 < 0) goto L11;
        r12.m114B(r3);
    L11:
        if ((r2 instanceof AbstractC0186p) == false) goto L4;
        int r22 = r5.mo119a(((AbstractC0186p) r2).m440g());
        if (r22 < 0) goto L4;
        r12.m113A(r22);
        goto L4
    }

    /* JADX INFO: renamed from: f */
    public final C0034k m206f() {
        if (this.f275e >= 0) goto L118;
        int r0 = this.f273c.size();
        C0035l[] r1 = new C0035l[r0];
        int r3 = 0;
    L5:
        if (r3 >= r0) goto L7;
        r1[r3] = ((AbstractC0033j) this.f273c.get(r3)).m138k();
        r3 = r3 + 1;
        goto L5
    L7:
        m203k(r1);
        this.f271a.getClass();
    L8:
        int r02 = this.f275e;
        int r32 = this.f272b;
        int r03 = (r02 + r32) + this.f276f;
        int r4 = this.f277g;
        int r04 = r03 - r4;
        Iterator r5 = this.f273c.iterator();
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
    L10:
        if (r5.hasNext() == false) goto L29;
        C0164o r10 = ((AbstractC0033j) r5.next()).m140m();
        int r12 = 0;
    L13:
        if (r12 >= r10.m504B()) goto L10;
        C0162m r13 = r10.m513p(r12);
        if (r13.m385k() == false) goto L28;
        if (r13.m384i() < r04) goto L19;
        boolean r14 = true;
    L21:
        if (r13.m386l() == false) goto L25;
        if (r14 == false) goto L24;
        r7 = r7 + 1;
        goto L28
    L24:
        r9 = r9 + 1;
        goto L28
    L25:
        if (r14 == false) goto L27;
        r6 = r6 + 1;
        goto L28
    L27:
        r8 = r8 + 1;
        goto L28
    L19:
        r14 = false;
    L28:
        r12 = r12 + 1;
        goto L13
    L29:
        if (r6 <= r7) goto L32;
        if (r8 <= r9) goto L32;
        m200b();
    L52:
        if (m203k(r1) == true) goto L8;
    L54:
        if (this.f275e != 0) goto L61;
        int r05 = this.f273c.size();
        int r42 = 0;
    L56:
        if (r42 >= r05) goto L88;
        AbstractC0033j r52 = (AbstractC0033j) this.f273c.get(r42);
        C0035l r62 = r52.m138k();
        C0035l r72 = r1[r42];
        if (r62 == r72) goto L60;
        this.f273c.set(r42, r52.mo85u(r72));
    L60:
        r42 = r42 + 1;
    L88:
        int r06 = this.f273c.size();
        int r15 = 0;
        int r43 = 0;
    L89:
        if (r15 >= r06) goto L91;
        AbstractC0033j r53 = (AbstractC0033j) this.f273c.get(r15);
        r53.m144s(r43);
        r43 = r43 + r53.mo91b();
        r15 = r15 + 1;
        goto L89
    L91:
        int r07 = this.f273c.size();
        int r16 = 0;
        boolean r44 = false;
    L92:
        if (r16 >= r07) goto L114;
        AbstractC0033j r54 = (AbstractC0033j) this.f273c.get(r16);
        if ((r54 instanceof C0022F) == false) goto L109;
        C0035l r63 = r54.m138k();
        C0022F r73 = (C0022F) r54;
        if (r63.m152b().mo175b(r73) == true) goto L109;
        if (r63.m151a() != 40) goto L119;
        C0035l r45 = m202e(r54, r63);
        if (r45 == null) goto L105;
        this.f273c.set(r16, r54.mo85u(r45));
    L108:
        r44 = true;
        goto L109
    L105:
        throw new UnsupportedOperationException("method too long");
    L119:
        int r55 = r16 + 1;     // Catch: ClassCastException -> L110 IndexOutOfBoundsException -> L112
        C0029f r46 = (C0029f) this.f273c.get(r55);     // Catch: ClassCastException -> L110 IndexOutOfBoundsException -> L112
        this.f273c.set(r16, new C0022F(AbstractC0036m.f137I, r73.m139l(), C0164o.f512c, r73.m89y()));
        this.f273c.add(r16, new C0022F(r73.m138k().m156f(), r73.m139l(), r73.m140m(), r46));
        r07 = r07 + 1;
        r16 = r55;
        goto L108
    L111:
        throw new IllegalStateException("unpaired TargetInsn");
    L113:
        throw new IllegalStateException("unpaired TargetInsn (dangling)");
    L109:
        r16 = r16 + 1;
        goto L92
    L114:
        if (r44 == true) goto L88;
        return C0034k.m146I((this.f275e + r32) + this.f276f, this.f273c);
    L61:
        int r08 = this.f273c.size();
        ArrayList r47 = new ArrayList(r08 * 2);
        ArrayList r56 = new ArrayList();
        int r64 = 0;
    L62:
        if (r64 >= r08) goto L87;
        AbstractC0033j r74 = (AbstractC0033j) this.f273c.get(r64);
        C0035l r82 = r74.m138k();
        C0035l r92 = r1[r64];
        if (r92 == null) goto L66;
        C0038o r102 = null;
        C0021E r132 = null;
    L68:
        if ((r74 instanceof C0029f) == false) goto L70;
        ((C0029f) r74).getClass();
    L70:
        if (r102 == null) goto L73;
        r47.add(r102);
    L73:
        if ((r74 instanceof AbstractC0023G) == false) goto L75;
    L81:
        if (r92 == r82) goto L83;
        r74 = r74.mo85u(r92);
    L83:
        r47.add(r74);
        if (r132 == null) goto L86;
        r47.add(r132);
    L86:
        r64 = r64 + 1;
        goto L62
    L75:
        if (r56.size() <= 0) goto L81;
        Iterator r103 = r56.iterator();
    L78:
        if (r103.hasNext() == false) goto L80;
        r47.add((C0029f) r103.next());
        goto L78
    L80:
        r56.clear();
        goto L81
    L66:
        r92 = m201d(r74);
        BitSet r104 = r92.m152b().mo177f(r74);
        C0038o r122 = r74.m132e(r104);
        r132 = r74.m133f(r104);
        r74 = r74.m134g(r104);
        r102 = r122;
        goto L68
    L87:
        this.f273c = r47;
    L32:
        if (r6 > r7) goto L38;
        if (r8 <= r9) goto L54;
        m200b();
        if (r4 == 0) goto L52;
        if (r7 <= r6) goto L52;
    L38:
        int r09 = this.f273c.size();
        int r57 = (this.f275e + r32) + this.f276f;
        int r48 = r57 - r4;
        C0198a r65 = new C0198a(r57);
        int r75 = 0;
    L39:
        if (r75 >= r57) goto L44;
        if (r75 < r48) goto L42;
        r65.m475a(r75, r75 + 1);
    L43:
        r75 = r75 + 1;
        goto L39
    L42:
        r65.m475a(r75, r75);
        goto L43
    L44:
        int r49 = 0;
    L45:
        if (r49 >= r09) goto L50;
        AbstractC0033j r58 = (AbstractC0033j) this.f273c.get(r49);
        if ((r58 instanceof C0029f) == true) goto L49;
        this.f273c.set(r49, r58.m145t(r65));
    L49:
        r49 = r49 + 1;
        goto L45
    L50:
        this.f276f++;
        goto L52
    L118:
        throw new UnsupportedOperationException("already processed");
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC0033j m207g(int r2) {
        return (AbstractC0033j) this.f273c.get(r2);
    }

    /* JADX INFO: renamed from: h */
    public final HashSet m208h() {
        HashSet r0 = new HashSet(20);
        Iterator r1 = this.f273c.iterator();
    L4:
        if (r1.hasNext() == false) goto L22;
        AbstractC0033j r2 = (AbstractC0033j) r1.next();
        if ((r2 instanceof C0030g) == true) goto L7;
        if ((r2 instanceof AbstractC0044u) == true) goto L10;
        if ((r2 instanceof AbstractC0045v) == false) goto L4;
        if (((AbstractC0045v) r2).m194y() == null) goto L4;
        throw null;
    L10:
        C0165p r22 = ((AbstractC0044u) r2).m193y();
        int r3 = r22.m410p();
        int r5 = 0;
    L11:
        if (r5 >= r3) goto L4;
        if (r22.m405k(r5) != null) goto L15;
        r5 = r5 + 1;
        goto L11
    L15:
        throw null;
    L7:
        r0.add(((C0030g) r2).m117y());
        goto L4
    L22:
        return r0;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m209i() {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m210j() {
        return this.f274d;
    }

    /* JADX INFO: renamed from: l */
    public final void m211l(C0029f r7) {
        int r0 = (this.f273c.size() - 1) - 1;
        C0022F r1 = (C0022F) this.f273c.get(r0);     // Catch: ClassCastException -> L6 IndexOutOfBoundsException -> L8
        this.f273c.set(r0, new C0022F(r1.m138k().m156f(), r1.m139l(), r1.m140m(), r7));
        return;
    L7:
        throw new IllegalArgumentException("non-reversible instruction");
    L9:
        throw new IllegalArgumentException("too few instructions");
    }

    /* JADX INFO: renamed from: m */
    public final int m212m() {
        return this.f273c.size();
    }
}
