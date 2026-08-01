package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p093.C7800;
import p132.C8171;
import p161.C8390;
import p163.AbstractC8392;
import p269.AbstractC9019;

/* JADX INFO: renamed from: androidx.window.layout.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3420 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8390 f8103;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7800 f8104;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ClassLoader f8105;

    public C3420(ClassLoader classLoader, C7800 c7800) {
        this.f8105 = classLoader;
        this.f8104 = c7800;
        this.f8103 = new C8390(classLoader);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final boolean m5669(C3420 c3420) throws NoSuchMethodException, ClassNotFoundException {
        Class<?> clsLoadClass = c3420.f8105.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
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
    public final boolean m5670() {
        if (!m5671()) {
            return false;
        }
        StringBuilder sb = new StringBuilder("WindowLayoutComponent#addWindowLayoutInfoListener(");
        sb.append(Context.class.getName());
        sb.append(", androidx.window.extensions.core.util.function.Consumer) is not valid");
        return AbstractC9019.m14241(sb.toString(), new C3421(this, 6));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m5671() {
        return AbstractC9019.m14241("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new C3421(this, 5));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final WindowLayoutComponent m5672() {
        int iM13351;
        C8390 c8390 = this.f8103;
        c8390.getClass();
        boolean zM5670 = false;
        zM5670 = false;
        zM5670 = false;
        zM5670 = false;
        zM5670 = false;
        zM5670 = false;
        zM5670 = false;
        zM5670 = false;
        zM5670 = false;
        try {
            c8390.f20815.loadClass("androidx.window.extensions.WindowExtensionsProvider").getClass();
            if (AbstractC9019.m14241("WindowExtensionsProvider#getWindowExtensions is not valid", new C8171(c8390, 5)) && AbstractC9019.m14241("WindowExtensions#getWindowLayoutComponent is not valid", new C3421(this, zM5670 ? 1 : 0)) && AbstractC9019.m14241("FoldingFeature class is not valid", new C3421(this, 1)) && (iM13351 = AbstractC8392.m13351()) >= 1) {
                if (iM13351 == 1) {
                    zM5670 = m5671();
                } else if (iM13351 < 5) {
                    zM5670 = m5670();
                } else if (m5670() && AbstractC9019.m14241("DisplayFoldFeature is not valid", new C3421(this, 3)) && AbstractC9019.m14241("SupportedWindowFeatures is not valid", new C3421(this, 2)) && AbstractC9019.m14241("WindowLayoutComponent#getSupportedWindowFeatures is not valid", new C3421(this, 4))) {
                    zM5670 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!zM5670) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }
}
