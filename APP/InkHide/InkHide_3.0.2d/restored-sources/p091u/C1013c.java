package p091u;

/* JADX INFO: renamed from: u.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1013c {

    /* JADX INFO: renamed from: a */
    public boolean f3609a;

    /* JADX INFO: renamed from: b */
    public InterfaceC1012b f3610b;

    /* JADX INFO: renamed from: c */
    public boolean f3611c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2214a(InterfaceC1012b interfaceC1012b) {
        synchronized (this) {
            while (this.f3611c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.f3610b == interfaceC1012b) {
                return;
            }
            this.f3610b = interfaceC1012b;
            if (this.f3609a) {
                interfaceC1012b.mo125o();
            }
        }
    }
}
