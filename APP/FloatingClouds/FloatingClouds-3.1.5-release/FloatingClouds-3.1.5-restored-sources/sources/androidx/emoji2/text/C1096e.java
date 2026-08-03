package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.emoji2.text.C1094c;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000a.C0051Cc;
import p000a.C0207L6;
import p000a.C0225M6;
import p000a.C0350T6;
import p000a.C0726n9;
import p000a.C0944z;
import p000a.RunnableC0221M2;
import p000a.ThreadFactoryC0132H3;

/* JADX INFO: renamed from: androidx.emoji2.text.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1096e extends C1094c.c {

    /* JADX INFO: renamed from: d */
    public static final a f4504d = new a();

    /* JADX INFO: renamed from: androidx.emoji2.text.e$a */
    public static class a {
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.e$b */
    public static class b implements C1094c.g {

        /* JADX INFO: renamed from: a */
        public final Context f4505a;

        /* JADX INFO: renamed from: b */
        public final C0225M6 f4506b;

        /* JADX INFO: renamed from: c */
        public final a f4507c;

        /* JADX INFO: renamed from: d */
        public final Object f4508d;

        /* JADX INFO: renamed from: e */
        public Handler f4509e;

        /* JADX INFO: renamed from: f */
        public ThreadPoolExecutor f4510f;

        /* JADX INFO: renamed from: g */
        public ThreadPoolExecutor f4511g;

        /* JADX INFO: renamed from: h */
        public C1094c.h f4512h;

        public b(Context context, C0225M6 c0225m6) {
            a aVar = C1096e.f4504d;
            this.f4508d = new Object();
            C0726n9.m1665h(context, "Context cannot be null");
            this.f4505a = context.getApplicationContext();
            this.f4506b = c0225m6;
            this.f4507c = aVar;
        }

        @Override // androidx.emoji2.text.C1094c.g
        /* JADX INFO: renamed from: a */
        public final void mo2501a(C1094c.h hVar) {
            synchronized (this.f4508d) {
                this.f4512h = hVar;
            }
            synchronized (this.f4508d) {
                try {
                    if (this.f4512h == null) {
                        return;
                    }
                    if (this.f4510f == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0132H3("emojiCompat"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.f4511g = threadPoolExecutor;
                        this.f4510f = threadPoolExecutor;
                    }
                    this.f4510f.execute(new RunnableC0221M2(8, this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m2511b() {
            synchronized (this.f4508d) {
                try {
                    this.f4512h = null;
                    Handler handler = this.f4509e;
                    if (handler != null) {
                        handler.removeCallbacks(null);
                    }
                    this.f4509e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f4511g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f4510f = null;
                    this.f4511g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public final C0350T6 m2512c() {
            try {
                a aVar = this.f4507c;
                Context context = this.f4505a;
                C0225M6 c0225m6 = this.f4506b;
                aVar.getClass();
                C0051Cc c0051CcM582a = C0207L6.m582a(context, c0225m6);
                int i = c0051CcM582a.f183c;
                if (i != 0) {
                    throw new RuntimeException(C0944z.m2223c(i, "fetchFonts failed (", ")"));
                }
                C0350T6[] c0350t6Arr = (C0350T6[]) c0051CcM582a.f182b;
                if (c0350t6Arr == null || c0350t6Arr.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                return c0350t6Arr[0];
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }
    }
}
