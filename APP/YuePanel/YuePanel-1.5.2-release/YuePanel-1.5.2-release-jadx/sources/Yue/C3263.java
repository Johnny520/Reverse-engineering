package Yue;

import android.window.BackEvent;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(34)
public final class C3263 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C3263 f174 = new C3263();

    @InterfaceC6399
    @InterfaceC4482
    /* JADX INFO: renamed from: ۥ */
    public final BackEvent m333(float f, float f2, float f3, int i) {
        return new BackEvent(f, f2, f3, i);
    }

    @InterfaceC4482
    /* JADX INFO: renamed from: ۥ۟ */
    public final float m334(@InterfaceC6399 BackEvent backEvent) {
        C5499.m17103(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    @InterfaceC4482
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int m6664(@InterfaceC6399 BackEvent backEvent) {
        C5499.m17103(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    @InterfaceC4482
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final float m6665(@InterfaceC6399 BackEvent backEvent) {
        C5499.m17103(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    @InterfaceC4482
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final float m6666(@InterfaceC6399 BackEvent backEvent) {
        C5499.m17103(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
