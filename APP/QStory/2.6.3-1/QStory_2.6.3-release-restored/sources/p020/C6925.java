package p020;

import android.os.Process;
import androidx.appcompat.app.C0954;
import io.ktor.client.plugins.api.C4718;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏子楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C6925 extends Thread {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17006 = 1;

    public /* synthetic */ C6925(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        C6924 c6924M8823;
        switch (this.f17006) {
            case 0:
                break;
            default:
                Process.setThreadPriority(9);
                super.run();
                return;
        }
        while (true) {
            try {
                C0954 c0954 = C6924.f16998;
                reentrantLock = C6924.f17002;
                reentrantLock.lock();
                try {
                    c6924M8823 = C4718.m8823();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (c6924M8823 == C6924.f17001) {
                C6924.f17001 = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (c6924M8823 != null) {
                    c6924M8823.mo11489();
                }
            }
        }
    }

    public /* synthetic */ C6925(String str) {
        super(str);
    }
}
