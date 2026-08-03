package a;

/* JADX INFO: renamed from: a.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0273n0 implements a.InterfaceC0438w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.InterfaceC0438w4 f590a;
    public final float b;

    public C0273n0(float r2, a.InterfaceC0438w4 r3) {
            r1 = this;
            r1.<init>()
        L3:
            boolean r0 = r3 instanceof a.C0273n0
            if (r0 == 0) goto L12
            a.n0 r3 = (a.C0273n0) r3
            a.w4 r3 = r3.f590a
            r0 = r3
            a.n0 r0 = (a.C0273n0) r0
            float r0 = r0.b
            float r2 = r2 + r0
            goto L3
        L12:
            r1.f590a = r3
            r1.b = r2
            return
    }

    @Override // a.InterfaceC0438w4
    public final float a(android.graphics.RectF r2) {
            r1 = this;
            a.w4 r0 = r1.f590a
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
            boolean r1 = r5 instanceof a.C0273n0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            a.n0 r5 = (a.C0273n0) r5
            a.w4 r1 = r5.f590a
            a.w4 r3 = r4.f590a
            boolean r1 = r3.equals(r1)
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
            a.w4 r1 = r2.f590a
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }
}
