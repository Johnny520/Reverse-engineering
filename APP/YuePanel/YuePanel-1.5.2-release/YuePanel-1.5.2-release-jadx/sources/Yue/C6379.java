package Yue;

import java.io.File;

/* JADX INFO: renamed from: Yue.ۥۣۡۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6379 extends C4820 {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 java.io.File)
  (wrap:java.io.File:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.io.File) : (r3v0 java.io.File))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.io.File, java.io.File, java.lang.String):void (m)] (LINE:1) call: Yue.ۥۣۡۢۢ.<init>(java.io.File, java.io.File, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C6379(File file, File file2, String str, int i, C4335 c4335) {
        this(file, (i & 2) != 0 ? null : file2, (i & 4) != 0 ? null : str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6379(@InterfaceC6399 File file, @InterfaceC6489 File file2, @InterfaceC6489 String str) {
        super(file, file2, str);
        C5499.m17103(file, "file");
    }
}
