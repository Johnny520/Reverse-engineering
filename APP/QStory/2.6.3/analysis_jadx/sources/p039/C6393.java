package p039;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import p026.AbstractC6311;
import p036.AbstractC6358;
import p038.C6373;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class C6393 extends AbstractC6311 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) throws ClassNotFoundException {
        Class<?> clsLoadClass;
        Class<?> clsLoadClass2;
        int i = AbstractC6358.f17508;
        if (i >= 5282) {
            clsLoadClass = classLoader.loadClass(AbstractC8405.m13972(264));
            clsLoadClass2 = classLoader.loadClass(AbstractC8405.m13972(265)).getSuperclass();
        } else if (i >= 4938) {
            clsLoadClass = classLoader.loadClass(AbstractC8405.m13972(264));
            clsLoadClass2 = classLoader.loadClass(AbstractC8405.m13972(266));
        } else {
            clsLoadClass = classLoader.loadClass(AbstractC8405.m13972(267));
            clsLoadClass2 = classLoader.loadClass(AbstractC8405.m13972(268));
        }
        while (clsLoadClass != null) {
            for (Method method : clsLoadClass.getDeclaredMethods()) {
                method.setAccessible(true);
                if (method.getReturnType() == clsLoadClass2) {
                    XposedBridge.hookMethod(method, new C6373(10));
                    return;
                }
            }
            clsLoadClass = clsLoadClass.getSuperclass();
        }
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(269);
    }
}
