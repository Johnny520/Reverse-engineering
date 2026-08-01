package androidx.core.content.res;

/* JADX INFO: loaded from: classes2.dex */
public class FontResourcesParserCompat {
    private static final int DEFAULT_TIMEOUT_MILLIS = 500;
    public static final int FETCH_STRATEGY_ASYNC = 1;
    public static final int FETCH_STRATEGY_BLOCKING = 0;
    public static final int INFINITE_TIMEOUT_VALUE = -1;
    private static final int ITALIC = 1;
    private static final int NORMAL_WEIGHT = 400;

    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getType(android.content.res.TypedArray r1, int r2) {
                int r0 = r1.getType(r2)
                return r0
        }
    }

    public interface FamilyResourceEntry {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FetchStrategy {
    }

    public static final class FontFamilyFilesResourceEntry implements androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry {
        private final androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry[] mEntries;

        public FontFamilyFilesResourceEntry(androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry[] r1) {
                r0 = this;
                r0.<init>()
                r0.mEntries = r1
                return
        }

        public androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry[] getEntries() {
                r1 = this;
                androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry[] r0 = r1.mEntries
                return r0
        }
    }

    public static final class FontFileResourceEntry {
        private final java.lang.String mFileName;
        private final boolean mItalic;
        private final int mResourceId;
        private final int mTtcIndex;
        private final java.lang.String mVariationSettings;
        private final int mWeight;

        public FontFileResourceEntry(java.lang.String r1, int r2, boolean r3, java.lang.String r4, int r5, int r6) {
                r0 = this;
                r0.<init>()
                r0.mFileName = r1
                r0.mWeight = r2
                r0.mItalic = r3
                r0.mVariationSettings = r4
                r0.mTtcIndex = r5
                r0.mResourceId = r6
                return
        }

        public java.lang.String getFileName() {
                r1 = this;
                java.lang.String r0 = r1.mFileName
                return r0
        }

        public int getResourceId() {
                r1 = this;
                int r0 = r1.mResourceId
                return r0
        }

        public int getTtcIndex() {
                r1 = this;
                int r0 = r1.mTtcIndex
                return r0
        }

        public java.lang.String getVariationSettings() {
                r1 = this;
                java.lang.String r0 = r1.mVariationSettings
                return r0
        }

        public int getWeight() {
                r1 = this;
                int r0 = r1.mWeight
                return r0
        }

        public boolean isItalic() {
                r1 = this;
                boolean r0 = r1.mItalic
                return r0
        }
    }

    public static final class ProviderResourceEntry implements androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry {
        private final androidx.core.provider.FontRequest mRequest;
        private final int mStrategy;
        private final java.lang.String mSystemFontFamilyName;
        private final int mTimeoutMs;

        public ProviderResourceEntry(androidx.core.provider.FontRequest r2, int r3, int r4) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r4, r0)
                return
        }

        public ProviderResourceEntry(androidx.core.provider.FontRequest r1, int r2, int r3, java.lang.String r4) {
                r0 = this;
                r0.<init>()
                r0.mRequest = r1
                r0.mStrategy = r2
                r0.mTimeoutMs = r3
                r0.mSystemFontFamilyName = r4
                return
        }

        public int getFetchStrategy() {
                r1 = this;
                int r0 = r1.mStrategy
                return r0
        }

        public androidx.core.provider.FontRequest getRequest() {
                r1 = this;
                androidx.core.provider.FontRequest r0 = r1.mRequest
                return r0
        }

        public java.lang.String getSystemFontFamilyName() {
                r1 = this;
                java.lang.String r0 = r1.mSystemFontFamilyName
                return r0
        }

        public int getTimeout() {
                r1 = this;
                int r0 = r1.mTimeoutMs
                return r0
        }
    }

    private FontResourcesParserCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int getType(android.content.res.TypedArray r1, int r2) {
            int r0 = androidx.core.content.res.FontResourcesParserCompat.Api21Impl.getType(r1, r2)
            return r0
    }

    public static androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry parse(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        L1:
            int r0 = r3.next()
            r1 = r0
            r2 = 2
            if (r0 == r2) goto Ld
            r0 = 1
            if (r1 == r0) goto Ld
            goto L1
        Ld:
            if (r1 != r2) goto L14
            androidx.core.content.res.FontResourcesParserCompat$FamilyResourceEntry r0 = readFamilies(r3, r4)
            return r0
        L14:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r2 = "No start tag found"
            r0.<init>(r2)
            throw r0
    }

    public static java.util.List<java.util.List<byte[]>> readCerts(android.content.res.Resources r6, int r7) {
            if (r7 != 0) goto L7
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L7:
            android.content.res.TypedArray r0 = r6.obtainTypedArray(r7)
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L52
            if (r1 != 0) goto L19
            java.util.List r1 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L52
            r0.recycle()
            return r1
        L19:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L52
            r1.<init>()     // Catch: java.lang.Throwable -> L52
            r2 = 0
            int r3 = getType(r0, r2)     // Catch: java.lang.Throwable -> L52
            r4 = 1
            if (r3 != r4) goto L42
            r3 = 0
        L27:
            int r4 = r0.length()     // Catch: java.lang.Throwable -> L52
            if (r3 >= r4) goto L41
            int r4 = r0.getResourceId(r3, r2)     // Catch: java.lang.Throwable -> L52
            if (r4 == 0) goto L3e
            java.lang.String[] r5 = r6.getStringArray(r4)     // Catch: java.lang.Throwable -> L52
            java.util.List r5 = toByteArrayList(r5)     // Catch: java.lang.Throwable -> L52
            r1.add(r5)     // Catch: java.lang.Throwable -> L52
        L3e:
            int r3 = r3 + 1
            goto L27
        L41:
            goto L4d
        L42:
            java.lang.String[] r2 = r6.getStringArray(r7)     // Catch: java.lang.Throwable -> L52
            java.util.List r2 = toByteArrayList(r2)     // Catch: java.lang.Throwable -> L52
            r1.add(r2)     // Catch: java.lang.Throwable -> L52
        L4d:
            r0.recycle()
            return r1
        L52:
            r1 = move-exception
            r0.recycle()
            throw r1
    }

    private static androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry readFamilies(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r0 = 2
            r1 = 0
            java.lang.String r2 = "font-family"
            r3.require(r0, r1, r2)
            java.lang.String r0 = r3.getName()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L16
            androidx.core.content.res.FontResourcesParserCompat$FamilyResourceEntry r1 = readFamily(r3, r4)
            return r1
        L16:
            skip(r3)
            return r1
    }

    private static androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry readFamily(org.xmlpull.v1.XmlPullParser r14, android.content.res.Resources r15) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r14)
            int[] r1 = androidx.core.C0112R.styleable.FontFamily
            android.content.res.TypedArray r1 = r15.obtainAttributes(r0, r1)
            int r2 = androidx.core.C0112R.styleable.FontFamily_fontProviderAuthority
            java.lang.String r2 = r1.getString(r2)
            int r3 = androidx.core.C0112R.styleable.FontFamily_fontProviderPackage
            java.lang.String r3 = r1.getString(r3)
            int r4 = androidx.core.C0112R.styleable.FontFamily_fontProviderQuery
            java.lang.String r4 = r1.getString(r4)
            int r5 = androidx.core.C0112R.styleable.FontFamily_fontProviderCerts
            r6 = 0
            int r5 = r1.getResourceId(r5, r6)
            int r7 = androidx.core.C0112R.styleable.FontFamily_fontProviderFetchStrategy
            r8 = 1
            int r7 = r1.getInteger(r7, r8)
            int r8 = androidx.core.C0112R.styleable.FontFamily_fontProviderFetchTimeout
            r9 = 500(0x1f4, float:7.0E-43)
            int r8 = r1.getInteger(r8, r9)
            int r9 = androidx.core.C0112R.styleable.FontFamily_fontProviderSystemFontFamily
            java.lang.String r9 = r1.getString(r9)
            r1.recycle()
            r10 = 3
            if (r2 == 0) goto L5b
            if (r3 == 0) goto L5b
            if (r4 == 0) goto L5b
        L42:
            int r6 = r14.next()
            if (r6 == r10) goto L4c
            skip(r14)
            goto L42
        L4c:
            java.util.List r6 = readCerts(r15, r5)
            androidx.core.content.res.FontResourcesParserCompat$ProviderResourceEntry r10 = new androidx.core.content.res.FontResourcesParserCompat$ProviderResourceEntry
            androidx.core.provider.FontRequest r11 = new androidx.core.provider.FontRequest
            r11.<init>(r2, r3, r4, r6)
            r10.<init>(r11, r7, r8, r9)
            return r10
        L5b:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
        L60:
            int r12 = r14.next()
            if (r12 == r10) goto L86
            int r12 = r14.getEventType()
            r13 = 2
            if (r12 == r13) goto L6e
            goto L60
        L6e:
            java.lang.String r12 = r14.getName()
            java.lang.String r13 = "font"
            boolean r13 = r12.equals(r13)
            if (r13 == 0) goto L82
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry r13 = readFont(r14, r15)
            r11.add(r13)
            goto L85
        L82:
            skip(r14)
        L85:
            goto L60
        L86:
            boolean r10 = r11.isEmpty()
            if (r10 == 0) goto L8e
            r6 = 0
            return r6
        L8e:
            androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry r10 = new androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry[] r6 = new androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry[r6]
            java.lang.Object[] r6 = r11.toArray(r6)
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry[] r6 = (androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry[]) r6
            r10.<init>(r6)
            return r10
    }

    private static androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry readFont(org.xmlpull.v1.XmlPullParser r21, android.content.res.Resources r22) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r21)
            int[] r1 = androidx.core.C0112R.styleable.FontFamilyFont
            r2 = r22
            android.content.res.TypedArray r1 = r2.obtainAttributes(r0, r1)
            int r3 = androidx.core.C0112R.styleable.FontFamilyFont_fontWeight
            boolean r3 = r1.hasValue(r3)
            if (r3 == 0) goto L17
            int r3 = androidx.core.C0112R.styleable.FontFamilyFont_fontWeight
            goto L19
        L17:
            int r3 = androidx.core.C0112R.styleable.FontFamilyFont_android_fontWeight
        L19:
            r4 = 400(0x190, float:5.6E-43)
            int r4 = r1.getInt(r3, r4)
            int r5 = androidx.core.C0112R.styleable.FontFamilyFont_fontStyle
            boolean r5 = r1.hasValue(r5)
            if (r5 == 0) goto L2b
            int r5 = androidx.core.C0112R.styleable.FontFamilyFont_fontStyle
            goto L2d
        L2b:
            int r5 = androidx.core.C0112R.styleable.FontFamilyFont_android_fontStyle
        L2d:
            r12 = r5
            r5 = 0
            int r6 = r1.getInt(r12, r5)
            r7 = 1
            if (r7 != r6) goto L38
            r8 = r7
            goto L39
        L38:
            r8 = r5
        L39:
            int r6 = androidx.core.C0112R.styleable.FontFamilyFont_ttcIndex
            boolean r6 = r1.hasValue(r6)
            if (r6 == 0) goto L44
            int r6 = androidx.core.C0112R.styleable.FontFamilyFont_ttcIndex
            goto L46
        L44:
            int r6 = androidx.core.C0112R.styleable.FontFamilyFont_android_ttcIndex
        L46:
            r13 = r6
            int r6 = androidx.core.C0112R.styleable.FontFamilyFont_fontVariationSettings
            boolean r6 = r1.hasValue(r6)
            if (r6 == 0) goto L52
            int r6 = androidx.core.C0112R.styleable.FontFamilyFont_fontVariationSettings
            goto L54
        L52:
            int r6 = androidx.core.C0112R.styleable.FontFamilyFont_android_fontVariationSettings
        L54:
            r14 = r6
            java.lang.String r15 = r1.getString(r14)
            int r16 = r1.getInt(r13, r5)
            int r6 = androidx.core.C0112R.styleable.FontFamilyFont_font
            boolean r6 = r1.hasValue(r6)
            if (r6 == 0) goto L68
            int r6 = androidx.core.C0112R.styleable.FontFamilyFont_font
            goto L6a
        L68:
            int r6 = androidx.core.C0112R.styleable.FontFamilyFont_android_font
        L6a:
            r11 = r6
            int r17 = r1.getResourceId(r11, r5)
            java.lang.String r18 = r1.getString(r11)
            r1.recycle()
        L76:
            int r5 = r21.next()
            r6 = 3
            if (r5 == r6) goto L81
            skip(r21)
            goto L76
        L81:
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry r19 = new androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry
            r5 = r19
            r6 = r18
            r7 = r4
            r9 = r15
            r10 = r16
            r20 = r11
            r11 = r17
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r19
    }

    private static void skip(org.xmlpull.v1.XmlPullParser r2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r0 = 1
        L1:
            if (r0 <= 0) goto L12
            int r1 = r2.next()
            switch(r1) {
                case 2: goto Le;
                case 3: goto Lb;
                default: goto La;
            }
        La:
            goto L11
        Lb:
            int r0 = r0 + (-1)
            goto L11
        Le:
            int r0 = r0 + 1
        L11:
            goto L1
        L12:
            return
    }

    private static java.util.List<byte[]> toByteArrayList(java.lang.String[] r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r6.length
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto L16
            r4 = r6[r3]
            byte[] r5 = android.util.Base64.decode(r4, r2)
            r0.add(r5)
            int r3 = r3 + 1
            goto L8
        L16:
            return r0
    }
}
