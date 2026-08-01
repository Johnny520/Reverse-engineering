package androidx.core.util;

/* JADX INFO: loaded from: classes2.dex */
public final class TimeUtils {
    public static final int HUNDRED_DAY_FIELD_LEN = 19;
    private static final int SECONDS_PER_DAY = 86400;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
    private static char[] sFormatStr;
    private static final java.lang.Object sFormatSync = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.util.TimeUtils.sFormatSync = r0
            r0 = 24
            char[] r0 = new char[r0]
            androidx.core.util.TimeUtils.sFormatStr = r0
            return
    }

    private TimeUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int accumField(int r1, int r2, boolean r3, int r4) {
            r0 = 99
            if (r1 > r0) goto L21
            if (r3 == 0) goto La
            r0 = 3
            if (r4 < r0) goto La
            goto L21
        La:
            r0 = 9
            if (r1 > r0) goto L1e
            if (r3 == 0) goto L14
            r0 = 2
            if (r4 < r0) goto L14
            goto L1e
        L14:
            if (r3 != 0) goto L1b
            if (r1 <= 0) goto L19
            goto L1b
        L19:
            r0 = 0
            return r0
        L1b:
            int r0 = r2 + 1
            return r0
        L1e:
            int r0 = r2 + 2
            return r0
        L21:
            int r0 = r2 + 3
            return r0
    }

    public static void formatDuration(long r3, long r5, java.io.PrintWriter r7) {
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto Lc
            java.lang.String r0 = "--"
            r7.print(r0)
            return
        Lc:
            long r0 = r3 - r5
            r2 = 0
            formatDuration(r0, r7, r2)
            return
    }

    public static void formatDuration(long r1, java.io.PrintWriter r3) {
            r0 = 0
            formatDuration(r1, r3, r0)
            return
    }

    public static void formatDuration(long r5, java.io.PrintWriter r7, int r8) {
            java.lang.Object r0 = androidx.core.util.TimeUtils.sFormatSync
            monitor-enter(r0)
            int r1 = formatDurationLocked(r5, r8)     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L14
            char[] r3 = androidx.core.util.TimeUtils.sFormatStr     // Catch: java.lang.Throwable -> L14
            r4 = 0
            r2.<init>(r3, r4, r1)     // Catch: java.lang.Throwable -> L14
            r7.print(r2)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
    }

    public static void formatDuration(long r4, java.lang.StringBuilder r6) {
            java.lang.Object r0 = androidx.core.util.TimeUtils.sFormatSync
            monitor-enter(r0)
            r1 = 0
            int r2 = formatDurationLocked(r4, r1)     // Catch: java.lang.Throwable -> L10
            char[] r3 = androidx.core.util.TimeUtils.sFormatStr     // Catch: java.lang.Throwable -> L10
            r6.append(r3, r1, r2)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    private static int formatDurationLocked(long r27, int r29) {
            r0 = r27
            r2 = r29
            char[] r3 = androidx.core.util.TimeUtils.sFormatStr
            int r3 = r3.length
            if (r3 >= r2) goto Ld
            char[] r3 = new char[r2]
            androidx.core.util.TimeUtils.sFormatStr = r3
        Ld:
            char[] r3 = androidx.core.util.TimeUtils.sFormatStr
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            r7 = 32
            if (r6 != 0) goto L26
            r4 = 0
            int r2 = r2 + (-1)
        L1a:
            if (r4 >= r2) goto L1f
            r3[r4] = r7
            goto L1a
        L1f:
            r5 = 48
            r3[r4] = r5
            int r5 = r4 + 1
            return r5
        L26:
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 <= 0) goto L2e
            r4 = 43
            r10 = r4
            goto L32
        L2e:
            r4 = 45
            long r0 = -r0
            r10 = r4
        L32:
            r4 = 1000(0x3e8, double:4.94E-321)
            long r8 = r0 % r4
            int r11 = (int) r8
            long r4 = r0 / r4
            double r4 = (double) r4
            double r4 = java.lang.Math.floor(r4)
            int r4 = (int) r4
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 86400(0x15180, float:1.21072E-40)
            if (r4 <= r9) goto L4d
            int r5 = r4 / r9
            int r9 = r9 * r5
            int r4 = r4 - r9
            r12 = r5
            goto L4e
        L4d:
            r12 = r5
        L4e:
            r5 = 3600(0xe10, float:5.045E-42)
            if (r4 <= r5) goto L59
            int r6 = r4 / 3600
            int r5 = r6 * 3600
            int r4 = r4 - r5
            r13 = r6
            goto L5a
        L59:
            r13 = r6
        L5a:
            r5 = 60
            if (r4 <= r5) goto L66
            int r8 = r4 / 60
            int r5 = r8 * 60
            int r4 = r4 - r5
            r14 = r4
            r15 = r8
            goto L68
        L66:
            r14 = r4
            r15 = r8
        L68:
            r4 = 0
            r16 = 3
            r9 = 2
            r8 = 0
            r6 = 1
            if (r2 == 0) goto La5
            int r5 = accumField(r12, r6, r8, r8)
            if (r5 <= 0) goto L77
            r8 = r6
        L77:
            int r8 = accumField(r13, r6, r8, r9)
            int r5 = r5 + r8
            if (r5 <= 0) goto L80
            r8 = r6
            goto L81
        L80:
            r8 = 0
        L81:
            int r8 = accumField(r15, r6, r8, r9)
            int r5 = r5 + r8
            if (r5 <= 0) goto L8a
            r8 = r6
            goto L8b
        L8a:
            r8 = 0
        L8b:
            int r8 = accumField(r14, r6, r8, r9)
            int r5 = r5 + r8
            if (r5 <= 0) goto L95
            r8 = r16
            goto L96
        L95:
            r8 = 0
        L96:
            int r8 = accumField(r11, r9, r6, r8)
            int r8 = r8 + r6
            int r5 = r5 + r8
        L9c:
            if (r5 >= r2) goto La5
            r3[r4] = r7
            int r4 = r4 + 1
            int r5 = r5 + 1
            goto L9c
        La5:
            r3[r4] = r10
            int r17 = r4 + 1
            r8 = r17
            if (r2 == 0) goto Laf
            r4 = r6
            goto Lb0
        Laf:
            r4 = 0
        Lb0:
            r18 = r4
            r19 = 0
            r20 = 0
            r7 = 100
            r4 = r3
            r5 = r12
            r21 = r6
            r6 = r7
            r7 = r17
            r22 = r8
            r23 = 0
            r8 = r19
            r19 = r9
            r9 = r20
            int r9 = printField(r4, r5, r6, r7, r8, r9)
            r8 = r22
            if (r9 == r8) goto Ld4
            r17 = r21
            goto Ld6
        Ld4:
            r17 = r23
        Ld6:
            if (r18 == 0) goto Ldb
            r20 = r19
            goto Ldd
        Ldb:
            r20 = r23
        Ldd:
            r6 = 104(0x68, float:1.46E-43)
            r4 = r3
            r5 = r13
            r7 = r9
            r24 = r8
            r8 = r17
            r17 = r9
            r9 = r20
            int r9 = printField(r4, r5, r6, r7, r8, r9)
            r8 = r24
            if (r9 == r8) goto Lf5
            r17 = r21
            goto Lf7
        Lf5:
            r17 = r23
        Lf7:
            if (r18 == 0) goto Lfc
            r20 = r19
            goto Lfe
        Lfc:
            r20 = r23
        Lfe:
            r6 = 109(0x6d, float:1.53E-43)
            r4 = r3
            r5 = r15
            r7 = r9
            r25 = r8
            r8 = r17
            r17 = r9
            r9 = r20
            int r9 = printField(r4, r5, r6, r7, r8, r9)
            r8 = r25
            if (r9 == r8) goto L114
            goto L116
        L114:
            r21 = r23
        L116:
            if (r18 == 0) goto L119
            goto L11b
        L119:
            r19 = r23
        L11b:
            r6 = 115(0x73, float:1.61E-43)
            r4 = r3
            r5 = r14
            r7 = r9
            r26 = r8
            r8 = r21
            r17 = r9
            r9 = r19
            int r9 = printField(r4, r5, r6, r7, r8, r9)
            if (r18 == 0) goto L133
            r8 = r26
            if (r9 == r8) goto L135
            goto L137
        L133:
            r8 = r26
        L135:
            r16 = r23
        L137:
            r6 = 109(0x6d, float:1.53E-43)
            r17 = 1
            r4 = r3
            r5 = r11
            r7 = r9
            r19 = r8
            r8 = r17
            r17 = r9
            r9 = r16
            int r4 = printField(r4, r5, r6, r7, r8, r9)
            r5 = 115(0x73, float:1.61E-43)
            r3[r4] = r5
            int r5 = r4 + 1
            return r5
    }

    private static int printField(char[] r3, int r4, char r5, int r6, boolean r7, int r8) {
            if (r7 != 0) goto L4
            if (r4 <= 0) goto L3c
        L4:
            r0 = r6
            if (r7 == 0) goto La
            r1 = 3
            if (r8 >= r1) goto Le
        La:
            r1 = 99
            if (r4 <= r1) goto L1a
        Le:
            int r1 = r4 / 100
            int r2 = r1 + 48
            char r2 = (char) r2
            r3[r6] = r2
            int r6 = r6 + 1
            int r2 = r1 * 100
            int r4 = r4 - r2
        L1a:
            if (r7 == 0) goto L1f
            r1 = 2
            if (r8 >= r1) goto L25
        L1f:
            r1 = 9
            if (r4 > r1) goto L25
            if (r0 == r6) goto L31
        L25:
            int r1 = r4 / 10
            int r2 = r1 + 48
            char r2 = (char) r2
            r3[r6] = r2
            int r6 = r6 + 1
            int r2 = r1 * 10
            int r4 = r4 - r2
        L31:
            int r1 = r4 + 48
            char r1 = (char) r1
            r3[r6] = r1
            int r6 = r6 + 1
            r3[r6] = r5
            int r6 = r6 + 1
        L3c:
            return r6
    }
}
