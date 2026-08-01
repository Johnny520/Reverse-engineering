package p027;

import androidx.compose.animation.core.C1171;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import p023.InterfaceC6965;
import p033.AbstractC7067;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC7040 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public volatile AtomicInteger f17473 = new AtomicInteger(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C7032 f17474;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6965 f17475;

    public RunnableC7040(C7032 c7032, InterfaceC6965 interfaceC6965) {
        this.f17474 = c7032;
        this.f17475 = interfaceC6965;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1171 c1171;
        String strConcat = "OkHttp ".concat(this.f17474.f17430.f17061.m12105());
        C7032 c7032 = this.f17474;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            c7032.f17425.m12053();
            boolean z = false;
            try {
                try {
                    try {
                        this.f17475.mo1540(c7032, c7032.m12198());
                        c1171 = c7032.f17432.f17075;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            AbstractC7067 abstractC7067 = AbstractC7067.f17543;
                            AbstractC7067.f17543.mo12283("Callback failure for ".concat(C7032.m12191(c7032)), 4, e);
                        } else {
                            this.f17475.mo1552(c7032, e);
                        }
                        c1171 = c7032.f17432.f17075;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        c7032.cancel();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.initCause(th);
                            this.f17475.mo1552(c7032, iOException);
                        }
                        if (!(th instanceof InterruptedException)) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        c1171 = c7032.f17432.f17075;
                    }
                } catch (Throwable th2) {
                    C1171 c11712 = c7032.f17432.f17075;
                    c11712.getClass();
                    C1171.m1516(c11712, null, null, this, 3);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
            c1171.getClass();
            C1171.m1516(c1171, null, null, this, 3);
        } finally {
            threadCurrentThread.setName(name);
        }
    }
}
