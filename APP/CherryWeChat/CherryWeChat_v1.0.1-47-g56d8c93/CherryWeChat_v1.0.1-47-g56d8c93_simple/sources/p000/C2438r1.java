package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.SystemClock;
import io.sentry.C1564B1;
import io.sentry.C1581F2;
import io.sentry.C2046v2;
import io.sentry.InterfaceC1936o1;
import io.sentry.InterfaceC2003t0;
import io.sentry.android.core.AbstractC1664G;
import io.sentry.transport.InterfaceC2011f;
import io.sentry.util.AbstractC2036h;
import io.sentry.util.AbstractC2039k;
import io.sentry.util.InterfaceC2031c;

/* JADX INFO: renamed from: r1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2438r1 implements InterfaceC1014Xj, InterfaceC2662wA, InterfaceC2003t0, InterfaceC2031c, InterfaceC1936o1, InterfaceC2011f {

    /* JADX INFO: renamed from: b */
    public static final C2438r1 f8547b = null;

    /* JADX INFO: renamed from: c */
    public static final C2438r1 f8548c = null;

    /* JADX INFO: renamed from: d */
    public static final C2438r1 f8549d = null;

    /* JADX INFO: renamed from: e */
    public static final C2438r1 f8550e = null;

    /* JADX INFO: renamed from: f */
    public static final C2438r1 f8551f = null;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8552a;

    static {
        f8547b = new C2438r1(12);
        f8548c = new C2438r1(13);
        f8549d = new C2438r1(14);
        f8550e = new C2438r1(15);
        f8551f = new C2438r1(16);
    }

    public /* synthetic */ C2438r1(int r1) {
        this.f8552a = r1;
    }

    @Override // io.sentry.InterfaceC1936o1
    /* JADX INFO: renamed from: a */
    public void mo3613a(C1581F2 r1) {
    }

    @Override // io.sentry.transport.InterfaceC2011f
    /* JADX INFO: renamed from: b */
    public long mo3899b() {
        return SystemClock.uptimeMillis();
    }

    @Override // io.sentry.util.InterfaceC2031c
    /* JADX INFO: renamed from: c */
    public Object mo3688c() {
        switch(this.f8552a) {
            case 19: goto L12;
            case 20: goto L4;
            case 21: goto L10;
            default: goto L4;
        };
    L4:
        byte[] r2 = new byte[8];
        AbstractC2036h.m4180a().m4178b(r2);
        byte r3 = (byte) (r2[6] & 15);
        r2[6] = r3;
        r2[6] = (byte) (r3 | 64);
        long r32 = 0;
        int r0 = 0;
    L5:
        if (r0 >= 8) goto L7;
        r32 = (r32 << 8) | ((long) (r2[r0] & 255));
        r0 = r0 + 1;
        goto L5
    L7:
        char[] r02 = new char[16];
        AbstractC2039k.m4184a(r02, r32);
        return new String(r02);
    L10:
        return new C1564B1();
    L12:
        return C2046v2.empty();
    }

    @Override // io.sentry.InterfaceC2003t0
    /* JADX INFO: renamed from: d */
    public Object mo1426d() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public Object m4890e(Context r3) {
        switch(this.f8552a) {
            case 25: goto L39;
            case 26: goto L37;
            case 27: goto L32;
            case 28: goto L35;
            default: goto L30;
        };
    L30:
        return AbstractC1664G.m3817a(r3.getPackageManager(), r3.getPackageName(), AbstractC1664G.m3819c());
    L6:
        return null;
    L32:
        return r3.getPackageManager().getPackageInfo(r3.getPackageName(), 0);
    L20:
        return null;
    L35:
        ApplicationInfo r0 = r3.getApplicationInfo();     // Catch: Throwable -> L16
        int r1 = r0.labelRes;     // Catch: Throwable -> L16
        if (r1 != 0) goto L14;
        CharSequence r12 = r0.nonLocalizedLabel;     // Catch: Throwable -> L16
        if (r12 == null) goto L13;
        String r32 = r12.toString();     // Catch: Throwable -> L16
    L34:
        return r32;
    L13:
        r32 = r3.getPackageManager().getApplicationLabel(r0).toString();     // Catch: Throwable -> L16
        goto L34
    L14:
        r32 = r3.getString(r1);     // Catch: Throwable -> L16
    L16:
        return null;
    L37:
        return AbstractC1664G.m3818b(r3.getPackageManager(), r3.getPackageName(), AbstractC1664G.m3820d());
    L24:
        return null;
    L39:
        return r3.getPackageManager().getApplicationInfo(r3.getPackageName(), 128);
    L28:
        return null;
    }

    @Override // p000.InterfaceC1014Xj
    public Object get() {
        boolean r2 = false;
        if (Build.VERSION.SDK_INT != 34) goto L11;
        Bitmap r0 = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
        Bitmap r3 = r0.copy(Bitmap.Config.HARDWARE, false);
        r0.recycle();
        if (r3 != null) goto L8;
        r2 = true;
    L8:
        if (r3 == null) goto L11;
        r3.recycle();
    L11:
        return Boolean.valueOf(r2);
    }
}
