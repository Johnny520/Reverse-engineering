package p036c9;

import gg.AbstractC1416l;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: c9.w1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0498w1 {

    /* JADX INFO: renamed from: a */
    public final Method f1522a;

    /* JADX INFO: renamed from: b */
    public final Method f1523b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0498w1(Method method, Method method2) {
        method2.getClass();
        this.f1522a = method;
        this.f1523b = method2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0498w1)) {
            return false;
        }
        C0498w1 c0498w1 = (C0498w1) obj;
        return this.f1522a.equals(c0498w1.f1522a) && AbstractC1416l.m3825a(this.f1523b, c0498w1.f1523b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1523b.hashCode() + (this.f1522a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "NativeGroupMenuMethods(create=" + this.f1522a + ", click=" + this.f1523b + ")";
    }
}
