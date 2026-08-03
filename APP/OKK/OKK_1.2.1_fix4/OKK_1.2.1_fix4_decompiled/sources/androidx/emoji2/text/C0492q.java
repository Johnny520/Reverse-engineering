package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000A.AbstractC0004e;
import p000A.C0005f;
import p000A.C0010k;
import p000A.C0011l;
import p001A0.AbstractC0040p;
import p001A0.RunnableC0028d;
import p037U.AbstractC0358S;
import p089x0.C1121e;

/* JADX INFO: renamed from: androidx.emoji2.text.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0492q implements InterfaceC0484i {

    /* JADX INFO: renamed from: a */
    public final Context f1379a;

    /* JADX INFO: renamed from: b */
    public final C0005f f1380b;

    /* JADX INFO: renamed from: c */
    public final C1121e f1381c;

    /* JADX INFO: renamed from: d */
    public final Object f1382d;

    /* JADX INFO: renamed from: e */
    public Handler f1383e;

    /* JADX INFO: renamed from: f */
    public Executor f1384f;

    /* JADX INFO: renamed from: g */
    public ThreadPoolExecutor f1385g;

    /* JADX INFO: renamed from: h */
    public AbstractC0358S f1386h;

    public C0492q(Context context, C0005f c0005f) {
        C1121e c1121e = C0493r.f1387d;
        this.f1382d = new Object();
        AbstractC0040p.m106i(context, "Context cannot be null");
        this.f1379a = context.getApplicationContext();
        this.f1380b = c0005f;
        this.f1381c = c1121e;
    }

    /* JADX INFO: renamed from: a */
    public final void m1209a() {
        synchronized (this.f1382d) {
            try {
                this.f1386h = null;
                Handler handler = this.f1383e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f1383e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f1385g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f1384f = null;
                this.f1385g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1210b() {
        synchronized (this.f1382d) {
            try {
                if (this.f1386h == null) {
                    return;
                }
                if (this.f1384f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0476a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f1385g = threadPoolExecutor;
                    this.f1384f = threadPoolExecutor;
                }
                this.f1384f.execute(new RunnableC0028d(3, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final C0011l m1211c() {
        try {
            C1121e c1121e = this.f1381c;
            Context context = this.f1379a;
            C0005f c0005f = this.f1380b;
            c1121e.getClass();
            C0010k c0010kM15a = AbstractC0004e.m15a(context, c0005f);
            int i2 = c0010kM15a.f28a;
            if (i2 != 0) {
                throw new RuntimeException("fetchFonts failed (" + i2 + ")");
            }
            C0011l[] c0011lArr = (C0011l[]) c0010kM15a.f29b;
            if (c0011lArr == null || c0011lArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return c0011lArr[0];
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("provider not found", e2);
        }
    }

    @Override // androidx.emoji2.text.InterfaceC0484i
    /* JADX INFO: renamed from: p */
    public final void mo350p(AbstractC0358S abstractC0358S) {
        synchronized (this.f1382d) {
            this.f1386h = abstractC0358S;
        }
        m1210b();
    }
}
