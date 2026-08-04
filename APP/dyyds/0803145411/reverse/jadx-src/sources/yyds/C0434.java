package yyds;

import android.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: yyds.ᛲᲀᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0434 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final File f2197 = new File("/proc/self/fd");

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static volatile C0434 f2198;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public int f2199;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public boolean f2200;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static C0434 m1208() {
        if (f2198 == null) {
            synchronized (C0434.class) {
                try {
                    if (f2198 == null) {
                        C0434 c0434 = new C0434();
                        c0434.f2200 = true;
                        new AtomicBoolean(false);
                        f2198 = c0434;
                    }
                } finally {
                }
            }
        }
        return f2198;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final boolean m1209(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        if (z) {
            if (z2) {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
                    return false;
                }
            } else if (i >= 0 && i2 >= 0) {
                synchronized (this) {
                    try {
                        int i3 = this.f2199 + 1;
                        this.f2199 = i3;
                        if (i3 >= 50) {
                            this.f2199 = 0;
                            int length = f2197.list().length;
                            boolean z4 = ((long) length) < 20000;
                            this.f2200 = z4;
                            if (!z4 && Log.isLoggable("Downsampler", 5)) {
                                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit 20000");
                            }
                        }
                        z3 = this.f2200;
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
            Log.v("HardwareConfig", "Hardware config disallowed by caller");
            return false;
        }
        return false;
    }
}
