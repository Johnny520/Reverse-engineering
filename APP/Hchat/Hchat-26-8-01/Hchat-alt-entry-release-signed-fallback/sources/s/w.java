package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends y0.n implements x1.m {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public s.z f12120u;

    @Override // x1.m
    public final void B(x1.h0 r18) {
            r17 = this;
            r0 = r18
            h1.b r1 = r0.f20932g
            r2 = r17
            s.z r3 = r2.f12120u
            java.util.ArrayList r3 = r3.f12154i
            int r4 = r3.size()
            r5 = 0
        Lf:
            if (r5 >= r4) goto L60
            java.lang.Object r6 = r3.get(r5)
            s.t r6 = (s.t) r6
            i1.b r7 = r6.f12106l
            if (r7 != 0) goto L1c
            goto L50
        L1c:
            long r8 = r6.f12105k
            r6 = 32
            long r10 = r8 >> r6
            int r10 = (int) r10
            float r10 = (float) r10
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r11
            int r8 = (int) r8
            float r8 = (float) r8
            long r13 = r7.f6152t
            r15 = r11
            long r11 = r13 >> r6
            int r6 = (int) r11
            float r6 = (float) r6
            float r10 = r10 - r6
            long r11 = r13 & r15
            int r6 = (int) r11
            float r6 = (float) r6
            float r8 = r8 - r6
            b5.c r6 = r1.f5038h
            java.lang.Object r6 = r6.f469a
            androidx.lifecycle.x r6 = (androidx.lifecycle.x) r6
            r6.c0(r10, r8)
            oh.h.u(r0, r7)     // Catch: java.lang.Throwable -> L53
            b5.c r6 = r1.f5038h
            java.lang.Object r6 = r6.f469a
            androidx.lifecycle.x r6 = (androidx.lifecycle.x) r6
            float r7 = -r10
            float r8 = -r8
            r6.c0(r7, r8)
        L50:
            int r5 = r5 + 1
            goto Lf
        L53:
            r0 = move-exception
            b5.c r1 = r1.f5038h
            java.lang.Object r1 = r1.f469a
            androidx.lifecycle.x r1 = (androidx.lifecycle.x) r1
            float r3 = -r10
            float r4 = -r8
            r1.c0(r3, r4)
            throw r0
        L60:
            r0.e()
            return
    }

    @Override // y0.n
    public final void c1() {
            r1 = this;
            s.z r0 = r1.f12120u
            r0.f12155j = r1
            return
    }

    @Override // y0.n
    public final void d1() {
            r2 = this;
            s.z r0 = r2.f12120u
            r0.d()
            r1 = 0
            r0.f12147b = r1
            r1 = -1
            r0.f12148c = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof s.w
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            s.w r4 = (s.w) r4
            s.z r1 = r3.f12120u
            s.z r4 = r4.f12120u
            boolean r4 = gg.l.a(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            s.z r0 = r1.f12120u
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DisplayingDisappearingItemsNode(animator="
            r0.<init>(r1)
            s.z r1 = r2.f12120u
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
