package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class v40 extends defpackage.ct {
    public static java.lang.String z(java.lang.String r13) {
            java.lang.String r0 = "<this>"
            defpackage.ip.o(r0, r13)
            br r1 = new br
            r1.<init>(r13)
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L13
            yi r1 = defpackage.yi.a
            goto L39
        L13:
            java.lang.Object r2 = r1.next()
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto L22
            java.util.List r1 = defpackage.ip.C(r2)
            goto L39
        L22:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r3.add(r2)
        L2a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r1.next()
            r3.add(r2)
            goto L2a
        L38:
            r1 = r3
        L39:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r1.iterator()
        L42:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L59
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = defpackage.b50.H(r5)
            if (r5 != 0) goto L42
            r2.add(r4)
            goto L42
        L59:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = defpackage.cb.h0(r2)
            r3.<init>(r4)
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L68:
            if (r6 >= r4) goto L9c
            java.lang.Object r7 = r2.get(r6)
            int r6 = r6 + 1
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r7.length()
            r9 = r5
        L77:
            r10 = -1
            if (r9 >= r8) goto L8d
            char r11 = r7.charAt(r9)
            boolean r12 = java.lang.Character.isWhitespace(r11)
            if (r12 != 0) goto L8a
            boolean r11 = java.lang.Character.isSpaceChar(r11)
            if (r11 == 0) goto L8e
        L8a:
            int r9 = r9 + 1
            goto L77
        L8d:
            r9 = r10
        L8e:
            if (r9 != r10) goto L94
            int r9 = r7.length()
        L94:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r3.add(r7)
            goto L68
        L9c:
            java.lang.Comparable r2 = defpackage.ab.k0(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto La9
            int r2 = r2.intValue()
            goto Laa
        La9:
            r2 = r5
        Laa:
            int r13 = r13.length()
            r1.size()
            int r3 = r1.size()
            int r3 = r3 + (-1)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r1 = r1.iterator()
        Lc0:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L11a
            java.lang.Object r4 = r1.next()
            int r7 = r5 + 1
            r8 = 0
            if (r5 < 0) goto L116
            java.lang.String r4 = (java.lang.String) r4
            if (r5 == 0) goto Ld5
            if (r5 != r3) goto Ldc
        Ld5:
            boolean r5 = defpackage.b50.H(r4)
            if (r5 == 0) goto Ldc
            goto Lf2
        Ldc:
            defpackage.ip.o(r0, r4)
            if (r2 < 0) goto Lf9
            int r5 = r4.length()
            if (r2 <= r5) goto Le8
            goto Le9
        Le8:
            r5 = r2
        Le9:
            java.lang.String r8 = r4.substring(r5)
            java.lang.String r4 = "substring(...)"
            defpackage.ip.n(r4, r8)
        Lf2:
            if (r8 == 0) goto Lf7
            r6.add(r8)
        Lf7:
            r5 = r7
            goto Lc0
        Lf9:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "Requested character count "
            r13.<init>(r0)
            r13.append(r2)
            java.lang.String r0 = " is less than zero."
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r13.toString()
            r0.<init>(r13)
            throw r0
        L116:
            defpackage.bb.g0()
            throw r8
        L11a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r13)
            java.lang.String r9 = ""
            java.lang.String r11 = "..."
            java.lang.String r8 = "\n"
            r12 = 0
            r10 = r9
            defpackage.ab.i0(r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r13 = r7.toString()
            return r13
    }
}
