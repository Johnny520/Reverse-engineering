package p000a;

import android.window.BackEvent;

/* JADX INFO: renamed from: a.R1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0309R1 {

    /* JADX INFO: renamed from: a */
    public final float f1109a;

    /* JADX INFO: renamed from: b */
    public final float f1110b;

    /* JADX INFO: renamed from: c */
    public final float f1111c;

    /* JADX INFO: renamed from: d */
    public final int f1112d;

    public C0309R1(BackEvent backEvent) {
        C0057D0 c0057d0 = C0057D0.f193a;
        float fM152d = c0057d0.m152d(backEvent);
        float fM153e = c0057d0.m153e(backEvent);
        float fM150b = c0057d0.m150b(backEvent);
        int iM151c = c0057d0.m151c(backEvent);
        this.f1109a = fM152d;
        this.f1110b = fM153e;
        this.f1111c = fM150b;
        this.f1112d = iM151c;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f1109a + ", touchY=" + this.f1110b + ", progress=" + this.f1111c + ", swipeEdge=" + this.f1112d + '}';
    }
}
