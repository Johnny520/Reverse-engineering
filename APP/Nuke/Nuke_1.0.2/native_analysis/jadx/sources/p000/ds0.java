package p000;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ds0 {

    /* JADX INFO: renamed from: e */
    public static final boolean f2171e;

    /* JADX INFO: renamed from: f */
    public static final boolean f2172f;

    /* JADX INFO: renamed from: g */
    public static final File f2173g;

    /* JADX INFO: renamed from: h */
    public static volatile ds0 f2174h;

    /* JADX INFO: renamed from: b */
    public int f2176b;

    /* JADX INFO: renamed from: c */
    public boolean f2177c = true;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f2178d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public final int f2175a = 20000;

    static {
        int i = Build.VERSION.SDK_INT;
        f2171e = i < 29;
        f2172f = i >= 28;
        f2173g = new File("/proc/self/fd");
    }

    /* JADX INFO: renamed from: a */
    public static ds0 m1114a() {
        if (f2174h == null) {
            synchronized (ds0.class) {
                try {
                    if (f2174h == null) {
                        f2174h = new ds0();
                    }
                } finally {
                }
            }
        }
        return f2174h;
    }

    /* JADX INFO: renamed from: b */
    public final int m1115b() {
        if (Build.VERSION.SDK_INT == 28) {
            Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
            while (it.hasNext()) {
                if (Build.MODEL.startsWith((String) it.next())) {
                    return 500;
                }
            }
        }
        return this.f2175a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1116c(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        if (z) {
            if (f2172f) {
                if (!f2171e || this.f2178d.get()) {
                    if (z2) {
                        if (Log.isLoggable("HardwareConfig", 2)) {
                            Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
                            return false;
                        }
                    } else if (i >= 0 && i2 >= 0) {
                        synchronized (this) {
                            try {
                                int i3 = this.f2176b + 1;
                                this.f2176b = i3;
                                if (i3 >= 50) {
                                    this.f2176b = 0;
                                    int length = f2173g.list().length;
                                    long jM1115b = m1115b();
                                    boolean z4 = ((long) length) < jM1115b;
                                    this.f2177c = z4;
                                    if (!z4 && Log.isLoggable("Downsampler", 5)) {
                                        Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jM1115b);
                                    }
                                }
                                z3 = this.f2177c;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z3) {
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
