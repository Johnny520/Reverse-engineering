package defpackage;

/* JADX INFO: renamed from: ᲈᛳᛷᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C2210 implements java.lang.Iterable, defpackage.InterfaceC0958 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final int f9422;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int f9423;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int f9424;

    public C2210(int r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            if (r4 == 0) goto L1b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r0) goto L14
            r1.f9424 = r2
            int r2 = defpackage.AbstractC0425.m1187(r2, r3, r4)
            r1.f9423 = r2
            r1.f9422 = r4
            return
        L14:
            java.lang.String r1 = "Step must be greater than Int.MIN_VALUE to avoid overflow on negation."
            defpackage.C2264.m3684(r1)
            r1 = 0
            throw r1
        L1b:
            java.lang.String r1 = "Step must be non-zero."
            defpackage.C2264.m3684(r1)
            r1 = 0
            throw r1
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.C2210
            if (r0 == 0) goto L29
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            ᲈᛳᛷᛴ r0 = (defpackage.C2210) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L27
        L13:
            ᲈᛳᛷᛴ r3 = (defpackage.C2210) r3
            int r0 = r3.f9424
            int r1 = r2.f9424
            if (r1 != r0) goto L29
            int r0 = r2.f9423
            int r1 = r3.f9423
            if (r0 != r1) goto L29
            int r2 = r2.f9422
            int r3 = r3.f9422
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
            int r0 = r2.f9424
            int r0 = r0 * 31
            int r1 = r2.f9423
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r2 = r2.f9422
            int r0 = r0 + r2
            return r0
    }

    public boolean isEmpty() {
            r4 = this;
            r0 = 0
            r1 = 1
            int r2 = r4.f9423
            int r3 = r4.f9422
            int r4 = r4.f9424
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
            ᛴᛵᛸᲇ r0 = new ᛴᛵᛸᲇ
            int r1 = r3.f9423
            int r2 = r3.f9422
            int r3 = r3.f9424
            r0.<init>(r3, r1, r2)
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = " step "
            int r1 = r4.f9423
            int r2 = r4.f9422
            int r4 = r4.f9424
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
