package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: fe */
/* JADX INFO: loaded from: classes.dex */
public final class C1411fe extends C2339ox {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4992e = AtomicIntegerFieldUpdater.newUpdater(C1411fe.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // p000.C2339ox, p000.C2152km
    /* JADX INFO: renamed from: b */
    public final void mo2728b(Object obj) throws C1324de {
        mo2729g(obj);
    }

    @Override // p000.C2339ox, p000.C2152km
    /* JADX INFO: renamed from: g */
    public final void mo2729g(Object obj) throws C1324de {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f4992e;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                AbstractC1406fG.m2711k0(AbstractC0628Oj.m1225E(this.f8210d), AbstractC0714Qj.m1472C(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
