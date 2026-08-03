package p136j8;

import java.io.EOFException;
import java.io.IOException;
import java.util.NoSuchElementException;
import p068eh.AbstractC0921a;
import p077f8.InterfaceC1084d;
import p125i8.C2002f;
import p152k7.AbstractC2331a;
import p152k7.InterfaceC2336f;
import p166l7.C2521i;

/* JADX INFO: renamed from: j8.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2104o implements InterfaceC2336f, InterfaceC1084d {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2104o(C2002f c2002f) {
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
  (wrap:java.lang.IllegalStateException:0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (c), WRAPPED] (LINE:3) call: java.lang.IllegalStateException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:35) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m5276A(String str) {
        throw new IllegalStateException(str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
  (wrap:java.io.EOFException:0x0002: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:3) call: java.io.EOFException.<init>():void type: CONSTRUCTOR)
 (LINE:27) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5277a() throws EOFException {
        throw new EOFException();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: THROW 
  (wrap:java.io.IOException:0x001d: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT 
  ("Content-Length (")
  (r4v0 long)
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (") and stream length ("))
  (r3v0 int)
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (") disagree"))
 A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:26))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:30) call: java.io.IOException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:57) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m5278c(int i9, long j3) throws IOException {
        throw new IOException("Content-Length (" + j3 + ((Object) ") and stream length (") + i9 + ((Object) ") disagree"));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: THROW 
  (wrap:java.lang.IllegalArgumentException:0x0017: CONSTRUCTOR 
  (wrap:java.lang.String:0x0013: INVOKE 
  (wrap:java.lang.String:STR_CONCAT (r2v0 java.lang.String), (r1v0 int), ('.' char) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:14))
 VIRTUAL call: java.lang.Object.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:20))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:24) call: java.lang.IllegalArgumentException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:57) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m5279d(int i9, String str) {
        throw new IllegalArgumentException((str + i9 + '.').toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m5280e(int i9, StringBuilder sb2) {
        sb2.append(i9);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
  (wrap:java.lang.AssertionError:0x0002: CONSTRUCTOR (r1v0 java.lang.Object) A[MD:(java.lang.Object):void (c), WRAPPED] (LINE:3) call: java.lang.AssertionError.<init>(java.lang.Object):void type: CONSTRUCTOR)
 (LINE:35) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m5281f(Object obj) {
        throw new AssertionError(obj);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: THROW 
  (wrap:java.io.EOFException:0x001d: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT 
  ("\n not found: limit=")
  (r3v0 long)
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (" content="))
  (r2v0 java.lang.Object)
  (8230 char)
 A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:24))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:30) call: java.io.EOFException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:57) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m5282g(Object obj, long j3) throws EOFException {
        throw new EOFException("\\n not found: limit=" + j3 + ((Object) " content=") + obj + (char) 8230);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r2v0, r3v0 */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m5283h(Object obj, Object obj2) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append(obj2);
        throw new IOException(sb2.toString());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: THROW 
  (wrap:java.lang.AssertionError:0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT ("Thread "), (r2v0 java.lang.Object), (r3v0 java.lang.Object), (r4v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:17))
 A[MD:(java.lang.Object):void (c), WRAPPED] (LINE:23) call: java.lang.AssertionError.<init>(java.lang.Object):void type: CONSTRUCTOR)
 (LINE:109) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m5284i(Object obj, Object obj2, Object obj3) {
        throw new AssertionError("Thread " + obj + obj2 + obj3);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: THROW 
  (wrap:java.io.IOException:0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT (r3v0 java.lang.String), (r2v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:11))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:15) call: java.io.IOException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:57) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m5285j(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: THROW 
  (wrap:java.lang.IllegalStateException:0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:0x0011: INVOKE 
  (wrap:java.lang.String:STR_CONCAT (r2v0 java.lang.String), (r1v0 java.lang.Object), (r3v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:12))
 VIRTUAL call: java.lang.Object.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:18))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:22) call: java.lang.IllegalStateException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:109) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m5286k(Object obj, String str, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
  (wrap:java.util.NoSuchElementException:0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (c), WRAPPED] (LINE:3) call: java.util.NoSuchElementException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:35) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m5287l(String str) {
        throw new NoSuchElementException(str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: THROW 
  (wrap:java.lang.IllegalArgumentException:0x0014: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT (r2v0 java.lang.String), (r3v0 java.lang.Object), (r4v0 java.lang.Object), (r5v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:17))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:21) call: java.lang.IllegalArgumentException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:174) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m5288m(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
  (wrap:java.lang.IllegalArgumentException:0x0002: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:3) call: java.lang.IllegalArgumentException.<init>():void type: CONSTRUCTOR)
 (LINE:27) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m5289o() {
        throw new IllegalArgumentException();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: THROW 
  (wrap:java.lang.IllegalStateException:0x0012: CONSTRUCTOR 
  (wrap:java.lang.String:0x000e: INVOKE 
  (wrap:java.lang.String:STR_CONCAT (r2v0 java.lang.String), (r1v0 int) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:9))
 VIRTUAL call: java.lang.Object.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:15))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:19) call: java.lang.IllegalStateException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:57) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m5290p(int i9, String str) {
        throw new IllegalStateException((str + i9).toString());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: THROW 
  (wrap:java.lang.IllegalArgumentException:0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:0x0002: INVOKE (r1v0 java.lang.Object) VIRTUAL call: java.lang.Object.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:3))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:7) call: java.lang.IllegalArgumentException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:35) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m5291q(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: THROW 
  (wrap:java.lang.IllegalArgumentException:0x0017: CONSTRUCTOR 
  (wrap:java.lang.String:0x0013: INVOKE 
  (wrap:java.lang.String:STR_CONCAT (r2v0 java.lang.String), (r1v0 java.lang.Object), ('\"' char) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:14))
 VIRTUAL call: java.lang.Object.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:20))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:24) call: java.lang.IllegalArgumentException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:57) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m5292r(Object obj, String str) {
        throw new IllegalArgumentException((str + obj + '\"').toString());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: THROW 
  (wrap:java.lang.IllegalArgumentException:0x001a: CONSTRUCTOR 
  (wrap:java.lang.String:0x0016: INVOKE 
  (wrap:java.lang.String:STR_CONCAT 
  (r2v0 java.lang.String)
  (r1v0 java.lang.Object)
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (" and "))
  (r3v0 java.lang.Object)
 A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:17))
 VIRTUAL call: java.lang.Object.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:23))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:27) call: java.lang.IllegalArgumentException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:109) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m5293s(Object obj, String str, Object obj2) {
        throw new IllegalArgumentException((str + obj + ((Object) " and ") + obj2).toString());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
  (wrap:java.lang.IllegalArgumentException:0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (c), WRAPPED] (LINE:3) call: java.lang.IllegalArgumentException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:35) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m5294t(String str) {
        throw new IllegalArgumentException(str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: THROW 
  (wrap:java.io.IOException:0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT (r2v0 java.lang.String), (r1v0 int) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:9))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:15) call: java.io.IOException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:57) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m5295u(int i9, String str) throws IOException {
        throw new IOException(str + i9);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: THROW 
  (wrap:java.lang.NumberFormatException:0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT (r2v0 java.lang.String), (r1v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:9))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:15) call: java.lang.NumberFormatException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:57) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m5296v(Object obj, String str) {
        throw new NumberFormatException(str + obj);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
  (wrap:java.lang.UnsupportedOperationException:0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (c), WRAPPED] (LINE:3) call: java.lang.UnsupportedOperationException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:35) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m5297w(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: THROW 
  (wrap:java.lang.IllegalArgumentException:0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT (r2v0 java.lang.String), (r1v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:9))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:15) call: java.lang.IllegalArgumentException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:57) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m5298x(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
  (wrap:java.io.IOException:0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (c), WRAPPED] (LINE:3) call: java.io.IOException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:35) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m5299y(String str) throws IOException {
        throw new IOException(str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: THROW 
  (wrap:java.lang.IllegalArgumentException:0x0012: CONSTRUCTOR 
  (wrap:java.lang.String:0x000e: INVOKE 
  (wrap:java.lang.String:STR_CONCAT (r2v0 java.lang.String), (r1v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:9))
 VIRTUAL call: java.lang.Object.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:15))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:19) call: java.lang.IllegalArgumentException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:57) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m5300z(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p077f8.InterfaceC1084d
    /* JADX INFO: renamed from: b */
    public void mo468b(Object obj) {
        throw AbstractC0921a.m2247j(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.InterfaceC2334d
    /* JADX INFO: renamed from: n */
    public AbstractC2331a mo1892n() {
        return new C2521i(false);
    }
}
