package p179m2;

import android.view.MotionEvent;

/* JADX INFO: renamed from: m2.o2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4886o2 {

    /* JADX INFO: renamed from: a */
    public static final C4886o2 f14595a = new C4886o2();

    /* JADX INFO: renamed from: a */
    public final boolean m19535a(MotionEvent motionEvent, int i10) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i10)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i10)) & Integer.MAX_VALUE) < 2139095040;
    }
}
