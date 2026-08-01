package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e implements defpackage.de {
    public final float a;

    public e(float r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.de
    public final float a(android.graphics.RectF r1) {
            r0 = this;
            float r1 = r0.a
            return r1
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            e r4 = (defpackage.e) r4
            float r1 = r3.a
            float r4 = r4.a
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L15
            return r0
        L15:
            return r2
    }

    public final int hashCode() {
            r1 = this;
            float r0 = r1.a
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }
}
