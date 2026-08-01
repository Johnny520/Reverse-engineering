package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ng0 {

    /* JADX INFO: renamed from: α */
    public java.lang.String f7608;

    /* JADX INFO: renamed from: β */
    public java.lang.String f7609;

    /* JADX INFO: renamed from: γ */
    public java.lang.String f7610;

    /* JADX INFO: renamed from: δ */
    public java.lang.String f7611;

    /* JADX INFO: renamed from: ε */
    public int f7612;

    /* JADX INFO: renamed from: ζ */
    public final java.util.ArrayList f7613;

    /* JADX INFO: renamed from: η */
    public java.util.ArrayList f7614;

    /* JADX INFO: renamed from: θ */
    public java.lang.String f7615;

    public ng0() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = ""
            r2.f7609 = r0
            r2.f7610 = r0
            r1 = -1
            r2.f7612 = r1
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.ArrayList r0 = p000.AbstractC1021yh.m6899(r0)
            r2.f7613 = r0
            return
    }

    /* JADX INFO: renamed from: δ */
    public static java.util.ArrayList m4039(java.lang.String r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r6.length()
            if (r1 > r2) goto L44
            r2 = 38
            r3 = 4
            int r2 = p000.q02.m4668(r6, r2, r1, r3)
            r4 = -1
            if (r2 != r4) goto L1a
            int r2 = r6.length()
        L1a:
            r5 = 61
            int r3 = p000.q02.m4668(r6, r5, r1, r3)
            if (r3 == r4) goto L36
            if (r3 <= r2) goto L25
            goto L36
        L25:
            java.lang.String r1 = r6.substring(r1, r3)
            r0.add(r1)
            int r3 = r3 + 1
            java.lang.String r1 = r6.substring(r3, r2)
            r0.add(r1)
            goto L41
        L36:
            java.lang.String r1 = r6.substring(r1, r2)
            r0.add(r1)
            r1 = 0
            r0.add(r1)
        L41:
            int r1 = r2 + 1
            goto L6
        L44:
            return r0
    }

    public final java.lang.String toString() {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r8.f7608
            if (r1 == 0) goto L12
            r0.append(r1)
            java.lang.String r1 = "://"
            r0.append(r1)
            goto L17
        L12:
            java.lang.String r1 = "//"
            r0.append(r1)
        L17:
            java.lang.String r1 = r8.f7609
            int r1 = r1.length()
            r2 = 58
            if (r1 <= 0) goto L22
            goto L2a
        L22:
            java.lang.String r1 = r8.f7610
            int r1 = r1.length()
            if (r1 <= 0) goto L44
        L2a:
            java.lang.String r1 = r8.f7609
            r0.append(r1)
            java.lang.String r1 = r8.f7610
            int r1 = r1.length()
            if (r1 <= 0) goto L3f
            r0.append(r2)
            java.lang.String r1 = r8.f7610
            r0.append(r1)
        L3f:
            r1 = 64
            r0.append(r1)
        L44:
            java.lang.String r1 = r8.f7611
            if (r1 == 0) goto L63
            boolean r1 = p000.q02.m4655(r1, r2)
            if (r1 == 0) goto L5e
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = r8.f7611
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            goto L63
        L5e:
            java.lang.String r1 = r8.f7611
            r0.append(r1)
        L63:
            int r1 = r8.f7612
            r3 = -1
            if (r1 != r3) goto L6c
            java.lang.String r1 = r8.f7608
            if (r1 == 0) goto L91
        L6c:
            int r1 = r8.m4041()
            java.lang.String r4 = r8.f7608
            if (r4 == 0) goto L8b
            java.lang.String r5 = "http"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L7f
            r3 = 80
            goto L89
        L7f:
            java.lang.String r5 = "https"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L89
            r3 = 443(0x1bb, float:6.21E-43)
        L89:
            if (r1 == r3) goto L91
        L8b:
            r0.append(r2)
            r0.append(r1)
        L91:
            java.util.ArrayList r1 = r8.f7613
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        L99:
            if (r4 >= r2) goto Lac
            r5 = 47
            r0.append(r5)
            java.lang.Object r5 = r1.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            r0.append(r5)
            int r4 = r4 + 1
            goto L99
        Lac:
            java.util.ArrayList r1 = r8.f7614
            if (r1 == 0) goto Lfb
            r1 = 63
            r0.append(r1)
            java.util.ArrayList r1 = r8.f7614
            r1.getClass()
            int r2 = r1.size()
            xm0 r2 = p000.j81.m2893(r3, r2)
            r3 = 2
            vm0 r2 = p000.j81.m2889(r3, r2)
            int r3 = r2.f11347
            int r4 = r2.f11348
            int r2 = r2.f11349
            if (r2 <= 0) goto Ld1
            if (r3 <= r4) goto Ld5
        Ld1:
            if (r2 >= 0) goto Lfb
            if (r4 > r3) goto Lfb
        Ld5:
            java.lang.Object r5 = r1.get(r3)
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r3 + 1
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r3 <= 0) goto Lea
            r7 = 38
            r0.append(r7)
        Lea:
            r0.append(r5)
            if (r6 == 0) goto Lf7
            r5 = 61
            r0.append(r5)
            r0.append(r6)
        Lf7:
            if (r3 == r4) goto Lfb
            int r3 = r3 + r2
            goto Ld5
        Lfb:
            java.lang.String r1 = r8.f7615
            if (r1 == 0) goto L109
            r1 = 35
            r0.append(r1)
            java.lang.String r8 = r8.f7615
            r0.append(r8)
        L109:
            java.lang.String r8 = r0.toString()
            return r8
    }

    /* JADX INFO: renamed from: α */
    public final p000.og0 m4040() {
            r12 = this;
            java.lang.String r1 = r12.f7608
            if (r1 == 0) goto L8a
            java.lang.String r0 = r12.f7609
            r2 = 0
            r3 = 7
            java.lang.String r0 = p000.AbstractC0073bd.m855(r2, r2, r3, r0)
            java.lang.String r4 = r12.f7610
            java.lang.String r4 = p000.AbstractC0073bd.m855(r2, r2, r3, r4)
            r5 = r3
            r3 = r4
            java.lang.String r4 = r12.f7611
            if (r4 == 0) goto L83
            r6 = r5
            int r5 = r12.m4041()
            java.util.ArrayList r7 = new java.util.ArrayList
            java.util.ArrayList r8 = r12.f7613
            r9 = 10
            int r10 = p000.AbstractC1021yh.m6889(r8, r9)
            r7.<init>(r10)
            java.util.Iterator r8 = r8.iterator()
        L2e:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L42
            java.lang.Object r10 = r8.next()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r10 = p000.AbstractC0073bd.m855(r2, r2, r6, r10)
            r7.add(r10)
            goto L2e
        L42:
            java.util.ArrayList r7 = r12.f7614
            r8 = 0
            if (r7 == 0) goto L6d
            java.util.ArrayList r10 = new java.util.ArrayList
            int r9 = p000.AbstractC1021yh.m6889(r7, r9)
            r10.<init>(r9)
            java.util.Iterator r7 = r7.iterator()
        L54:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L6e
            java.lang.Object r9 = r7.next()
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L68
            r11 = 3
            java.lang.String r9 = p000.AbstractC0073bd.m855(r2, r2, r11, r9)
            goto L69
        L68:
            r9 = r8
        L69:
            r10.add(r9)
            goto L54
        L6d:
            r10 = r8
        L6e:
            java.lang.String r7 = r12.f7615
            if (r7 == 0) goto L76
            java.lang.String r8 = p000.AbstractC0073bd.m855(r2, r2, r6, r7)
        L76:
            r7 = r8
            java.lang.String r8 = r12.toString()
            r2 = r0
            og0 r0 = new og0
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        L83:
            java.lang.String r12 = "host == null"
            p000.C1080.m7279(r12)
        L88:
            r12 = 0
            return r12
        L8a:
            java.lang.String r12 = "scheme == null"
            p000.C1080.m7279(r12)
            goto L88
    }

    /* JADX INFO: renamed from: β */
    public final int m4041() {
            r2 = this;
            int r0 = r2.f7612
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            java.lang.String r2 = r2.f7608
            r2.getClass()
            java.lang.String r0 = "http"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L16
            r1 = 80
            goto L20
        L16:
            java.lang.String r0 = "https"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L20
            r1 = 443(0x1bb, float:6.21E-43)
        L20:
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public final void m4042(p000.og0 r18, java.lang.String r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            byte[] r3 = p000.sd2.f9867
            int r3 = r2.length()
            r4 = 0
            int r3 = p000.sd2.m5477(r4, r3, r2)
            int r5 = r2.length()
            int r5 = p000.sd2.m5478(r3, r5, r2)
            int r6 = r5 - r3
            r7 = 48
            r8 = 91
            r9 = 58
            r10 = -1
            r11 = 2
            if (r6 >= r11) goto L27
        L25:
            r6 = r10
            goto L78
        L27:
            char r6 = r2.charAt(r3)
            r12 = 97
            int r13 = p000.ln0.m3632(r6, r12)
            r14 = 65
            if (r13 < 0) goto L3d
            r13 = 122(0x7a, float:1.71E-43)
            int r13 = p000.ln0.m3632(r6, r13)
            if (r13 <= 0) goto L4c
        L3d:
            int r13 = p000.ln0.m3632(r6, r14)
            if (r13 < 0) goto L25
            r13 = 90
            int r6 = p000.ln0.m3632(r6, r13)
            if (r6 <= 0) goto L4c
            goto L25
        L4c:
            int r6 = r3 + 1
        L4e:
            if (r6 >= r5) goto L25
            char r13 = r2.charAt(r6)
            if (r12 > r13) goto L5b
            r15 = 123(0x7b, float:1.72E-43)
            if (r13 >= r15) goto L5b
            goto L75
        L5b:
            if (r14 > r13) goto L60
            if (r13 >= r8) goto L60
            goto L75
        L60:
            if (r7 > r13) goto L65
            if (r13 >= r9) goto L65
            goto L75
        L65:
            r15 = 43
            if (r13 == r15) goto L75
            r15 = 45
            if (r13 == r15) goto L75
            r15 = 46
            if (r13 != r15) goto L72
            goto L75
        L72:
            if (r13 != r9) goto L25
            goto L78
        L75:
            int r6 = r6 + 1
            goto L4e
        L78:
            java.lang.String r12 = "http"
            java.lang.String r13 = "https"
            r14 = 1
            if (r6 == r10) goto Lb6
            java.lang.String r15 = "https:"
            boolean r15 = p000.x02.m6484(r2, r15, r3, r14)
            if (r15 == 0) goto L8c
            r0.f7608 = r13
            int r3 = r3 + 6
            goto Lbc
        L8c:
            java.lang.String r15 = "http:"
            boolean r15 = p000.x02.m6484(r2, r15, r3, r14)
            if (r15 == 0) goto L99
            r0.f7608 = r12
            int r3 = r3 + 5
            goto Lbc
        L99:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r2.substring(r4, r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected URL scheme 'http' or 'https' but was '"
            r2.<init>(r3)
            r2.append(r1)
            r1 = 39
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        Lb6:
            if (r1 == 0) goto L35e
            java.lang.String r6 = r1.f8090
            r0.f7608 = r6
        Lbc:
            r6 = r3
            r15 = r4
        Lbe:
            r7 = 92
            r16 = r14
            r14 = 47
            if (r6 >= r5) goto Ld8
            char r8 = r2.charAt(r6)
            if (r8 == r14) goto Lcf
            if (r8 == r7) goto Lcf
            goto Ld8
        Lcf:
            int r15 = r15 + 1
            int r6 = r6 + 1
            r14 = r16
            r8 = 91
            goto Lbe
        Ld8:
            java.lang.String r8 = " \"'<>#"
            java.lang.String r6 = ""
            java.util.ArrayList r9 = r0.f7613
            r7 = 35
            if (r15 >= r11) goto L12b
            if (r1 == 0) goto L12b
            java.lang.String r11 = r1.f8090
            java.lang.String r14 = r0.f7608
            boolean r11 = p000.ln0.m3626(r11, r14)
            if (r11 != 0) goto Lef
            goto L12b
        Lef:
            java.lang.String r10 = r1.m4234()
            r0.f7609 = r10
            java.lang.String r10 = r1.m4230()
            r0.f7610 = r10
            java.lang.String r10 = r1.f8093
            r0.f7611 = r10
            int r10 = r1.f8094
            r0.f7612 = r10
            r9.clear()
            java.util.ArrayList r10 = r1.m4232()
            r9.addAll(r10)
            if (r3 == r5) goto L115
            char r10 = r2.charAt(r3)
            if (r10 != r7) goto L240
        L115:
            java.lang.String r1 = r1.m4233()
            if (r1 == 0) goto L126
            r10 = 83
            java.lang.String r1 = p000.AbstractC0073bd.m875(r1, r4, r4, r8, r10)
            java.util.ArrayList r1 = m4039(r1)
            goto L127
        L126:
            r1 = 0
        L127:
            r0.f7614 = r1
            goto L240
        L12b:
            int r3 = r3 + r15
            r1 = r4
            r11 = r1
        L12e:
            java.lang.String r14 = "@/\\?#"
            int r14 = p000.sd2.m5473(r3, r5, r2, r14)
            if (r14 == r5) goto L13b
            char r15 = r2.charAt(r14)
            goto L13c
        L13b:
            r15 = r10
        L13c:
            if (r15 == r10) goto L1ac
            if (r15 == r7) goto L1ac
            r4 = 47
            if (r15 == r4) goto L1ac
            r4 = 92
            if (r15 == r4) goto L1ac
            r4 = 63
            if (r15 == r4) goto L1ac
            r4 = 64
            if (r15 == r4) goto L152
            r4 = 0
            goto L12e
        L152:
            java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
            java.lang.String r15 = "%40"
            if (r1 != 0) goto L187
            r7 = 58
            int r10 = p000.sd2.m5474(r2, r7, r3, r14)
            r7 = 112(0x70, float:1.57E-43)
            java.lang.String r3 = p000.AbstractC0073bd.m875(r2, r3, r10, r4, r7)
            if (r11 == 0) goto L171
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r11 = r0.f7609
            java.lang.String r3 = p000.AbstractC0602nx.m4133(r7, r11, r15, r3)
        L171:
            r0.f7609 = r3
            if (r10 == r14) goto L182
            int r10 = r10 + 1
            r7 = 112(0x70, float:1.57E-43)
            java.lang.String r1 = p000.AbstractC0073bd.m875(r2, r10, r14, r4, r7)
            r0.f7610 = r1
            r1 = r16
            goto L184
        L182:
            r7 = 112(0x70, float:1.57E-43)
        L184:
            r11 = r16
            goto L1a5
        L187:
            r7 = 112(0x70, float:1.57E-43)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r7 = r0.f7610
            r10.append(r7)
            r10.append(r15)
            r7 = 112(0x70, float:1.57E-43)
            java.lang.String r3 = p000.AbstractC0073bd.m875(r2, r3, r14, r4, r7)
            r10.append(r3)
            java.lang.String r3 = r10.toString()
            r0.f7610 = r3
        L1a5:
            int r3 = r14 + 1
            r4 = 0
            r7 = 35
            r10 = -1
            goto L12e
        L1ac:
            r1 = r3
        L1ad:
            if (r1 >= r14) goto L1cb
            char r4 = r2.charAt(r1)
            r7 = 58
            if (r4 == r7) goto L1cc
            r10 = 91
            if (r4 == r10) goto L1bc
            goto L1c8
        L1bc:
            int r1 = r1 + 1
            if (r1 >= r14) goto L1c8
            char r4 = r2.charAt(r1)
            r11 = 93
            if (r4 != r11) goto L1bc
        L1c8:
            int r1 = r1 + 1
            goto L1ad
        L1cb:
            r1 = r14
        L1cc:
            int r4 = r1 + 1
            r7 = 4
            r10 = 34
            if (r4 >= r14) goto L216
            java.lang.String r7 = p000.AbstractC0073bd.m855(r3, r1, r7, r2)
            java.lang.String r7 = p000.qd2.m4868(r7)
            r0.f7611 = r7
            r7 = 120(0x78, float:1.68E-43)
            java.lang.String r7 = p000.AbstractC0073bd.m875(r2, r4, r14, r6, r7)     // Catch: java.lang.NumberFormatException -> L1f0
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L1f0
            r11 = r16
            if (r11 > r7) goto L1f0
            r11 = 65536(0x10000, float:9.1835E-41)
            if (r7 >= r11) goto L1f0
            goto L1f1
        L1f0:
            r7 = -1
        L1f1:
            r0.f7612 = r7
            r11 = -1
            if (r7 == r11) goto L1f7
            goto L23b
        L1f7:
            java.lang.String r0 = r2.substring(r4, r14)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid URL port: \""
            r1.<init>(r2)
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L216:
            r11 = -1
            java.lang.String r4 = p000.AbstractC0073bd.m855(r3, r1, r7, r2)
            java.lang.String r4 = p000.qd2.m4868(r4)
            r0.f7611 = r4
            java.lang.String r4 = r0.f7608
            r4.getClass()
            boolean r7 = r4.equals(r12)
            if (r7 == 0) goto L22f
            r4 = 80
            goto L239
        L22f:
            boolean r4 = r4.equals(r13)
            if (r4 == 0) goto L238
            r4 = 443(0x1bb, float:6.21E-43)
            goto L239
        L238:
            r4 = r11
        L239:
            r0.f7612 = r4
        L23b:
            java.lang.String r4 = r0.f7611
            if (r4 == 0) goto L33f
            r3 = r14
        L240:
            java.lang.String r1 = "?#"
            int r1 = p000.sd2.m5473(r3, r5, r2, r1)
            if (r3 != r1) goto L24a
            goto L309
        L24a:
            char r4 = r2.charAt(r3)
            r7 = 47
            if (r4 == r7) goto L262
            r7 = 92
            if (r4 == r7) goto L262
            int r4 = r9.size()
            r16 = 1
            int r4 = r4 + (-1)
            r9.set(r4, r6)
            goto L26a
        L262:
            r9.clear()
            r9.add(r6)
            int r3 = r3 + 1
        L26a:
            if (r3 >= r1) goto L309
            java.lang.String r4 = "/\\"
            int r4 = p000.sd2.m5473(r3, r1, r2, r4)
            if (r4 >= r1) goto L276
            r11 = 1
            goto L277
        L276:
            r11 = 0
        L277:
            java.lang.String r7 = " \"<>^`{}|/\\?#"
            r10 = 112(0x70, float:1.57E-43)
            java.lang.String r3 = p000.AbstractC0073bd.m875(r2, r3, r4, r7, r10)
            java.lang.String r7 = "."
            boolean r7 = r3.equals(r7)
            if (r7 != 0) goto L300
            java.lang.String r7 = "%2e"
            boolean r7 = r3.equalsIgnoreCase(r7)
            if (r7 == 0) goto L291
            goto L300
        L291:
            java.lang.String r7 = ".."
            boolean r7 = r3.equals(r7)
            if (r7 != 0) goto L2d9
            java.lang.String r7 = "%2e."
            boolean r7 = r3.equalsIgnoreCase(r7)
            if (r7 != 0) goto L2d9
            java.lang.String r7 = ".%2e"
            boolean r7 = r3.equalsIgnoreCase(r7)
            if (r7 != 0) goto L2d9
            java.lang.String r7 = "%2e%2e"
            boolean r7 = r3.equalsIgnoreCase(r7)
            if (r7 == 0) goto L2b2
            goto L2d9
        L2b2:
            int r7 = r9.size()
            r16 = 1
            int r7 = r7 + (-1)
            java.lang.Object r7 = r9.get(r7)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            int r7 = r7.length()
            if (r7 != 0) goto L2d0
            int r7 = r9.size()
            int r7 = r7 + (-1)
            r9.set(r7, r3)
            goto L2d3
        L2d0:
            r9.add(r3)
        L2d3:
            if (r11 == 0) goto L300
            r9.add(r6)
            goto L300
        L2d9:
            int r3 = r9.size()
            r16 = 1
            int r3 = r3 + (-1)
            java.lang.Object r3 = r9.remove(r3)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.length()
            if (r3 != 0) goto L2fd
            boolean r3 = r9.isEmpty()
            if (r3 != 0) goto L2fd
            int r3 = r9.size()
            int r3 = r3 + (-1)
            r9.set(r3, r6)
            goto L300
        L2fd:
            r9.add(r6)
        L300:
            if (r11 == 0) goto L306
            int r3 = r4 + 1
            goto L26a
        L306:
            r3 = r4
            goto L26a
        L309:
            if (r1 >= r5) goto L328
            char r3 = r2.charAt(r1)
            r4 = 63
            if (r3 != r4) goto L328
            r3 = 35
            int r4 = p000.sd2.m5474(r2, r3, r1, r5)
            int r1 = r1 + 1
            r3 = 80
            java.lang.String r1 = p000.AbstractC0073bd.m875(r2, r1, r4, r8, r3)
            java.util.ArrayList r1 = m4039(r1)
            r0.f7614 = r1
            r1 = r4
        L328:
            if (r1 >= r5) goto L33e
            char r3 = r2.charAt(r1)
            r4 = 35
            if (r3 != r4) goto L33e
            r16 = 1
            int r1 = r1 + 1
            r3 = 48
            java.lang.String r1 = p000.AbstractC0073bd.m875(r2, r1, r5, r6, r3)
            r0.f7615 = r1
        L33e:
            return
        L33f:
            java.lang.String r0 = r2.substring(r3, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid URL host: \""
            r1.<init>(r2)
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L35e:
            int r0 = r2.length()
            r1 = 6
            if (r0 <= r1) goto L370
            java.lang.String r0 = p000.q02.m4693(r2, r1)
            java.lang.String r1 = "..."
            java.lang.String r0 = r0.concat(r1)
            goto L371
        L370:
            r0 = r2
        L371:
            java.lang.String r1 = "Expected URL scheme 'http' or 'https' but no scheme was found for "
            java.lang.String r0 = r1.concat(r0)
            p000.C1080.m7275(r0)
            return
    }
}
