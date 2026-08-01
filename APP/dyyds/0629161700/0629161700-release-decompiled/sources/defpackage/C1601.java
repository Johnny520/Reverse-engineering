package defpackage;

/* JADX INFO: renamed from: ᛸᲈᛴᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1601 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final defpackage.C1601 f7085 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final java.util.List f7086 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C1128 f7087 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C0478 f7088;

    static {
            r0 = 1
            byte[] r1 = new byte[r0]
            r2 = 42
            r3 = 0
            r1[r3] = r2
            ᛶᛸᛸᛶ r2 = new ᛶᛸᛸᛶ
            byte[] r1 = java.util.Arrays.copyOf(r1, r0)
            r2.<init>(r1)
            defpackage.C1601.f7087 = r2
            java.lang.String r1 = "*"
            java.util.List r1 = java.util.Collections.singletonList(r1)
            defpackage.C1601.f7086 = r1
            ᛸᲈᛴᛴ r1 = new ᛸᲈᛴᛴ
            ᛳᛵᛴᛴ r2 = new ᛳᛵᛴᛴ
            r2.<init>(r0)
            r1.<init>(r2)
            defpackage.C1601.f7085 = r1
            return
    }

    public C1601(defpackage.C0478 r1) {
            r0 = this;
            r0.<init>()
            r0.f7088 = r1
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static java.util.List m2891(java.lang.String r3) {
            r0 = 1
            char[] r0 = new char[r0]
            r1 = 46
            r2 = 0
            r0[r2] = r1
            java.util.List r3 = defpackage.AbstractC1347.m2502(r3, r0)
            java.lang.Object r0 = defpackage.AbstractC1107.m2114(r3)
            java.lang.String r1 = ""
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r1)
            if (r0 == 0) goto L1c
            java.util.List r3 = defpackage.AbstractC1107.m2120(r3)
        L1c:
            return r3
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String m2892(java.lang.String r12) {
            r11 = this;
            java.lang.String r0 = java.net.IDN.toUnicode(r12)
            java.util.List r0 = m2891(r0)
            ᛳᛵᛴᛴ r11 = r11.f7088
            java.lang.Object r1 = r11.f2401
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1
            boolean r2 = r1.get()
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L41
            boolean r1 = r1.compareAndSet(r4, r3)
            if (r1 == 0) goto L41
            r1 = r4
        L1d:
            r11.m1253()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c java.io.InterruptedIOException -> L32
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
            r11.f2398 = r2     // Catch: java.lang.Throwable -> L2a
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
            java.lang.Object r1 = r11.f2400     // Catch: java.lang.InterruptedException -> L49
            java.util.concurrent.CountDownLatch r1 = (java.util.concurrent.CountDownLatch) r1     // Catch: java.lang.InterruptedException -> L49
            r1.await()     // Catch: java.lang.InterruptedException -> L49
            goto L50
        L49:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L50:
            java.lang.Object r1 = r11.f2403
            ᛶᛸᛸᛶ r1 = (defpackage.C1128) r1
            if (r1 == 0) goto L166
            int r1 = r0.size()
            ᛶᛸᛸᛶ[] r2 = new defpackage.C1128[r1]
            r5 = r4
        L5d:
            if (r5 >= r1) goto L77
            java.lang.Object r6 = r0.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            ᛶᛸᛸᛶ r7 = new ᛶᛸᛸᛶ
            java.nio.charset.Charset r8 = defpackage.AbstractC1422.f6221
            byte[] r8 = r6.getBytes(r8)
            r7.<init>(r8)
            r7.f5018 = r6
            r2[r5] = r7
            int r5 = r5 + 1
            goto L5d
        L77:
            r5 = r4
        L78:
            r6 = 0
            if (r5 >= r1) goto L8d
            java.lang.Object r7 = r11.f2403
            ᛶᛸᛸᛶ r7 = (defpackage.C1128) r7
            if (r7 == 0) goto L82
            goto L83
        L82:
            r7 = r6
        L83:
            java.lang.String r7 = defpackage.AbstractC1171.m2259(r7, r2, r5)
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
            ᛶᛸᛸᛶ[] r5 = (defpackage.C1128[]) r5
            int r8 = r5.length
            int r8 = r8 - r3
            r9 = r4
        L99:
            if (r9 >= r8) goto Lb1
            ᛶᛸᛸᛶ r10 = defpackage.C1601.f7087
            r5[r9] = r10
            java.lang.Object r10 = r11.f2403
            ᛶᛸᛸᛶ r10 = (defpackage.C1128) r10
            if (r10 == 0) goto La6
            goto La7
        La6:
            r10 = r6
        La7:
            java.lang.String r10 = defpackage.AbstractC1171.m2259(r10, r5, r9)
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
            java.lang.Object r8 = r11.f2404
            ᛶᛸᛸᛶ r8 = (defpackage.C1128) r8
            if (r8 == 0) goto Lbf
            goto Lc0
        Lbf:
            r8 = r6
        Lc0:
            java.lang.String r8 = defpackage.AbstractC1171.m2259(r8, r2, r5)
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
            java.util.List r11 = defpackage.AbstractC1347.m2502(r1, r2)
            goto L10a
        Lde:
            if (r7 != 0) goto Le5
            if (r10 != 0) goto Le5
            java.util.List r11 = defpackage.C1601.f7086
            goto L10a
        Le5:
            ᲀᛶᲇ r1 = defpackage.C1698.f7558
            if (r7 == 0) goto Lf2
            char[] r2 = new char[r3]
            r2[r4] = r11
            java.util.List r2 = defpackage.AbstractC1347.m2502(r7, r2)
            goto Lf3
        Lf2:
            r2 = r1
        Lf3:
            if (r10 == 0) goto Lfd
            char[] r1 = new char[r3]
            r1[r4] = r11
            java.util.List r1 = defpackage.AbstractC1347.m2502(r10, r1)
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
            java.util.List r11 = m2891(r12)
            ᛵᲀᛱᲈ r12 = new ᛵᲀᛱᲈ
            r12.<init>(r4, r11)
            if (r0 < 0) goto L15e
            if (r0 != 0) goto L151
            goto L157
        L151:
            ᛲᛳᛶᲁ r11 = new ᛲᛳᛶᲁ
            r11.<init>(r12, r0)
            r12 = r11
        L157:
            java.lang.String r11 = "."
            java.lang.String r11 = defpackage.AbstractC0591.m1391(r12, r11)
            return r11
        L15e:
            java.lang.String r11 = "Requested element count "
            java.lang.String r12 = " is less than zero."
            defpackage.C0086.m546(r11, r0, r12)
            return r6
        L166:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to load "
            r0.<init>(r1)
            java.lang.Object r1 = r11.f2399
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r1 = " resource."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            java.lang.Object r11 = r11.f2398
            java.io.IOException r11 = (java.io.IOException) r11
            r12.initCause(r11)
            throw r12
    }
}
