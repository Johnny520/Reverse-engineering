package p259r9;

import gg.AbstractC1416l;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: r9.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3772v {

    /* JADX INFO: renamed from: a */
    public final Method f12339a;

    /* JADX INFO: renamed from: b */
    public final Field f12340b;

    /* JADX INFO: renamed from: c */
    public final Field f12341c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3772v(Method method, Field field, Field field2) {
        this.f12339a = method;
        this.f12340b = field;
        this.f12341c = field2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3772v)) {
            return false;
        }
        C3772v c3772v = (C3772v) obj;
        return AbstractC1416l.m3825a(this.f12339a, c3772v.f12339a) && AbstractC1416l.m3825a(this.f12340b, c3772v.f12340b) && AbstractC1416l.m3825a(this.f12341c, c3772v.f12341c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Method method = this.f12339a;
        int iHashCode = (method == null ? 0 : method.hashCode()) * 31;
        Field field = this.f12340b;
        int iHashCode2 = (iHashCode + (field == null ? 0 : field.hashCode())) * 31;
        Field field2 = this.f12341c;
        return iHashCode2 + (field2 != null ? field2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MessageAccessor(getter=" + this.f12339a + ", primaryField=" + this.f12340b + ", fallbackField=" + this.f12341c + ")";
    }
}
