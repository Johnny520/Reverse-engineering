package gg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements mg.b, gg.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.Map f4554b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Class f4555a;

    static {
            java.lang.Class<fg.n> r22 = fg.n.class
            java.lang.Class<fg.o> r23 = fg.o.class
            java.lang.Class<fg.a> r1 = fg.a.class
            java.lang.Class<fg.l> r2 = fg.l.class
            java.lang.Class<fg.p> r3 = fg.p.class
            java.lang.Class<fg.q> r4 = fg.q.class
            java.lang.Class<fg.r> r5 = fg.r.class
            java.lang.Class<fg.s> r6 = fg.s.class
            java.lang.Class<fg.t> r7 = fg.t.class
            java.lang.Class<fg.u> r8 = fg.u.class
            java.lang.Class<fg.v> r9 = fg.v.class
            java.lang.Class<fg.w> r10 = fg.w.class
            java.lang.Class<fg.b> r11 = fg.b.class
            java.lang.Class<fg.c> r12 = fg.c.class
            java.lang.Class<fg.d> r13 = fg.d.class
            java.lang.Class<fg.e> r14 = fg.e.class
            java.lang.Class<fg.f> r15 = fg.f.class
            java.lang.Class<fg.g> r16 = fg.g.class
            java.lang.Class<fg.h> r17 = fg.h.class
            java.lang.Class<fg.i> r18 = fg.i.class
            java.lang.Class<fg.j> r19 = fg.j.class
            java.lang.Class<fg.k> r20 = fg.k.class
            java.lang.Class<fg.m> r21 = fg.m.class
            java.lang.Class[] r0 = new java.lang.Class[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23}
            java.util.List r0 = a.a.y0(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = tf.n.e1(r0)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L44:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L67
            java.lang.Object r3 = r0.next()
            int r4 = r2 + 1
            if (r2 < 0) goto L62
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            sf.e r5 = new sf.e
            r5.<init>(r3, r2)
            r1.add(r5)
            r2 = r4
            goto L44
        L62:
            a.a.Q0()
            r0 = 0
            throw r0
        L67:
            java.util.Map r0 = tf.y.e0(r1)
            gg.f.f4554b = r0
            return
    }

    public f(java.lang.Class r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f4555a = r1
            return
    }

    @Override // gg.e
    public final java.lang.Class a() {
            r1 = this;
            java.lang.Class r0 = r1.f4555a
            return r0
    }

    public final java.lang.String b() {
            r3 = this;
            java.lang.Class r0 = r3.f4555a
            r0.getClass()
            boolean r1 = r0.isAnonymousClass()
            r2 = 0
            if (r1 == 0) goto Ld
            goto L13
        Ld:
            boolean r1 = r0.isLocalClass()
            if (r1 == 0) goto L14
        L13:
            return r2
        L14:
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L3a
            java.lang.Class r0 = r0.getComponentType()
            boolean r1 = r0.isPrimitive()
            if (r1 == 0) goto L34
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = gg.l.b(r0)
            if (r0 == 0) goto L34
            java.lang.String r1 = "Array"
            java.lang.String r2 = r0.concat(r1)
        L34:
            if (r2 != 0) goto L39
            java.lang.String r0 = "kotlin.Array"
            return r0
        L39:
            return r2
        L3a:
            java.lang.String r1 = r0.getName()
            java.lang.String r1 = gg.l.b(r1)
            if (r1 != 0) goto L49
            java.lang.String r0 = r0.getCanonicalName()
            return r0
        L49:
            return r1
    }

    public final java.lang.String c() {
            r4 = this;
            java.lang.Class r0 = r4.f4555a
            r0.getClass()
            boolean r1 = r0.isAnonymousClass()
            r2 = 0
            if (r1 == 0) goto Ld
            return r2
        Ld:
            boolean r1 = r0.isLocalClass()
            if (r1 == 0) goto L5a
            java.lang.String r1 = r0.getSimpleName()
            java.lang.reflect.Method r2 = r0.getEnclosingMethod()
            r3 = 36
            if (r2 == 0) goto L37
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = og.m.K0(r1, r0)
            return r0
        L37:
            java.lang.reflect.Constructor r0 = r0.getEnclosingConstructor()
            if (r0 == 0) goto L55
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = r0.getName()
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = og.m.K0(r1, r0)
            return r0
        L55:
            java.lang.String r0 = og.m.J0(r1, r3, r1)
            return r0
        L5a:
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L7e
            java.lang.Class r0 = r0.getComponentType()
            boolean r1 = r0.isPrimitive()
            java.lang.String r3 = "Array"
            if (r1 == 0) goto L7a
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = gg.l.f(r0)
            if (r0 == 0) goto L7a
            java.lang.String r2 = r0.concat(r3)
        L7a:
            if (r2 != 0) goto L7d
            return r3
        L7d:
            return r2
        L7e:
            java.lang.String r1 = r0.getName()
            java.lang.String r1 = gg.l.f(r1)
            if (r1 != 0) goto L8d
            java.lang.String r0 = r0.getSimpleName()
            return r0
        L8d:
            return r1
    }

    public final boolean d(java.lang.Object r3) {
            r2 = this;
            java.lang.Class r0 = r2.f4555a
            r0.getClass()
            java.util.Map r1 = gg.f.f4554b
            r1.getClass()
            java.lang.Object r1 = r1.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L1b
            int r0 = r1.intValue()
            boolean r3 = gg.x.d(r0, r3)
            return r3
        L1b:
            boolean r1 = r0.isPrimitive()
            if (r1 == 0) goto L29
            gg.f r0 = gg.v.a(r0)
            java.lang.Class r0 = a.a.Z(r0)
        L29:
            boolean r3 = r0.isInstance(r3)
            return r3
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof gg.f
            if (r0 == 0) goto L16
            java.lang.Class r0 = a.a.Z(r1)
            mg.b r2 = (mg.b) r2
            java.lang.Class r2 = a.a.Z(r2)
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L16
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.Class r0 = a.a.Z(r1)
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.f4555a
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = " (Kotlin reflection is not available)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
