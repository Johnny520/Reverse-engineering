package top.suzhelan.qstory.hook.item;

import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.util.AttributeSet;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.description.method.MethodDescription;
import org.json.JSONObject;
import p026.AbstractC6293;
import p032.AbstractC6318;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子世楪哲苏兰;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5886 extends AbstractC6293 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final ConcurrentHashMap f16059 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static String m11227() {
        Object next;
        try {
            int iMyPid = Process.myPid();
            Class clsM11838 = AbstractC6318.m11838("android.app.ActivityManager");
            Object objM11228 = m11228();
            if (objM11228 != null) {
                Object objInvoke = clsM11838.getMethod("getRunningAppProcesses", null).invoke(objM11228, null);
                List list = objInvoke instanceof List ? (List) objInvoke : null;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        Field declaredField = next != null ? next.getClass().getDeclaredField("pid") : null;
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
                        Field declaredField2 = next.getClass().getDeclaredField("processName");
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
    public static Object m11228() {
        try {
            Class clsM11838 = AbstractC6318.m11838("android.content.Context");
            Field declaredField = clsM11838.getDeclaredField("ACTIVITY_SERVICE");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            String str = obj instanceof String ? (String) obj : null;
            Context contextM11229 = m11229();
            if (contextM11229 != null) {
                return clsM11838.getMethod("getSystemService", String.class).invoke(contextM11229, str);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static Context m11229() {
        try {
            Object objInvoke = Class.forName("de.robv.android.xposed.XposedBridge").getDeclaredMethod("currentThread", null).invoke(null, null);
            Thread thread = objInvoke instanceof Thread ? (Thread) objInvoke : null;
            if (thread != null) {
                Field declaredField = thread.getClass().getDeclaredField("mActivityThread");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(thread);
                Method declaredMethod = obj != null ? obj.getClass().getDeclaredMethod("getApplication", null) : null;
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
    public static final String m11230(C5886 c5886, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("wording", "");
            String strOptString2 = jSONObject.optString("title", "");
            String strM6668 = "\u6a21\u5757\u63d0\u9192\u60a8\uff0c\u6b64\u5f39\u7a97\u5728\u91cd\u65b0\u542f\u52a8QQ\u524d\u53ea\u4f1a\u5c55\u793a\u4e00\u6b21\u3002";
            jSONObject.put("wording", strOptString + strM6668);
            jSONObject.put("title", strOptString2 + "\u5f39\u7a97");
            String string = jSONObject.toString();
            string.getClass();
            return string;
        } catch (Exception unused) {
            return str;
        }
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        Method method;
        "classLoader";
        classLoader.getClass();
        Method method2 = null;
        try {
            Method[] declaredMethods = AbstractC6318.m11838("com.tencent.mobileqq.upgrade.ui.dialog.UpgradeActivity").getDeclaredMethods();
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
                if (Modifier.isPublic(method.getModifiers()) && AbstractC4394.m8917(method.getName(), "doOnCreate") && method.getParameterTypes().length == 1 && AbstractC4394.m8917(method.getParameterTypes()[0], Bundle.class)) {
                    break;
                } else {
                    i++;
                }
            }
            if (method != null) {
                XposedBridge.hookMethod(method, new C5887(this, 2));
            }
            XposedBridge.hookMethod(AbstractC6318.m11838("com.tencent.biz.qui.noticebar.view.VQUINoticeBarLayout").getDeclaredConstructor(Context.class, AttributeSet.class), new C5887(this, 3));
        } catch (Exception unused) {
        }
        try {
            Method[] declaredMethods2 = AbstractC6318.m11838("com.tencent.mobileqq.graycheck.business.GrayCheckHandler").getDeclaredMethods();
            "getDeclaredMethods(...)";
            declaredMethods2.getClass();
            int length2 = declaredMethods2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    break;
                }
                Method method3 = declaredMethods2[i2];
                if (Modifier.isPublic(method3.getModifiers()) && AbstractC4394.m8917(method3.getReturnType(), Void.TYPE) && method3.getParameterTypes().length == 1 && method3.getParameterTypes()[0].getName().equals("com.tencent.qphone.base.remote.FromServiceMsg")) {
                    method2 = method3;
                    break;
                }
                i2++;
            }
            if (method2 != null) {
                XposedBridge.hookMethod(method2, new C5887(this, 1));
            }
        } catch (Exception unused2) {
        }
        try {
            XposedHelpers.findAndHookMethod(AbstractC6318.m11838("com.tencent.mobileqq.dt.api.impl.DTAPIImpl"), "onSecDispatchToAppEvent", new Object[]{String.class, byte[].class, new C5887(this, 0)});
        } catch (Exception unused3) {
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u5c4f\u853d\u7248\u672c\u5347\u7ea7\u5f39\u7a97\u3001\u7070\u5ea6\u7248\u672c\u4f53\u9a8c\u5f39\u7a97\u3001\u793e\u4ea4\u5c01\u7981\u63d0\u9192\u5f39\u7a97";
    }
}
