package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements v1.k1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u2.m f13917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f13918h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f13919i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v1.j0 f13920j;

    public d0(v1.j0 r1) {
            r0 = this;
            r0.<init>()
            r0.f13920j = r1
            u2.m r1 = u2.m.f13355h
            r0.f13917g = r1
            return
    }

    @Override // v1.p0
    public final v1.o0 D0(int r10, int r11, java.util.Map r12, fg.l r13, fg.l r14) {
            r9 = this;
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r10 & r0
            if (r1 != 0) goto La
            r0 = r0 & r11
            if (r0 != 0) goto La
            goto L28
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Size("
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r1 = " x "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = ") is out of range. Each dimension must be between 0 and 16777215."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            u1.a.b(r0)
        L28:
            v1.c0 r1 = new v1.c0
            v1.j0 r7 = r9.f13920j
            r6 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
    }

    @Override // v1.k1
    public final java.util.List N(fg.p r12, java.lang.Object r13) {
            r11 = this;
            v1.j0 r0 = r11.f13920j
            r0.h()
            x1.f0 r1 = r0.f13955g
            x1.j0 r2 = r1.M
            x1.b0 r2 = r2.f20954d
            x1.b0 r3 = x1.b0.f20835i
            x1.b0 r4 = x1.b0.f20833g
            if (r2 == r4) goto L21
            if (r2 == r3) goto L21
            x1.b0 r5 = x1.b0.f20834h
            if (r2 == r5) goto L21
            x1.b0 r5 = x1.b0.f20836j
            if (r2 != r5) goto L1c
            goto L21
        L1c:
            java.lang.String r5 = "subcompose can only be used inside the measure or layout blocks"
            u1.a.b(r5)
        L21:
            f.k0 r5 = r0.f13961m
            java.lang.Object r6 = r5.g(r13)
            r7 = 0
            r8 = 1
            if (r6 != 0) goto L67
            f.k0 r6 = r0.f13964p
            java.lang.Object r6 = r6.k(r13)
            x1.f0 r6 = (x1.f0) r6
            if (r6 == 0) goto L4e
            f.k0 r9 = r0.f13960l
            java.lang.Object r9 = r9.g(r6)
            v1.b0 r9 = (v1.b0) r9
            int r9 = r0.f13969u
            if (r9 <= 0) goto L42
            goto L47
        L42:
            java.lang.String r9 = "Check failed."
            u1.a.b(r9)
        L47:
            int r9 = r0.f13969u
            int r9 = r9 + (-1)
            r0.f13969u = r9
            goto L64
        L4e:
            x1.f0 r6 = r0.n(r13)
            if (r6 != 0) goto L64
            int r6 = r0.f13958j
            x1.f0 r9 = new x1.f0
            r10 = 2
            r9.<init>(r10)
            r1.f20905w = r8
            r1.A(r6, r9)
            r1.f20905w = r7
            r6 = r9
        L64:
            r5.m(r13, r6)
        L67:
            x1.f0 r6 = (x1.f0) r6
            java.util.List r5 = r1.o()
            int r9 = r0.f13958j
            java.lang.Object r5 = tf.m.w1(r9, r5)
            if (r5 == r6) goto La5
            java.util.List r1 = r1.o()
            f.d0 r1 = (f.d0) r1
            java.lang.Object r1 = r1.f2789h
            j0.b r1 = (j0.b) r1
            int r1 = r1.i(r6)
            int r5 = r0.f13958j
            if (r1 < r5) goto L88
            goto L9e
        L88:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r9 = "Key \""
            r5.<init>(r9)
            r5.append(r13)
            java.lang.String r9 = "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item."
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            u1.a.a(r5)
        L9e:
            int r5 = r0.f13958j
            if (r5 == r1) goto La5
            r0.j(r1, r5)
        La5:
            int r1 = r0.f13958j
            int r1 = r1 + r8
            r0.f13958j = r1
            r0.m(r6, r13, r7, r12)
            if (r2 == r4) goto Lb7
            if (r2 != r3) goto Lb2
            goto Lb7
        Lb2:
            java.util.List r12 = r6.l()
            return r12
        Lb7:
            java.util.List r12 = r6.m()
            return r12
    }

    @Override // u2.c
    public final float d() {
            r1 = this;
            float r0 = r1.f13918h
            return r0
    }

    @Override // v1.o
    public final u2.m getLayoutDirection() {
            r1 = this;
            u2.m r0 = r1.f13917g
            return r0
    }

    @Override // u2.c
    public final float q0() {
            r1 = this;
            float r0 = r1.f13919i
            return r0
    }

    @Override // v1.o
    public final boolean u0() {
            r2 = this;
            v1.j0 r0 = r2.f13920j
            x1.f0 r0 = r0.f13955g
            x1.j0 r0 = r0.M
            x1.b0 r0 = r0.f20954d
            x1.b0 r1 = x1.b0.f20836j
            if (r0 == r1) goto L13
            x1.b0 r1 = x1.b0.f20834h
            if (r0 != r1) goto L11
            goto L13
        L11:
            r0 = 0
            return r0
        L13:
            r0 = 1
            return r0
    }
}
