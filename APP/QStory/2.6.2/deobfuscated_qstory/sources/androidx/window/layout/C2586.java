package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p033.AbstractC6325;
import p077.C6970;
import p116.C7341;
import p145.C7560;
import p147.AbstractC7562;

/* JADX INFO: renamed from: androidx.window.layout.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2586 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7560 f7756;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6970 f7757;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ClassLoader f7758;

    public C2586(ClassLoader classLoader, C6970 c6970) {
        this.f7758 = classLoader;
        this.f7757 = c6970;
        this.f7756 = new C7560(classLoader);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final boolean m5064(C2586 c2586) throws NoSuchMethodException, ClassNotFoundException {
        Class<?> clsLoadClass = c2586.f7758.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        clsLoadClass.getClass();
        Method method = clsLoadClass.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
        Method method2 = clsLoadClass.getMethod("removeWindowLayoutInfoListener", Consumer.class);
        method.getClass();
        if (!Modifier.isPublic(method.getModifiers())) {
            return false;
        }
        method2.getClass();
        return Modifier.isPublic(method2.getModifiers());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m5065() {
        if (!m5066()) {
            return false;
        }
        StringBuilder sb = new StringBuilder("WindowLayoutComponent#addWindowLayoutInfoListener(");
        sb.append(Context.class.getName());
        sb.append(", androidx.window.extensions.core.util.function.Consumer) is not valid");
        return AbstractC6325.m11840(sb.toString(), new C2587(this, 6));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m5066() {
        return AbstractC6325.m11840("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new C2587(this, 5));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final WindowLayoutComponent m5067() {
        int iM12763;
        C7560 c7560 = this.f7756;
        c7560.getClass();
        boolean zM5065 = false;
        zM5065 = false;
        zM5065 = false;
        zM5065 = false;
        zM5065 = false;
        zM5065 = false;
        zM5065 = false;
        zM5065 = false;
        zM5065 = false;
        try {
            c7560.f20475.loadClass("androidx.window.extensions.WindowExtensionsProvider").getClass();
            if (AbstractC6325.m11840("WindowExtensionsProvider#getWindowExtensions is not valid", new C7341(c7560, 5)) && AbstractC6325.m11840("WindowExtensions#getWindowLayoutComponent is not valid", new C2587(this, zM5065 ? 1 : 0)) && AbstractC6325.m11840("FoldingFeature class is not valid", new C2587(this, 1)) && (iM12763 = AbstractC7562.m12763()) >= 1) {
                if (iM12763 == 1) {
                    zM5065 = m5066();
                } else if (iM12763 < 5) {
                    zM5065 = m5065();
                } else if (m5065() && AbstractC6325.m11840("DisplayFoldFeature is not valid", new C2587(this, 3)) && AbstractC6325.m11840("SupportedWindowFeatures is not valid", new C2587(this, 2)) && AbstractC6325.m11840("WindowLayoutComponent#getSupportedWindowFeatures is not valid", new C2587(this, 4))) {
                    zM5065 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!zM5065) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }
}
