package a;

/* JADX INFO: renamed from: a.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0361s implements a.InterfaceC0438w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f674a;

    public C0361s(float r1) {
            r0 = this;
            r0.<init>()
            r0.f674a = r1
            return
    }

    @Override // a.InterfaceC0438w4
    public final float a(android.graphics.RectF r1) {
            r0 = this;
            float r1 = r0.f674a
            return r1
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof a.C0361s
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            a.s r4 = (a.C0361s) r4
            float r1 = r3.f674a
            float r4 = r4.f674a
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L15
            return r0
        L15:
            return r2
    }

    public final int hashCode() {
            r1 = this;
            float r0 = r1.f674a
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }
}
