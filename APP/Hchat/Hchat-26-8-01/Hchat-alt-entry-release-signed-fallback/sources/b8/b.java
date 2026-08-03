package b8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface b {
    int b();

    int e();

    int f();

    java.lang.String getTagName();

    java.lang.String j();

    default b8.f l() {
            r16 = this;
            b8.f r0 = new b8.f
            r0.<init>()
            java.lang.String r1 = r16.getTagName()
            r0.t(r1)
            java.lang.String r1 = r16.j()
            if (r1 == 0) goto L112
            int r2 = r1.length()
            r0.q()
            r3 = 0
            r4 = r3
        L1b:
            int r5 = r2 + (-1)
            r6 = r4
        L1e:
            r8 = 61
            if (r6 >= r5) goto L89
            char r9 = r1.charAt(r6)
            if (r9 != r8) goto L8b
            java.lang.String r9 = r1.substring(r4, r6)
            int r10 = r9.length()
            if (r10 != 0) goto L33
            goto L89
        L33:
            char r11 = r9.charAt(r3)
            r12 = 122(0x7a, float:1.71E-43)
            r13 = 97
            r14 = 90
            r15 = 65
            if (r11 < r15) goto L43
            if (r11 <= r14) goto L47
        L43:
            if (r11 < r13) goto L89
            if (r11 > r12) goto L89
        L47:
            r11 = 1
        L48:
            if (r11 >= r10) goto L67
            char r3 = r9.charAt(r11)
            if (r3 < r15) goto L52
            if (r3 <= r14) goto L63
        L52:
            if (r3 < r13) goto L56
            if (r3 <= r12) goto L63
        L56:
            r7 = 48
            if (r3 < r7) goto L5f
            r7 = 57
            if (r3 > r7) goto L5f
            goto L63
        L5f:
            r7 = 95
            if (r3 != r7) goto L89
        L63:
            int r11 = r11 + 1
            r3 = 0
            goto L48
        L67:
            z7.c r3 = r0.f511k
            int r3 = r3.size()
            if (r3 == 0) goto L7a
            int r3 = r3 + (-1)
            z7.c r7 = r0.f511k
            java.lang.Object[] r7 = r7.f22584g
            r3 = r7[r3]
            b8.d r3 = (b8.d) r3
            goto L7b
        L7a:
            r3 = 0
        L7b:
            if (r3 == 0) goto L86
            java.lang.String r3 = r3.f506h
            int r3 = r9.compareTo(r3)
            if (r3 >= 0) goto L86
            goto L89
        L86:
            int r4 = r6 + 1
            goto L8f
        L89:
            r9 = 0
            goto L8f
        L8b:
            int r6 = r6 + 1
            r3 = 0
            goto L1e
        L8f:
            r3 = r4
        L90:
            r6 = 59
            if (r3 >= r5) goto La4
            char r7 = r1.charAt(r3)
            if (r7 != r6) goto La1
            java.lang.String r4 = r1.substring(r4, r3)
            int r3 = r3 + 1
            goto Lae
        La1:
            int r3 = r3 + 1
            goto L90
        La4:
            if (r4 >= r2) goto Lac
            java.lang.String r4 = r1.substring(r4)
            r3 = r2
            goto Lae
        Lac:
            r3 = r4
            r4 = 0
        Lae:
            if (r9 != 0) goto Lb3
            if (r4 != 0) goto Lb3
            goto L112
        Lb3:
            if (r9 == 0) goto Lc5
            if (r4 != 0) goto Lb8
            goto Lc5
        Lb8:
            b8.d r5 = new b8.d
            r5.<init>()
            r5.f506h = r9
            r5.f507i = r4
            r0.p(r5)
            goto Lfd
        Lc5:
            z7.c r5 = r0.f511k
            int r5 = r5.size()
            if (r5 == 0) goto Ld9
            int r5 = r5 + (-1)
            z7.c r7 = r0.f511k
            java.lang.Object[] r7 = r7.f22584g
            r5 = r7[r5]
            r7 = r5
            b8.d r7 = (b8.d) r7
            goto Lda
        Ld9:
            r7 = 0
        Lda:
            if (r7 == 0) goto L101
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r10 = r7.n()
            r5.append(r10)
            r5.append(r6)
            if (r9 != 0) goto Lf1
            r5.append(r4)
            goto Lf7
        Lf1:
            r5.append(r9)
            r5.append(r8)
        Lf7:
            java.lang.String r4 = r5.toString()
            r7.f507i = r4
        Lfd:
            r4 = r3
            r3 = 0
            goto L1b
        L101:
            r0.q()
            b8.d r2 = new b8.d
            r2.<init>()
            java.lang.String r3 = "raw_style_tag_attribute"
            r2.f506h = r3
            r2.f507i = r1
            r0.p(r2)
        L112:
            return r0
    }
}
