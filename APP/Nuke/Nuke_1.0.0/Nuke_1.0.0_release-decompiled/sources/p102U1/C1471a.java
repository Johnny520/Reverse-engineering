package p102U1;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;
import p013C0.C0236c;
import p191k4.C2475a;
import p208n4.C2703b;

/* JADX INFO: renamed from: U1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1471a extends Thread {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5153d = 0;

    public /* synthetic */ C1471a(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        C2703b c2703bM4414c;
        switch (this.f5153d) {
            case 0:
                Process.setThreadPriority(9);
                super.run();
                return;
        }
        while (true) {
            try {
                C0236c c0236c = C2703b.f8616h;
                reentrantLock = C2703b.f8618j;
                reentrantLock.lock();
                try {
                    c2703bM4414c = C2475a.m4414c();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
            }
            if (c2703bM4414c == C2703b.f8617i) {
                C2703b.f8617i = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (c2703bM4414c != null) {
                    c2703bM4414c.mo3347k();
                }
            }
        }
    }

    public /* synthetic */ C1471a(String str) {
        super(str);
    }
}
