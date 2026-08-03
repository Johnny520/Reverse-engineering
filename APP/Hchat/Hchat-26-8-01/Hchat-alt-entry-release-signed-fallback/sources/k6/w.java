package k6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements h6.o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h0.q0 f7380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j6.d f7382i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k6.l f7383j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f7384k;

    public w(h0.q0 r1, int r2, j6.d r3, k6.l r4, java.util.ArrayList r5) {
            r0 = this;
            r0.<init>()
            r0.f7380g = r1
            r0.f7381h = r2
            r0.f7382i = r3
            r0.f7383j = r4
            r0.f7384k = r5
            return
    }

    public static void b(java.lang.Class r3, java.lang.String r4, java.lang.reflect.Field r5, java.lang.reflect.Field r6) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Class "
            r1.<init>(r2)
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = " declares multiple JSON fields named '"
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = "'; conflict is caused by fields "
            r1.append(r3)
            java.lang.String r3 = l6.c.c(r5)
            r1.append(r3)
            java.lang.String r3 = " and "
            r1.append(r3)
            java.lang.String r3 = l6.c.c(r6)
            r1.append(r3)
            java.lang.String r3 = "\nSee "
            r1.append(r3)
            java.lang.String r3 = "duplicate-fields"
            java.lang.String r4 = "https://github.com/google/gson/blob/main/Troubleshooting.md#"
            java.lang.String r3 = r4.concat(r3)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @Override // h6.o
    public final h6.n a(h6.f r4, n6.a r5) {
            r3 = this;
            java.lang.Class r0 = r5.f9028a
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r1.isAssignableFrom(r0)
            if (r1 != 0) goto Lc
            r4 = 0
            return r4
        Lc:
            f8.i r1 = l6.c.f7868a
            int r1 = r0.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            r2 = 1
            if (r1 != 0) goto L2b
            boolean r1 = r0.isAnonymousClass()
            if (r1 != 0) goto L25
            boolean r1 = r0.isLocalClass()
            if (r1 == 0) goto L2b
        L25:
            k6.o r4 = new k6.o
            r4.<init>(r2)
            return r4
        L2b:
            java.util.ArrayList r1 = r3.f7384k
            j6.h.d(r1)
            f8.i r1 = l6.c.f7868a
            boolean r1 = r1.X(r0)
            if (r1 == 0) goto L42
            k6.v r1 = new k6.v
            k6.u r4 = r3.c(r4, r5, r0, r2)
            r1.<init>(r0, r4)
            return r1
        L42:
            h0.q0 r1 = r3.f7380g
            r1.c(r5, r2)
            k6.t r1 = new k6.t
            r2 = 0
            k6.u r4 = r3.c(r4, r5, r0, r2)
            r1.<init>(r4)
            return r1
    }

    public final k6.u c(h6.f r24, n6.a r25, java.lang.Class r26, boolean r27) {
            r23 = this;
            r0 = r23
            r7 = r26
            boolean r1 = r7.isInterface()
            if (r1 == 0) goto Ld
            k6.u r1 = k6.u.f7371b
            return r1
        Ld:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            r1 = r25
            r10 = r7
        L1a:
            java.lang.reflect.Type r11 = r1.f9029b
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r10 == r1) goto L218
            java.lang.reflect.Field[] r12 = r10.getDeclaredFields()
            if (r10 == r7) goto L2e
            int r1 = r12.length
            if (r1 <= 0) goto L2e
            java.util.ArrayList r1 = r0.f7384k
            j6.h.d(r1)
        L2e:
            int r13 = r12.length
            r14 = 0
            r15 = r14
        L31:
            if (r15 >= r13) goto L1fe
            r1 = r12[r15]
            r2 = 1
            boolean r16 = r0.d(r1, r2)
            boolean r3 = r0.d(r1, r14)
            if (r16 != 0) goto L4c
            if (r3 != 0) goto L4c
            r3 = r24
            r25 = r12
            r20 = r13
            r21 = r14
            goto L1f2
        L4c:
            java.lang.Class<i6.b> r4 = i6.b.class
            r17 = 0
            if (r27 == 0) goto L8c
            int r5 = r1.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            if (r5 == 0) goto L61
            r18 = r14
        L5e:
            r5 = r17
            goto L8f
        L61:
            f8.i r5 = l6.c.f7868a
            java.lang.reflect.Method r5 = r5.x(r10, r1)
            l6.c.f(r5)
            java.lang.annotation.Annotation r6 = r5.getAnnotation(r4)
            if (r6 == 0) goto L89
            java.lang.annotation.Annotation r6 = r1.getAnnotation(r4)
            if (r6 == 0) goto L77
            goto L89
        L77:
            java.lang.String r1 = l6.c.d(r5, r14)
            af.d r2 = new af.d
            java.lang.String r3 = "@SerializedName on "
            java.lang.String r4 = " is not supported"
            java.lang.String r1 = eh.a.n(r3, r1, r4)
            r2.<init>(r1)
            throw r2
        L89:
            r18 = r3
            goto L8f
        L8c:
            r18 = r3
            goto L5e
        L8f:
            if (r5 != 0) goto L94
            l6.c.f(r1)
        L94:
            java.lang.reflect.Type r3 = r1.getGenericType()
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.lang.reflect.Type r3 = j6.h.h(r11, r10, r3, r6)
            java.lang.annotation.Annotation r4 = r1.getAnnotation(r4)
            i6.b r4 = (i6.b) r4
            if (r4 != 0) goto L111
            int r4 = r0.f7381h
            switch(r4) {
                case 1: goto L10a;
                case 2: goto L101;
                case 3: goto Lf2;
                case 4: goto Le1;
                case 5: goto Ld0;
                case 6: goto Lbf;
                default: goto Lae;
            }
        Lae:
            java.lang.String r4 = r1.getName()
            r6 = 46
            java.lang.String r4 = eh.a.a(r4, r6)
            java.util.Locale r6 = java.util.Locale.ENGLISH
            java.lang.String r4 = r4.toLowerCase(r6)
            goto L10e
        Lbf:
            java.lang.String r4 = r1.getName()
            r6 = 45
            java.lang.String r4 = eh.a.a(r4, r6)
            java.util.Locale r6 = java.util.Locale.ENGLISH
            java.lang.String r4 = r4.toLowerCase(r6)
            goto L10e
        Ld0:
            java.lang.String r4 = r1.getName()
            r6 = 95
            java.lang.String r4 = eh.a.a(r4, r6)
            java.util.Locale r6 = java.util.Locale.ENGLISH
            java.lang.String r4 = r4.toLowerCase(r6)
            goto L10e
        Le1:
            java.lang.String r4 = r1.getName()
            r6 = 95
            java.lang.String r4 = eh.a.a(r4, r6)
            java.util.Locale r6 = java.util.Locale.ENGLISH
            java.lang.String r4 = r4.toUpperCase(r6)
            goto L10e
        Lf2:
            java.lang.String r4 = r1.getName()
            r6 = 32
            java.lang.String r4 = eh.a.a(r4, r6)
            java.lang.String r4 = eh.a.b(r4)
            goto L10e
        L101:
            java.lang.String r4 = r1.getName()
            java.lang.String r4 = eh.a.b(r4)
            goto L10e
        L10a:
            java.lang.String r4 = r1.getName()
        L10e:
            java.util.List r6 = java.util.Collections.EMPTY_LIST
            goto L122
        L111:
            java.lang.String r6 = r4.value()
            java.lang.String[] r4 = r4.alternate()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r22 = r6
            r6 = r4
            r4 = r22
        L122:
            boolean r19 = r6.isEmpty()
            if (r19 == 0) goto L131
            java.util.List r4 = java.util.Collections.singletonList(r4)
            r25 = r2
            r2 = r14
            r14 = r4
            goto L146
        L131:
            r25 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            int r19 = r6.size()
            int r14 = r19 + 1
            r2.<init>(r14)
            r2.add(r4)
            r2.addAll(r6)
            r14 = r2
            r2 = 0
        L146:
            java.lang.Object r4 = r14.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            r6 = r4
            n6.a r4 = new n6.a
            r4.<init>(r3)
            java.lang.Class r3 = r4.f9028a
            if (r3 == 0) goto L15a
            boolean r3 = r3.isPrimitive()
        L15a:
            int r3 = r1.getModifiers()
            boolean r19 = java.lang.reflect.Modifier.isStatic(r3)
            if (r19 == 0) goto L168
            boolean r3 = java.lang.reflect.Modifier.isFinal(r3)
        L168:
            java.lang.Class<i6.a> r3 = i6.a.class
            java.lang.annotation.Annotation r3 = r1.getAnnotation(r3)
            i6.a r3 = (i6.a) r3
            if (r3 == 0) goto L192
            r20 = r2
            h0.q0 r2 = r0.f7380g
            r19 = r6
            r6 = 0
            r21 = r1
            k6.l r1 = r0.f7383j
            r0 = r21
            r21 = r20
            r20 = r13
            r13 = r19
            r19 = r25
            r25 = r12
            r12 = r5
            r5 = r3
            r3 = r24
            h6.n r1 = r1.b(r2, r3, r4, r5, r6)
            goto L1a1
        L192:
            r3 = r24
            r19 = r25
            r0 = r1
            r21 = r2
            r25 = r12
            r20 = r13
            r12 = r5
            r13 = r6
            r1 = r17
        L1a1:
            if (r1 == 0) goto L1a6
            r2 = r19
            goto L1a8
        L1a6:
            r2 = r21
        L1a8:
            if (r1 != 0) goto L1ae
            h6.n r1 = r3.b(r4)
        L1ae:
            if (r16 == 0) goto L1bb
            if (r2 == 0) goto L1b3
            goto L1bb
        L1b3:
            k6.y r2 = new k6.y
            java.lang.reflect.Type r4 = r4.f9029b
            r2.<init>(r3, r1, r4)
            r1 = r2
        L1bb:
            k6.r r2 = new k6.r
            r2.<init>(r13, r0, r12, r1)
            if (r18 == 0) goto L1e1
            java.util.Iterator r1 = r14.iterator()
        L1c6:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L1e1
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r8.put(r4, r2)
            k6.r r5 = (k6.r) r5
            if (r5 != 0) goto L1db
            goto L1c6
        L1db:
            java.lang.reflect.Field r1 = r5.f7364b
            b(r7, r4, r1, r0)
            throw r17
        L1e1:
            if (r16 == 0) goto L1f2
            java.lang.Object r1 = r9.put(r13, r2)
            k6.r r1 = (k6.r) r1
            if (r1 != 0) goto L1ec
            goto L1f2
        L1ec:
            java.lang.reflect.Field r1 = r1.f7364b
            b(r7, r13, r1, r0)
            throw r17
        L1f2:
            int r15 = r15 + 1
            r0 = r23
            r12 = r25
            r13 = r20
            r14 = r21
            goto L31
        L1fe:
            r3 = r24
            java.lang.reflect.Type r0 = r10.getGenericSuperclass()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.reflect.Type r0 = j6.h.h(r11, r10, r0, r1)
            n6.a r1 = new n6.a
            r1.<init>(r0)
            java.lang.Class r10 = r1.f9028a
            r0 = r23
            goto L1a
        L218:
            k6.u r0 = new k6.u
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Collection r2 = r9.values()
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public final boolean d(java.lang.reflect.Field r4, boolean r5) {
            r3 = this;
            j6.d r0 = r3.f7382i
            r0.getClass()
            r1 = 136(0x88, float:1.9E-43)
            int r2 = r4.getModifiers()
            r1 = r1 & r2
            r2 = 1
            if (r1 == 0) goto L11
        Lf:
            r4 = r2
            goto L48
        L11:
            boolean r1 = r4.isSynthetic()
            if (r1 == 0) goto L18
            goto Lf
        L18:
            java.lang.Class r4 = r4.getType()
            boolean r4 = r0.c(r4, r5)
            if (r4 == 0) goto L23
            goto Lf
        L23:
            if (r5 == 0) goto L28
            java.util.List r4 = r0.f6725h
            goto L2a
        L28:
            java.util.List r4 = r0.f6726i
        L2a:
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L47
            java.util.Iterator r4 = r4.iterator()
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L3b
            goto L47
        L3b:
            java.lang.Object r4 = r4.next()
            r4.getClass()
            ah.a.d()
            r4 = 0
            return r4
        L47:
            r4 = 0
        L48:
            r4 = r4 ^ r2
            return r4
    }
}
