package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: xk */
/* JADX INFO: loaded from: classes.dex */
public final class C0896xk implements InterfaceC0225fi {

    /* JADX INFO: renamed from: a */
    public final Context f5263a;

    /* JADX INFO: renamed from: b */
    public final C0914y1 f5264b;

    /* JADX INFO: renamed from: c */
    public final C0893xh f5265c;

    /* JADX INFO: renamed from: d */
    public final Object f5266d = new Object();

    /* JADX INFO: renamed from: e */
    public Handler f5267e;

    /* JADX INFO: renamed from: f */
    public ThreadPoolExecutor f5268f;

    /* JADX INFO: renamed from: g */
    public ThreadPoolExecutor f5269g;

    /* JADX INFO: renamed from: h */
    public AbstractC0259gf f5270h;

    public C0896xk(Context context, C0914y1 c0914y1) {
        AbstractC0498mu.m1887d("Context cannot be null", context);
        this.f5263a = context.getApplicationContext();
        this.f5264b = c0914y1;
        this.f5265c = C0933yk.f5463d;
    }

    /* JADX INFO: renamed from: a */
    public final void m2699a() {
        synchronized (this.f5266d) {
            try {
                this.f5270h = null;
                Handler handler = this.f5267e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f5267e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f5269g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f5268f = null;
                this.f5269g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC0225fi
    /* JADX INFO: renamed from: b */
    public final void mo1102b(AbstractC0259gf abstractC0259gf) {
        synchronized (this.f5266d) {
            this.f5270h = abstractC0259gf;
        }
        synchronized (this.f5266d) {
            try {
                if (this.f5270h == null) {
                    return;
                }
                if (this.f5268f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0293hc("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f5269g = threadPoolExecutor;
                    this.f5268f = threadPoolExecutor;
                }
                this.f5268f.execute(new RunnableC0884x8(6, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final C0338il m2700c() {
        try {
            C0893xh c0893xh = this.f5265c;
            Context context = this.f5263a;
            C0914y1 c0914y1 = this.f5264b;
            c0893xh.getClass();
            C0209f2 c0209f2M1200o = g80.m1200o(context, c0914y1);
            int i = c0209f2M1200o.f1721a;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            C0338il[] c0338ilArr = (C0338il[]) c0209f2M1200o.f1722b;
            if (c0338ilArr == null || c0338ilArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return c0338ilArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
