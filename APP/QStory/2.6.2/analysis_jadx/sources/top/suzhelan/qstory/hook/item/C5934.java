package top.suzhelan.qstory.hook.item;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p032.AbstractC6318;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏兰世哲楪;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5934 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        Method declaredMethod;
        AbstractC3056.m6668(-3937615941064721831L);
        classLoader.getClass();
        Class cls = Integer.TYPE;
        Method method = null;
        try {
            Class clsM11838 = AbstractC6318.m11838(AbstractC3056.m6668(-3937765341502113191L));
            try {
                declaredMethod = clsM11838.getDeclaredMethod(AbstractC3056.m6668(-3937765234127930791L), cls);
            } catch (NoSuchMethodException unused) {
                Method[] declaredMethods = clsM11838.getDeclaredMethods();
                AbstractC3056.m6668(-3937714304405734823L);
                declaredMethods.getClass();
                int length = declaredMethods.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        declaredMethod = null;
                        break;
                    }
                    Method method2 = declaredMethods[i];
                    if (method2.getParameterTypes().length == 1 && AbstractC4394.m8917(method2.getParameterTypes()[0], cls) && AbstractC4394.m8917(method2.getReturnType(), Void.TYPE)) {
                        declaredMethod = method2;
                        break;
                    }
                    i++;
                }
            }
            if (declaredMethod != null) {
                XposedBridge.hookMethod(declaredMethod, new C5909(20));
            }
        } catch (Exception unused2) {
        }
        try {
            Class clsM118382 = AbstractC6318.m11838(AbstractC3056.m6668(-3937765105278911911L));
            Class clsM118383 = AbstractC6318.m11838(AbstractC3056.m6668(-3937765341502113191L));
            Method[] declaredMethods2 = clsM118382.getDeclaredMethods();
            AbstractC3056.m6668(-3937714304405734823L);
            declaredMethods2.getClass();
            int length2 = declaredMethods2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    break;
                }
                Method method3 = declaredMethods2[i2];
                Class<?>[] parameterTypes = method3.getParameterTypes();
                if (parameterTypes.length == 5 && AbstractC4394.m8917(parameterTypes[0], cls) && AbstractC4394.m8917(parameterTypes[1], cls) && AbstractC4394.m8917(parameterTypes[2], cls) && AbstractC4394.m8917(parameterTypes[3], clsM118383) && AbstractC4394.m8917(parameterTypes[4], String.class)) {
                    method = method3;
                    break;
                }
                i2++;
            }
            if (method != null) {
                XposedBridge.hookMethod(method, new C5909(21));
            }
        } catch (Exception unused3) {
        }
    }
}
