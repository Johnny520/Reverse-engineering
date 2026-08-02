package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class z33 {
    public final uh0 a;
    public final cd2 b;
    public final boolean c;
    public final Map d;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (wrap:uh0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r7v0 int) & (1 int) A[WRAPPED] (LINE:1)) != (0 int)) ? (null uh0) : (r3v0 uh0))
  (wrap:t11:?: TERNARY null = ((wrap:int:0x0006: ARITH (r7v0 int) & (4 int) A[WRAPPED] (LINE:7)) != (0 int)) ? (null t11) : (r4v0 t11))
  (wrap:cd2:?: TERNARY null = ((wrap:int:0x000b: ARITH (r7v0 int) & (8 int) A[WRAPPED] (LINE:12)) != (0 int)) ? (null cd2) : (r5v0 cd2))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r7v0 int) & (32 int) A[WRAPPED] (LINE:17)) == (0 int)) ? true : false)
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0017: ARITH (r7v0 int) & (64 int) A[WRAPPED] (LINE:24)) != (0 int)) ? (wrap:java.util.Map:SGET  A[WRAPPED] (LINE:28) ce0.h ce0) : (r6v0 java.util.LinkedHashMap))
 A[MD:(uh0, t11, cd2, boolean, java.util.Map):void (m)] (LINE:32) call: z33.<init>(uh0, t11, cd2, boolean, java.util.Map):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ z33(uh0 uh0Var, t11 t11Var, cd2 cd2Var, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : uh0Var, (i & 4) != 0 ? null : t11Var, (i & 8) != 0 ? null : cd2Var, (i & 32) == 0, (i & 64) != 0 ? ce0.h : linkedHashMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z33)) {
            return false;
        }
        z33 z33Var = (z33) obj;
        return t11.l(this.a, z33Var.a) && t11.l(null, null) && t11.l(this.b, z33Var.b) && this.c == z33Var.c && t11.l(this.d, z33Var.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        uh0 uh0Var = this.a;
        int iHashCode = (((uh0Var == null ? 0 : uh0Var.hashCode()) * 961) + 0) * 31;
        cd2 cd2Var = this.b;
        return this.d.hashCode() + hk1.d((iHashCode + (cd2Var != null ? cd2Var.hashCode() : 0)) * 961, 31, this.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=null, changeSize=" + ((Object) null) + ", scale=" + this.b + ", veil=null, hold=" + this.c + ", effectsMap=" + this.d + ')';
    }

    public z33(uh0 uh0Var, t11 t11Var, cd2 cd2Var, boolean z, Map map) {
        this.a = uh0Var;
        this.b = cd2Var;
        this.c = z;
        this.d = map;
    }
}
