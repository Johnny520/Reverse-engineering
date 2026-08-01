package top.suzhelan.qstory.hook.item;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p050.AbstractC7176;
import p052.AbstractC7187;
import p303.AbstractC9234;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子世苏楪哲兰;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6729 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        AbstractC9234.m14532("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        classLoader.getClass();
        try {
            if (AbstractC7187.f17853 < 5282) {
                return;
            }
            m11852(classLoader);
            m11851(classLoader);
        } catch (Exception unused) {
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(1860);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m11851(ClassLoader classLoader) {
        Iterator it = AbstractC7176.m12490(AbstractC9234.m14531(1863), AbstractC9234.m14531(1864)).iterator();
        while (it.hasNext()) {
            try {
                Class<?> clsLoadClass = classLoader.loadClass((String) it.next());
                Class<?> clsLoadClass2 = classLoader.loadClass(AbstractC9234.m14531(1785));
                Method[] declaredMethods = clsLoadClass.getDeclaredMethods();
                AbstractC9234.m14531(1555);
                declaredMethods.getClass();
                for (Method method : declaredMethods) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    parameterTypes.getClass();
                    if (parameterTypes.length != 0 && AbstractC5227.m9466(parameterTypes[0], clsLoadClass2)) {
                        XposedBridge.hookMethod(method, new C6718(this, 1));
                        return;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m11852(ClassLoader classLoader) {
        Iterator it = AbstractC7176.m12490(AbstractC9234.m14531(1784), AbstractC9234.m14531(1861), AbstractC9234.m14531(1862)).iterator();
        while (it.hasNext()) {
            try {
                Class<?> clsLoadClass = classLoader.loadClass((String) it.next());
                Class<?> clsLoadClass2 = classLoader.loadClass(AbstractC9234.m14531(1785));
                Method[] declaredMethods = clsLoadClass.getDeclaredMethods();
                AbstractC9234.m14531(1555);
                declaredMethods.getClass();
                for (Method method : declaredMethods) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    parameterTypes.getClass();
                    if (parameterTypes.length != 0 && AbstractC5227.m9466(parameterTypes[0], clsLoadClass2)) {
                        XposedBridge.hookMethod(method, new C6718(this, 0));
                        return;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
