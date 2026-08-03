package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: g9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1443g9 extends AbstractC1507hm {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f5053e;

    /* JADX INFO: renamed from: f */
    public final Object f5054f;

    public /* synthetic */ C1443g9(int r1, Object r2) {
        this.f5053e = r1;
        this.f5054f = r2;
    }

    @Override // p000.AbstractC1507hm
    /* JADX INFO: renamed from: j */
    public final boolean mo1505j() {
        switch(this.f5053e) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return false;
    L6:
        return true;
    }

    @Override // p000.AbstractC1507hm
    /* JADX INFO: renamed from: k */
    public final void mo1506k(Throwable r8) {
        switch(this.f5053e) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((C1463gm) this.f5054f).mo90g(r8);
        return;
    L6:
        C0523M6 r82 = (C0523M6) this.f5054f;
        C2152km r0 = this.f5343d;
        if (r0 != null) goto L10;
        r0 = null;
    L10:
        CancellationException r02 = r0.mo1748p();
        if (r82.m1020n() == false) goto L27;
        C1367ee r2 = (C1367ee) r82.f1710d;
        AtomicReferenceFieldUpdater r3 = C1367ee.f4893h;
    L14:
        Object r4 = r3.get(r2);
        C2610v1 r5 = AbstractC1406fG.f4984c;
        if (AbstractC0585Nj.m1134a(r4, r5) == true) goto L17;
        if ((r4 instanceof Throwable) == true) goto L50;
    L26:
        if (r3.compareAndSet(r2, r4, null) == true) goto L27;
        if (r3.get(r2) == r4) goto L26;
    L50:
        return;
    L17:
        if (r3.compareAndSet(r2, r5, r02) == true) goto L49;
        if (r3.get(r2) == r5) goto L17;
    L49:
        return;
    L27:
        r82.m1017k(r02);
        if (r82.m1020n() == true) goto L47;
        AtomicReferenceFieldUpdater r03 = C0523M6.f1709h;
        InterfaceC2100je r1 = (InterfaceC2100je) r03.get(r82);
        if (r1 == null) goto L48;
        r1.mo1795a();
        r03.set(r82, C0937Vs.f2926a);
        return;
    L48:
        return;
    }
}
