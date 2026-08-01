package com.bumptech.glide.load.resource.bitmap;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3864 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final boolean f9995;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final boolean f9996;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static volatile C3864 f9997;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final File f9998;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f10001;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f10000 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AtomicBoolean f9999 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f10002 = 20000;

    static {
        int i = Build.VERSION.SDK_INT;
        f9996 = i < 29;
        f9995 = i >= 28;
        f9998 = new File("/proc/self/fd");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C3864 m7104() {
        if (f9997 == null) {
            synchronized (C3864.class) {
                try {
                    if (f9997 == null) {
                        f9997 = new C3864();
                    }
                } finally {
                }
            }
        }
        return f9997;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m7105(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        if (z) {
            if (f9995) {
                if (!f9996 || this.f9999.get()) {
                    if (z2) {
                        if (Log.isLoggable("HardwareConfig", 2)) {
                            Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
                            return false;
                        }
                    } else if (i >= 0 && i2 >= 0) {
                        synchronized (this) {
                            try {
                                int i3 = this.f10001 + 1;
                                this.f10001 = i3;
                                if (i3 >= 50) {
                                    this.f10001 = 0;
                                    int length = f9998.list().length;
                                    long jM7106 = m7106();
                                    boolean z4 = ((long) length) < jM7106;
                                    this.f10000 = z4;
                                    if (!z4 && Log.isLoggable("Downsampler", 5)) {
                                        Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jM7106);
                                    }
                                }
                                z3 = this.f10000;
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

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m7106() {
        if (Build.VERSION.SDK_INT == 28) {
            Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
            while (it.hasNext()) {
                if (Build.MODEL.startsWith((String) it.next())) {
                    return 500;
                }
            }
        }
        return this.f10002;
    }
}
