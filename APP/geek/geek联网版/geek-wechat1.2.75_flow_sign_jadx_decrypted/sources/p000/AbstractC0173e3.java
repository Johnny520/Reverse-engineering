package p000;

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

/* JADX INFO: renamed from: e3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0173e3 {

    /* JADX INFO: renamed from: a */
    public static final ExecutorC0769u5 f1489a = new ExecutorC0769u5(new ExecutorC0806v5());

    /* JADX INFO: renamed from: b */
    public static final int f1490b = -100;

    /* JADX INFO: renamed from: c */
    public static C0866wr f1491c = null;

    /* JADX INFO: renamed from: d */
    public static C0866wr f1492d = null;

    /* JADX INFO: renamed from: e */
    public static Boolean f1493e = null;

    /* JADX INFO: renamed from: f */
    public static boolean f1494f = false;

    /* JADX INFO: renamed from: g */
    public static final C0622q6 f1495g = new C0622q6();

    /* JADX INFO: renamed from: h */
    public static final Object f1496h = new Object();

    /* JADX INFO: renamed from: i */
    public static final Object f1497i = new Object();

    /* JADX INFO: renamed from: c */
    public static boolean m955c(Context context) {
        if (f1493e == null) {
            try {
                int i = AppLocalesMetadataHolderService.f156a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), AbstractC0695s5.m2305a() | 128).metaData;
                if (bundle != null) {
                    f1493e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f1493e = Boolean.FALSE;
            }
        }
        return f1493e.booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public static void m956f(LayoutInflaterFactory2C0656r3 layoutInflaterFactory2C0656r3) {
        synchronized (f1496h) {
            try {
                Iterator it = f1495g.iterator();
                while (true) {
                    C0941ys c0941ys = (C0941ys) it;
                    if (c0941ys.hasNext()) {
                        AbstractC0173e3 abstractC0173e3 = (AbstractC0173e3) ((WeakReference) c0941ys.next()).get();
                        if (abstractC0173e3 == layoutInflaterFactory2C0656r3 || abstractC0173e3 == null) {
                            c0941ys.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo957a();

    /* JADX INFO: renamed from: b */
    public abstract void mo958b();

    /* JADX INFO: renamed from: d */
    public abstract void mo959d();

    /* JADX INFO: renamed from: e */
    public abstract void mo960e();

    /* JADX INFO: renamed from: g */
    public abstract boolean mo961g(int i);

    /* JADX INFO: renamed from: h */
    public abstract void mo962h(int i);

    /* JADX INFO: renamed from: i */
    public abstract void mo963i(View view);

    /* JADX INFO: renamed from: j */
    public abstract void mo964j(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: l */
    public abstract void mo965l(CharSequence charSequence);
}
