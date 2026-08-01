package p013;

import androidx.compose.animation.core.C0325;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import p015.InterfaceC6209;
import p019.AbstractC6241;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲苏子.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC6185 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public volatile AtomicInteger f16922 = new AtomicInteger(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C6177 f16923;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6209 f16924;

    public RunnableC6185(C6177 c6177, InterfaceC6209 interfaceC6209) {
        this.f16923 = c6177;
        this.f16924 = interfaceC6209;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0325 c0325;
        String strConcat = "OkHttp ".concat(this.f16923.f16880.f16955.m11675());
        C6177 c6177 = this.f16923;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            c6177.f16875.m11501();
            boolean z = false;
            try {
                try {
                    try {
                        this.f16924.mo973(c6177, c6177.m11620());
                        c0325 = c6177.f16882.f16969;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            AbstractC6241 abstractC6241 = AbstractC6241.f17194;
                            AbstractC6241.f17194.mo11722("Callback failure for ".concat(C6177.m11613(c6177)), 4, e);
                        } else {
                            this.f16924.mo991(c6177, e);
                        }
                        c0325 = c6177.f16882.f16969;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        c6177.cancel();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.initCause(th);
                            this.f16924.mo991(c6177, iOException);
                        }
                        if (!(th instanceof InterruptedException)) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        c0325 = c6177.f16882.f16969;
                    }
                } catch (Throwable th2) {
                    C0325 c03252 = c6177.f16882.f16969;
                    c03252.getClass();
                    C0325.m955(c03252, null, null, this, 3);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
            c0325.getClass();
            C0325.m955(c0325, null, null, this, 3);
        } finally {
            threadCurrentThread.setName(name);
        }
    }
}
