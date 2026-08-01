package top.suzhelan.qstory.hook.item;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p049.AbstractC7166;
import p303.AbstractC9234;
import top.suzhelan.qstory.hook.api.C6642;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子世苏楪兰哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6728 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        Method method;
        AbstractC9234.m14532("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        classLoader.getClass();
        try {
            Method[] declaredMethods = AbstractC7166.m12425(AbstractC9234.m14531(1865)).getDeclaredMethods();
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
                int modifiers = method.getModifiers();
                if (Modifier.isPublic(modifiers) && !Modifier.isStatic(modifiers) && AbstractC5227.m9466(method.getReturnType(), Void.TYPE) && method.getParameterTypes().length == 2) {
                    break;
                } else {
                    i++;
                }
            }
            if (method != null) {
                XposedBridge.hookMethod(method, new C6642(this, 4));
            }
        } catch (Exception unused) {
        }
    }
}
