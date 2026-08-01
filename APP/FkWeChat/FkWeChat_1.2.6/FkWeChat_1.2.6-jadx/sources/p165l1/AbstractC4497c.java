package p165l1;

import android.os.Handler;
import android.os.Looper;
import p010a9.InterfaceC0173a;

/* JADX INFO: renamed from: l1.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4497c {

    /* JADX INFO: renamed from: a */
    public static final Handler f13027a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a */
    public static void m17405a(InterfaceC0173a interfaceC0173a) {
        interfaceC0173a.invoke();
    }

    /* JADX INFO: renamed from: b */
    public static final long m17406b() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: c */
    public static final Object m17407c(long j10, final InterfaceC0173a interfaceC0173a) {
        Runnable runnable = new Runnable() { // from class: l1.b
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4497c.m17405a(interfaceC0173a);
            }
        };
        f13027a.postDelayed(runnable, j10);
        return runnable;
    }

    /* JADX INFO: renamed from: d */
    public static final void m17408d(Object obj) {
        if ((obj instanceof Runnable ? (Runnable) obj : null) == null) {
            return;
        }
        f13027a.removeCallbacks((Runnable) obj);
    }
}
