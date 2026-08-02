package p000;

import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ru0 {

    /* JADX INFO: renamed from: a */
    public final Method f9757a;

    /* JADX INFO: renamed from: b */
    public final Object[] f9758b;

    public ru0(Method method, Object[] objArr) {
        this.f9757a = method;
        this.f9758b = objArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru0)) {
            return false;
        }
        ru0 ru0Var = (ru0) obj;
        return this.f9757a.equals(ru0Var.f9757a) && this.f9758b.equals(ru0Var.f9758b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9758b) + (this.f9757a.hashCode() * 31);
    }

    public final String toString() {
        return "ResolvedMethod(method=" + this.f9757a + ", arguments=" + Arrays.toString(this.f9758b) + ")";
    }
}
