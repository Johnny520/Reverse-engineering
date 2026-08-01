package top.suzhelan.qstory.hook.item;

import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.util.AttributeSet;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.description.method.MethodDescription;
import org.json.JSONObject;
import p042.AbstractC7140;
import p049.AbstractC7166;
import p303.AbstractC9234;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子世楪哲苏兰;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6721 extends AbstractC7140 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final ConcurrentHashMap f16413 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static String m11847() {
        Object next;
        try {
            int iMyPid = Process.myPid();
            Class clsM12425 = AbstractC7166.m12425(AbstractC9234.m14531(1836));
            Object objM11848 = m11848();
            if (objM11848 != null) {
                Object objInvoke = clsM12425.getMethod(AbstractC9234.m14531(1837), null).invoke(objM11848, null);
                List list = objInvoke instanceof List ? (List) objInvoke : null;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        Field declaredField = next != null ? next.getClass().getDeclaredField(AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜呜呜喵")) : null;
                        if (declaredField != null) {
                            declaredField.setAccessible(true);
                        }
                        Object obj = declaredField != null ? declaredField.get(next) : null;
                        Integer num = obj instanceof Integer ? (Integer) obj : null;
                        if (num != null && num.intValue() == iMyPid) {
                            break;
                        }
                    }
                    if (next != null) {
                        Field declaredField2 = next.getClass().getDeclaredField(AbstractC9234.m14531(1840));
                        declaredField2.setAccessible(true);
                        Object obj2 = declaredField2.get(next);
                        if (obj2 instanceof String) {
                            return (String) obj2;
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static Object m11848() {
        try {
            Class clsM12425 = AbstractC7166.m12425(AbstractC9234.m14531(1841));
            Field declaredField = clsM12425.getDeclaredField(AbstractC9234.m14531(1842));
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            String str = obj instanceof String ? (String) obj : null;
            Context contextM11849 = m11849();
            if (contextM11849 != null) {
                return clsM12425.getMethod(AbstractC9234.m14531(1843), String.class).invoke(contextM11849, str);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static Context m11849() {
        try {
            Object objInvoke = Class.forName(AbstractC9234.m14531(1844)).getDeclaredMethod(AbstractC9234.m14531(1845), null).invoke(null, null);
            Thread thread = objInvoke instanceof Thread ? (Thread) objInvoke : null;
            if (thread != null) {
                Field declaredField = thread.getClass().getDeclaredField(AbstractC9234.m14531(1846));
                declaredField.setAccessible(true);
                Object obj = declaredField.get(thread);
                Method declaredMethod = obj != null ? obj.getClass().getDeclaredMethod(AbstractC9234.m14531(897), null) : null;
                if (declaredMethod != null) {
                    declaredMethod.setAccessible(true);
                }
                Object objInvoke2 = declaredMethod != null ? declaredMethod.invoke(obj, null) : null;
                if (objInvoke2 instanceof Context) {
                    return (Context) objInvoke2;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final String m11850(C6721 c6721, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(AbstractC9234.m14532("喵喵喵喵喵呜喵喵~喵喵喵呜呜喵呜喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵呜喵~喵喵喵喵喵呜呜喵"), "");
            String strOptString2 = jSONObject.optString(AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵呜喵喵~喵喵喵喵喵喵喵喵"), "");
            String strM14531 = AbstractC9234.m14531(1838);
            jSONObject.put(AbstractC9234.m14532("喵喵喵喵喵呜喵喵~喵喵喵呜呜喵呜喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵呜喵~喵喵喵喵喵呜呜喵"), strOptString + strM14531);
            jSONObject.put(AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵呜喵喵~喵喵喵喵喵喵喵喵"), strOptString2 + AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜喵喵呜喵喵呜~呜呜喵喵喵喵呜呜~呜喵喵喵呜呜呜呜~呜呜喵喵呜呜呜呜~呜呜呜呜呜喵呜呜"));
            String string = jSONObject.toString();
            string.getClass();
            return string;
        } catch (Exception unused) {
            return str;
        }
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        Method method;
        AbstractC9234.m14531(1257);
        classLoader.getClass();
        Method method2 = null;
        try {
            Method[] declaredMethods = AbstractC7166.m12425(AbstractC9234.m14531(1831)).getDeclaredMethods();
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
                if (Modifier.isPublic(method.getModifiers()) && AbstractC5227.m9466(method.getName(), AbstractC9234.m14531(93)) && method.getParameterTypes().length == 1 && AbstractC5227.m9466(method.getParameterTypes()[0], Bundle.class)) {
                    break;
                } else {
                    i++;
                }
            }
            if (method != null) {
                XposedBridge.hookMethod(method, new C6722(this, 2));
            }
            XposedBridge.hookMethod(AbstractC7166.m12425(AbstractC9234.m14531(1832)).getDeclaredConstructor(Context.class, AttributeSet.class), new C6722(this, 3));
        } catch (Exception unused) {
        }
        try {
            Method[] declaredMethods2 = AbstractC7166.m12425(AbstractC9234.m14531(1833)).getDeclaredMethods();
            AbstractC9234.m14531(1555);
            declaredMethods2.getClass();
            int length2 = declaredMethods2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    break;
                }
                Method method3 = declaredMethods2[i2];
                if (Modifier.isPublic(method3.getModifiers()) && AbstractC5227.m9466(method3.getReturnType(), Void.TYPE) && method3.getParameterTypes().length == 1 && method3.getParameterTypes()[0].getName().equals(AbstractC9234.m14531(315))) {
                    method2 = method3;
                    break;
                }
                i2++;
            }
            if (method2 != null) {
                XposedBridge.hookMethod(method2, new C6722(this, 1));
            }
        } catch (Exception unused2) {
        }
        try {
            XposedHelpers.findAndHookMethod(AbstractC7166.m12425(AbstractC9234.m14531(1834)), AbstractC9234.m14531(1835), new Object[]{String.class, byte[].class, new C6722(this, 0)});
        } catch (Exception unused3) {
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(1830);
    }
}
