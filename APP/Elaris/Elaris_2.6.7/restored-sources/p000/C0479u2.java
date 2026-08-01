package p000;

import java.io.IOException;

/* JADX INFO: renamed from: u2 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0479u2 {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: THROW 
  (wrap:java.lang.IllegalArgumentException:0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT (r3v0 java.lang.String), (r2v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:11))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:15) call: java.lang.IllegalArgumentException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:168) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1036a(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
  (wrap:java.lang.IllegalStateException:0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (c), WRAPPED] (LINE:3) call: java.lang.IllegalStateException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:97) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1037b(String str) {
        throw new IllegalStateException(str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
  (wrap:java.io.IOException:0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (c), WRAPPED] (LINE:3) call: java.io.IOException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:97) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m1038c(String str) throws IOException {
        throw new IOException(str);
    }
}
