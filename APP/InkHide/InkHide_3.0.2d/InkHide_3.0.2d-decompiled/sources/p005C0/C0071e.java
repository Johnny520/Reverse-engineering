package p005C0;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: C0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0071e {

    /* JADX INFO: renamed from: a */
    public static final C0071e f323a = new C0071e();

    /* JADX INFO: renamed from: b */
    public static final CopyOnWriteArrayList f324b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    public static volatile boolean f325c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m153a(Method method) {
        if (Modifier.isStatic(method.getModifiers()) && Map.class.isAssignableFrom(method.getReturnType()) && method.getParameterTypes().length == 3) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
            for (Class<?> cls : parameterTypes) {
                if (AbstractC0223g.m414a(cls, String.class)) {
                }
            }
            return true;
        }
        return false;
    }
}
