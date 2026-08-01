package p000;

import android.view.View;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: cb */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0044cb {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f103a = false;

    /* JADX INFO: renamed from: b */
    public static volatile boolean f104b = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m114a(ClassLoader classLoader, String str) {
        try {
            Class clsM1091j = AbstractC0497v4.m1091j(classLoader, str);
            if (clsM1091j == null) {
                return 0;
            }
            int i = 0;
            for (Method method : clsM1091j.getDeclaredMethods()) {
                if (!Modifier.isAbstract(method.getModifiers()) && method.getReturnType() == Void.TYPE) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if ("setDrawable".equals(method.getName())) {
                        XposedBridge.hookMethod(method, new C0551ya(80));
                        i++;
                    } else if (parameterTypes.length == 5 && View.class.isAssignableFrom(parameterTypes[0])) {
                        Class<?> cls = parameterTypes[1];
                        Class<?> cls2 = Integer.TYPE;
                        if (cls == cls2 && parameterTypes[2] == Long.TYPE && parameterTypes[3] == String.class && parameterTypes[4] == cls2) {
                            XposedBridge.hookMethod(method, new C0551ya(80));
                            i++;
                        }
                    }
                }
            }
            if (i > 0) {
                AbstractC0497v4.m1076C("hooked pendant drawable noop: " + str + " count=" + i);
            }
            return i;
        } catch (Throwable th) {
            AbstractC0497v4.m1076C("hookPendantInfoDrawable failed " + str + ": " + th);
            return 0;
        }
    }
}
