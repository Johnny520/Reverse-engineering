package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class x81 {

    /* JADX INFO: renamed from: a */
    public final Object f7285a;

    /* JADX INFO: renamed from: b */
    public final Object f7286b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x81(Object obj, Object obj2) {
        this.f7285a = obj;
        this.f7286b = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m5104a(EnumC0485ms enumC0485ms, EnumC0485ms enumC0485ms2) {
        return enumC0485ms.equals(this.f7285a) && enumC0485ms2.equals(this.f7286b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof x81)) {
            return false;
        }
        x81 x81Var = (x81) obj;
        return p30.m3002l(this.f7285a, x81Var.f7285a) && p30.m3002l(this.f7286b, x81Var.f7286b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f7285a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f7286b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
