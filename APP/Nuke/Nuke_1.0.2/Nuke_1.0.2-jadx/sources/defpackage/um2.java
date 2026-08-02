package defpackage;

import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class um2 implements vm2, wb3 {
    public final /* synthetic */ int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [gd3.<clinit>():void] */
    public /* synthetic */ um2(int i) {
        this.h = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
  (wrap:java.util.NoSuchElementException:0x0002: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:3) call: java.util.NoSuchElementException.<init>():void type: CONSTRUCTOR)
 (LINE:42) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void b() {
        throw new NoSuchElementException();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001c: THROW 
  (wrap:java.lang.IndexOutOfBoundsException:0x0019: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT 
  (r5v0 java.lang.String)
  (r2v0 int)
  (r4v0 java.lang.Object)
  (r3v0 int)
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (")."))
 A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:22))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:26) call: java.lang.IndexOutOfBoundsException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:362) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void d(int i, int i2, Object obj, String str) {
        throw new IndexOutOfBoundsException(str + i + obj + i2 + ((Object) ")."));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: THROW 
  (wrap:t31:0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT ("Failed parsing '"), (r2v0 java.lang.Object), (r3v0 java.lang.Object), (r4v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:17))
  (r5v0 java.lang.Throwable)
 A[MD:(java.lang.String, java.lang.Throwable):void (c), WRAPPED] (LINE:23) call: t31.<init>(java.lang.String, java.lang.Throwable):void type: CONSTRUCTOR)
 (LINE:362) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void e(Object obj, Object obj2, Object obj3, Throwable th) {
        throw new t31("Failed parsing '" + obj + obj2 + obj3, th);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
  (wrap:java.lang.NullPointerException:0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (c), WRAPPED] (LINE:3) call: java.lang.NullPointerException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:51) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void f(String str) {
        throw new NullPointerException(str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: THROW 
  (wrap:java.io.FileNotFoundException:0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT (r2v0 java.lang.String), (r3v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:11))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:15) call: java.io.FileNotFoundException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:92) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void g(String str, Object obj) throws FileNotFoundException {
        throw new FileNotFoundException(str + obj);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: THROW 
  (wrap:t31:0x0014: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT (r1v0 java.lang.String), (r2v0 java.lang.Object), (r3v0 java.lang.Object), (r4v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:15))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:21) call: t31.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:362) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void h(String str, Object obj, Object obj2, Object obj3) {
        throw new t31(str + obj + obj2 + obj3);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
  (wrap:java.util.NoSuchElementException:0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (c), WRAPPED] (LINE:3) call: java.util.NoSuchElementException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:51) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void i(String str) {
        throw new NoSuchElementException(str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: THROW 
  (wrap:java.lang.IllegalArgumentException:0x0014: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT (r2v0 java.lang.String), (r3v0 java.lang.Object), (r4v0 java.lang.Object), (r5v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:17))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:21) call: java.lang.IllegalArgumentException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:362) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wb3
    public q33 a(sd sdVar) {
        return new q33(sdVar, ts1.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vm2
    public tm2 c(er2 er2Var) {
        sm2 sm2VarE;
        sm2 sm2Var;
        sm2 sm2Var2;
        tm2 tm2Var = (tm2) er2Var.j;
        bo0 bo0Var = (bo0) er2Var.k;
        if (tm2Var == null) {
            return tl.c(er2Var, sn.S);
        }
        sm2 sm2Var3 = tm2Var.b;
        sm2 sm2Var4 = tm2Var.a;
        if (er2Var.i) {
            sm2VarE = tl.e(er2Var, bo0Var, sm2Var4);
            sm2Var2 = sm2Var3;
            sm2Var3 = sm2Var4;
            sm2Var = sm2VarE;
        } else {
            sm2VarE = tl.e(er2Var, bo0Var, sm2Var3);
            sm2Var = sm2Var4;
            sm2Var2 = sm2VarE;
        }
        if (t11.l(sm2VarE, sm2Var3)) {
            return tm2Var;
        }
        return tl.v(new tm2(sm2Var, sm2Var2, er2Var.b() == u20.h || (er2Var.b() == u20.j && sm2Var.b > sm2Var2.b)), er2Var);
    }
}
