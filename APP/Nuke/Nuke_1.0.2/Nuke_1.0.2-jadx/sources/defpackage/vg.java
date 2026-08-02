package defpackage;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vg extends Thread {
    public final /* synthetic */ int h = 1;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0003: CONSTRUCTOR (r2v0 java.lang.Runnable) A[MD:(java.lang.Runnable):void (c)] (LINE:4) call: java.lang.Thread.<init>(java.lang.Runnable):void type: SUPER */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ vg(Runnable runnable) {
        super(runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        wg wgVarU;
        switch (this.h) {
            case 0:
                break;
            default:
                Process.setThreadPriority(9);
                super.run();
                return;
        }
        while (true) {
            try {
                dk dkVar = wg.h;
                reentrantLock = wg.j;
                reentrantLock.lock();
                try {
                    wgVarU = eb.u();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (wgVarU == wg.i) {
                wg.i = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (wgVarU != null) {
                    wgVarU.k();
                }
            }
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0003: CONSTRUCTOR (r2v0 java.lang.String) A[MD:(java.lang.String):void (c)] call: java.lang.Thread.<init>(java.lang.String):void type: SUPER */
    public /* synthetic */ vg(String str) {
        super(str);
    }
}
