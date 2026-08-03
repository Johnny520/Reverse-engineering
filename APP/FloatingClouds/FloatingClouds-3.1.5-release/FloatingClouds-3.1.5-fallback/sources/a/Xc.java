package a;

/* JADX INFO: loaded from: classes.dex */
public final class Xc implements a.InterfaceC0438w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f340a;

    public Xc(float r1) {
            r0 = this;
            r0.<init>()
            r0.f340a = r1
            return
    }

    @Override // a.InterfaceC0438w4
    public final float a(android.graphics.RectF r2) {
            r1 = this;
            float r0 = r2.width()
            float r2 = r2.height()
            float r2 = java.lang.Math.min(r0, r2)
            float r0 = r1.f340a
            float r2 = r2 * r0
            return r2
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof a.Xc
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            a.Xc r4 = (a.Xc) r4
            float r1 = r3.f340a
            float r4 = r4.f340a
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L15
            return r0
        L15:
            return r2
    }

    public final int hashCode() {
            r1 = this;
            float r0 = r1.f340a
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }
}
