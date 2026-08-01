package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class ia1 extends p000.ha1 {

    /* JADX INFO: renamed from: θ */
    public final p000.fa1 f4973;

    /* JADX INFO: renamed from: ι */
    public java.lang.Object f4974;

    /* JADX INFO: renamed from: κ */
    public boolean f4975;

    /* JADX INFO: renamed from: λ */
    public int f4976;

    public ia1(p000.fa1 r2, p000.a62[] r3) {
            r1 = this;
            z52 r0 = r2.f3840
            r1.<init>(r0, r3)
            r1.f4973 = r2
            int r2 = r2.f3842
            r1.f4976 = r2
            return
    }

    @Override // p000.ha1, java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            fa1 r0 = r2.f4973
            int r0 = r0.f3842
            int r1 = r2.f4976
            if (r0 != r1) goto L27
            boolean r0 = r2.f4670
            if (r0 == 0) goto L22
            a62[] r0 = r2.f4668
            int r1 = r2.f4669
            r0 = r0[r1]
            java.lang.Object[] r1 = r0.f78
            int r0 = r0.f80
            r0 = r1[r0]
            r2.f4974 = r0
            r0 = 1
            r2.f4975 = r0
            java.lang.Object r2 = super.next()
            return r2
        L22:
            p000.C1080.m7277()
            r2 = 0
            return r2
        L27:
            java.util.ConcurrentModificationException r2 = new java.util.ConcurrentModificationException
            r2.<init>()
            throw r2
    }

    @Override // p000.ha1, java.util.Iterator
    public final void remove() {
            r5 = this;
            boolean r0 = r5.f4975
            if (r0 == 0) goto L47
            boolean r0 = r5.f4670
            r1 = 0
            fa1 r2 = r5.f4973
            if (r0 == 0) goto L34
            if (r0 == 0) goto L30
            a62[] r0 = r5.f4668
            int r3 = r5.f4669
            r0 = r0[r3]
            java.lang.Object[] r3 = r0.f78
            int r0 = r0.f80
            r0 = r3[r0]
            java.lang.Object r3 = r5.f4974
            java.util.Map r4 = p000.h62.m2392(r2)
            r4.remove(r3)
            if (r0 == 0) goto L29
            int r3 = r0.hashCode()
            goto L2a
        L29:
            r3 = r1
        L2a:
            z52 r4 = r2.f3840
            r5.m2700(r3, r4, r0, r1)
            goto L3d
        L30:
            p000.C1080.m7277()
            return
        L34:
            java.lang.Object r0 = r5.f4974
            java.util.Map r3 = p000.h62.m2392(r2)
            r3.remove(r0)
        L3d:
            r0 = 0
            r5.f4974 = r0
            r5.f4975 = r1
            int r0 = r2.f3842
            r5.f4976 = r0
            return
        L47:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>()
            throw r5
    }

    /* JADX INFO: renamed from: γ */
    public final void m2700(int r6, p000.z52 r7, java.lang.Object r8, int r9) {
            r5 = this;
            int r0 = r9 * 5
            r1 = 30
            a62[] r2 = r5.f4668
            if (r0 <= r1) goto L2b
            r6 = r2[r9]
            java.lang.Object[] r7 = r7.f12987
            int r0 = r7.length
            r1 = 0
            r6.m46(r7, r0, r1)
        L11:
            r6 = r2[r9]
            java.lang.Object[] r7 = r6.f78
            int r6 = r6.f80
            r6 = r7[r6]
            boolean r6 = p000.ln0.m3626(r6, r8)
            if (r6 != 0) goto L28
            r6 = r2[r9]
            int r7 = r6.f80
            int r7 = r7 + 2
            r6.f80 = r7
            goto L11
        L28:
            r5.f4669 = r9
            return
        L2b:
            int r0 = p000.i81.m2668(r6, r0)
            r1 = 1
            int r0 = r1 << r0
            boolean r3 = r7.m7099(r0)
            if (r3 == 0) goto L4e
            int r6 = r7.m7097(r0)
            r8 = r2[r9]
            java.lang.Object[] r0 = r7.f12987
            int r7 = r7.f12984
            int r7 = java.lang.Integer.bitCount(r7)
            int r7 = r7 * 2
            r8.m46(r0, r7, r6)
            r5.f4669 = r9
            return
        L4e:
            int r0 = r7.m7110(r0)
            z52 r3 = r7.m7109(r0)
            r2 = r2[r9]
            java.lang.Object[] r4 = r7.f12987
            int r7 = r7.f12984
            int r7 = java.lang.Integer.bitCount(r7)
            int r7 = r7 * 2
            r2.m46(r4, r7, r0)
            int r9 = r9 + r1
            r5.m2700(r6, r3, r8, r9)
            return
    }
}
