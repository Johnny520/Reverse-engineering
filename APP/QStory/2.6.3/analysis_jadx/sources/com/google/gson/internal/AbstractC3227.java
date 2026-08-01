package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.bytebuddy.implementation.auxiliary.TypeProxy;

/* JADX INFO: renamed from: com.google.gson.internal.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3227 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final AbstractC3227 f10886;

    static {
        AbstractC3227 c3228;
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    c3228 = new C3234(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    c3228 = new C3228();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod(TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, Class.class, Class.class);
                declaredMethod.setAccessible(true);
                c3228 = new C3232(declaredMethod);
            }
        } catch (Exception unused3) {
            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod2.setAccessible(true);
            int iIntValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
            Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod(TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, Class.class, Integer.TYPE);
            declaredMethod3.setAccessible(true);
            c3228 = new C3231(declaredMethod3, iIntValue);
        }
        f10886 = c3228;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public abstract Object mo7324(Class cls);
}
