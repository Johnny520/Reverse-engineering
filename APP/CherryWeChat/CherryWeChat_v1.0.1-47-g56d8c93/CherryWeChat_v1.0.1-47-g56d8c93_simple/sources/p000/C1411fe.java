package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: fe */
/* JADX INFO: loaded from: classes.dex */
public final class C1411fe extends C2339ox {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4992e = null;
    private volatile /* synthetic */ int _decision$volatile;

    static {
        f4992e = AtomicIntegerFieldUpdater.newUpdater(C1411fe.class, "_decision$volatile");
    }

    @Override // p000.C2339ox, p000.C2152km
    /* JADX INFO: renamed from: b */
    public final void mo2728b(Object r1) {
        mo2729g(r1);
    }

    @Override // p000.C2339ox, p000.C2152km
    /* JADX INFO: renamed from: g */
    public final void mo2729g(Object r4) {
    L2:
        AtomicIntegerFieldUpdater r0 = f4992e;
        int r1 = r0.get(this);
        if (r1 != 0) goto L5;
        if (r0.compareAndSet(this, 0, 2) == false) goto L2;
        return;
    L5:
        if (r1 != 1) goto L9;
        AbstractC1406fG.m2711k0(AbstractC0628Oj.m1225E(this.f8210d), AbstractC0714Qj.m1472C(r4));
        return;
    L9:
        throw new IllegalStateException("Already resumed");
    }
}
