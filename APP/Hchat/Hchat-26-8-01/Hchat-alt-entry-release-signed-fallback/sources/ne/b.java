package ne;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends be.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final java.util.regex.Pattern f9409g = null;

    static {
            java.lang.String r0 = "^\\d+$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            ne.b.f9409g = r0
            return
    }

    @Override // be.a
    public final java.lang.String e() {
            r1 = this;
            java.lang.String r0 = "RenameVisitor"
            return r0
    }

    @Override // be.a
    public final void f(ud.u r19) {
            r18 = this;
            r0 = r19
            bc.g r1 = r0.f13742a
            java.util.ArrayList r2 = r0.f13757p
            java.util.ArrayList r3 = r1.f712g
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto Lf
            return
        Lf:
            int r3 = ne.d.f9413a
            r1.getClass()
            java.util.EnumSet r3 = r1.D
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L1e
            goto L409
        L1e:
            kd.a r4 = r1.A
            java.util.ArrayList r5 = r0.f13755n
            java.util.Iterator r6 = r5.iterator()
        L26:
            boolean r7 = r6.hasNext()
            r9 = 0
            bc.f r11 = bc.f.f710i
            if (r7 == 0) goto L28f
            java.lang.Object r7 = r6.next()
            ud.e r7 = (ud.e) r7
            md.f r12 = r7.f8877g
            md.a r13 = md.a.f8843x
            boolean r12 = r12.a(r13)
            if (r12 == 0) goto L43
            r17 = r1
            goto L13e
        L43:
            od.a r12 = r7.f13690m
            java.lang.String r14 = r12.k()
            boolean r15 = xe.q.g(r14)
            if (r15 == 0) goto L54
            r17 = r1
        L51:
            r8 = 0
            goto Ldf
        L54:
            boolean r15 = r1.a()
            java.lang.String r8 = "C"
            if (r15 == 0) goto L8d
            java.util.regex.Pattern r10 = ne.b.f9409g
            java.util.regex.Matcher r10 = r10.matcher(r14)
            boolean r10 = r10.matches()
            if (r10 == 0) goto L76
            java.lang.String r8 = kd.d.e(r14)
            java.lang.String r10 = "AnonymousClass"
            java.lang.String r8 = r10.concat(r8)
        L72:
            r17 = r1
            goto Ldf
        L76:
            char r10 = r14.charAt(r9)
            r9 = 36
            if (r10 == r9) goto L84
            boolean r9 = java.lang.Character.isDigit(r10)
            if (r9 == 0) goto L8d
        L84:
            java.lang.String r9 = kd.d.e(r14)
            java.lang.String r8 = r8.concat(r9)
            goto L72
        L8d:
            boolean r9 = r3.contains(r11)
            if (r9 == 0) goto Lae
            java.util.regex.Pattern r9 = kd.d.f7584a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r10 = r14.length()
            r9.<init>(r10)
            kd.c r10 = new kd.c
            r17 = r1
            r1 = 0
            r10.<init>(r9, r1)
            xe.q.j(r14, r10)
            java.lang.String r1 = r9.toString()
            goto Lb1
        Lae:
            r17 = r1
            r1 = r14
        Lb1:
            boolean r9 = r1.isEmpty()
            if (r9 == 0) goto Lb8
            goto L51
        Lb8:
            if (r15 == 0) goto Lde
            java.lang.String r1 = kd.d.e(r14)
            boolean r9 = r1.isEmpty()
            if (r9 != 0) goto Ld3
            r9 = 0
            int r10 = r1.codePointAt(r9)
            boolean r9 = java.lang.Character.isJavaIdentifierStart(r10)
            if (r9 != 0) goto Ld3
            java.lang.String r1 = r8.concat(r1)
        Ld3:
            boolean r9 = kd.d.d(r1)
            if (r9 != 0) goto Lde
            java.lang.String r8 = r8.concat(r1)
            goto Ldf
        Lde:
            r8 = r1
        Ldf:
            if (r8 != 0) goto Lf6
            java.lang.String r1 = r4.a(r7)
            r7.j0(r1)
            nd.f0 r1 = new nd.f0
            r1.<init>(r7)
            java.lang.String r8 = "contains not printable characters"
            r1.b(r8)
            r7.y(r1)
            goto L13e
        Lf6:
            boolean r1 = r8.equals(r14)
            if (r1 != 0) goto L10c
            r12.a(r8)
            nd.f0 r1 = new nd.f0
            r1.<init>(r7)
            java.lang.String r9 = "invalid class name"
            r1.b(r9)
            r7.y(r1)
        L10c:
            boolean r1 = r12.o()
            if (r1 == 0) goto L13e
            boolean r1 = r17.a()
            if (r1 == 0) goto L13e
            od.a r1 = r12.f9769k
        L11a:
            if (r1 == 0) goto L13e
            java.lang.String r9 = r1.k()
            boolean r9 = r9.equals(r8)
            if (r9 == 0) goto L13b
            java.lang.String r1 = r4.a(r7)
            r7.j0(r1)
            nd.f0 r1 = new nd.f0
            r1.<init>(r7)
            java.lang.String r8 = "collision with other inner class name"
            r1.b(r8)
            r7.y(r1)
            goto L13e
        L13b:
            od.a r1 = r1.f9769k
            goto L11a
        L13e:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.List r8 = r7.f13698u
            java.util.Iterator r8 = r8.iterator()
        L149:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L1a9
            java.lang.Object r9 = r8.next()
            ud.g r9 = (ud.g) r9
            od.c r10 = r9.f13707l
            java.lang.String r10 = r10.f9776j
            boolean r12 = r1.add(r10)
            boolean r14 = r17.a()
            if (r14 == 0) goto L16b
            boolean r14 = kd.d.d(r10)
            if (r14 != 0) goto L16b
            r14 = 1
            goto L16c
        L16b:
            r14 = 0
        L16c:
            boolean r15 = r3.contains(r11)
            if (r15 == 0) goto L17a
            boolean r10 = kd.d.a(r10)
            if (r10 != 0) goto L17a
            r10 = 1
            goto L17b
        L17a:
            r10 = 0
        L17b:
            if (r12 == 0) goto L185
            if (r14 != 0) goto L185
            if (r10 == 0) goto L182
            goto L185
        L182:
            r16 = r1
            goto L1a6
        L185:
            java.lang.String r15 = r4.b(r9)
            r16 = r1
            od.c r1 = r9.f13707l
            r1.f9776j = r15
            nd.f0 r1 = new nd.f0
            r1.<init>(r9, r14, r10)
            r9.y(r1)
            if (r12 != 0) goto L1a6
            nd.f0 r1 = new nd.f0
            r1.<init>(r9)
            java.lang.String r10 = "collision with other field name"
            r1.b(r10)
            r9.y(r1)
        L1a6:
            r1 = r16
            goto L149
        L1a9:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List r8 = r7.f13697t
            int r8 = r8.size()
            r1.<init>(r8)
            java.util.List r7 = r7.f13697t
            java.util.Iterator r7 = r7.iterator()
        L1ba:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L1d2
            java.lang.Object r8 = r7.next()
            ud.r r8 = (ud.r) r8
            b5.k r9 = r8.f13719m
            boolean r9 = r9.a()
            if (r9 != 0) goto L1ba
            r1.add(r8)
            goto L1ba
        L1d2:
            java.util.Iterator r7 = r1.iterator()
        L1d6:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L218
            java.lang.Object r8 = r7.next()
            ud.r r8 = (ud.r) r8
            od.d r9 = r8.f13717k
            java.lang.String r9 = r9.f9784n
            boolean r10 = r17.a()
            if (r10 == 0) goto L1f4
            boolean r10 = kd.d.d(r9)
            if (r10 != 0) goto L1f4
            r10 = 1
            goto L1f5
        L1f4:
            r10 = 0
        L1f5:
            boolean r12 = r3.contains(r11)
            if (r12 == 0) goto L203
            boolean r9 = kd.d.a(r9)
            if (r9 != 0) goto L203
            r9 = 1
            goto L204
        L203:
            r9 = 0
        L204:
            if (r10 != 0) goto L208
            if (r9 == 0) goto L1d6
        L208:
            java.lang.String r12 = r4.c(r8)
            r8.d0(r12)
            nd.f0 r12 = new nd.f0
            r12.<init>(r8, r10, r9)
            r8.y(r12)
            goto L1d6
        L218:
            boolean r7 = r17.a()
            if (r7 == 0) goto L28b
            java.util.HashSet r7 = new java.util.HashSet
            int r8 = r1.size()
            r7.<init>(r8)
            java.util.Iterator r1 = r1.iterator()
        L22b:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L28b
            java.lang.Object r8 = r1.next()
            ud.r r8 = (ud.r) r8
            od.d r9 = r8.f13717k
            r10 = 0
            r12 = 1
            java.lang.String r9 = r9.j(r12, r10)
            boolean r9 = r7.add(r9)
            if (r9 != 0) goto L22b
            md.f r9 = r8.f8877g
            boolean r9 = r9.a(r13)
            if (r9 == 0) goto L24e
            goto L22b
        L24e:
            md.b r9 = md.b.f8863r
            md.f r11 = r8.f8877g
            oc.b r9 = r11.c(r9)
            nd.x r9 = (nd.x) r9
            if (r9 == 0) goto L279
            java.util.SortedSet r9 = r9.f9403h
            java.util.Iterator r9 = r9.iterator()
        L260:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L279
            java.lang.Object r11 = r9.next()
            ud.r r11 = (ud.r) r11
            if (r11 == r8) goto L260
            ud.e r14 = r8.f13718l
            ud.e r11 = r11.f13718l
            boolean r11 = r14.equals(r11)
            if (r11 == 0) goto L260
            goto L22b
        L279:
            java.lang.String r9 = r4.c(r8)
            r8.d0(r9)
            nd.f0 r9 = new nd.f0
            java.lang.String r11 = "collision with other method in class"
            r9.<init>(r11)
            r8.y(r9)
            goto L22b
        L28b:
            r1 = r17
            goto L26
        L28f:
            r17 = r1
            r10 = r9
            r12 = 1
            bc.f r1 = bc.f.f708g
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L2e4
            java.util.HashSet r1 = new java.util.HashSet
            int r6 = r5.size()
            r1.<init>(r6)
            java.util.Iterator r6 = r5.iterator()
        L2a8:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L2e4
            java.lang.Object r7 = r6.next()
            ud.e r7 = (ud.e) r7
            od.a r8 = r7.f13690m
            java.lang.String r9 = r8.g()
            java.lang.String r9 = r9.toLowerCase()
            boolean r9 = r1.add(r9)
            if (r9 != 0) goto L2a8
            java.lang.String r9 = r4.a(r7)
            r8.a(r9)
            nd.f0 r9 = new nd.f0
            r9.<init>(r7)
            java.lang.String r13 = "case insensitive filesystem"
            r9.b(r13)
            r7.y(r9)
            java.lang.String r7 = r8.g()
            java.lang.String r7 = r7.toLowerCase()
            r1.add(r7)
            goto L2a8
        L2e4:
            java.util.Iterator r1 = r2.iterator()
            r6 = r10
        L2e9:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L385
            java.lang.Object r7 = r1.next()
            ud.s r7 = (ud.s) r7
            boolean r8 = r17.a()
            if (r8 == 0) goto L31f
            od.e r8 = r7.f13738p
            java.lang.String r8 = r8.f9786b
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L31f
            od.e r8 = r7.f13734l
            java.lang.String r9 = r8.f9786b
            java.lang.String r13 = "defpackage"
            boolean r9 = r9.equals(r13)
            if (r9 == 0) goto L314
            r7.f13738p = r8
            goto L31c
        L314:
            ud.u r8 = r7.f13733k
            od.e r8 = od.e.a(r8, r13)
            r7.f13738p = r8
        L31c:
            r7 = r12
            goto L382
        L31f:
            od.e r8 = r7.f13738p
            java.lang.String r8 = r8.f9787c
            boolean r9 = r17.a()
            if (r9 == 0) goto L331
            boolean r9 = kd.d.d(r8)
            if (r9 != 0) goto L331
            r9 = r12
            goto L332
        L331:
            r9 = r10
        L332:
            boolean r13 = r3.contains(r11)
            if (r13 == 0) goto L340
            boolean r8 = kd.d.a(r8)
            if (r8 != 0) goto L340
            r8 = r12
            goto L341
        L340:
            r8 = r10
        L341:
            if (r9 != 0) goto L348
            if (r8 == 0) goto L346
            goto L348
        L346:
            r7 = r10
            goto L382
        L348:
            int r8 = r4.f7570a
            int r9 = r8 + 1
            r4.f7570a = r9
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            od.e r9 = r7.f13734l
            java.lang.String r9 = r9.f9787c
            java.lang.String r9 = r4.e(r9)
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r9}
            java.lang.String r9 = "p%03d%s"
            java.lang.String r8 = java.lang.String.format(r9, r8)
            od.e r9 = r7.f13734l
            java.lang.String r13 = r9.f9787c
            boolean r13 = r13.equals(r8)
            if (r13 == 0) goto L371
            r7.f13738p = r9
            goto L31c
        L371:
            ud.u r9 = r7.f13733k
            ud.s r13 = r7.f13735m
            if (r13 != 0) goto L379
            r13 = 0
            goto L37b
        L379:
            od.e r13 = r13.f13738p
        L37b:
            od.e r8 = od.e.b(r9, r13, r8)
            r7.f13738p = r8
            goto L31c
        L382:
            r6 = r6 | r7
            goto L2e9
        L385:
            if (r6 == 0) goto L39f
            java.util.Iterator r1 = r2.iterator()
        L38b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L39f
            java.lang.Object r3 = r1.next()
            ud.s r3 = (ud.s) r3
            ud.s r6 = r3.f13735m
            if (r6 != 0) goto L38b
            r3.J()
            goto L38b
        L39f:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Iterator r2 = r2.iterator()
        L3a8:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3c0
            java.lang.Object r3 = r2.next()
            ud.s r3 = (ud.s) r3
            ud.s r6 = r3.f13735m
            if (r6 != 0) goto L3a8
            od.e r3 = r3.f13734l
            java.lang.String r3 = r3.f9787c
            r1.add(r3)
            goto L3a8
        L3c0:
            xe.e r2 = r0.f13747f
            r2.f21559b = r1
            boolean r2 = r17.a()
            if (r2 == 0) goto L409
            java.util.Iterator r2 = r5.iterator()
        L3ce:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L409
            java.lang.Object r3 = r2.next()
            ud.e r3 = (ud.e) r3
            java.util.List r3 = r3.f13698u
            java.util.Iterator r3 = r3.iterator()
        L3e0:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L3ce
            java.lang.Object r5 = r3.next()
            ud.g r5 = (ud.g) r5
            od.c r6 = r5.f13707l
            java.lang.String r6 = r6.f9776j
            boolean r6 = r1.contains(r6)
            if (r6 == 0) goto L3e0
            java.lang.String r6 = r4.b(r5)
            od.c r7 = r5.f13707l
            r7.f9776j = r6
            nd.f0 r6 = new nd.f0
            java.lang.String r7 = "collision with root package name"
            r6.<init>(r7)
            r5.y(r6)
            goto L3e0
        L409:
            ah.a r1 = new ah.a
            r2 = 4
            r1.<init>(r2)
            java.util.ArrayList r0 = r0.f13751j
            r0.add(r1)
            return
    }
}
