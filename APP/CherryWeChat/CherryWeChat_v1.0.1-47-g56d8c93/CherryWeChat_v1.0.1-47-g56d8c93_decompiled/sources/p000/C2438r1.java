package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.SystemClock;
import io.sentry.C1564B1;
import io.sentry.C1581F2;
import io.sentry.C2046v2;
import io.sentry.InterfaceC1936o1;
import io.sentry.InterfaceC2003t0;
import io.sentry.transport.InterfaceC2011f;
import io.sentry.util.AbstractC2036h;
import io.sentry.util.AbstractC2039k;
import io.sentry.util.InterfaceC2031c;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: r1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2438r1 implements InterfaceC1014Xj, InterfaceC2662wA, InterfaceC2003t0, InterfaceC2031c, InterfaceC1936o1, InterfaceC2011f {

    /* JADX INFO: renamed from: b */
    public static final C2438r1 f8547b = new C2438r1(12);

    /* JADX INFO: renamed from: c */
    public static final C2438r1 f8548c = new C2438r1(13);

    /* JADX INFO: renamed from: d */
    public static final C2438r1 f8549d = new C2438r1(14);

    /* JADX INFO: renamed from: e */
    public static final C2438r1 f8550e = new C2438r1(15);

    /* JADX INFO: renamed from: f */
    public static final C2438r1 f8551f = new C2438r1(16);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8552a;

    public /* synthetic */ C2438r1(int i) {
        this.f8552a = i;
    }

    @Override // io.sentry.InterfaceC1936o1
    /* JADX INFO: renamed from: a */
    public void mo3613a(C1581F2 c1581f2) {
    }

    @Override // io.sentry.transport.InterfaceC2011f
    /* JADX INFO: renamed from: b */
    public long mo3899b() {
        return SystemClock.uptimeMillis();
    }

    @Override // io.sentry.util.InterfaceC2031c
    /* JADX INFO: renamed from: c */
    public Object mo3688c() {
        switch (this.f8552a) {
            case 19:
                return C2046v2.empty();
            case LuaJitConsts.LUA_MINSTACK /* 20 */:
            default:
                byte[] bArr = new byte[8];
                AbstractC2036h.m4180a().m4178b(bArr);
                byte b = (byte) (bArr[6] & 15);
                bArr[6] = b;
                bArr[6] = (byte) (b | 64);
                long j = 0;
                for (int i = 0; i < 8; i++) {
                    j = (j << 8) | ((long) (bArr[i] & 255));
                }
                char[] cArr = new char[16];
                AbstractC2039k.m4184a(cArr, j);
                return new String(cArr);
            case 21:
                return new C1564B1();
        }
    }

    @Override // io.sentry.InterfaceC2003t0
    /* JADX INFO: renamed from: d */
    public Object mo1426d() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public Object m4890e(Context context) {
        String string;
        switch (this.f8552a) {
            case 25:
                try {
                    return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                } catch (Throwable unused) {
                    return null;
                }
            case 26:
                try {
                    return context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
                } catch (Throwable unused2) {
                    return null;
                }
            case 27:
                try {
                    return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                } catch (Throwable unused3) {
                    return null;
                }
            case 28:
                try {
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    int i = applicationInfo.labelRes;
                    if (i == 0) {
                        CharSequence charSequence = applicationInfo.nonLocalizedLabel;
                        string = charSequence != null ? charSequence.toString() : context.getPackageManager().getApplicationLabel(applicationInfo).toString();
                    } else {
                        string = context.getString(i);
                    }
                    return string;
                } catch (Throwable unused4) {
                    return null;
                }
            default:
                try {
                    return context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L));
                } catch (Throwable unused5) {
                    return null;
                }
        }
    }

    @Override // p000.InterfaceC1014Xj
    public Object get() {
        if (Build.VERSION.SDK_INT == 34) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
            Bitmap bitmapCopy = bitmapCreateBitmap.copy(Bitmap.Config.HARDWARE, false);
            bitmapCreateBitmap.recycle();
            z = bitmapCopy == null;
            if (bitmapCopy != null) {
                bitmapCopy.recycle();
            }
        }
        return Boolean.valueOf(z);
    }
}
