package p107h9;

import android.content.Context;
import de.robv.android.xposed.XC_MethodHook;
import gg.AbstractC1416l;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import p036c9.C0425c2;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p099h.Hchat.utils.KavaReflector;
import p258r8.C3744i;
import p276sf.C3959f;
import p276sf.C3960g;

/* JADX INFO: renamed from: h9.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1629d {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap.KeySetView f5334a = ConcurrentHashMap.newKeySet();

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap.KeySetView f5335b = ConcurrentHashMap.newKeySet();

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap.KeySetView f5336c = ConcurrentHashMap.newKeySet();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m4152a(Context context, Object obj, InterfaceC1235p interfaceC1235p) throws Throwable {
        if (obj == null) {
            return;
        }
        Class<?> cls = obj.getClass();
        Method methodFindMethodRecursive = KavaReflector.findMethodRecursive(cls, "getLatitude", new Class[0]);
        Method methodFindMethodRecursive2 = KavaReflector.findMethodRecursive(cls, "getLongitude", new Class[0]);
        if (!m4155d(methodFindMethodRecursive) || !m4155d(methodFindMethodRecursive2)) {
            if (f5336c.add(cls)) {
                interfaceC1235p.invoke("TencentLocation 经纬度 getter 不匹配: ".concat(cls.getName()), null);
            }
        } else {
            methodFindMethodRecursive.getClass();
            m4153b(context, methodFindMethodRecursive, new C1628c(context, 0));
            methodFindMethodRecursive2.getClass();
            m4153b(context, methodFindMethodRecursive2, new C1628c(context, 1));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m4153b(Context context, Method method, InterfaceC1220a interfaceC1220a) throws Throwable {
        XC_MethodHook.Unhook c3959f;
        ConcurrentHashMap.KeySetView keySetView = f5335b;
        if (keySetView.add(method)) {
            try {
                c3959f = C3744i.f12154b.m7763b(method, new C0425c2(context, 2, interfaceC1220a));
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b == null) {
                return;
            }
            keySetView.remove(method);
            throw thM8182b;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m4154c(Context context, ArrayList arrayList, InterfaceC1235p interfaceC1235p) {
        ConcurrentHashMap.KeySetView keySetView;
        XC_MethodHook.Unhook c3959f;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            keySetView = f5334a;
            if (!zHasNext) {
                break;
            }
            Method method = (Method) it.next();
            if (keySetView.add(method)) {
                try {
                    c3959f = C3744i.f12154b.m7763b(method, new C0425c2(context, interfaceC1235p));
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    keySetView.remove(method);
                    interfaceC1235p.invoke("虚拟定位回调 Hook 安装失败: " + method.toGenericString(), thM8182b);
                }
            }
        }
        keySetView.getClass();
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (!keySetView.contains((Method) it2.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m4155d(Method method) {
        if (method == null || Modifier.isAbstract(method.getModifiers()) || Modifier.isStatic(method.getModifiers())) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        if (parameterTypes.length == 0) {
            return AbstractC1416l.m3825a(method.getReturnType(), Double.TYPE) || AbstractC1416l.m3825a(method.getReturnType(), Double.class);
        }
        return false;
    }
}
