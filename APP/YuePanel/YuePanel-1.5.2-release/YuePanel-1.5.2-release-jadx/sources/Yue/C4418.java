package Yue;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4418<T> extends C7242<T> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9147 = AtomicIntegerFieldUpdater.newUpdater(C4418.class, "_decision");

    @InterfaceC6399
    private volatile /* synthetic */ int _decision;

    public C4418(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        super(interfaceC4225, interfaceC4199);
        this._decision = 0;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    private final boolean m12842() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f9147.compareAndSet(this, 0, 2));
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۤ, reason: contains not printable characters */
    private final boolean m12843() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f9147.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // Yue.C7242, Yue.C5557
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
    public void mo9504(@InterfaceC6489 Object obj) {
        mo5778(obj);
    }

    @Override // Yue.C7242, Yue.AbstractC2980
    /* JADX INFO: renamed from: ۥ۟۠۟ۧ */
    public void mo5778(@InterfaceC6489 Object obj) {
        if (m12842()) {
            return;
        }
        C4417.m12840(C5501.m17135(this.f21885), C4056.m1009(obj, this.f21885), null, 2, null);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۠۠ۢ, reason: contains not printable characters */
    public final Object m12844() {
        if (m12843()) {
            return C5508.m17142();
        }
        Object objM17327 = C5561.m17327(m17273());
        if (objM17327 instanceof C4050) {
            throw ((C4050) objM17327).f637;
        }
        return objM17327;
    }
}
