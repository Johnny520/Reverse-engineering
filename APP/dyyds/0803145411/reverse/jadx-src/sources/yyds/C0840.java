package yyds;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: yyds.ᛴᛴᲁᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0840 extends Thread {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f3868 = 1;

    public /* synthetic */ C0840(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        C0313 c0313M1191;
        switch (this.f3868) {
            case 0:
                break;
            case 1:
                Process.setThreadPriority(9);
                super.run();
                return;
            default:
                Process.setThreadPriority(10);
                super.run();
                return;
        }
        while (true) {
            try {
                reentrantLock = C0313.f1634;
                reentrantLock.lock();
                try {
                    c0313M1191 = AbstractC0427.m1191();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (c0313M1191 == C0313.f1631) {
                C0313.f1631 = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (c0313M1191 != null) {
                    c0313M1191.mo979();
                }
            }
        }
    }

    public /* synthetic */ C0840(Runnable runnable, String str) {
        super(runnable, str);
    }

    public /* synthetic */ C0840(String str) {
        super(str);
    }
}
