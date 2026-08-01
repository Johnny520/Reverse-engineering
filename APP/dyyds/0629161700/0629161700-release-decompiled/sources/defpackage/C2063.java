package defpackage;

/* JADX INFO: renamed from: ᲇᛶᛳᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2063 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final int f8865;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.util.HashMap f8866;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.util.HashMap f8867;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C0682 f8868;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0325 f8869;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f8870;

    public C2063(int r3) {
            r2 = this;
            r2.<init>()
            ᛴᛵᲇᲇ r0 = new ᛴᛵᲇᲇ
            r1 = 25
            r0.<init>(r1)
            r2.f8868 = r0
            ᛲᛷᲀᛷ r0 = new ᛲᛷᲀᛷ
            r1 = 0
            r0.<init>(r1)
            r2.f8869 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.f8867 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.f8866 = r0
            r2.f8865 = r3
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.Object m3462(defpackage.C1969 r6, java.lang.Class r7) {
            r5 = this;
            ᛷᲀᛷᛵ r0 = r5.m3463(r7)
            ᛴᛵᲇᲇ r1 = r5.f8868
            java.lang.Object r1 = r1.m1546(r6)
            if (r1 == 0) goto L21
            int r2 = r5.f8870
            int r3 = r0.m2531(r1)
            int r4 = r0.m2532()
            int r4 = r4 * r3
            int r2 = r2 - r4
            r5.f8870 = r2
            int r2 = r0.m2531(r1)
            r5.m3465(r7, r2)
        L21:
            if (r1 != 0) goto L57
            java.lang.String r5 = r0.m2530()
            r7 = 2
            boolean r5 = android.util.Log.isLoggable(r5, r7)
            if (r5 == 0) goto L4a
            java.lang.String r5 = r0.m2530()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "Allocated "
            r7.<init>(r1)
            int r1 = r6.f8547
            r7.append(r1)
            java.lang.String r1 = " bytes"
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            android.util.Log.v(r5, r7)
        L4a:
            int r5 = r6.f8547
            int r6 = r0.f5937
            switch(r6) {
                case 0: goto L54;
                default: goto L51;
            }
        L51:
            int[] r5 = new int[r5]
            goto L56
        L54:
            byte[] r5 = new byte[r5]
        L56:
            return r5
        L57:
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1353 m3463(java.lang.Class r3) {
            r2 = this;
            java.util.HashMap r2 = r2.f8866
            java.lang.Object r0 = r2.get(r3)
            ᛷᲀᛷᛵ r0 = (defpackage.C1353) r0
            if (r0 != 0) goto L3a
            java.lang.Class<int[]> r0 = int[].class
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L19
            ᛷᲀᛷᛵ r0 = new ᛷᲀᛷᛵ
            r1 = 1
            r0.<init>(r1)
            goto L27
        L19:
            java.lang.Class<byte[]> r0 = byte[].class
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L2b
            ᛷᲀᛷᛵ r0 = new ᛷᲀᛷᛵ
            r1 = 0
            r0.<init>(r1)
        L27:
            r2.put(r3, r0)
            return r0
        L2b:
            java.lang.String r2 = r3.getSimpleName()
            java.lang.String r3 = "No array pool found for: "
            java.lang.String r2 = r3.concat(r2)
            defpackage.C2264.m3684(r2)
            r2 = 0
            return r2
        L3a:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final synchronized java.lang.Object m3464(java.lang.Class r4, int r5) {
            r3 = this;
            monitor-enter(r3)
            java.util.NavigableMap r0 = r3.m3467(r4)     // Catch: java.lang.Throwable -> L46
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L46
            java.lang.Object r0 = r0.ceilingKey(r1)     // Catch: java.lang.Throwable -> L46
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L26
            int r1 = r3.f8870     // Catch: java.lang.Throwable -> L46
            if (r1 == 0) goto L24
            int r2 = r3.f8865     // Catch: java.lang.Throwable -> L46
            int r2 = r2 / r1
            r1 = 2
            if (r2 < r1) goto L1c
            goto L24
        L1c:
            int r1 = r0.intValue()     // Catch: java.lang.Throwable -> L46
            int r2 = r5 * 8
            if (r1 > r2) goto L26
        L24:
            r1 = 1
            goto L27
        L26:
            r1 = 0
        L27:
            ᛲᛷᲀᛷ r2 = r3.f8869
            if (r1 == 0) goto L48
            int r5 = r0.intValue()     // Catch: java.lang.Throwable -> L46
            java.lang.Object r0 = r2.f7642     // Catch: java.lang.Throwable -> L46
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch: java.lang.Throwable -> L46
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L46
            ᛶᛷᛶᛵ r0 = (defpackage.InterfaceC1111) r0     // Catch: java.lang.Throwable -> L46
            if (r0 != 0) goto L3f
            ᛶᛷᛶᛵ r0 = r2.m998()     // Catch: java.lang.Throwable -> L46
        L3f:
            ᲁᲈᛸᛵ r0 = (defpackage.C1969) r0     // Catch: java.lang.Throwable -> L46
            r0.f8547 = r5     // Catch: java.lang.Throwable -> L46
            r0.f8545 = r4     // Catch: java.lang.Throwable -> L46
            goto L5e
        L46:
            r4 = move-exception
            goto L64
        L48:
            java.lang.Object r0 = r2.f7642     // Catch: java.lang.Throwable -> L46
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch: java.lang.Throwable -> L46
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L46
            ᛶᛷᛶᛵ r0 = (defpackage.InterfaceC1111) r0     // Catch: java.lang.Throwable -> L46
            if (r0 != 0) goto L58
            ᛶᛷᛶᛵ r0 = r2.m998()     // Catch: java.lang.Throwable -> L46
        L58:
            ᲁᲈᛸᛵ r0 = (defpackage.C1969) r0     // Catch: java.lang.Throwable -> L46
            r0.f8547 = r5     // Catch: java.lang.Throwable -> L46
            r0.f8545 = r4     // Catch: java.lang.Throwable -> L46
        L5e:
            java.lang.Object r4 = r3.m3462(r0, r4)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r3)
            return r4
        L64:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L46
            throw r4
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m3465(java.lang.Class r3, int r4) {
            r2 = this;
            java.util.NavigableMap r3 = r2.m3467(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r3.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L30
            int r2 = r0.intValue()
            r1 = 1
            if (r2 != r1) goto L1f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r3.remove(r2)
            return
        L1f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            int r4 = r0.intValue()
            int r4 = r4 - r1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.put(r2, r4)
            return
        L30:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Tried to decrement empty size, size: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = ", this: "
            r0.append(r4)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m3466(int r6) {
            r5 = this;
        L0:
            int r0 = r5.f8870
            if (r0 <= r6) goto L53
            ᛴᛵᲇᲇ r0 = r5.f8868
            java.lang.Object r0 = r0.m1554()
            defpackage.C0292.m948(r0)
            java.lang.Class r1 = r0.getClass()
            ᛷᲀᛷᛵ r1 = r5.m3463(r1)
            int r2 = r5.f8870
            int r3 = r1.m2531(r0)
            int r4 = r1.m2532()
            int r4 = r4 * r3
            int r2 = r2 - r4
            r5.f8870 = r2
            int r2 = r1.m2531(r0)
            java.lang.Class r3 = r0.getClass()
            r5.m3465(r3, r2)
            java.lang.String r2 = r1.m2530()
            r3 = 2
            boolean r2 = android.util.Log.isLoggable(r2, r3)
            if (r2 == 0) goto L0
            java.lang.String r2 = r1.m2530()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "evicted: "
            r3.<init>(r4)
            int r0 = r1.m2531(r0)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.v(r2, r0)
            goto L0
        L53:
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.util.NavigableMap m3467(java.lang.Class r2) {
            r1 = this;
            java.util.HashMap r1 = r1.f8867
            java.lang.Object r0 = r1.get(r2)
            java.util.NavigableMap r0 = (java.util.NavigableMap) r0
            if (r0 != 0) goto L12
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            r1.put(r2, r0)
        L12:
            return r0
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final synchronized void m3468(java.lang.Object r6) {
            r5 = this;
            monitor-enter(r5)
            java.lang.Class r0 = r6.getClass()     // Catch: java.lang.Throwable -> L67
            ᛷᲀᛷᛵ r1 = r5.m3463(r0)     // Catch: java.lang.Throwable -> L67
            int r2 = r1.m2531(r6)     // Catch: java.lang.Throwable -> L67
            int r1 = r1.m2532()     // Catch: java.lang.Throwable -> L67
            int r1 = r1 * r2
            int r3 = r5.f8865     // Catch: java.lang.Throwable -> L67
            int r3 = r3 / 2
            if (r1 > r3) goto L69
            ᛲᛷᲀᛷ r3 = r5.f8869     // Catch: java.lang.Throwable -> L67
            java.lang.Object r4 = r3.f7642     // Catch: java.lang.Throwable -> L67
            java.util.ArrayDeque r4 = (java.util.ArrayDeque) r4     // Catch: java.lang.Throwable -> L67
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L67
            ᛶᛷᛶᛵ r4 = (defpackage.InterfaceC1111) r4     // Catch: java.lang.Throwable -> L67
            if (r4 != 0) goto L2a
            ᛶᛷᛶᛵ r4 = r3.m998()     // Catch: java.lang.Throwable -> L67
        L2a:
            ᲁᲈᛸᛵ r4 = (defpackage.C1969) r4     // Catch: java.lang.Throwable -> L67
            r4.f8547 = r2     // Catch: java.lang.Throwable -> L67
            r4.f8545 = r0     // Catch: java.lang.Throwable -> L67
            ᛴᛵᲇᲇ r2 = r5.f8868     // Catch: java.lang.Throwable -> L67
            r2.m1548(r4, r6)     // Catch: java.lang.Throwable -> L67
            java.util.NavigableMap r6 = r5.m3467(r0)     // Catch: java.lang.Throwable -> L67
            int r0 = r4.f8547     // Catch: java.lang.Throwable -> L67
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L67
            java.lang.Object r0 = r6.get(r0)     // Catch: java.lang.Throwable -> L67
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L67
            int r2 = r4.f8547     // Catch: java.lang.Throwable -> L67
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L67
            r3 = 1
            if (r0 != 0) goto L4f
            goto L54
        L4f:
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L67
            int r3 = r3 + r0
        L54:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L67
            r6.put(r2, r0)     // Catch: java.lang.Throwable -> L67
            int r6 = r5.f8870     // Catch: java.lang.Throwable -> L67
            int r6 = r6 + r1
            r5.f8870 = r6     // Catch: java.lang.Throwable -> L67
            int r6 = r5.f8865     // Catch: java.lang.Throwable -> L67
            r5.m3466(r6)     // Catch: java.lang.Throwable -> L67
            monitor-exit(r5)
            return
        L67:
            r6 = move-exception
            goto L6b
        L69:
            monitor-exit(r5)
            return
        L6b:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L67
            throw r6
    }
}
