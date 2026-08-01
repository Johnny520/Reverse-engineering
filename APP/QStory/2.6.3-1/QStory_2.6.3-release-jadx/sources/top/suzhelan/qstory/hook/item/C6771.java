package top.suzhelan.qstory.hook.item;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5976;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p052.AbstractC7187;
import p303.AbstractC9234;
import top.suzhelan.qstory.hook.api.C6642;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏兰世楪哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6771 extends AbstractC7140 {
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Method m11881(Class cls) {
        ArrayList arrayList = new ArrayList();
        Method[] declaredMethods = cls.getDeclaredMethods();
        AbstractC9234.m14531(1555);
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            if (Modifier.isPublic(method.getModifiers())) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                AbstractC9234.m14531(1772);
                parameterTypes.getClass();
                if (parameterTypes.length == 0 && AbstractC5227.m9466(method.getReturnType(), Boolean.TYPE)) {
                    arrayList.add(method);
                }
            }
        }
        if (arrayList.size() > 1) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                String name = ((Method) obj).getName();
                AbstractC9234.m14531(1820);
                name.getClass();
                String lowerCase = name.toLowerCase(Locale.ROOT);
                AbstractC9234.m14531(1322);
                lowerCase.getClass();
                if (AbstractC5976.m10735(lowerCase, AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜呜喵呜~喵喵喵呜呜呜呜呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜喵"), false) || AbstractC5976.m10735(lowerCase, AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵喵"), false) || AbstractC5976.m10735(lowerCase, AbstractC9234.m14532("喵喵喵呜呜喵呜喵~喵喵喵喵喵呜呜喵"), false)) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                return (Method) AbstractC5176.m9379(arrayList2);
            }
        }
        return (Method) AbstractC5176.m9374(arrayList);
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        AbstractC9234.m14532("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        classLoader.getClass();
        try {
            if (AbstractC7187.f17853 < 4852) {
                return;
            }
            Class<?> clsLoadClass = classLoader.loadClass(AbstractC9234.m14531(2058));
            clsLoadClass.getClass();
            Method methodM11881 = m11881(clsLoadClass);
            if (methodM11881 != null) {
                XposedBridge.hookMethod(methodM11881, new C6642(this, 9));
            }
        } catch (Exception unused) {
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(2057);
    }
}
