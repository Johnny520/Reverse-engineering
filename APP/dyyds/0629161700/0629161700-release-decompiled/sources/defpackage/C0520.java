package defpackage;

/* JADX INFO: renamed from: ᛳᛸᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0520 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final java.lang.String f2561;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final int f2562;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.String f2563;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f2564;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f2565;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f2566;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.util.List f2567;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.lang.String f2568;

    public C0520(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5, java.util.ArrayList r6, java.lang.String r7, java.lang.String r8) {
            r0 = this;
            r0.<init>()
            r0.f2565 = r1
            r0.f2566 = r2
            r0.f2564 = r3
            r0.f2563 = r4
            r0.f2562 = r5
            r0.f2567 = r6
            r0.f2568 = r7
            r0.f2561 = r8
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.C0520
            if (r0 == 0) goto L12
            ᛳᛸᛲ r2 = (defpackage.C0520) r2
            java.lang.String r2 = r2.f2561
            java.lang.String r1 = r1.f2561
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.f2561
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = r0.f2561
            return r0
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final java.net.URI m1304() {
            r9 = this;
            ᛱᛵᛴᛲ r9 = r9.m1310()
            java.lang.Object r0 = r9.f842
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r1 = r9.f849
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = ""
            r3 = 0
            if (r1 == 0) goto L20
            java.lang.String r4 = "[\"<>^`{|}]"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)
            java.util.regex.Matcher r1 = r4.matcher(r1)
            java.lang.String r1 = r1.replaceAll(r2)
            goto L21
        L20:
            r1 = r3
        L21:
            r9.f849 = r1
            int r1 = r0.size()
            r4 = 0
            r5 = r4
        L29:
            if (r5 >= r1) goto L3f
            java.lang.Object r6 = r0.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = "[]"
            r8 = 99
            java.lang.String r6 = defpackage.AbstractC2346.m3846(r4, r4, r8, r6, r7)
            r0.set(r5, r6)
            int r5 = r5 + 1
            goto L29
        L3f:
            java.lang.Object r0 = r9.f843
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L64
            int r1 = r0.size()
            r5 = r4
        L4a:
            if (r5 >= r1) goto L64
            java.lang.Object r6 = r0.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L5d
            java.lang.String r7 = "\\^`{|}"
            r8 = 67
            java.lang.String r6 = defpackage.AbstractC2346.m3846(r4, r4, r8, r6, r7)
            goto L5e
        L5d:
            r6 = r3
        L5e:
            r0.set(r5, r6)
            int r5 = r5 + 1
            goto L4a
        L64:
            java.lang.Object r0 = r9.f850
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L72
            java.lang.String r1 = " \"#<>\\^`{|}"
            r3 = 35
            java.lang.String r3 = defpackage.AbstractC2346.m3846(r4, r4, r3, r0, r1)
        L72:
            r9.f850 = r3
            java.lang.String r9 = r9.toString()
            java.net.URI r0 = new java.net.URI     // Catch: java.net.URISyntaxException -> L7e
            r0.<init>(r9)     // Catch: java.net.URISyntaxException -> L7e
            return r0
        L7e:
            r0 = move-exception
            java.lang.String r1 = "[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)     // Catch: java.lang.Exception -> L92
            java.util.regex.Matcher r9 = r1.matcher(r9)     // Catch: java.lang.Exception -> L92
            java.lang.String r9 = r9.replaceAll(r2)     // Catch: java.lang.Exception -> L92
            java.net.URI r9 = java.net.URI.create(r9)     // Catch: java.lang.Exception -> L92
            return r9
        L92:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            r9.<init>(r0)
            throw r9
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.String m1305() {
            r3 = this;
            java.lang.String r0 = r3.f2566
            int r0 = r0.length()
            if (r0 != 0) goto Lb
            java.lang.String r3 = ""
            return r3
        Lb:
            java.lang.String r0 = r3.f2565
            int r0 = r0.length()
            int r0 = r0 + 3
            java.lang.String r1 = ":@"
            java.lang.String r3 = r3.f2561
            int r2 = r3.length()
            int r1 = defpackage.AbstractC0709.m1607(r0, r2, r3, r1)
            java.lang.String r3 = r3.substring(r0, r1)
            return r3
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.String m1306() {
            r3 = this;
            java.util.List r0 = r3.f2567
            if (r0 != 0) goto L6
            r3 = 0
            return r3
        L6:
            r0 = 0
            r1 = 6
            java.lang.String r3 = r3.f2561
            r2 = 63
            int r0 = defpackage.AbstractC1347.m2514(r3, r2, r0, r1)
            int r0 = r0 + 1
            r1 = 35
            int r2 = r3.length()
            int r1 = defpackage.AbstractC0709.m1606(r3, r1, r0, r2)
            java.lang.String r3 = r3.substring(r0, r1)
            return r3
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.util.ArrayList m1307() {
            r5 = this;
            java.lang.String r0 = r5.f2565
            int r0 = r0.length()
            int r0 = r0 + 3
            r1 = 4
            java.lang.String r5 = r5.f2561
            r2 = 47
            int r0 = defpackage.AbstractC1347.m2514(r5, r2, r0, r1)
            java.lang.String r1 = "?#"
            int r3 = r5.length()
            int r1 = defpackage.AbstractC0709.m1607(r0, r3, r5, r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L20:
            if (r0 >= r1) goto L31
            int r0 = r0 + 1
            int r4 = defpackage.AbstractC0709.m1606(r5, r2, r0, r1)
            java.lang.String r0 = r5.substring(r0, r4)
            r3.add(r0)
            r0 = r4
            goto L20
        L31:
            return r3
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String m1308() {
            r4 = this;
            java.lang.String r0 = r4.f2564
            int r0 = r0.length()
            if (r0 != 0) goto Lb
            java.lang.String r4 = ""
            return r4
        Lb:
            java.lang.String r0 = r4.f2565
            int r0 = r0.length()
            int r0 = r0 + 3
            r1 = 4
            java.lang.String r4 = r4.f2561
            r2 = 58
            int r0 = defpackage.AbstractC1347.m2514(r4, r2, r0, r1)
            int r0 = r0 + 1
            r1 = 0
            r2 = 6
            r3 = 64
            int r1 = defpackage.AbstractC1347.m2514(r4, r3, r1, r2)
            java.lang.String r4 = r4.substring(r0, r1)
            return r4
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String m1309() {
            r3 = this;
            java.lang.String r0 = r3.f2565
            int r0 = r0.length()
            int r0 = r0 + 3
            r1 = 4
            java.lang.String r3 = r3.f2561
            r2 = 47
            int r0 = defpackage.AbstractC1347.m2514(r3, r2, r0, r1)
            java.lang.String r1 = "?#"
            int r2 = r3.length()
            int r1 = defpackage.AbstractC0709.m1607(r0, r2, r3, r1)
            java.lang.String r3 = r3.substring(r0, r1)
            return r3
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.C0089 m1310() {
            r6 = this;
            ᛱᛵᛴᛲ r0 = new ᛱᛵᛴᛲ
            r0.<init>()
            java.lang.Object r1 = r0.f842
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.String r2 = r6.f2565
            r0.f846 = r2
            java.lang.String r3 = r6.m1305()
            r0.f845 = r3
            java.lang.String r3 = r6.m1308()
            r0.f844 = r3
            java.lang.String r3 = r6.f2563
            r0.f849 = r3
            java.lang.String r3 = "http"
            boolean r3 = r2.equals(r3)
            r4 = -1
            if (r3 == 0) goto L29
            r2 = 80
            goto L35
        L29:
            java.lang.String r3 = "https"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L34
            r2 = 443(0x1bb, float:6.21E-43)
            goto L35
        L34:
            r2 = r4
        L35:
            int r3 = r6.f2562
            if (r3 == r2) goto L3a
            r4 = r3
        L3a:
            r0.f848 = r4
            r1.clear()
            java.util.ArrayList r2 = r6.m1307()
            r1.addAll(r2)
            java.lang.String r1 = r6.m1306()
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L5b
            java.lang.String r4 = " \"'<>#"
            r5 = 83
            java.lang.String r1 = defpackage.AbstractC2346.m3846(r3, r3, r5, r1, r4)
            java.util.ArrayList r1 = defpackage.C0089.m564(r1)
            goto L5c
        L5b:
            r1 = r2
        L5c:
            r0.f843 = r1
            java.lang.String r1 = r6.f2568
            if (r1 != 0) goto L63
            goto L72
        L63:
            r1 = 35
            r2 = 6
            java.lang.String r6 = r6.f2561
            int r1 = defpackage.AbstractC1347.m2514(r6, r1, r3, r2)
            int r1 = r1 + 1
            java.lang.String r2 = r6.substring(r1)
        L72:
            r0.f850 = r2
            return r0
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.lang.String m1311() {
            r5 = this;
            java.lang.String r0 = "/..."
            ᛱᛵᛴᛲ r1 = new ᛱᛵᛴᛲ     // Catch: java.lang.IllegalArgumentException -> Lb
            r1.<init>()     // Catch: java.lang.IllegalArgumentException -> Lb
            r1.m566(r5, r0)     // Catch: java.lang.IllegalArgumentException -> Lb
            goto Lc
        Lb:
            r1 = 0
        Lc:
            r1.getClass()
            r5 = 0
            r0 = 123(0x7b, float:1.72E-43)
            java.lang.String r2 = ""
            java.lang.String r3 = " \"':;<=>@[]^`{}|/\\?#"
            java.lang.String r4 = defpackage.AbstractC2346.m3846(r5, r5, r0, r2, r3)
            r1.f845 = r4
            java.lang.String r5 = defpackage.AbstractC2346.m3846(r5, r5, r0, r2, r3)
            r1.f844 = r5
            ᛳᛸᛲ r5 = r1.m568()
            java.lang.String r5 = r5.f2561
            return r5
    }
}
