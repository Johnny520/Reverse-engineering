package com.tencent.mmkv;

/* JADX INFO: loaded from: classes2.dex */
public class MMKV implements android.content.SharedPreferences, android.content.SharedPreferences.Editor {
    private static final int ASHMEM_MODE = 8;
    private static final int BACKUP_MODE = 16;
    private static final int CONTEXT_MODE_MULTI_PROCESS = 4;
    public static final int ExpireInDay = 86400;
    public static final int ExpireInHour = 3600;
    public static final int ExpireInMinute = 60;
    public static final int ExpireInMonth = 2592000;
    public static final int ExpireInYear = 946080000;
    public static final int ExpireNever = 0;
    public static final int MULTI_PROCESS_MODE = 2;
    public static final int SINGLE_PROCESS_MODE = 1;
    private static final java.util.Set<java.lang.Long> checkedHandleSet = null;
    private static com.tencent.mmkv.MMKVHandler gCallbackHandler;
    private static com.tencent.mmkv.MMKVContentChangeNotification gContentChangeNotify;
    private static boolean gWantLogReDirecting;
    private static final com.tencent.mmkv.MMKVLogLevel[] index2LogLevel = null;
    private static boolean isProcessModeCheckerEnabled;
    private static final java.util.EnumMap<com.tencent.mmkv.MMKVLogLevel, java.lang.Integer> logLevel2Index = null;
    private static final java.util.HashMap<java.lang.String, android.os.Parcelable.Creator<?>> mCreators = null;
    private static final java.util.EnumMap<com.tencent.mmkv.MMKVRecoverStrategic, java.lang.Integer> recoverIndex = null;
    private static java.lang.String rootDir;
    private final long nativeHandle;

    /* JADX INFO: renamed from: com.tencent.mmkv.MMKV$1 */
    static /* synthetic */ class C04751 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$mmkv$MMKVLogLevel = null;

        static {
                com.tencent.mmkv.MMKVLogLevel[] r0 = com.tencent.mmkv.MMKVLogLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.tencent.mmkv.MMKV.C04751.$SwitchMap$com$tencent$mmkv$MMKVLogLevel = r0
                int[] r0 = com.tencent.mmkv.MMKV.C04751.$SwitchMap$com$tencent$mmkv$MMKVLogLevel     // Catch: java.lang.NoSuchFieldError -> L15
                com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelDebug     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.tencent.mmkv.MMKV.C04751.$SwitchMap$com$tencent$mmkv$MMKVLogLevel     // Catch: java.lang.NoSuchFieldError -> L22
                com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelWarning     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.tencent.mmkv.MMKV.C04751.$SwitchMap$com$tencent$mmkv$MMKVLogLevel     // Catch: java.lang.NoSuchFieldError -> L2f
                com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelError     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = com.tencent.mmkv.MMKV.C04751.$SwitchMap$com$tencent$mmkv$MMKVLogLevel     // Catch: java.lang.NoSuchFieldError -> L3c
                com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelNone     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                int[] r0 = com.tencent.mmkv.MMKV.C04751.$SwitchMap$com$tencent$mmkv$MMKVLogLevel     // Catch: java.lang.NoSuchFieldError -> L49
                com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelInfo     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
                goto L4a
            L49:
                r0 = move-exception
            L4a:
                return
        }
    }

    public interface LibLoader {
        void loadLibrary(java.lang.String r1);
    }

    static {
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.tencent.mmkv.MMKVRecoverStrategic> r1 = com.tencent.mmkv.MMKVRecoverStrategic.class
            r0.<init>(r1)
            com.tencent.mmkv.MMKV.recoverIndex = r0
            java.util.EnumMap<com.tencent.mmkv.MMKVRecoverStrategic, java.lang.Integer> r0 = com.tencent.mmkv.MMKV.recoverIndex
            com.tencent.mmkv.MMKVRecoverStrategic r1 = com.tencent.mmkv.MMKVRecoverStrategic.OnErrorDiscard
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r3)
            java.util.EnumMap<com.tencent.mmkv.MMKVRecoverStrategic, java.lang.Integer> r0 = com.tencent.mmkv.MMKV.recoverIndex
            com.tencent.mmkv.MMKVRecoverStrategic r1 = com.tencent.mmkv.MMKVRecoverStrategic.OnErrorRecover
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r0.put(r1, r5)
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.tencent.mmkv.MMKVLogLevel> r1 = com.tencent.mmkv.MMKVLogLevel.class
            r0.<init>(r1)
            com.tencent.mmkv.MMKV.logLevel2Index = r0
            java.util.EnumMap<com.tencent.mmkv.MMKVLogLevel, java.lang.Integer> r0 = com.tencent.mmkv.MMKV.logLevel2Index
            com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelDebug
            r0.put(r1, r3)
            java.util.EnumMap<com.tencent.mmkv.MMKVLogLevel, java.lang.Integer> r0 = com.tencent.mmkv.MMKV.logLevel2Index
            com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelInfo
            r0.put(r1, r5)
            java.util.EnumMap<com.tencent.mmkv.MMKVLogLevel, java.lang.Integer> r0 = com.tencent.mmkv.MMKV.logLevel2Index
            com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelWarning
            r3 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r5)
            java.util.EnumMap<com.tencent.mmkv.MMKVLogLevel, java.lang.Integer> r0 = com.tencent.mmkv.MMKV.logLevel2Index
            com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelError
            r5 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r0.put(r1, r6)
            java.util.EnumMap<com.tencent.mmkv.MMKVLogLevel, java.lang.Integer> r0 = com.tencent.mmkv.MMKV.logLevel2Index
            com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelNone
            r6 = 4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r0.put(r1, r7)
            r0 = 5
            com.tencent.mmkv.MMKVLogLevel[] r0 = new com.tencent.mmkv.MMKVLogLevel[r0]
            com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelDebug
            r0[r2] = r1
            com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelInfo
            r0[r4] = r1
            com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelWarning
            r0[r3] = r1
            com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelError
            r0[r5] = r1
            com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelNone
            r0[r6] = r1
            com.tencent.mmkv.MMKV.index2LogLevel = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.tencent.mmkv.MMKV.checkedHandleSet = r0
            r0 = 0
            com.tencent.mmkv.MMKV.rootDir = r0
            com.tencent.mmkv.MMKV.isProcessModeCheckerEnabled = r4
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.tencent.mmkv.MMKV.mCreators = r0
            com.tencent.mmkv.MMKV.gWantLogReDirecting = r2
            return
    }

    private MMKV(long r1) {
            r0 = this;
            r0.<init>()
            r0.nativeHandle = r1
            return
    }

    private native long actualSize(long r1);

    private native java.lang.String[] allKeys(long r1, boolean r3);

    public static com.tencent.mmkv.MMKV backedUpMMKVWithID(java.lang.String r7, int r8, java.lang.String r9, java.lang.String r10) throws java.lang.RuntimeException {
            java.lang.String r0 = com.tencent.mmkv.MMKV.rootDir
            if (r0 == 0) goto L15
            r8 = r8 | 16
            r5 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            long r0 = getMMKVWithID(r1, r2, r3, r4, r5)
            com.tencent.mmkv.MMKV r2 = checkProcessMode(r0, r7, r8)
            return r2
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You should Call MMKV.initialize() first."
            r0.<init>(r1)
            throw r0
    }

    public static native long backupAllToDirectory(java.lang.String r0);

    public static native boolean backupOneToDirectory(java.lang.String r0, java.lang.String r1, java.lang.String r2);

    private static com.tencent.mmkv.MMKV checkProcessMode(long r4, java.lang.String r6, int r7) throws java.lang.RuntimeException {
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L88
            boolean r0 = com.tencent.mmkv.MMKV.isProcessModeCheckerEnabled
            if (r0 != 0) goto L10
            com.tencent.mmkv.MMKV r0 = new com.tencent.mmkv.MMKV
            r0.<init>(r4)
            return r0
        L10:
            java.util.Set<java.lang.Long> r0 = com.tencent.mmkv.MMKV.checkedHandleSet
            monitor-enter(r0)
            java.util.Set<java.lang.Long> r1 = com.tencent.mmkv.MMKV.checkedHandleSet     // Catch: java.lang.Throwable -> L85
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L85
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L85
            if (r1 != 0) goto L7e
            boolean r1 = checkProcessMode(r4)     // Catch: java.lang.Throwable -> L85
            if (r1 != 0) goto L75
            r1 = 1
            if (r7 != r1) goto L42
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r1.<init>()     // Catch: java.lang.Throwable -> L85
            java.lang.String r2 = "Opening a multi-process MMKV instance ["
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L85
            java.lang.StringBuilder r1 = r1.append(r6)     // Catch: java.lang.Throwable -> L85
            java.lang.String r2 = "] with SINGLE_PROCESS_MODE!"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L85
            goto L6f
        L42:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r1.<init>()     // Catch: java.lang.Throwable -> L85
            java.lang.String r2 = "Opening an MMKV instance ["
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L85
            java.lang.StringBuilder r1 = r1.append(r6)     // Catch: java.lang.Throwable -> L85
            java.lang.String r2 = "] with MULTI_PROCESS_MODE, "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L85
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r2.<init>()     // Catch: java.lang.Throwable -> L85
            java.lang.StringBuilder r2 = r2.append(r1)     // Catch: java.lang.Throwable -> L85
            java.lang.String r3 = "while it's already been opened with SINGLE_PROCESS_MODE by someone somewhere else!"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L85
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L85
            r1 = r2
        L6f:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L85
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L85
            throw r2     // Catch: java.lang.Throwable -> L85
        L75:
            java.util.Set<java.lang.Long> r1 = com.tencent.mmkv.MMKV.checkedHandleSet     // Catch: java.lang.Throwable -> L85
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L85
            r1.add(r2)     // Catch: java.lang.Throwable -> L85
        L7e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L85
            com.tencent.mmkv.MMKV r0 = new com.tencent.mmkv.MMKV
            r0.<init>(r4)
            return r0
        L85:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L85
            throw r1
        L88:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fail to create an MMKV instance ["
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r2 = "] in JNI"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static native boolean checkProcessMode(long r0);

    private native boolean containsKey(long r1, java.lang.String r3);

    private native long count(long r1, boolean r3);

    private static native long createNB(int r0);

    public static com.tencent.mmkv.NativeBuffer createNativeBuffer(int r4) {
            long r0 = createNB(r4)
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto Lc
            r2 = 0
            return r2
        Lc:
            com.tencent.mmkv.NativeBuffer r2 = new com.tencent.mmkv.NativeBuffer
            r2.<init>(r0, r4)
            return r2
    }

    private native boolean decodeBool(long r1, java.lang.String r3, boolean r4);

    private native byte[] decodeBytes(long r1, java.lang.String r3);

    private native double decodeDouble(long r1, java.lang.String r3, double r4);

    private native float decodeFloat(long r1, java.lang.String r3, float r4);

    private native int decodeInt(long r1, java.lang.String r3, int r4);

    private native long decodeLong(long r1, java.lang.String r3, long r4);

    private native java.lang.String decodeString(long r1, java.lang.String r3, java.lang.String r4);

    private native java.lang.String[] decodeStringSet(long r1, java.lang.String r3);

    public static com.tencent.mmkv.MMKV defaultMMKV() throws java.lang.RuntimeException {
            java.lang.String r0 = com.tencent.mmkv.MMKV.rootDir
            if (r0 == 0) goto L11
            r0 = 0
            r1 = 1
            long r2 = getDefaultMMKV(r1, r0)
            java.lang.String r0 = "DefaultMMKV"
            com.tencent.mmkv.MMKV r0 = checkProcessMode(r2, r0, r1)
            return r0
        L11:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You should Call MMKV.initialize() first."
            r0.<init>(r1)
            throw r0
    }

    public static com.tencent.mmkv.MMKV defaultMMKV(int r3, java.lang.String r4) throws java.lang.RuntimeException {
            java.lang.String r0 = com.tencent.mmkv.MMKV.rootDir
            if (r0 == 0) goto Lf
            long r0 = getDefaultMMKV(r3, r4)
            java.lang.String r2 = "DefaultMMKV"
            com.tencent.mmkv.MMKV r2 = checkProcessMode(r0, r2, r3)
            return r2
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You should Call MMKV.initialize() first."
            r0.<init>(r1)
            throw r0
    }

    private static native void destroyNB(long r0, int r2);

    public static void destroyNativeBuffer(com.tencent.mmkv.NativeBuffer r3) {
            long r0 = r3.pointer
            int r2 = r3.size
            destroyNB(r0, r2)
            return
    }

    public static void disableProcessModeChecker() {
            java.util.Set<java.lang.Long> r0 = com.tencent.mmkv.MMKV.checkedHandleSet
            monitor-enter(r0)
            r1 = 0
            com.tencent.mmkv.MMKV.isProcessModeCheckerEnabled = r1     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r0 = "MMKV"
            java.lang.String r1 = "Disable checkProcessMode()"
            android.util.Log.i(r0, r1)
            return
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    private static java.lang.String doInitialize(java.lang.String r4, java.lang.String r5, com.tencent.mmkv.MMKV.LibLoader r6, com.tencent.mmkv.MMKVLogLevel r7, boolean r8) {
            java.lang.String r0 = "c++_shared"
            java.lang.String r1 = "mmkv"
            java.lang.String r2 = "SharedCpp"
            java.lang.String r3 = "DefaultCpp"
            if (r6 == 0) goto L17
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L13
            r6.loadLibrary(r0)
        L13:
            r6.loadLibrary(r1)
            goto L23
        L17:
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L20
            java.lang.System.loadLibrary(r0)
        L20:
            java.lang.System.loadLibrary(r1)
        L23:
            int r0 = logLevel2Int(r7)
            jniInitialize(r4, r5, r0, r8)
            com.tencent.mmkv.MMKV.rootDir = r4
            java.lang.String r0 = com.tencent.mmkv.MMKV.rootDir
            return r0
    }

    public static void enableProcessModeChecker() {
            java.util.Set<java.lang.Long> r0 = com.tencent.mmkv.MMKV.checkedHandleSet
            monitor-enter(r0)
            r1 = 1
            com.tencent.mmkv.MMKV.isProcessModeCheckerEnabled = r1     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r0 = "MMKV"
            java.lang.String r1 = "Enable checkProcessMode()"
            android.util.Log.i(r0, r1)
            return
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

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

    private static native long getDefaultMMKV(int r0, java.lang.String r1);

    private static native long getMMKVWithAshmemFD(java.lang.String r0, int r1, int r2, java.lang.String r3);

    private static native long getMMKVWithID(java.lang.String r0, int r1, java.lang.String r2, java.lang.String r3, long r4);

    private static native long getMMKVWithIDAndSize(java.lang.String r0, int r1, int r2, java.lang.String r3);

    private byte[] getParcelableByte(android.os.Parcelable r3) {
            r2 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r1 = 0
            r3.writeToParcel(r0, r1)
            byte[] r1 = r0.marshall()
            r0.recycle()
            return r1
    }

    public static java.lang.String getRootDir() {
            java.lang.String r0 = com.tencent.mmkv.MMKV.rootDir
            return r0
    }

    public static java.lang.String initialize(android.content.Context r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = r3.getFilesDir()
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "/mmkv"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelInfo
            r2 = 0
            java.lang.String r2 = initialize(r3, r0, r2, r1, r2)
            return r2
    }

    public static java.lang.String initialize(android.content.Context r3, com.tencent.mmkv.MMKV.LibLoader r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = r3.getFilesDir()
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "/mmkv"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelInfo
            r2 = 0
            java.lang.String r2 = initialize(r3, r0, r4, r1, r2)
            return r2
    }

    public static java.lang.String initialize(android.content.Context r2, com.tencent.mmkv.MMKV.LibLoader r3, com.tencent.mmkv.MMKVLogLevel r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = r2.getFilesDir()
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "/mmkv"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.String r1 = initialize(r2, r0, r3, r4, r1)
            return r1
    }

    public static java.lang.String initialize(android.content.Context r2, com.tencent.mmkv.MMKVLogLevel r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = r2.getFilesDir()
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "/mmkv"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.String r1 = initialize(r2, r0, r1, r3, r1)
            return r1
    }

    public static java.lang.String initialize(android.content.Context r2, java.lang.String r3) {
            com.tencent.mmkv.MMKVLogLevel r0 = com.tencent.mmkv.MMKVLogLevel.LevelInfo
            r1 = 0
            java.lang.String r1 = initialize(r2, r3, r1, r0, r1)
            return r1
    }

    public static java.lang.String initialize(android.content.Context r2, java.lang.String r3, com.tencent.mmkv.MMKV.LibLoader r4) {
            com.tencent.mmkv.MMKVLogLevel r0 = com.tencent.mmkv.MMKVLogLevel.LevelInfo
            r1 = 0
            java.lang.String r1 = initialize(r2, r3, r4, r0, r1)
            return r1
    }

    public static java.lang.String initialize(android.content.Context r1, java.lang.String r2, com.tencent.mmkv.MMKV.LibLoader r3, com.tencent.mmkv.MMKVLogLevel r4) {
            r0 = 0
            java.lang.String r0 = initialize(r1, r2, r3, r4, r0)
            return r0
    }

    public static java.lang.String initialize(android.content.Context r4, java.lang.String r5, com.tencent.mmkv.MMKV.LibLoader r6, com.tencent.mmkv.MMKVLogLevel r7, com.tencent.mmkv.MMKVHandler r8) {
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()
            int r0 = r0.flags
            r0 = r0 & 2
            if (r0 != 0) goto Le
            disableProcessModeChecker()
            goto L11
        Le:
            enableProcessModeChecker()
        L11:
            java.io.File r0 = r4.getCacheDir()
            java.lang.String r0 = r0.getAbsolutePath()
            com.tencent.mmkv.MMKV.gCallbackHandler = r8
            com.tencent.mmkv.MMKVHandler r1 = com.tencent.mmkv.MMKV.gCallbackHandler
            r2 = 1
            if (r1 == 0) goto L2a
            com.tencent.mmkv.MMKVHandler r1 = com.tencent.mmkv.MMKV.gCallbackHandler
            boolean r1 = r1.wantLogRedirecting()
            if (r1 == 0) goto L2a
            com.tencent.mmkv.MMKV.gWantLogReDirecting = r2
        L2a:
            boolean r1 = com.tencent.mmkv.MMKV.gWantLogReDirecting
            java.lang.String r1 = doInitialize(r5, r0, r6, r7, r1)
            com.tencent.mmkv.MMKVHandler r3 = com.tencent.mmkv.MMKV.gCallbackHandler
            if (r3 == 0) goto L39
            boolean r3 = com.tencent.mmkv.MMKV.gWantLogReDirecting
            setCallbackHandler(r3, r2)
        L39:
            return r1
    }

    public static java.lang.String initialize(android.content.Context r1, java.lang.String r2, com.tencent.mmkv.MMKVLogLevel r3) {
            r0 = 0
            java.lang.String r0 = initialize(r1, r2, r0, r3, r0)
            return r0
    }

    @java.lang.Deprecated
    public static java.lang.String initialize(java.lang.String r4) {
            com.tencent.mmkv.MMKVLogLevel r0 = com.tencent.mmkv.MMKVLogLevel.LevelInfo
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = "/.tmp"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            r3 = 0
            java.lang.String r1 = doInitialize(r4, r1, r2, r0, r3)
            return r1
    }

    @java.lang.Deprecated
    public static java.lang.String initialize(java.lang.String r3, com.tencent.mmkv.MMKV.LibLoader r4) {
            com.tencent.mmkv.MMKVLogLevel r0 = com.tencent.mmkv.MMKVLogLevel.LevelInfo
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = "/.tmp"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.String r1 = doInitialize(r3, r1, r4, r0, r2)
            return r1
    }

    @java.lang.Deprecated
    public static java.lang.String initialize(java.lang.String r2, com.tencent.mmkv.MMKV.LibLoader r3, com.tencent.mmkv.MMKVLogLevel r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = "/.tmp"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.String r0 = doInitialize(r2, r0, r3, r4, r1)
            return r0
    }

    @java.lang.Deprecated
    public static java.lang.String initialize(java.lang.String r3, com.tencent.mmkv.MMKVLogLevel r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = "/.tmp"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            r2 = 0
            java.lang.String r0 = doInitialize(r3, r0, r1, r4, r2)
            return r0
    }

    private native boolean isCompareBeforeSetEnabled();

    @dalvik.annotation.optimization.FastNative
    private native boolean isEncryptionEnabled();

    @dalvik.annotation.optimization.FastNative
    private native boolean isExpirationEnabled();

    public static boolean isFileValid(java.lang.String r1) {
            r0 = 0
            boolean r0 = isFileValid(r1, r0)
            return r0
    }

    public static native boolean isFileValid(java.lang.String r0, java.lang.String r1);

    private static native void jniInitialize(java.lang.String r0, java.lang.String r1, int r2, boolean r3);

    private static int logLevel2Int(com.tencent.mmkv.MMKVLogLevel r2) {
            int[] r0 = com.tencent.mmkv.MMKV.C04751.$SwitchMap$com$tencent$mmkv$MMKVLogLevel
            int r1 = r2.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L13;
                case 2: goto L11;
                case 3: goto Lf;
                case 4: goto Ld;
                default: goto Lb;
            }
        Lb:
            r0 = 1
            goto L15
        Ld:
            r0 = 4
            goto L15
        Lf:
            r0 = 3
            goto L15
        L11:
            r0 = 2
            goto L15
        L13:
            r0 = 0
        L15:
            return r0
    }

    private static void mmkvLogImp(int r7, java.lang.String r8, int r9, java.lang.String r10, java.lang.String r11) {
            com.tencent.mmkv.MMKVHandler r0 = com.tencent.mmkv.MMKV.gCallbackHandler
            if (r0 == 0) goto L16
            boolean r0 = com.tencent.mmkv.MMKV.gWantLogReDirecting
            if (r0 == 0) goto L16
            com.tencent.mmkv.MMKVHandler r1 = com.tencent.mmkv.MMKV.gCallbackHandler
            com.tencent.mmkv.MMKVLogLevel[] r0 = com.tencent.mmkv.MMKV.index2LogLevel
            r2 = r0[r7]
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.mmkvLog(r2, r3, r4, r5, r6)
            goto L38
        L16:
            int[] r0 = com.tencent.mmkv.MMKV.C04751.$SwitchMap$com$tencent$mmkv$MMKVLogLevel
            com.tencent.mmkv.MMKVLogLevel[] r1 = com.tencent.mmkv.MMKV.index2LogLevel
            r1 = r1[r7]
            int r1 = r1.ordinal()
            r0 = r0[r1]
            java.lang.String r1 = "MMKV"
            switch(r0) {
                case 1: goto L34;
                case 2: goto L30;
                case 3: goto L2c;
                case 4: goto L27;
                case 5: goto L28;
                default: goto L27;
            }
        L27:
            goto L38
        L28:
            android.util.Log.i(r1, r11)
            goto L38
        L2c:
            android.util.Log.e(r1, r11)
            goto L38
        L30:
            android.util.Log.w(r1, r11)
            goto L38
        L34:
            android.util.Log.d(r1, r11)
        L38:
            return
    }

    public static com.tencent.mmkv.MMKV mmkvWithAshmemFD(java.lang.String r5, int r6, int r7, java.lang.String r8) throws java.lang.RuntimeException {
            long r0 = getMMKVWithAshmemFD(r5, r6, r7, r8)
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L10
            com.tencent.mmkv.MMKV r2 = new com.tencent.mmkv.MMKV
            r2.<init>(r0)
            return r2
        L10:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Fail to create an ashmem MMKV instance ["
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r4 = "] in JNI"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public static com.tencent.mmkv.MMKV mmkvWithAshmemID(android.content.Context r10, java.lang.String r11, int r12, int r13, java.lang.String r14) throws java.lang.RuntimeException {
            java.lang.String r0 = com.tencent.mmkv.MMKV.rootDir
            if (r0 == 0) goto Lfa
            int r0 = android.os.Process.myPid()
            java.lang.String r0 = com.tencent.mmkv.MMKVContentProvider.getProcessNameByPID(r10, r0)
            if (r0 == 0) goto Led
            int r1 = r0.length()
            if (r1 == 0) goto Led
            java.lang.String r1 = ":"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto Lb5
            android.net.Uri r1 = com.tencent.mmkv.MMKVContentProvider.contentUri(r10)
            if (r1 == 0) goto La8
            com.tencent.mmkv.MMKVLogLevel r2 = com.tencent.mmkv.MMKVLogLevel.LevelInfo
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "getting parcelable mmkv in process, Uri = "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            simpleLog(r2, r3)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "KEY_SIZE"
            r2.putInt(r3, r12)
            java.lang.String r3 = "KEY_MODE"
            r2.putInt(r3, r13)
            if (r14 == 0) goto L50
            java.lang.String r3 = "KEY_CRYPT"
            r2.putString(r3, r14)
        L50:
            android.content.ContentResolver r3 = r10.getContentResolver()
            java.lang.String r4 = "mmkvFromAshmemID"
            android.os.Bundle r4 = r3.call(r1, r4, r11, r2)
            if (r4 == 0) goto Lb5
            java.lang.Class<com.tencent.mmkv.ParcelableMMKV> r5 = com.tencent.mmkv.ParcelableMMKV.class
            java.lang.ClassLoader r5 = r5.getClassLoader()
            r4.setClassLoader(r5)
            java.lang.String r5 = "KEY"
            android.os.Parcelable r5 = r4.getParcelable(r5)
            com.tencent.mmkv.ParcelableMMKV r5 = (com.tencent.mmkv.ParcelableMMKV) r5
            if (r5 == 0) goto Lb5
            com.tencent.mmkv.MMKV r6 = r5.toMMKV()
            if (r6 == 0) goto Lb5
            com.tencent.mmkv.MMKVLogLevel r7 = com.tencent.mmkv.MMKVLogLevel.LevelInfo
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r6.mmapID()
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r9 = " fd = "
            java.lang.StringBuilder r8 = r8.append(r9)
            int r9 = r6.ashmemFD()
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r9 = ", meta fd = "
            java.lang.StringBuilder r8 = r8.append(r9)
            int r9 = r6.ashmemMetaFD()
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            simpleLog(r7, r8)
            return r6
        La8:
            java.lang.String r2 = "MMKVContentProvider has invalid authority"
            com.tencent.mmkv.MMKVLogLevel r3 = com.tencent.mmkv.MMKVLogLevel.LevelError
            simpleLog(r3, r2)
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r2)
            throw r3
        Lb5:
            com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelInfo
            java.lang.String r2 = "getting mmkv in main process"
            simpleLog(r1, r2)
            r13 = r13 | 8
            long r1 = getMMKVWithIDAndSize(r11, r12, r13, r14)
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto Lce
            com.tencent.mmkv.MMKV r3 = new com.tencent.mmkv.MMKV
            r3.<init>(r1)
            return r3
        Lce:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Fail to create an Ashmem MMKV instance ["
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r11)
            java.lang.String r5 = "]"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        Led:
            java.lang.String r1 = "process name detect fail, try again later"
            com.tencent.mmkv.MMKVLogLevel r2 = com.tencent.mmkv.MMKVLogLevel.LevelError
            simpleLog(r2, r1)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r1)
            throw r2
        Lfa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You should Call MMKV.initialize() first."
            r0.<init>(r1)
            throw r0
    }

    public static com.tencent.mmkv.MMKV mmkvWithID(java.lang.String r7) throws java.lang.RuntimeException {
            java.lang.String r0 = com.tencent.mmkv.MMKV.rootDir
            if (r0 == 0) goto L13
            r4 = 0
            r5 = 0
            r2 = 1
            r3 = 0
            r1 = r7
            long r0 = getMMKVWithID(r1, r2, r3, r4, r5)
            com.tencent.mmkv.MMKV r2 = checkProcessMode(r0, r7, r2)
            return r2
        L13:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You should Call MMKV.initialize() first."
            r0.<init>(r1)
            throw r0
    }

    public static com.tencent.mmkv.MMKV mmkvWithID(java.lang.String r7, int r8) throws java.lang.RuntimeException {
            java.lang.String r0 = com.tencent.mmkv.MMKV.rootDir
            if (r0 == 0) goto L13
            r4 = 0
            r5 = 0
            r3 = 0
            r1 = r7
            r2 = r8
            long r0 = getMMKVWithID(r1, r2, r3, r4, r5)
            com.tencent.mmkv.MMKV r2 = checkProcessMode(r0, r7, r8)
            return r2
        L13:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You should Call MMKV.initialize() first."
            r0.<init>(r1)
            throw r0
    }

    public static com.tencent.mmkv.MMKV mmkvWithID(java.lang.String r7, int r8, long r9) throws java.lang.RuntimeException {
            java.lang.String r0 = com.tencent.mmkv.MMKV.rootDir
            if (r0 == 0) goto L12
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r5 = r9
            long r0 = getMMKVWithID(r1, r2, r3, r4, r5)
            com.tencent.mmkv.MMKV r2 = checkProcessMode(r0, r7, r8)
            return r2
        L12:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You should Call MMKV.initialize() first."
            r0.<init>(r1)
            throw r0
    }

    public static com.tencent.mmkv.MMKV mmkvWithID(java.lang.String r7, int r8, java.lang.String r9) throws java.lang.RuntimeException {
            java.lang.String r0 = com.tencent.mmkv.MMKV.rootDir
            if (r0 == 0) goto L13
            r4 = 0
            r5 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            long r0 = getMMKVWithID(r1, r2, r3, r4, r5)
            com.tencent.mmkv.MMKV r2 = checkProcessMode(r0, r7, r8)
            return r2
        L13:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You should Call MMKV.initialize() first."
            r0.<init>(r1)
            throw r0
    }

    public static com.tencent.mmkv.MMKV mmkvWithID(java.lang.String r7, int r8, java.lang.String r9, java.lang.String r10) throws java.lang.RuntimeException {
            java.lang.String r0 = com.tencent.mmkv.MMKV.rootDir
            if (r0 == 0) goto L13
            r5 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            long r0 = getMMKVWithID(r1, r2, r3, r4, r5)
            com.tencent.mmkv.MMKV r2 = checkProcessMode(r0, r7, r8)
            return r2
        L13:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You should Call MMKV.initialize() first."
            r0.<init>(r1)
            throw r0
    }

    public static com.tencent.mmkv.MMKV mmkvWithID(java.lang.String r3, int r4, java.lang.String r5, java.lang.String r6, long r7) throws java.lang.RuntimeException {
            java.lang.String r0 = com.tencent.mmkv.MMKV.rootDir
            if (r0 == 0) goto Ld
            long r0 = getMMKVWithID(r3, r4, r5, r6, r7)
            com.tencent.mmkv.MMKV r2 = checkProcessMode(r0, r3, r4)
            return r2
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You should Call MMKV.initialize() first."
            r0.<init>(r1)
            throw r0
    }

    public static com.tencent.mmkv.MMKV mmkvWithID(java.lang.String r7, java.lang.String r8) throws java.lang.RuntimeException {
            java.lang.String r0 = com.tencent.mmkv.MMKV.rootDir
            if (r0 == 0) goto L13
            r3 = 0
            r5 = 0
            r2 = 1
            r1 = r7
            r4 = r8
            long r0 = getMMKVWithID(r1, r2, r3, r4, r5)
            com.tencent.mmkv.MMKV r2 = checkProcessMode(r0, r7, r2)
            return r2
        L13:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You should Call MMKV.initialize() first."
            r0.<init>(r1)
            throw r0
    }

    public static com.tencent.mmkv.MMKV mmkvWithID(java.lang.String r7, java.lang.String r8, long r9) throws java.lang.RuntimeException {
            java.lang.String r0 = com.tencent.mmkv.MMKV.rootDir
            if (r0 == 0) goto L12
            r2 = 1
            r3 = 0
            r1 = r7
            r4 = r8
            r5 = r9
            long r0 = getMMKVWithID(r1, r2, r3, r4, r5)
            com.tencent.mmkv.MMKV r2 = checkProcessMode(r0, r7, r2)
            return r2
        L12:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You should Call MMKV.initialize() first."
            r0.<init>(r1)
            throw r0
    }

    @dalvik.annotation.optimization.FastNative
    private native void nativeEnableCompareBeforeSet();

    private static void onContentChangedByOuterProcess(java.lang.String r1) {
            com.tencent.mmkv.MMKVContentChangeNotification r0 = com.tencent.mmkv.MMKV.gContentChangeNotify
            if (r0 == 0) goto L9
            com.tencent.mmkv.MMKVContentChangeNotification r0 = com.tencent.mmkv.MMKV.gContentChangeNotify
            r0.onContentChangedByOuterProcess(r1)
        L9:
            return
    }

    public static native void onExit();

    private static int onMMKVCRCCheckFail(java.lang.String r4) {
            com.tencent.mmkv.MMKVRecoverStrategic r0 = com.tencent.mmkv.MMKVRecoverStrategic.OnErrorDiscard
            com.tencent.mmkv.MMKVHandler r1 = com.tencent.mmkv.MMKV.gCallbackHandler
            if (r1 == 0) goto Lc
            com.tencent.mmkv.MMKVHandler r1 = com.tencent.mmkv.MMKV.gCallbackHandler
            com.tencent.mmkv.MMKVRecoverStrategic r0 = r1.onMMKVCRCCheckFail(r4)
        Lc:
            com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelInfo
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Recover strategic for "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = " is "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            simpleLog(r1, r2)
            java.util.EnumMap<com.tencent.mmkv.MMKVRecoverStrategic, java.lang.Integer> r1 = com.tencent.mmkv.MMKV.recoverIndex
            java.lang.Object r1 = r1.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L3a
            r2 = 0
            goto L3e
        L3a:
            int r2 = r1.intValue()
        L3e:
            return r2
    }

    private static int onMMKVFileLengthError(java.lang.String r4) {
            com.tencent.mmkv.MMKVRecoverStrategic r0 = com.tencent.mmkv.MMKVRecoverStrategic.OnErrorDiscard
            com.tencent.mmkv.MMKVHandler r1 = com.tencent.mmkv.MMKV.gCallbackHandler
            if (r1 == 0) goto Lc
            com.tencent.mmkv.MMKVHandler r1 = com.tencent.mmkv.MMKV.gCallbackHandler
            com.tencent.mmkv.MMKVRecoverStrategic r0 = r1.onMMKVFileLengthError(r4)
        Lc:
            com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelInfo
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Recover strategic for "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = " is "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            simpleLog(r1, r2)
            java.util.EnumMap<com.tencent.mmkv.MMKVRecoverStrategic, java.lang.Integer> r1 = com.tencent.mmkv.MMKV.recoverIndex
            java.lang.Object r1 = r1.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L3a
            r2 = 0
            goto L3e
        L3a:
            int r2 = r1.intValue()
        L3e:
            return r2
    }

    public static native int pageSize();

    public static void registerContentChangeNotify(com.tencent.mmkv.MMKVContentChangeNotification r1) {
            com.tencent.mmkv.MMKV.gContentChangeNotify = r1
            com.tencent.mmkv.MMKVContentChangeNotification r0 = com.tencent.mmkv.MMKV.gContentChangeNotify
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            setWantsContentChangeNotify(r0)
            return
    }

    public static void registerHandler(com.tencent.mmkv.MMKVHandler r2) {
            com.tencent.mmkv.MMKV.gCallbackHandler = r2
            com.tencent.mmkv.MMKVHandler r0 = com.tencent.mmkv.MMKV.gCallbackHandler
            boolean r0 = r0.wantLogRedirecting()
            com.tencent.mmkv.MMKV.gWantLogReDirecting = r0
            boolean r0 = com.tencent.mmkv.MMKV.gWantLogReDirecting
            r1 = 1
            setCallbackHandler(r0, r1)
            return
    }

    public static boolean removeStorage(java.lang.String r1) {
            r0 = 0
            boolean r0 = removeStorage(r1, r0)
            return r0
    }

    public static native boolean removeStorage(java.lang.String r0, java.lang.String r1);

    private native void removeValueForKey(long r1, java.lang.String r3);

    public static native long restoreAllFromDirectory(java.lang.String r0);

    public static native boolean restoreOneMMKVFromDirectory(java.lang.String r0, java.lang.String r1, java.lang.String r2);

    private static native void setCallbackHandler(boolean r0, boolean r1);

    private static native void setLogLevel(int r0);

    public static void setLogLevel(com.tencent.mmkv.MMKVLogLevel r1) {
            int r0 = logLevel2Int(r1)
            setLogLevel(r0)
            return
    }

    private static native void setWantsContentChangeNotify(boolean r0);

    private static void simpleLog(com.tencent.mmkv.MMKVLogLevel r7, java.lang.String r8) {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            int r1 = r0.length
            int r1 = r1 + (-1)
            r1 = r0[r1]
            java.util.EnumMap<com.tencent.mmkv.MMKVLogLevel, java.lang.Integer> r2 = com.tencent.mmkv.MMKV.logLevel2Index
            java.lang.Object r2 = r2.get(r7)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L19
            r3 = 0
            goto L1d
        L19:
            int r3 = r2.intValue()
        L1d:
            java.lang.String r4 = r1.getFileName()
            int r5 = r1.getLineNumber()
            java.lang.String r6 = r1.getMethodName()
            mmkvLogImp(r3, r4, r5, r6, r8)
            return
    }

    private native void sync(boolean r1);

    private native long totalSize(long r1);

    public static void unregisterContentChangeNotify() {
            r0 = 0
            com.tencent.mmkv.MMKV.gContentChangeNotify = r0
            r0 = 0
            setWantsContentChangeNotify(r0)
            return
    }

    public static void unregisterHandler() {
            r0 = 0
            com.tencent.mmkv.MMKV.gCallbackHandler = r0
            r0 = 0
            setCallbackHandler(r0, r0)
            com.tencent.mmkv.MMKV.gWantLogReDirecting = r0
            return
    }

    private native int valueSize(long r1, java.lang.String r3, boolean r4);

    public static native java.lang.String version();

    private native int writeValueToNB(long r1, java.lang.String r3, long r4, int r6);

    public long actualSize() {
            r2 = this;
            long r0 = r2.nativeHandle
            long r0 = r2.actualSize(r0)
            return r0
    }

    public java.lang.String[] allKeys() {
            r3 = this;
            long r0 = r3.nativeHandle
            r2 = 0
            java.lang.String[] r0 = r3.allKeys(r0, r2)
            return r0
    }

    public java.lang.String[] allNonExpireKeys() {
            r3 = this;
            long r0 = r3.nativeHandle
            r2 = 1
            java.lang.String[] r0 = r3.allKeys(r0, r2)
            return r0
    }

    @Override // android.content.SharedPreferences.Editor
    @java.lang.Deprecated
    public void apply() {
            r1 = this;
            r0 = 0
            r1.sync(r0)
            return
    }

    public native int ashmemFD();

    public native int ashmemMetaFD();

    public void async() {
            r1 = this;
            r0 = 0
            r1.sync(r0)
            return
    }

    public native void checkContentChangedByOuterProcess();

    public native void checkReSetCryptKey(java.lang.String r1);

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor clear() {
            r0 = this;
            r0.clearAll()
            return r0
    }

    public native void clearAll();

    public native void clearAllWithKeepingSpace();

    public native void clearMemoryCache();

    public native void close();

    @Override // android.content.SharedPreferences.Editor
    @java.lang.Deprecated
    public boolean commit() {
            r1 = this;
            r0 = 1
            r1.sync(r0)
            return r0
    }

    @Override // android.content.SharedPreferences
    public boolean contains(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.containsKey(r2)
            return r0
    }

    public boolean containsKey(java.lang.String r3) {
            r2 = this;
            long r0 = r2.nativeHandle
            boolean r0 = r2.containsKey(r0, r3)
            return r0
    }

    public long count() {
            r3 = this;
            long r0 = r3.nativeHandle
            r2 = 0
            long r0 = r3.count(r0, r2)
            return r0
    }

    public long countNonExpiredKeys() {
            r3 = this;
            long r0 = r3.nativeHandle
            r2 = 1
            long r0 = r3.count(r0, r2)
            return r0
    }

    public native java.lang.String cryptKey();

    public boolean decodeBool(java.lang.String r4) {
            r3 = this;
            long r0 = r3.nativeHandle
            r2 = 0
            boolean r0 = r3.decodeBool(r0, r4, r2)
            return r0
    }

    public boolean decodeBool(java.lang.String r3, boolean r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            boolean r0 = r2.decodeBool(r0, r3, r4)
            return r0
    }

    public byte[] decodeBytes(java.lang.String r2) {
            r1 = this;
            r0 = 0
            byte[] r0 = r1.decodeBytes(r2, r0)
            return r0
    }

    public byte[] decodeBytes(java.lang.String r3, byte[] r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            byte[] r0 = r2.decodeBytes(r0, r3)
            if (r0 == 0) goto La
            r1 = r0
            goto Lb
        La:
            r1 = r4
        Lb:
            return r1
    }

    public double decodeDouble(java.lang.String r7) {
            r6 = this;
            long r1 = r6.nativeHandle
            r4 = 0
            r0 = r6
            r3 = r7
            double r0 = r0.decodeDouble(r1, r3, r4)
            return r0
    }

    public double decodeDouble(java.lang.String r7, double r8) {
            r6 = this;
            long r1 = r6.nativeHandle
            r0 = r6
            r3 = r7
            r4 = r8
            double r0 = r0.decodeDouble(r1, r3, r4)
            return r0
    }

    public float decodeFloat(java.lang.String r4) {
            r3 = this;
            long r0 = r3.nativeHandle
            r2 = 0
            float r0 = r3.decodeFloat(r0, r4, r2)
            return r0
    }

    public float decodeFloat(java.lang.String r3, float r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            float r0 = r2.decodeFloat(r0, r3, r4)
            return r0
    }

    public int decodeInt(java.lang.String r4) {
            r3 = this;
            long r0 = r3.nativeHandle
            r2 = 0
            int r0 = r3.decodeInt(r0, r4, r2)
            return r0
    }

    public int decodeInt(java.lang.String r3, int r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            int r0 = r2.decodeInt(r0, r3, r4)
            return r0
    }

    public long decodeLong(java.lang.String r7) {
            r6 = this;
            long r1 = r6.nativeHandle
            r4 = 0
            r0 = r6
            r3 = r7
            long r0 = r0.decodeLong(r1, r3, r4)
            return r0
    }

    public long decodeLong(java.lang.String r7, long r8) {
            r6 = this;
            long r1 = r6.nativeHandle
            r0 = r6
            r3 = r7
            r4 = r8
            long r0 = r0.decodeLong(r1, r3, r4)
            return r0
    }

    public <T extends android.os.Parcelable> T decodeParcelable(java.lang.String r2, java.lang.Class<T> r3) {
            r1 = this;
            r0 = 0
            android.os.Parcelable r0 = r1.decodeParcelable(r2, r3, r0)
            return r0
    }

    public <T extends android.os.Parcelable> T decodeParcelable(java.lang.String r8, java.lang.Class<T> r9, T r10) {
            r7 = this;
            if (r9 != 0) goto L3
            return r10
        L3:
            long r0 = r7.nativeHandle
            byte[] r0 = r7.decodeBytes(r0, r8)
            if (r0 != 0) goto Lc
            return r10
        Lc:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r0.length
            r3 = 0
            r1.unmarshall(r0, r3, r2)
            r1.setDataPosition(r3)
            java.lang.String r2 = r9.toString()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            java.util.HashMap<java.lang.String, android.os.Parcelable$Creator<?>> r3 = com.tencent.mmkv.MMKV.mCreators     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            java.util.HashMap<java.lang.String, android.os.Parcelable$Creator<?>> r4 = com.tencent.mmkv.MMKV.mCreators     // Catch: java.lang.Throwable -> L64
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L64
            android.os.Parcelable$Creator r4 = (android.os.Parcelable.Creator) r4     // Catch: java.lang.Throwable -> L64
            if (r4 != 0) goto L3e
            java.lang.String r5 = "CREATOR"
            java.lang.reflect.Field r5 = r9.getField(r5)     // Catch: java.lang.Throwable -> L64
            r6 = 0
            java.lang.Object r6 = r5.get(r6)     // Catch: java.lang.Throwable -> L64
            android.os.Parcelable$Creator r6 = (android.os.Parcelable.Creator) r6     // Catch: java.lang.Throwable -> L64
            r4 = r6
            if (r4 == 0) goto L3e
            java.util.HashMap<java.lang.String, android.os.Parcelable$Creator<?>> r6 = com.tencent.mmkv.MMKV.mCreators     // Catch: java.lang.Throwable -> L64
            r6.put(r2, r4)     // Catch: java.lang.Throwable -> L64
        L3e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L64
            if (r4 == 0) goto L4b
            java.lang.Object r3 = r4.createFromParcel(r1)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            android.os.Parcelable r3 = (android.os.Parcelable) r3     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            r1.recycle()
            return r3
        L4b:
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            r5.<init>()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            java.lang.String r6 = "Parcelable protocol requires a non-null static Parcelable.Creator object called CREATOR on class "
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            java.lang.StringBuilder r5 = r5.append(r2)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            throw r3     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
        L64:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L64
            throw r4     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
        L67:
            r2 = move-exception
            goto L78
        L69:
            r2 = move-exception
            com.tencent.mmkv.MMKVLogLevel r3 = com.tencent.mmkv.MMKVLogLevel.LevelError     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L67
            simpleLog(r3, r4)     // Catch: java.lang.Throwable -> L67
            r1.recycle()
            return r10
        L78:
            r1.recycle()
            throw r2
    }

    public java.lang.String decodeString(java.lang.String r4) {
            r3 = this;
            long r0 = r3.nativeHandle
            r2 = 0
            java.lang.String r0 = r3.decodeString(r0, r4, r2)
            return r0
    }

    public java.lang.String decodeString(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            java.lang.String r0 = r2.decodeString(r0, r3, r4)
            return r0
    }

    public java.util.Set<java.lang.String> decodeStringSet(java.lang.String r2) {
            r1 = this;
            r0 = 0
            java.util.Set r0 = r1.decodeStringSet(r2, r0)
            return r0
    }

    public java.util.Set<java.lang.String> decodeStringSet(java.lang.String r2, java.util.Set<java.lang.String> r3) {
            r1 = this;
            java.lang.Class<java.util.HashSet> r0 = java.util.HashSet.class
            java.util.Set r0 = r1.decodeStringSet(r2, r3, r0)
            return r0
    }

    public java.util.Set<java.lang.String> decodeStringSet(java.lang.String r4, java.util.Set<java.lang.String> r5, java.lang.Class<? extends java.util.Set> r6) {
            r3 = this;
            long r0 = r3.nativeHandle
            java.lang.String[] r0 = r3.decodeStringSet(r0, r4)
            if (r0 != 0) goto L9
            return r5
        L9:
            java.lang.Object r1 = r6.newInstance()     // Catch: java.lang.InstantiationException -> L18 java.lang.IllegalAccessException -> L1a
            java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.InstantiationException -> L18 java.lang.IllegalAccessException -> L1a
            java.util.List r2 = java.util.Arrays.asList(r0)
            r1.addAll(r2)
            return r1
        L18:
            r1 = move-exception
            return r5
        L1a:
            r1 = move-exception
            return r5
    }

    public native boolean disableAutoKeyExpire();

    public native void disableCompareBeforeSet();

    @Override // android.content.SharedPreferences
    public android.content.SharedPreferences.Editor edit() {
            r0 = this;
            return r0
    }

    public native boolean enableAutoKeyExpire(int r1);

    public void enableCompareBeforeSet() {
            r2 = this;
            boolean r0 = r2.isExpirationEnabled()
            java.lang.String r1 = "MMKV"
            if (r0 == 0) goto Ld
            java.lang.String r0 = "enableCompareBeforeSet is invalid when Expiration is on"
            android.util.Log.e(r1, r0)
        Ld:
            boolean r0 = r2.isEncryptionEnabled()
            if (r0 == 0) goto L18
            java.lang.String r0 = "enableCompareBeforeSet is invalid when key encryption is on"
            android.util.Log.e(r1, r0)
        L18:
            r2.nativeEnableCompareBeforeSet()
            return
    }

    public boolean encode(java.lang.String r7, double r8) {
            r6 = this;
            long r1 = r6.nativeHandle
            r0 = r6
            r3 = r7
            r4 = r8
            boolean r0 = r0.encodeDouble(r1, r3, r4)
            return r0
    }

    public boolean encode(java.lang.String r8, double r9, int r11) {
            r7 = this;
            long r1 = r7.nativeHandle
            r0 = r7
            r3 = r8
            r4 = r9
            r6 = r11
            boolean r0 = r0.encodeDouble_2(r1, r3, r4, r6)
            return r0
    }

    public boolean encode(java.lang.String r3, float r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            boolean r0 = r2.encodeFloat(r0, r3, r4)
            return r0
    }

    public boolean encode(java.lang.String r7, float r8, int r9) {
            r6 = this;
            long r1 = r6.nativeHandle
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            boolean r0 = r0.encodeFloat_2(r1, r3, r4, r5)
            return r0
    }

    public boolean encode(java.lang.String r3, int r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            boolean r0 = r2.encodeInt(r0, r3, r4)
            return r0
    }

    public boolean encode(java.lang.String r7, int r8, int r9) {
            r6 = this;
            long r1 = r6.nativeHandle
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            boolean r0 = r0.encodeInt_2(r1, r3, r4, r5)
            return r0
    }

    public boolean encode(java.lang.String r7, long r8) {
            r6 = this;
            long r1 = r6.nativeHandle
            r0 = r6
            r3 = r7
            r4 = r8
            boolean r0 = r0.encodeLong(r1, r3, r4)
            return r0
    }

    public boolean encode(java.lang.String r8, long r9, int r11) {
            r7 = this;
            long r1 = r7.nativeHandle
            r0 = r7
            r3 = r8
            r4 = r9
            r6 = r11
            boolean r0 = r0.encodeLong_2(r1, r3, r4, r6)
            return r0
    }

    public boolean encode(java.lang.String r4, android.os.Parcelable r5) {
            r3 = this;
            if (r5 != 0) goto La
            long r0 = r3.nativeHandle
            r2 = 0
            boolean r0 = r3.encodeBytes(r0, r4, r2)
            return r0
        La:
            byte[] r0 = r3.getParcelableByte(r5)
            long r1 = r3.nativeHandle
            boolean r1 = r3.encodeBytes(r1, r4, r0)
            return r1
    }

    public boolean encode(java.lang.String r8, android.os.Parcelable r9, int r10) {
            r7 = this;
            if (r9 != 0) goto Ld
            long r1 = r7.nativeHandle
            r4 = 0
            r0 = r7
            r3 = r8
            r5 = r10
            boolean r0 = r0.encodeBytes_2(r1, r3, r4, r5)
            return r0
        Ld:
            byte[] r0 = r7.getParcelableByte(r9)
            long r2 = r7.nativeHandle
            r1 = r7
            r4 = r8
            r5 = r0
            r6 = r10
            boolean r1 = r1.encodeBytes_2(r2, r4, r5, r6)
            return r1
    }

    public boolean encode(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            boolean r0 = r2.encodeString(r0, r3, r4)
            return r0
    }

    public boolean encode(java.lang.String r7, java.lang.String r8, int r9) {
            r6 = this;
            long r1 = r6.nativeHandle
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            boolean r0 = r0.encodeString_2(r1, r3, r4, r5)
            return r0
    }

    public boolean encode(java.lang.String r4, java.util.Set<java.lang.String> r5) {
            r3 = this;
            long r0 = r3.nativeHandle
            if (r5 != 0) goto L6
            r2 = 0
            goto Lf
        L6:
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r2 = r5.toArray(r2)
            java.lang.String[] r2 = (java.lang.String[]) r2
        Lf:
            boolean r0 = r3.encodeSet(r0, r4, r2)
            return r0
    }

    public boolean encode(java.lang.String r7, java.util.Set<java.lang.String> r8, int r9) {
            r6 = this;
            long r1 = r6.nativeHandle
            if (r8 != 0) goto L6
            r0 = 0
            goto Lf
        L6:
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r8.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
        Lf:
            r4 = r0
            r0 = r6
            r3 = r7
            r5 = r9
            boolean r0 = r0.encodeSet_2(r1, r3, r4, r5)
            return r0
    }

    public boolean encode(java.lang.String r3, boolean r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            boolean r0 = r2.encodeBool(r0, r3, r4)
            return r0
    }

    public boolean encode(java.lang.String r7, boolean r8, int r9) {
            r6 = this;
            long r1 = r6.nativeHandle
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            boolean r0 = r0.encodeBool_2(r1, r3, r4, r5)
            return r0
    }

    public boolean encode(java.lang.String r3, byte[] r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            boolean r0 = r2.encodeBytes(r0, r3, r4)
            return r0
    }

    public boolean encode(java.lang.String r7, byte[] r8, int r9) {
            r6 = this;
            long r1 = r6.nativeHandle
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            boolean r0 = r0.encodeBytes_2(r1, r3, r4, r5)
            return r0
    }

    @Override // android.content.SharedPreferences
    public java.util.Map<java.lang.String, ?> getAll() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Intentionally Not Supported. Use allKeys() instead, getAll() not implement because type-erasure inside mmkv"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(java.lang.String r3, boolean r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            boolean r0 = r2.decodeBool(r0, r3, r4)
            return r0
    }

    public byte[] getBytes(java.lang.String r2, byte[] r3) {
            r1 = this;
            byte[] r0 = r1.decodeBytes(r2, r3)
            return r0
    }

    @Override // android.content.SharedPreferences
    public float getFloat(java.lang.String r3, float r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            float r0 = r2.decodeFloat(r0, r3, r4)
            return r0
    }

    @Override // android.content.SharedPreferences
    public int getInt(java.lang.String r3, int r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            int r0 = r2.decodeInt(r0, r3, r4)
            return r0
    }

    @Override // android.content.SharedPreferences
    public long getLong(java.lang.String r7, long r8) {
            r6 = this;
            long r1 = r6.nativeHandle
            r0 = r6
            r3 = r7
            r4 = r8
            long r0 = r0.decodeLong(r1, r3, r4)
            return r0
    }

    @Override // android.content.SharedPreferences
    public java.lang.String getString(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            java.lang.String r0 = r2.decodeString(r0, r3, r4)
            return r0
    }

    @Override // android.content.SharedPreferences
    public java.util.Set<java.lang.String> getStringSet(java.lang.String r2, java.util.Set<java.lang.String> r3) {
            r1 = this;
            java.util.Set r0 = r1.decodeStringSet(r2, r3)
            return r0
    }

    public int getValueActualSize(java.lang.String r4) {
            r3 = this;
            long r0 = r3.nativeHandle
            r2 = 1
            int r0 = r3.valueSize(r0, r4, r2)
            return r0
    }

    public int getValueSize(java.lang.String r4) {
            r3 = this;
            long r0 = r3.nativeHandle
            r2 = 0
            int r0 = r3.valueSize(r0, r4, r2)
            return r0
    }

    public int importFromSharedPreferences(android.content.SharedPreferences r12) {
            r11 = this;
            java.util.Map r0 = r12.getAll()
            if (r0 == 0) goto Lc7
            int r1 = r0.size()
            if (r1 > 0) goto Le
            goto Lc7
        Le:
            java.util.Set r1 = r0.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lc2
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r10 = r2.getValue()
            if (r3 == 0) goto L16
            if (r10 != 0) goto L31
            goto L16
        L31:
            boolean r4 = r10 instanceof java.lang.Boolean
            if (r4 == 0) goto L43
            long r4 = r11.nativeHandle
            r6 = r10
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r11.encodeBool(r4, r3, r6)
            goto Lc0
        L43:
            boolean r4 = r10 instanceof java.lang.Integer
            if (r4 == 0) goto L55
            long r4 = r11.nativeHandle
            r6 = r10
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r11.encodeInt(r4, r3, r6)
            goto Lc0
        L55:
            boolean r4 = r10 instanceof java.lang.Long
            if (r4 == 0) goto L68
            long r5 = r11.nativeHandle
            r4 = r10
            java.lang.Long r4 = (java.lang.Long) r4
            long r8 = r4.longValue()
            r4 = r11
            r7 = r3
            r4.encodeLong(r5, r7, r8)
            goto Lc0
        L68:
            boolean r4 = r10 instanceof java.lang.Float
            if (r4 == 0) goto L79
            long r4 = r11.nativeHandle
            r6 = r10
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r11.encodeFloat(r4, r3, r6)
            goto Lc0
        L79:
            boolean r4 = r10 instanceof java.lang.Double
            if (r4 == 0) goto L8c
            long r5 = r11.nativeHandle
            r4 = r10
            java.lang.Double r4 = (java.lang.Double) r4
            double r8 = r4.doubleValue()
            r4 = r11
            r7 = r3
            r4.encodeDouble(r5, r7, r8)
            goto Lc0
        L8c:
            boolean r4 = r10 instanceof java.lang.String
            if (r4 == 0) goto L99
            long r4 = r11.nativeHandle
            r6 = r10
            java.lang.String r6 = (java.lang.String) r6
            r11.encodeString(r4, r3, r6)
            goto Lc0
        L99:
            boolean r4 = r10 instanceof java.util.Set
            if (r4 == 0) goto La4
            r4 = r10
            java.util.Set r4 = (java.util.Set) r4
            r11.encode(r3, r4)
            goto Lc0
        La4:
            com.tencent.mmkv.MMKVLogLevel r4 = com.tencent.mmkv.MMKVLogLevel.LevelError
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unknown type: "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.Class r6 = r10.getClass()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            simpleLog(r4, r5)
        Lc0:
            goto L16
        Lc2:
            int r1 = r0.size()
            return r1
        Lc7:
            r1 = 0
            return r1
    }

    public native void lock();

    public native java.lang.String mmapID();

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putBoolean(java.lang.String r3, boolean r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            r2.encodeBool(r0, r3, r4)
            return r2
    }

    public android.content.SharedPreferences.Editor putBoolean(java.lang.String r7, boolean r8, int r9) {
            r6 = this;
            long r1 = r6.nativeHandle
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r0.encodeBool_2(r1, r3, r4, r5)
            return r6
    }

    public android.content.SharedPreferences.Editor putBytes(java.lang.String r1, byte[] r2) {
            r0 = this;
            r0.encode(r1, r2)
            return r0
    }

    public android.content.SharedPreferences.Editor putBytes(java.lang.String r1, byte[] r2, int r3) {
            r0 = this;
            r0.encode(r1, r2, r3)
            return r0
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putFloat(java.lang.String r3, float r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            r2.encodeFloat(r0, r3, r4)
            return r2
    }

    public android.content.SharedPreferences.Editor putFloat(java.lang.String r7, float r8, int r9) {
            r6 = this;
            long r1 = r6.nativeHandle
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r0.encodeFloat_2(r1, r3, r4, r5)
            return r6
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putInt(java.lang.String r3, int r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            r2.encodeInt(r0, r3, r4)
            return r2
    }

    public android.content.SharedPreferences.Editor putInt(java.lang.String r7, int r8, int r9) {
            r6 = this;
            long r1 = r6.nativeHandle
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r0.encodeInt_2(r1, r3, r4, r5)
            return r6
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putLong(java.lang.String r7, long r8) {
            r6 = this;
            long r1 = r6.nativeHandle
            r0 = r6
            r3 = r7
            r4 = r8
            r0.encodeLong(r1, r3, r4)
            return r6
    }

    public android.content.SharedPreferences.Editor putLong(java.lang.String r8, long r9, int r11) {
            r7 = this;
            long r1 = r7.nativeHandle
            r0 = r7
            r3 = r8
            r4 = r9
            r6 = r11
            r0.encodeLong_2(r1, r3, r4, r6)
            return r7
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putString(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            r2.encodeString(r0, r3, r4)
            return r2
    }

    public android.content.SharedPreferences.Editor putString(java.lang.String r7, java.lang.String r8, int r9) {
            r6 = this;
            long r1 = r6.nativeHandle
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r0.encodeString_2(r1, r3, r4, r5)
            return r6
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putStringSet(java.lang.String r1, java.util.Set<java.lang.String> r2) {
            r0 = this;
            r0.encode(r1, r2)
            return r0
    }

    public android.content.SharedPreferences.Editor putStringSet(java.lang.String r1, java.util.Set<java.lang.String> r2, int r3) {
            r0 = this;
            r0.encode(r1, r2, r3)
            return r0
    }

    public native boolean reKey(java.lang.String r1);

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Intentionally Not implement in MMKV"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor remove(java.lang.String r1) {
            r0 = this;
            r0.removeValueForKey(r1)
            return r0
    }

    public void removeValueForKey(java.lang.String r3) {
            r2 = this;
            long r0 = r2.nativeHandle
            r2.removeValueForKey(r0, r3)
            return
    }

    public native void removeValuesForKeys(java.lang.String[] r1);

    public void sync() {
            r1 = this;
            r0 = 1
            r1.sync(r0)
            return
    }

    public long totalSize() {
            r2 = this;
            long r0 = r2.nativeHandle
            long r0 = r2.totalSize(r0)
            return r0
    }

    public native void trim();

    public native boolean tryLock();

    public native void unlock();

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Intentionally Not implement in MMKV"
            r0.<init>(r1)
            throw r0
    }

    public int writeValueToNativeBuffer(java.lang.String r8, com.tencent.mmkv.NativeBuffer r9) {
            r7 = this;
            long r1 = r7.nativeHandle
            long r4 = r9.pointer
            int r6 = r9.size
            r0 = r7
            r3 = r8
            int r0 = r0.writeValueToNB(r1, r3, r4, r6)
            return r0
    }
}
