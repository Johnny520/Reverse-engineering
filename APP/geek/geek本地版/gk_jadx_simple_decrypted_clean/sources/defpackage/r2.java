package defpackage;

import android.window.BackEvent;

/* JADX INFO: loaded from: classes.dex */
public final class r2 {
    public static final r2 a = null;

    static {
        a = new r2();
    }

    public final BackEvent a(float r2, float r3, float r4, int r5) {
        return new BackEvent(r2, r3, r4, r5);
    }

    public final float b(BackEvent r2) {
        ip.o("backEvent", r2);
        return r2.getProgress();
    }

    public final int c(BackEvent r2) {
        ip.o("backEvent", r2);
        return r2.getSwipeEdge();
    }

    public final float d(BackEvent r2) {
        ip.o("backEvent", r2);
        return r2.getTouchX();
    }

    public final float e(BackEvent r2) {
        ip.o("backEvent", r2);
        return r2.getTouchY();
    }
}
