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
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5220;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5971;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p042.InterfaceC7141;
import p405.AbstractC9919;
import p405.C9921;
import top.suzhelan.qstory.hook.item.C6745;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪苏世兰哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6695 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        "classLoader";
        classLoader.getClass();
        final Class clsM15228 = AbstractC9919.m15228("com.tencent.qqnt.kernel.nativeinterface.LinkInfo");
        if (clsM15228 == null) {
            return;
        }
        try {
            Method[] declaredMethods = clsM15228.getDeclaredMethods();
            "getDeclaredMethods(...)";
            declaredMethods.getClass();
            ArrayList arrayList = new ArrayList();
            for (Method method : declaredMethods) {
                String name = method.getName();
                "getName(...)";
                name.getClass();
                if (AbstractC5971.m10698(name, "get", false)) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    "getParameterTypes(...)";
                    parameterTypes.getClass();
                    if (parameterTypes.length == 0 && AbstractC5227.m9466(method.getReturnType(), String.class)) {
                        arrayList.add(method);
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                XposedBridge.hookMethod((Method) it.next(), new C6745(24));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Class clsM152282 = AbstractC9919.m15228("com.tencent.qqnt.kernel.nativeinterface.TextElement");
            if (clsM152282 != null) {
                Method[] declaredMethods2 = clsM152282.getDeclaredMethods();
                "getDeclaredMethods(...)";
                declaredMethods2.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (Method method2 : declaredMethods2) {
                    Class<?>[] parameterTypes2 = method2.getParameterTypes();
                    "getParameterTypes(...)";
                    parameterTypes2.getClass();
                    if (AbstractC5179.m9396(clsM15228, parameterTypes2)) {
                        arrayList2.add(method2);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    XposedBridge.hookMethod((Method) it2.next(), new C6696(clsM15228, 0));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            Class clsM152283 = AbstractC9919.m15228("com.tencent.qqnt.kernel.nativeinterface.MsgRecord");
            final Class clsM152284 = AbstractC9919.m15228("com.tencent.qqnt.kernel.nativeinterface.TextElement");
            if (clsM152283 == null || clsM152284 == null) {
                return;
            }
            C9921 c9921M15231 = C9921.m15231(clsM152283);
            c9921M15231.f25826 = "getElements";
            c9921M15231.f25828 = List.class;
            Member memberM15164 = c9921M15231.m15164();
            "first(...)";
            memberM15164.getClass();
            m12389((Method) memberM15164, new InterfaceC7141() { // from class: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪世兰哲苏
                @Override // p042.InterfaceC7141
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                    Field field;
                    Class cls = clsM15228;
                    Object result = methodHookParam.getResult();
                    List list = AbstractC5220.m9452(result) ? (List) result : null;
                    if (list == null) {
                        return;
                    }
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        if (next != null && next.getClass().equals(clsM152284)) {
                            try {
                                Field[] declaredFields = next.getClass().getDeclaredFields();
                                "getDeclaredFields(...)";
                                declaredFields.getClass();
                                int length = declaredFields.length;
                                int i = 0;
                                while (true) {
                                    if (i >= length) {
                                        field = null;
                                        break;
                                    }
                                    field = declaredFields[i];
                                    if (AbstractC5227.m9466(field.getType(), cls)) {
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
