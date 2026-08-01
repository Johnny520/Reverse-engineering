package androidx.core.os;

/* JADX INFO: renamed from: androidx.core.os.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3002 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f6789;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC3003 f6790;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f6791;

    public void setOnCancelListener(InterfaceC3003 interfaceC3003) {
        synchronized (this) {
            while (this.f6789) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.f6790 == interfaceC3003) {
                return;
            }
            this.f6790 = interfaceC3003;
            if (this.f6791 && interfaceC3003 != null) {
                interfaceC3003.onCancel();
            }
        }
    }
}
