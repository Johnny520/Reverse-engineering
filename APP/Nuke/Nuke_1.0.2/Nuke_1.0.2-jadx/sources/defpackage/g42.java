package defpackage;

import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g42 {
    public final String a;
    public final Class[] b;
    public final Class c;
    public final Method d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g42(Method method) {
        this.d = method;
        this.a = method.getName();
        this.b = method.getParameterTypes();
        this.c = method.getReturnType();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof g42) {
            g42 g42Var = (g42) obj;
            if (this.a.equals(g42Var.a) && this.c.equals(g42Var.c) && Arrays.equals(this.b, g42Var.b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() + 544;
        int iHashCode2 = this.c.hashCode() + (iHashCode * 31) + iHashCode;
        return (iHashCode2 * 31) + Arrays.hashCode(this.b) + iHashCode2;
    }
}
