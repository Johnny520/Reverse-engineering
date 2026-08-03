package i4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements l4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4.b f6467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k4.b f6468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h4.c f6469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i4.p f6470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i4.r f6471e;

    public m(l4.b r9, k4.b r10) {
            r8 = this;
            r8.<init>()
            r8.f6467a = r9
            r8.f6468b = r10
            h4.u r9 = r9.getAttributes()
            java.lang.String r10 = "Code"
            h4.s r9 = r9.o(r10)
            h4.c r9 = (h4.c) r9
            r8.f6469c = r9
            h4.u r9 = r9.f5078f
            i4.p r10 = i4.p.f6478i
            java.lang.String r0 = "LineNumberTable"
            h4.s r0 = r9.o(r0)
            h4.i r0 = (h4.i) r0
        L21:
            if (r0 == 0) goto L84
            i4.p r1 = r0.f5085b
            i4.p r2 = i4.p.f6478i
            if (r10 != r2) goto L2b
            r10 = r1
            goto L59
        L2b:
            java.lang.Object[] r2 = r10.f22543h
            int r2 = r2.length
            java.lang.Object[] r3 = r1.f22543h
            int r3 = r3.length
            i4.p r4 = new i4.p
            int r5 = r2 + r3
            r4.<init>(r5)
            r5 = 0
            r6 = r5
        L3a:
            if (r6 >= r2) goto L48
            java.lang.Object r7 = r10.l(r6)
            i4.o r7 = (i4.o) r7
            r4.m(r6, r7)
            int r6 = r6 + 1
            goto L3a
        L48:
            if (r5 >= r3) goto L58
            int r10 = r2 + r5
            java.lang.Object r6 = r1.l(r5)
            i4.o r6 = (i4.o) r6
            r4.m(r10, r6)
            int r5 = r5 + 1
            goto L48
        L58:
            r10 = r4
        L59:
            java.lang.Object[] r1 = r9.f22543h
            int r1 = r1.length
            r2 = 0
        L5d:
            if (r2 >= r1) goto L7f
            java.lang.Object r3 = r9.l(r2)
            h4.s r3 = (h4.s) r3
            if (r3 != r0) goto L7c
            java.lang.String r0 = r0.f5093a
        L69:
            int r2 = r2 + 1
            if (r2 >= r1) goto L7f
            java.lang.Object r3 = r9.l(r2)
            h4.s r3 = (h4.s) r3
            java.lang.String r4 = r3.f5093a
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L69
            goto L80
        L7c:
            int r2 = r2 + 1
            goto L5d
        L7f:
            r3 = 0
        L80:
            r0 = r3
            h4.i r0 = (h4.i) r0
            goto L21
        L84:
            r8.f6470d = r10
            i4.r r9 = i4.r.f6485i
            r8.f6471e = r9
            return
    }

    @Override // l4.b
    public final w4.a a() {
            r1 = this;
            l4.b r0 = r1.f6467a
            w4.a r0 = r0.a()
            return r0
    }

    @Override // l4.a
    public final v4.d0 b() {
            r1 = this;
            l4.b r0 = r1.f6467a
            v4.d0 r0 = r0.b()
            return r0
    }

    @Override // l4.a
    public final int c() {
            r1 = this;
            l4.b r0 = r1.f6467a
            int r0 = r0.c()
            return r0
    }

    @Override // l4.a
    public final v4.z d() {
            r1 = this;
            l4.b r0 = r1.f6467a
            v4.z r0 = r0.d()
            return r0
    }

    @Override // l4.a
    public final v4.c0 e() {
            r1 = this;
            l4.b r0 = r1.f6467a
            v4.c0 r0 = r0.e()
            return r0
    }

    public final u4.t f(int r10) {
            r9 = this;
            u4.t r0 = new u4.t
            k4.b r1 = r9.f6468b
            r1.c()
            h4.u r1 = r1.f7157k
            java.lang.String r2 = "SourceFile"
            h4.s r1 = r1.o(r2)
            boolean r2 = r1 instanceof h4.q
            if (r2 == 0) goto L18
            h4.q r1 = (h4.q) r1
            v4.c0 r1 = r1.f5089b
            goto L19
        L18:
            r1 = 0
        L19:
            i4.p r2 = r9.f6470d
            java.lang.Object[] r3 = r2.f22543h
            int r3 = r3.length
            r4 = -1
            r5 = 0
            r6 = r5
            r5 = r4
        L22:
            if (r6 >= r3) goto L39
            java.lang.Object r7 = r2.l(r6)
            i4.o r7 = (i4.o) r7
            int r8 = r7.f6476a
            if (r8 > r10) goto L36
            if (r8 <= r4) goto L36
            int r5 = r7.f6477b
            if (r8 != r10) goto L35
            goto L39
        L35:
            r4 = r8
        L36:
            int r6 = r6 + 1
            goto L22
        L39:
            r0.<init>(r1, r10, r5)
            return r0
    }

    @Override // l4.a
    public final h4.u getAttributes() {
            r1 = this;
            l4.b r0 = r1.f6467a
            h4.u r0 = r0.getAttributes()
            return r0
    }

    @Override // l4.a
    public final v4.c0 getName() {
            r1 = this;
            l4.b r0 = r1.f6467a
            v4.c0 r0 = r0.getName()
            return r0
    }
}
