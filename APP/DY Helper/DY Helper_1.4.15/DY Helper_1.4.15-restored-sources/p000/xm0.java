package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class xm0 extends p000.vm0 {

    /* JADX INFO: renamed from: θ */
    public static final p000.xm0 f12213 = null;

    static {
            xm0 r0 = new xm0
            r1 = 1
            r2 = 0
            r0.<init>(r1, r2, r1)
            p000.xm0.f12213 = r0
            return
    }

    @Override // p000.vm0
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p000.xm0
            if (r0 == 0) goto L23
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            xm0 r0 = (p000.xm0) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L21
        L13:
            xm0 r3 = (p000.xm0) r3
            int r0 = r3.f11347
            int r1 = r2.f11347
            if (r1 != r0) goto L23
            int r2 = r2.f11348
            int r3 = r3.f11348
            if (r2 != r3) goto L23
        L21:
            r2 = 1
            return r2
        L23:
            r2 = 0
            return r2
    }

    @Override // p000.vm0
    public final int hashCode() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r1 = -1
            return r1
        L8:
            int r0 = r1.f11347
            int r0 = r0 * 31
            int r1 = r1.f11348
            int r0 = r0 + r1
            return r0
    }

    @Override // p000.vm0
    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.f11347
            int r1 = r1.f11348
            if (r0 <= r1) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // p000.vm0
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.f11347
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            int r2 = r2.f11348
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: α */
    public final boolean m6684(int r2) {
            r1 = this;
            int r0 = r1.f11347
            if (r0 > r2) goto La
            int r1 = r1.f11348
            if (r2 > r1) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }
}
