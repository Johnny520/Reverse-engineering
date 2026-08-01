package defpackage;

/* JADX INFO: renamed from: ᛳᛲᛷᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0425 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C2243 f2121 = null;

    static {
            ᲈᛶᛶ r0 = new ᲈᛶᛶ
            r1 = 23
            r0.<init>(r1)
            ᲈᛵᛷᛱ r1 = new ᲈᛵᛷᛱ
            r1.<init>(r0)
            defpackage.AbstractC0425.f2121 = r1
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static int m1184(java.util.List r0) {
            int r0 = r0.size()
            int r0 = r0 + (-1)
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static int m1185(int r1, int r2, int r3) {
            r2 = r2 & 8
            if (r2 == 0) goto L6
            int r1 = r1 + (-1)
        L6:
            if (r3 > r1) goto La
            int r1 = r1 - r3
            return r1
        La:
            java.lang.String r2 = "PROTOCOL_ERROR padding "
            java.lang.String r0 = " > remaining length "
            java.lang.String r1 = defpackage.AbstractC1124.m2143(r3, r1, r2, r0)
            defpackage.C2264.m3682(r1)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static java.util.List m1186(java.lang.Object... r1) {
            int r0 = r1.length
            if (r0 <= 0) goto L8
            java.util.List r1 = java.util.Arrays.asList(r1)
            return r1
        L8:
            ᲀᛶᲇ r1 = defpackage.C1698.f7558
            return r1
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static final int m1187(int r1, int r2, int r3) {
            if (r3 <= 0) goto L18
            if (r1 < r2) goto L5
            goto L1c
        L5:
            int r0 = r2 % r3
            if (r0 < 0) goto La
            goto Lb
        La:
            int r0 = r0 + r3
        Lb:
            int r1 = r1 % r3
            if (r1 < 0) goto Lf
            goto L10
        Lf:
            int r1 = r1 + r3
        L10:
            int r0 = r0 - r1
            int r0 = r0 % r3
            if (r0 < 0) goto L15
            goto L16
        L15:
            int r0 = r0 + r3
        L16:
            int r2 = r2 - r0
            return r2
        L18:
            if (r3 >= 0) goto L31
            if (r1 > r2) goto L1d
        L1c:
            return r2
        L1d:
            int r3 = -r3
            int r1 = r1 % r3
            if (r1 < 0) goto L22
            goto L23
        L22:
            int r1 = r1 + r3
        L23:
            int r0 = r2 % r3
            if (r0 < 0) goto L28
            goto L29
        L28:
            int r0 = r0 + r3
        L29:
            int r1 = r1 - r0
            int r1 = r1 % r3
            if (r1 < 0) goto L2e
            goto L2f
        L2e:
            int r1 = r1 + r3
        L2f:
            int r1 = r1 + r2
            return r1
        L31:
            java.lang.String r1 = "Step is zero."
            defpackage.C2264.m3684(r1)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public static final defpackage.C0569 m1188(defpackage.C0569 r5) {
            ᛱᛸᛵᲁ r0 = r5.m1367()
            ᲇᛸᲀᛲ r1 = new ᲇᛸᲀᛲ
            ᛶᲈᛸᛳ r5 = r5.f2823
            ᛷᛳᛱᛳ r2 = r5.mo630()
            long r3 = r5.mo632()
            r1.<init>(r2, r3)
            r0.f1111 = r1
            ᛳᲇᛲᲁ r5 = r0.m670()
            return r5
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static defpackage.C0203 m1189() {
            ᛱᲇᲀᛲ r0 = new ᛱᲇᲀᛲ
            r1 = 10
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public static final void m1190(defpackage.C2260 r3, defpackage.InterfaceC0140 r4, boolean r5) {
            java.lang.Object r0 = r3.m3658()
            java.lang.Throwable r1 = r3.mo1669(r0)
            if (r1 == 0) goto L10
            ᛴᛸᛲᲀ r3 = new ᛴᛸᛲᲀ
            r3.<init>(r1)
            goto L14
        L10:
            java.lang.Object r3 = r3.mo1672(r0)
        L14:
            if (r5 == 0) goto L4c
            ᛷᲇᲇᲇ r4 = (defpackage.C1395) r4
            ᛶᛱᲀᛶ r5 = r4.f6056
            java.lang.Object r0 = r4.f6054
            ᛳᛵᲈᛵ r1 = r5.f4527
            java.lang.Object r0 = defpackage.C1825.m3215(r1, r0)
            ᛳᛴᛵᛱ r2 = defpackage.C1825.f7959
            if (r0 == r2) goto L2b
            ᲈᛷᛸᛸ r5 = defpackage.AbstractC0762.m1686(r5, r1, r0)
            goto L2c
        L2b:
            r5 = 0
        L2c:
            ᛶᛱᲀᛶ r4 = r4.f6056     // Catch: java.lang.Throwable -> L3f
            r4.mo662(r3)     // Catch: java.lang.Throwable -> L3f
            if (r5 == 0) goto L3b
            boolean r3 = r5.m3709()
            if (r3 == 0) goto L3a
            goto L3b
        L3a:
            return
        L3b:
            defpackage.C1825.m3216(r1, r0)
            return
        L3f:
            r3 = move-exception
            if (r5 == 0) goto L48
            boolean r4 = r5.m3709()
            if (r4 == 0) goto L4b
        L48:
            defpackage.C1825.m3216(r1, r0)
        L4b:
            throw r3
        L4c:
            r4.mo662(r3)
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final java.lang.Object m1191(com.ss.android.ugc.awemes.WardDatabase r3, defpackage.InterfaceC0598 r4, defpackage.InterfaceC0140 r5) {
            boolean r0 = r3.m299()
            if (r0 == 0) goto L17
            boolean r0 = r3.m300()
            if (r0 == 0) goto L17
            boolean r0 = r3.m302()
            if (r0 == 0) goto L17
            java.lang.Object r3 = r4.mo617(r5)
            return r3
        L17:
            ᛳᛵᲈᛵ r0 = r5.mo663()
            ᲁᛱᲁᛸ r1 = defpackage.C1803.f7901
            ᛶᲁᛳᲈ r0 = r0.mo970(r1)
            if (r0 != 0) goto L28
            java.lang.Object r3 = r4.mo617(r5)
            return r3
        L28:
            ᛲᛷᛶᛸ r0 = new ᛲᛷᛶᛸ
            r1 = 11
            r2 = 0
            r0.<init>(r4, r2, r1)
            ᛳᛵᲈᛵ r4 = r5.mo663()
            ᲁᲁᛷᲈ r1 = defpackage.C2283.f9639
            ᛶᲁᛳᲈ r4 = r4.mo970(r1)
            ᲈᛷᛵᲀ r4 = (defpackage.C2283) r4
            if (r4 == 0) goto L41
            ᲁᛲᛱᛵ r4 = r4.f9640
            goto L42
        L41:
            r4 = r2
        L42:
            if (r4 == 0) goto L49
            java.lang.Object r3 = defpackage.AbstractC0397.m1144(r4, r0, r5)
            return r3
        L49:
            ᲈᛶᛳᛷ r4 = new ᲈᛶᛳᛷ
            ᛱᛸᛲᲀ r5 = defpackage.AbstractC0397.m1142(r5)
            r1 = 1
            r4.<init>(r1, r5)
            r4.m3660()
            ᛳᛴᛶᛲ r5 = r3.f434     // Catch: java.util.concurrent.RejectedExecutionException -> L66
            if (r5 != 0) goto L5b
            goto L5c
        L5b:
            r2 = r5
        L5c:
            ᲁᛷᲇᛷ r5 = new ᲁᛷᲇᛷ     // Catch: java.util.concurrent.RejectedExecutionException -> L66
            r1 = 2
            r5.<init>(r4, r3, r0, r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L66
            r2.execute(r5)     // Catch: java.util.concurrent.RejectedExecutionException -> L66
            goto L71
        L66:
            r3 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unable to acquire a thread to perform the database transaction."
            r5.<init>(r0, r3)
            r4.m3663(r5)
        L71:
            java.lang.Object r3 = r4.m3654()
            return r3
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static defpackage.C1593 m1192(defpackage.C1593 r2) {
            ᛴᛴᲁᲇ r0 = r2.f7043
            r0.m1500()
            r1 = 1
            r0.f3225 = r1
            int r1 = r0.f3222
            if (r1 <= 0) goto Ld
            goto Lf
        Ld:
            ᛴᛴᲁᲇ r1 = defpackage.C0665.f3220
        Lf:
            int r0 = r0.f3222
            if (r0 <= 0) goto L14
            return r2
        L14:
            ᛸᲇᲈᲀ r2 = defpackage.C1593.f7042
            return r2
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static defpackage.C2027 m1193() {
            ᲇᛶᲀᛸ r0 = defpackage.C2027.f8733
            java.lang.Object r1 = r0.f8900
            ᲇᛳᲇ[] r1 = (defpackage.C2027[]) r1
            r2 = 1
            r1 = r1[r2]
            r3 = 0
            if (r1 != 0) goto L30
            long r4 = java.lang.System.nanoTime()
            java.util.concurrent.locks.Condition r1 = defpackage.C2027.f8734
            long r6 = defpackage.C2027.f8735
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1.await(r6, r8)
            java.lang.Object r0 = r0.f8900
            ᲇᛳᲇ[] r0 = (defpackage.C2027[]) r0
            r0 = r0[r2]
            if (r0 != 0) goto L2f
            long r0 = java.lang.System.nanoTime()
            long r0 = r0 - r4
            long r4 = defpackage.C2027.f8737
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L2f
            ᲇᛳᲇ r0 = defpackage.C2027.f8736
            return r0
        L2f:
            return r3
        L30:
            long r4 = java.lang.System.nanoTime()
            long r6 = r1.f8741
            long r6 = r6 - r4
            r4 = 0
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 <= 0) goto L45
            java.util.concurrent.locks.Condition r0 = defpackage.C2027.f8734
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            r0.await(r6, r1)
            return r3
        L45:
            r0.m3499(r1)
            r0 = 2
            r1.f8739 = r0
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static void m1194(defpackage.C2027 r8) {
            ᲇᛳᲇ r0 = defpackage.C2027.f8736
            r1 = 1
            if (r0 != 0) goto L19
            ᲇᛳᲇ r0 = new ᲇᛳᲇ
            r0.<init>()
            defpackage.C2027.f8736 = r0
            ᛳᛲᲇᛸ r0 = new ᛳᛲᲇᛸ
            java.lang.String r2 = "Okio Watchdog"
            r0.<init>(r2)
            r0.setDaemon(r1)
            r0.start()
        L19:
            long r2 = java.lang.System.nanoTime()
            long r4 = r8.f4839
            boolean r0 = r8.f4840
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L36
            if (r0 == 0) goto L36
            long r6 = r8.mo1799()
            long r6 = r6 - r2
            long r4 = java.lang.Math.min(r4, r6)
            long r4 = r4 + r2
            r8.f8741 = r4
            goto L44
        L36:
            if (r6 == 0) goto L3c
            long r2 = r2 + r4
            r8.f8741 = r2
            goto L44
        L3c:
            if (r0 == 0) goto L6b
            long r2 = r8.mo1799()
            r8.f8741 = r2
        L44:
            ᲇᛶᲀᛸ r0 = defpackage.C2027.f8733
            int r2 = r0.f8901
            int r2 = r2 + r1
            r0.f8901 = r2
            java.lang.Object r3 = r0.f8900
            ᲇᛳᲇ[] r3 = (defpackage.C2027[]) r3
            int r4 = r3.length
            if (r2 != r4) goto L5e
            int r4 = r2 * 2
            ᲇᛳᲇ[] r4 = new defpackage.C2027[r4]
            r5 = 14
            r6 = 0
            defpackage.AbstractC2315.m3774(r6, r6, r5, r3, r4)
            r0.f8900 = r4
        L5e:
            r0.m3503(r2, r8)
            int r8 = r8.f8740
            if (r8 != r1) goto L6a
            java.util.concurrent.locks.Condition r8 = defpackage.C2027.f8734
            r8.signal()
        L6a:
            return
        L6b:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public static java.util.Set m1195(java.lang.Object... r4) {
            int r0 = r4.length
            if (r0 == 0) goto L24
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L1d
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r2 = r4.length
            int r2 = defpackage.AbstractC1893.m3323(r2)
            r0.<init>(r2)
            int r2 = r4.length
        L12:
            if (r1 >= r2) goto L1c
            r3 = r4[r1]
            r0.add(r3)
            int r1 = r1 + 1
            goto L12
        L1c:
            return r0
        L1d:
            r4 = r4[r1]
            java.util.Set r4 = java.util.Collections.singleton(r4)
            return r4
        L24:
            ᛵᲈᛳᲀ r4 = defpackage.C0993.f4434
            return r4
    }

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public static void m1196() {
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "Index overflow has happened."
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static defpackage.C0203 m1197(defpackage.C0203 r1) {
            r1.m751()
            r0 = 1
            r1.f1276 = r0
            int r0 = r1.f1277
            if (r0 <= 0) goto Lb
            return r1
        Lb:
            ᛱᲇᲀᛲ r1 = defpackage.C0203.f1275
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final int m1198(char r3) {
            r0 = 48
            if (r0 > r3) goto La
            r1 = 58
            if (r3 >= r1) goto La
            int r3 = r3 - r0
            return r3
        La:
            r0 = 97
            if (r0 > r3) goto L15
            r0 = 103(0x67, float:1.44E-43)
            if (r3 >= r0) goto L15
            int r3 = r3 + (-87)
            return r3
        L15:
            r0 = 65
            if (r0 > r3) goto L20
            r0 = 71
            if (r3 >= r0) goto L20
            int r3 = r3 + (-55)
            return r3
        L20:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected hex digit: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public static void m1199() {
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "Count overflow has happened."
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static android.content.res.ColorStateList m1200(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L14
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L14
            android.content.res.ColorStateList r1 = defpackage.AbstractC2279.m3698(r1, r0)
            if (r1 == 0) goto L14
            return r1
        L14:
            android.content.res.ColorStateList r1 = r2.getColorStateList(r3)
            return r1
    }
}
