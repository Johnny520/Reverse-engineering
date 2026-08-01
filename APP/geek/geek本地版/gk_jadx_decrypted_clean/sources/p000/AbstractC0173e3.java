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
    public static final ExecutorC0770u5 f1684a = new ExecutorC0770u5(new ExecutorC0807v5());

    /* JADX INFO: renamed from: b */
    public static final int f1685b = -100;

    /* JADX INFO: renamed from: c */
    public static C0718sr f1686c = null;

    /* JADX INFO: renamed from: d */
    public static C0718sr f1687d = null;

    /* JADX INFO: renamed from: e */
    public static Boolean f1688e = null;

    /* JADX INFO: renamed from: f */
    public static boolean f1689f = false;

    /* JADX INFO: renamed from: g */
    public static final C0623q6 f1690g = new C0623q6();

    /* JADX INFO: renamed from: h */
    public static final Object f1691h = new Object();

    /* JADX INFO: renamed from: i */
    public static final Object f1692i = new Object();

    /* JADX INFO: renamed from: c */
    public static boolean m971c(Context context) {
        if (f1688e == null) {
            try {
                int i = AppLocalesMetadataHolderService.f193a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), AbstractC0696s5.m2305a() | 128).metaData;
                if (bundle != null) {
                    f1688e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f1688e = Boolean.FALSE;
            }
        }
        return f1688e.booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public static void m972f(LayoutInflaterFactory2C0657r3 layoutInflaterFactory2C0657r3) {
        synchronized (f1691h) {
            try {
                Iterator it = f1690g.iterator();
                while (true) {
                    C0719ss c0719ss = (C0719ss) it;
                    if (c0719ss.hasNext()) {
                        AbstractC0173e3 abstractC0173e3 = (AbstractC0173e3) ((WeakReference) c0719ss.next()).get();
                        if (abstractC0173e3 == layoutInflaterFactory2C0657r3 || abstractC0173e3 == null) {
                            c0719ss.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo973a();

    /* JADX INFO: renamed from: b */
    public abstract void mo974b();

    /* JADX INFO: renamed from: d */
    public abstract void mo975d();

    /* JADX INFO: renamed from: e */
    public abstract void mo976e();

    /* JADX INFO: renamed from: g */
    public abstract boolean mo977g(int i);

    /* JADX INFO: renamed from: h */
    public abstract void mo978h(int i);

    /* JADX INFO: renamed from: i */
    public abstract void mo979i(View view);

    /* JADX INFO: renamed from: j */
    public abstract void mo980j(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: l */
    public abstract void mo981l(CharSequence charSequence);
}
