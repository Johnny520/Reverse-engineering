package p380z8;

import gg.AbstractC1416l;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: z8.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6130f {

    /* JADX INFO: renamed from: a */
    public final Method f24702a;

    /* JADX INFO: renamed from: b */
    public final Method f24703b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6130f(Method method, Method method2) {
        method.getClass();
        method2.getClass();
        this.f24702a = method;
        this.f24703b = method2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6130f)) {
            return false;
        }
        C6130f c6130f = (C6130f) obj;
        return AbstractC1416l.m3825a(this.f24702a, c6130f.f24702a) && AbstractC1416l.m3825a(this.f24703b, c6130f.f24703b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f24703b.hashCode() + (this.f24702a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CoreStartAccess(start=" + this.f24702a + ", acknowledge=" + this.f24703b + ")";
    }
}
