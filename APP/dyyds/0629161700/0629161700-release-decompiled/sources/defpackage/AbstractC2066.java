package defpackage;

/* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2066 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final byte[] f8879 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final long[] f8880 = null;

    static {
            java.lang.String r0 = "0123456789abcdef"
            java.nio.charset.Charset r1 = defpackage.AbstractC1422.f6221
            byte[] r0 = r0.getBytes(r1)
            defpackage.AbstractC2066.f8879 = r0
            r0 = 20
            long[] r0 = new long[r0]
            r0 = {x0014: FILL_ARRAY_DATA , data: [-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999, 99999999999, 999999999999, 9999999999999, 99999999999999, 999999999999999, 9999999999999999, 99999999999999999, 999999999999999999, 9223372036854775807} // fill-array
            defpackage.AbstractC2066.f8880 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.lang.String m3472(long r6, defpackage.C1569 r8) {
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L1e
            long r3 = r6 - r1
            byte r0 = r8.m2857(r3)
            r5 = 13
            if (r0 != r5) goto L1e
            java.nio.charset.Charset r6 = defpackage.AbstractC1422.f6221
            java.lang.String r6 = r8.m2842(r3, r6)
            r0 = 2
            r8.m2847(r0)
            return r6
        L1e:
            java.nio.charset.Charset r0 = defpackage.AbstractC1422.f6221
            java.lang.String r6 = r8.m2842(r6, r0)
            r8.m2847(r1)
            return r6
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final int m3473(defpackage.C1569 r16, defpackage.C2248 r17, boolean r18) {
            r0 = r16
            ᲁᲇᛶᛶ r0 = r0.f6929
            r1 = -1
            if (r0 != 0) goto Lb
            if (r18 == 0) goto La
            goto L53
        La:
            return r1
        Lb:
            byte[] r2 = r0.f8467
            int r3 = r0.f8468
            int r4 = r0.f8466
            r5 = r17
            int[] r5 = r5.f9565
            r6 = 0
            r8 = r0
            r9 = r1
            r7 = r6
        L19:
            int r10 = r7 + 1
            r11 = r5[r7]
            int r7 = r7 + 2
            r10 = r5[r10]
            if (r10 == r1) goto L24
            r9 = r10
        L24:
            if (r8 != 0) goto L27
            goto L51
        L27:
            r10 = 0
            if (r11 >= 0) goto L69
            int r11 = r11 * (-1)
            int r12 = r11 + r7
        L2e:
            int r11 = r3 + 1
            r3 = r2[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r13 = r7 + 1
            r7 = r5[r7]
            if (r3 == r7) goto L3b
            goto L73
        L3b:
            if (r13 != r12) goto L3f
            r3 = 1
            goto L40
        L3f:
            r3 = r6
        L40:
            if (r11 != r4) goto L59
            ᲁᲇᛶᛶ r2 = r8.f8469
            int r4 = r2.f8468
            byte[] r7 = r2.f8467
            int r8 = r2.f8466
            if (r2 != r0) goto L55
            if (r3 == 0) goto L51
            r2 = r7
            r7 = r10
            goto L5c
        L51:
            if (r18 == 0) goto L73
        L53:
            r0 = -2
            return r0
        L55:
            r15 = r7
            r7 = r2
            r2 = r15
            goto L5c
        L59:
            r7 = r8
            r8 = r4
            r4 = r11
        L5c:
            if (r3 == 0) goto L64
            r3 = r5[r13]
            r15 = r8
            r8 = r7
            r7 = r15
            goto L92
        L64:
            r3 = r4
            r4 = r8
            r8 = r7
            r7 = r13
            goto L2e
        L69:
            int r12 = r3 + 1
            r3 = r2[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r13 = r7 + r11
        L71:
            if (r7 != r13) goto L74
        L73:
            return r9
        L74:
            r14 = r5[r7]
            if (r3 != r14) goto L9c
            int r7 = r7 + r11
            r3 = r5[r7]
            if (r12 != r4) goto L90
            ᲁᲇᛶᛶ r8 = r8.f8469
            int r2 = r8.f8468
            byte[] r4 = r8.f8467
            int r7 = r8.f8466
            if (r8 != r0) goto L8c
            r8 = r4
            r4 = r2
            r2 = r8
            r8 = r10
            goto L92
        L8c:
            r15 = r4
            r4 = r2
            r2 = r15
            goto L92
        L90:
            r7 = r4
            r4 = r12
        L92:
            if (r3 < 0) goto L95
            return r3
        L95:
            int r3 = -r3
            r15 = r7
            r7 = r3
            r3 = r4
            r4 = r15
            goto L19
        L9c:
            int r7 = r7 + 1
            goto L71
    }
}
