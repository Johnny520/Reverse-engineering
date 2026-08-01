package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class r02 extends p000.i81 {
    /* JADX INFO: renamed from: Ε */
    public static java.lang.String m5042(java.lang.String r8) {
            java.util.List r0 = p000.q02.m4675(r8)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        Ld:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L24
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = p000.q02.m4671(r4)
            if (r4 != 0) goto Ld
            r1.add(r3)
            goto Ld
        L24:
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = p000.AbstractC1021yh.m6889(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L33:
            boolean r3 = r1.hasNext()
            r4 = 0
            if (r3 == 0) goto L64
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            int r5 = r3.length()
        L44:
            r6 = -1
            if (r4 >= r5) goto L55
            char r7 = r3.charAt(r4)
            boolean r7 = p000.jx0.m3020(r7)
            if (r7 != 0) goto L52
            goto L56
        L52:
            int r4 = r4 + 1
            goto L44
        L55:
            r4 = r6
        L56:
            if (r4 != r6) goto L5c
            int r4 = r3.length()
        L5c:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r2.add(r3)
            goto L33
        L64:
            java.lang.Comparable r1 = p000.AbstractC0984xh.m6649(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L71
            int r1 = r1.intValue()
            goto L72
        L71:
            r1 = r4
        L72:
            int r8 = r8.length()
            r0.size()
            int r2 = r0.size()
            int r2 = r2 + (-1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L88:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto Lcd
            java.lang.Object r5 = r0.next()
            int r6 = r4 + 1
            r7 = 0
            if (r4 < 0) goto Lc9
            java.lang.String r5 = (java.lang.String) r5
            if (r4 == 0) goto L9d
            if (r4 != r2) goto La4
        L9d:
            boolean r4 = p000.q02.m4671(r5)
            if (r4 == 0) goto La4
            goto Lb5
        La4:
            r5.getClass()
            if (r1 < 0) goto Lbc
            int r4 = r5.length()
            if (r1 <= r4) goto Lb0
            goto Lb1
        Lb0:
            r4 = r1
        Lb1:
            java.lang.String r7 = r5.substring(r4)
        Lb5:
            if (r7 == 0) goto Lba
            r3.add(r7)
        Lba:
            r4 = r6
            goto L88
        Lbc:
            java.lang.String r8 = "Requested character count "
            java.lang.String r0 = " is less than zero."
            java.lang.String r8 = p000.AbstractC0602nx.m4127(r8, r1, r0)
            p000.C1080.m7266(r8)
            r8 = 0
            return r8
        Lc9:
            p000.AbstractC1021yh.m6917()
            throw r7
        Lcd:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r8)
            p000.AbstractC0984xh.m6643(r3, r0)
            java.lang.String r8 = r0.toString()
            return r8
    }

    /* JADX INFO: renamed from: Ζ */
    public static java.lang.String m5043(java.lang.String r12) {
            java.lang.String r0 = "|"
            boolean r1 = p000.q02.m4671(r0)
            if (r1 != 0) goto L85
            java.util.List r1 = p000.q02.m4675(r12)
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
            if (r6 == 0) goto L78
            java.lang.Object r6 = r1.next()
            int r7 = r5 + 1
            r8 = 0
            if (r5 < 0) goto L74
            java.lang.String r6 = (java.lang.String) r6
            if (r5 == 0) goto L39
            if (r5 != r2) goto L40
        L39:
            boolean r5 = p000.q02.m4671(r6)
            if (r5 == 0) goto L40
            goto L6d
        L40:
            int r5 = r6.length()
            r9 = r4
        L45:
            r10 = -1
            if (r9 >= r5) goto L56
            char r11 = r6.charAt(r9)
            boolean r11 = p000.jx0.m3020(r11)
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
            boolean r5 = p000.x02.m6484(r6, r0, r9, r4)
            if (r5 == 0) goto L69
            int r5 = r0.length()
            int r5 = r5 + r9
            java.lang.String r8 = r6.substring(r5)
        L69:
            if (r8 == 0) goto L6c
            goto L6d
        L6c:
            r8 = r6
        L6d:
            if (r8 == 0) goto L72
            r3.add(r8)
        L72:
            r5 = r7
            goto L24
        L74:
            p000.AbstractC1021yh.m6917()
            throw r8
        L78:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r12)
            p000.AbstractC0984xh.m6643(r3, r0)
            java.lang.String r12 = r0.toString()
            return r12
        L85:
            java.lang.String r12 = "marginPrefix must be non-blank string."
            p000.C1080.m7275(r12)
            r12 = 0
            return r12
    }
}
