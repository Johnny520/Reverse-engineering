package p000a;

import android.content.Context;
import android.media.AudioManager;
import android.os.SystemClock;
import java.util.Arrays;

/* JADX INFO: renamed from: a.bh */
/* JADX INFO: loaded from: classes.dex */
public final class C0506bh {

    /* JADX INFO: renamed from: b */
    public static volatile long f1849b;

    /* JADX INFO: renamed from: c */
    public static volatile String f1850c;

    /* JADX INFO: renamed from: d */
    public static volatile boolean f1851d;

    /* JADX INFO: renamed from: f */
    public static volatile long f1853f;

    /* JADX INFO: renamed from: a */
    public static final C0506bh f1848a = new C0506bh();

    /* JADX INFO: renamed from: e */
    public static volatile int f1852e = -1;

    /* JADX INFO: renamed from: g */
    public static final int[] f1854g = {2, 5, 3};

    /* JADX INFO: renamed from: a */
    public static final String m1250a() {
        if (m1251b()) {
            return f1850c;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m1251b() {
        if (SystemClock.uptimeMillis() <= f1849b) {
            return true;
        }
        f1850c = null;
        f1848a.getClass();
        m1253d();
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static void m1252c(String str) {
        C0908x1.m2194b(Arrays.copyOf(new Object[]{C0944z.m2231k("[VoipInterceptionState] ", str)}, 1));
    }

    /* JADX INFO: renamed from: d */
    public static void m1253d() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (f1851d && jUptimeMillis > f1853f && f1851d) {
            Context context = C0889w1.f3488p;
            if (context == null) {
                f1851d = false;
                return;
            }
            Object systemService = context.getSystemService("audio");
            AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
            if (audioManager == null) {
                f1851d = false;
                return;
            }
            for (int i : f1854g) {
                try {
                    audioManager.setStreamMute(i, false);
                } catch (Throwable th) {
                    m1252c("unmute stream " + i + " failed: " + th.getMessage());
                }
            }
            try {
                if (f1852e >= 0) {
                    audioManager.setStreamVolume(0, f1852e, 0);
                    m1252c("restored VOICE_CALL volume -> " + f1852e);
                    f1852e = -1;
                }
            } catch (Throwable th2) {
                m1252c("restore VOICE_CALL volume failed: " + th2.getMessage());
            }
            f1851d = false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m1254e() {
        if (f1850c != null) {
            f1849b = SystemClock.uptimeMillis() + 60000;
            f1853f = Math.max(f1853f, f1849b + 60000);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m1255f() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis <= f1849b || jUptimeMillis <= f1853f) {
            return true;
        }
        f1848a.getClass();
        m1253d();
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static void m1256g(String str) {
        Context context;
        f1850c = str;
        f1849b = SystemClock.uptimeMillis() + 60000;
        f1853f = f1849b + 60000;
        f1848a.getClass();
        if (f1851d || (context = C0889w1.f3488p) == null) {
            return;
        }
        Object systemService = context.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager == null) {
            return;
        }
        for (int i : f1854g) {
            try {
                audioManager.setStreamMute(i, true);
            } catch (Throwable th) {
                m1252c("mute stream " + i + " failed: " + th.getMessage());
            }
        }
        try {
            f1852e = audioManager.getStreamVolume(0);
            if (f1852e != 0) {
                audioManager.setStreamVolume(0, 0, 0);
                m1252c("muted VOICE_CALL volume (" + f1852e + " -> 0)");
            }
        } catch (Throwable th2) {
            m1252c("mute VOICE_CALL volume failed: " + th2.getMessage());
        }
        f1851d = true;
    }
}
