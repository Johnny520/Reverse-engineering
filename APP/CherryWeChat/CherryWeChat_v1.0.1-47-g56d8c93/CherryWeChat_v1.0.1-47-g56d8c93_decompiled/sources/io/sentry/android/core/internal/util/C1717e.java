package io.sentry.android.core.internal.util;

import io.sentry.C1981r;
import io.sentry.config.AbstractC1856a;
import io.sentry.util.C2029a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1717e {

    /* JADX INFO: renamed from: c */
    public static final C1717e f6225c = new C1717e();

    /* JADX INFO: renamed from: a */
    public final C2029a f6226a = new C2029a();

    /* JADX INFO: renamed from: b */
    public final ArrayList f6227b = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final ArrayList m3903a() {
        ArrayList arrayList = this.f6227b;
        C1981r c1981rM4173a = this.f6226a.m4173a();
        try {
            if (!arrayList.isEmpty()) {
                c1981rM4173a.close();
                return arrayList;
            }
            File[] fileArrListFiles = new File("/sys/devices/system/cpu").listFiles();
            if (fileArrListFiles == null) {
                ArrayList arrayList2 = new ArrayList();
                c1981rM4173a.close();
                return arrayList2;
            }
            for (File file : fileArrListFiles) {
                if (file.getName().matches("cpu[0-9]+")) {
                    File file2 = new File(file, "cpufreq/cpuinfo_max_freq");
                    if (file2.exists() && file2.canRead()) {
                        try {
                            String strM4047C = AbstractC1856a.m4047C(file2);
                            if (strM4047C != null) {
                                arrayList.add(Integer.valueOf((int) (Long.parseLong(strM4047C.trim()) / 1000)));
                            }
                        } catch (IOException | NumberFormatException unused) {
                        }
                    }
                }
            }
            c1981rM4173a.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
