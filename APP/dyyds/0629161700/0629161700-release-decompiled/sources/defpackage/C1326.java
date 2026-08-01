package defpackage;

/* JADX INFO: renamed from: ᛷᛸᛱᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1326 implements defpackage.InterfaceC0276, defpackage.InterfaceC0319, defpackage.InterfaceC1261, defpackage.InterfaceC0126, defpackage.InterfaceC0933, defpackage.InterfaceC1398, defpackage.InterfaceC0735 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static final java.lang.Object f5852 = null;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static final defpackage.C2266 f5853 = null;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static defpackage.C1326 f5854;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static volatile defpackage.C1326 f5855;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public java.lang.Object f5856;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public java.lang.Object f5857;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f5858;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public java.lang.Object f5859;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.C1326.f5852 = r0
            ᲈᛶᛷᛱ r0 = new ᲈᛶᛷᛱ
            r1 = 2
            r0.<init>(r1)
            defpackage.C1326.f5853 = r0
            return
    }

    public C1326(int r6) {
            r5 = this;
            r5.f5858 = r6
            r0 = 1
            r1 = 0
            switch(r6) {
                case 18: goto L43;
                case 19: goto L2a;
                default: goto L7;
            }
        L7:
            ᛴᲁᲇᛲ r6 = new ᛴᲁᲇᛲ
            r6.<init>(r1)
            java.util.concurrent.ExecutorService r6 = java.util.concurrent.Executors.newSingleThreadExecutor(r6)
            r5.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r5.f5856 = r1
            java.lang.ref.ReferenceQueue r1 = new java.lang.ref.ReferenceQueue
            r1.<init>()
            r5.f5857 = r1
            ᛳᛳᛵᛲ r1 = new ᛳᛳᛵᛲ
            r1.<init>(r0, r5)
            r6.execute(r1)
            return
        L2a:
            r5.<init>()
            java.util.concurrent.locks.ReentrantLock r6 = new java.util.concurrent.locks.ReentrantLock
            r6.<init>()
            r5.f5856 = r6
            java.util.concurrent.ConcurrentHashMap r6 = new java.util.concurrent.ConcurrentHashMap
            r6.<init>()
            r5.f5857 = r6
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            r5.f5859 = r6
            return
        L43:
            r5.<init>()
            java.util.concurrent.ConcurrentHashMap r6 = new java.util.concurrent.ConcurrentHashMap
            r2 = 100
            r6.<init>(r2)
            r5.f5856 = r6
            java.lang.Class<java.util.Date> r2 = java.util.Date.class
            ᛲᛴᛵᲁ r3 = defpackage.AbstractC1234.f5537
            r6.put(r2, r3)
            java.lang.Class<int[]> r2 = int[].class
            ᛱᛴᲇᛴ r3 = defpackage.AbstractC1952.f8499
            r6.put(r2, r3)
            java.lang.Class<java.lang.Integer[]> r2 = java.lang.Integer[].class
            ᛱᛴᲇᛴ r4 = defpackage.AbstractC1952.f8496
            r6.put(r2, r4)
            java.lang.Class<short[]> r2 = short[].class
            r6.put(r2, r3)
            java.lang.Class<java.lang.Short[]> r2 = java.lang.Short[].class
            r6.put(r2, r4)
            java.lang.Class<long[]> r2 = long[].class
            ᛱᛴᲇᛴ r3 = defpackage.AbstractC1952.f8488
            r6.put(r2, r3)
            java.lang.Class<java.lang.Long[]> r2 = java.lang.Long[].class
            ᛱᛴᲇᛴ r3 = defpackage.AbstractC1952.f8491
            r6.put(r2, r3)
            java.lang.Class<byte[]> r2 = byte[].class
            ᛱᛴᲇᛴ r3 = defpackage.AbstractC1952.f8495
            r6.put(r2, r3)
            java.lang.Class<java.lang.Byte[]> r2 = java.lang.Byte[].class
            ᛱᛴᲇᛴ r3 = defpackage.AbstractC1952.f8493
            r6.put(r2, r3)
            java.lang.Class<char[]> r2 = char[].class
            ᛱᛴᲇᛴ r3 = defpackage.AbstractC1952.f8500
            r6.put(r2, r3)
            java.lang.Class<java.lang.Character[]> r2 = java.lang.Character[].class
            ᛱᛴᲇᛴ r3 = defpackage.AbstractC1952.f8501
            r6.put(r2, r3)
            java.lang.Class<float[]> r2 = float[].class
            ᛱᛴᲇᛴ r3 = defpackage.AbstractC1952.f8497
            r6.put(r2, r3)
            java.lang.Class<java.lang.Float[]> r2 = java.lang.Float[].class
            ᛱᛴᲇᛴ r3 = defpackage.AbstractC1952.f8489
            r6.put(r2, r3)
            java.lang.Class<double[]> r2 = double[].class
            ᛱᛴᲇᛴ r3 = defpackage.AbstractC1952.f8490
            r6.put(r2, r3)
            java.lang.Class<java.lang.Double[]> r2 = java.lang.Double[].class
            ᛱᛴᲇᛴ r3 = defpackage.AbstractC1952.f8494
            r6.put(r2, r3)
            java.lang.Class<boolean[]> r2 = boolean[].class
            ᛱᛴᲇᛴ r3 = defpackage.AbstractC1952.f8498
            r6.put(r2, r3)
            java.lang.Class<java.lang.Boolean[]> r2 = java.lang.Boolean[].class
            ᛱᛴᲇᛴ r3 = defpackage.AbstractC1952.f8492
            r6.put(r2, r3)
            ᛳᛲᛵᛳ r2 = new ᛳᛲᛵᛳ
            r2.<init>(r5, r1)
            r5.f5857 = r2
            ᛳᛲᛵᛳ r1 = new ᛳᛲᛵᛳ
            r1.<init>(r5, r0)
            r5.f5859 = r1
            java.lang.Class<ᛱᛷᛱᲁ> r5 = defpackage.InterfaceC0123.class
            r6.put(r5, r2)
            java.lang.Class<ᛳᛵᲁᛴ> r5 = defpackage.InterfaceC0489.class
            r6.put(r5, r2)
            java.lang.Class<ᛵᛲᛳᛸ> r5 = defpackage.C0823.class
            r6.put(r5, r2)
            java.lang.Class<ᛱᲈᛳᛸ> r5 = defpackage.C0213.class
            r6.put(r5, r2)
            return
    }

    public /* synthetic */ C1326(int r1, boolean r2) {
            r0 = this;
            r0.f5858 = r1
            r0.<init>()
            return
    }

    public C1326(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.f5858 = r0
            r1.<init>()
            android.content.Context r2 = r2.getApplicationContext()
            r1.f5859 = r2
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1.f5857 = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.f5856 = r2
            return
    }

    public C1326(android.content.Context r2, android.content.res.TypedArray r3) {
            r1 = this;
            r0 = 22
            r1.f5858 = r0
            r1.<init>()
            r1.f5859 = r2
            r1.f5856 = r3
            return
    }

    public C1326(android.content.Context r2, android.location.LocationManager r3) {
            r1 = this;
            r0 = 23
            r1.f5858 = r0
            r1.<init>()
            ᲇᛱᛸᛷ r0 = new ᲇᛱᛸᛷ
            r0.<init>()
            r1.f5857 = r0
            r1.f5859 = r2
            r1.f5856 = r3
            return
    }

    public C1326(android.os.ParcelFileDescriptor r2, java.util.ArrayList r3, defpackage.C2063 r4) {
            r1 = this;
            r0 = 17
            r1.f5858 = r0
            r1.<init>()
            java.lang.String r0 = "Argument must not be null"
            defpackage.C0292.m944(r4, r0)
            r1.f5856 = r4
            r1.f5857 = r3
            com.bumptech.glide.load.data.ᛷᲁᛳᛳ r3 = new com.bumptech.glide.load.data.ᛷᲁᛳᛳ
            r3.<init>(r2)
            r1.f5859 = r3
            return
    }

    public C1326(android.widget.LinearLayout r1, android.widget.Button r2, android.widget.Button r3, android.widget.EditText r4, android.widget.EditText r5, android.widget.LinearLayout r6, android.widget.TextView r7) {
            r0 = this;
            r1 = 9
            r0.f5858 = r1
            r0.<init>()
            r0.f5856 = r4
            r0.f5857 = r5
            r0.f5859 = r7
            return
    }

    public C1326(com.android.app.CustomRecyclerView r2) {
            r1 = this;
            r0 = 13
            r1.f5858 = r0
            r1.<init>()
            android.content.Context r2 = r2.getContext()
            r0 = 1711800411(0x6608005b, float:1.605621E23)
            android.graphics.drawable.Drawable r0 = defpackage.AbstractC1592.m2873(r2, r0)
            r1.f5856 = r0
            r0 = 1711800409(0x66080059, float:1.6056206E23)
            android.graphics.drawable.Drawable r2 = defpackage.AbstractC1592.m2873(r2, r0)
            r1.f5857 = r2
            ᲀᛵᛳᲁ r2 = defpackage.AbstractC1533.f6755
            r1.f5859 = r2
            return
    }

    public /* synthetic */ C1326(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f5858 = r4
            r0.f5856 = r1
            r0.f5857 = r2
            r0.f5859 = r3
            r0.<init>()
            return
    }

    public C1326(java.lang.String r2) {
            r1 = this;
            r0 = 3
            r1.f5858 = r0
            r1.<init>()
            r1.f5856 = r2
            return
    }

    public C1326(java.util.regex.Matcher r2) {
            r1 = this;
            r0 = 20
            r1.f5858 = r0
            r1.<init>()
            r1.f5856 = r2
            ᲈᛶᛶᲇ r2 = new ᲈᛶᛶᲇ
            r2.<init>(r1)
            r1.f5857 = r2
            return
    }

    public /* synthetic */ C1326(defpackage.InterfaceC0126 r1, android.content.Context r2, defpackage.InterfaceC1781 r3, int r4) {
            r0 = this;
            r0.f5858 = r4
            r0.f5856 = r1
            r0.f5859 = r2
            r0.f5857 = r3
            r0.<init>()
            return
    }

    public C1326(defpackage.InterfaceC0276 r1, defpackage.AbstractC0343 r2, java.lang.Class r3, java.lang.String r4) {
            r0 = this;
            r2 = 4
            r0.f5858 = r2
            r0.<init>()
            r0.f5856 = r1
            r0.f5857 = r3
            r0.f5859 = r4
            return
    }

    public C1326(defpackage.C0283 r2, defpackage.InterfaceC0702 r3, defpackage.InterfaceC1549 r4) {
            r1 = this;
            r0 = 12
            r1.f5858 = r0
            r1.<init>()
            r1.f5859 = r2
            r1.f5856 = r3
            r1.f5857 = r4
            return
    }

    public C1326(defpackage.C0302 r3) {
            r2 = this;
            r0 = 5
            r2.f5858 = r0
            r2.<init>()
            r2.f5856 = r3
            java.lang.Object r0 = r3.f1618
            ᛵᛶᛸᲁ r0 = (defpackage.C0916) r0
            ᲈᛵᲈᛵ r1 = new ᲈᛵᲈᛵ
            r1.<init>(r0)
            r2.f5857 = r1
            java.lang.Object r3 = r3.f1619
            ᛵᛵᲁᛷ r3 = (defpackage.C0899) r3
            ᛶᛳᛵᛸ r0 = new ᛶᛳᛵᛸ
            r0.<init>(r3)
            r2.f5859 = r0
            return
    }

    public C1326(defpackage.C0789 r2, java.util.ArrayList r3, defpackage.C2063 r4) {
            r1 = this;
            r0 = 16
            r1.f5858 = r0
            r1.<init>()
            java.lang.String r0 = "Argument must not be null"
            defpackage.C0292.m944(r4, r0)
            r1.f5857 = r4
            r1.f5859 = r3
            ᛸᲈᛸᲈ r3 = new ᛸᲈᛸᲈ
            r3.<init>(r2, r4)
            r1.f5856 = r3
            return
    }

    public C1326(defpackage.C0827 r2, defpackage.C1622 r3, defpackage.C0621 r4) {
            r1 = this;
            r0 = 11
            r1.f5858 = r0
            r1.<init>()
            r1.f5859 = r2
            r1.f5857 = r3
            r1.f5856 = r4
            return
    }

    public C1326(defpackage.C1326 r2) {
            r1 = this;
            r0 = 1
            r1.f5858 = r0
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5856 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.f5857 = r0
            r1.f5859 = r2
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛷ, reason: contains not printable characters */
    private final void m2451() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛲᛲᛸᲈ, reason: contains not printable characters */
    public static final java.lang.String m2452(int r5) {
            r0 = -122080435019310(0xffff90f7ef0961d2, double:NaN)
            java.lang.String r0 = "%08X"
            long r1 = (long) r5
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            r1 = -122101909855790(0xffff90f2ef0961d2, double:NaN)
            r3 = 1
            java.lang.String r5 = defpackage.AbstractC0225.m830(r5, r3, r0, r1)
            return r5
    }

    /* JADX INFO: renamed from: ᛳᛳᛳᲈ, reason: contains not printable characters */
    public static final void m2453(android.widget.ImageView r4) {
            ᛶᲀᛵ r0 = defpackage.C1141.f5173
            r0.getClass()
            ᲀᲇᛸᛶ r0 = defpackage.C1141.f5141
            ᲁᛷᛶᛶ[] r1 = defpackage.C1141.f5221
            r2 = 44
            r1 = r1[r2]
            java.lang.Object r0 = r0.m3169(r1)
            java.lang.String r0 = (java.lang.String) r0
            int r1 = r0.length()
            r2 = 0
            if (r1 <= 0) goto L2d
            r1 = 2
            byte[] r0 = android.util.Base64.decode(r0, r1)     // Catch: java.lang.Exception -> L29
            int r1 = r0.length     // Catch: java.lang.Exception -> L29
            r3 = 0
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r0, r3, r1)     // Catch: java.lang.Exception -> L29
            r4.setImageBitmap(r0)     // Catch: java.lang.Exception -> L29
            return
        L29:
            r4.setImageBitmap(r2)
            return
        L2d:
            r4.setImageBitmap(r2)
            return
    }

    /* JADX INFO: renamed from: ᛴᲀᲁᛴ, reason: contains not printable characters */
    public static defpackage.C1326 m2454(android.content.Context r2, android.util.AttributeSet r3, int[] r4, int r5) {
            ᛷᛸᛱᛸ r0 = new ᛷᛸᛱᛸ
            r1 = 0
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r3, r4, r5, r1)
            r0.<init>(r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ᛶᛳᲀᲈ, reason: contains not printable characters */
    public static final void m2455(android.view.View r5, java.lang.String r6) {
            java.lang.Integer r6 = m2457(r6)
            if (r6 == 0) goto L47
            int r6 = r6.intValue()
            ᛶᲀᛵ r0 = defpackage.C1141.f5173
            r1 = -122329543122478(0xffff90bdef0961d2, double:NaN)
            java.lang.String r1 = "#%06X"
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r6 = r6 & r2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            r2 = -122355312926254(0xffff90b7ef0961d2, double:NaN)
            r4 = 1
            java.lang.String r6 = defpackage.AbstractC0225.m830(r6, r4, r1, r2)
            r0.getClass()
            r0 = -18232420769326(0xffffef6aef0961d2, double:NaN)
            ᲀᲇᛸᛶ r0 = defpackage.C1141.f5091
            ᲁᛷᛶᛶ[] r1 = defpackage.C1141.f5221
            r2 = 41
            r1 = r1[r2]
            r0.m3168(r1, r6)
            m2465(r5)
            defpackage.C1500.m2706()
        L47:
            return
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public static int m2456(defpackage.C0109 r3, int r4, int r5) {
            r0 = r4 & 4096(0x1000, float:5.74E-42)
            r1 = 6
            if (r0 == 0) goto L12
            int r0 = r3.f966
            r2 = 49
            if (r0 >= r2) goto L12
            java.lang.String r0 = "Synthetic"
            r3.m605(r0)
            r0 = r1
            goto L13
        L12:
            r0 = 0
        L13:
            if (r5 == 0) goto L1c
            java.lang.String r5 = "Signature"
            r3.m605(r5)
            int r0 = r0 + 8
        L1c:
            r5 = 131072(0x20000, float:1.83671E-40)
            r4 = r4 & r5
            if (r4 == 0) goto L27
            java.lang.String r4 = "Deprecated"
            r3.m605(r4)
            int r0 = r0 + r1
        L27:
            return r0
    }

    /* JADX INFO: renamed from: ᛶᲈᲈᛸ, reason: contains not printable characters */
    public static final java.lang.Integer m2457(java.lang.String r2) {
            java.lang.CharSequence r2 = defpackage.AbstractC1347.m2521(r2)
            java.lang.String r2 = r2.toString()
            r0 = -122071845084718(0xffff90f9ef0961d2, double:NaN)
            java.lang.String r0 = "#"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L18
            goto L1e
        L18:
            java.lang.String r0 = "#"
            java.lang.String r2 = r0.concat(r2)
        L1e:
            int r2 = android.graphics.Color.parseColor(r2)     // Catch: java.lang.Exception -> L2e
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r0
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 | r0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L2e
            return r2
        L2e:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛲᲁᛳ, reason: contains not printable characters */
    private final void m2458() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛷᛷ, reason: contains not printable characters */
    public static final void m2459(int r3, java.util.List r4) {
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L5:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r4.next()
            int r2 = r0 + 1
            if (r0 < 0) goto L31
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r0 != r3) goto L23
            r0 = 1711800474(0x6608009a, float:1.6056323E23)
            r1.setBackgroundResource(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            goto L2f
        L23:
            r0 = 1711800683(0x6608016b, float:1.60567E23)
            r1.setBackgroundResource(r0)
            r0 = 1058642330(0x3f19999a, float:0.6)
            r1.setAlpha(r0)
        L2f:
            r0 = r2
            goto L5
        L31:
            defpackage.AbstractC0425.m1196()
            r3 = 0
            throw r3
        L36:
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᛶ, reason: contains not printable characters */
    public static final int m2460(float r2, double r3, double r5) {
            float r2 = defpackage.AbstractC1754.m3162(r2)
            double r0 = (double) r2
            double r0 = java.lang.Math.log(r0)
            double r0 = r0 - r3
            double r5 = r5 - r3
            double r0 = r0 / r5
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 * r2
            int r2 = (int) r0
            r3 = 0
            r4 = 1000(0x3e8, float:1.401E-42)
            int r2 = defpackage.AbstractC1754.m3135(r2, r3, r4)
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛷᛱᛱ, reason: contains not printable characters */
    public static final void m2461() {
            ᛶᲀᛵ r0 = defpackage.C1141.f5173
            r0.getClass()
            boolean r0 = defpackage.C1141.m2225()
            if (r0 != 0) goto Lc
            return
        Lc:
            boolean r0 = defpackage.C1141.m2196()
            if (r0 == 0) goto L16
            defpackage.C1500.m2705()
            return
        L16:
            defpackage.C1500.m2706()
            return
    }

    /* JADX INFO: renamed from: ᛷᲇᛷᛶ, reason: contains not printable characters */
    public static void m2462(defpackage.C0109 r3, int r4, int r5, defpackage.C0031 r6) {
            r0 = r4 & 4096(0x1000, float:5.74E-42)
            r1 = 0
            if (r0 == 0) goto L17
            int r0 = r3.f966
            r2 = 49
            if (r0 >= r2) goto L17
            java.lang.String r0 = "Synthetic"
            int r0 = r3.m605(r0)
            r6.m344(r0)
            r6.m339(r1)
        L17:
            if (r5 == 0) goto L29
            java.lang.String r0 = "Signature"
            int r0 = r3.m605(r0)
            r6.m344(r0)
            r0 = 2
            r6.m339(r0)
            r6.m344(r5)
        L29:
            r5 = 131072(0x20000, float:1.83671E-40)
            r4 = r4 & r5
            if (r4 == 0) goto L3a
            java.lang.String r4 = "Deprecated"
            int r3 = r3.m605(r4)
            r6.m344(r3)
            r6.m339(r1)
        L3a:
            return
    }

    /* JADX INFO: renamed from: ᲁᛱᛲᲈ, reason: contains not printable characters */
    public static final void m2463() {
            android.view.ViewGroup r0 = defpackage.AbstractC0397.m1152()
            if (r0 != 0) goto L7
            goto L19
        L7:
            android.view.ViewGroup r0 = defpackage.AbstractC2093.m3515(r0)
            if (r0 != 0) goto Le
            goto L19
        Le:
            r1 = 1711867101(0x660904dd, float:1.6176348E23)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 != 0) goto L1a
        L19:
            return
        L1a:
            ᛶᲀᛵ r1 = defpackage.C1141.f5173
            r1.getClass()
            int r1 = defpackage.C1141.m2172()
            int r2 = defpackage.C1141.m2184()
            r3 = 100
            r4 = 0
            int r2 = defpackage.AbstractC1754.m3135(r2, r4, r3)
            boolean r3 = defpackage.C1141.m2214()
            r5 = 8
            if (r3 != 0) goto L3a
            r0.setVisibility(r5)
            return
        L3a:
            r0.setVisibility(r4)
            float r1 = (float) r1
            r0.setTextSize(r1)
            java.lang.String r1 = defpackage.C1141.m2228()
            int r1 = android.graphics.Color.parseColor(r1)     // Catch: java.lang.Exception -> L4a
            goto L4b
        L4a:
            r1 = -1
        L4b:
            r0.setTextColor(r1)
            float r1 = (float) r2
            r2 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r2
            r0.setAlpha(r1)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r2 = r1 instanceof android.widget.FrameLayout.LayoutParams
            if (r2 == 0) goto L60
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            goto L61
        L60:
            r1 = 0
        L61:
            if (r1 == 0) goto L82
            java.util.LinkedHashMap r2 = defpackage.AbstractC2093.f8943
            ᛶᲀᛵ r2 = defpackage.C1141.f5173
            r2.getClass()
            int r2 = defpackage.C1141.m2199()
            int r2 = defpackage.AbstractC2093.m3510(r2)
            r1.setMarginStart(r2)
            int r2 = defpackage.C1141.m2211()
            int r2 = defpackage.AbstractC2093.m3510(r2)
            r1.bottomMargin = r2
            r0.setLayoutParams(r1)
        L82:
            ᛶᲀᛵ r1 = defpackage.C1141.f5173
            r1.getClass()
            boolean r1 = defpackage.C1141.m2214()
            if (r1 == 0) goto L8e
            goto L8f
        L8e:
            r4 = r5
        L8f:
            r0.setVisibility(r4)
            return
    }

    /* JADX INFO: renamed from: ᲈᛵᲀᛱ, reason: contains not printable characters */
    public static defpackage.C1326 m2464(android.content.Context r2) {
            ᛷᛸᛱᛸ r0 = defpackage.C1326.f5855
            if (r0 != 0) goto L19
            java.lang.Object r0 = defpackage.C1326.f5852
            monitor-enter(r0)
            ᛷᛸᛱᛸ r1 = defpackage.C1326.f5855     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            ᛷᛸᛱᛸ r1 = new ᛷᛸᛱᛸ     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            defpackage.C1326.f5855 = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            ᛷᛸᛱᛸ r2 = defpackage.C1326.f5855
            return r2
    }

    /* JADX INFO: renamed from: ᲈᛸᲇ, reason: contains not printable characters */
    public static final void m2465(android.view.View r3) {
            ᛶᲀᛵ r0 = defpackage.C1141.f5173
            r0.getClass()
            int r0 = defpackage.C1141.m2174()
            r1 = 255(0xff, float:3.57E-43)
            int r0 = r0 * r1
            int r0 = r0 / 100
            r2 = 0
            int r0 = defpackage.AbstractC1754.m3135(r0, r2, r1)
            java.lang.String r1 = defpackage.C1141.m2231()     // Catch: java.lang.Exception -> L20
            int r1 = android.graphics.Color.parseColor(r1)     // Catch: java.lang.Exception -> L20
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r2
            goto L23
        L20:
            r1 = 16119285(0xf5f5f5, float:2.258793E-38)
        L23:
            int r0 = r0 << 24
            r0 = r0 | r1
            r3.setBackgroundColor(r0)
            return
    }

    @Override // defpackage.InterfaceC0319
    public defpackage.InterfaceC2182 getSource() {
            r0 = this;
            java.lang.Object r0 = r0.f5857
            ᲈᛵᲈᛵ r0 = (defpackage.C2252) r0
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.f5858
            switch(r0) {
                case 19: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = super.toString()
            return r1
        La:
            java.lang.Object r1 = r1.f5857
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.String r1 = r1.toString()
            return r1
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public synchronized java.util.ArrayList m2466(java.lang.Class r5) {
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L45
            r0.<init>()     // Catch: java.lang.Throwable -> L45
            java.lang.Object r1 = r4.f5856     // Catch: java.lang.Throwable -> L45
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L45
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L45
        Le:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L47
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L45
            ᲈᛶᲈᛵ r2 = (defpackage.C2277) r2     // Catch: java.lang.Throwable -> L45
            java.lang.Object r3 = r4.f5857     // Catch: java.lang.Throwable -> L45
            java.util.HashSet r3 = (java.util.HashSet) r3     // Catch: java.lang.Throwable -> L45
            boolean r3 = r3.contains(r2)     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L25
            goto Le
        L25:
            java.lang.Class r3 = r2.f9628     // Catch: java.lang.Throwable -> L45
            boolean r3 = r3.isAssignableFrom(r5)     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto Le
            java.lang.Object r3 = r4.f5857     // Catch: java.lang.Throwable -> L45
            java.util.HashSet r3 = (java.util.HashSet) r3     // Catch: java.lang.Throwable -> L45
            r3.add(r2)     // Catch: java.lang.Throwable -> L45
            ᛴᛶᲁ r3 = r2.f9627     // Catch: java.lang.Throwable -> L45
            ᲈᛶᲀᛳ r3 = r3.mo365(r4)     // Catch: java.lang.Throwable -> L45
            r0.add(r3)     // Catch: java.lang.Throwable -> L45
            java.lang.Object r3 = r4.f5857     // Catch: java.lang.Throwable -> L45
            java.util.HashSet r3 = (java.util.HashSet) r3     // Catch: java.lang.Throwable -> L45
            r3.remove(r2)     // Catch: java.lang.Throwable -> L45
            goto Le
        L45:
            r5 = move-exception
            goto L49
        L47:
            monitor-exit(r4)
            return r0
        L49:
            java.lang.Object r0 = r4.f5857     // Catch: java.lang.Throwable -> L51
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch: java.lang.Throwable -> L51
            r0.clear()     // Catch: java.lang.Throwable -> L51
            throw r5     // Catch: java.lang.Throwable -> L51
        L51:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L51
            throw r5
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public void m2467(defpackage.C1664 r8) {
            r7 = this;
            monitor-enter(r7)
            java.lang.Object r0 = r7.f5856     // Catch: java.lang.Throwable -> L2c
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Throwable -> L2c
            ᲀᛷᛶᲈ r1 = r8.f7442     // Catch: java.lang.Throwable -> L2c
            r0.remove(r1)     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r8.f7443     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L2f
            ᲁᛸᛸ r2 = r8.f7441     // Catch: java.lang.Throwable -> L2c
            if (r2 != 0) goto L13
            goto L2f
        L13:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2c
            ᲇᛳᛲ r1 = new ᲇᛳᛲ
            ᲀᛷᛶᲈ r5 = r8.f7442
            java.lang.Object r0 = r7.f5859
            r6 = r0
            ᛵᛲᛵᛴ r6 = (defpackage.C0827) r6
            r3 = 1
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r7 = r7.f5859
            ᛵᛲᛵᛴ r7 = (defpackage.C0827) r7
            ᲀᛷᛶᲈ r8 = r8.f7442
            r7.m1756(r8, r1)
            return
        L2c:
            r0 = move-exception
            r8 = r0
            goto L31
        L2f:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2c
            return
        L31:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2c
            throw r8
    }

    @Override // defpackage.InterfaceC0933
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public defpackage.InterfaceC1901 mo1886(defpackage.InterfaceC1901 r3, defpackage.C0533 r4) {
            r2 = this;
            java.lang.Object r0 = r3.get()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            boolean r1 = r0 instanceof android.graphics.drawable.BitmapDrawable
            if (r1 == 0) goto L21
            java.lang.Object r3 = r2.f5857
            ᛸᛶᛱᛵ r3 = (defpackage.C1500) r3
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            java.lang.Object r2 = r2.f5856
            ᛸᲈᲇᲁ r2 = (defpackage.InterfaceC1612) r2
            ᛱᲀᛴᲁ r2 = defpackage.C0162.m691(r2, r0)
            ᲁᛸᛸ r2 = r3.mo1886(r2, r4)
            return r2
        L21:
            boolean r0 = r0 instanceof defpackage.C1064
            if (r0 == 0) goto L2e
            java.lang.Object r2 = r2.f5859
            ᲀᛴᛱᛱ r2 = (defpackage.C1654) r2
            ᲁᛸᛸ r2 = r2.mo1886(r3, r4)
            return r2
        L2e:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable m2468(int r4) {
            r3 = this;
            java.lang.Object r0 = r3.f5856
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            boolean r0 = r0.hasValue(r4)
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r3.f5856
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            r1 = 0
            int r4 = r0.getResourceId(r4, r1)
            if (r4 == 0) goto L2a
            ᛵᛲᲈᛲ r0 = defpackage.C0844.m1774()
            java.lang.Object r3 = r3.f5859
            android.content.Context r3 = (android.content.Context) r3
            monitor-enter(r0)
            ᲇᛶᛸᲈ r1 = r0.f3870     // Catch: java.lang.Throwable -> L27
            r2 = 1
            android.graphics.drawable.Drawable r3 = r1.m3481(r3, r4, r2)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r0)
            return r3
        L27:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r3
        L2a:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ᛳᛸᛱᲇ, reason: contains not printable characters */
    public void m2469() {
            r0 = this;
            java.lang.Object r0 = r0.f5856
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            r0.recycle()
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable m2470(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.f5856
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            boolean r1 = r0.hasValue(r3)
            if (r1 == 0) goto L1a
            r1 = 0
            int r1 = r0.getResourceId(r3, r1)
            if (r1 == 0) goto L1a
            java.lang.Object r2 = r2.f5859
            android.content.Context r2 = (android.content.Context) r2
            android.graphics.drawable.Drawable r2 = defpackage.AbstractC1592.m2873(r2, r1)
            return r2
        L1a:
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r3)
            return r2
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public void m2471(android.os.Bundle r7) {
            r6 = this;
            java.lang.Object r0 = r6.f5857
            java.util.HashSet r0 = (java.util.HashSet) r0
            java.lang.Object r1 = r6.f5859
            android.content.Context r1 = (android.content.Context) r1
            r2 = 1712193563(0x660e001b, float:1.676445E23)
            java.lang.String r1 = r1.getString(r2)
            if (r7 == 0) goto L60
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.ClassNotFoundException -> L59
            r2.<init>()     // Catch: java.lang.ClassNotFoundException -> L59
            java.util.Set r3 = r7.keySet()     // Catch: java.lang.ClassNotFoundException -> L59
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.ClassNotFoundException -> L59
        L1e:
            boolean r4 = r3.hasNext()     // Catch: java.lang.ClassNotFoundException -> L59
            if (r4 == 0) goto L45
            java.lang.Object r4 = r3.next()     // Catch: java.lang.ClassNotFoundException -> L59
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.ClassNotFoundException -> L59
            r5 = 0
            java.lang.String r5 = r7.getString(r4, r5)     // Catch: java.lang.ClassNotFoundException -> L59
            boolean r5 = r1.equals(r5)     // Catch: java.lang.ClassNotFoundException -> L59
            if (r5 == 0) goto L1e
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.ClassNotFoundException -> L59
            java.lang.Class<ᛳᛵᛷᲁ> r5 = defpackage.InterfaceC0485.class
            boolean r5 = r5.isAssignableFrom(r4)     // Catch: java.lang.ClassNotFoundException -> L59
            if (r5 == 0) goto L1e
            r0.add(r4)     // Catch: java.lang.ClassNotFoundException -> L59
            goto L1e
        L45:
            java.util.Iterator r7 = r0.iterator()     // Catch: java.lang.ClassNotFoundException -> L59
        L49:
            boolean r0 = r7.hasNext()     // Catch: java.lang.ClassNotFoundException -> L59
            if (r0 == 0) goto L60
            java.lang.Object r0 = r7.next()     // Catch: java.lang.ClassNotFoundException -> L59
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.ClassNotFoundException -> L59
            r6.m2483(r0, r2)     // Catch: java.lang.ClassNotFoundException -> L59
            goto L49
        L59:
            r6 = move-exception
            ᛸᛵᛳᲀ r7 = new ᛸᛵᛳᲀ
            r7.<init>(r6)
            throw r7
        L60:
            return
    }

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public synchronized java.util.ArrayList m2472(java.lang.Class r5) {
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L30
            r0.<init>()     // Catch: java.lang.Throwable -> L30
            java.lang.Object r1 = r4.f5856     // Catch: java.lang.Throwable -> L30
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L30
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L30
        Le:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L32
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L30
            ᲈᛶᲈᛵ r2 = (defpackage.C2277) r2     // Catch: java.lang.Throwable -> L30
            java.lang.Class r3 = r2.f9629     // Catch: java.lang.Throwable -> L30
            boolean r3 = r0.contains(r3)     // Catch: java.lang.Throwable -> L30
            if (r3 != 0) goto Le
            java.lang.Class r3 = r2.f9628     // Catch: java.lang.Throwable -> L30
            boolean r3 = r3.isAssignableFrom(r5)     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto Le
            java.lang.Class r2 = r2.f9629     // Catch: java.lang.Throwable -> L30
            r0.add(r2)     // Catch: java.lang.Throwable -> L30
            goto Le
        L30:
            r5 = move-exception
            goto L34
        L32:
            monitor-exit(r4)
            return r0
        L34:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L30
            throw r5
    }

    @Override // defpackage.InterfaceC1398
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public java.lang.Object mo913() {
            r3 = this;
            java.lang.Object r0 = r3.f5859
            ᛲᛴᛵᲈ r0 = (defpackage.C0283) r0
            java.lang.Object r0 = r0.mo913()
            if (r0 != 0) goto L30
            java.lang.Object r3 = r3.f5856
            ᛴᛷᛲᛶ r3 = (defpackage.InterfaceC0702) r3
            java.lang.Object r0 = r3.mo1591()
            r3 = 2
            java.lang.String r1 = "FactoryPools"
            boolean r3 = android.util.Log.isLoggable(r1, r3)
            if (r3 == 0) goto L30
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r2 = "Created new "
            r3.<init>(r2)
            java.lang.Class r2 = r0.getClass()
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            android.util.Log.v(r1, r3)
        L30:
            boolean r3 = r0 instanceof defpackage.InterfaceC0545
            if (r3 == 0) goto L3e
            r3 = r0
            ᛳᲀᲀᛳ r3 = (defpackage.InterfaceC0545) r3
            ᛵᛸᛴᛶ r3 = r3.mo1334()
            r1 = 0
            r3.f4231 = r1
        L3e:
            return r0
    }

    @Override // defpackage.InterfaceC1398
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public boolean mo914(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.InterfaceC0545
            if (r0 == 0) goto Le
            r0 = r3
            ᛳᲀᲀᛳ r0 = (defpackage.InterfaceC0545) r0
            ᛵᛸᛴᛶ r0 = r0.mo1334()
            r1 = 1
            r0.f4231 = r1
        Le:
            java.lang.Object r0 = r2.f5857
            ᛸᛸᲀᲇ r0 = (defpackage.InterfaceC1549) r0
            r0.mo2713(r3)
            java.lang.Object r2 = r2.f5859
            ᛲᛴᛵᲈ r2 = (defpackage.C0283) r2
            boolean r2 = r2.mo914(r3)
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛷᲀᛴ, reason: contains not printable characters */
    public android.graphics.Typeface m2473(int r11, int r12, defpackage.C0394 r13) {
            r10 = this;
            java.lang.Object r0 = r10.f5856
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            r1 = 0
            int r5 = r0.getResourceId(r11, r1)
            r11 = 0
            if (r5 != 0) goto Ld
            goto L27
        Ld:
            java.lang.Object r0 = r10.f5857
            android.util.TypedValue r0 = (android.util.TypedValue) r0
            if (r0 != 0) goto L1a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f5857 = r0
        L1a:
            java.lang.Object r10 = r10.f5859
            r2 = r10
            android.content.Context r2 = (android.content.Context) r2
            java.lang.ThreadLocal r10 = defpackage.AbstractC2064.f8872
            boolean r10 = r2.isRestricted()
            if (r10 == 0) goto L28
        L27:
            return r11
        L28:
            android.content.res.Resources r4 = r2.getResources()
            r10 = 1
            r4.getValue(r5, r0, r10)
            java.lang.String r10 = "ResourcesCompat"
            java.lang.CharSequence r1 = r0.string
            if (r1 == 0) goto Le1
            java.lang.String r6 = r1.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r6.startsWith(r1)
            if (r1 != 0) goto L47
            r13.m1136()
            goto Le0
        L47:
            int r1 = r0.assetCookie
            ᲈᛸᛲᛵ r3 = defpackage.AbstractC0796.f3689
            java.lang.String r1 = defpackage.AbstractC0796.m1724(r4, r5, r6, r1, r12)
            java.lang.Object r1 = r3.m3732(r1)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            r3 = 7
            if (r1 == 0) goto L6c
            android.os.Handler r10 = new android.os.Handler
            android.os.Looper r11 = android.os.Looper.getMainLooper()
            r10.<init>(r11)
            ᛸᛳᛴᲁ r11 = new ᛸᛳᛴᲁ
            r11.<init>(r13, r3, r1)
            r10.post(r11)
            r11 = r1
            goto Le0
        L6c:
            java.lang.String r1 = r6.toLowerCase()     // Catch: java.io.IOException -> La3 org.xmlpull.v1.XmlPullParserException -> La6
            java.lang.String r7 = ".xml"
            boolean r1 = r1.endsWith(r7)     // Catch: java.io.IOException -> La3 org.xmlpull.v1.XmlPullParserException -> La6
            if (r1 == 0) goto La9
            android.content.res.XmlResourceParser r1 = r4.getXml(r5)     // Catch: java.io.IOException -> La3 org.xmlpull.v1.XmlPullParserException -> La6
            ᛸᛲᛶᲇ r3 = defpackage.C0292.m946(r1, r4)     // Catch: java.io.IOException -> La3 org.xmlpull.v1.XmlPullParserException -> La6
            if (r3 != 0) goto L94
            java.lang.String r12 = "Failed to find font-family tag"
            android.util.Log.e(r10, r12)     // Catch: java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> L90
            r13.m1136()     // Catch: java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> L90
            goto Le0
        L8c:
            r0 = move-exception
            r12 = r0
            r9 = r13
            goto Lca
        L90:
            r0 = move-exception
            r12 = r0
            r9 = r13
            goto Ld4
        L94:
            int r7 = r0.assetCookie     // Catch: java.io.IOException -> La3 org.xmlpull.v1.XmlPullParserException -> La6
            r8 = r12
            r9 = r13
            android.graphics.Typeface r11 = defpackage.AbstractC0796.m1727(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La0
            goto Le0
        L9d:
            r0 = move-exception
        L9e:
            r12 = r0
            goto Lca
        La0:
            r0 = move-exception
        La1:
            r12 = r0
            goto Ld4
        La3:
            r0 = move-exception
            r9 = r13
            goto L9e
        La6:
            r0 = move-exception
            r9 = r13
            goto La1
        La9:
            r8 = r12
            r9 = r13
            int r12 = r0.assetCookie     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La0
            android.graphics.Typeface r12 = defpackage.AbstractC0796.m1725(r4, r5, r6, r12, r8)     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La0
            if (r12 == 0) goto Lc6
            android.os.Handler r13 = new android.os.Handler     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La0
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La0
            r13.<init>(r0)     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La0
            ᛸᛳᛴᲁ r0 = new ᛸᛳᛴᲁ     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La0
            r0.<init>(r9, r3, r12)     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La0
            r13.post(r0)     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La0
        Lc4:
            r11 = r12
            goto Le0
        Lc6:
            r9.m1136()     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La0
            goto Lc4
        Lca:
            java.lang.String r13 = "Failed to read xml resource "
            java.lang.String r13 = r13.concat(r6)
            android.util.Log.e(r10, r13, r12)
            goto Ldd
        Ld4:
            java.lang.String r13 = "Failed to parse xml resource "
            java.lang.String r13 = r13.concat(r6)
            android.util.Log.e(r10, r13, r12)
        Ldd:
            r9.m1136()
        Le0:
            return r11
        Le1:
            android.content.res.Resources$NotFoundException r10 = new android.content.res.Resources$NotFoundException
            java.lang.String r11 = r4.getResourceName(r5)
            java.lang.String r12 = java.lang.Integer.toHexString(r5)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r1 = "Resource \""
            r13.<init>(r1)
            r13.append(r11)
            java.lang.String r11 = "\" ("
            r13.append(r11)
            r13.append(r12)
            java.lang.String r11 = ") is not a Font: "
            r13.append(r11)
            r13.append(r0)
            java.lang.String r11 = r13.toString()
            r10.<init>(r11)
            throw r10
    }

    @Override // defpackage.InterfaceC0276
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public void mo910(defpackage.C1007 r5) {
            r4 = this;
            r0 = -599010783436334(0xfffddf33ef0961d2, double:NaN)
            java.lang.Object r0 = r4.f5856
            ᛲᛳᲈᲈ r0 = (defpackage.InterfaceC0276) r0
            r0.mo910(r5)     // Catch: java.lang.Throwable -> L12
            ᲁᲀᛱᲁ r5 = defpackage.C1907.f8270     // Catch: java.lang.Throwable -> L12
            goto L19
        L12:
            r5 = move-exception
            ᛴᛸᛲᲀ r0 = new ᛴᛸᛲᲀ
            r0.<init>(r5)
            r5 = r0
        L19:
            java.lang.Object r0 = r4.f5857
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Object r4 = r4.f5859
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Throwable r5 = defpackage.C2165.m3569(r5)
            if (r5 == 0) goto L5a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = -599049438141998(0xfffddf2aef0961d2, double:NaN)
            java.lang.String r2 = "Hook before "
            r1.<init>(r2)
            r1.append(r0)
            r0 = 46
            r1.append(r0)
            r1.append(r4)
            r2 = -599105272716846(0xfffddf1def0961d2, double:NaN)
            java.lang.String r4 = " failed: "
            r1.append(r4)
            java.lang.String r4 = r5.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            defpackage.AbstractC0343.m1009(r4, r5)
        L5a:
            return
    }

    /* JADX INFO: renamed from: ᛸᛱᲈᛳ, reason: contains not printable characters */
    public void m2474(java.lang.String r2) {
            r1 = this;
            java.lang.Object r0 = r1.f5859
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            java.lang.Object r1 = r1.f5856
            java.util.concurrent.locks.ReentrantLock r1 = (java.util.concurrent.locks.ReentrantLock) r1
            r1.lock()
            r0.removeFirstOccurrence(r2)     // Catch: java.lang.Throwable -> L15
            r0.addFirst(r2)     // Catch: java.lang.Throwable -> L15
            r1.unlock()
            return
        L15:
            r2 = move-exception
            r1.unlock()
            throw r2
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public synchronized defpackage.InterfaceC2267 m2475(java.lang.Class r8, java.lang.Class r9) {
            r7 = this;
            monitor-enter(r7)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L51
            r0.<init>()     // Catch: java.lang.Throwable -> L51
            java.lang.Object r1 = r7.f5856     // Catch: java.lang.Throwable -> L51
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L51
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L51
            r2 = 0
            r3 = r2
        L10:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L51
            r5 = 1
            if (r4 == 0) goto L53
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L51
            ᲈᛶᲈᛵ r4 = (defpackage.C2277) r4     // Catch: java.lang.Throwable -> L51
            java.lang.Object r6 = r7.f5857     // Catch: java.lang.Throwable -> L51
            java.util.HashSet r6 = (java.util.HashSet) r6     // Catch: java.lang.Throwable -> L51
            boolean r6 = r6.contains(r4)     // Catch: java.lang.Throwable -> L51
            if (r6 == 0) goto L29
            r3 = r5
            goto L10
        L29:
            java.lang.Class r5 = r4.f9628     // Catch: java.lang.Throwable -> L51
            boolean r5 = r5.isAssignableFrom(r8)     // Catch: java.lang.Throwable -> L51
            if (r5 == 0) goto L10
            java.lang.Class r5 = r4.f9629     // Catch: java.lang.Throwable -> L51
            boolean r5 = r5.isAssignableFrom(r9)     // Catch: java.lang.Throwable -> L51
            if (r5 == 0) goto L10
            java.lang.Object r5 = r7.f5857     // Catch: java.lang.Throwable -> L51
            java.util.HashSet r5 = (java.util.HashSet) r5     // Catch: java.lang.Throwable -> L51
            r5.add(r4)     // Catch: java.lang.Throwable -> L51
            ᛴᛶᲁ r5 = r4.f9627     // Catch: java.lang.Throwable -> L51
            ᲈᛶᲀᛳ r5 = r5.mo365(r7)     // Catch: java.lang.Throwable -> L51
            r0.add(r5)     // Catch: java.lang.Throwable -> L51
            java.lang.Object r5 = r7.f5857     // Catch: java.lang.Throwable -> L51
            java.util.HashSet r5 = (java.util.HashSet) r5     // Catch: java.lang.Throwable -> L51
            r5.remove(r4)     // Catch: java.lang.Throwable -> L51
            goto L10
        L51:
            r8 = move-exception
            goto L95
        L53:
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L51
            if (r1 <= r5) goto L65
            java.lang.Object r8 = r7.f5859     // Catch: java.lang.Throwable -> L51
            ᛷᛸᛱᛸ r8 = (defpackage.C1326) r8     // Catch: java.lang.Throwable -> L51
            ᛶᛷᛷᛷ r9 = new ᛶᛷᛷᛷ     // Catch: java.lang.Throwable -> L51
            r1 = 2
            r9.<init>(r0, r1, r8)     // Catch: java.lang.Throwable -> L51
            monitor-exit(r7)
            return r9
        L65:
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L51
            if (r1 != r5) goto L73
            java.lang.Object r8 = r0.get(r2)     // Catch: java.lang.Throwable -> L51
            ᲈᛶᲀᛳ r8 = (defpackage.InterfaceC2267) r8     // Catch: java.lang.Throwable -> L51
            monitor-exit(r7)
            return r8
        L73:
            if (r3 == 0) goto L79
            ᲈᛶᛷᛱ r8 = defpackage.C1326.f5853     // Catch: java.lang.Throwable -> L51
            monitor-exit(r7)
            return r8
        L79:
            ᲇᲇᛳᲀ r0 = new ᲇᲇᛳᲀ     // Catch: java.lang.Throwable -> L51
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = "Failed to find any ModelLoaders for model: "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L51
            r1.append(r8)     // Catch: java.lang.Throwable -> L51
            java.lang.String r8 = " and data: "
            r1.append(r8)     // Catch: java.lang.Throwable -> L51
            r1.append(r9)     // Catch: java.lang.Throwable -> L51
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> L51
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L51
            throw r0     // Catch: java.lang.Throwable -> L51
        L95:
            java.lang.Object r9 = r7.f5857     // Catch: java.lang.Throwable -> L9d
            java.util.HashSet r9 = (java.util.HashSet) r9     // Catch: java.lang.Throwable -> L9d
            r9.clear()     // Catch: java.lang.Throwable -> L9d
            throw r8     // Catch: java.lang.Throwable -> L9d
        L9d:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L9d
            throw r8
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public android.graphics.Bitmap m2476(android.graphics.BitmapFactory.Options r6) {
            r5 = this;
            int r0 = r5.f5858
            switch(r0) {
                case 15: goto L7f;
                case 16: goto L6f;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r5.f5859
            com.bumptech.glide.load.data.ᛷᲁᛳᛳ r0 = (com.bumptech.glide.load.data.C0006) r0
            android.os.ParcelFileDescriptor r0 = r0.m231()
            java.io.FileDescriptor r0 = r0.getFileDescriptor()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            r3 = 34
            if (r1 != r3) goto L6a
            r4 = 0
            if (r1 == r3) goto L1c
            goto L22
        L1c:
            android.graphics.Bitmap$Config r1 = r6.inPreferredConfig
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.HARDWARE
            if (r1 == r3) goto L24
        L22:
            r1 = r4
            goto L30
        L24:
            ᲈᛵᛷᛱ r1 = defpackage.AbstractC0425.f2121
            java.lang.Object r1 = r1.get()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
        L30:
            if (r1 == 0) goto L6a
            boolean r5 = defpackage.C1825.m3223(r5)
            if (r5 == 0) goto L6a
            android.graphics.Bitmap$Config r5 = r6.inPreferredConfig
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.HARDWARE
            if (r5 != r1) goto L3f
            r4 = 1
        L3f:
            java.lang.String r5 = ""
            defpackage.C0292.m945(r5, r4)
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            r6.inPreferredConfig = r5
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeFileDescriptor(r0, r2, r6)     // Catch: java.lang.Throwable -> L5f
            if (r5 != 0) goto L54
            if (r5 == 0) goto L51
            goto L58
        L51:
            r6.inPreferredConfig = r1
            goto L6e
        L54:
            android.graphics.Bitmap r2 = defpackage.C1825.m3221(r5)     // Catch: java.lang.Throwable -> L5c
        L58:
            r5.recycle()
            goto L51
        L5c:
            r0 = move-exception
            r2 = r5
            goto L60
        L5f:
            r0 = move-exception
        L60:
            if (r2 == 0) goto L65
            r2.recycle()
        L65:
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.HARDWARE
            r6.inPreferredConfig = r5
            throw r0
        L6a:
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFileDescriptor(r0, r2, r6)
        L6e:
            return r2
        L6f:
            java.lang.Object r0 = r5.f5856
            ᛸᲈᛸᲈ r0 = (defpackage.C1606) r0
            java.lang.Object r0 = r0.f7101
            ᲈᛵᲈᛲ r0 = (defpackage.C2250) r0
            r0.reset()
            android.graphics.Bitmap r5 = defpackage.C1825.m3219(r0, r6, r5)
            return r5
        L7f:
            java.lang.Object r0 = r5.f5856
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteBuffer r0 = defpackage.AbstractC0036.m362(r0)
            ᛵᛱᲈᛷ r1 = new ᛵᛱᲈᛷ
            r1.<init>(r0)
            android.graphics.Bitmap r5 = defpackage.C1825.m3219(r1, r6, r5)
            return r5
    }

    /* JADX INFO: renamed from: ᲀᲀᛴᛳ, reason: contains not printable characters */
    public java.util.List m2477() {
            r1 = this;
            java.lang.Object r0 = r1.f5859
            ᛴᛸᛳᛳ r0 = (defpackage.C0726) r0
            if (r0 != 0) goto Ld
            ᛴᛸᛳᛳ r0 = new ᛴᛸᛳᛳ
            r0.<init>(r1)
            r1.f5859 = r0
        Ld:
            return r0
    }

    /* JADX INFO: renamed from: ᲁᛴᛵᛲ, reason: contains not printable characters */
    public com.bumptech.glide.load.ImageHeaderParser$ImageType m2478() {
            r9 = this;
            int r0 = r9.f5858
            switch(r0) {
                case 15: goto L6b;
                case 16: goto L53;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r9.f5857
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r1 = r9.f5859
            com.bumptech.glide.load.data.ᛷᲁᛳᛳ r1 = (com.bumptech.glide.load.data.C0006) r1
            java.lang.Object r9 = r9.f5856
            ᲇᛶᛳᛱ r9 = (defpackage.C2063) r9
            int r2 = r0.size()
            r3 = 0
        L16:
            if (r3 >= r2) goto L50
            java.lang.Object r4 = r0.get(r3)
            ᛷᛱᲇᛴ r4 = (defpackage.InterfaceC1215) r4
            r5 = 0
            ᲈᛵᲈᛲ r6 = new ᲈᛵᲈᛲ     // Catch: java.lang.Throwable -> L46
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L46
            android.os.ParcelFileDescriptor r8 = r1.m231()     // Catch: java.lang.Throwable -> L46
            java.io.FileDescriptor r8 = r8.getFileDescriptor()     // Catch: java.lang.Throwable -> L46
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L46
            r6.<init>(r7, r9)     // Catch: java.lang.Throwable -> L46
            com.bumptech.glide.load.ImageHeaderParser$ImageType r4 = r4.mo805(r6)     // Catch: java.lang.Throwable -> L43
            r6.m3637()
            r1.m231()
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN
            if (r4 == r5) goto L40
            goto L52
        L40:
            int r3 = r3 + 1
            goto L16
        L43:
            r9 = move-exception
            r5 = r6
            goto L47
        L46:
            r9 = move-exception
        L47:
            if (r5 == 0) goto L4c
            r5.m3637()
        L4c:
            r1.m231()
            throw r9
        L50:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r4 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN
        L52:
            return r4
        L53:
            java.lang.Object r0 = r9.f5859
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r1 = r9.f5856
            ᛸᲈᛸᲈ r1 = (defpackage.C1606) r1
            java.lang.Object r1 = r1.f7101
            ᲈᛵᲈᛲ r1 = (defpackage.C2250) r1
            r1.reset()
            java.lang.Object r9 = r9.f5857
            ᲇᛶᛳᛱ r9 = (defpackage.C2063) r9
            com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = defpackage.AbstractC1849.m3241(r0, r1, r9)
            return r9
        L6b:
            java.lang.Object r0 = r9.f5857
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r9 = r9.f5856
            java.nio.ByteBuffer r9 = (java.nio.ByteBuffer) r9
            java.nio.ByteBuffer r9 = defpackage.AbstractC0036.m362(r9)
            com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = defpackage.AbstractC1849.m3250(r0, r9)
            return r9
    }

    /* JADX INFO: renamed from: ᲁᲈᛳ, reason: contains not printable characters */
    public boolean m2479() {
            r11 = this;
            int r0 = r11.f5858
            r1 = 0
            r2 = 1
            switch(r0) {
                case 15: goto L8b;
                case 16: goto L52;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r11.f5857
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r3 = r11.f5859
            com.bumptech.glide.load.data.ᛷᲁᛳᛳ r3 = (com.bumptech.glide.load.data.C0006) r3
            java.lang.Object r11 = r11.f5856
            ᲇᛶᛳᛱ r11 = (defpackage.C2063) r11
            int r4 = r0.size()
            r5 = r1
        L18:
            if (r5 >= r4) goto L51
            java.lang.Object r6 = r0.get(r5)
            ᛷᛱᲇᛴ r6 = (defpackage.InterfaceC1215) r6
            r7 = 0
            ᲈᛵᲈᛲ r8 = new ᲈᛵᲈᛲ     // Catch: java.lang.Throwable -> L47
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L47
            android.os.ParcelFileDescriptor r10 = r3.m231()     // Catch: java.lang.Throwable -> L47
            java.io.FileDescriptor r10 = r10.getFileDescriptor()     // Catch: java.lang.Throwable -> L47
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L47
            r8.<init>(r9, r11)     // Catch: java.lang.Throwable -> L47
            boolean r6 = r6.mo800(r8, r11)     // Catch: java.lang.Throwable -> L44
            r8.m3637()
            r3.m231()
            if (r6 == 0) goto L41
            r1 = r2
            goto L51
        L41:
            int r5 = r5 + 1
            goto L18
        L44:
            r11 = move-exception
            r7 = r8
            goto L48
        L47:
            r11 = move-exception
        L48:
            if (r7 == 0) goto L4d
            r7.m3637()
        L4d:
            r3.m231()
            throw r11
        L51:
            return r1
        L52:
            java.lang.Object r0 = r11.f5859
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r3 = r11.f5856
            ᛸᲈᛸᲈ r3 = (defpackage.C1606) r3
            java.lang.Object r3 = r3.f7101
            ᲈᛵᲈᛲ r3 = (defpackage.C2250) r3
            r3.reset()
            java.lang.Object r11 = r11.f5857
            ᲇᛶᛳᛱ r11 = (defpackage.C2063) r11
            r4 = 5242880(0x500000, float:7.34684E-39)
            r3.mark(r4)
            int r4 = r0.size()
            r5 = r1
        L6f:
            if (r5 >= r4) goto L8a
            java.lang.Object r6 = r0.get(r5)
            ᛷᛱᲇᛴ r6 = (defpackage.InterfaceC1215) r6
            boolean r6 = r6.mo800(r3, r11)     // Catch: java.lang.Throwable -> L85
            r3.reset()
            if (r6 == 0) goto L82
            r1 = r2
            goto L8a
        L82:
            int r5 = r5 + 1
            goto L6f
        L85:
            r11 = move-exception
            r3.reset()
            throw r11
        L8a:
            return r1
        L8b:
            java.lang.Object r0 = r11.f5857
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r3 = r11.f5856
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            java.nio.ByteBuffer r3 = defpackage.AbstractC0036.m362(r3)
            java.lang.Object r11 = r11.f5859
            ᲇᛶᛳᛱ r11 = (defpackage.C2063) r11
            if (r3 != 0) goto L9e
            goto Lc4
        L9e:
            int r4 = r0.size()
            r5 = r1
        La3:
            if (r5 >= r4) goto Lc4
            java.lang.Object r6 = r0.get(r5)
            ᛷᛱᲇᛴ r6 = (defpackage.InterfaceC1215) r6
            boolean r6 = r6.mo802(r3, r11)     // Catch: java.lang.Throwable -> Lbc
            java.nio.Buffer r7 = r3.position(r1)
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            if (r6 == 0) goto Lb9
            r1 = r2
            goto Lc4
        Lb9:
            int r5 = r5 + 1
            goto La3
        Lbc:
            r11 = move-exception
            java.nio.Buffer r0 = r3.position(r1)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            throw r11
        Lc4:
            return r1
    }

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public android.content.res.ColorStateList m2480(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.f5856
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            boolean r1 = r0.hasValue(r3)
            if (r1 == 0) goto L1c
            r1 = 0
            int r1 = r0.getResourceId(r3, r1)
            if (r1 == 0) goto L1c
            java.lang.Object r2 = r2.f5859
            android.content.Context r2 = (android.content.Context) r2
            android.content.res.ColorStateList r2 = defpackage.AbstractC2279.m3698(r2, r1)
            if (r2 == 0) goto L1c
            return r2
        L1c:
            android.content.res.ColorStateList r2 = r0.getColorStateList(r3)
            return r2
    }

    @Override // defpackage.InterfaceC0276
    /* JADX INFO: renamed from: ᲇᛱᛸᲇ */
    public void mo911(defpackage.C1741 r5) {
            r4 = this;
            r0 = -599148222389806(0xfffddf13ef0961d2, double:NaN)
            java.lang.Object r0 = r4.f5856
            ᛲᛳᲈᲈ r0 = (defpackage.InterfaceC0276) r0
            r0.mo911(r5)     // Catch: java.lang.Throwable -> L12
            ᲁᲀᛱᲁ r5 = defpackage.C1907.f8270     // Catch: java.lang.Throwable -> L12
            goto L19
        L12:
            r5 = move-exception
            ᛴᛸᛲᲀ r0 = new ᛴᛸᛲᲀ
            r0.<init>(r5)
            r5 = r0
        L19:
            java.lang.Object r0 = r4.f5857
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Object r4 = r4.f5859
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Throwable r5 = defpackage.C2165.m3569(r5)
            if (r5 == 0) goto L5a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = -599186877095470(0xfffddf0aef0961d2, double:NaN)
            java.lang.String r2 = "Hook after "
            r1.<init>(r2)
            r1.append(r0)
            r0 = 46
            r1.append(r0)
            r1.append(r4)
            r2 = -599238416703022(0xfffddefeef0961d2, double:NaN)
            java.lang.String r4 = " failed: "
            r1.append(r4)
            java.lang.String r4 = r5.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            defpackage.AbstractC0343.m1009(r4, r5)
        L5a:
            return
    }

    /* JADX INFO: renamed from: ᲇᛳᛴᲈ, reason: contains not printable characters */
    public defpackage.AbstractC1725 m2481(java.lang.Class r6) {
            r5 = this;
            java.lang.Object r0 = r5.f5856
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r1 = r0.get(r6)
            ᲀᛸᛶᛶ r1 = (defpackage.AbstractC1725) r1
            if (r1 == 0) goto Ld
            return r1
        Ld:
            java.lang.Class<java.util.List> r2 = java.util.List.class
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            if (r6 == 0) goto L30
            boolean r4 = r3.isAssignableFrom(r6)
            if (r4 == 0) goto L1f
            ᛶᲀᲈᲇ r1 = new ᛶᲀᲈᲇ
            r1.<init>(r5, r6)
            goto L2a
        L1f:
            boolean r4 = r2.isAssignableFrom(r6)
            if (r4 == 0) goto L2a
            ᛶᲀᲈᲇ r1 = new ᛶᲀᲈᲇ
            r1.<init>(r5, r6)
        L2a:
            if (r1 == 0) goto L30
            r0.put(r6, r1)
            return r1
        L30:
            boolean r1 = r6.isArray()
            if (r1 == 0) goto L3f
            ᲇᛳᲈᛶ r1 = new ᲇᛳᲈᛶ
            r1.<init>(r5, r6)
            r0.putIfAbsent(r6, r1)
            return r1
        L3f:
            boolean r5 = r2.isAssignableFrom(r6)
            r0 = 0
            if (r5 != 0) goto L5c
            boolean r5 = r3.isAssignableFrom(r6)
            if (r5 == 0) goto L58
            boolean r5 = r6.isInterface()
            if (r5 == 0) goto L54
            java.lang.Class<ᛱᲈᛳᛸ> r6 = defpackage.C0213.class
        L54:
            defpackage.AbstractC1665.m3062(r6)
            throw r0
        L58:
            defpackage.AbstractC1665.m3062(r6)
            throw r0
        L5c:
            boolean r5 = r6.isInterface()
            if (r5 == 0) goto L64
            java.lang.Class<ᛵᛲᛳᛸ> r6 = defpackage.C0823.class
        L64:
            defpackage.AbstractC1665.m3062(r6)
            throw r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛱᛱ, reason: contains not printable characters */
    public void m2482(java.lang.Class r1, defpackage.AbstractC1725 r2) {
            r0 = this;
            java.lang.Object r0 = r0.f5856
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            r0.put(r1, r2)
            return
    }

    @Override // defpackage.InterfaceC1261
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public void mo1213(defpackage.C1876 r37) {
            r36 = this;
            r0 = r36
            int r1 = r0.f5858
            switch(r1) {
                case 6: goto L510;
                case 24: goto L2b0;
                default: goto L7;
            }
        L7:
            r1 = -125546473627182(0xffff8dd0ef0961d2, double:NaN)
            java.lang.Object r1 = r0.f5856
            r12 = r1
            ᛲᛷᛶᲀ r12 = (defpackage.C0321) r12
            android.widget.Switch r1 = r12.f1668
            android.widget.Switch r2 = r12.f1674
            r5 = -125576538398254(0xffff8dc9ef0961d2, double:NaN)
            android.widget.SeekBar r5 = r12.f1673
            r13 = -125640962907694(0xffff8dbaef0961d2, double:NaN)
            android.widget.TextView r6 = r12.f1672
            r13 = -125726862253614(0xffff8da6ef0961d2, double:NaN)
            android.widget.TextView r13 = r12.f1657
            r14 = -125791286763054(0xffff8d97ef0961d2, double:NaN)
            android.widget.TextView r14 = r12.f1658
            r15 = -125881481076270(0xffff8d82ef0961d2, double:NaN)
            android.widget.LinearLayout r15 = r12.f1665
            r16 = -125967380422190(0xffff8d6eef0961d2, double:NaN)
            android.view.View r11 = r12.f1677
            r17 = -126036099898926(0xffff8d5eef0961d2, double:NaN)
            android.widget.TextView r8 = r12.f1661
            r18 = -126126294212142(0xffff8d49ef0961d2, double:NaN)
            android.widget.SeekBar r3 = r12.f1670
            r19 = -126199308656174(0xffff8d38ef0961d2, double:NaN)
            android.widget.TextView r9 = r12.f1660
            r20 = -126289502969390(0xffff8d23ef0961d2, double:NaN)
            android.widget.TextView r7 = r12.f1664
            r21 = -126358222446126(0xffff8d13ef0961d2, double:NaN)
            android.widget.TextView r4 = r12.f1675
            r22 = -126452711726638(0xffff8cfdef0961d2, double:NaN)
            android.widget.SeekBar r10 = r12.f1676
            r23 = -126542906039854(0xffff8ce8ef0961d2, double:NaN)
            r23 = r15
            android.widget.TextView r15 = r12.f1671
            r24 = -126658870156846(0xffff8ccdef0961d2, double:NaN)
            r24 = r4
            android.widget.TextView r4 = r12.f1659
            r25 = -126753359437358(0xffff8cb7ef0961d2, double:NaN)
            r25 = r4
            android.widget.TextView r4 = r12.f1669
            r26 = -126873618521646(0xffff8c9bef0961d2, double:NaN)
            r26 = r4
            android.widget.SeekBar r4 = r12.f1662
            r27 = -126989582638638(0xffff8c80ef0961d2, double:NaN)
            r27 = r7
            android.widget.TextView r7 = r12.f1667
            r28 = -127109841722926(0xffff8c64ef0961d2, double:NaN)
            r28 = r14
            android.widget.TextView r14 = r12.f1678
            r29 = -127208625970734(0xffff8c4def0961d2, double:NaN)
            r29 = r14
            android.widget.TextView r14 = r12.f1656
            r30 = -127333180022318(0xffff8c30ef0961d2, double:NaN)
            r30 = r14
            android.widget.Switch r14 = r12.f1663
            r31 = -127453439106606(0xffff8c14ef0961d2, double:NaN)
            r31 = r12
            java.lang.Object r12 = r0.f5859
            android.content.Context r12 = (android.content.Context) r12
            android.content.res.Resources r32 = r12.getResources()
            r33 = r12
            android.util.DisplayMetrics r12 = r32.getDisplayMetrics()
            int r0 = r12.widthPixels
            float r0 = (float) r0
            r32 = r0
            float r0 = r12.density
            r34 = r0
            float r0 = r32 / r34
            int r0 = (int) r0
            int r12 = r12.heightPixels
            float r12 = (float) r12
            float r12 = r12 / r34
            int r12 = (int) r12
            r10.setMax(r0)
            r4.setMax(r12)
            ᛶᲀᛵ r32 = defpackage.C1141.f5173
            r32.getClass()
            r32 = r13
            int r13 = defpackage.C1141.m2172()
            r34 = r8
            int r8 = defpackage.C1141.m2184()
            r35 = r11
            r21 = r14
            r11 = 100
            r14 = 0
            int r8 = defpackage.AbstractC1754.m3135(r8, r14, r11)
            int r11 = defpackage.C1141.m2199()
            if (r11 <= r0) goto L143
            goto L144
        L143:
            r0 = r11
        L144:
            int r11 = defpackage.C1141.m2211()
            if (r11 <= r12) goto L14b
            goto L14c
        L14b:
            r12 = r11
        L14c:
            boolean r11 = defpackage.C1141.m2208()
            r1.setChecked(r11)
            boolean r11 = defpackage.C1141.m2214()
            r2.setChecked(r11)
            r5.setProgress(r13)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r13)
            r13 = -127586583092782(0xffff8bf5ef0961d2, double:NaN)
            java.lang.String r13 = "sp"
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            r6.setText(r11)
            r3.setProgress(r8)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r9.setText(r8)
            r10.setProgress(r0)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            r13 = -127599467994670(0xffff8bf2ef0961d2, double:NaN)
            java.lang.String r0 = "dp"
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            r15.setText(r0)
            r4.setProgress(r12)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r11 = -127612352896558(0xffff8befef0961d2, double:NaN)
            java.lang.String r8 = "dp"
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            r7.setText(r0)
            ᲀᲇᛸᛶ r0 = defpackage.C1141.f5108
            ᲁᛷᛶᛶ[] r8 = defpackage.C1141.f5221
            r11 = 19
            r8 = r8[r11]
            java.lang.Object r0 = r0.m3169(r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r8 = r21
            r8.setChecked(r0)
            java.lang.String r0 = defpackage.C1141.m2228()
            int r12 = android.graphics.Color.parseColor(r0)     // Catch: java.lang.Exception -> L1e0
        L1dd:
            r13 = r35
            goto L1e2
        L1e0:
            r12 = -1
            goto L1dd
        L1e2:
            r13.setBackgroundColor(r12)
            r12 = r34
            r12.setText(r0)
            m2463()
            ᛷᛵᛲᲀ r0 = new ᛷᛵᛲᲀ
            r14 = 2
            r0.<init>(r5, r14)
            r14 = r32
            r14.setOnClickListener(r0)
            ᛷᛵᛲᲀ r0 = new ᛷᛵᛲᲀ
            r14 = 4
            r0.<init>(r5, r14)
            r14 = r28
            r14.setOnClickListener(r0)
            ᛷᛵᛲᲀ r0 = new ᛷᛵᛲᲀ
            r14 = 5
            r0.<init>(r3, r14)
            r14 = r27
            r14.setOnClickListener(r0)
            ᛷᛵᛲᲀ r0 = new ᛷᛵᛲᲀ
            r14 = 6
            r0.<init>(r3, r14)
            r14 = r24
            r14.setOnClickListener(r0)
            ᛷᛵᛲᲀ r0 = new ᛷᛵᛲᲀ
            r14 = 7
            r0.<init>(r10, r14)
            r14 = r25
            r14.setOnClickListener(r0)
            ᛷᛵᛲᲀ r0 = new ᛷᛵᛲᲀ
            r14 = 8
            r0.<init>(r10, r14)
            r14 = r26
            r14.setOnClickListener(r0)
            ᛷᛵᛲᲀ r0 = new ᛷᛵᛲᲀ
            r14 = 9
            r0.<init>(r4, r14)
            r14 = r29
            r14.setOnClickListener(r0)
            ᛷᛵᛲᲀ r0 = new ᛷᛵᛲᲀ
            r14 = 3
            r0.<init>(r4, r14)
            r14 = r30
            r14.setOnClickListener(r0)
            ᛷᲀᛸᛳ r0 = new ᛷᲀᛸᛳ
            r14 = 18
            r0.<init>(r14)
            r1.setOnCheckedChangeListener(r0)
            ᛷᲀᛸᛳ r0 = new ᛷᲀᛸᛳ
            r0.<init>(r11)
            r2.setOnCheckedChangeListener(r0)
            ᛳᲈᛶᲁ r0 = new ᛳᲈᛶᲁ
            r1 = 1
            r0.<init>(r6, r1)
            r5.setOnSeekBarChangeListener(r0)
            ᲀᲇᛶ r1 = new ᲀᲇᛶ
            r6 = 12
            r2 = r37
            r0 = r3
            r5 = r12
            r3 = r33
            r12 = r4
            r4 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            r6 = r2
            r2 = r1
            r1 = r23
            r1.setOnClickListener(r2)
            ᛳᲈᛶᲁ r1 = new ᛳᲈᛶᲁ
            r14 = 2
            r1.<init>(r9, r14)
            r0.setOnSeekBarChangeListener(r1)
            ᛳᲈᛶᲁ r0 = new ᛳᲈᛶᲁ
            r14 = 3
            r0.<init>(r15, r14)
            r10.setOnSeekBarChangeListener(r0)
            ᛳᲈᛶᲁ r0 = new ᛳᲈᛶᲁ
            r14 = 4
            r0.<init>(r7, r14)
            r12.setOnSeekBarChangeListener(r0)
            ᛷᲀᛸᛳ r0 = new ᛷᲀᛸᛳ
            r1 = 20
            r0.<init>(r1)
            r8.setOnCheckedChangeListener(r0)
            r1 = r31
            android.widget.ImageView r0 = r1.f1666
            r8 = r36
            java.lang.Object r1 = r8.f5857
            ᲀᲈᛵᲇ r1 = (defpackage.InterfaceC1781) r1
            ᛳᛲᛶᛶ r2 = new ᛳᛲᛶᛶ
            r2.<init>(r6, r11, r1)
            r0.setOnClickListener(r2)
            return
        L2b0:
            r6 = r37
            r8 = r0
            r0 = -103732334730798(0xffffa1a7ef0961d2, double:NaN)
            java.lang.Object r0 = r8.f5856
            ᛷᛷᛸᛱ r0 = (defpackage.C1315) r0
            java.lang.Object r1 = r0.f5821
            r14 = r1
            android.widget.Switch r14 = (android.widget.Switch) r14
            r3 = -103762399501870(0xffffa1a0ef0961d2, double:NaN)
            android.widget.TextView r1 = r0.f5815
            r11 = r1
            android.widget.EditText r11 = (android.widget.EditText) r11
            r3 = -103839708913198(0xffffa18eef0961d2, double:NaN)
            android.view.View r1 = r0.f5819
            r3 = r1
            android.widget.EditText r3 = (android.widget.EditText) r3
            r4 = -103904133422638(0xffffa17fef0961d2, double:NaN)
            android.widget.TextView r1 = r0.f5812
            android.widget.Button r1 = (android.widget.Button) r1
            r4 = -103968557932078(0xffffa170ef0961d2, double:NaN)
            android.view.View r4 = r0.f5818
            android.widget.Button r4 = (android.widget.Button) r4
            r9 = -104011507605038(0xffffa166ef0961d2, double:NaN)
            android.view.View r5 = r0.f5810
            android.widget.Button r5 = (android.widget.Button) r5
            r9 = -104050162310702(0xffffa15def0961d2, double:NaN)
            android.view.View r7 = r0.f5811
            android.widget.Button r7 = (android.widget.Button) r7
            r9 = -104093111983662(0xffffa153ef0961d2, double:NaN)
            android.view.View r9 = r0.f5823
            r15 = r9
            android.widget.SeekBar r15 = (android.widget.SeekBar) r15
            r9 = -104131766689326(0xffffa14aef0961d2, double:NaN)
            android.view.View r9 = r0.f5820
            android.widget.SeekBar r9 = (android.widget.SeekBar) r9
            r12 = -104217666035246(0xffffa136ef0961d2, double:NaN)
            android.widget.EditText r13 = r0.f5817
            r17 = -104303565381166(0xffffa122ef0961d2, double:NaN)
            android.widget.TextView r10 = r0.f5824
            android.widget.Button r10 = (android.widget.Button) r10
            r17 = -104337925119534(0xffffa11aef0961d2, double:NaN)
            java.lang.Object r12 = r0.f5809
            android.widget.Button r12 = (android.widget.Button) r12
            r17 = -104398054661678(0xffffa10cef0961d2, double:NaN)
            android.view.View r2 = r0.f5813
            android.widget.SeekBar r2 = (android.widget.SeekBar) r2
            r19 = -104453889236526(0xffffa0ffef0961d2, double:NaN)
            r17 = r10
            android.util.DisplayMetrics r10 = new android.util.DisplayMetrics
            r10.<init>()
            r19 = r12
            java.lang.Object r12 = r8.f5859
            android.content.Context r12 = (android.content.Context) r12
            r20 = -104509723811374(0xffffa0f2ef0961d2, double:NaN)
            java.lang.String r6 = "window"
            java.lang.Object r6 = r12.getSystemService(r6)
            r20 = -104539788582446(0xffffa0ebef0961d2, double:NaN)
            android.view.WindowManager r6 = (android.view.WindowManager) r6
            android.view.Display r6 = r6.getDefaultDisplay()
            r6.getMetrics(r10)
            int r6 = r10.widthPixels
            int r10 = r10.heightPixels
            int r12 = r6 * 2
            r15.setMax(r12)
            r20 = r0
            int r0 = r10 * 2
            r9.setMax(r0)
            r23 = 4591870180174331904(0x3fb99999a0000000, double:0.10000000149011612)
            r21 = r4
            r30 = r5
            double r4 = java.lang.Math.log(r23)
            r23 = 4613937818241073152(0x4008000000000000, double:3.0)
            r31 = r7
            double r7 = java.lang.Math.log(r23)
            r32 = r1
            r1 = 1000(0x3e8, float:1.401E-42)
            r2.setMax(r1)
            ᛶᲀᛵ r1 = defpackage.C1141.f5173
            r1.getClass()
            ᲀᲇᛸᛶ r1 = defpackage.C1141.f5092
            ᲁᛷᛶᛶ[] r23 = defpackage.C1141.f5221
            r24 = 137(0x89, float:1.92E-43)
            r33 = r2
            r2 = r23[r24]
            java.lang.Object r1 = r1.m3169(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r14.setChecked(r1)
            float r1 = defpackage.C1141.m2182()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r11.setText(r1)
            float r1 = defpackage.C1141.m2206()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.setText(r1)
            float r1 = defpackage.C1141.m2182()
            float r2 = (float) r6
            float r1 = r1 + r2
            int r1 = (int) r1
            r2 = 0
            int r1 = defpackage.AbstractC1754.m3135(r1, r2, r12)
            r15.setProgress(r1)
            float r1 = defpackage.C1141.m2206()
            float r12 = (float) r10
            float r1 = r1 + r12
            int r1 = (int) r1
            int r0 = defpackage.AbstractC1754.m3135(r1, r2, r0)
            r9.setProgress(r0)
            ᲀᲇᛸᛶ r0 = defpackage.C1141.f5113
            r1 = 140(0x8c, float:1.96E-43)
            r1 = r23[r1]
            java.lang.Object r0 = r0.m3169(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r0 = defpackage.AbstractC1754.m3162(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r13.setText(r1)
            int r0 = m2460(r0, r4, r7)
            r2 = r33
            r2.setProgress(r0)
            r0 = r36
            java.lang.Object r1 = r0.f5859
            android.content.Context r1 = (android.content.Context) r1
            ᛶᛸᲈᛶ r26 = new ᛶᛸᲈᛶ
            r12 = r10
            r10 = r1
            r1 = r9
            r9 = r26
            r26 = r4
            r5 = r12
            r12 = r3
            r3 = r17
            r4 = r19
            r9.<init>(r10, r11, r12, r13, r14)
            r24 = r13
            ᲈᛸᛸᲈ r10 = new ᲈᛸᛸᲈ
            r13 = 0
            r10.<init>(r11, r9, r6, r13)
            r15.setOnSeekBarChangeListener(r10)
            ᲈᛸᛸᲈ r10 = new ᲈᛸᛸᲈ
            r13 = 1
            r10.<init>(r12, r9, r5, r13)
            r1.setOnSeekBarChangeListener(r10)
            ᲈᲁᛶᛳ r23 = new ᲈᲁᛶᛳ
            r28 = r7
            r25 = r9
            r23.<init>(r24, r25, r26, r28)
            r10 = r23
            r13 = r24
            r7 = r26
            r9 = r30
            r26 = r25
            r29 = r28
            r2.setOnSeekBarChangeListener(r10)
            ᛱᲈᛲᲈ r23 = new ᛱᲈᛲᲈ
            r28 = 0
            r27 = r6
            r24 = r11
            r25 = r15
            r23.<init>(r24, r25, r26, r27, r28)
            r10 = r23
            r6 = r32
            r6.setOnClickListener(r10)
            ᛱᲈᛲᲈ r23 = new ᛱᲈᛲᲈ
            r28 = 1
            r23.<init>(r24, r25, r26, r27, r28)
            r6 = r21
            r10 = r23
            r6.setOnClickListener(r10)
            ᛱᲈᛲᲈ r23 = new ᛱᲈᛲᲈ
            r28 = 2
            r25 = r1
            r27 = r5
            r24 = r12
            r23.<init>(r24, r25, r26, r27, r28)
            r1 = r23
            r9.setOnClickListener(r1)
            ᛱᲈᛲᲈ r23 = new ᛱᲈᛲᲈ
            r28 = 3
            r23.<init>(r24, r25, r26, r27, r28)
            r5 = r23
            r1 = r31
            r1.setOnClickListener(r5)
            ᛷᛲᛳᲇ r23 = new ᛷᛲᛳᲇ
            r31 = 0
            r25 = r2
            r27 = r7
            r24 = r13
            r23.<init>(r24, r25, r26, r27, r29, r31)
            r1 = r23
            r9 = r26
            r26 = r27
            r3.setOnClickListener(r1)
            ᛷᛲᛳᲇ r23 = new ᛷᛲᛳᲇ
            r31 = 1
            r27 = r26
            r26 = r9
            r23.<init>(r24, r25, r26, r27, r29, r31)
            r1 = r23
            r4.setOnClickListener(r1)
            r1 = r20
            android.view.View r2 = r1.f5814
            android.widget.Button r2 = (android.widget.Button) r2
            ᛸᛴᲀᛴ r3 = new ᛸᛴᲀᛴ
            r4 = 10
            r3.<init>(r4, r9)
            r2.setOnClickListener(r3)
            java.lang.Object r2 = r1.f5816
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            ᛵᛷᛶᛲ r3 = new ᛵᛷᛶᛲ
            r6 = r37
            r13 = 1
            r3.<init>(r6, r13)
            r2.setOnClickListener(r3)
            android.view.View r1 = r1.f5822
            r9 = r1
            android.widget.Button r9 = (android.widget.Button) r9
            java.lang.Object r1 = r0.f5859
            r5 = r1
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r0 = r0.f5857
            r7 = r0
            ᲀᲈᛵᲇ r7 = (defpackage.InterfaceC1781) r7
            ᛴᛲᛷᲁ r0 = new ᛴᛲᛷᲁ
            r8 = 1
            r2 = r11
            r3 = r12
            r1 = r14
            r4 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.setOnClickListener(r0)
            return
        L510:
            r14 = 8
            r1 = -120186354441774(0xffff92b0ef0961d2, double:NaN)
            java.lang.Object r1 = r0.f5856
            ᛵᛲᛴᛸ r1 = (defpackage.C0826) r1
            android.widget.Switch r1 = r1.f3804
            r2 = -120216419212846(0xffff92a9ef0961d2, double:NaN)
            java.lang.Object r2 = r0.f5856
            ᛵᛲᛴᛸ r2 = (defpackage.C0826) r2
            android.widget.Switch r2 = r2.f3796
            r3 = -120315203460654(0xffff9292ef0961d2, double:NaN)
            java.lang.Object r3 = r0.f5856
            ᛵᛲᛴᛸ r3 = (defpackage.C0826) r3
            android.widget.LinearLayout r3 = r3.f3798
            r4 = -120431167577646(0xffff9277ef0961d2, double:NaN)
            java.lang.Object r4 = r0.f5856
            ᛵᛲᛴᛸ r4 = (defpackage.C0826) r4
            android.widget.LinearLayout r4 = r4.f3815
            r5 = -120504182021678(0xffff9266ef0961d2, double:NaN)
            java.lang.Object r5 = r0.f5856
            ᛵᛲᛴᛸ r5 = (defpackage.C0826) r5
            android.widget.SeekBar r5 = r5.f3799
            r6 = -120602966269486(0xffff924fef0961d2, double:NaN)
            java.lang.Object r6 = r0.f5856
            ᛵᛲᛴᛸ r6 = (defpackage.C0826) r6
            android.widget.TextView r6 = r6.f3816
            r7 = -120680275680814(0xffff923def0961d2, double:NaN)
            java.lang.Object r7 = r0.f5856
            ᛵᛲᛴᛸ r7 = (defpackage.C0826) r7
            android.widget.SeekBar r7 = r7.f3811
            r8 = -120736110255662(0xffff9230ef0961d2, double:NaN)
            java.lang.Object r8 = r0.f5856
            ᛵᛲᛴᛸ r8 = (defpackage.C0826) r8
            android.widget.TextView r8 = r8.f3808
            r9 = -120813419666990(0xffff921eef0961d2, double:NaN)
            java.lang.Object r9 = r0.f5856
            ᛵᛲᛴᛸ r9 = (defpackage.C0826) r9
            android.widget.SeekBar r9 = r9.f3812
            r10 = -120869254241838(0xffff9211ef0961d2, double:NaN)
            java.lang.Object r10 = r0.f5856
            ᛵᛲᛴᛸ r10 = (defpackage.C0826) r10
            android.widget.TextView r10 = r10.f3809
            r11 = -120963743522350(0xffff91fbef0961d2, double:NaN)
            java.lang.Object r11 = r0.f5856
            ᛵᛲᛴᛸ r11 = (defpackage.C0826) r11
            android.widget.EditText r11 = r11.f3794
            r12 = -121036757966382(0xffff91eaef0961d2, double:NaN)
            java.lang.Object r12 = r0.f5856
            ᛵᛲᛴᛸ r12 = (defpackage.C0826) r12
            android.view.View r12 = r12.f3810
            r23 = -121118362345006(0xffff91d7ef0961d2, double:NaN)
            java.lang.Object r13 = r0.f5856
            ᛵᛲᛴᛸ r13 = (defpackage.C0826) r13
            android.widget.EditText r13 = r13.f3802
            r23 = -121238621429294(0xffff91bbef0961d2, double:NaN)
            java.lang.Object r15 = r0.f5856
            ᛵᛲᛴᛸ r15 = (defpackage.C0826) r15
            android.view.View r15 = r15.f3800
            r23 = -121333110709806(0xffff91a5ef0961d2, double:NaN)
            java.lang.Object r14 = r0.f5856
            ᛵᛲᛴᛸ r14 = (defpackage.C0826) r14
            android.widget.SeekBar r14 = r14.f3797
            r24 = -121444779859502(0xffff918bef0961d2, double:NaN)
            r24 = r15
            java.lang.Object r15 = r0.f5856
            ᛵᛲᛴᛸ r15 = (defpackage.C0826) r15
            android.widget.TextView r15 = r15.f3813
            r25 = -121539269140014(0xffff9175ef0961d2, double:NaN)
            r25 = r13
            java.lang.Object r13 = r0.f5856
            ᛵᛲᛴᛸ r13 = (defpackage.C0826) r13
            android.widget.TextView r13 = r13.f3801
            r26 = -121612283584046(0xffff9164ef0961d2, double:NaN)
            r26 = r13
            java.lang.Object r13 = r0.f5856
            ᛵᛲᛴᛸ r13 = (defpackage.C0826) r13
            android.widget.TextView r13 = r13.f3814
            r27 = -121711067831854(0xffff914def0961d2, double:NaN)
            r27 = r13
            java.lang.Object r13 = r0.f5856
            ᛵᛲᛴᛸ r13 = (defpackage.C0826) r13
            android.widget.ImageView r13 = r13.f3807
            r28 = -121805557112366(0xffff9137ef0961d2, double:NaN)
            r28 = r13
            java.lang.Object r13 = r0.f5856
            ᛵᛲᛴᛸ r13 = (defpackage.C0826) r13
            android.widget.TextView r13 = r13.f3817
            r29 = -121878571556398(0xffff9126ef0961d2, double:NaN)
            r29 = r13
            java.lang.Object r13 = r0.f5856
            ᛵᛲᛴᛸ r13 = (defpackage.C0826) r13
            android.widget.TextView r13 = r13.f3805
            r30 = -121973060836910(0xffff9110ef0961d2, double:NaN)
            r30 = r13
            java.lang.Object r13 = r0.f5856
            ᛵᛲᛴᛸ r13 = (defpackage.C0826) r13
            android.widget.TextView r0 = r13.f3792
            r31 = r15
            android.widget.TextView r15 = r13.f3806
            r32 = r14
            android.widget.TextView r14 = r13.f3795
            android.widget.TextView r13 = r13.f3793
            android.widget.TextView[] r0 = new android.widget.TextView[]{r0, r15, r14, r13}
            java.util.List r0 = defpackage.AbstractC0425.m1186(r0)
            ᛶᲀᛵ r13 = defpackage.C1141.f5173
            r13.getClass()
            boolean r14 = defpackage.C1141.m2225()
            r1.setChecked(r14)
            boolean r14 = defpackage.C1141.m2196()
            r2.setChecked(r14)
            boolean r14 = defpackage.C1141.m2196()
            if (r14 == 0) goto L681
            r15 = 0
            goto L683
        L681:
            r15 = 8
        L683:
            r3.setVisibility(r15)
            if (r14 == 0) goto L68b
            r14 = 8
            goto L68c
        L68b:
            r14 = 0
        L68c:
            r4.setVisibility(r14)
            float r14 = defpackage.C1141.m2189()
            int r14 = (int) r14
            r21 = r13
            r13 = 100
            r15 = 10
            int r13 = defpackage.AbstractC1754.m3135(r14, r15, r13)
            r5.setProgress(r13)
            float r13 = defpackage.C1141.m2189()
            int r13 = (int) r13
            java.lang.String r13 = java.lang.String.valueOf(r13)
            r6.setText(r13)
            ᲀᲇᛸᛶ r13 = defpackage.C1141.f5124
            ᲁᛷᛶᛶ[] r14 = defpackage.C1141.f5221
            r15 = 50
            r15 = r14[r15]
            java.lang.Object r13 = r13.m3169(r15)
            java.lang.Number r13 = (java.lang.Number) r13
            float r13 = r13.floatValue()
            int r13 = (int) r13
            r15 = 80
            r23 = r14
            r14 = 0
            int r13 = defpackage.AbstractC1754.m3135(r13, r14, r15)
            r7.setProgress(r13)
            int r13 = r7.getProgress()
            java.lang.String r13 = java.lang.String.valueOf(r13)
            r8.setText(r13)
            float r13 = defpackage.C1141.m2176()
            int r13 = (int) r13
            r14 = 1
            r15 = 10
            int r13 = defpackage.AbstractC1754.m3135(r13, r14, r15)
            r9.setProgress(r13)
            float r13 = defpackage.C1141.m2176()
            int r13 = (int) r13
            java.lang.String r13 = java.lang.String.valueOf(r13)
            r10.setText(r13)
            ᛲᲈᲀᛱ r13 = new ᛲᲈᲀᛱ
            r13.<init>()
            r13.f2031 = r14
            int r14 = defpackage.C1141.m2213()
            java.lang.String r14 = m2452(r14)
            r11.setText(r14)
            r14 = 0
            r13.f2031 = r14
            r21.getClass()
            int r14 = defpackage.C1141.m2213()
            r12.setBackgroundColor(r14)
            int r14 = defpackage.C1141.m2174()
            r15 = r32
            r15.setProgress(r14)
            int r14 = defpackage.C1141.m2174()
            java.lang.String r14 = java.lang.String.valueOf(r14)
            r15 = r31
            r15.setText(r14)
            ᛲᲈᲀᛱ r14 = new ᛲᲈᲀᛱ
            r14.<init>()
            r15 = 1
            r14.f2031 = r15
            java.lang.String r15 = defpackage.C1141.m2231()
            r18 = r11
            r11 = r25
            r11.setText(r15)
            r15 = 0
            r14.f2031 = r15
            m2465(r24)
            ᲀᲇᛸᛶ r15 = defpackage.C1141.f5197
            r21 = 45
            r11 = r23[r21]
            java.lang.Object r11 = r15.m3169(r11)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            m2459(r11, r0)
            m2453(r28)
            ᛵᲁᛸᛵ r11 = defpackage.C0973.f4362
            ᲈᲈᛸᲁ r11 = new ᲈᲈᛸᲁ
            r21 = r0
            r15 = r28
            r0 = 1
            r11.<init>(r0, r15)
            defpackage.C0973.f4363 = r11
            ᛷᲀᛸᛳ r11 = new ᛷᲀᛸᛳ
            r0 = 0
            r11.<init>(r0)
            r1.setOnCheckedChangeListener(r11)
            ᛵᛵᛲᲀ r1 = new ᛵᛵᛲᲀ
            r1.<init>(r3, r0, r4)
            r2.setOnCheckedChangeListener(r1)
            ᛴᲀᛷᛸ r1 = new ᛴᲀᛷᛸ
            r2 = 2
            r1.<init>(r6, r2)
            ᲀᲁᛸᛶ r2 = new ᲀᲁᛸᛶ
            r3 = 1
            r2.<init>(r3, r1)
            r5.setOnSeekBarChangeListener(r2)
            ᛴᲀᛷᛸ r1 = new ᛴᲀᛷᛸ
            r1.<init>(r8, r0)
            ᲀᲁᛸᛶ r2 = new ᲀᲁᛸᛶ
            r2.<init>(r3, r1)
            r7.setOnSeekBarChangeListener(r2)
            ᛴᲀᛷᛸ r1 = new ᛴᲀᛷᛸ
            r1.<init>(r10, r3)
            ᲀᲁᛸᛶ r2 = new ᲀᲁᛸᛶ
            r2.<init>(r3, r1)
            r9.setOnSeekBarChangeListener(r2)
            ᛱᛶᛲᲀ r1 = new ᛱᛶᛲᲀ
            r1.<init>(r13, r12, r0)
            r8 = r18
            r8.addTextChangedListener(r1)
            ᛵᛷᲇ r1 = new ᛵᛷᲇ
            r1.<init>(r12, r0)
            r8.setOnEditorActionListener(r1)
            ᛱᛶᛲᲀ r0 = new ᛱᛶᛲᲀ
            r6 = r24
            r0.<init>(r14, r6, r3)
            r5 = r25
            r5.addTextChangedListener(r0)
            ᛵᛷᲇ r0 = new ᛵᛷᲇ
            r0.<init>(r6, r3)
            r5.setOnEditorActionListener(r0)
            r0 = r36
            java.lang.Object r1 = r0.f5859
            r3 = r1
            android.content.Context r3 = (android.content.Context) r3
            ᛳᛵᛵᛴ r1 = new ᛳᛵᛵᛴ
            r7 = 0
            r2 = r37
            r4 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r9 = r6
            r9.setOnClickListener(r1)
            java.lang.Object r1 = r0.f5859
            r3 = r1
            android.content.Context r3 = (android.content.Context) r3
            ᛳᛵᛵᛴ r1 = new ᛳᛵᛵᛴ
            r7 = 1
            r5 = r8
            r6 = r12
            r4 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r6.setOnClickListener(r1)
            ᛷᛵᛲᲀ r1 = new ᛷᛵᛲᲀ
            r3 = r32
            r14 = 0
            r1.<init>(r3, r14)
            r4 = r26
            r4.setOnClickListener(r1)
            ᛷᛵᛲᲀ r1 = new ᛷᛵᛲᲀ
            r13 = 1
            r1.<init>(r3, r13)
            r4 = r27
            r4.setOnClickListener(r1)
            ᲈᛵᲇᲁ r1 = new ᲈᛵᲇᲁ
            r4 = r31
            r1.<init>(r4, r13, r9)
            r3.setOnSeekBarChangeListener(r1)
            ᛴᲇᲀᛴ r1 = new ᛴᲇᲀᛴ
            r14 = 3
            r1.<init>(r14)
            r3 = r29
            r3.setOnClickListener(r1)
            ᛸᛴᲀᛴ r1 = new ᛸᛴᲀᛴ
            r14 = 0
            r1.<init>(r14, r15)
            r3 = r30
            r3.setOnClickListener(r1)
            java.util.Iterator r1 = r21.iterator()
            r10 = r14
        L826:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L847
            java.lang.Object r3 = r1.next()
            int r4 = r10 + 1
            if (r10 < 0) goto L842
            android.widget.TextView r3 = (android.widget.TextView) r3
            ᛸᛲᛷᛵ r5 = new ᛸᛲᛷᛵ
            r6 = r21
            r5.<init>(r10, r6)
            r3.setOnClickListener(r5)
            r10 = r4
            goto L826
        L842:
            defpackage.AbstractC0425.m1196()
            r0 = 0
            throw r0
        L847:
            java.lang.Object r1 = r0.f5856
            ᛵᛲᛴᛸ r1 = (defpackage.C0826) r1
            android.widget.ImageView r1 = r1.f3803
            java.lang.Object r0 = r0.f5857
            ᛲᲀ r0 = (defpackage.C0345) r0
            ᛳᛲᛶᛶ r3 = new ᛳᛲᛶᛶ
            r14 = 4
            r3.<init>(r2, r14, r0)
            r1.setOnClickListener(r3)
            return
    }

    @Override // defpackage.InterfaceC0319
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public defpackage.InterfaceC2085 mo967() {
            r0 = this;
            java.lang.Object r0 = r0.f5859
            ᛶᛳᛵᛸ r0 = (defpackage.C1037) r0
            return r0
    }

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public java.lang.Object m2483(java.lang.Class r6, java.util.HashSet r7) {
            r5 = this;
            java.lang.Object r0 = r5.f5856
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r1 = "Cannot initialize "
            boolean r2 = defpackage.AbstractC2258.m3650()
            if (r2 == 0) goto L13
            java.lang.String r2 = r6.getSimpleName()     // Catch: java.lang.Throwable -> L8a
            defpackage.AbstractC2193.m3597(r2)     // Catch: java.lang.Throwable -> L8a
        L13:
            boolean r2 = r7.contains(r6)     // Catch: java.lang.Throwable -> L8a
            if (r2 != 0) goto L6f
            boolean r1 = r0.containsKey(r6)     // Catch: java.lang.Throwable -> L8a
            if (r1 != 0) goto L67
            r7.add(r6)     // Catch: java.lang.Throwable -> L8a
            r1 = 0
            java.lang.reflect.Constructor r2 = r6.getDeclaredConstructor(r1)     // Catch: java.lang.Throwable -> L60
            java.lang.Object r1 = r2.newInstance(r1)     // Catch: java.lang.Throwable -> L60
            ᛳᛵᛷᲁ r1 = (defpackage.InterfaceC0485) r1     // Catch: java.lang.Throwable -> L60
            java.util.List r2 = r1.mo102()     // Catch: java.lang.Throwable -> L60
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L60
            if (r3 != 0) goto L51
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L60
        L3b:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L60
            if (r3 == 0) goto L51
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L60
            java.lang.Class r3 = (java.lang.Class) r3     // Catch: java.lang.Throwable -> L60
            boolean r4 = r0.containsKey(r3)     // Catch: java.lang.Throwable -> L60
            if (r4 != 0) goto L3b
            r5.m2483(r3, r7)     // Catch: java.lang.Throwable -> L60
            goto L3b
        L51:
            java.lang.Object r5 = r5.f5859     // Catch: java.lang.Throwable -> L60
            android.content.Context r5 = (android.content.Context) r5     // Catch: java.lang.Throwable -> L60
            java.lang.Object r5 = r1.mo103(r5)     // Catch: java.lang.Throwable -> L60
            r7.remove(r6)     // Catch: java.lang.Throwable -> L60
            r0.put(r6, r5)     // Catch: java.lang.Throwable -> L60
            goto L6b
        L60:
            r5 = move-exception
            ᛸᛵᛳᲀ r6 = new ᛸᛵᛳᲀ     // Catch: java.lang.Throwable -> L8a
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L8a
            throw r6     // Catch: java.lang.Throwable -> L8a
        L67:
            java.lang.Object r5 = r0.get(r6)     // Catch: java.lang.Throwable -> L8a
        L6b:
            android.os.Trace.endSection()
            return r5
        L6f:
            java.lang.String r5 = r6.getName()     // Catch: java.lang.Throwable -> L8a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8a
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L8a
            r6.append(r5)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r5 = ". Cycle detected."
            r6.append(r5)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L8a
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8a
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L8a
            throw r6     // Catch: java.lang.Throwable -> L8a
        L8a:
            r5 = move-exception
            android.os.Trace.endSection()
            throw r5
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public synchronized void m2484(defpackage.InterfaceC1711 r3, defpackage.C2014 r4) {
            r2 = this;
            monitor-enter(r2)
            ᲀᛴᲀ r0 = new ᲀᛴᲀ     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r1 = r2.f5857     // Catch: java.lang.Throwable -> L1e
            java.lang.ref.ReferenceQueue r1 = (java.lang.ref.ReferenceQueue) r1     // Catch: java.lang.Throwable -> L1e
            r0.<init>(r3, r4, r1)     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r4 = r2.f5856     // Catch: java.lang.Throwable -> L1e
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r3 = r4.put(r3, r0)     // Catch: java.lang.Throwable -> L1e
            ᲀᛴᲀ r3 = (defpackage.C1664) r3     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto L1c
            r4 = 0
            r3.f7441 = r4     // Catch: java.lang.Throwable -> L1e
            r3.clear()     // Catch: java.lang.Throwable -> L1e
        L1c:
            monitor-exit(r2)
            return
        L1e:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            throw r3
    }
}
