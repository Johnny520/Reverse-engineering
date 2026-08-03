package p099h;

import gg.AbstractC1416l;
import java.util.LinkedHashMap;
import java.util.Map;
import p068eh.AbstractC0921a;
import tf.C4174u;

/* JADX INFO: renamed from: h.h1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1463h1 {

    /* JADX INFO: renamed from: a */
    public final C1487t0 f4864a;

    /* JADX INFO: renamed from: b */
    public final C1457f1 f4865b;

    /* JADX INFO: renamed from: c */
    public final boolean f4866c;

    /* JADX INFO: renamed from: d */
    public final Map f4867d;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002e: CONSTRUCTOR 
  (wrap:h.t0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r15v0 int) & (1 int) A[WRAPPED] (LINE:1)) != (0 int)) ? (null h.t0) : (r10v0 h.t0))
  (wrap:h.f1:?: TERNARY null = ((wrap:int:0x0008: ARITH (r15v0 int) & (2 int) A[WRAPPED] (LINE:9)) != (0 int)) ? (null h.f1) : (r11v0 h.f1))
  (wrap:h.a0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r15v0 int) & (4 int) A[WRAPPED] (LINE:16)) != (0 int)) ? (null h.a0) : (r12v0 h.a0))
  (wrap:h.a0:?: TERNARY null = ((wrap:int:0x0016: ARITH (r15v0 int) & (8 int) A[WRAPPED] (LINE:23)) != (0 int)) ? (null h.a0) : (r13v0 h.a0))
  (wrap:boolean:0x0022: TERNARY null = ((wrap:int:0x001d: ARITH (r15v0 int) & (32 int) A[WRAPPED] (LINE:30)) == (0 int)) ? true : false)
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0026: ARITH (r15v0 int) & (64 int) A[WRAPPED] (LINE:39)) != (0 int)) ? (wrap:java.util.Map:SGET  A[WRAPPED] (LINE:43) tf.u.g tf.u) : (r14v0 java.util.LinkedHashMap))
 A[MD:(h.t0, h.f1, h.a0, h.a0, boolean, java.util.Map):void (m)] (LINE:47) call: h.h1.<init>(h.t0, h.f1, h.a0, h.a0, boolean, java.util.Map):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1463h1(C1487t0 c1487t0, C1457f1 c1457f1, AbstractC1441a0 abstractC1441a0, AbstractC1441a0 abstractC1441a02, LinkedHashMap linkedHashMap, int i9) {
        this((i9 & 1) != 0 ? null : c1487t0, (i9 & 2) != 0 ? null : c1457f1, (i9 & 4) != 0 ? null : abstractC1441a0, (i9 & 8) != 0 ? null : abstractC1441a02, (i9 & 32) == 0, (i9 & 64) != 0 ? C4174u.f13711g : linkedHashMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1463h1)) {
            return false;
        }
        C1463h1 c1463h1 = (C1463h1) obj;
        return AbstractC1416l.m3825a(this.f4864a, c1463h1.f4864a) && AbstractC1416l.m3825a(this.f4865b, c1463h1.f4865b) && AbstractC1416l.m3825a(null, null) && AbstractC1416l.m3825a(null, null) && this.f4866c == c1463h1.f4866c && AbstractC1416l.m3825a(this.f4867d, c1463h1.f4867d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        C1487t0 c1487t0 = this.f4864a;
        int iHashCode = (c1487t0 == null ? 0 : c1487t0.hashCode()) * 31;
        C1457f1 c1457f1 = this.f4865b;
        return this.f4867d.hashCode() + AbstractC0921a.m2245h((((((iHashCode + (c1457f1 == null ? 0 : c1457f1.hashCode())) * 31) + 0) * 31) + 0) * 961, 31, this.f4866c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TransitionData(fade=" + this.f4864a + ", slide=" + this.f4865b + ", changeSize=" + ((Object) null) + ", scale=" + ((Object) null) + ", veil=null, hold=" + this.f4866c + ", effectsMap=" + this.f4867d + ')';
    }

    public C1463h1(C1487t0 c1487t0, C1457f1 c1457f1, AbstractC1441a0 abstractC1441a0, AbstractC1441a0 abstractC1441a02, boolean z9, Map map) {
        this.f4864a = c1487t0;
        this.f4865b = c1457f1;
        this.f4866c = z9;
        this.f4867d = map;
    }
}
