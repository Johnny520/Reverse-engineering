package p011;

import androidx.compose.animation.core.C0325;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import p007.InterfaceC6136;
import p017.AbstractC6238;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC6211 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public volatile AtomicInteger f17128 = new AtomicInteger(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C6203 f17129;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6136 f17130;

    public RunnableC6211(C6203 c6203, InterfaceC6136 interfaceC6136) {
        this.f17129 = c6203;
        this.f17130 = interfaceC6136;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0325 c0325;
        String strConcat = "OkHttp ".concat(this.f17129.f17085.f16716.m11546());
        C6203 c6203 = this.f17129;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            c6203.f17080.m11494();
            boolean z = false;
            try {
                try {
                    try {
                        this.f17130.mo980(c6203, c6203.m11639());
                        c0325 = c6203.f17087.f16730;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            AbstractC6238 abstractC6238 = AbstractC6238.f17198;
                            AbstractC6238.f17198.mo11724("Callback failure for ".concat(C6203.m11632(c6203)), 4, e);
                        } else {
                            this.f17130.mo992(c6203, e);
                        }
                        c0325 = c6203.f17087.f16730;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        c6203.cancel();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.initCause(th);
                            this.f17130.mo992(c6203, iOException);
                        }
                        if (!(th instanceof InterruptedException)) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        c0325 = c6203.f17087.f16730;
                    }
                } catch (Throwable th2) {
                    C0325 c03252 = c6203.f17087.f16730;
                    c03252.getClass();
                    C0325.m956(c03252, null, null, this, 3);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
            c0325.getClass();
            C0325.m956(c0325, null, null, this, 3);
        } finally {
            threadCurrentThread.setName(name);
        }
    }
}
