package be;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends be.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final java.util.Map f776h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final java.util.Set f777i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final java.util.List f778j = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ud.u f779g;

    static {
            java.lang.String r31 = "java.lang.Exception"
            java.lang.String r32 = "exc"
            java.lang.String r1 = "java.lang.String"
            java.lang.String r2 = "str"
            java.lang.String r3 = "java.lang.Class"
            java.lang.String r4 = "cls"
            java.lang.String r5 = "java.lang.Throwable"
            java.lang.String r6 = "th"
            java.lang.String r7 = "java.lang.Object"
            java.lang.String r8 = "obj"
            java.lang.String r9 = "java.util.Iterator"
            java.lang.String r10 = "it"
            java.lang.String r11 = "java.util.HashMap"
            java.lang.String r12 = "map"
            java.lang.String r13 = "java.lang.Boolean"
            java.lang.String r14 = "bool"
            java.lang.String r15 = "java.lang.Short"
            java.lang.String r16 = "sh"
            java.lang.String r17 = "java.lang.Integer"
            java.lang.String r18 = "num"
            java.lang.String r19 = "java.lang.Character"
            java.lang.String r20 = "ch"
            java.lang.String r21 = "java.lang.Byte"
            java.lang.String r22 = "b"
            java.lang.String r23 = "java.lang.Float"
            java.lang.String r24 = "f"
            java.lang.String r25 = "java.lang.Long"
            java.lang.String r26 = "l"
            java.lang.String r27 = "java.lang.Double"
            java.lang.String r28 = "d"
            java.lang.String r29 = "java.lang.StringBuilder"
            java.lang.String r30 = "sb"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32}
            java.lang.String r1 = xe.s.f21577a
            java.util.HashMap r1 = new java.util.HashMap
            r2 = 16
            r1.<init>(r2)
            r2 = 0
            r3 = r2
        L4f:
            r4 = 31
            if (r3 >= r4) goto L5f
            r4 = r0[r3]
            int r5 = r3 + 1
            r5 = r0[r5]
            r1.put(r4, r5)
            int r3 = r3 + 2
            goto L4f
        L5f:
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r1)
            be.c.f776h = r0
            java.lang.String r0 = "size"
            java.lang.String r1 = "length"
            java.lang.String r3 = "list"
            java.lang.String r4 = "map"
            java.lang.String r5 = "next"
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r3, r4, r5}
            java.util.HashSet r1 = new java.util.HashSet
            r3 = 5
            r1.<init>(r3)
            r4 = r2
        L7a:
            if (r4 >= r3) goto L90
            r5 = r0[r4]
            java.util.Objects.requireNonNull(r5)
            boolean r6 = r1.add(r5)
            if (r6 == 0) goto L8a
            int r4 = r4 + 1
            goto L7a
        L8a:
            java.lang.String r0 = "duplicate element: "
            g1.d.f(r5, r0)
            return
        L90:
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r1)
            be.c.f777i = r0
            java.lang.String r3 = "get"
            java.lang.String r4 = "set"
            java.lang.String r5 = "to"
            java.lang.String r6 = "parse"
            java.lang.String r7 = "read"
            java.lang.String r8 = "format"
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8}
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 6
            r1.<init>(r3)
        Lac:
            if (r2 >= r3) goto Lb9
            r4 = r0[r2]
            java.util.Objects.requireNonNull(r4)
            r1.add(r4)
            int r2 = r2 + 1
            goto Lac
        Lb9:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            be.c.f778j = r0
            return
    }

    public static java.lang.String i(java.lang.String r4) {
            r0 = 0
            if (r4 == 0) goto L4b
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto La
            goto L4b
        La:
            java.lang.String r1 = r4.toUpperCase()
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L19
            java.lang.String r4 = r4.toLowerCase()
            return r4
        L19:
            r1 = 0
            char r1 = r4.charAt(r1)
            char r1 = java.lang.Character.toLowerCase(r1)
            r2 = 1
            java.lang.String r2 = r4.substring(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            boolean r2 = r1.equals(r4)
            if (r2 != 0) goto L3d
            return r1
        L3d:
            int r1 = r4.length()
            r2 = 3
            if (r1 >= r2) goto L4b
            java.lang.String r0 = "Var"
            java.lang.String r4 = r4.concat(r0)
            return r4
        L4b:
            return r0
    }

    @Override // be.a
    public final java.lang.String e() {
            r1 = this;
            java.lang.String r0 = "ApplyVariableNames"
            return r0
    }

    @Override // be.a
    public final void f(ud.u r1) {
            r0 = this;
            r0.f779g = r1
            return
    }

    @Override // be.a
    public final void g(ud.r r7) {
            r6 = this;
            java.util.List r7 = r7.D
            java.util.Iterator r7 = r7.iterator()
        L6:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L86
            java.lang.Object r0 = r7.next()
            qd.s r0 = (qd.s) r0
            qd.k r0 = r0.b()
            boolean r1 = r0.f10898e
            if (r1 == 0) goto L1e
            java.lang.String r1 = "this"
            goto L81
        L1e:
            boolean r1 = r0.f10899f
            r2 = 0
            if (r1 != 0) goto L25
        L23:
            r1 = r2
            goto L81
        L25:
            java.lang.String r1 = r0.f10894a
            boolean r1 = kd.d.c(r1)
            if (r1 == 0) goto L2e
            goto L23
        L2e:
            java.util.List r1 = r0.f10896c
            boolean r3 = xe.s.n(r1)
            if (r3 == 0) goto L7b
            java.util.stream.Stream r3 = r1.stream()
            a7.b r4 = new a7.b
            r5 = 1
            r4.<init>(r5)
            boolean r3 = r3.anyMatch(r4)
            if (r3 == 0) goto L4d
            qd.j r1 = r0.f10895b
            java.lang.String r1 = r6.j(r1)
            goto L81
        L4d:
            java.util.Iterator r1 = r1.iterator()
        L51:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L7b
            java.lang.Object r3 = r1.next()
            qd.s r3 = (qd.s) r3
            java.lang.String r4 = r3.e()
            if (r4 == 0) goto L65
            r3 = r4
            goto L77
        L65:
            qd.r r4 = r3.f10927i
            ud.p r4 = r4.f10903j
            if (r4 == 0) goto L76
            java.lang.String r3 = r6.k(r3, r4)
            boolean r4 = kd.d.c(r3)
            if (r4 == 0) goto L76
            goto L77
        L76:
            r3 = r2
        L77:
            if (r3 == 0) goto L51
            r1 = r3
            goto L81
        L7b:
            qd.j r1 = r0.f10895b
            java.lang.String r1 = r6.j(r1)
        L81:
            if (r1 == 0) goto L6
            r0.f10894a = r1
            goto L6
        L86:
            return
    }

    public final java.lang.String j(qd.j r3) {
            r2 = this;
            r3.getClass()
            boolean r0 = r3 instanceof qd.g
            if (r0 == 0) goto L12
            qd.q r3 = r3.o()
            java.lang.String r3 = r3.f10919g
            java.lang.String r3 = r3.toLowerCase()
            return r3
        L12:
            boolean r0 = r3 instanceof qd.a
            if (r0 == 0) goto L25
            qd.j r3 = r3.h()
            java.lang.String r3 = r2.j(r3)
            java.lang.String r0 = "Arr"
            java.lang.String r3 = bc.e.i(r3, r0)
            return r3
        L25:
            boolean r0 = r3 instanceof qd.c
            if (r0 == 0) goto L36
            java.lang.String r3 = r3.l()
            java.lang.String r3 = r3.toLowerCase()
            java.lang.String r3 = xe.q.a(r3)
            return r3
        L36:
            boolean r0 = r3.v()
            if (r0 == 0) goto L72
            java.lang.String r0 = r3.l()
            java.util.Map r1 = be.c.f776h
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L4b
            return r0
        L4b:
            ud.u r0 = r2.f779g
            od.a r3 = od.a.e(r0, r3)
            java.lang.String r3 = r3.k()
            java.lang.String r0 = i(r3)
            if (r0 == 0) goto L5c
            return r0
        L5c:
            java.lang.String r0 = r3.toLowerCase()
            java.lang.String r0 = xe.q.a(r0)
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L71
            java.lang.String r3 = "Var"
            java.lang.String r3 = r0.concat(r3)
            return r3
        L71:
            return r0
        L72:
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = xe.q.a(r3)
            return r3
    }

    public final java.lang.String k(qd.s r8, ud.p r9) {
            r7 = this;
            pd.k r0 = r9.f13713k
            int r0 = r0.ordinal()
            r1 = 3
            r2 = 0
            if (r0 == r1) goto L170
            r1 = 8
            if (r0 == r1) goto L170
            r1 = 22
            if (r0 == r1) goto L16d
            r1 = 34
            java.lang.String r3 = "Var"
            java.util.Map r4 = be.c.f776h
            if (r0 == r1) goto L72
            r1 = 37
            if (r0 == r1) goto L170
            r8 = 38
            if (r0 == r8) goto L24
            goto L194
        L24:
            td.a r9 = (td.a) r9
            ud.u r8 = r7.f779g
            fe.a r8 = r8.f13749h
            ud.m r8 = r8.g(r9)
            boolean r0 = r8 instanceof ud.r
            if (r0 == 0) goto L35
            ud.r r8 = (ud.r) r8
            goto L36
        L35:
            r8 = r2
        L36:
            if (r8 == 0) goto L44
            md.a r0 = md.a.H
            md.f r8 = r8.f8877g
            boolean r8 = r8.a(r0)
            if (r8 == 0) goto L44
            goto L194
        L44:
            od.d r8 = r9.f13119o
            od.a r8 = r8.f9780j
            java.lang.String r9 = r8.f9768j
            java.lang.Object r9 = r4.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L53
            return r9
        L53:
            java.lang.String r8 = r8.k()
            java.lang.String r9 = i(r8)
            if (r9 == 0) goto L5e
            return r9
        L5e:
            java.lang.String r9 = r8.toLowerCase()
            java.lang.String r9 = xe.q.a(r9)
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L71
            java.lang.String r8 = r9.concat(r3)
            return r8
        L71:
            return r9
        L72:
            pd.n r9 = (pd.n) r9
            od.d r9 = r9.f10526p
            java.lang.String r0 = r9.f9784n
            od.a r9 = r9.f9780j
            java.lang.String r1 = "getInstance"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Lac
            java.lang.String r8 = r9.f9768j
            java.lang.Object r8 = r4.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L8d
            return r8
        L8d:
            java.lang.String r8 = r9.k()
            java.lang.String r9 = i(r8)
            if (r9 == 0) goto L98
            return r9
        L98:
            java.lang.String r9 = r8.toLowerCase()
            java.lang.String r9 = xe.q.a(r9)
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto Lab
            java.lang.String r8 = r9.concat(r3)
            return r8
        Lab:
            return r9
        Lac:
            java.util.List r1 = be.c.f778j
            java.util.Iterator r1 = r1.iterator()
        Lb2:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto Lcc
            java.lang.Object r5 = r1.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r6 = r0.startsWith(r5)
            if (r6 == 0) goto Lb2
            int r1 = r5.length()
            java.lang.String r2 = r0.substring(r1)
        Lcc:
            if (r2 == 0) goto Ld3
            java.lang.String r8 = i(r2)
            return r8
        Ld3:
            java.lang.String r1 = "iterator"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Lde
            java.lang.String r8 = "it"
            return r8
        Lde:
            java.lang.String r1 = "toString"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L110
            java.lang.String r8 = r9.f9768j
            java.lang.Object r8 = r4.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto Lf1
            return r8
        Lf1:
            java.lang.String r8 = r9.k()
            java.lang.String r9 = i(r8)
            if (r9 == 0) goto Lfc
            return r9
        Lfc:
            java.lang.String r9 = r8.toLowerCase()
            java.lang.String r9 = xe.q.a(r9)
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L10f
            java.lang.String r8 = r9.concat(r3)
            return r8
        L10f:
            return r9
        L110:
            java.lang.String r1 = "forName"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L12b
            qd.j r9 = r9.f9765g
            qd.e r1 = qd.j.f10878l
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L12b
            java.lang.String r8 = "java.lang.Class"
            java.lang.Object r8 = r4.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            return r8
        L12b:
            java.util.Set r9 = be.c.f777i
            boolean r9 = r9.contains(r0)
            if (r9 != 0) goto L16c
            qd.k r8 = r8.b()
            qd.j r8 = r8.f10895b
            java.lang.String r8 = r7.j(r8)
            boolean r9 = r8.equalsIgnoreCase(r0)
            if (r9 != 0) goto L16c
            boolean r9 = xe.q.g(r0)
            if (r9 == 0) goto L14a
            goto L167
        L14a:
            r9 = 0
            char r9 = r0.charAt(r9)
            char r9 = java.lang.Character.toUpperCase(r9)
            r1 = 1
            java.lang.String r0 = r0.substring(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L167:
            java.lang.String r8 = bc.e.i(r8, r0)
            return r8
        L16c:
            return r0
        L16d:
            java.lang.String r8 = "length"
            return r8
        L170:
            java.util.List r9 = r9.f13715m
            java.util.Iterator r9 = r9.iterator()
        L176:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L194
            java.lang.Object r0 = r9.next()
            qd.l r0 = (qd.l) r0
            r0.getClass()
            boolean r1 = r0 instanceof qd.m
            if (r1 == 0) goto L176
            qd.m r0 = (qd.m) r0
            ud.p r0 = r0.f10904l
            java.lang.String r0 = r7.k(r8, r0)
            if (r0 == 0) goto L176
            return r0
        L194:
            return r2
    }
}
