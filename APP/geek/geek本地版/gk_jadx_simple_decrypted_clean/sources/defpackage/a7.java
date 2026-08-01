package defpackage;

import android.window.BackEvent;

/* JADX INFO: loaded from: classes.dex */
public final class a7 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public a7(BackEvent r5) {
        r2 r0 = r2.a;
        float r1 = r0.d(r5);
        float r2 = r0.e(r5);
        float r3 = r0.b(r5);
        int r52 = r0.c(r5);
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r52;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + '}';
    }
}
