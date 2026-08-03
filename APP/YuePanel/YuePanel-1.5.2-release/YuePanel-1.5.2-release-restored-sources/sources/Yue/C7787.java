package Yue;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: Yue.ۥۢۡۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7787 implements InterfaceC5124<Throwable, C8107> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f23327 = AtomicIntegerFieldUpdater.newUpdater(C7787.class, "_state");

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC5542 f23328;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6489
    public InterfaceC4433 f23330;

    @InterfaceC6399
    private volatile /* synthetic */ int _state = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final Thread f23329 = Thread.currentThread();

    public C7787(@InterfaceC6399 InterfaceC5542 interfaceC5542) {
        this.f23328 = interfaceC5542;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // Yue.InterfaceC5124
    public /* bridge */ /* synthetic */ C8107 invoke(Throwable th) {
        m24745(th);
        return C8107.f3222;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m24743() {
        while (true) {
            int i = this._state;
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m24744(i);
                        throw new C5667();
                    }
                }
            } else if (f23327.compareAndSet(this, i, 1)) {
                InterfaceC4433 interfaceC4433 = this.f23330;
                if (interfaceC4433 != null) {
                    interfaceC4433.mo5757();
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Void m24744(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m24745(@InterfaceC6489 Throwable th) {
        int i;
        do {
            i = this._state;
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                m24744(i);
                throw new C5667();
            }
        } while (!f23327.compareAndSet(this, i, 2));
        this.f23329.interrupt();
        this._state = 3;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m24746() {
        int i;
        this.f23330 = this.f23328.mo17162(true, true, this);
        do {
            i = this._state;
            if (i != 0) {
                if (i == 2 || i == 3) {
                    return;
                }
                m24744(i);
                throw new C5667();
            }
        } while (!f23327.compareAndSet(this, i, 0));
    }
}
