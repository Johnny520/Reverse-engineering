package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: sv */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0741sv implements InterfaceC0662qr {

    /* JADX INFO: renamed from: d */
    public final Context f5838d;

    /* JADX INFO: renamed from: e */
    public final C0703rv f5839e;

    /* JADX INFO: renamed from: f */
    public final C0675r3 f5840f;

    /* JADX INFO: renamed from: g */
    public final Object f5841g = new Object();

    /* JADX INFO: renamed from: h */
    public Handler f5842h;

    /* JADX INFO: renamed from: i */
    public ThreadPoolExecutor f5843i;

    /* JADX INFO: renamed from: j */
    public ThreadPoolExecutor f5844j;

    /* JADX INFO: renamed from: k */
    public s91 f5845k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0741sv(Context context, C0703rv c0703rv) {
        v50.m4402g(context, "Context cannot be null");
        this.f5838d = context.getApplicationContext();
        this.f5839e = c0703rv;
        this.f5840f = C0780tv.f6051d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0662qr
    /* JADX INFO: renamed from: a */
    public final void mo3324a(s91 s91Var) {
        synchronized (this.f5841g) {
            this.f5845k = s91Var;
        }
        synchronized (this.f5841g) {
            try {
                if (this.f5845k == null) {
                    return;
                }
                if (this.f5843i == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0248gj("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f5844j = threadPoolExecutor;
                    this.f5843i = threadPoolExecutor;
                }
                this.f5843i.execute(new RunnableC0912x3(4, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m4106b() {
        synchronized (this.f5841g) {
            try {
                this.f5845k = null;
                Handler handler = this.f5842h;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f5842h = null;
                ThreadPoolExecutor threadPoolExecutor = this.f5844j;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f5843i = null;
                this.f5844j = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C0107cw m4107c() {
        try {
            C0675r3 c0675r3 = this.f5840f;
            Context context = this.f5838d;
            C0703rv c0703rv = this.f5839e;
            c0675r3.getClass();
            C0070bw c0070bwM3333a = AbstractC0666qv.m3333a(context, List.of(c0703rv));
            int i = c0070bwM3333a.f594d;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            C0107cw[] c0107cwArr = (C0107cw[]) ((List) c0070bwM3333a.f595e).get(0);
            if (c0107cwArr == null || c0107cwArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return c0107cwArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
