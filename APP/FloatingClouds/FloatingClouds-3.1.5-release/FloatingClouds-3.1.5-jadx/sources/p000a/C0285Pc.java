package p000a;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: a.Pc */
/* JADX INFO: loaded from: classes.dex */
public final class C0285Pc {

    /* JADX INFO: renamed from: a */
    public static final C0285Pc f979a = new C0285Pc();

    /* JADX INFO: renamed from: a */
    public static List m777a(ClassLoader classLoader) {
        Object objM2206a;
        Method declaredMethod;
        C0631i9.m1482e(classLoader, "classLoader");
        Object obj = C0439Y5.f1645a;
        try {
            Class<?> cls = Class.forName("com.tencent.mm.ui.chatting.BaseChattingUIFragment", false, classLoader);
            if (cls == null || (declaredMethod = cls.getDeclaredMethod("onPause", null)) == null) {
                objM2206a = obj;
            } else {
                declaredMethod.setAccessible(true);
                objM2206a = C0889w1.m2124K(declaredMethod);
            }
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        Throwable thM2189a = C0901wd.m2189a(objM2206a);
        if (thM2189a == null) {
            obj = objM2206a;
        } else {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{C0944z.m2231k("ReadReport: fragment locate failed: ", thM2189a.getMessage())}, 1));
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            return m778b(classLoader);
        }
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"ReadReport: located read-report trigger via fragment lifecycle: com.tencent.mm.ui.chatting.BaseChattingUIFragment.onPause"}, 1));
        return list;
    }

    /* JADX INFO: renamed from: b */
    public static List m778b(ClassLoader classLoader) {
        C0439Y5 c0439y5;
        Object objM2206a;
        Method method;
        C0631i9.m1482e(classLoader, "classLoader");
        long jCurrentTimeMillis = System.currentTimeMillis() + 5000;
        while (true) {
            boolean zM2121H = C0889w1.m2121H();
            c0439y5 = C0439Y5.f1645a;
            if (zM2121H || System.currentTimeMillis() >= jCurrentTimeMillis) {
                break;
            }
            try {
                Thread.sleep(50L);
            } catch (InterruptedException unused) {
            }
        }
        if (!C0889w1.m2121H()) {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"ReadReport: DkBridge not ready after 5000ms, storage-locate skipped"}, 1));
            return c0439y5;
        }
        try {
            objM2206a = C0889w1.m2159r("updateUnreadByTalker", null);
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        if (C0901wd.m2189a(objM2206a) != null) {
            objM2206a = c0439y5;
        }
        List<String> list = (List) objM2206a;
        if (list.isEmpty()) {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"ReadReport: no class references updateUnreadByTalker (class-level match missed)"}, 1));
            return c0439y5;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (C0015Ae.m49H(str, "com.tencent.mm.storage", false)) {
                try {
                    Class<?> cls = Class.forName(str, false, classLoader);
                    if (cls != null) {
                        for (C0690lb c0690lb : C0889w1.m2166y(str)) {
                            Method[] declaredMethods = cls.getDeclaredMethods();
                            C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
                            int length = declaredMethods.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    method = null;
                                    break;
                                }
                                method = declaredMethods[i];
                                if (C0631i9.m1478a(method.getName(), c0690lb.m1551b().f2127b) && method.getParameterTypes().length == 1 && C0631i9.m1478a(method.getParameterTypes()[0], String.class) && (C0631i9.m1478a(method.getReturnType(), Boolean.TYPE) || C0631i9.m1478a(method.getReturnType(), Void.TYPE))) {
                                    break;
                                }
                                i++;
                            }
                            if (method != null) {
                                method.setAccessible(true);
                                arrayList.add(method);
                                C0908x1.m2194b(Arrays.copyOf(new Object[]{"ReadReport: located clear-unread trigger " + str + "." + method.getName() + "(String)"}, 1));
                            }
                        }
                    }
                    C0413Wf c0413Wf = C0413Wf.f1577a;
                } catch (Throwable th2) {
                    C0920xd.m2206a(th2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{C0944z.m2223c(list.size(), "ReadReport: no clear-unread trigger found (", " class hits rejected)")}, 1));
        }
        return arrayList;
    }
}
