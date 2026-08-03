package p108ha;

import android.content.SharedPreferences;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p002a1.RunnableC0003a;
import p011ab.C0042b;
import p024b9.SharedPreferencesOnSharedPreferenceChangeListenerC0216b;
import p036c9.ThreadFactoryC0478q;
import p258r8.C3742g;
import p300ub.AbstractC4302b;

/* JADX INFO: renamed from: ha.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1653m {

    /* JADX INFO: renamed from: a */
    public final C0042b f5439a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f5440b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC0216b f5441c;

    /* JADX INFO: renamed from: d */
    public ScheduledExecutorService f5442d;

    /* JADX INFO: renamed from: e */
    public long f5443e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1653m(C3742g c3742g, C0042b c0042b) {
        c3742g.getClass();
        this.f5439a = c0042b;
        this.f5440b = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_moments_auto_refresh_config");
        this.f5441c = new SharedPreferencesOnSharedPreferenceChangeListenerC0216b(this, 5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized void m4227a() {
        if (this.f5440b.getBoolean("enable", false)) {
            if (this.f5442d != null ? !r0.isShutdown() : false) {
                return;
            }
            this.f5443e = 0L;
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC0478q(13));
            scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleWithFixedDelay(new RunnableC0003a(this, 10), 1L, 1L, TimeUnit.SECONDS);
            this.f5442d = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
            return;
        }
        synchronized (this) {
            try {
                ScheduledExecutorService scheduledExecutorService = this.f5442d;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                }
                this.f5442d = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
