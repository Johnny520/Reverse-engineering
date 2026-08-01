package p000;

import android.util.SparseArray;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: d7 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0182d7 {

    /* JADX INFO: renamed from: a */
    public static final Set f190a = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: b */
    public static volatile boolean f191b;

    /* JADX INFO: renamed from: c */
    public static volatile long f192c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m338a(Class cls) {
        if (cls == null) {
            return 0;
        }
        try {
            int i = 0;
            for (Method method : cls.getDeclaredMethods()) {
                if (method != null && !Modifier.isAbstract(method.getModifiers()) && method.getParameterTypes().length == 0 && SparseArray.class.isAssignableFrom(method.getReturnType())) {
                    String name = method.getDeclaringClass().getName();
                    if ("com.tencent.mobileqq.aio.msglist.holder.AIOItemComponentProvider$mComponentList$2".equals(name) || "com.tencent.mobileqq.aio.msglist.holder.AIOItemComponentProvider".equals(name)) {
                        String strM1078E = AbstractC0497v4.m1078E(method);
                        Set set = f190a;
                        synchronized (set) {
                            try {
                                if (set.add(strM1078E)) {
                                    try {
                                        method.setAccessible(true);
                                        XposedBridge.hookMethod(method, new C0040c7(84));
                                        i++;
                                        HookEntry.log("official center time component list hooked: " + strM1078E);
                                    } catch (Throwable th) {
                                        AbstractC0000a.m3d(th, new StringBuilder("official center time component list hook failed: "), ": ");
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                }
            }
            return i;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static synchronized void m339b(ClassLoader classLoader) {
        if (classLoader != null) {
            try {
                if (!f191b) {
                    int iM338a = m338a(AbstractC0497v4.m1091j(classLoader, "com.tencent.mobileqq.aio.msglist.holder.AIOItemComponentProvider$mComponentList$2")) + m338a(AbstractC0497v4.m1091j(classLoader, "com.tencent.mobileqq.aio.msglist.holder.AIOItemComponentProvider"));
                    if (iM338a > 0) {
                        f191b = true;
                        HookEntry.log("official center time component hooks installed count=" + iM338a);
                    } else {
                        HookEntry.log("official center time component hook skipped reason=target missing");
                    }
                }
            } finally {
            }
        }
    }
}
