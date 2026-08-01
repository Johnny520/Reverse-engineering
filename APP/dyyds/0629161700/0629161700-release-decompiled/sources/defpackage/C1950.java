package defpackage;

/* JADX INFO: renamed from: ᲁᲇᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1950 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.util.List f8478;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C0245 f8479;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0682 f8480;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.ThreadLocal f8481;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.util.concurrent.ConcurrentHashMap f8482;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final boolean f8483;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.C0622 f8484;

    public C1950() {
            r1 = this;
            ᲇᛷᛸᲇ r0 = defpackage.C2094.f8948
            r1.<init>(r0)
            return
    }

    public C1950(defpackage.C2094 r5) {
            r4 = this;
            r4.<init>()
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r4.f8481 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r4.f8482 = r0
            ᲁᛲᛷᛲ r0 = r5.f8958
            java.util.HashMap r0 = new java.util.HashMap
            java.util.HashMap r1 = r5.f8959
            r0.<init>(r1)
            r1 = 1
            r4.f8483 = r1
            ᛴᛲᛵᛱ r1 = r5.f8955
            r4.f8484 = r1
            java.util.ArrayList r1 = r5.f8957
            defpackage.C2094.m3519(r1)
            java.util.ArrayList r1 = r5.f8956
            defpackage.C2094.m3519(r1)
            java.util.ArrayDeque r1 = r5.f8960
            java.util.List r1 = defpackage.C2094.m3519(r1)
            ᲇᛷᛸᲇ r2 = defpackage.C2094.f8948
            if (r5 != r2) goto L42
            ᛴᛵᲇᲇ r5 = defpackage.C2094.f8945
            r4.f8480 = r5
            ᛲᛲᛲᛵ r5 = defpackage.C2094.f8946
            r4.f8479 = r5
            java.util.List r5 = defpackage.C2094.f8950
            r4.f8478 = r5
            return
        L42:
            ᛴᛵᲇᲇ r2 = new ᛴᛵᲇᲇ
            r3 = 15
            r2.<init>(r0, r3, r1)
            r4.f8480 = r2
            ᛲᛲᛲᛵ r0 = new ᛲᛲᛲᛵ
            r0.<init>(r2)
            r4.f8479 = r0
            java.util.List r5 = r5.m3520(r2, r0)
            r4.f8478 = r5
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "{serializeNulls:false,factories:"
            r0.<init>(r1)
            java.util.List r1 = r2.f8478
            r0.append(r1)
            java.lang.String r1 = ",instanceCreators:"
            r0.append(r1)
            ᛴᛵᲇᲇ r2 = r2.f8480
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.String m3365(java.lang.Object r9) {
            r8 = this;
            r0 = 0
            r1 = 2
            boolean r2 = r8.f8483
            ᛴᛲᛵᛱ r3 = r8.f8484
            if (r9 != 0) goto L2f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            ᛷᲀᛸᛵ r4 = new ᛷᲀᛸᛵ     // Catch: java.io.IOException -> L28
            r4.<init>(r9)     // Catch: java.io.IOException -> L28
            ᛲᲀᲁᲇ r5 = new ᛲᲀᲁᲇ     // Catch: java.io.IOException -> L28
            r5.<init>(r4)     // Catch: java.io.IOException -> L28
            r5.m1081(r3)     // Catch: java.io.IOException -> L28
            r5.f1837 = r2     // Catch: java.io.IOException -> L28
            r5.f1844 = r1     // Catch: java.io.IOException -> L28
            r5.f1841 = r0     // Catch: java.io.IOException -> L28
            r8.m3370(r5)     // Catch: java.io.IOException -> L28
            java.lang.String r8 = r9.toString()
            return r8
        L28:
            r8 = move-exception
            ᛲᛱᛶᲀ r9 = new ᛲᛱᛶᲀ
            r9.<init>(r8)
            throw r9
        L2f:
            java.lang.Class r4 = r9.getClass()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            ᛷᲀᛸᛵ r6 = new ᛷᲀᛸᛵ     // Catch: java.io.IOException -> L53
            r6.<init>(r5)     // Catch: java.io.IOException -> L53
            ᛲᲀᲁᲇ r7 = new ᛲᲀᲁᲇ     // Catch: java.io.IOException -> L53
            r7.<init>(r6)     // Catch: java.io.IOException -> L53
            r7.m1081(r3)     // Catch: java.io.IOException -> L53
            r7.f1837 = r2     // Catch: java.io.IOException -> L53
            r7.f1844 = r1     // Catch: java.io.IOException -> L53
            r7.f1841 = r0     // Catch: java.io.IOException -> L53
            r8.m3371(r9, r4, r7)     // Catch: java.io.IOException -> L53
            java.lang.String r8 = r5.toString()
            return r8
        L53:
            r8 = move-exception
            ᛲᛱᛶᲀ r9 = new ᛲᛱᛶᲀ
            r9.<init>(r8)
            throw r9
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.AbstractC0758 m3366(java.lang.Class r2) {
            r1 = this;
            ᲁᲇᛸᲈ r0 = new ᲁᲇᛸᲈ
            r0.<init>(r2)
            ᛴᲀᲈᛴ r1 = r1.m3367(r0)
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.AbstractC0758 m3367(defpackage.C1949 r10) {
            r9 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r9.f8482
            java.lang.Object r1 = r0.get(r10)
            ᛴᲀᲈᛴ r1 = (defpackage.AbstractC0758) r1
            if (r1 == 0) goto Lb
            return r1
        Lb:
            java.lang.ThreadLocal r1 = r9.f8481
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
            ᛴᲀᲈᛴ r3 = (defpackage.AbstractC0758) r3
            if (r3 == 0) goto L28
            return r3
        L28:
            r3 = 0
        L29:
            ᛸᲀᛸᛲ r4 = new ᛸᲀᛸᛲ     // Catch: java.lang.Throwable -> L55
            r4.<init>()     // Catch: java.lang.Throwable -> L55
            r2.put(r10, r4)     // Catch: java.lang.Throwable -> L55
            java.util.List r5 = r9.f8478     // Catch: java.lang.Throwable -> L55
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L55
            r6 = 0
            r7 = r6
        L39:
            boolean r8 = r5.hasNext()     // Catch: java.lang.Throwable -> L55
            if (r8 == 0) goto L5f
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L55
            ᛷᲈᲀᲈ r7 = (defpackage.InterfaceC1405) r7     // Catch: java.lang.Throwable -> L55
            ᛴᲀᲈᛴ r7 = r7.mo690(r9, r10)     // Catch: java.lang.Throwable -> L55
            if (r7 == 0) goto L39
            ᛴᲀᲈᛴ r9 = r4.f6898     // Catch: java.lang.Throwable -> L55
            if (r9 != 0) goto L57
            r4.f6898 = r7     // Catch: java.lang.Throwable -> L55
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
            defpackage.C2264.m3685(r10, r9)
            return r6
        L72:
            if (r3 == 0) goto L77
            r1.remove()
        L77:
            throw r9
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.Object m3368(java.lang.String r9, defpackage.C1949 r10) {
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            java.io.StringReader r1 = new java.io.StringReader
            r1.<init>(r9)
            ᛶᛷᛱ r9 = new ᛶᛷᛱ
            r9.<init>(r1)
            java.lang.String r1 = "AssertionError (GSON 2.14.0): "
            java.lang.String r2 = "Type adapter '"
            r3 = 1
            r9.f4923 = r3
            r4 = 2
            r9.m2090()     // Catch: java.lang.Throwable -> L5c java.lang.AssertionError -> L5e java.io.IOException -> L60 java.lang.IllegalStateException -> L62 java.io.EOFException -> L64
            r3 = 0
            ᛴᲀᲈᛴ r8 = r8.m3367(r10)     // Catch: java.lang.Throwable -> L5c java.lang.AssertionError -> L5e java.io.IOException -> L60 java.lang.IllegalStateException -> L62 java.io.EOFException -> L64
            java.lang.Class r10 = r10.f8476     // Catch: java.lang.Throwable -> L5c java.lang.AssertionError -> L5e java.io.IOException -> L60 java.lang.IllegalStateException -> L62 java.io.EOFException -> L64
            java.lang.Object r5 = r8.mo562(r9)     // Catch: java.lang.Throwable -> L5c java.lang.AssertionError -> L5e java.io.IOException -> L60 java.lang.IllegalStateException -> L62 java.io.EOFException -> L64
            java.lang.Class r6 = defpackage.AbstractC2346.m3842(r10)     // Catch: java.lang.Throwable -> L5c java.lang.AssertionError -> L5e java.io.IOException -> L60 java.lang.IllegalStateException -> L62 java.io.EOFException -> L64
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
            r9.f4923 = r4
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
            ᛲᛱᛶᲀ r10 = new ᛲᛱᛶᲀ     // Catch: java.lang.Throwable -> L5c
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L5c
            throw r10     // Catch: java.lang.Throwable -> L5c
        L86:
            ᛲᛱᛶᲀ r10 = new ᛲᛱᛶᲀ     // Catch: java.lang.Throwable -> L5c
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L5c
            throw r10     // Catch: java.lang.Throwable -> L5c
        L8c:
            if (r3 == 0) goto Lb2
            r9.f4923 = r4
        L90:
            if (r0 == 0) goto Lb1
            int r8 = r9.m2090()     // Catch: java.io.IOException -> La3 defpackage.C0939 -> Laa
            r9 = 10
            if (r8 != r9) goto L9b
            goto Lb1
        L9b:
            ᛲᛱᛶᲀ r8 = new ᛲᛱᛶᲀ     // Catch: java.io.IOException -> La3 defpackage.C0939 -> Laa
            java.lang.String r9 = "JSON document was not fully consumed."
            r8.<init>(r9)     // Catch: java.io.IOException -> La3 defpackage.C0939 -> Laa
            throw r8     // Catch: java.io.IOException -> La3 defpackage.C0939 -> Laa
        La3:
            r8 = move-exception
            ᛲᛱᛶᲀ r9 = new ᛲᛱᛶᲀ
            r9.<init>(r8)
            throw r9
        Laa:
            r8 = move-exception
            ᛲᛱᛶᲀ r9 = new ᛲᛱᛶᲀ
            r9.<init>(r8)
            throw r9
        Lb1:
            return r0
        Lb2:
            ᛲᛱᛶᲀ r10 = new ᛲᛱᛶᲀ     // Catch: java.lang.Throwable -> L5c
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L5c
            throw r10     // Catch: java.lang.Throwable -> L5c
        Lb8:
            r9.f4923 = r4
            throw r8
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object m3369(java.lang.String r2, java.lang.reflect.Type r3) {
            r1 = this;
            ᲁᲇᛸᲈ r0 = new ᲁᲇᛸᲈ
            r0.<init>(r3)
            java.lang.Object r1 = r1.m3368(r2, r0)
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final void m3370(defpackage.C0353 r7) {
            r6 = this;
            ᛷᛵᛲᛲ r0 = defpackage.C1271.f5694
            java.lang.String r1 = "AssertionError (GSON 2.14.0): "
            int r2 = r7.f1844
            boolean r3 = r7.f1837
            boolean r4 = r7.f1841
            boolean r6 = r6.f8483
            r7.f1837 = r6
            r6 = 0
            r7.f1841 = r6
            r6 = 2
            if (r2 != r6) goto L17
            r6 = 1
            r7.f1844 = r6
        L17:
            ᲈᛴᲇᲀ r6 = defpackage.C2235.f9531     // Catch: java.lang.AssertionError -> L26 java.lang.Throwable -> L3d java.io.IOException -> L3f
            r6.getClass()     // Catch: java.lang.AssertionError -> L26 java.lang.Throwable -> L3d java.io.IOException -> L3f
            defpackage.C2235.m3627(r7, r0)     // Catch: java.lang.AssertionError -> L26 java.lang.Throwable -> L3d java.io.IOException -> L3f
            r7.f1844 = r2
            r7.f1837 = r3
            r7.f1841 = r4
            return
        L26:
            r6 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L3d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = r6.getMessage()     // Catch: java.lang.Throwable -> L3d
            r5.append(r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L3d
            r0.<init>(r1, r6)     // Catch: java.lang.Throwable -> L3d
            throw r0     // Catch: java.lang.Throwable -> L3d
        L3d:
            r6 = move-exception
            goto L46
        L3f:
            r6 = move-exception
            ᛲᛱᛶᲀ r0 = new ᛲᛱᛶᲀ     // Catch: java.lang.Throwable -> L3d
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L3d
            throw r0     // Catch: java.lang.Throwable -> L3d
        L46:
            r7.f1844 = r2
            r7.f1837 = r3
            r7.f1841 = r4
            throw r6
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final void m3371(java.lang.Object r5, java.lang.Class r6, defpackage.C0353 r7) {
            r4 = this;
            java.lang.String r0 = "AssertionError (GSON 2.14.0): "
            ᲁᲇᛸᲈ r1 = new ᲁᲇᛸᲈ
            r1.<init>(r6)
            ᛴᲀᲈᛴ r6 = r4.m3367(r1)
            int r1 = r7.f1844
            r2 = 2
            if (r1 != r2) goto L13
            r2 = 1
            r7.f1844 = r2
        L13:
            boolean r2 = r7.f1837
            boolean r3 = r7.f1841
            boolean r4 = r4.f8483
            r7.f1837 = r4
            r4 = 0
            r7.f1841 = r4
            r6.mo561(r7, r5)     // Catch: java.lang.Throwable -> L28 java.lang.AssertionError -> L2a java.io.IOException -> L41
            r7.f1844 = r1
            r7.f1837 = r2
            r7.f1841 = r3
            return
        L28:
            r4 = move-exception
            goto L48
        L2a:
            r4 = move-exception
            java.lang.AssertionError r5 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L28
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = r4.getMessage()     // Catch: java.lang.Throwable -> L28
            r6.append(r0)     // Catch: java.lang.Throwable -> L28
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L28
            r5.<init>(r6, r4)     // Catch: java.lang.Throwable -> L28
            throw r5     // Catch: java.lang.Throwable -> L28
        L41:
            r4 = move-exception
            ᛲᛱᛶᲀ r5 = new ᛲᛱᛶᲀ     // Catch: java.lang.Throwable -> L28
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L28
            throw r5     // Catch: java.lang.Throwable -> L28
        L48:
            r7.f1844 = r1
            r7.f1837 = r2
            r7.f1841 = r3
            throw r4
    }
}
