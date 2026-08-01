package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class c11 {

    /* JADX INFO: renamed from: α */
    public static final p000.c11 f1931 = null;

    static {
            c11 r0 = new c11
            r0.<init>()
            p000.c11.f1931 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public final boolean m1104(android.view.MotionEvent r3, int r4) {
            r2 = this;
            float r2 = r3.getRawX(r4)
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2 = r2 & r0
            r1 = 2139095040(0x7f800000, float:Infinity)
            if (r2 >= r1) goto L1d
            float r2 = r3.getRawY(r4)
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            r2 = r2 & r0
            if (r2 >= r1) goto L1d
            r2 = 1
            return r2
        L1d:
            r2 = 0
            return r2
    }
}
