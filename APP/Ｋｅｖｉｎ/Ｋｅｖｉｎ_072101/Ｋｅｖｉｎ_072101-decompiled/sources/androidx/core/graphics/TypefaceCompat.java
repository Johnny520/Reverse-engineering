package androidx.core.graphics;

/* JADX INFO: loaded from: classes2.dex */
public class TypefaceCompat {
    private static final androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> sTypefaceCache = null;
    private static final androidx.core.graphics.TypefaceCompatBaseImpl sTypefaceCompatImpl = null;

    public static class ResourcesCallbackAdapter extends androidx.core.provider.FontsContractCompat.FontRequestCallback {
        private androidx.core.content.res.ResourcesCompat.FontCallback mFontCallback;

        public ResourcesCallbackAdapter(androidx.core.content.res.ResourcesCompat.FontCallback r1) {
                r0 = this;
                r0.<init>()
                r0.mFontCallback = r1
                return
        }

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        public void onTypefaceRequestFailed(int r2) {
                r1 = this;
                androidx.core.content.res.ResourcesCompat$FontCallback r0 = r1.mFontCallback
                if (r0 == 0) goto L9
                androidx.core.content.res.ResourcesCompat$FontCallback r0 = r1.mFontCallback
                r0.onFontRetrievalFailed(r2)
            L9:
                return
        }

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        public void onTypefaceRetrieved(android.graphics.Typeface r2) {
                r1 = this;
                androidx.core.content.res.ResourcesCompat$FontCallback r0 = r1.mFontCallback
                if (r0 == 0) goto L9
                androidx.core.content.res.ResourcesCompat$FontCallback r0 = r1.mFontCallback
                r0.onFontRetrieved(r2)
            L9:
                return
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Le
            androidx.core.graphics.TypefaceCompatApi29Impl r0 = new androidx.core.graphics.TypefaceCompatApi29Impl
            r0.<init>()
            androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl = r0
            goto L24
        Le:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L1c
            androidx.core.graphics.TypefaceCompatApi28Impl r0 = new androidx.core.graphics.TypefaceCompatApi28Impl
            r0.<init>()
            androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl = r0
            goto L24
        L1c:
            androidx.core.graphics.TypefaceCompatApi26Impl r0 = new androidx.core.graphics.TypefaceCompatApi26Impl
            r0.<init>()
            androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl = r0
        L24:
            androidx.collection.LruCache r0 = new androidx.collection.LruCache
            r1 = 16
            r0.<init>(r1)
            androidx.core.graphics.TypefaceCompat.sTypefaceCache = r0
            return
    }

    private TypefaceCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void clearCache() {
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r0 = androidx.core.graphics.TypefaceCompat.sTypefaceCache
            r0.evictAll()
            return
    }

    public static android.graphics.Typeface create(android.content.Context r2, android.graphics.Typeface r3, int r4) {
            if (r2 == 0) goto L9
            r0 = 0
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r3, r4)
            return r1
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Context cannot be null"
            r0.<init>(r1)
            throw r0
    }

    public static android.graphics.Typeface create(android.content.Context r3, android.graphics.Typeface r4, int r5, boolean r6) {
            if (r3 == 0) goto L15
            r0 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r1 = "weight"
            r2 = 1
            androidx.core.util.Preconditions.checkArgumentInRange(r5, r2, r0, r1)
            if (r4 != 0) goto Le
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT
        Le:
            androidx.core.graphics.TypefaceCompatBaseImpl r0 = androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl
            android.graphics.Typeface r0 = r0.createWeightStyle(r3, r4, r5, r6)
            return r0
        L15:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Context cannot be null"
            r0.<init>(r1)
            throw r0
    }

    public static android.graphics.Typeface createFromFontInfo(android.content.Context r1, android.os.CancellationSignal r2, androidx.core.provider.FontsContractCompat.FontInfo[] r3, int r4) {
            androidx.core.graphics.TypefaceCompatBaseImpl r0 = androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl
            android.graphics.Typeface r0 = r0.createFromFontInfo(r1, r2, r3, r4)
            return r0
    }

    @java.lang.Deprecated
    public static android.graphics.Typeface createFromResourcesFamilyXml(android.content.Context r10, androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry r11, android.content.res.Resources r12, int r13, int r14, androidx.core.content.res.ResourcesCompat.FontCallback r15, android.os.Handler r16, boolean r17) {
            r4 = 0
            r5 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            android.graphics.Typeface r0 = createFromResourcesFamilyXml(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }

    public static android.graphics.Typeface createFromResourcesFamilyXml(android.content.Context r15, androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry r16, android.content.res.Resources r17, int r18, java.lang.String r19, int r20, int r21, androidx.core.content.res.ResourcesCompat.FontCallback r22, android.os.Handler r23, boolean r24) {
            r0 = r16
            r1 = r22
            r2 = r23
            boolean r3 = r0 instanceof androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry
            if (r3 == 0) goto L59
            r3 = r0
            androidx.core.content.res.FontResourcesParserCompat$ProviderResourceEntry r3 = (androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry) r3
            java.lang.String r4 = r3.getSystemFontFamilyName()
            android.graphics.Typeface r4 = getSystemFontFamily(r4)
            if (r4 == 0) goto L1e
            if (r1 == 0) goto L1d
            r1.callbackSuccessAsync(r4, r2)
        L1d:
            return r4
        L1e:
            r5 = 1
            r6 = 0
            if (r24 == 0) goto L2d
        L23:
            int r7 = r3.getFetchStrategy()
            if (r7 != 0) goto L2b
            r11 = r5
            goto L32
        L2b:
            r11 = r6
            goto L32
        L2d:
            if (r1 != 0) goto L31
            r11 = r5
            goto L32
        L31:
            r11 = r6
        L32:
            if (r24 == 0) goto L3b
            int r5 = r3.getTimeout()
            r12 = r5
            goto L3d
        L3b:
            r5 = -1
            r12 = r5
        L3d:
            android.os.Handler r5 = androidx.core.content.res.ResourcesCompat.FontCallback.getHandler(r23)
            androidx.core.graphics.TypefaceCompat$ResourcesCallbackAdapter r14 = new androidx.core.graphics.TypefaceCompat$ResourcesCallbackAdapter
            r14.<init>(r1)
            androidx.core.provider.FontRequest r9 = r3.getRequest()
            r8 = r15
            r10 = r21
            r13 = r5
            android.graphics.Typeface r3 = androidx.core.provider.FontsContractCompat.requestFont(r8, r9, r10, r11, r12, r13, r14)
            r5 = r15
            r6 = r17
            r7 = r21
            goto L73
        L59:
            androidx.core.graphics.TypefaceCompatBaseImpl r3 = androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl
            r4 = r0
            androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry r4 = (androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry) r4
            r5 = r15
            r6 = r17
            r7 = r21
            android.graphics.Typeface r3 = r3.createFromFontFamilyFilesResourceEntry(r15, r4, r6, r7)
            if (r1 == 0) goto L73
            if (r3 == 0) goto L6f
            r1.callbackSuccessAsync(r3, r2)
            goto L73
        L6f:
            r4 = -3
            r1.callbackFailAsync(r4, r2)
        L73:
            if (r3 == 0) goto L7e
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r4 = androidx.core.graphics.TypefaceCompat.sTypefaceCache
            java.lang.String r8 = createResourceUid(r17, r18, r19, r20, r21)
            r4.put(r8, r3)
        L7e:
            return r3
    }

    @java.lang.Deprecated
    public static android.graphics.Typeface createFromResourcesFontFile(android.content.Context r6, android.content.res.Resources r7, int r8, java.lang.String r9, int r10) {
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            android.graphics.Typeface r0 = createFromResourcesFontFile(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static android.graphics.Typeface createFromResourcesFontFile(android.content.Context r6, android.content.res.Resources r7, int r8, java.lang.String r9, int r10, int r11) {
            androidx.core.graphics.TypefaceCompatBaseImpl r0 = androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r11
            android.graphics.Typeface r0 = r0.createFromResourcesFontFile(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L16
            java.lang.String r1 = createResourceUid(r7, r8, r9, r10, r11)
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r2 = androidx.core.graphics.TypefaceCompat.sTypefaceCache
            r2.put(r1, r0)
        L16:
            return r0
    }

    private static java.lang.String createResourceUid(android.content.res.Resources r2, int r3, java.lang.String r4, int r5, int r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r2.getResourcePackageName(r3)
            r0.<init>(r1)
            r1 = 45
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @java.lang.Deprecated
    public static android.graphics.Typeface findFromCache(android.content.res.Resources r2, int r3, int r4) {
            r0 = 0
            r1 = 0
            android.graphics.Typeface r0 = findFromCache(r2, r3, r0, r1, r4)
            return r0
    }

    public static android.graphics.Typeface findFromCache(android.content.res.Resources r2, int r3, java.lang.String r4, int r5, int r6) {
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r0 = androidx.core.graphics.TypefaceCompat.sTypefaceCache
            java.lang.String r1 = createResourceUid(r2, r3, r4, r5, r6)
            java.lang.Object r0 = r0.get(r1)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            return r0
    }

    private static android.graphics.Typeface getBestFontFromFamily(android.content.Context r3, android.graphics.Typeface r4, int r5) {
            androidx.core.graphics.TypefaceCompatBaseImpl r0 = androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl
            androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry r0 = r0.getFontFamily(r4)
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            androidx.core.graphics.TypefaceCompatBaseImpl r1 = androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl
            android.content.res.Resources r2 = r3.getResources()
            android.graphics.Typeface r1 = r1.createFromFontFamilyFilesResourceEntry(r3, r0, r2, r5)
            return r1
    }

    private static android.graphics.Typeface getSystemFontFamily(java.lang.String r4) {
            r0 = 0
            if (r4 == 0) goto L1f
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto La
            goto L1f
        La:
            r1 = 0
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r4, r1)
            android.graphics.Typeface r3 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r3, r1)
            if (r2 == 0) goto L1e
            boolean r3 = r2.equals(r1)
            if (r3 != 0) goto L1e
            r0 = r2
        L1e:
            return r0
        L1f:
            return r0
    }
}
