package p000;

/* JADX INFO: renamed from: O6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0609O6 {

    /* JADX INFO: renamed from: a */
    public boolean f1951a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0566N6 f1952b;

    /* JADX INFO: renamed from: c */
    public boolean f1953c;

    /* JADX INFO: renamed from: a */
    public final void m1188a(InterfaceC0566N6 interfaceC0566N6) {
        synchronized (this) {
            while (this.f1953c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.f1952b == interfaceC0566N6) {
                return;
            }
            this.f1952b = interfaceC0566N6;
            if (this.f1951a) {
                interfaceC0566N6.onCancel();
            }
        }
    }
}
