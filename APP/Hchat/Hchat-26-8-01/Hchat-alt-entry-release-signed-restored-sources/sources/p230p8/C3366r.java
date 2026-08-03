package p230p8;

import gg.AbstractC1416l;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: p8.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3366r {

    /* JADX INFO: renamed from: a */
    public final Method f10861a;

    /* JADX INFO: renamed from: b */
    public final Method f10862b;

    /* JADX INFO: renamed from: c */
    public final Method f10863c;

    /* JADX INFO: renamed from: d */
    public final Method f10864d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3366r(Method method, Method method2, Method method3, Method method4) {
        this.f10861a = method;
        this.f10862b = method2;
        this.f10863c = method3;
        this.f10864d = method4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3366r)) {
            return false;
        }
        C3366r c3366r = (C3366r) obj;
        return AbstractC1416l.m3825a(this.f10861a, c3366r.f10861a) && AbstractC1416l.m3825a(this.f10862b, c3366r.f10862b) && AbstractC1416l.m3825a(this.f10863c, c3366r.f10863c) && AbstractC1416l.m3825a(this.f10864d, c3366r.f10864d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Method method = this.f10861a;
        int iHashCode = (method == null ? 0 : method.hashCode()) * 31;
        Method method2 = this.f10862b;
        int iHashCode2 = (iHashCode + (method2 == null ? 0 : method2.hashCode())) * 31;
        Method method3 = this.f10863c;
        int iHashCode3 = (iHashCode2 + (method3 == null ? 0 : method3.hashCode())) * 31;
        Method method4 = this.f10864d;
        return iHashCode3 + (method4 != null ? method4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SnsForwardLocalMediaMethods(snsRoot=" + this.f10861a + ", mediaDirectory=" + this.f10862b + ", bigImageName=" + this.f10863c + ", videoPath=" + this.f10864d + ")";
    }
}
