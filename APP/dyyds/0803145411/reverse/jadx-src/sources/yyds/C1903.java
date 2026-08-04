package yyds;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: yyds.ᛸᲇᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1903 implements InterfaceC0240 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public ThreadPoolExecutor f9626;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public AbstractC0476 f9627;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final Object f9628 = new Object();

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public ThreadPoolExecutor f9629;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Context f9630;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public Handler f9631;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C1396 f9632;

    public C1903(Context context, C1396 c1396) {
        AbstractC2217.m4200(context, "Context cannot be null");
        this.f9630 = context.getApplicationContext();
        this.f9632 = c1396;
    }

    @Override // yyds.InterfaceC0240
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo891(AbstractC0476 abstractC0476) {
        synchronized (this.f9628) {
            this.f9627 = abstractC0476;
        }
        synchronized (this.f9628) {
            try {
                if (this.f9627 == null) {
                    return;
                }
                ThreadPoolExecutor threadPoolExecutor = this.f9629;
                if (threadPoolExecutor == null) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0791("emojiCompat"));
                    threadPoolExecutor2.allowCoreThreadTimeOut(true);
                    this.f9626 = threadPoolExecutor2;
                    this.f9629 = threadPoolExecutor2;
                    threadPoolExecutor = threadPoolExecutor2;
                }
                threadPoolExecutor.execute(new RunnableC0309(8, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m3685() {
        synchronized (this.f9628) {
            try {
                this.f9627 = null;
                Handler handler = this.f9631;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f9631 = null;
                ThreadPoolExecutor threadPoolExecutor = this.f9626;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f9629 = null;
                this.f9626 = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C2685 m3686() {
        try {
            C1760 c1760M3167 = AbstractC1539.m3167(this.f9630, List.of(this.f9632));
            int i = c1760M3167.f8838;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            C2685[] c2685Arr = (C2685[]) ((List) c1760M3167.f8839).get(0);
            if (c2685Arr == null || c2685Arr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return c2685Arr[0];
        } catch (PackageManager.NameNotFoundException e) {
            C1693.m3442("provider not found", e);
            return null;
        }
    }
}
