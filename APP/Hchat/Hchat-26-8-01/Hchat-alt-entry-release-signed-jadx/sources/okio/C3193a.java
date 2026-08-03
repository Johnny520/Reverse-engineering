package okio;

import af.C0081d;
import java.io.IOException;
import p116i.InterfaceC1796v;
import p117i0.InterfaceC1826e2;
import p152k7.AbstractC2331a;
import p152k7.InterfaceC2336f;
import p257r7.C3719i;
import p257r7.C3720j;
import p257r7.C3724n;
import p257r7.C3731u;
import p314v7.C4490d;

/* JADX INFO: renamed from: okio.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3193a implements InterfaceC2336f, InterfaceC1796v, InterfaceC1826e2 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f10232g;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW (wrap:af.d:0x0002: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:3) call: af.d.<init>():void type: CONSTRUCTOR) (LINE:27) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m6814c() {
        throw new C0081d();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: THROW 
  (wrap:java.lang.IllegalStateException:0x0012: CONSTRUCTOR 
  (wrap:java.lang.String:0x000c: INVOKE 
  (wrap:java.lang.String:STR_CONCAT (r2v0 java.lang.String), (r1v0 int) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:9))
 VIRTUAL call: java.lang.Object.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:13))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:19) call: java.lang.IllegalStateException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:57) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m6815d(int i9, String str) {
        throw new IllegalStateException((str + i9).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m6816e(int i9, StringBuilder sb2) {
        sb2.append(i9);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: THROW 
  (wrap:java.lang.IllegalArgumentException:0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:0x0011: INVOKE 
  (wrap:java.lang.String:STR_CONCAT (r3v0 java.lang.String), (r1v0 long), (r4v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:12))
 VIRTUAL call: java.lang.Object.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:18))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:22) call: java.lang.IllegalArgumentException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:109) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m6817f(long j3, String str, Object obj) {
        throw new IllegalArgumentException((str + j3 + obj).toString());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: THROW 
  (wrap:java.io.IOException:0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT (r2v0 java.lang.String), (r1v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:9))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:15) call: java.io.IOException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:57) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m6818g(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: THROW 
  (wrap:java.lang.IllegalArgumentException:0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:0x0011: INVOKE 
  (wrap:java.lang.String:STR_CONCAT (r2v0 java.lang.String), (r1v0 java.lang.Object), (r3v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:12))
 VIRTUAL call: java.lang.Object.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:18))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:22) call: java.lang.IllegalArgumentException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:109) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m6819h(Object obj, String str, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
  (wrap:java.lang.IndexOutOfBoundsException:0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (c), WRAPPED] (LINE:3) call: java.lang.IndexOutOfBoundsException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:35) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m6820i(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: THROW 
  (wrap:java.io.IOException:0x0014: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT (r1v0 java.lang.String), (r2v0 java.lang.Object), (r3v0 java.lang.Object), (r4v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:15))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:21) call: java.io.IOException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:174) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m6821j(String str, Object obj, Object obj2, Object obj3) throws IOException {
        throw new IOException(str + obj + obj2 + obj3);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW (wrap:af.d:0x0002: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:3) call: af.d.<init>():void type: CONSTRUCTOR) (LINE:27) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m6822k() {
        throw new C0081d();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: THROW 
  (wrap:java.lang.IllegalStateException:0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT (r2v0 java.lang.String), (r1v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:9))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:15) call: java.lang.IllegalStateException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:57) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m6823l(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: THROW 
  (wrap:java.lang.IllegalStateException:0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:0x0011: INVOKE 
  (wrap:java.lang.String:STR_CONCAT (r3v0 java.lang.String), (r2v0 java.lang.Object), (r4v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:14))
 VIRTUAL call: java.lang.Object.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:18))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:22) call: java.lang.IllegalStateException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:109) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m6824m(Object obj, String str, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: THROW 
  (wrap:java.lang.RuntimeException:0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT (r3v0 java.lang.String), (r2v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:11))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:15) call: java.lang.RuntimeException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:57) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m6825o(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: THROW 
  (wrap:java.lang.IllegalStateException:0x0012: CONSTRUCTOR 
  (wrap:java.lang.String:0x000e: INVOKE 
  (wrap:java.lang.String:STR_CONCAT (r3v0 java.lang.String), (r2v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:11))
 VIRTUAL call: java.lang.Object.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:15))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:19) call: java.lang.IllegalStateException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:57) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m6826p(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1826e2
    /* JADX INFO: renamed from: a */
    public boolean mo2112a() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1796v
    /* JADX INFO: renamed from: b */
    public float mo3416b(float f3) {
        return (float) Math.sin((float) ((((double) f3) * 3.141592653589793d) / ((double) 2)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.InterfaceC2334d
    /* JADX INFO: renamed from: n */
    public AbstractC2331a mo1892n() {
        switch (this.f10232g) {
            case 9:
                return new C3720j(4);
            case 10:
                return new C3719i(4, 1);
            case 11:
                return new C3719i(2, 0);
            case 12:
                return new C3724n(false);
            case 13:
                return new C3731u();
            default:
                return new C4490d();
        }
    }
}
