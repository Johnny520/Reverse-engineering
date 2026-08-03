package p000a;

import android.os.Handler;

/* JADX INFO: renamed from: a.ad */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0483ad<T> implements Runnable {

    /* JADX INFO: renamed from: a */
    public CallableC0279P6 f1807a;

    /* JADX INFO: renamed from: b */
    public C0297Q6 f1808b;

    /* JADX INFO: renamed from: c */
    public Handler f1809c;

    /* JADX INFO: renamed from: a.ad$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0297Q6 f1810a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f1811b;

        public a(C0297Q6 c0297q6, Object obj) {
            this.f1810a = c0297q6;
            this.f1811b = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: a.Q6 */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.f1810a.mo747a(this.f1811b);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        try {
            objCall = this.f1807a.call();
        } catch (Exception unused) {
            objCall = null;
        }
        this.f1809c.post(new a(this.f1808b, objCall));
    }
}
