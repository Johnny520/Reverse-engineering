package d7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends d7.g {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public java.lang.String f2037t;

    public d() {
            r3 = this;
            c7.g r0 = c7.g.f1043h
            r1 = 8
            r2 = 46
            r3.<init>(r2, r0, r1)
            r0 = 33188(0x81a4, float:4.6506E-41)
            r1 = 40
            r3.R(r1, r0)
            return
    }

    @Override // d7.g
    public final int W() {
            r1 = this;
            r0 = 32
            int r0 = r1.O(r0)
            return r0
    }

    @Override // d7.g
    public final int f0() {
            r1 = this;
            r0 = 12
            return r0
    }

    @Override // d7.g
    public final boolean h0() {
            r2 = this;
            r0 = 42
            byte[] r1 = r2.f11553k
            int r0 = k7.a.s(r1, r0)
            r1 = -1
            if (r0 != r1) goto Ld
            r0 = 1
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // d7.g
    public final void j0() {
            r7 = this;
            java.lang.String r0 = r7.f2037t
            if (r0 == 0) goto L37
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r1 = r0.getBytes(r1)
            int r2 = r1.length
            int r3 = r7.b0()
            int r4 = r7.f2039o
            int r3 = r3 + r4
            int r5 = r7.Z()
            int r5 = r5 + r3
            int r5 = r5 + r2
            r3 = 0
            r7.M(r5, r3)
            r5 = 32
            r7.R(r5, r2)
            if (r2 != 0) goto L26
            r7.f2037t = r0
            return
        L26:
            byte[] r5 = r7.f11553k
            int r6 = r7.b0()
            int r6 = r6 + r4
            int r4 = r7.Z()
            int r4 = r4 + r6
            java.lang.System.arraycopy(r1, r3, r5, r4, r2)
            r7.f2037t = r0
        L37:
            return
    }

    @Override // d7.g
    public final int k0(java.io.InputStream r7) {
            r6 = this;
            r0 = 32
            int r1 = r6.O(r0)
            r2 = 0
            if (r1 != 0) goto Le
            java.lang.String r7 = ""
            r6.f2037t = r7
            return r2
        Le:
            int r3 = r6.b0()
            int r4 = r6.f2039o
            int r3 = r3 + r4
            int r5 = r6.Z()
            int r5 = r5 + r3
            int r5 = r5 + r1
            r6.M(r5, r2)
            r6.R(r0, r1)
            byte[] r0 = r6.f11553k
            int r2 = r6.b0()
            int r2 = r2 + r4
            int r3 = r6.Z()
            int r3 = r3 + r2
            int r7 = r7.read(r0, r3, r1)
            if (r7 != r1) goto L37
            r7 = 0
            r6.f2037t = r7
            return r1
        L37:
            java.lang.String r0 = "Stream ended before reading comment: read="
            java.lang.String r2 = ", name length="
            java.lang.String r7 = p.a.j(r7, r0, r2, r1)
            j8.o.y(r7)
            r7 = 0
            return r7
    }

    public final java.lang.String n0() {
            r5 = this;
            java.lang.String r0 = r5.f2037t
            if (r0 != 0) goto L25
            int r0 = r5.Z()
            byte[] r1 = r5.f11553k
            int r2 = r5.f2039o
            int r3 = r5.b0()
            int r3 = r3 + r2
            int r2 = r1.length
            int r2 = r2 - r3
            if (r2 > 0) goto L18
            java.lang.String r0 = ""
            goto L23
        L18:
            if (r0 <= r2) goto L1b
            r0 = r2
        L1b:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            r2.<init>(r1, r3, r0, r4)
            r0 = r2
        L23:
            r5.f2037t = r0
        L25:
            java.lang.String r0 = r5.f2037t
            return r0
    }

    @Override // d7.g
    public final java.lang.String toString() {
            r6 = this;
            int r0 = r6.p()
            int r1 = r6.f2071n
            if (r0 >= r1) goto Lb
            java.lang.String r0 = "Invalid"
            return r0
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            long r1 = r6.f2043s
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r1 = r6.a0()
            int r2 = r1.length()
            r3 = 1
            if (r2 <= 0) goto L31
            java.lang.String r2 = "name="
            r0.append(r2)
            r0.append(r1)
            r1 = r3
            goto L32
        L31:
            r1 = 0
        L32:
            java.lang.String r2 = r6.n0()
            int r4 = r2.length()
            java.lang.String r5 = ", "
            if (r4 <= 0) goto L4c
            if (r1 == 0) goto L43
            r0.append(r5)
        L43:
            java.lang.String r1 = "comment="
            r0.append(r1)
            r0.append(r2)
            r1 = r3
        L4c:
            if (r1 == 0) goto L51
            r0.append(r5)
        L51:
            java.lang.String r1 = "SIG="
            r0.append(r1)
            c7.g r1 = r6.T()
            r0.append(r1)
            java.lang.String r1 = ", versionMadeBy="
            r0.append(r1)
            r1 = 4
            int r2 = r6.O(r1)
            short r2 = (short) r2
            java.lang.String r2 = y7.a.o(r2)
            r0.append(r2)
            java.lang.String r2 = ", versionExtract="
            r0.append(r2)
            r2 = 6
            int r2 = r6.O(r2)
            short r2 = (short) r2
            java.lang.String r2 = y7.a.o(r2)
            r0.append(r2)
            java.lang.String r2 = ", GP={"
            r0.append(r2)
            a5.a r2 = r6.f2041q
            r0.append(r2)
            java.lang.String r2 = "}, method="
            r0.append(r2)
            int r2 = r6.c0()
            r0.append(r2)
            java.lang.String r2 = ", date="
            r0.append(r2)
            int r2 = r6.f2040p
            int r2 = r2 + r1
            long r4 = r6.N(r2)
            java.lang.String r2 = y7.a.l(r3, r4)
            r0.append(r2)
            java.lang.String r2 = ", crc="
            r0.append(r2)
            long r2 = r6.Y()
            r4 = 8
            java.lang.String r2 = y7.a.l(r4, r2)
            r0.append(r2)
            java.lang.String r2 = ", cSize="
            r0.append(r2)
            long r2 = r6.X()
            r0.append(r2)
            java.lang.String r2 = ", size="
            r0.append(r2)
            long r2 = r6.e0()
            r0.append(r2)
            java.lang.String r2 = ", fileNameLength="
            r0.append(r2)
            int r2 = r6.b0()
            r0.append(r2)
            java.lang.String r2 = ", extraLength="
            r0.append(r2)
            int r2 = r6.Z()
            r0.append(r2)
            java.lang.String r2 = ", commentLength="
            r0.append(r2)
            r2 = 32
            int r2 = r6.O(r2)
            r0.append(r2)
            java.lang.String r2 = ", offset="
            r0.append(r2)
            boolean r2 = r6.g0()
            if (r2 == 0) goto L114
            int r2 = r6.f2039o
            int r3 = r6.b0()
            int r3 = r3 + r2
            int r3 = r3 + r1
            byte[] r1 = r6.f11553k
            long r1 = k7.a.t(r1, r3)
            goto L11a
        L114:
            r1 = 42
            long r1 = r6.N(r1)
        L11a:
            r0.append(r1)
            java.lang.String r1 = ", internalAttr="
            r0.append(r1)
            r1 = 36
            int r1 = r6.O(r1)
            r0.append(r1)
            java.lang.String r1 = ", externalAttr="
            r0.append(r1)
            byte[] r1 = r6.f11553k
            r2 = 38
            int r1 = k7.a.s(r1, r2)
            java.lang.String r1 = y7.a.k(r1, r4)
            r0.append(r1)
            java.lang.String r1 = ", attrId="
            r0.append(r1)
            int r1 = r6.O(r2)
            r0.append(r1)
            java.lang.String r1 = ", permissions="
            r0.append(r1)
            d7.c r1 = new d7.c
            r1.<init>(r6)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
