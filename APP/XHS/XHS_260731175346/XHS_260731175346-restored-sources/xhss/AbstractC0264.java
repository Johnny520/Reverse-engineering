package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛴᲈᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0264 extends xhss.AbstractC0324 {
    /* JADX INFO: renamed from: ᛱᲈᛳᛴ, reason: contains not printable characters */
    public static java.lang.Integer m585(java.lang.String r10) {
            r0 = 10
            xhss.AbstractC0955.m1551(r0)
            int r1 = r10.length()
            if (r1 != 0) goto Lc
            goto L51
        Lc:
            r2 = 0
            char r3 = r10.charAt(r2)
            r4 = 48
            int r4 = xhss.AbstractC0007.m102(r3, r4)
            r5 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r4 >= 0) goto L2f
            r4 = 1
            if (r1 != r4) goto L20
            goto L51
        L20:
            r6 = 43
            if (r3 == r6) goto L2d
            r5 = 45
            if (r3 == r5) goto L29
            goto L51
        L29:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r4
            goto L31
        L2d:
            r3 = r2
            goto L31
        L2f:
            r3 = r2
            r4 = r3
        L31:
            r6 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
            r7 = r6
        L35:
            if (r4 >= r1) goto L57
            char r8 = r10.charAt(r4)
            int r8 = java.lang.Character.digit(r8, r0)
            if (r8 >= 0) goto L42
            goto L51
        L42:
            if (r2 >= r7) goto L4b
            if (r7 != r6) goto L51
            int r7 = r5 / 10
            if (r2 >= r7) goto L4b
            goto L51
        L4b:
            int r2 = r2 * 10
            int r9 = r5 + r8
            if (r2 >= r9) goto L53
        L51:
            r10 = 0
            return r10
        L53:
            int r2 = r2 - r8
            int r4 = r4 + 1
            goto L35
        L57:
            if (r3 == 0) goto L5e
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            return r10
        L5e:
            int r10 = -r2
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            return r10
    }

    /* JADX INFO: renamed from: ᛸᛴᛸᛲ, reason: contains not printable characters */
    public static java.lang.Long m586(java.lang.String r19) {
            r0 = r19
            r1 = 10
            xhss.AbstractC0955.m1551(r1)
            int r2 = r0.length()
            if (r2 != 0) goto Le
            goto L66
        Le:
            r3 = 0
            char r4 = r0.charAt(r3)
            r5 = 48
            int r5 = xhss.AbstractC0007.m102(r4, r5)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 >= 0) goto L37
            r5 = 1
            if (r2 != r5) goto L24
            goto L66
        L24:
            r8 = 43
            if (r4 == r8) goto L31
            r3 = 45
            if (r4 == r3) goto L2d
            goto L66
        L2d:
            r6 = -9223372036854775808
            r3 = r5
            goto L38
        L31:
            r18 = r5
            r5 = r3
            r3 = r18
            goto L38
        L37:
            r5 = r3
        L38:
            r8 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r10 = 0
            r12 = r8
        L40:
            if (r3 >= r2) goto L6c
            char r4 = r0.charAt(r3)
            int r4 = java.lang.Character.digit(r4, r1)
            if (r4 >= 0) goto L4d
            goto L66
        L4d:
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            r15 = 10
            if (r14 >= 0) goto L5e
            int r12 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r12 != 0) goto L66
            long r12 = r6 / r15
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 >= 0) goto L5e
            goto L66
        L5e:
            long r10 = r10 * r15
            long r14 = (long) r4
            long r16 = r6 + r14
            int r4 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r4 >= 0) goto L68
        L66:
            r0 = 0
            return r0
        L68:
            long r10 = r10 - r14
            int r3 = r3 + 1
            goto L40
        L6c:
            if (r5 == 0) goto L73
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            return r0
        L73:
            long r0 = -r10
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }
}
