package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.C0644c;
import androidx.lifecycle.AbstractC0668k;
import androidx.lifecycle.InterfaceC0656e;
import androidx.lifecycle.InterfaceC0676o;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import p031c4.AbstractC1317c;
import p224p4.C5949a;
import p224p4.InterfaceC5950b;
import p278t3.AbstractC8105h;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC5950b {

    /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class C0638a implements InterfaceC0656e {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ AbstractC0668k f1847q;

        public C0638a(AbstractC0668k abstractC0668k) {
            this.f1847q = abstractC0668k;
        }

        @Override // androidx.lifecycle.InterfaceC0656e
        /* JADX INFO: renamed from: f */
        public void mo2494f(InterfaceC0676o interfaceC0676o) {
            EmojiCompatInitializer.this.m2493c();
            this.f1847q.mo2630c(this);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class C0639b extends C0644c.c {
        public C0639b(Context context) {
            super(new C0640c(context));
            m2539b(1);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class C0640c implements C0644c.h {

        /* JADX INFO: renamed from: a */
        public final Context f1849a;

        /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$c$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public class a extends C0644c.i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C0644c.i f1850a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ThreadPoolExecutor f1851b;

            public a(C0644c.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f1850a = iVar;
                this.f1851b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.C0644c.i
            /* JADX INFO: renamed from: a */
            public void mo2498a(Throwable th) {
                try {
                    this.f1850a.mo2498a(th);
                } finally {
                    this.f1851b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.C0644c.i
            /* JADX INFO: renamed from: b */
            public void mo2499b(C0647f c0647f) {
                try {
                    this.f1850a.mo2499b(c0647f);
                } finally {
                    this.f1851b.shutdown();
                }
            }
        }

        public C0640c(Context context) {
            this.f1849a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.C0644c.h
        /* JADX INFO: renamed from: a */
        public void mo2496a(final C0644c.i iVar) {
            final ThreadPoolExecutor threadPoolExecutorM5297b = AbstractC1317c.m5297b("EmojiCompatInitializer");
            threadPoolExecutorM5297b.execute(new Runnable() { // from class: c4.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3947q.m2497c(iVar, threadPoolExecutorM5297b);
                }
            });
        }

        /* JADX INFO: renamed from: c */
        public void m2497c(C0644c.i iVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                C0646e c0646eM2500a = AbstractC0642a.m2500a(this.f1849a);
                if (c0646eM2500a == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                c0646eM2500a.m2561c(threadPoolExecutor);
                c0646eM2500a.m2538a().mo2496a(new a(iVar, threadPoolExecutor));
            } catch (Throwable th) {
                iVar.mo2498a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class RunnableC0641d implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                AbstractC8105h.m31324a("EmojiCompat.EmojiCompatInitializer.run");
                if (C0644c.m2518i()) {
                    C0644c.m2516c().m2525l();
                }
            } finally {
                AbstractC8105h.m31325b();
            }
        }
    }

    @Override // p224p4.InterfaceC5950b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean create(Context context) {
        C0644c.m2517h(new C0639b(context));
        m2492b(context);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: b */
    public void m2492b(Context context) {
        AbstractC0668k lifecycle = ((InterfaceC0676o) C5949a.m23921e(context).m23926f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.mo2628a(new C0638a(lifecycle));
    }

    /* JADX INFO: renamed from: c */
    public void m2493c() {
        AbstractC1317c.m5298c().postDelayed(new RunnableC0641d(), 500L);
    }

    @Override // p224p4.InterfaceC5950b
    public List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
