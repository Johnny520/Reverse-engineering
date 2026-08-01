package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class kz1 implements java.lang.Cloneable {

    /* JADX INFO: renamed from: ε */
    public /* synthetic */ int[] f6333;

    /* JADX INFO: renamed from: ζ */
    public /* synthetic */ java.lang.Object[] f6334;

    /* JADX INFO: renamed from: η */
    public /* synthetic */ int f6335;

    public kz1(int r4) {
            r3 = this;
            r3.<init>()
            r4 = 4
            r0 = r4
        L5:
            r1 = 32
            r2 = 40
            if (r0 >= r1) goto L16
            r1 = 1
            int r1 = r1 << r0
            int r1 = r1 + (-12)
            if (r2 > r1) goto L13
            r2 = r1
            goto L16
        L13:
            int r0 = r0 + 1
            goto L5
        L16:
            int r2 = r2 / r4
            int[] r4 = new int[r2]
            r3.f6333 = r4
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r3.f6334 = r4
            return
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() {
            r0 = this;
            kz1 r0 = r0.m3427()
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            int r0 = r4.f6335
            if (r0 > 0) goto L7
            java.lang.String r4 = "{}"
            return r4
        L7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 * 28
            r1.<init>(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r1.append(r0)
            int r0 = r4.f6335
            r2 = 0
        L16:
            if (r2 >= r0) goto L3d
            if (r2 <= 0) goto L1f
            java.lang.String r3 = ", "
            r1.append(r3)
        L1f:
            int[] r3 = r4.f6333
            r3 = r3[r2]
            r1.append(r3)
            r3 = 61
            r1.append(r3)
            java.lang.Object r3 = r4.m3430(r2)
            if (r3 == r4) goto L35
            r1.append(r3)
            goto L3a
        L35:
            java.lang.String r3 = "(this Map)"
            r1.append(r3)
        L3a:
            int r2 = r2 + 1
            goto L16
        L3d:
            r4 = 125(0x7d, float:1.75E-43)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
    }

    /* JADX INFO: renamed from: α */
    public final p000.kz1 m3427() {
            r2 = this;
            java.lang.Object r0 = super.clone()
            r0.getClass()
            kz1 r0 = (p000.kz1) r0
            int[] r1 = r2.f6333
            java.lang.Object r1 = r1.clone()
            int[] r1 = (int[]) r1
            r0.f6333 = r1
            java.lang.Object[] r2 = r2.f6334
            java.lang.Object r2 = r2.clone()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r0.f6334 = r2
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final java.lang.Object m3428(int r3) {
            r2 = this;
            int[] r0 = r2.f6333
            int r1 = r2.f6335
            int r3 = p000.AbstractC1021yh.m6880(r1, r3, r0)
            if (r3 < 0) goto L14
            java.lang.Object[] r2 = r2.f6334
            r2 = r2[r3]
            java.lang.Object r3 = p000.kn0.f6054
            if (r2 != r3) goto L13
            goto L14
        L13:
            return r2
        L14:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: γ */
    public final void m3429(int r7, java.lang.Object r8) {
            r6 = this;
            int[] r0 = r6.f6333
            int r1 = r6.f6335
            int r0 = p000.AbstractC1021yh.m6880(r1, r7, r0)
            if (r0 < 0) goto Lf
            java.lang.Object[] r6 = r6.f6334
            r6[r0] = r8
            return
        Lf:
            int r0 = ~r0
            int r1 = r6.f6335
            if (r0 >= r1) goto L23
            java.lang.Object[] r2 = r6.f6334
            r3 = r2[r0]
            java.lang.Object r4 = p000.kn0.f6054
            if (r3 != r4) goto L23
            int[] r6 = r6.f6333
            r6[r0] = r7
            r2[r0] = r8
            return
        L23:
            int[] r2 = r6.f6333
            int r2 = r2.length
            r3 = 1
            if (r1 < r2) goto L4d
            int r1 = r1 + r3
            r2 = 4
            int r1 = r1 * r2
            r4 = r2
        L2d:
            r5 = 32
            if (r4 >= r5) goto L3c
            int r5 = r3 << r4
            int r5 = r5 + (-12)
            if (r1 > r5) goto L39
            r1 = r5
            goto L3c
        L39:
            int r4 = r4 + 1
            goto L2d
        L3c:
            int r1 = r1 / r2
            int[] r2 = r6.f6333
            int[] r2 = java.util.Arrays.copyOf(r2, r1)
            r6.f6333 = r2
            java.lang.Object[] r2 = r6.f6334
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)
            r6.f6334 = r1
        L4d:
            int r1 = r6.f6335
            int r2 = r1 - r0
            if (r2 == 0) goto L61
            int[] r2 = r6.f6333
            int r4 = r0 + 1
            p000.AbstractC0312g7.m2235(r4, r0, r1, r2, r2)
            java.lang.Object[] r1 = r6.f6334
            int r2 = r6.f6335
            p000.AbstractC0312g7.m2238(r1, r1, r4, r0, r2)
        L61:
            int[] r1 = r6.f6333
            r1[r0] = r7
            java.lang.Object[] r7 = r6.f6334
            r7[r0] = r8
            int r7 = r6.f6335
            int r7 = r7 + r3
            r6.f6335 = r7
            return
    }

    /* JADX INFO: renamed from: δ */
    public final java.lang.Object m3430(int r2) {
            r1 = this;
            java.lang.Object[] r1 = r1.f6334
            int r0 = r1.length
            if (r2 >= r0) goto L8
            r1 = r1[r2]
            return r1
        L8:
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            r1.<init>()
            throw r1
    }
}
