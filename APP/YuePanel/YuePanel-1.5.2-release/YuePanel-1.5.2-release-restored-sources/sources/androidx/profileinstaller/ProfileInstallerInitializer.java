package androidx.profileinstaller;

import Yue.InterfaceC4482;
import Yue.InterfaceC5435;
import Yue.InterfaceC6391;
import Yue.InterfaceC7113;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.C8896;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC5435<C8893> {

    /* JADX INFO: renamed from: ۥ */
    public static final int f3855 = 5000;

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstallerInitializer$ۥ */
    @InterfaceC7113(16)
    public static class C1729 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m30116(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: Yue.ۥۡۥۢ۠
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    runnable.run();
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstallerInitializer$ۥ۟ */
    @InterfaceC7113(28)
    public static class C1730 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Handler m4880(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstallerInitializer$ۥ۟۟, reason: contains not printable characters */
    public static class C8893 {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static void m30111(@InterfaceC6391 final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: Yue.ۥۡۥۢ۟
            @Override // java.lang.Runnable
            public final void run() {
                C8896.m30138(context);
            }
        });
    }

    @Override // Yue.InterfaceC5435
    @InterfaceC6391
    public List<Class<? extends InterfaceC5435<?>>> dependencies() {
        return Collections.emptyList();
    }

    /* JADX DEBUG: Method merged with bridge method: create(Landroid/content/Context;)Ljava/lang/Object; */
    @Override // Yue.InterfaceC5435
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C8893 create(@InterfaceC6391 Context context) {
        m30113(context.getApplicationContext());
        return new C8893();
    }

    @InterfaceC7113(16)
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m30113(@InterfaceC6391 final Context context) {
        C1729.m30116(new Runnable() { // from class: Yue.ۥۡۥۢ
            @Override // java.lang.Runnable
            public final void run() {
                this.f17700.m30115(context);
            }
        });
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟ۡ(Landroid/content/Context;)V */
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void m30115(@InterfaceC6391 final Context context) {
        (Build.VERSION.SDK_INT >= 28 ? C1730.m4880(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Runnable() { // from class: Yue.ۥۡۥۡۨ
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.m30111(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }
}
