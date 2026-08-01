package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: vk */
/* JADX INFO: loaded from: classes.dex */
public final class C0822vk implements InterfaceC0152di {

    /* JADX INFO: renamed from: a */
    public final Context f4860a;

    /* JADX INFO: renamed from: b */
    public final C0914y1 f4861b;

    /* JADX INFO: renamed from: c */
    public final C0819vh f4862c;

    /* JADX INFO: renamed from: d */
    public final Object f4863d = new Object();

    /* JADX INFO: renamed from: e */
    public Handler f4864e;

    /* JADX INFO: renamed from: f */
    public ThreadPoolExecutor f4865f;

    /* JADX INFO: renamed from: g */
    public ThreadPoolExecutor f4866g;

    /* JADX INFO: renamed from: h */
    public AbstractC0346ip f4867h;

    public C0822vk(Context context, C0914y1 c0914y1) {
        AbstractC0979zt.m2825f("Context cannot be null", context);
        this.f4860a = context.getApplicationContext();
        this.f4861b = c0914y1;
        this.f4862c = C0859wk.f4997d;
    }

    /* JADX INFO: renamed from: a */
    public final void m2519a() {
        synchronized (this.f4863d) {
            try {
                this.f4867h = null;
                Handler handler = this.f4864e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f4864e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f4866g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f4865f = null;
                this.f4866g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final C0265gl m2520b() {
        try {
            C0819vh c0819vh = this.f4862c;
            Context context = this.f4860a;
            C0914y1 c0914y1 = this.f4861b;
            c0819vh.getClass();
            C0209f2 c0209f2M48m = a80.m48m(context, c0914y1);
            int i = c0209f2M48m.f1871a;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            C0265gl[] c0265glArr = (C0265gl[]) c0209f2M48m.f1872b;
            if (c0265glArr == null || c0265glArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return c0265glArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }

    @Override // p000.InterfaceC0152di
    /* JADX INFO: renamed from: e */
    public final void mo943e(AbstractC0346ip abstractC0346ip) {
        synchronized (this.f4863d) {
            this.f4867h = abstractC0346ip;
        }
        synchronized (this.f4863d) {
            try {
                if (this.f4867h == null) {
                    return;
                }
                if (this.f4865f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0924yb("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f4866g = threadPoolExecutor;
                    this.f4865f = threadPoolExecutor;
                }
                this.f4865f.execute(new RunnableC0581p1(7, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
