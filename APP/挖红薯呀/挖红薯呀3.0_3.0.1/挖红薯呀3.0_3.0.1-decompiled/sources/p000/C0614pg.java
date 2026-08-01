package p000;

/* JADX INFO: renamed from: pg */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0614pg {

    /* JADX INFO: renamed from: a */
    public final Object f4846a;

    /* JADX INFO: renamed from: b */
    public final C0684rc f4847b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0941xw f4848c;

    /* JADX INFO: renamed from: d */
    public final Object f4849d;

    /* JADX INFO: renamed from: e */
    public final Throwable f4850e;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (r3v0 java.lang.Object)
  (wrap:rc:?: TERNARY null = ((wrap:int:0x0000: ARITH (r7v0 int) & (2 int) A[WRAPPED] (LINE:1)) != (0 int)) ? (null rc) : (r4v0 rc))
  (wrap:xw:?: TERNARY null = ((wrap:int:0x0006: ARITH (r7v0 int) & (4 int) A[WRAPPED] (LINE:7)) != (0 int)) ? (null xw) : (r5v0 xw))
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (null java.lang.Object))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x000b: ARITH (r7v0 int) & (16 int) A[WRAPPED] (LINE:12)) != (0 int)) ? (null java.lang.Throwable) : (r6v0 java.lang.Throwable))
 A[MD:(java.lang.Object, rc, xw, java.lang.Object, java.lang.Throwable):void (m)] (LINE:20) call: pg.<init>(java.lang.Object, rc, xw, java.lang.Object, java.lang.Throwable):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0614pg(Object obj, C0684rc c0684rc, InterfaceC0941xw interfaceC0941xw, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : c0684rc, (i & 4) != 0 ? null : interfaceC0941xw, (Object) null, (i & 16) != 0 ? null : th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C0614pg m3067a(C0614pg c0614pg, C0684rc c0684rc, Throwable th, int i) {
        Object obj = c0614pg.f4846a;
        if ((i & 2) != 0) {
            c0684rc = c0614pg.f4847b;
        }
        C0684rc c0684rc2 = c0684rc;
        InterfaceC0941xw interfaceC0941xw = c0614pg.f4848c;
        Object obj2 = c0614pg.f4849d;
        if ((i & 16) != 0) {
            th = c0614pg.f4850e;
        }
        return new C0614pg(obj, c0684rc2, interfaceC0941xw, obj2, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0614pg)) {
            return false;
        }
        C0614pg c0614pg = (C0614pg) obj;
        return p30.m3002l(this.f4846a, c0614pg.f4846a) && p30.m3002l(this.f4847b, c0614pg.f4847b) && p30.m3002l(this.f4848c, c0614pg.f4848c) && p30.m3002l(this.f4849d, c0614pg.f4849d) && p30.m3002l(this.f4850e, c0614pg.f4850e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f4846a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C0684rc c0684rc = this.f4847b;
        int iHashCode2 = (iHashCode + (c0684rc == null ? 0 : c0684rc.hashCode())) * 31;
        InterfaceC0941xw interfaceC0941xw = this.f4848c;
        int iHashCode3 = (iHashCode2 + (interfaceC0941xw == null ? 0 : interfaceC0941xw.hashCode())) * 31;
        Object obj2 = this.f4849d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f4850e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CompletedContinuation(result=" + this.f4846a + ", cancelHandler=" + this.f4847b + ", onCancellation=" + this.f4848c + ", idempotentResume=" + this.f4849d + ", cancelCause=" + this.f4850e + ')';
    }

    public C0614pg(Object obj, C0684rc c0684rc, InterfaceC0941xw interfaceC0941xw, Object obj2, Throwable th) {
        this.f4846a = obj;
        this.f4847b = c0684rc;
        this.f4848c = interfaceC0941xw;
        this.f4849d = obj2;
        this.f4850e = th;
    }
}
