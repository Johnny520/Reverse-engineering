package p000;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: mc */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0334mc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final long f573a;

    /* JADX INFO: renamed from: b */
    public final Object f574b;

    /* JADX INFO: renamed from: c */
    public final Object f575c;

    /* JADX INFO: renamed from: d */
    public int f576d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC0334mc(long j, Object obj, Object obj2) {
        this.f573a = j;
        this.f574b = obj;
        this.f575c = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        synchronized (AbstractC0366oc.f652a) {
            if (this.f573a == AbstractC0366oc.f659h && AbstractC0366oc.f658g == this) {
                try {
                    Object obj = this.f574b;
                    Object obj2 = this.f575c;
                    AbstractC0366oc.m773d(5, obj);
                    AbstractC0366oc.m773d(5, obj2);
                } catch (Throwable th) {
                    AbstractC0198e7.m343a("reply-no-at", "delayed-scrub-stage", th);
                }
                synchronized (AbstractC0366oc.f652a) {
                    try {
                        if (this.f573a == AbstractC0366oc.f659h && AbstractC0366oc.f658g == this) {
                            int i = this.f576d;
                            int i2 = i + 1;
                            this.f576d = i2;
                            long[] jArr = AbstractC0366oc.f653b;
                            if (i2 >= 3) {
                                AbstractC0366oc.f658g = null;
                                return;
                            }
                            long j = jArr[i2] - jArr[i];
                            if (AbstractC0366oc.f657f == null) {
                                AbstractC0366oc.f657f = new Handler(Looper.getMainLooper());
                            }
                            AbstractC0366oc.f657f.postDelayed(this, j);
                        }
                    } finally {
                    }
                }
            }
        }
    }
}
