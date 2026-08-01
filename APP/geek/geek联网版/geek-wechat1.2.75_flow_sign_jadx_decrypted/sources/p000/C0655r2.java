package p000;

import android.window.BackEvent;

/* JADX INFO: renamed from: r2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0655r2 {

    /* JADX INFO: renamed from: a */
    public static final C0655r2 f3999a = new C0655r2();

    /* JADX INFO: renamed from: a */
    public final BackEvent m2197a(float f, float f2, float f3, int i) {
        return new BackEvent(f, f2, f3, i);
    }

    /* JADX INFO: renamed from: b */
    public final float m2198b(BackEvent backEvent) {
        AbstractC0493mp.m1857g("backEvent", backEvent);
        return backEvent.getProgress();
    }

    /* JADX INFO: renamed from: c */
    public final int m2199c(BackEvent backEvent) {
        AbstractC0493mp.m1857g("backEvent", backEvent);
        return backEvent.getSwipeEdge();
    }

    /* JADX INFO: renamed from: d */
    public final float m2200d(BackEvent backEvent) {
        AbstractC0493mp.m1857g("backEvent", backEvent);
        return backEvent.getTouchX();
    }

    /* JADX INFO: renamed from: e */
    public final float m2201e(BackEvent backEvent) {
        AbstractC0493mp.m1857g("backEvent", backEvent);
        return backEvent.getTouchY();
    }
}
