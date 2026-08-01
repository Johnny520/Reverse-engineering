package com.tencent.mmkv;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class MMKV implements android.content.SharedPreferences, android.content.SharedPreferences.Editor {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static final boolean f449 = false;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static boolean f450;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final java.util.HashSet f451 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final defpackage.EnumC0693[] f452 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.util.EnumMap f453 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final java.util.EnumMap f454 = null;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static java.lang.String f455;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static boolean f456;
    private final long nativeHandle;

    static {
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<ᛶᛶᛲᲁ> r1 = defpackage.EnumC1086.class
            r0.<init>(r1)
            com.tencent.mmkv.MMKV.f453 = r0
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            ᛶᛶᛲᲁ r3 = defpackage.EnumC1086.f4876
            r0.put(r3, r2)
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            ᛶᛶᛲᲁ r5 = defpackage.EnumC1086.f4875
            r0.put(r5, r4)
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<ᛴᛶᛸ> r5 = defpackage.EnumC0693.class
            r0.<init>(r5)
            com.tencent.mmkv.MMKV.f454 = r0
            ᛴᛶᛸ r5 = defpackage.EnumC0693.f3332
            r0.put(r5, r2)
            ᛴᛶᛸ r2 = defpackage.EnumC0693.f3331
            r0.put(r2, r4)
            r4 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            ᛴᛶᛸ r6 = defpackage.EnumC0693.f3330
            r0.put(r6, r4)
            r4 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            ᛴᛶᛸ r7 = defpackage.EnumC0693.f3333
            r0.put(r7, r4)
            r4 = 4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            ᛴᛶᛸ r8 = defpackage.EnumC0693.f3334
            r0.put(r8, r4)
            ᛴᛶᛸ[] r0 = new defpackage.EnumC0693[]{r5, r2, r6, r7, r8}
            com.tencent.mmkv.MMKV.f452 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.tencent.mmkv.MMKV.f451 = r0
            com.tencent.mmkv.MMKV.f450 = r1
            r0 = 0
            com.tencent.mmkv.MMKV.f455 = r0
            com.tencent.mmkv.MMKV.f456 = r3
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.tencent.mmkv.MMKV.f449 = r1
            return
    }

    public MMKV(long r1) {
            r0 = this;
            r0.<init>()
            r0.nativeHandle = r1
            return
    }

    private native long actualSize(long r1);

    private native java.lang.String[] allKeys(long r1, boolean r3);

    public static native long backupAllToDirectory(java.lang.String r0);

    public static native boolean backupOneToDirectory(java.lang.String r0, java.lang.String r1, java.lang.String r2);

    public static native boolean checkExist(java.lang.String r0, java.lang.String r1);

    private static native boolean checkProcessMode(long r0);

    private native boolean containsKey(long r1, java.lang.String r3);

    private native long count(long r1, boolean r3);

    private static native long createNB(int r0);

    private native boolean decodeBool(long r1, java.lang.String r3, boolean r4);

    private native byte[] decodeBytes(long r1, java.lang.String r3);

    private native double decodeDouble(long r1, java.lang.String r3, double r4);

    private native float decodeFloat(long r1, java.lang.String r3, float r4);

    private native int decodeInt(long r1, java.lang.String r3, int r4);

    private native long decodeLong(long r1, java.lang.String r3, long r4);

    private native java.lang.String decodeString(long r1, java.lang.String r3, java.lang.String r4);

    private native java.lang.String[] decodeStringSet(long r1, java.lang.String r3);

    private static native void destroyNB(long r0, int r2);

    private native void doCheckReSetCryptKey(java.lang.String r1, boolean r2);

    private native boolean doReKey(java.lang.String r1, boolean r2);

    private static native void enableDisableProcessMode(boolean r0);

    private native boolean encodeBool(long r1, java.lang.String r3, boolean r4);

    private native boolean encodeBool_2(long r1, java.lang.String r3, boolean r4, int r5);

    private native boolean encodeBytes(long r1, java.lang.String r3, byte[] r4);

    private native boolean encodeBytes_2(long r1, java.lang.String r3, byte[] r4, int r5);

    private native boolean encodeDouble(long r1, java.lang.String r3, double r4);

    private native boolean encodeDouble_2(long r1, java.lang.String r3, double r4, int r6);

    private native boolean encodeFloat(long r1, java.lang.String r3, float r4);

    private native boolean encodeFloat_2(long r1, java.lang.String r3, float r4, int r5);

    private native boolean encodeInt(long r1, java.lang.String r3, int r4);

    private native boolean encodeInt_2(long r1, java.lang.String r3, int r4, int r5);

    private native boolean encodeLong(long r1, java.lang.String r3, long r4);

    private native boolean encodeLong_2(long r1, java.lang.String r3, long r4, int r6);

    private native boolean encodeSet(long r1, java.lang.String r3, java.lang.String[] r4);

    private native boolean encodeSet_2(long r1, java.lang.String r3, java.lang.String[] r4, int r5);

    private native boolean encodeString(long r1, java.lang.String r3, java.lang.String r4);

    private native boolean encodeString_2(long r1, java.lang.String r3, java.lang.String r4, int r5);

    private static native long getDefaultMMKV(int r0, java.lang.String r1, long r2, boolean r4, int r5, int r6, boolean r7, int r8, int r9);

    private static native long getMMKVWithAshmemFD(java.lang.String r0, int r1, int r2, java.lang.String r3, boolean r4);

    public static native long getMMKVWithID(java.lang.String r0, int r1, java.lang.String r2, java.lang.String r3, long r4, boolean r6, int r7, int r8, boolean r9, int r10, int r11);

    private static native boolean getNameSpace(java.lang.String r0);

    private native long importFrom(long r1, long r3);

    private native boolean isCompareBeforeSetEnabled();

    @dalvik.annotation.optimization.FastNative
    private native boolean isEncryptionEnabled();

    @dalvik.annotation.optimization.FastNative
    private native boolean isExpirationEnabled();

    public static native boolean isFileValid(java.lang.String r0, java.lang.String r1);

    private static native void jniInitialize(java.lang.String r0, java.lang.String r1, int r2, boolean r3, boolean r4, long r5);

    private static void mmkvLogImp(int r0, java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4) {
            ᛴᛶᛸ[] r1 = com.tencent.mmkv.MMKV.f452
            r0 = r1[r0]
            int r0 = r0.ordinal()
            java.lang.String r1 = "MMKV"
            if (r0 == 0) goto L22
            r2 = 1
            if (r0 == r2) goto L1e
            r2 = 2
            if (r0 == r2) goto L1a
            r2 = 3
            if (r0 == r2) goto L16
            return
        L16:
            android.util.Log.e(r1, r4)
            return
        L1a:
            android.util.Log.w(r1, r4)
            return
        L1e:
            android.util.Log.i(r1, r4)
            return
        L22:
            android.util.Log.d(r1, r4)
            return
    }

    public static com.tencent.mmkv.MMKV mmkvWithID(java.lang.String r3) {
            ᲇᛶᲀᛸ r0 = new ᲇᛶᲀᛸ
            r1 = 5
            r2 = 0
            r0.<init>(r1, r2)
            com.tencent.mmkv.MMKV r3 = m315(r3, r0)
            return r3
    }

    @dalvik.annotation.optimization.FastNative
    private native void nativeEnableCompareBeforeSet();

    private static void onContentChangedByOuterProcess(java.lang.String r0) {
            return
    }

    public static native void onExit();

    private static int onMMKVCRCCheckFail(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Recover strategic for "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = " is "
            r0.append(r2)
            ᛶᛶᛲᲁ r2 = defpackage.EnumC1086.f4876
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            m313(r0)
            java.util.EnumMap r0 = com.tencent.mmkv.MMKV.f453
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L27
            r2 = 0
            return r2
        L27:
            int r2 = r2.intValue()
            return r2
    }

    private static void onMMKVContentLoadSuccessfully(java.lang.String r0) {
            return
    }

    private static int onMMKVFileLengthError(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Recover strategic for "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = " is "
            r0.append(r2)
            ᛶᛶᛲᲁ r2 = defpackage.EnumC1086.f4876
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            m313(r0)
            java.util.EnumMap r0 = com.tencent.mmkv.MMKV.f453
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L27
            r2 = 0
            return r2
        L27:
            int r2 = r2.intValue()
            return r2
    }

    public static native int pageSize();

    public static native boolean removeStorage(java.lang.String r0, java.lang.String r1);

    private native void removeValueForKey(long r1, java.lang.String r3);

    public static native long restoreAllFromDirectory(java.lang.String r0);

    public static native boolean restoreOneMMKVFromDirectory(java.lang.String r0, java.lang.String r1, java.lang.String r2);

    private static native void setCallbackHandler(boolean r0, boolean r1, long r2);

    private static native void setLogLevel(int r0);

    private static native void setWantsContentChangeNotify(boolean r0);

    private native void sync(boolean r1);

    private native long totalSize(long r1);

    private native int valueSize(long r1, java.lang.String r3, boolean r4);

    public static native java.lang.String version();

    private native int writeValueToNB(long r1, java.lang.String r3, long r4, int r6);

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static void m313(java.lang.String r4) {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            int r1 = r0.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            java.util.EnumMap r1 = com.tencent.mmkv.MMKV.f454
            ᛴᛶᛸ r2 = defpackage.EnumC0693.f3331
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L1b
            r1 = 0
            goto L1f
        L1b:
            int r1 = r1.intValue()
        L1f:
            java.lang.String r2 = r0.getFileName()
            int r3 = r0.getLineNumber()
            java.lang.String r0 = r0.getMethodName()
            mmkvLogImp(r1, r2, r3, r0, r4)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m314(android.app.Application r9, java.lang.String r10) {
            boolean r0 = android.os.Process.is64Bit()
            if (r0 == 0) goto L5b
            java.io.File r0 = r9.getCacheDir()
            java.lang.String r2 = r0.getAbsolutePath()
            boolean r4 = com.tencent.mmkv.MMKV.f449
            java.lang.String r0 = "mmkv"
            boolean r1 = com.tencent.mmkv.MMKV.f450
            r8 = 1
            if (r1 == 0) goto L18
            goto L1d
        L18:
            java.lang.System.loadLibrary(r0)
            com.tencent.mmkv.MMKV.f450 = r8
        L1d:
            r3 = 1
            r5 = 0
            r6 = 0
            r1 = r10
            jniInitialize(r1, r2, r3, r4, r5, r6)
            com.tencent.mmkv.MMKV.f455 = r1
            android.content.pm.ApplicationInfo r9 = r9.getApplicationInfo()
            int r9 = r9.flags
            r9 = r9 & 2
            if (r9 != 0) goto L46
            java.util.HashSet r9 = com.tencent.mmkv.MMKV.f451
            monitor-enter(r9)
            com.tencent.mmkv.MMKV.f456 = r5     // Catch: java.lang.Throwable -> L42
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L42
            enableDisableProcessMode(r5)
            java.lang.String r9 = "MMKV"
            java.lang.String r10 = "Disable checkProcessMode()"
            android.util.Log.i(r9, r10)
            return
        L42:
            r0 = move-exception
            r10 = r0
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L42
            throw r10
        L46:
            java.util.HashSet r9 = com.tencent.mmkv.MMKV.f451
            monitor-enter(r9)
            com.tencent.mmkv.MMKV.f456 = r8     // Catch: java.lang.Throwable -> L57
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L57
            enableDisableProcessMode(r8)
            java.lang.String r9 = "MMKV"
            java.lang.String r10 = "Enable checkProcessMode()"
            android.util.Log.i(r9, r10)
            return
        L57:
            r0 = move-exception
            r10 = r0
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L57
            throw r10
        L5b:
            ᛸᛵᛳᲀ r9 = new ᛸᛵᛳᲀ
            java.lang.String r10 = "MMKV 2.0+ requires 64-bit App, use 1.3.x instead."
            r9.<init>(r10)
            throw r9
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static com.tencent.mmkv.MMKV m315(java.lang.String r13, defpackage.C2073 r14) {
            java.lang.String r0 = com.tencent.mmkv.MMKV.f455
            r1 = 0
            if (r0 == 0) goto La5
            java.util.EnumMap r0 = com.tencent.mmkv.MMKV.f453
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L12
            r0 = -1
        L10:
            r11 = r0
            goto L17
        L12:
            int r0 = r0.intValue()
            goto L10
        L17:
            int r2 = r14.f8901
            java.lang.Object r0 = r14.f8900
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            r10 = 0
            r12 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = -1
            r9 = 0
            r1 = r13
            long r2 = getMMKVWithID(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            int r13 = r14.f8901
            java.lang.String r14 = "while it's already been opened with SINGLE_PROCESS_MODE by someone somewhere else!"
            java.lang.String r0 = "Opening an MMKV instance ["
            java.lang.String r4 = "Opening a multi-process MMKV instance ["
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 == 0) goto L97
            boolean r5 = com.tencent.mmkv.MMKV.f456
            if (r5 != 0) goto L41
            com.tencent.mmkv.MMKV r13 = new com.tencent.mmkv.MMKV
            r13.<init>(r2)
            return r13
        L41:
            java.util.HashSet r5 = com.tencent.mmkv.MMKV.f451
            monitor-enter(r5)
            java.lang.Long r6 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L69
            boolean r6 = r5.contains(r6)     // Catch: java.lang.Throwable -> L69
            if (r6 != 0) goto L8e
            boolean r6 = checkProcessMode(r2)     // Catch: java.lang.Throwable -> L69
            if (r6 != 0) goto L87
            r2 = 1
            if (r13 != r2) goto L6c
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r13.<init>(r4)     // Catch: java.lang.Throwable -> L69
            r13.append(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.String r14 = "] with SINGLE_PROCESS_MODE!"
            r13.append(r14)     // Catch: java.lang.Throwable -> L69
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L69
            goto L81
        L69:
            r0 = move-exception
            r13 = r0
            goto L95
        L6c:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L69
            r13.append(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = "] with MULTI_PROCESS_MODE, "
            r13.append(r0)     // Catch: java.lang.Throwable -> L69
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L69
            java.lang.String r13 = r13.concat(r14)     // Catch: java.lang.Throwable -> L69
        L81:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L69
            r14.<init>(r13)     // Catch: java.lang.Throwable -> L69
            throw r14     // Catch: java.lang.Throwable -> L69
        L87:
            java.lang.Long r13 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L69
            r5.add(r13)     // Catch: java.lang.Throwable -> L69
        L8e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L69
            com.tencent.mmkv.MMKV r13 = new com.tencent.mmkv.MMKV
            r13.<init>(r2)
            return r13
        L95:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L69
            throw r13
        L97:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Fail to create an MMKV instance ["
            java.lang.String r0 = "] in JNI"
            java.lang.String r14 = defpackage.AbstractC0225.m817(r14, r1, r0)
            r13.<init>(r14)
            throw r13
        La5:
            java.lang.String r13 = "You should Call MMKV.initialize() first."
            defpackage.C2264.m3676(r13)
            return r1
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
            r1 = this;
            r0 = 0
            r1.sync(r0)
            return
    }

    public native int ashmemFD();

    public native int ashmemMetaFD();

    public native void checkContentChangedByOuterProcess();

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor clear() {
            r0 = this;
            r0.clearAll()
            return r0
    }

    public native void clearAll();

    public native void clearAllWithKeepingSpace();

    public native void clearMemoryCache();

    public native void close();

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
            r1 = this;
            r0 = 1
            r1.sync(r0)
            return r0
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(java.lang.String r3) {
            r2 = this;
            long r0 = r2.nativeHandle
            boolean r2 = r2.containsKey(r0, r3)
            return r2
    }

    public native java.lang.String cryptKey();

    public native boolean disableAutoKeyExpire();

    public native void disableCompareBeforeSet();

    @Override // android.content.SharedPreferences
    public final android.content.SharedPreferences.Editor edit() {
            r0 = this;
            return r0
    }

    public native boolean enableAutoKeyExpire(int r1);

    @Override // android.content.SharedPreferences
    public final java.util.Map getAll() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Intentionally Not Supported. Use allKeys() instead, getAll() not implement because type-erasure inside mmkv"
            r1.<init>(r0)
            throw r1
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(java.lang.String r3, boolean r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            boolean r2 = r2.decodeBool(r0, r3, r4)
            return r2
    }

    public byte[] getBytes(java.lang.String r3, byte[] r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            byte[] r2 = r2.decodeBytes(r0, r3)
            if (r2 == 0) goto L9
            return r2
        L9:
            return r4
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(java.lang.String r3, float r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            float r2 = r2.decodeFloat(r0, r3, r4)
            return r2
    }

    @Override // android.content.SharedPreferences
    public final int getInt(java.lang.String r3, int r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            int r2 = r2.decodeInt(r0, r3, r4)
            return r2
    }

    @Override // android.content.SharedPreferences
    public final long getLong(java.lang.String r7, long r8) {
            r6 = this;
            long r1 = r6.nativeHandle
            r0 = r6
            r3 = r7
            r4 = r8
            long r6 = r0.decodeLong(r1, r3, r4)
            return r6
    }

    @Override // android.content.SharedPreferences
    public final java.lang.String getString(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            java.lang.String r2 = r2.decodeString(r0, r3, r4)
            return r2
    }

    @Override // android.content.SharedPreferences
    public final java.util.Set getStringSet(java.lang.String r4, java.util.Set r5) {
            r3 = this;
            java.lang.Class<java.util.HashSet> r0 = java.util.HashSet.class
            long r1 = r3.nativeHandle
            java.lang.String[] r3 = r3.decodeStringSet(r1, r4)
            if (r3 != 0) goto Lb
            goto L19
        Lb:
            java.lang.Object r4 = r0.newInstance()     // Catch: java.lang.Throwable -> L19
            java.util.Set r4 = (java.util.Set) r4     // Catch: java.lang.Throwable -> L19
            java.util.List r3 = java.util.Arrays.asList(r3)
            r4.addAll(r3)
            return r4
        L19:
            return r5
    }

    public native boolean isMultiProcess();

    public native boolean isReadOnly();

    public native void lock();

    public native java.lang.String mmapID();

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putBoolean(java.lang.String r3, boolean r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            r2.encodeBool(r0, r3, r4)
            return r2
    }

    public android.content.SharedPreferences.Editor putBytes(java.lang.String r3, byte[] r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            r2.encodeBytes(r0, r3, r4)
            return r2
    }

    public android.content.SharedPreferences.Editor putBytes(java.lang.String r7, byte[] r8, int r9) {
            r6 = this;
            long r1 = r6.nativeHandle
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r0.encodeBytes_2(r1, r3, r4, r5)
            return r0
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putFloat(java.lang.String r3, float r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            r2.encodeFloat(r0, r3, r4)
            return r2
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putInt(java.lang.String r3, int r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            r2.encodeInt(r0, r3, r4)
            return r2
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putLong(java.lang.String r7, long r8) {
            r6 = this;
            long r1 = r6.nativeHandle
            r0 = r6
            r3 = r7
            r4 = r8
            r0.encodeLong(r1, r3, r4)
            return r0
    }

    public android.content.SharedPreferences.Editor putLong(java.lang.String r8, long r9, int r11) {
            r7 = this;
            long r1 = r7.nativeHandle
            r0 = r7
            r3 = r8
            r4 = r9
            r6 = r11
            r0.encodeLong_2(r1, r3, r4, r6)
            return r0
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putString(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            r2.encodeString(r0, r3, r4)
            return r2
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putStringSet(java.lang.String r4, java.util.Set r5) {
            r3 = this;
            long r0 = r3.nativeHandle
            if (r5 != 0) goto L6
            r5 = 0
            goto Lf
        L6:
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r5 = r5.toArray(r2)
            java.lang.String[] r5 = (java.lang.String[]) r5
        Lf:
            r3.encodeSet(r0, r4, r5)
            return r3
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Intentionally Not implement in MMKV"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor remove(java.lang.String r3) {
            r2 = this;
            long r0 = r2.nativeHandle
            r2.removeValueForKey(r0, r3)
            return r2
    }

    public native void removeValuesForKeys(java.lang.String[] r1);

    public native void trim();

    public native boolean tryLock();

    public native void unlock();

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Intentionally Not implement in MMKV"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void m316() {
            r1 = this;
            r0 = 1
            r1.sync(r0)
            return
    }
}
