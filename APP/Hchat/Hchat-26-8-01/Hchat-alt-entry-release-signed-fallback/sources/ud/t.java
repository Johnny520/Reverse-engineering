package ud;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements java.util.function.Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ud.u f13740b;

    public /* synthetic */ t(ud.u r1, int r2) {
            r0 = this;
            r0.f13739a = r2
            r0.f13740b = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.f13739a
            r1 = 0
            ud.u r2 = r8.f13740b
            switch(r0) {
                case 0: goto L93;
                default: goto L8;
            }
        L8:
            jf.b r9 = (jf.b) r9
            r2.getClass()
            ud.e r0 = new ud.e     // Catch: java.lang.Exception -> L28
            r0.<init>(r2, r9)     // Catch: java.lang.Exception -> L28
            java.util.ArrayList r3 = r2.f13755n     // Catch: java.lang.Exception -> L28
            r3.add(r0)     // Catch: java.lang.Exception -> L28
            java.util.HashMap r3 = r2.f13753l     // Catch: java.lang.Exception -> L28
            od.a r4 = r0.f13690m     // Catch: java.lang.Exception -> L28
            r3.put(r4, r0)     // Catch: java.lang.Exception -> L28
            java.util.HashMap r3 = r2.f13754m     // Catch: java.lang.Exception -> L28
            java.lang.String r4 = r0.Z()     // Catch: java.lang.Exception -> L28
            r3.put(r4, r0)     // Catch: java.lang.Exception -> L28
            goto L8f
        L28:
            r0 = move-exception
            mh.b r3 = ud.u.f13741v
            java.lang.String r4 = "CLASS_"
            java.lang.String r5 = r9.b()     // Catch: java.lang.Exception -> L82
            qd.j r6 = qd.j.x(r5)     // Catch: java.lang.Exception -> L3c
            od.a r6 = od.a.e(r2, r6)     // Catch: java.lang.Exception -> L3c
            java.lang.String r1 = r6.f9766h     // Catch: java.lang.Exception -> L3c
            goto L42
        L3c:
            r6 = move-exception
            java.lang.String r7 = "Failed to get name for class with type {}"
            r3.n(r5, r7, r6)     // Catch: java.lang.Exception -> L82
        L42:
            if (r1 == 0) goto L4a
            boolean r6 = r1.isEmpty()     // Catch: java.lang.Exception -> L82
            if (r6 == 0) goto L4e
        L4a:
            java.lang.String r1 = r4.concat(r5)     // Catch: java.lang.Exception -> L82
        L4e:
            ac.k r4 = r9.f6866a     // Catch: java.lang.Exception -> L82
            r5 = 4
            r4.B(r5)     // Catch: java.lang.Exception -> L82
            java.lang.Object r4 = r4.f178i     // Catch: java.lang.Exception -> L82
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4     // Catch: java.lang.Exception -> L82
            int r4 = r4.getInt()     // Catch: java.lang.Exception -> L82
            mh.b r5 = ud.e.F     // Catch: java.lang.Exception -> L82
            qd.j r5 = qd.j.x(r1)     // Catch: java.lang.Exception -> L82
            od.a r5 = od.a.e(r2, r5)     // Catch: java.lang.Exception -> L82
            ud.e r6 = r2.f(r5)     // Catch: java.lang.Exception -> L82
            if (r6 != 0) goto L76
            ud.e r1 = ud.e.T(r2, r5, r4)     // Catch: java.lang.Exception -> L82
            java.lang.String r2 = "Load error"
            xe.h.a(r1, r2, r0)     // Catch: java.lang.Exception -> L82
            goto L8f
        L76:
            af.g r2 = new af.g     // Catch: java.lang.Exception -> L82
            java.lang.String r4 = "Class already exist: "
            java.lang.String r1 = r4.concat(r1)     // Catch: java.lang.Exception -> L82
            r2.<init>(r1)     // Catch: java.lang.Exception -> L82
            throw r2     // Catch: java.lang.Exception -> L82
        L82:
            ac.k r9 = r9.f6866a
            java.lang.Object r9 = r9.f179j
            ff.e r9 = (ff.e) r9
            java.lang.String r9 = r9.f3932b
            java.lang.String r1 = "Failed to load class from file: {}"
            r3.n(r9, r1, r0)
        L8f:
            xe.s.a()
            return
        L93:
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            r2.getClass()
            java.lang.Object r0 = r9.getKey()
            od.a r0 = (od.a) r0
            java.lang.Object r9 = r9.getValue()
            java.util.List r9 = (java.util.List) r9
            mh.b r3 = wd.a.f20780a
            java.util.Iterator r3 = r9.iterator()
            r4 = -1
            r5 = r4
        Lac:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto Lcf
            java.lang.Object r6 = r3.next()
            ud.e r6 = (ud.e) r6
            if (r1 != 0) goto Lbb
            goto Lc7
        Lbb:
            java.lang.String r7 = r6.f13696s
            int r7 = wd.a.a(r7)
            if (r7 == r4) goto Lac
            if (r5 == r4) goto Lc7
            if (r7 >= r5) goto Lac
        Lc7:
            java.lang.String r1 = r6.f13696s
            int r5 = wd.a.a(r1)
            r1 = r6
            goto Lac
        Lcf:
            java.util.HashMap r3 = r2.f13753l
            r3.put(r0, r1)
            java.util.HashMap r2 = r2.f13754m
            java.lang.String r3 = r1.Z()
            r2.put(r3, r1)
            java.lang.String r2 = r1.f13696s
            java.util.stream.Stream r3 = r9.stream()
            me.a r4 = new me.a
            r5 = 16
            r4.<init>(r5)
            java.util.stream.Stream r3 = r3.map(r4)
            java.util.stream.Stream r3 = r3.sorted()
            java.lang.String r4 = "\n  "
            java.util.stream.Collector r4 = java.util.stream.Collectors.joining(r4)
            java.lang.Object r3 = r3.collect(r4)
            java.lang.String r3 = (java.lang.String) r3
            mh.b r4 = ud.u.f13741v
            int r9 = r9.size()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r9 = new java.lang.Object[]{r0, r9, r3, r2}
            java.lang.String r0 = "Found duplicated class: {}, count: {}, sources:\n  {}\n Keep class with source: {}, others will be removed."
            r4.i(r0, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Classes with same name are omitted, all sources:\n  "
            r9.<init>(r0)
            r9.append(r3)
            java.lang.String r0 = "\n"
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r1.L(r9)
            return
    }
}
