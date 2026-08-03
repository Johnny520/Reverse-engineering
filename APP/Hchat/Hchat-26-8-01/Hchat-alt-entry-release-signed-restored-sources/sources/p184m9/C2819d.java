package p184m9;

import gg.AbstractC1416l;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: renamed from: m9.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2819d {

    /* JADX INFO: renamed from: a */
    public final Method f9096a;

    /* JADX INFO: renamed from: b */
    public final Object f9097b;

    /* JADX INFO: renamed from: c */
    public final Object[] f9098c;

    /* JADX INFO: renamed from: d */
    public final EnumC2818c f9099d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2819d(Method method, Object obj, Object[] objArr, EnumC2818c enumC2818c) {
        method.getClass();
        this.f9096a = method;
        this.f9097b = obj;
        this.f9098c = objArr;
        this.f9099d = enumC2818c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2819d)) {
            return false;
        }
        C2819d c2819d = (C2819d) obj;
        return AbstractC1416l.m3825a(this.f9096a, c2819d.f9096a) && AbstractC1416l.m3825a(this.f9097b, c2819d.f9097b) && this.f9098c.equals(c2819d.f9098c) && this.f9099d == c2819d.f9099d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f9096a.hashCode() * 31;
        Object obj = this.f9097b;
        return this.f9099d.hashCode() + ((Arrays.hashCode(this.f9098c) + ((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PendingSend(method=" + this.f9096a + ", receiver=" + this.f9097b + ", args=" + Arrays.toString(this.f9098c) + ", gameType=" + this.f9099d + ")";
    }
}
