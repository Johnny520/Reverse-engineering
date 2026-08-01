package xhss;

/* JADX INFO: renamed from: xhss.ᲀᲈᛵᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0915 {

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static android.app.Application f2949;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static xhss.C0263 f2950;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public static final char[] f2951 = null;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static final java.lang.reflect.Type[] f2952 = null;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static java.lang.Boolean f2953;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static xhss.C0884 f2954;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static xhss.C0263 f2955;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f2956;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2957;

    static {
            r0 = 0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
            xhss.C0915.f2952 = r0
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x0010: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            xhss.C0915.f2951 = r0
            return
    }

    public /* synthetic */ C0915(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f2957 = r1
            r0.f2956 = r2
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static java.lang.reflect.Type m1485(java.lang.reflect.Type r3) {
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L1b
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L1a
            xhss.ᛱᛷᛶᛲ r0 = new xhss.ᛱᛷᛶᛲ
            java.lang.Class r3 = r3.getComponentType()
            java.lang.reflect.Type r3 = m1485(r3)
            r0.<init>(r3)
            return r0
        L1a:
            return r3
        L1b:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L35
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            xhss.ᛸᲇᲈᛳ r0 = new xhss.ᛸᲇᲈᛳ
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
            xhss.ᛱᛷᛶᛲ r0 = new xhss.ᛱᛷᛶᛲ
            java.lang.reflect.Type r3 = r3.getGenericComponentType()
            r0.<init>(r3)
            return r0
        L45:
            boolean r0 = r3 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L59
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
            xhss.ᲁᛸᛴᲁ r0 = new xhss.ᲁᛸᛴᲁ
            java.lang.reflect.Type[] r1 = r3.getUpperBounds()
            java.lang.reflect.Type[] r3 = r3.getLowerBounds()
            r0.<init>(r1, r3)
            return r0
        L59:
            return r3
    }

    /* JADX INFO: renamed from: ᛱᛳᲁᲈ, reason: contains not printable characters */
    public static void m1486(org.xmlpull.v1.XmlPullParser r3) {
            r0 = 1
        L1:
            if (r0 <= 0) goto L14
            int r1 = r3.next()
            r2 = 2
            if (r1 == r2) goto L11
            r2 = 3
            if (r1 == r2) goto Le
            goto L1
        Le:
            int r0 = r0 + (-1)
            goto L1
        L11:
            int r0 = r0 + 1
            goto L1
        L14:
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲀᲈ, reason: contains not printable characters */
    public static java.lang.String m1487(java.lang.reflect.Type r1) {
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto Lb
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r1 = r1.getName()
            return r1
        Lb:
            java.lang.String r1 = r1.toString()
            return r1
    }

    /* JADX INFO: renamed from: ᛳᛶᛷᲀ, reason: contains not printable characters */
    public static java.lang.reflect.Type m1488(java.lang.reflect.Type r10, java.lang.Class r11, java.lang.reflect.Type r12, java.util.HashMap r13) {
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
            java.lang.reflect.Type r4 = m1497(r10, r11, r12)
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
            java.lang.reflect.Type r10 = m1488(r10, r11, r12, r13)
            boolean r11 = java.util.Objects.equals(r12, r10)
            if (r11 == 0) goto L79
            r12 = r0
            goto L141
        L79:
            xhss.ᛱᛷᛶᛲ r11 = new xhss.ᛱᛷᛶᛲ
            r11.<init>(r10)
        L7e:
            r12 = r11
            goto L141
        L81:
            boolean r0 = r12 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L9d
            java.lang.reflect.GenericArrayType r12 = (java.lang.reflect.GenericArrayType) r12
            java.lang.reflect.Type r0 = r12.getGenericComponentType()
            java.lang.reflect.Type r10 = m1488(r10, r11, r0, r13)
            boolean r11 = java.util.Objects.equals(r0, r10)
            if (r11 == 0) goto L97
            goto L141
        L97:
            xhss.ᛱᛷᛶᛲ r11 = new xhss.ᛱᛷᛶᛲ
            r11.<init>(r10)
            goto L7e
        L9d:
            boolean r0 = r12 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            if (r0 == 0) goto Le6
            java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
            java.lang.reflect.Type r0 = r12.getOwnerType()
            java.lang.reflect.Type r4 = m1488(r10, r11, r0, r13)
            boolean r0 = java.util.Objects.equals(r4, r0)
            java.lang.reflect.Type[] r5 = r12.getActualTypeArguments()
            int r6 = r5.length
            r7 = r5
            r5 = r3
        Lb7:
            if (r3 >= r6) goto Ld6
            r8 = r7[r3]
            java.lang.reflect.Type r8 = m1488(r10, r11, r8, r13)
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
            xhss.ᛸᲇᲈᛳ r11 = new xhss.ᛸᲇᲈᛳ
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
            java.lang.reflect.Type r10 = m1488(r10, r11, r4, r13)
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
            xhss.ᲁᛸᛴᲁ r12 = new xhss.ᲁᛸᛴᲁ
            java.lang.reflect.Type[] r11 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r11[r3] = r0
            r12.<init>(r11, r10)
            goto L141
        L11d:
            int r0 = r4.length
            if (r0 != r2) goto L141
            r0 = r4[r3]
            java.lang.reflect.Type r10 = m1488(r10, r11, r0, r13)
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
            xhss.ᲁᛸᛴᲁ r12 = new xhss.ᲁᛸᛴᲁ
            java.lang.reflect.Type[] r11 = xhss.C0915.f2952
            r12.<init>(r10, r11)
        L141:
            if (r1 == 0) goto L146
            r13.put(r1, r12)
        L146:
            return r12
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static java.lang.String m1489(java.lang.String r17, int r18, int r19, java.lang.String r20, int r21) {
            r0 = r17
            r1 = r20
            r2 = r21 & 1
            r3 = 0
            if (r2 == 0) goto Lb
            r2 = r3
            goto Ld
        Lb:
            r2 = r18
        Ld:
            r4 = r21 & 2
            if (r4 == 0) goto L16
            int r4 = r0.length()
            goto L18
        L16:
            r4 = r19
        L18:
            r5 = r21 & 8
            r6 = 1
            if (r5 == 0) goto L1f
            r5 = r3
            goto L20
        L1f:
            r5 = r6
        L20:
            r7 = r21 & 16
            if (r7 == 0) goto L26
            r7 = r3
            goto L27
        L26:
            r7 = r6
        L27:
            r8 = r21 & 32
            if (r8 == 0) goto L2d
            r8 = r3
            goto L2e
        L2d:
            r8 = r6
        L2e:
            r9 = r21 & 64
            if (r9 == 0) goto L33
            goto L34
        L33:
            r3 = r6
        L34:
            r6 = r2
        L35:
            if (r6 >= r4) goto L113
            int r9 = r0.codePointAt(r6)
            r10 = 32
            r11 = 128(0x80, float:1.8E-43)
            r12 = 43
            r13 = 37
            r14 = 127(0x7f, float:1.78E-43)
            if (r9 < r10) goto L6b
            if (r9 == r14) goto L6b
            if (r9 < r11) goto L4d
            if (r3 == 0) goto L6b
        L4d:
            char r15 = (char) r9
            boolean r15 = xhss.AbstractC0120.m338(r1, r15)
            if (r15 != 0) goto L6b
            if (r9 != r13) goto L60
            if (r5 == 0) goto L6b
            if (r7 == 0) goto L60
            boolean r15 = m1508(r0, r6, r4)
            if (r15 == 0) goto L6b
        L60:
            if (r9 != r12) goto L65
            if (r8 == 0) goto L65
            goto L6b
        L65:
            int r9 = java.lang.Character.charCount(r9)
            int r6 = r6 + r9
            goto L35
        L6b:
            xhss.ᛴᛲᛴᛶ r9 = new xhss.ᛴᛲᛴᛶ
            r9.<init>()
            r9.m702(r0, r2, r6)
            r2 = 0
        L74:
            if (r6 >= r4) goto L10e
            int r15 = r0.codePointAt(r6)
            if (r5 == 0) goto L8d
            r13 = 9
            if (r15 == r13) goto Lcb
            r13 = 10
            if (r15 == r13) goto Lcb
            r13 = 12
            if (r15 == r13) goto Lcb
            r13 = 13
            if (r15 != r13) goto L8d
            goto Lcb
        L8d:
            java.lang.String r13 = "+"
            if (r15 != r10) goto L9b
            java.lang.String r11 = " !\"#$&'()+,/:;<=>?@[\\]^`{|}~"
            if (r1 != r11) goto L9b
            r9.m686(r13)
        L98:
            r11 = 128(0x80, float:1.8E-43)
            goto Lcb
        L9b:
            if (r15 != r12) goto La8
            if (r8 == 0) goto La8
            if (r5 == 0) goto La2
            goto La4
        La2:
            java.lang.String r13 = "%2B"
        La4:
            r9.m686(r13)
            goto L98
        La8:
            if (r15 < r10) goto Lce
            if (r15 == r14) goto Lce
            r11 = 128(0x80, float:1.8E-43)
            if (r15 < r11) goto Lb2
            if (r3 == 0) goto Ld0
        Lb2:
            char r13 = (char) r15
            boolean r13 = xhss.AbstractC0120.m338(r1, r13)
            if (r13 != 0) goto Ld0
            r13 = 37
            if (r15 != r13) goto Lc8
            if (r5 == 0) goto Ld0
            if (r7 == 0) goto Lc8
            boolean r13 = m1508(r0, r6, r4)
            if (r13 != 0) goto Lc8
            goto Ld0
        Lc8:
            r9.m688(r15)
        Lcb:
            r11 = 37
            goto L102
        Lce:
            r11 = 128(0x80, float:1.8E-43)
        Ld0:
            if (r2 != 0) goto Ld7
            xhss.ᛴᛲᛴᛶ r2 = new xhss.ᛴᛲᛴᛶ
            r2.<init>()
        Ld7:
            r2.m688(r15)
        Lda:
            boolean r13 = r2.m683()
            if (r13 != 0) goto Lcb
            byte r13 = r2.m703()
            r10 = r13 & 255(0xff, float:3.57E-43)
            r11 = 37
            r9.m701(r11)
            int r10 = r10 >> 4
            r10 = r10 & 15
            char[] r16 = xhss.C0915.f2951
            char r10 = r16[r10]
            r9.m701(r10)
            r10 = r13 & 15
            char r10 = r16[r10]
            r9.m701(r10)
            r10 = 32
            r11 = 128(0x80, float:1.8E-43)
            goto Lda
        L102:
            int r10 = java.lang.Character.charCount(r15)
            int r6 = r6 + r10
            r13 = r11
            r10 = 32
            r11 = 128(0x80, float:1.8E-43)
            goto L74
        L10e:
            java.lang.String r0 = r9.m692()
            return r0
        L113:
            java.lang.String r0 = r0.substring(r2, r4)
            return r0
    }

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public static android.view.animation.Animation m1490(android.content.Context r2, int r3) {
            if (r2 == 0) goto L9
            if (r3 == 0) goto L9
            android.view.animation.Animation r2 = android.view.animation.AnimationUtils.loadAnimation(r2, r3)     // Catch: java.lang.Throwable -> L9
            return r2
        L9:
            android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r3, r3)
            r0 = 180(0xb4, double:8.9E-322)
            r2.setDuration(r0)
            return r2
    }

    /* JADX INFO: renamed from: ᛴᲈᛱᛴ, reason: contains not printable characters */
    public static java.util.List m1491(android.content.res.Resources r8, int r9) {
            if (r9 != 0) goto L5
            java.util.List r8 = java.util.Collections.EMPTY_LIST
            return r8
        L5:
            android.content.res.TypedArray r0 = r8.obtainTypedArray(r9)
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L17
            java.util.List r8 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L15
            r0.recycle()
            return r8
        L15:
            r8 = move-exception
            goto L70
        L17:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L15
            r1.<init>()     // Catch: java.lang.Throwable -> L15
            r2 = 0
            int r3 = r0.getType(r2)     // Catch: java.lang.Throwable -> L15
            r4 = 1
            if (r3 != r4) goto L50
            r9 = r2
        L25:
            int r3 = r0.length()     // Catch: java.lang.Throwable -> L15
            if (r9 >= r3) goto L6c
            int r3 = r0.getResourceId(r9, r2)     // Catch: java.lang.Throwable -> L15
            if (r3 == 0) goto L4d
            java.lang.String[] r3 = r8.getStringArray(r3)     // Catch: java.lang.Throwable -> L15
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L15
            r4.<init>()     // Catch: java.lang.Throwable -> L15
            int r5 = r3.length     // Catch: java.lang.Throwable -> L15
            r6 = r2
        L3c:
            if (r6 >= r5) goto L4a
            r7 = r3[r6]     // Catch: java.lang.Throwable -> L15
            byte[] r7 = android.util.Base64.decode(r7, r2)     // Catch: java.lang.Throwable -> L15
            r4.add(r7)     // Catch: java.lang.Throwable -> L15
            int r6 = r6 + 1
            goto L3c
        L4a:
            r1.add(r4)     // Catch: java.lang.Throwable -> L15
        L4d:
            int r9 = r9 + 1
            goto L25
        L50:
            java.lang.String[] r8 = r8.getStringArray(r9)     // Catch: java.lang.Throwable -> L15
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L15
            r9.<init>()     // Catch: java.lang.Throwable -> L15
            int r3 = r8.length     // Catch: java.lang.Throwable -> L15
            r4 = r2
        L5b:
            if (r4 >= r3) goto L69
            r5 = r8[r4]     // Catch: java.lang.Throwable -> L15
            byte[] r5 = android.util.Base64.decode(r5, r2)     // Catch: java.lang.Throwable -> L15
            r9.add(r5)     // Catch: java.lang.Throwable -> L15
            int r4 = r4 + 1
            goto L5b
        L69:
            r1.add(r9)     // Catch: java.lang.Throwable -> L15
        L6c:
            r0.recycle()
            return r1
        L70:
            r0.recycle()
            throw r8
    }

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public static xhss.InterfaceC0571 m1492(android.content.res.XmlResourceParser r25, android.content.res.Resources r26) {
            r0 = r26
        L2:
            int r1 = r25.next()
            r2 = 1
            r3 = 2
            if (r1 == r3) goto Ld
            if (r1 == r2) goto Ld
            goto L2
        Ld:
            if (r1 != r3) goto L1c5
            r1 = 0
            java.lang.String r4 = "font-family"
            r5 = r25
            r5.require(r3, r1, r4)
            java.lang.String r6 = r5.getName()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L1bf
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r5)
            int[] r6 = xhss.AbstractC0849.f2756
            android.content.res.TypedArray r4 = r0.obtainAttributes(r4, r6)
            r6 = 0
            java.lang.String r8 = r4.getString(r6)
            r7 = 5
            java.lang.String r9 = r4.getString(r7)
            r10 = 6
            java.lang.String r14 = r4.getString(r10)
            java.lang.String r15 = r4.getString(r3)
            int r11 = r4.getResourceId(r2, r6)
            r12 = 3
            int r13 = r4.getInteger(r12, r2)
            r16 = r1
            r1 = 500(0x1f4, float:7.0E-43)
            r7 = 4
            int r1 = r4.getInteger(r7, r1)
            r7 = 7
            java.lang.String r2 = r4.getString(r7)
            r4.recycle()
            if (r8 == 0) goto L10b
            if (r9 == 0) goto L10b
            java.util.List r11 = m1491(r0, r11)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L65:
            int r7 = r5.next()
            if (r7 == r12) goto Ld8
            int r7 = r5.getEventType()
            if (r7 == r3) goto L72
            goto L65
        L72:
            java.lang.String r7 = r5.getName()
            java.lang.String r10 = "fallback"
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto Lce
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r5)
            int[] r10 = xhss.AbstractC0849.f2759
            android.content.res.TypedArray r7 = r0.obtainAttributes(r7, r10)
            java.lang.String r10 = r7.getString(r6)     // Catch: java.lang.Throwable -> La2
            r6 = 1
            java.lang.String r17 = r7.getString(r6)     // Catch: java.lang.Throwable -> La2
            r6 = r13
            java.lang.String r13 = r7.getString(r3)     // Catch: java.lang.Throwable -> La2
            if (r10 == 0) goto Lc0
        L98:
            int r3 = r5.next()     // Catch: java.lang.Throwable -> La2
            if (r3 == r12) goto La6
            m1486(r5)     // Catch: java.lang.Throwable -> La2
            goto L98
        La2:
            r0 = move-exception
            r17 = r7
            goto Lca
        La6:
            r3 = r7
            xhss.ᛷᛱᛲᲇ r7 = new xhss.ᛷᛱᛲᲇ     // Catch: java.lang.Throwable -> Lbc
            r24 = r17
            r17 = r3
            r3 = r12
            r12 = r24
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> Lba
            r17.recycle()
            r4.add(r7)
            goto Ld3
        Lba:
            r0 = move-exception
            goto Lca
        Lbc:
            r0 = move-exception
            r17 = r3
            goto Lca
        Lc0:
            r17 = r7
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Throwable -> Lba
            java.lang.String r1 = "query attribute must be set in fallback element"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lba
            throw r0     // Catch: java.lang.Throwable -> Lba
        Lca:
            r17.recycle()
            throw r0
        Lce:
            r3 = r12
            r6 = r13
            m1486(r5)
        Ld3:
            r12 = r3
            r13 = r6
            r3 = 2
            r6 = 0
            goto L65
        Ld8:
            r6 = r13
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto Le5
            xhss.ᲀᛲᲈᛶ r0 = new xhss.ᲀᛲᲈᛶ
            r0.<init>(r4, r6, r1, r2)
            return r0
        Le5:
            if (r14 == 0) goto L105
            xhss.ᛷᛱᛲᲇ r7 = new xhss.ᛷᛱᛲᲇ
            r12 = 0
            r13 = 0
            r10 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r4.add(r7)
            if (r15 == 0) goto Lff
            xhss.ᛷᛱᛲᲇ r7 = new xhss.ᛷᛱᛲᲇ
            r12 = 0
            r13 = 0
            r10 = r15
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r4.add(r7)
        Lff:
            xhss.ᲀᛲᲈᛶ r0 = new xhss.ᲀᛲᲈᛶ
            r0.<init>(r4, r6, r1, r2)
            return r0
        L105:
            java.lang.String r0 = "The provider font XML requires query attribute or fallback children."
            xhss.C0532.m959(r0)
            return r16
        L10b:
            r3 = r12
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L111:
            int r2 = r5.next()
            if (r2 == r3) goto L1a9
            int r2 = r5.getEventType()
            r4 = 2
            if (r2 == r4) goto L11f
            goto L111
        L11f:
            java.lang.String r2 = r5.getName()
            java.lang.String r6 = "font"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L1a2
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r5)
            int[] r6 = xhss.AbstractC0849.f2757
            android.content.res.TypedArray r2 = r0.obtainAttributes(r2, r6)
            r6 = 8
            boolean r8 = r2.hasValue(r6)
            if (r8 == 0) goto L13e
            goto L13f
        L13e:
            r6 = 1
        L13f:
            r8 = 400(0x190, float:5.6E-43)
            int r19 = r2.getInt(r6, r8)
            boolean r6 = r2.hasValue(r10)
            if (r6 == 0) goto L14e
            r6 = r10
        L14c:
            r8 = 0
            goto L150
        L14e:
            r6 = r4
            goto L14c
        L150:
            int r6 = r2.getInt(r6, r8)
            r8 = 1
            if (r8 != r6) goto L15a
            r20 = r8
            goto L15c
        L15a:
            r20 = 0
        L15c:
            r12 = 9
            boolean r6 = r2.hasValue(r12)
            if (r6 == 0) goto L165
            goto L166
        L165:
            r12 = r3
        L166:
            boolean r6 = r2.hasValue(r7)
            if (r6 == 0) goto L16e
            r6 = r7
            goto L16f
        L16e:
            r6 = 4
        L16f:
            java.lang.String r21 = r2.getString(r6)
            r6 = 0
            int r22 = r2.getInt(r12, r6)
            r9 = 5
            boolean r11 = r2.hasValue(r9)
            if (r11 == 0) goto L181
            r11 = r9
            goto L182
        L181:
            r11 = r6
        L182:
            int r23 = r2.getResourceId(r11, r6)
            r2.getString(r11)
            r2.recycle()
        L18c:
            int r2 = r5.next()
            if (r2 == r3) goto L196
            m1486(r5)
            goto L18c
        L196:
            xhss.ᛲᲁᲈᛱ r18 = new xhss.ᛲᲁᲈᛱ
            r18.<init>(r19, r20, r21, r22, r23)
            r2 = r18
            r1.add(r2)
            goto L111
        L1a2:
            r8 = 1
            r9 = 5
            m1486(r5)
            goto L111
        L1a9:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L1b0
            return r16
        L1b0:
            xhss.ᛷᲁᛵ r0 = new xhss.ᛷᲁᛵ
            r6 = 0
            xhss.ᛲᲁᲈᛱ[] r2 = new xhss.C0212[r6]
            java.lang.Object[] r1 = r1.toArray(r2)
            xhss.ᛲᲁᲈᛱ[] r1 = (xhss.C0212[]) r1
            r0.<init>(r1)
            return r0
        L1bf:
            r16 = r1
            m1486(r5)
            return r16
        L1c5:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static int m1493(java.lang.String r4, int r5, int r6, boolean r7) {
        L0:
            if (r5 >= r6) goto L3c
            char r0 = r4.charAt(r5)
            r1 = 32
            r2 = 1
            if (r0 >= r1) goto Lf
            r1 = 9
            if (r0 != r1) goto L33
        Lf:
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 >= r1) goto L33
            r1 = 48
            r3 = 58
            if (r1 > r0) goto L1c
            if (r0 >= r3) goto L1c
            goto L33
        L1c:
            r1 = 97
            if (r1 > r0) goto L25
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 >= r1) goto L25
            goto L33
        L25:
            r1 = 65
            if (r1 > r0) goto L2e
            r1 = 91
            if (r0 >= r1) goto L2e
            goto L33
        L2e:
            if (r0 != r3) goto L31
            goto L33
        L31:
            r0 = 0
            goto L34
        L33:
            r0 = r2
        L34:
            r1 = r7 ^ 1
            if (r0 != r1) goto L39
            return r5
        L39:
            int r5 = r5 + 1
            goto L0
        L3c:
            return r6
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static void m1494(long r20, xhss.C0338 r22, int r23, java.util.ArrayList r24, int r25, int r26, java.util.ArrayList r27) {
            r0 = r22
            r1 = r23
            r5 = r24
            r2 = r25
            r10 = r26
            r8 = r27
            java.lang.String r3 = "Failed requirement."
            if (r2 >= r10) goto L1a9
            r4 = r2
        L11:
            if (r4 >= r10) goto L26
            java.lang.Object r6 = r5.get(r4)
            xhss.ᛳᛶᲈᲈ r6 = (xhss.C0289) r6
            int r6 = r6.mo611()
            if (r6 < r1) goto L22
            int r4 = r4 + 1
            goto L11
        L22:
            xhss.C0532.m959(r3)
            return
        L26:
            java.lang.Object r3 = r24.get(r25)
            xhss.ᛳᛶᲈᲈ r3 = (xhss.C0289) r3
            int r4 = r10 + (-1)
            java.lang.Object r4 = r5.get(r4)
            xhss.ᛳᛶᲈᲈ r4 = (xhss.C0289) r4
            int r6 = r3.mo611()
            if (r1 != r6) goto L53
            java.lang.Object r3 = r8.get(r2)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            int r2 = r2 + 1
            java.lang.Object r6 = r5.get(r2)
            xhss.ᛳᛶᲈᲈ r6 = (xhss.C0289) r6
            r19 = r6
            r6 = r2
            r2 = r3
            r3 = r19
            goto L55
        L53:
            r6 = r2
            r2 = -1
        L55:
            byte r7 = r3.mo616(r1)
            byte r9 = r4.mo616(r1)
            r14 = 2
            if (r7 == r9) goto L124
            int r3 = r6 + 1
            r4 = 1
        L64:
            if (r3 >= r10) goto L83
            int r7 = r3 + (-1)
            java.lang.Object r7 = r5.get(r7)
            xhss.ᛳᛶᲈᲈ r7 = (xhss.C0289) r7
            byte r7 = r7.mo616(r1)
            java.lang.Object r9 = r5.get(r3)
            xhss.ᛳᛶᲈᲈ r9 = (xhss.C0289) r9
            byte r9 = r9.mo616(r1)
            if (r7 == r9) goto L80
            int r4 = r4 + 1
        L80:
            int r3 = r3 + 1
            goto L64
        L83:
            r16 = -1
            r17 = 4
            long r11 = r0.f1261
            long r11 = r11 / r17
            long r11 = r11 + r20
            long r11 = r11 + r14
            int r3 = r4 * 2
            long r13 = (long) r3
            long r11 = r11 + r13
            r0.m685(r4)
            r0.m685(r2)
            r2 = r6
        L99:
            if (r2 >= r10) goto Lbd
            java.lang.Object r3 = r5.get(r2)
            xhss.ᛳᛶᲈᲈ r3 = (xhss.C0289) r3
            byte r3 = r3.mo616(r1)
            if (r2 == r6) goto Lb5
            int r4 = r2 + (-1)
            java.lang.Object r4 = r5.get(r4)
            xhss.ᛳᛶᲈᲈ r4 = (xhss.C0289) r4
            byte r4 = r4.mo616(r1)
            if (r3 == r4) goto Lba
        Lb5:
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0.m685(r3)
        Lba:
            int r2 = r2 + 1
            goto L99
        Lbd:
            xhss.ᛴᛲᛴᛶ r4 = new xhss.ᛴᛲᛴᛶ
            r4.<init>()
            r7 = r6
        Lc3:
            if (r7 >= r10) goto L120
            java.lang.Object r2 = r5.get(r7)
            xhss.ᛳᛶᲈᲈ r2 = (xhss.C0289) r2
            byte r2 = r2.mo616(r1)
            int r3 = r7 + 1
            r6 = r3
        Ld2:
            if (r6 >= r10) goto Le4
            java.lang.Object r9 = r5.get(r6)
            xhss.ᛳᛶᲈᲈ r9 = (xhss.C0289) r9
            byte r9 = r9.mo616(r1)
            if (r2 == r9) goto Le1
            goto Le5
        Le1:
            int r6 = r6 + 1
            goto Ld2
        Le4:
            r6 = r10
        Le5:
            if (r3 != r6) goto L106
            int r2 = r1 + 1
            java.lang.Object r3 = r5.get(r7)
            xhss.ᛳᛶᲈᲈ r3 = (xhss.C0289) r3
            int r3 = r3.mo611()
            if (r2 != r3) goto L106
            java.lang.Object r2 = r8.get(r7)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r0.m685(r2)
            r9 = r8
            r2 = r11
            r8 = r6
            goto L11c
        L106:
            long r2 = r4.f1261
            long r2 = r2 / r17
            long r2 = r2 + r11
            int r2 = (int) r2
            int r2 = r2 * (-1)
            r0.m685(r2)
            int r5 = r1 + 1
            r9 = r8
            r2 = r11
            r8 = r6
            r6 = r24
            m1494(r2, r4, r5, r6, r7, r8, r9)
            r5 = r6
        L11c:
            r11 = r2
            r7 = r8
            r8 = r9
            goto Lc3
        L120:
            r0.m706(r4)
            return
        L124:
            r9 = r8
            r16 = -1
            r17 = 4
            int r7 = r3.mo611()
            int r8 = r4.mo611()
            int r7 = java.lang.Math.min(r7, r8)
            r8 = 0
            r11 = r1
        L137:
            if (r11 >= r7) goto L148
            byte r12 = r3.mo616(r11)
            byte r13 = r4.mo616(r11)
            if (r12 != r13) goto L148
            int r8 = r8 + 1
            int r11 = r11 + 1
            goto L137
        L148:
            long r11 = r0.f1261
            long r11 = r11 / r17
            long r11 = r11 + r20
            long r11 = r11 + r14
            long r13 = (long) r8
            long r11 = r11 + r13
            r13 = 1
            long r11 = r11 + r13
            int r4 = -r8
            r0.m685(r4)
            r0.m685(r2)
            int r4 = r1 + r8
        L15d:
            if (r1 >= r4) goto L16b
            byte r2 = r3.mo616(r1)
            r2 = r2 & 255(0xff, float:3.57E-43)
            r0.m685(r2)
            int r1 = r1 + 1
            goto L15d
        L16b:
            int r1 = r6 + 1
            if (r1 != r10) goto L18f
            java.lang.Object r1 = r5.get(r6)
            xhss.ᛳᛶᲈᲈ r1 = (xhss.C0289) r1
            int r1 = r1.mo611()
            if (r4 != r1) goto L189
            java.lang.Object r1 = r9.get(r6)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r0.m685(r1)
            return
        L189:
            java.lang.String r0 = "Check failed."
            xhss.C0532.m950(r0)
            return
        L18f:
            xhss.ᛴᛲᛴᛶ r3 = new xhss.ᛴᛲᛴᛶ
            r3.<init>()
            long r1 = r3.f1261
            long r1 = r1 / r17
            long r1 = r1 + r11
            int r1 = (int) r1
            int r1 = r1 * (-1)
            r0.m685(r1)
            r8 = r9
            r7 = r10
            r1 = r11
            m1494(r1, r3, r4, r5, r6, r7, r8)
            r0.m706(r3)
            return
        L1a9:
            xhss.C0532.m959(r3)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public static int m1495(int r3) {
            r0 = 1
            if (r3 == r0) goto L3f
            r1 = 2
            if (r3 == r1) goto L3e
            r0 = 4
            if (r3 == r0) goto L3d
            r1 = 8
            if (r3 == r1) goto L3b
            r2 = 16
            if (r3 == r2) goto L3a
            r0 = 32
            if (r3 == r0) goto L38
            r0 = 64
            if (r3 == r0) goto L36
            r0 = 128(0x80, float:1.8E-43)
            if (r3 == r0) goto L34
            r0 = 256(0x100, float:3.59E-43)
            if (r3 == r0) goto L33
            r0 = 512(0x200, float:7.17E-43)
            if (r3 != r0) goto L28
            r3 = 9
            return r3
        L28:
            java.lang.String r0 = "type needs to be >= FIRST and <= LAST, type="
            java.lang.String r3 = xhss.AbstractC0390.m774(r0, r3)
            xhss.C0532.m959(r3)
            r3 = 0
            return r3
        L33:
            return r1
        L34:
            r3 = 7
            return r3
        L36:
            r3 = 6
            return r3
        L38:
            r3 = 5
            return r3
        L3a:
            return r0
        L3b:
            r3 = 3
            return r3
        L3d:
            return r1
        L3e:
            return r0
        L3f:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ᛸᛲᛷᛱ, reason: contains not printable characters */
    public static java.lang.String m1496(int r8, int r9, int r10, java.lang.String r11) {
            r0 = r10 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r8 = r1
        L6:
            r0 = r10 & 2
            if (r0 == 0) goto Le
            int r9 = r11.length()
        Le:
            r10 = r10 & 4
            if (r10 == 0) goto L13
            goto L14
        L13:
            r1 = 1
        L14:
            r10 = r8
        L15:
            if (r10 >= r9) goto L7b
            char r0 = r11.charAt(r10)
            r2 = 43
            r3 = 37
            if (r0 == r3) goto L29
            if (r0 != r2) goto L26
            if (r1 == 0) goto L26
            goto L29
        L26:
            int r10 = r10 + 1
            goto L15
        L29:
            xhss.ᛴᛲᛴᛶ r0 = new xhss.ᛴᛲᛴᛶ
            r0.<init>()
            r0.m702(r11, r8, r10)
        L31:
            if (r10 >= r9) goto L76
            int r8 = r11.codePointAt(r10)
            if (r8 != r3) goto L61
            int r4 = r10 + 2
            if (r4 >= r9) goto L61
            int r5 = r10 + 1
            char r5 = r11.charAt(r5)
            int r5 = xhss.AbstractC0577.m1045(r5)
            char r6 = r11.charAt(r4)
            int r6 = xhss.AbstractC0577.m1045(r6)
            r7 = -1
            if (r5 == r7) goto L6d
            if (r6 == r7) goto L6d
            int r10 = r5 << 4
            int r10 = r10 + r6
            r0.m701(r10)
            int r8 = java.lang.Character.charCount(r8)
            int r10 = r8 + r4
            goto L31
        L61:
            if (r8 != r2) goto L6d
            if (r1 == 0) goto L6d
            r8 = 32
            r0.m701(r8)
            int r10 = r10 + 1
            goto L31
        L6d:
            r0.m688(r8)
            int r8 = java.lang.Character.charCount(r8)
            int r10 = r10 + r8
            goto L31
        L76:
            java.lang.String r8 = r0.m692()
            return r8
        L7b:
            java.lang.String r8 = r11.substring(r8, r9)
            return r8
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public static java.lang.reflect.Type m1497(java.lang.reflect.Type r3, java.lang.Class r4, java.lang.Class r5) {
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
            java.lang.reflect.Type r3 = m1497(r4, r3, r5)
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
            java.lang.reflect.Type r3 = m1497(r4, r3, r5)
            return r3
        L56:
            r4 = r3
            goto L38
        L58:
            return r5
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static android.graphics.drawable.Drawable m1498(android.content.Context r1, int r2) {
            xhss.ᛱᲈᲁᛴ r0 = xhss.C0117.m310()
            android.graphics.drawable.Drawable r1 = r0.m318(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public static long m1499(java.lang.String r13, int r14) {
            r0 = 0
            int r1 = m1493(r13, r0, r14, r0)
            java.util.regex.Pattern r2 = xhss.C0595.f2058
            java.util.regex.Matcher r2 = r2.matcher(r13)
            r3 = -1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
        L12:
            r10 = 2
            r11 = 1
            if (r1 >= r14) goto La0
            int r12 = r1 + 1
            int r12 = m1493(r13, r12, r14, r11)
            r2.region(r1, r12)
            if (r5 != r3) goto L47
            java.util.regex.Pattern r1 = xhss.C0595.f2058
            java.util.regex.Matcher r1 = r2.usePattern(r1)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L47
            java.lang.String r1 = r2.group(r11)
            int r5 = java.lang.Integer.parseInt(r1)
            java.lang.String r1 = r2.group(r10)
            int r8 = java.lang.Integer.parseInt(r1)
            r1 = 3
            java.lang.String r1 = r2.group(r1)
            int r9 = java.lang.Integer.parseInt(r1)
            goto L98
        L47:
            if (r6 != r3) goto L5e
            java.util.regex.Pattern r1 = xhss.C0595.f2057
            java.util.regex.Matcher r1 = r2.usePattern(r1)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L5e
            java.lang.String r1 = r2.group(r11)
            int r6 = java.lang.Integer.parseInt(r1)
            goto L98
        L5e:
            if (r7 != r3) goto L82
            java.util.regex.Pattern r1 = xhss.C0595.f2056
            java.util.regex.Matcher r10 = r2.usePattern(r1)
            boolean r10 = r10.matches()
            if (r10 == 0) goto L82
            java.lang.String r7 = r2.group(r11)
            java.util.Locale r10 = java.util.Locale.US
            java.lang.String r7 = r7.toLowerCase(r10)
            java.lang.String r1 = r1.pattern()
            r10 = 6
            int r1 = xhss.AbstractC0120.m350(r1, r7, r0, r0, r10)
            int r7 = r1 / 4
            goto L98
        L82:
            if (r4 != r3) goto L98
            java.util.regex.Pattern r1 = xhss.C0595.f2059
            java.util.regex.Matcher r1 = r2.usePattern(r1)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L98
            java.lang.String r1 = r2.group(r11)
            int r4 = java.lang.Integer.parseInt(r1)
        L98:
            int r12 = r12 + 1
            int r1 = m1493(r13, r12, r14, r0)
            goto L12
        La0:
            r13 = 70
            if (r13 > r4) goto Laa
            r14 = 100
            if (r4 >= r14) goto Laa
            int r4 = r4 + 1900
        Laa:
            if (r4 < 0) goto Lb0
            if (r4 >= r13) goto Lb0
            int r4 = r4 + 2000
        Lb0:
            r13 = 1601(0x641, float:2.243E-42)
            r1 = 0
            java.lang.String r14 = "Failed requirement."
            if (r4 < r13) goto L112
            if (r7 == r3) goto L10e
            if (r11 > r6) goto L10a
            r13 = 32
            if (r6 >= r13) goto L10a
            if (r5 < 0) goto L106
            r13 = 24
            if (r5 >= r13) goto L106
            if (r8 < 0) goto L102
            r13 = 60
            if (r8 >= r13) goto L102
            if (r9 < 0) goto Lfe
            if (r9 >= r13) goto Lfe
            java.util.GregorianCalendar r13 = new java.util.GregorianCalendar
            java.util.TimeZone r14 = xhss.AbstractC0559.f1984
            r13.<init>(r14)
            r13.setLenient(r0)
            r13.set(r11, r4)
            int r7 = r7 - r11
            r13.set(r10, r7)
            r14 = 5
            r13.set(r14, r6)
            r14 = 11
            r13.set(r14, r5)
            r14 = 12
            r13.set(r14, r8)
            r14 = 13
            r13.set(r14, r9)
            r14 = 14
            r13.set(r14, r0)
            long r13 = r13.getTimeInMillis()
            return r13
        Lfe:
            xhss.C0532.m959(r14)
            return r1
        L102:
            xhss.C0532.m959(r14)
            return r1
        L106:
            xhss.C0532.m959(r14)
            return r1
        L10a:
            xhss.C0532.m959(r14)
            return r1
        L10e:
            xhss.C0532.m959(r14)
            return r1
        L112:
            xhss.C0532.m959(r14)
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public static boolean m1500(java.lang.String r1) {
            java.lang.String r0 = "Connection"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L42
            java.lang.String r0 = "Keep-Alive"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L42
            java.lang.String r0 = "Proxy-Authenticate"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L42
            java.lang.String r0 = "Proxy-Authorization"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L42
            java.lang.String r0 = "TE"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L42
            java.lang.String r0 = "Trailers"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L42
            java.lang.String r0 = "Transfer-Encoding"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L42
            java.lang.String r0 = "Upgrade"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L42
            r1 = 1
            return r1
        L42:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public static java.lang.Class m1501(java.lang.reflect.Type r4) {
            boolean r0 = r4 instanceof java.lang.Class
            if (r0 == 0) goto L7
            java.lang.Class r4 = (java.lang.Class) r4
            return r4
        L7:
            boolean r0 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L14
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type r4 = r4.getRawType()
            java.lang.Class r4 = (java.lang.Class) r4
            return r4
        L14:
            boolean r0 = r4 instanceof java.lang.reflect.GenericArrayType
            r1 = 0
            if (r0 == 0) goto L2c
            java.lang.reflect.GenericArrayType r4 = (java.lang.reflect.GenericArrayType) r4
            java.lang.reflect.Type r4 = r4.getGenericComponentType()
            java.lang.Class r4 = m1501(r4)
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r1)
            java.lang.Class r4 = r4.getClass()
            return r4
        L2c:
            boolean r0 = r4 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L33
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            return r4
        L33:
            boolean r0 = r4 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L44
            java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
            java.lang.reflect.Type[] r4 = r4.getUpperBounds()
            r4 = r4[r1]
            java.lang.Class r4 = m1501(r4)
            return r4
        L44:
            if (r4 != 0) goto L49
            java.lang.String r0 = "null"
            goto L51
        L49:
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
        L51:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected a Class, ParameterizedType, or GenericArrayType, but <"
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r4 = "> is of type "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
    }

    /* JADX INFO: renamed from: ᲀᛷᲁᲀ, reason: contains not printable characters */
    public static void m1502(java.lang.CharSequence r1) {
            xhss.ᛵᛴᲀᛸ r0 = new xhss.ᛵᛴᲀᛸ
            r0.<init>()
            r0.f1696 = r1
            r1 = 0
            r0.f1693 = r1
            m1505(r0)
            return
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static xhss.EnumC0613 m1503(java.lang.String r2) {
            int r0 = r2.hashCode()
            r1 = 79201641(0x4b88569, float:4.338071E-36)
            if (r0 == r1) goto L3e
            r1 = 79923350(0x4c38896, float:4.5969714E-36)
            if (r0 == r1) goto L33
            switch(r0) {
                case -503070503: goto L28;
                case -503070502: goto L1d;
                case -503070501: goto L12;
                default: goto L11;
            }
        L11:
            goto L49
        L12:
            java.lang.String r0 = "TLSv1.3"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L49
            xhss.ᛶᲈᛴ r2 = xhss.EnumC0613.f2102
            return r2
        L1d:
            java.lang.String r0 = "TLSv1.2"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L49
            xhss.ᛶᲈᛴ r2 = xhss.EnumC0613.f2106
            return r2
        L28:
            java.lang.String r0 = "TLSv1.1"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L49
            xhss.ᛶᲈᛴ r2 = xhss.EnumC0613.f2103
            return r2
        L33:
            java.lang.String r0 = "TLSv1"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L49
            xhss.ᛶᲈᛴ r2 = xhss.EnumC0613.f2107
            return r2
        L3e:
            java.lang.String r0 = "SSLv3"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L49
            xhss.ᛶᲈᛴ r2 = xhss.EnumC0613.f2105
            return r2
        L49:
            java.lang.String r0 = "Unexpected TLS version: "
            java.lang.String r2 = r0.concat(r2)
            xhss.C0532.m959(r2)
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ᲁᛲᛴᛴ, reason: contains not printable characters */
    public static xhss.C1037 m1504(java.lang.Class r4) {
            xhss.ᲇᛵᛲᲁ r0 = new xhss.ᲇᛵᛲᲁ
            xhss.ᛸᛵᲇᲈ r1 = new xhss.ᛸᛵᲇᲈ
            r2 = 1
            r3 = 0
            r1.<init>(r2, r4, r3)
            r4 = 12
            r0.<init>(r4, r1)
            return r0
    }

    /* JADX INFO: renamed from: ᲁᛴᲇᛲ, reason: contains not printable characters */
    public static void m1505(xhss.C0469 r10) {
            android.app.Application r0 = xhss.C0915.f2949
            java.lang.String r1 = "Toaster has not been initialized"
            if (r0 == 0) goto Lfe
            java.lang.CharSequence r0 = r10.f1696
            if (r0 == 0) goto Lfd
            int r0 = r0.length()
            if (r0 != 0) goto L12
            goto Lfd
        L12:
            xhss.ᲀᛸᛵ r0 = r10.f1697
            if (r0 != 0) goto L1a
            xhss.ᲀᛸᛵ r0 = xhss.C0915.f2954
            r10.f1697 = r0
        L1a:
            xhss.ᛳᛴᲀᲁ r0 = r10.f1695
            r2 = 0
            if (r0 != 0) goto L2c
            xhss.ᛳᛴᲀᲁ r0 = xhss.C0915.f2955
            if (r0 != 0) goto L2a
            xhss.ᛳᛴᲀᲁ r0 = new xhss.ᛳᛴᲀᲁ
            r0.<init>(r2)
            xhss.C0915.f2955 = r0
        L2a:
            r10.f1695 = r0
        L2c:
            xhss.ᛳᛴᲀᲁ r0 = r10.f1694
            if (r0 != 0) goto L34
            xhss.ᛳᛴᲀᲁ r0 = xhss.C0915.f2950
            r10.f1694 = r0
        L34:
            java.lang.CharSequence r0 = r10.f1696
            java.lang.Boolean r3 = xhss.C0915.f2953
            r4 = 1
            if (r3 != 0) goto L57
            android.app.Application r3 = xhss.C0915.f2949
            if (r3 == 0) goto L53
            android.content.pm.ApplicationInfo r1 = r3.getApplicationInfo()
            int r1 = r1.flags
            r1 = r1 & 2
            if (r1 == 0) goto L4b
            r1 = r4
            goto L4c
        L4b:
            r1 = r2
        L4c:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            xhss.C0915.f2953 = r3
            goto L57
        L53:
            xhss.C0532.m950(r1)
            return
        L57:
            boolean r1 = r3.booleanValue()
            if (r1 != 0) goto L5f
            goto Ld4
        L5f:
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>()
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()
            int r3 = r1.length
            r5 = r2
        L6a:
            if (r5 >= r3) goto Ld4
            r6 = r1[r5]
            int r7 = r6.getLineNumber()
            if (r7 > 0) goto L75
            goto Ld1
        L75:
            java.lang.String r8 = r6.getClassName()
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.ClassNotFoundException -> Lcd
            java.lang.Class<xhss.ᛳᛴᲀᲁ> r9 = xhss.C0263.class
            boolean r9 = r9.isAssignableFrom(r8)     // Catch: java.lang.ClassNotFoundException -> Lcd
            if (r9 != 0) goto Ld1
            java.lang.Class<xhss.ᲀᲈᛵᛸ> r9 = xhss.C0915.class
            boolean r9 = r9.equals(r8)     // Catch: java.lang.ClassNotFoundException -> Lcd
            if (r9 != 0) goto Ld1
            boolean r9 = r8.isInterface()     // Catch: java.lang.ClassNotFoundException -> Lcd
            if (r9 != 0) goto Ld1
            int r8 = r8.getModifiers()     // Catch: java.lang.ClassNotFoundException -> Lcd
            boolean r8 = java.lang.reflect.Modifier.isAbstract(r8)     // Catch: java.lang.ClassNotFoundException -> Lcd
            if (r8 == 0) goto L9e
            goto Ld1
        L9e:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> Lcd
            r8.<init>()     // Catch: java.lang.ClassNotFoundException -> Lcd
            java.lang.String r9 = "("
            r8.append(r9)     // Catch: java.lang.ClassNotFoundException -> Lcd
            java.lang.String r6 = r6.getFileName()     // Catch: java.lang.ClassNotFoundException -> Lcd
            r8.append(r6)     // Catch: java.lang.ClassNotFoundException -> Lcd
            java.lang.String r6 = ":"
            r8.append(r6)     // Catch: java.lang.ClassNotFoundException -> Lcd
            r8.append(r7)     // Catch: java.lang.ClassNotFoundException -> Lcd
            java.lang.String r6 = ") "
            r8.append(r6)     // Catch: java.lang.ClassNotFoundException -> Lcd
            java.lang.String r6 = r0.toString()     // Catch: java.lang.ClassNotFoundException -> Lcd
            r8.append(r6)     // Catch: java.lang.ClassNotFoundException -> Lcd
            java.lang.String r6 = r8.toString()     // Catch: java.lang.ClassNotFoundException -> Lcd
            java.lang.String r7 = "Toaster"
            android.util.Log.i(r7, r6)     // Catch: java.lang.ClassNotFoundException -> Lcd
            goto Ld4
        Lcd:
            r6 = move-exception
            r6.printStackTrace()
        Ld1:
            int r5 = r5 + 1
            goto L6a
        Ld4:
            int r0 = r10.f1693
            r1 = -1
            if (r0 != r1) goto Lec
            xhss.ᲀᛸᛵ r0 = r10.f1697
            java.lang.CharSequence r1 = r10.f1696
            r0.getClass()
            int r0 = r1.length()
            r1 = 20
            if (r0 <= r1) goto Le9
            goto Lea
        Le9:
            r4 = r2
        Lea:
            r10.f1693 = r4
        Lec:
            xhss.ᲀᛸᛵ r0 = r10.f1697
            r0.getClass()
            android.os.Handler r1 = xhss.C0884.f2841
            xhss.ᛱᛴᛲᛵ r3 = new xhss.ᛱᛴᛲᛵ
            r3.<init>(r0, r10, r2)
            r4 = 100
            r1.postDelayed(r3, r4)
        Lfd:
            return
        Lfe:
            xhss.C0532.m950(r1)
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static void m1506(java.lang.reflect.Type r1) {
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto L12
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r1 = r1.isPrimitive()
            if (r1 != 0) goto Ld
            goto L12
        Ld:
            java.lang.String r1 = "Primitive type is not allowed"
            xhss.C0532.m959(r1)
        L12:
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static boolean m1507(java.lang.reflect.Type r4, java.lang.reflect.Type r5) {
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
            boolean r4 = m1507(r4, r5)
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

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public static final boolean m1508(java.lang.String r2, int r3, int r4) {
            int r0 = r3 + 2
            if (r0 >= r4) goto L24
            char r4 = r2.charAt(r3)
            r1 = 37
            if (r4 != r1) goto L24
            r4 = 1
            int r3 = r3 + r4
            char r3 = r2.charAt(r3)
            int r3 = xhss.AbstractC0577.m1045(r3)
            r1 = -1
            if (r3 == r1) goto L24
            char r2 = r2.charAt(r0)
            int r2 = xhss.AbstractC0577.m1045(r2)
            if (r2 == r1) goto L24
            return r4
        L24:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ᲈᛲᛵᲁ, reason: contains not printable characters */
    public static xhss.C1037 m1509(java.lang.Object r5) {
            boolean r0 = r5 instanceof xhss.C0078
            r1 = 12
            r2 = 1
            if (r0 == 0) goto L1b
            xhss.ᲇᛵᛲᲁ r0 = new xhss.ᲇᛵᛲᲁ
            r3 = r5
            xhss.ᛱᛸᛷᛸ r3 = (xhss.C0078) r3
            xhss.ᛲᛵᲀᲈ r3 = (xhss.InterfaceC0162) r3
            java.lang.Class r3 = r3.mo236()
            xhss.ᛸᛵᲇᲈ r4 = new xhss.ᛸᛵᲇᲈ
            r4.<init>(r2, r3, r5)
            r0.<init>(r1, r4)
            return r0
        L1b:
            boolean r0 = r5 instanceof java.lang.Class
            if (r0 == 0) goto L2d
            xhss.ᲇᛵᛲᲁ r0 = new xhss.ᲇᛵᛲᲁ
            r3 = r5
            java.lang.Class r3 = (java.lang.Class) r3
            xhss.ᛸᛵᲇᲈ r4 = new xhss.ᛸᛵᲇᲈ
            r4.<init>(r2, r3, r5)
            r0.<init>(r1, r4)
            return r0
        L2d:
            xhss.ᲇᛵᛲᲁ r0 = new xhss.ᲇᛵᛲᲁ
            java.lang.Class r3 = r5.getClass()
            xhss.ᛸᛵᲇᲈ r4 = new xhss.ᛸᛵᲇᲈ
            r4.<init>(r2, r3, r5)
            r0.<init>(r1, r4)
            return r0
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public static java.lang.reflect.Type m1510(java.lang.reflect.Type r1, java.lang.Class r2, java.lang.Class r3) {
            boolean r0 = r1 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto Ld
            java.lang.reflect.WildcardType r1 = (java.lang.reflect.WildcardType) r1
            java.lang.reflect.Type[] r1 = r1.getUpperBounds()
            r0 = 0
            r1 = r1[r0]
        Ld:
            boolean r0 = r3.isAssignableFrom(r2)
            if (r0 == 0) goto L21
            java.lang.reflect.Type r3 = m1497(r1, r2, r3)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.reflect.Type r1 = m1488(r1, r2, r3, r0)
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
}
