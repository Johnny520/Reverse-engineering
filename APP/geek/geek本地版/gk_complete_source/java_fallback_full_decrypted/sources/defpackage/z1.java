package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z1 implements defpackage.de {
    public final defpackage.de a;
    public final float b;

    public z1(float r2, defpackage.de r3) {
            r1 = this;
            r1.<init>()
        L3:
            boolean r0 = r3 instanceof defpackage.z1
            if (r0 == 0) goto L12
            z1 r3 = (defpackage.z1) r3
            de r3 = r3.a
            r0 = r3
            z1 r0 = (defpackage.z1) r0
            float r0 = r0.b
            float r2 = r2 + r0
            goto L3
        L12:
            r1.a = r3
            r1.b = r2
            return
    }

    @Override // defpackage.de
    public final float a(android.graphics.RectF r2) {
            r1 = this;
            de r0 = r1.a
            float r2 = r0.a(r2)
            float r0 = r1.b
            float r2 = r2 + r0
            r0 = 0
            float r2 = java.lang.Math.max(r0, r2)
            return r2
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.z1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            z1 r5 = (defpackage.z1) r5
            de r1 = r4.a
            de r3 = r5.a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L1f
            float r1 = r4.b
            float r5 = r5.b
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 != 0) goto L1f
            return r0
        L1f:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            float r0 = r2.b
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            de r1 = r2.a
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }
}
