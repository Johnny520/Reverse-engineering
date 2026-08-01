package defpackage;

/* JADX INFO: renamed from: ᛵᛴᛶᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0870 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final defpackage.C1185 f3931;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public boolean f3932;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f3933;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.util.concurrent.locks.ReentrantLock f3934;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int f3935;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC1781 f3936;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.C0408[] f3937;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.C1878 f3938;

    public C0870(int r1, defpackage.InterfaceC1781 r2) {
            r0 = this;
            r0.<init>()
            r0.f3935 = r1
            r0.f3936 = r2
            java.util.concurrent.locks.ReentrantLock r2 = new java.util.concurrent.locks.ReentrantLock
            r2.<init>()
            r0.f3934 = r2
            ᛳᛱᛸᛳ[] r2 = new defpackage.C0408[r1]
            r0.f3937 = r2
            int r2 = defpackage.AbstractC2031.f8755
            ᲁᛷᛱᛳ r2 = new ᲁᛷᛱᛳ
            r2.<init>(r1)
            r0.f3938 = r2
            ᛶᲈᛷᛵ r2 = new ᛶᲈᛷᛵ
            r2.<init>(r1)
            r0.f3931 = r2
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void m1849(defpackage.C0408 r3) {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.f3934
            r0.lock()
            ᛶᲈᛷᛵ r1 = r2.f3931     // Catch: java.lang.Throwable -> L13
            r1.addLast(r3)     // Catch: java.lang.Throwable -> L13
            r0.unlock()
            ᲁᛷᛱᛳ r2 = r2.f3938
            r2.m3521()
            return
        L13:
            r2 = move-exception
            r0.unlock()
            throw r2
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void m1850(java.lang.StringBuilder r13) {
            r12 = this;
            java.lang.String r0 = ", "
            ᛶᲈᛷᛵ r1 = r12.f3931
            java.util.concurrent.locks.ReentrantLock r2 = r12.f3934
            r2.lock()
            ᛱᲇᲀᛲ r3 = defpackage.AbstractC0425.m1189()     // Catch: java.lang.Throwable -> L1d
            int r4 = r1.f5379     // Catch: java.lang.Throwable -> L1d
            r5 = 0
            r6 = r5
        L11:
            if (r6 >= r4) goto L21
            java.lang.Object r7 = r1.get(r6)     // Catch: java.lang.Throwable -> L1d
            r3.add(r7)     // Catch: java.lang.Throwable -> L1d
            int r6 = r6 + 1
            goto L11
        L1d:
            r0 = move-exception
            r12 = r0
            goto Lf8
        L21:
            ᛱᲇᲀᛲ r6 = defpackage.AbstractC0425.m1197(r3)     // Catch: java.lang.Throwable -> L1d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r1.<init>()     // Catch: java.lang.Throwable -> L1d
            r3 = 9
            r1.append(r3)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = r12.toString()     // Catch: java.lang.Throwable -> L1d
            r1.append(r3)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = " ("
            r1.append(r3)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1d
            r13.append(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r1.<init>()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = "capacity="
            r1.append(r3)     // Catch: java.lang.Throwable -> L1d
            int r3 = r12.f3935     // Catch: java.lang.Throwable -> L1d
            r1.append(r3)     // Catch: java.lang.Throwable -> L1d
            r1.append(r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1d
            r13.append(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r1.<init>()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = "permits="
            r1.append(r3)     // Catch: java.lang.Throwable -> L1d
            ᲁᛷᛱᛳ r3 = r12.f3938     // Catch: java.lang.Throwable -> L1d
            sun.misc.Unsafe r4 = defpackage.AbstractC0051.f569     // Catch: java.lang.Throwable -> L1d
            long r7 = defpackage.C2099.f8999     // Catch: java.lang.Throwable -> L1d
            int r3 = r4.getIntVolatile(r3, r7)     // Catch: java.lang.Throwable -> L1d
            int r3 = java.lang.Math.max(r3, r5)     // Catch: java.lang.Throwable -> L1d
            r1.append(r3)     // Catch: java.lang.Throwable -> L1d
            r1.append(r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L1d
            r13.append(r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r0.<init>()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = "queue=(size="
            r0.append(r1)     // Catch: java.lang.Throwable -> L1d
            int r1 = r6.mo748()     // Catch: java.lang.Throwable -> L1d
            r0.append(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = ")["
            r0.append(r1)     // Catch: java.lang.Throwable -> L1d
            r10 = 0
            r11 = 63
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r1 = defpackage.AbstractC1107.m2125(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L1d
            r0.append(r1)     // Catch: java.lang.Throwable -> L1d
            r1 = 93
            r0.append(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1d
            r13.append(r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = ")"
            r13.append(r0)     // Catch: java.lang.Throwable -> L1d
            r0 = 10
            r13.append(r0)     // Catch: java.lang.Throwable -> L1d
            ᛳᛱᛸᛳ[] r12 = r12.f3937     // Catch: java.lang.Throwable -> L1d
            int r1 = r12.length     // Catch: java.lang.Throwable -> L1d
            r3 = r5
        Lbd:
            if (r5 >= r1) goto Lf4
            r4 = r12[r5]     // Catch: java.lang.Throwable -> L1d
            int r3 = r3 + 1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r6.<init>()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r7 = "\t\t["
            r6.append(r7)     // Catch: java.lang.Throwable -> L1d
            r6.append(r3)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r7 = "] - "
            r6.append(r7)     // Catch: java.lang.Throwable -> L1d
            if (r4 == 0) goto Lde
            ᲀᛴᛴᛶ r7 = r4.f2066     // Catch: java.lang.Throwable -> L1d
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L1d
            goto Ldf
        Lde:
            r7 = 0
        Ldf:
            r6.append(r7)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L1d
            r13.append(r6)     // Catch: java.lang.Throwable -> L1d
            r13.append(r0)     // Catch: java.lang.Throwable -> L1d
            if (r4 == 0) goto Lf1
            r4.m1165(r13)     // Catch: java.lang.Throwable -> L1d
        Lf1:
            int r5 = r5 + 1
            goto Lbd
        Lf4:
            r2.unlock()
            return
        Lf8:
            r2.unlock()
            throw r12
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void m1851() {
            r4 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r4.f3934
            r0.lock()
            r1 = 1
            r4.f3932 = r1     // Catch: java.lang.Throwable -> L16
            ᛳᛱᛸᛳ[] r4 = r4.f3937     // Catch: java.lang.Throwable -> L16
            int r1 = r4.length     // Catch: java.lang.Throwable -> L16
            r2 = 0
        Lc:
            if (r2 >= r1) goto L1b
            r3 = r4[r2]     // Catch: java.lang.Throwable -> L16
            if (r3 == 0) goto L18
            r3.close()     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r4 = move-exception
            goto L1f
        L18:
            int r2 = r2 + 1
            goto Lc
        L1b:
            r0.unlock()
            return
        L1f:
            r0.unlock()
            throw r4
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.Object m1852(defpackage.AbstractC1016 r8) {
            r7 = this;
            ᲁᛷᛱᛳ r0 = r7.f3938
            int r1 = r0.f9006
            ᛶᲈᛷᛵ r2 = r7.f3931
            boolean r3 = r8 instanceof defpackage.C2147
            if (r3 == 0) goto L19
            r3 = r8
            ᲇᲇᛷᛶ r3 = (defpackage.C2147) r3
            int r4 = r3.f9124
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f9124 = r4
            goto L1e
        L19:
            ᲇᲇᛷᛶ r3 = new ᲇᲇᛷᛶ
            r3.<init>(r7, r8)
        L1e:
            java.lang.Object r8 = r3.f9125
            int r4 = r3.f9124
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L32
            if (r4 != r6) goto L2c
            defpackage.AbstractC0762.m1680(r8)
            goto L78
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r7)
            return r5
        L32:
            defpackage.AbstractC0762.m1680(r8)
            r3.f9124 = r6
        L37:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r8 = defpackage.C2099.f9004
            int r8 = r8.getAndDecrement(r0)
            if (r8 > r1) goto L37
            ᛴᛵ r4 = defpackage.EnumC0670.f3246
            ᲁᲀᛱᲁ r6 = defpackage.C1907.f8270
            if (r8 <= 0) goto L46
            goto L75
        L46:
            ᛱᛸᛲᲀ r8 = defpackage.AbstractC0397.m1142(r3)
            ᲈᛶᛳᛷ r8 = defpackage.AbstractC1628.m2940(r8)
            boolean r3 = r0.m3522(r8)     // Catch: java.lang.Throwable -> Lc6
            if (r3 != 0) goto L6a
        L54:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = defpackage.C2099.f9004     // Catch: java.lang.Throwable -> Lc6
            int r3 = r3.getAndDecrement(r0)     // Catch: java.lang.Throwable -> Lc6
            if (r3 > r1) goto L54
            if (r3 <= 0) goto L64
            ᲁᲀᛷᛴ r1 = r0.f9005     // Catch: java.lang.Throwable -> Lc6
            r8.mo2004(r1)     // Catch: java.lang.Throwable -> Lc6
            goto L6a
        L64:
            boolean r3 = r0.m3522(r8)     // Catch: java.lang.Throwable -> Lc6
            if (r3 == 0) goto L54
        L6a:
            java.lang.Object r8 = r8.m3654()
            if (r8 != r4) goto L71
            goto L72
        L71:
            r8 = r6
        L72:
            if (r8 != r4) goto L75
            r6 = r8
        L75:
            if (r6 != r4) goto L78
            return r4
        L78:
            java.util.concurrent.locks.ReentrantLock r8 = r7.f3934     // Catch: java.lang.Throwable -> Lb2
            r8.lock()     // Catch: java.lang.Throwable -> Lb2
            boolean r1 = r7.f3932     // Catch: java.lang.Throwable -> Lb4
            if (r1 != 0) goto Lb6
            boolean r1 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lb4
            if (r1 == 0) goto La8
            int r1 = r7.f3933     // Catch: java.lang.Throwable -> Lb4
            int r3 = r7.f3935     // Catch: java.lang.Throwable -> Lb4
            if (r1 < r3) goto L8e
            goto La8
        L8e:
            ᛳᛱᛸᛳ r1 = new ᛳᛱᛸᛳ     // Catch: java.lang.Throwable -> Lb4
            ᲀᲈᛵᲇ r3 = r7.f3936     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r3 = r3.mo1032()     // Catch: java.lang.Throwable -> Lb4
            ᲀᛴᛴᛶ r3 = (defpackage.InterfaceC1661) r3     // Catch: java.lang.Throwable -> Lb4
            r1.<init>(r3)     // Catch: java.lang.Throwable -> Lb4
            ᛳᛱᛸᛳ[] r3 = r7.f3937     // Catch: java.lang.Throwable -> Lb4
            int r4 = r7.f3933     // Catch: java.lang.Throwable -> Lb4
            int r5 = r4 + 1
            r7.f3933 = r5     // Catch: java.lang.Throwable -> Lb4
            r3[r4] = r1     // Catch: java.lang.Throwable -> Lb4
            r2.addLast(r1)     // Catch: java.lang.Throwable -> Lb4
        La8:
            java.lang.Object r7 = r2.removeLast()     // Catch: java.lang.Throwable -> Lb4
            ᛳᛱᛸᛳ r7 = (defpackage.C0408) r7     // Catch: java.lang.Throwable -> Lb4
            r8.unlock()     // Catch: java.lang.Throwable -> Lb2
            return r7
        Lb2:
            r7 = move-exception
            goto Lc2
        Lb4:
            r7 = move-exception
            goto Lbe
        Lb6:
            java.lang.String r7 = "Connection pool is closed"
            r1 = 21
            defpackage.AbstractC1628.m2954(r1, r7)     // Catch: java.lang.Throwable -> Lb4
            throw r5     // Catch: java.lang.Throwable -> Lb4
        Lbe:
            r8.unlock()     // Catch: java.lang.Throwable -> Lb2
            throw r7     // Catch: java.lang.Throwable -> Lb2
        Lc2:
            r0.m3521()
            throw r7
        Lc6:
            r7 = move-exception
            r8.m3657()
            throw r7
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object m1853(long r7, defpackage.C1496 r9, defpackage.AbstractC1016 r10) {
            r6 = this;
            boolean r0 = r10 instanceof defpackage.C1369
            if (r0 == 0) goto L13
            r0 = r10
            ᛷᲁᛵᲇ r0 = (defpackage.C1369) r0
            int r1 = r0.f5990
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5990 = r1
            goto L18
        L13:
            ᛷᲁᛵᲇ r0 = new ᛷᲁᛵᲇ
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f5991
            int r1 = r0.f5990
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2e
            long r7 = r0.f5993
            ᛸᛱᛴᲁ r9 = r0.f5989
            ᲀᲈᛵᲇ r1 = r0.f5994
            defpackage.AbstractC0762.m1680(r10)     // Catch: java.lang.Throwable -> L2c
            goto L55
        L2c:
            r10 = move-exception
            goto L5f
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r6)
            return r3
        L34:
            defpackage.AbstractC0762.m1680(r10)
        L37:
            ᛸᛱᛴᲁ r10 = new ᛸᛱᛴᲁ
            r10.<init>()
            ᲁᲀᲇᛱ r1 = new ᲁᲀᲇᛱ     // Catch: java.lang.Throwable -> L5a
            r4 = 5
            r1.<init>(r10, r6, r3, r4)     // Catch: java.lang.Throwable -> L5a
            r0.f5994 = r9     // Catch: java.lang.Throwable -> L5a
            r0.f5989 = r10     // Catch: java.lang.Throwable -> L5a
            r0.f5993 = r7     // Catch: java.lang.Throwable -> L5a
            r0.f5990 = r2     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r1 = defpackage.AbstractC1628.m2959(r7, r1, r0)     // Catch: java.lang.Throwable -> L5a
            ᛴᛵ r4 = defpackage.EnumC0670.f3246
            if (r1 != r4) goto L53
            return r4
        L53:
            r1 = r9
            r9 = r10
        L55:
            r10 = r9
            r9 = r1
            r1 = r0
            r0 = r3
            goto L64
        L5a:
            r1 = move-exception
            r5 = r1
            r1 = r9
            r9 = r10
            r10 = r5
        L5f:
            r5 = r10
            r10 = r9
            r9 = r1
            r1 = r0
            r0 = r5
        L64:
            boolean r4 = r0 instanceof defpackage.C1742     // Catch: java.lang.Throwable -> L6c
            if (r4 == 0) goto L6e
            r9.mo1032()     // Catch: java.lang.Throwable -> L6c
            goto L75
        L6c:
            r7 = move-exception
            goto L78
        L6e:
            if (r0 != 0) goto L77
            java.lang.Object r10 = r10.f6211     // Catch: java.lang.Throwable -> L6c
            if (r10 == 0) goto L75
            return r10
        L75:
            r0 = r1
            goto L37
        L77:
            throw r0     // Catch: java.lang.Throwable -> L6c
        L78:
            java.lang.Object r8 = r10.f6211
            ᛳᛱᛸᛳ r8 = (defpackage.C0408) r8
            if (r8 == 0) goto L81
            r6.m1849(r8)
        L81:
            throw r7
    }
}
