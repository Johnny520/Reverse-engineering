package v4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends v4.f0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f14127i = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f14128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v4.a f14129h;

    static {
            java.lang.String r7 = "invoke-direct"
            java.lang.String r8 = "invoke-interface"
            java.lang.String r0 = "static-put"
            java.lang.String r1 = "static-get"
            java.lang.String r2 = "instance-put"
            java.lang.String r3 = "instance-get"
            java.lang.String r4 = "invoke-static"
            java.lang.String r5 = "invoke-instance"
            java.lang.String r6 = "invoke-constructor"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
            v4.x.f14127i = r0
            return
    }

    public x(int r1, v4.a r2) {
            r0 = this;
            r0.<init>()
            r0.f14128g = r1
            r0.f14129h = r2
            return
    }

    public static boolean k(int r2) {
            r0 = 1
            if (r2 == 0) goto Ld
            if (r2 == r0) goto Ld
            r1 = 2
            if (r2 == r1) goto Ld
            r1 = 3
            if (r2 == r1) goto Ld
            r2 = 0
            return r2
        Ld:
            return r0
    }

    public static v4.x l(int r2, v4.a r3) {
            boolean r0 = k(r2)
            java.lang.String r1 = "ref has wrong type: "
            if (r0 == 0) goto L16
            boolean r0 = r3 instanceof v4.m
            if (r0 == 0) goto Ld
            goto L27
        Ld:
            java.lang.Class r2 = r3.getClass()
            j8.o.x(r2, r1)
        L14:
            r2 = 0
            return r2
        L16:
            switch(r2) {
                case 4: goto L23;
                case 5: goto L23;
                case 6: goto L23;
                case 7: goto L23;
                case 8: goto L23;
                default: goto L19;
            }
        L19:
            java.lang.String r3 = "type is out of range: "
            java.lang.String r2 = eh.a.l(r2, r3)
            j8.o.t(r2)
            goto L14
        L23:
            boolean r0 = r3 instanceof v4.e
            if (r0 == 0) goto L2d
        L27:
            v4.x r0 = new v4.x
            r0.<init>(r2, r3)
            return r0
        L2d:
            java.lang.Class r2 = r3.getClass()
            j8.o.x(r2, r1)
            goto L14
    }

    @Override // z4.k
    public final java.lang.String a() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r3.f14128g
            java.lang.String[] r2 = v4.x.f14127i
            r1 = r2[r1]
            r0.append(r1)
            java.lang.String r1 = ","
            r0.append(r1)
            v4.a r1 = r3.f14129h
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // v4.a
    public final int e(v4.a r3) {
            r2 = this;
            v4.x r3 = (v4.x) r3
            int r0 = r3.f14128g
            int r1 = r2.f14128g
            if (r1 != r0) goto L11
            v4.a r0 = r2.f14129h
            v4.a r3 = r3.f14129h
            int r3 = r0.d(r3)
            return r3
        L11:
            int r3 = java.lang.Integer.compare(r1, r0)
            return r3
    }

    @Override // w4.d
    public final w4.c getType() {
            r1 = this;
            w4.c r0 = w4.c.B
            return r0
    }

    @Override // v4.a
    public final boolean i() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // v4.a
    public final java.lang.String j() {
            r1 = this;
            java.lang.String r0 = "method handle"
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "method-handle{"
            r0.<init>(r1)
            java.lang.String r1 = r2.a()
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
