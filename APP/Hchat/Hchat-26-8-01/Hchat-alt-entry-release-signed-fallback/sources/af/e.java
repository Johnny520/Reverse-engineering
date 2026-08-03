package af;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class e extends java.lang.Exception {
    public e(java.lang.String r14, qh.a r15) {
            r13 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " "
            java.lang.String r14 = r14.concat(r1)
            r0.append(r14)
            r14 = 0
            java.lang.String r1 = ""
            if (r15 != 0) goto L16
            r2 = r1
            goto L13e
        L16:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "(position:"
            r2.<init>(r3)
            r3 = r15
            c8.b r3 = (c8.b) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "["
            r4.<init>(r5)
            int r5 = r3.e()
            r4.append(r5)
            java.lang.String r5 = ":"
            r4.append(r5)
            int r6 = r3.f1074t
            r7 = r14
        L36:
            int r8 = r3.f1071q
            if (r7 >= r8) goto L49
            char[] r8 = r3.f1070p
            char r8 = r8[r7]
            r9 = 10
            if (r8 != r9) goto L44
            r6 = r14
            goto L46
        L44:
            int r6 = r6 + 1
        L46:
            int r7 = r7 + 1
            goto L36
        L49:
            int r6 = r6 + 1
            r4.append(r6)
            java.lang.String r6 = "]\n"
            r4.append(r6)
            int r6 = r3.f1075u
            r7 = 11
            if (r6 >= r7) goto L5e
            java.lang.String[] r7 = qh.a.f11129d
            r6 = r7[r6]
            goto L60
        L5e:
            java.lang.String r6 = "unknown"
        L60:
            r4.append(r6)
            r6 = 32
            r4.append(r6)
            int r7 = r3.f1075u
            r8 = 2
            r9 = 4
            r10 = 3
            if (r7 == r8) goto Lab
            if (r7 != r10) goto L72
            goto Lab
        L72:
            r5 = 7
            java.lang.String r6 = "(whitespace)"
            if (r7 != r5) goto L7c
            r4.append(r6)
            goto L12e
        L7c:
            if (r7 == r9) goto L87
            java.lang.String r3 = r3.h()
            r4.append(r3)
            goto L12e
        L87:
            boolean r5 = r3.f1076v
            if (r5 == 0) goto L90
            r4.append(r6)
            goto L12e
        L90:
            java.lang.String r3 = r3.h()
            int r5 = r3.length()
            r6 = 16
            if (r5 <= r6) goto La6
            java.lang.String r3 = r3.substring(r14, r6)
            java.lang.String r5 = "..."
            java.lang.String r3 = r3.concat(r5)
        La6:
            r4.append(r3)
            goto L12e
        Lab:
            boolean r7 = r3.A
            if (r7 == 0) goto Lb4
            java.lang.String r7 = "(empty) "
            r4.append(r7)
        Lb4:
            r7 = 60
            r4.append(r7)
            int r7 = r3.f1075u
            if (r7 != r10) goto Lc2
            r7 = 47
            r4.append(r7)
        Lc2:
            java.lang.String r7 = r3.f1078x
            java.lang.String r8 = "}"
            java.lang.String r10 = "{"
            if (r7 == 0) goto Ldd
            r4.append(r10)
            java.lang.String r7 = r3.f1077w
            r4.append(r7)
            r4.append(r8)
            java.lang.String r7 = r3.f1078x
            r4.append(r7)
            r4.append(r5)
        Ldd:
            java.lang.String r7 = r3.f1079y
            r4.append(r7)
            int r7 = r3.B
            int r7 = r7 * r9
            r9 = r14
        Le6:
            if (r9 >= r7) goto L129
            r4.append(r6)
            java.lang.String[] r11 = r3.D
            int r12 = r9 + 1
            r11 = r11[r12]
            if (r11 == 0) goto L10a
            r4.append(r10)
            java.lang.String[] r11 = r3.D
            r11 = r11[r9]
            r4.append(r11)
            r4.append(r8)
            java.lang.String[] r11 = r3.D
            r11 = r11[r12]
            r4.append(r11)
            r4.append(r5)
        L10a:
            java.lang.String[] r11 = r3.D
            int r12 = r9 + 2
            r11 = r11[r12]
            r4.append(r11)
            java.lang.String r11 = "='"
            r4.append(r11)
            java.lang.String[] r11 = r3.D
            int r12 = r9 + 3
            r11 = r11[r12]
            r4.append(r11)
            java.lang.String r11 = "'"
            r4.append(r11)
            int r9 = r9 + 4
            goto Le6
        L129:
            r3 = 62
            r4.append(r3)
        L12e:
            java.lang.String r3 = r4.toString()
            r2.append(r3)
            java.lang.String r3 = ") "
            r2.append(r3)
            java.lang.String r2 = r2.toString()
        L13e:
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            r13.<init>(r0)
            if (r15 == 0) goto L157
            c8.b r15 = (c8.b) r15
            r15.e()
        L14c:
            int r0 = r15.f1071q
            if (r14 >= r0) goto L157
            char[] r0 = r15.f1070p
            char r0 = r0[r14]
            int r14 = r14 + 1
            goto L14c
        L157:
            return
    }

    public e(ud.r r1, java.lang.String r2, java.lang.Exception r3) {
            r0 = this;
            java.lang.String r1 = xe.h.b(r1, r2)
            r0.<init>(r1, r3)
            return
    }
}
