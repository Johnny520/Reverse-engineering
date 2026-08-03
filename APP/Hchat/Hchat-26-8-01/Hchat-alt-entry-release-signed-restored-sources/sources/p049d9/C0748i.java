package p049d9;

import gg.AbstractC1416l;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: d9.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0748i {

    /* JADX INFO: renamed from: a */
    public final Method f2227a;

    /* JADX INFO: renamed from: b */
    public final Constructor f2228b;

    /* JADX INFO: renamed from: c */
    public final Method f2229c;

    /* JADX INFO: renamed from: d */
    public final Method f2230d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0748i(Method method, Constructor constructor, Method method2, Method method3) {
        this.f2227a = method;
        this.f2228b = constructor;
        this.f2229c = method2;
        this.f2230d = method3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0748i)) {
            return false;
        }
        C0748i c0748i = (C0748i) obj;
        return this.f2227a.equals(c0748i.f2227a) && this.f2228b.equals(c0748i.f2228b) && AbstractC1416l.m3825a(this.f2229c, c0748i.f2229c) && this.f2230d.equals(c0748i.f2230d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f2228b.hashCode() + (this.f2227a.hashCode() * 31)) * 31;
        Method method = this.f2229c;
        return this.f2230d.hashCode() + ((iHashCode + (method == null ? 0 : method.hashCode())) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AvatarMembers(legacyLoad=" + this.f2227a + ", workerConstructor=" + this.f2228b + ", workerModify=" + this.f2229c + ", draw=" + this.f2230d + ")";
    }
}
