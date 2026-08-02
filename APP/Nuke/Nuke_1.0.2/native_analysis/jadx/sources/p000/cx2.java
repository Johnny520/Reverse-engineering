package p000;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cx2 {

    /* JADX INFO: renamed from: a */
    public final Method f1771a;

    /* JADX INFO: renamed from: b */
    public final boolean f1772b;

    public cx2(Method method, boolean z) {
        this.f1771a = method;
        this.f1772b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx2)) {
            return false;
        }
        cx2 cx2Var = (cx2) obj;
        return this.f1771a.equals(cx2Var.f1771a) && this.f1772b == cx2Var.f1772b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1772b) + (this.f1771a.hashCode() * 31);
    }

    public final String toString() {
        return "QuoteMethod(method=" + this.f1771a + ", appendNullArgument=" + this.f1772b + ")";
    }
}
