package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class vm0 implements java.lang.Iterable, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public final int f11347;

    /* JADX INFO: renamed from: ζ */
    public final int f11348;

    /* JADX INFO: renamed from: η */
    public final int f11349;

    public vm0(int r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            if (r4 == 0) goto L1b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r0) goto L14
            r1.f11347 = r2
            int r2 = p000.g81.m2275(r2, r3, r4)
            r1.f11348 = r2
            r1.f11349 = r4
            return
        L14:
            java.lang.String r1 = "Step must be greater than Int.MIN_VALUE to avoid overflow on negation."
            p000.C1080.m7275(r1)
            r1 = 0
            throw r1
        L1b:
            java.lang.String r1 = "Step must be non-zero."
            p000.C1080.m7275(r1)
            r1 = 0
            throw r1
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p000.vm0
            if (r0 == 0) goto L29
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            vm0 r0 = (p000.vm0) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L27
        L13:
            vm0 r3 = (p000.vm0) r3
            int r0 = r3.f11347
            int r1 = r2.f11347
            if (r1 != r0) goto L29
            int r0 = r2.f11348
            int r1 = r3.f11348
            if (r0 != r1) goto L29
            int r2 = r2.f11349
            int r3 = r3.f11349
            if (r2 != r3) goto L29
        L27:
            r2 = 1
            return r2
        L29:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r2 = -1
            return r2
        L8:
            int r0 = r2.f11347
            int r0 = r0 * 31
            int r1 = r2.f11348
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r2 = r2.f11349
            int r0 = r0 + r2
            return r0
    }

    public boolean isEmpty() {
            r4 = this;
            r0 = 0
            r1 = 1
            int r2 = r4.f11348
            int r3 = r4.f11349
            int r4 = r4.f11347
            if (r3 <= 0) goto Le
            if (r4 <= r2) goto Ld
            return r1
        Ld:
            return r0
        Le:
            if (r4 >= r2) goto L11
            return r1
        L11:
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r3 = this;
            wm0 r0 = new wm0
            int r1 = r3.f11348
            int r2 = r3.f11349
            int r3 = r3.f11347
            r0.<init>(r3, r1, r2)
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = " step "
            int r1 = r4.f11348
            int r2 = r4.f11349
            int r4 = r4.f11347
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            if (r2 <= 0) goto L25
            r3.<init>()
            r3.append(r4)
            java.lang.String r4 = ".."
            r3.append(r4)
            r3.append(r1)
            r3.append(r0)
            r3.append(r2)
        L20:
            java.lang.String r4 = r3.toString()
            return r4
        L25:
            r3.<init>()
            r3.append(r4)
            java.lang.String r4 = " downTo "
            r3.append(r4)
            r3.append(r1)
            r3.append(r0)
            int r4 = -r2
            r3.append(r4)
            goto L20
    }
}
