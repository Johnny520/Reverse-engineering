package defpackage;

/* JADX INFO: renamed from: ᛳᛱᛸᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0408 implements defpackage.InterfaceC1661, defpackage.InterfaceC0807 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public defpackage.InterfaceC0493 f2064;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.InterfaceC0807 f2065;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC1661 f2066;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public java.lang.Throwable f2067;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.C1098 f2068;

    public C0408(defpackage.InterfaceC1661 r2) {
            r1 = this;
            ᛷᛲᛳᲈ r0 = new ᛷᛲᛳᲈ
            r0.<init>()
            r1.<init>()
            r1.f2066 = r2
            r1.f2065 = r0
            ᛶᛶᲁᲈ r2 = new ᛶᛶᲁᲈ
            r2.<init>(r1)
            r1.f2068 = r2
            return
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r2 = this;
            ᛶᛶᲁᲈ r0 = r2.f2068
            if (r0 == 0) goto L8
            r1 = -1
            r0.m3737(r1)
        L8:
            ᲀᛴᛴᛶ r2 = r2.f2066
            r2.close()
            return
    }

    public final java.lang.String toString() {
            r0 = this;
            ᲀᛴᛴᛶ r0 = r0.f2066
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final void m1165(java.lang.StringBuilder r7) {
            r6 = this;
            ᛳᛵᲈᛵ r0 = r6.f2064
            r1 = 10
            if (r0 != 0) goto L15
            java.lang.Throwable r0 = r6.f2067
            if (r0 == 0) goto Lb
            goto L15
        Lb:
            java.lang.String r0 = "\t\tStatus: Free connection"
            r7.append(r0)
            r7.append(r1)
            goto Lc0
        L15:
            java.lang.String r0 = "\t\tStatus: Acquired connection"
            r7.append(r0)
            r7.append(r1)
            ᛳᛵᲈᛵ r0 = r6.f2064
            if (r0 == 0) goto L35
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "\t\tCoroutine: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r7.append(r0)
            r7.append(r1)
        L35:
            java.lang.Throwable r0 = r6.f2067
            if (r0 == 0) goto Lc0
            java.lang.String r2 = "\t\tAcquired:"
            r7.append(r2)
            r7.append(r1)
            java.io.StringWriter r2 = new java.io.StringWriter
            r2.<init>()
            java.io.PrintWriter r3 = new java.io.PrintWriter
            r3.<init>(r2)
            r0.printStackTrace(r3)
            r3.flush()
            java.lang.String r0 = r2.toString()
            java.util.List r0 = defpackage.AbstractC1347.m2512(r0)
            int r2 = r0.size()
            r3 = 1
            int r2 = r2 - r3
            if (r2 > 0) goto L64
            ᲀᛶᲇ r0 = defpackage.C1698.f7558
            goto L9b
        L64:
            if (r2 != r3) goto L6f
            java.lang.Object r0 = defpackage.AbstractC1107.m2114(r0)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            goto L9b
        L6f:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r2)
            boolean r2 = r0 instanceof java.util.RandomAccess
            if (r2 == 0) goto L88
            int r2 = r0.size()
        L7c:
            if (r3 >= r2) goto L9a
            java.lang.Object r5 = r0.get(r3)
            r4.add(r5)
            int r3 = r3 + 1
            goto L7c
        L88:
            java.util.ListIterator r0 = r0.listIterator(r3)
        L8c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L9a
            java.lang.Object r2 = r0.next()
            r4.add(r2)
            goto L8c
        L9a:
            r0 = r4
        L9b:
            java.util.Iterator r0 = r0.iterator()
        L9f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lc0
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "\t\t"
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r7.append(r2)
            r7.append(r1)
            goto L9f
        Lc0:
            ᛶᛶᲁᲈ r0 = r6.f2068
            if (r0 == 0) goto Le6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "\t\tPrepared Statement Cache Size: "
            r0.<init>(r2)
            ᛶᛶᲁᲈ r6 = r6.f2068
            java.lang.Object r2 = r6.f9734
            ᲈᛴᛵᲈ r2 = (defpackage.C2223) r2
            monitor-enter(r2)
            int r6 = r6.f9730     // Catch: java.lang.Throwable -> Le3
            monitor-exit(r2)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.append(r6)
            r7.append(r1)
            return
        Le3:
            r6 = move-exception
            monitor-exit(r2)
            throw r6
        Le6:
            return
    }

    @Override // defpackage.InterfaceC1661
    /* JADX INFO: renamed from: ᛶᛳᲀᲈ */
    public final defpackage.InterfaceC0270 mo892(java.lang.String r2) {
            r1 = this;
            ᛶᛶᲁᲈ r0 = r1.f2068
            if (r0 == 0) goto L10
            ᛵᛷᛸᲇ r1 = new ᛵᛷᛸᲇ
            java.lang.Object r2 = r0.m3732(r2)
            ᛲᛳᲇᛱ r2 = (defpackage.InterfaceC0270) r2
            r1.<init>(r2)
            return r1
        L10:
            ᲀᛴᛴᛶ r1 = r1.f2066
            ᛲᛳᲇᛱ r1 = r1.mo892(r2)
            return r1
    }

    @Override // defpackage.InterfaceC0807
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void mo1166(java.lang.Object r1) {
            r0 = this;
            r1 = 0
            ᛵᛱᛳᛶ r0 = r0.f2065
            r0.mo1166(r1)
            return
    }

    @Override // defpackage.InterfaceC1661
    /* JADX INFO: renamed from: ᲁᲈᲇᲁ */
    public final boolean mo893() {
            r0 = this;
            ᲀᛴᛴᛶ r0 = r0.f2066
            boolean r0 = r0.mo893()
            return r0
    }

    @Override // defpackage.InterfaceC0807
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.lang.Object mo1167(defpackage.AbstractC1016 r1) {
            r0 = this;
            ᛵᛱᛳᛶ r0 = r0.f2065
            java.lang.Object r0 = r0.mo1167(r1)
            return r0
    }
}
