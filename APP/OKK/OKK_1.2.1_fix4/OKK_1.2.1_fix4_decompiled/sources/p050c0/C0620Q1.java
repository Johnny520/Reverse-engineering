package p050c0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import de.robv.android.xposed.AbstractC0762d;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p001A0.AbstractC0040p;
import p007D0.C0140f;
import p009E0.AbstractC0182m;
import p009E0.C0191v;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.Q1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0620Q1 {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f1911a = new AtomicReference(null);

    /* JADX INFO: renamed from: b */
    public static final AtomicReference f1912b = new AtomicReference(0);

    /* JADX INFO: renamed from: a */
    public static Method m1516a(ClassLoader classLoader) {
        Object objM116u;
        Method method;
        int iIdentityHashCode = System.identityHashCode(classLoader);
        AtomicReference atomicReference = f1912b;
        Integer num = (Integer) atomicReference.get();
        AtomicReference atomicReference2 = f1911a;
        if (num == null || num.intValue() != iIdentityHashCode) {
            atomicReference2.set(null);
            atomicReference.set(Integer.valueOf(iIdentityHashCode));
        }
        Method method2 = (Method) atomicReference2.get();
        if (method2 != null) {
            return method2;
        }
        Iterator it = AbstractC0182m.m556h0("v05.l", "u05.l", "w05.l", "t05.l", "x05.l", "y05.l", "z05.l", "v15.l", "v04.l", "v06.l").iterator();
        while (it.hasNext()) {
            try {
                Method[] declaredMethods = Class.forName((String) it.next(), false, classLoader).getDeclaredMethods();
                AbstractC0307g.m702d(declaredMethods, "getDeclaredMethods(...)");
                int length = declaredMethods.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        method = null;
                        break;
                    }
                    Method method3 = declaredMethods[i2];
                    if (method3.getParameterTypes().length >= 4 && Context.class.isAssignableFrom(method3.getParameterTypes()[0]) && AbstractC0307g.m699a(method3.getParameterTypes()[1], String.class) && AbstractC0307g.m699a(method3.getParameterTypes()[2], String.class)) {
                        method = method3;
                        break;
                    }
                    i2++;
                }
                if (method != null) {
                    method.setAccessible(true);
                    objM116u = method;
                } else {
                    objM116u = null;
                }
            } catch (Throwable th) {
                objM116u = AbstractC0040p.m116u(th);
            }
            boolean z2 = objM116u instanceof C0140f;
            Object obj = objM116u;
            if (z2) {
                obj = null;
            }
            Method method4 = (Method) obj;
            if (method4 != null) {
                atomicReference2.set(method4);
                try {
                    AbstractC0762d.m1954d("[OKK-WxLaunch] " + ("plugin hub " + method4.getDeclaringClass().getName() + "." + method4.getName()));
                } catch (Throwable th2) {
                    AbstractC0040p.m116u(th2);
                }
                return method4;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1517b(Activity activity, String str, Map map) {
        Object objM116u;
        Object objM116u2;
        AbstractC0307g.m703e(activity, "activity");
        AbstractC0307g.m703e(map, "extras");
        ClassLoader classLoader = activity.getClassLoader();
        AbstractC0307g.m702d(classLoader, "getClassLoader(...)");
        try {
            objM116u = Class.forName(str, false, classLoader);
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            objM116u = null;
        }
        if (((Class) objM116u) == null) {
            return false;
        }
        try {
            Intent intent = new Intent();
            intent.setClassName(activity, str);
            m1519d(intent, map);
            activity.startActivity(intent);
            objM116u2 = Boolean.TRUE;
        } catch (Throwable th2) {
            objM116u2 = AbstractC0040p.m116u(th2);
        }
        Object obj = Boolean.FALSE;
        if (objM116u2 instanceof C0140f) {
            objM116u2 = obj;
        }
        return ((Boolean) objM116u2).booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1518c(Activity activity, String str, String str2) {
        Object objM116u;
        boolean z2;
        C0191v c0191v = C0191v.f402a;
        AbstractC0307g.m703e(activity, "activity");
        Intent intent = new Intent();
        m1519d(intent, c0191v);
        try {
            ClassLoader classLoader = activity.getClassLoader();
            AbstractC0307g.m702d(classLoader, "getClassLoader(...)");
            Method methodM1516a = m1516a(classLoader);
            if (methodM1516a == null) {
                z2 = false;
            } else {
                int length = methodM1516a.getParameterTypes().length;
                Object[] objArr = new Object[length];
                objArr[0] = activity;
                objArr[1] = str;
                objArr[2] = str2;
                objArr[3] = intent;
                methodM1516a.invoke(null, Arrays.copyOf(objArr, length));
                z2 = true;
            }
            objM116u = Boolean.valueOf(z2);
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        Object obj = Boolean.FALSE;
        if (objM116u instanceof C0140f) {
            objM116u = obj;
        }
        if (((Boolean) objM116u).booleanValue()) {
            return true;
        }
        if (AbstractC0433r.m1033H0(str2, ".", false)) {
            str2 = AbstractC0324d.m723f("com.tencent.mm.plugin.", str, str2);
        }
        return m1517b(activity, AbstractC0433r.m1031F0(str2, "..", ".", false), c0191v);
    }

    /* JADX INFO: renamed from: d */
    public static void m1519d(Intent intent, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                if (value instanceof String) {
                    intent.putExtra(str, (String) value);
                } else if (value instanceof Boolean) {
                    intent.putExtra(str, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    intent.putExtra(str, ((Number) value).intValue());
                } else if (value instanceof Long) {
                    intent.putExtra(str, ((Number) value).longValue());
                } else {
                    intent.putExtra(str, value.toString());
                }
            }
        }
    }
}
