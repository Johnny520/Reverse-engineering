package defpackage;

/* JADX INFO: renamed from: ᛲᛵᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0292 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static boolean f1588;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final int[] f1589 = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final defpackage.C0454 f1590 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C0454 f1591 = null;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final int[] f1592 = null;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static java.lang.ClassLoader f1593;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f1594;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f1595;

    static {
            ᛳᛴᛵᛱ r0 = new ᛳᛴᛵᛱ
            java.lang.String r1 = "REMOVED_TASK"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.C0292.f1591 = r0
            ᛳᛴᛵᛱ r0 = new ᛳᛴᛵᛱ
            java.lang.String r1 = "CLOSED_EMPTY"
            r0.<init>(r1, r2)
            defpackage.C0292.f1590 = r0
            r0 = 1711538375(0x660400c7, float:1.5584168E23)
            int[] r0 = new int[]{r0}
            defpackage.C0292.f1589 = r0
            r0 = 1711538377(0x660400c9, float:1.5584171E23)
            int[] r0 = new int[]{r0}
            defpackage.C0292.f1592 = r0
            return
    }

    public /* synthetic */ C0292(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f1594 = r1
            r0.f1595 = r2
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static void m938(android.content.Context r8, java.lang.String r9) {
            java.lang.String r0 = "locales"
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = "Storing App Locales : Failed to persist app-locales: "
            java.lang.String r3 = "Storing App Locales : app-locales: "
            java.lang.String r4 = ""
            boolean r4 = r9.equals(r4)
            java.lang.String r5 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            if (r4 == 0) goto L16
            r8.deleteFile(r5)
            return
        L16:
            r4 = 0
            java.io.FileOutputStream r8 = r8.openFileOutput(r5, r4)     // Catch: java.io.FileNotFoundException -> L68
            org.xmlpull.v1.XmlSerializer r4 = android.util.Xml.newSerializer()
            r5 = 0
            r4.setOutput(r8, r5)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            java.lang.String r6 = "UTF-8"
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            r4.startDocument(r6, r7)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            r4.startTag(r5, r0)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            java.lang.String r6 = "application_locales"
            r4.attribute(r5, r6, r9)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            r4.endTag(r5, r0)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            r4.endDocument()     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            r0.append(r9)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            java.lang.String r3 = " persisted successfully."
            r0.append(r3)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            android.util.Log.d(r1, r0)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            if (r8 == 0) goto L61
            r8.close()     // Catch: java.io.IOException -> L61
            return
        L52:
            r9 = move-exception
            goto L62
        L54:
            r0 = move-exception
            java.lang.String r9 = r2.concat(r9)     // Catch: java.lang.Throwable -> L52
            android.util.Log.w(r1, r9, r0)     // Catch: java.lang.Throwable -> L52
            if (r8 == 0) goto L61
            r8.close()     // Catch: java.io.IOException -> L61
        L61:
            return
        L62:
            if (r8 == 0) goto L67
            r8.close()     // Catch: java.io.IOException -> L67
        L67:
            throw r9
        L68:
            java.lang.String r8 = "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing "
            android.util.Log.w(r1, r8)
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static java.util.List m939(android.content.res.Resources r8, int r9) {
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

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public static final java.lang.Class m940(java.lang.reflect.Type r3) {
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L7
            java.lang.Class r3 = (java.lang.Class) r3
            return r3
        L7:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L16
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type r3 = r3.getRawType()
            java.lang.Class r3 = m940(r3)
            return r3
        L16:
            ᛷᲈᛲᛴ r0 = new ᛷᲈᛲᛴ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot cast type "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = " to java.lang.Class object."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static int m941(defpackage.C1000 r0, defpackage.AbstractC2126 r1, android.view.View r2, android.view.View r3, defpackage.AbstractC1270 r4, boolean r5) {
            int r4 = r4.m2393()
            if (r4 == 0) goto L35
            int r0 = r0.m1957()
            if (r0 == 0) goto L35
            if (r2 == 0) goto L35
            if (r3 != 0) goto L11
            goto L35
        L11:
            if (r5 != 0) goto L23
            int r0 = defpackage.AbstractC1270.m2371(r2)
            int r1 = defpackage.AbstractC1270.m2371(r3)
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            int r0 = r0 + 1
            return r0
        L23:
            int r0 = r1.mo1937(r3)
            int r2 = r1.mo1943(r2)
            int r0 = r0 - r2
            int r1 = r1.mo1939()
            int r0 = java.lang.Math.min(r1, r0)
            return r0
        L35:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public static java.lang.String m942(android.content.Context r9) {
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = ""
            java.io.FileInputStream r3 = r9.openFileInput(r0)     // Catch: java.io.FileNotFoundException -> L6b
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            java.lang.String r5 = "UTF-8"
            r4.setInput(r3, r5)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            int r5 = r4.getDepth()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
        L17:
            int r6 = r4.next()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            r7 = 1
            if (r6 == r7) goto L43
            r7 = 3
            if (r6 != r7) goto L2a
            int r8 = r4.getDepth()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            if (r8 <= r5) goto L43
            goto L2a
        L28:
            r9 = move-exception
            goto L65
        L2a:
            if (r6 == r7) goto L17
            r7 = 4
            if (r6 != r7) goto L30
            goto L17
        L30:
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            java.lang.String r7 = "locales"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            if (r6 == 0) goto L17
            java.lang.String r5 = "application_locales"
            r6 = 0
            java.lang.String r2 = r4.getAttributeValue(r6, r5)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
        L43:
            if (r3 == 0) goto L51
        L45:
            r3.close()     // Catch: java.io.IOException -> L51
            goto L51
        L49:
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r4)     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L51
            goto L45
        L51:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L61
            java.lang.String r9 = "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: "
            java.lang.String r9 = r9.concat(r2)
            android.util.Log.d(r1, r9)
            goto L64
        L61:
            r9.deleteFile(r0)
        L64:
            return r2
        L65:
            if (r3 == 0) goto L6a
            r3.close()     // Catch: java.io.IOException -> L6a
        L6a:
            throw r9
        L6b:
            java.lang.String r9 = "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r9)
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static void m943(android.content.Context r0, int[] r1, java.lang.String r2) {
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
            r1 = 0
            boolean r1 = r0.hasValue(r1)
            r0.recycle()
            if (r1 == 0) goto Lf
            return
        Lf:
            java.lang.String r0 = "The style on this component requires your app theme to be "
            java.lang.String r1 = " (or a descendant)."
            java.lang.String r0 = defpackage.AbstractC0225.m817(r0, r2, r1)
            defpackage.C2264.m3684(r0)
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static void m944(java.lang.Object r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return
        L3:
            defpackage.C2264.m3673(r1)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m945(java.lang.String r0, boolean r1) {
            if (r1 == 0) goto L3
            return
        L3:
            defpackage.C2264.m3684(r0)
            return
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static defpackage.InterfaceC1436 m946(android.content.res.XmlResourceParser r25, android.content.res.Resources r26) {
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
            int[] r6 = defpackage.AbstractC2005.f8661
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
            java.util.List r11 = m939(r0, r11)
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
            int[] r10 = defpackage.AbstractC2005.f8658
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
            m947(r5)     // Catch: java.lang.Throwable -> La2
            goto L98
        La2:
            r0 = move-exception
            r17 = r7
            goto Lca
        La6:
            r3 = r7
            ᲇᛱᛸᛱ r7 = new ᲇᛱᛸᛱ     // Catch: java.lang.Throwable -> Lbc
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
            m947(r5)
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
            ᲁᛳᛱᛱ r0 = new ᲁᛳᛱᛱ
            r0.<init>(r4, r6, r1, r2)
            return r0
        Le5:
            if (r14 == 0) goto L105
            ᲇᛱᛸᛱ r7 = new ᲇᛱᛸᛱ
            r12 = 0
            r13 = 0
            r10 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r4.add(r7)
            if (r15 == 0) goto Lff
            ᲇᛱᛸᛱ r7 = new ᲇᛱᛸᛱ
            r12 = 0
            r13 = 0
            r10 = r15
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r4.add(r7)
        Lff:
            ᲁᛳᛱᛱ r0 = new ᲁᛳᛱᛱ
            r0.<init>(r4, r6, r1, r2)
            return r0
        L105:
            java.lang.String r0 = "The provider font XML requires query attribute or fallback children."
            defpackage.C2264.m3684(r0)
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
            int[] r6 = defpackage.AbstractC2005.f8659
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
            m947(r5)
            goto L18c
        L196:
            ᲈᲇᛷᲈ r18 = new ᲈᲇᛷᲈ
            r18.<init>(r19, r20, r21, r22, r23)
            r2 = r18
            r1.add(r2)
            goto L111
        L1a2:
            r8 = 1
            r9 = 5
            m947(r5)
            goto L111
        L1a9:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L1b0
            return r16
        L1b0:
            ᛸᛵᲀ r0 = new ᛸᛵᲀ
            r6 = 0
            ᲈᲇᛷᲈ[] r2 = new defpackage.C2353[r6]
            java.lang.Object[] r1 = r1.toArray(r2)
            ᲈᲇᛷᲈ[] r1 = (defpackage.C2353[]) r1
            r0.<init>(r1)
            return r0
        L1bf:
            r16 = r1
            m947(r5)
            return r16
        L1c5:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public static void m947(org.xmlpull.v1.XmlPullParser r3) {
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

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static void m948(java.lang.Object r1) {
            java.lang.String r0 = "Argument must not be null"
            m944(r1, r0)
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static int m949(defpackage.C1000 r3, defpackage.AbstractC2126 r4, android.view.View r5, android.view.View r6, defpackage.AbstractC1270 r7, boolean r8, boolean r9) {
            int r7 = r7.m2393()
            r0 = 0
            if (r7 == 0) goto L70
            int r7 = r3.m1957()
            if (r7 == 0) goto L70
            if (r5 == 0) goto L70
            if (r6 != 0) goto L12
            goto L70
        L12:
            int r7 = defpackage.AbstractC1270.m2371(r5)
            int r1 = defpackage.AbstractC1270.m2371(r6)
            int r7 = java.lang.Math.min(r7, r1)
            int r1 = defpackage.AbstractC1270.m2371(r5)
            int r2 = defpackage.AbstractC1270.m2371(r6)
            int r1 = java.lang.Math.max(r1, r2)
            if (r9 == 0) goto L38
            int r3 = r3.m1957()
            int r3 = r3 - r1
            int r3 = r3 + (-1)
            int r3 = java.lang.Math.max(r0, r3)
            goto L3c
        L38:
            int r3 = java.lang.Math.max(r0, r7)
        L3c:
            if (r8 != 0) goto L3f
            return r3
        L3f:
            int r7 = r4.mo1937(r6)
            int r8 = r4.mo1943(r5)
            int r7 = r7 - r8
            int r7 = java.lang.Math.abs(r7)
            int r8 = defpackage.AbstractC1270.m2371(r5)
            int r6 = defpackage.AbstractC1270.m2371(r6)
            int r8 = r8 - r6
            int r6 = java.lang.Math.abs(r8)
            int r6 = r6 + 1
            float r7 = (float) r7
            float r6 = (float) r6
            float r7 = r7 / r6
            float r3 = (float) r3
            float r3 = r3 * r7
            int r6 = r4.mo1936()
            int r4 = r4.mo1943(r5)
            int r6 = r6 - r4
            float r4 = (float) r6
            float r3 = r3 + r4
            int r3 = java.lang.Math.round(r3)
            return r3
        L70:
            return r0
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static int m950(defpackage.C1000 r0, defpackage.AbstractC2126 r1, android.view.View r2, android.view.View r3, defpackage.AbstractC1270 r4, boolean r5) {
            int r4 = r4.m2393()
            if (r4 == 0) goto L3b
            int r4 = r0.m1957()
            if (r4 == 0) goto L3b
            if (r2 == 0) goto L3b
            if (r3 != 0) goto L11
            goto L3b
        L11:
            if (r5 != 0) goto L18
            int r0 = r0.m1957()
            return r0
        L18:
            int r4 = r1.mo1937(r3)
            int r1 = r1.mo1943(r2)
            int r4 = r4 - r1
            int r1 = defpackage.AbstractC1270.m2371(r2)
            int r2 = defpackage.AbstractC1270.m2371(r3)
            int r1 = r1 - r2
            int r1 = java.lang.Math.abs(r1)
            int r1 = r1 + 1
            float r2 = (float) r4
            float r1 = (float) r1
            float r2 = r2 / r1
            int r0 = r0.m1957()
            float r0 = (float) r0
            float r2 = r2 * r0
            int r0 = (int) r2
            return r0
        L3b:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final void m951(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.f1594
            r1 = 1711341585(0x66010011, float:1.5229663E23)
            java.lang.Object r2 = r8.f1595
            r3 = 1
            r4 = 2
            switch(r0) {
                case 0: goto Lbb;
                case 1: goto L68;
                default: goto Lc;
            }
        Lc:
            ᛳᛸᛳᛸ r9 = (defpackage.C0525) r9
            ᛱᛳᲀᛷ r2 = (defpackage.C0060) r2
            ᛳᛸᛳᛸ r9 = r2.f701
            android.app.Activity r9 = r9.m271()
            if (r9 != 0) goto L1e
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r9 = r2.f702
            android.content.Context r9 = r9.getContext()
        L1e:
            if (r9 != 0) goto L21
            goto L67
        L21:
            android.view.animation.Animation r9 = android.view.animation.AnimationUtils.loadAnimation(r9, r1)
            long r0 = r2.m478(r9)
            r9.setDuration(r0)
            android.view.animation.AccelerateInterpolator r5 = new android.view.animation.AccelerateInterpolator
            r5.<init>()
            r9.setInterpolator(r5)
            com.kongzue.dialogx.util.views.MaxRelativeLayout r5 = r2.f699
            r5.startAnimation(r9)
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r9 = r2.f702
            android.view.ViewPropertyAnimator r9 = r9.animate()
            r2 = 0
            android.view.ViewPropertyAnimator r9 = r9.alpha(r2)
            android.view.animation.AccelerateInterpolator r2 = new android.view.animation.AccelerateInterpolator
            r2.<init>()
            android.view.ViewPropertyAnimator r9 = r9.setInterpolator(r2)
            r9.setDuration(r0)
            float[] r9 = new float[r4]
            r9 = {x010a: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r9 = android.animation.ValueAnimator.ofFloat(r9)
            r9.setDuration(r0)
            ᲇᛵᛶᲀ r0 = new ᲇᛵᛶᲀ
            r0.<init>(r8, r3)
            r9.addUpdateListener(r0)
            r9.start()
        L67:
            return
        L68:
            ᛱᲁᲀᲁ r9 = (defpackage.C0185) r9
            ᛷᛷᛸᛱ r2 = (defpackage.C1315) r2
            java.lang.Object r9 = r2.f5821
            ᛱᲁᲀᲁ r9 = (defpackage.C0185) r9
            ᲈᛴᛵᲈ r0 = r9.f375
            r0.getClass()
            ᲈᛴᛵᲈ r0 = r9.f375
            r0.getClass()
            int r0 = r9.f1247
            if (r0 == 0) goto L7f
            r1 = r0
        L7f:
            ᛱᲁᲀᲁ r0 = r9.f1238
            android.content.Context r0 = r0.f378
            if (r0 != 0) goto L89
            android.app.Activity r0 = r9.m271()
        L89:
            android.view.animation.Animation r9 = android.view.animation.AnimationUtils.loadAnimation(r0, r1)
            long r0 = r2.m2442(r9)
            android.view.animation.AccelerateInterpolator r5 = new android.view.animation.AccelerateInterpolator
            r5.<init>()
            r9.setInterpolator(r5)
            r9.setDuration(r0)
            android.view.View r2 = r2.f5822
            com.kongzue.dialogx.util.views.MaxRelativeLayout r2 = (com.kongzue.dialogx.util.views.MaxRelativeLayout) r2
            r2.startAnimation(r9)
            float[] r9 = new float[r4]
            r9 = {x0112: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r9 = android.animation.ValueAnimator.ofFloat(r9)
            r9.setDuration(r0)
            ᛲᛷᛱᲇ r0 = new ᛲᛷᛱᲇ
            r0.<init>(r8, r3)
            r9.addUpdateListener(r0)
            r9.start()
            return
        Lbb:
            ᛶᛵᛳᛸ r9 = (defpackage.C1069) r9
            ᛳᛳᛴᛸ r2 = (defpackage.C0438) r2
            ᛶᛵᛳᛸ r9 = r2.f2151
            long r0 = r9.f383
            r5 = -1
            int r9 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r9 == 0) goto Lca
            goto Lcc
        Lca:
            r0 = 300(0x12c, double:1.48E-321)
        Lcc:
            android.widget.RelativeLayout r9 = r2.f2158
            float r2 = r9.getY()
            int r5 = r9.getHeight()
            float r5 = (float) r5
            float[] r6 = new float[r4]
            r7 = 0
            r6[r7] = r2
            r6[r3] = r5
            java.lang.String r2 = "y"
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r9, r2, r6)
            r9.setDuration(r0)
            r9.start()
            float[] r9 = new float[r4]
            r9 = {x011a: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r9 = android.animation.ValueAnimator.ofFloat(r9)
            r9.setDuration(r0)
            ᛷᛱᲇᲁ r0 = new ᛷᛱᲇᲁ
            r0.<init>(r8, r3)
            r9.addUpdateListener(r0)
            r9.start()
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final void m952(java.lang.Object r12) {
            r11 = this;
            int r0 = r11.f1594
            r1 = 1711341584(0x66010010, float:1.522966E23)
            r2 = 300(0x12c, double:1.48E-321)
            r4 = 0
            java.lang.Object r6 = r11.f1595
            r7 = 2
            r8 = 0
            switch(r0) {
                case 0: goto Lfe;
                case 1: goto L8b;
                default: goto L10;
            }
        L10:
            ᛳᛸᛳᛸ r12 = (defpackage.C0525) r12
            ᛱᛳᲀᛷ r6 = (defpackage.C0060) r6
            ᛳᛸᛳᛸ r12 = r6.f701
            android.app.Activity r0 = r12.m271()
            android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r0, r1)
            if (r0 != 0) goto L2f
            com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = r6.f699
            android.view.animation.Animation r1 = r1.getAnimation()
            if (r1 == 0) goto L2f
            com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = r6.f699
            android.view.animation.Animation r1 = r1.getAnimation()
            goto L30
        L2f:
            r1 = r0
        L30:
            if (r1 == 0) goto L3f
            long r9 = r1.getDuration()
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 != 0) goto L3b
            goto L3f
        L3b:
            long r2 = r1.getDuration()
        L3f:
            long r9 = r12.f372
            int r12 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r12 < 0) goto L46
            r2 = r9
        L46:
            android.view.animation.DecelerateInterpolator r12 = new android.view.animation.DecelerateInterpolator
            r12.<init>()
            r0.setInterpolator(r12)
            r0.setDuration(r2)
            com.kongzue.dialogx.util.views.MaxRelativeLayout r12 = r6.f699
            r12.startAnimation(r0)
            float[] r12 = new float[r7]
            r12 = {x0186: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r12 = android.animation.ValueAnimator.ofFloat(r12)
            r12.setDuration(r2)
            ᲇᛵᛶᲀ r0 = new ᲇᛵᛶᲀ
            r0.<init>(r11, r8)
            r12.addUpdateListener(r0)
            r12.start()
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r11 = r6.f702
            android.view.ViewPropertyAnimator r11 = r11.animate()
            android.view.ViewPropertyAnimator r11 = r11.setDuration(r2)
            r12 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r11 = r11.alpha(r12)
            android.view.animation.DecelerateInterpolator r12 = new android.view.animation.DecelerateInterpolator
            r12.<init>()
            android.view.ViewPropertyAnimator r11 = r11.setInterpolator(r12)
            r12 = 0
            r11.setListener(r12)
            return
        L8b:
            ᛱᲁᲀᲁ r12 = (defpackage.C0185) r12
            ᛷᛷᛸᛱ r6 = (defpackage.C1315) r6
            java.lang.Object r12 = r6.f5821
            ᛱᲁᲀᲁ r12 = (defpackage.C0185) r12
            android.view.View r0 = r6.f5822
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = (com.kongzue.dialogx.util.views.MaxRelativeLayout) r0
            ᲈᛴᛵᲈ r6 = r12.f375
            r6.getClass()
            ᲈᛴᛵᲈ r6 = r12.f375
            r6.getClass()
            int r6 = r12.f1239
            if (r6 == 0) goto La6
            r1 = r6
        La6:
            ᛱᲁᲀᲁ r6 = r12.f1238
            android.content.Context r6 = r6.f378
            if (r6 != 0) goto Lb0
            android.app.Activity r6 = r12.m271()
        Lb0:
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r6, r1)
            if (r1 != 0) goto Lc1
            android.view.animation.Animation r6 = r0.getAnimation()
            if (r6 == 0) goto Lc1
            android.view.animation.Animation r6 = r0.getAnimation()
            goto Lc2
        Lc1:
            r6 = r1
        Lc2:
            if (r6 == 0) goto Ld1
            long r9 = r6.getDuration()
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 != 0) goto Lcd
            goto Ld1
        Lcd:
            long r2 = r6.getDuration()
        Ld1:
            long r9 = r12.f372
            int r12 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r12 < 0) goto Ld8
            r2 = r9
        Ld8:
            r1.setDuration(r2)
            android.view.animation.DecelerateInterpolator r12 = new android.view.animation.DecelerateInterpolator
            r12.<init>()
            r1.setInterpolator(r12)
            r0.startAnimation(r1)
            float[] r12 = new float[r7]
            r12 = {x018e: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r12 = android.animation.ValueAnimator.ofFloat(r12)
            r12.setDuration(r2)
            ᛲᛷᛱᲇ r0 = new ᛲᛷᛱᲇ
            r0.<init>(r11, r8)
            r12.addUpdateListener(r0)
            r12.start()
            return
        Lfe:
            ᛶᛵᛳᛸ r12 = (defpackage.C1069) r12
            ᛳᛳᛴᛸ r6 = (defpackage.C0438) r6
            ᛶᛵᛳᛸ r0 = r6.f2151
            long r9 = r0.f372
            int r1 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r1 < 0) goto L10b
            r2 = r9
        L10b:
            android.widget.RelativeLayout r1 = r6.f2158
            boolean r12 = r12.m2036()
            if (r12 == 0) goto L117
            r0.getClass()
            goto L11d
        L117:
            r0.getClass()
            r1.setPadding(r8, r8, r8, r8)
        L11d:
            android.widget.FrameLayout r12 = r0.m261()
            if (r12 != 0) goto L12f
            android.content.res.Resources r12 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            int r12 = r12.heightPixels
        L12d:
            float r12 = (float) r12
            goto L138
        L12f:
            android.widget.FrameLayout r12 = r0.m261()
            int r12 = r12.getMeasuredHeight()
            goto L12d
        L138:
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r6.f2164
            android.graphics.Rect r0 = r0.getUnsafePlace()
            int r0 = r0.top
            float r0 = (float) r0
            r4 = 0
            float r0 = r0 + r4
            r6.f2152 = r0
            float[] r4 = new float[r7]
            r4[r8] = r12
            r12 = 1
            r4[r12] = r0
            java.lang.String r0 = "y"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r1, r0, r4)
            r0.setDuration(r2)
            r0.setAutoCancel(r12)
            android.view.animation.DecelerateInterpolator r12 = new android.view.animation.DecelerateInterpolator
            r1 = 1073741824(0x40000000, float:2.0)
            r12.<init>(r1)
            r0.setInterpolator(r12)
            r0.start()
            float[] r12 = new float[r7]
            r12 = {x0196: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r12 = android.animation.ValueAnimator.ofFloat(r12)
            r12.setDuration(r2)
            ᛷᛱᲇᲁ r0 = new ᛷᛱᲇᲁ
            r0.<init>(r11, r8)
            r12.addUpdateListener(r0)
            r12.start()
            return
    }
}
