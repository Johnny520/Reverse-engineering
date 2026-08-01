package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.C0261;
import androidx.collection.C0275;
import androidx.core.os.C2178;
import java.lang.ref.WeakReference;
import p192.AbstractC7809;
import p192.InterfaceC7810;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0094 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final ExecutorC0091 f275 = new ExecutorC0091(new ExecutorC0090());

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final int f273 = -100;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static C2178 f274 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static C2178 f268 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static Boolean f267 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static boolean f271 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C0275 f272 = new C0275(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final Object f269 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final Object f270 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m325(LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068) {
        synchronized (f269) {
            try {
                C0275 c0275 = f272;
                c0275.getClass();
                C0261 c0261 = new C0261(c0275);
                while (c0261.hasNext()) {
                    AbstractC0094 abstractC0094 = (AbstractC0094) ((WeakReference) c0261.next()).get();
                    if (abstractC0094 == layoutInflaterFactory2C0068 || abstractC0094 == null) {
                        c0261.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static boolean m326(Context context) {
        if (f267 == null) {
            try {
                int i = AbstractServiceC0063.f137;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC0063.class), AbstractC0067.m211() | 128).metaData;
                if (bundle != null) {
                    f267 = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f267 = Boolean.FALSE;
            }
        }
        return f267.booleanValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract void mo226();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract void mo227();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract void mo228();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract void mo229();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public abstract AbstractC7809 mo235(InterfaceC7810 interfaceC7810);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public abstract void mo239(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public abstract boolean mo240(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public abstract void mo241(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public abstract void mo242(CharSequence charSequence);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public abstract void mo243(View view);
}
