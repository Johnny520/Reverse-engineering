package bsh;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: bsh.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0353j {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
  (wrap:bsh.ParseException:0x0002: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:3) call: bsh.ParseException.<init>():void type: CONSTRUCTOR)
 (LINE:27) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1303a() throws ParseException {
        throw new ParseException();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: THROW 
  (wrap:java.lang.IllegalArgumentException:0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT (r2v0 java.lang.String), (r1v0 java.lang.Object), (r3v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:12))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:18) call: java.lang.IllegalArgumentException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:109) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1304b(Object obj, String str, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
  (wrap:java.lang.NullPointerException:0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (c), WRAPPED] (LINE:3) call: java.lang.NullPointerException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:35) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m1305c(String str) {
        throw new NullPointerException(str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: THROW 
  (wrap:bsh.InterpreterError:0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT (r2v0 java.lang.String), (r3v0 java.lang.Throwable) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:11))
  (r3v0 java.lang.Throwable)
 A[MD:(java.lang.String, java.lang.Throwable):void (m), WRAPPED] (LINE:15) call: bsh.InterpreterError.<init>(java.lang.String, java.lang.Throwable):void type: CONSTRUCTOR)
 (LINE:57) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m1306d(String str, Throwable th2) {
        throw new InterpreterError(str + th2, th2);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
  (wrap:java.util.NoSuchElementException:0x0002: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:3) call: java.util.NoSuchElementException.<init>():void type: CONSTRUCTOR)
 (LINE:27) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m1307e() {
        throw new NoSuchElementException();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
  (wrap:bsh.InterpreterError:0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m), WRAPPED] (LINE:3) call: bsh.InterpreterError.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:35) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m1308f(String str) {
        throw new InterpreterError(str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
  (wrap:java.lang.RuntimeException:0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (c), WRAPPED] (LINE:3) call: java.lang.RuntimeException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:35) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m1309g(String str) {
        throw new RuntimeException(str);
    }
}
