package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: hm */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1507hm extends C1291cp implements InterfaceC2100je, InterfaceC1418fl {

    /* JADX INFO: renamed from: d */
    public C2152km f5343d;

    @Override // p000.InterfaceC2100je
    /* JADX INFO: renamed from: a */
    public final void mo1795a() {
        C2152km r0 = this.f5343d;
        if (r0 != null) goto L6;
        r0 = null;
    L6:
        r0.getClass();
    L7:
        AtomicReferenceFieldUpdater r1 = C2152km.f7529a;
        Object r2 = r1.get(r0);
        if ((r2 instanceof AbstractC1507hm) == false) goto L19;
        if (r2 != this) goto L51;
        C0280Gf r3 = AbstractC0295Gu.f1003h;
    L13:
        if (r1.compareAndSet(r0, r2, r3) == true) goto L52;
        if (r1.get(r0) == r2) goto L13;
    L52:
        return;
    L51:
        return;
    L19:
        if ((r2 instanceof InterfaceC1418fl) == true) goto L21;
        return;
    L21:
        if (((InterfaceC1418fl) r2).mo565e() == null) goto L50;
    L22:
        AtomicReferenceFieldUpdater r02 = C1291cp.f4720a;
        Object r12 = r02.get(this);
        if ((r12 instanceof C0854Tv) == true) goto L53;
        if (r12 == this) goto L26;
        C1291cp r22 = (C1291cp) r12;
        r22.getClass();
        AtomicReferenceFieldUpdater r32 = C1291cp.f4722c;
        C0854Tv r4 = (C0854Tv) r32.get(r22);
        if (r4 != null) goto L32;
        r4 = new C0854Tv(r22);
        r32.set(r22, r4);
    L32:
        if (r02.compareAndSet(this, r12, r4) == true) goto L33;
        if (r02.get(this) == r12) goto L32;
    L33:
        r22.m2527f();
        return;
    L26:
        C1291cp r13 = (C1291cp) r12;
        return;
    L53:
        return;
    }

    @Override // p000.InterfaceC1418fl
    /* JADX INFO: renamed from: d */
    public final boolean mo564d() {
        return true;
    }

    @Override // p000.InterfaceC1418fl
    /* JADX INFO: renamed from: e */
    public final C0851Ts mo565e() {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public abstract boolean mo1505j();

    /* JADX INFO: renamed from: k */
    public abstract void mo1506k(Throwable r1);

    @Override // p000.C1291cp
    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(getClass().getSimpleName());
        r0.append('@');
        r0.append(AbstractC0148Dc.m278l(this));
        r0.append("[job@");
        C2152km r1 = this.f5343d;
        if (r1 != null) goto L6;
        r1 = null;
    L6:
        r0.append(AbstractC0148Dc.m278l(r1));
        r0.append(']');
        return r0.toString();
    }
}
