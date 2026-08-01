package defpackage;

/* JADX INFO: renamed from: ᲇᛷᲈᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2100 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C1184 f9007;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object f9008;

    static {
            java.lang.Class<ᲇᛷᲈᛵ> r0 = defpackage.C2100.class
            defpackage.AbstractC1011.m1965(r0)
            return
    }

    public C2100(java.lang.Object r2, defpackage.C1184 r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "json can not be null"
            defpackage.AbstractC1849.m3253(r2, r0)
            r1.f9007 = r3
            r1.f9008 = r2
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.Object m3523(java.lang.String r11, defpackage.InterfaceC1644... r12) {
            r10 = this;
            java.lang.String r0 = "path can not be null or empty"
            defpackage.AbstractC1849.m3252(r11, r0)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.C1087.f4878
            ᛴᛸᲇ r0 = defpackage.AbstractC1197.f5402
            int r1 = r12.length
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L10
            r1 = r11
            goto L1f
        L10:
            java.lang.String r1 = java.util.Arrays.toString(r12)
            r4 = 2
            java.lang.CharSequence[] r4 = new java.lang.CharSequence[r4]
            r4[r3] = r11
            r4[r2] = r1
            java.lang.String r1 = defpackage.AbstractC1849.m3254(r4)
        L1f:
            r4 = r0
            ᛷᛸᛱᛸ r4 = (defpackage.C1326) r4
            java.lang.Object r5 = r4.f5857
            java.util.concurrent.ConcurrentHashMap r5 = (java.util.concurrent.ConcurrentHashMap) r5
            java.lang.Object r5 = r5.get(r1)
            ᛱᛴᛷᛵ r5 = (defpackage.C0080) r5
            if (r5 == 0) goto L31
            r4.m2474(r1)
        L31:
            if (r5 != 0) goto L82
            java.lang.String r4 = "json can not be null or empty"
            defpackage.AbstractC1849.m3252(r11, r4)
            ᛱᛴᛷᛵ r5 = new ᛱᛴᛷᛵ
            r5.<init>(r11, r12)
            ᛷᛸᛱᛸ r0 = (defpackage.C1326) r0
            java.lang.Object r11 = r0.f5859
            java.util.LinkedList r11 = (java.util.LinkedList) r11
            java.lang.Object r12 = r0.f5856
            java.util.concurrent.locks.ReentrantLock r12 = (java.util.concurrent.locks.ReentrantLock) r12
            java.lang.Object r4 = r0.f5857
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4
            java.lang.Object r6 = r4.put(r1, r5)
            ᛱᛴᛷᛵ r6 = (defpackage.C0080) r6
            if (r6 == 0) goto L57
            r0.m2474(r1)
            goto L60
        L57:
            r12.lock()
            r11.addFirst(r1)     // Catch: java.lang.Throwable -> L7d
            r12.unlock()
        L60:
            int r0 = r4.size()
            r1 = 400(0x190, float:5.6E-43)
            if (r0 <= r1) goto L82
            r12.lock()
            java.lang.Object r11 = r11.removeLast()     // Catch: java.lang.Throwable -> L78
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L78
            r12.unlock()
            r4.remove(r11)
            goto L82
        L78:
            r10 = move-exception
            r12.unlock()
            throw r10
        L7d:
            r10 = move-exception
            r12.unlock()
            throw r10
        L82:
            ᛶᲈᛵᛲ r11 = r10.f9007
            java.util.Set r12 = r11.f5375
            ᛸᲈᛸᲈ r0 = r11.f5376
            ᛸᛳᲇ r1 = defpackage.EnumC1463.f6482
            boolean r4 = r12.contains(r1)
            ᛸᛳᲇ r6 = defpackage.EnumC1463.f6483
            boolean r7 = r12.contains(r6)
            ᛸᛳᲇ r8 = defpackage.EnumC1463.f6485
            boolean r12 = r12.contains(r8)
            ᛶᛱᛳᲁ r5 = r5.f817
            ᲀᛳᲁᛵ r8 = r5.f4461
            ᲁᛱᲈᲁ r9 = r8.f7345
            boolean r9 = r9 instanceof defpackage.C0215
            java.lang.Object r10 = r10.f9008
            if (r9 == 0) goto L10d
            if (r4 != 0) goto Ld5
            if (r7 == 0) goto Lab
            goto Ld5
        Lab:
            ᛲᛷᛸ r10 = r5.m1958(r10, r10, r11)
            if (r12 == 0) goto Ld0
            java.util.ArrayList r11 = r10.m997()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto Ld0
            boolean r10 = r8.m3199()
            if (r10 == 0) goto Lc3
            goto L179
        Lc3:
            java.lang.Object r10 = r0.f7101
            ᛳᛲᛵᛳ r10 = (defpackage.C0419) r10
            r10.getClass()
            ᛵᛲᛳᛸ r10 = new ᛵᛲᛳᛸ
            r10.<init>()
            return r10
        Ld0:
            java.lang.Object r10 = r10.m995(r2)
            return r10
        Ld5:
            if (r12 == 0) goto Lec
            boolean r10 = r8.m3199()
            if (r10 == 0) goto Ldf
            goto L179
        Ldf:
            java.lang.Object r10 = r0.f7101
            ᛳᛲᛵᛳ r10 = (defpackage.C0419) r10
            r10.getClass()
            ᛵᛲᛳᛸ r10 = new ᛵᛲᛳᛸ
            r10.<init>()
            return r10
        Lec:
            ᛸᛵᛳᲀ r10 = new ᛸᛵᛳᲀ
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Options "
            r11.<init>(r12)
            r11.append(r1)
            java.lang.String r12 = " and "
            r11.append(r12)
            r11.append(r6)
            java.lang.String r12 = " are not allowed when using path functions!"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L10d:
            if (r4 == 0) goto L154
            ᛲᛷᛸ r10 = r5.m1958(r10, r10, r11)
            if (r12 == 0) goto L12c
            java.util.ArrayList r11 = r10.m997()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L12c
            java.lang.Object r10 = r0.f7101
            ᛳᛲᛵᛳ r10 = (defpackage.C0419) r10
            r10.getClass()
            ᛵᛲᛳᛸ r10 = new ᛵᛲᛳᛸ
            r10.<init>()
            return r10
        L12c:
            int r11 = r10.f1680
            if (r11 != 0) goto L151
            boolean r11 = r10.f1687
            if (r11 == 0) goto L135
            goto L179
        L135:
            ᛸᲇᛱᛵ r11 = new ᛸᲇᛱᛵ
            ᛶᛱᛳᲁ r10 = r10.f1682
            ᲀᛳᲁᛵ r10 = r10.f4461
            java.lang.String r10 = r10.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "No results for path: "
            r12.<init>(r0)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L151:
            java.lang.Object r10 = r10.f1683
            return r10
        L154:
            ᛲᛷᛸ r10 = r5.m1958(r10, r10, r11)
            if (r12 == 0) goto L188
            java.util.ArrayList r11 = r10.m997()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L188
            if (r7 == 0) goto L173
            java.lang.Object r10 = r0.f7101
            ᛳᛲᛵᛳ r10 = (defpackage.C0419) r10
            r10.getClass()
            ᛵᛲᛳᛸ r10 = new ᛵᛲᛳᛸ
            r10.<init>()
            return r10
        L173:
            boolean r10 = r8.m3199()
            if (r10 == 0) goto L17b
        L179:
            r10 = 0
            return r10
        L17b:
            java.lang.Object r10 = r0.f7101
            ᛳᛲᛵᛳ r10 = (defpackage.C0419) r10
            r10.getClass()
            ᛵᛲᛳᛸ r10 = new ᛵᛲᛳᛸ
            r10.<init>()
            return r10
        L188:
            java.lang.Object r10 = r10.m995(r3)
            if (r7 == 0) goto L1a4
            boolean r11 = r8.m3199()
            if (r11 == 0) goto L1a4
            java.lang.Object r11 = r0.f7101
            ᛳᛲᛵᛳ r11 = (defpackage.C0419) r11
            r11.getClass()
            ᛵᛲᛳᛸ r11 = new ᛵᛲᛳᛸ
            r11.<init>()
            r0.m2900(r11, r3, r10)
            return r11
        L1a4:
            return r10
    }
}
