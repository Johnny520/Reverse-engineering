package p073f2;

import android.view.MotionEvent;
import p250r1.C6455e;

/* JADX INFO: renamed from: f2.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2251l {

    /* JADX INFO: renamed from: a */
    public static final C2251l f6184a = new C2251l();

    /* JADX INFO: renamed from: a */
    public final long m8178a(MotionEvent motionEvent, int i10) {
        float rawX = motionEvent.getRawX(i10);
        return C6455e.m25551e((((long) Float.floatToRawIntBits(motionEvent.getRawY(i10))) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32));
    }
}
