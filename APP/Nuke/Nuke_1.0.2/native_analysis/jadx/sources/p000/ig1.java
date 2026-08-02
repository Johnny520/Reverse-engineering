package p000;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ig1 {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f4606a = true;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final boolean m2344a(Member member) {
        Object x92Var;
        boolean zBooleanValue;
        AccessibleObject accessibleObject = member instanceof AccessibleObject ? (AccessibleObject) member : null;
        if (accessibleObject == null) {
            return false;
        }
        if (f4606a) {
            try {
                x92Var = Boolean.valueOf(accessibleObject.trySetAccessible());
            } catch (Throwable th) {
                x92Var = new x92(th);
            }
            if (y92.m6237a(x92Var) != null) {
                f4606a = false;
                x92Var = Boolean.valueOf(m2345b(accessibleObject));
            }
            zBooleanValue = ((Boolean) x92Var).booleanValue();
        } else {
            zBooleanValue = m2345b(accessibleObject);
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m2345b(AccessibleObject accessibleObject) {
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
