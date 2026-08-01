package io.fastkv;

/* JADX INFO: loaded from: classes.dex */
abstract class AbsFastKV implements android.content.SharedPreferences, android.content.SharedPreferences.Editor {
    protected static final java.lang.String A_SUFFIX = ".kva";
    protected static final int BASE_GC_BYTES_THRESHOLD = 8192;
    protected static final int BASE_GC_KEYS_THRESHOLD = 80;
    protected static final java.lang.String BOTH_FILES_ERROR = "both files error";
    protected static final java.lang.String B_SUFFIX = ".kvb";
    protected static final int CIPHER_MASK = 1073741824;
    protected static final java.lang.String C_SUFFIX = ".kvc";
    protected static final int DATA_SIZE_LIMIT = 268435456;
    protected static final int DATA_START = 12;
    protected static final byte[] EMPTY_ARRAY = null;
    protected static final java.lang.String ENCRYPT_FAILED = "Encrypt failed";
    static final java.lang.String GC_FINISH = "gc finish";
    protected static final java.lang.String MAP_FAILED = "map failed";
    protected static final java.lang.String MISS_CIPHER = "miss cipher";
    protected static final java.lang.String OPEN_FILE_FAILED = "open file failed";
    protected static final int PAGE_SIZE = 0;
    protected static final java.lang.String PARSE_DATA_FAILED = "parse dara failed";
    protected static final java.lang.String TEMP_SUFFIX = ".tmp";
    static final java.lang.String TRUNCATE_FINISH = "truncate finish";
    protected static final int TRUNCATE_THRESHOLD = 0;
    protected static final int[] TYPE_SIZE = null;
    protected final int INTERNAL_LIMIT;
    protected final io.fastkv.WeakCache bigValueCache;
    protected long checksum;
    protected final io.fastkv.interfaces.FastCipher cipher;
    protected boolean closed;
    protected final java.util.HashMap<java.lang.String, io.fastkv.Container.BaseContainer> data;
    protected int dataEnd;
    protected final java.util.List<java.lang.String> deletedFiles;
    protected final java.util.Map<java.lang.String, io.fastkv.interfaces.FastEncoder> encoderMap;
    protected final io.fastkv.WeakCache externalCache;
    protected final io.fastkv.TagExecutor externalExecutor;
    protected io.fastkv.FastBuffer fastBuffer;
    protected int invalidBytes;
    protected final java.util.ArrayList<io.fastkv.AbsFastKV.Segment> invalids;
    protected final java.util.ArrayList<android.content.SharedPreferences.OnSharedPreferenceChangeListener> listeners;
    protected final io.fastkv.interfaces.FastLogger logger;
    private final android.os.Handler mainHandler;
    protected final java.lang.String name;
    protected boolean needRewrite;
    protected final java.lang.String path;
    protected volatile boolean startLoading;
    protected java.lang.String tempExternalName;
    protected int updateSize;
    protected int updateStart;

    public static class Segment implements java.lang.Comparable<io.fastkv.AbsFastKV.Segment> {
        int end;
        int start;

        public Segment(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.start = r1
                r0.end = r2
                return
        }

        /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(io.fastkv.AbsFastKV.Segment r2) {
                r1 = this;
                int r0 = r1.start
                int r2 = r2.start
                int r0 = r0 - r2
                return r0
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(io.fastkv.AbsFastKV.Segment r1) {
                r0 = this;
                io.fastkv.AbsFastKV$Segment r1 = (io.fastkv.AbsFastKV.Segment) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }
    }

    static {
            r0 = 6
            int[] r0 = new int[r0]
            r0 = {x001e: FILL_ARRAY_DATA , data: [0, 1, 4, 4, 8, 8} // fill-array
            io.fastkv.AbsFastKV.TYPE_SIZE = r0
            r0 = 0
            byte[] r0 = new byte[r0]
            io.fastkv.AbsFastKV.EMPTY_ARRAY = r0
            int r0 = io.fastkv.Utils.getPageSize()
            io.fastkv.AbsFastKV.PAGE_SIZE = r0
            r1 = 32768(0x8000, float:4.5918E-41)
            int r0 = java.lang.Math.max(r0, r1)
            io.fastkv.AbsFastKV.TRUNCATE_THRESHOLD = r0
            return
    }

    public AbsFastKV(java.lang.String r4, java.lang.String r5, io.fastkv.interfaces.FastEncoder[] r6, io.fastkv.interfaces.FastCipher r7) {
            r3 = this;
            r3.<init>()
            int r0 = io.fastkv.FastKVConfig.internalLimit
            r3.INTERNAL_LIMIT = r0
            io.fastkv.interfaces.FastLogger r0 = io.fastkv.FastKVConfig.sLogger
            r3.logger = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.data = r0
            r0 = 0
            r3.startLoading = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.deletedFiles = r1
            r3.needRewrite = r0
            r3.closed = r0
            io.fastkv.WeakCache r1 = new io.fastkv.WeakCache
            r1.<init>()
            r3.externalCache = r1
            io.fastkv.WeakCache r1 = new io.fastkv.WeakCache
            r1.<init>()
            r3.bigValueCache = r1
            io.fastkv.TagExecutor r1 = new io.fastkv.TagExecutor
            r1.<init>()
            r3.externalExecutor = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.invalids = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.listeners = r1
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r3.mainHandler = r1
            r3.path = r4
            r3.name = r5
            r3.cipher = r7
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            if (r6 == 0) goto L82
            int r5 = r6.length
        L5c:
            if (r0 >= r5) goto L82
            r7 = r6[r0]
            java.lang.String r1 = r7.tag()
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto L7c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "duplicate encoder tag:"
            r7.<init>(r2)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            r3.error(r7)
            goto L7f
        L7c:
            r4.put(r1, r7)
        L7f:
            int r0 = r0 + 1
            goto L5c
        L82:
            io.fastkv.StringSetEncoder r5 = io.fastkv.StringSetEncoder.INSTANCE
            java.lang.String r6 = r5.tag()
            r4.put(r6, r5)
            r3.encoderMap = r4
            return
    }

    public static /* synthetic */ void a(io.fastkv.AbsFastKV r0, android.content.SharedPreferences.OnSharedPreferenceChangeListener r1, java.lang.String r2) {
            r0.lambda$notifyListeners$0(r1, r2)
            return
    }

    private void addObject(java.lang.String r7, java.lang.Object r8, byte[] r9, byte r10) {
            r6 = this;
            int r2 = r6.saveArray(r7, r9, r10)
            if (r2 <= 0) goto L49
            java.lang.String r0 = r6.tempExternalName
            if (r0 == 0) goto Ld
            r0 = 1
        Lb:
            r5 = r0
            goto Lf
        Ld:
            r0 = 0
            goto Lb
        Lf:
            if (r5 == 0) goto L20
            io.fastkv.WeakCache r9 = r6.bigValueCache
            r9.put(r7, r8)
            java.lang.String r8 = r6.tempExternalName
            r9 = 0
            r6.tempExternalName = r9
            r9 = 32
        L1d:
            r3 = r8
            r4 = r9
            goto L22
        L20:
            int r9 = r9.length
            goto L1d
        L22:
            r8 = 6
            if (r10 != r8) goto L2f
            io.fastkv.Container$StringContainer r0 = new io.fastkv.Container$StringContainer
            int r1 = r6.updateStart
            java.lang.String r3 = (java.lang.String) r3
            r0.<init>(r1, r2, r3, r4, r5)
            goto L41
        L2f:
            r8 = 7
            if (r10 != r8) goto L3a
            io.fastkv.Container$ArrayContainer r0 = new io.fastkv.Container$ArrayContainer
            int r1 = r6.updateStart
            r0.<init>(r1, r2, r3, r4, r5)
            goto L41
        L3a:
            io.fastkv.Container$ObjectContainer r0 = new io.fastkv.Container$ObjectContainer
            int r1 = r6.updateStart
            r0.<init>(r1, r2, r3, r4, r5)
        L41:
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r8 = r6.data
            r8.put(r7, r0)
            r6.updateChange()
        L49:
            return
    }

    public static /* synthetic */ void b(io.fastkv.AbsFastKV r0, java.lang.String r1, byte[] r2, java.lang.String r3) {
            r0.lambda$saveArray$1(r1, r2, r3)
            return
    }

    private void countInvalid(int r3, int r4) {
            r2 = this;
            int r0 = r2.invalidBytes
            int r1 = r4 - r3
            int r1 = r1 + r0
            r2.invalidBytes = r1
            java.util.ArrayList<io.fastkv.AbsFastKV$Segment> r0 = r2.invalids
            io.fastkv.AbsFastKV$Segment r1 = new io.fastkv.AbsFastKV$Segment
            r1.<init>(r3, r4)
            r0.add(r1)
            return
    }

    private void encodeObject(java.lang.String r3, java.lang.Object r4, java.util.Map<java.lang.Class, io.fastkv.interfaces.FastEncoder> r5) {
            r2 = this;
            boolean r0 = r4 instanceof java.util.Set
            if (r0 == 0) goto L1d
            r0 = r4
            java.util.Set r0 = (java.util.Set) r0
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L19
            java.util.Iterator r1 = r0.iterator()
            java.lang.Object r1 = r1.next()
            boolean r1 = r1 instanceof java.lang.String
            if (r1 == 0) goto L1d
        L19:
            r2.putStringSet(r3, r0)
            return
        L1d:
            if (r5 == 0) goto L4a
            java.lang.Class r0 = r4.getClass()
            java.lang.Object r5 = r5.get(r0)
            io.fastkv.interfaces.FastEncoder r5 = (io.fastkv.interfaces.FastEncoder) r5
            if (r5 == 0) goto L2f
            r2.putObject(r3, r4, r5)
            return
        L2f:
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "missing encoder for type:"
            r5.<init>(r0)
            java.lang.Class r4 = r4.getClass()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            r2.warning(r3)
            return
        L4a:
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r4 = "missing encoders"
            r3.<init>(r4)
            r2.warning(r3)
            return
    }

    private long getNewDoubleValue(double r2) {
            r1 = this;
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            io.fastkv.interfaces.FastCipher r0 = r1.cipher
            if (r0 == 0) goto Lc
            long r2 = r0.encrypt(r2)
        Lc:
            return r2
    }

    private int getNewFloatValue(float r2) {
            r1 = this;
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            io.fastkv.interfaces.FastCipher r0 = r1.cipher
            if (r0 == 0) goto Lc
            int r2 = r0.encrypt(r2)
        Lc:
            return r2
    }

    public static boolean isCipher(int r1) {
            r0 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r0
            if (r1 == 0) goto L7
            r1 = 1
            return r1
        L7:
            r1 = 0
            return r1
    }

    private /* synthetic */ void lambda$notifyListeners$0(android.content.SharedPreferences.OnSharedPreferenceChangeListener r1, java.lang.String r2) {
            r0 = this;
            r1.onSharedPreferenceChanged(r0, r2)
            return
    }

    private /* synthetic */ void lambda$saveArray$1(java.lang.String r4, byte[] r5, java.lang.String r6) {
            r3 = this;
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.path
            r1.append(r2)
            java.lang.String r2 = r3.name
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            boolean r4 = io.fastkv.Utils.saveBytes(r0, r5)
            if (r4 != 0) goto L29
            java.lang.String r4 = "Write large value with key:"
            java.lang.String r5 = " failed"
            java.lang.String r4 = defpackage.z30.j(r4, r6, r5)
            r3.info(r4)
        L29:
            return
    }

    public static void mergeInvalids(java.util.ArrayList<io.fastkv.AbsFastKV.Segment> r8) {
            r0 = 0
            java.lang.Object r1 = r8.get(r0)
            io.fastkv.AbsFastKV$Segment r1 = (io.fastkv.AbsFastKV.Segment) r1
            int r2 = r8.size()
            r3 = 1
            r4 = r3
        Ld:
            if (r4 >= r2) goto L2b
            java.lang.Object r5 = r8.get(r4)
            io.fastkv.AbsFastKV$Segment r5 = (io.fastkv.AbsFastKV.Segment) r5
            int r6 = r5.start
            int r7 = r1.end
            if (r6 != r7) goto L20
            int r5 = r5.end
            r1.end = r5
            goto L28
        L20:
            int r0 = r0 + 1
            if (r0 == r4) goto L27
            r8.set(r0, r5)
        L27:
            r1 = r5
        L28:
            int r4 = r4 + 1
            goto Ld
        L2b:
            int r0 = r0 + r3
            if (r2 <= r0) goto L35
            java.util.List r8 = r8.subList(r0, r2)
            r8.clear()
        L35:
            return
    }

    private void parseObject(int r10, java.lang.String r11, int r12, int r13, io.fastkv.interfaces.FastCipher r14) {
            r9 = this;
            if (r14 != 0) goto L6
            io.fastkv.FastBuffer r0 = r9.fastBuffer
            r1 = r10
            goto L1f
        L6:
            byte[] r1 = new byte[r10]
            io.fastkv.FastBuffer r2 = r9.fastBuffer
            byte[] r3 = r2.hb
            int r2 = r2.position
            r4 = 0
            java.lang.System.arraycopy(r3, r2, r1, r4, r10)
            byte[] r0 = r14.decrypt(r1)
            io.fastkv.FastBuffer r1 = new io.fastkv.FastBuffer
            r1.<init>(r0)
            int r0 = r0.length
            r8 = r1
            r1 = r0
            r0 = r8
        L1f:
            byte r2 = r0.get()
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = r0.getString(r2)
            java.util.Map<java.lang.String, io.fastkv.interfaces.FastEncoder> r4 = r9.encoderMap
            java.lang.Object r4 = r4.get(r3)
            r7 = r4
            io.fastkv.interfaces.FastEncoder r7 = (io.fastkv.interfaces.FastEncoder) r7
            int r2 = r2 + 1
            int r1 = r1 - r2
            if (r1 < 0) goto L68
            if (r7 == 0) goto L5c
            byte[] r2 = r0.hb     // Catch: java.lang.Exception -> L55
            int r0 = r0.position     // Catch: java.lang.Exception -> L55
            java.lang.Object r4 = r7.decode(r2, r0, r1)     // Catch: java.lang.Exception -> L55
            if (r4 == 0) goto L57
            io.fastkv.Container$ObjectContainer r1 = new io.fastkv.Container$ObjectContainer     // Catch: java.lang.Exception -> L55
            int r3 = r13 + 2
            r6 = 0
            r5 = r10
            r2 = r12
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L55
            r1.encoder = r7     // Catch: java.lang.Exception -> L55
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r9.data     // Catch: java.lang.Exception -> L55
            r0.put(r11, r1)     // Catch: java.lang.Exception -> L55
            return
        L55:
            r0 = move-exception
            goto L58
        L57:
            return
        L58:
            r9.error(r0)
            return
        L5c:
            java.lang.String r0 = "object with tag: "
            java.lang.String r1 = " without encoder"
            java.lang.String r0 = defpackage.z30.j(r0, r3, r1)
            r9.error(r0)
            return
        L68:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "parse dara failed"
            r0.<init>(r1)
            throw r0
    }

    private void prepareHeaderInfo(int r1, int r2, byte r3) {
            r0 = this;
            r0.checkKeySize(r1)
            int r1 = r1 + 2
            int r1 = r1 + r2
            r0.updateSize = r1
            r0.preparePutBytes()
            io.fastkv.FastBuffer r1 = r0.fastBuffer
            r1.put(r3)
            return
    }

    private void resetBuffer() {
            r4 = this;
            io.fastkv.FastBuffer r0 = r4.fastBuffer
            if (r0 == 0) goto L13
            byte[] r1 = r0.hb
            int r1 = r1.length
            int r2 = io.fastkv.AbsFastKV.PAGE_SIZE
            if (r1 == r2) goto Lc
            goto L13
        Lc:
            r1 = 4
            r2 = 0
            r0.putLong(r1, r2)
            goto L1c
        L13:
            io.fastkv.FastBuffer r0 = new io.fastkv.FastBuffer
            int r1 = io.fastkv.AbsFastKV.PAGE_SIZE
            r0.<init>(r1)
            r4.fastBuffer = r0
        L1c:
            io.fastkv.FastBuffer r0 = r4.fastBuffer
            r1 = 0
            int r2 = r4.packSize(r1)
            r0.putInt(r1, r2)
            return
    }

    private int saveArray(java.lang.String r5, byte[] r6, byte r7) {
            r4 = this;
            r0 = 0
            r4.tempExternalName = r0
            int r0 = r6.length
            int r1 = r4.INTERNAL_LIMIT
            if (r0 >= r1) goto Ld
            int r5 = r4.wrapArray(r5, r6, r7)
            return r5
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Large value, key: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r1 = ", size: "
            r0.append(r1)
            int r1 = r6.length
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.info(r0)
            java.lang.String r0 = io.fastkv.Utils.randomName()
            r1 = 32
            byte[] r2 = new byte[r1]
            r3 = 0
            r0.getBytes(r3, r1, r2, r3)
            r7 = r7 | 64
            byte r7 = (byte) r7
            int r7 = r4.wrapArray(r5, r2, r7)
            if (r7 <= 0) goto L4d
            io.fastkv.WeakCache r1 = r4.externalCache
            r1.put(r0, r6)
            io.fastkv.TagExecutor r1 = r4.externalExecutor
            io.fastkv.a r2 = new io.fastkv.a
            r2.<init>(r4, r0, r6, r5)
            r1.execute(r5, r2)
            r4.tempExternalName = r0
        L4d:
            return r7
    }

    public static int unpackSize(int r1) {
            r0 = -1073741825(0xffffffffbfffffff, float:-1.9999999)
            r1 = r1 & r0
            return r1
    }

    private void updateObject(java.lang.String r8, java.lang.Object r9, byte[] r10, io.fastkv.Container.VarContainer r11) {
            r7 = this;
            byte r0 = r11.getType()
            int r0 = r7.saveArray(r8, r10, r0)
            if (r0 <= 0) goto L54
            boolean r1 = r11.external
            r2 = 0
            if (r1 == 0) goto L14
            java.lang.Object r1 = r11.value
            java.lang.String r1 = (java.lang.String) r1
            goto L15
        L14:
            r1 = r2
        L15:
            byte r3 = r11.getType()
            int r4 = r11.start
            int r5 = r11.offset
            int r6 = r11.valueSize
            int r5 = r5 + r6
            r7.remove(r3, r4, r5)
            java.lang.String r3 = r7.tempExternalName
            if (r3 == 0) goto L29
            r3 = 1
            goto L2a
        L29:
            r3 = 0
        L2a:
            int r4 = r7.updateStart
            r11.start = r4
            r11.offset = r0
            r11.external = r3
            if (r3 == 0) goto L44
            io.fastkv.WeakCache r10 = r7.bigValueCache
            r10.put(r8, r9)
            java.lang.String r8 = r7.tempExternalName
            r11.value = r8
            r8 = 32
            r11.valueSize = r8
            r7.tempExternalName = r2
            goto L49
        L44:
            r11.value = r9
            int r8 = r10.length
            r11.valueSize = r8
        L49:
            r7.updateChange()
            r7.checkGC()
            if (r1 == 0) goto L54
            r7.removeOldFile(r1)
        L54:
            return
    }

    private int wrapArray(java.lang.String r2, byte[] r3, byte r4) {
            r1 = this;
            int r0 = r3.length
            int r0 = r0 + 2
            boolean r2 = r1.wrapHeader(r2, r4, r0)
            if (r2 != 0) goto Lb
            r2 = 0
            return r2
        Lb:
            io.fastkv.FastBuffer r2 = r1.fastBuffer
            int r4 = r3.length
            short r4 = (short) r4
            r2.putShort(r4)
            io.fastkv.FastBuffer r2 = r1.fastBuffer
            int r4 = r2.position
            r2.putBytes(r3)
            return r4
    }

    private boolean wrapHeader(java.lang.String r2, byte r3) {
            r1 = this;
            int[] r0 = io.fastkv.AbsFastKV.TYPE_SIZE
            r0 = r0[r3]
            boolean r2 = r1.wrapHeader(r2, r3, r0)
            return r2
    }

    private boolean wrapHeader(java.lang.String r3, byte r4, int r5) {
            r2 = this;
            io.fastkv.interfaces.FastCipher r0 = r2.cipher
            if (r0 == 0) goto L37
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r3 = r3.getBytes(r1)
            byte[] r3 = r0.encrypt(r3)
            r0 = 0
            if (r3 != 0) goto L1c
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r4 = "Encrypt failed"
            r3.<init>(r4)
            r2.error(r3)
            return r0
        L1c:
            int r1 = r3.length
            r2.prepareHeaderInfo(r1, r5, r4)
            io.fastkv.FastBuffer r4 = r2.fastBuffer
            byte r5 = (byte) r1
            r4.put(r5)
            io.fastkv.FastBuffer r4 = r2.fastBuffer
            byte[] r5 = r4.hb
            int r4 = r4.position
            java.lang.System.arraycopy(r3, r0, r5, r4, r1)
            io.fastkv.FastBuffer r3 = r2.fastBuffer
            int r4 = r3.position
            int r4 = r4 + r1
            r3.position = r4
            goto L41
        L37:
            int r0 = io.fastkv.FastBuffer.getStringSize(r3)
            r2.prepareHeaderInfo(r0, r5, r4)
            r2.wrapKey(r3, r0)
        L41:
            r3 = 1
            return r3
    }

    private void wrapKey(java.lang.String r4, int r5) {
            r3 = this;
            io.fastkv.FastBuffer r0 = r3.fastBuffer
            byte r1 = (byte) r5
            r0.put(r1)
            int r0 = r4.length()
            if (r5 != r0) goto L1e
            io.fastkv.FastBuffer r0 = r3.fastBuffer
            byte[] r1 = r0.hb
            int r0 = r0.position
            r2 = 0
            r4.getBytes(r2, r5, r1, r0)
            io.fastkv.FastBuffer r4 = r3.fastBuffer
            int r0 = r4.position
            int r0 = r0 + r5
            r4.position = r0
            return
        L1e:
            io.fastkv.FastBuffer r5 = r3.fastBuffer
            r5.putString(r4)
            return
    }

    private void wrapStringValue(java.lang.String r4, int r5) {
            r3 = this;
            io.fastkv.FastBuffer r0 = r3.fastBuffer
            short r1 = (short) r5
            r0.putShort(r1)
            int r0 = r4.length()
            if (r5 != r0) goto L17
            io.fastkv.FastBuffer r0 = r3.fastBuffer
            byte[] r1 = r0.hb
            int r0 = r0.position
            r2 = 0
            r4.getBytes(r2, r5, r1, r0)
            return
        L17:
            io.fastkv.FastBuffer r5 = r3.fastBuffer
            r5.putString(r4)
            return
    }

    public void addOrUpdate(java.lang.String r2, java.lang.Object r3, byte[] r4, io.fastkv.Container.VarContainer r5, byte r6) {
            r1 = this;
            if (r5 != 0) goto L6
            r1.addObject(r2, r3, r4, r6)
            return
        L6:
            boolean r6 = r5.external
            if (r6 != 0) goto L17
            int r6 = r5.valueSize
            int r0 = r4.length
            if (r6 != r0) goto L17
            int r2 = r5.offset
            r1.updateBytes(r2, r4)
            r5.value = r3
            return
        L17:
            r1.updateObject(r2, r3, r4, r5)
            return
    }

    public final int bytesThreshold() {
            r2 = this;
            int r0 = r2.dataEnd
            r1 = 16384(0x4000, float:2.2959E-41)
            if (r0 > r1) goto L9
            r0 = 8192(0x2000, float:1.148E-41)
            return r0
        L9:
            return r1
    }

    public abstract void checkGC();

    public final void checkKey(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L9
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L9
            return
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "key is empty"
            r2.<init>(r0)
            throw r2
    }

    public final void checkKeySize(int r2) {
            r1 = this;
            r0 = 255(0xff, float:3.57E-43)
            if (r2 > r0) goto L5
            return
        L5:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "key's length must less than 256"
            r2.<init>(r0)
            throw r2
    }

    public final void clearInvalid() {
            r1 = this;
            r0 = 0
            r1.invalidBytes = r0
            java.util.ArrayList<io.fastkv.AbsFastKV$Segment> r0 = r1.invalids
            r0.clear()
            return
    }

    @Override // android.content.SharedPreferences
    public synchronized boolean contains(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r1.data     // Catch: java.lang.Throwable -> L9
            boolean r2 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    public abstract void copyToMainFile(io.fastkv.FastKV r1);

    public final void deleteCFiles() {
            r4 = this;
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L3b
            java.lang.String r1 = r4.path     // Catch: java.lang.Exception -> L3b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3b
            r2.<init>()     // Catch: java.lang.Exception -> L3b
            java.lang.String r3 = r4.name     // Catch: java.lang.Exception -> L3b
            r2.append(r3)     // Catch: java.lang.Exception -> L3b
            java.lang.String r3 = ".kvc"
            r2.append(r3)     // Catch: java.lang.Exception -> L3b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L3b
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L3b
            io.fastkv.Utils.deleteFile(r0)     // Catch: java.lang.Exception -> L3b
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L3b
            java.lang.String r1 = r4.path     // Catch: java.lang.Exception -> L3b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3b
            r2.<init>()     // Catch: java.lang.Exception -> L3b
            java.lang.String r3 = r4.name     // Catch: java.lang.Exception -> L3b
            r2.append(r3)     // Catch: java.lang.Exception -> L3b
            java.lang.String r3 = ".tmp"
            r2.append(r3)     // Catch: java.lang.Exception -> L3b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L3b
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L3b
            io.fastkv.Utils.deleteFile(r0)     // Catch: java.lang.Exception -> L3b
            return
        L3b:
            r0 = move-exception
            r4.error(r0)
            return
    }

    @Override // android.content.SharedPreferences
    public android.content.SharedPreferences.Editor edit() {
            r0 = this;
            return r0
    }

    public abstract void ensureSize(int r1);

    public final void error(java.lang.Exception r3) {
            r2 = this;
            io.fastkv.interfaces.FastLogger r0 = r2.logger
            if (r0 == 0) goto L9
            java.lang.String r1 = r2.name
            r0.e(r1, r3)
        L9:
            return
    }

    public final void error(java.lang.String r4) {
            r3 = this;
            io.fastkv.interfaces.FastLogger r0 = r3.logger
            if (r0 == 0) goto Le
            java.lang.String r1 = r3.name
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>(r4)
            r0.e(r1, r2)
        Le:
            return
    }

    public void fastPutString(java.lang.String r10, java.lang.String r11, io.fastkv.Container.StringContainer r12) {
            r9 = this;
            int r4 = io.fastkv.FastBuffer.getStringSize(r11)
            r0 = 6
            if (r12 != 0) goto L36
            int r12 = io.fastkv.FastBuffer.getStringSize(r10)
            r9.checkKeySize(r12)
            int r1 = r12 + 4
            int r2 = r1 + r4
            r9.updateSize = r2
            r9.preparePutBytes()
            io.fastkv.FastBuffer r2 = r9.fastBuffer
            r2.put(r0)
            r9.wrapKey(r10, r12)
            r9.wrapStringValue(r11, r4)
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r12 = r9.data
            io.fastkv.Container$StringContainer r0 = new io.fastkv.Container$StringContainer
            r2 = r1
            int r1 = r9.updateStart
            int r2 = r2 + r1
            r5 = 0
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r12.put(r10, r0)
            r9.updateChange()
            return
        L36:
            r3 = r11
            int r10 = r12.offset
            int r11 = r12.start
            int r11 = r10 - r11
            int r1 = r12.valueSize
            r2 = 0
            r5 = 0
            if (r1 != r4) goto L6e
            long r6 = r9.checksum
            io.fastkv.FastBuffer r11 = r9.fastBuffer
            long r10 = r11.getChecksum(r10, r1)
            long r10 = r10 ^ r6
            r9.checksum = r10
            int r10 = r3.length()
            if (r4 != r10) goto L5e
            io.fastkv.FastBuffer r10 = r9.fastBuffer
            byte[] r10 = r10.hb
            int r11 = r12.offset
            r3.getBytes(r5, r4, r10, r11)
            goto L67
        L5e:
            io.fastkv.FastBuffer r10 = r9.fastBuffer
            int r11 = r12.offset
            r10.position = r11
            r10.putString(r3)
        L67:
            int r10 = r12.offset
            r9.updateStart = r10
            r9.updateSize = r4
            goto Lb2
        L6e:
            int r10 = r11 + r4
            r9.updateSize = r10
            r9.preparePutBytes()
            io.fastkv.FastBuffer r10 = r9.fastBuffer
            r10.put(r0)
            int r10 = r11 + (-3)
            io.fastkv.FastBuffer r1 = r9.fastBuffer
            byte[] r6 = r1.hb
            int r7 = r12.start
            r8 = 1
            int r7 = r7 + r8
            int r1 = r1.position
            java.lang.System.arraycopy(r6, r7, r6, r1, r10)
            io.fastkv.FastBuffer r1 = r9.fastBuffer
            int r6 = r1.position
            int r6 = r6 + r10
            r1.position = r6
            r9.wrapStringValue(r3, r4)
            int r10 = r12.start
            int r1 = r12.offset
            int r6 = r12.valueSize
            int r1 = r1 + r6
            r9.remove(r0, r10, r1)
            boolean r10 = r12.external
            if (r10 == 0) goto La6
            java.lang.Object r10 = r12.value
            r2 = r10
            java.lang.String r2 = (java.lang.String) r2
        La6:
            r12.external = r5
            int r10 = r9.updateStart
            r12.start = r10
            int r10 = r10 + r11
            r12.offset = r10
            r12.valueSize = r4
            r5 = r8
        Lb2:
            r12.value = r3
            r9.updateChange()
            if (r5 == 0) goto Lbc
            r9.checkGC()
        Lbc:
            if (r2 == 0) goto Lc1
            r9.removeOldFile(r2)
        Lc1:
            return
    }

    public void gc(int r18) {
            r17 = this;
            r0 = r17
            java.util.ArrayList<io.fastkv.AbsFastKV$Segment> r1 = r0.invalids
            java.util.Collections.sort(r1)
            java.util.ArrayList<io.fastkv.AbsFastKV$Segment> r1 = r0.invalids
            mergeInvalids(r1)
            java.util.ArrayList<io.fastkv.AbsFastKV$Segment> r1 = r0.invalids
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            io.fastkv.AbsFastKV$Segment r1 = (io.fastkv.AbsFastKV.Segment) r1
            int r3 = r1.start
            int r4 = r0.dataEnd
            int r5 = r0.invalidBytes
            int r5 = r4 - r5
            int r6 = r5 + (-12)
            int r7 = r5 - r3
            int r4 = r4 - r3
            int r8 = r4 + r7
            r9 = 1
            if (r6 >= r8) goto L28
            r2 = r9
        L28:
            if (r2 != 0) goto L35
            long r10 = r0.checksum
            io.fastkv.FastBuffer r8 = r0.fastBuffer
            long r12 = r8.getChecksum(r3, r4)
            long r10 = r10 ^ r12
            r0.checksum = r10
        L35:
            java.util.ArrayList<io.fastkv.AbsFastKV$Segment> r4 = r0.invalids
            int r4 = r4.size()
            int r8 = r0.dataEnd
            java.util.ArrayList<io.fastkv.AbsFastKV$Segment> r10 = r0.invalids
            int r11 = r4 + (-1)
            java.lang.Object r10 = r10.get(r11)
            io.fastkv.AbsFastKV$Segment r10 = (io.fastkv.AbsFastKV.Segment) r10
            int r10 = r10.end
            int r8 = r8 - r10
            if (r8 <= 0) goto L4e
            r10 = r4
            goto L4f
        L4e:
            r10 = r11
        L4f:
            int[] r12 = new int[r10]
            int[] r10 = new int[r10]
            int r13 = r1.start
            int r1 = r1.end
        L57:
            if (r9 >= r4) goto L7c
            java.util.ArrayList<io.fastkv.AbsFastKV$Segment> r14 = r0.invalids
            java.lang.Object r14 = r14.get(r9)
            io.fastkv.AbsFastKV$Segment r14 = (io.fastkv.AbsFastKV.Segment) r14
            int r15 = r14.start
            int r15 = r15 - r1
            r16 = r2
            io.fastkv.FastBuffer r2 = r0.fastBuffer
            byte[] r2 = r2.hb
            java.lang.System.arraycopy(r2, r1, r2, r13, r15)
            int r2 = r9 + (-1)
            r12[r2] = r1
            int r1 = r1 - r13
            r10[r2] = r1
            int r13 = r13 + r15
            int r1 = r14.end
            int r9 = r9 + 1
            r2 = r16
            goto L57
        L7c:
            r16 = r2
            if (r8 <= 0) goto L8c
            io.fastkv.FastBuffer r2 = r0.fastBuffer
            byte[] r2 = r2.hb
            java.lang.System.arraycopy(r2, r1, r2, r13, r8)
            r12[r11] = r1
            int r1 = r1 - r13
            r10[r11] = r1
        L8c:
            r0.clearInvalid()
            if (r16 == 0) goto L9c
            io.fastkv.FastBuffer r1 = r0.fastBuffer
            r2 = 12
            long r1 = r1.getChecksum(r2, r6)
            r0.checksum = r1
            goto La7
        L9c:
            long r1 = r0.checksum
            io.fastkv.FastBuffer r4 = r0.fastBuffer
            long r8 = r4.getChecksum(r3, r7)
            long r1 = r1 ^ r8
            r0.checksum = r1
        La7:
            r0.dataEnd = r5
            r1 = r18
            r0.syncCompatBuffer(r3, r1, r7)
            r0.updateOffset(r3, r12, r10)
            java.lang.String r1 = "gc finish"
            r0.info(r1)
            return
    }

    @Override // android.content.SharedPreferences
    public synchronized java.util.Map<java.lang.String, java.lang.Object> getAll() {
            r6 = this;
            monitor-enter(r6)
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r6.data     // Catch: java.lang.Throwable -> L10
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L13
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L10
            r0.<init>()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r6)
            return r0
        L10:
            r0 = move-exception
            goto Lb1
        L13:
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L10
            int r0 = r0 * 4
            int r0 = r0 / 3
            int r0 = r0 + 1
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L10
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r6.data     // Catch: java.lang.Throwable -> L10
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L10
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L10
        L28:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto Laf
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L10
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L10
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L10
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L10
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L10
            io.fastkv.Container$BaseContainer r2 = (io.fastkv.Container.BaseContainer) r2     // Catch: java.lang.Throwable -> L10
            byte r4 = r2.getType()     // Catch: java.lang.Throwable -> L10
            switch(r4) {
                case 1: goto La0;
                case 2: goto L97;
                case 3: goto L8e;
                case 4: goto L85;
                case 5: goto L7c;
                case 6: goto L6c;
                case 7: goto L5c;
                case 8: goto L49;
                default: goto L47;
            }     // Catch: java.lang.Throwable -> L10
        L47:
            r2 = 0
            goto La8
        L49:
            r4 = r2
            io.fastkv.Container$ObjectContainer r4 = (io.fastkv.Container.ObjectContainer) r4     // Catch: java.lang.Throwable -> L10
            boolean r5 = r4.external     // Catch: java.lang.Throwable -> L10
            if (r5 == 0) goto L57
            io.fastkv.interfaces.FastCipher r2 = r6.cipher     // Catch: java.lang.Throwable -> L10
            java.lang.Object r2 = r6.getObjectFromFile(r4, r2)     // Catch: java.lang.Throwable -> L10
            goto La8
        L57:
            io.fastkv.Container$ObjectContainer r2 = (io.fastkv.Container.ObjectContainer) r2     // Catch: java.lang.Throwable -> L10
            java.lang.Object r2 = r2.value     // Catch: java.lang.Throwable -> L10
            goto La8
        L5c:
            io.fastkv.Container$ArrayContainer r2 = (io.fastkv.Container.ArrayContainer) r2     // Catch: java.lang.Throwable -> L10
            boolean r4 = r2.external     // Catch: java.lang.Throwable -> L10
            if (r4 == 0) goto L69
            io.fastkv.interfaces.FastCipher r4 = r6.cipher     // Catch: java.lang.Throwable -> L10
            byte[] r2 = r6.getArrayFromFile(r2, r4)     // Catch: java.lang.Throwable -> L10
            goto La8
        L69:
            java.lang.Object r2 = r2.value     // Catch: java.lang.Throwable -> L10
            goto La8
        L6c:
            io.fastkv.Container$StringContainer r2 = (io.fastkv.Container.StringContainer) r2     // Catch: java.lang.Throwable -> L10
            boolean r4 = r2.external     // Catch: java.lang.Throwable -> L10
            if (r4 == 0) goto L79
            io.fastkv.interfaces.FastCipher r4 = r6.cipher     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = r6.getStringFromFile(r2, r4)     // Catch: java.lang.Throwable -> L10
            goto La8
        L79:
            java.lang.Object r2 = r2.value     // Catch: java.lang.Throwable -> L10
            goto La8
        L7c:
            io.fastkv.Container$DoubleContainer r2 = (io.fastkv.Container.DoubleContainer) r2     // Catch: java.lang.Throwable -> L10
            double r4 = r2.value     // Catch: java.lang.Throwable -> L10
            java.lang.Double r2 = java.lang.Double.valueOf(r4)     // Catch: java.lang.Throwable -> L10
            goto La8
        L85:
            io.fastkv.Container$LongContainer r2 = (io.fastkv.Container.LongContainer) r2     // Catch: java.lang.Throwable -> L10
            long r4 = r2.value     // Catch: java.lang.Throwable -> L10
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L10
            goto La8
        L8e:
            io.fastkv.Container$FloatContainer r2 = (io.fastkv.Container.FloatContainer) r2     // Catch: java.lang.Throwable -> L10
            float r2 = r2.value     // Catch: java.lang.Throwable -> L10
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch: java.lang.Throwable -> L10
            goto La8
        L97:
            io.fastkv.Container$IntContainer r2 = (io.fastkv.Container.IntContainer) r2     // Catch: java.lang.Throwable -> L10
            int r2 = r2.value     // Catch: java.lang.Throwable -> L10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L10
            goto La8
        La0:
            io.fastkv.Container$BooleanContainer r2 = (io.fastkv.Container.BooleanContainer) r2     // Catch: java.lang.Throwable -> L10
            boolean r2 = r2.value     // Catch: java.lang.Throwable -> L10
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L10
        La8:
            if (r2 == 0) goto L28
            r1.put(r3, r2)     // Catch: java.lang.Throwable -> L10
            goto L28
        Laf:
            monitor-exit(r6)
            return r1
        Lb1:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L10
            throw r0
    }

    public byte[] getArray(java.lang.String r2) {
            r1 = this;
            byte[] r0 = io.fastkv.AbsFastKV.EMPTY_ARRAY
            byte[] r2 = r1.getArray(r2, r0)
            return r2
    }

    public synchronized byte[] getArray(java.lang.String r4, byte[] r5) {
            r3 = this;
            monitor-enter(r3)
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r3.data     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L1d
            io.fastkv.Container$ArrayContainer r0 = (io.fastkv.Container.ArrayContainer) r0     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L3c
            boolean r1 = r0.external     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L36
            io.fastkv.WeakCache r1 = r3.bigValueCache     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L1d
            boolean r2 = r1 instanceof byte[]     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L1f
            byte[] r1 = (byte[]) r1     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)
            return r1
        L1d:
            r4 = move-exception
            goto L3e
        L1f:
            io.fastkv.interfaces.FastCipher r1 = r3.cipher     // Catch: java.lang.Throwable -> L1d
            byte[] r0 = r3.getArrayFromFile(r0, r1)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L32
            int r1 = r0.length     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L2b
            goto L32
        L2b:
            io.fastkv.WeakCache r5 = r3.bigValueCache     // Catch: java.lang.Throwable -> L1d
            r5.put(r4, r0)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)
            return r0
        L32:
            r3.remove(r4)     // Catch: java.lang.Throwable -> L1d
            goto L3c
        L36:
            java.lang.Object r4 = r0.value     // Catch: java.lang.Throwable -> L1d
            byte[] r4 = (byte[]) r4     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)
            return r4
        L3c:
            monitor-exit(r3)
            return r5
        L3e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r4
    }

    public byte[] getArrayFromFile(io.fastkv.Container.ArrayContainer r4, io.fastkv.interfaces.FastCipher r5) {
            r3 = this;
            java.lang.Object r4 = r4.value
            java.lang.String r4 = (java.lang.String) r4
            io.fastkv.WeakCache r0 = r3.externalCache
            java.lang.Object r0 = r0.get(r4)
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto Lf
            goto L2b
        Lf:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L34
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L34
            r1.<init>()     // Catch: java.lang.Exception -> L34
            java.lang.String r2 = r3.path     // Catch: java.lang.Exception -> L34
            r1.append(r2)     // Catch: java.lang.Exception -> L34
            java.lang.String r2 = r3.name     // Catch: java.lang.Exception -> L34
            r1.append(r2)     // Catch: java.lang.Exception -> L34
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L34
            r0.<init>(r1, r4)     // Catch: java.lang.Exception -> L34
            byte[] r0 = io.fastkv.Utils.getBytes(r0)     // Catch: java.lang.Exception -> L34
        L2b:
            if (r0 == 0) goto L3a
            if (r5 == 0) goto L36
            byte[] r4 = r5.decrypt(r0)     // Catch: java.lang.Exception -> L34
            return r4
        L34:
            r4 = move-exception
            goto L37
        L36:
            return r0
        L37:
            r3.error(r4)
        L3a:
            r4 = 0
            return r4
    }

    public synchronized boolean getBoolean(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            boolean r2 = r1.getBoolean(r2, r0)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return r2
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    @Override // android.content.SharedPreferences
    public synchronized boolean getBoolean(java.lang.String r2, boolean r3) {
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r1.data     // Catch: java.lang.Throwable -> L10
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L10
            io.fastkv.Container$BooleanContainer r2 = (io.fastkv.Container.BooleanContainer) r2     // Catch: java.lang.Throwable -> L10
            if (r2 != 0) goto Lc
            goto Le
        Lc:
            boolean r3 = r2.value     // Catch: java.lang.Throwable -> L10
        Le:
            monitor-exit(r1)
            return r3
        L10:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    public double getDouble(java.lang.String r3) {
            r2 = this;
            r0 = 0
            double r0 = r2.getDouble(r3, r0)
            return r0
    }

    public synchronized double getDouble(java.lang.String r2, double r3) {
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r1.data     // Catch: java.lang.Throwable -> L10
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L10
            io.fastkv.Container$DoubleContainer r2 = (io.fastkv.Container.DoubleContainer) r2     // Catch: java.lang.Throwable -> L10
            if (r2 != 0) goto Lc
            goto Le
        Lc:
            double r3 = r2.value     // Catch: java.lang.Throwable -> L10
        Le:
            monitor-exit(r1)
            return r3
        L10:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    public float getFloat(java.lang.String r2) {
            r1 = this;
            r0 = 0
            float r2 = r1.getFloat(r2, r0)
            return r2
    }

    @Override // android.content.SharedPreferences
    public synchronized float getFloat(java.lang.String r2, float r3) {
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r1.data     // Catch: java.lang.Throwable -> L10
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L10
            io.fastkv.Container$FloatContainer r2 = (io.fastkv.Container.FloatContainer) r2     // Catch: java.lang.Throwable -> L10
            if (r2 != 0) goto Lc
            goto Le
        Lc:
            float r3 = r2.value     // Catch: java.lang.Throwable -> L10
        Le:
            monitor-exit(r1)
            return r3
        L10:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    public int getInt(java.lang.String r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.getInt(r2, r0)
            return r2
    }

    @Override // android.content.SharedPreferences
    public synchronized int getInt(java.lang.String r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r1.data     // Catch: java.lang.Throwable -> L10
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L10
            io.fastkv.Container$IntContainer r2 = (io.fastkv.Container.IntContainer) r2     // Catch: java.lang.Throwable -> L10
            if (r2 != 0) goto Lc
            goto Le
        Lc:
            int r3 = r2.value     // Catch: java.lang.Throwable -> L10
        Le:
            monitor-exit(r1)
            return r3
        L10:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    public synchronized long getLong(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r2.data     // Catch: java.lang.Throwable -> L12
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L12
            io.fastkv.Container$LongContainer r3 = (io.fastkv.Container.LongContainer) r3     // Catch: java.lang.Throwable -> L12
            if (r3 != 0) goto Le
            r0 = 0
            goto L10
        Le:
            long r0 = r3.value     // Catch: java.lang.Throwable -> L12
        L10:
            monitor-exit(r2)
            return r0
        L12:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r3
    }

    @Override // android.content.SharedPreferences
    public synchronized long getLong(java.lang.String r2, long r3) {
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r1.data     // Catch: java.lang.Throwable -> L10
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L10
            io.fastkv.Container$LongContainer r2 = (io.fastkv.Container.LongContainer) r2     // Catch: java.lang.Throwable -> L10
            if (r2 != 0) goto Lc
            goto Le
        Lc:
            long r3 = r2.value     // Catch: java.lang.Throwable -> L10
        Le:
            monitor-exit(r1)
            return r3
        L10:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    public final int getNewCapacity(int r2, int r3) {
            r1 = this;
            r0 = 268435456(0x10000000, float:2.524355E-29)
            if (r3 >= r0) goto Lf
            int r0 = io.fastkv.AbsFastKV.PAGE_SIZE
            if (r3 > r0) goto L9
            return r0
        L9:
            if (r2 >= r3) goto Le
            int r2 = r2 << 1
            goto L9
        Le:
            return r2
        Lf:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "data size out of limit"
            r2.<init>(r3)
            throw r2
    }

    public synchronized <T> T getObject(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r2.data     // Catch: java.lang.Throwable -> L25
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L25
            io.fastkv.Container$ObjectContainer r0 = (io.fastkv.Container.ObjectContainer) r0     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L32
            boolean r1 = r0.external     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L2e
            io.fastkv.WeakCache r1 = r2.bigValueCache     // Catch: java.lang.Throwable -> L25
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L19
            monitor-exit(r2)
            return r1
        L19:
            io.fastkv.interfaces.FastCipher r1 = r2.cipher     // Catch: java.lang.Throwable -> L25
            java.lang.Object r0 = r2.getObjectFromFile(r0, r1)     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L27
            r2.remove(r3)     // Catch: java.lang.Throwable -> L25
            goto L32
        L25:
            r3 = move-exception
            goto L35
        L27:
            io.fastkv.WeakCache r1 = r2.bigValueCache     // Catch: java.lang.Throwable -> L25
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r2)
            return r0
        L2e:
            java.lang.Object r3 = r0.value     // Catch: java.lang.Throwable -> L25
            monitor-exit(r2)
            return r3
        L32:
            monitor-exit(r2)
            r3 = 0
            return r3
        L35:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            throw r3
    }

    public java.lang.Object getObjectFromFile(io.fastkv.Container.ObjectContainer r6, io.fastkv.interfaces.FastCipher r7) {
            r5 = this;
            java.lang.String r0 = "No encoder for tag:"
            java.lang.Object r1 = r6.value
            java.lang.String r1 = (java.lang.String) r1
            io.fastkv.WeakCache r2 = r5.externalCache
            java.lang.Object r2 = r2.get(r1)
            byte[] r2 = (byte[]) r2
            if (r2 == 0) goto L11
            goto L2d
        L11:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L36
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L36
            r3.<init>()     // Catch: java.lang.Exception -> L36
            java.lang.String r4 = r5.path     // Catch: java.lang.Exception -> L36
            r3.append(r4)     // Catch: java.lang.Exception -> L36
            java.lang.String r4 = r5.name     // Catch: java.lang.Exception -> L36
            r3.append(r4)     // Catch: java.lang.Exception -> L36
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L36
            r2.<init>(r3, r1)     // Catch: java.lang.Exception -> L36
            byte[] r2 = io.fastkv.Utils.getBytes(r2)     // Catch: java.lang.Exception -> L36
        L2d:
            if (r2 == 0) goto L6d
            if (r7 == 0) goto L38
            byte[] r2 = r7.decrypt(r2)     // Catch: java.lang.Exception -> L36
            goto L38
        L36:
            r6 = move-exception
            goto L78
        L38:
            r7 = 0
            r7 = r2[r7]     // Catch: java.lang.Exception -> L36
            r7 = r7 & 255(0xff, float:3.57E-43)
            io.fastkv.FastBuffer r1 = r5.fastBuffer     // Catch: java.lang.Exception -> L36
            r3 = 1
            java.lang.String r1 = r1.decodeStr(r2, r3, r7)     // Catch: java.lang.Exception -> L36
            java.util.Map<java.lang.String, io.fastkv.interfaces.FastEncoder> r4 = r5.encoderMap     // Catch: java.lang.Exception -> L36
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Exception -> L36
            io.fastkv.interfaces.FastEncoder r4 = (io.fastkv.interfaces.FastEncoder) r4     // Catch: java.lang.Exception -> L36
            if (r4 == 0) goto L58
            r6.encoder = r4     // Catch: java.lang.Exception -> L36
            int r7 = r7 + r3
            int r6 = r2.length     // Catch: java.lang.Exception -> L36
            int r6 = r6 - r7
            java.lang.Object r6 = r4.decode(r2, r7, r6)     // Catch: java.lang.Exception -> L36
            return r6
        L58:
            java.lang.Exception r6 = new java.lang.Exception     // Catch: java.lang.Exception -> L36
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L36
            r7.<init>(r0)     // Catch: java.lang.Exception -> L36
            r7.append(r1)     // Catch: java.lang.Exception -> L36
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L36
            r6.<init>(r7)     // Catch: java.lang.Exception -> L36
            r5.warning(r6)     // Catch: java.lang.Exception -> L36
            goto L7b
        L6d:
            java.lang.Exception r6 = new java.lang.Exception     // Catch: java.lang.Exception -> L36
            java.lang.String r7 = "Read object data failed"
            r6.<init>(r7)     // Catch: java.lang.Exception -> L36
            r5.warning(r6)     // Catch: java.lang.Exception -> L36
            goto L7b
        L78:
            r5.error(r6)
        L7b:
            r6 = 0
            return r6
    }

    public java.lang.String getString(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = ""
            java.lang.String r2 = r1.getString(r2, r0)
            return r2
    }

    @Override // android.content.SharedPreferences
    public synchronized java.lang.String getString(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            monitor-enter(r3)
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r3.data     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L1d
            io.fastkv.Container$StringContainer r0 = (io.fastkv.Container.StringContainer) r0     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L3f
            boolean r1 = r0.external     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L39
            io.fastkv.WeakCache r1 = r3.bigValueCache     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L1d
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L1f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)
            return r1
        L1d:
            r4 = move-exception
            goto L41
        L1f:
            io.fastkv.interfaces.FastCipher r1 = r3.cipher     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = r3.getStringFromFile(r0, r1)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L35
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L2e
            goto L35
        L2e:
            io.fastkv.WeakCache r5 = r3.bigValueCache     // Catch: java.lang.Throwable -> L1d
            r5.put(r4, r0)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)
            return r0
        L35:
            r3.remove(r4)     // Catch: java.lang.Throwable -> L1d
            goto L3f
        L39:
            java.lang.Object r4 = r0.value     // Catch: java.lang.Throwable -> L1d
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)
            return r4
        L3f:
            monitor-exit(r3)
            return r5
        L41:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r4
    }

    public java.lang.String getStringFromFile(io.fastkv.Container.StringContainer r5, io.fastkv.interfaces.FastCipher r6) {
            r4 = this;
            java.lang.Object r5 = r5.value
            java.lang.String r5 = (java.lang.String) r5
            io.fastkv.WeakCache r0 = r4.externalCache
            java.lang.Object r0 = r0.get(r5)
            byte[] r0 = (byte[]) r0
            r1 = 0
            if (r0 == 0) goto L10
            goto L2c
        L10:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L35
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L35
            r2.<init>()     // Catch: java.lang.Exception -> L35
            java.lang.String r3 = r4.path     // Catch: java.lang.Exception -> L35
            r2.append(r3)     // Catch: java.lang.Exception -> L35
            java.lang.String r3 = r4.name     // Catch: java.lang.Exception -> L35
            r2.append(r3)     // Catch: java.lang.Exception -> L35
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L35
            r0.<init>(r2, r5)     // Catch: java.lang.Exception -> L35
            byte[] r0 = io.fastkv.Utils.getBytes(r0)     // Catch: java.lang.Exception -> L35
        L2c:
            if (r0 == 0) goto L45
            if (r6 == 0) goto L37
            byte[] r0 = r6.decrypt(r0)     // Catch: java.lang.Exception -> L35
            goto L37
        L35:
            r5 = move-exception
            goto L42
        L37:
            if (r0 == 0) goto L41
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Exception -> L35
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Exception -> L35
            r5.<init>(r0, r6)     // Catch: java.lang.Exception -> L35
            return r5
        L41:
            return r1
        L42:
            r4.error(r5)
        L45:
            return r1
    }

    public synchronized java.util.Set<java.lang.String> getStringSet(java.lang.String r1) {
            r0 = this;
            monitor-enter(r0)
            java.lang.Object r1 = r0.getObject(r1)     // Catch: java.lang.Throwable -> L9
            java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return r1
        L9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    @Override // android.content.SharedPreferences
    public java.util.Set<java.lang.String> getStringSet(java.lang.String r1, java.util.Set<java.lang.String> r2) {
            r0 = this;
            java.util.Set r1 = r0.getStringSet(r1)
            if (r1 == 0) goto L7
            return r1
        L7:
            return r2
    }

    public abstract void handleChange(java.lang.String r1);

    public final void info(java.lang.String r3) {
            r2 = this;
            io.fastkv.interfaces.FastLogger r0 = r2.logger
            if (r0 == 0) goto L9
            java.lang.String r1 = r2.name
            r0.i(r1, r3)
        L9:
            return
    }

    public final boolean loadWithBlockingIO(java.io.File r8) {
            r7 = this;
            long r0 = r8.length()
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 0
            if (r2 == 0) goto L64
            r4 = 268435456(0x10000000, double:1.32624737E-315)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L13
            goto L64
        L13:
            int r0 = (int) r0
            int r1 = io.fastkv.AbsFastKV.PAGE_SIZE
            int r1 = r7.getNewCapacity(r1, r0)
            io.fastkv.FastBuffer r2 = r7.fastBuffer
            if (r2 == 0) goto L26
            byte[] r4 = r2.hb
            int r4 = r4.length
            if (r4 != r1) goto L26
            r2.position = r3
            goto L2f
        L26:
            io.fastkv.FastBuffer r2 = new io.fastkv.FastBuffer
            byte[] r1 = new byte[r1]
            r2.<init>(r1)
            r7.fastBuffer = r2
        L2f:
            byte[] r1 = r2.hb
            io.fastkv.Utils.readBytes(r8, r1, r0)
            int r8 = r2.getInt()
            if (r8 >= 0) goto L3b
            return r3
        L3b:
            int r1 = unpackSize(r8)
            boolean r8 = isCipher(r8)
            long r4 = r2.getLong()
            int r6 = r1 + 12
            r7.dataEnd = r6
            if (r1 < 0) goto L64
            r6 = 12
            int r0 = r0 - r6
            if (r1 > r0) goto L64
            long r0 = r2.getChecksum(r6, r1)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L64
            boolean r8 = r7.parseData(r8)
            if (r8 == 0) goto L64
            r7.checksum = r4
            r8 = 1
            return r8
        L64:
            return r3
    }

    public void lockAndCheckUpdate() {
            r0 = this;
            return
    }

    public synchronized void notifyListeners(java.lang.String r7) {
            r6 = this;
            monitor-enter(r6)
            java.util.ArrayList<android.content.SharedPreferences$OnSharedPreferenceChangeListener> r0 = r6.listeners     // Catch: java.lang.Throwable -> L1d
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L1d
            r2 = 0
        L8:
            if (r2 >= r1) goto L1f
            java.lang.Object r3 = r0.get(r2)     // Catch: java.lang.Throwable -> L1d
            int r2 = r2 + 1
            android.content.SharedPreferences$OnSharedPreferenceChangeListener r3 = (android.content.SharedPreferences.OnSharedPreferenceChangeListener) r3     // Catch: java.lang.Throwable -> L1d
            android.os.Handler r4 = r6.mainHandler     // Catch: java.lang.Throwable -> L1d
            io.fastkv.b r5 = new io.fastkv.b     // Catch: java.lang.Throwable -> L1d
            r5.<init>(r6, r3, r7)     // Catch: java.lang.Throwable -> L1d
            r4.post(r5)     // Catch: java.lang.Throwable -> L1d
            goto L8
        L1d:
            r7 = move-exception
            goto L21
        L1f:
            monitor-exit(r6)
            return
        L21:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L1d
            throw r7
    }

    public final int packSize(int r2) {
            r1 = this;
            io.fastkv.interfaces.FastCipher r0 = r1.cipher
            if (r0 != 0) goto L5
            return r2
        L5:
            r0 = 1073741824(0x40000000, float:2.0)
            r2 = r2 | r0
            return r2
    }

    public final boolean parseData(boolean r16) {
            r15 = this;
            r1 = 0
            if (r16 == 0) goto Ld
            io.fastkv.interfaces.FastCipher r0 = r15.cipher
            if (r0 != 0) goto Ld
            java.lang.String r0 = "miss cipher"
            r15.error(r0)
            return r1
        Ld:
            if (r16 == 0) goto L13
            io.fastkv.interfaces.FastCipher r0 = r15.cipher
        L11:
            r7 = r0
            goto L15
        L13:
            r0 = 0
            goto L11
        L15:
            io.fastkv.FastBuffer r0 = r15.fastBuffer
            r8 = 12
            r0.position = r8
        L1b:
            int r10 = r0.position     // Catch: java.lang.Exception -> L4b
            int r2 = r15.dataEnd     // Catch: java.lang.Exception -> L4b
            java.lang.String r3 = "parse dara failed"
            r4 = 1
            if (r10 >= r2) goto L14d
            byte r2 = r0.get()     // Catch: java.lang.Exception -> L4b
            r5 = r2 & 63
            byte r5 = (byte) r5     // Catch: java.lang.Exception -> L4b
            if (r5 < r4) goto L147
            r6 = 8
            if (r5 > r6) goto L147
            byte r3 = r0.get()     // Catch: java.lang.Exception -> L4b
            r3 = r3 & 255(0xff, float:3.57E-43)
            if (r3 == 0) goto L13f
            r6 = 65535(0xffff, float:9.1834E-41)
            r9 = 5
            if (r2 >= 0) goto L5c
            int r2 = r0.position     // Catch: java.lang.Exception -> L4b
            int r2 = r2 + r3
            r0.position = r2     // Catch: java.lang.Exception -> L4b
            if (r5 > r9) goto L4e
            int[] r2 = io.fastkv.AbsFastKV.TYPE_SIZE     // Catch: java.lang.Exception -> L4b
            r2 = r2[r5]     // Catch: java.lang.Exception -> L4b
            goto L53
        L4b:
            r0 = move-exception
            goto L164
        L4e:
            short r2 = r0.getShort()     // Catch: java.lang.Exception -> L4b
            r2 = r2 & r6
        L53:
            int r3 = r0.position     // Catch: java.lang.Exception -> L4b
            int r3 = r3 + r2
            r0.position = r3     // Catch: java.lang.Exception -> L4b
            r15.countInvalid(r10, r3)     // Catch: java.lang.Exception -> L4b
            goto L1b
        L5c:
            java.lang.String r3 = r0.getString(r7, r3)     // Catch: java.lang.Exception -> L4b
            r11 = r6
            int r6 = r0.position     // Catch: java.lang.Exception -> L4b
            if (r5 > r9) goto Lc2
            if (r5 == r4) goto Lae
            r2 = 2
            if (r5 == r2) goto L9e
            r2 = 3
            if (r5 == r2) goto L8e
            r2 = 4
            if (r5 == r2) goto L7f
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r2 = r15.data     // Catch: java.lang.Exception -> L4b
            io.fastkv.Container$DoubleContainer r4 = new io.fastkv.Container$DoubleContainer     // Catch: java.lang.Exception -> L4b
            double r9 = r0.getDouble(r7)     // Catch: java.lang.Exception -> L4b
            r4.<init>(r6, r9)     // Catch: java.lang.Exception -> L4b
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L4b
            goto L1b
        L7f:
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r2 = r15.data     // Catch: java.lang.Exception -> L4b
            io.fastkv.Container$LongContainer r4 = new io.fastkv.Container$LongContainer     // Catch: java.lang.Exception -> L4b
            long r9 = r0.getLong(r7)     // Catch: java.lang.Exception -> L4b
            r4.<init>(r6, r9)     // Catch: java.lang.Exception -> L4b
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L4b
            goto L1b
        L8e:
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r2 = r15.data     // Catch: java.lang.Exception -> L4b
            io.fastkv.Container$FloatContainer r4 = new io.fastkv.Container$FloatContainer     // Catch: java.lang.Exception -> L4b
            float r5 = r0.getFloat(r7)     // Catch: java.lang.Exception -> L4b
            r4.<init>(r6, r5)     // Catch: java.lang.Exception -> L4b
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L4b
            goto L1b
        L9e:
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r2 = r15.data     // Catch: java.lang.Exception -> L4b
            io.fastkv.Container$IntContainer r4 = new io.fastkv.Container$IntContainer     // Catch: java.lang.Exception -> L4b
            int r5 = r0.getInt(r7)     // Catch: java.lang.Exception -> L4b
            r4.<init>(r6, r5)     // Catch: java.lang.Exception -> L4b
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L4b
            goto L1b
        Lae:
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r2 = r15.data     // Catch: java.lang.Exception -> L4b
            io.fastkv.Container$BooleanContainer r5 = new io.fastkv.Container$BooleanContainer     // Catch: java.lang.Exception -> L4b
            byte r9 = r0.get()     // Catch: java.lang.Exception -> L4b
            if (r9 != r4) goto Lb9
            goto Lba
        Lb9:
            r4 = r1
        Lba:
            r5.<init>(r6, r4)     // Catch: java.lang.Exception -> L4b
            r2.put(r3, r5)     // Catch: java.lang.Exception -> L4b
            goto L1b
        Lc2:
            short r9 = r0.getShort()     // Catch: java.lang.Exception -> L4b
            r13 = r9 & r11
            r2 = r2 & 64
            if (r2 == 0) goto Lce
            r14 = r4
            goto Lcf
        Lce:
            r14 = r1
        Lcf:
            if (r14 == 0) goto Lde
            r2 = 32
            if (r13 != r2) goto Ld6
            goto Lde
        Ld6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L4b
            java.lang.String r2 = "name size not match"
            r0.<init>(r2)     // Catch: java.lang.Exception -> L4b
            throw r0     // Catch: java.lang.Exception -> L4b
        Lde:
            r2 = 6
            if (r5 == r2) goto L123
            r2 = 7
            if (r5 == r2) goto L107
            if (r14 == 0) goto Lf9
            java.lang.String r12 = r0.getString(r13)     // Catch: java.lang.Exception -> L4b
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r2 = r15.data     // Catch: java.lang.Exception -> L4b
            io.fastkv.Container$ObjectContainer r9 = new io.fastkv.Container$ObjectContainer     // Catch: java.lang.Exception -> L4b
            int r11 = r6 + 2
            r14 = 1
            r9.<init>(r10, r11, r12, r13, r14)     // Catch: java.lang.Exception -> L4b
            r2.put(r3, r9)     // Catch: java.lang.Exception -> L4b
            goto L1b
        Lf9:
            r2 = r15
            r4 = r3
            r5 = r10
            r3 = r13
            r2.parseObject(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L4b
            int r6 = r6 + 2
            int r6 = r6 + r13
            r0.position = r6     // Catch: java.lang.Exception -> L4b
            goto L1b
        L107:
            r4 = r3
            if (r14 == 0) goto L110
            java.lang.String r2 = r0.getString(r13)     // Catch: java.lang.Exception -> L4b
        L10e:
            r12 = r2
            goto L115
        L110:
            byte[] r2 = r0.getBytes(r7, r13)     // Catch: java.lang.Exception -> L4b
            goto L10e
        L115:
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r2 = r15.data     // Catch: java.lang.Exception -> L4b
            io.fastkv.Container$ArrayContainer r9 = new io.fastkv.Container$ArrayContainer     // Catch: java.lang.Exception -> L4b
            int r11 = r6 + 2
            r9.<init>(r10, r11, r12, r13, r14)     // Catch: java.lang.Exception -> L4b
            r2.put(r4, r9)     // Catch: java.lang.Exception -> L4b
            goto L1b
        L123:
            r4 = r3
            if (r14 == 0) goto L12c
            java.lang.String r2 = r0.getString(r13)     // Catch: java.lang.Exception -> L4b
        L12a:
            r12 = r2
            goto L131
        L12c:
            java.lang.String r2 = r0.getString(r7, r13)     // Catch: java.lang.Exception -> L4b
            goto L12a
        L131:
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r2 = r15.data     // Catch: java.lang.Exception -> L4b
            io.fastkv.Container$StringContainer r9 = new io.fastkv.Container$StringContainer     // Catch: java.lang.Exception -> L4b
            int r11 = r6 + 2
            r9.<init>(r10, r11, r12, r13, r14)     // Catch: java.lang.Exception -> L4b
            r2.put(r4, r9)     // Catch: java.lang.Exception -> L4b
            goto L1b
        L13f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L4b
            java.lang.String r2 = "invalid key size"
            r0.<init>(r2)     // Catch: java.lang.Exception -> L4b
            throw r0     // Catch: java.lang.Exception -> L4b
        L147:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Exception -> L4b
            r0.<init>(r3)     // Catch: java.lang.Exception -> L4b
            throw r0     // Catch: java.lang.Exception -> L4b
        L14d:
            if (r10 == r2) goto L158
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r3)
            r15.error(r0)
            return r1
        L158:
            if (r16 != 0) goto L161
            io.fastkv.interfaces.FastCipher r0 = r15.cipher
            if (r0 == 0) goto L161
            if (r2 == r8) goto L161
            r1 = r4
        L161:
            r15.needRewrite = r1
            return r4
        L164:
            r15.error(r0)
            return r1
    }

    public void preparePutBytes() {
            r2 = this;
            int r0 = r2.updateSize
            r2.ensureSize(r0)
            int r0 = r2.dataEnd
            r2.updateStart = r0
            int r1 = r2.updateSize
            int r1 = r1 + r0
            r2.dataEnd = r1
            io.fastkv.FastBuffer r1 = r2.fastBuffer
            r1.position = r0
            return
    }

    public void putAll(java.util.Map<java.lang.String, java.lang.Object> r2) {
            r1 = this;
            r0 = 0
            r1.putAll(r2, r0)
            return
    }

    public synchronized void putAll(java.util.Map<java.lang.String, java.lang.Object> r5, java.util.Map<java.lang.Class, io.fastkv.interfaces.FastEncoder> r6) {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.closed     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L7
            monitor-exit(r4)
            return
        L7:
            java.util.Set r5 = r5.entrySet()     // Catch: java.lang.Throwable -> L37
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L37
        Lf:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L8d
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Throwable -> L37
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L37
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto Lf
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L37
            if (r2 != 0) goto Lf
            boolean r2 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L39
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L37
            r4.putString(r1, r0)     // Catch: java.lang.Throwable -> L37
            goto Lf
        L37:
            r5 = move-exception
            goto L8f
        L39:
            boolean r2 = r0 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L47
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L37
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L37
            r4.putBoolean(r1, r0)     // Catch: java.lang.Throwable -> L37
            goto Lf
        L47:
            boolean r2 = r0 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L55
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L37
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L37
            r4.putInt(r1, r0)     // Catch: java.lang.Throwable -> L37
            goto Lf
        L55:
            boolean r2 = r0 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L63
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L37
            long r2 = r0.longValue()     // Catch: java.lang.Throwable -> L37
            r4.putLong(r1, r2)     // Catch: java.lang.Throwable -> L37
            goto Lf
        L63:
            boolean r2 = r0 instanceof java.lang.Float     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L71
            java.lang.Float r0 = (java.lang.Float) r0     // Catch: java.lang.Throwable -> L37
            float r0 = r0.floatValue()     // Catch: java.lang.Throwable -> L37
            r4.putFloat(r1, r0)     // Catch: java.lang.Throwable -> L37
            goto Lf
        L71:
            boolean r2 = r0 instanceof java.lang.Double     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L7f
            java.lang.Double r0 = (java.lang.Double) r0     // Catch: java.lang.Throwable -> L37
            double r2 = r0.doubleValue()     // Catch: java.lang.Throwable -> L37
            r4.putDouble(r1, r2)     // Catch: java.lang.Throwable -> L37
            goto Lf
        L7f:
            boolean r2 = r0 instanceof byte[]     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L89
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L37
            r4.putArray(r1, r0)     // Catch: java.lang.Throwable -> L37
            goto Lf
        L89:
            r4.encodeObject(r1, r0, r6)     // Catch: java.lang.Throwable -> L37
            goto Lf
        L8d:
            monitor-exit(r4)
            return
        L8f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L37
            throw r5
    }

    public synchronized android.content.SharedPreferences.Editor putArray(java.lang.String r8, byte[] r9) {
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.closed     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L7
            monitor-exit(r7)
            return r7
        L7:
            r7.checkKey(r8)     // Catch: java.lang.Throwable -> L49
            if (r9 != 0) goto L15
            r7.remove(r8)     // Catch: java.lang.Throwable -> L11
            r1 = r7
            goto L44
        L11:
            r0 = move-exception
            r8 = r0
            r1 = r7
            goto L4c
        L15:
            r7.lockAndCheckUpdate()     // Catch: java.lang.Throwable -> L49
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r7.data     // Catch: java.lang.Throwable -> L49
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> L49
            r5 = r0
            io.fastkv.Container$ArrayContainer r5 = (io.fastkv.Container.ArrayContainer) r5     // Catch: java.lang.Throwable -> L49
            io.fastkv.interfaces.FastCipher r0 = r7.cipher     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L2b
            byte[] r0 = r0.encrypt(r9)     // Catch: java.lang.Throwable -> L11
            r4 = r0
            goto L2c
        L2b:
            r4 = r9
        L2c:
            if (r4 != 0) goto L3a
            java.lang.Exception r8 = new java.lang.Exception     // Catch: java.lang.Throwable -> L11
            java.lang.String r9 = "Encrypt failed"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L11
            r7.error(r8)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r7)
            return r7
        L3a:
            r6 = 7
            r1 = r7
            r2 = r8
            r3 = r9
            r1.addOrUpdate(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L46
            r7.handleChange(r2)     // Catch: java.lang.Throwable -> L46
        L44:
            monitor-exit(r7)
            return r1
        L46:
            r0 = move-exception
        L47:
            r8 = r0
            goto L4c
        L49:
            r0 = move-exception
            r1 = r7
            goto L47
        L4c:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L46
            throw r8
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized android.content.SharedPreferences.Editor putBoolean(java.lang.String r4, boolean r5) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.closed     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L7
            monitor-exit(r3)
            return r3
        L7:
            r3.checkKey(r4)     // Catch: java.lang.Throwable -> L39
            r3.lockAndCheckUpdate()     // Catch: java.lang.Throwable -> L39
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r3.data     // Catch: java.lang.Throwable -> L39
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L39
            io.fastkv.Container$BooleanContainer r0 = (io.fastkv.Container.BooleanContainer) r0     // Catch: java.lang.Throwable -> L39
            if (r0 != 0) goto L3b
            r0 = 1
            boolean r0 = r3.wrapHeader(r4, r0)     // Catch: java.lang.Throwable -> L39
            if (r0 != 0) goto L20
            monitor-exit(r3)
            return r3
        L20:
            io.fastkv.FastBuffer r0 = r3.fastBuffer     // Catch: java.lang.Throwable -> L39
            int r1 = r0.position     // Catch: java.lang.Throwable -> L39
            byte r2 = (byte) r5     // Catch: java.lang.Throwable -> L39
            r0.put(r2)     // Catch: java.lang.Throwable -> L39
            r3.updateChange()     // Catch: java.lang.Throwable -> L39
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r3.data     // Catch: java.lang.Throwable -> L39
            io.fastkv.Container$BooleanContainer r2 = new io.fastkv.Container$BooleanContainer     // Catch: java.lang.Throwable -> L39
            r2.<init>(r1, r5)     // Catch: java.lang.Throwable -> L39
            r0.put(r4, r2)     // Catch: java.lang.Throwable -> L39
            r3.handleChange(r4)     // Catch: java.lang.Throwable -> L39
            goto L4a
        L39:
            r4 = move-exception
            goto L4c
        L3b:
            boolean r1 = r0.value     // Catch: java.lang.Throwable -> L39
            if (r1 == r5) goto L4a
            r0.value = r5     // Catch: java.lang.Throwable -> L39
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L39
            int r0 = r0.offset     // Catch: java.lang.Throwable -> L39
            r3.updateBoolean(r5, r0)     // Catch: java.lang.Throwable -> L39
            r3.handleChange(r4)     // Catch: java.lang.Throwable -> L39
        L4a:
            monitor-exit(r3)
            return r3
        L4c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L39
            throw r4
    }

    public synchronized android.content.SharedPreferences.Editor putDouble(java.lang.String r9, double r10) {
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.closed     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L7
            monitor-exit(r8)
            return r8
        L7:
            r8.checkKey(r9)     // Catch: java.lang.Throwable -> L64
            r8.lockAndCheckUpdate()     // Catch: java.lang.Throwable -> L64
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r8.data     // Catch: java.lang.Throwable -> L64
            java.lang.Object r0 = r0.get(r9)     // Catch: java.lang.Throwable -> L64
            io.fastkv.Container$DoubleContainer r0 = (io.fastkv.Container.DoubleContainer) r0     // Catch: java.lang.Throwable -> L64
            if (r0 != 0) goto L41
            r0 = 5
            boolean r0 = r8.wrapHeader(r9, r0)     // Catch: java.lang.Throwable -> L3d
            if (r0 != 0) goto L20
            monitor-exit(r8)
            return r8
        L20:
            io.fastkv.FastBuffer r0 = r8.fastBuffer     // Catch: java.lang.Throwable -> L3d
            int r1 = r0.position     // Catch: java.lang.Throwable -> L3d
            long r2 = r8.getNewDoubleValue(r10)     // Catch: java.lang.Throwable -> L3d
            r0.putLong(r2)     // Catch: java.lang.Throwable -> L3d
            r8.updateChange()     // Catch: java.lang.Throwable -> L3d
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r8.data     // Catch: java.lang.Throwable -> L3d
            io.fastkv.Container$DoubleContainer r2 = new io.fastkv.Container$DoubleContainer     // Catch: java.lang.Throwable -> L3d
            r2.<init>(r1, r10)     // Catch: java.lang.Throwable -> L3d
            r0.put(r9, r2)     // Catch: java.lang.Throwable -> L3d
            r8.handleChange(r9)     // Catch: java.lang.Throwable -> L3d
        L3b:
            r2 = r8
            goto L67
        L3d:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L69
        L41:
            double r1 = r0.value     // Catch: java.lang.Throwable -> L64
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 == 0) goto L3b
            long r3 = r8.getNewDoubleValue(r10)     // Catch: java.lang.Throwable -> L64
            io.fastkv.FastBuffer r1 = r8.fastBuffer     // Catch: java.lang.Throwable -> L64
            int r2 = r0.offset     // Catch: java.lang.Throwable -> L64
            long r1 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L64
            long r5 = r3 ^ r1
            r0.value = r10     // Catch: java.lang.Throwable -> L64
            int r7 = r0.offset     // Catch: java.lang.Throwable -> L64
            r2 = r8
            r2.updateInt64(r3, r5, r7)     // Catch: java.lang.Throwable -> L61
            r8.handleChange(r9)     // Catch: java.lang.Throwable -> L61
            goto L67
        L61:
            r0 = move-exception
        L62:
            r9 = r0
            goto L69
        L64:
            r0 = move-exception
            r2 = r8
            goto L62
        L67:
            monitor-exit(r8)
            return r2
        L69:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L61
            throw r9
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized android.content.SharedPreferences.Editor putFloat(java.lang.String r7, float r8) {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.closed     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L7
            monitor-exit(r6)
            return r6
        L7:
            r6.checkKey(r7)     // Catch: java.lang.Throwable -> L3c
            r6.lockAndCheckUpdate()     // Catch: java.lang.Throwable -> L3c
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r6.data     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r0 = r0.get(r7)     // Catch: java.lang.Throwable -> L3c
            io.fastkv.Container$FloatContainer r0 = (io.fastkv.Container.FloatContainer) r0     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L3e
            r0 = 3
            boolean r0 = r6.wrapHeader(r7, r0)     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L20
            monitor-exit(r6)
            return r6
        L20:
            io.fastkv.FastBuffer r0 = r6.fastBuffer     // Catch: java.lang.Throwable -> L3c
            int r1 = r0.position     // Catch: java.lang.Throwable -> L3c
            int r2 = r6.getNewFloatValue(r8)     // Catch: java.lang.Throwable -> L3c
            r0.putInt(r2)     // Catch: java.lang.Throwable -> L3c
            r6.updateChange()     // Catch: java.lang.Throwable -> L3c
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r6.data     // Catch: java.lang.Throwable -> L3c
            io.fastkv.Container$FloatContainer r2 = new io.fastkv.Container$FloatContainer     // Catch: java.lang.Throwable -> L3c
            r2.<init>(r1, r8)     // Catch: java.lang.Throwable -> L3c
            r0.put(r7, r2)     // Catch: java.lang.Throwable -> L3c
            r6.handleChange(r7)     // Catch: java.lang.Throwable -> L3c
            goto L62
        L3c:
            r7 = move-exception
            goto L64
        L3e:
            float r1 = r0.value     // Catch: java.lang.Throwable -> L3c
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 == 0) goto L62
            int r1 = r6.getNewFloatValue(r8)     // Catch: java.lang.Throwable -> L3c
            io.fastkv.FastBuffer r2 = r6.fastBuffer     // Catch: java.lang.Throwable -> L3c
            int r3 = r0.offset     // Catch: java.lang.Throwable -> L3c
            int r2 = r2.getInt(r3)     // Catch: java.lang.Throwable -> L3c
            r2 = r2 ^ r1
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L3c
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            r0.value = r8     // Catch: java.lang.Throwable -> L3c
            int r8 = r0.offset     // Catch: java.lang.Throwable -> L3c
            r6.updateInt32(r1, r2, r8)     // Catch: java.lang.Throwable -> L3c
            r6.handleChange(r7)     // Catch: java.lang.Throwable -> L3c
        L62:
            monitor-exit(r6)
            return r6
        L64:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L3c
            throw r7
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized android.content.SharedPreferences.Editor putInt(java.lang.String r7, int r8) {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.closed     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L7
            monitor-exit(r6)
            return r6
        L7:
            r6.checkKey(r7)     // Catch: java.lang.Throwable -> L2d
            r6.lockAndCheckUpdate()     // Catch: java.lang.Throwable -> L2d
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r6.data     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r0.get(r7)     // Catch: java.lang.Throwable -> L2d
            io.fastkv.Container$IntContainer r0 = (io.fastkv.Container.IntContainer) r0     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L44
            r0 = 2
            boolean r0 = r6.wrapHeader(r7, r0)     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L20
            monitor-exit(r6)
            return r6
        L20:
            io.fastkv.FastBuffer r0 = r6.fastBuffer     // Catch: java.lang.Throwable -> L2d
            int r1 = r0.position     // Catch: java.lang.Throwable -> L2d
            io.fastkv.interfaces.FastCipher r2 = r6.cipher     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L2f
            int r2 = r2.encrypt(r8)     // Catch: java.lang.Throwable -> L2d
            goto L30
        L2d:
            r7 = move-exception
            goto L75
        L2f:
            r2 = r8
        L30:
            r0.putInt(r2)     // Catch: java.lang.Throwable -> L2d
            r6.updateChange()     // Catch: java.lang.Throwable -> L2d
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r6.data     // Catch: java.lang.Throwable -> L2d
            io.fastkv.Container$IntContainer r2 = new io.fastkv.Container$IntContainer     // Catch: java.lang.Throwable -> L2d
            r2.<init>(r1, r8)     // Catch: java.lang.Throwable -> L2d
            r0.put(r7, r2)     // Catch: java.lang.Throwable -> L2d
            r6.handleChange(r7)     // Catch: java.lang.Throwable -> L2d
            goto L73
        L44:
            int r1 = r0.value     // Catch: java.lang.Throwable -> L2d
            if (r1 == r8) goto L73
            io.fastkv.interfaces.FastCipher r1 = r6.cipher     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L51
            int r1 = r1.encrypt(r8)     // Catch: java.lang.Throwable -> L2d
            goto L52
        L51:
            r1 = r8
        L52:
            io.fastkv.interfaces.FastCipher r2 = r6.cipher     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L5f
            io.fastkv.FastBuffer r2 = r6.fastBuffer     // Catch: java.lang.Throwable -> L2d
            int r3 = r0.offset     // Catch: java.lang.Throwable -> L2d
            int r2 = r2.getInt(r3)     // Catch: java.lang.Throwable -> L2d
            goto L61
        L5f:
            int r2 = r0.value     // Catch: java.lang.Throwable -> L2d
        L61:
            r2 = r2 ^ r1
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L2d
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            r0.value = r8     // Catch: java.lang.Throwable -> L2d
            int r8 = r0.offset     // Catch: java.lang.Throwable -> L2d
            r6.updateInt32(r1, r2, r8)     // Catch: java.lang.Throwable -> L2d
            r6.handleChange(r7)     // Catch: java.lang.Throwable -> L2d
        L73:
            monitor-exit(r6)
            return r6
        L75:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2d
            throw r7
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized android.content.SharedPreferences.Editor putLong(java.lang.String r8, long r9) {
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.closed     // Catch: java.lang.Throwable -> L77
            if (r0 == 0) goto L7
            monitor-exit(r7)
            return r7
        L7:
            r7.checkKey(r8)     // Catch: java.lang.Throwable -> L77
            r7.lockAndCheckUpdate()     // Catch: java.lang.Throwable -> L77
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r7.data     // Catch: java.lang.Throwable -> L77
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> L77
            io.fastkv.Container$LongContainer r0 = (io.fastkv.Container.LongContainer) r0     // Catch: java.lang.Throwable -> L77
            if (r0 != 0) goto L47
            r0 = 4
            boolean r0 = r7.wrapHeader(r8, r0)     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L20
            monitor-exit(r7)
            return r7
        L20:
            io.fastkv.FastBuffer r0 = r7.fastBuffer     // Catch: java.lang.Throwable -> L2d
            int r1 = r0.position     // Catch: java.lang.Throwable -> L2d
            io.fastkv.interfaces.FastCipher r2 = r7.cipher     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L31
            long r2 = r2.encrypt(r9)     // Catch: java.lang.Throwable -> L2d
            goto L32
        L2d:
            r0 = move-exception
            r8 = r0
            r1 = r7
            goto L7c
        L31:
            r2 = r9
        L32:
            r0.putLong(r2)     // Catch: java.lang.Throwable -> L2d
            r7.updateChange()     // Catch: java.lang.Throwable -> L2d
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r7.data     // Catch: java.lang.Throwable -> L2d
            io.fastkv.Container$LongContainer r2 = new io.fastkv.Container$LongContainer     // Catch: java.lang.Throwable -> L2d
            r2.<init>(r1, r9)     // Catch: java.lang.Throwable -> L2d
            r0.put(r8, r2)     // Catch: java.lang.Throwable -> L2d
            r7.handleChange(r8)     // Catch: java.lang.Throwable -> L2d
        L45:
            r1 = r7
            goto L7a
        L47:
            long r1 = r0.value     // Catch: java.lang.Throwable -> L77
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 == 0) goto L45
            io.fastkv.interfaces.FastCipher r1 = r7.cipher     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto L57
            long r1 = r1.encrypt(r9)     // Catch: java.lang.Throwable -> L2d
            r2 = r1
            goto L58
        L57:
            r2 = r9
        L58:
            io.fastkv.interfaces.FastCipher r1 = r7.cipher     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto L65
            io.fastkv.FastBuffer r1 = r7.fastBuffer     // Catch: java.lang.Throwable -> L2d
            int r4 = r0.offset     // Catch: java.lang.Throwable -> L2d
            long r4 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L2d
            goto L67
        L65:
            long r4 = r0.value     // Catch: java.lang.Throwable -> L77
        L67:
            long r4 = r4 ^ r2
            r0.value = r9     // Catch: java.lang.Throwable -> L77
            int r6 = r0.offset     // Catch: java.lang.Throwable -> L77
            r1 = r7
            r1.updateInt64(r2, r4, r6)     // Catch: java.lang.Throwable -> L74
            r7.handleChange(r8)     // Catch: java.lang.Throwable -> L74
            goto L7a
        L74:
            r0 = move-exception
        L75:
            r8 = r0
            goto L7c
        L77:
            r0 = move-exception
            r1 = r7
            goto L75
        L7a:
            monitor-exit(r7)
            return r1
        L7c:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L74
            throw r8
    }

    public synchronized <T> android.content.SharedPreferences.Editor putObject(java.lang.String r8, T r9, io.fastkv.interfaces.FastEncoder<T> r10) {
            r7 = this;
            java.lang.String r0 = "Invalid encoder tag:"
            monitor-enter(r7)
            boolean r1 = r7.closed     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L9
            monitor-exit(r7)
            return r7
        L9:
            r7.checkKey(r8)     // Catch: java.lang.Throwable -> L8f
            if (r10 == 0) goto Lae
            java.lang.String r1 = r10.tag()     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L9b
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L8f
            if (r2 != 0) goto L9b
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L8f
            r3 = 50
            if (r2 > r3) goto L9b
            java.util.Map<java.lang.String, io.fastkv.interfaces.FastEncoder> r0 = r7.encoderMap     // Catch: java.lang.Throwable -> L8f
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L92
            if (r9 != 0) goto L37
            r7.remove(r8)     // Catch: java.lang.Throwable -> L31
            monitor-exit(r7)
            return r7
        L31:
            r0 = move-exception
            r8 = r0
            r9 = r8
            r8 = r7
            goto Lb7
        L37:
            byte[] r10 = r10.encode(r9)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L3c
            goto L42
        L3c:
            r0 = move-exception
            r10 = r0
            r7.error(r10)     // Catch: java.lang.Throwable -> L8f
            r10 = 0
        L42:
            if (r10 != 0) goto L49
            r7.remove(r8)     // Catch: java.lang.Throwable -> L31
            monitor-exit(r7)
            return r7
        L49:
            int r0 = io.fastkv.FastBuffer.getStringSize(r1)     // Catch: java.lang.Throwable -> L8f
            io.fastkv.FastBuffer r2 = new io.fastkv.FastBuffer     // Catch: java.lang.Throwable -> L8f
            int r3 = r0 + 1
            int r4 = r10.length     // Catch: java.lang.Throwable -> L8f
            int r3 = r3 + r4
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8f
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L8f
            r2.put(r0)     // Catch: java.lang.Throwable -> L8f
            r2.putString(r1)     // Catch: java.lang.Throwable -> L8f
            r2.putBytes(r10)     // Catch: java.lang.Throwable -> L8f
            byte[] r10 = r2.hb     // Catch: java.lang.Throwable -> L8f
            r7.lockAndCheckUpdate()     // Catch: java.lang.Throwable -> L8f
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r7.data     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> L8f
            r5 = r0
            io.fastkv.Container$ObjectContainer r5 = (io.fastkv.Container.ObjectContainer) r5     // Catch: java.lang.Throwable -> L8f
            io.fastkv.interfaces.FastCipher r0 = r7.cipher     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L76
            byte[] r10 = r0.encrypt(r10)     // Catch: java.lang.Throwable -> L31
        L76:
            r4 = r10
            if (r4 != 0) goto L7b
            monitor-exit(r7)
            return r7
        L7b:
            r6 = 8
            r1 = r7
            r2 = r8
            r3 = r9
            r1.addOrUpdate(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L8c
            r8 = r1
            r7.handleChange(r2)     // Catch: java.lang.Throwable -> L89
            monitor-exit(r7)
            return r8
        L89:
            r0 = move-exception
        L8a:
            r9 = r0
            goto Lb7
        L8c:
            r0 = move-exception
            r8 = r1
            goto L8a
        L8f:
            r0 = move-exception
            r8 = r7
            goto L8a
        L92:
            r8 = r7
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L89
            java.lang.String r10 = "Encoder hasn't been registered"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L89
            throw r9     // Catch: java.lang.Throwable -> L89
        L9b:
            r8 = r7
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L89
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L89
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L89
            r10.append(r1)     // Catch: java.lang.Throwable -> L89
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L89
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L89
            throw r9     // Catch: java.lang.Throwable -> L89
        Lae:
            r8 = r7
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L89
            java.lang.String r10 = "Encoder is null"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L89
            throw r9     // Catch: java.lang.Throwable -> L89
        Lb7:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L89
            throw r9
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized android.content.SharedPreferences.Editor putString(java.lang.String r8, java.lang.String r9) {
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.closed     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L7
            monitor-exit(r7)
            return r7
        L7:
            r7.checkKey(r8)     // Catch: java.lang.Throwable -> L6a
            if (r9 != 0) goto L15
            r7.remove(r8)     // Catch: java.lang.Throwable -> L11
            r1 = r7
            goto L65
        L11:
            r0 = move-exception
            r8 = r0
            r1 = r7
            goto L6d
        L15:
            r7.lockAndCheckUpdate()     // Catch: java.lang.Throwable -> L6a
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r7.data     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> L6a
            r5 = r0
            io.fastkv.Container$StringContainer r5 = (io.fastkv.Container.StringContainer) r5     // Catch: java.lang.Throwable -> L6a
            io.fastkv.interfaces.FastCipher r0 = r7.cipher     // Catch: java.lang.Throwable -> L6a
            if (r0 != 0) goto L35
            int r0 = r9.length()     // Catch: java.lang.Throwable -> L11
            int r0 = r0 * 3
            int r1 = r7.INTERNAL_LIMIT     // Catch: java.lang.Throwable -> L11
            if (r0 >= r1) goto L35
            r7.fastPutString(r8, r9, r5)     // Catch: java.lang.Throwable -> L11
            r1 = r7
            r2 = r8
            goto L62
        L35:
            boolean r0 = r9.isEmpty()     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L3e
            byte[] r0 = io.fastkv.AbsFastKV.EMPTY_ARRAY     // Catch: java.lang.Throwable -> L11
            goto L44
        L3e:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L6a
            byte[] r0 = r9.getBytes(r0)     // Catch: java.lang.Throwable -> L6a
        L44:
            io.fastkv.interfaces.FastCipher r1 = r7.cipher     // Catch: java.lang.Throwable -> L6a
            if (r1 == 0) goto L4c
            byte[] r0 = r1.encrypt(r0)     // Catch: java.lang.Throwable -> L11
        L4c:
            r4 = r0
            if (r4 != 0) goto L5b
            java.lang.Exception r8 = new java.lang.Exception     // Catch: java.lang.Throwable -> L11
            java.lang.String r9 = "Encrypt failed"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L11
            r7.error(r8)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r7)
            return r7
        L5b:
            r6 = 6
            r1 = r7
            r2 = r8
            r3 = r9
            r1.addOrUpdate(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L67
        L62:
            r7.handleChange(r2)     // Catch: java.lang.Throwable -> L67
        L65:
            monitor-exit(r7)
            return r1
        L67:
            r0 = move-exception
        L68:
            r8 = r0
            goto L6d
        L6a:
            r0 = move-exception
            r1 = r7
            goto L68
        L6d:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L67
            throw r8
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized android.content.SharedPreferences.Editor putStringSet(java.lang.String r2, java.util.Set<java.lang.String> r3) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.closed     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto L7
            monitor-exit(r1)
            return r1
        L7:
            if (r3 != 0) goto Lf
            r1.remove(r2)     // Catch: java.lang.Throwable -> Ld
            goto L14
        Ld:
            r2 = move-exception
            goto L16
        Lf:
            io.fastkv.StringSetEncoder r0 = io.fastkv.StringSetEncoder.INSTANCE     // Catch: java.lang.Throwable -> Ld
            r1.putObject(r2, r3, r0)     // Catch: java.lang.Throwable -> Ld
        L14:
            monitor-exit(r1)
            return r1
        L16:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    @Override // android.content.SharedPreferences
    public synchronized void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener r2) {
            r1 = this;
            monitor-enter(r1)
            if (r2 != 0) goto L5
            monitor-exit(r1)
            return
        L5:
            java.util.ArrayList<android.content.SharedPreferences$OnSharedPreferenceChangeListener> r0 = r1.listeners     // Catch: java.lang.Throwable -> L13
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L15
            java.util.ArrayList<android.content.SharedPreferences$OnSharedPreferenceChangeListener> r0 = r1.listeners     // Catch: java.lang.Throwable -> L13
            r0.add(r2)     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r1)
            return
        L17:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r2
    }

    public void remove(byte r9, int r10, int r11) {
            r8 = this;
            r8.countInvalid(r10, r11)
            r9 = r9 | (-128(0xffffffffffffff80, float:NaN))
            byte r9 = (byte) r9
            io.fastkv.FastBuffer r11 = r8.fastBuffer
            byte[] r11 = r11.hb
            r0 = r11[r10]
            r1 = r10 & 7
            int r1 = r1 << 3
            long r2 = r8.checksum
            r0 = r0 ^ r9
            long r4 = (long) r0
            r6 = 255(0xff, double:1.26E-321)
            long r4 = r4 & r6
            long r0 = r4 << r1
            long r0 = r0 ^ r2
            r8.checksum = r0
            r11[r10] = r9
            return
    }

    public abstract void removeOldFile(java.lang.String r1);

    public void resetData() {
            r2 = this;
            r0 = 12
            r2.dataEnd = r0
            r0 = 0
            r2.checksum = r0
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r2.data
            r0.clear()
            io.fastkv.WeakCache r0 = r2.bigValueCache
            r0.clear()
            io.fastkv.WeakCache r0 = r2.externalCache
            r0.clear()
            r2.clearInvalid()
            return
    }

    public final void resetMemory() {
            r0 = this;
            r0.resetData()
            r0.resetBuffer()
            return
    }

    public void rewrite() {
            r9 = this;
            java.util.Map<java.lang.String, io.fastkv.interfaces.FastEncoder> r0 = r9.encoderMap
            int r0 = r0.size()
            io.fastkv.interfaces.FastEncoder[] r0 = new io.fastkv.interfaces.FastEncoder[r0]
            java.util.Map<java.lang.String, io.fastkv.interfaces.FastEncoder> r1 = r9.encoderMap
            java.util.Collection r1 = r1.values()
            java.lang.Object[] r0 = r1.toArray(r0)
            r4 = r0
            io.fastkv.interfaces.FastEncoder[] r4 = (io.fastkv.interfaces.FastEncoder[]) r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "temp_"
            r0.<init>(r1)
            java.lang.String r1 = r9.name
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            io.fastkv.FastKV r1 = new io.fastkv.FastKV
            java.lang.String r2 = r9.path
            io.fastkv.interfaces.FastCipher r5 = r9.cipher
            r6 = 2
            r1.<init>(r2, r3, r4, r5, r6)
            r0 = 0
            r1.autoCommit = r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r4 = r9.data
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L41:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L107
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r5.getValue()
            boolean r7 = r5 instanceof io.fastkv.Container.StringContainer
            r8 = 0
            if (r7 == 0) goto L7b
            io.fastkv.Container$StringContainer r5 = (io.fastkv.Container.StringContainer) r5
            boolean r7 = r5.external
            if (r7 == 0) goto L73
            java.lang.Object r7 = r5.value
            java.lang.String r7 = (java.lang.String) r7
            r2.add(r7)
            java.lang.String r5 = r9.getStringFromFile(r5, r8)
            if (r5 == 0) goto L41
            r1.putString(r6, r5)
            goto L41
        L73:
            java.lang.Object r5 = r5.value
            java.lang.String r5 = (java.lang.String) r5
            r1.putString(r6, r5)
            goto L41
        L7b:
            boolean r7 = r5 instanceof io.fastkv.Container.BooleanContainer
            if (r7 == 0) goto L87
            io.fastkv.Container$BooleanContainer r5 = (io.fastkv.Container.BooleanContainer) r5
            boolean r5 = r5.value
            r1.putBoolean(r6, r5)
            goto L41
        L87:
            boolean r7 = r5 instanceof io.fastkv.Container.IntContainer
            if (r7 == 0) goto L93
            io.fastkv.Container$IntContainer r5 = (io.fastkv.Container.IntContainer) r5
            int r5 = r5.value
            r1.putInt(r6, r5)
            goto L41
        L93:
            boolean r7 = r5 instanceof io.fastkv.Container.LongContainer
            if (r7 == 0) goto L9f
            io.fastkv.Container$LongContainer r5 = (io.fastkv.Container.LongContainer) r5
            long r7 = r5.value
            r1.putLong(r6, r7)
            goto L41
        L9f:
            boolean r7 = r5 instanceof io.fastkv.Container.FloatContainer
            if (r7 == 0) goto Lab
            io.fastkv.Container$FloatContainer r5 = (io.fastkv.Container.FloatContainer) r5
            float r5 = r5.value
            r1.putFloat(r6, r5)
            goto L41
        Lab:
            boolean r7 = r5 instanceof io.fastkv.Container.DoubleContainer
            if (r7 == 0) goto Lb7
            io.fastkv.Container$DoubleContainer r5 = (io.fastkv.Container.DoubleContainer) r5
            double r7 = r5.value
            r1.putDouble(r6, r7)
            goto L41
        Lb7:
            boolean r7 = r5 instanceof io.fastkv.Container.ArrayContainer
            if (r7 == 0) goto Ldc
            io.fastkv.Container$ArrayContainer r5 = (io.fastkv.Container.ArrayContainer) r5
            boolean r7 = r5.external
            if (r7 == 0) goto Ld3
            java.lang.Object r7 = r5.value
            java.lang.String r7 = (java.lang.String) r7
            r2.add(r7)
            byte[] r5 = r9.getArrayFromFile(r5, r8)
            if (r5 == 0) goto L41
            r1.putArray(r6, r5)
            goto L41
        Ld3:
            java.lang.Object r5 = r5.value
            byte[] r5 = (byte[]) r5
            r1.putArray(r6, r5)
            goto L41
        Ldc:
            boolean r7 = r5 instanceof io.fastkv.Container.ObjectContainer
            if (r7 == 0) goto L41
            io.fastkv.Container$ObjectContainer r5 = (io.fastkv.Container.ObjectContainer) r5
            boolean r7 = r5.external
            if (r7 == 0) goto Lfc
            java.lang.Object r7 = r5.value
            java.lang.String r7 = (java.lang.String) r7
            r2.add(r7)
            java.lang.Object r7 = r9.getObjectFromFile(r5, r8)
            if (r7 == 0) goto L41
            io.fastkv.interfaces.FastEncoder r5 = r5.encoder
            if (r5 == 0) goto L41
            r1.putObject(r6, r7, r5)
            goto L41
        Lfc:
            io.fastkv.interfaces.FastEncoder r7 = r5.encoder
            if (r7 == 0) goto L41
            java.lang.Object r5 = r5.value
            r1.putObject(r6, r5, r7)
            goto L41
        L107:
            java.lang.String r4 = ""
            r1.contains(r4)
            io.fastkv.FastBuffer r4 = r1.fastBuffer
            r9.fastBuffer = r4
            long r4 = r1.checksum
            r9.checksum = r4
            int r4 = r1.dataEnd
            r9.dataEnd = r4
            r9.clearInvalid()
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r4 = r9.data
            r4.clear()
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r4 = r9.data
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r5 = r1.data
            r4.putAll(r5)
            r9.copyToMainFile(r1)
        L12a:
            io.fastkv.TagExecutor r4 = r1.externalExecutor
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L138
            r4 = 10
            java.lang.Thread.sleep(r4)     // Catch: java.lang.Exception -> L12a
            goto L12a
        L138:
            java.io.File r1 = new java.io.File
            java.lang.String r4 = r9.path
            r1.<init>(r4, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r9.path
            r3.append(r4)
            java.lang.String r4 = r9.name
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            io.fastkv.Utils.moveDirFiles(r1, r3)
            io.fastkv.Utils.deleteFile(r1)
            int r1 = r2.size()
            r4 = r0
        L15d:
            if (r4 >= r1) goto L170
            java.lang.Object r5 = r2.get(r4)
            int r4 = r4 + 1
            java.lang.String r5 = (java.lang.String) r5
            java.io.File r6 = new java.io.File
            r6.<init>(r3, r5)
            io.fastkv.Utils.deleteFile(r6)
            goto L15d
        L170:
            r9.needRewrite = r0
            return
    }

    public final long shiftCheckSum(long r3, int r5) {
            r2 = this;
            r5 = r5 & 7
            int r5 = r5 << 3
            long r0 = r3 << r5
            int r5 = 64 - r5
            long r3 = r3 >>> r5
            long r3 = r3 | r0
            return r3
    }

    public abstract void syncCompatBuffer(int r1, int r2, int r3);

    public final void tryBlockingIO(java.io.File r1, java.io.File r2) {
            r0 = this;
            boolean r1 = r0.loadWithBlockingIO(r1)     // Catch: java.io.IOException -> L7
            if (r1 == 0) goto Lb
            goto L14
        L7:
            r1 = move-exception
            r0.warning(r1)
        Lb:
            r0.resetMemory()
            boolean r1 = r0.loadWithBlockingIO(r2)     // Catch: java.io.IOException -> L15
            if (r1 == 0) goto L19
        L14:
            return
        L15:
            r1 = move-exception
            r0.warning(r1)
        L19:
            r0.resetMemory()
            return
    }

    @Override // android.content.SharedPreferences
    public synchronized void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.ArrayList<android.content.SharedPreferences$OnSharedPreferenceChangeListener> r0 = r1.listeners     // Catch: java.lang.Throwable -> L8
            r0.remove(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    public abstract void updateBoolean(byte r1, int r2);

    public void updateBytes(int r6, byte[] r7) {
            r5 = this;
            int r0 = r7.length
            long r1 = r5.checksum
            io.fastkv.FastBuffer r3 = r5.fastBuffer
            long r3 = r3.getChecksum(r6, r0)
            long r1 = r1 ^ r3
            r5.checksum = r1
            io.fastkv.FastBuffer r1 = r5.fastBuffer
            r1.position = r6
            r1.putBytes(r7)
            long r1 = r5.checksum
            io.fastkv.FastBuffer r7 = r5.fastBuffer
            long r6 = r7.getChecksum(r6, r0)
            long r6 = r6 ^ r1
            r5.checksum = r6
            return
    }

    public abstract void updateChange();

    public abstract void updateInt32(int r1, long r2, int r4);

    public abstract void updateInt64(long r1, long r3, int r5);

    public final void updateOffset(int r6, int[] r7, int[] r8) {
            r5 = this;
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r5.data
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            io.fastkv.Container$BaseContainer r1 = (io.fastkv.Container.BaseContainer) r1
            int r2 = r1.offset
            if (r2 <= r6) goto La
            int r2 = io.fastkv.Utils.binarySearch(r7, r2)
            r2 = r8[r2]
            int r3 = r1.offset
            int r3 = r3 - r2
            r1.offset = r3
            byte r3 = r1.getType()
            r4 = 6
            if (r3 < r4) goto La
            io.fastkv.Container$VarContainer r1 = (io.fastkv.Container.VarContainer) r1
            int r3 = r1.start
            int r3 = r3 - r2
            r1.start = r3
            goto La
        L34:
            return
    }

    public final void warning(java.lang.Exception r3) {
            r2 = this;
            io.fastkv.interfaces.FastLogger r0 = r2.logger
            if (r0 == 0) goto L9
            java.lang.String r1 = r2.name
            r0.w(r1, r3)
        L9:
            return
    }
}
