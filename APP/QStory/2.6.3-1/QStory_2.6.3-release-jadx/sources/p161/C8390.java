package p161;

import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.WindowExtensionsProvider;
import p132.C8171;
import p269.AbstractC9019;

/* JADX INFO: renamed from: 飘花落叶言子兰苏世哲楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8390 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ClassLoader f20815;

    public C8390(ClassLoader classLoader) {
        this.f20815 = classLoader;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final WindowExtensions m13350() {
        boolean z;
        ClassLoader classLoader = this.f20815;
        boolean z2 = true;
        try {
            try {
                classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider").getClass();
                z = true;
            } catch (Exception unused) {
                return null;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
            z = false;
        }
        if (!z) {
            return null;
        }
        try {
            classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider").getClass();
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        if (!AbstractC9019.m14241("WindowExtensionsProvider#getWindowExtensions is not valid", new C8171(this, 5))) {
            z2 = false;
        }
        if (z2) {
            return WindowExtensionsProvider.getWindowExtensions();
        }
        return null;
    }
}
