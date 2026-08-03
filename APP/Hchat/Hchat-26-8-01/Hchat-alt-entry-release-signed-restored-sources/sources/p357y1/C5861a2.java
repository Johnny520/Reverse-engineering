package p357y1;

import android.view.MotionEvent;

/* JADX INFO: renamed from: y1.a2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5861a2 {

    /* JADX INFO: renamed from: a */
    public static final C5861a2 f23817a = new C5861a2();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m10563a(MotionEvent motionEvent, int i9) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i9)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i9)) & Integer.MAX_VALUE) < 2139095040;
    }
}
