package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements p.g, p.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final okio.a f9907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9908d;

    public h(float r1, boolean r2, okio.a r3) {
            r0 = this;
            r0.<init>()
            r0.f9905a = r1
            r0.f9906b = r2
            r0.f9907c = r3
            r0.f9908d = r1
            return
    }

    @Override // p.g, p.i
    public final float a() {
            r1 = this;
            float r0 = r1.f9908d
            return r0
    }

    @Override // p.g
    public final void b(v1.p0 r10, int r11, int[] r12, u2.m r13, int[] r14) {
            r9 = this;
            int r0 = r12.length
            if (r0 != 0) goto L5
            goto L9e
        L5:
            float r0 = r9.f9905a
            int r10 = r10.G0(r0)
            boolean r0 = r9.f9906b
            r1 = 0
            if (r0 == 0) goto L16
            u2.m r0 = u2.m.f13355h
            if (r13 != r0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = r1
        L17:
            if (r0 == 0) goto L37
            int r2 = r12.length
            r3 = r1
            r4 = r3
            r5 = r4
        L1d:
            if (r3 >= r2) goto L35
            r4 = r12[r3]
            int r6 = r5 + 1
            int r11 = r11 - r4
            int r11 = java.lang.Math.max(r1, r11)
            r14[r5] = r11
            int r4 = java.lang.Math.min(r10, r11)
            r11 = r14[r5]
            int r11 = r11 - r4
            int r3 = r3 + 1
            r5 = r6
            goto L1d
        L35:
            int r11 = r11 + r4
            goto L5f
        L37:
            int r2 = r12.length
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
        L3c:
            if (r3 >= r2) goto L5d
            r5 = r12[r3]
            int r7 = r6 + 1
            int r8 = r11 - r5
            int r4 = java.lang.Math.min(r4, r8)
            r14[r6] = r4
            int r4 = r11 - r4
            int r4 = r4 - r5
            int r4 = java.lang.Math.min(r10, r4)
            r6 = r14[r6]
            int r6 = r6 + r5
            int r5 = r6 + r4
            int r3 = r3 + 1
            r6 = r5
            r5 = r4
            r4 = r6
            r6 = r7
            goto L3c
        L5d:
            int r4 = r4 - r5
            int r11 = r11 - r4
        L5f:
            if (r11 <= 0) goto L9e
            okio.a r10 = r9.f9907c
            int r10 = r10.f9858g
            switch(r10) {
                case 3: goto L7f;
                default: goto L68;
            }
        L68:
            float r10 = (float) r11
            r12 = 1073741824(0x40000000, float:2.0)
            float r10 = r10 / r12
            u2.m r12 = u2.m.f13354g
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r13 != r12) goto L73
            goto L76
        L73:
            r12 = -1
            float r12 = (float) r12
            float r2 = r2 * r12
        L76:
            r12 = 1
            float r12 = (float) r12
            float r12 = r12 + r2
            float r12 = r12 * r10
            int r10 = java.lang.Math.round(r12)
            goto L8e
        L7f:
            int r10 = r11 + 0
            float r10 = (float) r10
            r12 = 1073741824(0x40000000, float:2.0)
            float r10 = r10 / r12
            r12 = 1
            float r12 = (float) r12
            r13 = 0
            float r12 = r12 + r13
            float r12 = r12 * r10
            int r10 = java.lang.Math.round(r12)
        L8e:
            if (r0 == 0) goto L91
            int r10 = r10 - r11
        L91:
            if (r10 == 0) goto L9e
            int r11 = r14.length
        L94:
            if (r1 >= r11) goto L9e
            r12 = r14[r1]
            int r12 = r12 + r10
            r14[r1] = r12
            int r1 = r1 + 1
            goto L94
        L9e:
            return
    }

    @Override // p.i
    public final void c(int r7, v1.p0 r8, int[] r9, int[] r10) {
            r6 = this;
            u2.m r4 = u2.m.f13354g
            r0 = r6
            r2 = r7
            r1 = r8
            r3 = r9
            r5 = r10
            r0.b(r1, r2, r3, r4, r5)
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof p.h
            if (r0 != 0) goto L8
            goto L26
        L8:
            p.h r3 = (p.h) r3
            float r0 = r2.f9905a
            float r1 = r3.f9905a
            boolean r0 = u2.f.b(r0, r1)
            if (r0 != 0) goto L15
            goto L26
        L15:
            boolean r0 = r2.f9906b
            boolean r1 = r3.f9906b
            if (r0 == r1) goto L1c
            goto L26
        L1c:
            okio.a r0 = r2.f9907c
            okio.a r3 = r3.f9907c
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L28
        L26:
            r3 = 0
            return r3
        L28:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.f9905a
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.f9906b
            int r0 = eh.a.h(r0, r1, r2)
            okio.a r1 = r3.f9907c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r2.f9906b
            if (r1 == 0) goto Lc
            java.lang.String r1 = ""
            goto Le
        Lc:
            java.lang.String r1 = "Absolute"
        Le:
            r0.append(r1)
            java.lang.String r1 = "Arrangement#spacedAligned("
            r0.append(r1)
            float r1 = r2.f9905a
            java.lang.String r1 = u2.f.c(r1)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            okio.a r1 = r2.f9907c
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
