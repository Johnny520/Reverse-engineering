package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class c91 {

    /* JADX INFO: renamed from: a */
    public final C0388kd f762a;

    /* JADX INFO: renamed from: b */
    public final boolean f763b;

    /* JADX INFO: renamed from: c */
    public final Map f764c;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:o30:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED] (LINE:1)) != (0 int)) ? (null o30) : (r3v0 o30))
  (wrap:kd:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED] (LINE:7)) != (0 int)) ? (null kd) : (r4v0 kd))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (32 int) A[WRAPPED] (LINE:12)) == (0 int)) ? true : false)
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0012: ARITH (r6v0 int) & (64 int) A[WRAPPED] (LINE:19)) != (0 int)) ? (wrap:java.util.Map:SGET  A[WRAPPED] (LINE:23) is.d is) : (r5v0 java.util.LinkedHashMap))
 A[MD:(o30, kd, boolean, java.util.Map):void (m)] (LINE:25) call: c91.<init>(o30, kd, boolean, java.util.Map):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ c91(o30 o30Var, C0388kd c0388kd, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : o30Var, (i & 4) != 0 ? null : c0388kd, (i & 32) == 0, (i & 64) != 0 ? C0330is.f2614d : linkedHashMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c91)) {
            return false;
        }
        c91 c91Var = (c91) obj;
        return p30.m3002l(null, null) && p30.m3002l(this.f762a, c91Var.f762a) && this.f763b == c91Var.f763b && p30.m3002l(this.f764c, c91Var.f764c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = 0 * 961;
        C0388kd c0388kd = this.f762a;
        return this.f764c.hashCode() + AbstractC0748t1.m4145c((i + (c0388kd != null ? c0388kd.hashCode() : 0)) * 29791, 31, this.f763b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TransitionData(fade=" + ((Object) null) + ", slide=null, changeSize=" + this.f762a + ", scale=null, veil=null, hold=" + this.f763b + ", effectsMap=" + this.f764c + ')';
    }

    public c91(o30 o30Var, C0388kd c0388kd, boolean z, Map map) {
        this.f762a = c0388kd;
        this.f763b = z;
        this.f764c = map;
    }
}
