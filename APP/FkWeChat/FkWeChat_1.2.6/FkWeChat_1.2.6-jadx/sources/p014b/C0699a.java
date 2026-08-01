package p014b;

import android.window.BackEvent;

/* JADX INFO: renamed from: b.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0699a {

    /* JADX INFO: renamed from: a */
    public static final C0699a f2050a = new C0699a();

    /* JADX INFO: renamed from: a */
    public final BackEvent m2762a(float f10, float f11, float f12, int i10) {
        return new BackEvent(f10, f11, f12, i10);
    }

    /* JADX INFO: renamed from: b */
    public final float m2763b(BackEvent backEvent) {
        backEvent.getClass();
        return backEvent.getProgress();
    }

    /* JADX INFO: renamed from: c */
    public final int m2764c(BackEvent backEvent) {
        backEvent.getClass();
        return backEvent.getSwipeEdge();
    }

    /* JADX INFO: renamed from: d */
    public final float m2765d(BackEvent backEvent) {
        backEvent.getClass();
        return backEvent.getTouchX();
    }

    /* JADX INFO: renamed from: e */
    public final float m2766e(BackEvent backEvent) {
        backEvent.getClass();
        return backEvent.getTouchY();
    }
}
