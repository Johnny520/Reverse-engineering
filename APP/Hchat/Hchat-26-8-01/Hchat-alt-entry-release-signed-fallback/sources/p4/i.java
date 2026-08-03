package p4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends z4.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f10117i;

    public i(int r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f10117i = r2
            return
    }

    public final int o() {
            r2 = this;
            java.lang.Object[] r0 = r2.f22543h
            int r0 = r0.length
            if (r0 != 0) goto L7
            r0 = 0
            return r0
        L7:
            int r0 = r0 + (-1)
            java.lang.Object r0 = r2.l(r0)
            p4.h r0 = (p4.h) r0
            int r1 = r0.e()
            int r0 = r0.b()
            int r0 = r0 + r1
            return r0
    }

    public final void p(z4.d r17) {
            r16 = this;
            r1 = r16
            r0 = r17
            int r2 = r0.f22538c
            java.lang.Object[] r3 = r1.f22543h
            int r3 = r3.length
            boolean r4 = r0.d()
            if (r4 == 0) goto Ldd
            boolean r4 = r0.f22539d
            r6 = 0
        L12:
            if (r6 >= r3) goto Ldd
            java.lang.Object r7 = r1.l(r6)
            p4.h r7 = (p4.h) r7
            int r8 = r7.b()
            int r8 = r8 * 2
            java.lang.String r9 = ""
            r10 = 0
            if (r8 != 0) goto L27
            if (r4 == 0) goto Lc0
        L27:
            int r11 = r0.f22542g
            int r12 = r11 * 2
            int r12 = r12 + 8
            int r11 = r11 / 2
            int r11 = r11 + r12
            int r12 = r0.f22541f
            int r12 = r12 - r11
            java.lang.String r11 = r7.g()
            if (r11 != 0) goto L3b
            goto Lc0
        L3b:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r13 = "  "
            r10.<init>(r13)
            java.lang.String r7 = r7.f()
            r10.append(r7)
            java.lang.String r7 = ": "
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            int r10 = r7.length()
            if (r12 != 0) goto L5d
            int r12 = r11.length()
            goto L5e
        L5d:
            int r12 = r12 - r10
        L5e:
            int r13 = r7.length()
            int r14 = r11.length()
            java.io.StringWriter r15 = new java.io.StringWriter
            int r13 = r13 + r14
            int r13 = r13 * 3
            r15.<init>(r13)
            m8.c r13 = new m8.c
            r13.<init>(r15, r10, r12, r9)
            java.lang.Object r10 = r13.f8782e     // Catch: java.io.IOException -> Ld6
            z4.f r10 = (z4.f) r10     // Catch: java.io.IOException -> Ld6
            r10.write(r7)     // Catch: java.io.IOException -> Ld6
            java.lang.Object r7 = r13.f8783f     // Catch: java.io.IOException -> Ld6
            z4.f r7 = (z4.f) r7     // Catch: java.io.IOException -> Ld6
            r7.write(r11)     // Catch: java.io.IOException -> Ld6
            java.lang.Object r7 = r13.f8781d
            java.lang.StringBuffer r7 = (java.lang.StringBuffer) r7
            java.lang.Object r10 = r13.f8780c
            java.lang.StringBuffer r10 = (java.lang.StringBuffer) r10
            java.lang.Object r11 = r13.f8783f
            z4.f r11 = (z4.f) r11
            java.lang.Object r12 = r13.f8782e
            z4.f r12 = (z4.f) r12
            m8.c.a(r10, r12)     // Catch: java.io.IOException -> Lcf
            m8.c.a(r7, r11)     // Catch: java.io.IOException -> Lcf
            r13.i()     // Catch: java.io.IOException -> Lcf
            m8.c.a(r10, r12)     // Catch: java.io.IOException -> Lcf
        L9d:
            int r14 = r10.length()     // Catch: java.io.IOException -> Lcf
            r5 = 10
            if (r14 == 0) goto Lac
            r11.write(r5)     // Catch: java.io.IOException -> Lcf
            r13.i()     // Catch: java.io.IOException -> Lcf
            goto L9d
        Lac:
            m8.c.a(r7, r11)     // Catch: java.io.IOException -> Lcf
        Laf:
            int r10 = r7.length()     // Catch: java.io.IOException -> Lcf
            if (r10 == 0) goto Lbc
            r12.write(r5)     // Catch: java.io.IOException -> Lcf
            r13.i()     // Catch: java.io.IOException -> Lcf
            goto Laf
        Lbc:
            java.lang.String r10 = r15.toString()
        Lc0:
            if (r10 == 0) goto Lc6
            r0.b(r8, r10)
            goto Lcb
        Lc6:
            if (r8 == 0) goto Lcb
            r0.b(r8, r9)
        Lcb:
            int r6 = r6 + 1
            goto L12
        Lcf:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            throw r2
        Ld6:
            r0 = move-exception
            java.lang.String r2 = "shouldn't happen"
            ah.a.p(r2, r0)
            return
        Ldd:
            r5 = 0
        Lde:
            if (r5 >= r3) goto L100
            java.lang.Object r4 = r1.l(r5)
            p4.h r4 = (p4.h) r4
            r4.l(r0)     // Catch: java.lang.RuntimeException -> Lec
            int r5 = r5 + 1
            goto Lde
        Lec:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "...while writing "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            f4.a r0 = f4.a.b(r2, r0)
            throw r0
        L100:
            int r0 = r0.f22538c
            int r0 = r0 - r2
            int r0 = r0 / 2
            int r2 = r1.o()
            if (r0 != r2) goto L10c
            return
        L10c:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            int r3 = r1.o()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "write length mismatch; expected "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = " but actually wrote "
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.<init>(r0)
            throw r2
    }
}
