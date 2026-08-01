package top.suzhelan.qstory.hook.item;

import android.view.View;
import android.widget.ImageView;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5976;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import top.suzhelan.qstory.hook.api.C6642;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世哲楪兰;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6767 extends AbstractC7140 {
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final Object m11878(C6767 c6767, Object obj, Class cls) {
        try {
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            "getDeclaredFields(...)";
            declaredFields.getClass();
            for (Field field : declaredFields) {
                if (cls.isAssignableFrom(field.getType())) {
                    field.setAccessible(true);
                    return field.get(obj);
                }
            }
            for (Class<? super Object> superclass = obj.getClass().getSuperclass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                Field[] declaredFields2 = superclass.getDeclaredFields();
                "getDeclaredFields(...)";
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

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        "loader";
        classLoader.getClass();
        try {
            m11880(classLoader);
            m11879(classLoader);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m11879(ClassLoader classLoader) {
        Object next;
        try {
            Class<?> clsLoadClass = classLoader.loadClass("com.tencent.mobileqq.profilecard.base.component.AbsProfileHeaderComponent");
            Class<?> clsLoadClass2 = classLoader.loadClass("com.tencent.mobileqq.data.Card");
            ArrayList arrayList = new ArrayList();
            Method[] declaredMethods = clsLoadClass.getDeclaredMethods();
            "getDeclaredMethods(...)";
            declaredMethods.getClass();
            for (Method method : declaredMethods) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && AbstractC5227.m9466(parameterTypes[0], clsLoadClass2)) {
                    String name = method.getName();
                    name.getClass();
                    if (AbstractC5976.m10735(name, "handleVoteBtnClickForGuestProfile", false) || AbstractC5976.m10735(name, "handleVote", false) || AbstractC5976.m10735(name, "onVote", false) || AbstractC5976.m10735(name, "Vote", false) || AbstractC5976.m10735(name, "vote", false)) {
                        arrayList.add(method);
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (AbstractC5227.m9466(((Method) next).getName(), "handleVoteBtnClickForGuestProfile")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            Method method2 = (Method) next;
            if (method2 == null) {
                method2 = (Method) AbstractC5176.m9374(arrayList);
            }
            if (method2 != null) {
                XposedBridge.hookMethod(method2, new C6642(this, 6));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m11880(ClassLoader classLoader) {
        Method method;
        try {
            Class<?> clsLoadClass = classLoader.loadClass("com.tencent.mobileqq.activity.VisitorsActivity");
            Class<?> clsLoadClass2 = classLoader.loadClass("com.tencent.mobileqq.data.CardProfile");
            Class<?> clsLoadClass3 = classLoader.loadClass("com.tencent.mobileqq.utils.VoteHelper");
            clsLoadClass3.getClass();
            clsLoadClass2.getClass();
            Method[] declaredMethods = clsLoadClass3.getDeclaredMethods();
            "getDeclaredMethods(...)";
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
                if (parameterTypes.length == 2 && AbstractC5227.m9466(parameterTypes[0], clsLoadClass2) && AbstractC5227.m9466(parameterTypes[1], ImageView.class)) {
                    break;
                } else {
                    i++;
                }
            }
            Method[] declaredMethods2 = clsLoadClass.getDeclaredMethods();
            "getDeclaredMethods(...)";
            declaredMethods2.getClass();
            for (Method method2 : declaredMethods2) {
                if (AbstractC5227.m9466(method2.getName(), "onClick") && method2.getParameterTypes().length == 1) {
                    Class<?> cls = method2.getParameterTypes()[0];
                    if (AbstractC5227.m9466(cls, View.class) || AbstractC5227.m9466(cls.getSuperclass(), View.class)) {
                        XposedBridge.hookMethod(method2, new C6768(this, clsLoadClass2, clsLoadClass3, method));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
