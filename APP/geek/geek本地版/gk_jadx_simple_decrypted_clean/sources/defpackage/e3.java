package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class e3 {
    public static final u5 a = null;
    public static final int b = 0;
    public static sr c;
    public static sr d;
    public static Boolean e;
    public static boolean f;
    public static final q6 g = null;
    public static final Object h = null;
    public static final Object i = null;

    static {
        a = new u5(new v5());
        b = -100;
        c = null;
        d = null;
        e = null;
        f = false;
        g = new q6();
        h = new Object();
        i = new Object();
    }

    public static boolean c(Context r4) {
        if (e != null) goto L10;
        int r0 = AppLocalesMetadataHolderService.a;     // Catch: PackageManager.NameNotFoundException -> L8
        int r02 = s5.a() | 128;     // Catch: PackageManager.NameNotFoundException -> L8
        Bundle r42 = r4.getPackageManager().getServiceInfo(new ComponentName(r4, AppLocalesMetadataHolderService.class), r02).metaData;     // Catch: PackageManager.NameNotFoundException -> L8
        if (r42 == null) goto L10;
        e = Boolean.valueOf(r42.getBoolean("autoStoreLocales"));     // Catch: PackageManager.NameNotFoundException -> L8
    L8:
        Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
        e = Boolean.FALSE;
    L10:
        return e.booleanValue();
    }

    public static void f(r3 r4) {
        Object r0 = h;
        monitor-enter(r0);
        Iterator r1 = g.iterator();     // Catch: Throwable -> L11
    L5:
        ss r2 = (ss) r1;     // Catch: Throwable -> L11
        if (r2.hasNext() == false) goto L13;
        e3 r3 = (e3) ((WeakReference) r2.next()).get();     // Catch: Throwable -> L11
        if (r3 == r4) goto L10;
        if (r3 != null) goto L5;
    L10:
        r2.remove();     // Catch: Throwable -> L11
        goto L5
    L13:
        monitor-exit(r0);     // Catch: Throwable -> L11
        return;
    L11:
        th = move-exception;
        throw th;
    }

    public abstract void a();

    public abstract void b();

    public abstract void d();

    public abstract void e();

    public abstract boolean g(int r1);

    public abstract void h(int r1);

    public abstract void i(View r1);

    public abstract void j(View r1, ViewGroup.LayoutParams r2);

    public abstract void l(CharSequence r1);
}
