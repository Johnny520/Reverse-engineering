package fun.box001.internal.dexformat;

import fun.box001.internal.dexformat.writer.AbstractC0156g;
import fun.box001.internal.dexformat.writer.C0150a;
import fun.box001.internal.dexformat.writer.C0158i;
import fun.box001.internal.dexformat.writer.C0159j;
import fun.box001.internal.dexformat.writer.C0162m;
import fun.box001.internal.dexformat.writer.C0164o;
import fun.box001.internal.dexformat.writer.C0166q;
import fun.box001.internal.dexformat.writer.C0168s;
import fun.box001.internal.dexformat.writer.C0169t;
import fun.box001.internal.dexformat.writer.C0170u;
import fun.box001.internal.dexformat.writer.InterfaceC0155f;
import fun.box001.internal.dexformat.writer.code.AbstractC0171a;
import fun.box001.internal.dexformat.writer.code.C0180j;

/* JADX INFO: renamed from: e.C */
/* JADX INFO: loaded from: classes.dex */
class C0019C implements InterfaceC0155f {

    /* JADX INFO: renamed from: a */
    private final C0046w f69a;

    /* JADX INFO: renamed from: b */
    private C0150a f70b;

    /* JADX INFO: renamed from: c */
    private C0029f f71c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C0020D f72d;

    public C0019C(C0020D r1, C0046w r2) {
        this.f72d = r1;
        this.f69a = r2;
    }

    /* JADX INFO: renamed from: f */
    private C0162m m72f() {
        int r0 = this.f70b.m352e();
        if (r0 >= 0) goto L5;
        return null;
    L5:
        AbstractC0156g r02 = C0020D.m76b(this.f72d).m341a().m359K(r0).m349b().m512o(0);
        if (r02.m366h().m414d() == 56) goto L9;
        return null;
    L9:
        return r02.m368j();
    }

    @Override // fun.box001.internal.dexformat.writer.InterfaceC0155f
    /* JADX INFO: renamed from: a */
    public void mo18a(C0170u r6) {
        C0168s r0 = r6.m367i();
        C0035l r1 = AbstractC0017A.m70a(r6);
        if (r6.m366h().m412b() != 6) goto L14;
        C0162m r2 = m72f();
        boolean r3 = r1.m157g();
        if (r2 == null) goto L7;
        boolean r4 = true;
    L8:
        if (r3 != r4) goto L12;
        m73e(this.f71c);
        m73e(new C0021E(r1, r0, C0020D.m81g(r6, r2)));
        return;
    L12:
        throw new RuntimeException("Insn with result/move-result-pseudo mismatch" + r6);
    L7:
        r4 = false;
        goto L8
    L14:
        throw new RuntimeException("shouldn't happen");
    }

    @Override // fun.box001.internal.dexformat.writer.InterfaceC0155f
    /* JADX INFO: renamed from: b */
    public void mo71b(C0158i r6) {
        C0168s r0 = r6.m367i();
        C0035l r1 = AbstractC0017A.m70a(r6);
        C0166q r2 = r6.m366h();
        int r3 = r2.m414d();
        if (r2.m412b() != 1) goto L12;
        if (r3 != 3) goto L9;
        C0020D r22 = this.f72d;
        if (C0020D.m78d(r22) == true) goto L13;
        C0162m r32 = r6.m368j();
        int r62 = ((C0180j) r6.m362l()).mo438h();
        m73e(new C0021E(r1, r0, C0164o.m397I(r32, C0162m.m377m((C0020D.m79e(r22) - C0020D.m77c(r22)) + r62, r32.mo379c()))));
        return;
    L13:
        return;
    L9:
        m73e(new C0030g(r1, r0, C0020D.m80f(r6), r6.m362l()));
        return;
    L12:
        throw new RuntimeException("shouldn't happen");
    }

    @Override // fun.box001.internal.dexformat.writer.InterfaceC0155f
    /* JADX INFO: renamed from: c */
    public void mo19c(C0159j r6) {
        C0166q r0 = r6.m366h();
        if (r0.m414d() != 54) goto L6;
        return;
    L6:
        if (r0.m414d() != 56) goto L8;
        return;
    L8:
        C0168s r1 = r6.m367i();
        C0035l r2 = AbstractC0017A.m70a(r6);
        int r02 = r0.m412b();
        if (r02 != 1) goto L11;
    L23:
        AbstractC0033j r3 = new C0021E(r2, r1, C0020D.m80f(r6));
    L24:
        m73e(r3);
        return;
    L11:
        if (r02 == 2) goto L23;
        if (r02 != 3) goto L15;
        return;
    L15:
        if (r02 != 4) goto L17;
        int r03 = this.f70b.m354g().m526l(1);
        r3 = new C0022F(r2, r1, C0020D.m80f(r6), C0020D.m75a(this.f72d).m98e(r03));
        goto L24
    L17:
        if (r02 == 6) goto L23;
        throw new RuntimeException("shouldn't happen");
    }

    @Override // fun.box001.internal.dexformat.writer.InterfaceC0155f
    /* JADX INFO: renamed from: d */
    public void mo20d(C0169t r11) {
        C0168s r0 = r11.m367i();
        C0035l r1 = AbstractC0017A.m70a(r11);
        C0166q r2 = r11.m366h();
        AbstractC0171a r3 = r11.m362l();
        if (r2.m412b() != 6) goto L52;
        m73e(this.f71c);
        if (r2.m415e() == false) goto L7;
        m73e(new C0030g(r1, r0, r11.m369k(), r3));
        return;
    L7:
        C0162m r4 = m72f();
        C0164o r5 = C0020D.m81g(r11, r4);
        if (r1.m157g() == false) goto L10;
    L13:
        boolean r6 = true;
    L14:
        if (r4 == null) goto L16;
        boolean r42 = true;
    L17:
        if (r6 != r42) goto L50;
        if (r2.m414d() == 41) goto L21;
    L23:
        AbstractC0033j r112 = new C0030g(r1, r0, r5, r3);
    L24:
        C0046w r22 = this.f69a;
        int r32 = r22.m199e() - 1;
    L25:
        if (r32 < 0) goto L30;
        AbstractC0033j r52 = r22.m196b(r32);
        if (r52.m138k().m155e() != (-1)) goto L32;
        r32 = r32 - 1;
    L32:
        if (r1.m155e() != 32) goto L47;
        if (r52 == null) goto L47;
        int r12 = r52.m138k().m155e();
        if (r12 == 7) goto L41;
        if (r12 == 8) goto L41;
        if (r12 != 9) goto L47;
    L41:
        if (r112.m140m().m504B() <= 0) goto L47;
        if (r52.m140m().m504B() <= 1) goto L47;
        if (r112.m140m().m513p(0).m384i() != r52.m140m().m513p(1).m384i()) goto L47;
        m73e(new C0021E(AbstractC0036m.f191c, r0, C0164o.f512c));
    L47:
        m73e(r112);
        return;
    L30:
        r52 = null;
        goto L32
    L21:
        if (r1.m155e() == 35) goto L23;
        r112 = new C0021E(r1, r0, r5);
        goto L24
    L50:
        throw new RuntimeException("Insn with result/move-result-pseudo mismatch " + r11);
    L16:
        r42 = false;
        goto L17
    L10:
        if (r2.m414d() == 43) goto L13;
        r6 = false;
        goto L14
    L52:
        throw new RuntimeException("Expected BRANCH_THROW got " + r2.m412b());
    }

    /* JADX INFO: renamed from: e */
    protected final void m73e(AbstractC0033j r2) {
        this.f69a.m195a(r2);
    }

    /* JADX INFO: renamed from: g */
    public final void m74g(C0150a r1, C0029f r2) {
        this.f70b = r1;
        this.f71c = r2;
    }
}
