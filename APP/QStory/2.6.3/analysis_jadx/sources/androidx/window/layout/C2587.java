package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p077.C6971;
import p116.C7342;
import p145.C7561;
import p147.AbstractC7563;
import p253.AbstractC8190;

/* JADX INFO: renamed from: androidx.window.layout.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2587 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7561 f7758;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6971 f7759;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ClassLoader f7760;

    public C2587(ClassLoader classLoader, C6971 c6971) {
        this.f7760 = classLoader;
        this.f7759 = c6971;
        this.f7758 = new C7561(classLoader);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final boolean m5109(C2587 c2587) throws NoSuchMethodException, ClassNotFoundException {
        Class<?> clsLoadClass = c2587.f7760.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
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
    public final boolean m5110() {
        if (!m5111()) {
            return false;
        }
        StringBuilder sb = new StringBuilder("WindowLayoutComponent#addWindowLayoutInfoListener(");
        sb.append(Context.class.getName());
        sb.append(", androidx.window.extensions.core.util.function.Consumer) is not valid");
        return AbstractC8190.m13682(sb.toString(), new C2588(this, 6));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m5111() {
        return AbstractC8190.m13682("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new C2588(this, 5));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final WindowLayoutComponent m5112() {
        int iM12792;
        C7561 c7561 = this.f7758;
        c7561.getClass();
        boolean zM5110 = false;
        zM5110 = false;
        zM5110 = false;
        zM5110 = false;
        zM5110 = false;
        zM5110 = false;
        zM5110 = false;
        zM5110 = false;
        zM5110 = false;
        try {
            c7561.f20470.loadClass("androidx.window.extensions.WindowExtensionsProvider").getClass();
            if (AbstractC8190.m13682("WindowExtensionsProvider#getWindowExtensions is not valid", new C7342(c7561, 5)) && AbstractC8190.m13682("WindowExtensions#getWindowLayoutComponent is not valid", new C2588(this, zM5110 ? 1 : 0)) && AbstractC8190.m13682("FoldingFeature class is not valid", new C2588(this, 1)) && (iM12792 = AbstractC7563.m12792()) >= 1) {
                if (iM12792 == 1) {
                    zM5110 = m5111();
                } else if (iM12792 < 5) {
                    zM5110 = m5110();
                } else if (m5110() && AbstractC8190.m13682("DisplayFoldFeature is not valid", new C2588(this, 3)) && AbstractC8190.m13682("SupportedWindowFeatures is not valid", new C2588(this, 2)) && AbstractC8190.m13682("WindowLayoutComponent#getSupportedWindowFeatures is not valid", new C2588(this, 4))) {
                    zM5110 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!zM5110) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }
}
