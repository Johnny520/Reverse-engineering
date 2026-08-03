package a;

/* JADX INFO: loaded from: classes.dex */
public final class A2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.Object f7a;
    public java.lang.Object b;
    public java.lang.Object c;
    public java.lang.Object d;

    public A2(int r2) {
            r1 = this;
            switch(r2) {
                case 2: goto L45;
                case 3: goto L25;
                default: goto L3;
            }
        L3:
            r1.<init>()
            a.Cc r2 = new a.Cc
            r0 = 10
            r2.<init>(r0)
            r1.f7a = r2
            a.ge r2 = new a.ge
            r2.<init>()
            r1.b = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.c = r2
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1.d = r2
            return
        L25:
            r1.<init>()
            a.J1 r2 = new a.J1
            r2.<init>()
            r1.f7a = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r1.b = r2
            a.U9 r2 = new a.U9
            r2.<init>()
            r1.c = r2
            a.J1 r2 = new a.J1
            r2.<init>()
            r1.d = r2
            return
        L45:
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f7a = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.b = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.c = r2
            return
    }

    public void a(androidx.fragment.app.b r4) {
            r3 = this;
            java.lang.Object r0 = r3.f7a
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L1e
            java.lang.Object r0 = r3.f7a
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            monitor-enter(r0)
            java.lang.Object r1 = r3.f7a     // Catch: java.lang.Throwable -> L1b
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L1b
            r1.add(r4)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            r0 = 1
            r4.k = r0
            return
        L1b:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r4
        L1e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment already added: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public void b(java.lang.Object r5, java.util.ArrayList r6, java.util.HashSet r7) {
            r4 = this;
            boolean r0 = r6.contains(r5)
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r7.contains(r5)
            if (r0 != 0) goto L35
            r7.add(r5)
            java.lang.Object r0 = r4.b
            a.ge r0 = (a.C0162ge) r0
            r1 = 0
            java.lang.Object r0 = r0.getOrDefault(r5, r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L2e
            int r1 = r0.size()
            r2 = 0
        L22:
            if (r2 >= r1) goto L2e
            java.lang.Object r3 = r0.get(r2)
            r4.b(r3, r6, r7)
            int r2 = r2 + 1
            goto L22
        L2e:
            r7.remove(r5)
            r6.add(r5)
            return
        L35:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r6 = "This graph contains cyclic dependencies"
            r5.<init>(r6)
            throw r5
    }

    public androidx.fragment.app.b c(java.lang.String r2) {
            r1 = this;
            java.lang.Object r0 = r1.b
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r2 = r0.get(r2)
            androidx.fragment.app.e r2 = (androidx.fragment.app.e) r2
            if (r2 == 0) goto Lf
            androidx.fragment.app.b r2 = r2.c
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public androidx.fragment.app.b d(java.lang.String r4) {
            r3 = this;
            java.lang.Object r0 = r3.b
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.e r1 = (androidx.fragment.app.e) r1
            if (r1 == 0) goto Lc
            androidx.fragment.app.b r1 = r1.c
            java.lang.String r2 = r1.e
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L25
            goto L2d
        L25:
            a.i7 r1 = r1.v
            a.A2 r1 = r1.c
            androidx.fragment.app.b r1 = r1.d(r4)
        L2d:
            if (r1 == 0) goto Lc
            return r1
        L30:
            r4 = 0
            return r4
    }

    public java.util.ArrayList e() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = r3.b
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.e r2 = (androidx.fragment.app.e) r2
            if (r2 == 0) goto L11
            r0.add(r2)
            goto L11
        L23:
            return r0
    }

    public java.util.ArrayList f() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = r3.b
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.e r2 = (androidx.fragment.app.e) r2
            if (r2 == 0) goto L25
            androidx.fragment.app.b r2 = r2.c
            r0.add(r2)
            goto L11
        L25:
            r2 = 0
            r0.add(r2)
            goto L11
        L2a:
            return r0
    }

    public java.util.List g() {
            r3 = this;
            java.lang.Object r0 = r3.f7a
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
        Ld:
            java.lang.Object r0 = r3.f7a
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r2 = r3.f7a     // Catch: java.lang.Throwable -> L1d
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L1d
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return r1
        L1d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r1
    }

    public void h(androidx.fragment.app.e r4) {
            r3 = this;
            androidx.fragment.app.b r0 = r4.c
            java.lang.String r1 = r0.e
            java.lang.Object r2 = r3.b
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r1 = r2.get(r1)
            if (r1 == 0) goto Lf
            return
        Lf:
            java.lang.String r1 = r0.e
            r2.put(r1, r4)
            r4 = 2
            boolean r4 = a.AbstractC0119e7.J(r4)
            if (r4 == 0) goto L2e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "Added fragment to active set "
            r4.<init>(r1)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r4)
        L2e:
            return
    }

    public void i(androidx.fragment.app.e r4) {
            r3 = this;
            androidx.fragment.app.b r0 = r4.c
            boolean r1 = r0.C
            if (r1 == 0) goto Ld
            java.lang.Object r1 = r3.d
            a.k7 r1 = (a.C0226k7) r1
            r1.f(r0)
        Ld:
            java.lang.Object r1 = r3.b
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r2 = r0.e
            java.lang.Object r2 = r1.get(r2)
            if (r2 == r4) goto L1a
            goto L40
        L1a:
            java.lang.String r4 = r0.e
            r2 = 0
            java.lang.Object r4 = r1.put(r4, r2)
            androidx.fragment.app.e r4 = (androidx.fragment.app.e) r4
            if (r4 != 0) goto L26
            goto L40
        L26:
            r4 = 2
            boolean r4 = a.AbstractC0119e7.J(r4)
            if (r4 == 0) goto L40
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "Removed fragment from active set "
            r4.<init>(r1)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r4)
        L40:
            return
    }

    public android.os.Bundle j(java.lang.String r2, android.os.Bundle r3) {
            r1 = this;
            java.lang.Object r0 = r1.c
            java.util.HashMap r0 = (java.util.HashMap) r0
            if (r3 == 0) goto Ld
            java.lang.Object r2 = r0.put(r2, r3)
            android.os.Bundle r2 = (android.os.Bundle) r2
            return r2
        Ld:
            java.lang.Object r2 = r0.remove(r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            return r2
    }
}
