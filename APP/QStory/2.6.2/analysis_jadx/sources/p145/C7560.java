package p145;

import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.WindowExtensionsProvider;
import p033.AbstractC6325;
import p116.C7341;

/* JADX INFO: renamed from: 飘花落叶言子兰苏世哲楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7560 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ClassLoader f20475;

    public C7560(ClassLoader classLoader) {
        this.f20475 = classLoader;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final WindowExtensions m12762() {
        boolean z;
        ClassLoader classLoader = this.f20475;
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
        if (!AbstractC6325.m11840("WindowExtensionsProvider#getWindowExtensions is not valid", new C7341(this, 5))) {
            z2 = false;
        }
        if (z2) {
            return WindowExtensionsProvider.getWindowExtensions();
        }
        return null;
    }
}
