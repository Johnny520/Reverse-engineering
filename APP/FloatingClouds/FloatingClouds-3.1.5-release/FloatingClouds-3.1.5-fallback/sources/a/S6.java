package a;

/* JADX INFO: loaded from: classes.dex */
public final class S6 {

    public static class a {
        public static int a(android.content.res.TypedArray r0, int r1) {
                int r0 = r0.getType(r1)
                return r0
        }
    }

    public interface b {
    }

    public static final class c implements a.S6.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.S6.d[] f259a;

        public c(a.S6.d[] r1) {
                r0 = this;
                r0.<init>()
                r0.f259a = r1
                return
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f260a;
        public final int b;
        public final boolean c;
        public final java.lang.String d;
        public final int e;
        public final int f;

        public d(int r1, int r2, int r3, java.lang.String r4, java.lang.String r5, boolean r6) {
                r0 = this;
                r0.<init>()
                r0.f260a = r4
                r0.b = r1
                r0.c = r6
                r0.d = r5
                r0.e = r2
                r0.f = r3
                return
        }
    }

    public static final class e implements a.S6.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.M6 f261a;
        public final int b;
        public final int c;
        public final java.lang.String d;

        public e(a.M6 r1, int r2, int r3, java.lang.String r4) {
                r0 = this;
                r0.<init>()
                r0.f261a = r1
                r0.c = r2
                r0.b = r3
                r0.d = r4
                return
        }
    }

    public static a.S6.b a(android.content.res.XmlResourceParser r18, android.content.res.Resources r19) {
            r0 = r19
        L2:
            int r1 = r18.next()
            r2 = 1
            r3 = 2
            if (r1 == r3) goto Ld
            if (r1 == r2) goto Ld
            goto L2
        Ld:
            if (r1 != r3) goto L13a
            r1 = 0
            java.lang.String r4 = "font-family"
            r5 = r18
            r5.require(r3, r1, r4)
            java.lang.String r6 = r5.getName()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L136
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r5)
            int[] r6 = androidx.core.R.styleable.FontFamily
            android.content.res.TypedArray r4 = r0.obtainAttributes(r4, r6)
            int r6 = androidx.core.R.styleable.FontFamily_fontProviderAuthority
            java.lang.String r6 = r4.getString(r6)
            int r7 = androidx.core.R.styleable.FontFamily_fontProviderPackage
            java.lang.String r7 = r4.getString(r7)
            int r8 = androidx.core.R.styleable.FontFamily_fontProviderQuery
            java.lang.String r8 = r4.getString(r8)
            int r9 = androidx.core.R.styleable.FontFamily_fontProviderCerts
            r10 = 0
            int r9 = r4.getResourceId(r9, r10)
            int r11 = androidx.core.R.styleable.FontFamily_fontProviderFetchStrategy
            int r11 = r4.getInteger(r11, r2)
            int r12 = androidx.core.R.styleable.FontFamily_fontProviderFetchTimeout
            r13 = 500(0x1f4, float:7.0E-43)
            int r12 = r4.getInteger(r12, r13)
            int r13 = androidx.core.R.styleable.FontFamily_fontProviderSystemFontFamily
            java.lang.String r13 = r4.getString(r13)
            r4.recycle()
            r4 = 3
            if (r6 == 0) goto L7b
            if (r7 == 0) goto L7b
            if (r8 == 0) goto L7b
        L62:
            int r1 = r5.next()
            if (r1 == r4) goto L6c
            c(r5)
            goto L62
        L6c:
            java.util.List r0 = b(r0, r9)
            a.S6$e r1 = new a.S6$e
            a.M6 r2 = new a.M6
            r2.<init>(r6, r7, r8, r0)
            r1.<init>(r2, r11, r12, r13)
            return r1
        L7b:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L80:
            int r7 = r5.next()
            if (r7 == r4) goto L121
            int r7 = r5.getEventType()
            if (r7 == r3) goto L8d
            goto L80
        L8d:
            java.lang.String r7 = r5.getName()
            java.lang.String r8 = "font"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L11c
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r5)
            int[] r8 = androidx.core.R.styleable.FontFamilyFont
            android.content.res.TypedArray r7 = r0.obtainAttributes(r7, r8)
            int r8 = androidx.core.R.styleable.FontFamilyFont_fontWeight
            boolean r8 = r7.hasValue(r8)
            if (r8 == 0) goto Lae
            int r8 = androidx.core.R.styleable.FontFamilyFont_fontWeight
            goto Lb0
        Lae:
            int r8 = androidx.core.R.styleable.FontFamilyFont_android_fontWeight
        Lb0:
            r9 = 400(0x190, float:5.6E-43)
            int r12 = r7.getInt(r8, r9)
            int r8 = androidx.core.R.styleable.FontFamilyFont_fontStyle
            boolean r8 = r7.hasValue(r8)
            if (r8 == 0) goto Lc1
            int r8 = androidx.core.R.styleable.FontFamilyFont_fontStyle
            goto Lc3
        Lc1:
            int r8 = androidx.core.R.styleable.FontFamilyFont_android_fontStyle
        Lc3:
            int r8 = r7.getInt(r8, r10)
            if (r2 != r8) goto Lcc
            r17 = r2
            goto Lce
        Lcc:
            r17 = r10
        Lce:
            int r8 = androidx.core.R.styleable.FontFamilyFont_ttcIndex
            boolean r8 = r7.hasValue(r8)
            if (r8 == 0) goto Ld9
            int r8 = androidx.core.R.styleable.FontFamilyFont_ttcIndex
            goto Ldb
        Ld9:
            int r8 = androidx.core.R.styleable.FontFamilyFont_android_ttcIndex
        Ldb:
            int r9 = androidx.core.R.styleable.FontFamilyFont_fontVariationSettings
            boolean r9 = r7.hasValue(r9)
            if (r9 == 0) goto Le6
            int r9 = androidx.core.R.styleable.FontFamilyFont_fontVariationSettings
            goto Le8
        Le6:
            int r9 = androidx.core.R.styleable.FontFamilyFont_android_fontVariationSettings
        Le8:
            java.lang.String r16 = r7.getString(r9)
            int r13 = r7.getInt(r8, r10)
            int r8 = androidx.core.R.styleable.FontFamilyFont_font
            boolean r8 = r7.hasValue(r8)
            if (r8 == 0) goto Lfb
            int r8 = androidx.core.R.styleable.FontFamilyFont_font
            goto Lfd
        Lfb:
            int r8 = androidx.core.R.styleable.FontFamilyFont_android_font
        Lfd:
            int r14 = r7.getResourceId(r8, r10)
            java.lang.String r15 = r7.getString(r8)
            r7.recycle()
        L108:
            int r7 = r5.next()
            if (r7 == r4) goto L112
            c(r5)
            goto L108
        L112:
            a.S6$d r11 = new a.S6$d
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r6.add(r11)
            goto L80
        L11c:
            c(r5)
            goto L80
        L121:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L128
            return r1
        L128:
            a.S6$c r0 = new a.S6$c
            a.S6$d[] r1 = new a.S6.d[r10]
            java.lang.Object[] r1 = r6.toArray(r1)
            a.S6$d[] r1 = (a.S6.d[]) r1
            r0.<init>(r1)
            return r0
        L136:
            c(r5)
            return r1
        L13a:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)
            throw r0
    }

    public static java.util.List<java.util.List<byte[]>> b(android.content.res.Resources r8, int r9) {
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
            int r3 = a.S6.a.a(r0, r2)     // Catch: java.lang.Throwable -> L15
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

    public static void c(android.content.res.XmlResourceParser r3) {
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
}
