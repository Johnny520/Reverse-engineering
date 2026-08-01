package p000;

import android.window.BackEvent;

/* JADX INFO: renamed from: k7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0401k7 {

    /* JADX INFO: renamed from: a */
    public final float f2790a;

    /* JADX INFO: renamed from: b */
    public final float f2791b;

    /* JADX INFO: renamed from: c */
    public final float f2792c;

    /* JADX INFO: renamed from: d */
    public final int f2793d;

    public C0401k7(BackEvent backEvent) {
        C0655r2 c0655r2 = C0655r2.f3999a;
        float fM2200d = c0655r2.m2200d(backEvent);
        float fM2201e = c0655r2.m2201e(backEvent);
        float fM2198b = c0655r2.m2198b(backEvent);
        int iM2199c = c0655r2.m2199c(backEvent);
        this.f2790a = fM2200d;
        this.f2791b = fM2201e;
        this.f2792c = fM2198b;
        this.f2793d = iM2199c;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f2790a + ", touchY=" + this.f2791b + ", progress=" + this.f2792c + ", swipeEdge=" + this.f2793d + '}';
    }
}
