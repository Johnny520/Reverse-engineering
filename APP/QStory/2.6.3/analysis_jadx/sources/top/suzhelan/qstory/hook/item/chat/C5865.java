package top.suzhelan.qstory.hook.item.chat;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC4347;
import kotlin.jvm.internal.AbstractC4388;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5139;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p026.InterfaceC6312;
import p287.AbstractC8405;
import p389.AbstractC9090;
import p389.C9092;
import top.suzhelan.qstory.hook.item.C5915;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪苏世兰哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5865 extends AbstractC6311 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        final Class clsM14669 = AbstractC9090.m14669(AbstractC8405.m13972(2143));
        if (clsM14669 == null) {
            return;
        }
        try {
            Method[] declaredMethods = clsM14669.getDeclaredMethods();
            AbstractC8405.m13972(1555);
            declaredMethods.getClass();
            ArrayList arrayList = new ArrayList();
            for (Method method : declaredMethods) {
                String name = method.getName();
                AbstractC8405.m13972(1820);
                name.getClass();
                if (AbstractC5139.m10139(name, AbstractC8405.m13973("喵喵喵呜喵呜喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), false)) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC8405.m13972(1772);
                    parameterTypes.getClass();
                    if (parameterTypes.length == 0 && AbstractC4395.m8907(method.getReturnType(), String.class)) {
                        arrayList.add(method);
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                XposedBridge.hookMethod((Method) it.next(), new C5915(24));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Class clsM146692 = AbstractC9090.m14669(AbstractC8405.m13972(2144));
            if (clsM146692 != null) {
                Method[] declaredMethods2 = clsM146692.getDeclaredMethods();
                AbstractC8405.m13972(1555);
                declaredMethods2.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (Method method2 : declaredMethods2) {
                    Class<?>[] parameterTypes2 = method2.getParameterTypes();
                    AbstractC8405.m13972(1772);
                    parameterTypes2.getClass();
                    if (AbstractC4347.m8837(clsM14669, parameterTypes2)) {
                        arrayList2.add(method2);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    XposedBridge.hookMethod((Method) it2.next(), new C5866(clsM14669, 0));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            Class clsM146693 = AbstractC9090.m14669(AbstractC8405.m13972(873));
            final Class clsM146694 = AbstractC9090.m14669(AbstractC8405.m13972(2144));
            if (clsM146693 == null || clsM146694 == null) {
                return;
            }
            C9092 c9092M14672 = C9092.m14672(clsM146693);
            c9092M14672.f25481 = AbstractC8405.m13972(2145);
            c9092M14672.f25483 = List.class;
            Member memberM14605 = c9092M14672.m14605();
            AbstractC8405.m13972(1549);
            memberM14605.getClass();
            m11830((Method) memberM14605, new InterfaceC6312() { // from class: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪世兰哲苏
                @Override // p026.InterfaceC6312
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
                    Field field;
                    Class cls = clsM14669;
                    Object result = methodHookParam.getResult();
                    List list = AbstractC4388.m8893(result) ? (List) result : null;
                    if (list == null) {
                        return;
                    }
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        if (next != null && next.getClass().equals(clsM146694)) {
                            try {
                                Field[] declaredFields = next.getClass().getDeclaredFields();
                                AbstractC8405.m13972(1985);
                                declaredFields.getClass();
                                int length = declaredFields.length;
                                int i = 0;
                                while (true) {
                                    if (i >= length) {
                                        field = null;
                                        break;
                                    }
                                    field = declaredFields[i];
                                    if (AbstractC4395.m8907(field.getType(), cls)) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                                if (field != null) {
                                    field.setAccessible(true);
                                    if (field.get(next) != null) {
                                        it3.remove();
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            });
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }
}
