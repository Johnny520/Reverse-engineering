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
        C2152km c2152km = this.f5343d;
        if (c2152km == null) {
            c2152km = null;
        }
        c2152km.getClass();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2152km.f7529a;
            Object obj = atomicReferenceFieldUpdater.get(c2152km);
            if (obj instanceof AbstractC1507hm) {
                if (obj != this) {
                    return;
                }
                C0280Gf c0280Gf = AbstractC0295Gu.f1003h;
                while (!atomicReferenceFieldUpdater.compareAndSet(c2152km, obj, c0280Gf)) {
                    if (atomicReferenceFieldUpdater.get(c2152km) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof InterfaceC1418fl) || ((InterfaceC1418fl) obj).mo565e() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C1291cp.f4720a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof C0854Tv) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                C1291cp c1291cp = (C1291cp) obj2;
                c1291cp.getClass();
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C1291cp.f4722c;
                C0854Tv c0854Tv = (C0854Tv) atomicReferenceFieldUpdater3.get(c1291cp);
                if (c0854Tv == null) {
                    c0854Tv = new C0854Tv(c1291cp);
                    atomicReferenceFieldUpdater3.set(c1291cp, c0854Tv);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, c0854Tv)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                c1291cp.m2527f();
                return;
            }
        }
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
    public abstract void mo1506k(Throwable th);

    @Override // p000.C1291cp
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0148Dc.m278l(this));
        sb.append("[job@");
        C2152km c2152km = this.f5343d;
        if (c2152km == null) {
            c2152km = null;
        }
        sb.append(AbstractC0148Dc.m278l(c2152km));
        sb.append(']');
        return sb.toString();
    }
}
