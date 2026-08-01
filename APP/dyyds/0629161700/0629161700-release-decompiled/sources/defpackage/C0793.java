package defpackage;

/* JADX INFO: renamed from: ᛴᲈᛲᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0793 implements defpackage.InterfaceC0191, defpackage.InterfaceC0784 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public java.util.List f3667;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public java.io.File f3668;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public defpackage.C0802 f3669;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public int f3670;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f3671;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C0684 f3672;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.RunnableC1425 f3673;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public volatile defpackage.C0402 f3674;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f3675;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public defpackage.InterfaceC1711 f3676;

    public C0793(defpackage.C0684 r2, defpackage.RunnableC1425 r3) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f3675 = r0
            r1.f3672 = r2
            r1.f3673 = r3
            return
    }

    @Override // defpackage.InterfaceC0191
    public final void cancel() {
            r0 = this;
            ᛳᛱᛱᛲ r0 = r0.f3674
            if (r0 == 0) goto L9
            ᛱᲇᲀᛴ r0 = r0.f2058
            r0.cancel()
        L9:
            return
    }

    @Override // defpackage.InterfaceC0784
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final void mo1360(java.lang.Exception r4) {
            r3 = this;
            ᛸᛱᲁᛵ r0 = r3.f3673
            ᛴᲈᲇᛶ r1 = r3.f3669
            ᛳᛱᛱᛲ r3 = r3.f3674
            ᛱᲇᲀᛴ r3 = r3.f2058
            r2 = 4
            r0.mo2247(r1, r4, r3, r2)
            return
    }

    @Override // defpackage.InterfaceC0191
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final boolean mo738() {
            r22 = this;
            r0 = r22
            java.lang.String r1 = "Failed to find any load path from "
            ᛴᛶᛱᛲ r2 = r0.f3672
            java.util.ArrayList r2 = r2.m1572()
            boolean r3 = r2.isEmpty()
            r4 = 0
            if (r3 == 0) goto L13
            goto L170
        L13:
            ᛴᛶᛱᛲ r3 = r0.f3672
            ᛵᛶᛳᲇ r5 = r3.f3296
            ᲈᲈᛲᲇ r5 = r5.m1877()
            java.lang.Object r6 = r3.f3295
            java.lang.Class r6 = r6.getClass()
            java.lang.Class r7 = r3.f3305
            java.lang.Class r3 = r3.f3289
            ᛴᛵᲇᲇ r8 = r5.f10234
            java.lang.Object r9 = r8.f3286
            java.util.concurrent.atomic.AtomicReference r9 = (java.util.concurrent.atomic.AtomicReference) r9
            r10 = 0
            java.lang.Object r9 = r9.getAndSet(r10)
            ᲁᲁᛱᛲ r9 = (defpackage.C1921) r9
            if (r9 != 0) goto L3a
            ᲁᲁᛱᛲ r9 = new ᲁᲁᛱᛲ
            r9.<init>(r6, r7, r3)
            goto L40
        L3a:
            r9.f8360 = r6
            r9.f8361 = r7
            r9.f8359 = r3
        L40:
            java.lang.Object r11 = r8.f3285
            ᛸᛶᛱᛲ r11 = (defpackage.C1499) r11
            monitor-enter(r11)
            java.lang.Object r12 = r8.f3285     // Catch: java.lang.Throwable -> L1cd
            ᛸᛶᛱᛲ r12 = (defpackage.C1499) r12     // Catch: java.lang.Throwable -> L1cd
            java.lang.Object r12 = r12.get(r9)     // Catch: java.lang.Throwable -> L1cd
            java.util.List r12 = (java.util.List) r12     // Catch: java.lang.Throwable -> L1cd
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L1cd
            java.lang.Object r8 = r8.f3286
            java.util.concurrent.atomic.AtomicReference r8 = (java.util.concurrent.atomic.AtomicReference) r8
            r8.set(r9)
            if (r12 != 0) goto Lc5
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            ᛴᛵᲇᲇ r8 = r5.f10239
            monitor-enter(r8)
            java.lang.Object r9 = r8.f3286     // Catch: java.lang.Throwable -> Lc2
            ᛷᛸᛱᛸ r9 = (defpackage.C1326) r9     // Catch: java.lang.Throwable -> Lc2
            java.util.ArrayList r9 = r9.m2472(r6)     // Catch: java.lang.Throwable -> Lc2
            monitor-exit(r8)
            java.util.Iterator r8 = r9.iterator()
        L6e:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto La6
            java.lang.Object r9 = r8.next()
            java.lang.Class r9 = (java.lang.Class) r9
            ᲁᛷᛵ r11 = r5.f10238
            java.util.ArrayList r9 = r11.m3304(r9, r7)
            java.util.Iterator r9 = r9.iterator()
        L84:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L6e
            java.lang.Object r11 = r9.next()
            java.lang.Class r11 = (java.lang.Class) r11
            ᛳᲈᛳᛸ r13 = r5.f10242
            java.util.ArrayList r13 = r13.m1388(r11, r3)
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto L84
            boolean r13 = r12.contains(r11)
            if (r13 != 0) goto L84
            r12.add(r11)
            goto L84
        La6:
            ᛴᛵᲇᲇ r5 = r5.f10234
            java.util.List r8 = java.util.Collections.unmodifiableList(r12)
            java.lang.Object r9 = r5.f3285
            ᛸᛶᛱᛲ r9 = (defpackage.C1499) r9
            monitor-enter(r9)
            java.lang.Object r5 = r5.f3285     // Catch: java.lang.Throwable -> Lbf
            ᛸᛶᛱᛲ r5 = (defpackage.C1499) r5     // Catch: java.lang.Throwable -> Lbf
            ᲁᲁᛱᛲ r11 = new ᲁᲁᛱᛲ     // Catch: java.lang.Throwable -> Lbf
            r11.<init>(r6, r7, r3)     // Catch: java.lang.Throwable -> Lbf
            r5.put(r11, r8)     // Catch: java.lang.Throwable -> Lbf
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lbf
            goto Lc5
        Lbf:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lbf
            throw r0
        Lc2:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lc2
            throw r0
        Lc5:
            boolean r3 = r12.isEmpty()
            if (r3 == 0) goto Lff
            java.lang.Class<java.io.File> r2 = java.io.File.class
            ᛴᛶᛱᛲ r3 = r0.f3672
            java.lang.Class r3 = r3.f3289
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Ld9
            goto L170
        Ld9:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            ᛴᛶᛱᛲ r1 = r0.f3672
            java.lang.Object r1 = r1.f3295
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = " to "
            ᛴᛶᛱᛲ r0 = r0.f3672
            java.lang.Class r0 = r0.f3289
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        Lff:
            java.util.List r1 = r0.f3667
            r3 = 1
            if (r1 == 0) goto L15a
            int r5 = r0.f3670
            int r1 = r1.size()
            if (r5 >= r1) goto L15a
            r0.f3674 = r10
        L10e:
            if (r4 != 0) goto L159
            int r1 = r0.f3670
            java.util.List r2 = r0.f3667
            int r2 = r2.size()
            if (r1 >= r2) goto L159
            java.util.List r1 = r0.f3667
            int r2 = r0.f3670
            int r5 = r2 + 1
            r0.f3670 = r5
            java.lang.Object r1 = r1.get(r2)
            ᲈᛶᲀᛳ r1 = (defpackage.InterfaceC2267) r1
            java.io.File r2 = r0.f3668
            ᛴᛶᛱᛲ r5 = r0.f3672
            int r6 = r5.f3293
            int r7 = r5.f3303
            ᛳᛸᲁᛶ r5 = r5.f3291
            ᛳᛱᛱᛲ r1 = r1.mo1266(r2, r6, r7, r5)
            r0.f3674 = r1
            ᛳᛱᛱᛲ r1 = r0.f3674
            if (r1 == 0) goto L10e
            ᛴᛶᛱᛲ r1 = r0.f3672
            ᛳᛱᛱᛲ r2 = r0.f3674
            ᛱᲇᲀᛴ r2 = r2.f2058
            java.lang.Class r2 = r2.mo646()
            ᛱᛱᛶᛴ r1 = r1.m1571(r2)
            if (r1 == 0) goto L10e
            ᛳᛱᛱᛲ r1 = r0.f3674
            ᛱᲇᲀᛴ r1 = r1.f2058
            ᛴᛶᛱᛲ r2 = r0.f3672
            ᛷᛷᛱᛴ r2 = r2.f3292
            r1.mo753(r2, r0)
            r4 = r3
            goto L10e
        L159:
            return r4
        L15a:
            int r1 = r0.f3675
            int r1 = r1 + r3
            r0.f3675 = r1
            int r5 = r12.size()
            if (r1 < r5) goto L173
            int r1 = r0.f3671
            int r1 = r1 + r3
            r0.f3671 = r1
            int r3 = r2.size()
            if (r1 < r3) goto L171
        L170:
            return r4
        L171:
            r0.f3675 = r4
        L173:
            int r1 = r0.f3671
            java.lang.Object r1 = r2.get(r1)
            r15 = r1
            ᲀᛷᛶᲈ r15 = (defpackage.InterfaceC1711) r15
            int r1 = r0.f3675
            java.lang.Object r1 = r12.get(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            ᛴᛶᛱᛲ r3 = r0.f3672
            ᛴᛴᲀᛶ r19 = r3.m1569(r1)
            ᛴᲈᲇᛶ r13 = new ᛴᲈᲇᛶ
            ᛴᛶᛱᛲ r3 = r0.f3672
            ᛵᛶᛳᲇ r5 = r3.f3296
            ᲇᛶᛳᛱ r14 = r5.f4138
            ᲀᛷᛶᲈ r5 = r3.f3299
            int r6 = r3.f3293
            int r7 = r3.f3303
            ᛳᛸᲁᛶ r8 = r3.f3291
            r20 = r1
            r16 = r5
            r17 = r6
            r18 = r7
            r21 = r8
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            r0.f3669 = r13
            ᲈᛵᛷᛱ r1 = r3.f3288
            ᛲᲇᛵᲈ r1 = r1.m3632()
            ᛴᲈᲇᛶ r3 = r0.f3669
            java.io.File r1 = r1.mo962(r3)
            r0.f3668 = r1
            if (r1 == 0) goto Lff
            r0.f3676 = r15
            ᛴᛶᛱᛲ r3 = r0.f3672
            ᛵᛶᛳᲇ r3 = r3.f3296
            ᲈᲈᛲᲇ r3 = r3.m1877()
            java.util.List r1 = r3.m3872(r1)
            r0.f3667 = r1
            r0.f3670 = r4
            goto Lff
        L1cd:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L1cd
            throw r0
    }

    @Override // defpackage.InterfaceC0784
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final void mo1362(java.lang.Object r7) {
            r6 = this;
            ᛸᛱᲁᛵ r0 = r6.f3673
            ᲀᛷᛶᲈ r1 = r6.f3676
            ᛳᛱᛱᛲ r2 = r6.f3674
            ᛱᲇᲀᛴ r3 = r2.f2058
            r4 = 4
            ᛴᲈᲇᛶ r5 = r6.f3669
            r2 = r7
            r0.mo2246(r1, r2, r3, r4, r5)
            return
    }
}
