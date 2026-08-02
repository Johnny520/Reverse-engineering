package p000;

import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g42 {

    /* JADX INFO: renamed from: a */
    public final String f3304a;

    /* JADX INFO: renamed from: b */
    public final Class[] f3305b;

    /* JADX INFO: renamed from: c */
    public final Class f3306c;

    /* JADX INFO: renamed from: d */
    public final Method f3307d;

    public g42(Method method) {
        this.f3307d = method;
        this.f3304a = method.getName();
        this.f3305b = method.getParameterTypes();
        this.f3306c = method.getReturnType();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g42) {
            g42 g42Var = (g42) obj;
            if (this.f3304a.equals(g42Var.f3304a) && this.f3306c.equals(g42Var.f3306c) && Arrays.equals(this.f3305b, g42Var.f3305b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f3304a.hashCode() + 544;
        int iHashCode2 = this.f3306c.hashCode() + (iHashCode * 31) + iHashCode;
        return (iHashCode2 * 31) + Arrays.hashCode(this.f3305b) + iHashCode2;
    }
}
