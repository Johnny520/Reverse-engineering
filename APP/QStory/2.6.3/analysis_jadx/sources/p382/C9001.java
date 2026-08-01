package p382;

import android.content.Context;
import p389.AbstractC9090;

/* JADX INFO: renamed from: 飘花落叶言苏楪世哲兰子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9001 extends ClassLoader {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ClassLoader f25275 = AbstractC9090.f25477;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ClassLoader f25276;

    public C9001(ClassLoader classLoader) {
        this.f25276 = classLoader;
    }

    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) {
        ClassLoader classLoader = this.f25276;
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
                return this.f25275.loadClass(str);
            }
            return classLoader.loadClass(str);
        }
    }
}
