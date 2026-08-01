package defpackage;

/* JADX INFO: renamed from: ᲁᛷᛱᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1880 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static final defpackage.C2054 f8154 = null;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static final java.lang.ThreadLocal f8155 = null;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public long f8156;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public long f8157;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.util.ArrayList f8158;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.util.ArrayList f8159;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            defpackage.RunnableC1880.f8155 = r0
            ᲇᛵᲀᲇ r0 = new ᲇᛵᲀᲇ
            r1 = 12
            r0.<init>(r1)
            defpackage.RunnableC1880.f8154 = r0
            return
    }

    public RunnableC1880() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f8158 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f8159 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static defpackage.AbstractC2316 m3288(defpackage.C0055 r5, int r6, long r7) {
            ᲈᛷᲀᲀ r0 = r5.f611
            int r0 = r0.m3723()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L23
            ᲈᛷᲀᲀ r3 = r5.f611
            android.view.View r3 = r3.m3718(r2)
            ᲈᛸᲈᛷ r3 = defpackage.C0055.m405(r3)
            int r4 = r3.f9790
            if (r4 != r6) goto L20
            boolean r3 = r3.m3775()
            if (r3 != 0) goto L20
            r5 = 0
            return r5
        L20:
            int r2 = r2 + 1
            goto L8
        L23:
            ᲀᛲᲁᛳ r0 = r5.f637
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 != 0) goto L3c
            boolean r2 = android.os.Trace.isEnabled()     // Catch: java.lang.Throwable -> L3a
            if (r2 == 0) goto L3c
            java.lang.String r2 = "RV Prefetch forced - needed next frame"
            android.os.Trace.beginSection(r2)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            r6 = move-exception
            goto L61
        L3c:
            r5.m432()     // Catch: java.lang.Throwable -> L3a
            ᲈᛸᲈᛷ r6 = r0.m3000(r7, r6)     // Catch: java.lang.Throwable -> L3a
            if (r6 == 0) goto L5a
            boolean r7 = r6.m3792()     // Catch: java.lang.Throwable -> L3a
            if (r7 == 0) goto L57
            boolean r7 = r6.m3775()     // Catch: java.lang.Throwable -> L3a
            if (r7 != 0) goto L57
            android.view.View r7 = r6.f9791     // Catch: java.lang.Throwable -> L3a
            r0.m2999(r7)     // Catch: java.lang.Throwable -> L3a
            goto L5a
        L57:
            r0.m3007(r6, r1)     // Catch: java.lang.Throwable -> L3a
        L5a:
            r5.m448(r1)
            android.os.Trace.endSection()
            return r6
        L61:
            r5.m448(r1)
            android.os.Trace.endSection()
            throw r6
    }

    @Override // java.lang.Runnable
    public final void run() {
            r9 = this;
            java.util.ArrayList r0 = r9.f8158
            r1 = 0
            java.lang.String r3 = "RV Prefetch"
            android.os.Trace.beginSection(r3)     // Catch: java.lang.Throwable -> L32
            boolean r3 = r0.isEmpty()     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L15
        Lf:
            r9.f8157 = r1
            android.os.Trace.endSection()
            return
        L15:
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L32
            r4 = 0
            r5 = r1
        L1b:
            if (r4 >= r3) goto L37
            java.lang.Object r7 = r0.get(r4)     // Catch: java.lang.Throwable -> L32
            ᛱᛳᛶᛱ r7 = (defpackage.C0055) r7     // Catch: java.lang.Throwable -> L32
            int r8 = r7.getWindowVisibility()     // Catch: java.lang.Throwable -> L32
            if (r8 != 0) goto L34
            long r7 = r7.getDrawingTime()     // Catch: java.lang.Throwable -> L32
            long r5 = java.lang.Math.max(r7, r5)     // Catch: java.lang.Throwable -> L32
            goto L34
        L32:
            r0 = move-exception
            goto L49
        L34:
            int r4 = r4 + 1
            goto L1b
        L37:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L3c
            goto Lf
        L3c:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L32
            long r3 = r0.toNanos(r5)     // Catch: java.lang.Throwable -> L32
            long r5 = r9.f8156     // Catch: java.lang.Throwable -> L32
            long r3 = r3 + r5
            r9.m3290(r3)     // Catch: java.lang.Throwable -> L32
            goto Lf
        L49:
            r9.f8157 = r1
            android.os.Trace.endSection()
            throw r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m3289(defpackage.C0055 r5, int r6, int r7) {
            r4 = this;
            boolean r0 = r5.f622
            if (r0 == 0) goto L28
            boolean r0 = defpackage.C0055.f603
            if (r0 == 0) goto L17
            java.util.ArrayList r0 = r4.f8158
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L11
            goto L17
        L11:
            java.lang.String r4 = "attempting to post unregistered view!"
            defpackage.C2264.m3676(r4)
            return
        L17:
            long r0 = r4.f8157
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L28
            long r0 = r5.getNanoTime()
            r4.f8157 = r0
            r5.post(r4)
        L28:
            ᛱᛷᛴᲁ r4 = r5.f669
            r4.f1060 = r6
            r4.f1061 = r7
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m3290(long r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            java.util.ArrayList r3 = r0.f8158
            int r4 = r3.size()
            r5 = 0
            r6 = r5
            r7 = r6
        Ld:
            if (r6 >= r4) goto L26
            java.lang.Object r8 = r3.get(r6)
            ᛱᛳᛶᛱ r8 = (defpackage.C0055) r8
            int r9 = r8.getWindowVisibility()
            ᛱᛷᛴᲁ r10 = r8.f669
            if (r9 != 0) goto L23
            r10.m643(r8, r5)
            int r8 = r10.f1058
            int r7 = r7 + r8
        L23:
            int r6 = r6 + 1
            goto Ld
        L26:
            java.util.ArrayList r0 = r0.f8159
            r0.ensureCapacity(r7)
            r6 = r5
            r7 = r6
        L2d:
            r8 = 1
            if (r6 >= r4) goto L87
            java.lang.Object r9 = r3.get(r6)
            ᛱᛳᛶᛱ r9 = (defpackage.C0055) r9
            int r10 = r9.getWindowVisibility()
            if (r10 == 0) goto L3d
            goto L83
        L3d:
            ᛱᛷᛴᲁ r10 = r9.f669
            int r11 = r10.f1060
            int r11 = java.lang.Math.abs(r11)
            int r12 = r10.f1061
            int r12 = java.lang.Math.abs(r12)
            int r12 = r12 + r11
            r11 = r5
        L4d:
            int r13 = r10.f1058
            int r13 = r13 * 2
            if (r11 >= r13) goto L83
            int r13 = r0.size()
            if (r7 < r13) goto L62
            ᛲᲁᲈᛶ r13 = new ᛲᲁᲈᛶ
            r13.<init>()
            r0.add(r13)
            goto L68
        L62:
            java.lang.Object r13 = r0.get(r7)
            ᛲᲁᲈᛶ r13 = (defpackage.C0367) r13
        L68:
            int[] r14 = r10.f1059
            int r15 = r11 + 1
            r15 = r14[r15]
            if (r15 > r12) goto L71
            r5 = r8
        L71:
            r13.f1909 = r5
            r13.f1910 = r12
            r13.f1908 = r15
            r13.f1907 = r9
            r5 = r14[r11]
            r13.f1906 = r5
            int r7 = r7 + 1
            int r11 = r11 + 2
            r5 = 0
            goto L4d
        L83:
            int r6 = r6 + 1
            r5 = 0
            goto L2d
        L87:
            ᲇᛵᲀᲇ r3 = defpackage.RunnableC1880.f8154
            java.util.Collections.sort(r0, r3)
            r3 = 0
        L8d:
            int r4 = r0.size()
            if (r3 >= r4) goto L149
            java.lang.Object r4 = r0.get(r3)
            ᛲᲁᲈᛶ r4 = (defpackage.C0367) r4
            ᛱᛳᛶᛱ r5 = r4.f1907
            if (r5 != 0) goto L9f
            goto L149
        L9f:
            boolean r6 = r4.f1909
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r6 == 0) goto Laa
            r6 = r9
            goto Lab
        Laa:
            r6 = r1
        Lab:
            int r11 = r4.f1906
            ᲈᛸᲈᛷ r5 = m3288(r5, r11, r6)
            if (r5 == 0) goto L133
            java.lang.ref.WeakReference r6 = r5.f9796
            if (r6 == 0) goto L133
            boolean r6 = r5.m3792()
            if (r6 == 0) goto L133
            boolean r6 = r5.m3775()
            if (r6 != 0) goto L133
            java.lang.ref.WeakReference r5 = r5.f9796
            java.lang.Object r5 = r5.get()
            ᛱᛳᛶᛱ r5 = (defpackage.C0055) r5
            if (r5 != 0) goto Lce
            goto L133
        Lce:
            boolean r6 = r5.f645
            if (r6 == 0) goto Lf7
            ᲈᛷᲀᲀ r6 = r5.f611
            int r6 = r6.m3723()
            if (r6 == 0) goto Lf7
            ᲀᛲᲁᛳ r6 = r5.f637
            ᛱᛳᛸᛶ r7 = r5.f658
            if (r7 == 0) goto Le3
            r7.mo471()
        Le3:
            ᛷᛵᛱᲀ r7 = r5.f682
            if (r7 == 0) goto Lef
            r7.m2398(r6)
            ᛷᛵᛱᲀ r7 = r5.f682
            r7.m2392(r6)
        Lef:
            java.util.ArrayList r7 = r6.f7313
            r7.clear()
            r6.m3010()
        Lf7:
            ᛱᛷᛴᲁ r6 = r5.f669
            r6.m643(r5, r8)
            int r7 = r6.f1058
            if (r7 == 0) goto L133
            int r7 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r7 != 0) goto L107
            java.lang.String r7 = "RV Nested Prefetch"
            goto L109
        L107:
            java.lang.String r7 = "RV Nested Prefetch forced - needed next frame"
        L109:
            android.os.Trace.beginSection(r7)     // Catch: java.lang.Throwable -> L135
            ᛵᲈᲁᲀ r7 = r5.f623     // Catch: java.lang.Throwable -> L135
            ᛶᲈᲀᲇ r9 = r5.f633     // Catch: java.lang.Throwable -> L135
            r7.f4451 = r8     // Catch: java.lang.Throwable -> L135
            int r9 = r9.getItemCount()     // Catch: java.lang.Throwable -> L135
            r7.f4449 = r9     // Catch: java.lang.Throwable -> L135
            r9 = 0
            r7.f4458 = r9     // Catch: java.lang.Throwable -> L135
            r7.f4445 = r9     // Catch: java.lang.Throwable -> L135
            r7.f4448 = r9     // Catch: java.lang.Throwable -> L135
            r9 = 0
        L120:
            int r7 = r6.f1058     // Catch: java.lang.Throwable -> L135
            int r7 = r7 * 2
            if (r9 >= r7) goto L130
            int[] r7 = r6.f1059     // Catch: java.lang.Throwable -> L135
            r7 = r7[r9]     // Catch: java.lang.Throwable -> L135
            m3288(r5, r7, r1)     // Catch: java.lang.Throwable -> L135
            int r9 = r9 + 2
            goto L120
        L130:
            android.os.Trace.endSection()
        L133:
            r9 = 0
            goto L13a
        L135:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L13a:
            r4.f1909 = r9
            r4.f1910 = r9
            r4.f1908 = r9
            r5 = 0
            r4.f1907 = r5
            r4.f1906 = r9
            int r3 = r3 + 1
            goto L8d
        L149:
            return
    }
}
