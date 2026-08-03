package p000a;

import android.window.BackEvent;

/* JADX INFO: renamed from: a.D0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0057D0 {

    /* JADX INFO: renamed from: a */
    public static final C0057D0 f193a = new C0057D0();

    /* JADX INFO: renamed from: a */
    public final BackEvent m149a(float f, float f2, float f3, int i) {
        return new BackEvent(f, f2, f3, i);
    }

    /* JADX INFO: renamed from: b */
    public final float m150b(BackEvent backEvent) {
        C0631i9.m1482e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    /* JADX INFO: renamed from: c */
    public final int m151c(BackEvent backEvent) {
        C0631i9.m1482e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    /* JADX INFO: renamed from: d */
    public final float m152d(BackEvent backEvent) {
        C0631i9.m1482e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    /* JADX INFO: renamed from: e */
    public final float m153e(BackEvent backEvent) {
        C0631i9.m1482e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
