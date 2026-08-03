package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends r4.l0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public r4.b f11394k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.util.ArrayList f11395l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f11396m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f11397n;

    public static int n(java.util.ArrayList r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            int r0 = r0.size()
            return r0
    }

    @Override // r4.a0
    public final void a(r4.p r7) {
            r6 = this;
            r4.k0 r0 = r7.f11477b
            r4.j0 r1 = r7.f11485j
            r4.b r2 = r6.f11394k
            if (r2 == 0) goto L10
            r4.l0 r2 = r0.l(r2)
            r4.b r2 = (r4.b) r2
            r6.f11394k = r2
        L10:
            java.util.ArrayList r2 = r6.f11395l
            if (r2 == 0) goto L39
            java.util.Iterator r2 = r2.iterator()
        L18:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L39
            java.lang.Object r3 = r2.next()
            r4.u r3 = (r4.u) r3
            r3.getClass()
            r4.w r4 = r7.f11484i
            v4.m r5 = r3.f11510g
            r4.m(r5)
            r4.b r4 = r3.f11511h
            r4.l0 r4 = r0.l(r4)
            r4.b r4 = (r4.b) r4
            r3.f11511h = r4
            goto L18
        L39:
            java.util.ArrayList r7 = r6.f11396m
            if (r7 == 0) goto L60
            java.util.Iterator r7 = r7.iterator()
        L41:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L60
            java.lang.Object r2 = r7.next()
            r4.f0 r2 = (r4.f0) r2
            r2.getClass()
            v4.y r3 = r2.f11400g
            r1.m(r3)
            r4.b r3 = r2.f11401h
            r4.l0 r3 = r0.l(r3)
            r4.b r3 = (r4.b) r3
            r2.f11401h = r3
            goto L41
        L60:
            java.util.ArrayList r7 = r6.f11397n
            if (r7 == 0) goto L82
            java.util.Iterator r7 = r7.iterator()
        L68:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L82
            java.lang.Object r2 = r7.next()
            r4.m0 r2 = (r4.m0) r2
            r2.getClass()
            v4.y r3 = r2.f11448g
            r1.m(r3)
            r4.v0 r2 = r2.f11449h
            r0.k(r2)
            goto L68
        L82:
            return
    }

    @Override // r4.a0
    public final r4.b0 b() {
            r1 = this;
            r4.b0 r0 = r4.b0.C
            return r0
    }

    @Override // r4.l0
    public final int e(r4.l0 r4) {
            r3 = this;
            r4.b r0 = r3.f11394k
            if (r0 == 0) goto L2f
            java.util.ArrayList r1 = r3.f11395l
            if (r1 != 0) goto L2f
            java.util.ArrayList r1 = r3.f11396m
            if (r1 != 0) goto L2f
            java.util.ArrayList r1 = r3.f11397n
            if (r1 != 0) goto L2f
            r4.e r4 = (r4.e) r4
            r4.b r4 = r4.f11394k
            if (r0 != r4) goto L1b
            r0.getClass()
        L19:
            r4 = 0
            return r4
        L1b:
            r4.b0 r1 = r0.b()
            r4.b0 r2 = r4.b()
            if (r1 == r2) goto L2a
            int r4 = r1.compareTo(r2)
            return r4
        L2a:
            int r4 = r0.e(r4)
            return r4
        L2f:
            java.lang.String r4 = "uninternable instance"
            j8.o.w(r4)
            goto L19
    }

    public final int hashCode() {
            r1 = this;
            r4.b r0 = r1.f11394k
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.hashCode()
            return r0
    }

    @Override // r4.l0
    public final void j(r4.k0 r1, int r2) {
            r0 = this;
            java.util.ArrayList r1 = r0.f11395l
            int r1 = n(r1)
            java.util.ArrayList r2 = r0.f11396m
            int r2 = n(r2)
            int r2 = r2 + r1
            java.util.ArrayList r1 = r0.f11397n
            int r1 = n(r1)
            int r1 = r1 + r2
            int r1 = r1 * 8
            int r1 = r1 + 16
            r0.k(r1)
            return
    }

    @Override // r4.l0
    public final java.lang.String l() {
            r2 = this;
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "unsupported"
            r0.<init>(r1)
            throw r0
    }

    @Override // r4.l0
    public final void m(r4.p r13, z4.d r14) {
            r12 = this;
            boolean r0 = r14.d()
            r4.b r1 = r12.f11394k
            r2 = 0
            if (r1 != 0) goto Lb
            r1 = r2
            goto Lf
        Lb:
            int r1 = r1.f()
        Lf:
            java.util.ArrayList r3 = r12.f11395l
            int r3 = n(r3)
            java.util.ArrayList r4 = r12.f11396m
            int r4 = n(r4)
            java.util.ArrayList r5 = r12.f11397n
            int r5 = n(r5)
            r6 = 4
            if (r0 == 0) goto L65
            java.lang.String r7 = r12.g()
            java.lang.String r8 = " annotations directory"
            java.lang.String r7 = r7.concat(r8)
            r14.b(r2, r7)
            java.lang.String r7 = a.a.Y0(r1)
            java.lang.String r8 = "  class_annotations_off: "
            java.lang.String r7 = r8.concat(r7)
            r14.b(r6, r7)
            java.lang.String r7 = a.a.Y0(r3)
            java.lang.String r8 = "  fields_size:           "
            java.lang.String r7 = r8.concat(r7)
            r14.b(r6, r7)
            java.lang.String r7 = a.a.Y0(r4)
            java.lang.String r8 = "  methods_size:          "
            java.lang.String r7 = r8.concat(r7)
            r14.b(r6, r7)
            java.lang.String r7 = a.a.Y0(r5)
            java.lang.String r8 = "  parameters_size:       "
            java.lang.String r7 = r8.concat(r7)
            r14.b(r6, r7)
        L65:
            r14.k(r1)
            r14.k(r3)
            r14.k(r4)
            r14.k(r5)
            java.lang.String r1 = "      annotations_off: "
            java.lang.String r7 = "    "
            if (r3 == 0) goto Ld6
            java.util.ArrayList r3 = r12.f11395l
            java.util.Collections.sort(r3)
            if (r0 == 0) goto L83
            java.lang.String r3 = "  fields:"
            r14.b(r2, r3)
        L83:
            java.util.ArrayList r3 = r12.f11395l
            java.util.Iterator r3 = r3.iterator()
        L89:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto Ld6
            java.lang.Object r8 = r3.next()
            r4.u r8 = (r4.u) r8
            r8.getClass()
            r4.w r9 = r13.f11484i
            v4.m r10 = r8.f11510g
            int r9 = r9.l(r10)
            r4.b r8 = r8.f11511h
            int r8 = r8.f()
            boolean r11 = r14.d()
            if (r11 == 0) goto Lcf
            java.lang.String r10 = r10.a()
            java.lang.String r10 = r7.concat(r10)
            r14.b(r2, r10)
            java.lang.String r10 = a.a.Y0(r9)
            java.lang.String r11 = "      field_idx:       "
            java.lang.String r10 = r11.concat(r10)
            r14.b(r6, r10)
            java.lang.String r10 = a.a.Y0(r8)
            java.lang.String r10 = r1.concat(r10)
            r14.b(r6, r10)
        Lcf:
            r14.k(r9)
            r14.k(r8)
            goto L89
        Ld6:
            java.lang.String r3 = "      method_idx:      "
            if (r4 == 0) goto L137
            java.util.ArrayList r4 = r12.f11396m
            java.util.Collections.sort(r4)
            if (r0 == 0) goto Le6
            java.lang.String r4 = "  methods:"
            r14.b(r2, r4)
        Le6:
            java.util.ArrayList r4 = r12.f11396m
            java.util.Iterator r4 = r4.iterator()
        Lec:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L137
            java.lang.Object r8 = r4.next()
            r4.f0 r8 = (r4.f0) r8
            r8.getClass()
            r4.j0 r9 = r13.f11485j
            v4.y r10 = r8.f11400g
            int r9 = r9.l(r10)
            r4.b r8 = r8.f11401h
            int r8 = r8.f()
            boolean r11 = r14.d()
            if (r11 == 0) goto L130
            java.lang.String r10 = r10.a()
            java.lang.String r10 = r7.concat(r10)
            r14.b(r2, r10)
            java.lang.String r10 = a.a.Y0(r9)
            java.lang.String r10 = r3.concat(r10)
            r14.b(r6, r10)
            java.lang.String r10 = a.a.Y0(r8)
            java.lang.String r10 = r1.concat(r10)
            r14.b(r6, r10)
        L130:
            r14.k(r9)
            r14.k(r8)
            goto Lec
        L137:
            if (r5 == 0) goto L196
            java.util.ArrayList r4 = r12.f11397n
            java.util.Collections.sort(r4)
            if (r0 == 0) goto L145
            java.lang.String r0 = "  parameters:"
            r14.b(r2, r0)
        L145:
            java.util.ArrayList r0 = r12.f11397n
            java.util.Iterator r0 = r0.iterator()
        L14b:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L196
            java.lang.Object r4 = r0.next()
            r4.m0 r4 = (r4.m0) r4
            r4.getClass()
            r4.j0 r5 = r13.f11485j
            v4.y r8 = r4.f11448g
            int r5 = r5.l(r8)
            r4.v0 r4 = r4.f11449h
            int r4 = r4.f()
            boolean r9 = r14.d()
            if (r9 == 0) goto L18f
            java.lang.String r8 = r8.a()
            java.lang.String r8 = r7.concat(r8)
            r14.b(r2, r8)
            java.lang.String r8 = a.a.Y0(r5)
            java.lang.String r8 = r3.concat(r8)
            r14.b(r6, r8)
            java.lang.String r8 = a.a.Y0(r4)
            java.lang.String r8 = r1.concat(r8)
            r14.b(r6, r8)
        L18f:
            r14.k(r5)
            r14.k(r4)
            goto L14b
        L196:
            return
    }
}
