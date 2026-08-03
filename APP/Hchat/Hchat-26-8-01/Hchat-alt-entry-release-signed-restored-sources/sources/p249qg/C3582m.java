package p249qg;

import gg.AbstractC1416l;
import p085fg.InterfaceC1236q;

/* JADX INFO: renamed from: qg.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3582m {

    /* JADX INFO: renamed from: a */
    public final Object f11592a;

    /* JADX INFO: renamed from: b */
    public final C3558e f11593b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1236q f11594c;

    /* JADX INFO: renamed from: d */
    public final Object f11595d;

    /* JADX INFO: renamed from: e */
    public final Throwable f11596e;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (r9v0 java.lang.Object)
  (wrap:qg.e:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED] (LINE:1)) != (0 int)) ? (null qg.e) : (r10v0 qg.e))
  (wrap:fg.q:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED] (LINE:9)) != (0 int)) ? (null fg.q) : (r11v0 fg.q))
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (null java.lang.Object))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (16 int) A[WRAPPED] (LINE:16)) != (0 int)) ? (null java.lang.Throwable) : (r12v0 java.lang.Throwable))
 A[MD:(java.lang.Object, qg.e, fg.q, java.lang.Object, java.lang.Throwable):void (m)] (LINE:26) call: qg.m.<init>(java.lang.Object, qg.e, fg.q, java.lang.Object, java.lang.Throwable):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3582m(Object obj, C3558e c3558e, InterfaceC1236q interfaceC1236q, Throwable th2, int i9) {
        this(obj, (i9 & 2) != 0 ? null : c3558e, (i9 & 4) != 0 ? null : interfaceC1236q, (Object) null, (i9 & 16) != 0 ? null : th2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C3582m m7539a(C3582m c3582m, C3558e c3558e, Throwable th2, int i9) {
        Object obj = c3582m.f11592a;
        if ((i9 & 2) != 0) {
            c3558e = c3582m.f11593b;
        }
        C3558e c3558e2 = c3558e;
        InterfaceC1236q interfaceC1236q = c3582m.f11594c;
        Object obj2 = c3582m.f11595d;
        if ((i9 & 16) != 0) {
            th2 = c3582m.f11596e;
        }
        return new C3582m(obj, c3558e2, interfaceC1236q, obj2, th2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3582m)) {
            return false;
        }
        C3582m c3582m = (C3582m) obj;
        return AbstractC1416l.m3825a(this.f11592a, c3582m.f11592a) && AbstractC1416l.m3825a(this.f11593b, c3582m.f11593b) && AbstractC1416l.m3825a(this.f11594c, c3582m.f11594c) && AbstractC1416l.m3825a(this.f11595d, c3582m.f11595d) && AbstractC1416l.m3825a(this.f11596e, c3582m.f11596e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f11592a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C3558e c3558e = this.f11593b;
        int iHashCode2 = (iHashCode + (c3558e == null ? 0 : c3558e.hashCode())) * 31;
        InterfaceC1236q interfaceC1236q = this.f11594c;
        int iHashCode3 = (iHashCode2 + (interfaceC1236q == null ? 0 : interfaceC1236q.hashCode())) * 31;
        Object obj2 = this.f11595d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f11596e;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CompletedContinuation(result=" + this.f11592a + ", cancelHandler=" + this.f11593b + ", onCancellation=" + this.f11594c + ", idempotentResume=" + this.f11595d + ", cancelCause=" + this.f11596e + ')';
    }

    public C3582m(Object obj, C3558e c3558e, InterfaceC1236q interfaceC1236q, Object obj2, Throwable th2) {
        this.f11592a = obj;
        this.f11593b = c3558e;
        this.f11594c = interfaceC1236q;
        this.f11595d = obj2;
        this.f11596e = th2;
    }
}
