package androidx.window.area;

import android.os.Build;
import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.area.WindowAreaComponent;
import p033.AbstractC6325;
import p052.InterfaceC6542;
import p145.C7560;
import p147.AbstractC7562;
import p148.AbstractC7572;

/* JADX INFO: renamed from: androidx.window.area.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2561 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final WindowExtensions f7711;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ClassLoader f7712;

    public C2561(ClassLoader classLoader) {
        this.f7712 = classLoader;
        this.f7711 = new C7560(classLoader).m12762();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final WindowAreaComponent m5049() {
        ClassLoader classLoader = this.f7712;
        try {
            final WindowExtensions windowExtensions = this.f7711;
            if (windowExtensions == null || !AbstractC6325.m11840("WindowExtensions#getWindowAreaComponent is not valid", new InterfaceC6542() { // from class: androidx.window.area.飘花落叶言子楪世苏兰哲
                /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
                @Override // p052.InterfaceC6542
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke() throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException {
                    /*
                        r3 = this;
                        java.lang.Object r0 = r1
                        java.lang.Class r0 = r0.getClass()
                        java.lang.String r1 = "getWindowAreaComponent"
                        r2 = 0
                        java.lang.reflect.Method r0 = r0.getMethod(r1, r2)
                        r0.getClass()
                        int r1 = r0.getModifiers()
                        boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
                        if (r1 == 0) goto L33
                        androidx.window.area.飘花落叶言子楪世哲苏兰 r3 = r2
                        java.lang.ClassLoader r3 = r3.f7712
                        java.lang.String r1 = "androidx.window.extensions.area.WindowAreaComponent"
                        java.lang.Class r3 = r3.loadClass(r1)
                        r3.getClass()
                        java.lang.Class r0 = r0.getReturnType()
                        boolean r3 = r0.equals(r3)
                        if (r3 == 0) goto L33
                        r3 = 1
                        goto L34
                    L33:
                        r3 = 0
                    L34:
                        java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                        return r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.window.area.C2562.invoke():java.lang.Object");
                }
            }) || Build.VERSION.SDK_INT < 29) {
                return null;
            }
            Class<?> clsLoadClass = classLoader.loadClass("androidx.window.extensions.area.WindowAreaComponent");
            clsLoadClass.getClass();
            if (!AbstractC7572.m12766(AbstractC7562.m12763(), clsLoadClass)) {
                return null;
            }
            Class<?> clsLoadClass2 = classLoader.loadClass("androidx.window.extensions.area.ExtensionWindowAreaStatus");
            clsLoadClass2.getClass();
            if (!AbstractC7572.m12767(AbstractC7562.m12763(), clsLoadClass2)) {
                return null;
            }
            Class<?> clsLoadClass3 = classLoader.loadClass("androidx.window.extensions.area.ExtensionWindowAreaPresentation");
            clsLoadClass3.getClass();
            if (AbstractC7572.m12768(AbstractC7562.m12763(), clsLoadClass3)) {
                return this.f7711.getWindowAreaComponent();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
