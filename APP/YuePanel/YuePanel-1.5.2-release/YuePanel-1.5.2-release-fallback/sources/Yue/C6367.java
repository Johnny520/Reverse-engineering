package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6367 {
    public C6367() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m23525(Yue.C1699 r7) {
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = r7.f5335
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.print(r1)
            java.lang.Object r1 = r7.f5336
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L22
            r0.print(r1)
            goto L7c
        L22:
            boolean r3 = r1 instanceof Yue.C1708
            java.lang.String r4 = ")"
            java.lang.String r5 = ","
            r6 = 0
            if (r3 == 0) goto L52
            java.lang.String r1 = "("
            r0.print(r1)
            java.lang.Object r0 = r7.f5336
            Yue.ۥ۟ۨۡ۟ r0 = (Yue.C1708) r0
            java.lang.String[] r0 = r0.m8168()
        L38:
            int r1 = r0.length
            if (r6 >= r1) goto L4c
            if (r6 <= 0) goto L42
            java.io.PrintStream r1 = java.lang.System.out
            r1.print(r5)
        L42:
            java.io.PrintStream r1 = java.lang.System.out
            r3 = r0[r6]
            r1.print(r3)
            int r6 = r6 + 1
            goto L38
        L4c:
            java.io.PrintStream r0 = java.lang.System.out
            r0.print(r4)
            goto L7c
        L52:
            boolean r1 = r1 instanceof Yue.C1715
            if (r1 == 0) goto L7c
            java.lang.String r1 = "Notation ("
            r0.print(r1)
            java.lang.Object r0 = r7.f5336
            Yue.ۥ۟ۨۡۦ r0 = (Yue.C1715) r0
            java.lang.String[] r0 = r0.m8192()
        L63:
            int r1 = r0.length
            if (r6 >= r1) goto L77
            if (r6 <= 0) goto L6d
            java.io.PrintStream r1 = java.lang.System.out
            r1.print(r5)
        L6d:
            java.io.PrintStream r1 = java.lang.System.out
            r3 = r0[r6]
            r1.print(r3)
            int r6 = r6 + 1
            goto L63
        L77:
            java.io.PrintStream r0 = java.lang.System.out
            r0.print(r4)
        L7c:
            Yue.ۥ۟ۨ۠ۦ r0 = r7.f5337
            if (r0 == 0) goto L98
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            r1.append(r2)
            Yue.ۥ۟ۨ۠ۦ r3 = r7.f5337
            java.lang.String r3 = r3.f5352
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.print(r1)
        L98:
            java.lang.String r0 = r7.f5338
            if (r0 == 0) goto Lb2
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            r1.append(r2)
            java.lang.String r7 = r7.f5338
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.print(r7)
        Lb2:
            java.io.PrintStream r7 = java.lang.System.out
            r7.println()
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m23526(Yue.AbstractC1711 r5) {
            if (r5 != 0) goto L3
            return
        L3:
            boolean r0 = r5 instanceof Yue.C1697
            if (r0 == 0) goto L10
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Any"
            r0.print(r1)
            goto Lb9
        L10:
            boolean r0 = r5 instanceof Yue.C1706
            if (r0 == 0) goto L1d
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Empty"
            r0.print(r1)
            goto Lb9
        L1d:
            boolean r0 = r5 instanceof Yue.C1713
            if (r0 == 0) goto L2d
            java.io.PrintStream r0 = java.lang.System.out
            r1 = r5
            Yue.ۥ۟ۨۡۤ r1 = (Yue.C1713) r1
            java.lang.String r1 = r1.f5368
            r0.print(r1)
            goto Lb9
        L2d:
            boolean r0 = r5 instanceof Yue.C1701
            java.lang.String r1 = ")"
            r2 = 0
            java.lang.String r3 = "("
            if (r0 == 0) goto L5c
            java.io.PrintStream r0 = java.lang.System.out
            r0.print(r3)
            r0 = r5
            Yue.ۥۣ۟ۨ۠ r0 = (Yue.C1701) r0
            Yue.ۥ۟ۨۡۢ[] r0 = r0.m8141()
        L42:
            int r3 = r0.length
            if (r2 >= r3) goto L56
            if (r2 <= 0) goto L4e
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.String r4 = "|"
            r3.print(r4)
        L4e:
            r3 = r0[r2]
            m23526(r3)
            int r2 = r2 + 1
            goto L42
        L56:
            java.io.PrintStream r0 = java.lang.System.out
            r0.print(r1)
            goto Lb9
        L5c:
            boolean r0 = r5 instanceof Yue.C1722
            java.lang.String r4 = ","
            if (r0 == 0) goto L86
            java.io.PrintStream r0 = java.lang.System.out
            r0.print(r3)
            r0 = r5
            Yue.ۥ۟ۨۢۢ r0 = (Yue.C1722) r0
            Yue.ۥ۟ۨۡۢ[] r0 = r0.m8141()
        L6e:
            int r3 = r0.length
            if (r2 >= r3) goto L80
            if (r2 <= 0) goto L78
            java.io.PrintStream r3 = java.lang.System.out
            r3.print(r4)
        L78:
            r3 = r0[r2]
            m23526(r3)
            int r2 = r2 + 1
            goto L6e
        L80:
            java.io.PrintStream r0 = java.lang.System.out
            r0.print(r1)
            goto Lb9
        L86:
            boolean r0 = r5 instanceof Yue.C1712
            if (r0 == 0) goto Lae
            java.io.PrintStream r0 = java.lang.System.out
            r0.print(r3)
            r0 = r5
            Yue.ۥۣ۟ۨۡ r0 = (Yue.C1712) r0
            Yue.ۥ۟ۨۡۢ[] r0 = r0.m8141()
        L96:
            int r3 = r0.length
            if (r2 >= r3) goto La8
            if (r2 <= 0) goto La0
            java.io.PrintStream r3 = java.lang.System.out
            r3.print(r4)
        La0:
            r3 = r0[r2]
            m23526(r3)
            int r2 = r2 + 1
            goto L96
        La8:
            java.io.PrintStream r0 = java.lang.System.out
            r0.print(r1)
            goto Lb9
        Lae:
            boolean r0 = r5 instanceof Yue.C1717
            if (r0 == 0) goto Lb9
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "#PCDATA"
            r0.print(r1)
        Lb9:
            Yue.ۥ۟ۨ۠ۢ r5 = r5.f5367
            Yue.ۥ۟ۨ۠ۢ r0 = Yue.C1700.f5340
            if (r5 != r0) goto Lc7
            java.io.PrintStream r5 = java.lang.System.out
            java.lang.String r0 = "?"
            r5.print(r0)
            goto Lde
        Lc7:
            Yue.ۥ۟ۨ۠ۢ r0 = Yue.C1700.f5341
            if (r5 != r0) goto Ld3
            java.io.PrintStream r5 = java.lang.System.out
            java.lang.String r0 = "*"
            r5.print(r0)
            goto Lde
        Ld3:
            Yue.ۥ۟ۨ۠ۢ r0 = Yue.C1700.f5342
            if (r5 != r0) goto Lde
            java.io.PrintStream r5 = java.lang.System.out
            java.lang.String r0 = "+"
            r5.print(r0)
        Lde:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m23527(java.lang.String[] r8) {
            r0 = 0
            r1 = r8[r0]     // Catch: java.lang.Exception -> L19
            java.lang.String r2 = "://"
            int r1 = r1.indexOf(r2)     // Catch: java.lang.Exception -> L19
            r2 = 1
            if (r1 <= 0) goto L1c
            Yue.ۥ۟ۨۢ۟ r1 = new Yue.ۥ۟ۨۢ۟     // Catch: java.lang.Exception -> L19
            java.net.URL r3 = new java.net.URL     // Catch: java.lang.Exception -> L19
            r8 = r8[r0]     // Catch: java.lang.Exception -> L19
            r3.<init>(r8)     // Catch: java.lang.Exception -> L19
            r1.<init>(r3, r2)     // Catch: java.lang.Exception -> L19
            goto L28
        L19:
            r8 = move-exception
            goto L1cd
        L1c:
            Yue.ۥ۟ۨۢ۟ r1 = new Yue.ۥ۟ۨۢ۟     // Catch: java.lang.Exception -> L19
            java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> L19
            r8 = r8[r0]     // Catch: java.lang.Exception -> L19
            r3.<init>(r8)     // Catch: java.lang.Exception -> L19
            r1.<init>(r3, r2)     // Catch: java.lang.Exception -> L19
        L28:
            Yue.ۥ۟ۨ۠ r8 = r1.m8203(r2)     // Catch: java.lang.Exception -> L19
            Yue.ۥ۟ۨ۠ۧ r0 = r8.f5332     // Catch: java.lang.Exception -> L19
            if (r0 == 0) goto L4a
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Exception -> L19
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> L19
            r1.<init>()     // Catch: java.lang.Exception -> L19
            java.lang.String r2 = "Root element is probably: "
            r1.append(r2)     // Catch: java.lang.Exception -> L19
            Yue.ۥ۟ۨ۠ۧ r2 = r8.f5332     // Catch: java.lang.Exception -> L19
            java.lang.String r2 = r2.f5353     // Catch: java.lang.Exception -> L19
            r1.append(r2)     // Catch: java.lang.Exception -> L19
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L19
            r0.println(r1)     // Catch: java.lang.Exception -> L19
        L4a:
            java.util.Hashtable r0 = r8.f5327     // Catch: java.lang.Exception -> L19
            java.util.Enumeration r0 = r0.elements()     // Catch: java.lang.Exception -> L19
        L50:
            boolean r1 = r0.hasMoreElements()     // Catch: java.lang.Exception -> L19
            if (r1 == 0) goto Lb1
            java.lang.Object r1 = r0.nextElement()     // Catch: java.lang.Exception -> L19
            Yue.ۥ۟ۨ۠ۧ r1 = (Yue.C1705) r1     // Catch: java.lang.Exception -> L19
            java.io.PrintStream r2 = java.lang.System.out     // Catch: java.lang.Exception -> L19
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> L19
            r3.<init>()     // Catch: java.lang.Exception -> L19
            java.lang.String r4 = "Element: "
            r3.append(r4)     // Catch: java.lang.Exception -> L19
            java.lang.String r4 = r1.f5353     // Catch: java.lang.Exception -> L19
            r3.append(r4)     // Catch: java.lang.Exception -> L19
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L19
            r2.println(r3)     // Catch: java.lang.Exception -> L19
            java.lang.String r3 = "   Content: "
            r2.print(r3)     // Catch: java.lang.Exception -> L19
            Yue.ۥ۟ۨۡۢ r3 = r1.f5355     // Catch: java.lang.Exception -> L19
            m23526(r3)     // Catch: java.lang.Exception -> L19
            r2.println()     // Catch: java.lang.Exception -> L19
            java.util.Hashtable r3 = r1.f5354     // Catch: java.lang.Exception -> L19
            int r3 = r3.size()     // Catch: java.lang.Exception -> L19
            if (r3 <= 0) goto L50
            java.lang.String r3 = "   Attributes: "
            r2.println(r3)     // Catch: java.lang.Exception -> L19
            java.util.Hashtable r1 = r1.f5354     // Catch: java.lang.Exception -> L19
            java.util.Enumeration r1 = r1.elements()     // Catch: java.lang.Exception -> L19
        L94:
            boolean r2 = r1.hasMoreElements()     // Catch: java.lang.Exception -> L19
            if (r2 == 0) goto Lab
            java.io.PrintStream r2 = java.lang.System.out     // Catch: java.lang.Exception -> L19
            java.lang.String r3 = "        "
            r2.print(r3)     // Catch: java.lang.Exception -> L19
            java.lang.Object r2 = r1.nextElement()     // Catch: java.lang.Exception -> L19
            Yue.ۥ۟ۨ۠ۡ r2 = (Yue.C1699) r2     // Catch: java.lang.Exception -> L19
            m23525(r2)     // Catch: java.lang.Exception -> L19
            goto L94
        Lab:
            java.io.PrintStream r1 = java.lang.System.out     // Catch: java.lang.Exception -> L19
            r1.println()     // Catch: java.lang.Exception -> L19
            goto L50
        Lb1:
            java.util.Hashtable r0 = r8.f5328     // Catch: java.lang.Exception -> L19
            java.util.Enumeration r0 = r0.elements()     // Catch: java.lang.Exception -> L19
        Lb7:
            boolean r1 = r0.hasMoreElements()     // Catch: java.lang.Exception -> L19
            java.lang.String r2 = " "
            java.lang.String r3 = "    Public: "
            java.lang.String r4 = "    System: "
            if (r1 == 0) goto L15f
            java.lang.Object r1 = r0.nextElement()     // Catch: java.lang.Exception -> L19
            Yue.ۥ۟ۨۡ r1 = (Yue.C1707) r1     // Catch: java.lang.Exception -> L19
            boolean r5 = r1.f5357     // Catch: java.lang.Exception -> L19
            if (r5 == 0) goto Ld4
            java.io.PrintStream r5 = java.lang.System.out     // Catch: java.lang.Exception -> L19
            java.lang.String r6 = "Parsed "
            r5.print(r6)     // Catch: java.lang.Exception -> L19
        Ld4:
            java.io.PrintStream r5 = java.lang.System.out     // Catch: java.lang.Exception -> L19
            java.lang.StringBuffer r6 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> L19
            r6.<init>()     // Catch: java.lang.Exception -> L19
            java.lang.String r7 = "Entity: "
            r6.append(r7)     // Catch: java.lang.Exception -> L19
            java.lang.String r7 = r1.f5356     // Catch: java.lang.Exception -> L19
            r6.append(r7)     // Catch: java.lang.Exception -> L19
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L19
            r5.println(r6)     // Catch: java.lang.Exception -> L19
            java.lang.String r6 = r1.f5358     // Catch: java.lang.Exception -> L19
            if (r6 == 0) goto L106
            java.lang.StringBuffer r6 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> L19
            r6.<init>()     // Catch: java.lang.Exception -> L19
            java.lang.String r7 = "    Value: "
            r6.append(r7)     // Catch: java.lang.Exception -> L19
            java.lang.String r7 = r1.f5358     // Catch: java.lang.Exception -> L19
            r6.append(r7)     // Catch: java.lang.Exception -> L19
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L19
            r5.println(r6)     // Catch: java.lang.Exception -> L19
        L106:
            Yue.ۥ۟ۨۡۡ r6 = r1.f5359     // Catch: java.lang.Exception -> L19
            if (r6 == 0) goto L143
            boolean r7 = r6 instanceof Yue.C1723     // Catch: java.lang.Exception -> L19
            if (r7 == 0) goto L125
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> L19
            r2.<init>()     // Catch: java.lang.Exception -> L19
            r2.append(r4)     // Catch: java.lang.Exception -> L19
            Yue.ۥ۟ۨۡۡ r3 = r1.f5359     // Catch: java.lang.Exception -> L19
            java.lang.String r3 = r3.f5366     // Catch: java.lang.Exception -> L19
            r2.append(r3)     // Catch: java.lang.Exception -> L19
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L19
            r5.println(r2)     // Catch: java.lang.Exception -> L19
            goto L143
        L125:
            Yue.ۥ۟ۨۢۡ r6 = (Yue.C1721) r6     // Catch: java.lang.Exception -> L19
            java.lang.StringBuffer r4 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> L19
            r4.<init>()     // Catch: java.lang.Exception -> L19
            r4.append(r3)     // Catch: java.lang.Exception -> L19
            java.lang.String r3 = r6.f5379     // Catch: java.lang.Exception -> L19
            r4.append(r3)     // Catch: java.lang.Exception -> L19
            r4.append(r2)     // Catch: java.lang.Exception -> L19
            java.lang.String r2 = r6.f5366     // Catch: java.lang.Exception -> L19
            r4.append(r2)     // Catch: java.lang.Exception -> L19
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> L19
            r5.println(r2)     // Catch: java.lang.Exception -> L19
        L143:
            java.lang.String r2 = r1.f5360     // Catch: java.lang.Exception -> L19
            if (r2 == 0) goto Lb7
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> L19
            r2.<init>()     // Catch: java.lang.Exception -> L19
            java.lang.String r3 = "    NDATA "
            r2.append(r3)     // Catch: java.lang.Exception -> L19
            java.lang.String r1 = r1.f5360     // Catch: java.lang.Exception -> L19
            r2.append(r1)     // Catch: java.lang.Exception -> L19
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L19
            r5.println(r1)     // Catch: java.lang.Exception -> L19
            goto Lb7
        L15f:
            java.util.Hashtable r8 = r8.f5329     // Catch: java.lang.Exception -> L19
            java.util.Enumeration r8 = r8.elements()     // Catch: java.lang.Exception -> L19
        L165:
            boolean r0 = r8.hasMoreElements()     // Catch: java.lang.Exception -> L19
            if (r0 == 0) goto L1d2
            java.lang.Object r0 = r8.nextElement()     // Catch: java.lang.Exception -> L19
            Yue.ۥ۟ۨۡۥ r0 = (Yue.C1714) r0     // Catch: java.lang.Exception -> L19
            java.io.PrintStream r1 = java.lang.System.out     // Catch: java.lang.Exception -> L19
            java.lang.StringBuffer r5 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> L19
            r5.<init>()     // Catch: java.lang.Exception -> L19
            java.lang.String r6 = "Notation: "
            r5.append(r6)     // Catch: java.lang.Exception -> L19
            java.lang.String r6 = r0.f5369     // Catch: java.lang.Exception -> L19
            r5.append(r6)     // Catch: java.lang.Exception -> L19
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L19
            r1.println(r5)     // Catch: java.lang.Exception -> L19
            Yue.ۥ۟ۨۡۡ r5 = r0.f5370     // Catch: java.lang.Exception -> L19
            if (r5 == 0) goto L165
            boolean r6 = r5 instanceof Yue.C1723     // Catch: java.lang.Exception -> L19
            if (r6 == 0) goto L1a8
            java.lang.StringBuffer r5 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> L19
            r5.<init>()     // Catch: java.lang.Exception -> L19
            r5.append(r4)     // Catch: java.lang.Exception -> L19
            Yue.ۥ۟ۨۡۡ r0 = r0.f5370     // Catch: java.lang.Exception -> L19
            java.lang.String r0 = r0.f5366     // Catch: java.lang.Exception -> L19
            r5.append(r0)     // Catch: java.lang.Exception -> L19
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Exception -> L19
            r1.println(r0)     // Catch: java.lang.Exception -> L19
            goto L165
        L1a8:
            Yue.ۥ۟ۨۢۡ r5 = (Yue.C1721) r5     // Catch: java.lang.Exception -> L19
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> L19
            r0.<init>()     // Catch: java.lang.Exception -> L19
            r0.append(r3)     // Catch: java.lang.Exception -> L19
            java.lang.String r6 = r5.f5379     // Catch: java.lang.Exception -> L19
            r0.append(r6)     // Catch: java.lang.Exception -> L19
            r0.append(r2)     // Catch: java.lang.Exception -> L19
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L19
            r1.print(r0)     // Catch: java.lang.Exception -> L19
            java.lang.String r0 = r5.f5366     // Catch: java.lang.Exception -> L19
            if (r0 == 0) goto L1c9
            r1.println(r0)     // Catch: java.lang.Exception -> L19
            goto L165
        L1c9:
            r1.println()     // Catch: java.lang.Exception -> L19
            goto L165
        L1cd:
            java.io.PrintStream r0 = java.lang.System.out
            r8.printStackTrace(r0)
        L1d2:
            return
    }
}
