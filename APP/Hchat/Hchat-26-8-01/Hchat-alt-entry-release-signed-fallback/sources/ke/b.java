package ke;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends be.a {
    static {
            java.lang.Class<ke.b> r0 = ke.b.class
            mh.d.b(r0)
            return
    }

    @Override // be.a
    public final void g(ud.r r9) {
            r8 = this;
            boolean r0 = r9.f13722p
            if (r0 != 0) goto Ldd
            xd.b r0 = r9.G
            if (r0 == 0) goto Ldd
            java.util.List r0 = r9.f13732z
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Ldd
            md.b r0 = md.b.f8848c
            md.f r1 = r9.f8877g
            boolean r0 = r1.b(r0)
            if (r0 == 0) goto L1c
            goto Ldd
        L1c:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            ke.a r1 = new ke.a
            r2 = 0
            r1.<init>(r0, r2)
            xd.b r2 = r9.G
            x6.d.h0(r9, r1, r2)
            java.util.List r1 = r9.f13732z
            int r1 = r1.size()
            int r2 = r0.size()
            if (r1 == r2) goto Ld2
            java.util.List r1 = r9.f13732z
            java.util.Iterator r1 = r1.iterator()
        L3e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Ld2
            java.lang.Object r2 = r1.next()
            ud.a r2 = (ud.a) r2
            boolean r3 = r0.contains(r2)
            if (r3 != 0) goto L3e
            java.util.ArrayList r3 = r2.f13674l
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L3e
            md.a r3 = md.a.f8845z
            md.f r4 = r2.f8877g
            boolean r3 = r4.a(r3)
            if (r3 != 0) goto L3e
            md.a r3 = md.a.f8838s
            md.f r4 = r2.f8877g
            boolean r3 = r4.a(r3)
            if (r3 != 0) goto L3e
            md.a r3 = md.a.f8840u
            md.f r4 = r2.f8877g
            boolean r3 = r4.a(r3)
            if (r3 != 0) goto L3e
            fc.f r3 = new fc.f
            r3.<init>()
            r3.o()
            r3.f()
            fd.g r4 = fd.g.h(r9)
            fd.e r5 = new fd.e
            r6 = 1
            r5.<init>(r4, r6)
            java.util.ArrayList r4 = r2.f13674l
            java.util.Iterator r4 = r4.iterator()
        L91:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto La2
            java.lang.Object r6 = r4.next()
            ud.p r6 = (ud.p) r6
            r7 = 0
            r5.j(r6, r3, r7)     // Catch: af.a -> L91
            goto L91
        La2:
            r3.f()
            java.lang.StringBuilder r3 = r3.f3882a
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "*/"
            java.lang.String r5 = "*\\/"
            java.lang.String r3 = r3.replace(r4, r5)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Code restructure failed: missing block: "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = ", code lost:"
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            r9.K(r2)
            goto L3e
        Ld2:
            ke.g r0 = new ke.g
            r1 = 2
            r0.<init>(r1)
            xd.b r1 = r9.G
            x6.d.h0(r9, r0, r1)
        Ldd:
            return
    }
}
