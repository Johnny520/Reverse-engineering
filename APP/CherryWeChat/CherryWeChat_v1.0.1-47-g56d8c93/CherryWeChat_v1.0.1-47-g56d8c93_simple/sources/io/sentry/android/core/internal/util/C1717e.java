package io.sentry.android.core.internal.util;

import io.sentry.C1981r;
import io.sentry.config.AbstractC1856a;
import io.sentry.util.C2029a;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1717e {

    /* JADX INFO: renamed from: c */
    public static final C1717e f6225c = null;

    /* JADX INFO: renamed from: a */
    public final C2029a f6226a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f6227b;

    static {
        f6225c = new C1717e();
    }

    public C1717e() {
        this.f6226a = new C2029a();
        this.f6227b = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m3903a() {
        ArrayList r0 = this.f6227b;
        C1981r r1 = this.f6226a.m4173a();
    L12:
        th = move-exception;
        r1.close();     // Catch: Throwable -> L35
    L37:
        throw th;
    L35:
        th = move-exception;
        th.addSuppressed(th);
        goto L37
    L4:
        if (r0.isEmpty() == true) goto L7;
        r1.close();
        return r0;
    L7:
        File[] r2 = new File("/sys/devices/system/cpu").listFiles();     // Catch: Throwable -> L12
        if (r2 != null) goto L14;
        ArrayList r02 = new ArrayList();     // Catch: Throwable -> L12
        r1.close();
        return r02;
    L14:
        int r3 = r2.length;     // Catch: Throwable -> L12
        int r4 = 0;
    L15:
        if (r4 >= r3) goto L31;
        File r5 = r2[r4];     // Catch: Throwable -> L12
        if (r5.getName().matches("cpu[0-9]+") == false) goto L30;
        File r6 = new File(r5, "cpufreq/cpuinfo_max_freq");     // Catch: Throwable -> L12
        if (r6.exists() == false) goto L30;
        if (r6.canRead() == false) goto L30;
        String r52 = AbstractC1856a.m4047C(r6);     // Catch: Throwable -> L12 Throwable -> L38
        if (r52 == null) goto L30;
        r0.add(Integer.valueOf((int) (Long.parseLong(r52.trim()) / 1000)));     // Catch: Throwable -> L12
    L30:
        r4 = r4 + 1;
        goto L15
    L31:
        r1.close();
        return r0;
    }
}
