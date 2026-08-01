package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class m11 {

    /* JADX INFO: renamed from: α */
    public int[] f6887;

    /* JADX INFO: renamed from: β */
    public int f6888;

    public /* synthetic */ m11() {
            r1 = this;
            r0 = 16
            r1.<init>(r0)
            return
    }

    public m11(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto L8
            int[] r1 = p000.an0.f333
            goto La
        L8:
            int[] r1 = new int[r1]
        La:
            r0.f6887 = r1
            return
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof p000.m11
            r1 = 0
            if (r0 == 0) goto L2a
            m11 r6 = (p000.m11) r6
            int r0 = r6.f6888
            int r2 = r5.f6888
            if (r0 == r2) goto Le
            goto L2a
        Le:
            int[] r5 = r5.f6887
            int[] r6 = r6.f6887
            xm0 r0 = p000.j81.m2893(r1, r2)
            int r2 = r0.f11347
            int r0 = r0.f11348
            if (r2 > r0) goto L28
        L1c:
            r3 = r5[r2]
            r4 = r6[r2]
            if (r3 == r4) goto L23
            return r1
        L23:
            if (r2 == r0) goto L28
            int r2 = r2 + 1
            goto L1c
        L28:
            r5 = 1
            return r5
        L2a:
            return r1
    }

    public final int hashCode() {
            r4 = this;
            int[] r0 = r4.f6887
            int r4 = r4.f6888
            r1 = 0
            r2 = r1
        L6:
            if (r1 >= r4) goto L14
            r3 = r0[r1]
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 * 31
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L6
        L14:
            return r2
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            int[] r1 = r5.f6887
            int r5 = r5.f6888
            r2 = 0
        Lf:
            if (r2 >= r5) goto L29
            r3 = r1[r2]
            r4 = -1
            if (r2 != r4) goto L1c
            java.lang.String r5 = "..."
            r0.append(r5)
            goto L2e
        L1c:
            if (r2 == 0) goto L23
            java.lang.String r4 = ", "
            r0.append(r4)
        L23:
            r0.append(r3)
            int r2 = r2 + 1
            goto Lf
        L29:
            java.lang.String r5 = "]"
            r0.append(r5)
        L2e:
            java.lang.String r5 = r0.toString()
            return r5
    }

    /* JADX INFO: renamed from: α */
    public final void m3701(int r4) {
            r3 = this;
            int r0 = r3.f6888
            int r0 = r0 + 1
            int[] r1 = r3.f6887
            int r2 = r1.length
            if (r2 >= r0) goto L18
            int r2 = r1.length
            int r2 = r2 * 3
            int r2 = r2 / 2
            int r0 = java.lang.Math.max(r0, r2)
            int[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.f6887 = r0
        L18:
            int[] r0 = r3.f6887
            int r1 = r3.f6888
            r0[r1] = r4
            int r1 = r1 + 1
            r3.f6888 = r1
            return
    }

    /* JADX INFO: renamed from: β */
    public final int m3702(int r2) {
            r1 = this;
            if (r2 < 0) goto Lb
            int r0 = r1.f6888
            if (r2 >= r0) goto Lb
            int[] r1 = r1.f6887
            r1 = r1[r2]
            return r1
        Lb:
            java.lang.String r1 = "Index must be between 0 and size"
            p000.C1080.m7269(r1)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public final void m3703(int r4) {
            r3 = this;
            if (r4 < 0) goto L1a
            int r0 = r3.f6888
            if (r4 >= r0) goto L1a
            int[] r1 = r3.f6887
            r2 = r1[r4]
            int r2 = r0 + (-1)
            if (r4 == r2) goto L13
            int r2 = r4 + 1
            p000.AbstractC0312g7.m2235(r4, r2, r0, r1, r1)
        L13:
            int r4 = r3.f6888
            int r4 = r4 + (-1)
            r3.f6888 = r4
            return
        L1a:
            java.lang.String r3 = "Index must be between 0 and size"
            p000.C1080.m7269(r3)
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m3704(int r2, int r3) {
            r1 = this;
            if (r2 < 0) goto Ld
            int r0 = r1.f6888
            if (r2 >= r0) goto Ld
            int[] r1 = r1.f6887
            r0 = r1[r2]
            r1[r2] = r3
            return
        Ld:
            java.lang.String r1 = "Index must be between 0 and size"
            p000.C1080.m7269(r1)
            return
    }
}
