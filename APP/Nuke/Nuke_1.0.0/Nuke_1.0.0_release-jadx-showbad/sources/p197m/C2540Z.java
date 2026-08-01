package p197m;

import java.util.LinkedHashMap;
import java.util.Map;
import p011B4.AbstractC0231b;
import p061L2.C0982v;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: m.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C2540Z {

    /* JADX INFO: renamed from: a */
    public final C2530O f8107a;

    /* JADX INFO: renamed from: b */
    public final C2538X f8108b;

    /* JADX INFO: renamed from: c */
    public final C2535U f8109c;

    /* JADX INFO: renamed from: d */
    public final boolean f8110d;

    /* JADX INFO: renamed from: e */
    public final Map f8111e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2540Z(C2530O c2530o, C2538X c2538x, AbstractC2563w abstractC2563w, C2535U c2535u, boolean z5, Map map) {
        this.f8107a = c2530o;
        this.f8108b = c2538x;
        this.f8109c = c2535u;
        this.f8110d = z5;
        this.f8111e = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2540Z)) {
            return false;
        }
        C2540Z c2540z = (C2540Z) obj;
        return AbstractC1665j.m2981a(this.f8107a, c2540z.f8107a) && AbstractC1665j.m2981a(this.f8108b, c2540z.f8108b) && AbstractC1665j.m2981a(null, null) && AbstractC1665j.m2981a(this.f8109c, c2540z.f8109c) && this.f8110d == c2540z.f8110d && AbstractC1665j.m2981a(this.f8111e, c2540z.f8111e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        C2530O c2530o = this.f8107a;
        int iHashCode = (c2530o == null ? 0 : c2530o.hashCode()) * 31;
        C2538X c2538x = this.f8108b;
        int iHashCode2 = (((iHashCode + (c2538x == null ? 0 : c2538x.hashCode())) * 31) + 0) * 31;
        C2535U c2535u = this.f8109c;
        return this.f8111e.hashCode() + AbstractC0231b.m395f((iHashCode2 + (c2535u != null ? c2535u.hashCode() : 0)) * 961, 31, this.f8110d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TransitionData(fade=" + this.f8107a + ", slide=" + this.f8108b + ", changeSize=" + ((Object) null) + ", scale=" + this.f8109c + ", veil=null, hold=" + this.f8110d + ", effectsMap=" + this.f8111e + ')';
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002e: CONSTRUCTOR 
  (wrap:m.O:?: TERNARY null = ((wrap:int:0x0000: ARITH (r15v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null m.O) : (r10v0 m.O))
  (wrap:m.X:?: TERNARY null = ((wrap:int:0x0008: ARITH (r15v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null m.X) : (r11v0 m.X))
  (wrap:m.w:?: TERNARY null = ((wrap:int:0x000f: ARITH (r15v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null m.w) : (r12v0 m.w))
  (wrap:m.U:?: TERNARY null = ((wrap:int:0x0016: ARITH (r15v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null m.U) : (r13v0 m.U))
  (wrap:boolean:0x0022: TERNARY null = ((wrap:int:0x001d: ARITH (r15v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? true : false)
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0026: ARITH (r15v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:SGET  A[WRAPPED] (LINE:7) L2.v.d L2.v) : (r14v0 java.util.LinkedHashMap))
 A[MD:(m.O, m.X, m.w, m.U, boolean, java.util.Map):void (m)] (LINE:8) call: m.Z.<init>(m.O, m.X, m.w, m.U, boolean, java.util.Map):void type: THIS */
    public /* synthetic */ C2540Z(C2530O c2530o, C2538X c2538x, AbstractC2563w abstractC2563w, C2535U c2535u, LinkedHashMap linkedHashMap, int i5) {
        this((i5 & 1) != 0 ? null : c2530o, (i5 & 2) != 0 ? null : c2538x, (i5 & 4) != 0 ? null : abstractC2563w, (i5 & 8) != 0 ? null : c2535u, (i5 & 32) == 0, (i5 & 64) != 0 ? C0982v.f3048d : linkedHashMap);
    }
}
