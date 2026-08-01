package top.suzhelan.qstory.hook.item;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p033.AbstractC6337;
import p287.AbstractC8405;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏兰哲楪世;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5943 extends AbstractC6311 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        Method declaredMethod;
        AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        classLoader.getClass();
        Class cls = Integer.TYPE;
        Method method = null;
        try {
            Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(2062));
            try {
                declaredMethod = clsM11866.getDeclaredMethod(AbstractC8405.m13972(2063), cls);
            } catch (NoSuchMethodException unused) {
                Method[] declaredMethods = clsM11866.getDeclaredMethods();
                AbstractC8405.m13972(1555);
                declaredMethods.getClass();
                int length = declaredMethods.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        declaredMethod = null;
                        break;
                    }
                    Method method2 = declaredMethods[i];
                    if (method2.getParameterTypes().length == 1 && AbstractC4395.m8907(method2.getParameterTypes()[0], cls) && AbstractC4395.m8907(method2.getReturnType(), Void.TYPE)) {
                        declaredMethod = method2;
                        break;
                    }
                    i++;
                }
            }
            if (declaredMethod != null) {
                XposedBridge.hookMethod(declaredMethod, new C5915(20));
            }
        } catch (Exception unused2) {
        }
        try {
            Class clsM118662 = AbstractC6337.m11866(AbstractC8405.m13972(2064));
            Class clsM118663 = AbstractC6337.m11866(AbstractC8405.m13972(2062));
            Method[] declaredMethods2 = clsM118662.getDeclaredMethods();
            AbstractC8405.m13972(1555);
            declaredMethods2.getClass();
            int length2 = declaredMethods2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    break;
                }
                Method method3 = declaredMethods2[i2];
                Class<?>[] parameterTypes = method3.getParameterTypes();
                if (parameterTypes.length == 5 && AbstractC4395.m8907(parameterTypes[0], cls) && AbstractC4395.m8907(parameterTypes[1], cls) && AbstractC4395.m8907(parameterTypes[2], cls) && AbstractC4395.m8907(parameterTypes[3], clsM118663) && AbstractC4395.m8907(parameterTypes[4], String.class)) {
                    method = method3;
                    break;
                }
                i2++;
            }
            if (method != null) {
                XposedBridge.hookMethod(method, new C5915(21));
            }
        } catch (Exception unused3) {
        }
    }
}
