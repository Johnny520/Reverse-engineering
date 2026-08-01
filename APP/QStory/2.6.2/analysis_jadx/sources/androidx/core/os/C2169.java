package androidx.core.os;

/* JADX INFO: renamed from: androidx.core.os.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2169 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f6443;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC2170 f6444;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f6445;

    public void setOnCancelListener(InterfaceC2170 interfaceC2170) {
        synchronized (this) {
            while (this.f6443) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.f6444 == interfaceC2170) {
                return;
            }
            this.f6444 = interfaceC2170;
            if (this.f6445 && interfaceC2170 != null) {
                interfaceC2170.onCancel();
            }
        }
    }
}
