package p000;

import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tu0 {

    /* JADX INFO: renamed from: a */
    public final Method f10964a;

    /* JADX INFO: renamed from: b */
    public final Object[] f10965b;

    /* JADX INFO: renamed from: c */
    public final int f10966c;

    public tu0(Method method, Object[] objArr, int i) {
        this.f10964a = method;
        this.f10965b = objArr;
        this.f10966c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu0)) {
            return false;
        }
        tu0 tu0Var = (tu0) obj;
        return this.f10964a.equals(tu0Var.f10964a) && this.f10965b.equals(tu0Var.f10965b) && this.f10966c == tu0Var.f10966c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10966c) + ((Arrays.hashCode(this.f10965b) + (this.f10964a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ScoredMethod(method=" + this.f10964a + ", arguments=" + Arrays.toString(this.f10965b) + ", score=" + this.f10966c + ")";
    }
}
