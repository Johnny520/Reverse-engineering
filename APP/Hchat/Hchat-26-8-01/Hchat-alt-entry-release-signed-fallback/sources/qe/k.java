package qe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final mh.b f10960d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.u f10961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.a0 f10962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.Comparator f10963c;

    static {
            java.lang.Class<qe.k> r0 = qe.k.class
            mh.b r0 = mh.d.b(r0)
            qe.k.f10960d = r0
            return
    }

    public k(ud.u r2) {
            r1 = this;
            r1.<init>()
            r1.f10961a = r2
            c9.a0 r2 = new c9.a0
            r0 = 25
            r2.<init>(r1, r0)
            r1.f10962b = r2
            java.util.Comparator r2 = r2.reversed()
            r1.f10963c = r2
            return
    }

    public static qe.l a(qd.j r2) {
            boolean r0 = r2.w()
            if (r0 != 0) goto Lf
            qd.q r0 = qd.q.f10916s
            boolean r2 = r2.a(r0)
            if (r2 == 0) goto L24
            goto L1d
        Lf:
            boolean r0 = r2.v()
            if (r0 == 0) goto L20
            qd.e r0 = qd.j.f10877k
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L24
        L1d:
            qe.l r2 = qe.l.f10965h
            return r2
        L20:
            boolean r0 = r2 instanceof qd.g
            if (r0 == 0) goto L27
        L24:
            qe.l r2 = qe.l.f10969l
            return r2
        L27:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "Unprocessed type: "
            java.lang.String r1 = " in array compare"
            java.lang.String r2 = eh.a.n(r0, r2, r1)
            ah.a.k(r2)
            r2 = 0
            return r2
    }

    public static qe.l e(qd.j r3, qd.j r4) {
            qd.h r0 = qd.j.f10887u
            if (r4 != r0) goto L5
            goto L41
        L5:
            qd.h r0 = qd.j.f10888v
            if (r4 != r0) goto L14
            boolean r0 = r3.v()
            if (r0 != 0) goto L41
            boolean r0 = r3 instanceof qd.a
            if (r0 == 0) goto L14
            goto L41
        L14:
            qd.e r0 = qd.j.f10877k
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L23
            boolean r0 = r4 instanceof qd.a
            if (r0 == 0) goto L23
            qe.l r3 = qe.l.f10967j
            return r3
        L23:
            boolean r0 = r3 instanceof qd.g
            if (r0 == 0) goto L2c
            qd.g r3 = (qd.g) r3
            qd.q r3 = r3.K
            goto L35
        L2c:
            boolean r3 = r3 instanceof qd.a
            if (r3 == 0) goto L33
            qd.q r3 = qd.q.f10916s
            goto L35
        L33:
            qd.q r3 = qd.q.f10915r
        L35:
            qd.q[] r4 = r4.n()
            int r0 = r4.length
            r1 = 0
        L3b:
            if (r1 >= r0) goto L47
            r2 = r4[r1]
            if (r2 != r3) goto L44
        L41:
            qe.l r3 = qe.l.f10965h
            return r3
        L44:
            int r1 = r1 + 1
            goto L3b
        L47:
            qe.l r3 = qe.l.f10969l
            return r3
    }

    public static byte f(qd.q r2) {
            int r0 = r2.ordinal()
            switch(r0) {
                case 0: goto L24;
                case 1: goto L22;
                case 2: goto L20;
                case 3: goto L1e;
                case 4: goto L1c;
                case 5: goto L1a;
                case 6: goto L18;
                case 7: goto L16;
                case 8: goto L24;
                case 9: goto L24;
                case 10: goto L24;
                default: goto L7;
            }
        L7:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "Unhandled type: "
            java.lang.String r2 = r0.concat(r2)
            ah.a.k(r2)
        L14:
            r2 = 0
            return r2
        L16:
            r2 = 6
            return r2
        L18:
            r2 = 4
            return r2
        L1a:
            r2 = 5
            return r2
        L1c:
            r2 = 3
            return r2
        L1e:
            r2 = 1
            return r2
        L20:
            r2 = 0
            return r2
        L22:
            r2 = 2
            return r2
        L24:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "Type "
            java.lang.String r1 = " should not be here"
            java.lang.String r2 = eh.a.n(r0, r2, r1)
            ah.a.k(r2)
            goto L14
    }

    public final qe.l b(qd.j r4, qd.j r5) {
            r3 = this;
            r5.getClass()
            boolean r0 = r5 instanceof qd.c
            if (r0 == 0) goto L7f
            java.lang.String r0 = r4.l()
            java.lang.String r1 = r5.l()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L99
            java.util.List r4 = r4.i()
            qd.e r0 = qd.j.f10877k
            boolean r1 = r4.contains(r0)
            r2 = 1
            if (r1 == 0) goto L34
            int r1 = r4.size()
            if (r1 != r2) goto L2b
            java.util.List r4 = java.util.Collections.EMPTY_LIST
            goto L34
        L2b:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r4)
            r1.remove(r0)
            r4 = r1
        L34:
            java.util.List r5 = r5.i()
            boolean r1 = r5.contains(r0)
            if (r1 == 0) goto L50
            int r1 = r5.size()
            if (r1 != r2) goto L47
            java.util.List r5 = java.util.Collections.EMPTY_LIST
            goto L50
        L47:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r5)
            r1.remove(r0)
            r5 = r1
        L50:
            boolean r0 = r4.equals(r5)
            if (r0 == 0) goto L59
            qe.l r4 = qe.l.f10964g
            return r4
        L59:
            int r0 = r4.size()
            int r1 = r5.size()
            if (r0 != 0) goto L66
            qe.l r4 = qe.l.f10967j
            return r4
        L66:
            if (r1 != 0) goto L69
            goto Lc0
        L69:
            if (r0 != r2) goto L99
            if (r1 != r2) goto L99
            r0 = 0
            java.lang.Object r4 = r4.get(r0)
            qd.j r4 = (qd.j) r4
            java.lang.Object r5 = r5.get(r0)
            qd.j r5 = (qd.j) r5
            qe.l r4 = r3.d(r4, r5)
            return r4
        L7f:
            boolean r0 = r5 instanceof qd.i
            if (r0 == 0) goto L86
            qe.l r4 = qe.l.f10970m
            return r4
        L86:
            qd.e r0 = qd.j.f10877k
            boolean r0 = r5.equals(r0)
            java.util.List r4 = r4.i()
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L9c
            if (r0 == 0) goto L99
            goto Lc0
        L99:
            qe.l r4 = qe.l.f10969l
            return r4
        L9c:
            boolean r1 = r4.contains(r5)
            if (r1 != 0) goto Lc0
            if (r0 == 0) goto La5
            goto Lc0
        La5:
            java.util.Iterator r4 = r4.iterator()
        La9:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lc0
            java.lang.Object r0 = r4.next()
            qd.j r0 = (qd.j) r0
            qe.l r0 = r3.c(r0, r5)
            boolean r1 = r0.c()
            if (r1 != 0) goto La9
            return r0
        Lc0:
            qe.l r4 = qe.l.f10965h
            return r4
    }

    public final qe.l c(qd.j r8, qd.j r9) {
            r7 = this;
            java.lang.String r0 = r8.l()
            java.lang.String r1 = r9.l()
            boolean r0 = r0.equals(r1)
            boolean r1 = r8 instanceof qd.c
            boolean r2 = r9 instanceof qd.c
            if (r1 == 0) goto L18
            if (r2 == 0) goto L18
            if (r0 != 0) goto L18
            goto L11f
        L18:
            boolean r3 = r8.t()
            boolean r4 = r9.t()
            r5 = 2
            if (r1 != 0) goto Lfe
            if (r2 == 0) goto L27
            goto Lfe
        L27:
            r1 = 0
            if (r0 == 0) goto Laa
            if (r3 == r4) goto L34
            if (r3 == 0) goto L31
            qe.l r8 = qe.l.f10966i
            return r8
        L31:
            qe.l r8 = qe.l.f10968k
            return r8
        L34:
            int r0 = r8.q()
            if (r0 == 0) goto L5f
            int r0 = r9.q()
            if (r0 == 0) goto L5f
            int r0 = r8.q()
            int r1 = r9.q()
            if (r0 != r5) goto L4c
            goto Lf8
        L4c:
            if (r1 != r5) goto L50
            goto Lfb
        L50:
            qd.j r8 = r8.r()
            qd.j r9 = r9.r()
            qe.l r8 = r7.d(r8, r9)
            if (r0 != r1) goto L11f
            return r8
        L5f:
            java.util.List r0 = r8.j()
            java.util.List r2 = r9.j()
            boolean r3 = xe.s.h(r0)
            if (r3 != 0) goto L99
            boolean r3 = xe.s.h(r2)
            if (r3 == 0) goto L74
            goto L99
        L74:
            int r3 = r0.size()
            int r4 = r2.size()
            if (r3 != r4) goto Laa
            r4 = r1
        L7f:
            if (r4 >= r3) goto Laa
            java.lang.Object r5 = r0.get(r4)
            qd.j r5 = (qd.j) r5
            java.lang.Object r6 = r2.get(r4)
            qd.j r6 = (qd.j) r6
            qe.l r5 = r7.d(r5, r6)
            qe.l r6 = qe.l.f10964g
            if (r5 == r6) goto L96
            return r5
        L96:
            int r4 = r4 + 1
            goto L7f
        L99:
            qd.j r0 = r8.m()
            qd.j r2 = r9.m()
            if (r0 == 0) goto Laa
            if (r2 == 0) goto Laa
            qe.l r8 = r7.d(r0, r2)
            return r8
        Laa:
            qd.e r0 = qd.j.f10877k
            boolean r2 = r8.equals(r0)
            if (r2 != 0) goto Lf6
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto Lb9
            goto Lf6
        Lb9:
            ud.u r0 = r7.f10961a
            boolean r2 = qd.j.u(r0, r8, r9)
            if (r2 == 0) goto Lc2
            goto Lfb
        Lc2:
            boolean r2 = qd.j.u(r0, r9, r8)
            if (r2 == 0) goto Lc9
            goto Lf8
        Lc9:
            boolean r2 = r8.v()
            if (r2 == 0) goto Ldc
            ed.c r2 = r0.f13760s
            java.lang.String r8 = r8.l()
            java.util.HashMap r2 = r2.f2714b
            boolean r8 = r2.containsKey(r8)
            goto Ldd
        Ldc:
            r8 = r1
        Ldd:
            if (r8 == 0) goto Lf3
            boolean r8 = r9.v()
            if (r8 == 0) goto Lf1
            ed.c r8 = r0.f13760s
            java.lang.String r9 = r9.l()
            java.util.HashMap r8 = r8.f2714b
            boolean r1 = r8.containsKey(r9)
        Lf1:
            if (r1 != 0) goto L11f
        Lf3:
            qe.l r8 = qe.l.f10971n
            return r8
        Lf6:
            if (r2 == 0) goto Lfb
        Lf8:
            qe.l r8 = qe.l.f10967j
            return r8
        Lfb:
            qe.l r8 = qe.l.f10965h
            return r8
        Lfe:
            qd.j r0 = r8.r()
            qd.j r3 = r9.r()
            if (r0 != 0) goto L10a
            if (r3 == 0) goto L122
        L10a:
            if (r0 == 0) goto L115
            if (r2 == 0) goto L115
            int r0 = r8.q()
            if (r0 != r5) goto L115
            goto L11f
        L115:
            if (r1 == 0) goto L122
            if (r3 == 0) goto L122
            int r0 = r9.q()
            if (r0 != r5) goto L122
        L11f:
            qe.l r8 = qe.l.f10969l
            return r8
        L122:
            if (r1 == 0) goto L129
            qe.l r8 = r7.b(r8, r9)
            return r8
        L129:
            qe.l r8 = r7.b(r9, r8)
            qe.l r8 = r8.a()
            return r8
    }

    public final qe.l d(qd.j r6, qd.j r7) {
            r5 = this;
            if (r6 == r7) goto Lca
            boolean r0 = java.util.Objects.equals(r6, r7)
            if (r0 == 0) goto La
            goto Lca
        La:
            boolean r0 = r6.w()
            boolean r1 = r7.w()
            if (r0 == r1) goto L24
            if (r0 == 0) goto L1b
            qe.l r6 = e(r6, r7)
            return r6
        L1b:
            qe.l r6 = e(r7, r6)
            qe.l r6 = r6.a()
            return r6
        L24:
            boolean r1 = r6 instanceof qd.a
            boolean r2 = r7 instanceof qd.a
            if (r1 == r2) goto L3a
            if (r1 == 0) goto L31
            qe.l r6 = a(r7)
            return r6
        L31:
            qe.l r6 = a(r6)
            qe.l r6 = r6.a()
            return r6
        L3a:
            if (r1 == 0) goto L49
            qd.j r6 = r6.g()
            qd.j r7 = r7.g()
            qe.l r6 = r5.d(r6, r7)
            return r6
        L49:
            if (r0 != 0) goto L5c
            qd.q[] r6 = r6.n()
            int r6 = r6.length
            qd.q[] r7 = r7.n()
            int r7 = r7.length
            int r6 = java.lang.Integer.compare(r6, r7)
            if (r6 <= 0) goto Lb8
            goto Lb3
        L5c:
            boolean r0 = r6 instanceof qd.g
            boolean r1 = r7 instanceof qd.g
            boolean r2 = r6.v()
            boolean r3 = r7.v()
            if (r2 == 0) goto L71
            if (r3 == 0) goto L71
            qe.l r6 = r5.c(r6, r7)
            return r6
        L71:
            qe.l r4 = qe.l.f10969l
            if (r2 == 0) goto L78
            if (r1 == 0) goto L78
            return r4
        L78:
            if (r0 == 0) goto L7d
            if (r3 == 0) goto L7d
            goto Lc1
        L7d:
            if (r0 == 0) goto Lc2
            if (r1 == 0) goto Lc2
            qd.q r6 = r6.o()
            qd.q r7 = r7.o()
            qd.q r0 = qd.q.f10907j
            if (r6 == r0) goto Lbe
            if (r7 != r0) goto L90
            goto Lbe
        L90:
            qd.q r0 = qd.q.f10917t
            if (r6 == r0) goto Lbb
            if (r7 != r0) goto L97
            goto Lbb
        L97:
            qd.q r0 = qd.q.f10909l
            if (r6 != r0) goto La0
            qd.q r0 = qd.q.f10908k
            if (r7 != r0) goto La0
            goto Lb3
        La0:
            qd.q r0 = qd.q.f10910m
            if (r6 != r0) goto La9
            qd.q r0 = qd.q.f10908k
            if (r7 != r0) goto La9
            goto Lb3
        La9:
            byte r6 = f(r6)
            byte r7 = f(r7)
            if (r6 <= r7) goto Lb6
        Lb3:
            qe.l r6 = qe.l.f10967j
            return r6
        Lb6:
            if (r6 >= r7) goto Lca
        Lb8:
            qe.l r6 = qe.l.f10965h
            return r6
        Lbb:
            if (r6 != r7) goto Lc1
            goto Lca
        Lbe:
            if (r6 != r7) goto Lc1
            goto Lca
        Lc1:
            return r4
        Lc2:
            mh.b r0 = qe.k.f10960d
            java.lang.String r1 = "Type compare function not complete, can't compare {} and {}"
            r0.s(r6, r1, r7)
            return r4
        Lca:
            qe.l r6 = qe.l.f10964g
            return r6
    }
}
