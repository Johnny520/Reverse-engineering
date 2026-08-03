package androidx.emoji2.text;

import Yue.C3362;
import Yue.C4075;
import Yue.C7950;
import Yue.InterfaceC5435;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7113;
import Yue.InterfaceC8532;
import android.content.Context;
import android.view.DefaultLifecycleObserver;
import android.view.Lifecycle;
import android.view.LifecycleOwner;
import android.view.ProcessLifecycleInitializer;
import androidx.emoji2.text.C8812;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC5435<Boolean> {

    /* JADX INFO: renamed from: ۥ */
    public static final long f3755 = 500;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f3756 = "EmojiCompatInitializer";

    /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$ۥ */
    @InterfaceC7113(19)
    public static class C1666 extends C8812.AbstractC8815 {
        public C1666(Context context) {
            super(new C1667(context));
            m29659(1);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$ۥ۟ */
    @InterfaceC7113(19)
    public static class C1667 implements C8812.InterfaceC8821 {

        /* JADX INFO: renamed from: ۥ */
        public final Context f3757;

        /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$ۥ۟$ۥ, reason: contains not printable characters */
        public class C8806 extends C8812.AbstractC8822 {

            /* JADX INFO: renamed from: ۥ */
            public final /* synthetic */ C8812.AbstractC8822 f3758;

            /* JADX INFO: renamed from: ۥ۟ */
            public final /* synthetic */ ThreadPoolExecutor f3759;

            public C8806(C8812.AbstractC8822 abstractC8822, ThreadPoolExecutor threadPoolExecutor) {
                this.f3758 = abstractC8822;
                this.f3759 = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.C8812.AbstractC8822
            /* JADX INFO: renamed from: ۥ */
            public void mo4772(@InterfaceC6490 Throwable th) {
                try {
                    this.f3758.mo4772(th);
                } finally {
                    this.f3759.shutdown();
                }
            }

            @Override // androidx.emoji2.text.C8812.AbstractC8822
            /* JADX INFO: renamed from: ۥ۟ */
            public void mo4773(@InterfaceC6391 C8833 c8833) {
                try {
                    this.f3758.mo4773(c8833);
                } finally {
                    this.f3759.shutdown();
                }
            }
        }

        public C1667(Context context) {
            this.f3757 = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.C8812.InterfaceC8821
        /* JADX INFO: renamed from: ۥ */
        public void mo4771(@InterfaceC6391 final C8812.AbstractC8822 abstractC8822) {
            final ThreadPoolExecutor threadPoolExecutorM11507 = C4075.m11507(EmojiCompatInitializer.f3756);
            threadPoolExecutorM11507.execute(new Runnable() { // from class: Yue.ۥ۠۠ۦ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9889.m29609(abstractC8822, threadPoolExecutorM11507);
                }
            });
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟(Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۥ;Ljava/util/concurrent/ThreadPoolExecutor;)V */
        @InterfaceC8532
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void m29609(@InterfaceC6391 C8812.AbstractC8822 abstractC8822, @InterfaceC6391 ThreadPoolExecutor threadPoolExecutor) {
            try {
                C8830 c8830M4774 = C1668.m4774(this.f3757);
                if (c8830M4774 == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                c8830M4774.m29686(threadPoolExecutor);
                c8830M4774.m4785().mo4771(new C8806(abstractC8822, threadPoolExecutor));
            } catch (Throwable th) {
                abstractC8822.mo4772(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$ۥ۟۟, reason: contains not printable characters */
    public static class RunnableC8807 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                C7950.m3971("EmojiCompat.EmojiCompatInitializer.run");
                if (C8812.m29623()) {
                    C8812.m29617().m29637();
                }
            } finally {
                C7950.m25086();
            }
        }
    }

    @Override // Yue.InterfaceC5435
    @InterfaceC6391
    public List<Class<? extends InterfaceC5435<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* JADX DEBUG: Method merged with bridge method: create(Landroid/content/Context;)Ljava/lang/Object; */
    @Override // Yue.InterfaceC5435
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
    public Boolean create(@InterfaceC6391 Context context) {
        C8812.m29622(new C1666(context));
        m4769(context);
        return Boolean.TRUE;
    }

    @InterfaceC7113(19)
    /* JADX INFO: renamed from: ۥ۟ */
    public void m4769(@InterfaceC6391 Context context) {
        final Lifecycle lifecycle = ((LifecycleOwner) C3362.m6886(context).m6890(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.addObserver(new DefaultLifecycleObserver() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // android.view.DefaultLifecycleObserver
            public void onResume(@InterfaceC6391 LifecycleOwner lifecycleOwner) {
                EmojiCompatInitializer.this.m29607();
                lifecycle.removeObserver(this);
            }
        });
    }

    @InterfaceC7113(19)
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m29607() {
        C4075.m11509().postDelayed(new RunnableC8807(), 500L);
    }
}
