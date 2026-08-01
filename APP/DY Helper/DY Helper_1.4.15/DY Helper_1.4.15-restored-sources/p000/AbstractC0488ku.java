package p000;

/* JADX INFO: renamed from: ku */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0488ku {

    /* JADX INFO: renamed from: α */
    public static final java.util.Set f6117 = null;

    static {
            java.lang.String r17 = "wav"
            java.lang.String r18 = "flac"
            java.lang.String r1 = "mp4"
            java.lang.String r2 = "mov"
            java.lang.String r3 = "mkv"
            java.lang.String r4 = "webm"
            java.lang.String r5 = "jpg"
            java.lang.String r6 = "jpeg"
            java.lang.String r7 = "png"
            java.lang.String r8 = "webp"
            java.lang.String r9 = "gif"
            java.lang.String r10 = "avif"
            java.lang.String r11 = "heic"
            java.lang.String r12 = "heif"
            java.lang.String r13 = "mp3"
            java.lang.String r14 = "aac"
            java.lang.String r15 = "m4a"
            java.lang.String r16 = "ogg"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18}
            java.util.Set r0 = p000.AbstractC0312g7.m2263(r0)
            p000.AbstractC0488ku.f6117 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.lang.String m3414(p000.C0276f8 r6, java.lang.String r7, int r8) {
            r6.getClass()
            java.lang.CharSequence r7 = p000.q02.m4660(r7)
            java.lang.String r7 = r7.toString()
            r0 = 1
            char[] r1 = new char[r0]
            r2 = 46
            r3 = 0
            r1[r3] = r2
            java.lang.String r7 = p000.q02.m4664(r7, r1)
            boolean r1 = p000.q02.m4671(r7)
            if (r1 == 0) goto L1f
            java.lang.String r7 = "dat"
        L1f:
            java.lang.String r1 = m3420()
            java.lang.String r2 = r6.f3793
            r3 = 20
            java.lang.String r2 = m3419(r2, r3)
            java.lang.String r3 = r6.f3794
            r4 = 30
            java.lang.String r3 = m3419(r3, r4)
            java.lang.String r6 = r6.f3800
            if (r6 != 0) goto L39
            java.lang.String r6 = "unknown"
        L39:
            java.lang.String r4 = "."
            java.lang.String r5 = "_"
            if (r8 == 0) goto L9b
            if (r8 == r0) goto L92
            r0 = 2
            if (r8 == r0) goto L79
            r0 = 3
            if (r8 == r0) goto L60
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            r6.append(r5)
            r6.append(r1)
            r6.append(r4)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            return r6
        L60:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            r8.append(r5)
            r8.append(r6)
            r8.append(r4)
            r8.append(r7)
            java.lang.String r6 = r8.toString()
            return r6
        L79:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            r8.append(r5)
            r8.append(r1)
            r8.append(r4)
            r8.append(r7)
            java.lang.String r6 = r8.toString()
            return r6
        L92:
            java.lang.StringBuilder r6 = p000.AbstractC0602nx.m4138(r2, r5, r3, r5, r1)
            java.lang.String r6 = p000.lz1.m3691(r6, r4, r7)
            return r6
        L9b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            r6.append(r5)
            r6.append(r1)
            r6.append(r4)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            return r6
    }

    /* JADX INFO: renamed from: β */
    public static java.lang.String m3415(java.lang.String r6, java.lang.String r7) {
            java.lang.String r7 = m3418(r7)
            r0 = 0
            if (r6 == 0) goto L10
            java.lang.CharSequence r6 = p000.q02.m4660(r6)
            java.lang.String r6 = r6.toString()
            goto L11
        L10:
            r6 = r0
        L11:
            java.lang.String r1 = ""
            if (r6 != 0) goto L16
            r6 = r1
        L16:
            boolean r2 = p000.q02.m4671(r6)
            if (r2 == 0) goto L1d
            return r7
        L1d:
            java.lang.String r6 = m3418(r6)
            r2 = 46
            java.lang.String r7 = p000.q02.m4687(r7, r2, r1)
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r7 = p000.AbstractC0602nx.m4134(r3, r7, r3)
            java.util.Set r4 = p000.AbstractC0488ku.f6117
            boolean r5 = r4.contains(r7)
            if (r5 == 0) goto L36
            r0 = r7
        L36:
            if (r0 != 0) goto L39
            goto L4a
        L39:
            java.lang.String r7 = p000.q02.m4687(r6, r2, r1)
            java.lang.String r7 = r7.toLowerCase(r3)
            r7.getClass()
            boolean r1 = r7.equals(r0)
            if (r1 == 0) goto L4b
        L4a:
            return r6
        L4b:
            boolean r7 = r4.contains(r7)
            java.lang.String r1 = "."
            if (r7 == 0) goto L5c
            java.lang.String r6 = p000.q02.m4691(r6, r6)
            java.lang.String r6 = p000.lz1.m3688(r6, r1, r0)
            return r6
        L5c:
            java.lang.String r6 = p000.lz1.m3688(r6, r1, r0)
            return r6
    }

    /* JADX INFO: renamed from: γ */
    public static java.lang.String m3416(java.lang.String r3) {
            r3.getClass()
            java.lang.CharSequence r3 = p000.q02.m4660(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "[\\\\/:*?\"<>|]+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            r3.getClass()
            java.util.regex.Matcher r3 = r0.matcher(r3)
            java.lang.String r0 = "_"
            java.lang.String r3 = r3.replaceAll(r0)
            r3.getClass()
            java.lang.String r1 = "\\s+"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            r1.getClass()
            java.util.regex.Matcher r3 = r1.matcher(r3)
            java.lang.String r3 = r3.replaceAll(r0)
            r3.getClass()
            r0 = 1
            char[] r0 = new char[r0]
            r1 = 95
            r2 = 0
            r0[r2] = r1
            java.lang.String r3 = p000.q02.m4661(r3, r0)
            return r3
    }

    /* JADX INFO: renamed from: δ */
    public static java.lang.String m3417(java.lang.String r3) {
            r3.getClass()
            java.lang.String r0 = "[\\\\/:*?\"<>|\\s]+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            java.lang.String r1 = "_"
            java.util.regex.Matcher r3 = r0.matcher(r3)
            java.lang.String r3 = r3.replaceAll(r1)
            r3.getClass()
            r0 = 1
            char[] r0 = new char[r0]
            r1 = 95
            r2 = 0
            r0[r2] = r1
            java.lang.String r3 = p000.q02.m4661(r3, r0)
            return r3
    }

    /* JADX INFO: renamed from: ε */
    public static java.lang.String m3418(java.lang.String r3) {
            r3.getClass()
            java.lang.CharSequence r3 = p000.q02.m4660(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "[\\\\/:*?\"<>|\\s]+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            r3.getClass()
            java.util.regex.Matcher r3 = r0.matcher(r3)
            java.lang.String r0 = "_"
            java.lang.String r3 = r3.replaceAll(r0)
            r3.getClass()
            r0 = 1
            char[] r0 = new char[r0]
            r1 = 95
            r2 = 0
            r0[r2] = r1
            java.lang.String r3 = p000.q02.m4661(r3, r0)
            boolean r0 = p000.q02.m4671(r3)
            if (r0 == 0) goto L40
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = "dyhelper_"
            java.lang.String r3 = p000.AbstractC0602nx.m4126(r0, r3)
        L40:
            return r3
    }

    /* JADX INFO: renamed from: ζ */
    public static java.lang.String m3419(java.lang.String r1, int r2) {
            java.lang.String r0 = "[^\\w\\u4e00-\\u9fff]"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            r1.getClass()
            java.util.regex.Matcher r1 = r0.matcher(r1)
            java.lang.String r0 = "_"
            java.lang.String r1 = r1.replaceAll(r0)
            r1.getClass()
            java.lang.String r1 = p000.q02.m4693(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: η */
    public static java.lang.String m3420() {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyyMMdd_HHmmss"
            java.util.Locale r2 = java.util.Locale.getDefault()
            r0.<init>(r1, r2)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.lang.String r0 = r0.format(r1)
            r0.getClass()
            return r0
    }
}
