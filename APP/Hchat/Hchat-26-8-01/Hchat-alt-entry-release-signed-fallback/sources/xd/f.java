package xd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends xd.a implements ud.i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final xd.b f21548k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.util.Map f21549l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ud.j f21550m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ae.h f21551n;

    public f(ud.n r1, xd.b r2) {
            r0 = this;
            r0.<init>(r1)
            java.util.Map r1 = java.util.Collections.EMPTY_MAP
            r0.f21549l = r1
            r0.f21548k = r2
            return
    }

    @Override // ud.j
    public final void b(fd.i r6, fc.f r7) {
            r5 = this;
            ud.r r0 = r6.f3908b
            java.lang.String r1 = "try {"
            r7.r(r1)
            ae.h r1 = r5.f21551n
            java.util.List r1 = r1.f245i
            java.lang.String r2 = xe.s.f21577a
            boolean r2 = r1.isEmpty()
            r3 = 0
            if (r2 == 0) goto L16
            r1 = r3
            goto L1b
        L16:
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
        L1b:
            ud.h r1 = (ud.h) r1
            ud.p r1 = a.a.W(r1)
            ic.a.a(r7, r1)
            jd.c.a(r7, r0, r1)
            xd.b r1 = r5.f21548k
            r6.v(r7, r1)
            java.util.Map r1 = r5.f21549l
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L36:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5d
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getKey()
            ae.f r2 = (ae.f) r2
            boolean r4 = r2.c()
            if (r4 == 0) goto L59
            if (r3 == 0) goto L57
            mh.b r3 = fd.i.f3920h
            java.lang.String r4 = "Several 'all' handlers in try/catch block in {}"
            r3.h(r0, r4)
        L57:
            r3 = r2
            goto L36
        L59:
            r6.s(r7, r2)
            goto L36
        L5d:
            if (r3 == 0) goto L62
            r6.s(r7, r3)
        L62:
            ud.j r0 = r5.f21550m
            if (r0 == 0) goto L6e
            java.lang.String r1 = "} finally {"
            r7.r(r1)
            r6.v(r7, r0)
        L6e:
            r7.q()
            return
    }

    @Override // ud.j
    public final java.lang.String k() {
            r1 = this;
            xd.b r0 = r1.f21548k
            java.lang.String r0 = r0.k()
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Try: "
            r0.<init>(r1)
            xd.b r1 = r3.f21548k
            r0.append(r1)
            java.util.Map r1 = r3.f21549l
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L28
            java.lang.String r1 = " catches: "
            r0.append(r1)
            java.util.Map r1 = r3.f21549l
            java.util.Collection r1 = r1.values()
            java.lang.String r2 = ", "
            java.lang.String r1 = xe.s.j(r1, r2)
            r0.append(r1)
        L28:
            ud.j r1 = r3.f21550m
            if (r1 == 0) goto L36
            java.lang.String r1 = " finally: "
            r0.append(r1)
            ud.j r1 = r3.f21550m
            r0.append(r1)
        L36:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // ud.n
    public final java.util.List u() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Map r1 = r2.f21549l
            int r1 = r1.size()
            int r1 = r1 + 2
            r0.<init>(r1)
            xd.b r1 = r2.f21548k
            r0.add(r1)
            java.util.Map r1 = r2.f21549l
            java.util.Collection r1 = r1.values()
            r0.addAll(r1)
            ud.j r1 = r2.f21550m
            if (r1 == 0) goto L22
            r0.add(r1)
        L22:
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }
}
