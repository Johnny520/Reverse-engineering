package p000;

/* JADX INFO: renamed from: u8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0772u8 {

    /* JADX INFO: renamed from: a */
    public boolean f4664a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0735t8 f4665b;

    /* JADX INFO: renamed from: c */
    public boolean f4666c;

    /* JADX INFO: renamed from: a */
    public final void m2445a(InterfaceC0735t8 interfaceC0735t8) {
        synchronized (this) {
            while (this.f4666c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.f4665b == interfaceC0735t8) {
                return;
            }
            this.f4665b = interfaceC0735t8;
            if (this.f4664a) {
                interfaceC0735t8.onCancel();
            }
        }
    }
}
