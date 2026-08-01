package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.activity.RunnableC0371b;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p006D.AbstractC0079h;
import p012G.C0140d;
import p052b1.AbstractC0503h;
import p061e.C0531g;
import p093v.AbstractC1017b;
import p093v.C1018c;
import p093v.C1023h;

/* JADX INFO: renamed from: androidx.emoji2.text.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0401p implements InterfaceC0395j {

    /* JADX INFO: renamed from: b */
    public final Context f1195b;

    /* JADX INFO: renamed from: c */
    public final C1018c f1196c;

    /* JADX INFO: renamed from: d */
    public final C0140d f1197d;

    /* JADX INFO: renamed from: e */
    public final Object f1198e;

    /* JADX INFO: renamed from: f */
    public Handler f1199f;

    /* JADX INFO: renamed from: g */
    public ThreadPoolExecutor f1200g;

    /* JADX INFO: renamed from: h */
    public ThreadPoolExecutor f1201h;

    /* JADX INFO: renamed from: i */
    public AbstractC0079h f1202i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0401p(Context context, C1018c c1018c) {
        C0140d c0140d = C0402q.f1203d;
        this.f1198e = new Object();
        AbstractC0503h.m979g(context, "Context cannot be null");
        this.f1195b = context.getApplicationContext();
        this.f1196c = c1018c;
        this.f1197d = c0140d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m772a() {
        synchronized (this.f1198e) {
            try {
                this.f1202i = null;
                Handler handler = this.f1199f;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f1199f = null;
                ThreadPoolExecutor threadPoolExecutor = this.f1201h;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f1200g = null;
                this.f1201h = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C1023h m773b() {
        try {
            C0140d c0140d = this.f1197d;
            Context context = this.f1195b;
            C1018c c1018c = this.f1196c;
            c0140d.getClass();
            C0531g c0531gM2219a = AbstractC1017b.m2219a(context, c1018c);
            int i2 = c0531gM2219a.f1746a;
            if (i2 != 0) {
                throw new RuntimeException("fetchFonts failed (" + i2 + ")");
            }
            C1023h[] c1023hArr = (C1023h[]) c0531gM2219a.f1747b;
            if (c1023hArr == null || c1023hArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return c1023hArr[0];
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("provider not found", e2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.emoji2.text.InterfaceC0395j
    /* JADX INFO: renamed from: q */
    public final void mo145q(AbstractC0079h abstractC0079h) {
        synchronized (this.f1198e) {
            this.f1202i = abstractC0079h;
        }
        synchronized (this.f1198e) {
            try {
                if (this.f1202i == null) {
                    return;
                }
                if (this.f1200g == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0386a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f1201h = threadPoolExecutor;
                    this.f1200g = threadPoolExecutor;
                }
                this.f1200g.execute(new RunnableC0371b(2, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
