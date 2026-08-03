package lh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements java.io.Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f8063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f8064h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f8065i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.String f8066j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final sf.i f8067k;

    public d(java.lang.String r9) {
            r8 = this;
            r9.getClass()
            r8.<init>()
            d1.c0 r0 = new d1.c0
            r1 = 8
            r0.<init>(r8, r1)
            sf.i r1 = new sf.i
            r1.<init>(r0)
            r8.f8067k = r1
            java.lang.String r0 = "->"
            r1 = 6
            r2 = 0
            int r0 = og.m.r0(r9, r0, r2, r2, r1)
            int r1 = r0 + 1
            java.lang.String r3 = "("
            r4 = 4
            int r1 = og.m.r0(r9, r3, r1, r2, r4)
            int r3 = r1 + 1
            java.lang.String r5 = ")"
            int r5 = og.m.r0(r9, r5, r3, r2, r4)
            r6 = -1
            if (r0 == r6) goto L95
            if (r1 == r6) goto L95
            if (r5 == r6) goto L95
            java.lang.String r6 = r9.substring(r2, r0)
            java.lang.String r6 = kh.b.e(r6)
            r8.f8063g = r6
            int r0 = r0 + 2
            java.lang.String r0 = r9.substring(r0, r1)
            r8.f8064h = r0
            java.lang.String r0 = r9.substring(r3, r5)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L4f:
            r3 = r2
        L50:
            int r6 = r0.length()
            if (r2 >= r6) goto L79
            char r6 = r0.charAt(r2)
            r7 = 91
            if (r6 != r7) goto L61
            int r2 = r2 + 1
            goto L50
        L61:
            r7 = 76
            if (r6 != r7) goto L6b
            r6 = 59
            int r2 = og.m.q0(r0, r6, r2, r4)
        L6b:
            int r2 = r2 + 1
            java.lang.String r3 = r0.substring(r3, r2)
            java.lang.String r3 = kh.b.e(r3)
            r1.add(r3)
            goto L4f
        L79:
            if (r3 != r2) goto L8a
            r8.f8065i = r1
            int r5 = r5 + 1
            java.lang.String r9 = r9.substring(r5)
            java.lang.String r9 = kh.b.e(r9)
            r8.f8066j = r9
            return
        L8a:
            java.lang.String r9 = "Unknown signString: "
            java.lang.String r9 = r9.concat(r0)
            j8.o.A(r9)
            r9 = 0
            throw r9
        L95:
            java.lang.IllegalAccessError r0 = new java.lang.IllegalAccessError
            java.lang.String r1 = "not method descriptor: "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
    }

    public final java.lang.reflect.Constructor a(java.lang.ClassLoader r7) {
            r6 = this;
            r7.getClass()
            java.lang.String r0 = r6.f8064h
            java.lang.String r1 = "<init>"
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L7d
            java.lang.String r0 = r6.f8063g     // Catch: java.lang.ClassNotFoundException -> L3a
            java.lang.Class r7 = r7.loadClass(r0)     // Catch: java.lang.ClassNotFoundException -> L3a
        L13:
            java.lang.reflect.Constructor[] r0 = r7.getDeclaredConstructors()     // Catch: java.lang.ClassNotFoundException -> L3a
            r0.getClass()     // Catch: java.lang.ClassNotFoundException -> L3a
            int r1 = r0.length     // Catch: java.lang.ClassNotFoundException -> L3a
            r2 = 0
        L1c:
            if (r2 >= r1) goto L3f
            r3 = r0[r2]     // Catch: java.lang.ClassNotFoundException -> L3a
            sf.i r4 = r6.f8067k     // Catch: java.lang.ClassNotFoundException -> L3a
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.ClassNotFoundException -> L3a
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.ClassNotFoundException -> L3a
            r3.getClass()     // Catch: java.lang.ClassNotFoundException -> L3a
            java.lang.String r5 = kh.b.a(r3)     // Catch: java.lang.ClassNotFoundException -> L3a
            boolean r4 = gg.l.a(r4, r5)     // Catch: java.lang.ClassNotFoundException -> L3a
            if (r4 == 0) goto L3c
            r7 = 1
            r3.setAccessible(r7)     // Catch: java.lang.ClassNotFoundException -> L3a
            return r3
        L3a:
            r7 = move-exception
            goto L62
        L3c:
            int r2 = r2 + 1
            goto L1c
        L3f:
            java.lang.Class r7 = r7.getSuperclass()     // Catch: java.lang.ClassNotFoundException -> L3a
            if (r7 == 0) goto L46
            goto L13
        L46:
            java.lang.NoSuchMethodException r7 = new java.lang.NoSuchMethodException     // Catch: java.lang.ClassNotFoundException -> L3a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L3a
            r0.<init>()     // Catch: java.lang.ClassNotFoundException -> L3a
            java.lang.String r1 = "Constructor "
            r0.append(r1)     // Catch: java.lang.ClassNotFoundException -> L3a
            r0.append(r6)     // Catch: java.lang.ClassNotFoundException -> L3a
            java.lang.String r1 = " not found"
            r0.append(r1)     // Catch: java.lang.ClassNotFoundException -> L3a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.ClassNotFoundException -> L3a
            r7.<init>(r0)     // Catch: java.lang.ClassNotFoundException -> L3a
            throw r7     // Catch: java.lang.ClassNotFoundException -> L3a
        L62:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No such method: "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r7 = r0.initCause(r7)
            r7.getClass()
            throw r7
        L7d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r1 = " not a constructor"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
    }

    public final java.lang.reflect.Method b(java.lang.ClassLoader r8) {
            r7 = this;
            r8.getClass()
            java.lang.String r0 = "<clinit>"
            java.lang.String r1 = r7.f8064h
            boolean r0 = gg.l.a(r1, r0)
            if (r0 != 0) goto L8c
            java.lang.String r0 = "<init>"
            boolean r0 = gg.l.a(r1, r0)
            if (r0 != 0) goto L8c
            java.lang.String r0 = r7.f8063g     // Catch: java.lang.ClassNotFoundException -> L49
            java.lang.Class r8 = r8.loadClass(r0)     // Catch: java.lang.ClassNotFoundException -> L49
        L1b:
            java.lang.reflect.Method[] r0 = r8.getDeclaredMethods()     // Catch: java.lang.ClassNotFoundException -> L49
            r0.getClass()     // Catch: java.lang.ClassNotFoundException -> L49
            int r2 = r0.length     // Catch: java.lang.ClassNotFoundException -> L49
            r3 = 0
        L24:
            if (r3 >= r2) goto L4e
            r4 = r0[r3]     // Catch: java.lang.ClassNotFoundException -> L49
            java.lang.String r5 = r4.getName()     // Catch: java.lang.ClassNotFoundException -> L49
            boolean r5 = gg.l.a(r5, r1)     // Catch: java.lang.ClassNotFoundException -> L49
            if (r5 == 0) goto L4b
            sf.i r5 = r7.f8067k     // Catch: java.lang.ClassNotFoundException -> L49
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.ClassNotFoundException -> L49
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.ClassNotFoundException -> L49
            java.lang.String r6 = kh.b.c(r4)     // Catch: java.lang.ClassNotFoundException -> L49
            boolean r5 = gg.l.a(r5, r6)     // Catch: java.lang.ClassNotFoundException -> L49
            if (r5 == 0) goto L4b
            r8 = 1
            r4.setAccessible(r8)     // Catch: java.lang.ClassNotFoundException -> L49
            return r4
        L49:
            r8 = move-exception
            goto L71
        L4b:
            int r3 = r3 + 1
            goto L24
        L4e:
            java.lang.Class r8 = r8.getSuperclass()     // Catch: java.lang.ClassNotFoundException -> L49
            if (r8 == 0) goto L55
            goto L1b
        L55:
            java.lang.NoSuchMethodException r8 = new java.lang.NoSuchMethodException     // Catch: java.lang.ClassNotFoundException -> L49
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L49
            r0.<init>()     // Catch: java.lang.ClassNotFoundException -> L49
            java.lang.String r1 = "Method "
            r0.append(r1)     // Catch: java.lang.ClassNotFoundException -> L49
            r0.append(r7)     // Catch: java.lang.ClassNotFoundException -> L49
            java.lang.String r1 = " not found"
            r0.append(r1)     // Catch: java.lang.ClassNotFoundException -> L49
            java.lang.String r0 = r0.toString()     // Catch: java.lang.ClassNotFoundException -> L49
            r8.<init>(r0)     // Catch: java.lang.ClassNotFoundException -> L49
            throw r8     // Catch: java.lang.ClassNotFoundException -> L49
        L71:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No such method: "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r8 = r0.initCause(r8)
            r8.getClass()
            throw r8
        L8c:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r1 = " not a method"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L32
        L3:
            boolean r0 = r3 instanceof lh.d
            if (r0 != 0) goto L8
            goto L34
        L8:
            lh.d r3 = (lh.d) r3
            java.lang.String r0 = r3.f8063g
            java.lang.String r1 = r2.f8063g
            boolean r0 = gg.l.a(r1, r0)
            if (r0 == 0) goto L34
            java.lang.String r0 = r2.f8064h
            java.lang.String r1 = r3.f8064h
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L34
            java.util.ArrayList r0 = r2.f8065i
            java.util.ArrayList r1 = r3.f8065i
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L34
            java.lang.String r0 = r2.f8066j
            java.lang.String r3 = r3.f8066j
            boolean r3 = gg.l.a(r0, r3)
            if (r3 == 0) goto L34
        L32:
            r3 = 1
            return r3
        L34:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f8063g
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.f8064h
            int r1 = r1.hashCode()
            int r1 = r1 * 31
            int r1 = r1 + r0
            java.util.ArrayList r0 = r2.f8065i
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r0 = r0 + r1
            java.lang.String r1 = r2.f8066j
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.f8063g
            java.lang.String r1 = kh.b.g(r1)
            r0.append(r1)
            java.lang.String r1 = "->"
            r0.append(r1)
            java.lang.String r1 = r2.f8064h
            r0.append(r1)
            sf.i r1 = r2.f8067k
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
