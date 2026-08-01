package p047I0;

import android.view.MotionEvent;

/* JADX INFO: renamed from: I0.G0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0672G0 {

    /* JADX INFO: renamed from: a */
    public static final C0672G0 f2152a = new C0672G0();

    /* JADX INFO: renamed from: a */
    public final boolean m1171a(MotionEvent motionEvent, int i5) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i5)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i5)) & Integer.MAX_VALUE) < 2139095040;
    }
}
