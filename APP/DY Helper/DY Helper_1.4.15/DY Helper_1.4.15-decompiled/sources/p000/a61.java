package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class a61 extends p000.o61 {

    /* JADX INFO: renamed from: γ */
    public static final p000.a61 f77 = null;

    static {
            a61 r0 = new a61
            r1 = 0
            r2 = 2
            r3 = 1
            r0.<init>(r3, r1, r2)
            p000.a61.f77 = r0
            return
    }

    @Override // p000.o61
    /* JADX INFO: renamed from: α */
    public final void mo45(p000.f81 r18, p000.InterfaceC0676p6 r19, p000.rw1 r20, p000.en1 r21, p000.r71 r22) {
            r17 = this;
            r0 = r20
            r1 = 0
            r2 = r18
            int r2 = r2.m2055(r1)
            int r3 = r0.f9551
            if (r3 != 0) goto Le
            goto L13
        Le:
            java.lang.String r3 = "Cannot move a group while inserting"
            p000.AbstractC0804sn.m5526(r3)
        L13:
            java.lang.String r3 = "Parameter offset is out of bounds"
            if (r2 < 0) goto L18
            goto L1b
        L18:
            p000.AbstractC0804sn.m5526(r3)
        L1b:
            if (r2 != 0) goto L1f
            goto L163
        L1f:
            int r4 = r0.f9557
            int r5 = r0.f9559
            int r6 = r0.f9558
            r7 = r4
        L26:
            int[] r8 = r0.f9539
            if (r2 <= 0) goto L3e
            int r9 = r0.m5167(r7)
            int r9 = r9 * 5
            int r9 = r9 + 3
            r8 = r8[r9]
            int r7 = r7 + r8
            if (r7 > r6) goto L38
            goto L3b
        L38:
            p000.AbstractC0804sn.m5526(r3)
        L3b:
            int r2 = r2 + (-1)
            goto L26
        L3e:
            int r2 = r0.m5167(r7)
            int r2 = r2 * 5
            int r2 = r2 + 3
            r2 = r8[r2]
            int[] r3 = r0.f9539
            int r6 = r0.f9557
            int r6 = r0.m5167(r6)
            int r3 = r0.m5157(r6, r3)
            int[] r6 = r0.f9539
            int r8 = r0.m5167(r7)
            int r6 = r0.m5157(r8, r6)
            int[] r8 = r0.f9539
            int r7 = r7 + r2
            int r9 = r0.m5167(r7)
            int r8 = r0.m5157(r9, r8)
            int r9 = r8 - r6
            int r10 = r0.f9557
            int r10 = r10 + (-1)
            int r10 = java.lang.Math.max(r10, r1)
            r0.m5173(r9, r10)
            r0.m5172(r2)
            int[] r10 = r0.f9539
            int r11 = r0.m5167(r7)
            int r11 = r11 * 5
            int r12 = r0.m5167(r4)
            int r12 = r12 * 5
            int r13 = r2 * 5
            int r13 = r13 + r11
            p000.AbstractC0312g7.m2235(r12, r11, r13, r10, r10)
            if (r9 <= 0) goto La0
            java.lang.Object[] r11 = r0.f9540
            int r12 = r6 + r9
            int r12 = r0.m5158(r12)
            int r8 = r8 + r9
            int r8 = r0.m5158(r8)
            int r8 = r8 - r12
            java.lang.System.arraycopy(r11, r12, r11, r3, r8)
        La0:
            int r6 = r6 + r9
            int r3 = r6 - r3
            int r8 = r0.f9548
            int r11 = r0.f9549
            java.lang.Object[] r12 = r0.f9540
            int r12 = r12.length
            int r13 = r0.f9550
            int r14 = r4 + r2
            r15 = r4
        Laf:
            if (r15 >= r14) goto Le7
            int r1 = r0.m5167(r15)
            int r16 = r0.m5157(r1, r10)
            r18 = r3
            int r3 = r16 - r18
            r19 = r1
            if (r13 >= r1) goto Lc3
            r1 = 0
            goto Lc4
        Lc3:
            r1 = r8
        Lc4:
            int r1 = p000.rw1.m5128(r3, r1, r11, r12)
            int r3 = r0.f9548
            r16 = r8
            int r8 = r0.f9549
            r21 = r10
            java.lang.Object[] r10 = r0.f9540
            int r10 = r10.length
            int r1 = p000.rw1.m5128(r1, r3, r8, r10)
            int r3 = r19 * 5
            int r3 = r3 + 4
            r21[r3] = r1
            int r15 = r15 + 1
            r3 = r18
            r10 = r21
            r8 = r16
            r1 = 0
            goto Laf
        Le7:
            int r1 = r7 + r2
            int r3 = r0.m5165()
            java.util.ArrayList r8 = r0.f9541
            int r8 = p000.qw1.m4945(r8, r7, r3)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            if (r8 < 0) goto L11e
        Lfa:
            java.util.ArrayList r11 = r0.f9541
            int r11 = r11.size()
            if (r8 >= r11) goto L11e
            java.util.ArrayList r11 = r0.f9541
            java.lang.Object r11 = r11.get(r8)
            q80 r11 = (p000.q80) r11
            int r12 = r0.m5153(r11)
            if (r12 < r7) goto L11e
            if (r12 >= r1) goto L11e
            r10.add(r11)
            java.util.ArrayList r11 = r0.f9541
            java.lang.Object r11 = r11.remove(r8)
            q80 r11 = (p000.q80) r11
            goto Lfa
        L11e:
            int r1 = r4 - r7
            int r8 = r10.size()
            r11 = 0
        L125:
            if (r11 >= r8) goto L14c
            java.lang.Object r12 = r10.get(r11)
            q80 r12 = (p000.q80) r12
            int r13 = r0.m5153(r12)
            int r13 = r13 + r1
            int r14 = r0.f9544
            if (r13 < r14) goto L13c
            int r14 = r3 - r13
            int r14 = -r14
            r12.f8904 = r14
            goto L13e
        L13c:
            r12.f8904 = r13
        L13e:
            java.util.ArrayList r14 = r0.f9541
            int r13 = p000.qw1.m4945(r14, r13, r3)
            java.util.ArrayList r14 = r0.f9541
            r14.add(r13, r12)
            int r11 = r11 + 1
            goto L125
        L14c:
            boolean r1 = r0.m5138(r7, r2)
            if (r1 == 0) goto L157
            java.lang.String r1 = "Unexpectedly removed anchors"
            p000.AbstractC0804sn.m5526(r1)
        L157:
            int r1 = r0.f9558
            r0.m5162(r5, r1, r4)
            if (r9 <= 0) goto L163
            int r7 = r7 + (-1)
            r0.m5139(r6, r9, r7)
        L163:
            return
    }
}
