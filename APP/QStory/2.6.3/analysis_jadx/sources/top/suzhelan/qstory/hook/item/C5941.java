package top.suzhelan.qstory.hook.item;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5144;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p036.AbstractC6358;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.api.C5812;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏兰世楪哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5941 extends AbstractC6311 {
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Method m11322(Class cls) {
        ArrayList arrayList = new ArrayList();
        Method[] declaredMethods = cls.getDeclaredMethods();
        AbstractC8405.m13972(1555);
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            if (Modifier.isPublic(method.getModifiers())) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                AbstractC8405.m13972(1772);
                parameterTypes.getClass();
                if (parameterTypes.length == 0 && AbstractC4395.m8907(method.getReturnType(), Boolean.TYPE)) {
                    arrayList.add(method);
                }
            }
        }
        if (arrayList.size() > 1) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                String name = ((Method) obj).getName();
                AbstractC8405.m13972(1820);
                name.getClass();
                String lowerCase = name.toLowerCase(Locale.ROOT);
                AbstractC8405.m13972(1322);
                lowerCase.getClass();
                if (AbstractC5144.m10176(lowerCase, AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜呜喵呜~喵喵喵呜呜呜呜呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜喵"), false) || AbstractC5144.m10176(lowerCase, AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵喵"), false) || AbstractC5144.m10176(lowerCase, AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵喵喵呜呜喵"), false)) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                return (Method) AbstractC4344.m8820(arrayList2);
            }
        }
        return (Method) AbstractC4344.m8815(arrayList);
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        classLoader.getClass();
        try {
            if (AbstractC6358.f17508 < 4852) {
                return;
            }
            Class<?> clsLoadClass = classLoader.loadClass(AbstractC8405.m13972(2058));
            clsLoadClass.getClass();
            Method methodM11322 = m11322(clsLoadClass);
            if (methodM11322 != null) {
                XposedBridge.hookMethod(methodM11322, new C5812(this, 9));
            }
        } catch (Exception unused) {
        }
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(2057);
    }
}
