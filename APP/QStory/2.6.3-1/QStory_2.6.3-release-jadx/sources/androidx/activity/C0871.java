package androidx.activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0871 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f397;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f398;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f399;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f400;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0883 f401;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Executor f402;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final RunnableC0896 f403;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f404;

    public C0871(Executor executor, C0883 c0883) {
        executor.getClass();
        this.f402 = executor;
        this.f401 = c0883;
        this.f400 = new Object();
        this.f404 = new ArrayList();
        this.f403 = new RunnableC0896(this, 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m589() {
        int i;
        synchronized (this.f400) {
            if (!this.f397 && (i = this.f399) > 0) {
                int i2 = i - 1;
                this.f399 = i2;
                if (!this.f398 && i2 == 0) {
                    this.f398 = true;
                    this.f402.execute(this.f403);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m590() {
        synchronized (this.f400) {
            try {
                this.f397 = true;
                Iterator it = this.f404.iterator();
                while (it.hasNext()) {
                    ((InterfaceC7372) it.next()).invoke();
                }
                this.f404.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
