package p274s8;

import gg.AbstractC1416l;
import java.lang.reflect.Method;
import p115hh.C1730o;

/* JADX INFO: renamed from: s8.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3941a {

    /* JADX INFO: renamed from: a */
    public final Method f12921a;

    /* JADX INFO: renamed from: b */
    public final C1730o f12922b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3941a(Method method, C1730o c1730o) {
        method.getClass();
        this.f12921a = method;
        this.f12922b = c1730o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3941a)) {
            return false;
        }
        C3941a c3941a = (C3941a) obj;
        return AbstractC1416l.m3825a(this.f12921a, c3941a.f12921a) && AbstractC1416l.m3825a(this.f12922b, c3941a.f12922b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f12921a.hashCode() * 31;
        C1730o c1730o = this.f12922b;
        return iHashCode + (c1730o == null ? 0 : c1730o.f5750j.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "RevokeEntry(method=" + this.f12921a + ", data=" + this.f12922b + ")";
    }
}
