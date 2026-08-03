package p037cb;

import gg.AbstractC1416l;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: cb.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0542c {

    /* JADX INFO: renamed from: a */
    public final Method f1710a;

    /* JADX INFO: renamed from: b */
    public final Constructor f1711b;

    /* JADX INFO: renamed from: c */
    public final Method f1712c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0542c(Method method, Constructor constructor, Method method2) {
        constructor.getClass();
        this.f1710a = method;
        this.f1711b = constructor;
        this.f1712c = method2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0542c)) {
            return false;
        }
        C0542c c0542c = (C0542c) obj;
        return this.f1710a.equals(c0542c.f1710a) && AbstractC1416l.m3825a(this.f1711b, c0542c.f1711b) && AbstractC1416l.m3825a(this.f1712c, c0542c.f1712c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f1711b.hashCode() + (this.f1710a.hashCode() * 31)) * 31;
        Method method = this.f1712c;
        return iHashCode + (method == null ? 0 : method.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AvatarMembers(legacyLoad=" + this.f1710a + ", workerConstructor=" + this.f1711b + ", workerModify=" + this.f1712c + ")";
    }
}
