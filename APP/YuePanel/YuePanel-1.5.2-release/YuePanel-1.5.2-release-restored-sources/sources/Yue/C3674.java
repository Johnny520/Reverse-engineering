package Yue;

import android.os.CancellationSignal;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C3674 {

    /* JADX INFO: renamed from: ۥ */
    public boolean f450;

    /* JADX INFO: renamed from: ۥ۟ */
    public InterfaceC0218 f451;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Object f6497;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f6498;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۨۧ$ۥ */
    public interface InterfaceC0218 {
        void onCancel();
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: ۥ */
    public void m741() {
        synchronized (this) {
            try {
                if (this.f450) {
                    return;
                }
                this.f450 = true;
                this.f6498 = true;
                InterfaceC0218 interfaceC0218 = this.f451;
                Object obj = this.f6497;
                if (interfaceC0218 != null) {
                    try {
                        interfaceC0218.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f6498 = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f6498 = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public Object m742() {
        Object obj;
        synchronized (this) {
            try {
                if (this.f6497 == null) {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    this.f6497 = cancellationSignal;
                    if (this.f450) {
                        cancellationSignal.cancel();
                    }
                }
                obj = this.f6497;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean m10065() {
        boolean z;
        synchronized (this) {
            z = this.f450;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m10066(@InterfaceC6490 InterfaceC0218 interfaceC0218) {
        synchronized (this) {
            try {
                m10068();
                if (this.f451 == interfaceC0218) {
                    return;
                }
                this.f451 = interfaceC0218;
                if (this.f450 && interfaceC0218 != null) {
                    interfaceC0218.onCancel();
                }
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m10067() {
        if (m10065()) {
            throw new C6576();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m10068() {
        while (this.f6498) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
