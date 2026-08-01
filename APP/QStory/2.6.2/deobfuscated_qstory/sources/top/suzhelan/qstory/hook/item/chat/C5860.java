package top.suzhelan.qstory.hook.item.chat;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC4346;
import kotlin.jvm.internal.AbstractC4387;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5138;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p026.InterfaceC6294;
import p392.AbstractC9121;
import p392.C9125;
import top.suzhelan.qstory.hook.item.C5909;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪苏世兰哲;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5860 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        "classLoader";
        classLoader.getClass();
        final Class clsM14657 = AbstractC9121.m14657("com.tencent.qqnt.kernel.nativeinterface.LinkInfo");
        if (clsM14657 == null) {
            return;
        }
        try {
            Method[] declaredMethods = clsM14657.getDeclaredMethods();
            "getDeclaredMethods(...)";
            declaredMethods.getClass();
            ArrayList arrayList = new ArrayList();
            for (Method method : declaredMethods) {
                String name = method.getName();
                "getName(...)";
                name.getClass();
                if (AbstractC5138.m10125(name, "get", false)) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    "getParameterTypes(...)";
                    parameterTypes.getClass();
                    if (parameterTypes.length == 0 && AbstractC4394.m8917(method.getReturnType(), String.class)) {
                        arrayList.add(method);
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                XposedBridge.hookMethod((Method) it.next(), new C5909(24));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Class clsM146572 = AbstractC9121.m14657("com.tencent.qqnt.kernel.nativeinterface.TextElement");
            if (clsM146572 != null) {
                Method[] declaredMethods2 = clsM146572.getDeclaredMethods();
                "getDeclaredMethods(...)";
                declaredMethods2.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (Method method2 : declaredMethods2) {
                    Class<?>[] parameterTypes2 = method2.getParameterTypes();
                    "getParameterTypes(...)";
                    parameterTypes2.getClass();
                    if (AbstractC4346.m8843(clsM14657, parameterTypes2)) {
                        arrayList2.add(method2);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    XposedBridge.hookMethod((Method) it2.next(), new C5861(clsM14657, 0));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            Class clsM146573 = AbstractC9121.m14657("com.tencent.qqnt.kernel.nativeinterface.MsgRecord");
            final Class clsM146574 = AbstractC9121.m14657("com.tencent.qqnt.kernel.nativeinterface.TextElement");
            if (clsM146573 == null || clsM146574 == null) {
                return;
            }
            C9125 c9125M14680 = C9125.m14680(clsM146573);
            c9125M14680.f25504 = "getElements";
            c9125M14680.f25506 = List.class;
            Member memberM14686 = c9125M14680.m14686();
            "first(...)";
            memberM14686.getClass();
            m11802((Method) memberM14686, new InterfaceC6294() { // from class: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪世兰哲苏
                @Override // p026.InterfaceC6294
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
                    Field field;
                    Class cls = clsM14657;
                    Object result = methodHookParam.getResult();
                    List list = AbstractC4387.m8903(result) ? (List) result : null;
                    if (list == null) {
                        return;
                    }
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        if (next != null && next.getClass().equals(clsM146574)) {
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
                                    if (AbstractC4394.m8917(field.getType(), cls)) {
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
