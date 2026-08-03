package com.alibaba.fastjson2.util;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Fnv {
    public static final long MAGIC_HASH_CODE = -3750763034362895579L;
    public static final long MAGIC_PRIME = 1099511628211L;

    public Fnv() {
            r0 = this;
            r0.<init>()
            return
    }

    public static long hashCode64(java.lang.String r10) {
            int r0 = r10.length()
            r1 = 0
            r2 = 8
            if (r0 > r2) goto L3d
            r3 = r1
        La:
            if (r3 >= r0) goto L1c
            char r4 = r10.charAt(r3)
            r5 = 255(0xff, float:3.57E-43)
            if (r4 > r5) goto L3d
            if (r3 != 0) goto L19
            if (r4 != 0) goto L19
            goto L3d
        L19:
            int r3 = r3 + 1
            goto La
        L1c:
            int r3 = r0 + (-1)
            r4 = 0
            r6 = r4
        L21:
            if (r3 < 0) goto L38
            char r8 = r10.charAt(r3)
            int r9 = r10.length()
            int r9 = r9 + (-1)
            if (r3 != r9) goto L32
            byte r6 = (byte) r8
            long r6 = (long) r6
            goto L35
        L32:
            long r6 = r6 << r2
            long r8 = (long) r8
            long r6 = r6 + r8
        L35:
            int r3 = r3 + (-1)
            goto L21
        L38:
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 == 0) goto L3d
            return r6
        L3d:
            r2 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
        L42:
            if (r1 >= r0) goto L53
            char r4 = r10.charAt(r1)
            long r4 = (long) r4
            long r2 = r2 ^ r4
            r4 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            long r2 = r2 * r4
            int r1 = r1 + 1
            goto L42
        L53:
            return r2
    }

    public static long hashCode64LCase(java.lang.String r17) {
            r0 = r17
            int r1 = r0.length()
            r3 = 0
            r4 = 0
        L8:
            r5 = 90
            r6 = 65
            r7 = 95
            r8 = 45
            r9 = 32
            if (r3 >= r1) goto L2c
            char r10 = r0.charAt(r3)
            r11 = 255(0xff, float:3.57E-43)
            if (r10 > r11) goto L64
            if (r3 != 0) goto L21
            if (r10 != 0) goto L21
            goto L64
        L21:
            if (r10 == r8) goto L27
            if (r10 == r7) goto L27
            if (r10 != r9) goto L29
        L27:
            int r4 = r4 + 1
        L29:
            int r3 = r3 + 1
            goto L8
        L2c:
            int r3 = r1 - r4
            r4 = 8
            if (r3 > r4) goto L64
            int r3 = r1 + (-1)
            r10 = 0
            r12 = r10
            r14 = 0
        L38:
            if (r3 < 0) goto L5f
            char r15 = r0.charAt(r3)
            if (r15 == r8) goto L44
            if (r15 == r7) goto L44
            if (r15 != r9) goto L47
        L44:
            r16 = r3
            goto L5c
        L47:
            if (r15 < r6) goto L4e
            if (r15 > r5) goto L4e
            int r15 = r15 + 32
            char r15 = (char) r15
        L4e:
            if (r14 != 0) goto L55
            byte r12 = (byte) r15
            long r12 = (long) r12
            r16 = r3
            goto L5a
        L55:
            long r12 = r12 << r4
            r16 = r3
            long r2 = (long) r15
            long r12 = r12 + r2
        L5a:
            int r14 = r14 + 1
        L5c:
            int r3 = r16 + (-1)
            goto L38
        L5f:
            int r2 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r2 == 0) goto L64
            return r12
        L64:
            r2 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
            r3 = r2
            r2 = 0
        L6b:
            if (r2 >= r1) goto L8a
            char r10 = r0.charAt(r2)
            if (r10 == r8) goto L87
            if (r10 == r7) goto L87
            if (r10 != r9) goto L78
            goto L87
        L78:
            if (r10 < r6) goto L7f
            if (r10 > r5) goto L7f
            int r10 = r10 + 32
            char r10 = (char) r10
        L7f:
            long r10 = (long) r10
            long r3 = r3 ^ r10
            r10 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            long r3 = r3 * r10
        L87:
            int r2 = r2 + 1
            goto L6b
        L8a:
            return r3
    }
}
