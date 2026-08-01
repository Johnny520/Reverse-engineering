package top.suzhelan.qstory.hook.item;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p034.AbstractC6347;
import p036.AbstractC6358;
import p287.AbstractC8405;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子世苏楪哲兰;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5899 extends AbstractC6311 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        classLoader.getClass();
        try {
            if (AbstractC6358.f17508 < 5282) {
                return;
            }
            m11293(classLoader);
            m11292(classLoader);
        } catch (Exception unused) {
        }
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(1860);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m11292(ClassLoader classLoader) {
        Iterator it = AbstractC6347.m11931(AbstractC8405.m13972(1863), AbstractC8405.m13972(1864)).iterator();
        while (it.hasNext()) {
            try {
                Class<?> clsLoadClass = classLoader.loadClass((String) it.next());
                Class<?> clsLoadClass2 = classLoader.loadClass(AbstractC8405.m13972(1785));
                Method[] declaredMethods = clsLoadClass.getDeclaredMethods();
                AbstractC8405.m13972(1555);
                declaredMethods.getClass();
                for (Method method : declaredMethods) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    parameterTypes.getClass();
                    if (parameterTypes.length != 0 && AbstractC4395.m8907(parameterTypes[0], clsLoadClass2)) {
                        XposedBridge.hookMethod(method, new C5888(this, 1));
                        return;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m11293(ClassLoader classLoader) {
        Iterator it = AbstractC6347.m11931(AbstractC8405.m13972(1784), AbstractC8405.m13972(1861), AbstractC8405.m13972(1862)).iterator();
        while (it.hasNext()) {
            try {
                Class<?> clsLoadClass = classLoader.loadClass((String) it.next());
                Class<?> clsLoadClass2 = classLoader.loadClass(AbstractC8405.m13972(1785));
                Method[] declaredMethods = clsLoadClass.getDeclaredMethods();
                AbstractC8405.m13972(1555);
                declaredMethods.getClass();
                for (Method method : declaredMethods) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    parameterTypes.getClass();
                    if (parameterTypes.length != 0 && AbstractC4395.m8907(parameterTypes[0], clsLoadClass2)) {
                        XposedBridge.hookMethod(method, new C5888(this, 0));
                        return;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
