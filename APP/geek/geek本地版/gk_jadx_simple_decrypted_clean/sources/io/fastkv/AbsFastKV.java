package io.fastkv;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import defpackage.z30;
import io.fastkv.Container;
import io.fastkv.interfaces.FastCipher;
import io.fastkv.interfaces.FastEncoder;
import io.fastkv.interfaces.FastLogger;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
abstract class AbsFastKV implements SharedPreferences, SharedPreferences.Editor {
    protected static final String A_SUFFIX = ".kva";
    protected static final int BASE_GC_BYTES_THRESHOLD = 8192;
    protected static final int BASE_GC_KEYS_THRESHOLD = 80;
    protected static final String BOTH_FILES_ERROR = "both files error";
    protected static final String B_SUFFIX = ".kvb";
    protected static final int CIPHER_MASK = 1073741824;
    protected static final String C_SUFFIX = ".kvc";
    protected static final int DATA_SIZE_LIMIT = 268435456;
    protected static final int DATA_START = 12;
    protected static final byte[] EMPTY_ARRAY = null;
    protected static final String ENCRYPT_FAILED = "Encrypt failed";
    static final String GC_FINISH = "gc finish";
    protected static final String MAP_FAILED = "map failed";
    protected static final String MISS_CIPHER = "miss cipher";
    protected static final String OPEN_FILE_FAILED = "open file failed";
    protected static final int PAGE_SIZE = 0;
    protected static final String PARSE_DATA_FAILED = "parse dara failed";
    protected static final String TEMP_SUFFIX = ".tmp";
    static final String TRUNCATE_FINISH = "truncate finish";
    protected static final int TRUNCATE_THRESHOLD = 0;
    protected static final int[] TYPE_SIZE = null;
    protected final int INTERNAL_LIMIT;
    protected final WeakCache bigValueCache;
    protected long checksum;
    protected final FastCipher cipher;
    protected boolean closed;
    protected final HashMap<String, Container.BaseContainer> data;
    protected int dataEnd;
    protected final List<String> deletedFiles;
    protected final Map<String, FastEncoder> encoderMap;
    protected final WeakCache externalCache;
    protected final TagExecutor externalExecutor;
    protected FastBuffer fastBuffer;
    protected int invalidBytes;
    protected final ArrayList<Segment> invalids;
    protected final ArrayList<SharedPreferences.OnSharedPreferenceChangeListener> listeners;
    protected final FastLogger logger;
    private final Handler mainHandler;
    protected final String name;
    protected boolean needRewrite;
    protected final String path;
    protected volatile boolean startLoading;
    protected String tempExternalName;
    protected int updateSize;
    protected int updateStart;

    public static class Segment implements Comparable<Segment> {
        int end;
        int start;

        public Segment(int r1, int r2) {
            this.start = r1;
            this.end = r2;
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Segment r1) {
            return compareTo2(r1);
        }

        /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(Segment r2) {
            return this.start - r2.start;
        }
    }

    static {
        TYPE_SIZE = new int[]{0, 1, 4, 4, 8, 8};
        EMPTY_ARRAY = new byte[0];
        int r0 = Utils.getPageSize();
        PAGE_SIZE = r0;
        TRUNCATE_THRESHOLD = Math.max(r0, 32768);
    }

    public AbsFastKV(String r4, String r5, FastEncoder[] r6, FastCipher r7) {
        this.INTERNAL_LIMIT = FastKVConfig.internalLimit;
        this.logger = FastKVConfig.sLogger;
        this.data = new HashMap();
        int r0 = 0;
        this.startLoading = false;
        this.deletedFiles = new ArrayList();
        this.needRewrite = false;
        this.closed = false;
        this.externalCache = new WeakCache();
        this.bigValueCache = new WeakCache();
        this.externalExecutor = new TagExecutor();
        this.invalids = new ArrayList();
        this.listeners = new ArrayList();
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.path = r4;
        this.name = r5;
        this.cipher = r7;
        HashMap r42 = new HashMap();
        if (r6 == null) goto L11;
        int r52 = r6.length;
    L5:
        if (r0 >= r52) goto L11;
        FastEncoder r72 = r6[r0];
        String r1 = r72.tag();
        if (r42.containsKey(r1) == false) goto L9;
        error("duplicate encoder tag:" + r1);
    L10:
        r0 = r0 + 1;
        goto L5
    L9:
        r42.put(r1, r72);
    L11:
        StringSetEncoder r53 = StringSetEncoder.INSTANCE;
        r42.put(r53.tag(), r53);
        this.encoderMap = r42;
    }

    public static /* synthetic */ void a(AbsFastKV r0, SharedPreferences.OnSharedPreferenceChangeListener r1, String r2) {
        r0.lambda$notifyListeners$0(r1, r2);
    }

    private void addObject(String r7, Object r8, byte[] r9, byte r10) {
        int r2 = saveArray(r7, r9, r10);
        if (r2 > 0) goto L5;
        return;
    L5:
        if (this.tempExternalName == null) goto L8;
        boolean r0 = true;
    L7:
        boolean r5 = r0;
        if (r5 == false) goto L12;
        this.bigValueCache.put(r7, r8);
        r8 = this.tempExternalName;
        this.tempExternalName = null;
        int r92 = 32;
    L11:
        Object r3 = r8;
        int r4 = r92;
        if (r10 != 6) goto L17;
        Container.BaseContainer r02 = new Container.StringContainer(this.updateStart, r2, (String) r3, r4, r5);
    L20:
        this.data.put(r7, r02);
        updateChange();
        return;
    L17:
        if (r10 != 7) goto L19;
        r02 = new Container.ArrayContainer(this.updateStart, r2, r3, r4, r5);
        goto L20
    L19:
        r02 = new Container.ObjectContainer(this.updateStart, r2, r3, r4, r5);
        goto L20
    L12:
        r92 = r9.length;
        goto L11
    L8:
        r0 = false;
        goto L7
    }

    public static /* synthetic */ void b(AbsFastKV r0, String r1, byte[] r2, String r3) {
        r0.lambda$saveArray$1(r1, r2, r3);
    }

    private void countInvalid(int r3, int r4) {
        int r1 = r4 - r3;
        this.invalidBytes = r1 + this.invalidBytes;
        this.invalids.add(new Segment(r3, r4));
    }

    private void encodeObject(String r3, Object r4, Map<Class, FastEncoder> r5) {
        if ((r4 instanceof Set) == false) goto L10;
        Set<String> r0 = (Set) r4;
        if (r0.isEmpty() == false) goto L7;
    L8:
        putStringSet(r3, r0);
        return;
    L7:
        if ((r0.iterator().next() instanceof String) == true) goto L8;
    L10:
        if (r5 == null) goto L17;
        FastEncoder r52 = r5.get(r4.getClass());
        if (r52 == null) goto L15;
        putObject(r3, r4, r52);
        return;
    L15:
        warning(new Exception("missing encoder for type:" + r4.getClass()));
        return;
    L17:
        warning(new Exception("missing encoders"));
    }

    private long getNewDoubleValue(double r2) {
        long r22 = Double.doubleToRawLongBits(r2);
        FastCipher r0 = this.cipher;
        if (r0 != null) goto L5;
        return r22;
    L5:
        return r0.encrypt(r22);
    }

    private int getNewFloatValue(float r2) {
        int r22 = Float.floatToRawIntBits(r2);
        FastCipher r0 = this.cipher;
        if (r0 != null) goto L5;
        return r22;
    L5:
        return r0.encrypt(r22);
    }

    public static boolean isCipher(int r1) {
        if ((r1 & CIPHER_MASK) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    private /* synthetic */ void lambda$notifyListeners$0(SharedPreferences.OnSharedPreferenceChangeListener r1, String r2) {
        r1.onSharedPreferenceChanged(this, r2);
    }

    private /* synthetic */ void lambda$saveArray$1(String r4, byte[] r5, String r6) {
        if (Utils.saveBytes(new File(this.path + this.name, r4), r5) == true) goto L6;
        info(z30.j("Write large value with key:", r6, " failed"));
        return;
    }

    public static void mergeInvalids(ArrayList<Segment> r8) {
        int r0 = 0;
        Segment r1 = r8.get(0);
        int r2 = r8.size();
        int r4 = 1;
    L3:
        if (r4 >= r2) goto L12;
        Segment r5 = r8.get(r4);
        if (r5.start != r1.end) goto L7;
        r1.end = r5.end;
    L11:
        r4 = r4 + 1;
        goto L3
    L7:
        r0 = r0 + 1;
        if (r0 == r4) goto L10;
        r8.set(r0, r5);
    L10:
        r1 = r5;
        goto L11
    L12:
        int r02 = r0 + 1;
        if (r2 <= r02) goto L19;
        r8.subList(r02, r2).clear();
        return;
    }

    private void parseObject(int r10, String r11, int r12, int r13, FastCipher r14) {
        if (r14 != null) goto L4;
        FastBuffer r0 = this.fastBuffer;
        int r1 = r10;
    L5:
        int r2 = r0.get() & 255;
        String r3 = r0.getString(r2);
        FastEncoder r7 = this.encoderMap.get(r3);
        int r15 = r1 - (r2 + 1);
        if (r15 < 0) goto L20;
        if (r7 != null) goto L21;
        error(z30.j("object with tag: ", r3, " without encoder"));
        return;
    L21:
        Object r4 = r7.decode(r0.hb, r0.position, r15);     // Catch: Exception -> L12
        if (r4 == null) goto L14;
        Container.ObjectContainer r16 = new Container.ObjectContainer(r12, r13 + 2, r4, r10, false);     // Catch: Exception -> L12
        r16.encoder = r7;     // Catch: Exception -> L12
        this.data.put(r11, r16);     // Catch: Exception -> L12
        return;
    L14:
        return;
    L12:
        e = move-exception;
        error(e);
        return;
    L20:
        throw new Exception(PARSE_DATA_FAILED);
    L4:
        byte[] r17 = new byte[r10];
        FastBuffer r22 = this.fastBuffer;
        System.arraycopy(r22.hb, r22.position, r17, 0, r10);
        byte[] r02 = r14.decrypt(r17);
        FastBuffer r18 = new FastBuffer(r02);
        r1 = r02.length;
        r0 = r18;
        goto L5
    }

    private void prepareHeaderInfo(int r1, int r2, byte r3) {
        checkKeySize(r1);
        this.updateSize = (r1 + 2) + r2;
        preparePutBytes();
        this.fastBuffer.put(r3);
    }

    private void resetBuffer() {
        FastBuffer r0 = this.fastBuffer;
        if (r0 != null) goto L5;
    L8:
        this.fastBuffer = new FastBuffer(PAGE_SIZE);
    L9:
        this.fastBuffer.putInt(0, packSize(0));
        return;
    L5:
        if (r0.hb.length != PAGE_SIZE) goto L8;
        r0.putLong(4, 0);
        goto L9
    }

    private int saveArray(final String r5, final byte[] r6, byte r7) {
        this.tempExternalName = null;
        if (r6.length < this.INTERNAL_LIMIT) goto L5;
        info("Large value, key: " + r5 + ", size: " + r6.length);
        final String r0 = Utils.randomName();
        byte[] r2 = new byte[32];
        r0.getBytes(0, 32, r2, 0);
        int r72 = wrapArray(r5, r2, (byte) (r7 | DataType.EXTERNAL_MASK));
        if (r72 <= 0) goto L9;
        this.externalCache.put(r0, r6);
        this.externalExecutor.execute(r5, new a(this, r0, r6, r5));
        this.tempExternalName = r0;
    L9:
        return r72;
    L5:
        return wrapArray(r5, r6, r7);
    }

    public static int unpackSize(int r1) {
        return r1 & (-1073741825);
    }

    private void updateObject(String r8, Object r9, byte[] r10, Container.VarContainer r11) {
        int r0 = saveArray(r8, r10, r11.getType());
        if (r0 > 0) goto L5;
        return;
    L5:
        if (r11.external == false) goto L7;
        String r1 = (String) r11.value;
    L8:
        remove(r11.getType(), r11.start, r11.offset + r11.valueSize);
        if (this.tempExternalName == null) goto L11;
        boolean r3 = true;
    L12:
        r11.start = this.updateStart;
        r11.offset = r0;
        r11.external = r3;
        if (r3 == false) goto L15;
        this.bigValueCache.put(r8, r9);
        r11.value = this.tempExternalName;
        r11.valueSize = 32;
        this.tempExternalName = null;
    L16:
        updateChange();
        checkGC();
        if (r1 == null) goto L21;
        removeOldFile(r1);
        return;
    L21:
        return;
    L15:
        r11.value = r9;
        r11.valueSize = r10.length;
        goto L16
    L11:
        r3 = false;
        goto L12
    L7:
        r1 = null;
        goto L8
    }

    private int wrapArray(String r2, byte[] r3, byte r4) {
        if (wrapHeader(r2, r4, r3.length + 2) == true) goto L6;
        return 0;
    L6:
        this.fastBuffer.putShort((short) r3.length);
        FastBuffer r22 = this.fastBuffer;
        int r42 = r22.position;
        r22.putBytes(r3);
        return r42;
    }

    private boolean wrapHeader(String r2, byte r3) {
        return wrapHeader(r2, r3, TYPE_SIZE[r3]);
    }

    private void wrapKey(String r4, int r5) {
        this.fastBuffer.put((byte) r5);
        if (r5 != r4.length()) goto L6;
        FastBuffer r0 = this.fastBuffer;
        r4.getBytes(0, r5, r0.hb, r0.position);
        this.fastBuffer.position += r5;
        return;
    L6:
        this.fastBuffer.putString(r4);
    }

    private void wrapStringValue(String r4, int r5) {
        this.fastBuffer.putShort((short) r5);
        if (r5 != r4.length()) goto L6;
        FastBuffer r0 = this.fastBuffer;
        r4.getBytes(0, r5, r0.hb, r0.position);
        return;
    L6:
        this.fastBuffer.putString(r4);
    }

    public void addOrUpdate(String r2, Object r3, byte[] r4, Container.VarContainer r5, byte r6) {
        if (r5 != null) goto L6;
        addObject(r2, r3, r4, r6);
        return;
    L6:
        if (r5.external == false) goto L8;
    L11:
        updateObject(r2, r3, r4, r5);
        return;
    L8:
        if (r5.valueSize != r4.length) goto L11;
        updateBytes(r5.offset, r4);
        r5.value = r3;
    }

    public final int bytesThreshold() {
        if (this.dataEnd > 16384) goto L6;
        return BASE_GC_BYTES_THRESHOLD;
    L6:
        return 16384;
    }

    public abstract void checkGC();

    public final void checkKey(String r2) {
        if (r2 == null) goto L7;
        if (r2.isEmpty() == true) goto L7;
        return;
    L7:
        throw new IllegalArgumentException("key is empty");
    }

    public final void checkKeySize(int r2) {
        if (r2 > 255) goto L6;
        return;
    L6:
        throw new IllegalArgumentException("key's length must less than 256");
    }

    public final void clearInvalid() {
        this.invalidBytes = 0;
        this.invalids.clear();
    }

    @Override // android.content.SharedPreferences
    public synchronized boolean contains(String r2) {
        monitor-enter(this);
        boolean r22 = this.data.containsKey(r2);     // Catch: Throwable -> L6
        monitor-exit(this);
        return r22;
    L6:
        th = move-exception;
        throw th;
    }

    public abstract void copyToMainFile(FastKV r1);

    public final void deleteCFiles() {
        Utils.deleteFile(new File(this.path, this.name + C_SUFFIX));     // Catch: Exception -> L4
        Utils.deleteFile(new File(this.path, this.name + TEMP_SUFFIX));     // Catch: Exception -> L4
        return;
    L4:
        e = move-exception;
        error(e);
    }

    public abstract void ensureSize(int r1);

    public final void error(String r4) {
        FastLogger r0 = this.logger;
        if (r0 == null) goto L6;
        r0.e(this.name, new Exception(r4));
        return;
    }

    public void fastPutString(String r10, String r11, Container.StringContainer r12) {
        int r4 = FastBuffer.getStringSize(r11);
        if (r12 != null) goto L6;
        int r122 = FastBuffer.getStringSize(r10);
        checkKeySize(r122);
        int r1 = r122 + 4;
        this.updateSize = r1 + r4;
        preparePutBytes();
        this.fastBuffer.put((byte) 6);
        wrapKey(r10, r122);
        wrapStringValue(r11, r4);
        HashMap<String, Container.BaseContainer> r123 = this.data;
        int r13 = this.updateStart;
        r123.put(r10, new Container.StringContainer(r13, r1 + r13, r11, r4, false));
        updateChange();
        return;
    L6:
        int r102 = r12.offset;
        int r112 = r102 - r12.start;
        int r14 = r12.valueSize;
        String r2 = null;
        boolean r5 = false;
        if (r14 != r4) goto L13;
        this.checksum = this.fastBuffer.getChecksum(r102, r14) ^ this.checksum;
        if (r4 != r11.length()) goto L11;
        r11.getBytes(0, r4, this.fastBuffer.hb, r12.offset);
    L12:
        this.updateStart = r12.offset;
        this.updateSize = r4;
    L17:
        r12.value = r11;
        updateChange();
        if (r5 == false) goto L20;
        checkGC();
    L20:
        if (r2 == null) goto L23;
        removeOldFile(r2);
        return;
    L23:
        return;
    L11:
        FastBuffer r103 = this.fastBuffer;
        r103.position = r12.offset;
        r103.putString(r11);
        goto L12
    L13:
        this.updateSize = r112 + r4;
        preparePutBytes();
        this.fastBuffer.put((byte) 6);
        int r104 = r112 - 3;
        FastBuffer r15 = this.fastBuffer;
        byte[] r6 = r15.hb;
        System.arraycopy(r6, r12.start + 1, r6, r15.position, r104);
        this.fastBuffer.position += r104;
        wrapStringValue(r11, r4);
        remove((byte) 6, r12.start, r12.offset + r12.valueSize);
        if (r12.external == false) goto L16;
        r2 = (String) r12.value;
    L16:
        r12.external = false;
        int r105 = this.updateStart;
        r12.start = r105;
        r12.offset = r105 + r112;
        r12.valueSize = r4;
        r5 = true;
        goto L17
    }

    public void gc(int r18) {
        Collections.sort(this.invalids);
        mergeInvalids(this.invalids);
        boolean r2 = false;
        Segment r1 = this.invalids.get(0);
        int r3 = r1.start;
        int r4 = this.dataEnd;
        int r5 = r4 - this.invalidBytes;
        int r6 = r5 - 12;
        int r7 = r5 - r3;
        int r42 = r4 - r3;
        int r9 = 1;
        if (r6 >= (r42 + r7)) goto L5;
        r2 = true;
    L5:
        if (r2 == true) goto L7;
        this.checksum ^= this.fastBuffer.getChecksum(r3, r42);
    L7:
        int r43 = this.invalids.size();
        int r11 = r43 - 1;
        int r8 = this.dataEnd - this.invalids.get(r11).end;
        if (r8 <= 0) goto L10;
        int r10 = r43;
    L11:
        int[] r12 = new int[r10];
        int[] r102 = new int[r10];
        int r13 = r1.start;
        int r14 = r1.end;
    L12:
        if (r9 >= r43) goto L14;
        Segment r142 = this.invalids.get(r9);
        int r15 = r142.start - r14;
        boolean r16 = r2;
        byte[] r22 = this.fastBuffer.hb;
        System.arraycopy(r22, r14, r22, r13, r15);
        int r23 = r9 - 1;
        r12[r23] = r14;
        r102[r23] = r14 - r13;
        r13 = r13 + r15;
        r14 = r142.end;
        r9 = r9 + 1;
        r2 = r16;
        goto L12
    L14:
        boolean r162 = r2;
        if (r8 <= 0) goto L17;
        byte[] r24 = this.fastBuffer.hb;
        System.arraycopy(r24, r14, r24, r13, r8);
        r12[r11] = r14;
        r102[r11] = r14 - r13;
    L17:
        clearInvalid();
        if (r162 == false) goto L20;
        this.checksum = this.fastBuffer.getChecksum(DATA_START, r6);
    L21:
        this.dataEnd = r5;
        syncCompatBuffer(r3, r18, r7);
        updateOffset(r3, r12, r102);
        info(GC_FINISH);
        return;
    L20:
        this.checksum ^= this.fastBuffer.getChecksum(r3, r7);
        goto L21
    L10:
        r10 = r11;
        goto L11
    }

    @Override // android.content.SharedPreferences
    public synchronized Map<String, Object> getAll() {
        monitor-enter(this);
        int r0 = this.data.size();     // Catch: Throwable -> L8
        if (r0 != 0) goto L10;
        HashMap r02 = new HashMap();     // Catch: Throwable -> L8
        monitor-exit(this);
        return r02;
    L10:
        HashMap r1 = new HashMap(((r0 * 4) / 3) + 1);     // Catch: Throwable -> L8
        Iterator<Map.Entry<String, Container.BaseContainer>> r03 = this.data.entrySet().iterator();     // Catch: Throwable -> L8
    L12:
        if (r03.hasNext() == false) goto L36;
        Map.Entry<String, Container.BaseContainer> r2 = r03.next();     // Catch: Throwable -> L8
        String r3 = r2.getKey();     // Catch: Throwable -> L8
        Container.BaseContainer r22 = r2.getValue();     // Catch: Throwable -> L8
        switch(r22.getType()) {
            case 1: goto L32;
            case 2: goto L31;
            case 3: goto L30;
            case 4: goto L29;
            case 5: goto L28;
            case 6: goto L24;
            case 7: goto L20;
            case 8: goto L16;
            default: goto L15;
        };     // Catch: Throwable -> L8
    L15:
        Object r23 = null;
    L33:
        if (r23 == null) goto L12;
        r1.put(r3, r23);     // Catch: Throwable -> L8
        goto L12
    L16:
        Container.ObjectContainer r4 = (Container.ObjectContainer) r22;     // Catch: Throwable -> L8
        if (r4.external == false) goto L19;
        r23 = getObjectFromFile(r4, this.cipher);     // Catch: Throwable -> L8
        goto L33
    L19:
        r23 = ((Container.ObjectContainer) r22).value;     // Catch: Throwable -> L8
        goto L33
    L20:
        Container.ArrayContainer r24 = (Container.ArrayContainer) r22;     // Catch: Throwable -> L8
        if (r24.external == false) goto L23;
        r23 = getArrayFromFile(r24, this.cipher);     // Catch: Throwable -> L8
        goto L33
    L23:
        r23 = r24.value;     // Catch: Throwable -> L8
        goto L33
    L24:
        Container.StringContainer r25 = (Container.StringContainer) r22;     // Catch: Throwable -> L8
        if (r25.external == false) goto L27;
        r23 = getStringFromFile(r25, this.cipher);     // Catch: Throwable -> L8
        goto L33
    L27:
        r23 = r25.value;     // Catch: Throwable -> L8
        goto L33
    L28:
        r23 = Double.valueOf(((Container.DoubleContainer) r22).value);     // Catch: Throwable -> L8
        goto L33
    L29:
        r23 = Long.valueOf(((Container.LongContainer) r22).value);     // Catch: Throwable -> L8
        goto L33
    L30:
        r23 = Float.valueOf(((Container.FloatContainer) r22).value);     // Catch: Throwable -> L8
        goto L33
    L31:
        r23 = Integer.valueOf(((Container.IntContainer) r22).value);     // Catch: Throwable -> L8
        goto L33
    L32:
        r23 = Boolean.valueOf(((Container.BooleanContainer) r22).value);     // Catch: Throwable -> L8
        goto L33
    L36:
        monitor-exit(this);
        return r1;
    L8:
        th = move-exception;
        throw th;
    }

    public byte[] getArray(String r2) {
        return getArray(r2, EMPTY_ARRAY);
    }

    public byte[] getArrayFromFile(Container.ArrayContainer r4, FastCipher r5) {
        String r42 = (String) r4.value;
        byte[] r0 = (byte[]) this.externalCache.get(r42);
        if (r0 == null) goto L16;
    L6:
        if (r0 == null) goto L18;
        if (r5 == null) goto L12;
        return r5.decrypt(r0);
    L10:
        e = move-exception;
        error(e);
        return null;
    L12:
        return r0;
    L18:
        return null;
    L16:
        r0 = Utils.getBytes(new File(this.path + this.name, r42));     // Catch: Exception -> L10
        goto L6
    }

    public synchronized boolean getBoolean(String r2) {
        monitor-enter(this);
        boolean r22 = getBoolean(r2, false);     // Catch: Throwable -> L7
        monitor-exit(this);
        return r22;
    L7:
        th = move-exception;
        throw th;
    }

    public double getDouble(String r3) {
        return getDouble(r3, 0.0d);
    }

    public float getFloat(String r2) {
        return getFloat(r2, 0.0f);
    }

    public int getInt(String r2) {
        return getInt(r2, 0);
    }

    public synchronized long getLong(String r3) {
        monitor-enter(this);
        Container.LongContainer r32 = (Container.LongContainer) this.data.get(r3);     // Catch: Throwable -> L9
        if (r32 != null) goto L6;
        long r0 = 0;
    L7:
        monitor-exit(this);
        return r0;
    L6:
        r0 = r32.value;     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        throw th;
    }

    public final int getNewCapacity(int r2, int r3) {
        if (r3 >= DATA_SIZE_LIMIT) goto L11;
        int r0 = PAGE_SIZE;
        if (r3 > r0) goto L7;
        return r0;
    L7:
        if (r2 >= r3) goto L9;
        r2 = r2 << 1;
        goto L7
    L9:
        return r2;
    L11:
        throw new IllegalStateException("data size out of limit");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public synchronized <T> T getObject(String r3) {
        monitor-enter(this);
        Container.ObjectContainer r0 = (Container.ObjectContainer) this.data.get(r3);     // Catch: Throwable -> L14
        if (r0 != null) goto L6;
    L22:
        monitor-exit(this);
        return null;
    L6:
        if (r0.external == false) goto L19;
        T r1 = (T) this.bigValueCache.get(r3);
        if (r1 == null) goto L11;
        monitor-exit(this);
        return r1;
    L11:
        T r02 = (T) getObjectFromFile(r0, this.cipher);
        if (r02 != null) goto L16;
        remove(r3);     // Catch: Throwable -> L14
        goto L22
    L16:
        this.bigValueCache.put(r3, r02);     // Catch: Throwable -> L14
        monitor-exit(this);
        return r02;
    L19:
        T r32 = (T) r0.value;
        monitor-exit(this);
        return r32;
    L14:
        th = move-exception;
        throw th;
    }

    public Object getObjectFromFile(Container.ObjectContainer r6, FastCipher r7) {
        String r1 = (String) r6.value;
        byte[] r2 = (byte[]) this.externalCache.get(r1);
        if (r2 == null) goto L21;
    L6:
        if (r2 == null) goto L16;
        if (r7 == null) goto L11;
        r2 = r7.decrypt(r2);     // Catch: Exception -> L9
    L11:
        int r72 = r2[0] & 255;     // Catch: Exception -> L9
        String r12 = this.fastBuffer.decodeStr(r2, 1, r72);     // Catch: Exception -> L9
        FastEncoder r4 = this.encoderMap.get(r12);     // Catch: Exception -> L9
        if (r4 == null) goto L15;
        r6.encoder = r4;     // Catch: Exception -> L9
        int r73 = r72 + 1;     // Catch: Exception -> L9
        return r4.decode(r2, r73, r2.length - r73);
    L15:
        warning(new Exception("No encoder for tag:" + r12));     // Catch: Exception -> L9
        return null;
    L16:
        warning(new Exception("Read object data failed"));     // Catch: Exception -> L9
        return null;
    L21:
        r2 = Utils.getBytes(new File(this.path + this.name, r1));     // Catch: Exception -> L9
    L9:
        e = move-exception;
        error(e);
        return null;
    }

    public String getString(String r2) {
        return getString(r2, "");
    }

    public String getStringFromFile(Container.StringContainer r5, FastCipher r6) {
        String r52 = (String) r5.value;
        byte[] r0 = (byte[]) this.externalCache.get(r52);
        if (r0 == null) goto L17;
    L6:
        if (r0 == null) goto L16;
        if (r6 == null) goto L11;
        r0 = r6.decrypt(r0);     // Catch: Exception -> L9
    L11:
        if (r0 == null) goto L14;
        return new String(r0, StandardCharsets.UTF_8);
    L9:
        e = move-exception;
        error(e);
        goto L16
    L14:
        return null;
    L16:
        return null;
    L17:
        r0 = Utils.getBytes(new File(this.path + this.name, r52));     // Catch: Exception -> L9
        goto L6
    }

    public synchronized Set<String> getStringSet(String r1) {
        monitor-enter(this);
        Set<String> r12 = (Set) getObject(r1);     // Catch: Throwable -> L6
        monitor-exit(this);
        return r12;
    L6:
        th = move-exception;
        throw th;
    }

    public abstract void handleChange(String r1);

    public final void info(String r3) {
        FastLogger r0 = this.logger;
        if (r0 == null) goto L6;
        r0.i(this.name, r3);
        return;
    }

    public final boolean loadWithBlockingIO(File r8) {
        long r0 = r8.length();
        if (r0 != 0) goto L5;
    L26:
        return false;
    L5:
        if (r0 >= 268435456) goto L26;
        int r02 = (int) r0;
        int r1 = getNewCapacity(PAGE_SIZE, r02);
        FastBuffer r2 = this.fastBuffer;
        if (r2 != null) goto L10;
    L12:
        r2 = new FastBuffer(new byte[r1]);
        this.fastBuffer = r2;
    L13:
        Utils.readBytes(r8, r2.hb, r02);
        int r82 = r2.getInt();
        if (r82 >= 0) goto L16;
        return false;
    L16:
        int r12 = unpackSize(r82);
        boolean r83 = isCipher(r82);
        long r4 = r2.getLong();
        this.dataEnd = r12 + DATA_START;
        if (r12 < 0) goto L26;
        if (r12 > (r02 - DATA_START)) goto L26;
        if (r4 != r2.getChecksum(DATA_START, r12)) goto L26;
        if (parseData(r83) == false) goto L26;
        this.checksum = r4;
        return true;
    L10:
        if (r2.hb.length != r1) goto L12;
        r2.position = 0;
        goto L13
    }

    public synchronized void notifyListeners(final String r7) {
        monitor-enter(this);
        ArrayList<SharedPreferences.OnSharedPreferenceChangeListener> r0 = this.listeners;     // Catch: Throwable -> L7
        int r1 = r0.size();     // Catch: Throwable -> L7
        int r2 = 0;
    L4:
        if (r2 >= r1) goto L9;
        SharedPreferences.OnSharedPreferenceChangeListener r3 = r0.get(r2);     // Catch: Throwable -> L7
        r2 = r2 + 1;     // Catch: Throwable -> L7
        final SharedPreferences.OnSharedPreferenceChangeListener r32 = r3;     // Catch: Throwable -> L7
        this.mainHandler.post(new b(this, r32, r7));     // Catch: Throwable -> L7
        goto L4
    L9:
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public final int packSize(int r2) {
        if (this.cipher != null) goto L6;
        return r2;
    L6:
        return r2 | CIPHER_MASK;
    }

    public final boolean parseData(boolean r16) {
        boolean r1 = false;
        if (r16 == true) goto L5;
    L8:
        if (r16 == false) goto L11;
        FastCipher r0 = this.cipher;
    L10:
        FastCipher r7 = r0;
        FastBuffer r02 = this.fastBuffer;
        r02.position = DATA_START;
    L94:
        int r10 = r02.position;     // Catch: Exception -> L27
        int r2 = this.dataEnd;     // Catch: Exception -> L27
        boolean r4 = true;
        if (r10 >= r2) goto L82;
        byte r22 = r02.get();     // Catch: Exception -> L27
        byte r5 = (byte) (r22 & DataType.TYPE_MASK);     // Catch: Exception -> L27
        if (r5 < 1) goto L81;
        if (r5 > 8) goto L81;
        int r3 = r02.get() & 255;     // Catch: Exception -> L27
        if (r3 == 0) goto L79;
        if (r22 < 0) goto L24;
        String r32 = r02.getString(r7, r3);     // Catch: Exception -> L27
        int r6 = r02.position;     // Catch: Exception -> L27
        if (r5 <= 5) goto L33;
        int r13 = r02.getShort() & 65535;     // Catch: Exception -> L27
        if ((r22 & DataType.EXTERNAL_MASK) == 0) goto L52;
        boolean r14 = true;
    L53:
        if (r14 == false) goto L60;
        if (r13 == 32) goto L60;
        throw new IllegalStateException("name size not match");     // Catch: Exception -> L27
    L60:
        if (r5 != 6) goto L62;
        if (r14 == false) goto L76;
        String r23 = r02.getString(r13);     // Catch: Exception -> L27
    L77:
        this.data.put(r32, new Container.StringContainer(r10, r6 + 2, r23, r13, r14));     // Catch: Exception -> L27
        goto L94
    L76:
        r23 = r02.getString(r7, r13);     // Catch: Exception -> L27
        goto L77
    L62:
        if (r5 != 7) goto L63;
        if (r14 == false) goto L70;
        Object r24 = r02.getString(r13);     // Catch: Exception -> L27
    L71:
        this.data.put(r32, new Container.ArrayContainer(r10, r6 + 2, r24, r13, r14));     // Catch: Exception -> L27
        goto L94
    L70:
        r24 = r02.getBytes(r7, r13);     // Catch: Exception -> L27
        goto L71
    L63:
        if (r14 == true) goto L64;
        parseObject(r13, r32, r10, r6, r7);     // Catch: Exception -> L27
        r02.position = (r6 + 2) + r13;     // Catch: Exception -> L27
        goto L94
    L64:
        this.data.put(r32, new Container.ObjectContainer(r10, r6 + 2, r02.getString(r13), r13, true));     // Catch: Exception -> L27
        goto L94
    L52:
        r14 = false;
        goto L53
    L33:
        if (r5 != 1) goto L35;
        HashMap<String, Container.BaseContainer> r25 = this.data;     // Catch: Exception -> L27
        if (r02.get() == 1) goto L48;
        r4 = false;
    L48:
        r25.put(r32, new Container.BooleanContainer(r6, r4));     // Catch: Exception -> L27
        goto L94
    L35:
        if (r5 != 2) goto L37;
        this.data.put(r32, new Container.IntContainer(r6, r02.getInt(r7)));     // Catch: Exception -> L27
        goto L94
    L37:
        if (r5 != 3) goto L39;
        this.data.put(r32, new Container.FloatContainer(r6, r02.getFloat(r7)));     // Catch: Exception -> L27
        goto L94
    L39:
        if (r5 != 4) goto L40;
        this.data.put(r32, new Container.LongContainer(r6, r02.getLong(r7)));     // Catch: Exception -> L27
        goto L94
    L40:
        this.data.put(r32, new Container.DoubleContainer(r6, r02.getDouble(r7)));     // Catch: Exception -> L27
        goto L94
    L24:
        r02.position += r3;
        if (r5 > 5) goto L29;
        int r26 = TYPE_SIZE[r5];     // Catch: Exception -> L27
    L30:
        int r33 = r02.position + r26;     // Catch: Exception -> L27
        r02.position = r33;     // Catch: Exception -> L27
        countInvalid(r10, r33);     // Catch: Exception -> L27
        goto L94
    L29:
        r26 = r02.getShort() & 65535;     // Catch: Exception -> L27
        goto L30
    L79:
        throw new IllegalStateException("invalid key size");     // Catch: Exception -> L27
    L81:
        throw new Exception(PARSE_DATA_FAILED);     // Catch: Exception -> L27
    L82:
        if (r10 == r2) goto L85;
        error(new Exception(PARSE_DATA_FAILED));
        return false;
    L85:
        if (r16 == false) goto L87;
    L90:
        this.needRewrite = r1;
        return true;
    L87:
        if (this.cipher == null) goto L90;
        if (r2 == DATA_START) goto L90;
        r1 = true;
    L27:
        e = move-exception;
        error(e);
        return false;
    L11:
        r0 = null;
        goto L10
    L5:
        if (this.cipher != null) goto L8;
        error(MISS_CIPHER);
        return false;
    }

    public void preparePutBytes() {
        ensureSize(this.updateSize);
        int r0 = this.dataEnd;
        this.updateStart = r0;
        this.dataEnd = this.updateSize + r0;
        this.fastBuffer.position = r0;
    }

    public synchronized void putAll(Map<String, Object> r5, Map<Class, FastEncoder> r6) {
        monitor-enter(this);
    L17:
        th = move-exception;
        throw th;
    L4:
        if (this.closed == false) goto L7;
        monitor-exit(this);
        return;
    L7:
        Iterator<Map.Entry<String, Object>> r52 = r5.entrySet().iterator();     // Catch: Throwable -> L17
    L8:
        if (r52.hasNext() == false) goto L39;
        Map.Entry<String, Object> r0 = r52.next();     // Catch: Throwable -> L17
        String r1 = r0.getKey();     // Catch: Throwable -> L17
        Object r02 = r0.getValue();     // Catch: Throwable -> L17
        if (r1 == null) goto L8;
        if (r1.isEmpty() == true) goto L8;
        if ((r02 instanceof String) == true) goto L16;
        if ((r02 instanceof Boolean) == true) goto L21;
        if ((r02 instanceof Integer) == true) goto L24;
        if ((r02 instanceof Long) == true) goto L27;
        if ((r02 instanceof Float) == true) goto L30;
        if ((r02 instanceof Double) == true) goto L33;
        if ((r02 instanceof byte[]) == true) goto L36;
        encodeObject(r1, r02, r6);     // Catch: Throwable -> L17
        goto L8
    L36:
        putArray(r1, (byte[]) r02);     // Catch: Throwable -> L17
        goto L8
    L33:
        putDouble(r1, ((Double) r02).doubleValue());     // Catch: Throwable -> L17
        goto L8
    L30:
        putFloat(r1, ((Float) r02).floatValue());     // Catch: Throwable -> L17
        goto L8
    L27:
        putLong(r1, ((Long) r02).longValue());     // Catch: Throwable -> L17
        goto L8
    L24:
        putInt(r1, ((Integer) r02).intValue());     // Catch: Throwable -> L17
        goto L8
    L21:
        putBoolean(r1, ((Boolean) r02).booleanValue());     // Catch: Throwable -> L17
        goto L8
    L16:
        putString(r1, (String) r02);     // Catch: Throwable -> L17
        goto L8
    L39:
        monitor-exit(this);
    }

    public synchronized SharedPreferences.Editor putArray(String r8, byte[] r9) {
        monitor-enter(this);
    L25:
        th = th;
    L26:
        Throwable r82 = th;
    L29:
        monitor-exit(this);     // Catch: Throwable -> L25
        throw r82;
    L27:
        th = th;
        goto L26
    L4:
        if (this.closed == false) goto L7;
        monitor-exit(this);
        return this;
    L7:
        checkKey(r8);     // Catch: Throwable -> L27
        if (r9 != null) goto L13;
        remove(r8);     // Catch: Throwable -> L11
        AbsFastKV r1 = this;
    L23:
        monitor-exit(this);
        return r1;
    L13:
        lockAndCheckUpdate();     // Catch: Throwable -> L27
        Container.ArrayContainer r5 = (Container.ArrayContainer) this.data.get(r8);     // Catch: Throwable -> L27
        FastCipher r0 = this.cipher;     // Catch: Throwable -> L27
        if (r0 == null) goto L16;
        byte[] r4 = r0.encrypt(r9);     // Catch: Throwable -> L11
    L17:
        if (r4 != null) goto L21;
        error(new Exception(ENCRYPT_FAILED));     // Catch: Throwable -> L11
        monitor-exit(this);
        return this;
    L21:
        r1 = this;
        r1.addOrUpdate(r8, r9, r4, r5, (byte) 7);     // Catch: Throwable -> L25
        handleChange(r8);     // Catch: Throwable -> L25
        goto L23
    L16:
        r4 = r9;
    L11:
        th = move-exception;
        r82 = th;
        goto L29
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putBoolean(String r4, boolean r5) {
        monitor-enter(this);
    L14:
        th = move-exception;
        throw th;
    L4:
        if (this.closed == false) goto L7;
        monitor-exit(this);
        return this;
    L7:
        checkKey(r4);     // Catch: Throwable -> L14
        lockAndCheckUpdate();     // Catch: Throwable -> L14
        Container.BooleanContainer r0 = (Container.BooleanContainer) this.data.get(r4);     // Catch: Throwable -> L14
        if (r0 != null) goto L17;
        if (wrapHeader(r4, (byte) 1) == true) goto L13;
        monitor-exit(this);
        return this;
    L13:
        FastBuffer r02 = this.fastBuffer;     // Catch: Throwable -> L14
        int r1 = r02.position;     // Catch: Throwable -> L14
        r02.put(r5 ? 1 : 0);     // Catch: Throwable -> L14
        updateChange();     // Catch: Throwable -> L14
        this.data.put(r4, new Container.BooleanContainer(r1, r5));     // Catch: Throwable -> L14
        handleChange(r4);     // Catch: Throwable -> L14
    L19:
        monitor-exit(this);
        return this;
    L17:
        if (r0.value == r5) goto L19;
        r0.value = r5;     // Catch: Throwable -> L14
        updateBoolean(r5 ? 1 : 0, r0.offset);     // Catch: Throwable -> L14
        handleChange(r4);     // Catch: Throwable -> L14
        goto L19
    }

    public synchronized SharedPreferences.Editor putDouble(String r9, double r10) {
        monitor-enter(this);
    L24:
        th = th;
    L25:
        Throwable r92 = th;
    L30:
        monitor-exit(this);     // Catch: Throwable -> L24
        throw r92;
    L26:
        th = th;
        goto L25
    L4:
        if (this.closed == false) goto L7;
        monitor-exit(this);
        return this;
    L7:
        checkKey(r9);     // Catch: Throwable -> L26
        lockAndCheckUpdate();     // Catch: Throwable -> L26
        Container.DoubleContainer r0 = (Container.DoubleContainer) this.data.get(r9);     // Catch: Throwable -> L26
        if (r0 != null) goto L19;
    L16:
        th = move-exception;
        r92 = th;
        goto L30
    L11:
        if (wrapHeader(r9, (byte) 5) == true) goto L14;
        monitor-exit(this);
        return this;
    L14:
        FastBuffer r02 = this.fastBuffer;     // Catch: Throwable -> L16
        int r1 = r02.position;     // Catch: Throwable -> L16
        r02.putLong(getNewDoubleValue(r10));     // Catch: Throwable -> L16
        updateChange();     // Catch: Throwable -> L16
        this.data.put(r9, new Container.DoubleContainer(r1, r10));     // Catch: Throwable -> L16
        handleChange(r9);     // Catch: Throwable -> L16
    L15:
        AbsFastKV r2 = this;
    L28:
        monitor-exit(this);
        return r2;
    L19:
        if (r0.value == r10) goto L15;
        long r3 = getNewDoubleValue(r10);     // Catch: Throwable -> L26
        long r5 = r3 ^ this.fastBuffer.getLong(r0.offset);     // Catch: Throwable -> L26
        r0.value = r10;     // Catch: Throwable -> L26
        r2 = this;
        r2.updateInt64(r3, r5, r0.offset);     // Catch: Throwable -> L24
        handleChange(r9);     // Catch: Throwable -> L24
        goto L28
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putFloat(String r7, float r8) {
        monitor-enter(this);
    L14:
        th = move-exception;
        throw th;
    L4:
        if (this.closed == false) goto L7;
        monitor-exit(this);
        return this;
    L7:
        checkKey(r7);     // Catch: Throwable -> L14
        lockAndCheckUpdate();     // Catch: Throwable -> L14
        Container.FloatContainer r0 = (Container.FloatContainer) this.data.get(r7);     // Catch: Throwable -> L14
        if (r0 != null) goto L17;
        if (wrapHeader(r7, (byte) 3) == true) goto L13;
        monitor-exit(this);
        return this;
    L13:
        FastBuffer r02 = this.fastBuffer;     // Catch: Throwable -> L14
        int r1 = r02.position;     // Catch: Throwable -> L14
        r02.putInt(getNewFloatValue(r8));     // Catch: Throwable -> L14
        updateChange();     // Catch: Throwable -> L14
        this.data.put(r7, new Container.FloatContainer(r1, r8));     // Catch: Throwable -> L14
        handleChange(r7);     // Catch: Throwable -> L14
    L19:
        monitor-exit(this);
        return this;
    L17:
        if (r0.value == r8) goto L19;
        int r12 = getNewFloatValue(r8);     // Catch: Throwable -> L14
        long r2 = ((long) (this.fastBuffer.getInt(r0.offset) ^ r12)) & 4294967295L;     // Catch: Throwable -> L14
        r0.value = r8;     // Catch: Throwable -> L14
        updateInt32(r12, r2, r0.offset);     // Catch: Throwable -> L14
        handleChange(r7);     // Catch: Throwable -> L14
        goto L19
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putInt(String r7, int r8) {
        monitor-enter(this);
    L16:
        th = move-exception;
        throw th;
    L4:
        if (this.closed == false) goto L7;
        monitor-exit(this);
        return this;
    L7:
        checkKey(r7);     // Catch: Throwable -> L16
        lockAndCheckUpdate();     // Catch: Throwable -> L16
        Container.IntContainer r0 = (Container.IntContainer) this.data.get(r7);     // Catch: Throwable -> L16
        if (r0 != null) goto L21;
        if (wrapHeader(r7, (byte) 2) == true) goto L13;
        monitor-exit(this);
        return this;
    L13:
        FastBuffer r02 = this.fastBuffer;     // Catch: Throwable -> L16
        int r1 = r02.position;     // Catch: Throwable -> L16
        FastCipher r2 = this.cipher;     // Catch: Throwable -> L16
        if (r2 == null) goto L18;
        int r22 = r2.encrypt(r8);     // Catch: Throwable -> L16
    L19:
        r02.putInt(r22);     // Catch: Throwable -> L16
        updateChange();     // Catch: Throwable -> L16
        this.data.put(r7, new Container.IntContainer(r1, r8));     // Catch: Throwable -> L16
        handleChange(r7);     // Catch: Throwable -> L16
    L31:
        monitor-exit(this);
        return this;
    L18:
        r22 = r8;
        goto L19
    L21:
        if (r0.value == r8) goto L31;
        FastCipher r12 = this.cipher;     // Catch: Throwable -> L16
        if (r12 == null) goto L25;
        int r13 = r12.encrypt(r8);     // Catch: Throwable -> L16
    L27:
        if (this.cipher == null) goto L29;
        int r23 = this.fastBuffer.getInt(r0.offset);     // Catch: Throwable -> L16
    L30:
        r0.value = r8;     // Catch: Throwable -> L16
        updateInt32(r13, ((long) (r23 ^ r13)) & 4294967295L, r0.offset);     // Catch: Throwable -> L16
        handleChange(r7);     // Catch: Throwable -> L16
        goto L31
    L29:
        r23 = r0.value;     // Catch: Throwable -> L16
        goto L30
    L25:
        r13 = r8;
        goto L27
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putLong(String r8, long r9) {
        monitor-enter(this);
    L38:
        th = th;
    L39:
        Throwable r82 = th;
    L44:
        monitor-exit(this);     // Catch: Throwable -> L38
        throw r82;
    L40:
        th = th;
        goto L39
    L4:
        if (this.closed == false) goto L7;
        monitor-exit(this);
        return this;
    L7:
        checkKey(r8);     // Catch: Throwable -> L40
        lockAndCheckUpdate();     // Catch: Throwable -> L40
        Container.LongContainer r0 = (Container.LongContainer) this.data.get(r8);     // Catch: Throwable -> L40
        if (r0 != null) goto L23;
        if (wrapHeader(r8, (byte) 4) == true) goto L14;
        monitor-exit(this);
        return this;
    L14:
        FastBuffer r02 = this.fastBuffer;     // Catch: Throwable -> L17
        int r1 = r02.position;     // Catch: Throwable -> L17
        FastCipher r2 = this.cipher;     // Catch: Throwable -> L17
        if (r2 == null) goto L19;
        long r22 = r2.encrypt(r9);     // Catch: Throwable -> L17
    L20:
        r02.putLong(r22);     // Catch: Throwable -> L17
        updateChange();     // Catch: Throwable -> L17
        this.data.put(r8, new Container.LongContainer(r1, r9));     // Catch: Throwable -> L17
        handleChange(r8);     // Catch: Throwable -> L17
    L21:
        AbsFastKV r12 = this;
    L42:
        monitor-exit(this);
        return r12;
    L19:
        r22 = r9;
        goto L20
    L23:
        if (r0.value == r9) goto L21;
        FastCipher r13 = this.cipher;     // Catch: Throwable -> L40
        if (r13 != null) goto L27;
        long r23 = r9;
    L30:
        if (this.cipher == null) goto L33;
        long r4 = this.fastBuffer.getLong(r0.offset);     // Catch: Throwable -> L17
    L34:
        long r42 = r4 ^ r23;     // Catch: Throwable -> L40
        r0.value = r9;     // Catch: Throwable -> L40
        r12 = this;
        r12.updateInt64(r23, r42, r0.offset);     // Catch: Throwable -> L38
        handleChange(r8);     // Catch: Throwable -> L38
        goto L42
    L33:
        r4 = r0.value;     // Catch: Throwable -> L40
        goto L34
    L27:
        r23 = r13.encrypt(r9);     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        r82 = th;
        goto L44
    }

    public synchronized <T> SharedPreferences.Editor putObject(String r8, T r9, FastEncoder<T> r10) {
        monitor-enter(this);
    L47:
        th = th;
    L48:
        Throwable r92 = th;
    L60:
        monitor-exit(this);     // Catch: Throwable -> L47
        throw r92;
    L51:
        th = th;
        goto L48
    L5:
        if (this.closed == false) goto L8;
        monitor-exit(this);
        return this;
    L8:
        checkKey(r8);     // Catch: Throwable -> L51
        if (r10 == null) goto L59;
        String r1 = r10.tag();     // Catch: Throwable -> L51
        if (r1 == null) goto L57;
        if (r1.isEmpty() == true) goto L57;
        if (r1.length() > 50) goto L57;
        if (this.encoderMap.containsKey(r1) == false) goto L55;
        if (r9 != null) goto L63;
        remove(r8);     // Catch: Throwable -> L22
        monitor-exit(this);
        return this;
    L63:
        byte[] r102 = r10.encode(r9);     // Catch: Throwable -> L22 Exception -> L26
    L30:
        if (r102 != null) goto L34;
        remove(r8);     // Catch: Throwable -> L22
        monitor-exit(this);
        return this;
    L34:
        int r0 = FastBuffer.getStringSize(r1);     // Catch: Throwable -> L51
        FastBuffer r2 = new FastBuffer((r0 + 1) + r102.length);     // Catch: Throwable -> L51
        r2.put((byte) r0);     // Catch: Throwable -> L51
        r2.putString(r1);     // Catch: Throwable -> L51
        r2.putBytes(r102);     // Catch: Throwable -> L51
        byte[] r103 = r2.hb;     // Catch: Throwable -> L51
        lockAndCheckUpdate();     // Catch: Throwable -> L51
        Container.ObjectContainer r5 = (Container.ObjectContainer) this.data.get(r8);     // Catch: Throwable -> L51
        FastCipher r02 = this.cipher;     // Catch: Throwable -> L51
        if (r02 == null) goto L37;
        r103 = r02.encrypt(r103);     // Catch: Throwable -> L22
    L37:
        byte[] r4 = r103;
        if (r4 != null) goto L66;
        monitor-exit(this);
        return this;
    L66:
        addOrUpdate(r8, r9, r4, r5, (byte) 8);     // Catch: Throwable -> L49
        handleChange(r8);     // Catch: Throwable -> L47
        monitor-exit(this);
        return this;
    L49:
        th = th;
        goto L48
    L26:
        e = move-exception;
        error(e);     // Catch: Throwable -> L51
        r102 = null;
    L22:
        th = move-exception;
        r92 = th;
        goto L60
    L55:
        throw new IllegalArgumentException("Encoder hasn't been registered");     // Catch: Throwable -> L47
    L57:
        throw new IllegalArgumentException("Invalid encoder tag:" + r1);     // Catch: Throwable -> L47
    L59:
        throw new IllegalArgumentException("Encoder is null");     // Catch: Throwable -> L47
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putString(String r8, String r9) {
        monitor-enter(this);
    L37:
        th = th;
    L38:
        Throwable r82 = th;
    L41:
        monitor-exit(this);     // Catch: Throwable -> L37
        throw r82;
    L39:
        th = th;
        goto L38
    L4:
        if (this.closed == false) goto L7;
        monitor-exit(this);
        return this;
    L7:
        checkKey(r8);     // Catch: Throwable -> L39
        if (r9 != null) goto L13;
        remove(r8);     // Catch: Throwable -> L11
        AbsFastKV r1 = this;
    L35:
        monitor-exit(this);
        return r1;
    L13:
        lockAndCheckUpdate();     // Catch: Throwable -> L39
        Container.StringContainer r5 = (Container.StringContainer) this.data.get(r8);     // Catch: Throwable -> L39
        if (this.cipher != null) goto L20;
        if ((r9.length() * 3) >= this.INTERNAL_LIMIT) goto L20;
        fastPutString(r8, r9, r5);     // Catch: Throwable -> L11
        r1 = this;
        String r2 = r8;
    L34:
        handleChange(r2);     // Catch: Throwable -> L37
    L20:
        if (r9.isEmpty() == false) goto L23;
        byte[] r0 = EMPTY_ARRAY;     // Catch: Throwable -> L11
    L24:
        FastCipher r12 = this.cipher;     // Catch: Throwable -> L39
        if (r12 == null) goto L27;
        r0 = r12.encrypt(r0);     // Catch: Throwable -> L11
    L27:
        byte[] r4 = r0;
        if (r4 != null) goto L32;
        error(new Exception(ENCRYPT_FAILED));     // Catch: Throwable -> L11
        monitor-exit(this);
        return this;
    L32:
        r1 = this;
        r2 = r8;
        r1.addOrUpdate(r2, r9, r4, r5, (byte) 6);     // Catch: Throwable -> L37
        goto L34
    L23:
        r0 = r9.getBytes(StandardCharsets.UTF_8);     // Catch: Throwable -> L39
    L11:
        th = move-exception;
        r82 = th;
        goto L41
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putStringSet(String r2, Set<String> r3) {
        monitor-enter(this);
    L9:
        th = move-exception;
        throw th;
    L4:
        if (this.closed == false) goto L7;
        monitor-exit(this);
        return this;
    L7:
        if (r3 != null) goto L11;
        remove(r2);     // Catch: Throwable -> L9
    L12:
        monitor-exit(this);
        return this;
    L11:
        putObject(r2, r3, StringSetEncoder.INSTANCE);     // Catch: Throwable -> L9
        goto L12
    }

    @Override // android.content.SharedPreferences
    public synchronized void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener r2) {
        monitor-enter(this);
        if (r2 != null) goto L16;
        monitor-exit(this);
        return;
    L16:
    L10:
        th = move-exception;
        throw th;
    L7:
        if (this.listeners.contains(r2) == true) goto L12;
        this.listeners.add(r2);     // Catch: Throwable -> L10
    L12:
        monitor-exit(this);
    }

    public void remove(byte r9, int r10, int r11) {
        countInvalid(r10, r11);
        byte r92 = (byte) (r9 | DataType.DELETE_MASK);
        byte[] r112 = this.fastBuffer.hb;
        byte r0 = r112[r10];
        long r4 = ((long) (r0 ^ r92)) & 255;
        long r02 = r4 << ((r10 & 7) << 3);
        this.checksum = r02 ^ this.checksum;
        r112[r10] = r92;
    }

    public abstract void removeOldFile(String r1);

    public void resetData() {
        this.dataEnd = DATA_START;
        this.checksum = 0;
        this.data.clear();
        this.bigValueCache.clear();
        this.externalCache.clear();
        clearInvalid();
    }

    public final void resetMemory() {
        resetData();
        resetBuffer();
    }

    public void rewrite() {
        FastEncoder[] r4 = (FastEncoder[]) this.encoderMap.values().toArray(new FastEncoder[this.encoderMap.size()]);
        String r3 = "temp_" + this.name;
        FastKV r1 = new FastKV(this.path, r3, r4, this.cipher, 2);
        r1.autoCommit = false;
        ArrayList r2 = new ArrayList();
        Iterator<Map.Entry<String, Container.BaseContainer>> r42 = this.data.entrySet().iterator();
    L4:
        if (r42.hasNext() == false) goto L48;
        Map.Entry<String, Container.BaseContainer> r5 = r42.next();
        String r6 = r5.getKey();
        Container.BaseContainer r52 = r5.getValue();
        if ((r52 instanceof Container.StringContainer) == true) goto L7;
        if ((r52 instanceof Container.BooleanContainer) == true) goto L15;
        if ((r52 instanceof Container.IntContainer) == true) goto L18;
        if ((r52 instanceof Container.LongContainer) == true) goto L21;
        if ((r52 instanceof Container.FloatContainer) == true) goto L24;
        if ((r52 instanceof Container.DoubleContainer) == true) goto L27;
        if ((r52 instanceof Container.ArrayContainer) == true) goto L30;
        if ((r52 instanceof Container.ObjectContainer) == false) goto L4;
        Container.ObjectContainer r53 = (Container.ObjectContainer) r52;
        if (r53.external == true) goto L40;
        FastEncoder r7 = r53.encoder;
        if (r7 == null) goto L4;
        r1.putObject(r6, r53.value, r7);
        goto L4
    L40:
        r2.add((String) r53.value);
        Object r72 = getObjectFromFile(r53, null);
        if (r72 == null) goto L4;
        FastEncoder r54 = r53.encoder;
        if (r54 == null) goto L4;
        r1.putObject(r6, r72, r54);
        goto L4
    L30:
        Container.ArrayContainer r55 = (Container.ArrayContainer) r52;
        if (r55.external == true) goto L32;
        r1.putArray(r6, (byte[]) r55.value);
        goto L4
    L32:
        r2.add((String) r55.value);
        byte[] r56 = getArrayFromFile(r55, null);
        if (r56 == null) goto L4;
        r1.putArray(r6, r56);
        goto L4
    L27:
        r1.putDouble(r6, ((Container.DoubleContainer) r52).value);
        goto L4
    L24:
        r1.putFloat(r6, ((Container.FloatContainer) r52).value);
        goto L4
    L21:
        r1.putLong(r6, ((Container.LongContainer) r52).value);
        goto L4
    L18:
        r1.putInt(r6, ((Container.IntContainer) r52).value);
        goto L4
    L15:
        r1.putBoolean(r6, ((Container.BooleanContainer) r52).value);
        goto L4
    L7:
        Container.StringContainer r57 = (Container.StringContainer) r52;
        if (r57.external == true) goto L9;
        r1.putString(r6, (String) r57.value);
        goto L4
    L9:
        r2.add((String) r57.value);
        String r58 = getStringFromFile(r57, null);
        if (r58 == null) goto L4;
        r1.putString(r6, r58);
        goto L4
    L48:
        r1.contains("");
        this.fastBuffer = r1.fastBuffer;
        this.checksum = r1.checksum;
        this.dataEnd = r1.dataEnd;
        clearInvalid();
        this.data.clear();
        this.data.putAll(r1.data);
        copyToMainFile(r1);
    L50:
        if (r1.externalExecutor.isEmpty() == true) goto L54;
        Thread.sleep(10);     // Catch: Exception -> L59
        goto L50
    L54:
        File r12 = new File(this.path, r3);
        String r32 = this.path + this.name;
        Utils.moveDirFiles(r12, r32);
        Utils.deleteFile(r12);
        int r13 = r2.size();
        int r43 = 0;
    L55:
        if (r43 >= r13) goto L57;
        Object r59 = r2.get(r43);
        r43 = r43 + 1;
        Utils.deleteFile(new File(r32, (String) r59));
        goto L55
    L57:
        this.needRewrite = false;
    }

    public final long shiftCheckSum(long r3, int r5) {
        int r52 = (r5 & 7) << 3;
        long r0 = r3 << r52;
        return (r3 >>> (64 - r52)) | r0;
    }

    public abstract void syncCompatBuffer(int r1, int r2, int r3);

    public final void tryBlockingIO(File r1, File r2) {
        if (loadWithBlockingIO(r1) == true) goto L19;
    L7:
        resetMemory();
        if (loadWithBlockingIO(r2) == false) goto L13;
        return;
    L13:
        resetMemory();
        return;
    L11:
        e = move-exception;
        warning(e);
        goto L13
    L19:
        return;
    L5:
        e = move-exception;
        warning(e);
        goto L7
    }

    @Override // android.content.SharedPreferences
    public synchronized void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener r2) {
        monitor-enter(this);
        this.listeners.remove(r2);     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public abstract void updateBoolean(byte r1, int r2);

    public void updateBytes(int r6, byte[] r7) {
        int r0 = r7.length;
        this.checksum ^= this.fastBuffer.getChecksum(r6, r0);
        FastBuffer r1 = this.fastBuffer;
        r1.position = r6;
        r1.putBytes(r7);
        this.checksum = this.fastBuffer.getChecksum(r6, r0) ^ this.checksum;
    }

    public abstract void updateChange();

    public abstract void updateInt32(int r1, long r2, int r4);

    public abstract void updateInt64(long r1, long r3, int r5);

    public final void updateOffset(int r6, int[] r7, int[] r8) {
        Iterator<Container.BaseContainer> r0 = this.data.values().iterator();
    L4:
        if (r0.hasNext() == false) goto L10;
        Container.BaseContainer r1 = r0.next();
        int r2 = r1.offset;
        if (r2 <= r6) goto L4;
        int r22 = r8[Utils.binarySearch(r7, r2)];
        r1.offset -= r22;
        if (r1.getType() < 6) goto L4;
        ((Container.VarContainer) r1).start -= r22;
        goto L4
    }

    public final void warning(Exception r3) {
        FastLogger r0 = this.logger;
        if (r0 == null) goto L6;
        r0.w(this.name, r3);
        return;
    }

    private boolean wrapHeader(String r3, byte r4, int r5) {
        FastCipher r0 = this.cipher;
        if (r0 == null) goto L9;
        byte[] r32 = r0.encrypt(r3.getBytes(StandardCharsets.UTF_8));
        if (r32 != null) goto L8;
        error(new Exception(ENCRYPT_FAILED));
        return false;
    L8:
        int r1 = r32.length;
        prepareHeaderInfo(r1, r5, r4);
        this.fastBuffer.put((byte) r1);
        FastBuffer r42 = this.fastBuffer;
        System.arraycopy(r32, 0, r42.hb, r42.position, r1);
        this.fastBuffer.position += r1;
        return true;
    L9:
        int r02 = FastBuffer.getStringSize(r3);
        prepareHeaderInfo(r02, r5, r4);
        wrapKey(r3, r02);
        return true;
    }

    public synchronized byte[] getArray(String r4, byte[] r5) {
        monitor-enter(this);
        Container.ArrayContainer r0 = (Container.ArrayContainer) this.data.get(r4);     // Catch: Throwable -> L12
        if (r0 != null) goto L6;
    L26:
        monitor-exit(this);
        return r5;
    L6:
        if (r0.external == false) goto L23;
        Object r1 = this.bigValueCache.get(r4);     // Catch: Throwable -> L12
        if ((r1 instanceof byte[]) == false) goto L14;
        byte[] r12 = (byte[]) r1;     // Catch: Throwable -> L12
        monitor-exit(this);
        return r12;
    L14:
        byte[] r02 = getArrayFromFile(r0, this.cipher);     // Catch: Throwable -> L12
        if (r02 != null) goto L17;
    L22:
        remove(r4);     // Catch: Throwable -> L12
        goto L26
    L17:
        if (r02.length == 0) goto L22;
        this.bigValueCache.put(r4, r02);     // Catch: Throwable -> L12
        monitor-exit(this);
        return r02;
    L23:
        byte[] r42 = (byte[]) r0.value;     // Catch: Throwable -> L12
        monitor-exit(this);
        return r42;
    L12:
        th = move-exception;
        throw th;
    }

    @Override // android.content.SharedPreferences
    public synchronized boolean getBoolean(String r2, boolean r3) {
        monitor-enter(this);
        Container.BooleanContainer r22 = (Container.BooleanContainer) this.data.get(r2);     // Catch: Throwable -> L9
        if (r22 == null) goto L7;
        r3 = r22.value;     // Catch: Throwable -> L9
    L7:
        monitor-exit(this);
        return r3;
    L9:
        th = move-exception;
        throw th;
    }

    public synchronized double getDouble(String r2, double r3) {
        monitor-enter(this);
        Container.DoubleContainer r22 = (Container.DoubleContainer) this.data.get(r2);     // Catch: Throwable -> L9
        if (r22 == null) goto L7;
        r3 = r22.value;     // Catch: Throwable -> L9
    L7:
        monitor-exit(this);
        return r3;
    L9:
        th = move-exception;
        throw th;
    }

    @Override // android.content.SharedPreferences
    public synchronized float getFloat(String r2, float r3) {
        monitor-enter(this);
        Container.FloatContainer r22 = (Container.FloatContainer) this.data.get(r2);     // Catch: Throwable -> L9
        if (r22 == null) goto L7;
        r3 = r22.value;     // Catch: Throwable -> L9
    L7:
        monitor-exit(this);
        return r3;
    L9:
        th = move-exception;
        throw th;
    }

    @Override // android.content.SharedPreferences
    public synchronized int getInt(String r2, int r3) {
        monitor-enter(this);
        Container.IntContainer r22 = (Container.IntContainer) this.data.get(r2);     // Catch: Throwable -> L9
        if (r22 == null) goto L7;
        r3 = r22.value;     // Catch: Throwable -> L9
    L7:
        monitor-exit(this);
        return r3;
    L9:
        th = move-exception;
        throw th;
    }

    @Override // android.content.SharedPreferences
    public synchronized String getString(String r4, String r5) {
        monitor-enter(this);
        Container.StringContainer r0 = (Container.StringContainer) this.data.get(r4);     // Catch: Throwable -> L12
        if (r0 != null) goto L6;
    L26:
        monitor-exit(this);
        return r5;
    L6:
        if (r0.external == false) goto L23;
        Object r1 = this.bigValueCache.get(r4);     // Catch: Throwable -> L12
        if ((r1 instanceof String) == false) goto L14;
        String r12 = (String) r1;     // Catch: Throwable -> L12
        monitor-exit(this);
        return r12;
    L14:
        String r02 = getStringFromFile(r0, this.cipher);     // Catch: Throwable -> L12
        if (r02 != null) goto L17;
    L22:
        remove(r4);     // Catch: Throwable -> L12
        goto L26
    L17:
        if (r02.isEmpty() == true) goto L22;
        this.bigValueCache.put(r4, r02);     // Catch: Throwable -> L12
        monitor-exit(this);
        return r02;
    L23:
        String r42 = (String) r0.value;     // Catch: Throwable -> L12
        monitor-exit(this);
        return r42;
    L12:
        th = move-exception;
        throw th;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String r1, Set<String> r2) {
        Set<String> r12 = getStringSet(r1);
        if (r12 == null) goto L5;
        return r12;
    L5:
        return r2;
    }

    public final void error(Exception r3) {
        FastLogger r0 = this.logger;
        if (r0 == null) goto L6;
        r0.e(this.name, r3);
        return;
    }

    @Override // android.content.SharedPreferences
    public synchronized long getLong(String r2, long r3) {
        monitor-enter(this);
        Container.LongContainer r22 = (Container.LongContainer) this.data.get(r2);     // Catch: Throwable -> L9
        if (r22 == null) goto L7;
        r3 = r22.value;     // Catch: Throwable -> L9
    L7:
        monitor-exit(this);
        return r3;
    L9:
        th = move-exception;
        throw th;
    }

    public void putAll(Map<String, Object> r2) {
        putAll(r2, null);
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return this;
    }

    public void lockAndCheckUpdate() {
    }
}
