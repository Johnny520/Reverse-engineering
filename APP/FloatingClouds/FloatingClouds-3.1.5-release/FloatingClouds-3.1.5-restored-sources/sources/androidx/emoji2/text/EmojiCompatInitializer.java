package androidx.emoji2.text;

import android.content.Context;
import android.os.Looper;
import android.os.Trace;
import androidx.emoji2.text.C1094c;
import androidx.lifecycle.AbstractC1116e;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.startup.C1228a;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000a.C0016Af;
import p000a.C0150I3;
import p000a.InterfaceC0295Q4;
import p000a.InterfaceC0388V8;
import p000a.InterfaceC0935y9;
import p000a.RunnableC0603h0;
import p000a.ThreadFactoryC0132H3;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0388V8<Boolean> {

    /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$a */
    public static class C1089a extends C1094c.c {
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$b */
    public static class C1090b implements C1094c.g {

        /* JADX INFO: renamed from: a */
        public final Context f4481a;

        public C1090b(Context context) {
            this.f4481a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.C1094c.g
        /* JADX INFO: renamed from: a */
        public final void mo2501a(C1094c.h hVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0132H3("EmojiCompatInitializer"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new RunnableC0603h0(this, hVar, threadPoolExecutor, 2));
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$c */
    public static class RunnableC1091c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                int i = C0016Af.f53a;
                Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                if (C1094c.f4484k != null) {
                    C1094c.m2505a().m2507c();
                }
                Trace.endSection();
            } catch (Throwable th) {
                int i2 = C0016Af.f53a;
                Trace.endSection();
                throw th;
            }
        }
    }

    @Override // p000a.InterfaceC0388V8
    /* JADX INFO: renamed from: a */
    public final List<Class<? extends InterfaceC0388V8<?>>> mo1019a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p000a.InterfaceC0388V8
    /* JADX INFO: renamed from: b */
    public final Boolean mo1020b(Context context) {
        Object objM3014b;
        C1089a c1089a = new C1089a(new C1090b(context));
        c1089a.f4498b = 1;
        if (C1094c.f4484k == null) {
            synchronized (C1094c.f4483j) {
                try {
                    if (C1094c.f4484k == null) {
                        C1094c.f4484k = new C1094c(c1089a);
                    }
                } finally {
                }
            }
        }
        C1228a c1228aM3012c = C1228a.m3012c(context);
        c1228aM3012c.getClass();
        synchronized (C1228a.f5213e) {
            try {
                objM3014b = c1228aM3012c.f5214a.get(ProcessLifecycleInitializer.class);
                if (objM3014b == null) {
                    objM3014b = c1228aM3012c.m3014b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        final AbstractC1116e lifecycle = ((InterfaceC0935y9) objM3014b).getLifecycle();
        lifecycle.mo2592a(new InterfaceC0295Q4(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // p000a.InterfaceC0295Q4
            /* JADX INFO: renamed from: b */
            public final void mo835b(InterfaceC0935y9 interfaceC0935y9) {
                C0150I3.m422a(Looper.getMainLooper()).postDelayed(new RunnableC1091c(), 500L);
                lifecycle.mo2594c(this);
            }
        });
        return Boolean.TRUE;
    }
}
