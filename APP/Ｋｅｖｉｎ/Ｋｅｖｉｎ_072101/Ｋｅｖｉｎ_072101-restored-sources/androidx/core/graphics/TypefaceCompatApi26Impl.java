package androidx.core.graphics;

/* JADX INFO: loaded from: classes2.dex */
public class TypefaceCompatApi26Impl extends androidx.core.graphics.TypefaceCompatApi21Impl {
    private static final java.lang.String ABORT_CREATION_METHOD = "abortCreation";
    private static final java.lang.String ADD_FONT_FROM_ASSET_MANAGER_METHOD = "addFontFromAssetManager";
    private static final java.lang.String ADD_FONT_FROM_BUFFER_METHOD = "addFontFromBuffer";
    private static final java.lang.String CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD = "createFromFamiliesWithDefault";
    private static final java.lang.String FONT_FAMILY_CLASS = "android.graphics.FontFamily";
    private static final java.lang.String FREEZE_METHOD = "freeze";
    private static final int RESOLVE_BY_FONT_TABLE = -1;
    private static final java.lang.String TAG = "TypefaceCompatApi26Impl";
    protected final java.lang.reflect.Method mAbortCreation;
    protected final java.lang.reflect.Method mAddFontFromAssetManager;
    protected final java.lang.reflect.Method mAddFontFromBuffer;
    protected final java.lang.reflect.Method mCreateFromFamiliesWithDefault;
    protected final java.lang.Class<?> mFontFamily;
    protected final java.lang.reflect.Constructor<?> mFontFamilyCtor;
    protected final java.lang.reflect.Method mFreeze;

    public TypefaceCompatApi26Impl() {
            r8 = this;
            r8.<init>()
            java.lang.Class r0 = r8.obtainFontFamily()     // Catch: java.lang.NoSuchMethodException -> L20 java.lang.ClassNotFoundException -> L22
            java.lang.reflect.Constructor r1 = r8.obtainFontFamilyCtor(r0)     // Catch: java.lang.NoSuchMethodException -> L20 java.lang.ClassNotFoundException -> L22
            java.lang.reflect.Method r2 = r8.obtainAddFontFromAssetManagerMethod(r0)     // Catch: java.lang.NoSuchMethodException -> L20 java.lang.ClassNotFoundException -> L22
            java.lang.reflect.Method r3 = r8.obtainAddFontFromBufferMethod(r0)     // Catch: java.lang.NoSuchMethodException -> L20 java.lang.ClassNotFoundException -> L22
            java.lang.reflect.Method r4 = r8.obtainFreezeMethod(r0)     // Catch: java.lang.NoSuchMethodException -> L20 java.lang.ClassNotFoundException -> L22
            java.lang.reflect.Method r5 = r8.obtainAbortCreationMethod(r0)     // Catch: java.lang.NoSuchMethodException -> L20 java.lang.ClassNotFoundException -> L22
            java.lang.reflect.Method r6 = r8.obtainCreateFromFamiliesWithDefaultMethod(r0)     // Catch: java.lang.NoSuchMethodException -> L20 java.lang.ClassNotFoundException -> L22
            goto L51
        L20:
            r0 = move-exception
            goto L23
        L22:
            r0 = move-exception
        L23:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to collect necessary methods for class "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TypefaceCompatApi26Impl"
            android.util.Log.e(r2, r1, r0)
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
        L51:
            r8.mFontFamily = r0
            r8.mFontFamilyCtor = r1
            r8.mAddFontFromAssetManager = r2
            r8.mAddFontFromBuffer = r3
            r8.mFreeze = r4
            r8.mAbortCreation = r5
            r8.mCreateFromFamiliesWithDefault = r6
            return
    }

    private void abortCreation(java.lang.Object r3) {
            r2 = this;
            java.lang.reflect.Method r0 = r2.mAbortCreation     // Catch: java.lang.reflect.InvocationTargetException -> L9 java.lang.IllegalAccessException -> Lb
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L9 java.lang.IllegalAccessException -> Lb
            r0.invoke(r3, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L9 java.lang.IllegalAccessException -> Lb
            goto Lc
        L9:
            r0 = move-exception
            goto Lc
        Lb:
            r0 = move-exception
        Lc:
            return
    }

    private boolean addFontFromAssetManager(android.content.Context r12, java.lang.Object r13, java.lang.String r14, int r15, int r16, int r17, android.graphics.fonts.FontVariationAxis[] r18) {
            r11 = this;
            r1 = 0
            r2 = r11
            java.lang.reflect.Method r0 = r2.mAddFontFromAssetManager     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.IllegalAccessException -> L35
            android.content.res.AssetManager r3 = r12.getAssets()     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.IllegalAccessException -> L35
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.IllegalAccessException -> L35
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.IllegalAccessException -> L35
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.IllegalAccessException -> L35
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.IllegalAccessException -> L35
            java.lang.Integer r9 = java.lang.Integer.valueOf(r17)     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.IllegalAccessException -> L35
            r4 = r14
            r10 = r18
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8, r9, r10}     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.IllegalAccessException -> L35
            r4 = r13
            java.lang.Object r0 = r0.invoke(r13, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L31
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L31
            boolean r0 = r0.booleanValue()     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L31
            return r0
        L2f:
            r0 = move-exception
            goto L37
        L31:
            r0 = move-exception
            goto L37
        L33:
            r0 = move-exception
            goto L36
        L35:
            r0 = move-exception
        L36:
            r4 = r13
        L37:
            return r1
    }

    private boolean addFontFromBuffer(java.lang.Object r6, java.nio.ByteBuffer r7, int r8, int r9, int r10) {
            r5 = this;
            java.lang.reflect.Method r0 = r5.mAddFontFromBuffer     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20
            r4 = 0
            java.lang.Object[] r1 = new java.lang.Object[]{r7, r1, r4, r2, r3}     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20
            java.lang.Object r0 = r0.invoke(r6, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20
            boolean r0 = r0.booleanValue()     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20
            return r0
        L1e:
            r0 = move-exception
            goto L21
        L20:
            r0 = move-exception
        L21:
            r1 = 0
            return r1
    }

    private boolean freeze(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            java.lang.reflect.Method r1 = r3.mFreeze     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.IllegalAccessException -> L12
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.IllegalAccessException -> L12
            java.lang.Object r1 = r1.invoke(r4, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.IllegalAccessException -> L12
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.IllegalAccessException -> L12
            boolean r0 = r1.booleanValue()     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.IllegalAccessException -> L12
            return r0
        L10:
            r1 = move-exception
            goto L13
        L12:
            r1 = move-exception
        L13:
            return r0
    }

    private boolean isFontFamilyPrivateAPIAvailable() {
            r2 = this;
            java.lang.reflect.Method r0 = r2.mAddFontFromAssetManager
            if (r0 != 0) goto Lb
            java.lang.String r0 = "TypefaceCompatApi26Impl"
            java.lang.String r1 = "Unable to collect necessary private methods. Fallback to legacy implementation."
            android.util.Log.w(r0, r1)
        Lb:
            java.lang.reflect.Method r0 = r2.mAddFontFromAssetManager
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    private java.lang.Object newFamily() {
            r2 = this;
            java.lang.reflect.Constructor<?> r0 = r2.mFontFamilyCtor     // Catch: java.lang.reflect.InvocationTargetException -> La java.lang.InstantiationException -> Lc java.lang.IllegalAccessException -> Le
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> La java.lang.InstantiationException -> Lc java.lang.IllegalAccessException -> Le
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> La java.lang.InstantiationException -> Lc java.lang.IllegalAccessException -> Le
            return r0
        La:
            r0 = move-exception
            goto Lf
        Lc:
            r0 = move-exception
            goto Lf
        Le:
            r0 = move-exception
        Lf:
            r1 = 0
            return r1
    }

    protected android.graphics.Typeface createFromFamiliesWithDefault(java.lang.Object r6) {
            r5 = this;
            r0 = 0
            java.lang.Class<?> r1 = r5.mFontFamily     // Catch: java.lang.reflect.InvocationTargetException -> L22 java.lang.IllegalAccessException -> L24
            r2 = 1
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L22 java.lang.IllegalAccessException -> L24
            r2 = 0
            java.lang.reflect.Array.set(r1, r2, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L22 java.lang.IllegalAccessException -> L24
            java.lang.reflect.Method r2 = r5.mCreateFromFamiliesWithDefault     // Catch: java.lang.reflect.InvocationTargetException -> L22 java.lang.IllegalAccessException -> L24
            r3 = -1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L22 java.lang.IllegalAccessException -> L24
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L22 java.lang.IllegalAccessException -> L24
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r4, r3}     // Catch: java.lang.reflect.InvocationTargetException -> L22 java.lang.IllegalAccessException -> L24
            java.lang.Object r2 = r2.invoke(r0, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L22 java.lang.IllegalAccessException -> L24
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2     // Catch: java.lang.reflect.InvocationTargetException -> L22 java.lang.IllegalAccessException -> L24
            return r2
        L22:
            r1 = move-exception
            goto L25
        L24:
            r1 = move-exception
        L25:
            return r0
    }

    @Override // androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontFamilyFilesResourceEntry(android.content.Context r16, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry r17, android.content.res.Resources r18, int r19) {
            r15 = this;
            r8 = r15
            boolean r0 = r15.isFontFamilyPrivateAPIAvailable()
            if (r0 != 0) goto Lc
            android.graphics.Typeface r0 = super.createFromFontFamilyFilesResourceEntry(r16, r17, r18, r19)
            return r0
        Lc:
            java.lang.Object r9 = r15.newFamily()
            r10 = 0
            if (r9 != 0) goto L14
            return r10
        L14:
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry[] r11 = r17.getEntries()
            int r12 = r11.length
            r0 = 0
            r13 = r0
        L1b:
            if (r13 >= r12) goto L48
            r14 = r11[r13]
            java.lang.String r3 = r14.getFileName()
            int r4 = r14.getTtcIndex()
            int r5 = r14.getWeight()
            boolean r6 = r14.isItalic()
            java.lang.String r0 = r14.getVariationSettings()
            android.graphics.fonts.FontVariationAxis[] r7 = android.graphics.fonts.FontVariationAxis.fromFontVariationSettings(r0)
            r0 = r15
            r1 = r16
            r2 = r9
            boolean r0 = r0.addFontFromAssetManager(r1, r2, r3, r4, r5, r6, r7)
            if (r0 != 0) goto L45
            r15.abortCreation(r9)
            return r10
        L45:
            int r13 = r13 + 1
            goto L1b
        L48:
            boolean r0 = r15.freeze(r9)
            if (r0 != 0) goto L4f
            return r10
        L4f:
            android.graphics.Typeface r0 = r15.createFromFamiliesWithDefault(r9)
            return r0
    }

    @Override // androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontInfo(android.content.Context r21, android.os.CancellationSignal r22, androidx.core.provider.FontsContractCompat.FontInfo[] r23, int r24) {
            r20 = this;
            r7 = r20
            r8 = r22
            r9 = r23
            r10 = r24
            int r0 = r9.length
            r1 = 1
            r11 = 0
            if (r0 >= r1) goto Le
            return r11
        Le:
            boolean r0 = r20.isFontFamilyPrivateAPIAvailable()
            if (r0 != 0) goto L64
            androidx.core.provider.FontsContractCompat$FontInfo r1 = r7.findBestInfo(r9, r10)
            android.content.ContentResolver r2 = r21.getContentResolver()
            android.net.Uri r0 = r1.getUri()     // Catch: java.io.IOException -> L62
            java.lang.String r3 = "r"
            android.os.ParcelFileDescriptor r0 = r2.openFileDescriptor(r0, r3, r8)     // Catch: java.io.IOException -> L62
            r3 = r0
            if (r3 != 0) goto L31
        L2b:
            if (r3 == 0) goto L30
            r3.close()     // Catch: java.io.IOException -> L62
        L30:
            return r11
        L31:
            android.graphics.Typeface$Builder r0 = new android.graphics.Typeface$Builder     // Catch: java.lang.Throwable -> L54
            java.io.FileDescriptor r4 = r3.getFileDescriptor()     // Catch: java.lang.Throwable -> L54
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L54
            int r4 = r1.getWeight()     // Catch: java.lang.Throwable -> L54
            android.graphics.Typeface$Builder r0 = r0.setWeight(r4)     // Catch: java.lang.Throwable -> L54
            boolean r4 = r1.isItalic()     // Catch: java.lang.Throwable -> L54
            android.graphics.Typeface$Builder r0 = r0.setItalic(r4)     // Catch: java.lang.Throwable -> L54
            android.graphics.Typeface r0 = r0.build()     // Catch: java.lang.Throwable -> L54
            if (r3 == 0) goto L53
            r3.close()     // Catch: java.io.IOException -> L62
        L53:
            return r0
        L54:
            r0 = move-exception
            r4 = r0
            if (r3 == 0) goto L61
            r3.close()     // Catch: java.lang.Throwable -> L5c
            goto L61
        L5c:
            r0 = move-exception
            r5 = r0
            r4.addSuppressed(r5)     // Catch: java.io.IOException -> L62
        L61:
            throw r4     // Catch: java.io.IOException -> L62
        L62:
            r0 = move-exception
            return r11
        L64:
            r12 = r21
            java.util.Map r0 = androidx.core.graphics.TypefaceCompatUtil.readFontInfoIntoByteBuffer(r12, r9, r8)
            java.lang.Object r13 = r20.newFamily()
            if (r13 != 0) goto L71
            return r11
        L71:
            r1 = 0
            int r14 = r9.length
            r2 = 0
            r15 = r1
            r6 = r2
        L76:
            if (r6 >= r14) goto Lb0
            r16 = r9[r6]
            android.net.Uri r1 = r16.getUri()
            java.lang.Object r1 = r0.get(r1)
            r17 = r1
            java.nio.ByteBuffer r17 = (java.nio.ByteBuffer) r17
            if (r17 != 0) goto L8b
            r19 = r6
            goto Lad
        L8b:
            int r4 = r16.getTtcIndex()
            int r5 = r16.getWeight()
            boolean r18 = r16.isItalic()
            r1 = r20
            r2 = r13
            r3 = r17
            r19 = r6
            r6 = r18
            boolean r1 = r1.addFontFromBuffer(r2, r3, r4, r5, r6)
            if (r1 != 0) goto Lab
            r7.abortCreation(r13)
            return r11
        Lab:
            r2 = 1
            r15 = r2
        Lad:
            int r6 = r19 + 1
            goto L76
        Lb0:
            if (r15 != 0) goto Lb6
            r7.abortCreation(r13)
            return r11
        Lb6:
            boolean r1 = r7.freeze(r13)
            if (r1 != 0) goto Lbd
            return r11
        Lbd:
            android.graphics.Typeface r1 = r7.createFromFamiliesWithDefault(r13)
            if (r1 != 0) goto Lc4
            return r11
        Lc4:
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r1, r10)
            return r2
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromResourcesFontFile(android.content.Context r11, android.content.res.Resources r12, int r13, java.lang.String r14, int r15) {
            r10 = this;
            boolean r0 = r10.isFontFamilyPrivateAPIAvailable()
            if (r0 != 0) goto Lb
            android.graphics.Typeface r0 = super.createFromResourcesFontFile(r11, r12, r13, r14, r15)
            return r0
        Lb:
            java.lang.Object r0 = r10.newFamily()
            r9 = 0
            if (r0 != 0) goto L13
            return r9
        L13:
            r7 = -1
            r8 = 0
            r5 = 0
            r6 = -1
            r1 = r10
            r2 = r11
            r3 = r0
            r4 = r14
            boolean r1 = r1.addFontFromAssetManager(r2, r3, r4, r5, r6, r7, r8)
            if (r1 != 0) goto L25
            r10.abortCreation(r0)
            return r9
        L25:
            boolean r1 = r10.freeze(r0)
            if (r1 != 0) goto L2c
            return r9
        L2c:
            android.graphics.Typeface r1 = r10.createFromFamiliesWithDefault(r0)
            return r1
    }

    @Override // androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    android.graphics.Typeface createWeightStyle(android.content.Context r3, android.graphics.Typeface r4, int r5, boolean r6) {
            r2 = this;
            r0 = 0
            android.graphics.Typeface r1 = androidx.core.graphics.WeightTypefaceApi26.createWeightStyle(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L7
            r0 = r1
            goto L8
        L7:
            r1 = move-exception
        L8:
            if (r0 != 0) goto Le
            android.graphics.Typeface r0 = super.createWeightStyle(r3, r4, r5, r6)
        Le:
            return r0
    }

    protected java.lang.reflect.Method obtainAbortCreationMethod(java.lang.Class<?> r3) throws java.lang.NoSuchMethodException {
            r2 = this;
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.String r1 = "abortCreation"
            java.lang.reflect.Method r0 = r3.getMethod(r1, r0)
            return r0
    }

    protected java.lang.reflect.Method obtainAddFontFromAssetManagerMethod(java.lang.Class<?> r9) throws java.lang.NoSuchMethodException {
            r8 = this;
            java.lang.Class<android.content.res.AssetManager> r0 = android.content.res.AssetManager.class
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Class r2 = java.lang.Integer.TYPE
            java.lang.Class r3 = java.lang.Boolean.TYPE
            java.lang.Class r4 = java.lang.Integer.TYPE
            java.lang.Class r5 = java.lang.Integer.TYPE
            java.lang.Class r6 = java.lang.Integer.TYPE
            java.lang.Class<android.graphics.fonts.FontVariationAxis[]> r7 = android.graphics.fonts.FontVariationAxis[].class
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r1, r2, r3, r4, r5, r6, r7}
            java.lang.String r1 = "addFontFromAssetManager"
            java.lang.reflect.Method r0 = r9.getMethod(r1, r0)
            return r0
    }

    protected java.lang.reflect.Method obtainAddFontFromBufferMethod(java.lang.Class<?> r6) throws java.lang.NoSuchMethodException {
            r5 = this;
            java.lang.Class<java.nio.ByteBuffer> r0 = java.nio.ByteBuffer.class
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Class<android.graphics.fonts.FontVariationAxis[]> r2 = android.graphics.fonts.FontVariationAxis[].class
            java.lang.Class r3 = java.lang.Integer.TYPE
            java.lang.Class r4 = java.lang.Integer.TYPE
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r1, r2, r3, r4}
            java.lang.String r1 = "addFontFromBuffer"
            java.lang.reflect.Method r0 = r6.getMethod(r1, r0)
            return r0
    }

    protected java.lang.reflect.Method obtainCreateFromFamiliesWithDefaultMethod(java.lang.Class<?> r7) throws java.lang.NoSuchMethodException {
            r6 = this;
            r0 = 1
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r7, r0)
            java.lang.Class<android.graphics.Typeface> r2 = android.graphics.Typeface.class
            java.lang.Class r3 = r1.getClass()
            java.lang.Class r4 = java.lang.Integer.TYPE
            java.lang.Class r5 = java.lang.Integer.TYPE
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r4, r5}
            java.lang.String r4 = "createFromFamiliesWithDefault"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r3)
            r2.setAccessible(r0)
            return r2
    }

    protected java.lang.Class<?> obtainFontFamily() throws java.lang.ClassNotFoundException {
            r1 = this;
            java.lang.String r0 = "android.graphics.FontFamily"
            java.lang.Class r0 = java.lang.Class.forName(r0)
            return r0
    }

    protected java.lang.reflect.Constructor<?> obtainFontFamilyCtor(java.lang.Class<?> r2) throws java.lang.NoSuchMethodException {
            r1 = this;
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.reflect.Constructor r0 = r2.getConstructor(r0)
            return r0
    }

    protected java.lang.reflect.Method obtainFreezeMethod(java.lang.Class<?> r3) throws java.lang.NoSuchMethodException {
            r2 = this;
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.String r1 = "freeze"
            java.lang.reflect.Method r0 = r3.getMethod(r1, r0)
            return r0
    }
}
