package p398;

import android.content.Context;
import kotlin.text.AbstractC5971;
import p405.AbstractC9919;
import p405.C9920;

/* JADX INFO: renamed from: 飘花落叶言苏楪世哲兰子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9829 extends ClassLoader {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ClassLoader f25618;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ClassLoader f25619;

    public C9829(ClassLoader classLoader) {
        this.f25619 = classLoader;
        C9920 c9920 = AbstractC9919.f25822;
        c9920.getClass();
        this.f25618 = c9920;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (r3.equals("androidx.lifecycle.ReportFragment") != false) goto L28;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.lang.ClassLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Class loadClass(String str, boolean z) {
        ClassLoader classLoader = this.f25619;
        str.getClass();
        try {
            try {
                if (!AbstractC5971.m10698(str, "androidx.compose", false) && !AbstractC5971.m10698(str, "androidx.navigation", false) && !AbstractC5971.m10698(str, "androidx.activity", false)) {
                    ClassLoader classLoader2 = Context.class.getClassLoader();
                    classLoader2.getClass();
                    return classLoader2.loadClass(str);
                }
                return classLoader.loadClass(str);
            } catch (ClassNotFoundException unused) {
                switch (str.hashCode()) {
                    case -1618810579:
                        break;
                    case -629067507:
                        if (!str.equals("androidx.lifecycle.ViewModelStoreOwner")) {
                            return classLoader.loadClass(str);
                        }
                        return this.f25618.loadClass(str);
                    case 304606962:
                        if (!str.equals("androidx.lifecycle.LifecycleOwner")) {
                            return classLoader.loadClass(str);
                        }
                        return this.f25618.loadClass(str);
                    case 1358252749:
                        if (!str.equals("androidx.savedstate.SavedStateRegistryOwner")) {
                            return classLoader.loadClass(str);
                        }
                        return this.f25618.loadClass(str);
                    default:
                        return classLoader.loadClass(str);
                }
            }
        } catch (ClassNotFoundException unused2) {
            return classLoader.loadClass(str);
        }
    }
}
