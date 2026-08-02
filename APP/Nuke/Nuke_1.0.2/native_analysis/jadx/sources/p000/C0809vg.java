package p000;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: vg */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0809vg extends Thread {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f11937h = 1;

    public /* synthetic */ C0809vg(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        C0846wg c0846wgM1319u;
        switch (this.f11937h) {
            case 0:
                break;
            default:
                Process.setThreadPriority(9);
                super.run();
                return;
        }
        while (true) {
            try {
                C0133dk c0133dk = C0846wg.f12495h;
                reentrantLock = C0846wg.f12497j;
                reentrantLock.lock();
                try {
                    c0846wgM1319u = C0160eb.m1319u();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (c0846wgM1319u == C0846wg.f12496i) {
                C0846wg.f12496i = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (c0846wgM1319u != null) {
                    c0846wgM1319u.mo277k();
                }
            }
        }
    }

    public /* synthetic */ C0809vg(String str) {
        super(str);
    }
}
