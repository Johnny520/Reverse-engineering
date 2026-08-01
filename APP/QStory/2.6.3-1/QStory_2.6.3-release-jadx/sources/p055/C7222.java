package p055;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import p042.AbstractC7140;
import p052.AbstractC7187;
import p054.C7202;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class C7222 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) throws ClassNotFoundException {
        Class<?> clsLoadClass;
        Class<?> clsLoadClass2;
        int i = AbstractC7187.f17853;
        if (i >= 5282) {
            clsLoadClass = classLoader.loadClass(AbstractC9234.m14531(264));
            clsLoadClass2 = classLoader.loadClass(AbstractC9234.m14531(265)).getSuperclass();
        } else if (i >= 4938) {
            clsLoadClass = classLoader.loadClass(AbstractC9234.m14531(264));
            clsLoadClass2 = classLoader.loadClass(AbstractC9234.m14531(266));
        } else {
            clsLoadClass = classLoader.loadClass(AbstractC9234.m14531(267));
            clsLoadClass2 = classLoader.loadClass(AbstractC9234.m14531(268));
        }
        while (clsLoadClass != null) {
            for (Method method : clsLoadClass.getDeclaredMethods()) {
                method.setAccessible(true);
                if (method.getReturnType() == clsLoadClass2) {
                    XposedBridge.hookMethod(method, new C7202(10));
                    return;
                }
            }
            clsLoadClass = clsLoadClass.getSuperclass();
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(269);
    }
}
