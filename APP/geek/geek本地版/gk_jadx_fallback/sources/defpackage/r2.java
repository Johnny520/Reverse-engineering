package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r2 {
    public static final defpackage.r2 a = null;

    static {
            r2 r0 = new r2
            r0.<init>()
            defpackage.r2.a = r0
            return
    }

    public final android.window.BackEvent a(float r2, float r3, float r4, int r5) {
            r1 = this;
            android.window.BackEvent r0 = new android.window.BackEvent
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    public final float b(android.window.BackEvent r2) {
            r1 = this;
            java.lang.String r0 = "backEvent"
            defpackage.ip.o(r0, r2)
            float r2 = r2.getProgress()
            return r2
    }

    public final int c(android.window.BackEvent r2) {
            r1 = this;
            java.lang.String r0 = "backEvent"
            defpackage.ip.o(r0, r2)
            int r2 = r2.getSwipeEdge()
            return r2
    }

    public final float d(android.window.BackEvent r2) {
            r1 = this;
            java.lang.String r0 = "backEvent"
            defpackage.ip.o(r0, r2)
            float r2 = r2.getTouchX()
            return r2
    }

    public final float e(android.window.BackEvent r2) {
            r1 = this;
            java.lang.String r0 = "backEvent"
            defpackage.ip.o(r0, r2)
            float r2 = r2.getTouchY()
            return r2
    }
}
