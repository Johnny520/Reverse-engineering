package defpackage;

/* JADX INFO: renamed from: ᛱᛵᛴᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0089 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public java.lang.Object f842;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public java.lang.Object f843;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public java.lang.Object f844;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public java.lang.Object f845;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public java.lang.Object f846;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f847;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public int f848;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public java.lang.Object f849;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public java.lang.Object f850;

    public C0089() {
            r4 = this;
            r0 = 0
            r4.f847 = r0
            r4.<init>()
            java.lang.String r0 = ""
            r4.f845 = r0
            r4.f844 = r0
            r1 = -1
            r4.f848 = r1
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.ArrayList r1 = new java.util.ArrayList
            ᲁᲇᲈᛷ r2 = new ᲁᲇᲈᛷ
            r3 = 1
            r2.<init>(r0, r3)
            r1.<init>(r2)
            r4.f842 = r1
            return
    }

    public C0089(android.content.Context r2, android.app.AlertDialog r3, defpackage.C0055 r4, android.widget.LinearLayout r5, android.widget.ImageView r6, android.widget.TextView r7) {
            r1 = this;
            r0 = 1
            r1.f847 = r0
            r1.<init>()
            r1.f846 = r2
            r1.f845 = r3
            r1.f844 = r4
            r1.f849 = r5
            r2 = -1
            r1.f848 = r2
            ᛸᛵᲁᛴ r2 = new ᛸᛵᲁᛴ
            r3 = 0
            r2.<init>(r1, r3)
            r6.setOnClickListener(r2)
            ᛸᛵᲁᛴ r2 = new ᛸᛵᲁᛴ
            r2.<init>(r1, r0)
            r7.setOnClickListener(r2)
            r1.m567()
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static java.util.ArrayList m564(java.lang.String r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r6.length()
            if (r1 > r2) goto L44
            r2 = 38
            r3 = 4
            int r2 = defpackage.AbstractC1347.m2514(r6, r2, r1, r3)
            r4 = -1
            if (r2 != r4) goto L1a
            int r2 = r6.length()
        L1a:
            r5 = 61
            int r3 = defpackage.AbstractC1347.m2514(r6, r5, r1, r3)
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

    public java.lang.String toString() {
            r8 = this;
            int r0 = r8.f847
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r8 = super.toString()
            return r8
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r8.f846
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L1e
            r0.append(r1)
            java.lang.String r1 = "://"
            r0.append(r1)
            goto L23
        L1e:
            java.lang.String r1 = "//"
            r0.append(r1)
        L23:
            java.lang.Object r1 = r8.f845
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            r2 = 58
            if (r1 <= 0) goto L30
            goto L3a
        L30:
            java.lang.Object r1 = r8.f844
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L5a
        L3a:
            java.lang.Object r1 = r8.f845
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.Object r1 = r8.f844
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L55
            r0.append(r2)
            java.lang.Object r1 = r8.f844
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
        L55:
            r1 = 64
            r0.append(r1)
        L5a:
            java.lang.Object r1 = r8.f849
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L7f
            boolean r1 = defpackage.AbstractC1347.m2510(r1, r2)
            if (r1 == 0) goto L78
            r1 = 91
            r0.append(r1)
            java.lang.Object r1 = r8.f849
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            goto L7f
        L78:
            java.lang.Object r1 = r8.f849
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
        L7f:
            int r1 = r8.f848
            r3 = -1
            if (r1 != r3) goto L8a
            java.lang.Object r1 = r8.f846
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto Lb1
        L8a:
            int r1 = r8.m569()
            java.lang.Object r4 = r8.f846
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto Lab
            java.lang.String r5 = "http"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L9f
            r3 = 80
            goto La9
        L9f:
            java.lang.String r5 = "https"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto La9
            r3 = 443(0x1bb, float:6.21E-43)
        La9:
            if (r1 == r3) goto Lb1
        Lab:
            r0.append(r2)
            r0.append(r1)
        Lb1:
            java.lang.Object r1 = r8.f842
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lbb:
            if (r4 >= r2) goto Lce
            r5 = 47
            r0.append(r5)
            java.lang.Object r5 = r1.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            r0.append(r5)
            int r4 = r4 + 1
            goto Lbb
        Lce:
            java.lang.Object r1 = r8.f843
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r1 == 0) goto L11e
            r1 = 63
            r0.append(r1)
            java.lang.Object r1 = r8.f843
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            ᛱᛵᲇᲇ r2 = defpackage.AbstractC1754.m3143(r3, r2)
            r3 = 2
            ᲈᛳᛷᛴ r2 = defpackage.AbstractC1754.m3157(r2, r3)
            int r3 = r2.f9424
            int r4 = r2.f9423
            int r2 = r2.f9422
            if (r2 <= 0) goto Lf4
            if (r3 <= r4) goto Lf8
        Lf4:
            if (r2 >= 0) goto L11e
            if (r4 > r3) goto L11e
        Lf8:
            java.lang.Object r5 = r1.get(r3)
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r3 + 1
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r3 <= 0) goto L10d
            r7 = 38
            r0.append(r7)
        L10d:
            r0.append(r5)
            if (r6 == 0) goto L11a
            r5 = 61
            r0.append(r5)
            r0.append(r6)
        L11a:
            if (r3 == r4) goto L11e
            int r3 = r3 + r2
            goto Lf8
        L11e:
            java.lang.Object r1 = r8.f850
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L130
            r1 = 35
            r0.append(r1)
            java.lang.Object r8 = r8.f850
            java.lang.String r8 = (java.lang.String) r8
            r0.append(r8)
        L130:
            java.lang.String r8 = r0.toString()
            return r8
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public void m565() {
            r2 = this;
            java.lang.Object r0 = r2.f850
            android.media.MediaPlayer r0 = (android.media.MediaPlayer) r0
            if (r0 == 0) goto L12
            boolean r1 = r0.isPlaying()
            if (r1 == 0) goto Lf
            r0.stop()
        Lf:
            r0.release()
        L12:
            r0 = 0
            r2.f850 = r0
            r0 = -1
            r2.f848 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public void m566(defpackage.C0520 r20, java.lang.String r21) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.lang.Object r3 = r0.f842
            r8 = r3
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            byte[] r3 = defpackage.AbstractC0709.f3358
            int r3 = r2.length()
            r9 = 0
            int r4 = defpackage.AbstractC0709.m1613(r2, r9, r3)
            int r3 = r2.length()
            int r10 = defpackage.AbstractC0709.m1600(r2, r4, r3)
            int r3 = r10 - r4
            r11 = 48
            r12 = 91
            r13 = 58
            r14 = -1
            r15 = 2
            if (r3 >= r15) goto L2c
        L2a:
            r3 = r14
            goto L7f
        L2c:
            char r3 = r2.charAt(r4)
            r5 = 97
            int r6 = defpackage.AbstractC0498.m1275(r3, r5)
            r7 = 65
            if (r6 < 0) goto L42
            r6 = 122(0x7a, float:1.71E-43)
            int r6 = defpackage.AbstractC0498.m1275(r3, r6)
            if (r6 <= 0) goto L51
        L42:
            int r6 = defpackage.AbstractC0498.m1275(r3, r7)
            if (r6 < 0) goto L2a
            r6 = 90
            int r3 = defpackage.AbstractC0498.m1275(r3, r6)
            if (r3 <= 0) goto L51
            goto L2a
        L51:
            int r3 = r4 + 1
        L53:
            if (r3 >= r10) goto L2a
            char r6 = r2.charAt(r3)
            if (r5 > r6) goto L60
            r5 = 123(0x7b, float:1.72E-43)
            if (r6 >= r5) goto L60
            goto L7a
        L60:
            if (r7 > r6) goto L65
            if (r6 >= r12) goto L65
            goto L7a
        L65:
            if (r11 > r6) goto L6a
            if (r6 >= r13) goto L6a
            goto L7a
        L6a:
            r5 = 43
            if (r6 == r5) goto L7a
            r5 = 45
            if (r6 == r5) goto L7a
            r5 = 46
            if (r6 != r5) goto L77
            goto L7a
        L77:
            if (r6 != r13) goto L2a
            goto L7f
        L7a:
            int r3 = r3 + 1
            r5 = 97
            goto L53
        L7f:
            java.lang.String r5 = "http"
            java.lang.String r6 = "https"
            r7 = 1
            if (r3 == r14) goto Ld2
            r16 = r6
            r6 = 0
            r17 = r3
            r3 = r7
            r7 = 6
            r18 = r5
            java.lang.String r5 = "https:"
            r13 = r16
            r11 = r17
            r12 = r18
            boolean r5 = r2.regionMatches(r3, r4, r5, r6, r7)
            if (r5 == 0) goto La4
            r0.f846 = r13
            int r4 = r4 + 6
            r2 = r21
            goto Ldb
        La4:
            r6 = 0
            r7 = 5
            java.lang.String r5 = "http:"
            r2 = r21
            boolean r5 = r2.regionMatches(r3, r4, r5, r6, r7)
            if (r5 == 0) goto Lb5
            r0.f846 = r12
            int r4 = r4 + 5
            goto Ldb
        Lb5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r2.substring(r9, r11)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected URL scheme 'http' or 'https' but was '"
            r2.<init>(r3)
            r2.append(r1)
            r1 = 39
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        Ld2:
            r12 = r5
            r13 = r6
            r3 = r7
            if (r1 == 0) goto L382
            java.lang.String r5 = r1.f2565
            r0.f846 = r5
        Ldb:
            r5 = r4
            r6 = r9
        Ldd:
            r7 = 92
            r11 = 47
            r18 = r3
            if (r5 >= r10) goto Lf5
            char r3 = r2.charAt(r5)
            if (r3 == r11) goto Lee
            if (r3 == r7) goto Lee
            goto Lf5
        Lee:
            int r6 = r6 + 1
            int r5 = r5 + 1
            r3 = r18
            goto Ldd
        Lf5:
            java.lang.String r5 = " \"'<>#"
            java.lang.String r3 = ""
            r7 = 35
            if (r6 >= r15) goto L148
            if (r1 == 0) goto L148
            java.lang.String r15 = r1.f2565
            java.lang.Object r11 = r0.f846
            java.lang.String r11 = (java.lang.String) r11
            boolean r11 = defpackage.AbstractC0498.m1280(r15, r11)
            if (r11 != 0) goto L10c
            goto L148
        L10c:
            java.lang.String r6 = r1.m1305()
            r0.f845 = r6
            java.lang.String r6 = r1.m1308()
            r0.f844 = r6
            java.lang.String r6 = r1.f2563
            r0.f849 = r6
            int r6 = r1.f2562
            r0.f848 = r6
            r8.clear()
            java.util.ArrayList r6 = r1.m1307()
            r8.addAll(r6)
            if (r4 == r10) goto L132
            char r6 = r2.charAt(r4)
            if (r6 != r7) goto L264
        L132:
            java.lang.String r1 = r1.m1306()
            if (r1 == 0) goto L143
            r6 = 83
            java.lang.String r1 = defpackage.AbstractC2346.m3846(r9, r9, r6, r1, r5)
            java.util.ArrayList r1 = m564(r1)
            goto L144
        L143:
            r1 = 0
        L144:
            r0.f843 = r1
            goto L264
        L148:
            int r4 = r4 + r6
            r1 = r9
            r6 = r1
        L14b:
            java.lang.String r11 = "@/\\?#"
            int r11 = defpackage.AbstractC0709.m1607(r4, r10, r2, r11)
            if (r11 == r10) goto L158
            char r15 = r2.charAt(r11)
            goto L159
        L158:
            r15 = r14
        L159:
            if (r15 == r14) goto L1d1
            if (r15 == r7) goto L1d1
            r9 = 47
            if (r15 == r9) goto L1d1
            r9 = 92
            if (r15 == r9) goto L1d1
            r9 = 63
            if (r15 == r9) goto L1d1
            r9 = 64
            if (r15 == r9) goto L16f
            r9 = 0
            goto L14b
        L16f:
            java.lang.String r9 = " \"':;<=>@[]^`{}|/\\?#"
            java.lang.String r15 = "%40"
            if (r1 != 0) goto L1ac
            r7 = 58
            int r14 = defpackage.AbstractC0709.m1606(r2, r7, r4, r11)
            r7 = 112(0x70, float:1.57E-43)
            java.lang.String r4 = defpackage.AbstractC2346.m3846(r4, r14, r7, r2, r9)
            if (r6 == 0) goto L196
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.Object r7 = r0.f845
            java.lang.String r7 = (java.lang.String) r7
            r6.<init>(r7)
            r6.append(r15)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
        L196:
            r0.f845 = r4
            if (r14 == r11) goto L1a7
            int r14 = r14 + 1
            r7 = 112(0x70, float:1.57E-43)
            java.lang.String r1 = defpackage.AbstractC2346.m3846(r14, r11, r7, r2, r9)
            r0.f844 = r1
            r1 = r18
            goto L1a9
        L1a7:
            r7 = 112(0x70, float:1.57E-43)
        L1a9:
            r6 = r18
            goto L1c9
        L1ac:
            r7 = 112(0x70, float:1.57E-43)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.Object r7 = r0.f844
            java.lang.String r7 = (java.lang.String) r7
            r14.<init>(r7)
            r14.append(r15)
            r7 = 112(0x70, float:1.57E-43)
            java.lang.String r4 = defpackage.AbstractC2346.m3846(r4, r11, r7, r2, r9)
            r14.append(r4)
            java.lang.String r4 = r14.toString()
            r0.f844 = r4
        L1c9:
            int r4 = r11 + 1
            r7 = 35
            r9 = 0
            r14 = -1
            goto L14b
        L1d1:
            r1 = r4
        L1d2:
            if (r1 >= r11) goto L1f0
            char r6 = r2.charAt(r1)
            r7 = 58
            if (r6 == r7) goto L1f1
            r9 = 91
            if (r6 == r9) goto L1e1
            goto L1ed
        L1e1:
            int r1 = r1 + 1
            if (r1 >= r11) goto L1ed
            char r6 = r2.charAt(r1)
            r14 = 93
            if (r6 != r14) goto L1e1
        L1ed:
            int r1 = r1 + 1
            goto L1d2
        L1f0:
            r1 = r11
        L1f1:
            int r6 = r1 + 1
            r7 = 4
            r9 = 34
            if (r6 >= r11) goto L23b
            java.lang.String r7 = defpackage.AbstractC2346.m3843(r4, r1, r7, r2)
            java.lang.String r7 = defpackage.AbstractC0673.m1519(r7)
            r0.f849 = r7
            r7 = 120(0x78, float:1.68E-43)
            java.lang.String r7 = defpackage.AbstractC2346.m3846(r6, r11, r7, r2, r3)     // Catch: java.lang.NumberFormatException -> L215
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L215
            r12 = r18
            if (r12 > r7) goto L215
            r12 = 65536(0x10000, float:9.1835E-41)
            if (r7 >= r12) goto L215
            goto L216
        L215:
            r7 = -1
        L216:
            r0.f848 = r7
            r14 = -1
            if (r7 == r14) goto L21c
            goto L25d
        L21c:
            java.lang.String r0 = r2.substring(r6, r11)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid URL port: \""
            r1.<init>(r2)
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L23b:
            r14 = -1
            java.lang.String r6 = defpackage.AbstractC2346.m3843(r4, r1, r7, r2)
            java.lang.String r6 = defpackage.AbstractC0673.m1519(r6)
            r0.f849 = r6
            java.lang.Object r6 = r0.f846
            java.lang.String r6 = (java.lang.String) r6
            boolean r7 = r6.equals(r12)
            if (r7 == 0) goto L253
            r14 = 80
            goto L25b
        L253:
            boolean r6 = r6.equals(r13)
            if (r6 == 0) goto L25b
            r14 = 443(0x1bb, float:6.21E-43)
        L25b:
            r0.f848 = r14
        L25d:
            java.lang.Object r6 = r0.f849
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L363
            r4 = r11
        L264:
            java.lang.String r1 = "?#"
            int r1 = defpackage.AbstractC0709.m1607(r4, r10, r2, r1)
            if (r4 != r1) goto L26e
            goto L32d
        L26e:
            char r6 = r2.charAt(r4)
            r9 = 47
            if (r6 == r9) goto L286
            r9 = 92
            if (r6 == r9) goto L286
            int r6 = r8.size()
            r18 = 1
            int r6 = r6 + (-1)
            r8.set(r6, r3)
            goto L28e
        L286:
            r8.clear()
            r8.add(r3)
            int r4 = r4 + 1
        L28e:
            if (r4 >= r1) goto L32d
            java.lang.String r6 = "/\\"
            int r6 = defpackage.AbstractC0709.m1607(r4, r1, r2, r6)
            if (r6 >= r1) goto L29a
            r7 = 1
            goto L29b
        L29a:
            r7 = 0
        L29b:
            java.lang.String r9 = " \"<>^`{}|/\\?#"
            r11 = 112(0x70, float:1.57E-43)
            java.lang.String r4 = defpackage.AbstractC2346.m3846(r4, r6, r11, r2, r9)
            java.lang.String r9 = "."
            boolean r9 = r4.equals(r9)
            if (r9 != 0) goto L324
            java.lang.String r9 = "%2e"
            boolean r9 = r4.equalsIgnoreCase(r9)
            if (r9 == 0) goto L2b5
            goto L324
        L2b5:
            java.lang.String r9 = ".."
            boolean r9 = r4.equals(r9)
            if (r9 != 0) goto L2fd
            java.lang.String r9 = "%2e."
            boolean r9 = r4.equalsIgnoreCase(r9)
            if (r9 != 0) goto L2fd
            java.lang.String r9 = ".%2e"
            boolean r9 = r4.equalsIgnoreCase(r9)
            if (r9 != 0) goto L2fd
            java.lang.String r9 = "%2e%2e"
            boolean r9 = r4.equalsIgnoreCase(r9)
            if (r9 == 0) goto L2d6
            goto L2fd
        L2d6:
            int r9 = r8.size()
            r18 = 1
            int r9 = r9 + (-1)
            java.lang.Object r9 = r8.get(r9)
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            int r9 = r9.length()
            if (r9 != 0) goto L2f4
            int r9 = r8.size()
            int r9 = r9 + (-1)
            r8.set(r9, r4)
            goto L2f7
        L2f4:
            r8.add(r4)
        L2f7:
            if (r7 == 0) goto L324
            r8.add(r3)
            goto L324
        L2fd:
            int r4 = r8.size()
            r18 = 1
            int r4 = r4 + (-1)
            java.lang.Object r4 = r8.remove(r4)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.length()
            if (r4 != 0) goto L321
            boolean r4 = r8.isEmpty()
            if (r4 != 0) goto L321
            int r4 = r8.size()
            int r4 = r4 + (-1)
            r8.set(r4, r3)
            goto L324
        L321:
            r8.add(r3)
        L324:
            if (r7 == 0) goto L32a
            int r4 = r6 + 1
            goto L28e
        L32a:
            r4 = r6
            goto L28e
        L32d:
            if (r1 >= r10) goto L34c
            char r4 = r2.charAt(r1)
            r9 = 63
            if (r4 != r9) goto L34c
            r4 = 35
            int r6 = defpackage.AbstractC0709.m1606(r2, r4, r1, r10)
            int r1 = r1 + 1
            r4 = 80
            java.lang.String r1 = defpackage.AbstractC2346.m3846(r1, r6, r4, r2, r5)
            java.util.ArrayList r1 = m564(r1)
            r0.f843 = r1
            r1 = r6
        L34c:
            if (r1 >= r10) goto L362
            char r4 = r2.charAt(r1)
            r5 = 35
            if (r4 != r5) goto L362
            r18 = 1
            int r1 = r1 + 1
            r4 = 48
            java.lang.String r1 = defpackage.AbstractC2346.m3846(r1, r10, r4, r2, r3)
            r0.f850 = r1
        L362:
            return
        L363:
            java.lang.String r0 = r2.substring(r4, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid URL host: \""
            r1.<init>(r2)
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L382:
            int r0 = r2.length()
            r1 = 6
            if (r0 <= r1) goto L394
            java.lang.String r0 = defpackage.AbstractC1347.m2523(r1, r2)
            java.lang.String r1 = "..."
            java.lang.String r0 = r0.concat(r1)
            goto L395
        L394:
            r0 = r2
        L395:
            java.lang.String r1 = "Expected URL scheme 'http' or 'https' but no scheme was found for "
            java.lang.String r0 = r1.concat(r0)
            defpackage.C2264.m3684(r0)
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public void m567() {
            r8 = this;
            java.lang.Object r0 = r8.f849
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            ᛵᛸᛵᛷ r1 = defpackage.C0945.f4234
            r1.getClass()
            java.util.List r1 = defpackage.C0945.m1899()
            boolean r2 = r1.isEmpty()
            java.lang.Object r3 = r8.f844
            ᛱᛳᛶᛱ r3 = (defpackage.C0055) r3
            r4 = 0
            r5 = 8
            if (r2 == 0) goto L21
            r3.setVisibility(r5)
            r0.setVisibility(r4)
            return
        L21:
            r3.setVisibility(r4)
            r0.setVisibility(r5)
            ᛱᲁᛲᛸ r0 = new ᛱᲁᛲᛸ
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            ᛷᛶᛵᛲ r1 = new ᛷᛶᛵᛲ
            r5 = 2
            r1.<init>(r5, r8)
            ᛶᛳᛵᲀ r5 = new ᛶᛳᛵᲀ
            r5.<init>(r8, r4)
            ᛶᛳᛵᲀ r6 = new ᛶᛳᛵᲀ
            r7 = 1
            r6.<init>(r8, r7)
            r0.<init>(r2, r1, r5, r6)
            r8.f842 = r0
            r3.setAdapter(r0)
            androidx.recyclerview.widget.LinearLayoutManager r8 = new androidx.recyclerview.widget.LinearLayoutManager
            r8.<init>(r4)
            r3.setLayoutManager(r8)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public defpackage.C0520 m568() {
            r12 = this;
            java.lang.Object r0 = r12.f846
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            r0 = 0
            if (r2 == 0) goto L97
            java.lang.Object r1 = r12.f845
            java.lang.String r1 = (java.lang.String) r1
            r3 = 0
            r4 = 7
            java.lang.String r1 = defpackage.AbstractC2346.m3843(r3, r3, r4, r1)
            java.lang.Object r5 = r12.f844
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = defpackage.AbstractC2346.m3843(r3, r3, r4, r5)
            java.lang.Object r6 = r12.f849
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L91
            r7 = r4
            r4 = r5
            r5 = r6
            int r6 = r12.m569()
            java.lang.Object r8 = r12.f842
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = defpackage.AbstractC0575.m1369(r8)
            r9.<init>(r10)
            java.util.Iterator r8 = r8.iterator()
        L38:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L4c
            java.lang.Object r10 = r8.next()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r10 = defpackage.AbstractC2346.m3843(r3, r3, r7, r10)
            r9.add(r10)
            goto L38
        L4c:
            java.lang.Object r8 = r12.f843
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            if (r8 == 0) goto L78
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = defpackage.AbstractC0575.m1369(r8)
            r9.<init>(r10)
            java.util.Iterator r8 = r8.iterator()
        L5f:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L79
            java.lang.Object r10 = r8.next()
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L73
            r11 = 3
            java.lang.String r10 = defpackage.AbstractC2346.m3843(r3, r3, r11, r10)
            goto L74
        L73:
            r10 = r0
        L74:
            r9.add(r10)
            goto L5f
        L78:
            r9 = r0
        L79:
            java.lang.Object r8 = r12.f850
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L83
            java.lang.String r0 = defpackage.AbstractC2346.m3843(r3, r3, r7, r8)
        L83:
            r8 = r0
            java.lang.String r12 = r12.toString()
            r3 = r1
            ᛳᛸᛲ r1 = new ᛳᛸᛲ
            r7 = r9
            r9 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        L91:
            java.lang.String r12 = "host == null"
            defpackage.C2264.m3676(r12)
            return r0
        L97:
            java.lang.String r12 = "scheme == null"
            defpackage.C2264.m3676(r12)
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public int m569() {
            r2 = this;
            int r0 = r2.f848
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            java.lang.Object r2 = r2.f846
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = "http"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L15
            r1 = 80
            goto L1f
        L15:
            java.lang.String r0 = "https"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L1f
            r1 = 443(0x1bb, float:6.21E-43)
        L1f:
            return r1
    }
}
