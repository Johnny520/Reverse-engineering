package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: km */
/* JADX INFO: loaded from: classes.dex */
public class C2152km implements InterfaceC1332dm, InterfaceC0423Jt {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7529a = null;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7530b = null;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        f7529a = AtomicReferenceFieldUpdater.newUpdater(C2152km.class, Object.class, "_state$volatile");
        f7530b = AtomicReferenceFieldUpdater.newUpdater(C2152km.class, Object.class, "_parentHandle$volatile");
    }

    public C2152km(boolean r1) {
        if (r1 == false) goto L5;
        C0280Gf r12 = AbstractC0295Gu.f1003h;
    L6:
        this._state$volatile = r12;
        return;
    L5:
        r12 = AbstractC0295Gu.f1002g;
        goto L6
    }

    /* JADX INFO: renamed from: F */
    public static C1531i9 m4341F(C1291cp r2) {
    L3:
        if (r2.mo1687i() == false) goto L12;
        AtomicReferenceFieldUpdater r0 = C1291cp.f4721b;
        C1291cp r1 = r2.m2527f();
        if (r1 == null) goto L6;
        r2 = r1;
        goto L3
    L6:
        Object r22 = r0.get(r2);
    L7:
        r2 = (C1291cp) r22;
        if (r2.mo1687i() == false) goto L3;
        r22 = r0.get(r2);
    L12:
        r2 = r2.m2529h();
        if (r2.mo1687i() == true) goto L12;
        if ((r2 instanceof C1531i9) == true) goto L17;
        if ((r2 instanceof C0851Ts) == false) goto L12;
        return null;
    L17:
        return (C1531i9) r2;
    }

    /* JADX INFO: renamed from: L */
    public static String m4342L(Object r2) {
        if ((r2 instanceof C2108jm) == false) goto L14;
        C2108jm r22 = (C2108jm) r2;
        if (r22.m4296c() == false) goto L9;
        return "Cancelling";
    L9:
        if (C2108jm.f7408b.get(r22) != 1) goto L12;
        return "Completing";
    L12:
        return "Active";
    L14:
        if ((r2 instanceof InterfaceC1418fl) == false) goto L21;
        if (((InterfaceC1418fl) r2).mo564d() == false) goto L18;
        return "Active";
    L18:
        return "New";
    L21:
        if ((r2 instanceof C0189Ea) == false) goto L24;
        return "Cancelled";
    L24:
        return "Completed";
    }

    /* JADX INFO: renamed from: A */
    public void mo4343A(C0232Fa r1) {
        throw r1;
    }

    /* JADX INFO: renamed from: B */
    public final void m4344B(InterfaceC1332dm r4) {
        AtomicReferenceFieldUpdater r0 = f7530b;
        C0937Vs r1 = C0937Vs.f2926a;
        if (r4 != null) goto L6;
        r0.set(this, r1);
        return;
    L6:
        r4.start();
        InterfaceC1487h9 r42 = r4.mo1746i(this);
        r0.set(this, r42);
        if ((f7529a.get(this) instanceof InterfaceC1418fl) == true) goto L10;
        r42.mo1795a();
        r0.set(this, r1);
        return;
    }

    /* JADX INFO: renamed from: C */
    public final InterfaceC2100je m4345C(boolean r8, AbstractC1507hm r9) {
        r9.f5343d = this;
    L3:
        AtomicReferenceFieldUpdater r0 = f7529a;
        Object r1 = r0.get(this);
        boolean r2 = r1 instanceof C0280Gf;
        C0937Vs r3 = C0937Vs.f2926a;
        boolean r4 = true;
        Throwable r5 = null;
        if (r2 == true) goto L5;
        if ((r1 instanceof InterfaceC1418fl) == false) goto L36;
        InterfaceC1418fl r22 = (InterfaceC1418fl) r1;
        C0851Ts r6 = r22.mo565e();
        if (r6 == null) goto L18;
        if (r9.mo1505j() == true) goto L22;
        boolean r12 = r6.m2526c(r9, 1);
    L34:
        if (r12 == false) goto L3;
    L37:
        if (r4 == false) goto L39;
        return r9;
    L39:
        if (r8 == false) goto L47;
        Object r82 = r0.get(this);
        if ((r82 instanceof C0189Ea) == false) goto L43;
        C0189Ea r83 = (C0189Ea) r82;
    L44:
        if (r83 == null) goto L46;
        r5 = r83.f575a;
    L46:
        r9.mo1506k(r5);
        goto L47
    L43:
        r83 = null;
    L47:
        return r3;
    L22:
        if ((r22 instanceof C2108jm) == false) goto L24;
        C2108jm r23 = (C2108jm) r22;
    L25:
        if (r23 == null) goto L27;
        Throwable r13 = r23.m4295b();
    L28:
        if (r13 != null) goto L30;
        r12 = r6.m2526c(r9, 5);
        goto L34
    L30:
        if (r8 == false) goto L47;
        r9.mo1506k(r13);
        return r3;
    L27:
        r13 = null;
        goto L28
    L24:
        r23 = null;
        goto L25
    L18:
        m4352K((AbstractC1507hm) r1);
        goto L3
    L36:
        r4 = false;
        goto L37
    L5:
        C0280Gf r24 = (C0280Gf) r1;
        if (r24.f907a == true) goto L8;
        m4351J(r24);
    L8:
        if (r0.compareAndSet(this, r1, r9) == true) goto L37;
        if (r0.get(this) == r1) goto L8;
        goto L3
    }

    /* JADX INFO: renamed from: D */
    public boolean mo4346D() {
        return false;
    }

    /* JADX INFO: renamed from: E */
    public final Object m4347E(Object r5) {
    L2:
        Object r0 = m4353M(f7529a.get(this), r5);
        if (r0 == AbstractC0295Gu.f997b) goto L4;
        if (r0 == AbstractC0295Gu.f999d) goto L2;
        return r0;
    L4:
        String r1 = "Job " + this + " is already complete or completing, but is being completed with " + r5;
        Throwable r3 = null;
        if ((r5 instanceof C0189Ea) == false) goto L7;
        C0189Ea r52 = (C0189Ea) r5;
    L8:
        if (r52 == null) goto L11;
        r3 = r52.f575a;
    L11:
        throw new IllegalStateException(r1, r3);
    L7:
        r52 = null;
        goto L8
    }

    /* JADX INFO: renamed from: G */
    public final void m4348G(C0851Ts r6, Throwable r7) {
        r6.m2526c(new C2510so(4), 4);
        C1291cp r0 = (C1291cp) C1291cp.f4720a.get(r6);
        C0232Fa r1 = null;
    L4:
        if (AbstractC0585Nj.m1134a(r0, r6) == true) goto L16;
        if ((r0 instanceof AbstractC1507hm) == false) goto L15;
        if (((AbstractC1507hm) r0).mo1505j() == false) goto L15;
        ((AbstractC1507hm) r0).mo1506k(r7);     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        if (r1 == null) goto L14;
        AbstractC0148Dc.m268b(r1, th);
        goto L15
    L14:
        r1 = new C0232Fa("Exception in completion handler " + r0 + " for " + this, th);
    L15:
        r0 = r0.m2529h();
        goto L4
    L16:
        if (r1 == null) goto L18;
        mo4343A(r1);
    L18:
        m4356j(r7);
    }

    /* JADX INFO: renamed from: H */
    public void mo4349H(Object r1) {
    }

    /* JADX INFO: renamed from: I */
    public void m4350I() {
    }

    /* JADX INFO: renamed from: J */
    public final void m4351J(C0280Gf r4) {
        C0851Ts r0 = new C0851Ts();
        Object r02 = r0;
        if (r4.f907a == true) goto L6;
        r02 = new C1374el(r0);
    L6:
        AtomicReferenceFieldUpdater r1 = f7529a;
        if (r1.compareAndSet(this, r4, r02) == true) goto L11;
        if (r1.get(this) == r4) goto L6;
        return;
    }

    /* JADX INFO: renamed from: K */
    public final void m4352K(AbstractC1507hm r4) {
        C0851Ts r0 = new C0851Ts();
        r4.getClass();
        C1291cp.f4721b.set(r0, r4);
        AtomicReferenceFieldUpdater r1 = C1291cp.f4720a;
        r1.set(r0, r4);
    L4:
        if (r1.get(r4) != r4) goto L9;
    L7:
        if (r1.compareAndSet(r4, r4, r0) == true) goto L8;
        if (r1.get(r4) == r4) goto L7;
    L8:
        r0.m2528g(r4);
    L9:
        C1291cp r2 = r4.m2529h();
    L10:
        AtomicReferenceFieldUpdater r02 = f7529a;
        if (r02.compareAndSet(this, r4, r2) == true) goto L12;
        if (r02.get(this) == r4) goto L10;
        return;
    }

    /* JADX INFO: renamed from: M */
    public final Object m4353M(Object r7, Object r8) {
        if ((r7 instanceof InterfaceC1418fl) == true) goto L7;
        return AbstractC0295Gu.f997b;
    L7:
        if ((r7 instanceof C0280Gf) == true) goto L11;
        if ((r7 instanceof AbstractC1507hm) == true) goto L11;
    L26:
        InterfaceC1418fl r72 = (InterfaceC1418fl) r7;
        C0851Ts r0 = m4361y(r72);
        if (r0 == null) goto L29;
        Throwable r2 = null;
        if ((r72 instanceof C2108jm) == false) goto L33;
        C2108jm r1 = (C2108jm) r72;
    L34:
        if (r1 != null) goto L36;
        r1 = new C2108jm(r0, null);
    L36:
        monitor-enter(r1);
        AtomicIntegerFieldUpdater r3 = C2108jm.f7408b;     // Catch: Throwable -> L45
        if (r3.get(r1) != 1) goto L40;
        boolean r4 = true;
    L41:
        if (r4 == false) goto L47;
        C2610v1 r73 = AbstractC0295Gu.f997b;     // Catch: Throwable -> L45
        monitor-exit(r1);
        return r73;
    L47:
        r3.set(r1, 1);     // Catch: Throwable -> L45
        if (r1 == r72) goto L58;
        AtomicReferenceFieldUpdater r32 = f7529a;     // Catch: Throwable -> L45
    L51:
        if (r32.compareAndSet(this, r72, r1) == true) goto L58;
        if (r32.get(this) == r72) goto L51;
        C2610v1 r74 = AbstractC0295Gu.f999d;     // Catch: Throwable -> L45
        monitor-exit(r1);
        return r74;
    L58:
        boolean r75 = r1.m4296c();     // Catch: Throwable -> L45
        if ((r8 instanceof C0189Ea) == false) goto L61;
        C0189Ea r33 = (C0189Ea) r8;     // Catch: Throwable -> L45
    L62:
        if (r33 == null) goto L64;
        r1.m4294a(r33.f575a);     // Catch: Throwable -> L45
    L64:
        Throwable r34 = r1.m4295b();     // Catch: Throwable -> L45
        if (r75 == true) goto L67;
        r2 = r34;
    L67:
        monitor-exit(r1);
        if (r2 == null) goto L70;
        m4348G(r0, r2);
    L70:
        C1531i9 r76 = m4341F(r0);
        if (r76 != null) goto L73;
    L76:
        r0.m2526c(new C2510so(2), 2);
        C1531i9 r77 = m4341F(r0);
        if (r77 == null) goto L83;
        if (m4354N(r1, r77, r8) == false) goto L83;
        return AbstractC0295Gu.f998c;
    L83:
        return m4360v(r1, r8);
    L73:
        if (m4354N(r1, r76, r8) == false) goto L76;
        return AbstractC0295Gu.f998c;
    L61:
        r33 = null;
        goto L62
    L40:
        r4 = false;
    L45:
        th = move-exception;
        throw th;
    L33:
        r1 = null;
        goto L34
    L29:
        return AbstractC0295Gu.f999d;
    L11:
        if ((r7 instanceof C1531i9) == true) goto L26;
        if ((r8 instanceof C0189Ea) == true) goto L26;
        InterfaceC1418fl r02 = (InterfaceC1418fl) r7;
        AtomicReferenceFieldUpdater r12 = f7529a;
        if ((r8 instanceof InterfaceC1418fl) == false) goto L17;
        Object r22 = new C1462gl((InterfaceC1418fl) r8);
    L19:
        if (r12.compareAndSet(this, r02, r22) == true) goto L20;
        if (r12.get(this) == r02) goto L19;
        return AbstractC0295Gu.f999d;
    L20:
        mo4349H(r8);
        m4358t(r02, r8);
        return r8;
    L17:
        r22 = r8;
        goto L19
    }

    /* JADX INFO: renamed from: N */
    public final boolean m4354N(C2108jm r4, C1531i9 r5, Object r6) {
    L3:
        if (AbstractC0671Pj.m1354r(r5.f5413e, false, new C1550im(this, r4, r5, r6)) != C0937Vs.f2926a) goto L4;
        r5 = m4341F(r5);
        if (r5 != null) goto L3;
        return false;
    L4:
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void mo2728b(Object r1) {
    }

    @Override // p000.InterfaceC1332dm
    /* JADX INFO: renamed from: d */
    public boolean mo1745d() {
        Object r0 = f7529a.get(this);
        if ((r0 instanceof InterfaceC1418fl) == true) goto L5;
        return false;
    L5:
        if (((InterfaceC1418fl) r0).mo564d() == false) goto L10;
        return true;
    L10:
        return false;
    }

    /* JADX INFO: renamed from: g */
    public void mo2729g(Object r1) {
        mo2728b(r1);
    }

    @Override // p000.InterfaceC1049Yb
    public final InterfaceC1092Zb getKey() {
        return C1456gf.f5162f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m4355h(Object r10) {
        Object r0 = AbstractC0295Gu.f997b;
        if (mo2731x() == false) goto L19;
    L4:
        Object r02 = f7529a.get(this);
        if ((r02 instanceof InterfaceC1418fl) == false) goto L14;
        if ((r02 instanceof C2108jm) == true) goto L9;
    L11:
        r0 = m4353M(r02, new C0189Ea(m4359u(r10), false));
        if (r0 == AbstractC0295Gu.f999d) goto L4;
    L16:
        if (r0 != AbstractC0295Gu.f998c) goto L19;
    L78:
        return true;
    L9:
        if (C2108jm.f7408b.get((C2108jm) r02) != 1) goto L11;
    L14:
        r0 = AbstractC0295Gu.f997b;
    L19:
        if (r0 != AbstractC0295Gu.f997b) goto L74;
        Throwable r03 = null;
        Throwable r1 = null;
    L21:
        AtomicReferenceFieldUpdater r4 = f7529a;
        Object r5 = r4.get(this);
        if ((r5 instanceof C2108jm) == true) goto L23;
        if ((r5 instanceof InterfaceC1418fl) == false) goto L72;
        if (r1 != null) goto L53;
        r1 = m4359u(r10);
    L53:
        InterfaceC1418fl r6 = (InterfaceC1418fl) r5;
        if (r6.mo564d() == true) goto L55;
        Object r42 = m4353M(r5, new C0189Ea(r1, false));
        if (r42 == AbstractC0295Gu.f997b) goto L71;
        if (r42 == AbstractC0295Gu.f999d) goto L21;
        r0 = r42;
        goto L74
    L71:
        throw new IllegalStateException(("Cannot happen in " + r5).toString());
    L55:
        C0851Ts r7 = m4361y(r6);
        if (r7 == null) goto L21;
        C2108jm r8 = new C2108jm(r7, r1);
    L60:
        if (r4.compareAndSet(this, r6, r8) == true) goto L61;
        if (r4.get(this) == r6) goto L60;
    L61:
        m4348G(r7, r1);
        C2610v1 r102 = AbstractC0295Gu.f997b;
    L31:
        r0 = r102;
        goto L74
    L72:
        r102 = AbstractC0295Gu.f1000e;
        goto L31
    L23:
        monitor-enter(r5);
    L32:
        th = move-exception;
        throw th;
    L25:
        if (C2108jm.f7410d.get((C2108jm) r5) != AbstractC0295Gu.f1001f) goto L27;
        boolean r43 = true;
    L28:
        if (r43 == false) goto L34;
        r102 = AbstractC0295Gu.f1000e;     // Catch: Throwable -> L32
        monitor-exit(r5);
        goto L31
    L34:
        boolean r44 = ((C2108jm) r5).m4296c();     // Catch: Throwable -> L32
        if (r10 != null) goto L37;
        if (r44 == false) goto L37;
    L40:
        Throwable r103 = ((C2108jm) r5).m4295b();     // Catch: Throwable -> L32
        if (r44 == true) goto L43;
        r03 = r103;
    L43:
        monitor-exit(r5);
        if (r03 == null) goto L46;
        m4348G(((C2108jm) r5).f7411a, r03);
    L46:
        r102 = AbstractC0295Gu.f997b;
    L37:
        if (r1 != null) goto L39;
        r1 = m4359u(r10);     // Catch: Throwable -> L32
    L39:
        ((C2108jm) r5).m4294a(r1);     // Catch: Throwable -> L32
        goto L40
    L27:
        r43 = false;
    L74:
        if (r0 == AbstractC0295Gu.f997b) goto L78;
        if (r0 == AbstractC0295Gu.f998c) goto L78;
        if (r0 != AbstractC0295Gu.f1000e) goto L82;
        return false;
    L82:
        mo2728b(r0);
        return true;
    }

    @Override // p000.InterfaceC1332dm
    /* JADX INFO: renamed from: i */
    public final InterfaceC1487h9 mo1746i(C2152km r6) {
        C1531i9 r0 = new C1531i9(r6);
        r0.f5343d = this;
    L3:
        AtomicReferenceFieldUpdater r62 = f7529a;
        Object r1 = r62.get(this);
        if ((r1 instanceof C0280Gf) == true) goto L5;
        boolean r2 = r1 instanceof InterfaceC1418fl;
        C0937Vs r3 = C0937Vs.f2926a;
        Throwable r4 = null;
        if (r2 == false) goto L35;
        C0851Ts r22 = ((InterfaceC1418fl) r1).mo565e();
        if (r22 != null) goto L20;
        m4352K((AbstractC1507hm) r1);
        goto L3
    L20:
        if (r22.m2526c(r0, 7) == true) goto L33;
        boolean r12 = r22.m2526c(r0, 3);
        Object r63 = r62.get(this);
        if ((r63 instanceof C2108jm) == false) goto L26;
        r4 = ((C2108jm) r63).m4295b();
    L31:
        r0.mo1506k(r4);
        if (r12 == true) goto L33;
        return r3;
    L26:
        if ((r63 instanceof C0189Ea) == false) goto L28;
        C0189Ea r64 = (C0189Ea) r63;
    L29:
        if (r64 == null) goto L31;
        r4 = r64.f575a;
        goto L31
    L28:
        r64 = null;
    L33:
        return r0;
    L35:
        Object r65 = r62.get(this);
        if ((r65 instanceof C0189Ea) == false) goto L38;
        C0189Ea r66 = (C0189Ea) r65;
    L39:
        if (r66 == null) goto L41;
        r4 = r66.f575a;
    L41:
        r0.mo1506k(r4);
        return r3;
    L38:
        r66 = null;
        goto L39
    L5:
        C0280Gf r23 = (C0280Gf) r1;
        if (r23.f907a == true) goto L8;
        m4351J(r23);
    L8:
        if (r62.compareAndSet(this, r1, r0) == true) goto L33;
        if (r62.get(this) == r1) goto L8;
        goto L3
    }

    /* JADX INFO: renamed from: j */
    public final boolean m4356j(Throwable r4) {
        if (mo4346D() == true) goto L19;
        boolean r0 = r4 instanceof CancellationException;
        InterfaceC1487h9 r1 = (InterfaceC1487h9) f7530b.get(this);
        if (r1 != null) goto L8;
    L18:
        return r0;
    L8:
        if (r1 == C0937Vs.f2926a) goto L18;
        if (r1.mo1796b(r4) == true) goto L16;
        if (r0 == true) goto L20;
        return false;
    L20:
        return true;
    L16:
        return true;
    L19:
        return true;
    }

    /* JADX INFO: renamed from: k */
    public String mo4357k() {
        return "Job was cancelled";
    }

    @Override // p000.InterfaceC1137ac
    /* JADX INFO: renamed from: l */
    public final InterfaceC1137ac mo23l(InterfaceC1137ac r1) {
        return AbstractC1406fG.m2700Z(this, r1);
    }

    @Override // p000.InterfaceC1137ac
    /* JADX INFO: renamed from: m */
    public final InterfaceC1049Yb mo24m(InterfaceC1092Zb r2) {
        if (AbstractC0585Nj.m1134a(C1456gf.f5162f, r2) == false) goto L5;
        return this;
    L5:
        return null;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo729n(Throwable r2) {
        if ((r2 instanceof CancellationException) == false) goto L6;
        return true;
    L6:
        if (m4355h(r2) == true) goto L8;
        return false;
    L8:
        if (mo2730w() == false) goto L14;
        return true;
    L14:
        return false;
    }

    @Override // p000.InterfaceC1332dm
    /* JADX INFO: renamed from: o */
    public final InterfaceC2100je mo1747o(boolean r2, boolean r3, C1463gm r4) {
        if (r2 == false) goto L4;
        AbstractC1507hm r22 = new C0716Ql(r4);
    L6:
        return m4345C(r3, r22);
    L4:
        r22 = new C1443g9(1, r4);
        goto L6
    }

    @Override // p000.InterfaceC1332dm
    /* JADX INFO: renamed from: p */
    public final CancellationException mo1748p() {
        Object r0 = f7529a.get(this);
        CancellationException r3 = null;
        if ((r0 instanceof C2108jm) == false) goto L19;
        Throwable r02 = ((C2108jm) r0).m4295b();
        if (r02 == null) goto L17;
        String r1 = getClass().getSimpleName().concat(" is cancelling");
        if ((r02 instanceof CancellationException) == false) goto L9;
        r3 = (CancellationException) r02;
    L9:
        if (r3 == null) goto L11;
        return r3;
    L11:
        if (r1 != null) goto L14;
        r1 = mo4357k();
    L14:
        return new C1375em(r1, r02, this);
    L17:
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    L19:
        if ((r0 instanceof InterfaceC1418fl) == true) goto L32;
        if ((r0 instanceof C0189Ea) == false) goto L30;
        Throwable r03 = ((C0189Ea) r0).f575a;
        if ((r03 instanceof CancellationException) == false) goto L25;
        r3 = (CancellationException) r03;
    L25:
        if (r3 == null) goto L27;
        return r3;
    L27:
        return new C1375em(mo4357k(), r03, this);
    L30:
        return new C1375em(getClass().getSimpleName().concat(" has completed normally"), null, this);
    L32:
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // p000.InterfaceC1137ac
    /* JADX INFO: renamed from: q */
    public final Object mo25q(Object r1, Function2 r2) {
        return r2.mo446d(r1, this);
    }

    @Override // p000.InterfaceC1332dm
    /* JADX INFO: renamed from: r */
    public final void mo1749r(CancellationException r3) {
        if (r3 != null) goto L4;
        r3 = new C1375em(mo4357k(), null, this);
    L4:
        m4355h(r3);
    }

    @Override // p000.InterfaceC1137ac
    /* JADX INFO: renamed from: s */
    public final InterfaceC1137ac mo26s(InterfaceC1092Zb r2) {
        if (AbstractC0585Nj.m1134a(C1456gf.f5162f, r2) == true) goto L5;
        return this;
    L5:
        return C0366If.f1247a;
    }

    @Override // p000.InterfaceC1332dm
    public final boolean start() {
    L2:
        AtomicReferenceFieldUpdater r0 = f7529a;
        Object r1 = r0.get(this);
        if ((r1 instanceof C0280Gf) == true) goto L5;
        if ((r1 instanceof C1374el) == false) goto L38;
        C0851Ts r2 = ((C1374el) r1).f4909a;
    L18:
        if (r0.compareAndSet(this, r1, r2) == true) goto L37;
        if (r0.get(this) == r1) goto L18;
    L37:
        return true;
    L38:
        return false;
    L5:
        if (((C0280Gf) r1).f907a == true) goto L24;
        C0280Gf r22 = AbstractC0295Gu.f1003h;
    L9:
        if (r0.compareAndSet(this, r1, r22) == true) goto L19;
        if (r0.get(this) == r1) goto L9;
    L19:
        return true;
    L24:
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final void m4358t(InterfaceC1418fl r7, Object r8) {
        AtomicReferenceFieldUpdater r0 = f7530b;
        InterfaceC1487h9 r1 = (InterfaceC1487h9) r0.get(this);
        if (r1 == null) goto L5;
        r1.mo1795a();
        r0.set(this, C0937Vs.f2926a);
    L5:
        C0232Fa r12 = null;
        if ((r8 instanceof C0189Ea) == false) goto L8;
        C0189Ea r82 = (C0189Ea) r8;
    L9:
        if (r82 == null) goto L11;
        Throwable r83 = r82.f575a;
    L13:
        if ((r7 instanceof AbstractC1507hm) == true) goto L35;
        C0851Ts r72 = r7.mo565e();
        if (r72 == null) goto L45;
        r72.m2526c(new C2510so(1), 1);
        C1291cp r02 = (C1291cp) C1291cp.f4720a.get(r72);
    L22:
        if (AbstractC0585Nj.m1134a(r02, r72) == true) goto L32;
        if ((r02 instanceof AbstractC1507hm) == false) goto L31;
        ((AbstractC1507hm) r02).mo1506k(r83);     // Catch: Throwable -> L27
    L27:
        th = move-exception;
        if (r12 == null) goto L30;
        AbstractC0148Dc.m268b(r12, th);
        goto L31
    L30:
        r12 = new C0232Fa("Exception in completion handler " + r02 + " for " + this, th);
    L31:
        r02 = r02.m2529h();
        goto L22
    L32:
        if (r12 == null) goto L46;
        mo4343A(r12);
        return;
    L46:
        return;
    L45:
        return;
    L35:
        ((AbstractC1507hm) r7).mo1506k(r83);     // Catch: Throwable -> L16
        return;
    L16:
        th = move-exception;
        mo4343A(new C0232Fa("Exception in completion handler " + r7 + " for " + this, th));
        return;
    L11:
        r83 = null;
        goto L13
    L8:
        r82 = null;
        goto L9
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(getClass().getSimpleName() + '{' + m4342L(f7529a.get(this)) + '}');
        r0.append('@');
        r0.append(AbstractC0148Dc.m278l(this));
        return r0.toString();
    }

    /* JADX INFO: renamed from: u */
    public final Throwable m4359u(Object r5) {
        if (r5 != null) goto L4;
        boolean r0 = true;
    L5:
        CancellationException r1 = null;
        if (r0 == false) goto L11;
        Throwable r52 = (Throwable) r5;
        if (r52 == null) goto L10;
        return r52;
    L10:
        return new C1375em(mo4357k(), null, this);
    L11:
        C2152km r53 = (C2152km) ((InterfaceC0423Jt) r5);
        r53.getClass();
        Object r02 = f7529a.get(r53);
        if ((r02 instanceof C2108jm) == false) goto L15;
        Throwable r2 = ((C2108jm) r02).m4295b();
    L21:
        if ((r2 instanceof CancellationException) == false) goto L23;
        r1 = (CancellationException) r2;
    L23:
        if (r1 == null) goto L25;
        return r1;
    L25:
        return new C1375em("Parent job is ".concat(m4342L(r02)), r2, r53);
    L15:
        if ((r02 instanceof C0189Ea) == false) goto L18;
        r2 = ((C0189Ea) r02).f575a;
        goto L21
    L18:
        if ((r02 instanceof InterfaceC1418fl) == true) goto L27;
        r2 = null;
        goto L21
    L27:
        throw new IllegalStateException(("Cannot be cancelling child in this state: " + r02).toString());
    L4:
        r0 = r5 instanceof Throwable;
        goto L5
    }

    /* JADX INFO: renamed from: v */
    public final Object m4360v(C2108jm r9, Object r10) {
        Object r1 = null;
        Throwable r12 = null;
        if ((r10 instanceof C0189Ea) == false) goto L5;
        C0189Ea r0 = (C0189Ea) r10;
    L6:
        if (r0 == null) goto L8;
        Throwable r02 = r0.f575a;
    L9:
        monitor-enter(r9);
        r9.m4296c();     // Catch: Throwable -> L65
        ArrayList r2 = r9.m4297f(r02);     // Catch: Throwable -> L65
        if (r2.isEmpty() == true) goto L13;
        Iterator r3 = r2.iterator();     // Catch: Throwable -> L65
    L17:
        if (r3.hasNext() == false) goto L21;
        Object r5 = r3.next();     // Catch: Throwable -> L65
        if ((((Throwable) r5) instanceof CancellationException) == true) goto L17;
        r1 = r5;
    L21:
        r12 = (Throwable) r1;     // Catch: Throwable -> L65
        if (r12 != null) goto L26;
        r12 = (Throwable) r2.get(0);     // Catch: Throwable -> L65
    L26:
        if (r12 != null) goto L28;
    L42:
        monitor-exit(r9);
        if (r12 == null) goto L48;
        if (r12 == r02) goto L48;
        r10 = new C0189Ea(r12, false);
    L48:
        if (r12 != null) goto L50;
    L54:
        mo4349H(r10);
        AtomicReferenceFieldUpdater r03 = f7529a;
        if ((r10 instanceof InterfaceC1418fl) == false) goto L57;
        Object r13 = new C1462gl((InterfaceC1418fl) r10);
    L59:
        if (r03.compareAndSet(this, r9, r13) == true) goto L63;
        if (r03.get(this) == r9) goto L59;
    L63:
        m4358t(r9, r10);
        return r10;
    L57:
        r13 = r10;
        goto L59
    L50:
        if (m4356j(r12) == false) goto L52;
    L53:
        C0189Ea r04 = (C0189Ea) r10;
        r04.getClass();
        C0189Ea.f574b.compareAndSet(r04, 0, 1);
        goto L54
    L52:
        if (mo1799z(r12) == false) goto L54;
    L28:
        if (r2.size() <= 1) goto L42;
        Set r52 = Collections.newSetFromMap(new IdentityHashMap(r2.size()));     // Catch: Throwable -> L65
        Iterator r22 = r2.iterator();     // Catch: Throwable -> L65
    L31:
        if (r22.hasNext() == false) goto L42;
        Throwable r6 = (Throwable) r22.next();     // Catch: Throwable -> L65
        if (r6 == r12) goto L31;
        if (r6 == r12) goto L31;
        if ((r6 instanceof CancellationException) == true) goto L31;
        if (r52.add(r6) == false) goto L31;
        AbstractC0148Dc.m268b(r12, r6);     // Catch: Throwable -> L65
        goto L31
    L13:
        if (r9.m4296c() == false) goto L26;
        r12 = new C1375em(mo4357k(), null, this);     // Catch: Throwable -> L65
    L65:
        th = move-exception;
        throw th;
    L8:
        r02 = null;
        goto L9
    L5:
        r0 = null;
        goto L6
    }

    /* JADX INFO: renamed from: w */
    public boolean mo2730w() {
        return true;
    }

    /* JADX INFO: renamed from: x */
    public boolean mo2731x() {
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final C0851Ts m4361y(InterfaceC1418fl r4) {
        C0851Ts r0 = r4.mo565e();
        if (r0 == null) goto L5;
        return r0;
    L5:
        if ((r4 instanceof C0280Gf) == false) goto L9;
        return new C0851Ts();
    L9:
        if ((r4 instanceof AbstractC1507hm) == false) goto L13;
        m4352K((AbstractC1507hm) r4);
        return null;
    L13:
        throw new IllegalStateException(("State should have list: " + r4).toString());
    }

    /* JADX INFO: renamed from: z */
    public boolean mo1799z(Throwable r1) {
        return false;
    }
}
