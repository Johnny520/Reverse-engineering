package androidx.activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0024 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f52;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f53;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f54;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f55;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0036 f56;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Executor f57;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final RunnableC0049 f58;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f59;

    public C0024(Executor executor, C0036 c0036) {
        executor.getClass();
        this.f57 = executor;
        this.f56 = c0036;
        this.f55 = new Object();
        this.f59 = new ArrayList();
        this.f58 = new RunnableC0049(this, 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m29() {
        int i;
        synchronized (this.f55) {
            if (!this.f52 && (i = this.f54) > 0) {
                int i2 = i - 1;
                this.f54 = i2;
                if (!this.f53 && i2 == 0) {
                    this.f53 = true;
                    this.f57.execute(this.f58);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m30() {
        synchronized (this.f55) {
            try {
                this.f52 = true;
                Iterator it = this.f59.iterator();
                while (it.hasNext()) {
                    ((InterfaceC6543) it.next()).invoke();
                }
                this.f59.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
