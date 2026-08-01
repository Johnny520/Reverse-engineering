package p000;

import android.os.Handler;
import android.os.Looper;
import com.p001mr.elaris.AbstractC0152f;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import java.io.File;

/* JADX INFO: renamed from: i0 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0255i0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f368a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f369b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0255i0(int i, int i2) {
        this.f368a = i2;
        this.f369b = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.f368a) {
            case 0:
                C0191e0 c0191e0 = AbstractC0033c0.f73c;
                File file = null;
                try {
                    if (HookEntry.hostContext() != null) {
                        file = new File(HookEntry.hostContext().getFilesDir(), "elaris_anti_recall_status_v2");
                    }
                } catch (Throwable unused) {
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                synchronized (c0191e0) {
                    c0191e0.m342c(jCurrentTimeMillis, file);
                }
                new Handler(Looper.getMainLooper()).post(new RunnableC0239h0(i, this));
                return;
            case 1:
                int i2 = this.f369b;
                try {
                    if (HookEntry.runtimeBool(Prefs.KEY_DEBUG_LOG)) {
                        HookEntry.log("clock-in scheduler started, next=".concat(AbstractC0008a7.m63t()));
                    }
                    while (AbstractC0008a7.m39A(i2)) {
                        long jM62s = AbstractC0008a7.m62s();
                        if (jM62s > 0) {
                            if (HookEntry.runtimeBool(Prefs.KEY_DEBUG_LOG)) {
                                HookEntry.log("clock-in wait " + jM62s + "ms, next=" + AbstractC0008a7.m63t());
                            }
                            AbstractC0008a7.m45b(i2, jM62s);
                        }
                        if (!AbstractC0008a7.m39A(i2)) {
                            AbstractC0008a7.f26a.set(false);
                            return;
                        }
                        try {
                            AbstractC0008a7.m44a();
                        } catch (Throwable th) {
                            if (HookEntry.runtimeBool(Prefs.KEY_DEBUG_LOG)) {
                                HookEntry.log("auto clock-in failed: " + th);
                            }
                        }
                        AbstractC0008a7.m45b(i2, AbstractC0008a7.m62s());
                        break;
                    }
                    AbstractC0008a7.f26a.set(false);
                    return;
                } catch (Throwable th2) {
                    AbstractC0008a7.f26a.set(false);
                    throw th2;
                }
            default:
                int i3 = this.f369b;
                try {
                    HookEntry.logAlways("keep-fire scheduler started, next=".concat(AbstractC0152f.m215l()));
                    while (AbstractC0152f.m226w(i3)) {
                        long jM214k = AbstractC0152f.m214k(AbstractC0152f.m209f());
                        if (jM214k > 0) {
                            AbstractC0152f.m205b(i3, jM214k);
                        }
                        if (!AbstractC0152f.m226w(i3)) {
                            AbstractC0152f.f120a.set(false);
                            return;
                        }
                        try {
                            AbstractC0152f.m204a();
                        } catch (Throwable th3) {
                            HookEntry.logAlways("keep-fire auto failed: " + th3.getClass().getSimpleName() + ": " + th3.getMessage());
                        }
                        AbstractC0152f.m205b(i3, AbstractC0152f.m214k(AbstractC0152f.m209f()));
                        break;
                    }
                    AbstractC0152f.f120a.set(false);
                    return;
                } catch (Throwable th4) {
                    AbstractC0152f.f120a.set(false);
                    throw th4;
                }
        }
    }
}
