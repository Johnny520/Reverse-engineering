package p381;

import android.content.Context;
import p392.AbstractC9121;

/* JADX INFO: renamed from: 飘花落叶言苏楪世兰子哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8995 extends ClassLoader {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ClassLoader f25281 = AbstractC9121.f25497;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ClassLoader f25282;

    public C8995(ClassLoader classLoader) {
        this.f25282 = classLoader;
    }

    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) {
        ClassLoader classLoader = this.f25282;
        try {
            try {
                if (!str.startsWith("androidx.compose") && !str.startsWith("androidx.navigation") && !str.startsWith("androidx.activity")) {
                    return Context.class.getClassLoader().loadClass(str);
                }
                return classLoader.loadClass(str);
            } catch (ClassNotFoundException unused) {
                return classLoader.loadClass(str);
            }
        } catch (ClassNotFoundException unused2) {
            if (str.equals("androidx.lifecycle.LifecycleOwner") || str.equals("androidx.lifecycle.ReportFragment") || str.equals("androidx.lifecycle.ViewModelStoreOwner") || str.equals("androidx.savedstate.SavedStateRegistryOwner")) {
                return this.f25281.loadClass(str);
            }
            return classLoader.loadClass(str);
        }
    }
}
