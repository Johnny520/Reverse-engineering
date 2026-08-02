package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ig1 {
    public static volatile boolean a = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.reflect.Member */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean a(Member member) {
        Object x92Var;
        boolean zBooleanValue;
        AccessibleObject accessibleObject = member instanceof AccessibleObject ? (AccessibleObject) member : null;
        if (accessibleObject == null) {
            return false;
        }
        if (a) {
            try {
                x92Var = Boolean.valueOf(accessibleObject.trySetAccessible());
            } catch (Throwable th) {
                x92Var = new x92(th);
            }
            if (y92.a(x92Var) != null) {
                a = false;
                x92Var = Boolean.valueOf(b(accessibleObject));
            }
            zBooleanValue = ((Boolean) x92Var).booleanValue();
        } else {
            zBooleanValue = b(accessibleObject);
        }
        return zBooleanValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean b(AccessibleObject accessibleObject) {
        Object x92Var;
        try {
            if (!accessibleObject.isAccessible()) {
                accessibleObject.setAccessible(true);
            }
            x92Var = Boolean.TRUE;
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        Object obj = Boolean.FALSE;
        if (x92Var instanceof x92) {
            x92Var = obj;
        }
        return ((Boolean) x92Var).booleanValue();
    }
}
