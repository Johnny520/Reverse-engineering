package me;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements java.util.function.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8884a;

    public /* synthetic */ a(int r1) {
            r0 = this;
            r0.f8884a = r1
            r0.<init>()
            return
    }

    public /* synthetic */ a(qe.c r1) {
            r0 = this;
            r1 = 10
            r0.f8884a = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f8884a
            switch(r0) {
                case 0: goto L1a7;
                case 1: goto L19f;
                case 2: goto L182;
                case 3: goto L17a;
                case 4: goto L159;
                case 5: goto L151;
                case 6: goto L14a;
                case 7: goto L143;
                case 8: goto L13c;
                case 9: goto L135;
                case 10: goto Le4;
                case 11: goto Ldb;
                case 12: goto Ld5;
                case 13: goto Lcb;
                case 14: goto Lc4;
                case 15: goto Lbf;
                case 16: goto Lba;
                case 17: goto Lb1;
                case 18: goto Laa;
                case 19: goto L9d;
                case 20: goto L90;
                case 21: goto L82;
                case 22: goto L3f;
                case 23: goto L38;
                case 24: goto L33;
                case 25: goto L27;
                case 26: goto L22;
                case 27: goto Lf;
                case 28: goto L8;
                default: goto L5;
            }
        L5:
            xe.p r5 = (xe.p) r5
            return r5
        L8:
            xe.p r5 = (xe.p) r5
            r5.getClass()
            r5 = 0
            throw r5
        Lf:
            qd.r r5 = (qd.r) r5
            java.lang.String r0 = java.lang.String.valueOf(r5)
            ud.p r5 = r5.f10903j
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r1 = " from "
            java.lang.String r5 = wb.en.h(r0, r1, r5)
            return r5
        L22:
            ud.a r5 = (ud.a) r5
            java.util.List r5 = r5.f13677o
            return r5
        L27:
            uf.d r0 = xd.d.f21542m
            if (r5 != r0) goto L2e
            java.lang.String r5 = "default"
            goto L32
        L2e:
            java.lang.String r5 = r5.toString()
        L32:
            return r5
        L33:
            xd.c r5 = (xd.c) r5
            ud.j r5 = r5.f21541b
            return r5
        L38:
            ud.j r5 = (ud.j) r5
            java.lang.String r5 = r5.k()
            return r5
        L3f:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r0 = r5.trim()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "yes"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L7c
            java.lang.String r1 = "true"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L5c
            goto L7c
        L5c:
            java.lang.String r1 = "no"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L7a
            java.lang.String r1 = "false"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6d
            goto L7a
        L6d:
            java.lang.String r0 = "Unknown value '"
            java.lang.String r1 = "' for option 'dex-input.verify-checksum', expect: 'yes' or 'no'"
            java.lang.String r5 = eh.a.n(r0, r5, r1)
            j8.o.t(r5)
            r5 = 0
            goto L81
        L7a:
            r5 = 0
            goto L7d
        L7c:
            r5 = 1
        L7d:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
        L81:
            return r5
        L82:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L8d
            java.lang.String r5 = "yes"
            goto L8f
        L8d:
            java.lang.String r5 = "no"
        L8f:
            return r5
        L90:
            if (r5 != 0) goto L98
            gc.a r5 = new gc.a
            r5.<init>()
            goto L9c
        L98:
            ah.a.d()
            r5 = 0
        L9c:
            return r5
        L9d:
            if (r5 != 0) goto La5
            gc.b r5 = new gc.b
            r5.<init>()
            goto La9
        La5:
            ah.a.d()
            r5 = 0
        La9:
            return r5
        Laa:
            ud.e r5 = (ud.e) r5
            java.lang.String r5 = r5.Z()
            return r5
        Lb1:
            ud.e r5 = (ud.e) r5
            java.util.List r5 = r5.f13697t
            java.util.stream.Stream r5 = r5.stream()
            return r5
        Lba:
            ud.e r5 = (ud.e) r5
            java.lang.String r5 = r5.f13696s
            return r5
        Lbf:
            ud.e r5 = (ud.e) r5
            od.a r5 = r5.f13690m
            return r5
        Lc4:
            java.lang.String r5 = (java.lang.String) r5
            qd.j r5 = qd.j.x(r5)
            return r5
        Lcb:
            te.b r5 = (te.b) r5
            a2.a r5 = r5.f13131i
            r5.getClass()
            java.lang.String r5 = "dex-input"
            return r5
        Ld5:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            return r5
        Ldb:
            qe.a r5 = (qe.a) r5
            java.util.ArrayList r5 = r5.f10933b
            java.util.stream.Stream r5 = r5.stream()
            return r5
        Le4:
            ud.r r5 = (ud.r) r5
            r0 = 0
            qe.r r1 = new qe.r     // Catch: java.lang.Exception -> Lf8
            r1.<init>(r5)     // Catch: java.lang.Exception -> Lf8
            boolean r1 = r1.d()     // Catch: java.lang.Exception -> Lf8
            if (r1 != 0) goto Lfa
            java.lang.String r1 = "Multi-variable type inference failed"
            r5.L(r1)     // Catch: java.lang.Exception -> Lf8
            goto Lfa
        Lf8:
            r1 = move-exception
            goto L11b
        Lfa:
            java.util.List r1 = r5.D     // Catch: java.lang.Exception -> Lf8
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> Lf8
        L100:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> Lf8
            if (r2 == 0) goto L119
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> Lf8
            qd.s r2 = (qd.s) r2     // Catch: java.lang.Exception -> Lf8
            p4.t r2 = r2.f10930l     // Catch: java.lang.Exception -> Lf8
            java.lang.Object r2 = r2.f10224h     // Catch: java.lang.Exception -> Lf8
            qd.j r2 = (qd.j) r2     // Catch: java.lang.Exception -> Lf8
            boolean r2 = r2.w()     // Catch: java.lang.Exception -> Lf8
            if (r2 != 0) goto L100
            goto L130
        L119:
            r0 = 1
            goto L130
        L11b:
            java.lang.String r1 = xe.s.g(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Multi-variable type inference failed. Error: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r5.L(r1)
        L130:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L135:
            qe.d r5 = (qe.d) r5
            qd.j r5 = r5.getType()
            return r5
        L13c:
            qd.s r5 = (qd.s) r5
            java.lang.String r5 = r5.o()
            return r5
        L143:
            qd.j r5 = (qd.j) r5
            java.lang.String r5 = java.lang.String.valueOf(r5)
            return r5
        L14a:
            java.lang.String r5 = (java.lang.String) r5
            qd.j r5 = qd.j.z(r5)
            return r5
        L151:
            ud.e r5 = (ud.e) r5
            od.b r5 = new od.b
            r5.<init>()
            return r5
        L159:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r0 = r5.getKey()
            bc.a r0 = (bc.a) r0
            java.lang.String r0 = r0.name()
            java.lang.Object r5 = r5.getValue()
            java.util.Set r5 = (java.util.Set) r5
            java.util.stream.Stream r5 = r5.stream()
            nd.n r1 = new nd.n
            r2 = 0
            r1.<init>(r0, r2)
            java.util.stream.Stream r5 = r5.map(r1)
            return r5
        L17a:
            bc.a r5 = (bc.a) r5
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            return r5
        L182:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r0 = r5.getKey()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object r5 = r5.getValue()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.lang.String r1 = "\n -> "
            java.lang.String r5 = xe.s.j(r5, r1)
            java.lang.String r1 = ": \n -> "
            java.lang.String r5 = wb.en.h(r0, r1, r5)
            return r5
        L19f:
            qd.k r5 = (qd.k) r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            return r5
        L1a7:
            me.f r0 = new me.f
            qd.s r5 = (qd.s) r5
            r0.<init>(r5)
            return r0
    }
}
