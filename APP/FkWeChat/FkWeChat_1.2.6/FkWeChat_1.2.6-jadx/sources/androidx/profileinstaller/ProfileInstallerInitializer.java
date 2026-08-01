package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.AbstractC0696c;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p224p4.InterfaceC5950b;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC5950b {

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstallerInitializer$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class C0692a {
        /* JADX INFO: renamed from: a */
        public static Handler m2725a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstallerInitializer$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class C0693b {
    }

    /* JADX INFO: renamed from: f */
    public static void m2722f(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: l4.i
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC0696c.m2750h(context);
            }
        });
    }

    @Override // p224p4.InterfaceC5950b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C0693b create(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: l4.g
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                this.f13787q.m2724e(applicationContext);
            }
        });
        return new C0693b();
    }

    @Override // p224p4.InterfaceC5950b
    public List dependencies() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: e */
    public void m2724e(final Context context) {
        (Build.VERSION.SDK_INT >= 28 ? C0692a.m2725a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Runnable() { // from class: l4.h
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.m2722f(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }
}
