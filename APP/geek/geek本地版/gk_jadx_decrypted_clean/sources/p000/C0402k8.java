package p000;

/* JADX INFO: renamed from: k8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0402k8 {

    /* JADX INFO: renamed from: a */
    public boolean f2732a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0365j8 f2733b;

    /* JADX INFO: renamed from: c */
    public boolean f2734c;

    /* JADX INFO: renamed from: a */
    public final void m1643a(InterfaceC0365j8 interfaceC0365j8) {
        synchronized (this) {
            while (this.f2734c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.f2733b == interfaceC0365j8) {
                return;
            }
            this.f2733b = interfaceC0365j8;
            if (this.f2732a) {
                interfaceC0365j8.onCancel();
            }
        }
    }
}
