package s7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends o7.c {
    public static z7.c l0(s7.b r5) {
            z7.c r0 = r5.f9563k
            int r0 = r0.size()
            z7.c r1 = new z7.c
            r1.<init>(r0)
            r2 = 0
        Lc:
            if (r2 >= r0) goto L28
            k7.a r3 = r5.Q(r2)
            v7.d r3 = (v7.d) r3
            boolean r4 = r3.y()
            if (r4 != 0) goto L25
            int r3 = r3.L()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.add(r3)
        L25:
            int r2 = r2 + 1
            goto Lc
        L28:
            return r1
    }

    public final void k0(s7.b r7, k7.f r8) {
            r6 = this;
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto La
            r6.b0(r8)
            return
        La:
            o7.c r0 = r7.f12372n
            r1 = r0
            s7.c r1 = (s7.c) r1
            k7.f r1 = r1.f9564l
            okio.a r2 = r7.k.f11567p
            r3 = 0
            if (r1 != r2) goto L3e
            s7.c r0 = (s7.c) r0
            z7.c r1 = r0.f9563k
            int r1 = r1.size()
            r2 = 2
            if (r1 >= r2) goto L22
            goto L3e
        L22:
            z7.c r1 = r0.f9563k
            r1.getClass()
            if (r7 == r1) goto L38
            s7.a r2 = new s7.a
            r2.<init>(r7)
            boolean r1 = r1.k(r2)
            if (r1 == 0) goto L3e
            r0.h0(r3)
            goto L3e
        L38:
            java.lang.String r7 = "swappable == this"
            j8.o.t(r7)
            return
        L3e:
            z7.c r0 = l0(r7)
            int r1 = r0.f22586i
            int r2 = r1 + (-1)
            java.lang.Object[] r4 = r0.f22584g
            r2 = r4[r2]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r6.N()
            r6.b0(r8)
            r8 = r3
            r4 = r8
        L58:
            if (r8 >= r1) goto L70
            java.lang.Object[] r5 = r0.f22584g
            r5 = r5[r8]
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
        L64:
            int r4 = r4 + 1
            if (r4 >= r5) goto L6c
            r7.O(r4)
            goto L64
        L6c:
            int r8 = r8 + 1
            r4 = r5
            goto L58
        L70:
            int r2 = r2 + 1
            r7.d0(r2, r3)
            z7.c r7 = r7.f9563k
            int r7 = r7.size()
            r6.c0(r7)
            return
    }
}
