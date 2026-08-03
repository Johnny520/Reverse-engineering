package p230p8;

import gg.AbstractC1416l;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: p8.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3369u {

    /* JADX INFO: renamed from: a */
    public final Method f10872a;

    /* JADX INFO: renamed from: b */
    public final Method f10873b;

    /* JADX INFO: renamed from: c */
    public final Method f10874c;

    /* JADX INFO: renamed from: d */
    public final Method f10875d;

    /* JADX INFO: renamed from: e */
    public final Method f10876e;

    /* JADX INFO: renamed from: f */
    public final Method f10877f;

    /* JADX INFO: renamed from: g */
    public final Method f10878g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3369u(Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7) {
        this.f10872a = method;
        this.f10873b = method2;
        this.f10874c = method3;
        this.f10875d = method4;
        this.f10876e = method5;
        this.f10877f = method6;
        this.f10878g = method7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3369u)) {
            return false;
        }
        C3369u c3369u = (C3369u) obj;
        return AbstractC1416l.m3825a(this.f10872a, c3369u.f10872a) && AbstractC1416l.m3825a(this.f10873b, c3369u.f10873b) && AbstractC1416l.m3825a(this.f10874c, c3369u.f10874c) && AbstractC1416l.m3825a(this.f10875d, c3369u.f10875d) && AbstractC1416l.m3825a(this.f10876e, c3369u.f10876e) && AbstractC1416l.m3825a(this.f10877f, c3369u.f10877f) && AbstractC1416l.m3825a(this.f10878g, c3369u.f10878g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Method method = this.f10872a;
        int iHashCode = (method == null ? 0 : method.hashCode()) * 31;
        Method method2 = this.f10873b;
        int iHashCode2 = (iHashCode + (method2 == null ? 0 : method2.hashCode())) * 31;
        Method method3 = this.f10874c;
        int iHashCode3 = (iHashCode2 + (method3 == null ? 0 : method3.hashCode())) * 31;
        Method method4 = this.f10875d;
        int iHashCode4 = (iHashCode3 + (method4 == null ? 0 : method4.hashCode())) * 31;
        Method method5 = this.f10876e;
        int iHashCode5 = (iHashCode4 + (method5 == null ? 0 : method5.hashCode())) * 31;
        Method method6 = this.f10877f;
        int iHashCode6 = (iHashCode5 + (method6 == null ? 0 : method6.hashCode())) * 31;
        Method method7 = this.f10878g;
        return iHashCode6 + (method7 != null ? method7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SnsForwardNativeMediaMethods(imageManager=" + this.f10872a + ", imageDownload=" + this.f10873b + ", videoService=" + this.f10874c + ", videoDownload=" + this.f10875d + ", videoFullPath=" + this.f10876e + ", videoFinishedPath=" + this.f10877f + ", videoThumbPath=" + this.f10878g + ")";
    }
}
