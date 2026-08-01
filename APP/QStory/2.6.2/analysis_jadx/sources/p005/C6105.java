package p005;

import android.os.Process;
import androidx.appcompat.app.C0107;
import java.util.concurrent.locks.ReentrantLock;
import p305.C8631;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏楪子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C6105 extends Thread {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16671 = 1;

    public /* synthetic */ C6105(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        C6104 c6104M14293;
        switch (this.f16671) {
            case 0:
                break;
            default:
                Process.setThreadPriority(9);
                super.run();
                return;
        }
        while (true) {
            try {
                C0107 c0107 = C6104.f16663;
                reentrantLock = C6104.f16667;
                reentrantLock.lock();
                try {
                    c6104M14293 = C8631.m14293();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (c6104M14293 == C6104.f16666) {
                C6104.f16666 = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (c6104M14293 != null) {
                    c6104M14293.mo10873();
                }
            }
        }
    }

    public /* synthetic */ C6105(String str) {
        super(str);
    }
}
