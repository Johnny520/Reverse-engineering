package androidx.core.os;

/* JADX INFO: renamed from: androidx.core.os.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2169 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f6444;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC2170 f6445;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f6446;

    public void setOnCancelListener(InterfaceC2170 interfaceC2170) {
        synchronized (this) {
            while (this.f6444) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.f6445 == interfaceC2170) {
                return;
            }
            this.f6445 = interfaceC2170;
            if (this.f6446 && interfaceC2170 != null) {
                interfaceC2170.onCancel();
            }
        }
    }
}
