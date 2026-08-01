package xhss;

/* JADX INFO: renamed from: xhss.ᲇᛷᛷᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1057 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final xhss.C0289 f3417 = null;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final java.util.List f3418 = null;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static final xhss.C1057 f3419 = null;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0246 f3420;

    static {
            r0 = 1
            byte[] r1 = new byte[r0]
            r2 = 42
            r3 = 0
            r1[r3] = r2
            xhss.ᛳᛶᲈᲈ r2 = new xhss.ᛳᛶᲈᲈ
            byte[] r1 = java.util.Arrays.copyOf(r1, r0)
            r2.<init>(r1)
            xhss.C1057.f3417 = r2
            java.lang.String r1 = "*"
            java.util.List r1 = java.util.Collections.singletonList(r1)
            xhss.C1057.f3418 = r1
            xhss.ᲇᛷᛷᲀ r1 = new xhss.ᲇᛷᛷᲀ
            xhss.ᛳᛲᲀᲈ r2 = new xhss.ᛳᛲᲀᲈ
            r2.<init>(r0)
            r1.<init>(r2)
            xhss.C1057.f3419 = r1
            return
    }

    public C1057(xhss.C0246 r1) {
            r0 = this;
            r0.<init>()
            r0.f3420 = r1
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static java.util.List m1718(java.lang.String r7) {
            r0 = 1
            char[] r1 = new char[r0]
            r2 = 46
            r3 = 0
            r1[r3] = r2
            java.util.List r7 = xhss.AbstractC0120.m344(r7, r1)
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L7d
            int r1 = xhss.AbstractC0086.m243(r7)
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r2 = ""
            boolean r1 = xhss.AbstractC0007.m97(r1, r2)
            if (r1 == 0) goto L7c
            int r1 = r7.size()
            int r1 = r1 - r0
            if (r1 >= 0) goto L2a
            r1 = r3
        L2a:
            if (r1 < 0) goto L74
            xhss.ᛵᛷᛶᛱ r2 = xhss.C0492.f1802
            if (r1 != 0) goto L31
            return r2
        L31:
            int r4 = r7.size()
            if (r1 < r4) goto L3c
            java.util.List r7 = xhss.AbstractC0713.m1243(r7)
            return r7
        L3c:
            if (r1 != r0) goto L47
            java.lang.Object r7 = xhss.AbstractC0713.m1244(r7)
            java.util.List r7 = java.util.Collections.singletonList(r7)
            return r7
        L47:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
            r5 = r3
        L51:
            boolean r6 = r7.hasNext()
            if (r6 == 0) goto L61
            java.lang.Object r6 = r7.next()
            r4.add(r6)
            int r5 = r5 + r0
            if (r5 != r1) goto L51
        L61:
            int r7 = r4.size()
            if (r7 == 0) goto L73
            if (r7 == r0) goto L6a
            return r4
        L6a:
            java.lang.Object r7 = r4.get(r3)
            java.util.List r7 = java.util.Collections.singletonList(r7)
            return r7
        L73:
            return r2
        L74:
            java.lang.String r7 = "Requested element count "
            java.lang.String r0 = " is less than zero."
            xhss.C0532.m958(r7, r1, r0)
            r7 = 0
        L7c:
            return r7
        L7d:
            java.util.NoSuchElementException r7 = new java.util.NoSuchElementException
            java.lang.String r0 = "List is empty."
            r7.<init>(r0)
            throw r7
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.String m1719(java.lang.String r12) {
            r11 = this;
            java.lang.String r0 = java.net.IDN.toUnicode(r12)
            java.util.List r0 = m1718(r0)
            xhss.ᛳᛲᲀᲈ r11 = r11.f3420
            java.lang.Object r1 = r11.f918
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1
            boolean r2 = r1.get()
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L41
            boolean r1 = r1.compareAndSet(r4, r3)
            if (r1 == 0) goto L41
            r1 = r4
        L1d:
            r11.m553()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c java.io.InterruptedIOException -> L32
            if (r1 == 0) goto L50
        L22:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            goto L50
        L2a:
            r11 = move-exception
            goto L37
        L2c:
            r2 = move-exception
            r11.f917 = r2     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L50
            goto L22
        L32:
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L2a
            r1 = r3
            goto L1d
        L37:
            if (r1 == 0) goto L40
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            r12.interrupt()
        L40:
            throw r11
        L41:
            java.lang.Object r1 = r11.f915     // Catch: java.lang.InterruptedException -> L49
            java.util.concurrent.CountDownLatch r1 = (java.util.concurrent.CountDownLatch) r1     // Catch: java.lang.InterruptedException -> L49
            r1.await()     // Catch: java.lang.InterruptedException -> L49
            goto L50
        L49:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L50:
            java.lang.Object r1 = r11.f916
            xhss.ᛳᛶᲈᲈ r1 = (xhss.C0289) r1
            if (r1 == 0) goto L18b
            int r1 = r0.size()
            xhss.ᛳᛶᲈᲈ[] r2 = new xhss.C0289[r1]
            r5 = r4
        L5d:
            if (r5 >= r1) goto L77
            java.lang.Object r6 = r0.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            xhss.ᛳᛶᲈᲈ r7 = new xhss.ᛳᛶᲈᲈ
            java.nio.charset.Charset r8 = xhss.AbstractC0619.f2136
            byte[] r8 = r6.getBytes(r8)
            r7.<init>(r8)
            r7.f1120 = r6
            r2[r5] = r7
            int r5 = r5 + 1
            goto L5d
        L77:
            r5 = r4
        L78:
            r6 = 0
            if (r5 >= r1) goto L8d
            java.lang.Object r7 = r11.f916
            xhss.ᛳᛶᲈᲈ r7 = (xhss.C0289) r7
            if (r7 == 0) goto L82
            goto L83
        L82:
            r7 = r6
        L83:
            java.lang.String r7 = xhss.AbstractC0007.m95(r7, r2, r5)
            if (r7 == 0) goto L8a
            goto L8e
        L8a:
            int r5 = r5 + 1
            goto L78
        L8d:
            r7 = r6
        L8e:
            if (r1 <= r3) goto Lb1
            java.lang.Object r5 = r2.clone()
            xhss.ᛳᛶᲈᲈ[] r5 = (xhss.C0289[]) r5
            int r8 = r5.length
            int r8 = r8 - r3
            r9 = r4
        L99:
            if (r9 >= r8) goto Lb1
            xhss.ᛳᛶᲈᲈ r10 = xhss.C1057.f3417
            r5[r9] = r10
            java.lang.Object r10 = r11.f916
            xhss.ᛳᛶᲈᲈ r10 = (xhss.C0289) r10
            if (r10 == 0) goto La6
            goto La7
        La6:
            r10 = r6
        La7:
            java.lang.String r10 = xhss.AbstractC0007.m95(r10, r5, r9)
            if (r10 == 0) goto Lae
            goto Lb2
        Lae:
            int r9 = r9 + 1
            goto L99
        Lb1:
            r10 = r6
        Lb2:
            if (r10 == 0) goto Lca
            int r1 = r1 - r3
            r5 = r4
        Lb6:
            if (r5 >= r1) goto Lca
            java.lang.Object r8 = r11.f919
            xhss.ᛳᛶᲈᲈ r8 = (xhss.C0289) r8
            if (r8 == 0) goto Lbf
            goto Lc0
        Lbf:
            r8 = r6
        Lc0:
            java.lang.String r8 = xhss.AbstractC0007.m95(r8, r2, r5)
            if (r8 == 0) goto Lc7
            goto Lcb
        Lc7:
            int r5 = r5 + 1
            goto Lb6
        Lca:
            r8 = r6
        Lcb:
            r11 = 46
            if (r8 == 0) goto Lde
            java.lang.String r1 = "!"
            java.lang.String r1 = r1.concat(r8)
            char[] r2 = new char[r3]
            r2[r4] = r11
            java.util.List r11 = xhss.AbstractC0120.m344(r1, r2)
            goto L10a
        Lde:
            if (r7 != 0) goto Le5
            if (r10 != 0) goto Le5
            java.util.List r11 = xhss.C1057.f3418
            goto L10a
        Le5:
            xhss.ᛵᛷᛶᛱ r1 = xhss.C0492.f1802
            if (r7 == 0) goto Lf2
            char[] r2 = new char[r3]
            r2[r4] = r11
            java.util.List r2 = xhss.AbstractC0120.m344(r7, r2)
            goto Lf3
        Lf2:
            r2 = r1
        Lf3:
            if (r10 == 0) goto Lfd
            char[] r1 = new char[r3]
            r1[r4] = r11
            java.util.List r1 = xhss.AbstractC0120.m344(r10, r1)
        Lfd:
            int r11 = r2.size()
            int r5 = r1.size()
            if (r11 <= r5) goto L109
            r11 = r2
            goto L10a
        L109:
            r11 = r1
        L10a:
            int r1 = r0.size()
            int r2 = r11.size()
            r5 = 33
            if (r1 != r2) goto L123
            java.lang.Object r1 = r11.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            char r1 = r1.charAt(r4)
            if (r1 == r5) goto L123
            return r6
        L123:
            java.lang.Object r1 = r11.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            char r1 = r1.charAt(r4)
            if (r1 != r5) goto L139
            int r0 = r0.size()
            int r11 = r11.size()
        L137:
            int r0 = r0 - r11
            goto L143
        L139:
            int r0 = r0.size()
            int r11 = r11.size()
            int r11 = r11 + r3
            goto L137
        L143:
            java.util.List r11 = m1718(r12)
            xhss.ᲈᛱᛱᲀ r12 = new xhss.ᲈᛱᛱᲀ
            r12.<init>(r4, r11)
            if (r0 < 0) goto L183
            if (r0 != 0) goto L151
            goto L157
        L151:
            xhss.ᛷᛸᛷᛴ r11 = new xhss.ᛷᛸᛷᛴ
            r11.<init>(r12, r0)
            r12 = r11
        L157:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = ""
            r11.append(r0)
            java.util.Iterator r12 = r12.iterator()
        L165:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L17b
            java.lang.Object r1 = r12.next()
            int r4 = r4 + r3
            if (r4 <= r3) goto L177
            java.lang.String r2 = "."
            r11.append(r2)
        L177:
            xhss.AbstractC0561.m1008(r11, r1, r6)
            goto L165
        L17b:
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            return r11
        L183:
            java.lang.String r11 = "Requested element count "
            java.lang.String r12 = " is less than zero."
            xhss.C0532.m958(r11, r0, r12)
            return r6
        L18b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to load "
            r0.<init>(r1)
            java.lang.Object r1 = r11.f920
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r1 = " resource."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            java.lang.Object r11 = r11.f917
            java.io.IOException r11 = (java.io.IOException) r11
            r12.initCause(r11)
            throw r12
    }
}
