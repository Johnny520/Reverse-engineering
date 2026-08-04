package yyds;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: yyds.ᲇᛳᛷᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2423 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final ExecutorC2250 f11965 = new ExecutorC2250(new ExecutorC1267(0));

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final int f11967 = -100;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static C1773 f11961 = null;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static C1773 f11966 = null;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static Boolean f11962 = null;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static boolean f11959 = false;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static final C1970 f11960 = new C1970();

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final Object f11964 = new Object();

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static final Object f11963 = new Object();

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static boolean m4471(Context context) {
        if (f11962 == null) {
            try {
                int i = AbstractServiceC1326.f6092;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC1326.class), AbstractC1285.m2560() | 128).metaData;
                if (bundle != null) {
                    f11962 = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f11962 = Boolean.FALSE;
            }
        }
        return f11962.booleanValue();
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static void m4472(LayoutInflaterFactory2C2181 layoutInflaterFactory2C2181) {
        synchronized (f11964) {
            try {
                C1970 c1970 = f11960;
                c1970.getClass();
                C1070 c1070 = new C1070(c1970);
                while (c1070.hasNext()) {
                    AbstractC2423 abstractC2423 = (AbstractC2423) ((WeakReference) c1070.next()).get();
                    if (abstractC2423 == layoutInflaterFactory2C2181 || abstractC2423 == null) {
                        c1070.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public abstract void mo4151(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public abstract boolean mo4152(int i);

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public abstract void mo4157();

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public abstract void mo4161(View view);

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public abstract void mo4167(CharSequence charSequence);

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public abstract void mo4170(int i);
}
