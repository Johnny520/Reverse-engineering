package p000;

/* JADX INFO: renamed from: mv */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0475mv {

    /* JADX INFO: renamed from: a */
    public final Object f6887a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0321ip f6888b;

    /* JADX INFO: renamed from: c */
    public final nn0 f6889c;

    /* JADX INFO: renamed from: d */
    public final Object f6890d;

    /* JADX INFO: renamed from: e */
    public final Throwable f6891e;

    public /* synthetic */ C0475mv(Object obj, InterfaceC0321ip interfaceC0321ip, nn0 nn0Var, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : interfaceC0321ip, (i & 4) != 0 ? null : nn0Var, (Object) null, (i & 16) != 0 ? null : th);
    }

    /* JADX INFO: renamed from: a */
    public static C0475mv m3210a(C0475mv c0475mv, InterfaceC0321ip interfaceC0321ip, Throwable th, int i) {
        Object obj = c0475mv.f6887a;
        if ((i & 2) != 0) {
            interfaceC0321ip = c0475mv.f6888b;
        }
        InterfaceC0321ip interfaceC0321ip2 = interfaceC0321ip;
        nn0 nn0Var = c0475mv.f6889c;
        Object obj2 = c0475mv.f6890d;
        if ((i & 16) != 0) {
            th = c0475mv.f6891e;
        }
        return new C0475mv(obj, interfaceC0321ip2, nn0Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0475mv)) {
            return false;
        }
        C0475mv c0475mv = (C0475mv) obj;
        return t11.m5086l(this.f6887a, c0475mv.f6887a) && t11.m5086l(this.f6888b, c0475mv.f6888b) && t11.m5086l(this.f6889c, c0475mv.f6889c) && t11.m5086l(this.f6890d, c0475mv.f6890d) && t11.m5086l(this.f6891e, c0475mv.f6891e);
    }

    public final int hashCode() {
        Object obj = this.f6887a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC0321ip interfaceC0321ip = this.f6888b;
        int iHashCode2 = (iHashCode + (interfaceC0321ip == null ? 0 : interfaceC0321ip.hashCode())) * 31;
        nn0 nn0Var = this.f6889c;
        int iHashCode3 = (iHashCode2 + (nn0Var == null ? 0 : nn0Var.hashCode())) * 31;
        Object obj2 = this.f6890d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f6891e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f6887a + ", cancelHandler=" + this.f6888b + ", onCancellation=" + this.f6889c + ", idempotentResume=" + this.f6890d + ", cancelCause=" + this.f6891e + ')';
    }

    public C0475mv(Object obj, InterfaceC0321ip interfaceC0321ip, nn0 nn0Var, Object obj2, Throwable th) {
        this.f6887a = obj;
        this.f6888b = interfaceC0321ip;
        this.f6889c = nn0Var;
        this.f6890d = obj2;
        this.f6891e = th;
    }
}
