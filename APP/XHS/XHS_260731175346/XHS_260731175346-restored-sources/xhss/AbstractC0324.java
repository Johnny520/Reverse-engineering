package xhss;

/* JADX INFO: renamed from: xhss.ᛳᲈᛲᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0324 extends xhss.AbstractC0384 {
    /* JADX INFO: renamed from: ᛵᛷᛲᛸ, reason: contains not printable characters */
    public static final boolean m664(java.lang.String r19) {
            r0 = r19
            int r1 = r0.length()
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
            r4 = r3
        La:
            r5 = 32
            if (r4 > r1) goto L17
            char r6 = r0.charAt(r4)
            if (r6 > r5) goto L17
            int r4 = r4 + 1
            goto La
        L17:
            if (r4 <= r1) goto L1b
            goto L17c
        L1b:
            if (r1 <= r4) goto L26
            char r6 = r0.charAt(r1)
            if (r6 > r5) goto L26
            int r1 = r1 + (-1)
            goto L1b
        L26:
            char r6 = r0.charAt(r4)
            r7 = 45
            r8 = 43
            if (r6 == r8) goto L36
            char r6 = r0.charAt(r4)
            if (r6 != r7) goto L38
        L36:
            int r4 = r4 + 1
        L38:
            if (r4 <= r1) goto L3c
            goto L17c
        L3c:
            char r6 = r0.charAt(r4)
            r9 = 46
            r10 = 10
            r11 = 48
            r12 = 65535(0xffff, float:9.1834E-41)
            r13 = -1
            if (r6 != r11) goto Lca
            int r6 = r4 + 1
            if (r6 <= r1) goto L54
            r17 = r2
            goto L17b
        L54:
            char r6 = r0.charAt(r6)
            r6 = r6 | r5
            r14 = 120(0x78, float:1.68E-43)
            if (r6 != r14) goto Lca
            int r4 = r4 + 2
            r6 = r4
        L60:
            r14 = 6
            if (r6 > r1) goto L7c
            char r15 = r0.charAt(r6)
            int r16 = r15 + (-48)
            r17 = r2
            r2 = r16 & r12
            if (r2 >= r10) goto L70
            goto L77
        L70:
            r2 = r15 | 32
            int r2 = r2 + (-97)
            r2 = r2 & r12
            if (r2 >= r14) goto L7e
        L77:
            int r6 = r6 + 1
            r2 = r17
            goto L60
        L7c:
            r17 = r2
        L7e:
            if (r4 == r6) goto L83
            r2 = r17
            goto L84
        L83:
            r2 = r3
        L84:
            if (r6 <= r1) goto L8a
            r18 = r5
        L88:
            r4 = r13
            goto Lc1
        L8a:
            char r4 = r0.charAt(r6)
            if (r4 != r9) goto Lb8
            int r6 = r6 + 1
            r4 = r6
        L93:
            if (r4 > r1) goto Lae
            char r15 = r0.charAt(r4)
            int r16 = r15 + (-48)
            r18 = r5
            r5 = r16 & r12
            if (r5 >= r10) goto La2
            goto La9
        La2:
            r5 = r15 | 32
            int r5 = r5 + (-97)
            r5 = r5 & r12
            if (r5 >= r14) goto Lb0
        La9:
            int r4 = r4 + 1
            r5 = r18
            goto L93
        Lae:
            r18 = r5
        Lb0:
            if (r6 == r4) goto Lb5
            r5 = r17
            goto Lb6
        Lb5:
            r5 = r3
        Lb6:
            r6 = r4
            goto Lbb
        Lb8:
            r18 = r5
            r5 = r3
        Lbb:
            if (r2 != 0) goto Lc0
            if (r5 != 0) goto Lc0
            goto L88
        Lc0:
            r4 = r6
        Lc1:
            if (r4 == r13) goto L17c
            if (r4 <= r1) goto Lc7
            goto L17c
        Lc7:
            r2 = r17
            goto Lcf
        Lca:
            r17 = r2
            r18 = r5
            r2 = r3
        Lcf:
            if (r2 != 0) goto L12d
            r5 = r4
        Ld2:
            if (r5 > r1) goto Ldf
            char r6 = r0.charAt(r5)
            int r6 = r6 - r11
            r6 = r6 & r12
            if (r6 >= r10) goto Ldf
            int r5 = r5 + 1
            goto Ld2
        Ldf:
            if (r4 == r5) goto Le4
            r4 = r17
            goto Le5
        Le4:
            r4 = r3
        Le5:
            if (r5 <= r1) goto Le9
            r4 = r5
            goto L127
        Le9:
            char r6 = r0.charAt(r5)
            if (r6 != r9) goto L104
            int r5 = r5 + 1
            r6 = r5
        Lf2:
            if (r6 > r1) goto Lff
            char r9 = r0.charAt(r6)
            int r9 = r9 - r11
            r9 = r9 & r12
            if (r9 >= r10) goto Lff
            int r6 = r6 + 1
            goto Lf2
        Lff:
            if (r5 == r6) goto L105
            r5 = r17
            goto L106
        L104:
            r6 = r5
        L105:
            r5 = r3
        L106:
            if (r4 != 0) goto L126
            if (r5 != 0) goto L126
            int r4 = r6 + 2
            if (r1 != r4) goto L111
            java.lang.String r4 = "NaN"
            goto L119
        L111:
            int r4 = r6 + 7
            if (r1 != r4) goto L118
            java.lang.String r4 = "Infinity"
            goto L119
        L118:
            r4 = 0
        L119:
            if (r4 != 0) goto L11d
        L11b:
            r4 = r13
            goto L127
        L11d:
            int r4 = xhss.AbstractC0120.m343(r0, r4, r6, r3)
            if (r4 != r6) goto L11b
            int r4 = r1 + 1
            goto L127
        L126:
            r4 = r6
        L127:
            if (r4 != r13) goto L12a
            goto L17c
        L12a:
            if (r4 <= r1) goto L12d
            goto L17b
        L12d:
            int r5 = r4 + 1
            char r6 = r0.charAt(r4)
            r6 = r6 | 32
            if (r2 == 0) goto L13a
            r9 = 112(0x70, float:1.57E-43)
            goto L13c
        L13a:
            r9 = 101(0x65, float:1.42E-43)
        L13c:
            r13 = 100
            r14 = 102(0x66, float:1.43E-43)
            if (r6 == r9) goto L14b
            if (r2 != 0) goto L17c
            if (r6 == r14) goto L148
            if (r6 != r13) goto L17c
        L148:
            if (r5 <= r1) goto L17c
            goto L17b
        L14b:
            if (r5 <= r1) goto L14e
            goto L17c
        L14e:
            char r2 = r0.charAt(r5)
            if (r2 == r8) goto L15a
            char r2 = r0.charAt(r5)
            if (r2 != r7) goto L15f
        L15a:
            int r5 = r4 + 2
            if (r5 <= r1) goto L15f
            goto L17c
        L15f:
            if (r5 > r1) goto L16c
            char r2 = r0.charAt(r5)
            int r2 = r2 - r11
            r2 = r2 & r12
            if (r2 >= r10) goto L16c
            int r5 = r5 + 1
            goto L15f
        L16c:
            if (r5 <= r1) goto L16f
            goto L17b
        L16f:
            if (r5 != r1) goto L17c
            char r0 = r0.charAt(r5)
            r0 = r0 | 32
            if (r0 == r14) goto L17b
            if (r0 != r13) goto L17c
        L17b:
            return r17
        L17c:
            return r3
    }
}
