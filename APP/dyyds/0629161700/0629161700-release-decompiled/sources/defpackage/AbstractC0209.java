package defpackage;

/* JADX INFO: renamed from: ᛱᲇᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0209 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static java.lang.Boolean f1311;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static defpackage.C1403 f1312;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static defpackage.C1654 f1313;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static android.app.Application f1314;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static defpackage.C0311 f1315;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final java.lang.reflect.Type[] f1316 = null;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static boolean f1317;

    static {
            r0 = 0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
            defpackage.AbstractC0209.f1316 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static java.lang.reflect.Type m760(java.lang.reflect.Type r3, java.lang.Class r4, java.lang.Class r5) {
            if (r5 != r4) goto L3
            return r3
        L3:
            boolean r3 = r5.isInterface()
            if (r3 == 0) goto L32
            java.lang.Class[] r3 = r4.getInterfaces()
            int r0 = r3.length
            r1 = 0
        Lf:
            if (r1 >= r0) goto L32
            r2 = r3[r1]
            if (r2 != r5) goto L1c
            java.lang.reflect.Type[] r3 = r4.getGenericInterfaces()
            r3 = r3[r1]
            return r3
        L1c:
            boolean r2 = r5.isAssignableFrom(r2)
            if (r2 == 0) goto L2f
            java.lang.reflect.Type[] r4 = r4.getGenericInterfaces()
            r4 = r4[r1]
            r3 = r3[r1]
            java.lang.reflect.Type r3 = m760(r4, r3, r5)
            return r3
        L2f:
            int r1 = r1 + 1
            goto Lf
        L32:
            boolean r3 = r4.isInterface()
            if (r3 != 0) goto L58
        L38:
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            if (r4 == r3) goto L58
            java.lang.Class r3 = r4.getSuperclass()
            if (r3 != r5) goto L47
            java.lang.reflect.Type r3 = r4.getGenericSuperclass()
            return r3
        L47:
            boolean r0 = r5.isAssignableFrom(r3)
            if (r0 == 0) goto L56
            java.lang.reflect.Type r4 = r4.getGenericSuperclass()
            java.lang.reflect.Type r3 = m760(r4, r3, r5)
            return r3
        L56:
            r4 = r3
            goto L38
        L58:
            return r5
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static java.lang.reflect.Type m761(java.lang.reflect.Type r1, java.lang.Class r2, java.lang.Class r3) {
            boolean r0 = r1 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto Ld
            java.lang.reflect.WildcardType r1 = (java.lang.reflect.WildcardType) r1
            java.lang.reflect.Type[] r1 = r1.getUpperBounds()
            r0 = 0
            r1 = r1[r0]
        Ld:
            boolean r0 = r3.isAssignableFrom(r2)
            if (r0 == 0) goto L21
            java.lang.reflect.Type r3 = m760(r1, r2, r3)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.reflect.Type r1 = m766(r1, r2, r3, r0)
            return r1
        L21:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = " is not the same as or a subtype of "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            r1.<init>(r2)
            throw r1
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static boolean m762(android.net.Uri r2) {
            if (r2 == 0) goto L1c
            java.lang.String r0 = "content"
            java.lang.String r1 = r2.getScheme()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1c
            java.lang.String r0 = "media"
            java.lang.String r2 = r2.getAuthority()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L1c
            r2 = 1
            return r2
        L1c:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static java.lang.Class m763(java.lang.reflect.Type r3) {
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L7
            java.lang.Class r3 = (java.lang.Class) r3
            return r3
        L7:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L14
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type r3 = r3.getRawType()
            java.lang.Class r3 = (java.lang.Class) r3
            return r3
        L14:
            boolean r0 = r3 instanceof java.lang.reflect.GenericArrayType
            r1 = 0
            if (r0 == 0) goto L2c
            java.lang.reflect.GenericArrayType r3 = (java.lang.reflect.GenericArrayType) r3
            java.lang.reflect.Type r3 = r3.getGenericComponentType()
            java.lang.Class r3 = m763(r3)
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r1)
            java.lang.Class r3 = r3.getClass()
            return r3
        L2c:
            boolean r0 = r3 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L33
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            return r3
        L33:
            boolean r0 = r3 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L44
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
            java.lang.reflect.Type[] r3 = r3.getUpperBounds()
            r3 = r3[r1]
            java.lang.Class r3 = m763(r3)
            return r3
        L44:
            if (r3 != 0) goto L49
            java.lang.String r0 = "null"
            goto L51
        L49:
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
        L51:
            java.lang.String r1 = "Expected a Class, ParameterizedType, or GenericArrayType, but <"
            java.lang.String r2 = "> is of type "
            defpackage.C2264.m3680(r1, r3, r2, r0)
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public static void m764(java.lang.CharSequence r2) {
            ᲈᛷᲀᲀ r0 = new ᲈᛷᲀᲀ
            r1 = 2
            r0.<init>(r1)
            r0.f9711 = r2
            r2 = 0
            r0.f9712 = r2
            m776(r0)
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public static void m765(java.lang.String r2) {
            ᲈᛷᲀᲀ r0 = new ᲈᛷᲀᲀ
            r1 = 2
            r0.<init>(r1)
            r0.f9711 = r2
            r2 = 1
            r0.f9712 = r2
            m776(r0)
            return
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public static java.lang.reflect.Type m766(java.lang.reflect.Type r10, java.lang.Class r11, java.lang.reflect.Type r12, java.util.HashMap r13) {
            r0 = 0
            r1 = r0
        L2:
            boolean r2 = r12 instanceof java.lang.reflect.TypeVariable
            r3 = 0
            if (r2 == 0) goto L5b
            r2 = r12
            java.lang.reflect.TypeVariable r2 = (java.lang.reflect.TypeVariable) r2
            java.lang.Object r4 = r13.get(r2)
            java.lang.reflect.Type r4 = (java.lang.reflect.Type) r4
            java.lang.Class r5 = java.lang.Void.TYPE
            if (r4 == 0) goto L18
            if (r4 != r5) goto L17
            return r12
        L17:
            return r4
        L18:
            r13.put(r2, r5)
            if (r1 != 0) goto L1e
            r1 = r2
        L1e:
            java.lang.reflect.GenericDeclaration r12 = r2.getGenericDeclaration()
            boolean r4 = r12 instanceof java.lang.Class
            if (r4 == 0) goto L29
            java.lang.Class r12 = (java.lang.Class) r12
            goto L2a
        L29:
            r12 = r0
        L2a:
            if (r12 != 0) goto L2d
            goto L56
        L2d:
            java.lang.reflect.Type r4 = m760(r10, r11, r12)
            boolean r5 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r5 == 0) goto L56
            java.lang.reflect.TypeVariable[] r12 = r12.getTypeParameters()
            int r5 = r12.length
        L3a:
            if (r3 >= r5) goto L50
            r6 = r12[r3]
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L4d
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type[] r12 = r4.getActualTypeArguments()
            r12 = r12[r3]
            goto L57
        L4d:
            int r3 = r3 + 1
            goto L3a
        L50:
            java.util.NoSuchElementException r10 = new java.util.NoSuchElementException
            r10.<init>()
            throw r10
        L56:
            r12 = r2
        L57:
            if (r12 != r2) goto L2
            goto L141
        L5b:
            boolean r0 = r12 instanceof java.lang.Class
            if (r0 == 0) goto L81
            r0 = r12
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r2 = r0.isArray()
            if (r2 == 0) goto L81
            java.lang.Class r12 = r0.getComponentType()
            java.lang.reflect.Type r10 = m766(r10, r11, r12, r13)
            boolean r11 = java.util.Objects.equals(r12, r10)
            if (r11 == 0) goto L79
            r12 = r0
            goto L141
        L79:
            ᛲᛷᛳᛸ r11 = new ᛲᛷᛳᛸ
            r11.<init>(r10)
        L7e:
            r12 = r11
            goto L141
        L81:
            boolean r0 = r12 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L9d
            java.lang.reflect.GenericArrayType r12 = (java.lang.reflect.GenericArrayType) r12
            java.lang.reflect.Type r0 = r12.getGenericComponentType()
            java.lang.reflect.Type r10 = m766(r10, r11, r0, r13)
            boolean r11 = java.util.Objects.equals(r0, r10)
            if (r11 == 0) goto L97
            goto L141
        L97:
            ᛲᛷᛳᛸ r11 = new ᛲᛷᛳᛸ
            r11.<init>(r10)
            goto L7e
        L9d:
            boolean r0 = r12 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            if (r0 == 0) goto Le6
            java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
            java.lang.reflect.Type r0 = r12.getOwnerType()
            java.lang.reflect.Type r4 = m766(r10, r11, r0, r13)
            boolean r0 = java.util.Objects.equals(r4, r0)
            java.lang.reflect.Type[] r5 = r12.getActualTypeArguments()
            int r6 = r5.length
            r7 = r5
            r5 = r3
        Lb7:
            if (r3 >= r6) goto Ld6
            r8 = r7[r3]
            java.lang.reflect.Type r8 = m766(r10, r11, r8, r13)
            r9 = r7[r3]
            boolean r9 = java.util.Objects.equals(r8, r9)
            if (r9 != 0) goto Ld3
            if (r5 != 0) goto Ld1
            java.lang.Object r5 = r7.clone()
            r7 = r5
            java.lang.reflect.Type[] r7 = (java.lang.reflect.Type[]) r7
            r5 = r2
        Ld1:
            r7[r3] = r8
        Ld3:
            int r3 = r3 + 1
            goto Lb7
        Ld6:
            if (r0 == 0) goto Lda
            if (r5 == 0) goto L141
        Lda:
            java.lang.reflect.Type r10 = r12.getRawType()
            java.lang.Class r10 = (java.lang.Class) r10
            ᛸᛵᛱᲇ r11 = new ᛸᛵᛱᲇ
            r11.<init>(r4, r10, r7)
            goto L7e
        Le6:
            boolean r0 = r12 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L141
            java.lang.reflect.WildcardType r12 = (java.lang.reflect.WildcardType) r12
            java.lang.reflect.Type[] r0 = r12.getLowerBounds()
            java.lang.reflect.Type[] r4 = r12.getUpperBounds()
            int r5 = r0.length
            if (r5 != r2) goto L11d
            r4 = r0[r3]
            java.lang.reflect.Type r10 = m766(r10, r11, r4, r13)
            r11 = r0[r3]
            if (r10 == r11) goto L141
            boolean r11 = r10 instanceof java.lang.reflect.WildcardType
            if (r11 == 0) goto L10c
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r10 = r10.getLowerBounds()
            goto L111
        L10c:
            java.lang.reflect.Type[] r11 = new java.lang.reflect.Type[r2]
            r11[r3] = r10
            r10 = r11
        L111:
            ᛷᛱᛴᲇ r12 = new ᛷᛱᛴᲇ
            java.lang.reflect.Type[] r11 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r11[r3] = r0
            r12.<init>(r11, r10)
            goto L141
        L11d:
            int r0 = r4.length
            if (r0 != r2) goto L141
            r0 = r4[r3]
            java.lang.reflect.Type r10 = m766(r10, r11, r0, r13)
            r11 = r4[r3]
            if (r10 == r11) goto L141
            boolean r11 = r10 instanceof java.lang.reflect.WildcardType
            if (r11 == 0) goto L135
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r10 = r10.getUpperBounds()
            goto L13a
        L135:
            java.lang.reflect.Type[] r11 = new java.lang.reflect.Type[r2]
            r11[r3] = r10
            r10 = r11
        L13a:
            ᛷᛱᛴᲇ r12 = new ᛷᛱᛴᲇ
            java.lang.reflect.Type[] r11 = defpackage.AbstractC0209.f1316
            r12.<init>(r10, r11)
        L141:
            if (r1 == 0) goto L146
            r13.put(r1, r12)
        L146:
            return r12
    }

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public static void m767(java.lang.String r2) {
            ᲈᛷᲀᲀ r0 = new ᲈᛷᲀᲀ
            r1 = 2
            r0.<init>(r1)
            r0.f9711 = r2
            m776(r0)
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static android.graphics.Bitmap m768(android.graphics.Bitmap r4) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            android.graphics.Bitmap$Config r0 = r4.getConfig()
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.HARDWARE
            if (r0 != r1) goto L31
            java.lang.String r0 = "Converting hardware bitmap to software bitmap for blur processing"
            java.lang.String r1 = "BaseBlurView"
            android.util.Log.d(r1, r0)
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Exception -> L1b
            r2 = 0
            android.graphics.Bitmap r4 = r4.copy(r0, r2)     // Catch: java.lang.Exception -> L1b
            return r4
        L1b:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to convert hardware bitmap: "
            r2.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.e(r1, r0)
        L31:
            return r4
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public static defpackage.C1126 m769(java.lang.String r8) {
            java.lang.String r0 = "HTTP/1."
            boolean r0 = r8.startsWith(r0)
            r1 = 4
            ᲁᛳᛶᛵ r2 = defpackage.EnumC1832.f7982
            ᲁᛳᛶᛵ r3 = defpackage.EnumC1832.f7981
            r4 = 32
            java.lang.String r5 = "Unexpected status line: "
            if (r0 == 0) goto L42
            int r0 = r8.length()
            r6 = 9
            if (r0 < r6) goto L38
            r0 = 8
            char r0 = r8.charAt(r0)
            if (r0 != r4) goto L38
            r0 = 7
            char r0 = r8.charAt(r0)
            int r0 = r0 + (-48)
            if (r0 == 0) goto L57
            r2 = 1
            if (r0 != r2) goto L2e
            goto L56
        L2e:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r8 = r5.concat(r8)
            r0.<init>(r8)
            throw r0
        L38:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r8 = r5.concat(r8)
            r0.<init>(r8)
            throw r0
        L42:
            java.lang.String r0 = "ICY "
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto L4c
            r6 = r1
            goto L57
        L4c:
            java.lang.String r0 = "SOURCETABLE "
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto La5
            r6 = 12
        L56:
            r2 = r3
        L57:
            int r0 = r8.length()
            int r3 = r6 + 3
            if (r0 < r3) goto L9b
            java.lang.String r0 = r8.substring(r6, r3)
            java.lang.Integer r0 = defpackage.AbstractC0056.m467(r0)
            if (r0 == 0) goto L91
            int r0 = r0.intValue()
            int r7 = r8.length()
            if (r7 <= r3) goto L89
            char r3 = r8.charAt(r3)
            if (r3 != r4) goto L7f
            int r6 = r6 + r1
            java.lang.String r8 = r8.substring(r6)
            goto L8b
        L7f:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r8 = r5.concat(r8)
            r0.<init>(r8)
            throw r0
        L89:
            java.lang.String r8 = ""
        L8b:
            ᛶᛸᛶᛲ r1 = new ᛶᛸᛶᛲ
            r1.<init>(r2, r0, r8)
            return r1
        L91:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r8 = r5.concat(r8)
            r0.<init>(r8)
            throw r0
        L9b:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r8 = r5.concat(r8)
            r0.<init>(r8)
            throw r0
        La5:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r8 = r5.concat(r8)
            r0.<init>(r8)
            throw r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static void m770(android.view.View r6) {
            java.lang.String r0 = "BaseBlurView"
            if (r6 == 0) goto L62
            boolean r1 = r6 instanceof android.widget.ImageView     // Catch: java.lang.Exception -> L35
            r2 = 0
            if (r1 == 0) goto L37
            r1 = r6
            android.widget.ImageView r1 = (android.widget.ImageView) r1     // Catch: java.lang.Exception -> L35
            android.graphics.drawable.Drawable r3 = r1.getDrawable()     // Catch: java.lang.Exception -> L35
            boolean r4 = r3 instanceof android.graphics.drawable.BitmapDrawable     // Catch: java.lang.Exception -> L35
            if (r4 == 0) goto L37
            android.graphics.drawable.BitmapDrawable r3 = (android.graphics.drawable.BitmapDrawable) r3     // Catch: java.lang.Exception -> L35
            android.graphics.Bitmap r3 = r3.getBitmap()     // Catch: java.lang.Exception -> L35
            if (r3 == 0) goto L37
            android.graphics.Bitmap$Config r4 = r3.getConfig()     // Catch: java.lang.Exception -> L35
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.HARDWARE     // Catch: java.lang.Exception -> L35
            if (r4 != r5) goto L37
            java.lang.String r4 = "Converting hardware bitmap in ImageView to software"
            android.util.Log.d(r0, r4)     // Catch: java.lang.Exception -> L35
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Exception -> L35
            android.graphics.Bitmap r3 = r3.copy(r4, r2)     // Catch: java.lang.Exception -> L35
            if (r3 == 0) goto L37
            r1.setImageBitmap(r3)     // Catch: java.lang.Exception -> L35
            goto L37
        L35:
            r6 = move-exception
            goto L4d
        L37:
            boolean r1 = r6 instanceof android.view.ViewGroup     // Catch: java.lang.Exception -> L35
            if (r1 == 0) goto L62
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6     // Catch: java.lang.Exception -> L35
            int r1 = r6.getChildCount()     // Catch: java.lang.Exception -> L35
        L41:
            if (r2 >= r1) goto L62
            android.view.View r3 = r6.getChildAt(r2)     // Catch: java.lang.Exception -> L35
            m770(r3)     // Catch: java.lang.Exception -> L35
            int r2 = r2 + 1
            goto L41
        L4d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Error disabling hardware bitmaps: "
            r1.<init>(r2)
            java.lang.String r6 = r6.getMessage()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            android.util.Log.e(r0, r6)
        L62:
            return
    }

    /* JADX INFO: renamed from: ᛷᛷᲀᛴ, reason: contains not printable characters */
    public static java.lang.String m771(java.lang.reflect.Type r1) {
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto Lb
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r1 = r1.getName()
            return r1
        Lb:
            java.lang.String r1 = r1.toString()
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final void m772(defpackage.InterfaceC0270 r4, java.lang.Throwable r5) {
            if (r4 == 0) goto L55
            if (r5 != 0) goto L4d
            boolean r5 = r4 instanceof java.lang.AutoCloseable
            if (r5 == 0) goto Lc
            r4.close()
            goto L55
        Lc:
            boolean r5 = r4 instanceof java.util.concurrent.ExecutorService
            if (r5 == 0) goto L3f
            java.util.concurrent.ExecutorService r4 = (java.util.concurrent.ExecutorService) r4
            java.util.concurrent.ForkJoinPool r5 = java.util.concurrent.ForkJoinPool.commonPool()
            if (r4 != r5) goto L19
            goto L55
        L19:
            boolean r5 = r4.isTerminated()
            if (r5 != 0) goto L55
            r4.shutdown()
            r0 = 0
        L23:
            if (r5 != 0) goto L35
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.DAYS     // Catch: java.lang.InterruptedException -> L2e
            r2 = 1
            boolean r5 = r4.awaitTermination(r2, r1)     // Catch: java.lang.InterruptedException -> L2e
            goto L23
        L2e:
            if (r0 != 0) goto L23
            r4.shutdownNow()
            r0 = 1
            goto L23
        L35:
            if (r0 == 0) goto L55
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
            goto L55
        L3f:
            boolean r5 = r4 instanceof android.content.res.TypedArray
            if (r5 == 0) goto L49
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r4.recycle()
            goto L55
        L49:
            defpackage.C0086.m557()
            return
        L4d:
            defpackage.AbstractC0225.m826(r4)     // Catch: java.lang.Throwable -> L51
            return
        L51:
            r4 = move-exception
            defpackage.AbstractC2193.m3595(r5, r4)
        L55:
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static java.lang.reflect.Type m773(java.lang.reflect.Type r3) {
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L1b
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L1a
            ᛲᛷᛳᛸ r0 = new ᛲᛷᛳᛸ
            java.lang.Class r3 = r3.getComponentType()
            java.lang.reflect.Type r3 = m773(r3)
            r0.<init>(r3)
            return r0
        L1a:
            return r3
        L1b:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L35
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            ᛸᛵᛱᲇ r0 = new ᛸᛵᛱᲇ
            java.lang.reflect.Type r1 = r3.getOwnerType()
            java.lang.reflect.Type r2 = r3.getRawType()
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            r0.<init>(r1, r2, r3)
            return r0
        L35:
            boolean r0 = r3 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L45
            java.lang.reflect.GenericArrayType r3 = (java.lang.reflect.GenericArrayType) r3
            ᛲᛷᛳᛸ r0 = new ᛲᛷᛳᛸ
            java.lang.reflect.Type r3 = r3.getGenericComponentType()
            r0.<init>(r3)
            return r0
        L45:
            boolean r0 = r3 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L59
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
            ᛷᛱᛴᲇ r0 = new ᛷᛱᛴᲇ
            java.lang.reflect.Type[] r1 = r3.getUpperBounds()
            java.lang.reflect.Type[] r3 = r3.getLowerBounds()
            r0.<init>(r1, r3)
            return r0
        L59:
            return r3
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static defpackage.C1530 m774(android.view.Display r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 0
            if (r0 < r1) goto L36
            android.view.RoundedCorner r3 = defpackage.AbstractC2344.m3824(r3, r4)
            if (r3 == 0) goto L36
            ᛸᛷᛵᛵ r4 = new ᛸᛷᛵᛵ
            int r0 = defpackage.AbstractC2344.m3830(r3)
            if (r0 == 0) goto L29
            r1 = 1
            if (r0 == r1) goto L2a
            r1 = 2
            if (r0 == r1) goto L2a
            r1 = 3
            if (r0 != r1) goto L1f
            goto L2a
        L1f:
            java.lang.String r3 = "Invalid position: "
            java.lang.String r3 = defpackage.AbstractC1124.m2145(r0, r3)
            defpackage.C2264.m3684(r3)
            return r2
        L29:
            r1 = 0
        L2a:
            int r0 = defpackage.AbstractC2344.m3835(r3)
            android.graphics.Point r3 = defpackage.AbstractC2344.m3827(r3)
            r4.<init>(r1, r0, r3)
            return r4
        L36:
            return r2
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public static final boolean m775(java.lang.String r1) {
            java.lang.String r0 = "GET"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L12
            java.lang.String r0 = "HEAD"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public static void m776(defpackage.C2295 r10) {
            android.app.Application r0 = defpackage.AbstractC0209.f1314
            java.lang.String r1 = "Toaster has not been initialized"
            if (r0 == 0) goto L10e
            java.lang.Object r0 = r10.f9711
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L10d
            int r0 = r0.length()
            if (r0 != 0) goto L14
            goto L10d
        L14:
            java.lang.Object r0 = r10.f9714
            ᛲᛶᛷᲈ r0 = (defpackage.C0311) r0
            if (r0 != 0) goto L1e
            ᛲᛶᛷᲈ r0 = defpackage.AbstractC0209.f1315
            r10.f9714 = r0
        L1e:
            java.lang.Object r0 = r10.f9715
            ᛷᲈᲀ r0 = (defpackage.C1403) r0
            r2 = 0
            if (r0 != 0) goto L32
            ᛷᲈᲀ r0 = defpackage.AbstractC0209.f1312
            if (r0 != 0) goto L30
            ᛷᲈᲀ r0 = new ᛷᲈᲀ
            r0.<init>(r2)
            defpackage.AbstractC0209.f1312 = r0
        L30:
            r10.f9715 = r0
        L32:
            java.lang.Object r0 = r10.f9710
            ᲀᛴᛱᛱ r0 = (defpackage.C1654) r0
            if (r0 != 0) goto L3c
            ᲀᛴᛱᛱ r0 = defpackage.AbstractC0209.f1313
            r10.f9710 = r0
        L3c:
            java.lang.Object r0 = r10.f9711
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.Boolean r3 = defpackage.AbstractC0209.f1311
            r4 = 1
            if (r3 != 0) goto L61
            android.app.Application r3 = defpackage.AbstractC0209.f1314
            if (r3 == 0) goto L5d
            android.content.pm.ApplicationInfo r1 = r3.getApplicationInfo()
            int r1 = r1.flags
            r1 = r1 & 2
            if (r1 == 0) goto L55
            r1 = r4
            goto L56
        L55:
            r1 = r2
        L56:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            defpackage.AbstractC0209.f1311 = r3
            goto L61
        L5d:
            defpackage.C2264.m3676(r1)
            return
        L61:
            boolean r1 = r3.booleanValue()
            if (r1 != 0) goto L69
            goto Lde
        L69:
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>()
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()
            int r3 = r1.length
            r5 = r2
        L74:
            if (r5 >= r3) goto Lde
            r6 = r1[r5]
            int r7 = r6.getLineNumber()
            if (r7 > 0) goto L7f
            goto Ldb
        L7f:
            java.lang.String r8 = r6.getClassName()
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.ClassNotFoundException -> Ld7
            java.lang.Class<ᛷᲈᲀ> r9 = defpackage.C1403.class
            boolean r9 = r9.isAssignableFrom(r8)     // Catch: java.lang.ClassNotFoundException -> Ld7
            if (r9 != 0) goto Ldb
            java.lang.Class<ᛱᲇᲈᛸ> r9 = defpackage.AbstractC0209.class
            boolean r9 = r9.equals(r8)     // Catch: java.lang.ClassNotFoundException -> Ld7
            if (r9 != 0) goto Ldb
            boolean r9 = r8.isInterface()     // Catch: java.lang.ClassNotFoundException -> Ld7
            if (r9 != 0) goto Ldb
            int r8 = r8.getModifiers()     // Catch: java.lang.ClassNotFoundException -> Ld7
            boolean r8 = java.lang.reflect.Modifier.isAbstract(r8)     // Catch: java.lang.ClassNotFoundException -> Ld7
            if (r8 == 0) goto La8
            goto Ldb
        La8:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> Ld7
            r8.<init>()     // Catch: java.lang.ClassNotFoundException -> Ld7
            java.lang.String r9 = "("
            r8.append(r9)     // Catch: java.lang.ClassNotFoundException -> Ld7
            java.lang.String r6 = r6.getFileName()     // Catch: java.lang.ClassNotFoundException -> Ld7
            r8.append(r6)     // Catch: java.lang.ClassNotFoundException -> Ld7
            java.lang.String r6 = ":"
            r8.append(r6)     // Catch: java.lang.ClassNotFoundException -> Ld7
            r8.append(r7)     // Catch: java.lang.ClassNotFoundException -> Ld7
            java.lang.String r6 = ") "
            r8.append(r6)     // Catch: java.lang.ClassNotFoundException -> Ld7
            java.lang.String r6 = r0.toString()     // Catch: java.lang.ClassNotFoundException -> Ld7
            r8.append(r6)     // Catch: java.lang.ClassNotFoundException -> Ld7
            java.lang.String r6 = r8.toString()     // Catch: java.lang.ClassNotFoundException -> Ld7
            java.lang.String r7 = "Toaster"
            android.util.Log.i(r7, r6)     // Catch: java.lang.ClassNotFoundException -> Ld7
            goto Lde
        Ld7:
            r6 = move-exception
            r6.printStackTrace()
        Ldb:
            int r5 = r5 + 1
            goto L74
        Lde:
            int r0 = r10.f9712
            r1 = -1
            if (r0 != r1) goto Lfa
            java.lang.Object r0 = r10.f9714
            ᛲᛶᛷᲈ r0 = (defpackage.C0311) r0
            java.lang.Object r1 = r10.f9711
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.getClass()
            int r0 = r1.length()
            r1 = 20
            if (r0 <= r1) goto Lf7
            goto Lf8
        Lf7:
            r4 = r2
        Lf8:
            r10.f9712 = r4
        Lfa:
            java.lang.Object r0 = r10.f9714
            ᛲᛶᛷᲈ r0 = (defpackage.C0311) r0
            r0.getClass()
            android.os.Handler r1 = defpackage.C0311.f1641
            ᛲᲇᛴᲇ r3 = new ᛲᲇᛴᲇ
            r3.<init>(r0, r10, r2)
            r4 = 100
            r1.postDelayed(r3, r4)
        L10d:
            return
        L10e:
            defpackage.C2264.m3676(r1)
            return
    }

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public static void m777(android.content.Context r4, int r5, defpackage.InterfaceC0598 r6) {
            r0 = -96001393597998(0xffffa8afef0961d2, double:NaN)
            r0 = -96035753336366(0xffffa8a7ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r0 = defpackage.C0346.f1773
            r0.getClass()
            defpackage.C0346.m1051(r4)
            ᛶᛱᛵᛳ r0 = new ᛶᛱᛵᛳ
            r0.<init>()
            r0.f4472 = r5
            ᛶᛵᛳᛸ r1 = defpackage.C1069.m2030(r4)
            r2 = 0
            r1.f4765 = r2
            r2 = -96104472813102(0xffffa897ef0961d2, double:NaN)
            java.lang.String r2 = "选择颜色"
            r1.f4775 = r2
            r1.mo2037()
            ᛷᛵᲈᛱ r2 = new ᛷᛵᲈᛱ
            r2.<init>(r5, r4, r0)
            r1.f4776 = r2
            r1.mo2037()
            r2 = -96125947649582(0xffffa892ef0961d2, double:NaN)
            java.lang.String r5 = "确定"
            r1.f4774 = r5
            r1.mo2037()
            r2 = -96138832551470(0xffffa88fef0961d2, double:NaN)
            java.lang.String r5 = "取消"
            r1.f4764 = r5
            r1.mo2037()
            ᛷᛶᛴᛲ r5 = new ᛷᛶᛴᛲ
            r5.<init>(r0, r6)
            r1.f384 = r5
            r1.m2034(r4)
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static void m778(java.lang.reflect.Type r1) {
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto L12
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r1 = r1.isPrimitive()
            if (r1 != 0) goto Ld
            goto L12
        Ld:
            java.lang.String r1 = "Primitive type is not allowed"
            defpackage.C2264.m3684(r1)
        L12:
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static boolean m779(java.lang.reflect.Type r4, java.lang.reflect.Type r5) {
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof java.lang.Class
            if (r1 == 0) goto Ld
            boolean r4 = r4.equals(r5)
            return r4
        Ld:
            boolean r1 = r4 instanceof java.lang.reflect.ParameterizedType
            r2 = 0
            if (r1 == 0) goto L47
            boolean r1 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.reflect.Type r1 = r4.getOwnerType()
            java.lang.reflect.Type r3 = r5.getOwnerType()
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L46
            java.lang.reflect.Type r1 = r4.getRawType()
            java.lang.reflect.Type r3 = r5.getRawType()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L46
            java.lang.reflect.Type[] r4 = r4.getActualTypeArguments()
            java.lang.reflect.Type[] r5 = r5.getActualTypeArguments()
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 == 0) goto L46
            return r0
        L46:
            return r2
        L47:
            boolean r1 = r4 instanceof java.lang.reflect.GenericArrayType
            if (r1 == 0) goto L61
            boolean r0 = r5 instanceof java.lang.reflect.GenericArrayType
            if (r0 != 0) goto L50
            return r2
        L50:
            java.lang.reflect.GenericArrayType r4 = (java.lang.reflect.GenericArrayType) r4
            java.lang.reflect.GenericArrayType r5 = (java.lang.reflect.GenericArrayType) r5
            java.lang.reflect.Type r4 = r4.getGenericComponentType()
            java.lang.reflect.Type r5 = r5.getGenericComponentType()
            boolean r4 = m779(r4, r5)
            return r4
        L61:
            boolean r1 = r4 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto L8c
            boolean r1 = r5 instanceof java.lang.reflect.WildcardType
            if (r1 != 0) goto L6a
            return r2
        L6a:
            java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
            java.lang.reflect.WildcardType r5 = (java.lang.reflect.WildcardType) r5
            java.lang.reflect.Type[] r1 = r4.getUpperBounds()
            java.lang.reflect.Type[] r3 = r5.getUpperBounds()
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L8b
            java.lang.reflect.Type[] r4 = r4.getLowerBounds()
            java.lang.reflect.Type[] r5 = r5.getLowerBounds()
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 == 0) goto L8b
            return r0
        L8b:
            return r2
        L8c:
            boolean r1 = r4 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto Lb6
            boolean r1 = r5 instanceof java.lang.reflect.TypeVariable
            if (r1 != 0) goto L95
            return r2
        L95:
            java.lang.reflect.TypeVariable r4 = (java.lang.reflect.TypeVariable) r4
            java.lang.reflect.TypeVariable r5 = (java.lang.reflect.TypeVariable) r5
            java.lang.reflect.GenericDeclaration r1 = r4.getGenericDeclaration()
            java.lang.reflect.GenericDeclaration r3 = r5.getGenericDeclaration()
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto Lb6
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = r5.getName()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Lb6
            return r0
        Lb6:
            return r2
    }

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public static final int m780(defpackage.C1439 r4, int r5) {
            int[] r0 = r4.f6321
            int r5 = r5 + 1
            byte[][] r4 = r4.f6322
            int r4 = r4.length
            int r4 = r4 + (-1)
            r1 = 0
        La:
            if (r1 > r4) goto L1c
            int r2 = r1 + r4
            int r2 = r2 >>> 1
            r3 = r0[r2]
            if (r3 >= r5) goto L17
            int r1 = r2 + 1
            goto La
        L17:
            if (r3 <= r5) goto L1f
            int r4 = r2 + (-1)
            goto La
        L1c:
            int r4 = -r1
            int r2 = r4 + (-1)
        L1f:
            if (r2 < 0) goto L22
            return r2
        L22:
            int r4 = ~r2
            return r4
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static defpackage.EnumC1832 m781(java.lang.String r1) {
            java.lang.String r0 = "http/1.0"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            ᲁᛳᛶᛵ r1 = defpackage.EnumC1832.f7982
            return r1
        Lb:
            java.lang.String r0 = "http/1.1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L16
            ᲁᛳᛶᛵ r1 = defpackage.EnumC1832.f7981
            return r1
        L16:
            java.lang.String r0 = "h2_prior_knowledge"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L21
            ᲁᛳᛶᛵ r1 = defpackage.EnumC1832.f7978
            return r1
        L21:
            java.lang.String r0 = "h2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2c
            ᲁᛳᛶᛵ r1 = defpackage.EnumC1832.f7985
            return r1
        L2c:
            java.lang.String r0 = "spdy/3.1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L37
            ᲁᛳᛶᛵ r1 = defpackage.EnumC1832.f7984
            return r1
        L37:
            java.lang.String r0 = "quic"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L42
            ᲁᛳᛶᛵ r1 = defpackage.EnumC1832.f7980
            return r1
        L42:
            java.lang.String r0 = "h3"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L4d
            ᲁᛳᛶᛵ r1 = defpackage.EnumC1832.f7983
            return r1
        L4d:
            java.lang.String r0 = "Unexpected protocol: "
            java.lang.String r1 = r0.concat(r1)
            defpackage.C2264.m3682(r1)
            r1 = 0
            return r1
    }
}
