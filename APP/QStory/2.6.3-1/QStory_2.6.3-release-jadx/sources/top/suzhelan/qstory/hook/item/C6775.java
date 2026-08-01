package top.suzhelan.qstory.hook.item;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p303.AbstractC9234;
import top.suzhelan.qstory.hook.api.C6642;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏兰楪哲世;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6775 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        Method method;
        Class cls;
        Class cls2;
        Method method2;
        AbstractC9234.m14532("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        classLoader.getClass();
        try {
            Method[] declaredMethods = Class.forName(AbstractC9234.m14531(2056)).getDeclaredMethods();
            declaredMethods.getClass();
            int length = declaredMethods.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                method = null;
                cls = Boolean.TYPE;
                cls2 = Void.TYPE;
                if (i2 >= length) {
                    method2 = null;
                    break;
                }
                method2 = declaredMethods[i2];
                if (AbstractC5227.m9466(method2.getReturnType(), cls2) && method2.getParameterCount() == 3 && AbstractC5227.m9466(method2.getParameterTypes()[0], cls)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (method2 == null) {
                int length2 = declaredMethods.length;
                while (true) {
                    if (i >= length2) {
                        break;
                    }
                    Method method3 = declaredMethods[i];
                    if (AbstractC5227.m9466(method3.getReturnType(), cls2) && method3.getParameterCount() == 4 && AbstractC5227.m9466(method3.getParameterTypes()[1], cls)) {
                        method = method3;
                        break;
                    }
                    i++;
                }
                if (method == null) {
                    return;
                } else {
                    method2 = method;
                }
            }
            XposedBridge.hookMethod(method2, new C6642(this, 8));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(2055);
    }
}
