package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.C1108;
import androidx.collection.C1122;
import androidx.core.os.C3011;
import java.lang.ref.WeakReference;
import p208.AbstractC8639;
import p208.InterfaceC8640;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0941 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final ExecutorC0938 f620 = new ExecutorC0938(new ExecutorC0937());

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final int f618 = -100;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static C3011 f619 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static C3011 f613 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static Boolean f612 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static boolean f616 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C1122 f617 = new C1122(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final Object f614 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final Object f615 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m886(LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915) {
        synchronized (f614) {
            try {
                C1122 c1122 = f617;
                c1122.getClass();
                C1108 c1108 = new C1108(c1122);
                while (c1108.hasNext()) {
                    AbstractC0941 abstractC0941 = (AbstractC0941) ((WeakReference) c1108.next()).get();
                    if (abstractC0941 == layoutInflaterFactory2C0915 || abstractC0941 == null) {
                        c1108.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static boolean m887(Context context) {
        if (f612 == null) {
            try {
                int i = AbstractServiceC0910.f482;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC0910.class), AbstractC0914.m772() | 128).metaData;
                if (bundle != null) {
                    f612 = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f612 = Boolean.FALSE;
            }
        }
        return f612.booleanValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract void mo787();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract void mo788();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract void mo789();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract void mo790();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public abstract AbstractC8639 mo796(InterfaceC8640 interfaceC8640);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public abstract void mo800(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public abstract boolean mo801(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public abstract void mo802(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public abstract void mo803(CharSequence charSequence);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public abstract void mo804(View view);
}
