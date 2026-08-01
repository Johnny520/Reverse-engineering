package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class pu0 {

    /* JADX INFO: renamed from: α */
    public static final p000.pu0 f8717 = null;

    /* JADX INFO: renamed from: β */
    public static volatile boolean f8718;

    static {
            pu0 r0 = new pu0
            r0.<init>()
            p000.pu0.f8717 = r0
            return
    }

    /* JADX INFO: renamed from: Α */
    public static final void m4595(java.util.HashSet r1, java.util.ArrayList r2, java.lang.Object r3) {
            if (r3 != 0) goto L3
            goto L1b
        L3:
            boolean r0 = m4605(r3)
            if (r0 != 0) goto La
            goto L1b
        La:
            int r0 = java.lang.System.identityHashCode(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.add(r0)
            if (r1 == 0) goto L1b
            r2.add(r3)
        L1b:
            return
    }

    /* JADX INFO: renamed from: Β */
    public static int m4596(java.lang.String r3) {
            r3.getClass()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r0)
            r3.getClass()
            java.lang.String r0 = "tplv-dy-kuchen-v1-water"
            r1 = 0
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 == 0) goto L18
            r0 = 800(0x320, float:1.121E-42)
            goto L19
        L18:
            r0 = r1
        L19:
            java.lang.String r2 = "water:"
            boolean r2 = p000.q02.m4654(r3, r2, r1)
            if (r2 == 0) goto L23
            int r0 = r0 + 500
        L23:
            java.lang.String r2 = "watermark"
            boolean r2 = p000.q02.m4654(r3, r2, r1)
            if (r2 == 0) goto L2d
            int r0 = r0 + 500
        L2d:
            java.lang.String r2 = "water_mark"
            boolean r2 = p000.q02.m4654(r3, r2, r1)
            if (r2 == 0) goto L37
            int r0 = r0 + 500
        L37:
            java.lang.String r2 = "/water/"
            boolean r2 = p000.q02.m4654(r3, r2, r1)
            if (r2 == 0) goto L41
            int r0 = r0 + 300
        L41:
            java.lang.String r2 = "logo"
            boolean r3 = p000.q02.m4654(r3, r2, r1)
            if (r3 == 0) goto L4b
            int r0 = r0 + 200
        L4b:
            return r0
    }

    /* JADX INFO: renamed from: Γ */
    public static boolean m4597(java.lang.String r2) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r0)
            r2.getClass()
            java.lang.String r0 = "bytevc1"
            r1 = 0
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L3c
            java.lang.String r0 = "bytevc2"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L3c
            java.lang.String r0 = "bytevc"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L3c
            java.lang.String r0 = "h265"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L3c
            java.lang.String r0 = "hevc"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L3c
            java.lang.String r0 = "hvc1"
            boolean r2 = p000.q02.m4654(r2, r0, r1)
            if (r2 == 0) goto L3b
            goto L3c
        L3b:
            return r1
        L3c:
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: Δ */
    public static boolean m4598(java.lang.String r2) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r0)
            r2.getClass()
            java.lang.String r0 = ".m3u8"
            r1 = 0
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L3c
            java.lang.String r0 = "m3u8"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L3c
            java.lang.String r0 = ".mpd"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L3c
            java.lang.String r0 = "mpegurl"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L3c
            java.lang.String r0 = "dash"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L3c
            java.lang.String r0 = ".m4s"
            boolean r2 = p000.q02.m4654(r2, r0, r1)
            if (r2 == 0) goto L3b
            goto L3c
        L3b:
            return r1
        L3c:
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: Ε */
    public static boolean m4599(java.lang.String r2) {
            java.lang.String r0 = "http://"
            r1 = 1
            boolean r0 = p000.x02.m6485(r2, r0, r1)
            if (r0 != 0) goto L14
            java.lang.String r0 = "https://"
            boolean r2 = p000.x02.m6485(r2, r0, r1)
            if (r2 == 0) goto L12
            goto L14
        L12:
            r2 = 0
            return r2
        L14:
            return r1
    }

    /* JADX INFO: renamed from: Ζ */
    public static boolean m4600(java.lang.String r3) {
            java.lang.CharSequence r3 = p000.q02.m4660(r3)
            java.lang.String r3 = r3.toString()
            int r0 = r3.length()
            r1 = 5
            r2 = 0
            if (r0 < r1) goto L27
            r0 = r2
        L11:
            int r1 = r3.length()
            if (r0 >= r1) goto L25
            char r1 = r3.charAt(r0)
            boolean r1 = java.lang.Character.isDigit(r1)
            if (r1 != 0) goto L22
            goto L27
        L22:
            int r0 = r0 + 1
            goto L11
        L25:
            r3 = 1
            return r3
        L27:
            return r2
    }

    /* JADX INFO: renamed from: Η */
    public static boolean m4601(java.lang.String r1) {
            r1.getClass()
            int r1 = m4610(r1)
            r0 = 100
            if (r1 < r0) goto Ld
            r1 = 1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: Θ */
    public static void m4602(java.lang.String r1) {
            java.lang.String r0 = "DYHelper: [LivePhoto] "
            java.lang.String r0 = r0.concat(r1)
            p000.C0888ux.m5985(r0)
            java.lang.String r0 = "DYHelper_LivePhoto"
            android.util.Log.d(r0, r1)
            return
    }

    /* JADX INFO: renamed from: Ι */
    public static boolean m4603(java.lang.String r3) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r3.toLowerCase(r0)
            r1.getClass()
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L1d
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = r2.getHost()     // Catch: java.lang.Throwable -> L1d
            r3.getClass()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = r3.toLowerCase(r0)     // Catch: java.lang.Throwable -> L1d
            r3.getClass()     // Catch: java.lang.Throwable -> L1d
            goto L24
        L1d:
            r3 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r3)
            r3 = r0
        L24:
            boolean r0 = r3 instanceof p000.eo1
            if (r0 == 0) goto L2a
            java.lang.String r3 = ""
        L2a:
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r0 = "music"
            r2 = 0
            boolean r0 = p000.q02.m4654(r3, r0, r2)
            if (r0 != 0) goto L9d
            java.lang.String r0 = "audio"
            boolean r3 = p000.q02.m4654(r3, r0, r2)
            if (r3 != 0) goto L9d
            java.lang.String r3 = "/music/"
            boolean r3 = p000.q02.m4654(r1, r3, r2)
            if (r3 != 0) goto L9d
            java.lang.String r3 = "/audio/"
            boolean r3 = p000.q02.m4654(r1, r3, r2)
            if (r3 != 0) goto L9d
            java.lang.String r3 = "mime=audio"
            boolean r3 = p000.q02.m4654(r1, r3, r2)
            if (r3 != 0) goto L9d
            java.lang.String r3 = "mime_type=audio"
            boolean r3 = p000.q02.m4654(r1, r3, r2)
            if (r3 != 0) goto L9d
            java.lang.String r3 = "audio/mpeg"
            boolean r3 = p000.q02.m4654(r1, r3, r2)
            if (r3 != 0) goto L9d
            java.lang.String r3 = "audio_mp4"
            boolean r3 = p000.q02.m4654(r1, r3, r2)
            if (r3 != 0) goto L9d
            java.lang.String r3 = ".mp3"
            boolean r3 = p000.q02.m4654(r1, r3, r2)
            if (r3 != 0) goto L9d
            java.lang.String r3 = ".m4a"
            boolean r3 = p000.q02.m4654(r1, r3, r2)
            if (r3 != 0) goto L9d
            java.lang.String r3 = ".aac"
            boolean r3 = p000.q02.m4654(r1, r3, r2)
            if (r3 != 0) goto L9d
            java.lang.String r3 = ".ogg"
            boolean r3 = p000.q02.m4654(r1, r3, r2)
            if (r3 != 0) goto L9d
            java.lang.String r3 = ".wav"
            boolean r3 = p000.q02.m4654(r1, r3, r2)
            if (r3 != 0) goto L9d
            java.lang.String r3 = ".flac"
            boolean r3 = p000.q02.m4654(r1, r3, r2)
            if (r3 == 0) goto L9e
        L9d:
            r2 = 1
        L9e:
            return r2
    }

    /* JADX INFO: renamed from: Κ */
    public static boolean m4604(java.lang.String r2) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r2.toLowerCase(r0)
            r0.getClass()
            boolean r2 = m4606(r2)
            r1 = 0
            if (r2 == 0) goto L11
            goto L6a
        L11:
            java.lang.String r2 = ".jpg"
            boolean r2 = p000.q02.m4654(r0, r2, r1)
            if (r2 != 0) goto L6b
            java.lang.String r2 = ".jpeg"
            boolean r2 = p000.q02.m4654(r0, r2, r1)
            if (r2 != 0) goto L6b
            java.lang.String r2 = ".png"
            boolean r2 = p000.q02.m4654(r0, r2, r1)
            if (r2 != 0) goto L6b
            java.lang.String r2 = ".webp"
            boolean r2 = p000.q02.m4654(r0, r2, r1)
            if (r2 != 0) goto L6b
            java.lang.String r2 = ".heic"
            boolean r2 = p000.q02.m4654(r0, r2, r1)
            if (r2 != 0) goto L6b
            java.lang.String r2 = ".heif"
            boolean r2 = p000.q02.m4654(r0, r2, r1)
            if (r2 != 0) goto L6b
            java.lang.String r2 = "mime_type=image"
            boolean r2 = p000.q02.m4654(r0, r2, r1)
            if (r2 != 0) goto L6b
            java.lang.String r2 = "image_type=image"
            boolean r2 = p000.q02.m4654(r0, r2, r1)
            if (r2 != 0) goto L6b
            java.lang.String r2 = "image/"
            boolean r2 = p000.q02.m4654(r0, r2, r1)
            if (r2 != 0) goto L6b
            java.lang.String r2 = "tplv-dy-kuchen"
            boolean r2 = p000.q02.m4654(r0, r2, r1)
            if (r2 != 0) goto L6b
            java.lang.String r2 = "tplv-dy-aweme-images"
            boolean r2 = p000.q02.m4654(r0, r2, r1)
            if (r2 == 0) goto L6a
            goto L6b
        L6a:
            return r1
        L6b:
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: Λ */
    public static boolean m4605(java.lang.Object r4) {
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            r0.getClass()
            java.lang.String r1 = "imageurlstruct"
            r2 = 0
            boolean r1 = p000.q02.m4654(r0, r1, r2)
            r3 = 1
            if (r1 == 0) goto L1c
            goto L41
        L1c:
            java.lang.String r1 = "image"
            boolean r0 = p000.q02.m4654(r0, r1, r2)
            if (r0 == 0) goto L33
            java.lang.String r0 = "urlList"
            java.lang.String r1 = "_urlList"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.lang.Object r0 = m4631(r4, r0)
            if (r0 == 0) goto L33
            goto L41
        L33:
            java.lang.String r0 = "downloadUrlList"
            java.lang.String r1 = "_downloadUrlList"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.lang.Object r0 = m4631(r4, r0)
            if (r0 == 0) goto L42
        L41:
            return r3
        L42:
            java.lang.Object r4 = m4632(r4)
            if (r4 != 0) goto L49
            goto L54
        L49:
            java.util.List r4 = m4624(r4)
            java.lang.String r4 = m4609(r4)
            if (r4 == 0) goto L54
            return r3
        L54:
            return r2
    }

    /* JADX INFO: renamed from: Μ */
    public static boolean m4606(java.lang.String r2) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r0)
            r2.getClass()
            java.lang.String r0 = ".mp4"
            r1 = 0
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L4c
            java.lang.String r0 = ".m3u8"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L4c
            java.lang.String r0 = "video_mp4"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L4c
            java.lang.String r0 = "mime_type=video"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L4c
            java.lang.String r0 = "/video/"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L4c
            java.lang.String r0 = "/play/"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L4c
            java.lang.String r0 = "playaddr"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L4c
            java.lang.String r0 = "play_addr"
            boolean r2 = p000.q02.m4654(r2, r0, r1)
            if (r2 == 0) goto L4b
            goto L4c
        L4b:
            return r1
        L4c:
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: Ο */
    public static java.lang.Integer m4607(java.lang.Object r8) {
            java.lang.String r0 = "awemeTypeP"
            java.lang.String r1 = "awemeType"
            java.lang.String r2 = "aweme_type"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r0}
            java.lang.Integer r0 = m4633(r8, r0)
            if (r0 == 0) goto L19
            int r8 = r0.intValue()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        L19:
            java.lang.String r0 = "getAwemeTypeP"
            java.lang.String r1 = "getAweme_type"
            java.lang.String r3 = "getAwemeType"
            java.lang.String[] r0 = new java.lang.String[]{r3, r0, r1}
            java.lang.Object r0 = m4620(r8, r0)
            java.lang.Integer r0 = m4618(r0)
            if (r0 == 0) goto L36
            int r8 = r0.intValue()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        L36:
            java.lang.Class r0 = r8.getClass()
            java.util.ArrayList r0 = m4617(r0)
            java.util.Iterator r0 = r0.iterator()
        L42:
            boolean r1 = r0.hasNext()
            java.lang.String r3 = "type"
            r4 = 0
            if (r1 == 0) goto Lb5
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r5 = r1.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            if (r5 != 0) goto L42
            java.lang.String r5 = r1.getName()
            r5.getClass()
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toLowerCase(r6)
            r5.getClass()
            java.lang.String r6 = "awemetype"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L90
            boolean r6 = r5.equals(r2)
            if (r6 != 0) goto L90
            java.lang.String r6 = "awemetypep"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L90
            java.lang.String r6 = "aweme"
            r7 = 0
            boolean r6 = p000.q02.m4654(r5, r6, r7)
            if (r6 == 0) goto L42
            boolean r3 = p000.q02.m4654(r5, r3, r7)
            if (r3 == 0) goto L42
        L90:
            r3 = 1
            r1.setAccessible(r3)     // Catch: java.lang.Throwable -> L99
            java.lang.Object r1 = r1.get(r8)     // Catch: java.lang.Throwable -> L99
            goto La0
        L99:
            r1 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r1)
            r1 = r3
        La0:
            boolean r3 = r1 instanceof p000.eo1
            if (r3 == 0) goto La5
            goto La6
        La5:
            r4 = r1
        La6:
            java.lang.Integer r1 = m4618(r4)
            if (r1 == 0) goto L42
            int r8 = r1.intValue()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        Lb5:
            java.lang.String[] r0 = new java.lang.String[]{r3}
            java.lang.Integer r8 = m4633(r8, r0)
            if (r8 == 0) goto Lc8
            int r8 = r8.intValue()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        Lc8:
            return r4
    }

    /* JADX INFO: renamed from: Π */
    public static java.lang.String m4608(java.util.List r4) {
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L7
            goto L5b
        L7:
            java.util.Set r4 = p000.AbstractC0984xh.m6670(r4)
            java.util.List r4 = p000.AbstractC0984xh.m6666(r4)
            uh0 r0 = new uh0
            r1 = 12
            r0.<init>(r1)
            ye r1 = new ye
            r2 = 22
            r1.<init>(r2, r0)
            ye r0 = new ye
            r2 = 21
            r0.<init>(r2, r1)
            java.util.List r4 = p000.AbstractC0984xh.m6658(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L31:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L4e
            java.lang.Object r1 = r4.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            r2.getClass()
            int r2 = m4596(r2)
            r3 = 100
            if (r2 < r3) goto L4a
            goto L31
        L4a:
            r0.add(r1)
            goto L31
        L4e:
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L5b
            java.lang.Object r4 = p000.AbstractC0984xh.m6638(r0)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L5b:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: Ρ */
    public static java.lang.String m4609(java.util.List r3) {
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L8
            goto Le4
        L8:
            java.util.Set r3 = p000.AbstractC0984xh.m6670(r3)
            java.util.List r3 = p000.AbstractC0984xh.m6666(r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L19:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r3.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = m4599(r2)
            if (r2 == 0) goto L19
            r0.add(r1)
            goto L19
        L30:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L39:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L50
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = m4604(r2)
            if (r2 != 0) goto L39
            r3.add(r1)
            goto L39
        L50:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L59:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L70
            java.lang.Object r1 = r3.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = m4598(r2)
            if (r2 != 0) goto L59
            r0.add(r1)
            goto L59
        L70:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L79:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L90
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = m4603(r2)
            if (r2 != 0) goto L79
            r3.add(r1)
            goto L79
        L90:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L97
            goto Le4
        L97:
            uh0 r0 = new uh0
            r1 = 13
            r0.<init>(r1)
            ye r1 = new ye
            r2 = 23
            r1.<init>(r2, r0)
            ye r0 = new ye
            r2 = 25
            r0.<init>(r2, r1)
            ye r1 = new ye
            r2 = 24
            r1.<init>(r2, r0)
            java.util.List r3 = p000.AbstractC0984xh.m6658(r3, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        Lc0:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto Ld7
            java.lang.Object r1 = r3.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = m4601(r2)
            if (r2 != 0) goto Lc0
            r0.add(r1)
            goto Lc0
        Ld7:
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto Le4
            java.lang.Object r3 = p000.AbstractC0984xh.m6638(r0)
            java.lang.String r3 = (java.lang.String) r3
            return r3
        Le4:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: Τ */
    public static int m4610(java.lang.String r4) {
            r4.getClass()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r0)
            r4.getClass()
            java.lang.String r0 = "/logo/"
            r1 = 0
            boolean r0 = p000.q02.m4654(r4, r0, r1)
            r2 = 500(0x1f4, float:7.0E-43)
            if (r0 == 0) goto L19
            r0 = r2
            goto L1a
        L19:
            r0 = r1
        L1a:
            java.lang.String r3 = "mps/logo"
            boolean r3 = p000.q02.m4654(r4, r3, r1)
            if (r3 == 0) goto L24
            int r0 = r0 + 500
        L24:
            java.lang.String r3 = "logo_type="
            boolean r3 = p000.q02.m4654(r4, r3, r1)
            if (r3 == 0) goto L2e
            int r0 = r0 + 500
        L2e:
            java.lang.String r3 = "aweme_search_suffix"
            boolean r3 = p000.q02.m4654(r4, r3, r1)
            if (r3 == 0) goto L38
            int r0 = r0 + 300
        L38:
            java.lang.String r3 = "watermark"
            boolean r3 = p000.q02.m4654(r4, r3, r1)
            if (r3 == 0) goto L42
            int r0 = r0 + 500
        L42:
            java.lang.String r3 = "water_mark"
            boolean r3 = p000.q02.m4654(r4, r3, r1)
            if (r3 == 0) goto L4c
            int r0 = r0 + 500
        L4c:
            java.lang.String r3 = "playwm"
            boolean r3 = p000.q02.m4654(r4, r3, r1)
            if (r3 == 0) goto L56
            int r0 = r0 + 500
        L56:
            java.lang.String r3 = "wm_"
            boolean r3 = p000.q02.m4654(r4, r3, r1)
            if (r3 == 0) goto L60
            int r0 = r0 + 200
        L60:
            java.lang.String r3 = "/wm/"
            boolean r3 = p000.q02.m4654(r4, r3, r1)
            if (r3 == 0) goto L6a
            int r0 = r0 + 300
        L6a:
            java.lang.String r3 = "has_watermark=1"
            boolean r3 = p000.q02.m4654(r4, r3, r1)
            if (r3 == 0) goto L74
            int r0 = r0 + 500
        L74:
            java.lang.String r3 = "is_watermarked=1"
            boolean r4 = p000.q02.m4654(r4, r3, r1)
            if (r4 == 0) goto L7d
            int r0 = r0 + r2
        L7d:
            return r0
    }

    /* JADX INFO: renamed from: Υ */
    public static void m4611(java.io.OutputStream r3, byte[] r4) {
            int r0 = r4.length
            int r0 = r0 + 2
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r0 > r1) goto L20
            r1 = 255(0xff, float:3.57E-43)
            r3.write(r1)
            r2 = 225(0xe1, float:3.15E-43)
            r3.write(r2)
            int r2 = r0 >> 8
            r2 = r2 & r1
            r3.write(r2)
            r0 = r0 & r1
            r3.write(r0)
            r3.write(r4)
            return
        L20:
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r4 = "APP1 元数据过大，无法写入 JPEG"
            r3.<init>(r4)
            throw r3
    }

    /* JADX INFO: renamed from: Φ */
    public static void m4612(java.io.File r18, java.io.File r19, java.io.OutputStream r20, p000.nu0 r21) {
            r0 = r20
            r1 = r21
            ou0 r1 = r1.f7754
            java.lang.Long r2 = m4636(r19)
            r3 = 0
            if (r2 == 0) goto L1a
            long r7 = r2.longValue()
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 <= 0) goto L1a
            r9 = 2
            long r7 = r7 / r9
            goto L1c
        L1a:
            r7 = -1
        L1c:
            byte[] r2 = p000.s30.m5362(r18)
            int r9 = r2.length
            r10 = 2
            if (r9 < r10) goto L2b5
            r9 = 0
            r11 = r2[r9]
            r12 = -1
            if (r11 != r12) goto L2b5
            r11 = 1
            r12 = r2[r11]
            r13 = -40
            if (r12 != r13) goto L2b5
            long r12 = r19.length()
            int r14 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r14 <= 0) goto L2ad
            int r14 = r1.ordinal()
            if (r14 == 0) goto L18e
            java.lang.String r15 = "Exif\u0000\u0000"
            r16 = r3
            r4 = 4
            r3 = 8
            if (r14 == r11) goto L10d
            if (r14 != r10) goto L109
            java.lang.String r14 = "{\"oplustag\":8388608}"
            java.nio.charset.Charset r6 = p000.AbstractC0547mf.f7105
            byte[] r6 = r14.getBytes(r6)
            r6.getClass()
            java.io.ByteArrayOutputStream r14 = new java.io.ByteArrayOutputStream
            r14.<init>()
            java.lang.String r10 = "ASCII\u0000\u0000\u0000"
            java.nio.charset.Charset r5 = p000.AbstractC0547mf.f7106     // Catch: java.lang.Throwable -> L101
            byte[] r10 = r10.getBytes(r5)     // Catch: java.lang.Throwable -> L101
            r10.getClass()     // Catch: java.lang.Throwable -> L101
            r14.write(r10)     // Catch: java.lang.Throwable -> L101
            r14.write(r6)     // Catch: java.lang.Throwable -> L101
            r14.write(r9)     // Catch: java.lang.Throwable -> L101
            byte[] r10 = r14.toByteArray()     // Catch: java.lang.Throwable -> L101
            r14.close()
            java.io.ByteArrayOutputStream r14 = new java.io.ByteArrayOutputStream
            r14.<init>()
            byte[] r9 = new byte[r4]
            r9 = {x02be: FILL_ARRAY_DATA , data: [77, 77, 0, 42} // fill-array
            r14.write(r9)
            m4614(r14, r3)
            int r3 = r6.length
            int r9 = r3 + 1
            int r3 = r3 + 57
            int r4 = r10.length
            m4613(r14, r11)
            r11 = 34665(0x8769, float:4.8576E-41)
            m4613(r14, r11)
            r11 = 4
            m4613(r14, r11)
            r11 = 1
            m4614(r14, r11)
            r11 = 26
            m4614(r14, r11)
            r11 = 0
            m4614(r14, r11)
            r11 = 2
            m4613(r14, r11)
            r11 = 37500(0x927c, float:5.2549E-41)
            m4613(r14, r11)
            r11 = 7
            m4613(r14, r11)
            m4614(r14, r9)
            r9 = 56
            m4614(r14, r9)
            r9 = 37510(0x9286, float:5.2563E-41)
            m4613(r14, r9)
            m4613(r14, r11)
            m4614(r14, r4)
            m4614(r14, r3)
            r11 = 0
            m4614(r14, r11)
            r14.write(r6)
            r14.write(r11)
            r14.write(r10)
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            byte[] r4 = r15.getBytes(r5)     // Catch: java.lang.Throwable -> Lf9
            r4.getClass()     // Catch: java.lang.Throwable -> Lf9
            r3.write(r4)     // Catch: java.lang.Throwable -> Lf9
            byte[] r4 = r14.toByteArray()     // Catch: java.lang.Throwable -> Lf9
            r3.write(r4)     // Catch: java.lang.Throwable -> Lf9
            byte[] r4 = r3.toByteArray()     // Catch: java.lang.Throwable -> Lf9
            r3.close()
            r4.getClass()
            goto L191
        Lf9:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> Lfc
        Lfc:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r3, r1)
            throw r0
        L101:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> L104
        L104:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r14, r1)
            throw r0
        L109:
            p000.C1080.m7272()
            return
        L10d:
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            r4.<init>()
            r11 = 4
            byte[] r5 = new byte[r11]
            r5 = {x02c4: FILL_ARRAY_DATA , data: [77, 77, 0, 42} // fill-array
            r4.write(r5)
            m4614(r4, r3)
            java.lang.String r3 = "FXIAOMI_CUSTOMIZE {\"9a01\":\"1\",\"8897\":\"1\",\"88b0\":\"0\",\"version\":\"32\"}"
            java.nio.charset.Charset r5 = p000.AbstractC0547mf.f7105
            byte[] r3 = r3.getBytes(r5)
            r3.getClass()
            int r5 = r3.length
            r11 = 1
            int r5 = r5 + r11
            m4613(r4, r11)
            r6 = 34665(0x8769, float:4.8576E-41)
            m4613(r4, r6)
            r6 = 4
            m4613(r4, r6)
            m4614(r4, r11)
            r6 = 26
            m4614(r4, r6)
            r6 = 0
            m4614(r4, r6)
            m4613(r4, r11)
            r11 = 37500(0x927c, float:5.2549E-41)
            m4613(r4, r11)
            r11 = 7
            m4613(r4, r11)
            m4614(r4, r5)
            r5 = 44
            m4614(r4, r5)
            m4614(r4, r6)
            r4.write(r3)
            r4.write(r6)
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            java.nio.charset.Charset r5 = p000.AbstractC0547mf.f7106     // Catch: java.lang.Throwable -> L186
            byte[] r5 = r15.getBytes(r5)     // Catch: java.lang.Throwable -> L186
            r5.getClass()     // Catch: java.lang.Throwable -> L186
            r3.write(r5)     // Catch: java.lang.Throwable -> L186
            byte[] r4 = r4.toByteArray()     // Catch: java.lang.Throwable -> L186
            r3.write(r4)     // Catch: java.lang.Throwable -> L186
            byte[] r4 = r3.toByteArray()     // Catch: java.lang.Throwable -> L186
            r3.close()
            r4.getClass()
            goto L191
        L186:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> L189
        L189:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r3, r1)
            throw r0
        L18e:
            r16 = r3
            r4 = 0
        L191:
            int r1 = r1.ordinal()
            java.lang.String r3 = "\"\n                      Item:Padding=\"0\"/>\n                  </rdf:li>\n                </rdf:Seq>\n              </Container:Directory>\n            </rdf:Description>\n          </rdf:RDF>\n        </x:xmpmeta>\n        <?xpacket end=\"w\"?>\n    "
            if (r1 == 0) goto L20b
            r11 = 1
            if (r1 == r11) goto L1e5
            r11 = 2
            if (r1 != r11) goto L1e1
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 < 0) goto L1a5
            r5 = r7
            goto L1a7
        L1a5:
            r5 = -1
        L1a7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r7 = "\n        <?xpacket begin=\"\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?>\n        <x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"DYHelper\">\n          <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">\n            <rdf:Description rdf:about=\"\"\n              xmlns:GCamera=\"http://ns.google.com/photos/1.0/camera/\"\n              xmlns:Container=\"http://ns.google.com/photos/1.0/container/\"\n              xmlns:Item=\"http://ns.google.com/photos/1.0/container/item/\"\n              xmlns:OpCamera=\"http://ns.oplus.com/photos/1.0/camera/\"\n              GCamera:MotionPhoto=\"1\"\n              GCamera:MotionPhotoVersion=\"1\"\n              GCamera:MotionPhotoPresentationTimestampUs=\""
            r1.<init>(r7)
            r1.append(r5)
            java.lang.String r7 = "\"\n              GCamera:MicroVideo=\"1\"\n              GCamera:MicroVideoVersion=\"1\"\n              GCamera:MicroVideoOffset=\""
            r1.append(r7)
            r1.append(r12)
            java.lang.String r7 = "\"\n              GCamera:MicroVideoPresentationTimestampUs=\""
            java.lang.String r8 = "\"\n              OpCamera:MotionPhotoOwner=\"oplus\"\n              OpCamera:MotionPhoto=\"1\"\n              OpCamera:MotionPhotoVersion=\"1\"\n              OpCamera:OLivePhotoVersion=\"2\"\n              OpCamera:VideoLength=\""
            p000.AbstractC0602nx.m4118(r1, r7, r5, r8)
            r1.append(r12)
            java.lang.String r7 = "\"\n              OpCamera:VideoOffset=\""
            java.lang.String r8 = "\"\n              OpCamera:MotionPhotoPrimaryPresentationTimestampUs=\""
            p000.AbstractC0602nx.m4118(r1, r7, r12, r8)
            r1.append(r5)
            java.lang.String r5 = "\">\n\n              <Container:Directory>\n                <rdf:Seq>\n                  <rdf:li rdf:parseType=\"Resource\">\n                    <Container:Item\n                      Item:Mime=\"image/jpeg\"\n                      Item:Semantic=\"Primary\"\n                      Item:Length=\"0\"\n                      Item:Padding=\"0\"/>\n                  </rdf:li>\n                  <rdf:li rdf:parseType=\"Resource\">\n                    <Container:Item\n                      Item:Mime=\"video/mp4\"\n                      Item:Semantic=\"MotionPhoto\"\n                      Item:Length=\""
            r1.append(r5)
            r1.append(r12)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = p000.r02.m5042(r1)
            goto L24e
        L1e1:
            p000.C1080.m7272()
            return
        L1e5:
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 < 0) goto L1eb
            r5 = r7
            goto L1ed
        L1eb:
            r5 = -1
        L1ed:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r7 = "\n        <?xpacket begin=\"\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?>\n        <x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"DYHelper\">\n          <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">\n            <rdf:Description rdf:about=\"\"\n              xmlns:GCamera=\"http://ns.google.com/photos/1.0/camera/\"\n              xmlns:Container=\"http://ns.google.com/photos/1.0/container/\"\n              xmlns:Item=\"http://ns.google.com/photos/1.0/container/item/\"\n              GCamera:MotionPhoto=\"1\"\n              GCamera:MotionPhotoVersion=\"1\"\n              GCamera:MotionPhotoPresentationTimestampUs=\""
            r1.<init>(r7)
            r1.append(r5)
            java.lang.String r5 = "\">\n              <Container:Directory>\n                <rdf:Seq>\n                  <rdf:li rdf:parseType=\"Resource\">\n                    <Container:Item\n                      Item:Mime=\"image/jpeg\"\n                      Item:Semantic=\"Primary\"\n                      Item:Length=\"0\"\n                      Item:Padding=\"0\"/>\n                  </rdf:li>\n                  <rdf:li rdf:parseType=\"Resource\">\n                    <Container:Item\n                      Item:Mime=\"video/mp4\"\n                      Item:Semantic=\"MotionPhoto\"\n                      Item:Length=\""
            r1.append(r5)
            r1.append(r12)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = p000.r02.m5042(r1)
            goto L24e
        L20b:
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 < 0) goto L211
            r5 = r7
            goto L213
        L211:
            r5 = -1
        L213:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r7 = "\n        <?xpacket begin=\"\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?>\n        <x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"DYHelper\">\n          <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">\n            <rdf:Description rdf:about=\"\"\n              xmlns:GCamera=\"http://ns.google.com/photos/1.0/camera/\"\n              xmlns:Container=\"http://ns.google.com/photos/1.0/container/\"\n              xmlns:Item=\"http://ns.google.com/photos/1.0/container/item/\"\n              xmlns:MiCamera=\"http://ns.xiaomi.com/photos/1.0/camera/\"\n              xmlns:OpCamera=\"http://ns.oplus.com/photos/1.0/camera/\">\n\n              <GCamera:MotionPhoto>1</GCamera:MotionPhoto>\n              <GCamera:MotionPhotoVersion>1</GCamera:MotionPhotoVersion>\n              <GCamera:MotionPhotoPresentationTimestampUs>"
            r1.<init>(r7)
            r1.append(r5)
            java.lang.String r7 = "</GCamera:MotionPhotoPresentationTimestampUs>\n\n              <GCamera:MicroVideo>1</GCamera:MicroVideo>\n              <GCamera:MicroVideoVersion>1</GCamera:MicroVideoVersion>\n              <GCamera:MicroVideoOffset>"
            r1.append(r7)
            r1.append(r12)
            java.lang.String r7 = "</GCamera:MicroVideoOffset>\n              <GCamera:MicroVideoPresentationTimestampUs>"
            java.lang.String r8 = "</GCamera:MicroVideoPresentationTimestampUs>\n\n              <MiCamera:MicroVideo>1</MiCamera:MicroVideo>\n              <MiCamera:MicroVideoVersion>1</MiCamera:MicroVideoVersion>\n              <MiCamera:MicroVideoOffset>"
            p000.AbstractC0602nx.m4118(r1, r7, r5, r8)
            r1.append(r12)
            java.lang.String r7 = "</MiCamera:MicroVideoOffset>\n              <MiCamera:MicroVideoPresentationTimestampUs>"
            java.lang.String r8 = "</MiCamera:MicroVideoPresentationTimestampUs>\n\n              <OpCamera:MotionPhotoOwner>oplus</OpCamera:MotionPhotoOwner>\n              <OpCamera:OLivePhotoVersion>2</OpCamera:OLivePhotoVersion>\n              <OpCamera:VideoLength>"
            p000.AbstractC0602nx.m4118(r1, r7, r5, r8)
            r1.append(r12)
            java.lang.String r7 = "</OpCamera:VideoLength>\n              <OpCamera:MotionPhotoPrimaryPresentationTimestampUs>"
            java.lang.String r8 = "</OpCamera:MotionPhotoPrimaryPresentationTimestampUs>\n\n              <Container:Directory>\n                <rdf:Seq>\n                  <rdf:li rdf:parseType=\"Resource\">\n                    <Container:Item\n                      Item:Mime=\"image/jpeg\"\n                      Item:Semantic=\"Primary\"\n                      Item:Length=\"0\"\n                      Item:Padding=\"0\"/>\n                  </rdf:li>\n                  <rdf:li rdf:parseType=\"Resource\">\n                    <Container:Item\n                      Item:Mime=\"video/mp4\"\n                      Item:Semantic=\"MotionPhoto\"\n                      Item:Length=\""
            p000.AbstractC0602nx.m4118(r1, r7, r5, r8)
            r1.append(r12)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = p000.r02.m5042(r1)
        L24e:
            java.nio.charset.Charset r3 = p000.AbstractC0547mf.f7105
            java.lang.String r5 = "http://ns.adobe.com/xap/1.0/\u0000"
            byte[] r5 = r5.getBytes(r3)
            r5.getClass()
            byte[] r1 = r1.getBytes(r3)
            r1.getClass()
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            int r6 = r5.length
            int r7 = r1.length
            int r6 = r6 + r7
            r3.<init>(r6)
            r3.write(r5)     // Catch: java.lang.Throwable -> L2a5
            r3.write(r1)     // Catch: java.lang.Throwable -> L2a5
            byte[] r1 = r3.toByteArray()     // Catch: java.lang.Throwable -> L2a5
            r3.close()
            r1.getClass()
            r3 = 2
            r11 = 0
            r0.write(r2, r11, r3)
            if (r4 == 0) goto L282
            m4611(r0, r4)
        L282:
            m4611(r0, r1)
            int r1 = r2.length
            int r1 = r1 - r3
            r0.write(r2, r3, r1)
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r2 = r19
            r1.<init>(r2)
            r2 = 8192(0x2000, float:1.148E-41)
            p000.h62.m2364(r1, r0, r2)     // Catch: java.lang.Throwable -> L29d
            r1.close()
            r0.flush()
            return
        L29d:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch: java.lang.Throwable -> L2a0
        L2a0:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r1, r2)
            throw r0
        L2a5:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> L2a8
        L2a8:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r3, r1)
            throw r0
        L2ad:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "视频内容为空，无法生成 Motion Photo"
            r0.<init>(r1)
            throw r0
        L2b5:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "主图不是有效 JPEG"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: Χ */
    public static void m4613(java.io.ByteArrayOutputStream r1, int r2) {
            int r0 = r2 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1.write(r0)
            r2 = r2 & 255(0xff, float:3.57E-43)
            r1.write(r2)
            return
    }

    /* JADX INFO: renamed from: Ψ */
    public static void m4614(java.io.ByteArrayOutputStream r1, int r2) {
            int r0 = r2 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1.write(r0)
            int r0 = r2 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1.write(r0)
            int r0 = r2 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1.write(r0)
            r2 = r2 & 255(0xff, float:3.57E-43)
            r1.write(r2)
            return
    }

    /* JADX INFO: renamed from: α */
    public static final int m4615(java.lang.String r3) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r0)
            r3.getClass()
            java.lang.String r0 = "1920"
            r1 = 0
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 == 0) goto L15
            r0 = 300(0x12c, float:4.2E-43)
            goto L16
        L15:
            r0 = r1
        L16:
            java.lang.String r2 = "1440"
            boolean r2 = p000.q02.m4654(r3, r2, r1)
            if (r2 == 0) goto L20
            int r0 = r0 + 300
        L20:
            java.lang.String r2 = "1080"
            boolean r2 = p000.q02.m4654(r3, r2, r1)
            if (r2 == 0) goto L2a
            int r0 = r0 + 200
        L2a:
            java.lang.String r2 = "origin"
            boolean r2 = p000.q02.m4654(r3, r2, r1)
            if (r2 == 0) goto L34
            int r0 = r0 + 100
        L34:
            java.lang.String r2 = ".webp"
            boolean r2 = p000.q02.m4654(r3, r2, r1)
            if (r2 == 0) goto L3e
            int r0 = r0 + 50
        L3e:
            java.lang.String r2 = ".jpeg"
            boolean r2 = p000.q02.m4654(r3, r2, r1)
            if (r2 == 0) goto L48
            int r0 = r0 + 40
        L48:
            java.lang.String r2 = ".jpg"
            boolean r2 = p000.q02.m4654(r3, r2, r1)
            if (r2 == 0) goto L52
            int r0 = r0 + 40
        L52:
            java.lang.String r2 = ".png"
            boolean r3 = p000.q02.m4654(r3, r2, r1)
            if (r3 == 0) goto L5c
            int r0 = r0 + 40
        L5c:
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static final int m4616(java.lang.String r7) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r7.toLowerCase(r0)
            r1.getClass()
            boolean r2 = m4598(r7)
            r3 = 0
            if (r2 == 0) goto L13
            r2 = -5000(0xffffffffffffec78, float:NaN)
            goto L14
        L13:
            r2 = r3
        L14:
            java.lang.String r4 = r7.toLowerCase(r0)
            r4.getClass()
            java.lang.String r5 = "h264"
            boolean r5 = p000.q02.m4654(r4, r5, r3)
            java.lang.String r6 = "video_mp4"
            if (r5 != 0) goto L43
            java.lang.String r5 = "avc1"
            boolean r5 = p000.q02.m4654(r4, r5, r3)
            if (r5 != 0) goto L43
            java.lang.String r5 = "avc"
            boolean r5 = p000.q02.m4654(r4, r5, r3)
            if (r5 != 0) goto L43
            java.lang.String r5 = "play_addr_h264"
            boolean r5 = p000.q02.m4654(r4, r5, r3)
            if (r5 != 0) goto L43
            boolean r4 = p000.q02.m4654(r4, r6, r3)
            if (r4 == 0) goto L45
        L43:
            int r2 = r2 + 1200
        L45:
            java.lang.String r0 = r7.toLowerCase(r0)
            r0.getClass()
            java.lang.String r4 = ".mp4"
            boolean r4 = p000.q02.m4654(r0, r4, r3)
            java.lang.String r5 = "main.mp4"
            if (r4 != 0) goto L7a
            java.lang.String r4 = "format=mp4"
            boolean r4 = p000.q02.m4654(r0, r4, r3)
            if (r4 != 0) goto L7a
            java.lang.String r4 = "mime=video/mp4"
            boolean r4 = p000.q02.m4654(r0, r4, r3)
            if (r4 != 0) goto L7a
            java.lang.String r4 = "mime_type=video"
            boolean r4 = p000.q02.m4654(r0, r4, r3)
            if (r4 != 0) goto L7a
            boolean r4 = p000.q02.m4654(r0, r6, r3)
            if (r4 != 0) goto L7a
            boolean r0 = p000.q02.m4654(r0, r5, r3)
            if (r0 == 0) goto L7c
        L7a:
            int r2 = r2 + 600
        L7c:
            boolean r7 = m4597(r7)
            if (r7 == 0) goto L84
            int r2 = r2 + (-500)
        L84:
            java.lang.String r7 = "1080"
            boolean r7 = p000.q02.m4654(r1, r7, r3)
            if (r7 == 0) goto L8e
            int r2 = r2 + 300
        L8e:
            java.lang.String r7 = "720"
            boolean r7 = p000.q02.m4654(r1, r7, r3)
            if (r7 == 0) goto L98
            int r2 = r2 + 200
        L98:
            java.lang.String r7 = "540"
            boolean r7 = p000.q02.m4654(r1, r7, r3)
            if (r7 == 0) goto La2
            int r2 = r2 + 100
        La2:
            boolean r7 = p000.q02.m4654(r1, r5, r3)
            if (r7 == 0) goto Laa
            int r2 = r2 + 80
        Laa:
            java.lang.String r7 = "definition=1080p"
            boolean r7 = p000.q02.m4654(r1, r7, r3)
            if (r7 == 0) goto Lb4
            int r2 = r2 + 300
        Lb4:
            java.lang.String r7 = "definition=720p"
            boolean r7 = p000.q02.m4654(r1, r7, r3)
            if (r7 == 0) goto Lbe
            int r2 = r2 + 200
        Lbe:
            java.lang.String r7 = "download_addr"
            boolean r7 = p000.q02.m4654(r1, r7, r3)
            if (r7 == 0) goto Lc8
            int r2 = r2 + (-120)
        Lc8:
            java.lang.String r7 = "new_download_addr"
            boolean r7 = p000.q02.m4654(r1, r7, r3)
            if (r7 == 0) goto Ld2
            int r2 = r2 + (-120)
        Ld2:
            java.lang.String r7 = "/download/"
            boolean r7 = p000.q02.m4654(r1, r7, r3)
            if (r7 == 0) goto Ldc
            int r2 = r2 + (-120)
        Ldc:
            java.lang.String r7 = "download"
            boolean r7 = p000.q02.m4654(r1, r7, r3)
            if (r7 == 0) goto Lee
            java.lang.String r7 = "play"
            boolean r7 = p000.q02.m4654(r1, r7, r3)
            if (r7 != 0) goto Lee
            int r2 = r2 + (-80)
        Lee:
            return r2
    }

    /* JADX INFO: renamed from: γ */
    public static java.util.ArrayList m4617(java.lang.Class r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            if (r2 == 0) goto L14
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L14
            java.lang.Class r2 = p000.lz1.m3684(r2, r0)
            goto L5
        L14:
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static java.lang.Integer m4618(java.lang.Object r2) {
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L7
            java.lang.Integer r2 = (java.lang.Integer) r2
            return r2
        L7:
            boolean r0 = r2 instanceof java.lang.Long
            if (r0 == 0) goto L17
            java.lang.Number r2 = (java.lang.Number) r2
            long r0 = r2.longValue()
            int r2 = (int) r0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L17:
            boolean r0 = r2 instanceof java.lang.Short
            if (r0 == 0) goto L26
            java.lang.Number r2 = (java.lang.Number) r2
            short r2 = r2.shortValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L26:
            boolean r0 = r2 instanceof java.lang.Byte
            if (r0 == 0) goto L35
            java.lang.Number r2 = (java.lang.Number) r2
            byte r2 = r2.byteValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L35:
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 == 0) goto L44
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L44:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L51
            java.lang.String r2 = (java.lang.String) r2
            r0 = 10
            java.lang.Integer r2 = p000.x02.m6487(r2, r0)
            return r2
        L51:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ε */
    public static java.lang.String m4619(java.lang.String r4) {
            r4.getClass()
            java.lang.String r0 = "[\\\\/:*?\"<>|\\s]+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            java.lang.String r1 = "_"
            java.util.regex.Matcher r4 = r0.matcher(r4)
            java.lang.String r4 = r4.replaceAll(r1)
            r4.getClass()
            r0 = 1
            char[] r1 = new char[r0]
            r2 = 95
            r3 = 0
            r1[r3] = r2
            java.lang.String r4 = p000.q02.m4661(r4, r1)
            r1 = 92
            java.lang.String r4 = p000.q02.m4693(r4, r1)
            boolean r1 = p000.q02.m4671(r4)
            if (r1 == 0) goto L3b
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = "livephoto_"
            java.lang.String r4 = p000.AbstractC0602nx.m4126(r1, r4)
        L3b:
            java.lang.String r1 = "MP"
            boolean r0 = p000.x02.m6479(r4, r1, r0)
            if (r0 == 0) goto L44
            goto L4a
        L44:
            java.lang.String r0 = "_MP"
            java.lang.String r4 = r4.concat(r0)
        L4a:
            java.lang.String r0 = ".jpg"
            java.lang.String r4 = r4.concat(r0)
            return r4
    }

    /* JADX INFO: renamed from: ζ */
    public static java.lang.Object m4620(java.lang.Object r7, java.lang.String... r8) {
            r0 = 0
            if (r7 != 0) goto L4
            goto L4d
        L4:
            int r1 = r8.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L4d
            r3 = r8[r2]
            java.lang.Class r4 = r7.getClass()
        Le:
            if (r4 == 0) goto L4a
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L4a
            java.lang.reflect.Method r5 = r4.getDeclaredMethod(r3, r0)     // Catch: java.lang.Throwable -> L1d
            goto L24
        L1d:
            r5 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        L24:
            boolean r6 = r5 instanceof p000.eo1
            if (r6 == 0) goto L29
            r5 = r0
        L29:
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            if (r5 == 0) goto L45
            r6 = 1
            r5.setAccessible(r6)     // Catch: java.lang.Throwable -> L36
            java.lang.Object r5 = r5.invoke(r7, r0)     // Catch: java.lang.Throwable -> L36
            goto L3d
        L36:
            r5 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        L3d:
            boolean r6 = r5 instanceof p000.eo1
            if (r6 == 0) goto L42
            r5 = r0
        L42:
            if (r5 == 0) goto L45
            return r5
        L45:
            java.lang.Class r4 = r4.getSuperclass()
            goto Le
        L4a:
            int r2 = r2 + 1
            goto L6
        L4d:
            return r0
    }

    /* JADX INFO: renamed from: η */
    public static void m4621(java.lang.Object r6, java.util.ArrayList r7, int r8, java.util.HashSet r9) {
            if (r6 != 0) goto L4
            goto L166
        L4:
            int r0 = r7.size()
            r1 = 80
            if (r0 < r1) goto Le
            goto L166
        Le:
            boolean r0 = r6 instanceof java.lang.CharSequence
            if (r0 == 0) goto L20
            java.lang.String r6 = r6.toString()
            boolean r8 = m4599(r6)
            if (r8 == 0) goto L166
            r7.add(r6)
            return
        L20:
            boolean r0 = r6 instanceof java.lang.Iterable
            if (r0 == 0) goto L3f
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L2a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L166
            java.lang.Object r0 = r6.next()
            m4621(r0, r7, r8, r9)
            int r0 = r7.size()
            if (r0 < r1) goto L2a
            goto L166
        L3f:
            boolean r0 = r6 instanceof java.util.Map
            if (r0 == 0) goto L62
            java.util.Map r6 = (java.util.Map) r6
            java.util.Collection r6 = r6.values()
            java.util.Iterator r6 = r6.iterator()
        L4d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L166
            java.lang.Object r0 = r6.next()
            m4621(r0, r7, r8, r9)
            int r0 = r7.size()
            if (r0 < r1) goto L4d
            goto L166
        L62:
            java.lang.Class r0 = r6.getClass()
            boolean r0 = r0.isArray()
            r2 = 0
            if (r0 == 0) goto L85
            int r0 = java.lang.reflect.Array.getLength(r6)
        L71:
            if (r2 >= r0) goto L166
            java.lang.Object r3 = java.lang.reflect.Array.get(r6, r2)
            m4621(r3, r7, r8, r9)
            int r3 = r7.size()
            if (r3 < r1) goto L82
            goto L166
        L82:
            int r2 = r2 + 1
            goto L71
        L85:
            if (r8 > 0) goto L89
            goto L166
        L89:
            boolean r0 = r6 instanceof java.lang.Number
            if (r0 != 0) goto L166
            boolean r0 = r6 instanceof java.lang.Boolean
            if (r0 != 0) goto L166
            boolean r0 = r6 instanceof java.lang.Enum
            if (r0 != 0) goto L166
            boolean r0 = r6 instanceof java.lang.Class
            if (r0 == 0) goto L9a
            return
        L9a:
            java.lang.Class r0 = r6.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r3 = "java."
            boolean r3 = p000.x02.m6485(r0, r3, r2)
            if (r3 != 0) goto L166
            java.lang.String r3 = "android."
            boolean r3 = p000.x02.m6485(r0, r3, r2)
            if (r3 != 0) goto L166
            java.lang.String r3 = "kotlin."
            boolean r0 = p000.x02.m6485(r0, r3, r2)
            if (r0 == 0) goto Lbc
            goto L166
        Lbc:
            int r0 = java.lang.System.identityHashCode(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r9.add(r0)
            if (r0 != 0) goto Lcc
            goto L166
        Lcc:
            java.lang.Class r0 = r6.getClass()
            java.util.ArrayList r0 = m4617(r0)
            java.util.Iterator r0 = r0.iterator()
        Ld8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L166
            java.lang.Object r3 = r0.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            int r4 = r3.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            if (r4 != 0) goto Ld8
            java.lang.String r4 = r3.getName()
            r4.getClass()
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r5)
            r4.getClass()
            java.lang.String r5 = "url"
            boolean r5 = p000.q02.m4654(r4, r5, r2)
            if (r5 != 0) goto L146
            java.lang.String r5 = "uri"
            boolean r5 = p000.q02.m4654(r4, r5, r2)
            if (r5 != 0) goto L146
            java.lang.String r5 = "addr"
            boolean r5 = p000.q02.m4654(r4, r5, r2)
            if (r5 != 0) goto L146
            java.lang.String r5 = "play"
            boolean r5 = p000.q02.m4654(r4, r5, r2)
            if (r5 != 0) goto L146
            java.lang.String r5 = "download"
            boolean r5 = p000.q02.m4654(r4, r5, r2)
            if (r5 != 0) goto L146
            java.lang.String r5 = "cover"
            boolean r5 = p000.q02.m4654(r4, r5, r2)
            if (r5 != 0) goto L146
            java.lang.String r5 = "video"
            boolean r5 = p000.q02.m4654(r4, r5, r2)
            if (r5 != 0) goto L146
            java.lang.String r5 = "image"
            boolean r5 = p000.q02.m4654(r4, r5, r2)
            if (r5 != 0) goto L146
            java.lang.String r5 = "photo"
            boolean r4 = p000.q02.m4654(r4, r5, r2)
            if (r4 == 0) goto Ld8
        L146:
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Throwable -> L14f
            java.lang.Object r3 = r3.get(r6)     // Catch: java.lang.Throwable -> L14f
            goto L156
        L14f:
            r3 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r3)
            r3 = r5
        L156:
            boolean r5 = r3 instanceof p000.eo1
            if (r5 == 0) goto L15b
            r3 = 0
        L15b:
            int r4 = r8 + (-1)
            m4621(r3, r7, r4, r9)
            int r3 = r7.size()
            if (r3 < r1) goto Ld8
        L166:
            return
    }

    /* JADX INFO: renamed from: θ */
    public static java.util.List m4622(java.lang.Object r10) {
            if (r10 != 0) goto L5
            jz r10 = p000.C0450jz.f5672
            return r10
        L5:
            java.lang.String r0 = "urlList"
            java.lang.String r1 = "_urlList"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.lang.Object r1 = m4631(r10, r0)
            java.lang.String r0 = "downloadUrlList"
            java.lang.String r2 = "_downloadUrlList"
            java.lang.String[] r0 = new java.lang.String[]{r0, r2}
            java.lang.Object r2 = m4631(r10, r0)
            java.lang.String r0 = "originUrlList"
            java.lang.String r3 = "_originUrlList"
            java.lang.String[] r0 = new java.lang.String[]{r0, r3}
            java.lang.Object r3 = m4631(r10, r0)
            java.lang.String r0 = "displayImage"
            java.lang.String r4 = "_displayImage"
            java.lang.String[] r0 = new java.lang.String[]{r0, r4}
            java.lang.Object r4 = m4631(r10, r0)
            java.lang.String r0 = "thumbnail"
            java.lang.String r5 = "_thumbnail"
            java.lang.String[] r0 = new java.lang.String[]{r0, r5}
            java.lang.Object r5 = m4631(r10, r0)
            java.lang.String r0 = "cover"
            java.lang.String r6 = "_cover"
            java.lang.String[] r0 = new java.lang.String[]{r0, r6}
            java.lang.Object r6 = m4631(r10, r0)
            java.lang.String r0 = "originCover"
            java.lang.String r7 = "_originCover"
            java.lang.String[] r0 = new java.lang.String[]{r0, r7}
            java.lang.Object r7 = m4631(r10, r0)
            java.lang.String r0 = "uri"
            java.lang.String r8 = "_uri"
            java.lang.String[] r0 = new java.lang.String[]{r0, r8}
            java.lang.Object r8 = m4631(r10, r0)
            r9 = r10
            java.lang.Object[] r10 = new java.lang.Object[]{r1, r2, r3, r4, r5, r6, r7, r8, r9}
            java.util.List r10 = m4623(r10)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r10.iterator()
        L77:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L8e
            java.lang.Object r1 = r10.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = m4606(r2)
            if (r2 != 0) goto L77
            r0.add(r1)
            goto L77
        L8e:
            return r0
    }

    /* JADX INFO: renamed from: ι */
    public static java.util.List m4623(java.lang.Object... r7) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            int r1 = r7.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L44
            r3 = r7[r2]
            if (r3 == 0) goto L41
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r6 = 6
            m4621(r3, r4, r6, r5)
            java.util.Iterator r3 = r4.iterator()
        L1f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L41
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = m4599(r4)
            if (r5 == 0) goto L34
            r0.add(r4)
        L34:
            int r4 = r0.size()
            r5 = 80
            if (r4 < r5) goto L1f
            java.util.List r7 = p000.AbstractC0984xh.m6666(r0)
            return r7
        L41:
            int r2 = r2 + 1
            goto L7
        L44:
            java.util.List r7 = p000.AbstractC0984xh.m6666(r0)
            return r7
    }

    /* JADX INFO: renamed from: κ */
    public static java.util.List m4624(java.lang.Object r19) {
            r0 = r19
            if (r0 != 0) goto L7
            jz r0 = p000.C0450jz.f5672
            return r0
        L7:
            java.lang.String r1 = "_h264PlayAddr"
            java.lang.String r2 = "_playAddrH264"
            java.lang.String r3 = "playAddrH264"
            java.lang.String r4 = "h264PlayAddr"
            java.lang.String[] r1 = new java.lang.String[]{r3, r4, r1, r2}
            java.lang.Object r2 = m4631(r0, r1)
            java.lang.String r1 = "playAddr"
            java.lang.String r3 = "_playAddr"
            java.lang.String[] r1 = new java.lang.String[]{r1, r3}
            java.lang.Object r3 = m4631(r0, r1)
            java.lang.String r1 = "playAddrLowbr"
            java.lang.String r4 = "_playAddrLowbr"
            java.lang.String[] r1 = new java.lang.String[]{r1, r4}
            java.lang.Object r4 = m4631(r0, r1)
            java.lang.String r1 = "downloadAddr"
            java.lang.String r5 = "_downloadAddr"
            java.lang.String[] r1 = new java.lang.String[]{r1, r5}
            java.lang.Object r5 = m4631(r0, r1)
            java.lang.String r1 = "newDownloadAddr"
            java.lang.String r6 = "_newDownloadAddr"
            java.lang.String[] r1 = new java.lang.String[]{r1, r6}
            java.lang.Object r6 = m4631(r0, r1)
            java.lang.String r1 = "bitRate"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.lang.Object r7 = m4631(r0, r1)
            java.lang.String r1 = "bitRateList"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.lang.Object r8 = m4631(r0, r1)
            java.lang.String r1 = "playAddrH265"
            java.lang.String r9 = "_playAddrH265"
            java.lang.String[] r1 = new java.lang.String[]{r1, r9}
            java.lang.Object r9 = m4631(r0, r1)
            java.lang.String r1 = "playAddrBytevc1"
            java.lang.String r10 = "_playAddrBytevc1"
            java.lang.String[] r1 = new java.lang.String[]{r1, r10}
            java.lang.Object r10 = m4631(r0, r1)
            java.lang.String r1 = "urlList"
            java.lang.String r11 = "_urlList"
            java.lang.String[] r1 = new java.lang.String[]{r1, r11}
            java.lang.Object r11 = m4631(r0, r1)
            java.lang.String r1 = "downUrlList"
            java.lang.String r12 = "_downUrlList"
            java.lang.String[] r1 = new java.lang.String[]{r1, r12}
            java.lang.Object r12 = m4631(r0, r1)
            java.lang.String r1 = "downloadUrlList"
            java.lang.String r13 = "_downloadUrlList"
            java.lang.String[] r1 = new java.lang.String[]{r1, r13}
            java.lang.Object r13 = m4631(r0, r1)
            java.lang.String r1 = "liveVideo"
            java.lang.String r14 = "_liveVideo"
            java.lang.String[] r1 = new java.lang.String[]{r1, r14}
            java.lang.Object r14 = m4631(r0, r1)
            java.lang.String r1 = "dashVideoInfo"
            java.lang.String r15 = "_dashVideoInfo"
            java.lang.String[] r1 = new java.lang.String[]{r1, r15}
            java.lang.Object r15 = m4631(r0, r1)
            java.lang.String r1 = "getDownUrlList"
            r16 = r2
            java.lang.String r2 = "getDownloadUrlList"
            r17 = r3
            java.lang.String r3 = "getUrlList"
            java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
            java.lang.Object r1 = m4620(r0, r1)
            java.lang.String r2 = "getLiveVideo"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            java.lang.Object r2 = m4620(r0, r2)
            java.lang.String r3 = "getDashVideoInfo"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            java.lang.Object r18 = m4620(r0, r3)
            r3 = r17
            r17 = r2
            r2 = r16
            r16 = r1
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18}
            java.util.ArrayList r1 = p000.AbstractC1021yh.m6899(r1)
            r1.add(r0)
            r0 = 0
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.Object[] r1 = r1.toArray(r2)
            int r2 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.util.List r1 = m4623(r1)
            f7 r2 = new f7
            r3 = 1
            r2.<init>(r3, r1)
            gp0 r1 = new gp0
            r3 = 9
            r1.<init>(r3)
            y30 r3 = new y30
            r4 = 1
            r3.<init>(r2, r4, r1)
            gp0 r1 = new gp0
            r2 = 10
            r1.<init>(r2)
            y30 r2 = new y30
            r2.<init>(r3, r4, r1)
            gp0 r1 = new gp0
            r3 = 11
            r1.<init>(r3)
            y30 r3 = new y30
            r3.<init>(r2, r0, r1)
            gp0 r1 = new gp0
            r2 = 12
            r1.<init>(r2)
            y30 r2 = new y30
            r2.<init>(r3, r0, r1)
            gp0 r1 = new gp0
            r3 = 13
            r1.<init>(r3)
            y30 r3 = new y30
            r3.<init>(r2, r0, r1)
            cu r0 = p000.us1.m5952(r3)
            java.util.List r0 = p000.us1.m5948(r0)
            return r0
    }

    /* JADX INFO: renamed from: λ */
    public static int m4625(android.media.MediaExtractor r11, int r12, android.media.MediaMuxer r13, int r14, long r15) {
            android.media.MediaFormat r0 = r11.getTrackFormat(r12)
            r0.getClass()
            java.lang.String r1 = "max-input-size"
            r2 = 0
            boolean r3 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L18
            int r0 = r0.getInteger(r1)     // Catch: java.lang.Throwable -> L18
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L18
        L18:
            if (r2 == 0) goto L1f
            int r0 = r2.intValue()
            goto L21
        L1f:
            r0 = 1048576(0x100000, float:1.469368E-39)
        L21:
            int r0 = r0 + 16384
            r1 = 262144(0x40000, float:3.67342E-40)
            int r0 = java.lang.Math.max(r1, r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            android.media.MediaCodec$BufferInfo r1 = new android.media.MediaCodec$BufferInfo
            r1.<init>()
            r11.selectTrack(r12)
            r2 = 2
            r7 = 0
            r11.seekTo(r7, r2)     // Catch: java.lang.Throwable -> L49
            r9 = 0
            r10 = r9
        L3d:
            int r2 = r11.getSampleTrackIndex()     // Catch: java.lang.Throwable -> L49
            if (r2 < 0) goto L8c
            if (r2 == r12) goto L4c
            r11.advance()     // Catch: java.lang.Throwable -> L49
            goto L3d
        L49:
            r0 = move-exception
            r13 = r0
            goto L90
        L4c:
            long r2 = r11.getSampleTime()     // Catch: java.lang.Throwable -> L49
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 < 0) goto L8c
            int r5 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r5 <= 0) goto L66
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r5 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r5 == 0) goto L66
            int r5 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r5 <= 0) goto L66
            goto L8c
        L66:
            r0.clear()     // Catch: java.lang.Throwable -> L49
            r5 = r2
            int r3 = r11.readSampleData(r0, r9)     // Catch: java.lang.Throwable -> L49
            if (r3 < 0) goto L8c
            r0.position(r9)     // Catch: java.lang.Throwable -> L49
            r0.limit(r3)     // Catch: java.lang.Throwable -> L49
            if (r4 >= 0) goto L7a
            r4 = r7
            goto L7b
        L7a:
            r4 = r5
        L7b:
            int r6 = r11.getSampleFlags()     // Catch: java.lang.Throwable -> L49
            r2 = 0
            r1.set(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L49
            r13.writeSampleData(r14, r0, r1)     // Catch: java.lang.Throwable -> L49
            int r10 = r10 + 1
            r11.advance()     // Catch: java.lang.Throwable -> L49
            goto L3d
        L8c:
            r11.unselectTrack(r12)     // Catch: java.lang.Throwable -> L8f
        L8f:
            return r10
        L90:
            r11.unselectTrack(r12)     // Catch: java.lang.Throwable -> L93
        L93:
            throw r13
    }

    /* JADX INFO: renamed from: ν */
    public static java.util.List m4626(java.lang.Object r13) {
            java.lang.String r0 = "imagePostInfo"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.Object r0 = m4631(r13, r0)
            java.lang.String r1 = "image_post_info"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.lang.Object r1 = m4631(r13, r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            r1 = 0
            r2 = r1
        L1a:
            r3 = 0
            r4 = 2
            if (r2 >= r4) goto L26
            r4 = r0[r2]
            if (r4 == 0) goto L23
            goto L27
        L23:
            int r2 = r2 + 1
            goto L1a
        L26:
            r4 = r3
        L27:
            java.lang.String r0 = "imageList"
            java.lang.String r2 = "image_list"
            java.lang.String r5 = "images"
            java.lang.String[] r0 = new java.lang.String[]{r5, r0, r2}
            java.lang.Object r6 = m4631(r4, r0)
            java.lang.String[] r0 = new java.lang.String[]{r5}
            java.lang.Object r7 = m4631(r13, r0)
            java.lang.String r0 = "imageInfos"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.Object r8 = m4631(r13, r0)
            java.lang.String r0 = "imageUrlStructList"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.Object r9 = m4631(r13, r0)
            java.lang.String r0 = "imageUrlStructs"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.Object r10 = m4631(r13, r0)
            java.lang.String r0 = "awemeImageInfos"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.Object r11 = m4631(r13, r0)
            java.lang.String r0 = "imageUrlStruct"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.Object r12 = m4631(r13, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r6, r7, r8, r9, r10, r11, r12}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r0 = r0.iterator()
        L7b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Le9
            java.lang.Object r2 = r0.next()
            if (r2 != 0) goto L8a
            jz r2 = p000.C0450jz.f5672
            goto Lcd
        L8a:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            boolean r6 = r2 instanceof java.lang.Iterable
            if (r6 == 0) goto Lac
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L9e:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto Lc7
            java.lang.Object r6 = r2.next()
            m4595(r5, r4, r6)
            goto L9e
        Lac:
            java.lang.Class r6 = r2.getClass()
            boolean r6 = r6.isArray()
            if (r6 == 0) goto Lc9
            int r6 = java.lang.reflect.Array.getLength(r2)
            r7 = r1
        Lbb:
            if (r7 >= r6) goto Lc7
            java.lang.Object r8 = java.lang.reflect.Array.get(r2, r7)
            m4595(r5, r4, r8)
            int r7 = r7 + 1
            goto Lbb
        Lc7:
            r2 = r4
            goto Lcd
        Lc9:
            m4595(r5, r4, r2)
            goto Lc7
        Lcd:
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L7b
            int r13 = r2.size()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "findAllImageStructs 使用主图文列表，count="
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            m4602(r13)
            return r2
        Le9:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.lang.Class r0 = r13.getClass()
            java.util.ArrayList r0 = m4617(r0)
            java.util.Iterator r5 = r0.iterator()
        Lff:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L17a
            java.lang.Object r0 = r5.next()
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            java.lang.String r6 = r0.getName()
            r6.getClass()
            java.util.Locale r7 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r7)
            r6.getClass()
            java.lang.String r7 = "image"
            boolean r7 = p000.q02.m4654(r6, r7, r1)
            if (r7 != 0) goto L12b
            java.lang.String r7 = "photo"
            boolean r6 = p000.q02.m4654(r6, r7, r1)
            if (r6 == 0) goto Lff
        L12b:
            r6 = 1
            r0.setAccessible(r6)     // Catch: java.lang.Throwable -> L134
            java.lang.Object r0 = r0.get(r13)     // Catch: java.lang.Throwable -> L134
            goto L13b
        L134:
            r0 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r0)
            r0 = r6
        L13b:
            boolean r6 = r0 instanceof p000.eo1
            if (r6 == 0) goto L140
            r0 = r3
        L140:
            if (r0 != 0) goto L143
            goto Lff
        L143:
            boolean r6 = r0 instanceof java.lang.Iterable
            if (r6 == 0) goto L15b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L14d:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto Lff
            java.lang.Object r6 = r0.next()
            m4627(r4, r2, r6)
            goto L14d
        L15b:
            java.lang.Class r6 = r0.getClass()
            boolean r6 = r6.isArray()
            if (r6 == 0) goto L176
            int r6 = java.lang.reflect.Array.getLength(r0)
            r7 = r1
        L16a:
            if (r7 >= r6) goto Lff
            java.lang.Object r8 = java.lang.reflect.Array.get(r0, r7)
            m4627(r4, r2, r8)
            int r7 = r7 + 1
            goto L16a
        L176:
            m4627(r4, r2, r0)
            goto Lff
        L17a:
            int r13 = r2.size()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "findAllImageStructs 使用兜底扫描，count="
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            m4602(r13)
            return r2
    }

    /* JADX INFO: renamed from: ξ */
    public static final void m4627(java.util.HashSet r1, java.util.ArrayList r2, java.lang.Object r3) {
            if (r3 != 0) goto L3
            goto L1b
        L3:
            boolean r0 = m4605(r3)
            if (r0 != 0) goto La
            goto L1b
        La:
            int r0 = java.lang.System.identityHashCode(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.add(r0)
            if (r1 == 0) goto L1b
            r2.add(r3)
        L1b:
            return
    }

    /* JADX INFO: renamed from: ο */
    public static int m4628(android.media.MediaExtractor r5) {
            int r0 = r5.getTrackCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L5c
            android.media.MediaFormat r2 = r5.getTrackFormat(r1)
            r2.getClass()
            java.lang.String r3 = "mime"
            java.lang.String r2 = r2.getString(r3)     // Catch: java.lang.Throwable -> L15
            goto L1c
        L15:
            r2 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L1c:
            boolean r3 = r2 instanceof p000.eo1
            if (r3 == 0) goto L21
            r2 = 0
        L21:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L26
            goto L59
        L26:
            java.lang.String r3 = "audio/"
            r4 = 1
            boolean r3 = p000.x02.m6485(r2, r3, r4)
            if (r3 == 0) goto L59
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r3)
            r2.getClass()
            java.lang.String r3 = "audio/mp4a-latm"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L58
            java.lang.String r3 = "audio/aac"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L58
            java.lang.String r3 = "audio/3gpp"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L58
            java.lang.String r3 = "audio/amr-wb"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L59
        L58:
            return r1
        L59:
            int r1 = r1 + 1
            goto L5
        L5c:
            r5 = -1
            return r5
    }

    /* JADX INFO: renamed from: π */
    public static int m4629(android.media.MediaExtractor r5) {
            int r0 = r5.getTrackCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L33
            android.media.MediaFormat r2 = r5.getTrackFormat(r1)
            r2.getClass()
            java.lang.String r3 = "mime"
            java.lang.String r2 = r2.getString(r3)     // Catch: java.lang.Throwable -> L15
            goto L1c
        L15:
            r2 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L1c:
            boolean r3 = r2 instanceof p000.eo1
            if (r3 == 0) goto L21
            r2 = 0
        L21:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L26
            goto L30
        L26:
            java.lang.String r3 = "video/"
            r4 = 1
            boolean r2 = p000.x02.m6485(r2, r3, r4)
            if (r2 == 0) goto L30
            return r1
        L30:
            int r1 = r1 + 1
            goto L5
        L33:
            r5 = -1
            return r5
    }

    /* JADX INFO: renamed from: ρ */
    public static java.lang.String m4630(java.lang.String... r4) {
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L13
            r2 = r4[r1]
            if (r2 == 0) goto L10
            boolean r3 = p000.q02.m4671(r2)
            if (r3 == 0) goto Lf
            goto L10
        Lf:
            return r2
        L10:
            int r1 = r1 + 1
            goto L2
        L13:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: σ */
    public static java.lang.Object m4631(java.lang.Object r7, java.lang.String... r8) {
            r0 = 0
            if (r7 != 0) goto L4
            goto L44
        L4:
            int r1 = r8.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L44
            r3 = r8[r2]
            java.lang.Class r4 = r7.getClass()
        Le:
            r5 = 1
            if (r4 == 0) goto L26
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            boolean r6 = r4.equals(r6)
            if (r6 != 0) goto L26
            java.lang.reflect.Field r6 = r4.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L21
            r6.setAccessible(r5)     // Catch: java.lang.Throwable -> L21
            goto L27
        L21:
            java.lang.Class r4 = r4.getSuperclass()
            goto Le
        L26:
            r6 = r0
        L27:
            if (r6 != 0) goto L2a
            goto L41
        L2a:
            r6.setAccessible(r5)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r3 = r6.get(r7)     // Catch: java.lang.Throwable -> L32
            goto L39
        L32:
            r3 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L39:
            boolean r4 = r3 instanceof p000.eo1
            if (r4 == 0) goto L3e
            r3 = r0
        L3e:
            if (r3 == 0) goto L41
            return r3
        L41:
            int r2 = r2 + 1
            goto L6
        L44:
            return r0
    }

    /* JADX INFO: renamed from: τ */
    public static java.lang.Object m4632(java.lang.Object r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "video"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.lang.Object r1 = m4631(r4, r1)
            java.lang.String r2 = "livePhotoVideo"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            java.lang.Object r2 = m4631(r4, r2)
            java.lang.String r3 = "livePhoto"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            java.lang.Object r4 = m4631(r4, r3)
            java.lang.Object[] r4 = new java.lang.Object[]{r1, r2, r4}
            r1 = 0
        L27:
            r2 = 3
            if (r1 >= r2) goto L32
            r2 = r4[r1]
            if (r2 == 0) goto L2f
            return r2
        L2f:
            int r1 = r1 + 1
            goto L27
        L32:
            return r0
    }

    /* JADX INFO: renamed from: υ */
    public static java.lang.Integer m4633(java.lang.Object r1, java.lang.String... r2) {
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.lang.Object r1 = m4631(r1, r2)
            if (r1 != 0) goto Le
            goto L5f
        Le:
            boolean r2 = r1 instanceof java.lang.Integer
            if (r2 == 0) goto L15
            java.lang.Integer r1 = (java.lang.Integer) r1
            return r1
        L15:
            boolean r2 = r1 instanceof java.lang.Long
            if (r2 == 0) goto L25
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            int r1 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L25:
            boolean r2 = r1 instanceof java.lang.Short
            if (r2 == 0) goto L34
            java.lang.Number r1 = (java.lang.Number) r1
            short r1 = r1.shortValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L34:
            boolean r2 = r1 instanceof java.lang.Byte
            if (r2 == 0) goto L43
            java.lang.Number r1 = (java.lang.Number) r1
            byte r1 = r1.byteValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L43:
            boolean r2 = r1 instanceof java.lang.Number
            if (r2 == 0) goto L52
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L52:
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L5f
            java.lang.String r1 = (java.lang.String) r1
            r2 = 10
            java.lang.Integer r1 = p000.x02.m6487(r1, r2)
            return r1
        L5f:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: φ */
    public static java.lang.Long m4634(java.lang.Object r1, java.lang.String... r2) {
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.lang.Object r1 = m4631(r1, r2)
            if (r1 != 0) goto Le
            goto L61
        Le:
            boolean r2 = r1 instanceof java.lang.Long
            if (r2 == 0) goto L15
            java.lang.Long r1 = (java.lang.Long) r1
            return r1
        L15:
            boolean r2 = r1 instanceof java.lang.Integer
            if (r2 == 0) goto L25
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            return r1
        L25:
            boolean r2 = r1 instanceof java.lang.Short
            if (r2 == 0) goto L35
            java.lang.Number r1 = (java.lang.Number) r1
            short r1 = r1.shortValue()
            long r1 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            return r1
        L35:
            boolean r2 = r1 instanceof java.lang.Byte
            if (r2 == 0) goto L45
            java.lang.Number r1 = (java.lang.Number) r1
            byte r1 = r1.byteValue()
            long r1 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            return r1
        L45:
            boolean r2 = r1 instanceof java.lang.Number
            if (r2 == 0) goto L54
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            return r1
        L54:
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L61
            java.lang.String r1 = (java.lang.String) r1
            r2 = 10
            java.lang.Long r1 = p000.x02.m6489(r1, r2)
            return r1
        L61:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: χ */
    public static java.lang.String m4635(java.lang.Object r1, java.lang.String... r2) {
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.lang.Object r1 = m4631(r1, r2)
            r2 = 0
            if (r1 != 0) goto Lf
            goto L35
        Lf:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L21
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = p000.q02.m4671(r0)
            if (r0 != 0) goto L1d
            goto L1e
        L1d:
            r1 = r2
        L1e:
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L21:
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto L2a
            java.lang.String r1 = r1.toString()
            return r1
        L2a:
            java.lang.String r1 = r1.toString()
            boolean r0 = p000.q02.m4671(r1)
            if (r0 != 0) goto L35
            return r1
        L35:
            return r2
    }

    /* JADX INFO: renamed from: ψ */
    public static java.lang.Long m4636(java.io.File r6) {
            android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever
            r0.<init>()
            r1 = 0
            java.lang.String r6 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L2e
            r0.setDataSource(r6)     // Catch: java.lang.Throwable -> L2e
            r6 = 9
            java.lang.String r6 = r0.extractMetadata(r6)     // Catch: java.lang.Throwable -> L2e
            if (r6 == 0) goto L32
            r2 = 10
            java.lang.Long r6 = p000.x02.m6489(r6, r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 == 0) goto L32
            long r2 = r6.longValue()     // Catch: java.lang.Throwable -> L2e
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L2e
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            java.lang.Long r1 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L2e
        L2e:
            r0.release()     // Catch: java.lang.Throwable -> L35
            goto L35
        L32:
            r0.release()     // Catch: java.lang.Throwable -> L35
        L35:
            return r1
    }

    /* JADX INFO: renamed from: ω */
    public static int m4637(java.io.File r3) {
            android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever
            r0.<init>()
            r1 = 0
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L31
            r0.setDataSource(r3)     // Catch: java.lang.Throwable -> L31
            r3 = 24
            java.lang.String r3 = r0.extractMetadata(r3)     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L22
            r2 = 10
            java.lang.Integer r3 = p000.x02.m6487(r3, r2)     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L22
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L31
            goto L23
        L22:
            r3 = r1
        L23:
            r2 = 90
            if (r3 == r2) goto L30
            r2 = 180(0xb4, float:2.52E-43)
            if (r3 == r2) goto L30
            r2 = 270(0x10e, float:3.78E-43)
            if (r3 == r2) goto L30
            goto L31
        L30:
            r1 = r3
        L31:
            r0.release()     // Catch: java.lang.Throwable -> L34
        L34:
            return r1
    }

    /* JADX INFO: renamed from: Ν */
    public final java.io.File m4638(java.io.File r22, java.io.File r23, java.io.File r24) {
            r21 = this;
            r1 = r21
            r2 = r22
            r3 = r24
            java.lang.String r4 = "MUX-AUDIO-SKIP "
            java.lang.String r5 = "MUX-FAIL "
            java.lang.String r6 = "音视频合并失败: "
            java.lang.String r0 = "音频不是 MP4 可封装格式，file="
            boolean r7 = r23.exists()
            if (r7 == 0) goto L1f1
            long r7 = r23.length()
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 > 0) goto L20
            goto L1f1
        L20:
            r7 = 0
            r8 = 0
            android.media.MediaExtractor r9 = new android.media.MediaExtractor     // Catch: java.lang.Throwable -> L16a p000.ku0 -> L16e
            r9.<init>()     // Catch: java.lang.Throwable -> L16a p000.ku0 -> L16e
            java.lang.String r10 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L16a p000.ku0 -> L16e
            r9.setDataSource(r10)     // Catch: java.lang.Throwable -> L16a p000.ku0 -> L16e
            android.media.MediaExtractor r15 = new android.media.MediaExtractor     // Catch: java.lang.Throwable -> L162 p000.ku0 -> L166
            r15.<init>()     // Catch: java.lang.Throwable -> L162 p000.ku0 -> L166
            java.lang.String r10 = r23.getAbsolutePath()     // Catch: java.lang.Throwable -> L162 p000.ku0 -> L166
            r15.setDataSource(r10)     // Catch: java.lang.Throwable -> L162 p000.ku0 -> L166
            int r10 = m4629(r9)     // Catch: java.lang.Throwable -> L13e p000.ku0 -> L141
            if (r10 < 0) goto L15a
            int r11 = m4628(r15)     // Catch: java.lang.Throwable -> L13e p000.ku0 -> L141
            if (r11 < 0) goto L144
            android.media.MediaFormat r0 = r9.getTrackFormat(r10)     // Catch: java.lang.Throwable -> L13e p000.ku0 -> L141
            r0.getClass()     // Catch: java.lang.Throwable -> L13e p000.ku0 -> L141
            android.media.MediaFormat r12 = r15.getTrackFormat(r11)     // Catch: java.lang.Throwable -> L13e p000.ku0 -> L141
            r12.getClass()     // Catch: java.lang.Throwable -> L13e p000.ku0 -> L141
            java.lang.String r13 = "durationUs"
            boolean r14 = r0.containsKey(r13)     // Catch: java.lang.Throwable -> L65
            if (r14 == 0) goto L65
            long r13 = r0.getLong(r13)     // Catch: java.lang.Throwable -> L65
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch: java.lang.Throwable -> L65
            goto L66
        L65:
            r13 = r8
        L66:
            if (r13 == 0) goto L7b
        L68:
            long r13 = r13.longValue()     // Catch: java.lang.Throwable -> L6f p000.ku0 -> L75
        L6c:
            r16 = r13
            goto L88
        L6f:
            r0 = move-exception
            r18 = r7
            r13 = r8
            goto L172
        L75:
            r0 = move-exception
            r18 = r7
            r13 = r8
            goto L1a7
        L7b:
            java.lang.Long r13 = m4636(r2)     // Catch: java.lang.Throwable -> L13e p000.ku0 -> L141
            if (r13 == 0) goto L82
            goto L68
        L82:
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L6c
        L88:
            java.lang.String r13 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L99
            java.lang.String r14 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L99
            boolean r13 = p000.ln0.m3626(r13, r14)     // Catch: java.lang.Throwable -> L99
            if (r13 != 0) goto L99
            r3.delete()     // Catch: java.lang.Throwable -> L99
        L99:
            android.media.MediaMuxer r13 = new android.media.MediaMuxer     // Catch: java.lang.Throwable -> L13e p000.ku0 -> L141
            java.lang.String r14 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L13e p000.ku0 -> L141
            r13.<init>(r14, r7)     // Catch: java.lang.Throwable -> L13e p000.ku0 -> L141
            int r14 = m4637(r2)     // Catch: java.lang.Throwable -> L136 p000.ku0 -> L13a
            r7 = 90
            if (r14 == r7) goto Lb3
            r7 = 180(0xb4, float:2.52E-43)
            if (r14 == r7) goto Lb3
            r7 = 270(0x10e, float:3.78E-43)
            if (r14 == r7) goto Lb3
            goto Lb6
        Lb3:
            r13.setOrientationHint(r14)     // Catch: java.lang.Throwable -> L136 p000.ku0 -> L13a
        Lb6:
            int r0 = r13.addTrack(r0)     // Catch: java.lang.Throwable -> L136 p000.ku0 -> L13a
            int r7 = r13.addTrack(r12)     // Catch: java.lang.Throwable -> L136 p000.ku0 -> L13a
            r13.start()     // Catch: java.lang.Throwable -> L136 p000.ku0 -> L13a
            r12 = r11
            r11 = r13
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r19 = 1
            r20 = r12
            r12 = r0
            r0 = r20
            int r10 = m4625(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L10e p000.ku0 -> L116
            r12 = r0
            r14 = r7
            r13 = r11
            r11 = r15
            r15 = r16
            int r0 = m4625(r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L12e p000.ku0 -> L132
            r15 = r11
            r11 = r13
            if (r10 <= 0) goto L126
            if (r0 <= 0) goto L11e
            r11.stop()     // Catch: java.lang.Throwable -> L10e p000.ku0 -> L116
            r11.release()     // Catch: java.lang.Throwable -> L108 p000.ku0 -> L10b
            java.lang.String r0 = "muxed-audio-video"
            r1.m4640(r3, r0)     // Catch: java.lang.Throwable -> Lf8 p000.ku0 -> L100
            r9.release()     // Catch: java.lang.Throwable -> Lf1
        Lf1:
            r15.release()     // Catch: java.lang.Throwable -> Lf4
        Lf4:
            r0 = r8
            r8 = r3
            goto L1cc
        Lf8:
            r0 = move-exception
            r13 = r8
        Lfa:
            r7 = r19
            r18 = r7
            goto L172
        L100:
            r0 = move-exception
            r13 = r8
        L102:
            r7 = r19
            r18 = r7
            goto L1a7
        L108:
            r0 = move-exception
            r13 = r11
            goto Lfa
        L10b:
            r0 = move-exception
            r13 = r11
            goto L102
        L10e:
            r0 = move-exception
            r13 = r11
        L110:
            r7 = r19
        L112:
            r18 = 0
            goto L172
        L116:
            r0 = move-exception
            r13 = r11
        L118:
            r7 = r19
        L11a:
            r18 = 0
            goto L1a7
        L11e:
            ku0 r0 = new ku0     // Catch: java.lang.Throwable -> L10e p000.ku0 -> L116
            java.lang.String r7 = "音频轨没有可写入样本"
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L10e p000.ku0 -> L116
            throw r0     // Catch: java.lang.Throwable -> L10e p000.ku0 -> L116
        L126:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L10e p000.ku0 -> L116
            java.lang.String r7 = "视频轨没有可写入样本"
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L10e p000.ku0 -> L116
            throw r0     // Catch: java.lang.Throwable -> L10e p000.ku0 -> L116
        L12e:
            r0 = move-exception
            r15 = r11
            r11 = r13
            goto L110
        L132:
            r0 = move-exception
            r15 = r11
            r11 = r13
            goto L118
        L136:
            r0 = move-exception
            r11 = r13
        L138:
            r7 = 0
            goto L112
        L13a:
            r0 = move-exception
            r11 = r13
        L13c:
            r7 = 0
            goto L11a
        L13e:
            r0 = move-exception
            r13 = r8
            goto L138
        L141:
            r0 = move-exception
            r13 = r8
            goto L13c
        L144:
            ku0 r7 = new ku0     // Catch: java.lang.Throwable -> L13e p000.ku0 -> L141
            java.lang.String r10 = r23.getName()     // Catch: java.lang.Throwable -> L13e p000.ku0 -> L141
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13e p000.ku0 -> L141
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L13e p000.ku0 -> L141
            r11.append(r10)     // Catch: java.lang.Throwable -> L13e p000.ku0 -> L141
            java.lang.String r0 = r11.toString()     // Catch: java.lang.Throwable -> L13e p000.ku0 -> L141
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L13e p000.ku0 -> L141
            throw r7     // Catch: java.lang.Throwable -> L13e p000.ku0 -> L141
        L15a:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L13e p000.ku0 -> L141
            java.lang.String r7 = "原视频没有视频轨"
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L13e p000.ku0 -> L141
            throw r0     // Catch: java.lang.Throwable -> L13e p000.ku0 -> L141
        L162:
            r0 = move-exception
            r13 = r8
        L164:
            r15 = r13
            goto L138
        L166:
            r0 = move-exception
            r13 = r8
        L168:
            r15 = r13
            goto L13c
        L16a:
            r0 = move-exception
            r9 = r8
            r13 = r9
            goto L164
        L16e:
            r0 = move-exception
            r9 = r8
            r13 = r9
            goto L168
        L172:
            java.lang.String r4 = r0.getMessage()     // Catch: java.lang.Throwable -> L181
            if (r4 != 0) goto L183
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L181
            java.lang.String r4 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L181
            goto L183
        L181:
            r0 = move-exception
            goto L1d8
        L183:
            java.lang.String r0 = r6.concat(r4)     // Catch: java.lang.Throwable -> L181
            java.lang.String r4 = r5.concat(r0)     // Catch: java.lang.Throwable -> L181
            m4602(r4)     // Catch: java.lang.Throwable -> L181
            if (r7 == 0) goto L197
            if (r18 != 0) goto L197
            if (r13 == 0) goto L197
            r13.stop()     // Catch: java.lang.Throwable -> L197
        L197:
            if (r13 == 0) goto L19c
            r13.release()     // Catch: java.lang.Throwable -> L19c
        L19c:
            if (r9 == 0) goto L1a1
            r9.release()     // Catch: java.lang.Throwable -> L1a1
        L1a1:
            if (r15 == 0) goto L1cc
        L1a3:
            r15.release()     // Catch: java.lang.Throwable -> L1cc
            goto L1cc
        L1a7:
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L181
            if (r0 != 0) goto L1af
            java.lang.String r0 = "音频不可用"
        L1af:
            java.lang.String r4 = r4.concat(r0)     // Catch: java.lang.Throwable -> L181
            m4602(r4)     // Catch: java.lang.Throwable -> L181
            if (r7 == 0) goto L1bf
            if (r18 != 0) goto L1bf
            if (r13 == 0) goto L1bf
            r13.stop()     // Catch: java.lang.Throwable -> L1bf
        L1bf:
            if (r13 == 0) goto L1c4
            r13.release()     // Catch: java.lang.Throwable -> L1c4
        L1c4:
            if (r9 == 0) goto L1c9
            r9.release()     // Catch: java.lang.Throwable -> L1c9
        L1c9:
            if (r15 == 0) goto L1cc
            goto L1a3
        L1cc:
            if (r8 == 0) goto L1cf
            return r8
        L1cf:
            if (r0 != 0) goto L1d3
            java.lang.String r0 = "未知音频合并问题"
        L1d3:
            java.io.File r0 = r1.m4641(r2, r3, r0)
            return r0
        L1d8:
            if (r7 == 0) goto L1e1
            if (r18 != 0) goto L1e1
            if (r13 == 0) goto L1e1
            r13.stop()     // Catch: java.lang.Throwable -> L1e1
        L1e1:
            if (r13 == 0) goto L1e6
            r13.release()     // Catch: java.lang.Throwable -> L1e6
        L1e6:
            if (r9 == 0) goto L1eb
            r9.release()     // Catch: java.lang.Throwable -> L1eb
        L1eb:
            if (r15 == 0) goto L1f0
            r15.release()     // Catch: java.lang.Throwable -> L1f0
        L1f0:
            throw r0
        L1f1:
            java.lang.String r0 = "音频文件不存在或为空"
            java.io.File r0 = r1.m4641(r2, r3, r0)
            return r0
    }

    /* JADX INFO: renamed from: Ξ */
    public final p000.lu0 m4639(java.lang.Object r30) {
            r29 = this;
            r0 = r30
            java.lang.String r1 = "uniqueId"
            java.lang.String r2 = "id"
            r3 = 0
            if (r0 != 0) goto La
            return r3
        La:
            java.lang.Integer r4 = m4607(r0)     // Catch: java.lang.Throwable -> L16
            if (r4 == 0) goto L19
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L16
        L14:
            r6 = r4
            goto L1b
        L16:
            r0 = move-exception
            goto L3f5
        L19:
            r4 = -1
            goto L14
        L1b:
            java.util.List r4 = m4626(r0)     // Catch: java.lang.Throwable -> L16
            java.util.Iterator r5 = r4.iterator()     // Catch: java.lang.Throwable -> L16
        L23:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Throwable -> L16
            if (r7 == 0) goto L44
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L16
            java.lang.Object r9 = m4632(r7)     // Catch: java.lang.Throwable -> L16
            if (r9 != 0) goto L34
            goto L40
        L34:
            java.util.List r9 = m4624(r9)     // Catch: java.lang.Throwable -> L16
            java.lang.String r9 = m4609(r9)     // Catch: java.lang.Throwable -> L16
            if (r9 == 0) goto L40
            r9 = 1
            goto L41
        L40:
            r9 = 0
        L41:
            if (r9 == 0) goto L23
            goto L45
        L44:
            r7 = r3
        L45:
            if (r7 != 0) goto L4b
            java.lang.Object r7 = p000.AbstractC0984xh.m6640(r4)     // Catch: java.lang.Throwable -> L16
        L4b:
            f7 r5 = new f7     // Catch: java.lang.Throwable -> L16
            r9 = 1
            r5.<init>(r9, r4)     // Catch: java.lang.Throwable -> L16
            gp0 r9 = new gp0     // Catch: java.lang.Throwable -> L16
            r10 = r29
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L16
            y30 r5 = p000.us1.m5943(r5, r9)     // Catch: java.lang.Throwable -> L16
            java.lang.Object r5 = p000.us1.m5953(r5)     // Catch: java.lang.Throwable -> L16
            r9 = 59
            if (r6 != r9) goto L67
            java.lang.String r5 = "awemeType=59"
            goto L7f
        L67:
            if (r5 == 0) goto L3f3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16
            r5.<init>()     // Catch: java.lang.Throwable -> L16
            java.lang.String r10 = "awemeType="
            r5.append(r10)     // Catch: java.lang.Throwable -> L16
            r5.append(r6)     // Catch: java.lang.Throwable -> L16
            java.lang.String r10 = " + ImageUrlStruct.video"
            r5.append(r10)     // Catch: java.lang.Throwable -> L16
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L16
        L7f:
            java.lang.String r10 = "desc"
            java.lang.String r11 = "description"
            java.lang.String[] r10 = new java.lang.String[]{r10, r11}     // Catch: java.lang.Throwable -> L16
            java.lang.String r10 = m4635(r0, r10)     // Catch: java.lang.Throwable -> L16
            java.lang.String r11 = ""
            if (r10 != 0) goto L90
            r10 = r11
        L90:
            java.lang.String r12 = "aid"
            java.lang.String[] r12 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L16
            java.lang.String r12 = m4635(r0, r12)     // Catch: java.lang.Throwable -> L16
            java.lang.String r13 = "awemeId"
            java.lang.String[] r13 = new java.lang.String[]{r13}     // Catch: java.lang.Throwable -> L16
            java.lang.String r13 = m4635(r0, r13)     // Catch: java.lang.Throwable -> L16
            java.lang.String[] r14 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L16
            java.lang.String r14 = m4635(r0, r14)     // Catch: java.lang.Throwable -> L16
            java.lang.String r15 = "groupId"
            java.lang.String[] r15 = new java.lang.String[]{r15}     // Catch: java.lang.Throwable -> L16
            java.lang.String r15 = m4635(r0, r15)     // Catch: java.lang.Throwable -> L16
            java.lang.String r16 = "itemId"
            java.lang.String[] r3 = new java.lang.String[]{r16}     // Catch: java.lang.Throwable -> L16
            java.lang.String r3 = m4635(r0, r3)     // Catch: java.lang.Throwable -> L16
            java.lang.String[] r3 = new java.lang.String[]{r12, r13, r14, r15, r3}     // Catch: java.lang.Throwable -> L16
            java.lang.String r3 = m4630(r3)     // Catch: java.lang.Throwable -> L16
            if (r3 != 0) goto L109
            int r3 = java.lang.System.identityHashCode(r0)     // Catch: java.lang.Throwable -> L16
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16
            r12.<init>()     // Catch: java.lang.Throwable -> L16
            r12.append(r10)     // Catch: java.lang.Throwable -> L16
            java.lang.String r13 = "_"
            r12.append(r13)     // Catch: java.lang.Throwable -> L16
            r12.append(r3)     // Catch: java.lang.Throwable -> L16
            java.lang.String r3 = r12.toString()     // Catch: java.lang.Throwable -> L16
            java.lang.String r12 = "MD5"
            java.security.MessageDigest r12 = java.security.MessageDigest.getInstance(r12)     // Catch: java.lang.Throwable -> L16
            java.nio.charset.Charset r13 = p000.AbstractC0547mf.f7105     // Catch: java.lang.Throwable -> L16
            byte[] r3 = r3.getBytes(r13)     // Catch: java.lang.Throwable -> L16
            r3.getClass()     // Catch: java.lang.Throwable -> L16
            byte[] r3 = r12.digest(r3)     // Catch: java.lang.Throwable -> L16
            r3.getClass()     // Catch: java.lang.Throwable -> L16
            gp0 r12 = new gp0     // Catch: java.lang.Throwable -> L16
            r13 = 14
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L16
            java.lang.String r3 = p000.AbstractC0312g7.m2255(r3, r12)     // Catch: java.lang.Throwable -> L16
            r12 = 16
            java.lang.String r3 = p000.q02.m4693(r3, r12)     // Catch: java.lang.Throwable -> L16
        L109:
            java.lang.String r12 = "author"
            java.lang.String[] r12 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L16
            java.lang.Object r12 = m4631(r0, r12)     // Catch: java.lang.Throwable -> L16
            java.lang.String r13 = "authorUserId"
            java.lang.String[] r13 = new java.lang.String[]{r13}     // Catch: java.lang.Throwable -> L16
            java.lang.String r13 = m4635(r0, r13)     // Catch: java.lang.Throwable -> L16
            java.lang.String r14 = "uid"
            java.lang.String[] r14 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L16
            java.lang.String r14 = m4635(r12, r14)     // Catch: java.lang.Throwable -> L16
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = m4635(r12, r2)     // Catch: java.lang.Throwable -> L16
            java.lang.String[] r2 = new java.lang.String[]{r13, r14, r2}     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = m4630(r2)     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L144
            boolean r13 = m4600(r2)     // Catch: java.lang.Throwable -> L16
            if (r13 == 0) goto L141
            r13 = r2
            goto L142
        L141:
            r13 = 0
        L142:
            if (r13 != 0) goto L145
        L144:
            r13 = r11
        L145:
            java.lang.String r14 = "secUid"
            java.lang.String[] r14 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L16
            java.lang.String r14 = m4635(r12, r14)     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L158
            boolean r15 = m4600(r2)     // Catch: java.lang.Throwable -> L16
            if (r15 != 0) goto L158
            goto L159
        L158:
            r2 = 0
        L159:
            java.lang.String[] r15 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L16
            java.lang.String r15 = m4635(r12, r15)     // Catch: java.lang.Throwable -> L16
            java.lang.String[] r2 = new java.lang.String[]{r14, r2, r15}     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = m4630(r2)     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L16c
            r2 = r11
        L16c:
            java.lang.String r14 = "nickname"
            java.lang.String[] r14 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L16
            java.lang.String r14 = m4635(r12, r14)     // Catch: java.lang.Throwable -> L16
            java.lang.String r15 = "nickName"
            java.lang.String[] r15 = new java.lang.String[]{r15}     // Catch: java.lang.Throwable -> L16
            java.lang.String r15 = m4635(r12, r15)     // Catch: java.lang.Throwable -> L16
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = m4635(r12, r1)     // Catch: java.lang.Throwable -> L16
            java.lang.String r16 = "shortId"
            java.lang.String[] r8 = new java.lang.String[]{r16}     // Catch: java.lang.Throwable -> L16
            java.lang.String r8 = m4635(r12, r8)     // Catch: java.lang.Throwable -> L16
            java.lang.String[] r1 = new java.lang.String[]{r14, r15, r1, r8}     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = m4630(r1)     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L19e
            r12 = r11
            goto L19f
        L19e:
            r12 = r1
        L19f:
            java.lang.String r1 = "createTime"
            java.lang.String r8 = "createTimeStamp"
            java.lang.String[] r1 = new java.lang.String[]{r1, r8}     // Catch: java.lang.Throwable -> L16
            java.lang.Long r1 = m4634(r0, r1)     // Catch: java.lang.Throwable -> L16
            r14 = 0
            if (r1 == 0) goto L1b4
            long r18 = r1.longValue()     // Catch: java.lang.Throwable -> L16
            goto L1b6
        L1b4:
            r18 = r14
        L1b6:
            java.lang.String r1 = "duration"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L16
            java.lang.Long r1 = m4634(r0, r1)     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L1c6
            long r14 = r1.longValue()     // Catch: java.lang.Throwable -> L16
        L1c6:
            r15 = r14
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L16
            r1.<init>()     // Catch: java.lang.Throwable -> L16
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L16
            r8.<init>()     // Catch: java.lang.Throwable -> L16
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L16
            r11.<init>()     // Catch: java.lang.Throwable -> L16
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L16
            r14.<init>()     // Catch: java.lang.Throwable -> L16
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L16
            r9.<init>()     // Catch: java.lang.Throwable -> L16
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L16
            r21 = 0
        L1e6:
            boolean r17 = r4.hasNext()     // Catch: java.lang.Throwable -> L16
            r27 = r2
            if (r17 == 0) goto L27a
            int r17 = r21 + 1
            java.lang.Object r20 = r4.next()     // Catch: java.lang.Throwable -> L16
            java.lang.Object r22 = m4632(r20)     // Catch: java.lang.Throwable -> L16
            jz r23 = p000.C0450jz.f5672     // Catch: java.lang.Throwable -> L16
            if (r22 == 0) goto L21a
            java.util.List r2 = m4624(r22)     // Catch: java.lang.Throwable -> L16
            p000.AbstractC0984xh.m6660(r11, r2)     // Catch: java.lang.Throwable -> L16
            r22 = r2
            java.lang.String r2 = m4609(r22)     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L215
            boolean r23 = p000.q02.m4671(r2)     // Catch: java.lang.Throwable -> L16
            if (r23 == 0) goto L212
            goto L215
        L212:
            r1.add(r2)     // Catch: java.lang.Throwable -> L16
        L215:
            r23 = r22
            r22 = r2
            goto L21c
        L21a:
            r22 = 0
        L21c:
            java.util.List r2 = m4622(r20)     // Catch: java.lang.Throwable -> L16
            p000.AbstractC0984xh.m6660(r14, r2)     // Catch: java.lang.Throwable -> L16
            r20 = r2
            java.lang.String r2 = m4608(r20)     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L235
            boolean r25 = p000.q02.m4671(r2)     // Catch: java.lang.Throwable -> L16
            if (r25 == 0) goto L232
            goto L235
        L232:
            r8.add(r2)     // Catch: java.lang.Throwable -> L16
        L235:
            if (r22 == 0) goto L23d
            boolean r25 = p000.q02.m4671(r22)     // Catch: java.lang.Throwable -> L16
            if (r25 == 0) goto L240
        L23d:
            r28 = r3
            goto L272
        L240:
            r25 = r20
            mu0 r20 = new mu0     // Catch: java.lang.Throwable -> L16
            java.util.Set r23 = p000.AbstractC0984xh.m6670(r23)     // Catch: java.lang.Throwable -> L16
            r26 = r2
            java.util.List r2 = p000.AbstractC0984xh.m6666(r23)     // Catch: java.lang.Throwable -> L16
            r28 = r3
            r3 = 30
            java.util.List r2 = p000.AbstractC0984xh.m6662(r2, r3)     // Catch: java.lang.Throwable -> L16
            java.util.Set r23 = p000.AbstractC0984xh.m6670(r25)     // Catch: java.lang.Throwable -> L16
            r25 = r2
            java.util.List r2 = p000.AbstractC0984xh.m6666(r23)     // Catch: java.lang.Throwable -> L16
            java.util.List r2 = p000.AbstractC0984xh.m6662(r2, r3)     // Catch: java.lang.Throwable -> L16
            r24 = r26
            r23 = r26
            r26 = r2
            r20.<init>(r21, r22, r23, r24, r25, r26)     // Catch: java.lang.Throwable -> L16
            r2 = r20
            r9.add(r2)     // Catch: java.lang.Throwable -> L16
        L272:
            r21 = r17
            r2 = r27
            r3 = r28
            goto L1e6
        L27a:
            r28 = r3
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L2a7
            r2 = 59
            if (r6 != r2) goto L2a7
            java.lang.String r2 = "video"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L16
            java.lang.Object r2 = m4631(r0, r2)     // Catch: java.lang.Throwable -> L16
            java.util.List r2 = m4624(r2)     // Catch: java.lang.Throwable -> L16
            p000.AbstractC0984xh.m6660(r11, r2)     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = m4609(r2)     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L2a7
            boolean r3 = p000.q02.m4671(r2)     // Catch: java.lang.Throwable -> L16
            if (r3 == 0) goto L2a4
            goto L2a7
        L2a4:
            r1.add(r2)     // Catch: java.lang.Throwable -> L16
        L2a7:
            java.util.List r2 = p000.AbstractC0984xh.m6666(r11)     // Catch: java.lang.Throwable -> L16
            java.util.List r3 = p000.AbstractC0984xh.m6666(r14)     // Catch: java.lang.Throwable -> L16
            java.util.Iterator r4 = r9.iterator()     // Catch: java.lang.Throwable -> L16
        L2b3:
            boolean r11 = r4.hasNext()     // Catch: java.lang.Throwable -> L16
            if (r11 == 0) goto L2cb
            java.lang.Object r11 = r4.next()     // Catch: java.lang.Throwable -> L16
            r14 = r11
            mu0 r14 = (p000.mu0) r14     // Catch: java.lang.Throwable -> L16
            java.lang.String r14 = r14.f7276     // Catch: java.lang.Throwable -> L16
            if (r14 == 0) goto L2b3
            boolean r14 = p000.q02.m4671(r14)     // Catch: java.lang.Throwable -> L16
            if (r14 == 0) goto L2cc
            goto L2b3
        L2cb:
            r11 = 0
        L2cc:
            mu0 r11 = (p000.mu0) r11     // Catch: java.lang.Throwable -> L16
            if (r11 == 0) goto L2d8
            java.lang.String r4 = r11.f7276     // Catch: java.lang.Throwable -> L16
            if (r4 != 0) goto L2d5
            goto L2d8
        L2d5:
            r17 = r4
            goto L2e5
        L2d8:
            java.lang.Object r4 = p000.AbstractC0984xh.m6640(r1)     // Catch: java.lang.Throwable -> L16
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L16
            if (r4 != 0) goto L2d5
            java.lang.String r4 = m4609(r2)     // Catch: java.lang.Throwable -> L16
            goto L2d5
        L2e5:
            if (r11 == 0) goto L2eb
            java.lang.String r4 = r11.f7277     // Catch: java.lang.Throwable -> L16
            if (r4 != 0) goto L2f7
        L2eb:
            java.lang.Object r4 = p000.AbstractC0984xh.m6640(r8)     // Catch: java.lang.Throwable -> L16
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L16
            if (r4 != 0) goto L2f7
            java.lang.String r4 = m4608(r3)     // Catch: java.lang.Throwable -> L16
        L2f7:
            java.lang.String r14 = "cover"
            java.lang.String r0 = "_cover"
            java.lang.String[] r0 = new java.lang.String[]{r14, r0}     // Catch: java.lang.Throwable -> L16
            java.lang.Object r0 = m4631(r7, r0)     // Catch: java.lang.Throwable -> L16
            java.lang.String r14 = "originCover"
            r29 = r1
            java.lang.String r1 = "_originCover"
            java.lang.String[] r1 = new java.lang.String[]{r14, r1}     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = m4631(r7, r1)     // Catch: java.lang.Throwable -> L16
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}     // Catch: java.lang.Throwable -> L16
            java.util.List r0 = m4623(r0)     // Catch: java.lang.Throwable -> L16
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L16
            r1.<init>()     // Catch: java.lang.Throwable -> L16
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L16
        L322:
            boolean r14 = r0.hasNext()     // Catch: java.lang.Throwable -> L16
            if (r14 == 0) goto L33a
            java.lang.Object r14 = r0.next()     // Catch: java.lang.Throwable -> L16
            r20 = r14
            java.lang.String r20 = (java.lang.String) r20     // Catch: java.lang.Throwable -> L16
            boolean r20 = m4606(r20)     // Catch: java.lang.Throwable -> L16
            if (r20 != 0) goto L322
            r1.add(r14)     // Catch: java.lang.Throwable -> L16
            goto L322
        L33a:
            if (r11 == 0) goto L340
            java.lang.String r0 = r11.f7278     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L347
        L340:
            java.lang.String r0 = m4608(r1)     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L347
            r0 = r4
        L347:
            java.lang.Class r1 = r30.getClass()     // Catch: java.lang.Throwable -> L16
            java.lang.String r20 = r1.getName()     // Catch: java.lang.Throwable -> L16
            if (r7 == 0) goto L35c
            java.lang.Class r1 = r7.getClass()     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L16
            r21 = r1
            goto L35e
        L35c:
            r21 = 0
        L35e:
            java.util.List r1 = p000.AbstractC0984xh.m6666(r29)     // Catch: java.lang.Throwable -> L16
            java.util.ArrayList r1 = p000.AbstractC0984xh.m6651(r1, r2)     // Catch: java.lang.Throwable -> L16
            java.util.Set r1 = p000.AbstractC0984xh.m6670(r1)     // Catch: java.lang.Throwable -> L16
            java.util.List r1 = p000.AbstractC0984xh.m6666(r1)     // Catch: java.lang.Throwable -> L16
            r2 = 30
            java.util.List r22 = p000.AbstractC0984xh.m6662(r1, r2)     // Catch: java.lang.Throwable -> L16
            java.util.List r1 = p000.AbstractC0984xh.m6666(r8)     // Catch: java.lang.Throwable -> L16
            java.util.ArrayList r1 = p000.AbstractC0984xh.m6651(r1, r3)     // Catch: java.lang.Throwable -> L16
            java.util.Set r1 = p000.AbstractC0984xh.m6670(r1)     // Catch: java.lang.Throwable -> L16
            java.util.List r1 = p000.AbstractC0984xh.m6666(r1)     // Catch: java.lang.Throwable -> L16
            java.util.List r23 = p000.AbstractC0984xh.m6662(r1, r2)     // Catch: java.lang.Throwable -> L16
            java.util.Set r1 = p000.AbstractC0984xh.m6670(r29)     // Catch: java.lang.Throwable -> L16
            java.util.List r24 = p000.AbstractC0984xh.m6666(r1)     // Catch: java.lang.Throwable -> L16
            java.util.Set r1 = p000.AbstractC0984xh.m6670(r8)     // Catch: java.lang.Throwable -> L16
            java.util.List r25 = p000.AbstractC0984xh.m6666(r1)     // Catch: java.lang.Throwable -> L16
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L16
            r1.<init>()     // Catch: java.lang.Throwable -> L16
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L16
            r2.<init>()     // Catch: java.lang.Throwable -> L16
            java.util.Iterator r3 = r9.iterator()     // Catch: java.lang.Throwable -> L16
        L3a6:
            boolean r7 = r3.hasNext()     // Catch: java.lang.Throwable -> L16
            if (r7 == 0) goto L3de
            java.lang.Object r7 = r3.next()     // Catch: java.lang.Throwable -> L16
            r8 = r7
            mu0 r8 = (p000.mu0) r8     // Catch: java.lang.Throwable -> L16
            java.lang.String r9 = r8.f7276     // Catch: java.lang.Throwable -> L16
            if (r9 != 0) goto L3d4
            java.util.List r9 = r8.f7279     // Catch: java.lang.Throwable -> L16
            java.lang.Object r9 = p000.AbstractC0984xh.m6640(r9)     // Catch: java.lang.Throwable -> L16
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L16
            if (r9 != 0) goto L3d4
            int r8 = r8.f7275     // Catch: java.lang.Throwable -> L16
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16
            r9.<init>()     // Catch: java.lang.Throwable -> L16
            java.lang.String r11 = "page_"
            r9.append(r11)     // Catch: java.lang.Throwable -> L16
            r9.append(r8)     // Catch: java.lang.Throwable -> L16
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L16
        L3d4:
            boolean r8 = r1.add(r9)     // Catch: java.lang.Throwable -> L16
            if (r8 == 0) goto L3a6
            r2.add(r7)     // Catch: java.lang.Throwable -> L16
            goto L3a6
        L3de:
            r7 = r5
            lu0 r5 = new lu0     // Catch: java.lang.Throwable -> L16
            r26 = r2
            r9 = r10
            r10 = r13
            r13 = r18
            r11 = r27
            r8 = r28
            r19 = r0
            r18 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch: java.lang.Throwable -> L16
            goto L3fa
        L3f3:
            r5 = 0
            goto L3fa
        L3f5:
            eo1 r5 = new eo1
            r5.<init>(r0)
        L3fa:
            java.lang.Throwable r0 = p000.fo1.m2190(r5)
            if (r0 != 0) goto L402
            r3 = r5
            goto L418
        L402:
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "parseAweme 失败: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            m4602(r0)
            r3 = 0
        L418:
            lu0 r3 = (p000.lu0) r3
            return r3
    }

    /* JADX INFO: renamed from: Σ */
    public final void m4640(java.io.File r19, java.lang.String r20) {
            r18 = this;
            r1 = r20
            java.lang.String r2 = "视频可播放校验失败: "
            java.lang.String r0 = "视频无有效尺寸 width="
            java.lang.String r3 = "VIDEO-VALID ok, mime="
            java.lang.String r4 = "无法解码视频首帧: "
            java.lang.String r5 = "视频无有效时长 duration="
            java.lang.String r6 = "文件不是视频 mime="
            boolean r7 = r19.exists()
            if (r7 == 0) goto L17d
            long r7 = r19.length()
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L17d
            android.media.MediaMetadataRetriever r7 = new android.media.MediaMetadataRetriever
            r7.<init>()
            java.lang.String r8 = r19.getAbsolutePath()     // Catch: java.lang.Throwable -> L45
            r7.setDataSource(r8)     // Catch: java.lang.Throwable -> L45
            r8 = 12
            java.lang.String r8 = r7.extractMetadata(r8)     // Catch: java.lang.Throwable -> L45
            r11 = 9
            java.lang.String r11 = r7.extractMetadata(r11)     // Catch: java.lang.Throwable -> L45
            r12 = 10
            if (r11 == 0) goto L48
            java.lang.Long r11 = p000.x02.m6489(r11, r12)     // Catch: java.lang.Throwable -> L45
            if (r11 == 0) goto L48
            long r13 = r11.longValue()     // Catch: java.lang.Throwable -> L45
            goto L49
        L45:
            r0 = move-exception
            goto L162
        L48:
            r13 = r9
        L49:
            r11 = 18
            java.lang.String r11 = r7.extractMetadata(r11)     // Catch: java.lang.Throwable -> L45
            r15 = 0
            if (r11 == 0) goto L5f
            java.lang.Integer r11 = p000.x02.m6487(r11, r12)     // Catch: java.lang.Throwable -> L45
            if (r11 == 0) goto L5f
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L45
        L5c:
            r16 = r9
            goto L61
        L5f:
            r11 = r15
            goto L5c
        L61:
            r9 = 19
            java.lang.String r9 = r7.extractMetadata(r9)     // Catch: java.lang.Throwable -> L45
            if (r9 == 0) goto L74
            java.lang.Integer r9 = p000.x02.m6487(r9, r12)     // Catch: java.lang.Throwable -> L45
            if (r9 == 0) goto L74
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L45
            goto L75
        L74:
            r9 = r15
        L75:
            if (r8 == 0) goto L91
            boolean r10 = p000.q02.m4671(r8)     // Catch: java.lang.Throwable -> L45
            if (r10 == 0) goto L7e
            goto L91
        L7e:
            java.lang.String r10 = "video/"
            boolean r10 = p000.x02.m6485(r8, r10, r15)     // Catch: java.lang.Throwable -> L45
            if (r10 == 0) goto L87
            goto L91
        L87:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = r6.concat(r8)     // Catch: java.lang.Throwable -> L45
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L45
            throw r0     // Catch: java.lang.Throwable -> L45
        L91:
            int r6 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r6 <= 0) goto L150
            if (r11 <= 0) goto L136
            if (r9 <= 0) goto L136
            r0 = 2
            r5 = r16
            android.graphics.Bitmap r0 = r7.getFrameAtTime(r5, r0)     // Catch: java.lang.Throwable -> La1
            goto La8
        La1:
            r0 = move-exception
            eo1 r5 = new eo1     // Catch: java.lang.Throwable -> L45
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L45
            r0 = r5
        La8:
            boolean r5 = r0 instanceof p000.eo1     // Catch: java.lang.Throwable -> L45
            if (r5 == 0) goto Lad
            r0 = 0
        Lad:
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto Lcb
            r5 = 300000(0x493e0, double:1.482197E-318)
            r0 = 3
            android.graphics.Bitmap r0 = r7.getFrameAtTime(r5, r0)     // Catch: java.lang.Throwable -> Lba
            goto Lc1
        Lba:
            r0 = move-exception
            eo1 r5 = new eo1     // Catch: java.lang.Throwable -> L45
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L45
            r0 = r5
        Lc1:
            boolean r5 = r0 instanceof p000.eo1     // Catch: java.lang.Throwable -> L45
            if (r5 == 0) goto Lc7
            r6 = 0
            goto Lc8
        Lc7:
            r6 = r0
        Lc8:
            r0 = r6
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Throwable -> L45
        Lcb:
            java.lang.String r5 = "..."
            r6 = 140(0x8c, float:1.96E-43)
            if (r0 == 0) goto L11d
            boolean r4 = r0.isRecycled()     // Catch: java.lang.Throwable -> L45
            if (r4 != 0) goto Lda
            r0.recycle()     // Catch: java.lang.Throwable -> L45
        Lda:
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L45
            if (r0 > r6) goto Le2
            r0 = r1
            goto Lea
        Le2:
            java.lang.String r0 = p000.q02.m4693(r1, r6)     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = r0.concat(r5)     // Catch: java.lang.Throwable -> L45
        Lea:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L45
            r1.append(r8)     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = ", duration="
            r1.append(r3)     // Catch: java.lang.Throwable -> L45
            r1.append(r13)     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = "ms, size="
            r1.append(r3)     // Catch: java.lang.Throwable -> L45
            r1.append(r11)     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = "x"
            r1.append(r3)     // Catch: java.lang.Throwable -> L45
            r1.append(r9)     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = ", url="
            r1.append(r3)     // Catch: java.lang.Throwable -> L45
            r1.append(r0)     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L45
            m4602(r0)     // Catch: java.lang.Throwable -> L45
            r7.release()     // Catch: java.lang.Throwable -> L11c
        L11c:
            return
        L11d:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L45
            int r3 = r1.length()     // Catch: java.lang.Throwable -> L45
            if (r3 > r6) goto L126
            goto L12e
        L126:
            java.lang.String r1 = p000.q02.m4693(r1, r6)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = r1.concat(r5)     // Catch: java.lang.Throwable -> L45
        L12e:
            java.lang.String r1 = r4.concat(r1)     // Catch: java.lang.Throwable -> L45
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L45
            throw r0     // Catch: java.lang.Throwable -> L45
        L136:
            java.lang.Exception r1 = new java.lang.Exception     // Catch: java.lang.Throwable -> L45
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L45
            r3.append(r11)     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = " height="
            r3.append(r0)     // Catch: java.lang.Throwable -> L45
            r3.append(r9)     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L45
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L45
            throw r1     // Catch: java.lang.Throwable -> L45
        L150:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L45
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L45
            r1.append(r13)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L45
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L45
            throw r0     // Catch: java.lang.Throwable -> L45
        L162:
            java.lang.Exception r1 = new java.lang.Exception     // Catch: java.lang.Throwable -> L178
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L178
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L178
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L178
            r3.append(r0)     // Catch: java.lang.Throwable -> L178
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L178
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L178
            throw r1     // Catch: java.lang.Throwable -> L178
        L178:
            r0 = move-exception
            r7.release()     // Catch: java.lang.Throwable -> L17c
        L17c:
            throw r0
        L17d:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "视频文件为空"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: μ */
    public final java.io.File m4641(java.io.File r3, java.io.File r4, java.lang.String r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MUX-FALLBACK "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = "，改用无音频视频合成动图"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            m4602(r5)
            java.lang.String r5 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L27
            boolean r5 = p000.ln0.m3626(r5, r0)     // Catch: java.lang.Throwable -> L27
            if (r5 != 0) goto L27
            r4.delete()     // Catch: java.lang.Throwable -> L27
        L27:
            java.lang.String r4 = "no-audio-fallback"
            r2.m4640(r3, r4)     // Catch: java.lang.Throwable -> L2d
            goto L44
        L2d:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "MUX-FALLBACK-FAIL 原视频不可用，无法无音频兜底: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            m4602(r2)
            r3 = 0
        L44:
            return r3
    }
}
