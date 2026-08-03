package p347xa;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.ContextMenu;
import android.view.View;
import android.widget.AdapterView;
import ch.C0570e;
import gg.AbstractC1416l;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import ng.AbstractC3015m;
import ng.C3010h;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p036c9.C0472o1;
import p062e8.C0828b;
import p085fg.InterfaceC1235p;
import p086fh.C1253k;
import p099h.Hchat.utils.KavaReflector;
import p258r8.C3742g;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: xa.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5740a {

    /* JADX INFO: renamed from: a */
    public static final C5740a f23386a = new C5740a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m10436a(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return m10437b(method) && AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && parameterTypes.length == 3 && ContextMenu.class.isAssignableFrom(parameterTypes[0]) && View.class.isAssignableFrom(parameterTypes[1]) && parameterTypes[2].getName().equals("android.view.ContextMenu$ContextMenuInfo");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m10437b(Method method) {
        return (Modifier.isStatic(method.getModifiers()) || Modifier.isAbstract(method.getModifiers()) || method.getDeclaringClass().isInterface()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m10438c(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return m10437b(method) && AbstractC1416l.m3825a(method.getReturnType(), Boolean.TYPE) && parameterTypes.length == 4 && AdapterView.class.isAssignableFrom(parameterTypes[0]) && View.class.isAssignableFrom(parameterTypes[1]) && AbstractC1416l.m3825a(parameterTypes[2], Integer.TYPE) && AbstractC1416l.m3825a(parameterTypes[3], Long.TYPE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Method m10439d(C3742g c3742g, InterfaceC1235p interfaceC1235p) {
        Object c3959f;
        Object next;
        Method methodFindDeclaredMethod;
        c3742g.getClass();
        Context context = c3742g.f12143a;
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_conversation_menu_method_cache");
        ClassLoader classLoader = c3742g.f12145c;
        String strM2091g = C0828b.m2091g(context, classLoader);
        Method methodM2087c = C0828b.m2087c(sharedPreferencesM8640c, strM2091g, classLoader, "context_menu_create_v2");
        if (methodM2087c != null) {
            if (!m10436a(methodM2087c)) {
                methodM2087c = null;
            }
            if (methodM2087c != null) {
                return methodM2087c;
            }
        }
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            c1253k.m3369l0(1, "com.tencent.mm.ui.conversation.");
            C1253k.m3366q0(c1253k, "boolean");
            c1253k.m3372o0("android.widget.AdapterView", "android.view.View", "int", "long");
            c1253k.m3374r0("headercount:%d, postion:%d");
            c0570e.f1764h = c1253k;
            C3010h c3010h = new C3010h(AbstractC3015m.m6414X(AbstractC4166m.m8415m1(dexKitBridge.findMethod(c0570e)), new C0472o1(this, c3742g, 4)));
            while (true) {
                if (!c3010h.hasNext()) {
                    next = null;
                    break;
                }
                next = c3010h.next();
                if (m10438c((Method) next)) {
                    break;
                }
            }
            Method method = (Method) next;
            if (method == null || (methodFindDeclaredMethod = KavaReflector.findDeclaredMethod(method.getDeclaringClass(), "onCreateContextMenu", ContextMenu.class, View.class, ContextMenu.ContextMenuInfo.class)) == null) {
                c3959f = null;
            } else {
                boolean zM10436a = m10436a(methodFindDeclaredMethod);
                c3959f = methodFindDeclaredMethod;
                if (!zM10436a) {
                }
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            interfaceC1235p.invoke("定位会话长按菜单创建方法失败", thM8182b);
        }
        Method method2 = (Method) (c3959f instanceof C3959f ? null : c3959f);
        if (method2 != null) {
            C0828b.m2092h(sharedPreferencesM8640c, strM2091g, "context_menu_create_v2", method2);
        } else {
            try {
                SharedPreferences.Editor editorEdit = sharedPreferencesM8640c.edit();
                if (!AbstractC1416l.m3825a(sharedPreferencesM8640c.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strM2091g)) {
                    editorEdit.clear().putString("cache.key", strM2091g);
                }
                editorEdit.remove("context_menu_create_v2").apply();
            } catch (Throwable unused) {
            }
        }
        return method2;
    }
}
