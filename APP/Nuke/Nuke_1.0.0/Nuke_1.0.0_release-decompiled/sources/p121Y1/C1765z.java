package p121Y1;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: Y1.z */
/* JADX INFO: loaded from: classes.dex */
public final class C1765z {

    /* JADX INFO: renamed from: e */
    public static final boolean f6057e;

    /* JADX INFO: renamed from: f */
    public static final boolean f6058f;

    /* JADX INFO: renamed from: g */
    public static final File f6059g;

    /* JADX INFO: renamed from: h */
    public static volatile C1765z f6060h;

    /* JADX INFO: renamed from: b */
    public int f6062b;

    /* JADX INFO: renamed from: c */
    public boolean f6063c = true;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f6064d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public final int f6061a = 20000;

    static {
        int i5 = Build.VERSION.SDK_INT;
        f6057e = i5 < 29;
        f6058f = i5 >= 28;
        f6059g = new File("/proc/self/fd");
    }

    /* JADX INFO: renamed from: a */
    public static C1765z m3152a() {
        if (f6060h == null) {
            synchronized (C1765z.class) {
                try {
                    if (f6060h == null) {
                        f6060h = new C1765z();
                    }
                } finally {
                }
            }
        }
        return f6060h;
    }

    /* JADX INFO: renamed from: b */
    public final int m3153b() {
        if (Build.VERSION.SDK_INT == 28) {
            Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
            while (it.hasNext()) {
                if (Build.MODEL.startsWith((String) it.next())) {
                    return 500;
                }
            }
        }
        return this.f6061a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3154c(int i5, int i6, boolean z5, boolean z6) {
        boolean z7;
        if (z5) {
            if (f6058f) {
                if (!f6057e || this.f6064d.get()) {
                    if (z6) {
                        if (Log.isLoggable("HardwareConfig", 2)) {
                            Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
                            return false;
                        }
                    } else if (i5 >= 0 && i6 >= 0) {
                        synchronized (this) {
                            try {
                                int i7 = this.f6062b + 1;
                                this.f6062b = i7;
                                if (i7 >= 50) {
                                    this.f6062b = 0;
                                    int length = f6059g.list().length;
                                    long jM3153b = m3153b();
                                    boolean z8 = ((long) length) < jM3153b;
                                    this.f6063c = z8;
                                    if (!z8 && Log.isLoggable("Downsampler", 5)) {
                                        Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jM3153b);
                                    }
                                }
                                z7 = this.f6063c;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z7) {
                            return true;
                        }
                        if (Log.isLoggable("HardwareConfig", 2)) {
                            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
                            return false;
                        }
                    } else if (Log.isLoggable("HardwareConfig", 2)) {
                        Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
                    }
                } else if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed by app state");
                    return false;
                }
            } else if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
                return false;
            }
        } else if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed by caller");
            return false;
        }
        return false;
    }
}
