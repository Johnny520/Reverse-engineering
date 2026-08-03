package v;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements f1.r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v.a f13860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v.a f13861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v.a f13862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v.a f13863d;

    public d(v.a r1, v.a r2, v.a r3, v.a r4) {
            r0 = this;
            r0.<init>()
            r0.f13860a = r1
            r0.f13861b = r2
            r0.f13862c = r3
            r0.f13863d = r4
            return
    }

    @Override // f1.r0
    public final f1.c0 a(long r30, u2.m r32, u2.c r33) {
            r29 = this;
            r0 = r29
            r1 = r30
            r3 = r32
            r4 = r33
            v.a r5 = r0.f13860a
            float r5 = r5.a(r1, r4)
            v.a r6 = r0.f13861b
            float r6 = r6.a(r1, r4)
            v.a r7 = r0.f13862c
            float r7 = r7.a(r1, r4)
            v.a r8 = r0.f13863d
            float r4 = r8.a(r1, r4)
            float r8 = e1.e.b(r1)
            float r9 = r5 + r4
            int r10 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r10 <= 0) goto L2e
            float r9 = r8 / r9
            float r5 = r5 * r9
            float r4 = r4 * r9
        L2e:
            float r9 = r6 + r7
            int r10 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r10 <= 0) goto L37
            float r8 = r8 / r9
            float r6 = r6 * r8
            float r7 = r7 * r8
        L37:
            r8 = 0
            int r9 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r9 < 0) goto L49
            int r9 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r9 < 0) goto L49
            int r9 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r9 < 0) goto L49
            int r9 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r9 < 0) goto L49
            goto L77
        L49:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Corner size in Px can't be negative(topStart = "
            r9.<init>(r10)
            r9.append(r5)
            java.lang.String r10 = ", topEnd = "
            r9.append(r10)
            r9.append(r6)
            java.lang.String r10 = ", bottomEnd = "
            r9.append(r10)
            r9.append(r7)
            java.lang.String r10 = ", bottomStart = "
            r9.append(r10)
            r9.append(r4)
            java.lang.String r10 = ")!"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            o.b.a(r9)
        L77:
            float r9 = r5 + r6
            float r9 = r9 + r7
            float r9 = r9 + r4
            int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            r9 = 0
            if (r8 != 0) goto L8b
            f1.k0 r3 = new f1.k0
            e1.c r1 = ac.p.a(r9, r1)
            r3.<init>(r1)
            return r3
        L8b:
            f1.l0 r8 = new f1.l0
            e1.c r1 = ac.p.a(r9, r1)
            u2.m r2 = u2.m.f13354g
            if (r3 != r2) goto L97
            r9 = r5
            goto L98
        L97:
            r9 = r6
        L98:
            int r10 = java.lang.Float.floatToRawIntBits(r9)
            long r10 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r12 = (long) r9
            r9 = 32
            long r10 = r10 << r9
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r12 = r12 & r14
            long r21 = r10 | r12
            if (r3 != r2) goto Lb0
            r5 = r6
        Lb0:
            int r6 = java.lang.Float.floatToRawIntBits(r5)
            long r10 = (long) r6
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            long r5 = (long) r5
            long r10 = r10 << r9
            long r5 = r5 & r14
            long r23 = r10 | r5
            if (r3 != r2) goto Lc2
            r5 = r7
            goto Lc3
        Lc2:
            r5 = r4
        Lc3:
            int r6 = java.lang.Float.floatToRawIntBits(r5)
            long r10 = (long) r6
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            long r5 = (long) r5
            long r10 = r10 << r9
            long r5 = r5 & r14
            long r25 = r10 | r5
            if (r3 != r2) goto Ld4
            goto Ld5
        Ld4:
            r4 = r7
        Ld5:
            int r2 = java.lang.Float.floatToRawIntBits(r4)
            long r2 = (long) r2
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r4 = (long) r4
            long r2 = r2 << r9
            long r4 = r4 & r14
            long r27 = r2 | r4
            e1.d r16 = new e1.d
            float r2 = r1.f2296a
            float r3 = r1.f2297b
            float r4 = r1.f2298c
            float r1 = r1.f2299d
            r20 = r1
            r17 = r2
            r18 = r3
            r19 = r4
            r16.<init>(r17, r18, r19, r20, r21, r23, r25, r27)
            r1 = r16
            r8.<init>(r1)
            return r8
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L37
        L3:
            boolean r0 = r3 instanceof v.d
            if (r0 != 0) goto L8
            goto L35
        L8:
            v.d r3 = (v.d) r3
            v.a r0 = r3.f13860a
            v.a r1 = r2.f13860a
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            goto L35
        L15:
            v.a r0 = r2.f13861b
            v.a r1 = r3.f13861b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L35
        L20:
            v.a r0 = r2.f13862c
            v.a r1 = r3.f13862c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L35
        L2b:
            v.a r0 = r2.f13863d
            v.a r3 = r3.f13863d
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L37
        L35:
            r3 = 0
            return r3
        L37:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            v.a r0 = r2.f13860a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            v.a r1 = r2.f13861b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            v.a r0 = r2.f13862c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            v.a r1 = r2.f13863d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RoundedCornerShape(topStart = "
            r0.<init>(r1)
            v.a r1 = r2.f13860a
            r0.append(r1)
            java.lang.String r1 = ", topEnd = "
            r0.append(r1)
            v.a r1 = r2.f13861b
            r0.append(r1)
            java.lang.String r1 = ", bottomEnd = "
            r0.append(r1)
            v.a r1 = r2.f13862c
            r0.append(r1)
            java.lang.String r1 = ", bottomStart = "
            r0.append(r1)
            v.a r1 = r2.f13863d
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
