package p010B3;

import android.graphics.Insets;
import android.util.CloseGuard;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: B3.g */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0228g {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR  A[MD:():void (c)] (LINE:3) call: android.util.CloseGuard.<init>():void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ CloseGuard m368f() {
        return new CloseGuard();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CHECK_CAST (android.util.CloseGuard) (r0v0 java.lang.Object) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ CloseGuard m369g(Object obj) {
        return (CloseGuard) obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 android.graphics.Insets), (r2v0 android.graphics.Insets) A[MD:(android.graphics.Insets, android.graphics.Insets):void (c)] (LINE:3) call: android.view.WindowInsetsAnimation.Bounds.<init>(android.graphics.Insets, android.graphics.Insets):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ WindowInsetsAnimation.Bounds m370h(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 int), (r2v0 android.view.animation.Interpolator), (r3v0 long) A[MD:(int, android.view.animation.Interpolator, long):void (c)] (LINE:3) call: android.view.WindowInsetsAnimation.<init>(int, android.view.animation.Interpolator, long):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ WindowInsetsAnimation m371i(int i5, Interpolator interpolator, long j5) {
        return new WindowInsetsAnimation(i5, interpolator, j5);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CHECK_CAST (android.view.WindowInsetsAnimation) (r0v0 java.lang.Object) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ WindowInsetsAnimation m372j(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m374l() {
    }
}
