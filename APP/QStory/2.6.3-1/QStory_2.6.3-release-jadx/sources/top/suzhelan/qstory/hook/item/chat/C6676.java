package top.suzhelan.qstory.hook.item.chat;

import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p052.AbstractC7187;
import p303.AbstractC9234;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏楪哲兰;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6676 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        Method method;
        AbstractC9234.m14532("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        classLoader.getClass();
        Class clsFindClassIfExists = XposedHelpers.findClassIfExists(AbstractC9234.m14531(2193), classLoader);
        Method method2 = null;
        if (clsFindClassIfExists != null) {
            String strM14531 = AbstractC7187.f17853 >= 9898 ? AbstractC9234.m14531(2194) : AbstractC9234.m14531(2195);
            Method[] declaredMethods = clsFindClassIfExists.getDeclaredMethods();
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
                if (AbstractC5227.m9466(method.getName(), strM14531)) {
                    break;
                } else {
                    i++;
                }
            }
            if (method != null) {
                XposedBridge.hookMethod(method, new C6665(this, 0));
            }
        }
        Class clsFindClassIfExists2 = XposedHelpers.findClassIfExists(AbstractC9234.m14531(2196), classLoader);
        if (clsFindClassIfExists2 == null) {
            return;
        }
        Method[] declaredMethods2 = clsFindClassIfExists2.getDeclaredMethods();
        AbstractC9234.m14531(1555);
        declaredMethods2.getClass();
        int length2 = declaredMethods2.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                break;
            }
            Method method3 = declaredMethods2[i2];
            if (Modifier.isPublic(method3.getModifiers()) && AbstractC5227.m9466(method3.getReturnType(), Void.TYPE) && method3.getParameterTypes().length == 3 && AbstractC5227.m9466(method3.getParameterTypes()[0], Integer.TYPE) && AbstractC5227.m9466(method3.getParameterTypes()[2], List.class)) {
                method2 = method3;
                break;
            }
            i2++;
        }
        if (method2 != null) {
            XposedBridge.hookMethod(method2, new C6665(this, 1));
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(2192);
    }
}
