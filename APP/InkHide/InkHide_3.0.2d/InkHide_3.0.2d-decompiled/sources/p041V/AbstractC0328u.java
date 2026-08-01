package p041V;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: V.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0328u {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0328u f731a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC0328u c0327t;
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    c0327t = new C0324q(declaredField.get(null), cls.getMethod("allocateInstance", Class.class));
                } catch (Exception unused) {
                    c0327t = new C0327t();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod.setAccessible(true);
                c0327t = new C0326s(declaredMethod);
            }
        } catch (Exception unused3) {
            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod2.setAccessible(true);
            int iIntValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
            Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
            declaredMethod3.setAccessible(true);
            c0327t = new C0325r(iIntValue, declaredMethod3);
        }
        f731a = c0327t;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo560a(Class cls);
}
