package p000;

import android.view.View;
import com.p001mr.elaris.xposedcompat.XposedHelpers;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: v6 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0499v6 {

    /* JADX INFO: renamed from: a */
    public static final String[] f956a = {"com.tencent.mobileqq.aio.msglist.holder.component.avatar.b"};

    /* JADX INFO: renamed from: b */
    public static final Map f957b = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: c */
    public static volatile boolean f958c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Method m1108a(ClassLoader classLoader, Class cls) {
        Method method;
        if (cls == null) {
            return null;
        }
        Method method2 = null;
        for (int i = 0; i < 1; i++) {
            Class<?> clsFindClassIfExists = XposedHelpers.findClassIfExists(f956a[i], classLoader);
            if (clsFindClassIfExists == null || !View.OnLongClickListener.class.isAssignableFrom(clsFindClassIfExists)) {
                method = null;
                break;
            }
            int i2 = 0;
            for (Field field : clsFindClassIfExists.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers()) && cls.isAssignableFrom(field.getType())) {
                    i2++;
                }
            }
            if (i2 == 1) {
                method = null;
                for (Method method3 : clsFindClassIfExists.getDeclaredMethods()) {
                    Class<?>[] parameterTypes = method3.getParameterTypes();
                    if ("onLongClick".equals(method3.getName()) && !Modifier.isStatic(method3.getModifiers()) && method3.getReturnType() == Boolean.TYPE && parameterTypes.length == 1 && parameterTypes[0] == View.class) {
                        if (method != null) {
                            method = null;
                            break;
                        }
                        method = method3;
                    }
                }
            }
            if (method != null) {
                if (method2 != null && !method2.equals(method)) {
                    return null;
                }
                method2 = method;
            }
        }
        return method2;
    }
}
