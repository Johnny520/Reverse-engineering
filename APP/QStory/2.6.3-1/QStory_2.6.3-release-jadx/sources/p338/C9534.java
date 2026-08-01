package p338;

import android.content.Context;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p052.AbstractC7187;
import p303.AbstractC9234;
import top.suzhelan.qstory.hook.api.C6642;

/* JADX INFO: renamed from: 飘花落叶言苏世兰子楪哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"L飘花落叶言苏世兰子楪哲/飘花落叶言子楪苏世兰哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C9534 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) throws ClassNotFoundException {
        Method method;
        AbstractC9234.m14531(1257);
        classLoader.getClass();
        if (AbstractC7187.f17853 < 12290) {
            return;
        }
        Class<?> clsLoadClass = classLoader.loadClass(AbstractC9234.m14531(2664));
        Class<?> clsLoadClass2 = classLoader.loadClass(AbstractC9234.m14531(118));
        Method[] declaredMethods = clsLoadClass.getDeclaredMethods();
        AbstractC9234.m14531(1555);
        declaredMethods.getClass();
        int length = declaredMethods.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                method = null;
                break;
            }
            method = declaredMethods[i];
            if (AbstractC5227.m9466(method.getName(), AbstractC9234.m14531(2665)) && method.getParameterCount() == 2 && AbstractC5227.m9466(method.getParameterTypes()[0], Context.class) && AbstractC5227.m9466(method.getParameterTypes()[1], clsLoadClass2)) {
                break;
            } else {
                i++;
            }
        }
        if (method == null) {
            return;
        }
        XposedBridge.hookMethod(method, new C6642(this, 22));
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(2663);
    }
}
