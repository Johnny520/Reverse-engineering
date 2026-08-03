package p360y4;

import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: renamed from: y4.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5993a {

    /* JADX INFO: renamed from: a */
    public final String f24343a;

    /* JADX INFO: renamed from: b */
    public final Class[] f24344b;

    /* JADX INFO: renamed from: c */
    public final Class f24345c;

    /* JADX INFO: renamed from: d */
    public final Method f24346d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5993a(Method method) {
        this.f24346d = method;
        this.f24343a = method.getName();
        this.f24344b = method.getParameterTypes();
        this.f24345c = method.getReturnType();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C5993a) {
            C5993a c5993a = (C5993a) obj;
            if (this.f24343a.equals(c5993a.f24343a) && this.f24345c.equals(c5993a.f24345c) && Arrays.equals(this.f24344b, c5993a.f24344b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f24343a.hashCode() + 544;
        int iHashCode2 = this.f24345c.hashCode() + (iHashCode * 31) + iHashCode;
        return (iHashCode2 * 31) + Arrays.hashCode(this.f24344b) + iHashCode2;
    }
}
