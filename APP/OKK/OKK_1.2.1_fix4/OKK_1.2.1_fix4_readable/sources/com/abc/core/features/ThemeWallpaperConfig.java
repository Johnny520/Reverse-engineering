package com.abc.core.features;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.SystemClock;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p001A0.AbstractC0040p;
import p007D0.C0140f;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0431p;

/* JADX INFO: renamed from: c0.B1 */
/* JADX INFO: loaded from: classes.dex */
public final class ThemeWallpaperConfig {

    /* JADX INFO: renamed from: c */
    public static volatile long f1703c;

    /* JADX INFO: renamed from: d */
    public static volatile boolean f1704d;

    /* JADX INFO: renamed from: h */
    public static volatile Bitmap f1708h;

    /* JADX INFO: renamed from: a */
    public static final ThemeWallpaperConfig f1701a = new ThemeWallpaperConfig();

    /* JADX INFO: renamed from: b */
    public static final CopyOnWriteArrayList f1702b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e */
    public static volatile float f1705e = 0.28f;

    /* JADX INFO: renamed from: f */
    public static volatile String f1706f = "";

    /* JADX INFO: renamed from: g */
    public static volatile String f1707g = "";

    /* JADX INFO: renamed from: i */
    public static volatile String f1709i = "";

    /* JADX INFO: renamed from: j */
    public static volatile String f1710j = "";

    /* JADX INFO: renamed from: c */
    public static float m1387c(float f2) {
        return AbstractC0040p.m110o(f2, 0.01f, 0.85f);
    }

    /* JADX INFO: renamed from: d */
    public static String m1388d(float f2) {
        return String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1));
    }

    /* JADX INFO: renamed from: f */
    public static void m1389f() {
        Iterator it = f1702b.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC0275a) it.next()).invoke();
            } catch (Throwable th) {
                AbstractC0040p.m116u(th);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m1390g(boolean z2) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (z2 || jUptimeMillis - f1703c >= 800 || f1703c <= 0) {
            ConfigStore configStore = ConfigStore.f2048a;
            f1704d = ConfigStore.m1661c("theme_wallpaper_enabled", false);
            Float fM1025z0 = AbstractC0431p.m1025z0(ConfigStore.m1662d("theme_wallpaper_alpha", "0.28"));
            f1705e = m1387c(fM1025z0 != null ? fM1025z0.floatValue() : 0.28f);
            String absolutePath = "";
            String string = AbstractC0425j.m1022a1(ConfigStore.m1662d("theme_wallpaper_path", "")).toString();
            f1707g = AbstractC0425j.m1022a1(ConfigStore.m1662d("theme_wallpaper_updated", "")).toString();
            File file = new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "theme_wallpaper.jpg");
            if (string.length() > 0 && new File(string).isFile()) {
                absolutePath = string;
            } else if (file.isFile()) {
                absolutePath = file.getAbsolutePath();
                AbstractC0307g.m702d(absolutePath, "getAbsolutePath(...)");
            }
            f1706f = absolutePath;
            f1703c = jUptimeMillis;
        }
    }

    /* JADX INFO: renamed from: a */
    public final float m1391a() {
        m1390g(false);
        return f1705e;
    }

    /* JADX INFO: renamed from: b */
    public final Bitmap m1392b() {
        Object objM116u;
        m1390g(false);
        String str = f1706f;
        if (str.length() == 0) {
            return null;
        }
        if (f1708h != null) {
            Bitmap bitmap = f1708h;
            AbstractC0307g.m700b(bitmap);
            if (!bitmap.isRecycled() && AbstractC0307g.m699a(f1709i, str) && AbstractC0307g.m699a(f1710j, f1707g)) {
                return f1708h;
            }
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int i2 = 1;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int i3 = options.outWidth;
            int i4 = options.outHeight;
            int i5 = 1;
            while (true) {
                if (i3 <= 1600 && i4 <= 1600) {
                    break;
                }
                i5 *= 2;
                i3 /= 2;
                i4 /= 2;
            }
            if (i5 >= 1) {
                i2 = i5;
            }
            options.inSampleSize = i2;
            options.inJustDecodeBounds = false;
            objM116u = BitmapFactory.decodeFile(str, options);
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        Bitmap bitmap2 = (Bitmap) (objM116u instanceof C0140f ? null : objM116u);
        if (bitmap2 != null) {
            f1708h = bitmap2;
            f1709i = str;
            f1710j = f1707g;
        }
        return bitmap2;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1393e() {
        m1390g(false);
        return f1704d;
    }
}
