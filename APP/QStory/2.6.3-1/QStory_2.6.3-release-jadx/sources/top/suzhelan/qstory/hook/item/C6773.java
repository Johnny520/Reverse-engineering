package top.suzhelan.qstory.hook.item;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p049.AbstractC7166;
import p303.AbstractC9234;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏兰哲楪世;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6773 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        Method declaredMethod;
        AbstractC9234.m14532("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        classLoader.getClass();
        Class cls = Integer.TYPE;
        Method method = null;
        try {
            Class clsM12425 = AbstractC7166.m12425(AbstractC9234.m14531(2062));
            try {
                declaredMethod = clsM12425.getDeclaredMethod(AbstractC9234.m14531(2063), cls);
            } catch (NoSuchMethodException unused) {
                Method[] declaredMethods = clsM12425.getDeclaredMethods();
                AbstractC9234.m14531(1555);
                declaredMethods.getClass();
                int length = declaredMethods.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        declaredMethod = null;
                        break;
                    }
                    Method method2 = declaredMethods[i];
                    if (method2.getParameterTypes().length == 1 && AbstractC5227.m9466(method2.getParameterTypes()[0], cls) && AbstractC5227.m9466(method2.getReturnType(), Void.TYPE)) {
                        declaredMethod = method2;
                        break;
                    }
                    i++;
                }
            }
            if (declaredMethod != null) {
                XposedBridge.hookMethod(declaredMethod, new C6745(20));
            }
        } catch (Exception unused2) {
        }
        try {
            Class clsM124252 = AbstractC7166.m12425(AbstractC9234.m14531(2064));
            Class clsM124253 = AbstractC7166.m12425(AbstractC9234.m14531(2062));
            Method[] declaredMethods2 = clsM124252.getDeclaredMethods();
            AbstractC9234.m14531(1555);
            declaredMethods2.getClass();
            int length2 = declaredMethods2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    break;
                }
                Method method3 = declaredMethods2[i2];
                Class<?>[] parameterTypes = method3.getParameterTypes();
                if (parameterTypes.length == 5 && AbstractC5227.m9466(parameterTypes[0], cls) && AbstractC5227.m9466(parameterTypes[1], cls) && AbstractC5227.m9466(parameterTypes[2], cls) && AbstractC5227.m9466(parameterTypes[3], clsM124253) && AbstractC5227.m9466(parameterTypes[4], String.class)) {
                    method = method3;
                    break;
                }
                i2++;
            }
            if (method != null) {
                XposedBridge.hookMethod(method, new C6745(21));
            }
        } catch (Exception unused3) {
        }
    }
}
