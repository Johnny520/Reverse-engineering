package p135b;

import p030F1.C0437b;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: b.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1813a {

    /* JADX INFO: renamed from: a */
    public final float f6201a;

    /* JADX INFO: renamed from: b */
    public final float f6202b;

    /* JADX INFO: renamed from: c */
    public final float f6203c;

    /* JADX INFO: renamed from: d */
    public final int f6204d;

    /* JADX INFO: renamed from: e */
    public final long f6205e;

    public C1813a(C0437b c0437b) {
        AbstractC1665j.m2985e(c0437b, "navigationEvent");
        float f2 = c0437b.f1311c;
        float f5 = c0437b.f1312d;
        float f6 = c0437b.f1310b;
        int i5 = c0437b.f1309a;
        long j5 = c0437b.f1313e;
        this.f6201a = f2;
        this.f6202b = f5;
        this.f6203c = f6;
        this.f6204d = i5;
        this.f6205e = j5;
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.f6201a + ", touchY=" + this.f6202b + ", progress=" + this.f6203c + ", swipeEdge=" + this.f6204d + ", frameTimeMillis=" + this.f6205e + ')';
    }
}
