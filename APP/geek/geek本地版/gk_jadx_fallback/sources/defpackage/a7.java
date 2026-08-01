package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a7 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public a7(android.window.BackEvent r5) {
            r4 = this;
            r2 r0 = defpackage.r2.a
            float r1 = r0.d(r5)
            float r2 = r0.e(r5)
            float r3 = r0.b(r5)
            int r5 = r0.c(r5)
            r4.<init>()
            r4.a = r1
            r4.b = r2
            r4.c = r3
            r4.d = r5
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BackEventCompat{touchX="
            r0.<init>(r1)
            float r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", touchY="
            r0.append(r1)
            float r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", progress="
            r0.append(r1)
            float r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", swipeEdge="
            r0.append(r1)
            int r1 = r2.d
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
