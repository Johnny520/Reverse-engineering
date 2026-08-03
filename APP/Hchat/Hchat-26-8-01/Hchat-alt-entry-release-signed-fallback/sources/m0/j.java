package m0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends m0.j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m0.j f8467c = null;

    static {
            m0.j r0 = new m0.j
            r1 = 2
            r2 = 1
            r3 = 0
            r0.<init>(r3, r1, r2)
            m0.j.f8467c = r0
            return
    }

    @Override // m0.j0
    public final void a(h0.s r8, i0.a r9, l0.k r10, b5.i r11, m0.k0 r12) {
            r7 = this;
            r11 = 0
            java.lang.Object r12 = r8.d(r11)
            s0.e r12 = (s0.e) r12
            r0 = 1
            java.lang.Object r8 = r8.d(r0)
            l0.b r8 = (l0.b) r8
            int r8 = r10.c(r8)
            int r1 = r10.f7713t
            java.lang.String r2 = "Check failed"
            if (r1 >= r8) goto L19
            goto L1c
        L19:
            i0.m.a(r2)
        L1c:
            be.h.P(r10, r9, r8)
            int r1 = r10.f7713t
            int r3 = r10.f7715v
        L23:
            if (r3 < 0) goto L32
            boolean r4 = r10.y(r3)
            if (r4 != 0) goto L32
            int[] r4 = r10.f7695b
            int r3 = r10.E(r4, r3)
            goto L23
        L32:
            int r3 = r3 + r0
            r4 = r11
        L34:
            if (r3 >= r1) goto L65
            boolean r5 = r10.v(r1, r3)
            if (r5 == 0) goto L46
            boolean r5 = r10.y(r3)
            if (r5 == 0) goto L43
            r4 = r11
        L43:
            int r3 = r3 + 1
            goto L34
        L46:
            boolean r5 = r10.y(r3)
            if (r5 == 0) goto L4e
            r5 = r0
            goto L5e
        L4e:
            int[] r5 = r10.f7695b
            int r6 = r10.r(r3)
            int r6 = r6 * 5
            int r6 = r6 + 1
            r5 = r5[r6]
            r6 = 67108863(0x3ffffff, float:1.5046327E-36)
            r5 = r5 & r6
        L5e:
            int r4 = r4 + r5
            int r5 = r10.u(r3)
            int r3 = r3 + r5
            goto L34
        L65:
            int r1 = r10.f7713t
            if (r1 >= r8) goto L99
            boolean r1 = r10.v(r8, r1)
            if (r1 == 0) goto L93
            int r1 = r10.f7713t
            int r3 = r10.f7714u
            if (r1 >= r3) goto L8f
            int[] r3 = r10.f7695b
            int r1 = r10.r(r1)
            int r1 = r1 * 5
            int r1 = r1 + r0
            r1 = r3[r1]
            r3 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r3
            if (r1 == 0) goto L8f
            int r1 = r10.f7713t
            java.lang.Object r1 = r10.D(r1)
            r9.d(r1)
            r4 = r11
        L8f:
            r10.P()
            goto L65
        L93:
            int r1 = r10.L()
            int r4 = r4 + r1
            goto L65
        L99:
            if (r1 != r8) goto L9c
            goto L9f
        L9c:
            i0.m.a(r2)
        L9f:
            r12.f12186a = r4
            return
    }
}
