package k8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final java.util.regex.Pattern f7404h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final java.util.regex.Pattern f7405i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final java.util.regex.Pattern f7406j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final java.util.regex.Pattern f7407k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final java.util.regex.Pattern f7408l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final java.util.regex.Pattern f7409m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final java.util.regex.Pattern f7410n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final java.util.regex.Pattern f7411o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f7412p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f7413q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final java.util.concurrent.ExecutorService f7414r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final java.util.concurrent.ScheduledExecutorService f7415s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f7416t = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h.Hchat.dexkit.DexFinder f7417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m8.c f7418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g8.a f7419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g8.i f7420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k8.s f7421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f8.c f7422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f7423g;

    static {
            java.lang.String r0 = "<appmsg\\b[^>]*\\bappid\\s*=\\s*([\"'])(.*?)\\1"
            r1 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            k8.g.f7404h = r0
            java.lang.String r0 = "<appid>\\s*(?:<!\\[CDATA\\[)?(.*?)(?:]]>)?\\s*</appid>"
            r2 = 34
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r2)
            k8.g.f7405i = r0
            java.lang.String r0 = "<sourcedisplayname>\\s*(?:<!\\[CDATA\\[)?(.*?)(?:]]>)?\\s*</sourcedisplayname>"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r2)
            k8.g.f7406j = r0
            java.lang.String r0 = "<msgsource\\b[^>]*>.*?</msgsource>"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r2)
            k8.g.f7407k = r0
            java.lang.String r0 = "<tpthumburl>\\s*(?:<!\\[CDATA\\[)?(.*?)(?:]]>)?\\s*</tpthumburl>"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r2)
            k8.g.f7408l = r0
            java.lang.String r0 = "<weappiconurl>\\s*(?:<!\\[CDATA\\[)?(.*?)(?:]]>)?\\s*</weappiconurl>"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r2)
            k8.g.f7409m = r0
            java.lang.String r0 = "<thumburl>\\s*(?:<!\\[CDATA\\[)?(.*?)(?:]]>)?\\s*</thumburl>"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r2)
            k8.g.f7410n = r0
            java.lang.String r0 = "<cdnthumburl>\\s*(?:<!\\[CDATA\\[)?(.*?)(?:]]>)?\\s*</cdnthumburl>"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r2)
            k8.g.f7411o = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            k8.g.f7412p = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            k8.g.f7413q = r0
            c9.q r0 = new c9.q
            r2 = 17
            r0.<init>(r2)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r1, r0)
            k8.g.f7414r = r0
            c9.q r0 = new c9.q
            r1 = 18
            r0.<init>(r1)
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(r0)
            k8.g.f7415s = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            k8.g.f7416t = r0
            return
    }

    public g(h.Hchat.dexkit.DexFinder r1, m8.c r2, g8.a r3, g8.i r4, k8.s r5, f8.c r6, i8.f r7) {
            r0 = this;
            r0.<init>()
            r0.f7417a = r1
            r0.f7418b = r2
            r0.f7419c = r3
            r0.f7420d = r4
            r0.f7421e = r5
            r0.f7422f = r6
            return
    }

    public static java.lang.String A(java.lang.String r2) {
            if (r2 != 0) goto L5
            java.lang.String r2 = ""
            return r2
        L5:
            java.lang.String r2 = r2.trim()
            java.lang.String r0 = "<![CDATA["
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L20
            java.lang.String r0 = "]]>"
            boolean r0 = r2.endsWith(r0)
            if (r0 == 0) goto L20
            r0 = 9
            r1 = 3
            java.lang.String r2 = wb.en.f(r1, r0, r2)
        L20:
            java.lang.String r2 = r2.trim()
            return r2
    }

    public static void B(java.lang.Object r4, java.lang.Object r5, java.lang.String... r6) {
            int r0 = r6.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L22
            r2 = r6[r1]
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto Ld
            goto L1f
        Ld:
            java.lang.Class r3 = r4.getClass()     // Catch: java.lang.Throwable -> L1f
            java.lang.reflect.Field r2 = h.Hchat.utils.KavaReflector.findFieldRecursive(r3, r2)     // Catch: java.lang.Throwable -> L1f
            if (r2 != 0) goto L18
            goto L1f
        L18:
            boolean r2 = h.Hchat.utils.KavaReflector.writeField(r2, r4, r5)     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L1f
            goto L22
        L1f:
            int r1 = r1 + 1
            goto L2
        L22:
            return
    }

    public static java.util.HashMap a(java.util.ArrayList r5) {
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 1
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "<![CDATA["
            r1.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.util.Iterator r5 = r5.iterator()
        L16:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r5.next()
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r2.length()
            if (r4 <= 0) goto L2d
            r4 = 44
            r2.append(r4)
        L2d:
            r2.append(r3)
            goto L16
        L31:
            java.lang.String r5 = r2.toString()
            r1.append(r5)
            java.lang.String r5 = "]]>"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "atuserlist"
            r0.put(r1, r5)
            return r0
    }

    public static java.lang.String b() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "<deviceinfo><MANUFACTURER name=\""
            r0.<init>(r1)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r1 = g(r1)
            r0.append(r1)
            java.lang.String r1 = "\"><MODEL name=\""
            r0.append(r1)
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r1 = g(r1)
            r0.append(r1)
            java.lang.String r1 = "\"><VERSION_RELEASE name=\""
            r0.append(r1)
            java.lang.String r1 = android.os.Build.VERSION.RELEASE
            java.lang.String r1 = g(r1)
            r0.append(r1)
            java.lang.String r1 = "\"><VERSION_INCREMENTAL name=\""
            r0.append(r1)
            java.lang.String r1 = android.os.Build.VERSION.INCREMENTAL
            java.lang.String r1 = g(r1)
            r0.append(r1)
            java.lang.String r1 = "\"><DISPLAY name=\""
            r0.append(r1)
            java.lang.String r1 = android.os.Build.DISPLAY
            java.lang.String r1 = g(r1)
            r0.append(r1)
            java.lang.String r1 = "\"></DISPLAY></VERSION_INCREMENTAL></VERSION_RELEASE></MODEL></MANUFACTURER></deviceinfo>"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static void d(java.lang.String r3, java.lang.String r4) {
            java.lang.String r3 = q(r3, r4)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto Lb
            goto L33
        Lb:
            java.util.concurrent.ConcurrentHashMap r4 = k8.g.f7416t
            java.lang.Object r0 = r4.get(r3)
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            if (r0 == 0) goto L33
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L1c
            goto L33
        L1c:
            r1 = 0
            java.lang.Object r2 = r0.remove(r1)
            k8.f r2 = (k8.f) r2
            java.util.concurrent.ScheduledFuture r2 = r2.f7403a
            if (r2 == 0) goto L2a
            r2.cancel(r1)
        L2a:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L33
            r4.remove(r3, r0)
        L33:
            return
    }

    public static byte[] f(java.lang.String r9) {
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.getThreadPolicy()
            r1 = 0
            android.os.StrictMode$ThreadPolicy$Builder r2 = new android.os.StrictMode$ThreadPolicy$Builder     // Catch: java.lang.Throwable -> L82
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L82
            android.os.StrictMode$ThreadPolicy$Builder r2 = r2.permitNetwork()     // Catch: java.lang.Throwable -> L82
            android.os.StrictMode$ThreadPolicy r2 = r2.build()     // Catch: java.lang.Throwable -> L82
            android.os.StrictMode.setThreadPolicy(r2)     // Catch: java.lang.Throwable -> L82
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L82
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L82
            java.net.URLConnection r9 = r2.openConnection()     // Catch: java.lang.Throwable -> L82
            java.net.HttpURLConnection r9 = (java.net.HttpURLConnection) r9     // Catch: java.lang.Throwable -> L82
            r2 = 5000(0x1388, float:7.006E-42)
            r9.setConnectTimeout(r2)     // Catch: java.lang.Throwable -> L79
            r2 = 8000(0x1f40, float:1.121E-41)
            r9.setReadTimeout(r2)     // Catch: java.lang.Throwable -> L79
            r2 = 1
            r9.setInstanceFollowRedirects(r2)     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = "User-Agent"
            java.lang.String r3 = "MicroMessenger Client"
            r9.setRequestProperty(r2, r3)     // Catch: java.lang.Throwable -> L79
            int r2 = r9.getResponseCode()     // Catch: java.lang.Throwable -> L79
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 < r3) goto L7b
            r3 = 300(0x12c, float:4.2E-43)
            if (r2 < r3) goto L42
            goto L7b
        L42:
            java.io.InputStream r2 = r9.getInputStream()     // Catch: java.lang.Throwable -> L79
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L84
            r3.<init>()     // Catch: java.lang.Throwable -> L84
            r4 = 8192(0x2000, float:1.148E-41)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L84
            r5 = 0
            r6 = r5
        L51:
            int r7 = r2.read(r4)     // Catch: java.lang.Throwable -> L84
            r8 = -1
            if (r7 == r8) goto L6b
            int r6 = r6 + r7
            r8 = 524288(0x80000, float:7.34684E-40)
            if (r6 <= r8) goto L67
            r2.close()     // Catch: java.lang.Throwable -> L60
        L60:
            r9.disconnect()
        L63:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L8c
            goto L8c
        L67:
            r3.write(r4, r5, r7)     // Catch: java.lang.Throwable -> L84
            goto L51
        L6b:
            byte[] r1 = r3.toByteArray()     // Catch: java.lang.Throwable -> L84
            r2.close()     // Catch: java.lang.Throwable -> L72
        L72:
            r9.disconnect()
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L78
        L78:
            return r1
        L79:
            r2 = r1
            goto L84
        L7b:
            r9.disconnect()
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L81
        L81:
            return r1
        L82:
            r9 = r1
            r2 = r9
        L84:
            if (r2 == 0) goto L89
            r2.close()     // Catch: java.lang.Throwable -> L89
        L89:
            if (r9 == 0) goto L63
            goto L60
        L8c:
            return r1
    }

    public static java.lang.String g(java.lang.String r2) {
            if (r2 != 0) goto L5
            java.lang.String r2 = ""
            return r2
        L5:
            java.lang.String r0 = "&"
            java.lang.String r1 = "&amp;"
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r0 = "<"
            java.lang.String r1 = "&lt;"
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r0 = ">"
            java.lang.String r1 = "&gt;"
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r0 = "\""
            java.lang.String r1 = "&quot;"
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r0 = "'"
            java.lang.String r1 = "&apos;"
            java.lang.String r2 = r2.replace(r0, r1)
            return r2
    }

    public static java.lang.String h(java.lang.String r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L7
            goto L50
        L7:
            java.util.regex.Pattern r0 = k8.g.f7407k     // Catch: java.lang.Throwable -> L50
            java.util.regex.Matcher r0 = r0.matcher(r5)     // Catch: java.lang.Throwable -> L50
        Ld:
            boolean r1 = r0.find()     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L50
            int r1 = r0.start()     // Catch: java.lang.Throwable -> L50
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L50
            r3 = 0
            if (r2 != 0) goto L43
            if (r1 > 0) goto L21
            goto L43
        L21:
            int r2 = r5.length()     // Catch: java.lang.Throwable -> L50
            int r1 = java.lang.Math.min(r1, r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = r5.substring(r3, r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = r1.toLowerCase()     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = "<refermsg"
            int r2 = r1.lastIndexOf(r2)     // Catch: java.lang.Throwable -> L50
            if (r2 >= 0) goto L3a
            goto L43
        L3a:
            java.lang.String r4 = "</refermsg>"
            int r1 = r1.lastIndexOf(r4)     // Catch: java.lang.Throwable -> L50
            if (r1 >= r2) goto L43
            goto Ld
        L43:
            java.lang.String r5 = r0.group(r3)     // Catch: java.lang.Throwable -> L50
            java.lang.String r5 = r5.trim()     // Catch: java.lang.Throwable -> L50
            java.lang.String r5 = A(r5)     // Catch: java.lang.Throwable -> L50
            return r5
        L50:
            java.lang.String r5 = ""
            return r5
    }

    public static java.lang.String i(java.lang.Object r8, java.lang.String r9, java.lang.String r10, int r11, java.util.Set r12) {
            if (r8 == 0) goto Lfa
            if (r11 >= 0) goto L6
            goto Lfa
        L6:
            if (r12 == 0) goto L13
            boolean r0 = r12.contains(r8)     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L10
            goto Lfa
        L10:
            r12.add(r8)     // Catch: java.lang.Throwable -> L13
        L13:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class r1 = r8.getClass()
        L1c:
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            if (r1 == 0) goto L5b
            if (r1 == r3) goto L5b
            java.util.List r3 = h.Hchat.utils.KavaReflector.declaredFields(r1)
            java.util.Iterator r3 = r3.iterator()
        L2c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L56
            java.lang.Object r4 = r3.next()
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            java.lang.Class r5 = r4.getType()     // Catch: java.lang.Throwable -> L2c
            if (r5 == r2) goto L3f
            goto L2c
        L3f:
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r4, r8)     // Catch: java.lang.Throwable -> L2c
            boolean r5 = r4 instanceof java.lang.String     // Catch: java.lang.Throwable -> L2c
            if (r5 == 0) goto L2c
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L2c
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L2c
            if (r5 != 0) goto L2c
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L2c
            r0.add(r4)     // Catch: java.lang.Throwable -> L2c
            goto L2c
        L56:
            java.lang.Class r1 = r1.getSuperclass()
            goto L1c
        L5b:
            int r1 = r0.size()
            r4 = 3
            r5 = 1
            if (r1 < r4) goto L84
            java.lang.Object r1 = r0.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L84
            r1 = 2
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L84
            r8 = 0
            java.lang.Object r8 = r0.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            return r8
        L84:
            java.lang.Class r0 = r8.getClass()
        L88:
            if (r0 == 0) goto Lfa
            if (r0 == r3) goto Lfa
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredFields(r0)
            java.util.Iterator r1 = r1.iterator()
        L94:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lf5
            java.lang.Object r4 = r1.next()
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            java.lang.Class r6 = r4.getType()     // Catch: java.lang.Throwable -> L94
            if (r6 == 0) goto L94
            boolean r7 = r6.isPrimitive()     // Catch: java.lang.Throwable -> L94
            if (r7 != 0) goto L94
            boolean r7 = r6.isEnum()     // Catch: java.lang.Throwable -> L94
            if (r7 != 0) goto L94
            boolean r7 = r6.isArray()     // Catch: java.lang.Throwable -> L94
            if (r7 == 0) goto Lb9
            goto L94
        Lb9:
            if (r6 == r2) goto L94
            java.lang.Class<java.lang.Number> r7 = java.lang.Number.class
            boolean r7 = r7.isAssignableFrom(r6)     // Catch: java.lang.Throwable -> L94
            if (r7 != 0) goto L94
            java.lang.Class<java.lang.Boolean> r7 = java.lang.Boolean.class
            if (r6 == r7) goto L94
            java.lang.Class<java.lang.Character> r7 = java.lang.Character.class
            if (r6 == r7) goto L94
            java.lang.Class<java.lang.Class> r7 = java.lang.Class.class
            if (r6 == r7) goto L94
            java.lang.Class<java.lang.reflect.Method> r7 = java.lang.reflect.Method.class
            if (r6 == r7) goto L94
            java.lang.Class<java.lang.reflect.Field> r7 = java.lang.reflect.Field.class
            if (r6 == r7) goto L94
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L94
            java.lang.String r7 = "java."
            boolean r6 = r6.startsWith(r7)     // Catch: java.lang.Throwable -> L94
            if (r6 == 0) goto Le4
            goto L94
        Le4:
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r4, r8)     // Catch: java.lang.Throwable -> L94
            int r6 = r11 + (-1)
            java.lang.String r4 = i(r4, r9, r10, r6, r12)     // Catch: java.lang.Throwable -> L94
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L94
            if (r6 != 0) goto L94
            return r4
        Lf5:
            java.lang.Class r0 = r0.getSuperclass()
            goto L88
        Lfa:
            java.lang.String r8 = ""
            return r8
    }

    public static java.lang.String j(java.util.regex.Pattern r1, java.lang.String r2) {
            java.lang.String r0 = ""
            if (r1 == 0) goto L24
            java.util.regex.Matcher r1 = r1.matcher(r2)     // Catch: java.lang.Throwable -> L24
            boolean r2 = r1.find()     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto Lf
            goto L24
        Lf:
            int r2 = r1.groupCount()     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = r1.group(r2)     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L1e
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L24
            goto L1f
        L1e:
            r1 = r0
        L1f:
            java.lang.String r1 = A(r1)     // Catch: java.lang.Throwable -> L24
            return r1
        L24:
            return r0
    }

    public static boolean n(java.lang.Class r2, java.lang.reflect.Method r3) {
            r0 = 0
            if (r3 == 0) goto L23
            if (r2 != 0) goto L6
            goto L23
        L6:
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r3)
            if (r1 != 0) goto Ld
            goto L23
        Ld:
            java.lang.Class r1 = r3.getReturnType()
            if (r1 == r2) goto L14
            goto L23
        L14:
            java.lang.Class[] r2 = r3.getParameterTypes()
            int r3 = r2.length
            r1 = 1
            if (r3 != r1) goto L23
            r2 = r2[r0]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r2 != r3) goto L23
            return r1
        L23:
            return r0
    }

    public static java.lang.String q(java.lang.String r1, java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L2a
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Ld
            goto L2a
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.trim()
            r0.append(r1)
            r1 = 10
            r0.append(r1)
            java.lang.String r1 = r2.trim()
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
        L2a:
            java.lang.String r1 = ""
            return r1
    }

    public static long r(java.lang.Object r5) {
            if (r5 != 0) goto L3
            goto L4b
        L3:
            java.lang.String r0 = "getMsgID"
            java.lang.String r1 = "getId"
            java.lang.String r2 = "getMsgId"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            r1 = 0
            r2 = r1
        Lf:
            r3 = 3
            if (r2 >= r3) goto L28
            r3 = r0[r2]
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.invokeMethod(r5, r3, r4)
            boolean r4 = r3 instanceof java.lang.Number
            if (r4 == 0) goto L25
            java.lang.Number r3 = (java.lang.Number) r3
            long r0 = r3.longValue()
            return r0
        L25:
            int r2 = r2 + 1
            goto Lf
        L28:
            java.lang.String r0 = "msgID"
            java.lang.String r2 = "id"
            java.lang.String r3 = "field_msgId"
            java.lang.String r4 = "msgId"
            java.lang.String[] r0 = new java.lang.String[]{r3, r4, r0, r2}
        L34:
            r2 = 4
            if (r1 >= r2) goto L4b
            r2 = r0[r1]
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r5, r2)
            boolean r3 = r2 instanceof java.lang.Number
            if (r3 == 0) goto L48
            java.lang.Number r2 = (java.lang.Number) r2
            long r0 = r2.longValue()
            return r0
        L48:
            int r1 = r1 + 1
            goto L34
        L4b:
            r0 = 0
            return r0
    }

    public static void t(java.lang.String r6, java.lang.String r7, f8.c r8, f8.g r9) {
            java.lang.String r1 = q(r6, r7)
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            if (r6 == 0) goto Lb
            return
        Lb:
            k8.f r2 = new k8.f
            r2.<init>()
            java.util.concurrent.ConcurrentHashMap r6 = k8.g.f7416t
            com.alibaba.fastjson2.writer.b r7 = new com.alibaba.fastjson2.writer.b
            r0 = 25
            r7.<init>(r0)
            java.lang.Object r6 = r6.computeIfAbsent(r1, r7)
            java.util.concurrent.CopyOnWriteArrayList r6 = (java.util.concurrent.CopyOnWriteArrayList) r6
            r6.add(r2)
            java.util.concurrent.ScheduledExecutorService r6 = k8.g.f7415s
            b9.c r0 = new b9.c
            r5 = 10
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r7 = 2500(0x9c4, double:1.235E-320)
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r6 = r6.schedule(r0, r7, r9)
            r2.f7403a = r6
            return
    }

    public final java.lang.Object[] c(java.lang.reflect.Method r10, java.lang.Object r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
            r9 = this;
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Class[] r10 = r10.getParameterTypes()
            int r1 = r10.length
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r11
            java.util.regex.Pattern r11 = k8.g.f7404h
            java.lang.String r11 = j(r11, r13)
            boolean r3 = android.text.TextUtils.isEmpty(r11)
            if (r3 != 0) goto L1d
            goto L23
        L1d:
            java.util.regex.Pattern r11 = k8.g.f7405i
            java.lang.String r11 = j(r11, r13)
        L23:
            r3 = 1
            r1[r3] = r11
            java.util.regex.Pattern r11 = k8.g.f7406j
            java.lang.String r11 = j(r11, r13)
            r3 = 2
            r1[r3] = r11
            r11 = 3
            r1[r11] = r12
            r11 = 4
            java.lang.String r3 = ""
            r1[r11] = r3
            java.util.regex.Pattern r4 = k8.g.f7408l
            java.lang.String r4 = j(r4, r13)
            java.util.regex.Pattern r5 = k8.g.f7409m
            java.lang.String r5 = j(r5, r13)
            java.util.regex.Pattern r6 = k8.g.f7410n
            java.lang.String r6 = j(r6, r13)
            java.util.regex.Pattern r7 = k8.g.f7411o
            java.lang.String r13 = j(r7, r13)
            java.lang.String[] r13 = new java.lang.String[]{r4, r5, r6, r13}
            r4 = r2
        L54:
            r5 = 0
            if (r4 >= r11) goto Lb8
            r6 = r13[r4]
            if (r6 != 0) goto L5d
            r6 = r3
            goto L8d
        L5d:
            java.lang.String r6 = A(r6)
            java.lang.String r7 = "&amp;"
            java.lang.String r8 = "&"
            java.lang.String r6 = r6.replace(r7, r8)
            java.lang.String r7 = "&lt;"
            java.lang.String r8 = "<"
            java.lang.String r6 = r6.replace(r7, r8)
            java.lang.String r7 = "&gt;"
            java.lang.String r8 = ">"
            java.lang.String r6 = r6.replace(r7, r8)
            java.lang.String r7 = "&quot;"
            java.lang.String r8 = "\""
            java.lang.String r6 = r6.replace(r7, r8)
            java.lang.String r7 = "&apos;"
            java.lang.String r8 = "'"
            java.lang.String r6 = r6.replace(r7, r8)
            java.lang.String r6 = r6.trim()
        L8d:
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L94
            goto Lb5
        L94:
            java.util.concurrent.ConcurrentHashMap r7 = k8.g.f7412p
            java.lang.Object r7 = r7.get(r6)
            byte[] r7 = (byte[]) r7
            if (r7 == 0) goto La2
            int r8 = r7.length
            if (r8 <= 0) goto La2
            goto Lb9
        La2:
            java.util.concurrent.ConcurrentHashMap$KeySetView r5 = k8.g.f7413q
            boolean r5 = r5.add(r6)
            if (r5 != 0) goto Lab
            goto Lb5
        Lab:
            fb.e1 r5 = new fb.e1
            r5.<init>(r9, r6)
            java.util.concurrent.ExecutorService r6 = k8.g.f7414r
            r6.execute(r5)
        Lb5:
            int r4 = r4 + 1
            goto L54
        Lb8:
            r7 = r5
        Lb9:
            r11 = 5
            r1[r11] = r7
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r13 = "Hchat_xml_"
            r11.<init>(r13)
            long r6 = java.lang.System.currentTimeMillis()
            r11.append(r6)
            java.lang.String r11 = r11.toString()
            r13 = 6
            r1[r13] = r11
            r11 = 7
            r1[r11] = r3
            if (r14 == 0) goto Ld7
            goto Ld8
        Ld7:
            r14 = r3
        Ld8:
            r11 = 8
            r1[r11] = r14
            int r11 = r10.length
            r13 = 10
            r14 = 9
            if (r11 != r13) goto Le6
            r1[r14] = r0
            return r1
        Le6:
            int r11 = r10.length
            r4 = 12
            if (r11 != r4) goto L122
            r10 = r10[r14]
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L105
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            java.lang.Class[] r11 = new java.lang.Class[]{r11, r4}     // Catch: java.lang.Throwable -> L105
            java.lang.reflect.Constructor r11 = h.Hchat.utils.KavaReflector.findConstructor(r10, r11)     // Catch: java.lang.Throwable -> L105
            java.lang.Object[] r12 = new java.lang.Object[]{r0, r12}     // Catch: java.lang.Throwable -> L105
            java.lang.Object r11 = h.Hchat.utils.KavaReflector.newInstance(r11, r12)     // Catch: java.lang.Throwable -> L105
            if (r11 == 0) goto L105
        L103:
            r5 = r11
            goto L118
        L105:
            java.lang.Object r11 = h.Hchat.utils.KavaReflector.staticInstance(r10)
            if (r11 == 0) goto L10c
            goto L103
        L10c:
            java.lang.Class[] r11 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L118
            java.lang.reflect.Constructor r10 = h.Hchat.utils.KavaReflector.findConstructor(r10, r11)     // Catch: java.lang.Throwable -> L118
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L118
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.newInstance(r10, r11)     // Catch: java.lang.Throwable -> L118
        L118:
            r1[r14] = r5
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r1[r13] = r10
            r10 = 11
            r1[r10] = r3
        L122:
            return r1
    }

    public final void e(java.lang.String r17, java.lang.String r18, int r19, java.io.Serializable r20) {
            r16 = this;
            r1 = r16
            f8.c r0 = r1.f7422f
            if (r0 == 0) goto L76
            boolean r2 = android.text.TextUtils.isEmpty(r17)
            if (r2 != 0) goto L76
            boolean r2 = android.text.TextUtils.isEmpty(r18)
            if (r2 == 0) goto L13
            goto L76
        L13:
            f8.g r2 = new f8.g     // Catch: java.lang.Throwable -> L4a
            if (r18 != 0) goto L18
            goto L2e
        L18:
            java.lang.String r3 = r18.toLowerCase()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r4 = "<appmsg"
            boolean r4 = r3.contains(r4)     // Catch: java.lang.Throwable -> L4a
            if (r4 == 0) goto L2e
            java.lang.String r4 = "</appmsg>"
            boolean r3 = r3.contains(r4)     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto L2e
            r3 = 1
            goto L2f
        L2e:
            r3 = 0
        L2f:
            if (r3 == 0) goto L34
            r3 = r18
            goto L36
        L34:
            java.lang.String r3 = ""
        L36:
            java.lang.String r7 = java.lang.String.valueOf(r19)     // Catch: java.lang.Throwable -> L4a
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L4a
            r8 = 1000(0x3e8, double:4.94E-321)
            long r8 = r4 / r8
            if (r20 == 0) goto L4c
            java.lang.String r4 = java.lang.String.valueOf(r20)     // Catch: java.lang.Throwable -> L4a
        L48:
            r12 = r4
            goto L4e
        L4a:
            r0 = move-exception
            goto L61
        L4c:
            r4 = 0
            goto L48
        L4e:
            java.lang.String r14 = "local_send"
            r15 = 1
            r10 = 0
            r13 = 0
            r5 = r17
            r4 = r17
            r6 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r10, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L4a
            t(r4, r6, r0, r2)     // Catch: java.lang.Throwable -> L4a
            return
        L61:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "登记本地发送兜底事件失败: "
            r2.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.o(r0)
        L76:
            return
    }

    public final java.lang.Object k(java.lang.Class r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L13
            h.Hchat.dexkit.DexFinder r1 = r2.f7417a
            java.lang.reflect.Method r1 = r1.serviceGetterMethod
            if (r1 != 0) goto La
            goto L13
        La:
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L13
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.invoke(r1, r0, r3)     // Catch: java.lang.Throwable -> L13
            return r3
        L13:
            return r0
    }

    public final void l() {
            r3 = this;
            boolean r0 = r3.f7423g
            if (r0 != 0) goto L21
            h.Hchat.dexkit.DexFinder r0 = r3.f7417a
            java.lang.Class<?> r1 = r0.netQueueClass
            if (r1 != 0) goto L13
            java.util.List<java.lang.Class<?>> r0 = r0.netQueueCandidateClasses
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L13
            goto L21
        L13:
            m8.c r0 = r3.f7418b
            h.Hchat.dexkit.DexFinder r1 = r3.f7417a
            java.lang.Class<?> r2 = r1.netQueueClass
            java.util.List<java.lang.Class<?>> r1 = r1.netQueueCandidateClasses
            r0.c(r2, r1)
            r0 = 1
            r3.f7423g = r0
        L21:
            return
    }

    public final boolean m() {
            r2 = this;
            h.Hchat.dexkit.DexFinder r0 = r2.f7417a
            java.lang.Class<?> r1 = r0.sendTextMsgClass
            if (r1 == 0) goto L10
            java.lang.reflect.Constructor<?> r1 = r0.sendTextMsgCtorLong
            if (r1 != 0) goto Le
            java.lang.reflect.Constructor<?> r0 = r0.sendTextMsgCtorObject
            if (r0 == 0) goto L10
        Le:
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public final void o(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "[WeChatMessageApi] "
            java.lang.String r2 = r0.concat(r2)
            i8.i.f(r2)
            return
    }

    public final java.lang.Object p(java.lang.String r4, java.lang.String r5, int r6, int r7, java.util.HashMap r8) {
            r3 = this;
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            h.Hchat.dexkit.DexFinder r1 = r3.f7417a
            if (r8 == 0) goto L1f
            java.lang.reflect.Constructor<?> r2 = r1.sendTextMsgCtorObject
            if (r2 == 0) goto L1f
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r6, r7, r8}
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.newInstance(r2, r4)
            return r4
        L1f:
            java.lang.reflect.Constructor<?> r2 = r1.sendTextMsgCtorLong
            if (r2 == 0) goto L34
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r6, r7, r0}
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.newInstance(r2, r4)
            return r4
        L34:
            java.lang.reflect.Constructor<?> r2 = r1.sendTextMsgCtorObject
            if (r2 == 0) goto L49
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r6, r7, r8}
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.newInstance(r2, r4)
            return r4
        L49:
            java.lang.Class<?> r1 = r1.sendTextMsgClass
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            if (r8 == 0) goto L56
            goto L57
        L56:
            r8 = r0
        L57:
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r6, r7, r8}
            r5 = 0
            if (r1 != 0) goto L5f
            return r5
        L5f:
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.newInstanceByArgs(r1, r4)     // Catch: java.lang.Throwable -> L64
            return r4
        L64:
            return r5
    }

    public final boolean s(java.lang.Object r7) {
            r6 = this;
            m8.c r0 = r6.f7418b
            java.lang.String r1 = "撤回原生消息"
            r2 = 0
            if (r7 != 0) goto Ld
            java.lang.String r7 = "撤回消息失败: 原生消息对象为空"
            r6.o(r7)
            return r2
        Ld:
            h.Hchat.dexkit.DexFinder r3 = r6.f7417a
            java.lang.reflect.Constructor<?> r4 = r3.revokeMsgCtor
            if (r4 == 0) goto L6b
            r6.l()
            java.lang.reflect.Constructor<?> r3 = r3.revokeMsgCtor     // Catch: java.lang.Throwable -> L2c
            java.lang.String r4 = "你撤回了一条消息"
            java.lang.String r5 = ""
            java.lang.Object[] r4 = new java.lang.Object[]{r7, r4, r5}     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.newInstance(r3, r4)     // Catch: java.lang.Throwable -> L2c
            if (r3 != 0) goto L2e
            java.lang.String r7 = "撤回消息失败: NetSceneRevokeMsg构造失败"
            r6.o(r7)     // Catch: java.lang.Throwable -> L2c
            return r2
        L2c:
            r7 = move-exception
            goto L55
        L2e:
            boolean r0 = r0.j(r3)     // Catch: java.lang.Throwable -> L2c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L3c
            java.lang.String r1 = "已发送"
            goto L3e
        L3c:
            java.lang.String r1 = "发送失败"
        L3e:
            r3.append(r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = ": msgId="
            r3.append(r1)     // Catch: java.lang.Throwable -> L2c
            long r4 = r(r7)     // Catch: java.lang.Throwable -> L2c
            r3.append(r4)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> L2c
            r6.o(r7)     // Catch: java.lang.Throwable -> L2c
            return r0
        L55:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "撤回消息异常: "
            r0.<init>(r1)
            java.lang.String r7 = r7.getMessage()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.o(r7)
            return r2
        L6b:
            java.lang.String r7 = "撤回消息失败: API未就绪"
            r6.o(r7)
            return r2
    }

    public final boolean u(long r23, java.lang.String r25, java.lang.String r26) {
            r22 = this;
            r0 = r22
            r1 = r23
            r3 = r25
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            r5 = 0
            if (r4 == 0) goto L13
            java.lang.String r1 = "发送引用失败: talker为空"
            r0.o(r1)
            return r5
        L13:
            r6 = 0
            int r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r4 > 0) goto L1f
            java.lang.String r1 = "发送引用失败: msgId无效"
            r0.o(r1)
            return r5
        L1f:
            k8.s r4 = r0.f7421e
            boolean r8 = r4.h()
            if (r8 != 0) goto L2d
            java.lang.String r1 = "发送引用失败: messageStore未就绪"
            r0.o(r1)
            return r5
        L2d:
            h.Hchat.hooks.api.model.WeChatMessage r8 = r4.c(r1)
            if (r8 != 0) goto L37
            h.Hchat.hooks.api.model.WeChatMessage r8 = r4.d(r1)
        L37:
            if (r8 != 0) goto L4b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "发送引用失败: 未找到源消息 msgId/msgSvrId="
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.o(r1)
            return r5
        L4b:
            boolean r9 = android.text.TextUtils.isEmpty(r26)
            if (r9 != 0) goto L54
            r9 = r26
            goto L73
        L54:
            boolean r9 = r8.isQuote()
            if (r9 == 0) goto L6f
            h.Hchat.hooks.api.model.WeChatQuoteMsg r9 = r8.getQuoteMsg()
            if (r9 == 0) goto L6f
            java.lang.String r10 = r9.getTitle()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L6f
            java.lang.String r9 = r9.getTitle()
            goto L73
        L6f:
            java.lang.String r9 = r8.bodyContent()
        L73:
            java.lang.String r10 = r8.getTalker()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            java.lang.String r11 = ""
            if (r10 != 0) goto L84
            java.lang.String r10 = r8.getTalker()
            goto L89
        L84:
            if (r3 == 0) goto L88
            r10 = r3
            goto L89
        L88:
            r10 = r11
        L89:
            boolean r12 = r8.isQuote()
            if (r12 == 0) goto La4
            h.Hchat.hooks.api.model.WeChatQuoteMsg r12 = r8.getQuoteMsg()
            if (r12 == 0) goto La4
            java.lang.String r13 = r12.getSendTalker()
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto La4
            java.lang.String r12 = r12.getSendTalker()
            goto La8
        La4:
            java.lang.String r12 = r8.getSendTalker()
        La8:
            g8.a r13 = r0.f7419c
            java.lang.String r14 = r13.c()
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto Lb9
            java.lang.String r4 = r13.c()
            goto Ldb
        Lb9:
            if (r3 == 0) goto Lc3
            boolean r13 = g8.i.I(r3)
            if (r13 == 0) goto Lc3
        Lc1:
            r4 = r11
            goto Ldb
        Lc3:
            boolean r13 = android.text.TextUtils.isEmpty(r3)
            if (r13 != 0) goto Lcb
            r4 = r3
            goto Ldb
        Lcb:
            h.Hchat.hooks.api.model.WeChatMessage r4 = r4.b(r3)
            if (r4 == 0) goto Lc1
            java.lang.String r13 = r4.selfWxId
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto Lc1
            java.lang.String r4 = r4.selfWxId
        Ldb:
            boolean r13 = r8.isQuote()
            if (r13 == 0) goto Lf6
            h.Hchat.hooks.api.model.WeChatQuoteMsg r13 = r8.getQuoteMsg()
            if (r13 == 0) goto Lf6
            java.lang.String r14 = r13.getDisplayName()
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto Lf6
            java.lang.String r11 = r13.getDisplayName()
            goto L11e
        Lf6:
            java.lang.String r13 = r8.getSendTalker()
            boolean r14 = android.text.TextUtils.isEmpty(r13)
            if (r14 == 0) goto L101
            goto L11e
        L101:
            boolean r11 = r8.isGroupChat()
            g8.i r14 = r0.f7420d
            if (r11 == 0) goto L112
            java.lang.String r11 = r8.getTalker()
            java.lang.String r11 = r14.t(r11, r13)
            goto L116
        L112:
            java.lang.String r11 = r14.r(r13)
        L116:
            boolean r14 = android.text.TextUtils.isEmpty(r11)
            if (r14 != 0) goto L11d
            goto L11e
        L11d:
            r11 = r13
        L11e:
            boolean r13 = r8.isQuote()
            if (r13 == 0) goto L139
            h.Hchat.hooks.api.model.WeChatQuoteMsg r13 = r8.getQuoteMsg()
            if (r13 == 0) goto L139
            java.lang.String r14 = r13.getMsgSource()
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L139
            java.lang.String r13 = r13.getMsgSource()
            goto L13d
        L139:
            java.lang.String r13 = r8.getMsgSource()
        L13d:
            boolean r14 = r8.isQuote()
            if (r14 == 0) goto L158
            h.Hchat.hooks.api.model.WeChatQuoteMsg r14 = r8.getQuoteMsg()
            if (r14 == 0) goto L158
            java.lang.String r15 = r14.getContent()
            boolean r15 = android.text.TextUtils.isEmpty(r15)
            if (r15 != 0) goto L158
            java.lang.String r14 = r14.getContent()
            goto L15c
        L158:
            java.lang.String r14 = r8.bodyContent()
        L15c:
            boolean r15 = r8.isQuote()
            if (r15 == 0) goto L17c
            h.Hchat.hooks.api.model.WeChatQuoteMsg r15 = r8.getQuoteMsg()
            if (r15 == 0) goto L17c
            long r16 = r15.getSvrId()
            int r16 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r16 <= 0) goto L17c
            long r15 = r15.getSvrId()
            r20 = r15
            r15 = r5
            r16 = r6
            r5 = r20
            goto L181
        L17c:
            r15 = r5
            r16 = r6
            long r5 = r8.msgSvrId
        L181:
            boolean r7 = r8.isQuote()
            if (r7 == 0) goto L19e
            h.Hchat.hooks.api.model.WeChatQuoteMsg r7 = r8.getQuoteMsg()
            if (r7 == 0) goto L19e
            long r18 = r7.getCreateTime()
            int r16 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r16 <= 0) goto L19e
            long r16 = r7.getCreateTime()
        L199:
            r18 = r8
            r7 = r16
            goto L1b0
        L19e:
            long r16 = r8.getCreateTime()
            r18 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            int r7 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r7 <= 0) goto L199
            r18 = 1000(0x3e8, double:4.94E-321)
            long r16 = r16 / r18
            goto L199
        L1b0:
            boolean r16 = r18.isQuote()
            if (r16 == 0) goto L1cb
            h.Hchat.hooks.api.model.WeChatQuoteMsg r16 = r18.getQuoteMsg()
            if (r16 == 0) goto L1cb
            int r17 = r16.getType()
            if (r17 <= 0) goto L1cb
            int r16 = r16.getType()
        L1c6:
            r26 = r15
            r15 = r16
            goto L1d0
        L1cb:
            int r16 = r18.getType()
            goto L1c6
        L1d0:
            java.lang.String r13 = g(r13)
            java.lang.String r14 = g(r14)
            r16 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r17 = r9
            java.lang.String r9 = "<?xml version=\"1.0\"?><msg><appmsg appid=\"\" sdkver=\"0\"><title>"
            r4.<init>(r9)
            java.lang.String r9 = g(r17)
            r4.append(r9)
            java.lang.String r9 = "</title><type>57</type><appattach><cdnthumbaeskey /><aeskey /></appattach><refermsg><type>"
            r4.append(r9)
            r4.append(r15)
            java.lang.String r9 = "</type><svrid>"
            r4.append(r9)
            r4.append(r5)
            java.lang.String r5 = "</svrid><fromusr>"
            r4.append(r5)
            java.lang.String r5 = g(r10)
            r4.append(r5)
            java.lang.String r5 = "</fromusr><chatusr>"
            r4.append(r5)
            java.lang.String r5 = g(r12)
            r4.append(r5)
            java.lang.String r5 = "</chatusr><displayname>"
            r4.append(r5)
            java.lang.String r5 = g(r11)
            r4.append(r5)
            java.lang.String r5 = "</displayname><msgsource>"
            java.lang.String r6 = "</msgsource><content>"
            j8.b.t(r4, r5, r13, r6, r14)
            java.lang.String r5 = "</content><createtime>"
            java.lang.String r6 = "</createtime></refermsg></appmsg><fromusername>"
            j8.b.s(r4, r5, r7, r6)
            java.lang.String r5 = g(r16)
            r4.append(r5)
            java.lang.String r5 = "</fromusername><scene>0</scene><appinfo><version>1</version><appname></appname></appinfo><commenturl></commenturl></msg>"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L254
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "发送引用失败: 构造引用XML失败 msgId="
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.o(r1)
            return r26
        L254:
            boolean r1 = r0.z(r3, r4)
            return r1
    }

    public final boolean v(int r10, java.lang.String r11, java.lang.String r12) {
            r9 = this;
            java.lang.String r0 = "发送原始消息"
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            r2 = 0
            if (r1 != 0) goto Lf
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 == 0) goto L12
        Lf:
            r3 = r9
            goto L8c
        L12:
            if (r10 > 0) goto L26
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "发送原始消息失败: messageType 无效 "
            r11.<init>(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.o(r10)
            return r2
        L26:
            boolean r1 = r9.m()
            if (r1 != 0) goto L32
            java.lang.String r10 = "发送原始消息失败: API 未就绪"
            r9.o(r10)
            return r2
        L32:
            r9.l()
            r7 = 0
            r8 = 0
            r3 = r9
            r6 = r10
            r4 = r11
            r5 = r12
            java.lang.Object r10 = r3.p(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L4c
            m8.c r11 = r3.f7418b     // Catch: java.lang.Throwable -> L4c
            boolean r10 = r11.j(r10)     // Catch: java.lang.Throwable -> L4c
            if (r10 == 0) goto L4f
            r11 = 0
            r9.e(r4, r5, r6, r11)     // Catch: java.lang.Throwable -> L4c
            goto L4f
        L4c:
            r0 = move-exception
            r10 = r0
            goto L76
        L4f:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L4c
            if (r10 == 0) goto L59
            java.lang.String r12 = "成功"
            goto L5b
        L59:
            java.lang.String r12 = "失败"
        L5b:
            r11.append(r12)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r12 = ": "
            r11.append(r12)     // Catch: java.lang.Throwable -> L4c
            r11.append(r4)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r12 = " type="
            r11.append(r12)     // Catch: java.lang.Throwable -> L4c
            r11.append(r6)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L4c
            r9.o(r11)     // Catch: java.lang.Throwable -> L4c
            return r10
        L76:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "发送原始消息异常: "
            r11.<init>(r12)
            java.lang.String r10 = r10.getMessage()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.o(r10)
            return r2
        L8c:
            java.lang.String r10 = "发送原始消息失败: talker/content 为空"
            r9.o(r10)
            return r2
    }

    public final boolean w(java.lang.String r13, java.lang.String r14) {
            r12 = this;
            java.lang.String r1 = "发送名片"
            java.lang.String r2 = "发送名片失败: 构造名片XML失败 "
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            r3 = 0
            if (r0 != 0) goto L11
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 == 0) goto L14
        L11:
            r6 = r12
            goto Lde
        L14:
            boolean r0 = r12.m()
            if (r0 != 0) goto L20
            java.lang.String r13 = "发送名片失败: 发送API未就绪"
            r12.o(r13)
            return r3
        L20:
            h.Hchat.dexkit.DexFinder r0 = r12.f7417a
            java.lang.reflect.Method r4 = r0.contactCardXmlMethod
            if (r4 != 0) goto L2c
            java.lang.String r13 = "发送名片失败: 名片API未就绪"
            r12.o(r13)
            return r3
        L2c:
            r12.l()
            java.lang.String r4 = ""
            r5 = 0
            java.lang.reflect.Method r0 = r0.contactCardXmlMethod     // Catch: java.lang.Throwable -> L44
            java.lang.Object[] r6 = new java.lang.Object[]{r14, r5}     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r0, r5, r6)     // Catch: java.lang.Throwable -> L44
            boolean r6 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L44
            if (r6 == 0) goto L46
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L44
            r8 = r0
            goto L5e
        L44:
            r0 = move-exception
            goto L48
        L46:
            r8 = r4
            goto L5e
        L48:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r7 = "构造名片XML异常: "
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> Lc5
            r6.append(r0)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> Lc5
            r12.o(r0)     // Catch: java.lang.Throwable -> Lc5
            goto L46
        L5e:
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> Lc5
            if (r0 == 0) goto L78
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r13.<init>(r2)     // Catch: java.lang.Throwable -> L74
            r13.append(r14)     // Catch: java.lang.Throwable -> L74
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L74
            r12.o(r13)     // Catch: java.lang.Throwable -> L74
            return r3
        L74:
            r0 = move-exception
            r13 = r0
            r6 = r12
            goto Lc8
        L78:
            java.lang.String r0 = "openimappid="
            boolean r0 = r8.contains(r0)     // Catch: java.lang.Throwable -> Lc5
            if (r0 == 0) goto L84
            r0 = 66
        L82:
            r9 = r0
            goto L87
        L84:
            r0 = 42
            goto L82
        L87:
            r10 = 0
            r11 = 0
            r6 = r12
            r7 = r13
            java.lang.Object r13 = r6.p(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L9b
            m8.c r0 = r6.f7418b     // Catch: java.lang.Throwable -> L9b
            boolean r13 = r0.j(r13)     // Catch: java.lang.Throwable -> L9b
            if (r13 == 0) goto L9e
            r12.e(r7, r8, r9, r5)     // Catch: java.lang.Throwable -> L9b
            goto L9e
        L9b:
            r0 = move-exception
        L9c:
            r13 = r0
            goto Lc8
        L9e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L9b
            if (r13 == 0) goto La8
            java.lang.String r1 = "成功"
            goto Laa
        La8:
            java.lang.String r1 = "失败"
        Laa:
            r0.append(r1)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = ": "
            r0.append(r1)     // Catch: java.lang.Throwable -> L9b
            r0.append(r7)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = " wxid="
            r0.append(r1)     // Catch: java.lang.Throwable -> L9b
            r0.append(r14)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r14 = r0.toString()     // Catch: java.lang.Throwable -> L9b
            r12.o(r14)     // Catch: java.lang.Throwable -> L9b
            return r13
        Lc5:
            r0 = move-exception
            r6 = r12
            goto L9c
        Lc8:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "发送名片异常: "
            r14.<init>(r0)
            java.lang.String r13 = r13.getMessage()
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            r12.o(r13)
            return r3
        Lde:
            java.lang.String r13 = "发送名片失败: talker/wxid 为空"
            r12.o(r13)
            return r3
    }

    public final boolean x(java.lang.String r10, java.lang.String r11) {
            r9 = this;
            java.lang.String r0 = "发送文本"
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            r2 = 0
            if (r1 != 0) goto Lf
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            if (r1 == 0) goto L11
        Lf:
            r3 = r9
            goto L70
        L11:
            boolean r1 = r9.m()
            if (r1 != 0) goto L1d
            java.lang.String r10 = "发送文本失败: API 未就绪"
            r9.o(r10)
            return r2
        L1d:
            r9.l()
            r7 = 0
            r8 = 0
            r6 = 1
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.Object r10 = r3.p(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L38
            m8.c r11 = r3.f7418b     // Catch: java.lang.Throwable -> L38
            boolean r10 = r11.j(r10)     // Catch: java.lang.Throwable -> L38
            if (r10 == 0) goto L3b
            r11 = 1
            r1 = 0
            r9.e(r4, r5, r11, r1)     // Catch: java.lang.Throwable -> L38
            goto L3b
        L38:
            r0 = move-exception
            r10 = r0
            goto L5a
        L3b:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L38
            if (r10 == 0) goto L45
            java.lang.String r0 = "成功"
            goto L47
        L45:
            java.lang.String r0 = "失败"
        L47:
            r11.append(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = ": "
            r11.append(r0)     // Catch: java.lang.Throwable -> L38
            r11.append(r4)     // Catch: java.lang.Throwable -> L38
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L38
            r9.o(r11)     // Catch: java.lang.Throwable -> L38
            return r10
        L5a:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "发送文本异常: "
            r11.<init>(r0)
            java.lang.String r10 = r10.getMessage()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.o(r10)
            return r2
        L70:
            java.lang.String r10 = "发送文本失败: talker/text 为空"
            r9.o(r10)
            return r2
    }

    public final boolean y(java.lang.String r9, java.lang.String r10, java.util.List r11) {
            r8 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = 0
            if (r0 != 0) goto Ld
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L10
        Ld:
            r2 = r8
            goto Lb5
        L10:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        L19:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r11.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L19
            boolean r3 = r0.contains(r2)
            if (r3 == 0) goto L32
            goto L19
        L32:
            r0.add(r2)
            goto L19
        L36:
            boolean r11 = r0.isEmpty()
            if (r11 == 0) goto L41
            boolean r9 = r8.x(r9, r10)
            return r9
        L41:
            boolean r11 = r8.m()
            if (r11 == 0) goto Lae
            h.Hchat.dexkit.DexFinder r11 = r8.f7417a
            java.lang.reflect.Constructor<?> r11 = r11.sendTextMsgCtorObject
            if (r11 == 0) goto Lae
            r8.l()
            java.util.HashMap r7 = a(r0)     // Catch: java.lang.Throwable -> L95
            r5 = 1
            r6 = 1
            r2 = r8
            r3 = r9
            r4 = r10
            java.lang.Object r9 = r2.p(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L6e
            m8.c r10 = r2.f7418b     // Catch: java.lang.Throwable -> L6e
            boolean r9 = r10.j(r9)     // Catch: java.lang.Throwable -> L6e
            if (r9 == 0) goto L71
            java.util.HashMap r10 = a(r0)     // Catch: java.lang.Throwable -> L6e
            r11 = 1
            r8.e(r3, r4, r11, r10)     // Catch: java.lang.Throwable -> L6e
            goto L71
        L6e:
            r0 = move-exception
        L6f:
            r9 = r0
            goto L98
        L71:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6e
            r10.<init>()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r11 = "发送@文本"
            r10.append(r11)     // Catch: java.lang.Throwable -> L6e
            if (r9 == 0) goto L80
            java.lang.String r11 = "成功"
            goto L82
        L80:
            java.lang.String r11 = "失败"
        L82:
            r10.append(r11)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r11 = ": "
            r10.append(r11)     // Catch: java.lang.Throwable -> L6e
            r10.append(r3)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L6e
            r8.o(r10)     // Catch: java.lang.Throwable -> L6e
            return r9
        L95:
            r0 = move-exception
            r2 = r8
            goto L6f
        L98:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "发送@文本异常: "
            r10.<init>(r11)
            java.lang.String r9 = r9.getMessage()
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.o(r9)
            return r1
        Lae:
            r2 = r8
            java.lang.String r9 = "发送@文本失败: Object构造器不可用"
            r8.o(r9)
            return r1
        Lb5:
            java.lang.String r9 = "发送@文本失败: talker/text 为空"
            r8.o(r9)
            return r1
    }

    public final boolean z(java.lang.String r13, java.lang.String r14) {
            r12 = this;
            java.lang.String r0 = "</appmsg>"
            java.lang.String r1 = "<appmsg"
            java.lang.String r2 = ""
            if (r14 != 0) goto La
        L8:
            r7 = r2
            goto L2f
        La:
            java.lang.String r14 = r14.trim()
            int r3 = r14.length()
            if (r3 != 0) goto L15
            goto L8
        L15:
            java.lang.String r2 = r14.toLowerCase()
            boolean r3 = r2.startsWith(r1)
            if (r3 == 0) goto L2e
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L2e
            java.lang.String r2 = "<msg>"
            java.lang.String r3 = "</msg>"
            java.lang.String r2 = eh.a.n(r2, r14, r3)
            goto L8
        L2e:
            r7 = r14
        L2f:
            boolean r14 = android.text.TextUtils.isEmpty(r13)
            r2 = 0
            if (r14 != 0) goto L3c
            boolean r14 = android.text.TextUtils.isEmpty(r7)
            if (r14 == 0) goto L3f
        L3c:
            r3 = r12
            goto L19e
        L3f:
            java.lang.String r14 = r7.trim()
            java.lang.String r3 = "<"
            boolean r3 = r14.startsWith(r3)
            if (r3 == 0) goto L197
            java.lang.String r3 = ">"
            boolean r3 = r14.endsWith(r3)
            if (r3 == 0) goto L197
            r3 = 62
            int r14 = r14.indexOf(r3)
            r9 = 1
            if (r14 <= r9) goto L197
            java.lang.String r14 = r7.toLowerCase()
            boolean r1 = r14.contains(r1)
            r10 = 49
            if (r1 == 0) goto L190
            boolean r14 = r14.contains(r0)
            if (r14 == 0) goto L190
            h.Hchat.dexkit.DexFinder r14 = r12.f7417a
            java.lang.reflect.Method r4 = r14.sendXmlAppMsgMethod
            if (r4 == 0) goto L189
            java.lang.Class[] r0 = r4.getParameterTypes()     // Catch: java.lang.Throwable -> L170
            r0 = r0[r2]     // Catch: java.lang.Throwable -> L170
            java.lang.reflect.Method r1 = r14.appMsgParseMethod     // Catch: java.lang.Throwable -> L170
            boolean r3 = n(r0, r1)     // Catch: java.lang.Throwable -> L170
            r11 = 0
            if (r3 != 0) goto L84
            goto L93
        L84:
            java.lang.Object[] r3 = new java.lang.Object[]{r7}     // Catch: java.lang.Throwable -> L93
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invoke(r1, r11, r3)     // Catch: java.lang.Throwable -> L93
            boolean r3 = r0.isInstance(r1)     // Catch: java.lang.Throwable -> L93
            if (r3 == 0) goto L93
            goto L94
        L93:
            r1 = r11
        L94:
            if (r1 == 0) goto L98
            r5 = r1
            goto Ld0
        L98:
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredMethods(r0)     // Catch: java.lang.Throwable -> Lcf
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lcf
        La0:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> Lcf
            if (r3 == 0) goto Lcf
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> Lcf
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> Lcf
            boolean r5 = n(r0, r3)     // Catch: java.lang.Throwable -> Lcf
            if (r5 != 0) goto Lb3
            goto La0
        Lb3:
            boolean r5 = n(r0, r3)     // Catch: java.lang.Throwable -> Lcf
            if (r5 != 0) goto Lba
            goto Lc9
        Lba:
            java.lang.Object[] r5 = new java.lang.Object[]{r7}     // Catch: java.lang.Throwable -> Lc9
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.invoke(r3, r11, r5)     // Catch: java.lang.Throwable -> Lc9
            boolean r6 = r0.isInstance(r5)     // Catch: java.lang.Throwable -> Lc9
            if (r6 == 0) goto Lc9
            goto Lca
        Lc9:
            r5 = r11
        Lca:
            if (r5 == 0) goto La0
            r14.appMsgParseMethod = r3     // Catch: java.lang.Throwable -> Lcf
            goto Ld0
        Lcf:
            r5 = r11
        Ld0:
            if (r5 != 0) goto Ldf
            java.lang.String r13 = "发送XML失败: 微信解析AppMsg失败"
            r12.o(r13)     // Catch: java.lang.Throwable -> Lda
            r3 = r12
            goto L188
        Lda:
            r0 = move-exception
            r13 = r0
            r3 = r12
            goto L173
        Ldf:
            java.lang.String r8 = h(r7)     // Catch: java.lang.Throwable -> L170
            r3 = r12
            r6 = r13
            java.lang.Object[] r13 = r3.c(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lfb
            int r14 = r13.length     // Catch: java.lang.Throwable -> Lfb
            r0 = 12
            if (r14 != r0) goto Lff
            r14 = 9
            r14 = r13[r14]     // Catch: java.lang.Throwable -> Lfb
            if (r14 != 0) goto Lff
            java.lang.String r13 = "发送XML失败: MsgIdTalker参数创建失败"
            r12.o(r13)     // Catch: java.lang.Throwable -> Lfb
            goto L188
        Lfb:
            r0 = move-exception
        Lfc:
            r13 = r0
            goto L173
        Lff:
            java.lang.Object r13 = h.Hchat.utils.KavaReflector.invoke(r4, r11, r13)     // Catch: java.lang.Throwable -> Lfb
            boolean r14 = r13 instanceof android.util.Pair     // Catch: java.lang.Throwable -> Lfb
            if (r14 != 0) goto L109
        L107:
            r9 = r2
            goto L12f
        L109:
            r14 = r13
            android.util.Pair r14 = (android.util.Pair) r14     // Catch: java.lang.Throwable -> Lfb
            java.lang.Object r0 = r14.first     // Catch: java.lang.Throwable -> Lfb
            java.lang.Object r14 = r14.second     // Catch: java.lang.Throwable -> Lfb
            boolean r1 = r0 instanceof java.lang.Number     // Catch: java.lang.Throwable -> Lfb
            if (r1 == 0) goto L11b
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> Lfb
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> Lfb
            goto L11c
        L11b:
            r0 = -1
        L11c:
            if (r0 == 0) goto L11f
            goto L107
        L11f:
            boolean r0 = r14 instanceof java.lang.Number     // Catch: java.lang.Throwable -> Lfb
            if (r0 == 0) goto L12f
            java.lang.Number r14 = (java.lang.Number) r14     // Catch: java.lang.Throwable -> Lfb
            long r0 = r14.longValue()     // Catch: java.lang.Throwable -> Lfb
            r4 = 0
            int r14 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r14 < 0) goto L107
        L12f:
            if (r9 != 0) goto L16b
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lfb
            r14.<init>()     // Catch: java.lang.Throwable -> Lfb
            java.lang.String r0 = "发送XML失败: AppMsgLogic返回 "
            r14.append(r0)     // Catch: java.lang.Throwable -> Lfb
            boolean r0 = r13 instanceof android.util.Pair     // Catch: java.lang.Throwable -> Lfb
            if (r0 != 0) goto L144
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch: java.lang.Throwable -> Lfb
            goto L160
        L144:
            android.util.Pair r13 = (android.util.Pair) r13     // Catch: java.lang.Throwable -> Lfb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lfb
            java.lang.String r1 = "first="
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lfb
            java.lang.Object r1 = r13.first     // Catch: java.lang.Throwable -> Lfb
            r0.append(r1)     // Catch: java.lang.Throwable -> Lfb
            java.lang.String r1 = ", second="
            r0.append(r1)     // Catch: java.lang.Throwable -> Lfb
            java.lang.Object r13 = r13.second     // Catch: java.lang.Throwable -> Lfb
            r0.append(r13)     // Catch: java.lang.Throwable -> Lfb
            java.lang.String r13 = r0.toString()     // Catch: java.lang.Throwable -> Lfb
        L160:
            r14.append(r13)     // Catch: java.lang.Throwable -> Lfb
            java.lang.String r13 = r14.toString()     // Catch: java.lang.Throwable -> Lfb
            r12.o(r13)     // Catch: java.lang.Throwable -> Lfb
            goto L16e
        L16b:
            r12.e(r6, r7, r10, r8)     // Catch: java.lang.Throwable -> Lfb
        L16e:
            r2 = r9
            goto L188
        L170:
            r0 = move-exception
            r3 = r12
            goto Lfc
        L173:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "发送XML异常: "
            r14.<init>(r0)
            java.lang.String r13 = r13.getMessage()
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            r12.o(r13)
        L188:
            return r2
        L189:
            r3 = r12
            java.lang.String r13 = "发送XML失败: AppMsgLogic API 未就绪"
            r12.o(r13)
            return r2
        L190:
            r3 = r12
            r6 = r13
            boolean r13 = r12.v(r10, r6, r7)
            return r13
        L197:
            r3 = r12
            java.lang.String r13 = "发送XML失败: 内容不是XML"
            r12.o(r13)
            return r2
        L19e:
            java.lang.String r13 = "发送XML失败: talker/xml 为空"
            r12.o(r13)
            return r2
    }
}
