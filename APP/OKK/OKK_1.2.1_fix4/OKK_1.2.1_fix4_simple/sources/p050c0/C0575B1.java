package p050c0;

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
public final class C0575B1 {

    /* JADX INFO: renamed from: a */
    public static final C0575B1 f1701a = null;

    /* JADX INFO: renamed from: b */
    public static final CopyOnWriteArrayList f1702b = null;

    /* JADX INFO: renamed from: c */
    public static volatile long f1703c;

    /* JADX INFO: renamed from: d */
    public static volatile boolean f1704d;

    /* JADX INFO: renamed from: e */
    public static volatile float f1705e;

    /* JADX INFO: renamed from: f */
    public static volatile String f1706f;

    /* JADX INFO: renamed from: g */
    public static volatile String f1707g;

    /* JADX INFO: renamed from: h */
    public static volatile Bitmap f1708h;

    /* JADX INFO: renamed from: i */
    public static volatile String f1709i;

    /* JADX INFO: renamed from: j */
    public static volatile String f1710j;

    static {
        f1701a = new C0575B1();
        f1702b = new CopyOnWriteArrayList();
        f1705e = 0.28f;
        f1706f = "";
        f1707g = "";
        f1709i = "";
        f1710j = "";
    }

    /* JADX INFO: renamed from: c */
    public static float m1387c(float r2) {
        return AbstractC0040p.m110o(r2, 0.01f, 0.85f);
    }

    /* JADX INFO: renamed from: d */
    public static String m1388d(float r2) {
        return String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(r2)}, 1));
    }

    /* JADX INFO: renamed from: f */
    public static void m1389f() {
        Iterator r02 = f1702b.iterator();
    L4:
        if (r02.hasNext() == false) goto L10;
        ((InterfaceC0275a) r02.next()).invoke();     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L4
    }

    /* JADX INFO: renamed from: g */
    public static void m1390g(boolean r6) {
        long r02 = SystemClock.uptimeMillis();
        if (r6 == false) goto L5;
    L9:
        C0661h1 r62 = C0661h1.f2048a;
        f1704d = C0661h1.m1661c("theme_wallpaper_enabled", false);
        Float r63 = AbstractC0431p.m1025z0(C0661h1.m1662d("theme_wallpaper_alpha", "0.28"));
        if (r63 == null) goto L12;
        float r64 = r63.floatValue();
    L13:
        f1705e = m1387c(r64);
        String r2 = "";
        String r65 = AbstractC0425j.m1022a1(C0661h1.m1662d("theme_wallpaper_path", "")).toString();
        f1707g = AbstractC0425j.m1022a1(C0661h1.m1662d("theme_wallpaper_updated", "")).toString();
        File r3 = new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "theme_wallpaper.jpg");
        if (r65.length() <= 0) goto L19;
        if (new File(r65).isFile() == false) goto L19;
        r2 = r65;
    L21:
        f1706f = r2;
        f1703c = r02;
        return;
    L19:
        if (r3.isFile() == false) goto L21;
        r2 = r3.getAbsolutePath();
        AbstractC0307g.m702d(r2, "getAbsolutePath(...)");
        goto L21
    L12:
        r64 = 0.28f;
        goto L13
    L5:
        if ((r02 - f1703c) >= 800) goto L9;
        if (f1703c <= 0) goto L9;
    }

    /* JADX INFO: renamed from: a */
    public final float m1391a() {
        m1390g(false);
        return f1705e;
    }

    /* JADX INFO: renamed from: b */
    public final Bitmap m1392b() {
        m1390g(false);
        String r1 = f1706f;
        Object r3 = null;
        if (r1.length() != 0) goto L6;
        return null;
    L6:
        if (f1708h == null) goto L37;
        Bitmap r2 = f1708h;
        AbstractC0307g.m700b(r2);
        if (r2.isRecycled() == true) goto L37;
        if (AbstractC0307g.m699a(f1709i, r1) == false) goto L37;
        if (AbstractC0307g.m699a(f1710j, f1707g) == false) goto L37;
        return f1708h;
    L37:
        BitmapFactory.Options r22 = new BitmapFactory.Options();     // Catch: Throwable -> L24
        int r4 = 1;
        r22.inJustDecodeBounds = true;     // Catch: Throwable -> L24
        BitmapFactory.decodeFile(r1, r22);     // Catch: Throwable -> L24
        int r5 = r22.outWidth;     // Catch: Throwable -> L24
        int r6 = r22.outHeight;     // Catch: Throwable -> L24
        int r7 = 1;
    L17:
        if (r5 > 1600) goto L26;
        if (r6 > 1600) goto L26;
        if (r7 < 1) goto L23;
        r4 = r7;
    L23:
        r22.inSampleSize = r4;     // Catch: Throwable -> L24
        r22.inJustDecodeBounds = false;     // Catch: Throwable -> L24
        Object r02 = BitmapFactory.decodeFile(r1, r22);     // Catch: Throwable -> L24
    L30:
        if ((r02 instanceof C0140f) == true) goto L33;
        r3 = r02;
    L33:
        Bitmap r32 = (Bitmap) r3;
        if (r32 == null) goto L36;
        f1708h = r32;
        f1709i = r1;
        f1710j = f1707g;
    L36:
        return r32;
    L26:
        r7 = r7 * 2;     // Catch: Throwable -> L24
        r5 = r5 / 2;     // Catch: Throwable -> L24
        r6 = r6 / 2;     // Catch: Throwable -> L24
    L24:
        th = move-exception;
        r02 = AbstractC0040p.m116u(th);
        goto L30
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1393e() {
        m1390g(false);
        return f1704d;
    }
}
