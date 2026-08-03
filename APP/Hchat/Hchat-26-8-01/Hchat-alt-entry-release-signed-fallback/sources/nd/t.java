package nd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.a f9392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ud.a f9393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.HashSet f9394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public nd.t f9396e;

    public t(java.util.HashSet r1, ud.a r2, ud.a r3) {
            r0 = this;
            r0.<init>()
            r0.f9392a = r2
            r0.f9393b = r3
            r0.f9394c = r1
            return
    }

    public final java.util.ArrayList a() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashSet r1 = r7.f9394c
            java.util.Iterator r2 = r1.iterator()
        Lb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3e
            java.lang.Object r3 = r2.next()
            ud.a r3 = (ud.a) r3
            java.util.List r4 = r3.f13676n
            java.util.Iterator r4 = r4.iterator()
        L1d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lb
            java.lang.Object r5 = r4.next()
            ud.a r5 = (ud.a) r5
            boolean r6 = r1.contains(r5)
            if (r6 != 0) goto L1d
            boolean r6 = a.a.q0(r5)
            if (r6 != 0) goto L1d
            ud.f r6 = new ud.f
            r6.<init>(r3, r5)
            r0.add(r6)
            goto L1d
        L3e:
            return r0
    }

    public final java.util.HashSet b() {
            r7 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.HashSet r1 = r7.f9394c
            java.util.Iterator r2 = r1.iterator()
        Lb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3d
            java.lang.Object r3 = r2.next()
            ud.a r3 = (ud.a) r3
            java.util.List r4 = r3.f13676n
            java.util.Iterator r4 = r4.iterator()
        L1d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lb
            java.lang.Object r5 = r4.next()
            ud.a r5 = (ud.a) r5
            boolean r6 = r1.contains(r5)
            if (r6 != 0) goto L1d
            md.b r6 = md.b.E
            md.f r5 = r5.f8877g
            boolean r5 = r5.b(r6)
            if (r5 != 0) goto L1d
            r0.add(r3)
            goto L1d
        L3d:
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            int r0 = r5.f9395d
            ud.a r1 = r5.f9392a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            ud.a r2 = r5.f9393b
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "LOOP:"
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = ": "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = "->"
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            return r0
    }
}
