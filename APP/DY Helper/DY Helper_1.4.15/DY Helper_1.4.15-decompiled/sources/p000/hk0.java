package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class hk0 {

    /* JADX INFO: renamed from: α */
    public static final p000.ym1 f4753 = null;

    static {
            ym1 r0 = new ym1
            java.lang.String r1 = "^#[0-9A-Fa-f]{6}$"
            r0.<init>(r1)
            p000.hk0.f4753 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static boolean m2513(java.lang.String r4, java.util.Locale r5) {
            r4.getClass()
            java.lang.CharSequence r4 = p000.q02.m4660(r4)
            java.lang.String r4 = r4.toString()
            int r0 = r4.length()
            r1 = 0
            if (r0 != 0) goto L13
            goto L49
        L13:
            int r0 = r4.length()
            r2 = 50
            if (r0 > r2) goto L49
            r0 = r1
        L1c:
            int r2 = r4.length()
            if (r0 >= r2) goto L38
            char r2 = r4.charAt(r0)
            boolean r3 = java.lang.Character.isISOControl(r2)
            if (r3 != 0) goto L49
            r3 = 8232(0x2028, float:1.1535E-41)
            if (r2 == r3) goto L49
            r3 = 8233(0x2029, float:1.1537E-41)
            if (r2 != r3) goto L35
            goto L49
        L35:
            int r0 = r0 + 1
            goto L1c
        L38:
            java.time.format.DateTimeFormatter r4 = java.time.format.DateTimeFormatter.ofPattern(r4, r5)     // Catch: java.lang.Throwable -> L3d
            goto L44
        L3d:
            r4 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r4)
            r4 = r5
        L44:
            boolean r4 = r4 instanceof p000.eo1
            r4 = r4 ^ 1
            return r4
        L49:
            return r1
    }

    /* JADX INFO: renamed from: β */
    public static boolean m2514(java.lang.String r3) {
            java.lang.String r3 = m2518(r3)
            java.lang.CharSequence r3 = p000.q02.m4660(r3)
            java.lang.String r3 = r3.toString()
            int r0 = r3.length()
            r1 = 0
            if (r0 != 0) goto L14
            goto L3e
        L14:
            int r0 = r3.length()
            int r0 = r3.codePointCount(r1, r0)
            r2 = 80
            if (r0 > r2) goto L3e
            es0 r0 = new es0
            r0.<init>(r3)
            r3 = r1
        L26:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L39
            r0.next()
            int r3 = r3 + 1
            if (r3 < 0) goto L34
            goto L26
        L34:
            p000.AbstractC1021yh.m6916()
            r3 = 0
            throw r3
        L39:
            r0 = 4
            if (r3 > r0) goto L3e
            r3 = 1
            return r3
        L3e:
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public static java.lang.String m2515(java.lang.String r3, java.lang.String r4) {
            java.lang.CharSequence r4 = p000.q02.m4660(r4)
            java.lang.String r4 = r4.toString()
            ym1 r0 = p000.hk0.f4753
            boolean r1 = r0.m6942(r4)
            r2 = 0
            if (r1 == 0) goto L12
            goto L13
        L12:
            r4 = r2
        L13:
            if (r4 != 0) goto L17
            java.lang.String r4 = "#000000"
        L17:
            java.lang.CharSequence r3 = p000.q02.m4660(r3)
            java.lang.String r3 = r3.toString()
            boolean r0 = r0.m6942(r3)
            if (r0 == 0) goto L26
            r2 = r3
        L26:
            if (r2 == 0) goto L35
            java.util.Locale r3 = java.util.Locale.ROOT
            r3.getClass()
            java.lang.String r3 = r2.toUpperCase(r3)
            r3.getClass()
            return r3
        L35:
            java.util.Locale r3 = java.util.Locale.ROOT
            r3.getClass()
            java.lang.String r3 = r4.toUpperCase(r3)
            r3.getClass()
            return r3
    }

    /* JADX INFO: renamed from: δ */
    public static java.lang.String m2516(java.lang.String r1) {
            java.util.Locale r0 = java.util.Locale.getDefault()
            r0.getClass()
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            boolean r0 = m2513(r1, r0)
            if (r0 == 0) goto L16
            goto L17
        L16:
            r1 = 0
        L17:
            if (r1 != 0) goto L1b
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss"
        L1b:
            return r1
    }

    /* JADX INFO: renamed from: ε */
    public static java.lang.String m2517(java.lang.String r3) {
            java.lang.String r3 = m2518(r3)
            java.lang.CharSequence r3 = p000.q02.m4660(r3)
            java.lang.String r3 = r3.toString()
            r3.getClass()
            f7 r0 = new f7
            r1 = 5
            r0.<init>(r1, r3)
            r3 = 4
            ss1 r3 = p000.us1.m5947(r0, r3)
            r0 = 0
            r1 = 62
            java.lang.String r2 = "\n"
            java.lang.String r3 = p000.us1.m5955(r3, r2, r0, r1)
            int r0 = r3.length()
            r1 = 0
            int r0 = r3.codePointCount(r1, r0)
            r2 = 80
            if (r0 > r2) goto L31
            goto L39
        L31:
            int r0 = r3.offsetByCodePoints(r1, r2)
            java.lang.String r3 = r3.substring(r1, r0)
        L39:
            java.lang.CharSequence r3 = p000.q02.m4662(r3)
            java.lang.String r3 = r3.toString()
            boolean r0 = p000.q02.m4671(r3)
            if (r0 == 0) goto L49
            java.lang.String r3 = "{time}"
        L49:
            return r3
    }

    /* JADX INFO: renamed from: ζ */
    public static java.lang.String m2518(java.lang.String r5) {
            java.lang.String r0 = "\r\n"
            java.lang.String r1 = "\n"
            java.lang.String r5 = p000.x02.m6483(r5, r0, r1)
            r0 = 13
            r1 = 10
            java.lang.String r5 = r5.replace(r0, r1)
            r5.getClass()
            int r0 = r5.length()
            r2 = 80
            if (r0 <= r2) goto L1c
            r0 = r2
        L1c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r0 = 0
        L22:
            int r3 = r5.length()
            if (r0 >= r3) goto L51
            char r3 = r5.charAt(r0)
            if (r3 == r1) goto L4b
            r4 = 8232(0x2028, float:1.1535E-41)
            if (r3 == r4) goto L4b
            r4 = 8233(0x2029, float:1.1537E-41)
            if (r3 != r4) goto L37
            goto L4b
        L37:
            r4 = 9
            if (r3 != r4) goto L41
            r3 = 32
            r2.append(r3)
            goto L4e
        L41:
            boolean r4 = java.lang.Character.isISOControl(r3)
            if (r4 != 0) goto L4e
            r2.append(r3)
            goto L4e
        L4b:
            r2.append(r1)
        L4e:
            int r0 = r0 + 1
            goto L22
        L51:
            java.lang.String r5 = r2.toString()
            return r5
    }
}
