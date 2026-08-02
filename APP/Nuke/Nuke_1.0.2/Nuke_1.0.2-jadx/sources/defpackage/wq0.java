package defpackage;

import android.graphics.RenderNode;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class wq0 {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0004: CONSTRUCTOR ("AndroidEdgeEffectOverscrollEffect") A[MD:(java.lang.String):void (c)] (LINE:5) call: android.graphics.RenderNode.<init>(java.lang.String):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ RenderNode f() {
        return new RenderNode("AndroidEdgeEffectOverscrollEffect");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR  A[MD:():void (c)] (LINE:3) call: android.view.WindowInsets.Builder.<init>():void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ WindowInsets.Builder h() {
        return new WindowInsets.Builder();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 android.view.WindowInsets) A[MD:(android.view.WindowInsets):void (c)] (LINE:3) call: android.view.WindowInsets.Builder.<init>(android.view.WindowInsets):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ WindowInsets.Builder i(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }
}
