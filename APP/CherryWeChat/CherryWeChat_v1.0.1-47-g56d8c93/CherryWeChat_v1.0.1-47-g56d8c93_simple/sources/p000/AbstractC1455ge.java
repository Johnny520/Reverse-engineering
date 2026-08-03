package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ge */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1455ge extends AbstractRunnableC1532iA {

    /* JADX INFO: renamed from: c */
    public int f5157c;

    public AbstractC1455ge(int r4) {
        super(0, false);
        this.f5157c = r4;
    }

    /* JADX INFO: renamed from: a */
    public void mo1010a(CancellationException r1) {
    }

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC0190Eb mo1011b();

    /* JADX INFO: renamed from: d */
    public Throwable mo1013d(Object r3) {
        if ((r3 instanceof C0189Ea) == false) goto L5;
        C0189Ea r32 = (C0189Ea) r3;
    L6:
        if (r32 != null) goto L8;
        return null;
    L8:
        return r32.f575a;
    L5:
        r32 = null;
        goto L6
    }

    /* JADX INFO: renamed from: g */
    public Object mo1014g(Object r1) {
        return r1;
    }

    /* JADX INFO: renamed from: h */
    public final void m2782h(Throwable r4) {
        AbstractC0628Oj.m1222B(mo1011b().mo263e(), new C1541ic("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", r4));
    }

    /* JADX INFO: renamed from: i */
    public abstract Object mo1015i();

    @Override // java.lang.Runnable
    public final void run() {
        C1367ee r0 = (C1367ee) mo1011b();     // Catch: Throwable -> L6 C1324de -> L8
        AbstractC0233Fb r1 = r0.f4895e;     // Catch: Throwable -> L6 C1324de -> L8
        InterfaceC1137ac r2 = r1.f731b;     // Catch: Throwable -> L6 C1324de -> L8
        Object r02 = AbstractC0295Gu.m604E(r2, r0.f4897g);     // Catch: Throwable -> L6 C1324de -> L8
        InterfaceC1332dm r4 = null;
        if (r02 == AbstractC0295Gu.f1005j) goto L10;
        C2664wC r3 = AbstractC0148Dc.m289w(r1, r2, r02);     // Catch: Throwable -> L6 C1324de -> L8
    L43:
        Object r5 = mo1015i();     // Catch: Throwable -> L21
        Throwable r6 = mo1013d(r5);     // Catch: Throwable -> L21
        if (r6 != null) goto L23;
        int r7 = this.f5157c;     // Catch: Throwable -> L21
        boolean r8 = true;
        if (r7 != 1) goto L16;
    L19:
        if (r8 == false) goto L23;
        r4 = (InterfaceC1332dm) r2.mo24m(C1456gf.f5162f);     // Catch: Throwable -> L21
        goto L23
    L16:
        if (r7 == 2) goto L19;
        r8 = false;
    L23:
        if (r4 != null) goto L25;
    L27:
        if (r6 == null) goto L29;
        r1.mo264f(new C0297Gw(r6));     // Catch: Throwable -> L21
    L30:
        if (r3 != null) goto L32;
    L33:
        AbstractC0295Gu.m601B(r2, r02);     // Catch: Throwable -> L6 C1324de -> L8
        return;
    L32:
        if (r3.m5231P() == true) goto L33;
        return;
    L29:
        r1.mo264f(mo1014g(r5));     // Catch: Throwable -> L21
        goto L30
    L25:
        if (r4.mo1745d() == true) goto L27;
        CancellationException r42 = r4.mo1748p();     // Catch: Throwable -> L21
        mo1010a(r42);     // Catch: Throwable -> L21
        r1.mo264f(new C0297Gw(r42));     // Catch: Throwable -> L21
    L21:
        th = move-exception;
        if (r3 != null) goto L37;
    L38:
        AbstractC0295Gu.m601B(r2, r02);     // Catch: Throwable -> L6 C1324de -> L8
    L39:
        throw th;     // Catch: Throwable -> L6 C1324de -> L8
    L37:
        if (r3.m5231P() == false) goto L39;
    L10:
        r3 = null;
    L8:
        e = move-exception;
        AbstractC0628Oj.m1222B(mo1011b().mo263e(), e.f4800a);
        return;
    L6:
        th = move-exception;
        m2782h(th);
    }
}
