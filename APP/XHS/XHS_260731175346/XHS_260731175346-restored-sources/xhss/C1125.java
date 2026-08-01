package xhss;

/* JADX INFO: renamed from: xhss.ᲈᛲᛶᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1125 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.util.concurrent.ConcurrentHashMap f3630;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0230 f3631;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final java.util.List f3632;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.ThreadLocal f3633;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final xhss.C0105 f3634;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final xhss.C0089 f3635;

    public C1125(xhss.C0477 r5) {
            r4 = this;
            r4.<init>()
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r4.f3633 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r4.f3630 = r0
            xhss.ᛱᛷᲈᛱ r0 = r5.f1728
            java.util.HashMap r0 = new java.util.HashMap
            java.util.HashMap r1 = r5.f1725
            r0.<init>(r1)
            xhss.ᛱᲀᛸᛸ r1 = r5.f1727
            r4.f3635 = r1
            java.util.ArrayList r1 = r5.f1726
            xhss.C0477.m876(r1)
            java.util.ArrayList r1 = r5.f1732
            xhss.C0477.m876(r1)
            java.util.ArrayDeque r1 = r5.f1733
            java.util.List r1 = xhss.C0477.m876(r1)
            xhss.ᛵᛶᛱᛸ r2 = xhss.C0477.f1721
            if (r5 != r2) goto L3f
            xhss.ᛳᛱᛲᲀ r5 = xhss.C0477.f1724
            r4.f3631 = r5
            xhss.ᛱᲁᲈᛷ r5 = xhss.C0477.f1719
            r4.f3634 = r5
            java.util.List r5 = xhss.C0477.f1723
            r4.f3632 = r5
            return
        L3f:
            xhss.ᛳᛱᛲᲀ r2 = new xhss.ᛳᛱᛲᲀ
            r3 = 4
            r2.<init>(r3, r0, r1)
            r4.f3631 = r2
            xhss.ᛱᲁᲈᛷ r0 = new xhss.ᛱᲁᲈᛷ
            r0.<init>(r2)
            r4.f3634 = r0
            java.util.List r5 = r5.m877(r2, r0)
            r4.f3632 = r5
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "{serializeNulls:false,factories:"
            r0.<init>(r1)
            java.util.List r1 = r2.f3632
            r0.append(r1)
            java.lang.String r1 = ",instanceCreators:"
            r0.append(r1)
            xhss.ᛳᛱᛲᲀ r2 = r2.f3631
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.AbstractC0121 m1814(java.lang.Class r2) {
            r1 = this;
            xhss.ᛱᛳᲈᛷ r0 = new xhss.ᛱᛳᲈᛷ
            r0.<init>(r2)
            xhss.ᛲᛱᛶᛴ r1 = r1.m1815(r0)
            return r1
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.AbstractC0121 m1815(xhss.C0032 r10) {
            r9 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r9.f3630
            java.lang.Object r1 = r0.get(r10)
            xhss.ᛲᛱᛶᛴ r1 = (xhss.AbstractC0121) r1
            if (r1 == 0) goto Lb
            return r1
        Lb:
            java.lang.ThreadLocal r1 = r9.f3633
            java.lang.Object r2 = r1.get()
            java.util.Map r2 = (java.util.Map) r2
            if (r2 != 0) goto L1f
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.set(r2)
            r3 = 1
            goto L29
        L1f:
            java.lang.Object r3 = r2.get(r10)
            xhss.ᛲᛱᛶᛴ r3 = (xhss.AbstractC0121) r3
            if (r3 == 0) goto L28
            return r3
        L28:
            r3 = 0
        L29:
            xhss.ᛵᛸᲁ r4 = new xhss.ᛵᛸᲁ     // Catch: java.lang.Throwable -> L55
            r4.<init>()     // Catch: java.lang.Throwable -> L55
            r2.put(r10, r4)     // Catch: java.lang.Throwable -> L55
            java.util.List r5 = r9.f3632     // Catch: java.lang.Throwable -> L55
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L55
            r6 = 0
            r7 = r6
        L39:
            boolean r8 = r5.hasNext()     // Catch: java.lang.Throwable -> L55
            if (r8 == 0) goto L5f
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L55
            xhss.ᛴᛲᲀᛵ r7 = (xhss.InterfaceC0341) r7     // Catch: java.lang.Throwable -> L55
            xhss.ᛲᛱᛶᛴ r7 = r7.mo160(r9, r10)     // Catch: java.lang.Throwable -> L55
            if (r7 == 0) goto L39
            xhss.ᛲᛱᛶᛴ r9 = r4.f1857     // Catch: java.lang.Throwable -> L55
            if (r9 != 0) goto L57
            r4.f1857 = r7     // Catch: java.lang.Throwable -> L55
            r2.put(r10, r7)     // Catch: java.lang.Throwable -> L55
            goto L5f
        L55:
            r9 = move-exception
            goto L72
        L57:
            java.lang.AssertionError r9 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L55
            java.lang.String r10 = "Delegate is already set"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L55
            throw r9     // Catch: java.lang.Throwable -> L55
        L5f:
            if (r3 == 0) goto L64
            r1.remove()
        L64:
            if (r7 == 0) goto L6c
            if (r3 == 0) goto L6b
            r0.putAll(r2)
        L6b:
            return r7
        L6c:
            java.lang.String r9 = "GSON (2.14.0) cannot handle "
            xhss.C0532.m956(r10, r9)
            return r6
        L72:
            if (r3 == 0) goto L77
            r1.remove()
        L77:
            throw r9
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final void m1816(java.lang.Object r5, java.lang.Class r6, xhss.C0827 r7) {
            r4 = this;
            java.lang.String r0 = "AssertionError (GSON 2.14.0): "
            xhss.ᛱᛳᲈᛷ r1 = new xhss.ᛱᛳᲈᛷ
            r1.<init>(r6)
            xhss.ᛲᛱᛶᛴ r4 = r4.m1815(r1)
            int r6 = r7.f2695
            r1 = 2
            r2 = 1
            if (r6 != r1) goto L13
            r7.f2695 = r2
        L13:
            boolean r1 = r7.f2697
            boolean r3 = r7.f2694
            r7.f2697 = r2
            r2 = 0
            r7.f2694 = r2
            r4.mo120(r7, r5)     // Catch: java.lang.Throwable -> L26 java.lang.AssertionError -> L28 java.io.IOException -> L3f
            r7.f2695 = r6
            r7.f2697 = r1
            r7.f2694 = r3
            return
        L26:
            r4 = move-exception
            goto L46
        L28:
            r4 = move-exception
            java.lang.AssertionError r5 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = r4.getMessage()     // Catch: java.lang.Throwable -> L26
            r2.append(r0)     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L26
            r5.<init>(r0, r4)     // Catch: java.lang.Throwable -> L26
            throw r5     // Catch: java.lang.Throwable -> L26
        L3f:
            r4 = move-exception
            xhss.ᛱᲈᛲᛷ r5 = new xhss.ᛱᲈᛲᛷ     // Catch: java.lang.Throwable -> L26
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L26
            throw r5     // Catch: java.lang.Throwable -> L26
        L46:
            r7.f2695 = r6
            r7.f2697 = r1
            r7.f2694 = r3
            throw r4
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.Object m1817(java.lang.String r9, xhss.C0032 r10) {
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            java.io.StringReader r1 = new java.io.StringReader
            r1.<init>(r9)
            xhss.ᛴᛷᛸᛷ r9 = new xhss.ᛴᛷᛸᛷ
            r9.<init>(r1)
            java.lang.String r1 = "AssertionError (GSON 2.14.0): "
            java.lang.String r2 = "Type adapter '"
            r3 = 1
            r9.f1380 = r3
            r4 = 2
            r9.m762()     // Catch: java.lang.Throwable -> L5c java.lang.AssertionError -> L5e java.io.IOException -> L60 java.lang.IllegalStateException -> L62 java.io.EOFException -> L64
            r3 = 0
            xhss.ᛲᛱᛶᛴ r8 = r8.m1815(r10)     // Catch: java.lang.Throwable -> L5c java.lang.AssertionError -> L5e java.io.IOException -> L60 java.lang.IllegalStateException -> L62 java.io.EOFException -> L64
            java.lang.Class r10 = r10.f211     // Catch: java.lang.Throwable -> L5c java.lang.AssertionError -> L5e java.io.IOException -> L60 java.lang.IllegalStateException -> L62 java.io.EOFException -> L64
            java.lang.Object r5 = r8.mo119(r9)     // Catch: java.lang.Throwable -> L5c java.lang.AssertionError -> L5e java.io.IOException -> L60 java.lang.IllegalStateException -> L62 java.io.EOFException -> L64
            java.lang.Class r6 = xhss.AbstractC0485.m884(r10)     // Catch: java.lang.Throwable -> L5c java.lang.AssertionError -> L5e java.io.IOException -> L60 java.lang.IllegalStateException -> L62 java.io.EOFException -> L64
            if (r5 == 0) goto L66
            boolean r6 = r6.isInstance(r5)     // Catch: java.lang.Throwable -> L5c java.lang.AssertionError -> L5e java.io.IOException -> L60 java.lang.IllegalStateException -> L62 java.io.EOFException -> L64
            if (r6 == 0) goto L31
            goto L66
        L31:
            java.lang.ClassCastException r6 = new java.lang.ClassCastException     // Catch: java.lang.Throwable -> L5c java.lang.AssertionError -> L5e java.io.IOException -> L60 java.lang.IllegalStateException -> L62 java.io.EOFException -> L64
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c java.lang.AssertionError -> L5e java.io.IOException -> L60 java.lang.IllegalStateException -> L62 java.io.EOFException -> L64
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L5c java.lang.AssertionError -> L5e java.io.IOException -> L60 java.lang.IllegalStateException -> L62 java.io.EOFException -> L64
            r7.append(r8)     // Catch: java.lang.Throwable -> L5c java.lang.AssertionError -> L5e java.io.IOException -> L60 java.lang.IllegalStateException -> L62 java.io.EOFException -> L64
            java.lang.String r8 = "' returned wrong type; requested "
            r7.append(r8)     // Catch: java.lang.Throwable -> L5c java.lang.AssertionError -> L5e java.io.IOException -> L60 java.lang.IllegalStateException -> L62 java.io.EOFException -> L64
            r7.append(r10)     // Catch: java.lang.Throwable -> L5c java.lang.AssertionError -> L5e java.io.IOException -> L60 java.lang.IllegalStateException -> L62 java.io.EOFException -> L64
            java.lang.String r8 = " but got instance of "
            r7.append(r8)     // Catch: java.lang.Throwable -> L5c java.lang.AssertionError -> L5e java.io.IOException -> L60 java.lang.IllegalStateException -> L62 java.io.EOFException -> L64
            java.lang.Class r8 = r5.getClass()     // Catch: java.lang.Throwable -> L5c java.lang.AssertionError -> L5e java.io.IOException -> L60 java.lang.IllegalStateException -> L62 java.io.EOFException -> L64
            r7.append(r8)     // Catch: java.lang.Throwable -> L5c java.lang.AssertionError -> L5e java.io.IOException -> L60 java.lang.IllegalStateException -> L62 java.io.EOFException -> L64
            java.lang.String r8 = "\nVerify that the adapter was registered for the correct type."
            r7.append(r8)     // Catch: java.lang.Throwable -> L5c java.lang.AssertionError -> L5e java.io.IOException -> L60 java.lang.IllegalStateException -> L62 java.io.EOFException -> L64
            java.lang.String r8 = r7.toString()     // Catch: java.lang.Throwable -> L5c java.lang.AssertionError -> L5e java.io.IOException -> L60 java.lang.IllegalStateException -> L62 java.io.EOFException -> L64
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L5c java.lang.AssertionError -> L5e java.io.IOException -> L60 java.lang.IllegalStateException -> L62 java.io.EOFException -> L64
            throw r6     // Catch: java.lang.Throwable -> L5c java.lang.AssertionError -> L5e java.io.IOException -> L60 java.lang.IllegalStateException -> L62 java.io.EOFException -> L64
        L5c:
            r8 = move-exception
            goto Lb8
        L5e:
            r8 = move-exception
            goto L6a
        L60:
            r8 = move-exception
            goto L80
        L62:
            r8 = move-exception
            goto L86
        L64:
            r8 = move-exception
            goto L8c
        L66:
            r9.f1380 = r4
            r0 = r5
            goto L90
        L6a:
            java.lang.AssertionError r10 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r1 = r8.getMessage()     // Catch: java.lang.Throwable -> L5c
            r0.append(r1)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L5c
            r10.<init>(r0, r8)     // Catch: java.lang.Throwable -> L5c
            throw r10     // Catch: java.lang.Throwable -> L5c
        L80:
            xhss.ᛱᲈᛲᛷ r10 = new xhss.ᛱᲈᛲᛷ     // Catch: java.lang.Throwable -> L5c
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L5c
            throw r10     // Catch: java.lang.Throwable -> L5c
        L86:
            xhss.ᛱᲈᛲᛷ r10 = new xhss.ᛱᲈᛲᛷ     // Catch: java.lang.Throwable -> L5c
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L5c
            throw r10     // Catch: java.lang.Throwable -> L5c
        L8c:
            if (r3 == 0) goto Lb2
            r9.f1380 = r4
        L90:
            if (r0 == 0) goto Lb1
            int r8 = r9.m762()     // Catch: java.io.IOException -> La3 xhss.C1198 -> Laa
            r9 = 10
            if (r8 != r9) goto L9b
            goto Lb1
        L9b:
            xhss.ᛱᲈᛲᛷ r8 = new xhss.ᛱᲈᛲᛷ     // Catch: java.io.IOException -> La3 xhss.C1198 -> Laa
            java.lang.String r9 = "JSON document was not fully consumed."
            r8.<init>(r9)     // Catch: java.io.IOException -> La3 xhss.C1198 -> Laa
            throw r8     // Catch: java.io.IOException -> La3 xhss.C1198 -> Laa
        La3:
            r8 = move-exception
            xhss.ᛱᲈᛲᛷ r9 = new xhss.ᛱᲈᛲᛷ
            r9.<init>(r8)
            throw r9
        Laa:
            r8 = move-exception
            xhss.ᛱᲈᛲᛷ r9 = new xhss.ᛱᲈᛲᛷ
            r9.<init>(r8)
            throw r9
        Lb1:
            return r0
        Lb2:
            xhss.ᛱᲈᛲᛷ r10 = new xhss.ᛱᲈᛲᛷ     // Catch: java.lang.Throwable -> L5c
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L5c
            throw r10     // Catch: java.lang.Throwable -> L5c
        Lb8:
            r9.f1380 = r4
            throw r8
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.lang.String m1818(java.lang.Object r9) {
            r8 = this;
            r0 = 0
            r1 = 2
            r2 = 1
            xhss.ᛱᲀᛸᛸ r3 = r8.f3635
            if (r9 != 0) goto L2e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            xhss.ᛳᛸᛶᛸ r4 = new xhss.ᛳᛸᛶᛸ     // Catch: java.io.IOException -> L27
            r4.<init>(r9)     // Catch: java.io.IOException -> L27
            xhss.ᛸᲈᲈᛶ r5 = new xhss.ᛸᲈᲈᛶ     // Catch: java.io.IOException -> L27
            r5.<init>(r4)     // Catch: java.io.IOException -> L27
            r5.m1402(r3)     // Catch: java.io.IOException -> L27
            r5.f2697 = r2     // Catch: java.io.IOException -> L27
            r5.f2695 = r1     // Catch: java.io.IOException -> L27
            r5.f2694 = r0     // Catch: java.io.IOException -> L27
            r8.m1819(r5)     // Catch: java.io.IOException -> L27
            java.lang.String r8 = r9.toString()
            return r8
        L27:
            r8 = move-exception
            xhss.ᛱᲈᛲᛷ r9 = new xhss.ᛱᲈᛲᛷ
            r9.<init>(r8)
            throw r9
        L2e:
            java.lang.Class r4 = r9.getClass()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            xhss.ᛳᛸᛶᛸ r6 = new xhss.ᛳᛸᛶᛸ     // Catch: java.io.IOException -> L52
            r6.<init>(r5)     // Catch: java.io.IOException -> L52
            xhss.ᛸᲈᲈᛶ r7 = new xhss.ᛸᲈᲈᛶ     // Catch: java.io.IOException -> L52
            r7.<init>(r6)     // Catch: java.io.IOException -> L52
            r7.m1402(r3)     // Catch: java.io.IOException -> L52
            r7.f2697 = r2     // Catch: java.io.IOException -> L52
            r7.f2695 = r1     // Catch: java.io.IOException -> L52
            r7.f2694 = r0     // Catch: java.io.IOException -> L52
            r8.m1816(r9, r4, r7)     // Catch: java.io.IOException -> L52
            java.lang.String r8 = r5.toString()
            return r8
        L52:
            r8 = move-exception
            xhss.ᛱᲈᛲᛷ r9 = new xhss.ᛱᲈᛲᛷ
            r9.<init>(r8)
            throw r9
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final void m1819(xhss.C0827 r7) {
            r6 = this;
            xhss.ᲇᛳᛷᛳ r6 = xhss.C1023.f3322
            java.lang.String r0 = "AssertionError (GSON 2.14.0): "
            int r1 = r7.f2695
            boolean r2 = r7.f2697
            boolean r3 = r7.f2694
            r4 = 1
            r7.f2697 = r4
            r5 = 0
            r7.f2694 = r5
            r5 = 2
            if (r1 != r5) goto L15
            r7.f2695 = r4
        L15:
            xhss.ᛲᲁᛸᛴ r4 = xhss.C0208.f775     // Catch: java.lang.AssertionError -> L24 java.lang.Throwable -> L3b java.io.IOException -> L3d
            r4.getClass()     // Catch: java.lang.AssertionError -> L24 java.lang.Throwable -> L3b java.io.IOException -> L3d
            xhss.C0208.m474(r7, r6)     // Catch: java.lang.AssertionError -> L24 java.lang.Throwable -> L3b java.io.IOException -> L3d
            r7.f2695 = r1
            r7.f2697 = r2
            r7.f2694 = r3
            return
        L24:
            r6 = move-exception
            java.lang.AssertionError r4 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L3b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r0 = r6.getMessage()     // Catch: java.lang.Throwable -> L3b
            r5.append(r0)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L3b
            r4.<init>(r0, r6)     // Catch: java.lang.Throwable -> L3b
            throw r4     // Catch: java.lang.Throwable -> L3b
        L3b:
            r6 = move-exception
            goto L44
        L3d:
            r6 = move-exception
            xhss.ᛱᲈᛲᛷ r0 = new xhss.ᛱᲈᛲᛷ     // Catch: java.lang.Throwable -> L3b
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L3b
            throw r0     // Catch: java.lang.Throwable -> L3b
        L44:
            r7.f2695 = r1
            r7.f2697 = r2
            r7.f2694 = r3
            throw r6
    }
}
