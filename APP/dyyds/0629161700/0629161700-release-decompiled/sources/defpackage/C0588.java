package defpackage;

/* JADX INFO: renamed from: ᛳᲈᛳᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0588 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.util.ArrayList f2955;

    public C0588(int r2) {
            r1 = this;
            switch(r2) {
                case 1: goto L3c;
                case 2: goto L2f;
                case 3: goto L24;
                case 4: goto L19;
                case 5: goto Le;
                default: goto L3;
            }
        L3:
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f2955 = r2
            return
        Le:
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f2955 = r2
            return
        L19:
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f2955 = r2
            return
        L24:
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f2955 = r2
            return
        L2f:
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 20
            r2.<init>(r0)
            r1.f2955 = r2
            return
        L3c:
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f2955 = r2
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public void m1386(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            defpackage.AbstractC0729.m1642(r1)
            defpackage.AbstractC0729.m1645(r2, r1)
            r0.m1387(r1)
            java.util.ArrayList r0 = r0.f2955
            r0.add(r1)
            java.lang.CharSequence r1 = defpackage.AbstractC1347.m2521(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public void m1387(java.lang.String r4) {
            r3 = this;
            r0 = 0
        L1:
            java.util.ArrayList r1 = r3.f2955
            int r2 = r1.size()
            if (r0 >= r2) goto L20
            java.lang.Object r2 = r1.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 == 0) goto L1d
            r1.remove(r0)
            r1.remove(r0)
            int r0 = r0 + (-2)
        L1d:
            int r0 = r0 + 2
            goto L1
        L20:
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public synchronized java.util.ArrayList m1388(java.lang.Class r5, java.lang.Class r6) {
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L11
            r0.<init>()     // Catch: java.lang.Throwable -> L11
            boolean r1 = r6.isAssignableFrom(r5)     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L13
            r0.add(r6)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r4)
            return r0
        L11:
            r5 = move-exception
            goto L4a
        L13:
            java.util.ArrayList r1 = r4.f2955     // Catch: java.lang.Throwable -> L11
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L11
        L19:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L11
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L11
            ᛷᲁᛱᲁ r2 = (defpackage.C1362) r2     // Catch: java.lang.Throwable -> L11
            java.lang.Class r3 = r2.f5959     // Catch: java.lang.Throwable -> L11
            boolean r3 = r3.isAssignableFrom(r5)     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L37
            java.lang.Class r3 = r2.f5960     // Catch: java.lang.Throwable -> L11
            boolean r3 = r6.isAssignableFrom(r3)     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L37
            r3 = 1
            goto L38
        L37:
            r3 = 0
        L38:
            if (r3 == 0) goto L19
            java.lang.Class r3 = r2.f5960     // Catch: java.lang.Throwable -> L11
            boolean r3 = r0.contains(r3)     // Catch: java.lang.Throwable -> L11
            if (r3 != 0) goto L19
            java.lang.Class r2 = r2.f5960     // Catch: java.lang.Throwable -> L11
            r0.add(r2)     // Catch: java.lang.Throwable -> L11
            goto L19
        L48:
            monitor-exit(r4)
            return r0
        L4a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            throw r5
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public synchronized defpackage.InterfaceC1091 m1389(java.lang.Class r5) {
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList r0 = r4.f2955     // Catch: java.lang.Throwable -> L1e
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L1e
            r1 = 0
        L8:
            if (r1 >= r0) goto L23
            java.util.ArrayList r2 = r4.f2955     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L1e
            ᛸᛳᛵᛳ r2 = (defpackage.C1456) r2     // Catch: java.lang.Throwable -> L1e
            java.lang.Class r3 = r2.f6399     // Catch: java.lang.Throwable -> L1e
            boolean r3 = r3.isAssignableFrom(r5)     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto L20
            ᛶᛶᛴᲁ r5 = r2.f6400     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r4)
            return r5
        L1e:
            r5 = move-exception
            goto L26
        L20:
            int r1 = r1 + 1
            goto L8
        L23:
            monitor-exit(r4)
            r4 = 0
            return r4
        L26:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            throw r5
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public java.util.List m1390() {
            r2 = this;
            java.util.ArrayList r0 = r2.f2955
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            return r2
        Lb:
            java.util.ArrayList r0 = r2.f2955
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L17
            java.util.ArrayList r2 = r2.f2955     // Catch: java.lang.Throwable -> L17
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return r1
        L17:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r2
    }
}
