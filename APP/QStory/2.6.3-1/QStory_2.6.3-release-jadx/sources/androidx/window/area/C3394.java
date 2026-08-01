package androidx.window.area;

import android.os.Build;
import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.area.WindowAreaComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p068.InterfaceC7372;
import p161.C8390;
import p163.AbstractC8392;
import p164.AbstractC8402;
import p269.AbstractC9019;

/* JADX INFO: renamed from: androidx.window.area.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3394 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final WindowExtensions f8057;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ClassLoader f8058;

    public C3394(ClassLoader classLoader) {
        this.f8058 = classLoader;
        this.f8057 = new C8390(classLoader).m13350();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final WindowAreaComponent m5619() {
        ClassLoader classLoader = this.f8058;
        try {
            final WindowExtensions windowExtensions = this.f8057;
            if (windowExtensions == null || !AbstractC9019.m14241("WindowExtensions#getWindowAreaComponent is not valid", new InterfaceC7372() { // from class: androidx.window.area.飘花落叶言子楪世苏兰哲
                /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
                @Override // p068.InterfaceC7372
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke() throws NoSuchMethodException, ClassNotFoundException {
                    boolean z;
                    Method method = windowExtensions.getClass().getMethod("getWindowAreaComponent", null);
                    method.getClass();
                    if (Modifier.isPublic(method.getModifiers())) {
                        Class<?> clsLoadClass = this.f8058.loadClass("androidx.window.extensions.area.WindowAreaComponent");
                        clsLoadClass.getClass();
                        z = method.getReturnType().equals(clsLoadClass);
                    }
                    return Boolean.valueOf(z);
                }
            }) || Build.VERSION.SDK_INT < 29) {
                return null;
            }
            Class<?> clsLoadClass = classLoader.loadClass("androidx.window.extensions.area.WindowAreaComponent");
            clsLoadClass.getClass();
            if (!AbstractC8402.m13354(AbstractC8392.m13351(), clsLoadClass)) {
                return null;
            }
            Class<?> clsLoadClass2 = classLoader.loadClass("androidx.window.extensions.area.ExtensionWindowAreaStatus");
            clsLoadClass2.getClass();
            if (!AbstractC8402.m13355(AbstractC8392.m13351(), clsLoadClass2)) {
                return null;
            }
            Class<?> clsLoadClass3 = classLoader.loadClass("androidx.window.extensions.area.ExtensionWindowAreaPresentation");
            clsLoadClass3.getClass();
            if (AbstractC8402.m13356(AbstractC8392.m13351(), clsLoadClass3)) {
                return this.f8057.getWindowAreaComponent();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
