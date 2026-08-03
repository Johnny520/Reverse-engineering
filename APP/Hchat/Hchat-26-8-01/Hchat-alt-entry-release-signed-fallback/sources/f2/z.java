package f2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.Comparator[] f3255a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f2.k f3256b = null;

    static {
            r0 = 2
            java.util.Comparator[] r1 = new java.util.Comparator[r0]
            r2 = 0
        L4:
            if (r2 >= r0) goto L1e
            if (r2 != 0) goto Lb
            f2.g r3 = f2.g.f3148i
            goto Ld
        Lb:
            f2.g r3 = f2.g.f3147h
        Ld:
            c9.a0 r4 = new c9.a0
            r4.<init>(r3)
            c9.a0 r3 = new c9.a0
            r5 = 9
            r3.<init>(r4, r5)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L4
        L1e:
            f2.z.f3255a = r1
            f2.k r0 = f2.k.B
            f2.z.f3256b = r0
            return
    }

    public static final void a(f2.q r3, java.util.ArrayList r4, b1.f r5, b1.f r6, f.w r7) {
            f2.m r0 = r3.f3213d
            f2.x r1 = f2.u.f3235m
            f.k0 r0 = r0.f3204g
            java.lang.Object r0 = r0.g(r1)
            if (r0 != 0) goto Le
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        Le:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L22
            java.lang.Object r1 = r6.invoke(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L31
        L22:
            java.lang.Object r1 = r5.invoke(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L31
            r4.add(r3)
        L31:
            r1 = 7
            if (r0 == 0) goto L42
            int r4 = r3.f3215f
            java.util.List r0 = f2.q.j(r1, r3)
            java.util.ArrayList r3 = b(r3, r5, r6, r0)
            r7.h(r4, r3)
            return
        L42:
            java.util.List r3 = f2.q.j(r1, r3)
            int r0 = r3.size()
            r1 = 0
        L4b:
            if (r1 >= r0) goto L59
            java.lang.Object r2 = r3.get(r1)
            f2.q r2 = (f2.q) r2
            a(r2, r4, r5, r6, r7)
            int r1 = r1 + 1
            goto L4b
        L59:
            return
    }

    public static final java.util.ArrayList b(f2.q r17, b1.f r18, b1.f r19, java.util.List r20) {
            r0 = r19
            f.w r1 = f.l.f2854a
            f.w r1 = new f.w
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r20.size()
            r5 = 0
        L13:
            if (r5 >= r3) goto L25
            r6 = r20
            java.lang.Object r7 = r6.get(r5)
            f2.q r7 = (f2.q) r7
            r8 = r18
            a(r7, r2, r8, r0, r1)
            int r5 = r5 + 1
            goto L13
        L25:
            r5 = r17
            x1.f0 r3 = r5.f3212c
            u2.m r3 = r3.F
            u2.m r5 = u2.m.f13355h
            r6 = 1
            if (r3 != r5) goto L32
            r3 = r6
            goto L33
        L32:
            r3 = 0
        L33:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r7 = r2.size()
            int r7 = r7 / 2
            r5.<init>(r7)
            int r7 = r2.size()
            int r7 = r7 - r6
            if (r7 < 0) goto Lf3
            r8 = 0
        L46:
            java.lang.Object r9 = r2.get(r8)
            f2.q r9 = (f2.q) r9
            if (r8 == 0) goto Ld5
            e1.c r10 = r9.h()
            float r10 = r10.f2297b
            e1.c r11 = r9.h()
            float r11 = r11.f2299d
            int r12 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r12 < 0) goto L60
            r12 = r6
            goto L61
        L60:
            r12 = 0
        L61:
            int r13 = r5.size()
            int r13 = r13 - r6
            if (r13 < 0) goto Ld5
            r14 = 0
        L69:
            java.lang.Object r15 = r5.get(r14)
            sf.e r15 = (sf.e) r15
            java.lang.Object r15 = r15.f12418g
            e1.c r15 = (e1.c) r15
            float r4 = r15.f2297b
            r17 = r6
            float r6 = r15.f2299d
            int r16 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r16 < 0) goto L80
            r16 = r17
            goto L82
        L80:
            r16 = 0
        L82:
            if (r12 != 0) goto Lce
            if (r16 != 0) goto Lce
            float r4 = java.lang.Math.max(r10, r4)
            float r16 = java.lang.Math.min(r11, r6)
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 >= 0) goto Lce
            e1.c r4 = new e1.c
            float r12 = r15.f2296a
            r13 = 0
            float r12 = java.lang.Math.max(r12, r13)
            float r13 = r15.f2297b
            float r10 = java.lang.Math.max(r13, r10)
            float r13 = r15.f2298c
            r15 = 2139095040(0x7f800000, float:Infinity)
            float r13 = java.lang.Math.min(r13, r15)
            float r6 = java.lang.Math.min(r6, r11)
            r4.<init>(r12, r10, r13, r6)
            sf.e r6 = new sf.e
            java.lang.Object r10 = r5.get(r14)
            sf.e r10 = (sf.e) r10
            java.lang.Object r10 = r10.f12419h
            r6.<init>(r4, r10)
            r5.set(r14, r6)
            java.lang.Object r4 = r5.get(r14)
            sf.e r4 = (sf.e) r4
            java.lang.Object r4 = r4.f12419h
            java.util.List r4 = (java.util.List) r4
            r4.add(r9)
            goto Leb
        Lce:
            if (r14 == r13) goto Ld7
            int r14 = r14 + 1
            r6 = r17
            goto L69
        Ld5:
            r17 = r6
        Ld7:
            e1.c r4 = r9.h()
            sf.e r6 = new sf.e
            f2.q[] r9 = new f2.q[]{r9}
            java.util.ArrayList r9 = a.a.C0(r9)
            r6.<init>(r4, r9)
            r5.add(r6)
        Leb:
            if (r8 == r7) goto Lf5
            int r8 = r8 + 1
            r6 = r17
            goto L46
        Lf3:
            r17 = r6
        Lf5:
            f2.g r2 = f2.g.f3149j
            tf.q.g1(r5, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Comparator[] r4 = f2.z.f3255a
            r3 = r3 ^ 1
            r3 = r4[r3]
            int r4 = r5.size()
            r6 = 0
        L10a:
            if (r6 >= r4) goto L123
            java.lang.Object r7 = r5.get(r6)
            sf.e r7 = (sf.e) r7
            java.lang.Object r8 = r7.f12419h
            java.util.List r8 = (java.util.List) r8
            tf.q.g1(r8, r3)
            java.lang.Object r7 = r7.f12419h
            java.util.Collection r7 = (java.util.Collection) r7
            r2.addAll(r7)
            int r6 = r6 + 1
            goto L10a
        L123:
            ce.b r3 = new ce.b
            f2.k r4 = f2.z.f3256b
            r5 = r17
            r3.<init>(r4, r5)
            tf.q.g1(r2, r3)
            r4 = 0
        L130:
            int r3 = r2.size()
            int r3 = r3 - r5
            if (r4 > r3) goto L169
            java.lang.Object r3 = r2.get(r4)
            f2.q r3 = (f2.q) r3
            int r3 = r3.f3215f
            java.lang.Object r3 = r1.b(r3)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L166
            java.lang.Object r6 = r2.get(r4)
            java.lang.Object r6 = r0.invoke(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L15b
            r2.remove(r4)
            goto L15d
        L15b:
            int r4 = r4 + 1
        L15d:
            r2.addAll(r4, r3)
            int r3 = r3.size()
            int r4 = r4 + r3
            goto L130
        L166:
            int r4 = r4 + 1
            goto L130
        L169:
            return r2
    }
}
