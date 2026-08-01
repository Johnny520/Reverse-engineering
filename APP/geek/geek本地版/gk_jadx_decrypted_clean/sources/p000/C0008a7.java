package p000;

import android.window.BackEvent;

/* JADX INFO: renamed from: a7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0008a7 {

    /* JADX INFO: renamed from: a */
    public final float f60a;

    /* JADX INFO: renamed from: b */
    public final float f61b;

    /* JADX INFO: renamed from: c */
    public final float f62c;

    /* JADX INFO: renamed from: d */
    public final int f63d;

    public C0008a7(BackEvent backEvent) {
        C0656r2 c0656r2 = C0656r2.f4133a;
        float fM2189d = c0656r2.m2189d(backEvent);
        float fM2190e = c0656r2.m2190e(backEvent);
        float fM2187b = c0656r2.m2187b(backEvent);
        int iM2188c = c0656r2.m2188c(backEvent);
        this.f60a = fM2189d;
        this.f61b = fM2190e;
        this.f62c = fM2187b;
        this.f63d = iM2188c;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f60a + ", touchY=" + this.f61b + ", progress=" + this.f62c + ", swipeEdge=" + this.f63d + '}';
    }
}
