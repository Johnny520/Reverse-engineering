package Yue;

import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: Yue.ۥۢۥ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8386 extends RuntimeException {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final Fragment f24995;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 androidx.fragment.app.Fragment)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(androidx.fragment.app.Fragment, java.lang.String):void (m)] (LINE:1) call: Yue.ۥۢۥ۟ۡ.<init>(androidx.fragment.app.Fragment, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ AbstractC8386(Fragment fragment, String str, int i, C4335 c4335) {
        this(fragment, (i & 2) != 0 ? null : str);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public final Fragment m4371() {
        return this.f24995;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC8386(@InterfaceC6399 Fragment fragment, @InterfaceC6489 String str) {
        super(str);
        C5499.m17103(fragment, "fragment");
        this.f24995 = fragment;
    }
}
