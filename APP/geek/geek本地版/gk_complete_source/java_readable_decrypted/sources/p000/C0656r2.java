package p000;

import android.window.BackEvent;

/* JADX INFO: renamed from: r2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0656r2 {

    /* JADX INFO: renamed from: a */
    public static final C0656r2 f4133a = new C0656r2();

    /* JADX INFO: renamed from: a */
    public final BackEvent m2186a(float f, float f2, float f3, int i) {
        return new BackEvent(f, f2, f3, i);
    }

    /* JADX INFO: renamed from: b */
    public final float m2187b(BackEvent backEvent) {
        AbstractC0346ip.m1503o("backEvent", backEvent);
        return backEvent.getProgress();
    }

    /* JADX INFO: renamed from: c */
    public final int m2188c(BackEvent backEvent) {
        AbstractC0346ip.m1503o("backEvent", backEvent);
        return backEvent.getSwipeEdge();
    }

    /* JADX INFO: renamed from: d */
    public final float m2189d(BackEvent backEvent) {
        AbstractC0346ip.m1503o("backEvent", backEvent);
        return backEvent.getTouchX();
    }

    /* JADX INFO: renamed from: e */
    public final float m2190e(BackEvent backEvent) {
        AbstractC0346ip.m1503o("backEvent", backEvent);
        return backEvent.getTouchY();
    }
}
