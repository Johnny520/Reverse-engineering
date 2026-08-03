package m0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends m0.j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m0.u f8490c = null;

    static {
            m0.u r0 = new m0.u
            r1 = 0
            r2 = 2
            r3 = 1
            r0.<init>(r3, r1, r2)
            m0.u.f8490c = r0
            return
    }

    @Override // m0.j0
    public final void a(h0.s r18, i0.a r19, l0.k r20, b5.i r21, m0.k0 r22) {
            r17 = this;
            r0 = r20
            r1 = 0
            r2 = r18
            int r2 = r2.c(r1)
            int r3 = r0.f7707n
            if (r3 != 0) goto Le
            goto L13
        Le:
            java.lang.String r3 = "Cannot move a group while inserting"
            i0.m.a(r3)
        L13:
            java.lang.String r3 = "Parameter offset is out of bounds"
            if (r2 < 0) goto L18
            goto L1b
        L18:
            i0.m.a(r3)
        L1b:
            if (r2 != 0) goto L1f
            goto L163
        L1f:
            int r4 = r0.f7713t
            int r5 = r0.f7715v
            int r6 = r0.f7714u
            r7 = r4
        L26:
            int[] r8 = r0.f7695b
            if (r2 <= 0) goto L3e
            int r9 = r0.r(r7)
            int r9 = r9 * 5
            int r9 = r9 + 3
            r8 = r8[r9]
            int r7 = r7 + r8
            if (r7 > r6) goto L38
            goto L3b
        L38:
            i0.m.a(r3)
        L3b:
            int r2 = r2 + (-1)
            goto L26
        L3e:
            int r2 = r0.r(r7)
            int r2 = r2 * 5
            int r2 = r2 + 3
            r2 = r8[r2]
            int[] r3 = r0.f7695b
            int r6 = r0.f7713t
            int r6 = r0.r(r6)
            int r3 = r0.g(r3, r6)
            int[] r6 = r0.f7695b
            int r8 = r0.r(r7)
            int r6 = r0.g(r6, r8)
            int[] r8 = r0.f7695b
            int r7 = r7 + r2
            int r9 = r0.r(r7)
            int r8 = r0.g(r8, r9)
            int r9 = r8 - r6
            int r10 = r0.f7713t
            int r10 = r10 + (-1)
            int r10 = java.lang.Math.max(r10, r1)
            r0.x(r9, r10)
            r0.w(r2)
            int[] r10 = r0.f7695b
            int r11 = r0.r(r7)
            int r11 = r11 * 5
            int r12 = r0.r(r4)
            int r12 = r12 * 5
            int r13 = r2 * 5
            int r13 = r13 + r11
            tf.l.p0(r10, r10, r12, r11, r13)
            if (r9 <= 0) goto La0
            java.lang.Object[] r11 = r0.f7696c
            int r12 = r6 + r9
            int r12 = r0.h(r12)
            int r8 = r8 + r9
            int r8 = r0.h(r8)
            int r8 = r8 - r12
            java.lang.System.arraycopy(r11, r12, r11, r3, r8)
        La0:
            int r6 = r6 + r9
            int r3 = r6 - r3
            int r8 = r0.f7704k
            int r11 = r0.f7705l
            java.lang.Object[] r12 = r0.f7696c
            int r12 = r12.length
            int r13 = r0.f7706m
            int r14 = r4 + r2
            r15 = r4
        Laf:
            if (r15 >= r14) goto Le7
            int r1 = r0.r(r15)
            int r16 = r0.g(r10, r1)
            r18 = r3
            int r3 = r16 - r18
            r21 = r1
            if (r13 >= r1) goto Lc3
            r1 = 0
            goto Lc4
        Lc3:
            r1 = r8
        Lc4:
            int r1 = l0.k.i(r3, r1, r11, r12)
            int r3 = r0.f7704k
            r16 = r8
            int r8 = r0.f7705l
            r22 = r10
            java.lang.Object[] r10 = r0.f7696c
            int r10 = r10.length
            int r1 = l0.k.i(r1, r3, r8, r10)
            int r3 = r21 * 5
            int r3 = r3 + 4
            r22[r3] = r1
            int r15 = r15 + 1
            r3 = r18
            r10 = r22
            r8 = r16
            r1 = 0
            goto Laf
        Le7:
            int r1 = r7 + r2
            int r3 = r0.p()
            java.util.ArrayList r8 = r0.f7697d
            int r8 = l0.j.a(r8, r7, r3)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            if (r8 < 0) goto L11e
        Lfa:
            java.util.ArrayList r11 = r0.f7697d
            int r11 = r11.size()
            if (r8 >= r11) goto L11e
            java.util.ArrayList r11 = r0.f7697d
            java.lang.Object r11 = r11.get(r8)
            l0.b r11 = (l0.b) r11
            int r12 = r0.c(r11)
            if (r12 < r7) goto L11e
            if (r12 >= r1) goto L11e
            r10.add(r11)
            java.util.ArrayList r11 = r0.f7697d
            java.lang.Object r11 = r11.remove(r8)
            l0.b r11 = (l0.b) r11
            goto Lfa
        L11e:
            int r1 = r4 - r7
            int r8 = r10.size()
            r11 = 0
        L125:
            if (r11 >= r8) goto L14c
            java.lang.Object r12 = r10.get(r11)
            l0.b r12 = (l0.b) r12
            int r13 = r0.c(r12)
            int r13 = r13 + r1
            int r14 = r0.f7700g
            if (r13 < r14) goto L13c
            int r14 = r3 - r13
            int r14 = -r14
            r12.f7654a = r14
            goto L13e
        L13c:
            r12.f7654a = r13
        L13e:
            java.util.ArrayList r14 = r0.f7697d
            int r13 = l0.j.a(r14, r13, r3)
            java.util.ArrayList r14 = r0.f7697d
            r14.add(r13, r12)
            int r11 = r11 + 1
            goto L125
        L14c:
            boolean r1 = r0.I(r7, r2)
            if (r1 == 0) goto L157
            java.lang.String r1 = "Unexpectedly removed anchors"
            i0.m.a(r1)
        L157:
            int r1 = r0.f7714u
            r0.m(r5, r1, r4)
            if (r9 <= 0) goto L163
            int r7 = r7 + (-1)
            r0.J(r6, r9, r7)
        L163:
            return
    }
}
