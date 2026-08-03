package og;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends ac.p {
    public static java.lang.String R(java.lang.String r8) {
            java.util.List r0 = og.m.x0(r8)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        Ld:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L24
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = og.m.t0(r4)
            if (r4 != 0) goto Ld
            r1.add(r3)
            goto Ld
        L24:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = tf.n.e1(r1)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L31:
            boolean r3 = r1.hasNext()
            r4 = 0
            if (r3 == 0) goto L62
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            int r5 = r3.length()
        L42:
            r6 = -1
            if (r4 >= r5) goto L53
            char r7 = r3.charAt(r4)
            boolean r7 = a.a.v0(r7)
            if (r7 != 0) goto L50
            goto L54
        L50:
            int r4 = r4 + 1
            goto L42
        L53:
            r4 = r6
        L54:
            if (r4 != r6) goto L5a
            int r4 = r3.length()
        L5a:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r2.add(r3)
            goto L31
        L62:
            java.lang.Comparable r1 = tf.m.D1(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L6f
            int r1 = r1.intValue()
            goto L70
        L6f:
            r1 = r4
        L70:
            int r8 = r8.length()
            r0.size()
            int r2 = r0.size()
            int r2 = r2 + (-1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L86:
            boolean r5 = r0.hasNext()
            r6 = 0
            if (r5 == 0) goto Lb1
            java.lang.Object r5 = r0.next()
            int r7 = r4 + 1
            if (r4 < 0) goto Lad
            java.lang.String r5 = (java.lang.String) r5
            if (r4 == 0) goto L9b
            if (r4 != r2) goto La2
        L9b:
            boolean r4 = og.m.t0(r5)
            if (r4 == 0) goto La2
            goto La6
        La2:
            java.lang.String r6 = og.m.j0(r1, r5)
        La6:
            if (r6 == 0) goto Lab
            r3.add(r6)
        Lab:
            r4 = r7
            goto L86
        Lad:
            a.a.Q0()
            throw r6
        Lb1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r8)
            java.lang.String r8 = "\n"
            r1 = 124(0x7c, float:1.74E-43)
            tf.m.z1(r3, r0, r8, r6, r1)
            java.lang.String r8 = r0.toString()
            return r8
    }

    public static java.lang.String S(java.lang.String r12) {
            java.lang.String r0 = "|"
            boolean r1 = og.m.t0(r0)
            if (r1 != 0) goto L89
            java.util.List r1 = og.m.x0(r12)
            int r12 = r12.length()
            r1.size()
            int r2 = r1.size()
            int r2 = r2 + (-1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
            r4 = 0
            r5 = r4
        L24:
            boolean r6 = r1.hasNext()
            r7 = 0
            if (r6 == 0) goto L78
            java.lang.Object r6 = r1.next()
            int r8 = r5 + 1
            if (r5 < 0) goto L74
            java.lang.String r6 = (java.lang.String) r6
            if (r5 == 0) goto L39
            if (r5 != r2) goto L40
        L39:
            boolean r5 = og.m.t0(r6)
            if (r5 == 0) goto L40
            goto L6d
        L40:
            int r5 = r6.length()
            r9 = r4
        L45:
            r10 = -1
            if (r9 >= r5) goto L56
            char r11 = r6.charAt(r9)
            boolean r11 = a.a.v0(r11)
            if (r11 != 0) goto L53
            goto L57
        L53:
            int r9 = r9 + 1
            goto L45
        L56:
            r9 = r10
        L57:
            if (r9 != r10) goto L5a
            goto L69
        L5a:
            boolean r5 = og.t.c0(r6, r0, r9, r4)
            if (r5 == 0) goto L69
            int r5 = r0.length()
            int r5 = r5 + r9
            java.lang.String r7 = r6.substring(r5)
        L69:
            if (r7 == 0) goto L6c
            goto L6d
        L6c:
            r7 = r6
        L6d:
            if (r7 == 0) goto L72
            r3.add(r7)
        L72:
            r5 = r8
            goto L24
        L74:
            a.a.Q0()
            throw r7
        L78:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r12)
            java.lang.String r12 = "\n"
            r1 = 124(0x7c, float:1.74E-43)
            tf.m.z1(r3, r0, r12, r7, r1)
            java.lang.String r12 = r0.toString()
            return r12
        L89:
            java.lang.String r12 = "marginPrefix must be non-blank string."
            j8.o.t(r12)
            r12 = 0
            return r12
    }
}
