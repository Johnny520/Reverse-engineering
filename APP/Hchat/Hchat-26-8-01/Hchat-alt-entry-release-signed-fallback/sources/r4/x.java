package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends r4.z {
    @Override // r4.a0
    public final void a(r4.p r1) {
            r0 = this;
            return
    }

    @Override // r4.a0
    public final r4.b0 b() {
            r1 = this;
            r4.b0 r0 = r4.b0.f11357j
            return r0
    }

    @Override // r4.a0
    public final int c() {
            r1 = this;
            r0 = 112(0x70, float:1.57E-43)
            return r0
    }

    @Override // r4.a0
    public final void d(r4.p r13, z4.d r14) {
            r12 = this;
            r4.k0 r0 = r13.f11479d
            int r0 = r0.b()
            r4.k0 r1 = r13.f11477b
            r4.k0 r2 = r13.f11479d
            int r1 = r1.b()
            int r3 = r2.b()
            r2.f()
            int r2 = r2.f11436i
            int r3 = r3 + r2
            int r3 = r3 - r1
            java.lang.String r2 = "dex\n"
            java.lang.String r4 = "\u0000"
            java.lang.String r5 = "035"
            java.lang.String r2 = eh.a.n(r2, r5, r4)
            boolean r4 = r14.d()
            java.lang.String r5 = "file size not yet known"
            r6 = 305419896(0x12345678, float:5.6904566E-28)
            r7 = 112(0x70, float:1.57E-43)
            r8 = 8
            r9 = 4
            if (r4 == 0) goto L98
            v4.c0 r4 = new v4.c0
            r4.<init>(r2)
            java.lang.String r4 = r4.l()
            java.lang.String r10 = "magic: "
            java.lang.String r4 = r10.concat(r4)
            r14.b(r8, r4)
            java.lang.String r4 = "checksum"
            r14.b(r9, r4)
            r4 = 20
            java.lang.String r10 = "signature"
            r14.b(r4, r10)
            int r4 = r13.f11493r
            if (r4 < 0) goto L94
            java.lang.String r4 = a.a.Y0(r4)
            java.lang.String r10 = "file_size:       "
            java.lang.String r4 = r10.concat(r4)
            r14.b(r9, r4)
            java.lang.String r4 = a.a.Y0(r7)
            java.lang.String r10 = "header_size:     "
            java.lang.String r4 = r10.concat(r4)
            r14.b(r9, r4)
            java.lang.String r4 = a.a.Y0(r6)
            java.lang.String r10 = "endian_tag:      "
            java.lang.String r4 = r10.concat(r4)
            r14.b(r9, r4)
            java.lang.String r4 = "link_size:       0"
            r14.b(r9, r4)
            java.lang.String r4 = "link_off:        0"
            r14.b(r9, r4)
            java.lang.String r4 = a.a.Y0(r0)
            java.lang.String r10 = "map_off:         "
            java.lang.String r4 = r10.concat(r4)
            r14.b(r9, r4)
            goto L98
        L94:
            bsh.j.g(r5)
            return
        L98:
            r4 = 0
            r10 = r4
        L9a:
            if (r10 >= r8) goto La6
            char r11 = r2.charAt(r10)
            r14.j(r11)
            int r10 = r10 + 1
            goto L9a
        La6:
            r2 = 24
            r14.o(r2)
            int r2 = r13.f11493r
            if (r2 < 0) goto L26d
            r14.k(r2)
            r14.k(r7)
            r14.k(r6)
            r14.o(r8)
            r14.k(r0)
            r4.h0 r0 = r13.f11481f
            r0.f()
            java.lang.Object r2 = r0.f11409g
            java.util.TreeMap r2 = (java.util.TreeMap) r2
            int r2 = r2.size()
            if (r2 != 0) goto Lcf
            r0 = r4
            goto Ld3
        Lcf:
            int r0 = r0.b()
        Ld3:
            boolean r5 = r14.d()
            if (r5 == 0) goto Lf3
            java.lang.String r5 = a.a.Y0(r2)
            java.lang.String r6 = "string_ids_size: "
            java.lang.String r5 = r6.concat(r5)
            r14.b(r9, r5)
            java.lang.String r5 = a.a.Y0(r0)
            java.lang.String r6 = "string_ids_off:  "
            java.lang.String r5 = r6.concat(r5)
            r14.b(r9, r5)
        Lf3:
            r14.k(r2)
            r14.k(r0)
            r4.h0 r0 = r13.f11482g
            r0.f()
            java.lang.Object r2 = r0.f11409g
            java.util.TreeMap r2 = (java.util.TreeMap) r2
            int r5 = r2.size()
            if (r5 != 0) goto L10a
            r0 = r4
            goto L10e
        L10a:
            int r0 = r0.b()
        L10e:
            r6 = 65536(0x10000, float:9.1835E-41)
            if (r5 > r6) goto L24c
            boolean r2 = r14.d()
            if (r2 == 0) goto L132
            java.lang.String r2 = a.a.Y0(r5)
            java.lang.String r7 = "type_ids_size:   "
            java.lang.String r2 = r7.concat(r2)
            r14.b(r9, r2)
            java.lang.String r2 = a.a.Y0(r0)
            java.lang.String r7 = "type_ids_off:    "
            java.lang.String r2 = r7.concat(r2)
            r14.b(r9, r2)
        L132:
            r14.k(r5)
            r14.k(r0)
            r4.h0 r0 = r13.f11483h
            r0.f()
            java.lang.Object r2 = r0.f11409g
            java.util.TreeMap r2 = (java.util.TreeMap) r2
            int r2 = r2.size()
            if (r2 != 0) goto L149
            r0 = r4
            goto L14d
        L149:
            int r0 = r0.b()
        L14d:
            if (r2 > r6) goto L246
            boolean r5 = r14.d()
            if (r5 == 0) goto L16f
            java.lang.String r5 = a.a.Y0(r2)
            java.lang.String r6 = "proto_ids_size:  "
            java.lang.String r5 = r6.concat(r5)
            r14.b(r9, r5)
            java.lang.String r5 = a.a.Y0(r0)
            java.lang.String r6 = "proto_ids_off:   "
            java.lang.String r5 = r6.concat(r5)
            r14.b(r9, r5)
        L16f:
            r14.k(r2)
            r14.k(r0)
            r4.w r0 = r13.f11484i
            r0.f()
            java.util.TreeMap r2 = r0.f11514f
            int r2 = r2.size()
            if (r2 != 0) goto L184
            r0 = r4
            goto L188
        L184:
            int r0 = r0.b()
        L188:
            boolean r5 = r14.d()
            if (r5 == 0) goto L1a8
            java.lang.String r5 = a.a.Y0(r2)
            java.lang.String r6 = "field_ids_size:  "
            java.lang.String r5 = r6.concat(r5)
            r14.b(r9, r5)
            java.lang.String r5 = a.a.Y0(r0)
            java.lang.String r6 = "field_ids_off:   "
            java.lang.String r5 = r6.concat(r5)
            r14.b(r9, r5)
        L1a8:
            r14.k(r2)
            r14.k(r0)
            r4.j0 r0 = r13.f11485j
            r0.f()
            java.util.TreeMap r2 = r0.f11423f
            int r2 = r2.size()
            if (r2 != 0) goto L1bd
            r0 = r4
            goto L1c1
        L1bd:
            int r0 = r0.b()
        L1c1:
            boolean r5 = r14.d()
            if (r5 == 0) goto L1e1
            java.lang.String r5 = a.a.Y0(r2)
            java.lang.String r6 = "method_ids_size: "
            java.lang.String r5 = r6.concat(r5)
            r14.b(r9, r5)
            java.lang.String r5 = a.a.Y0(r0)
            java.lang.String r6 = "method_ids_off:  "
            java.lang.String r5 = r6.concat(r5)
            r14.b(r9, r5)
        L1e1:
            r14.k(r2)
            r14.k(r0)
            r4.g r13 = r13.f11486k
            r13.f()
            java.util.TreeMap r0 = r13.f11403g
            int r0 = r0.size()
            if (r0 != 0) goto L1f5
            goto L1f9
        L1f5:
            int r4 = r13.b()
        L1f9:
            boolean r13 = r14.d()
            if (r13 == 0) goto L219
            java.lang.String r13 = a.a.Y0(r0)
            java.lang.String r2 = "class_defs_size: "
            java.lang.String r13 = r2.concat(r13)
            r14.b(r9, r13)
            java.lang.String r13 = a.a.Y0(r4)
            java.lang.String r2 = "class_defs_off:  "
            java.lang.String r13 = r2.concat(r13)
            r14.b(r9, r13)
        L219:
            r14.k(r0)
            r14.k(r4)
            boolean r13 = r14.d()
            if (r13 == 0) goto L23f
            java.lang.String r13 = a.a.Y0(r3)
            java.lang.String r0 = "data_size:       "
            java.lang.String r13 = r0.concat(r13)
            r14.b(r9, r13)
            java.lang.String r13 = a.a.Y0(r1)
            java.lang.String r0 = "data_off:        "
            java.lang.String r13 = r0.concat(r13)
            r14.b(r9, r13)
        L23f:
            r14.k(r3)
            r14.k(r1)
            return
        L246:
            java.lang.String r13 = "too many proto ids"
            j8.o.w(r13)
            return
        L24c:
            e4.b r13 = new e4.b
            java.util.Collection r14 = r2.values()
            int r14 = r14.size()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r14 = new java.lang.Object[]{r14, r0}
            java.lang.String r0 = "Too many type identifiers to fit in one dex file: %1$d; max is %2$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large."
            java.lang.String r14 = java.lang.String.format(r0, r14)
            r0 = 0
            r13.<init>(r14, r0)
            throw r13
        L26d:
            bsh.j.g(r5)
            return
    }
}
