package fun.box001.internal.dexmaker;

import fun.box001.internal.dexformat.output.C0205g;
import fun.box001.internal.dexformat.writer.AbstractC0156g;
import fun.box001.internal.dexformat.writer.AbstractC0167r;
import fun.box001.internal.dexformat.writer.C0150a;
import fun.box001.internal.dexformat.writer.C0152c;
import fun.box001.internal.dexformat.writer.C0157h;
import fun.box001.internal.dexformat.writer.C0158i;
import fun.box001.internal.dexformat.writer.C0159j;
import fun.box001.internal.dexformat.writer.C0164o;
import fun.box001.internal.dexformat.writer.C0166q;
import fun.box001.internal.dexformat.writer.C0168s;
import fun.box001.internal.dexformat.writer.C0169t;
import fun.box001.internal.dexformat.writer.C0170u;
import fun.box001.internal.dexformat.writer.code.C0180j;
import fun.box001.internal.dexformat.writer.data.C0193a;
import fun.box001.internal.dexformat.writer.data.C0194b;
import fun.box001.internal.dexformat.writer.data.C0195c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: c.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0004a {

    /* JADX INFO: renamed from: a */
    private final C0012i f1a;

    /* JADX INFO: renamed from: b */
    private final ArrayList f2b;

    /* JADX INFO: renamed from: c */
    private C0010g f3c;

    /* JADX INFO: renamed from: d */
    private boolean f4d;

    /* JADX INFO: renamed from: e */
    private final C0011h f5e;

    /* JADX INFO: renamed from: f */
    private final ArrayList f6f;

    /* JADX INFO: renamed from: g */
    private final ArrayList f7g;

    /* JADX INFO: renamed from: h */
    private C0168s f8h;

    /* JADX INFO: renamed from: i */
    private final ArrayList f9i;

    /* JADX INFO: renamed from: j */
    private C0194b f10j;

    C0004a(C0006c r5) {
        this.f2b = new ArrayList();
        ArrayList r0 = new ArrayList();
        this.f6f = r0;
        this.f7g = new ArrayList();
        this.f8h = C0168s.f681a;
        new ArrayList();
        this.f9i = new ArrayList();
        this.f10j = C0194b.f722c;
        C0012i r1 = r5.f11a;
        this.f1a = r1;
        if (r5.m45c() == false) goto L5;
        this.f5e = null;
    L6:
        C0013j[] r52 = r1.f39d.f55a;
        int r02 = r52.length;
        int r12 = 0;
    L7:
        if (r12 >= r02) goto L9;
        C0013j r2 = r52[r12];
        this.f6f.add(C0011h.m60a(this, r2));
        r12 = r12 + 1;
        goto L7
    L9:
        C0010g r53 = new C0010g();
        this.f3c = r53;
        C0004a r03 = r53.f26b;
        if (r03 == this) goto L14;
        if (r03 != null) goto L17;
        r53.f26b = this;
        this.f2b.add(r53);
        goto L14
    L17:
        throw new IllegalArgumentException("Cannot adopt label; it belongs to another Code");
    L14:
        this.f3c.f27c = true;
        return;
    L5:
        C0011h r54 = C0011h.m60a(this, r1.f36a);
        this.f5e = r54;
        r0.add(r54);
        goto L6
    }

    /* JADX INFO: renamed from: a */
    private void m24a(AbstractC0156g r5) {
        C0010g r0 = this.f3c;
        if (r0 == null) goto L33;
        if (r0.f27c == false) goto L33;
        r0.f25a.add(r5);
        int r52 = r5.m366h().m412b();
        if (r52 != 1) goto L9;
        return;
    L9:
        if (r52 != 2) goto L11;
        this.f3c = null;
        return;
    L11:
        if (r52 == 3) goto L29;
        if (r52 == 4) goto L27;
        if (r52 != 6) goto L25;
        ArrayList r53 = new ArrayList(this.f9i);
        C0010g r1 = new C0010g();
        C0004a r3 = r1.f26b;
        if (r3 == this) goto L21;
        if (r3 != null) goto L23;
        r1.f26b = this;
        this.f2b.add(r1);
        goto L21
    L23:
        throw new IllegalArgumentException("Cannot adopt label; it belongs to another Code");
    L21:
        C0010g r32 = this.f3c;
        r32.f29e = r1;
        r32.f30f = null;
        r32.f28d = r53;
        this.f3c = r1;
        r1.f27c = true;
        return;
    L25:
        throw new IllegalArgumentException();
    L27:
        throw new IllegalArgumentException("branch == null");
    L29:
        throw new IllegalArgumentException("branch == null");
    L33:
        throw new IllegalStateException("no current label");
    }

    /* JADX INFO: renamed from: d */
    private static void m25d(C0011h r3, C0013j r4) {
        if (r3.f33b.equals(r4) == false) goto L6;
        return;
    L6:
        throw new IllegalArgumentException("requested " + r4 + " but was " + r3.f33b);
    }

    /* JADX INFO: renamed from: h */
    private void m26h(C0166q r9, C0012i r10, C0011h r11, C0011h r12, C0011h... r13) {
        C0168s r2 = this.f8h;
        if (r12 == null) goto L5;
        int r0 = 1;
    L6:
        C0164o r3 = new C0164o(r13.length + r0);
        if (r12 == null) goto L9;
        r3.m521x(0, r12.m62c());
    L9:
        int r122 = 0;
    L11:
        if (r122 >= r13.length) goto L13;
        r3.m521x(r122 + r0, r13[r122].m62c());
        r122 = r122 + 1;
        goto L11
    L13:
        m24a(new C0169t(r9, r2, r3, this.f10j, r10.f40e));
        m27l(r11, false);
        return;
    L5:
        r0 = 0;
        goto L6
    }

    /* JADX INFO: renamed from: l */
    private void m27l(C0011h r5, boolean r6) {
        C0013j r0 = r5.f33b;
        if (r6 == false) goto L5;
        C0195c r62 = r0.f53b;
        C0166q r02 = AbstractC0167r.f600a;
        r62.getClass();
        C0166q r03 = new C0166q(56, r62, C0194b.f722c, null);
    L6:
        m24a(new C0159j(r03, this.f8h, r5.m62c(), C0164o.f512c));
        return;
    L5:
        C0195c r63 = r0.f53b;
        C0166q r04 = AbstractC0167r.f600a;
        r63.getClass();
        r03 = new C0166q(55, r63, C0194b.f722c, null);
        goto L6
    }

    /* JADX INFO: renamed from: b */
    public final void m28b(C0011h r4, C0011h r5, C0011h r6) {
        m24a(new C0170u(AbstractC0167r.m417a(r6.f33b.f53b), this.f8h, C0164o.m398J(r6.m62c(), r4.m62c(), r5.m62c()), this.f10j));
    }

    /* JADX INFO: renamed from: c */
    public final void m29c(C0011h r10, C0011h r11) {
        C0013j r0 = r11.f33b;
        boolean r1 = r0.f53b.m474l();
        C0013j r2 = r10.f33b;
        if (r1 == false) goto L5;
        m24a(new C0169t(AbstractC0167r.f557L1, this.f8h, C0164o.m396H(r11.m62c()), this.f10j, r2.f54c));
        m27l(r10, true);
        return;
    L5:
        C0195c r02 = r0.f53b;
        C0195c r22 = r2.f53b;
        if (r02.mo380d() != 6) goto L17;
        int r3 = r22.mo380d();
        if (r3 != 2) goto L10;
        C0166q r03 = AbstractC0167r.f592X0;
    L51:
        m24a(new C0159j(r03, this.f8h, r10.m62c(), C0164o.m396H(r11.m62c())));
        return;
    L10:
        if (r3 != 3) goto L12;
        r03 = AbstractC0167r.f595Y0;
        goto L51
    L12:
        if (r3 != 8) goto L17;
        r03 = AbstractC0167r.f598Z0;
    L17:
        C0166q r32 = AbstractC0167r.f600a;
        int r33 = r22.m468e();
        int r5 = r02.m468e();
        if (r5 == 4) goto L43;
        if (r5 == 5) goto L36;
        if (r5 == 6) goto L23;
        if (r5 != 7) goto L48;
    L26:
        if (r33 == 4) goto L32;
        if (r33 == 5) goto L31;
        if (r33 != 6) goto L36;
        r03 = AbstractC0167r.f556L0;
        goto L51
    L31:
        r03 = AbstractC0167r.f577S0;
        goto L51
    L32:
        r03 = AbstractC0167r.f586V0;
    L48:
        throw new IllegalArgumentException("bad types: " + C0194b.m461G(r22, r02));
    L23:
        if (r33 == 4) goto L35;
        if (r33 == 5) goto L34;
        if (r33 != 7) goto L26;
        r03 = AbstractC0167r.f565O0;
        goto L51
    L34:
        r03 = AbstractC0167r.f574R0;
        goto L51
    L35:
        r03 = AbstractC0167r.f583U0;
    L36:
        if (r33 == 4) goto L42;
        if (r33 == 6) goto L41;
        if (r33 != 7) goto L43;
        r03 = AbstractC0167r.f568P0;
        goto L51
    L41:
        r03 = AbstractC0167r.f559M0;
        goto L51
    L42:
        r03 = AbstractC0167r.f589W0;
    L43:
        if (r33 == 5) goto L50;
        if (r33 == 6) goto L49;
        if (r33 != 7) goto L48;
        r03 = AbstractC0167r.f571Q0;
        goto L51
    L49:
        r03 = AbstractC0167r.f562N0;
        goto L51
    L50:
        r03 = AbstractC0167r.f580T0;
        goto L51
    }

    /* JADX INFO: renamed from: e */
    public final C0011h m30e(int r2, C0013j r3) {
        if (this.f5e == null) goto L5;
        r2 = r2 + 1;
    L5:
        C0011h r22 = (C0011h) this.f6f.get(r2);
        m25d(r22, r3);
        return r22;
    }

    /* JADX INFO: renamed from: f */
    public final C0011h m31f(C0013j r2) {
        C0011h r0 = this.f5e;
        if (r0 == null) goto L7;
        m25d(r0, r2);
        return r0;
    L7:
        throw new IllegalStateException("static methods cannot access 'this'");
    }

    /* JADX INFO: renamed from: g */
    final void m32g() {
        if (this.f4d == true) goto L15;
        this.f4d = true;
        Iterator r0 = this.f7g.iterator();
        int r2 = 0;
    L6:
        if (r0.hasNext() == false) goto L8;
        r2 = r2 + ((C0011h) r0.next()).m61b(r2);
        goto L6
    L8:
        ArrayList r02 = new ArrayList();
        Iterator r3 = this.f6f.iterator();
        int r4 = r2;
    L10:
        if (r3.hasNext() == false) goto L12;
        C0011h r5 = (C0011h) r3.next();
        C0180j r12 = C0180j.m436j(r4 - r2);
        r4 = r4 + r5.m61b(r4);
        r02.add(new C0158i(AbstractC0167r.m419c(r5.f33b.f53b), this.f8h, r5.m62c(), C0164o.f512c, r12));
        goto L10
    L12:
        ((C0010g) this.f2b.get(0)).f25a.addAll(0, r02);
        return;
    L15:
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: i */
    public final void m33i(C0012i r9, C0011h r10, C0011h... r11) {
        C0193a r0 = C0193a.m454f(r9.m63a(true));
        C0166q r1 = AbstractC0167r.f600a;
        m26h(new C0166q(49, r0.m456c(), C0194b.f729j), r9, r10, null, r11);
    }

    /* JADX INFO: renamed from: j */
    public final void m34j(C0012i r9, C0011h r10, C0011h r11, C0011h... r12) {
        C0193a r0 = C0193a.m454f(r9.m63a(true));
        C0166q r1 = AbstractC0167r.f600a;
        m26h(new C0166q(50, r0.m456c(), C0194b.f729j), r9, r10, r11, r12);
    }

    /* JADX INFO: renamed from: k */
    public final void m35k(C0011h r9, Integer r10) {
        if (r10 != null) goto L4;
        C0166q r0 = AbstractC0167r.f651q;
    L5:
        C0166q r2 = r0;
        if (r2.m412b() != 1) goto L8;
        m24a(new C0158i(r2, this.f8h, r9.m62c(), C0164o.f512c, AbstractC0005b.m42a(r10)));
        return;
    L8:
        m24a(new C0169t(r2, this.f8h, C0164o.f512c, this.f10j, AbstractC0005b.m42a(r10)));
        m27l(r9, true);
        return;
    L4:
        r0 = AbstractC0167r.m418b(r9.f33b.f53b);
        goto L5
    }

    /* JADX INFO: renamed from: m */
    public final void m36m(C0011h r8, C0011h r9) {
        C0013j r0 = r8.f33b;
        m24a(new C0169t(AbstractC0167r.m420d(r0.f53b), this.f8h, C0164o.m396H(r9.m62c()), this.f10j, r0.f54c));
        m27l(r8, true);
    }

    /* JADX INFO: renamed from: n */
    public final C0011h m37n(C0013j r2) {
        if (this.f4d == true) goto L7;
        C0011h r22 = C0011h.m60a(this, r2);
        this.f7g.add(r22);
        return r22;
    L7:
        throw new IllegalStateException("Cannot allocate locals after adding instructions");
    }

    /* JADX INFO: renamed from: o */
    final int m38o() {
        Iterator r0 = this.f6f.iterator();
        int r1 = 0;
    L4:
        if (r0.hasNext() == false) goto L6;
        r1 = r1 + ((C0011h) r0.next()).f33b.f53b.m469f();
        goto L4
    L6:
        return r1;
    }

    /* JADX INFO: renamed from: p */
    public final void m39p(C0011h r5) {
        C0012i r0 = this.f1a;
        C0013j r1 = r0.f37b;
        C0013j r2 = r5.f33b;
        if (r2.equals(r1) == false) goto L7;
        m24a(new C0159j(AbstractC0167r.m421e(r2.f53b), this.f8h, null, C0164o.m396H(r5.m62c())));
        return;
    L7:
        throw new IllegalArgumentException("declared " + r0.f37b + " but returned " + r2);
    }

    /* JADX INFO: renamed from: q */
    public final void m40q() {
        C0012i r0 = this.f1a;
        if (r0.f37b.equals(C0013j.f49l) == false) goto L7;
        m24a(new C0159j(AbstractC0167r.f602a1, this.f8h, null, C0164o.f512c));
        return;
    L7:
        throw new IllegalArgumentException("declared " + r0.f37b + " but returned void");
    }

    /* JADX INFO: renamed from: r */
    final C0152c m41r() {
        if (this.f4d == true) goto L5;
        m32g();
    L5:
        ArrayList r0 = this.f2b;
        Iterator r1 = r0.iterator();
        int r3 = 0;
    L7:
        if (r1.hasNext() == false) goto L29;
        C0010g r4 = (C0010g) r1.next();
        if (r4.f25a.isEmpty() == true) goto L10;
        int r5 = 0;
    L13:
        if (r5 >= r4.f28d.size()) goto L18;
    L15:
        if (((C0010g) r4.f28d.get(r5)).f25a.isEmpty() == false) goto L17;
        List r6 = r4.f28d;
        r6.set(r5, ((C0010g) r6.get(r5)).f29e);
        goto L15
    L17:
        r5 = r5 + 1;
    L18:
        C0010g r52 = r4.f29e;
        if (r52 == null) goto L23;
        if (r52.f25a.isEmpty() == false) goto L23;
        r4.f29e = r4.f29e.f29e;
    L23:
        C0010g r53 = r4.f30f;
        if (r53 == null) goto L28;
        if (r53.f25a.isEmpty() == false) goto L28;
        r4.f30f = r4.f30f.f29e;
    L28:
        r4.f31g = r3;
        r3 = r3 + 1;
        goto L7
    L10:
        r1.remove();
        goto L7
    L29:
        C0152c r12 = new C0152c(r0.size());
        int r32 = 0;
    L31:
        if (r32 >= r0.size()) goto L48;
        C0010g r42 = (C0010g) r0.get(r32);
        ArrayList r62 = r42.f25a;
        C0157h r54 = new C0157h(r62.size());
        int r7 = 0;
    L34:
        if (r7 >= r62.size()) goto L36;
        r54.m520w(r7, (AbstractC0156g) r62.get(r7));
        r7 = r7 + 1;
        goto L34
    L36:
        r54.m536g();
        C0205g r63 = new C0205g(4);
        Iterator r72 = r42.f28d.iterator();
    L38:
        if (r72.hasNext() == false) goto L40;
        r63.m524j(((C0010g) r72.next()).f31g);
        goto L38
    L40:
        C0010g r73 = r42.f29e;
        if (r73 == null) goto L43;
        int r74 = r73.f31g;
        r63.m524j(r74);
    L44:
        C0010g r8 = r42.f30f;
        if (r8 == null) goto L47;
        r63.m524j(r8.f31g);
    L47:
        r63.m536g();
        r12.m360L(r32, new C0150a(r42.f31g, r54, r63, r74));
        r32 = r32 + 1;
        goto L31
    L43:
        r74 = -1;
        goto L44
    L48:
        return r12;
    }
}
