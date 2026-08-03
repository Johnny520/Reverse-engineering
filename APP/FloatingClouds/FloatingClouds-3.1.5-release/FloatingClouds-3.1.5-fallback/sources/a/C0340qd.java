package a;

/* JADX INFO: renamed from: a.qd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0340qd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.ThreadLocal<android.util.TypedValue> f657a = null;
    public static final java.util.WeakHashMap<a.C0340qd.d, android.util.SparseArray<a.C0340qd.c>> b = null;
    public static final java.lang.Object c = null;

    /* JADX INFO: renamed from: a.qd$a */
    public static class a {
        public static android.graphics.drawable.Drawable a(android.content.res.Resources r0, int r1, android.content.res.Resources.Theme r2) {
                android.graphics.drawable.Drawable r0 = r0.getDrawable(r1, r2)
                return r0
        }

        public static android.graphics.drawable.Drawable b(android.content.res.Resources r0, int r1, int r2, android.content.res.Resources.Theme r3) {
                android.graphics.drawable.Drawable r0 = r0.getDrawableForDensity(r1, r2, r3)
                return r0
        }
    }

    /* JADX INFO: renamed from: a.qd$b */
    public static class b {
        public static int a(android.content.res.Resources r0, int r1, android.content.res.Resources.Theme r2) {
                int r0 = r0.getColor(r1, r2)
                return r0
        }

        public static android.content.res.ColorStateList b(android.content.res.Resources r0, int r1, android.content.res.Resources.Theme r2) {
                android.content.res.ColorStateList r0 = r0.getColorStateList(r1, r2)
                return r0
        }
    }

    /* JADX INFO: renamed from: a.qd$c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.content.res.ColorStateList f658a;
        public final android.content.res.Configuration b;
        public final int c;

        public c(android.content.res.ColorStateList r1, android.content.res.Configuration r2, android.content.res.Resources.Theme r3) {
                r0 = this;
                r0.<init>()
                r0.f658a = r1
                r0.b = r2
                if (r3 != 0) goto Lb
                r1 = 0
                goto Lf
            Lb:
                int r1 = r3.hashCode()
            Lf:
                r0.c = r1
                return
        }
    }

    /* JADX INFO: renamed from: a.qd$d */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.content.res.Resources f659a;
        public final android.content.res.Resources.Theme b;

        public d(android.content.res.Resources r1, android.content.res.Resources.Theme r2) {
                r0 = this;
                r0.<init>()
                r0.f659a = r1
                r0.b = r2
                return
        }

        public final boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L27
                java.lang.Class r2 = r5.getClass()
                java.lang.Class<a.qd$d> r3 = a.C0340qd.d.class
                if (r3 == r2) goto L10
                goto L27
            L10:
                a.qd$d r5 = (a.C0340qd.d) r5
                android.content.res.Resources r2 = r4.f659a
                android.content.res.Resources r3 = r5.f659a
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L27
                android.content.res.Resources$Theme r2 = r4.b
                android.content.res.Resources$Theme r5 = r5.b
                boolean r5 = java.util.Objects.equals(r2, r5)
                if (r5 == 0) goto L27
                return r0
            L27:
                return r1
        }

        public final int hashCode() {
                r2 = this;
                android.content.res.Resources r0 = r2.f659a
                android.content.res.Resources$Theme r1 = r2.b
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
                int r0 = java.util.Objects.hash(r0)
                return r0
        }
    }

    /* JADX INFO: renamed from: a.qd$e */
    public static abstract class e {
        public final void a(int r4) {
                r3 = this;
                android.os.Handler r0 = new android.os.Handler
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                r0.<init>(r1)
                a.rd r1 = new a.rd
                r2 = 0
                r1.<init>(r3, r4, r2)
                r0.post(r1)
                return
        }

        public abstract void b(int r1);

        public abstract void c(android.graphics.Typeface r1);
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            a.C0340qd.f657a = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r1 = 0
            r0.<init>(r1)
            a.C0340qd.b = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            a.C0340qd.c = r0
            return
    }

    public static android.graphics.Typeface a(android.content.Context r7, int r8) {
            boolean r0 = r7.isRestricted()
            if (r0 == 0) goto L8
            r7 = 0
            return r7
        L8:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r7
            r1 = r8
            android.graphics.Typeface r7 = b(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static android.graphics.Typeface b(android.content.Context r12, int r13, android.util.TypedValue r14, int r15, a.C0340qd.e r16, boolean r17, boolean r18) {
            r7 = r16
            android.content.res.Resources r2 = r12.getResources()
            r0 = 1
            r2.getValue(r13, r14, r0)
            java.lang.String r9 = "ResourcesCompat"
            java.lang.CharSequence r0 = r14.string
            if (r0 == 0) goto Lf3
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "res/"
            boolean r0 = r4.startsWith(r0)
            r10 = 0
            r11 = -3
            if (r0 != 0) goto L25
            if (r7 == 0) goto Lce
            r7.a(r11)
            goto Lce
        L25:
            int r0 = r14.assetCookie
            a.W9<java.lang.String, android.graphics.Typeface> r6 = a.Mf.b
            java.lang.String r0 = a.Mf.b(r2, r13, r4, r0, r15)
            java.lang.Object r0 = r6.a(r0)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L4d
            if (r7 == 0) goto L4a
            android.os.Handler r12 = new android.os.Handler
            android.os.Looper r14 = android.os.Looper.getMainLooper()
            r12.<init>(r14)
            a.P0 r14 = new a.P0
            r15 = 14
            r14.<init>(r7, r15, r0)
            r12.post(r14)
        L4a:
            r10 = r0
            goto Lce
        L4d:
            if (r18 == 0) goto L51
            goto Lce
        L51:
            java.lang.String r0 = r4.toLowerCase()     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            java.lang.String r1 = ".xml"
            boolean r0 = r0.endsWith(r1)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            if (r0 == 0) goto L85
            android.content.res.XmlResourceParser r0 = r2.getXml(r13)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            a.S6$b r1 = a.S6.a(r0, r2)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            if (r1 != 0) goto L79
            java.lang.String r12 = "Failed to find font-family tag"
            android.util.Log.e(r9, r12)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            if (r7 == 0) goto Lce
            r7.a(r11)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            goto Lce
        L73:
            r0 = move-exception
            r12 = r0
            goto Lb6
        L76:
            r0 = move-exception
            r12 = r0
            goto Lc0
        L79:
            int r5 = r14.assetCookie     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            r0 = r12
            r3 = r13
            r6 = r15
            r8 = r17
            android.graphics.Typeface r10 = a.Mf.a(r0, r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            goto Lce
        L85:
            int r14 = r14.assetCookie     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            a.Rf r0 = a.Mf.f178a     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            r1 = r12
            r3 = r13
            r5 = r15
            android.graphics.Typeface r12 = r0.c(r1, r2, r3, r4, r5)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            if (r12 == 0) goto L99
            java.lang.String r14 = a.Mf.b(r2, r13, r4, r14, r15)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            r6.b(r14, r12)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
        L99:
            if (r7 == 0) goto Lb0
            if (r12 == 0) goto Lb2
            android.os.Handler r14 = new android.os.Handler     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            android.os.Looper r15 = android.os.Looper.getMainLooper()     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            r14.<init>(r15)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            a.P0 r15 = new a.P0     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            r0 = 14
            r15.<init>(r7, r0, r12)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            r14.post(r15)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
        Lb0:
            r10 = r12
            goto Lce
        Lb2:
            r7.a(r11)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            goto Lb0
        Lb6:
            java.lang.String r14 = "Failed to read xml resource "
            java.lang.String r14 = r14.concat(r4)
            android.util.Log.e(r9, r14, r12)
            goto Lc9
        Lc0:
            java.lang.String r14 = "Failed to parse xml resource "
            java.lang.String r14 = r14.concat(r4)
            android.util.Log.e(r9, r14, r12)
        Lc9:
            if (r7 == 0) goto Lce
            r7.a(r11)
        Lce:
            if (r10 != 0) goto Lf2
            if (r7 != 0) goto Lf2
            if (r18 == 0) goto Ld5
            goto Lf2
        Ld5:
            android.content.res.Resources$NotFoundException r12 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "Font resource ID #0x"
            r14.<init>(r15)
            java.lang.String r13 = java.lang.Integer.toHexString(r13)
            r14.append(r13)
            java.lang.String r13 = " could not be retrieved."
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            r12.<init>(r13)
            throw r12
        Lf2:
            return r10
        Lf3:
            android.content.res.Resources$NotFoundException r12 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "Resource \""
            r15.<init>(r0)
            java.lang.String r0 = r2.getResourceName(r13)
            r15.append(r0)
            java.lang.String r0 = "\" ("
            r15.append(r0)
            java.lang.String r13 = java.lang.Integer.toHexString(r13)
            r15.append(r13)
            java.lang.String r13 = ") is not a Font: "
            r15.append(r13)
            r15.append(r14)
            java.lang.String r13 = r15.toString()
            r12.<init>(r13)
            throw r12
    }
}
