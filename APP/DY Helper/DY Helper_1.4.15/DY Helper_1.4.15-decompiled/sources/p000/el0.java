package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class el0 {

    /* JADX INFO: renamed from: α */
    public static final java.util.List f3589 = null;

    static {
            java.lang.String r11 = "mp4"
            java.lang.String r12 = "mov"
            java.lang.String r0 = "jpeg"
            java.lang.String r1 = "jpg"
            java.lang.String r2 = "jpe"
            java.lang.String r3 = "png"
            java.lang.String r4 = "webp"
            java.lang.String r5 = "gif"
            java.lang.String r6 = "bmp"
            java.lang.String r7 = "heic"
            java.lang.String r8 = "heif"
            java.lang.String r9 = "avif"
            java.lang.String r10 = "vvic"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            p000.el0.f3589 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final int m1928(java.lang.String r1) {
            java.lang.String r1 = m1930(r1)
            if (r1 == 0) goto L3e
            int r0 = r1.hashCode()
            switch(r0) {
                case 102340: goto L32;
                case 108273: goto L26;
                case 108308: goto L1a;
                case 3645340: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L3e
        Le:
            java.lang.String r0 = "webp"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L17
            goto L3e
        L17:
            r1 = 95
            return r1
        L1a:
            java.lang.String r0 = "mov"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L23
            goto L3e
        L23:
            r1 = 85
            return r1
        L26:
            java.lang.String r0 = "mp4"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L2f
            goto L3e
        L2f:
            r1 = 90
            return r1
        L32:
            java.lang.String r0 = "gif"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L3b
            goto L3e
        L3b:
            r1 = 100
            return r1
        L3e:
            r1 = 50
            return r1
    }

    /* JADX INFO: renamed from: β */
    public static final int m1929(java.lang.String r1) {
            java.lang.String r1 = m1930(r1)
            if (r1 == 0) goto L6e
            int r0 = r1.hashCode()
            switch(r0) {
                case 97669: goto L62;
                case 105441: goto L56;
                case 111145: goto L4a;
                case 3006482: goto L3e;
                case 3198679: goto L35;
                case 3198682: goto L2c;
                case 3268712: goto L23;
                case 3632090: goto L1a;
                case 3645340: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L6e
        Le:
            java.lang.String r0 = "webp"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L17
            goto L6e
        L17:
            r1 = 90
            return r1
        L1a:
            java.lang.String r0 = "vvic"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L47
            goto L6e
        L23:
            java.lang.String r0 = "jpeg"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L5f
            goto L6e
        L2c:
            java.lang.String r0 = "heif"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L47
            goto L6e
        L35:
            java.lang.String r0 = "heic"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L47
            goto L6e
        L3e:
            java.lang.String r0 = "avif"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L47
            goto L6e
        L47:
            r1 = 10
            return r1
        L4a:
            java.lang.String r0 = "png"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L53
            goto L6e
        L53:
            r1 = 95
            return r1
        L56:
            java.lang.String r0 = "jpg"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L5f
            goto L6e
        L5f:
            r1 = 100
            return r1
        L62:
            java.lang.String r0 = "bmp"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L6b
            goto L6e
        L6b:
            r1 = 75
            return r1
        L6e:
            r1 = 60
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public static java.lang.String m1930(java.lang.String r10) {
            r10.getClass()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r10 = r10.toLowerCase(r0)
            r10.getClass()
            java.lang.String r0 = "%2f"
            java.lang.String r1 = "/"
            java.lang.String r10 = p000.x02.m6483(r10, r0, r1)
            java.lang.String r0 = "%3a"
            java.lang.String r1 = ":"
            java.lang.String r10 = p000.x02.m6483(r10, r0, r1)
            java.lang.String r0 = "%3d"
            java.lang.String r1 = "="
            java.lang.String r10 = p000.x02.m6483(r10, r0, r1)
            java.lang.String r0 = "%26"
            java.lang.String r1 = "&"
            java.lang.String r10 = p000.x02.m6483(r10, r0, r1)
            java.lang.String r0 = "%2c"
            java.lang.String r2 = ","
            java.lang.String r10 = p000.x02.m6483(r10, r0, r2)
            java.util.List r0 = p000.el0.f3589
            java.util.Iterator r2 = r0.iterator()
        L3a:
            boolean r3 = r2.hasNext()
            java.lang.String r4 = "jpeg"
            java.lang.String r5 = "jpe"
            r6 = 0
            if (r3 == 0) goto Lf4
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r5 = p000.ln0.m3626(r3, r5)
            if (r5 == 0) goto L52
            goto L53
        L52:
            r4 = r3
        L53:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "format="
            r5.<init>(r7)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            boolean r5 = p000.q02.m4654(r10, r5, r6)
            if (r5 != 0) goto Lf3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "format,"
            r5.<init>(r7)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            boolean r5 = p000.q02.m4654(r10, r5, r6)
            if (r5 != 0) goto Lf3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "image_format="
            r5.<init>(r7)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            boolean r5 = p000.q02.m4654(r10, r5, r6)
            if (r5 != 0) goto Lf3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "image_type="
            r5.<init>(r7)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            boolean r5 = p000.q02.m4654(r10, r5, r6)
            if (r5 != 0) goto Lf3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "mime=image/"
            r5.<init>(r7)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            boolean r5 = p000.q02.m4654(r10, r5, r6)
            if (r5 != 0) goto Lf3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "mime_type=image/"
            r5.<init>(r7)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            boolean r5 = p000.q02.m4654(r10, r5, r6)
            if (r5 != 0) goto Lf3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "mime=video/"
            r5.<init>(r7)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            boolean r5 = p000.q02.m4654(r10, r5, r6)
            if (r5 != 0) goto Lf3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "mime_type=video/"
            r5.<init>(r7)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            boolean r3 = p000.q02.m4654(r10, r3, r6)
            if (r3 == 0) goto L3a
        Lf3:
            return r4
        Lf4:
            r2 = 63
            java.lang.String r2 = p000.q02.m4689(r10, r2, r10)
            r3 = 35
            java.lang.String r2 = p000.q02.m4689(r2, r3, r2)
            java.util.Iterator r3 = r0.iterator()
        L104:
            boolean r7 = r3.hasNext()
            java.lang.String r8 = "."
            if (r7 == 0) goto L12c
            java.lang.Object r7 = r3.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r8)
            r9.append(r7)
            java.lang.String r8 = r9.toString()
            boolean r8 = p000.x02.m6479(r2, r8, r6)
            if (r8 == 0) goto L104
            boolean r10 = p000.ln0.m3626(r7, r5)
            if (r10 == 0) goto L12b
            return r4
        L12b:
            return r7
        L12c:
            java.util.Iterator r0 = r0.iterator()
        L130:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L189
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = p000.ln0.m3626(r2, r5)
            if (r3 == 0) goto L144
            r3 = r4
            goto L145
        L144:
            r3 = r2
        L145:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r8)
            r7.append(r2)
            java.lang.String r9 = "?"
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            boolean r7 = p000.q02.m4654(r10, r7, r6)
            if (r7 != 0) goto L188
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r8)
            r7.append(r2)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            boolean r7 = p000.q02.m4654(r10, r7, r6)
            if (r7 != 0) goto L188
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r8)
            r7.append(r2)
            java.lang.String r2 = "#"
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            boolean r2 = p000.q02.m4654(r10, r2, r6)
            if (r2 == 0) goto L130
        L188:
            return r3
        L189:
            r10 = 0
            return r10
    }

    /* JADX INFO: renamed from: δ */
    public static boolean m1931(java.lang.String r2) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r0)
            r2.getClass()
            java.lang.String r0 = "animated"
            r1 = 0
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L5c
            java.lang.String r0 = "animate"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L5c
            java.lang.String r0 = "animation"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L5c
            java.lang.String r0 = "dynamic"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L5c
            java.lang.String r0 = "motion"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L5c
            java.lang.String r0 = "live_photo"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L5c
            java.lang.String r0 = "livephoto"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L5c
            java.lang.String r0 = "gif"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L5c
            java.lang.String r0 = "aweme_live"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L5c
            java.lang.String r0 = "image_type=animated"
            boolean r2 = p000.q02.m4654(r2, r0, r1)
            if (r2 == 0) goto L5b
            goto L5c
        L5b:
            return r1
        L5c:
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: ε */
    public static boolean m1932(java.lang.String r3) {
            r3.getClass()
            java.lang.String r0 = m1930(r3)
            r1 = 0
            if (r0 == 0) goto L84
            int r2 = r0.hashCode()
            switch(r2) {
                case 97669: goto L7c;
                case 102340: goto L73;
                case 105441: goto L6a;
                case 108273: goto L61;
                case 108308: goto L58;
                case 111145: goto L4f;
                case 3006482: goto L46;
                case 3198679: goto L3d;
                case 3198682: goto L34;
                case 3268712: goto L2b;
                case 3632090: goto L22;
                case 3645340: goto L13;
                default: goto L11;
            }
        L11:
            goto L84
        L13:
            java.lang.String r2 = "webp"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L1d
            goto L84
        L1d:
            boolean r3 = m1931(r3)
            return r3
        L22:
            java.lang.String r2 = "vvic"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lc4
            goto L84
        L2b:
            java.lang.String r2 = "jpeg"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lc4
            goto L84
        L34:
            java.lang.String r2 = "heif"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lc4
            goto L84
        L3d:
            java.lang.String r2 = "heic"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lc4
            goto L84
        L46:
            java.lang.String r2 = "avif"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lc4
            goto L84
        L4f:
            java.lang.String r2 = "png"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lc4
            goto L84
        L58:
            java.lang.String r2 = "mov"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lc5
            goto L84
        L61:
            java.lang.String r2 = "mp4"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lc5
            goto L84
        L6a:
            java.lang.String r2 = "jpg"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lc4
            goto L84
        L73:
            java.lang.String r2 = "gif"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lc5
            goto L84
        L7c:
            java.lang.String r2 = "bmp"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lc4
        L84:
            boolean r0 = m1931(r3)
            if (r0 != 0) goto Lc5
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r0)
            r3.getClass()
            java.lang.String r0 = ".mp4"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 != 0) goto Lc5
            java.lang.String r0 = ".mov"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 != 0) goto Lc5
            java.lang.String r0 = "mime=video/"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 != 0) goto Lc5
            java.lang.String r0 = "video"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 != 0) goto Lc5
            java.lang.String r0 = "format=mp4"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 != 0) goto Lc5
            java.lang.String r0 = "format=mov"
            boolean r3 = p000.q02.m4654(r3, r0, r1)
            if (r3 == 0) goto Lc4
            goto Lc5
        Lc4:
            return r1
        Lc5:
            r3 = 1
            return r3
    }

    /* JADX INFO: renamed from: ζ */
    public static java.lang.String m1933(java.util.ArrayList r5, boolean r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        Lf:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            goto Lf
        L27:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r0 = r0.iterator()
        L30:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "http"
            r4 = 1
            boolean r2 = p000.x02.m6485(r2, r3, r4)
            if (r2 == 0) goto L30
            r5.add(r1)
            goto L30
        L4a:
            java.util.Set r5 = p000.AbstractC0984xh.m6670(r5)
            java.util.List r5 = p000.AbstractC0984xh.m6666(r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L5b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto Ld8
            java.lang.Object r1 = r5.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = m1932(r2)
            if (r3 != 0) goto Ld4
            if (r6 == 0) goto L5b
            java.lang.String r2 = m1930(r2)
            if (r2 == 0) goto Ld4
            int r3 = r2.hashCode()
            switch(r3) {
                case 97669: goto Lcc;
                case 102340: goto Lc9;
                case 105441: goto Lc0;
                case 108273: goto Lbd;
                case 108308: goto Lba;
                case 111145: goto Lb1;
                case 3006482: goto La8;
                case 3198679: goto L9f;
                case 3198682: goto L96;
                case 3268712: goto L8d;
                case 3632090: goto L84;
                case 3645340: goto L7e;
                default: goto L7d;
            }
        L7d:
            goto Ld4
        L7e:
            java.lang.String r3 = "webp"
        L80:
            r2.equals(r3)
            goto Ld4
        L84:
            java.lang.String r3 = "vvic"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L5b
            goto Ld4
        L8d:
            java.lang.String r3 = "jpeg"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L5b
            goto Ld4
        L96:
            java.lang.String r3 = "heif"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L5b
            goto Ld4
        L9f:
            java.lang.String r3 = "heic"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L5b
            goto Ld4
        La8:
            java.lang.String r3 = "avif"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L5b
            goto Ld4
        Lb1:
            java.lang.String r3 = "png"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L5b
            goto Ld4
        Lba:
            java.lang.String r3 = "mov"
            goto L80
        Lbd:
            java.lang.String r3 = "mp4"
            goto L80
        Lc0:
            java.lang.String r3 = "jpg"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L5b
            goto Ld4
        Lc9:
            java.lang.String r3 = "gif"
            goto L80
        Lcc:
            java.lang.String r3 = "bmp"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L5b
        Ld4:
            r0.add(r1)
            goto L5b
        Ld8:
            e7 r5 = new e7
            bi r6 = new bi
            r1 = 0
            r6.<init>(r1, r0)
            r0 = 1
            r5.<init>(r0, r6)
            uh0 r6 = new uh0
            r0 = 9
            r6.<init>(r0)
            ye r0 = new ye
            r1 = 17
            r0.<init>(r1, r6)
            java.lang.Object r5 = p000.AbstractC0984xh.m6648(r5, r0)
            ql0 r5 = (p000.ql0) r5
            if (r5 == 0) goto Lff
            java.lang.Object r5 = r5.f9046
            java.lang.String r5 = (java.lang.String) r5
            return r5
        Lff:
            r5 = 0
            return r5
    }

    /* JADX INFO: renamed from: η */
    public static java.lang.String m1934(java.util.AbstractCollection r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        Lf:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            goto Lf
        L27:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r0 = r0.iterator()
        L30:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "http"
            r4 = 1
            boolean r2 = p000.x02.m6485(r2, r3, r4)
            if (r2 == 0) goto L30
            r5.add(r1)
            goto L30
        L4a:
            java.util.Set r5 = p000.AbstractC0984xh.m6670(r5)
            java.util.List r5 = p000.AbstractC0984xh.m6666(r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L5b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L72
            java.lang.Object r1 = r5.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = m1932(r2)
            if (r2 != 0) goto L5b
            r0.add(r1)
            goto L5b
        L72:
            e7 r5 = new e7
            bi r1 = new bi
            r2 = 0
            r1.<init>(r2, r0)
            r0 = 1
            r5.<init>(r0, r1)
            uh0 r0 = new uh0
            r1 = 10
            r0.<init>(r1)
            ye r1 = new ye
            r2 = 18
            r1.<init>(r2, r0)
            java.lang.Object r5 = p000.AbstractC0984xh.m6648(r5, r1)
            ql0 r5 = (p000.ql0) r5
            if (r5 == 0) goto L99
            java.lang.Object r5 = r5.f9046
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L99:
            r5 = 0
            return r5
    }
}
