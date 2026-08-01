package p004;

import android.os.Process;
import androidx.appcompat.app.C0107;
import io.ktor.client.plugins.api.C3886;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏子楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C6096 extends Thread {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16661 = 1;

    public /* synthetic */ C6096(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        C6095 c6095M8264;
        switch (this.f16661) {
            case 0:
                break;
            default:
                Process.setThreadPriority(9);
                super.run();
                return;
        }
        while (true) {
            try {
                C0107 c0107 = C6095.f16653;
                reentrantLock = C6095.f16657;
                reentrantLock.lock();
                try {
                    c6095M8264 = C3886.m8264();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (c6095M8264 == C6095.f16656) {
                C6095.f16656 = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (c6095M8264 != null) {
                    c6095M8264.mo10930();
                }
            }
        }
    }

    public /* synthetic */ C6096(String str) {
        super(str);
    }
}
