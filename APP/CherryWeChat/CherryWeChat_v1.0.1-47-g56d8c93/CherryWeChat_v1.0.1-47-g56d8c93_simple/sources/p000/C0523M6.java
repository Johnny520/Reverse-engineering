package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: M6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0523M6 extends AbstractC1455ge implements InterfaceC0190Eb, InterfaceC1497hc {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1707f = null;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1708g = null;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1709h = null;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0190Eb f1710d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1137ac f1711e;

    static {
        f1707f = AtomicIntegerFieldUpdater.newUpdater(C0523M6.class, "_decisionAndIndex$volatile");
        f1708g = AtomicReferenceFieldUpdater.newUpdater(C0523M6.class, Object.class, "_state$volatile");
        f1709h = AtomicReferenceFieldUpdater.newUpdater(C0523M6.class, Object.class, "_parentHandle$volatile");
    }

    public C0523M6(InterfaceC0190Eb r2) {
        super(1);
        this.f1710d = r2;
        this.f1711e = r2.mo263e();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0388J0.f1324a;
    }

    /* JADX INFO: renamed from: o */
    public static void m1008o(C0394J6 r3, Object r4) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + r3 + ", already has " + r4).toString());
    }

    /* JADX INFO: renamed from: q */
    public static void m1009q(C0523M6 r6, Object r7, int r8) {
    L2:
        AtomicReferenceFieldUpdater r0 = f1708g;
        Object r1 = r0.get(r6);
        if ((r1 instanceof InterfaceC0980Ws) == false) goto L32;
        InterfaceC0980Ws r2 = (InterfaceC0980Ws) r1;
        if ((r7 instanceof C0189Ea) == false) goto L7;
    L6:
        Object r22 = r7;
    L19:
        if (r0.compareAndSet(r6, r1, r22) == true) goto L21;
        if (r0.get(r6) == r1) goto L19;
    L21:
        if (r6.m1020n() == true) goto L26;
        AtomicReferenceFieldUpdater r72 = f1709h;
        InterfaceC2100je r02 = (InterfaceC2100je) r72.get(r6);
        if (r02 == null) goto L26;
        r02.mo1795a();
        r72.set(r6, C0937Vs.f2926a);
    L26:
        r6.m1018l(r8);
        return;
    L7:
        if (r8 == 1) goto L11;
        if (r8 != 2) goto L6;
    L11:
        if ((r2 instanceof C0394J6) == false) goto L6;
        Throwable r5 = null;
        if ((r2 instanceof C0394J6) == false) goto L16;
        C0394J6 r23 = (C0394J6) r2;
    L17:
        r22 = new C0103Ca(r7, r23, r5, 16);
        goto L19
    L16:
        r23 = null;
        goto L17
    L32:
        if ((r1 instanceof C0652P6) == false) goto L37;
        if (C0652P6.f2091c.compareAndSet((C0652P6) r1, 0, 1) == false) goto L37;
        return;
    L37:
        throw new IllegalStateException(("Already resumed, but proposed with update " + r7).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC1455ge
    /* JADX INFO: renamed from: a */
    public final void mo1010a(CancellationException r6) {
    L2:
        AtomicReferenceFieldUpdater r0 = f1708g;
        Object r1 = r0.get(this);
        if ((r1 instanceof InterfaceC0980Ws) == true) goto L38;
        if ((r1 instanceof C0189Ea) == true) goto L54;
        C0394J6 r3 = null;
        if ((r1 instanceof C0103Ca) == true) goto L9;
        C0103Ca r2 = new C0103Ca(r1, r3, r6, 14);
    L32:
        if (r0.compareAndSet(this, r1, r2) == true) goto L55;
        if (r0.get(this) == r1) goto L32;
    L55:
        return;
    L9:
        C0103Ca r22 = (C0103Ca) r1;
        if (r22.f247e != null) goto L29;
        C0103Ca r32 = C0103Ca.m151a(r22, null, r6, 15);
    L13:
        if (r0.compareAndSet(this, r1, r32) == true) goto L14;
        if (r0.get(this) == r1) goto L13;
    L14:
        C0394J6 r02 = r22.f244b;
        if (r02 == null) goto L17;
        m1016j(r02, r6);
    L17:
        C0373Im r03 = r22.f245c;
        if (r03 == null) goto L33;
        Object r12 = r22.f243a;
        InterfaceC1137ac r23 = this.f1711e;
        r03.getClass();     // Catch: Throwable -> L22
        C0829TC r13 = (C0829TC) r12;     // Catch: Throwable -> L22
        C0373Im r33 = new C0373Im(r03.f1302e, (InterfaceC0190Eb) r23);     // Catch: Throwable -> L22
        r33.f1301d = (C0535Mc) r6;     // Catch: Throwable -> L22
        r33.mo448i(C0829TC.f2620a);     // Catch: Throwable -> L22
        return;
    L22:
        th = move-exception;
        AbstractC0628Oj.m1222B(r23, new C0232Fa("Exception in resume onCancellation handler for " + this, th));
        return;
    L33:
        return;
    L29:
        throw new IllegalStateException("Must be called at most once");
    L54:
        return;
    L38:
        throw new IllegalStateException("Not completed");
    }

    @Override // p000.AbstractC1455ge
    /* JADX INFO: renamed from: b */
    public final InterfaceC0190Eb mo1011b() {
        return this.f1710d;
    }

    @Override // p000.InterfaceC1497hc
    /* JADX INFO: renamed from: c */
    public final InterfaceC1497hc mo1012c() {
        InterfaceC0190Eb r0 = this.f1710d;
        if ((r0 instanceof InterfaceC1497hc) == true) goto L5;
        return null;
    L5:
        return (InterfaceC1497hc) r0;
    }

    @Override // p000.AbstractC1455ge
    /* JADX INFO: renamed from: d */
    public final Throwable mo1013d(Object r1) {
        Throwable r12 = super.mo1013d(r1);
        if (r12 == null) goto L5;
        return r12;
    L5:
        return null;
    }

    @Override // p000.InterfaceC0190Eb
    /* JADX INFO: renamed from: e */
    public final InterfaceC1137ac mo263e() {
        return this.f1711e;
    }

    @Override // p000.InterfaceC0190Eb
    /* JADX INFO: renamed from: f */
    public final void mo264f(Object r3) {
        Throwable r0 = C0340Hw.m726a(r3);
        if (r0 == null) goto L6;
        r3 = new C0189Ea(r0, false);
    L6:
        m1009q(this, r3, this.f5157c);
    }

    @Override // p000.AbstractC1455ge
    /* JADX INFO: renamed from: g */
    public final Object mo1014g(Object r2) {
        if ((r2 instanceof C0103Ca) == true) goto L5;
        return r2;
    L5:
        return ((C0103Ca) r2).f243a;
    }

    @Override // p000.AbstractC1455ge
    /* JADX INFO: renamed from: i */
    public final Object mo1015i() {
        return f1708g.get(this);
    }

    /* JADX INFO: renamed from: j */
    public final void m1016j(C0394J6 r3, Throwable r4) {
    L7:
        th = move-exception;
        AbstractC0628Oj.m1222B(this.f1711e, new C0232Fa("Exception in invokeOnCancellation handler for " + this, th));
        return;
    L3:
        switch(r3.f1331a) {
            case 0: goto L5;
            default: goto L4;
        };     // Catch: Throwable -> L7
    L4:
        ((C2416qg) r3.f1332b).mo1795a();     // Catch: Throwable -> L7
        return;
    L5:
        ((C2240mk) r3.f1332b).mo90g(r4);     // Catch: Throwable -> L7
    }

    /* JADX INFO: renamed from: k */
    public final void m1017k(Throwable r8) {
    L2:
        AtomicReferenceFieldUpdater r0 = f1708g;
        Object r1 = r0.get(this);
        if ((r1 instanceof InterfaceC0980Ws) == false) goto L4;
        boolean r3 = r1 instanceof C0394J6;
        if (r8 != null) goto L8;
        Throwable r4 = new CancellationException("Continuation " + this + " was cancelled normally");
    L9:
        C0652P6 r2 = new C0652P6(r4, r3);
    L11:
        if (r0.compareAndSet(this, r1, r2) == true) goto L13;
        if (r0.get(this) == r1) goto L11;
    L13:
        if ((((InterfaceC0980Ws) r1) instanceof C0394J6) == false) goto L16;
        m1016j((C0394J6) r1, r8);
    L16:
        if (m1020n() == true) goto L21;
        AtomicReferenceFieldUpdater r82 = f1709h;
        InterfaceC2100je r02 = (InterfaceC2100je) r82.get(this);
        if (r02 == null) goto L21;
        r02.mo1795a();
        r82.set(this, C0937Vs.f2926a);
    L21:
        m1018l(this.f5157c);
        return;
    L8:
        r4 = r8;
        goto L9
    }

    /* JADX INFO: renamed from: l */
    public final void m1018l(int r7) {
    L2:
        AtomicIntegerFieldUpdater r0 = f1707f;
        int r1 = r0.get(this);
        int r2 = r1 >> 29;
        if (r2 != 0) goto L5;
        if (r0.compareAndSet(this, r1, 1073741824 + (536870911 & r1)) == false) goto L2;
        return;
    L5:
        if (r2 != 1) goto L54;
        boolean r22 = false;
        if (r7 != 4) goto L9;
        boolean r12 = true;
    L10:
        InterfaceC0190Eb r3 = this.f1710d;
        if (r12 == false) goto L13;
    L51:
        AbstractC0828TB.m1625A(this, r3, r12);
        return;
    L13:
        if ((r3 instanceof C1367ee) == false) goto L51;
        if (r7 == 1) goto L19;
        if (r7 == 2) goto L19;
        boolean r72 = false;
    L20:
        int r5 = this.f5157c;
        if (r5 == 1) goto L23;
        if (r5 == 2) goto L23;
    L24:
        if (r72 != r22) goto L51;
        C1367ee r73 = (C1367ee) r3;
        AbstractC1217bc r13 = r73.f4894d;
        InterfaceC1137ac r74 = r73.f4895e.f731b;
        if (r13.mo2333u(r74) == false) goto L30;
        AbstractC1406fG.m2713m0(r13, r74, this);
        return;
    L30:
        AbstractC2588ug r75 = AbstractC1129aB.m2050a();
        if (r75.f8957b < 4294967296L) goto L37;
        C0134D4 r02 = r75.f8959d;
        if (r02 != null) goto L35;
        r02 = new C0134D4();
        r75.f8959d = r02;
    L35:
        r02.addLast(this);
        return;
    L37:
        r75.m5096y(true);
        AbstractC0828TB.m1625A(this, r3, true);     // Catch: Throwable -> L42
    L39:
        if (r75.m5097z() == true) goto L39;
    L41:
        r75.m5095w();
        return;
    L42:
        th = move-exception;
        m2782h(th);     // Catch: Throwable -> L45
    L45:
        th = move-exception;
        r75.m5095w();
        throw th;
    L48:
        th = move-exception;
        throw new C1324de(th, r13, r74);
    L23:
        r22 = true;
    L19:
        r72 = true;
        goto L20
    L9:
        r12 = false;
        goto L10
    L54:
        throw new IllegalStateException("Already resumed");
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC2100je m1019m() {
        InterfaceC1332dm r0 = (InterfaceC1332dm) this.f1711e.mo24m(C1456gf.f5162f);
        if (r0 != null) goto L5;
        return null;
    L5:
        InterfaceC2100je r02 = AbstractC0671Pj.m1354r(r0, true, new C1443g9(0, this));
    L6:
        AtomicReferenceFieldUpdater r2 = f1709h;
        if (r2.compareAndSet(this, null, r02) == true) goto L11;
        if (r2.get(this) == null) goto L6;
    L11:
        return r02;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m1020n() {
        if (this.f5157c != 2) goto L8;
        C1367ee r0 = (C1367ee) this.f1710d;
        r0.getClass();
        if (C1367ee.f4893h.get(r0) == null) goto L10;
        return true;
    L10:
        return false;
    L8:
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final void m1021p() {
        InterfaceC0190Eb r0 = this.f1710d;
        Throwable r2 = null;
        if ((r0 instanceof C1367ee) == false) goto L5;
        C1367ee r02 = (C1367ee) r0;
    L6:
        if (r02 == null) goto L36;
        AtomicReferenceFieldUpdater r1 = C1367ee.f4893h;
    L8:
        Object r3 = r1.get(r02);
        C2610v1 r4 = AbstractC1406fG.f4984c;
        if (r3 != r4) goto L17;
    L11:
        if (r1.compareAndSet(r02, r4, this) == true) goto L21;
        if (r1.get(r02) == r4) goto L11;
    L21:
        if (r2 == null) goto L44;
        AtomicReferenceFieldUpdater r03 = f1709h;
        InterfaceC2100je r12 = (InterfaceC2100je) r03.get(this);
        if (r12 == null) goto L27;
        r12.mo1795a();
        r03.set(this, C0937Vs.f2926a);
    L27:
        m1017k(r2);
        return;
    L44:
        return;
    L17:
        if ((r3 instanceof Throwable) == false) goto L35;
    L19:
        if (r1.compareAndSet(r02, r3, null) == true) goto L20;
        if (r1.get(r02) == r3) goto L19;
        throw new IllegalArgumentException("Failed requirement.");
    L20:
        r2 = (Throwable) r3;
        goto L21
    L35:
        throw new IllegalStateException(("Inconsistent state " + r3).toString());
    L36:
        return;
    L5:
        r02 = null;
        goto L6
    }

    /* JADX INFO: renamed from: r */
    public final void m1022r(AbstractC1217bc r4) {
        InterfaceC0190Eb r0 = this.f1710d;
        AbstractC1217bc r2 = null;
        if ((r0 instanceof C1367ee) == false) goto L5;
        C1367ee r02 = (C1367ee) r0;
    L6:
        if (r02 == null) goto L8;
        r2 = r02.f4894d;
    L8:
        if (r2 != r4) goto L10;
        int r42 = 4;
    L11:
        m1009q(this, C0829TC.f2620a, r42);
        return;
    L10:
        r42 = this.f5157c;
        goto L11
    L5:
        r02 = null;
        goto L6
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("CancellableContinuation(");
        r0.append(AbstractC0148Dc.m287u(this.f1710d));
        r0.append("){");
        Object r1 = f1708g.get(this);
        if ((r1 instanceof InterfaceC0980Ws) == false) goto L6;
        String r12 = "Active";
    L9:
        r0.append(r12);
        r0.append("}@");
        r0.append(AbstractC0148Dc.m278l(this));
        return r0.toString();
    L6:
        if ((r1 instanceof C0652P6) == false) goto L8;
        r12 = "Cancelled";
        goto L9
    L8:
        r12 = "Completed";
        goto L9
    }
}
