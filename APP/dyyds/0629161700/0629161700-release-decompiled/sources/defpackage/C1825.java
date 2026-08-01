package defpackage;

/* JADX INFO: renamed from: ᲁᛲᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1825 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static final defpackage.C1341 f7958 = null;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final defpackage.C0454 f7959 = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final defpackage.ExecutorC1811 f7960 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final defpackage.ExecutorC1811 f7961 = null;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final defpackage.C1341 f7962 = null;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static final defpackage.C1341 f7963 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f7964;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f7965;

    static {
            ᲁᛲᛵᛵ r0 = new ᲁᛲᛵᛵ
            r1 = 1
            r0.<init>(r1)
            defpackage.C1825.f7961 = r0
            ᲁᛲᛵᛵ r0 = new ᲁᛲᛵᛵ
            r1 = 2
            r0.<init>(r1)
            defpackage.C1825.f7960 = r0
            ᛳᛴᛵᛱ r0 = new ᛳᛴᛵᛱ
            java.lang.String r1 = "NO_THREAD_ELEMENTS"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.C1825.f7959 = r0
            ᛷᛸᲁᛱ r0 = new ᛷᛸᲁᛱ
            r1 = 8
            r0.<init>(r1)
            defpackage.C1825.f7962 = r0
            ᛷᛸᲁᛱ r0 = new ᛷᛸᲁᛱ
            r1 = 9
            r0.<init>(r1)
            defpackage.C1825.f7963 = r0
            ᛷᛸᲁᛱ r0 = new ᛷᛸᲁᛱ
            r1 = 10
            r0.<init>(r1)
            defpackage.C1825.f7958 = r0
            return
    }

    public /* synthetic */ C1825(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f7964 = r1
            r0.f7965 = r2
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static void m3213(java.lang.String r3) {
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L39
            r0 = 0
            java.lang.reflect.Constructor r1 = r3.getDeclaredConstructor(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L21 java.lang.NoSuchMethodException -> L23 java.lang.IllegalAccessException -> L25 java.lang.InstantiationException -> L27
            java.lang.Object r3 = r1.newInstance(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L21 java.lang.NoSuchMethodException -> L23 java.lang.IllegalAccessException -> L25 java.lang.InstantiationException -> L27
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected instanceof GlideModule, but found: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L21:
            r1 = move-exception
            goto L29
        L23:
            r1 = move-exception
            goto L2d
        L25:
            r1 = move-exception
            goto L31
        L27:
            r1 = move-exception
            goto L35
        L29:
            m3214(r3, r1)
            throw r0
        L2d:
            m3214(r3, r1)
            throw r0
        L31:
            m3214(r3, r1)
            throw r0
        L35:
            m3214(r3, r1)
            throw r0
        L39:
            r3 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unable to find GlideModule implementation"
            r0.<init>(r1, r3)
            throw r0
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static void m3214(java.lang.Class r3, java.lang.ReflectiveOperationException r4) {
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to instantiate GlideModule implementation for "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3, r4)
            throw r0
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static final java.lang.Object m3215(defpackage.InterfaceC0493 r1, java.lang.Object r2) {
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r2 != 0) goto Ld
            ᛷᛸᲁᛱ r2 = defpackage.C1825.f7962
            java.lang.Object r2 = r1.mo969(r0, r2)
        Ld:
            if (r2 != r0) goto L12
            ᛳᛴᛵᛱ r1 = defpackage.C1825.f7959
            return r1
        L12:
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L28
            ᲇᛲᲁᛷ r0 = new ᲇᛲᲁᛷ
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r0.<init>(r1, r2)
            ᛷᛸᲁᛱ r2 = defpackage.C1825.f7958
            java.lang.Object r1 = r1.mo969(r0, r2)
            return r1
        L28:
            ᛷᲁᛳᲀ r2 = (defpackage.C1367) r2
            java.lang.ThreadLocal r1 = r2.f5978
            java.lang.Object r0 = r1.get()
            java.lang.Object r2 = r2.f5979
            r1.set(r2)
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static final void m3216(defpackage.InterfaceC0493 r4, java.lang.Object r5) {
            ᛳᛴᛵᛱ r0 = defpackage.C1825.f7959
            if (r5 != r0) goto L5
            goto L24
        L5:
            boolean r0 = r5 instanceof defpackage.C2007
            if (r0 == 0) goto L25
            ᲇᛲᲁᛷ r5 = (defpackage.C2007) r5
            ᛷᲁᛳᲀ[] r4 = r5.f8664
            int r0 = r4.length
            int r0 = r0 + (-1)
            if (r0 < 0) goto L24
        L12:
            int r1 = r0 + (-1)
            r2 = r4[r0]
            java.lang.Object[] r3 = r5.f8666
            r0 = r3[r0]
            java.lang.ThreadLocal r2 = r2.f5978
            r2.set(r0)
            if (r1 >= 0) goto L22
            goto L24
        L22:
            r0 = r1
            goto L12
        L24:
            return
        L25:
            r0 = 0
            ᛷᛸᲁᛱ r1 = defpackage.C1825.f7963
            java.lang.Object r4 = r4.mo969(r0, r1)
            ᛷᲁᛳᲀ r4 = (defpackage.C1367) r4
            java.lang.ThreadLocal r4 = r4.f5978
            r4.set(r5)
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final int m3217(defpackage.C2048 r4, java.lang.Object r5, int r6) {
            int r0 = r4.f8821
            if (r0 != 0) goto L6
            r4 = -1
            return r4
        L6:
            int[] r1 = r4.f8823     // Catch: java.lang.IndexOutOfBoundsException -> L4c
            int r1 = defpackage.AbstractC1628.m2961(r0, r6, r1)     // Catch: java.lang.IndexOutOfBoundsException -> L4c
            if (r1 >= 0) goto Lf
            goto L19
        Lf:
            java.lang.Object[] r2 = r4.f8822
            r2 = r2[r1]
            boolean r2 = defpackage.AbstractC0498.m1280(r5, r2)
            if (r2 == 0) goto L1a
        L19:
            return r1
        L1a:
            int r2 = r1 + 1
        L1c:
            if (r2 >= r0) goto L32
            int[] r3 = r4.f8823
            r3 = r3[r2]
            if (r3 != r6) goto L32
            java.lang.Object[] r3 = r4.f8822
            r3 = r3[r2]
            boolean r3 = defpackage.AbstractC0498.m1280(r5, r3)
            if (r3 == 0) goto L2f
            return r2
        L2f:
            int r2 = r2 + 1
            goto L1c
        L32:
            int r1 = r1 + (-1)
        L34:
            if (r1 < 0) goto L4a
            int[] r0 = r4.f8823
            r0 = r0[r1]
            if (r0 != r6) goto L4a
            java.lang.Object[] r0 = r4.f8822
            r0 = r0[r1]
            boolean r0 = defpackage.AbstractC0498.m1280(r5, r0)
            if (r0 == 0) goto L47
            return r1
        L47:
            int r1 = r1 + (-1)
            goto L34
        L4a:
            int r4 = ~r2
            return r4
        L4c:
            java.util.ConcurrentModificationException r4 = new java.util.ConcurrentModificationException
            r4.<init>()
            throw r4
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final defpackage.AbstractC0606 m3218(java.lang.Object r1) {
            ᛳᛴᛵᛱ r0 = defpackage.AbstractC2279.f9634
            if (r1 == r0) goto L7
            ᛴᛱᛴᛳ r1 = (defpackage.AbstractC0606) r1
            return r1
        L7:
            java.lang.String r1 = "Does not contain segment"
            defpackage.C2264.m3676(r1)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static android.graphics.Bitmap m3219(java.io.InputStream r4, android.graphics.BitmapFactory.Options r5, defpackage.C1326 r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 34
            if (r0 != r2) goto L5d
            r3 = 0
            if (r0 == r2) goto Lb
            goto L11
        Lb:
            android.graphics.Bitmap$Config r0 = r5.inPreferredConfig
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.HARDWARE
            if (r0 == r2) goto L13
        L11:
            r0 = r3
            goto L1f
        L13:
            ᲈᛵᛷᛱ r0 = defpackage.AbstractC0425.f2121
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L1f:
            if (r0 == 0) goto L5d
            boolean r6 = m3223(r6)
            if (r6 == 0) goto L5d
            android.graphics.Bitmap$Config r6 = r5.inPreferredConfig
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.HARDWARE
            if (r6 != r0) goto L2e
            r3 = 1
        L2e:
            java.lang.String r6 = ""
            defpackage.C0292.m945(r6, r3)
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
            r5.inPreferredConfig = r6
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r4, r1, r5)     // Catch: java.lang.Throwable -> L52
            if (r4 != 0) goto L45
            if (r4 == 0) goto L42
            r4.recycle()
        L42:
            r5.inPreferredConfig = r0
            return r1
        L45:
            android.graphics.Bitmap r6 = m3221(r4)     // Catch: java.lang.Throwable -> L4f
            r4.recycle()
            r5.inPreferredConfig = r0
            return r6
        L4f:
            r6 = move-exception
            r1 = r4
            goto L53
        L52:
            r6 = move-exception
        L53:
            if (r1 == 0) goto L58
            r1.recycle()
        L58:
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.HARDWARE
            r5.inPreferredConfig = r4
            throw r6
        L5d:
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r4, r1, r5)
            return r4
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m3220(java.lang.Object r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return
        L3:
            defpackage.C2264.m3673(r1)
            return
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static android.graphics.Bitmap m3221(android.graphics.Bitmap r3) {
            android.graphics.Gainmap r0 = defpackage.AbstractC0582.m1380(r3)
            if (r0 == 0) goto L19
            android.graphics.Bitmap r1 = defpackage.AbstractC0582.m1382(r0)
            android.graphics.Bitmap$Config r1 = r1.getConfig()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ALPHA_8
            if (r1 != r2) goto L19
            android.graphics.Gainmap r0 = defpackage.AbstractC1822.m3212(r0)
            defpackage.AbstractC0582.m1379(r3, r0)
        L19:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.HARDWARE
            r1 = 0
            android.graphics.Bitmap r3 = r3.copy(r0, r1)
            return r3
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static java.lang.String m3222(java.lang.String r1) {
            int r0 = r1.hashCode()
            switch(r0) {
                case -2061550653: goto L33f;
                case -2056817302: goto L333;
                case -2034166429: goto L327;
                case -1979556166: goto L31b;
                case -1571515090: goto L30f;
                case -1383349348: goto L303;
                case -1383343454: goto L2f7;
                case -1325958191: goto L2eb;
                case -1182275604: goto L2df;
                case -1062240117: goto L2d2;
                case -688322466: goto L2c5;
                case -527879800: goto L2b8;
                case -515992664: goto L2ab;
                case -246476834: goto L29e;
                case -207262728: goto L291;
                case -165139126: goto L284;
                case 104431: goto L27a;
                case 3039496: goto L26d;
                case 3052374: goto L260;
                case 3327612: goto L253;
                case 64711720: goto L246;
                case 65821278: goto L239;
                case 77230534: goto L22c;
                case 97526364: goto L222;
                case 109413500: goto L218;
                case 155276373: goto L20e;
                case 226173651: goto L201;
                case 344809556: goto L1f7;
                case 398507100: goto L1ed;
                case 398585941: goto L1e0;
                case 398795216: goto L1d6;
                case 482629606: goto L1c9;
                case 499831342: goto L1bc;
                case 577341676: goto L1af;
                case 599019395: goto L1a2;
                case 761287205: goto L198;
                case 1052881309: goto L18b;
                case 1063877011: goto L17e;
                case 1195259493: goto L171;
                case 1275614662: goto L164;
                case 1383693018: goto L157;
                case 1630335596: goto L14a;
                case 1877171123: goto L13d;
                default: goto L7;
            }
        L7:
            switch(r0) {
                case -1811142716: goto L130;
                case -1811142715: goto L123;
                case -1811142714: goto L116;
                case -1811142713: goto L109;
                case -1811142712: goto Lfc;
                case -1811142711: goto Lef;
                case -1811142710: goto Le2;
                case -1811142709: goto Ld5;
                case -1811142708: goto Lc8;
                case -1811142707: goto Lbb;
                default: goto La;
            }
        La:
            switch(r0) {
                case -1811142685: goto Lae;
                case -1811142684: goto La1;
                case -1811142683: goto L94;
                default: goto Ld;
            }
        Ld:
            switch(r0) {
                case 80123371: goto L87;
                case 80123372: goto L7a;
                case 80123373: goto L6d;
                case 80123374: goto L60;
                case 80123375: goto L53;
                case 80123376: goto L46;
                case 80123377: goto L39;
                case 80123378: goto L2c;
                case 80123379: goto L1f;
                case 80123380: goto L12;
                default: goto L10;
            }
        L10:
            goto L347
        L12:
            java.lang.String r0 = "kotlin.jvm.functions.Function9"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1c
            goto L347
        L1c:
            java.lang.String r1 = "kotlin.Function9"
            return r1
        L1f:
            java.lang.String r0 = "kotlin.jvm.functions.Function8"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L29
            goto L347
        L29:
            java.lang.String r1 = "kotlin.Function8"
            return r1
        L2c:
            java.lang.String r0 = "kotlin.jvm.functions.Function7"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L36
            goto L347
        L36:
            java.lang.String r1 = "kotlin.Function7"
            return r1
        L39:
            java.lang.String r0 = "kotlin.jvm.functions.Function6"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L43
            goto L347
        L43:
            java.lang.String r1 = "kotlin.Function6"
            return r1
        L46:
            java.lang.String r0 = "kotlin.jvm.functions.Function5"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L50
            goto L347
        L50:
            java.lang.String r1 = "kotlin.Function5"
            return r1
        L53:
            java.lang.String r0 = "kotlin.jvm.functions.Function4"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L5d
            goto L347
        L5d:
            java.lang.String r1 = "kotlin.Function4"
            return r1
        L60:
            java.lang.String r0 = "kotlin.jvm.functions.Function3"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L6a
            goto L347
        L6a:
            java.lang.String r1 = "kotlin.Function3"
            return r1
        L6d:
            java.lang.String r0 = "kotlin.jvm.functions.Function2"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L77
            goto L347
        L77:
            java.lang.String r1 = "kotlin.Function2"
            return r1
        L7a:
            java.lang.String r0 = "kotlin.jvm.functions.Function1"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L84
            goto L347
        L84:
            java.lang.String r1 = "kotlin.Function1"
            return r1
        L87:
            java.lang.String r0 = "kotlin.jvm.functions.Function0"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L91
            goto L347
        L91:
            java.lang.String r1 = "kotlin.Function0"
            return r1
        L94:
            java.lang.String r0 = "kotlin.jvm.functions.Function22"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L9e
            goto L347
        L9e:
            java.lang.String r1 = "kotlin.Function22"
            return r1
        La1:
            java.lang.String r0 = "kotlin.jvm.functions.Function21"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto Lab
            goto L347
        Lab:
            java.lang.String r1 = "kotlin.Function21"
            return r1
        Lae:
            java.lang.String r0 = "kotlin.jvm.functions.Function20"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto Lb8
            goto L347
        Lb8:
            java.lang.String r1 = "kotlin.Function20"
            return r1
        Lbb:
            java.lang.String r0 = "kotlin.jvm.functions.Function19"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto Lc5
            goto L347
        Lc5:
            java.lang.String r1 = "kotlin.Function19"
            return r1
        Lc8:
            java.lang.String r0 = "kotlin.jvm.functions.Function18"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto Ld2
            goto L347
        Ld2:
            java.lang.String r1 = "kotlin.Function18"
            return r1
        Ld5:
            java.lang.String r0 = "kotlin.jvm.functions.Function17"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto Ldf
            goto L347
        Ldf:
            java.lang.String r1 = "kotlin.Function17"
            return r1
        Le2:
            java.lang.String r0 = "kotlin.jvm.functions.Function16"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto Lec
            goto L347
        Lec:
            java.lang.String r1 = "kotlin.Function16"
            return r1
        Lef:
            java.lang.String r0 = "kotlin.jvm.functions.Function15"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto Lf9
            goto L347
        Lf9:
            java.lang.String r1 = "kotlin.Function15"
            return r1
        Lfc:
            java.lang.String r0 = "kotlin.jvm.functions.Function14"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L106
            goto L347
        L106:
            java.lang.String r1 = "kotlin.Function14"
            return r1
        L109:
            java.lang.String r0 = "kotlin.jvm.functions.Function13"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L113
            goto L347
        L113:
            java.lang.String r1 = "kotlin.Function13"
            return r1
        L116:
            java.lang.String r0 = "kotlin.jvm.functions.Function12"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L120
            goto L347
        L120:
            java.lang.String r1 = "kotlin.Function12"
            return r1
        L123:
            java.lang.String r0 = "kotlin.jvm.functions.Function11"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L12d
            goto L347
        L12d:
            java.lang.String r1 = "kotlin.Function11"
            return r1
        L130:
            java.lang.String r0 = "kotlin.jvm.functions.Function10"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L13a
            goto L347
        L13a:
            java.lang.String r1 = "kotlin.Function10"
            return r1
        L13d:
            java.lang.String r0 = "kotlin.jvm.internal.IntCompanionObject"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L147
            goto L347
        L147:
            java.lang.String r1 = "kotlin.Int.Companion"
            return r1
        L14a:
            java.lang.String r0 = "java.lang.Throwable"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L154
            goto L347
        L154:
            java.lang.String r1 = "kotlin.Throwable"
            return r1
        L157:
            java.lang.String r0 = "kotlin.jvm.internal.BooleanCompanionObject"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L161
            goto L347
        L161:
            java.lang.String r1 = "kotlin.Boolean.Companion"
            return r1
        L164:
            java.lang.String r0 = "java.lang.Iterable"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L16e
            goto L347
        L16e:
            java.lang.String r1 = "kotlin.collections.Iterable"
            return r1
        L171:
            java.lang.String r0 = "java.lang.String"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L17b
            goto L347
        L17b:
            java.lang.String r1 = "kotlin.String"
            return r1
        L17e:
            java.lang.String r0 = "java.lang.Object"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L188
            goto L347
        L188:
            java.lang.String r1 = "kotlin.Any"
            return r1
        L18b:
            java.lang.String r0 = "java.lang.Number"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L195
            goto L347
        L195:
            java.lang.String r1 = "kotlin.Number"
            return r1
        L198:
            java.lang.String r0 = "java.lang.Double"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L2f4
            goto L347
        L1a2:
            java.lang.String r0 = "kotlin.jvm.internal.StringCompanionObject"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1ac
            goto L347
        L1ac:
            java.lang.String r1 = "kotlin.String.Companion"
            return r1
        L1af:
            java.lang.String r0 = "java.util.ListIterator"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1b9
            goto L347
        L1b9:
            java.lang.String r1 = "kotlin.collections.ListIterator"
            return r1
        L1bc:
            java.lang.String r0 = "java.util.Iterator"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1c6
            goto L347
        L1c6:
            java.lang.String r1 = "kotlin.collections.Iterator"
            return r1
        L1c9:
            java.lang.String r0 = "kotlin.jvm.internal.FloatCompanionObject"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1d3
            goto L347
        L1d3:
            java.lang.String r1 = "kotlin.Float.Companion"
            return r1
        L1d6:
            java.lang.String r0 = "java.lang.Long"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L25d
            goto L347
        L1e0:
            java.lang.String r0 = "java.lang.Enum"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1ea
            goto L347
        L1ea:
            java.lang.String r1 = "kotlin.Enum"
            return r1
        L1ed:
            java.lang.String r0 = "java.lang.Byte"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L277
            goto L347
        L1f7:
            java.lang.String r0 = "java.lang.Boolean"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L250
            goto L347
        L201:
            java.lang.String r0 = "kotlin.jvm.internal.EnumCompanionObject"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L20b
            goto L347
        L20b:
            java.lang.String r1 = "kotlin.Enum.Companion"
            return r1
        L20e:
            java.lang.String r0 = "java.lang.Character"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L26a
            goto L347
        L218:
            java.lang.String r0 = "short"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L2b5
            goto L347
        L222:
            java.lang.String r0 = "float"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L2c2
            goto L347
        L22c:
            java.lang.String r0 = "kotlin.jvm.internal.ShortCompanionObject"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L236
            goto L347
        L236:
            java.lang.String r1 = "kotlin.Short.Companion"
            return r1
        L239:
            java.lang.String r0 = "java.util.List"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L243
            goto L347
        L243:
            java.lang.String r1 = "kotlin.collections.List"
            return r1
        L246:
            java.lang.String r0 = "boolean"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L250
            goto L347
        L250:
            java.lang.String r1 = "kotlin.Boolean"
            return r1
        L253:
            java.lang.String r0 = "long"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L25d
            goto L347
        L25d:
            java.lang.String r1 = "kotlin.Long"
            return r1
        L260:
            java.lang.String r0 = "char"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L26a
            goto L347
        L26a:
            java.lang.String r1 = "kotlin.Char"
            return r1
        L26d:
            java.lang.String r0 = "byte"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L277
            goto L347
        L277:
            java.lang.String r1 = "kotlin.Byte"
            return r1
        L27a:
            java.lang.String r0 = "int"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L33c
            goto L347
        L284:
            java.lang.String r0 = "java.util.Map$Entry"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L28e
            goto L347
        L28e:
            java.lang.String r1 = "kotlin.collections.Map.Entry"
            return r1
        L291:
            java.lang.String r0 = "kotlin.jvm.internal.LongCompanionObject"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L29b
            goto L347
        L29b:
            java.lang.String r1 = "kotlin.Long.Companion"
            return r1
        L29e:
            java.lang.String r0 = "kotlin.jvm.internal.CharCompanionObject"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L2a8
            goto L347
        L2a8:
            java.lang.String r1 = "kotlin.Char.Companion"
            return r1
        L2ab:
            java.lang.String r0 = "java.lang.Short"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L2b5
            goto L347
        L2b5:
            java.lang.String r1 = "kotlin.Short"
            return r1
        L2b8:
            java.lang.String r0 = "java.lang.Float"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L2c2
            goto L347
        L2c2:
            java.lang.String r1 = "kotlin.Float"
            return r1
        L2c5:
            java.lang.String r0 = "java.util.Collection"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L2cf
            goto L347
        L2cf:
            java.lang.String r1 = "kotlin.collections.Collection"
            return r1
        L2d2:
            java.lang.String r0 = "java.lang.CharSequence"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L2dc
            goto L347
        L2dc:
            java.lang.String r1 = "kotlin.CharSequence"
            return r1
        L2df:
            java.lang.String r0 = "kotlin.jvm.internal.ByteCompanionObject"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L2e8
            goto L347
        L2e8:
            java.lang.String r1 = "kotlin.Byte.Companion"
            return r1
        L2eb:
            java.lang.String r0 = "double"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L2f4
            goto L347
        L2f4:
            java.lang.String r1 = "kotlin.Double"
            return r1
        L2f7:
            java.lang.String r0 = "java.util.Set"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L300
            goto L347
        L300:
            java.lang.String r1 = "kotlin.collections.Set"
            return r1
        L303:
            java.lang.String r0 = "java.util.Map"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L30c
            goto L347
        L30c:
            java.lang.String r1 = "kotlin.collections.Map"
            return r1
        L30f:
            java.lang.String r0 = "java.lang.Comparable"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L318
            goto L347
        L318:
            java.lang.String r1 = "kotlin.Comparable"
            return r1
        L31b:
            java.lang.String r0 = "java.lang.annotation.Annotation"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L324
            goto L347
        L324:
            java.lang.String r1 = "kotlin.Annotation"
            return r1
        L327:
            java.lang.String r0 = "java.lang.Cloneable"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L330
            goto L347
        L330:
            java.lang.String r1 = "kotlin.Cloneable"
            return r1
        L333:
            java.lang.String r0 = "java.lang.Integer"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L33c
            goto L347
        L33c:
            java.lang.String r1 = "kotlin.Int"
            return r1
        L33f:
            java.lang.String r0 = "kotlin.jvm.internal.DoubleCompanionObject"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L349
        L347:
            r1 = 0
            return r1
        L349:
            java.lang.String r1 = "kotlin.Double.Companion"
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static boolean m3223(defpackage.C1326 r4) {
            java.lang.String r0 = "GlideBitmapFactory"
            java.lang.String r1 = "isLikelyToContainGainmap="
            r2 = 2
            boolean r4 = r4.m2479()     // Catch: java.io.IOException -> L1f
            boolean r3 = android.util.Log.isLoggable(r0, r2)     // Catch: java.io.IOException -> L1f
            if (r3 == 0) goto L21
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1f
            r3.<init>(r1)     // Catch: java.io.IOException -> L1f
            r3.append(r4)     // Catch: java.io.IOException -> L1f
            java.lang.String r1 = r3.toString()     // Catch: java.io.IOException -> L1f
            android.util.Log.v(r0, r1)     // Catch: java.io.IOException -> L1f
            return r4
        L1f:
            r4 = move-exception
            goto L22
        L21:
            return r4
        L22:
            boolean r1 = android.util.Log.isLoggable(r0, r2)
            if (r1 == 0) goto L2d
            java.lang.String r1 = "isLikelyToContainGainmap failed"
            android.util.Log.v(r0, r1, r4)
        L2d:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static java.nio.MappedByteBuffer m3224(android.content.Context r8, android.net.Uri r9) {
            android.content.ContentResolver r8 = r8.getContentResolver()
            r1 = 0
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r8 = r8.openFileDescriptor(r9, r0, r1)     // Catch: java.io.IOException -> L4c
            if (r8 != 0) goto L13
            if (r8 == 0) goto L4c
            r8.close()     // Catch: java.io.IOException -> L4c
            return r1
        L13:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L33
            java.io.FileDescriptor r0 = r8.getFileDescriptor()     // Catch: java.lang.Throwable -> L33
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L33
            java.nio.channels.FileChannel r2 = r9.getChannel()     // Catch: java.lang.Throwable -> L36
            long r6 = r2.size()     // Catch: java.lang.Throwable -> L36
            java.nio.channels.FileChannel$MapMode r3 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L36
            r4 = 0
            java.nio.MappedByteBuffer r0 = r2.map(r3, r4, r6)     // Catch: java.lang.Throwable -> L36
            r9.close()     // Catch: java.lang.Throwable -> L33
            r8.close()     // Catch: java.io.IOException -> L4c
            return r0
        L33:
            r0 = move-exception
            r9 = r0
            goto L42
        L36:
            r0 = move-exception
            r2 = r0
            r9.close()     // Catch: java.lang.Throwable -> L3c
            goto L41
        L3c:
            r0 = move-exception
            r9 = r0
            r2.addSuppressed(r9)     // Catch: java.lang.Throwable -> L33
        L41:
            throw r2     // Catch: java.lang.Throwable -> L33
        L42:
            r8.close()     // Catch: java.lang.Throwable -> L46
            goto L4b
        L46:
            r0 = move-exception
            r8 = r0
            r9.addSuppressed(r8)     // Catch: java.io.IOException -> L4c
        L4b:
            throw r9     // Catch: java.io.IOException -> L4c
        L4c:
            return r1
    }
}
