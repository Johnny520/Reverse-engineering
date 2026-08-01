package top.suzhelan.qstory.hook.item;

import android.view.View;
import android.widget.ImageView;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5144;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.api.C5812;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世哲楪兰;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5937 extends AbstractC6311 {
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final Object m11319(C5937 c5937, Object obj, Class cls) {
        try {
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            AbstractC8405.m13972(1985);
            declaredFields.getClass();
            for (Field field : declaredFields) {
                if (cls.isAssignableFrom(field.getType())) {
                    field.setAccessible(true);
                    return field.get(obj);
                }
            }
            for (Class<? super Object> superclass = obj.getClass().getSuperclass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                Field[] declaredFields2 = superclass.getDeclaredFields();
                AbstractC8405.m13972(1985);
                declaredFields2.getClass();
                for (Field field2 : declaredFields2) {
                    if (cls.isAssignableFrom(field2.getType())) {
                        field2.setAccessible(true);
                        return field2.get(obj);
                    }
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        classLoader.getClass();
        try {
            m11321(classLoader);
            m11320(classLoader);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m11320(ClassLoader classLoader) {
        Object next;
        try {
            Class<?> clsLoadClass = classLoader.loadClass(AbstractC8405.m13972(1986));
            Class<?> clsLoadClass2 = classLoader.loadClass(AbstractC8405.m13972(1987));
            ArrayList arrayList = new ArrayList();
            Method[] declaredMethods = clsLoadClass.getDeclaredMethods();
            AbstractC8405.m13972(1555);
            declaredMethods.getClass();
            for (Method method : declaredMethods) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && AbstractC4395.m8907(parameterTypes[0], clsLoadClass2)) {
                    String name = method.getName();
                    name.getClass();
                    if (AbstractC5144.m10176(name, AbstractC8405.m13972(1988), false) || AbstractC5144.m10176(name, AbstractC8405.m13972(1989), false) || AbstractC5144.m10176(name, AbstractC8405.m13973("喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵呜喵呜呜喵喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵喵喵呜~喵喵喵喵呜喵喵呜"), false) || AbstractC5144.m10176(name, AbstractC8405.m13973("喵喵呜喵喵呜喵呜~喵喵喵呜呜喵呜喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜呜喵呜"), false) || AbstractC5144.m10176(name, AbstractC8405.m13973("喵喵喵喵喵呜喵呜~喵喵喵呜呜喵呜喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜呜喵呜"), false)) {
                        arrayList.add(method);
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (AbstractC4395.m8907(((Method) next).getName(), AbstractC8405.m13972(1988))) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            Method method2 = (Method) next;
            if (method2 == null) {
                method2 = (Method) AbstractC4344.m8815(arrayList);
            }
            if (method2 != null) {
                XposedBridge.hookMethod(method2, new C5812(this, 6));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m11321(ClassLoader classLoader) {
        Method method;
        try {
            Class<?> clsLoadClass = classLoader.loadClass(AbstractC8405.m13972(1982));
            Class<?> clsLoadClass2 = classLoader.loadClass(AbstractC8405.m13972(1983));
            Class<?> clsLoadClass3 = classLoader.loadClass(AbstractC8405.m13972(1984));
            clsLoadClass3.getClass();
            clsLoadClass2.getClass();
            Method[] declaredMethods = clsLoadClass3.getDeclaredMethods();
            AbstractC8405.m13972(1555);
            declaredMethods.getClass();
            int length = declaredMethods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i];
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 2 && AbstractC4395.m8907(parameterTypes[0], clsLoadClass2) && AbstractC4395.m8907(parameterTypes[1], ImageView.class)) {
                    break;
                } else {
                    i++;
                }
            }
            Method[] declaredMethods2 = clsLoadClass.getDeclaredMethods();
            AbstractC8405.m13972(1555);
            declaredMethods2.getClass();
            for (Method method2 : declaredMethods2) {
                if (AbstractC4395.m8907(method2.getName(), AbstractC8405.m13973("喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵呜呜呜喵喵呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜呜呜呜~喵喵喵喵呜喵呜喵")) && method2.getParameterTypes().length == 1) {
                    Class<?> cls = method2.getParameterTypes()[0];
                    if (AbstractC4395.m8907(cls, View.class) || AbstractC4395.m8907(cls.getSuperclass(), View.class)) {
                        XposedBridge.hookMethod(method2, new C5938(this, clsLoadClass2, clsLoadClass3, method));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
