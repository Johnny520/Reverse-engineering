package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛴᛳᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0749 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.Object f2510;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0844 f2511;

    static {
            java.lang.Class<xhss.ᛸᛴᛳᲈ> r0 = xhss.C0749.class
            xhss.AbstractC0993.m1628(r0)
            return
    }

    public C0749(java.lang.Object r2, xhss.C0844 r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "json can not be null"
            xhss.AbstractC0473.m858(r2, r0)
            r1.f2511 = r3
            r1.f2510 = r2
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.Object m1289(java.lang.String r11, xhss.InterfaceC0786... r12) {
            r10 = this;
            java.lang.String r0 = "path can not be null or empty"
            xhss.AbstractC0473.m856(r11, r0)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = xhss.C1138.f3664
            xhss.ᲇᛱᲈᛱ r0 = xhss.AbstractC0083.f428
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
            java.lang.String r1 = xhss.AbstractC0473.m860(r4)
        L1f:
            r4 = r0
            xhss.ᛷᛱᛳᲁ r4 = (xhss.C0623) r4
            java.lang.Object r5 = r4.f2153
            java.util.concurrent.ConcurrentHashMap r5 = (java.util.concurrent.ConcurrentHashMap) r5
            java.lang.Object r5 = r5.get(r1)
            xhss.ᛴᛶᛷᲈ r5 = (xhss.C0373) r5
            if (r5 == 0) goto L31
            r4.m1098(r1)
        L31:
            if (r5 != 0) goto L82
            java.lang.String r4 = "json can not be null or empty"
            xhss.AbstractC0473.m856(r11, r4)
            xhss.ᛴᛶᛷᲈ r5 = new xhss.ᛴᛶᛷᲈ
            r5.<init>(r11, r12)
            xhss.ᛷᛱᛳᲁ r0 = (xhss.C0623) r0
            java.lang.Object r11 = r0.f2152
            java.util.LinkedList r11 = (java.util.LinkedList) r11
            java.lang.Object r12 = r0.f2151
            java.util.concurrent.locks.ReentrantLock r12 = (java.util.concurrent.locks.ReentrantLock) r12
            java.lang.Object r4 = r0.f2153
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4
            java.lang.Object r6 = r4.put(r1, r5)
            xhss.ᛴᛶᛷᲈ r6 = (xhss.C0373) r6
            if (r6 == 0) goto L57
            r0.m1098(r1)
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
            xhss.ᲀᛲᲇ r11 = r10.f2511
            java.util.Set r12 = r11.f2744
            xhss.ᲇᛵᛲᲁ r0 = r11.f2745
            xhss.ᛳᛳᛱᛳ r1 = xhss.EnumC0250.f932
            boolean r4 = r12.contains(r1)
            xhss.ᛳᛳᛱᛳ r6 = xhss.EnumC0250.f929
            boolean r7 = r12.contains(r6)
            xhss.ᛳᛳᛱᛳ r8 = xhss.EnumC0250.f930
            boolean r12 = r12.contains(r8)
            xhss.ᛴᲇᲀᛴ r5 = r5.f1356
            xhss.ᲀᛷᲈᛳ r8 = r5.f1479
            xhss.ᛳᛳᛵᛱ r9 = r8.f2840
            boolean r9 = r9 instanceof xhss.C1112
            java.lang.Object r10 = r10.f2510
            if (r9 == 0) goto L10d
            if (r4 != 0) goto Ld5
            if (r7 == 0) goto Lab
            goto Ld5
        Lab:
            xhss.ᛵᲈᛷ r10 = r5.m810(r10, r10, r11)
            if (r12 == 0) goto Ld0
            java.util.ArrayList r11 = r10.m942()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto Ld0
            boolean r10 = r8.m563()
            if (r10 == 0) goto Lc3
            goto L179
        Lc3:
            java.lang.Object r10 = r0.f3349
            xhss.ᛸᛵᛷᲁ r10 = (xhss.C0768) r10
            r10.getClass()
            xhss.ᛸᛱᲈᛵ r10 = new xhss.ᛸᛱᲈᛵ
            r10.<init>()
            return r10
        Ld0:
            java.lang.Object r10 = r10.m943(r2)
            return r10
        Ld5:
            if (r12 == 0) goto Lec
            boolean r10 = r8.m563()
            if (r10 == 0) goto Ldf
            goto L179
        Ldf:
            java.lang.Object r10 = r0.f3349
            xhss.ᛸᛵᛷᲁ r10 = (xhss.C0768) r10
            r10.getClass()
            xhss.ᛸᛱᲈᛵ r10 = new xhss.ᛸᛱᲈᛵ
            r10.<init>()
            return r10
        Lec:
            xhss.ᛵᛲᛲᲇ r10 = new xhss.ᛵᛲᛲᲇ
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
            xhss.ᛵᲈᛷ r10 = r5.m810(r10, r10, r11)
            if (r12 == 0) goto L12c
            java.util.ArrayList r11 = r10.m942()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L12c
            java.lang.Object r10 = r0.f3349
            xhss.ᛸᛵᛷᲁ r10 = (xhss.C0768) r10
            r10.getClass()
            xhss.ᛸᛱᲈᛵ r10 = new xhss.ᛸᛱᲈᛵ
            r10.<init>()
            return r10
        L12c:
            int r11 = r10.f1941
            if (r11 != 0) goto L151
            boolean r11 = r10.f1942
            if (r11 == 0) goto L135
            goto L179
        L135:
            xhss.ᛸᲁᛴᛷ r11 = new xhss.ᛸᲁᛴᛷ
            xhss.ᛴᲇᲀᛴ r10 = r10.f1943
            xhss.ᲀᛷᲈᛳ r10 = r10.f1479
            java.lang.String r10 = r10.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "No results for path: "
            r12.<init>(r0)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L151:
            java.lang.Object r10 = r10.f1938
            return r10
        L154:
            xhss.ᛵᲈᛷ r10 = r5.m810(r10, r10, r11)
            if (r12 == 0) goto L188
            java.util.ArrayList r11 = r10.m942()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L188
            if (r7 == 0) goto L173
            java.lang.Object r10 = r0.f3349
            xhss.ᛸᛵᛷᲁ r10 = (xhss.C0768) r10
            r10.getClass()
            xhss.ᛸᛱᲈᛵ r10 = new xhss.ᛸᛱᲈᛵ
            r10.<init>()
            return r10
        L173:
            boolean r10 = r8.m563()
            if (r10 == 0) goto L17b
        L179:
            r10 = 0
            return r10
        L17b:
            java.lang.Object r10 = r0.f3349
            xhss.ᛸᛵᛷᲁ r10 = (xhss.C0768) r10
            r10.getClass()
            xhss.ᛸᛱᲈᛵ r10 = new xhss.ᛸᛱᲈᛵ
            r10.<init>()
            return r10
        L188:
            java.lang.Object r10 = r10.m943(r3)
            if (r7 == 0) goto L1a4
            boolean r11 = r8.m563()
            if (r11 == 0) goto L1a4
            java.lang.Object r11 = r0.f3349
            xhss.ᛸᛵᛷᲁ r11 = (xhss.C0768) r11
            r11.getClass()
            xhss.ᛸᛱᲈᛵ r11 = new xhss.ᛸᛱᲈᛵ
            r11.<init>()
            r0.m1689(r3, r11, r10)
            return r11
        L1a4:
            return r10
    }
}
