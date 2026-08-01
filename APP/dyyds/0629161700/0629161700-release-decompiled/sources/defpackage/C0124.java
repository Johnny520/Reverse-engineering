package defpackage;

/* JADX INFO: renamed from: ᛱᛷᛲᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0124 implements defpackage.InterfaceC0845 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public long f1030;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C0964 f1031;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1075 f1032;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.util.concurrent.CopyOnWriteArrayList f1033;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.util.concurrent.LinkedBlockingDeque f1034;

    public C0124(defpackage.C1075 r1, defpackage.C0964 r2) {
            r0 = this;
            r0.<init>()
            r0.f1032 = r1
            r0.f1031 = r2
            r1 = -9223372036854775808
            r0.f1030 = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r0.f1033 = r1
            java.util.concurrent.LinkedBlockingDeque r1 = new java.util.concurrent.LinkedBlockingDeque
            r1.<init>()
            r0.f1034 = r1
            return
    }

    @Override // defpackage.InterfaceC0845
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1075 mo634() {
            r0 = this;
            ᛶᛵᛶᛶ r0 = r0.f1032
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1475 m635() {
            r7 = this;
            ᛶᛵᛶᛶ r0 = r7.f1032
            r1 = 0
            boolean r2 = r0.m2052(r1)
            if (r2 == 0) goto L5e
            ᛱᛴᛶᛳ r2 = r0.m2053()     // Catch: java.lang.Throwable -> Le
            goto L15
        Le:
            r2 = move-exception
            ᛳᛱᛱᛶ r3 = new ᛳᛱᛱᛶ
            r3.<init>(r2)
            r2 = r3
        L15:
            boolean r3 = r2.mo535()
            if (r3 == 0) goto L22
            ᛸᛴᛸᛵ r7 = new ᛸᛴᛸᛵ
            r0 = 6
            r7.<init>(r2, r1, r1, r0)
            return r7
        L22:
            boolean r3 = r2 instanceof defpackage.C0403
            if (r3 == 0) goto L2b
            ᛳᛱᛱᛶ r2 = (defpackage.C0403) r2
            ᛸᛴᛸᛵ r7 = r2.f2059
            return r7
        L2b:
            java.util.concurrent.CopyOnWriteArrayList r3 = r7.f1033
            r3.add(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = defpackage.AbstractC0508.f2502
            r3.append(r4)
            java.lang.String r4 = " connect "
            r3.append(r4)
            ᛱᛲᛶᲈ r0 = r0.f4825
            ᛳᛸᛲ r0 = r0.f538
            java.lang.String r0 = r0.m1311()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            ᛵᲀᲇᛸ r3 = r7.f1031
            ᛴᛴᛸᛴ r3 = r3.m1908()
            ᛷᲀᛶᛳ r4 = new ᛷᲀᛶᛳ
            r4.<init>(r0, r2, r7)
            r5 = 0
            r3.m1491(r4, r5)
        L5e:
            return r1
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m636() {
            r4 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = r4.f1033
            java.util.Iterator r1 = r0.iterator()
        L6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r1.next()
            ᛱᛴᛶᛳ r2 = (defpackage.InterfaceC0077) r2
            r2.cancel()
            ᛱᛴᛶᛳ r2 = r2.mo538()
            if (r2 != 0) goto L1c
            goto L6
        L1c:
            ᛶᛵᛶᛶ r3 = r4.f1032
            ᛶᲈᛷᛵ r3 = r3.f4836
            r3.addLast(r2)
            goto L6
        L24:
            r0.clear()
            return
    }

    @Override // defpackage.InterfaceC0845
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1894 mo637() {
            r8 = this;
            r0 = 0
            r1 = r0
        L2:
            java.util.concurrent.CopyOnWriteArrayList r2 = r8.f1033     // Catch: java.lang.Throwable -> L17
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L1a
            ᛶᛵᛶᛶ r2 = r8.f1032     // Catch: java.lang.Throwable -> L17
            boolean r2 = r2.m2052(r0)     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L13
            goto L1a
        L13:
            r8.m636()
            throw r1
        L17:
            r0 = move-exception
            goto Lc8
        L1a:
            ᛶᛵᛶᛶ r2 = r8.f1032     // Catch: java.lang.Throwable -> L17
            ᛶᛴᲈ r2 = r2.f4823     // Catch: java.lang.Throwable -> L17
            boolean r2 = r2.f4731     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto Lc0
            ᛵᲀᲇᛸ r2 = r8.f1031     // Catch: java.lang.Throwable -> L17
            ᛶᲈᛱᲈ r2 = r2.f4280     // Catch: java.lang.Throwable -> L17
            long r2 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L17
            long r4 = r8.f1030     // Catch: java.lang.Throwable -> L17
            long r4 = r4 - r2
            java.util.concurrent.CopyOnWriteArrayList r6 = r8.f1033     // Catch: java.lang.Throwable -> L17
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r6 != 0) goto L3f
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 > 0) goto L3c
            goto L3f
        L3c:
            r5 = r4
            r4 = r0
            goto L49
        L3f:
            ᛸᛴᛸᛵ r4 = r8.m635()     // Catch: java.lang.Throwable -> L17
            r5 = 250000000(0xee6b280, double:1.235164115E-315)
            long r2 = r2 + r5
            r8.f1030 = r2     // Catch: java.lang.Throwable -> L17
        L49:
            if (r4 != 0) goto L6b
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L17
            java.util.concurrent.CopyOnWriteArrayList r3 = r8.f1033     // Catch: java.lang.Throwable -> L17
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L57
        L55:
            r4 = r0
            goto L68
        L57:
            java.util.concurrent.LinkedBlockingDeque r4 = r8.f1034     // Catch: java.lang.Throwable -> L17
            java.lang.Object r2 = r4.poll(r5, r2)     // Catch: java.lang.Throwable -> L17
            ᛸᛴᛸᛵ r2 = (defpackage.C1475) r2     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto L62
            goto L55
        L62:
            ᛱᛴᛶᛳ r4 = r2.f6522     // Catch: java.lang.Throwable -> L17
            r3.remove(r4)     // Catch: java.lang.Throwable -> L17
            r4 = r2
        L68:
            if (r4 != 0) goto L6b
            goto L2
        L6b:
            ᛱᛴᛶᛳ r2 = r4.f6523     // Catch: java.lang.Throwable -> L17
            r3 = 0
            r5 = 1
            if (r2 != 0) goto L77
            java.lang.Throwable r2 = r4.f6521     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto L77
            r2 = r5
            goto L78
        L77:
            r2 = r3
        L78:
            if (r2 == 0) goto La0
            r8.m636()     // Catch: java.lang.Throwable -> L17
            ᛱᛴᛶᛳ r2 = r4.f6522     // Catch: java.lang.Throwable -> L17
            boolean r2 = r2.mo535()     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto L8b
            ᛱᛴᛶᛳ r2 = r4.f6522     // Catch: java.lang.Throwable -> L17
            ᛸᛴᛸᛵ r4 = r2.mo537()     // Catch: java.lang.Throwable -> L17
        L8b:
            ᛱᛴᛶᛳ r2 = r4.f6523     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto L94
            java.lang.Throwable r2 = r4.f6521     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto L94
            r3 = r5
        L94:
            if (r3 == 0) goto La0
            ᛱᛴᛶᛳ r0 = r4.f6522     // Catch: java.lang.Throwable -> L17
            ᲁᛸᛲᛶ r0 = r0.mo536()     // Catch: java.lang.Throwable -> L17
            r8.m636()
            return r0
        La0:
            java.lang.Throwable r2 = r4.f6521     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto Lb3
            boolean r3 = r2 instanceof java.io.IOException     // Catch: java.lang.Throwable -> L17
            if (r3 == 0) goto Lb2
            if (r1 != 0) goto Lae
            java.io.IOException r2 = (java.io.IOException) r2     // Catch: java.lang.Throwable -> L17
            r1 = r2
            goto Lb3
        Lae:
            defpackage.AbstractC2193.m3595(r1, r2)     // Catch: java.lang.Throwable -> L17
            goto Lb3
        Lb2:
            throw r2     // Catch: java.lang.Throwable -> L17
        Lb3:
            ᛱᛴᛶᛳ r2 = r4.f6523     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L2
            ᛶᛵᛶᛶ r3 = r8.f1032     // Catch: java.lang.Throwable -> L17
            ᛶᲈᛷᛵ r3 = r3.f4836     // Catch: java.lang.Throwable -> L17
            r3.addFirst(r2)     // Catch: java.lang.Throwable -> L17
            goto L2
        Lc0:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = "Canceled"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L17
            throw r0     // Catch: java.lang.Throwable -> L17
        Lc8:
            r8.m636()
            throw r0
    }
}
