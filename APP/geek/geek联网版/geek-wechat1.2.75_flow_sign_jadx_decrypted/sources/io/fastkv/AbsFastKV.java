package io.fastkv;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.github.megatronking.stringfog.Base64;
import io.fastkv.Container;
import io.fastkv.interfaces.FastCipher;
import io.fastkv.interfaces.FastEncoder;
import io.fastkv.interfaces.FastLogger;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.g40;

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
    protected static final String ENCRYPT_FAILED = "Encrypt failed";
    static final String GC_FINISH = "gc finish";
    protected static final String MAP_FAILED = "map failed";
    protected static final String MISS_CIPHER = "miss cipher";
    protected static final String OPEN_FILE_FAILED = "open file failed";
    protected static final int PAGE_SIZE;
    protected static final String PARSE_DATA_FAILED = "parse dara failed";
    protected static final String TEMP_SUFFIX = ".tmp";
    static final String TRUNCATE_FINISH = "truncate finish";
    protected static final int TRUNCATE_THRESHOLD;
    protected long checksum;
    protected final FastCipher cipher;
    protected int dataEnd;
    protected final Map<String, FastEncoder> encoderMap;
    protected FastBuffer fastBuffer;
    protected int invalidBytes;
    protected final String name;
    protected final String path;
    protected String tempExternalName;
    protected int updateSize;
    protected int updateStart;
    protected static final int[] TYPE_SIZE = {0, 1, 4, 4, 8, 8};
    protected static final byte[] EMPTY_ARRAY = new byte[0];
    protected final int INTERNAL_LIMIT = FastKVConfig.internalLimit;
    protected final FastLogger logger = FastKVConfig.sLogger;
    protected final HashMap<String, Container.BaseContainer> data = new HashMap<>();
    protected volatile boolean startLoading = false;
    protected final List<String> deletedFiles = new ArrayList();
    protected boolean needRewrite = false;
    protected boolean closed = false;
    protected final WeakCache externalCache = new WeakCache();
    protected final WeakCache bigValueCache = new WeakCache();
    protected final TagExecutor externalExecutor = new TagExecutor();
    protected final ArrayList<Segment> invalids = new ArrayList<>();
    protected final ArrayList<SharedPreferences.OnSharedPreferenceChangeListener> listeners = new ArrayList<>();
    private final Handler mainHandler = new Handler(Looper.getMainLooper());

    public static class Segment implements Comparable<Segment> {
        int end;
        int start;

        public Segment(int i, int i2) {
            this.start = i;
            this.end = i2;
        }

        @Override // java.lang.Comparable
        public int compareTo(Segment segment) {
            return this.start - segment.start;
        }
    }

    static {
        int pageSize = Utils.getPageSize();
        PAGE_SIZE = pageSize;
        TRUNCATE_THRESHOLD = Math.max(pageSize, 32768);
    }

    public AbsFastKV(String str, String str2, FastEncoder[] fastEncoderArr, FastCipher fastCipher) {
        this.path = str;
        this.name = str2;
        this.cipher = fastCipher;
        HashMap map = new HashMap();
        if (fastEncoderArr != null) {
            for (FastEncoder fastEncoder : fastEncoderArr) {
                String strTag = fastEncoder.tag();
                if (map.containsKey(strTag)) {
                    error(g40.m1155r("duplicate encoder tag:", strTag));
                } else {
                    map.put(strTag, fastEncoder);
                }
            }
        }
        StringSetEncoder stringSetEncoder = StringSetEncoder.INSTANCE;
        map.put(stringSetEncoder.tag(), stringSetEncoder);
        this.encoderMap = map;
    }

    private void addObject(String str, Object obj, byte[] bArr, byte b) {
        int length;
        int iSaveArray = saveArray(str, bArr, b);
        if (iSaveArray > 0) {
            boolean z = this.tempExternalName != null;
            if (z) {
                this.bigValueCache.put(str, obj);
                obj = this.tempExternalName;
                this.tempExternalName = null;
                length = 32;
            } else {
                length = bArr.length;
            }
            Object obj2 = obj;
            int i = length;
            this.data.put(str, b == 6 ? new Container.StringContainer(this.updateStart, iSaveArray, (String) obj2, i, z) : b == 7 ? new Container.ArrayContainer(this.updateStart, iSaveArray, obj2, i, z) : new Container.ObjectContainer(this.updateStart, iSaveArray, obj2, i, z));
            updateChange();
        }
    }

    private void countInvalid(int i, int i2) {
        this.invalidBytes = (i2 - i) + this.invalidBytes;
        this.invalids.add(new Segment(i, i2));
    }

    private void encodeObject(String str, Object obj, Map<Class, FastEncoder> map) throws Throwable {
        if (obj instanceof Set) {
            Set<String> set = (Set) obj;
            if (set.isEmpty() || (set.iterator().next() instanceof String)) {
                putStringSet(str, set);
                return;
            }
        }
        if (map == null) {
            warning(new Exception("missing encoders"));
            return;
        }
        FastEncoder fastEncoder = map.get(obj.getClass());
        if (fastEncoder != null) {
            putObject(str, obj, fastEncoder);
            return;
        }
        warning(new Exception("missing encoder for type:" + obj.getClass()));
    }

    private long getNewDoubleValue(double d) {
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d);
        FastCipher fastCipher = this.cipher;
        return fastCipher != null ? fastCipher.encrypt(jDoubleToRawLongBits) : jDoubleToRawLongBits;
    }

    private int getNewFloatValue(float f) {
        int iFloatToRawIntBits = Float.floatToRawIntBits(f);
        FastCipher fastCipher = this.cipher;
        return fastCipher != null ? fastCipher.encrypt(iFloatToRawIntBits) : iFloatToRawIntBits;
    }

    public static boolean isCipher(int i) {
        return (i & CIPHER_MASK) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyListeners$0(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener, String str) {
        onSharedPreferenceChangeListener.onSharedPreferenceChanged(this, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveArray$1(String str, byte[] bArr, String str2) {
        if (Utils.saveBytes(new File(this.path + this.name, str), bArr)) {
            return;
        }
        info(g40.m1147j("Write large value with key:", str2, " failed"));
    }

    public static void mergeInvalids(ArrayList<Segment> arrayList) {
        int i = 0;
        Segment segment = arrayList.get(0);
        int size = arrayList.size();
        for (int i2 = 1; i2 < size; i2++) {
            Segment segment2 = arrayList.get(i2);
            if (segment2.start == segment.end) {
                segment.end = segment2.end;
            } else {
                i++;
                if (i != i2) {
                    arrayList.set(i, segment2);
                }
                segment = segment2;
            }
        }
        int i3 = i + 1;
        if (size > i3) {
            arrayList.subList(i3, size).clear();
        }
    }

    private void parseObject(int i, String str, int i2, int i3, FastCipher fastCipher) throws Exception {
        int length;
        FastBuffer fastBuffer;
        if (fastCipher == null) {
            fastBuffer = this.fastBuffer;
            length = i;
        } else {
            byte[] bArr = new byte[i];
            FastBuffer fastBuffer2 = this.fastBuffer;
            System.arraycopy(fastBuffer2.f2561hb, fastBuffer2.position, bArr, 0, i);
            byte[] bArrDecrypt = fastCipher.decrypt(bArr);
            FastBuffer fastBuffer3 = new FastBuffer(bArrDecrypt);
            length = bArrDecrypt.length;
            fastBuffer = fastBuffer3;
        }
        int i4 = fastBuffer.get() & 255;
        String string = fastBuffer.getString(i4);
        FastEncoder fastEncoder = this.encoderMap.get(string);
        int i5 = length - (i4 + 1);
        if (i5 < 0) {
            throw new Exception(PARSE_DATA_FAILED);
        }
        if (fastEncoder == null) {
            error(g40.m1147j("object with tag: ", string, " without encoder"));
            return;
        }
        try {
            Object objDecode = fastEncoder.decode(fastBuffer.f2561hb, fastBuffer.position, i5);
            if (objDecode != null) {
                Container.ObjectContainer objectContainer = new Container.ObjectContainer(i2, i3 + 2, objDecode, i, false);
                objectContainer.encoder = fastEncoder;
                this.data.put(str, objectContainer);
            }
        } catch (Exception e) {
            error(e);
        }
    }

    private void prepareHeaderInfo(int i, int i2, byte b) {
        checkKeySize(i);
        this.updateSize = i + 2 + i2;
        preparePutBytes();
        this.fastBuffer.put(b);
    }

    private void resetBuffer() {
        FastBuffer fastBuffer = this.fastBuffer;
        if (fastBuffer == null || fastBuffer.f2561hb.length != PAGE_SIZE) {
            this.fastBuffer = new FastBuffer(PAGE_SIZE);
        } else {
            fastBuffer.putLong(4, 0L);
        }
        this.fastBuffer.putInt(0, packSize(0));
    }

    private int saveArray(final String str, final byte[] bArr, byte b) {
        this.tempExternalName = null;
        if (bArr.length < this.INTERNAL_LIMIT) {
            return wrapArray(str, bArr, b);
        }
        info("Large value, key: " + str + ", size: " + bArr.length);
        final String strRandomName = Utils.randomName();
        byte[] bArr2 = new byte[32];
        strRandomName.getBytes(0, 32, bArr2, 0);
        int iWrapArray = wrapArray(str, bArr2, (byte) (b | DataType.EXTERNAL_MASK));
        if (iWrapArray > 0) {
            this.externalCache.put(strRandomName, bArr);
            this.externalExecutor.execute(str, new Runnable() { // from class: io.fastkv.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2562a.lambda$saveArray$1(strRandomName, bArr, str);
                }
            });
            this.tempExternalName = strRandomName;
        }
        return iWrapArray;
    }

    public static int unpackSize(int i) {
        return i & (-1073741825);
    }

    private void updateObject(String str, Object obj, byte[] bArr, Container.VarContainer varContainer) {
        int iSaveArray = saveArray(str, bArr, varContainer.getType());
        if (iSaveArray > 0) {
            String str2 = varContainer.external ? (String) varContainer.value : null;
            remove(varContainer.getType(), varContainer.start, varContainer.offset + varContainer.valueSize);
            boolean z = this.tempExternalName != null;
            varContainer.start = this.updateStart;
            varContainer.offset = iSaveArray;
            varContainer.external = z;
            if (z) {
                this.bigValueCache.put(str, obj);
                varContainer.value = this.tempExternalName;
                varContainer.valueSize = 32;
                this.tempExternalName = null;
            } else {
                varContainer.value = obj;
                varContainer.valueSize = bArr.length;
            }
            updateChange();
            checkGC();
            if (str2 != null) {
                removeOldFile(str2);
            }
        }
    }

    private int wrapArray(String str, byte[] bArr, byte b) {
        if (!wrapHeader(str, b, bArr.length + 2)) {
            return 0;
        }
        this.fastBuffer.putShort((short) bArr.length);
        FastBuffer fastBuffer = this.fastBuffer;
        int i = fastBuffer.position;
        fastBuffer.putBytes(bArr);
        return i;
    }

    private boolean wrapHeader(String str, byte b) {
        return wrapHeader(str, b, TYPE_SIZE[b]);
    }

    private void wrapKey(String str, int i) {
        this.fastBuffer.put((byte) i);
        if (i != str.length()) {
            this.fastBuffer.putString(str);
            return;
        }
        FastBuffer fastBuffer = this.fastBuffer;
        str.getBytes(0, i, fastBuffer.f2561hb, fastBuffer.position);
        this.fastBuffer.position += i;
    }

    private void wrapStringValue(String str, int i) {
        this.fastBuffer.putShort((short) i);
        if (i != str.length()) {
            this.fastBuffer.putString(str);
        } else {
            FastBuffer fastBuffer = this.fastBuffer;
            str.getBytes(0, i, fastBuffer.f2561hb, fastBuffer.position);
        }
    }

    public void addOrUpdate(String str, Object obj, byte[] bArr, Container.VarContainer varContainer, byte b) {
        if (varContainer == null) {
            addObject(str, obj, bArr, b);
        } else if (varContainer.external || varContainer.valueSize != bArr.length) {
            updateObject(str, obj, bArr, varContainer);
        } else {
            updateBytes(varContainer.offset, bArr);
            varContainer.value = obj;
        }
    }

    public final int bytesThreshold() {
        if (this.dataEnd <= 16384) {
            return BASE_GC_BYTES_THRESHOLD;
        }
        return 16384;
    }

    public abstract void checkGC();

    public final void checkKey(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("key is empty");
        }
    }

    public final void checkKeySize(int i) {
        if (i > 255) {
            throw new IllegalArgumentException("key's length must less than 256");
        }
    }

    public final void clearInvalid() {
        this.invalidBytes = 0;
        this.invalids.clear();
    }

    @Override // android.content.SharedPreferences
    public synchronized boolean contains(String str) {
        return this.data.containsKey(str);
    }

    public abstract void copyToMainFile(FastKV fastKV);

    public final void deleteCFiles() {
        try {
            Utils.deleteFile(new File(this.path, this.name + C_SUFFIX));
            Utils.deleteFile(new File(this.path, this.name + TEMP_SUFFIX));
        } catch (Exception e) {
            error(e);
        }
    }

    public abstract void ensureSize(int i);

    public final void error(String str) {
        FastLogger fastLogger = this.logger;
        if (fastLogger != null) {
            fastLogger.mo1509e(this.name, new Exception(str));
        }
    }

    public void fastPutString(String str, String str2, Container.StringContainer stringContainer) {
        int stringSize = FastBuffer.getStringSize(str2);
        if (stringContainer == null) {
            int stringSize2 = FastBuffer.getStringSize(str);
            checkKeySize(stringSize2);
            int i = stringSize2 + 4;
            this.updateSize = i + stringSize;
            preparePutBytes();
            this.fastBuffer.put((byte) 6);
            wrapKey(str, stringSize2);
            wrapStringValue(str2, stringSize);
            HashMap<String, Container.BaseContainer> map = this.data;
            int i2 = this.updateStart;
            map.put(str, new Container.StringContainer(i2, i + i2, str2, stringSize, false));
            updateChange();
            return;
        }
        int i3 = stringContainer.offset;
        int i4 = i3 - stringContainer.start;
        int i5 = stringContainer.valueSize;
        boolean z = false;
        if (i5 == stringSize) {
            this.checksum = this.fastBuffer.getChecksum(i3, i5) ^ this.checksum;
            if (stringSize == str2.length()) {
                str2.getBytes(0, stringSize, this.fastBuffer.f2561hb, stringContainer.offset);
            } else {
                FastBuffer fastBuffer = this.fastBuffer;
                fastBuffer.position = stringContainer.offset;
                fastBuffer.putString(str2);
            }
            this.updateStart = stringContainer.offset;
            this.updateSize = stringSize;
        } else {
            this.updateSize = i4 + stringSize;
            preparePutBytes();
            this.fastBuffer.put((byte) 6);
            int i6 = i4 - 3;
            FastBuffer fastBuffer2 = this.fastBuffer;
            byte[] bArr = fastBuffer2.f2561hb;
            System.arraycopy(bArr, stringContainer.start + 1, bArr, fastBuffer2.position, i6);
            this.fastBuffer.position += i6;
            wrapStringValue(str2, stringSize);
            remove((byte) 6, stringContainer.start, stringContainer.offset + stringContainer.valueSize);
            str = stringContainer.external ? (String) stringContainer.value : null;
            stringContainer.external = false;
            int i7 = this.updateStart;
            stringContainer.start = i7;
            stringContainer.offset = i7 + i4;
            stringContainer.valueSize = stringSize;
            z = true;
        }
        stringContainer.value = str2;
        updateChange();
        if (z) {
            checkGC();
        }
        if (str != null) {
            removeOldFile(str);
        }
    }

    /* JADX INFO: renamed from: gc */
    public void m1508gc(int i) {
        Collections.sort(this.invalids);
        mergeInvalids(this.invalids);
        Segment segment = this.invalids.get(0);
        int i2 = segment.start;
        int i3 = this.dataEnd;
        int i4 = i3 - this.invalidBytes;
        int i5 = i4 - 12;
        int i6 = i4 - i2;
        int i7 = i3 - i2;
        int i8 = 1;
        boolean z = i5 < i7 + i6;
        if (!z) {
            this.checksum ^= this.fastBuffer.getChecksum(i2, i7);
        }
        int size = this.invalids.size();
        int i9 = size - 1;
        int i10 = this.dataEnd - this.invalids.get(i9).end;
        int i11 = i10 > 0 ? size : i9;
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        int i12 = segment.start;
        int i13 = segment.end;
        while (i8 < size) {
            Segment segment2 = this.invalids.get(i8);
            int i14 = segment2.start - i13;
            boolean z2 = z;
            byte[] bArr = this.fastBuffer.f2561hb;
            System.arraycopy(bArr, i13, bArr, i12, i14);
            int i15 = i8 - 1;
            iArr[i15] = i13;
            iArr2[i15] = i13 - i12;
            i12 += i14;
            i13 = segment2.end;
            i8++;
            z = z2;
        }
        boolean z3 = z;
        if (i10 > 0) {
            byte[] bArr2 = this.fastBuffer.f2561hb;
            System.arraycopy(bArr2, i13, bArr2, i12, i10);
            iArr[i9] = i13;
            iArr2[i9] = i13 - i12;
        }
        clearInvalid();
        if (z3) {
            this.checksum = this.fastBuffer.getChecksum(DATA_START, i5);
        } else {
            this.checksum ^= this.fastBuffer.getChecksum(i2, i6);
        }
        this.dataEnd = i4;
        syncCompatBuffer(i2, i, i6);
        updateOffset(i2, iArr, iArr2);
        info(GC_FINISH);
    }

    @Override // android.content.SharedPreferences
    public synchronized Map<String, Object> getAll() {
        Object objValueOf;
        int size = this.data.size();
        if (size == 0) {
            return new HashMap();
        }
        HashMap map = new HashMap(((size * 4) / 3) + 1);
        for (Map.Entry<String, Container.BaseContainer> entry : this.data.entrySet()) {
            String key = entry.getKey();
            Container.BaseContainer value = entry.getValue();
            switch (value.getType()) {
                case Base64.NO_PADDING /* 1 */:
                    objValueOf = Boolean.valueOf(((Container.BooleanContainer) value).value);
                    break;
                case Base64.NO_WRAP /* 2 */:
                    objValueOf = Integer.valueOf(((Container.IntContainer) value).value);
                    break;
                case 3:
                    objValueOf = Float.valueOf(((Container.FloatContainer) value).value);
                    break;
                case 4:
                    objValueOf = Long.valueOf(((Container.LongContainer) value).value);
                    break;
                case 5:
                    objValueOf = Double.valueOf(((Container.DoubleContainer) value).value);
                    break;
                case 6:
                    Container.StringContainer stringContainer = (Container.StringContainer) value;
                    objValueOf = stringContainer.external ? getStringFromFile(stringContainer, this.cipher) : stringContainer.value;
                    break;
                case 7:
                    Container.ArrayContainer arrayContainer = (Container.ArrayContainer) value;
                    objValueOf = arrayContainer.external ? getArrayFromFile(arrayContainer, this.cipher) : arrayContainer.value;
                    break;
                case 8:
                    Container.ObjectContainer objectContainer = (Container.ObjectContainer) value;
                    objValueOf = objectContainer.external ? getObjectFromFile(objectContainer, this.cipher) : ((Container.ObjectContainer) value).value;
                    break;
                default:
                    objValueOf = null;
                    break;
            }
            if (objValueOf != null) {
                map.put(key, objValueOf);
            }
        }
        return map;
    }

    public byte[] getArray(String str) {
        return getArray(str, EMPTY_ARRAY);
    }

    public byte[] getArrayFromFile(Container.ArrayContainer arrayContainer, FastCipher fastCipher) {
        String str = (String) arrayContainer.value;
        byte[] bytes = (byte[]) this.externalCache.get(str);
        if (bytes == null) {
            try {
                bytes = Utils.getBytes(new File(this.path + this.name, str));
            } catch (Exception e) {
                error(e);
                return null;
            }
        }
        if (bytes != null) {
            return fastCipher != null ? fastCipher.decrypt(bytes) : bytes;
        }
        return null;
    }

    public synchronized boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    public double getDouble(String str) {
        return getDouble(str, 0.0d);
    }

    public float getFloat(String str) {
        return getFloat(str, 0.0f);
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public synchronized long getLong(String str) {
        Container.LongContainer longContainer;
        longContainer = (Container.LongContainer) this.data.get(str);
        return longContainer == null ? 0L : longContainer.value;
    }

    public final int getNewCapacity(int i, int i2) {
        if (i2 >= DATA_SIZE_LIMIT) {
            throw new IllegalStateException("data size out of limit");
        }
        int i3 = PAGE_SIZE;
        if (i2 <= i3) {
            return i3;
        }
        while (i < i2) {
            i <<= 1;
        }
        return i;
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
    public synchronized <T> T getObject(String str) {
        try {
            Container.ObjectContainer objectContainer = (Container.ObjectContainer) this.data.get(str);
            if (objectContainer != null) {
                if (!objectContainer.external) {
                    return (T) objectContainer.value;
                }
                T t = (T) this.bigValueCache.get(str);
                if (t != null) {
                    return t;
                }
                T t2 = (T) getObjectFromFile(objectContainer, this.cipher);
                if (t2 != null) {
                    this.bigValueCache.put(str, t2);
                    return t2;
                }
                remove(str);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public Object getObjectFromFile(Container.ObjectContainer objectContainer, FastCipher fastCipher) {
        String str = (String) objectContainer.value;
        byte[] bytes = (byte[]) this.externalCache.get(str);
        if (bytes == null) {
            try {
                bytes = Utils.getBytes(new File(this.path + this.name, str));
            } catch (Exception e) {
                error(e);
                return null;
            }
        }
        if (bytes == null) {
            warning(new Exception("Read object data failed"));
            return null;
        }
        if (fastCipher != null) {
            bytes = fastCipher.decrypt(bytes);
        }
        int i = bytes[0] & 255;
        String strDecodeStr = this.fastBuffer.decodeStr(bytes, 1, i);
        FastEncoder fastEncoder = this.encoderMap.get(strDecodeStr);
        if (fastEncoder != null) {
            objectContainer.encoder = fastEncoder;
            int i2 = i + 1;
            return fastEncoder.decode(bytes, i2, bytes.length - i2);
        }
        warning(new Exception("No encoder for tag:" + strDecodeStr));
        return null;
    }

    public String getString(String str) {
        return getString(str, "");
    }

    public String getStringFromFile(Container.StringContainer stringContainer, FastCipher fastCipher) {
        String str = (String) stringContainer.value;
        byte[] bytes = (byte[]) this.externalCache.get(str);
        if (bytes == null) {
            try {
                bytes = Utils.getBytes(new File(this.path + this.name, str));
            } catch (Exception e) {
                error(e);
            }
        }
        if (bytes != null) {
            if (fastCipher != null) {
                bytes = fastCipher.decrypt(bytes);
            }
            if (bytes != null) {
                return new String(bytes, StandardCharsets.UTF_8);
            }
            return null;
        }
        return null;
    }

    public synchronized Set<String> getStringSet(String str) {
        return (Set) getObject(str);
    }

    public abstract void handleChange(String str);

    public final void info(String str) {
        FastLogger fastLogger = this.logger;
        if (fastLogger != null) {
            fastLogger.mo1510i(this.name, str);
        }
    }

    public final boolean loadWithBlockingIO(File file) {
        long length = file.length();
        if (length != 0 && length < 268435456) {
            int i = (int) length;
            int newCapacity = getNewCapacity(PAGE_SIZE, i);
            FastBuffer fastBuffer = this.fastBuffer;
            if (fastBuffer == null || fastBuffer.f2561hb.length != newCapacity) {
                fastBuffer = new FastBuffer(new byte[newCapacity]);
                this.fastBuffer = fastBuffer;
            } else {
                fastBuffer.position = 0;
            }
            Utils.readBytes(file, fastBuffer.f2561hb, i);
            int i2 = fastBuffer.getInt();
            if (i2 < 0) {
                return false;
            }
            int iUnpackSize = unpackSize(i2);
            boolean zIsCipher = isCipher(i2);
            long j = fastBuffer.getLong();
            this.dataEnd = iUnpackSize + DATA_START;
            if (iUnpackSize >= 0 && iUnpackSize <= i - DATA_START && j == fastBuffer.getChecksum(DATA_START, iUnpackSize) && parseData(zIsCipher)) {
                this.checksum = j;
                return true;
            }
        }
        return false;
    }

    public synchronized void notifyListeners(final String str) {
        ArrayList<SharedPreferences.OnSharedPreferenceChangeListener> arrayList = this.listeners;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = arrayList.get(i);
            i++;
            final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener2 = onSharedPreferenceChangeListener;
            this.mainHandler.post(new Runnable() { // from class: io.fastkv.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2566a.lambda$notifyListeners$0(onSharedPreferenceChangeListener2, str);
                }
            });
        }
    }

    public final int packSize(int i) {
        return this.cipher == null ? i : i | CIPHER_MASK;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x014c, code lost:
    
        throw new java.lang.Exception(io.fastkv.AbsFastKV.PARSE_DATA_FAILED);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean parseData(boolean r16) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fastkv.AbsFastKV.parseData(boolean):boolean");
    }

    public void preparePutBytes() {
        ensureSize(this.updateSize);
        int i = this.dataEnd;
        this.updateStart = i;
        this.dataEnd = this.updateSize + i;
        this.fastBuffer.position = i;
    }

    public synchronized void putAll(Map<String, Object> map, Map<Class, FastEncoder> map2) {
        try {
            if (this.closed) {
                return;
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (key != null && !key.isEmpty()) {
                    if (value instanceof String) {
                        putString(key, (String) value);
                    } else if (value instanceof Boolean) {
                        putBoolean(key, ((Boolean) value).booleanValue());
                    } else if (value instanceof Integer) {
                        putInt(key, ((Integer) value).intValue());
                    } else if (value instanceof Long) {
                        putLong(key, ((Long) value).longValue());
                    } else if (value instanceof Float) {
                        putFloat(key, ((Float) value).floatValue());
                    } else if (value instanceof Double) {
                        putDouble(key, ((Double) value).doubleValue());
                    } else if (value instanceof byte[]) {
                        putArray(key, (byte[]) value);
                    } else {
                        encodeObject(key, value, map2);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized SharedPreferences.Editor putArray(String str, byte[] bArr) throws Throwable {
        Throwable th;
        AbsFastKV absFastKV;
        try {
            try {
                if (this.closed) {
                    return this;
                }
                checkKey(str);
                try {
                    if (bArr == null) {
                        remove(str);
                        absFastKV = this;
                    } else {
                        lockAndCheckUpdate();
                        Container.ArrayContainer arrayContainer = (Container.ArrayContainer) this.data.get(str);
                        FastCipher fastCipher = this.cipher;
                        byte[] bArrEncrypt = fastCipher != null ? fastCipher.encrypt(bArr) : bArr;
                        if (bArrEncrypt == null) {
                            error(new Exception(ENCRYPT_FAILED));
                            return this;
                        }
                        absFastKV = this;
                        absFastKV.addOrUpdate(str, bArr, bArrEncrypt, arrayContainer, (byte) 7);
                        handleChange(str);
                    }
                    return absFastKV;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        th = th;
        throw th;
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putBoolean(String str, boolean z) {
        try {
            if (this.closed) {
                return this;
            }
            checkKey(str);
            lockAndCheckUpdate();
            Container.BooleanContainer booleanContainer = (Container.BooleanContainer) this.data.get(str);
            if (booleanContainer == null) {
                if (!wrapHeader(str, (byte) 1)) {
                    return this;
                }
                FastBuffer fastBuffer = this.fastBuffer;
                int i = fastBuffer.position;
                fastBuffer.put(z ? (byte) 1 : (byte) 0);
                updateChange();
                this.data.put(str, new Container.BooleanContainer(i, z));
                handleChange(str);
            } else if (booleanContainer.value != z) {
                booleanContainer.value = z;
                updateBoolean(z ? (byte) 1 : (byte) 0, booleanContainer.offset);
                handleChange(str);
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized SharedPreferences.Editor putDouble(String str, double d) throws Throwable {
        Throwable th;
        AbsFastKV absFastKV;
        try {
            try {
                if (this.closed) {
                    return this;
                }
                checkKey(str);
                lockAndCheckUpdate();
                Container.DoubleContainer doubleContainer = (Container.DoubleContainer) this.data.get(str);
                if (doubleContainer != null) {
                    if (doubleContainer.value != d) {
                        long newDoubleValue = getNewDoubleValue(d);
                        long j = newDoubleValue ^ this.fastBuffer.getLong(doubleContainer.offset);
                        doubleContainer.value = d;
                        absFastKV = this;
                        absFastKV.updateInt64(newDoubleValue, j, doubleContainer.offset);
                        handleChange(str);
                    }
                    return absFastKV;
                }
                try {
                    if (!wrapHeader(str, (byte) 5)) {
                        return this;
                    }
                    FastBuffer fastBuffer = this.fastBuffer;
                    int i = fastBuffer.position;
                    fastBuffer.putLong(getNewDoubleValue(d));
                    updateChange();
                    this.data.put(str, new Container.DoubleContainer(i, d));
                    handleChange(str);
                } catch (Throwable th2) {
                    th = th2;
                }
                absFastKV = this;
                return absFastKV;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        th = th;
        throw th;
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putFloat(String str, float f) {
        try {
            if (this.closed) {
                return this;
            }
            checkKey(str);
            lockAndCheckUpdate();
            Container.FloatContainer floatContainer = (Container.FloatContainer) this.data.get(str);
            if (floatContainer == null) {
                if (!wrapHeader(str, (byte) 3)) {
                    return this;
                }
                FastBuffer fastBuffer = this.fastBuffer;
                int i = fastBuffer.position;
                fastBuffer.putInt(getNewFloatValue(f));
                updateChange();
                this.data.put(str, new Container.FloatContainer(i, f));
                handleChange(str);
            } else if (floatContainer.value != f) {
                int newFloatValue = getNewFloatValue(f);
                long j = ((long) (this.fastBuffer.getInt(floatContainer.offset) ^ newFloatValue)) & 4294967295L;
                floatContainer.value = f;
                updateInt32(newFloatValue, j, floatContainer.offset);
                handleChange(str);
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putInt(String str, int i) {
        try {
            if (this.closed) {
                return this;
            }
            checkKey(str);
            lockAndCheckUpdate();
            Container.IntContainer intContainer = (Container.IntContainer) this.data.get(str);
            if (intContainer == null) {
                if (!wrapHeader(str, (byte) 2)) {
                    return this;
                }
                FastBuffer fastBuffer = this.fastBuffer;
                int i2 = fastBuffer.position;
                FastCipher fastCipher = this.cipher;
                fastBuffer.putInt(fastCipher != null ? fastCipher.encrypt(i) : i);
                updateChange();
                this.data.put(str, new Container.IntContainer(i2, i));
                handleChange(str);
            } else if (intContainer.value != i) {
                FastCipher fastCipher2 = this.cipher;
                int iEncrypt = fastCipher2 != null ? fastCipher2.encrypt(i) : i;
                int i3 = this.cipher != null ? this.fastBuffer.getInt(intContainer.offset) : intContainer.value;
                intContainer.value = i;
                updateInt32(iEncrypt, ((long) (i3 ^ iEncrypt)) & 4294967295L, intContainer.offset);
                handleChange(str);
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putLong(String str, long j) throws Throwable {
        Throwable th;
        AbsFastKV absFastKV;
        try {
            try {
                if (this.closed) {
                    return this;
                }
                checkKey(str);
                lockAndCheckUpdate();
                Container.LongContainer longContainer = (Container.LongContainer) this.data.get(str);
                try {
                    if (longContainer != null) {
                        if (longContainer.value != j) {
                            FastCipher fastCipher = this.cipher;
                            long jEncrypt = fastCipher != null ? fastCipher.encrypt(j) : j;
                            long j2 = (this.cipher != null ? this.fastBuffer.getLong(longContainer.offset) : longContainer.value) ^ jEncrypt;
                            longContainer.value = j;
                            absFastKV = this;
                            absFastKV.updateInt64(jEncrypt, j2, longContainer.offset);
                            handleChange(str);
                        }
                        return absFastKV;
                    }
                    if (!wrapHeader(str, (byte) 4)) {
                        return this;
                    }
                    FastBuffer fastBuffer = this.fastBuffer;
                    int i = fastBuffer.position;
                    FastCipher fastCipher2 = this.cipher;
                    fastBuffer.putLong(fastCipher2 != null ? fastCipher2.encrypt(j) : j);
                    updateChange();
                    this.data.put(str, new Container.LongContainer(i, j));
                    handleChange(str);
                    absFastKV = this;
                    return absFastKV;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        th = th;
        throw th;
    }

    public synchronized <T> SharedPreferences.Editor putObject(String str, T t, FastEncoder<T> fastEncoder) throws Throwable {
        Throwable th;
        byte[] bArrEncode;
        try {
            try {
                if (this.closed) {
                    return this;
                }
                checkKey(str);
                if (fastEncoder == null) {
                    throw new IllegalArgumentException("Encoder is null");
                }
                String strTag = fastEncoder.tag();
                if (strTag == null || strTag.isEmpty() || strTag.length() > 50) {
                    throw new IllegalArgumentException("Invalid encoder tag:" + strTag);
                }
                if (!this.encoderMap.containsKey(strTag)) {
                    throw new IllegalArgumentException("Encoder hasn't been registered");
                }
                try {
                    if (t == null) {
                        remove(str);
                        return this;
                    }
                    try {
                        bArrEncode = fastEncoder.encode(t);
                    } catch (Exception e) {
                        error(e);
                        bArrEncode = null;
                    }
                    if (bArrEncode == null) {
                        remove(str);
                        return this;
                    }
                    int stringSize = FastBuffer.getStringSize(strTag);
                    FastBuffer fastBuffer = new FastBuffer(stringSize + 1 + bArrEncode.length);
                    fastBuffer.put((byte) stringSize);
                    fastBuffer.putString(strTag);
                    fastBuffer.putBytes(bArrEncode);
                    byte[] bArrEncrypt = fastBuffer.f2561hb;
                    lockAndCheckUpdate();
                    Container.ObjectContainer objectContainer = (Container.ObjectContainer) this.data.get(str);
                    FastCipher fastCipher = this.cipher;
                    if (fastCipher != null) {
                        bArrEncrypt = fastCipher.encrypt(bArrEncrypt);
                    }
                    byte[] bArr = bArrEncrypt;
                    if (bArr == null) {
                        return this;
                    }
                    try {
                        addOrUpdate(str, t, bArr, objectContainer, (byte) 8);
                        handleChange(str);
                        return this;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        th = th;
        throw th;
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putString(String str, String str2) throws Throwable {
        Throwable th;
        AbsFastKV absFastKV;
        String str3;
        try {
            try {
                if (this.closed) {
                    return this;
                }
                checkKey(str);
                try {
                    if (str2 == null) {
                        remove(str);
                        absFastKV = this;
                    } else {
                        lockAndCheckUpdate();
                        Container.StringContainer stringContainer = (Container.StringContainer) this.data.get(str);
                        if (this.cipher != null || str2.length() * 3 >= this.INTERNAL_LIMIT) {
                            byte[] bytes = str2.isEmpty() ? EMPTY_ARRAY : str2.getBytes(StandardCharsets.UTF_8);
                            FastCipher fastCipher = this.cipher;
                            if (fastCipher != null) {
                                bytes = fastCipher.encrypt(bytes);
                            }
                            byte[] bArr = bytes;
                            if (bArr == null) {
                                error(new Exception(ENCRYPT_FAILED));
                                return this;
                            }
                            absFastKV = this;
                            str3 = str;
                            absFastKV.addOrUpdate(str3, str2, bArr, stringContainer, (byte) 6);
                        } else {
                            fastPutString(str, str2, stringContainer);
                            absFastKV = this;
                            str3 = str;
                        }
                        handleChange(str3);
                    }
                    return absFastKV;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        th = th;
        throw th;
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putStringSet(String str, Set<String> set) {
        try {
            if (this.closed) {
                return this;
            }
            if (set == null) {
                remove(str);
            } else {
                putObject(str, set, StringSetEncoder.INSTANCE);
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences
    public synchronized void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (onSharedPreferenceChangeListener == null) {
            return;
        }
        if (!this.listeners.contains(onSharedPreferenceChangeListener)) {
            this.listeners.add(onSharedPreferenceChangeListener);
        }
    }

    public void remove(byte b, int i, int i2) {
        countInvalid(i, i2);
        byte b2 = (byte) (b | DataType.DELETE_MASK);
        byte[] bArr = this.fastBuffer.f2561hb;
        this.checksum = ((((long) (bArr[i] ^ b2)) & 255) << ((i & 7) << 3)) ^ this.checksum;
        bArr[i] = b2;
    }

    public abstract void removeOldFile(String str);

    public void resetData() {
        this.dataEnd = DATA_START;
        this.checksum = 0L;
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
        FastEncoder fastEncoder;
        FastEncoder[] fastEncoderArr = (FastEncoder[]) this.encoderMap.values().toArray(new FastEncoder[this.encoderMap.size()]);
        String str = "temp_" + this.name;
        FastKV fastKV = new FastKV(this.path, str, fastEncoderArr, this.cipher, 2);
        fastKV.autoCommit = false;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Container.BaseContainer> entry : this.data.entrySet()) {
            String key = entry.getKey();
            Container.BaseContainer value = entry.getValue();
            if (value instanceof Container.StringContainer) {
                Container.StringContainer stringContainer = (Container.StringContainer) value;
                if (stringContainer.external) {
                    arrayList.add((String) stringContainer.value);
                    String stringFromFile = getStringFromFile(stringContainer, null);
                    if (stringFromFile != null) {
                        fastKV.putString(key, stringFromFile);
                    }
                } else {
                    fastKV.putString(key, (String) stringContainer.value);
                }
            } else if (value instanceof Container.BooleanContainer) {
                fastKV.putBoolean(key, ((Container.BooleanContainer) value).value);
            } else if (value instanceof Container.IntContainer) {
                fastKV.putInt(key, ((Container.IntContainer) value).value);
            } else if (value instanceof Container.LongContainer) {
                fastKV.putLong(key, ((Container.LongContainer) value).value);
            } else if (value instanceof Container.FloatContainer) {
                fastKV.putFloat(key, ((Container.FloatContainer) value).value);
            } else if (value instanceof Container.DoubleContainer) {
                fastKV.putDouble(key, ((Container.DoubleContainer) value).value);
            } else if (value instanceof Container.ArrayContainer) {
                Container.ArrayContainer arrayContainer = (Container.ArrayContainer) value;
                if (arrayContainer.external) {
                    arrayList.add((String) arrayContainer.value);
                    byte[] arrayFromFile = getArrayFromFile(arrayContainer, null);
                    if (arrayFromFile != null) {
                        fastKV.putArray(key, arrayFromFile);
                    }
                } else {
                    fastKV.putArray(key, (byte[]) arrayContainer.value);
                }
            } else if (value instanceof Container.ObjectContainer) {
                Container.ObjectContainer objectContainer = (Container.ObjectContainer) value;
                if (objectContainer.external) {
                    arrayList.add((String) objectContainer.value);
                    Object objectFromFile = getObjectFromFile(objectContainer, null);
                    if (objectFromFile != null && (fastEncoder = objectContainer.encoder) != null) {
                        fastKV.putObject(key, objectFromFile, fastEncoder);
                    }
                } else {
                    FastEncoder fastEncoder2 = objectContainer.encoder;
                    if (fastEncoder2 != null) {
                        fastKV.putObject(key, objectContainer.value, fastEncoder2);
                    }
                }
            }
        }
        fastKV.contains("");
        this.fastBuffer = fastKV.fastBuffer;
        this.checksum = fastKV.checksum;
        this.dataEnd = fastKV.dataEnd;
        clearInvalid();
        this.data.clear();
        this.data.putAll(fastKV.data);
        copyToMainFile(fastKV);
        while (!fastKV.externalExecutor.isEmpty()) {
            try {
                Thread.sleep(10L);
            } catch (Exception unused) {
            }
        }
        File file = new File(this.path, str);
        String str2 = this.path + this.name;
        Utils.moveDirFiles(file, str2);
        Utils.deleteFile(file);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Utils.deleteFile(new File(str2, (String) obj));
        }
        this.needRewrite = false;
    }

    public final long shiftCheckSum(long j, int i) {
        int i2 = (i & 7) << 3;
        return (j >>> (64 - i2)) | (j << i2);
    }

    public abstract void syncCompatBuffer(int i, int i2, int i3);

    public final void tryBlockingIO(File file, File file2) {
        try {
            if (loadWithBlockingIO(file)) {
                return;
            }
        } catch (IOException e) {
            warning(e);
        }
        resetMemory();
        try {
            if (loadWithBlockingIO(file2)) {
                return;
            }
        } catch (IOException e2) {
            warning(e2);
        }
        resetMemory();
    }

    @Override // android.content.SharedPreferences
    public synchronized void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.listeners.remove(onSharedPreferenceChangeListener);
    }

    public abstract void updateBoolean(byte b, int i);

    public void updateBytes(int i, byte[] bArr) {
        int length = bArr.length;
        this.checksum ^= this.fastBuffer.getChecksum(i, length);
        FastBuffer fastBuffer = this.fastBuffer;
        fastBuffer.position = i;
        fastBuffer.putBytes(bArr);
        this.checksum = this.fastBuffer.getChecksum(i, length) ^ this.checksum;
    }

    public abstract void updateChange();

    public abstract void updateInt32(int i, long j, int i2);

    public abstract void updateInt64(long j, long j2, int i);

    public final void updateOffset(int i, int[] iArr, int[] iArr2) {
        for (Container.BaseContainer baseContainer : this.data.values()) {
            int i2 = baseContainer.offset;
            if (i2 > i) {
                int i3 = iArr2[Utils.binarySearch(iArr, i2)];
                baseContainer.offset -= i3;
                if (baseContainer.getType() >= 6) {
                    ((Container.VarContainer) baseContainer).start -= i3;
                }
            }
        }
    }

    public final void warning(Exception exc) {
        FastLogger fastLogger = this.logger;
        if (fastLogger != null) {
            fastLogger.mo1511w(this.name, exc);
        }
    }

    private boolean wrapHeader(String str, byte b, int i) {
        FastCipher fastCipher = this.cipher;
        if (fastCipher == null) {
            int stringSize = FastBuffer.getStringSize(str);
            prepareHeaderInfo(stringSize, i, b);
            wrapKey(str, stringSize);
            return true;
        }
        byte[] bArrEncrypt = fastCipher.encrypt(str.getBytes(StandardCharsets.UTF_8));
        if (bArrEncrypt == null) {
            error(new Exception(ENCRYPT_FAILED));
            return false;
        }
        int length = bArrEncrypt.length;
        prepareHeaderInfo(length, i, b);
        this.fastBuffer.put((byte) length);
        FastBuffer fastBuffer = this.fastBuffer;
        System.arraycopy(bArrEncrypt, 0, fastBuffer.f2561hb, fastBuffer.position, length);
        this.fastBuffer.position += length;
        return true;
    }

    public synchronized byte[] getArray(String str, byte[] bArr) {
        Container.ArrayContainer arrayContainer = (Container.ArrayContainer) this.data.get(str);
        if (arrayContainer != null) {
            if (!arrayContainer.external) {
                return (byte[]) arrayContainer.value;
            }
            Object obj = this.bigValueCache.get(str);
            if (obj instanceof byte[]) {
                return (byte[]) obj;
            }
            byte[] arrayFromFile = getArrayFromFile(arrayContainer, this.cipher);
            if (arrayFromFile != null && arrayFromFile.length != 0) {
                this.bigValueCache.put(str, arrayFromFile);
                return arrayFromFile;
            }
            remove(str);
        }
        return bArr;
    }

    @Override // android.content.SharedPreferences
    public synchronized boolean getBoolean(String str, boolean z) {
        Container.BooleanContainer booleanContainer = (Container.BooleanContainer) this.data.get(str);
        if (booleanContainer != null) {
            z = booleanContainer.value;
        }
        return z;
    }

    public synchronized double getDouble(String str, double d) {
        Container.DoubleContainer doubleContainer = (Container.DoubleContainer) this.data.get(str);
        if (doubleContainer != null) {
            d = doubleContainer.value;
        }
        return d;
    }

    @Override // android.content.SharedPreferences
    public synchronized float getFloat(String str, float f) {
        Container.FloatContainer floatContainer = (Container.FloatContainer) this.data.get(str);
        if (floatContainer != null) {
            f = floatContainer.value;
        }
        return f;
    }

    @Override // android.content.SharedPreferences
    public synchronized int getInt(String str, int i) {
        Container.IntContainer intContainer = (Container.IntContainer) this.data.get(str);
        if (intContainer != null) {
            i = intContainer.value;
        }
        return i;
    }

    @Override // android.content.SharedPreferences
    public synchronized String getString(String str, String str2) {
        Container.StringContainer stringContainer = (Container.StringContainer) this.data.get(str);
        if (stringContainer != null) {
            if (!stringContainer.external) {
                return (String) stringContainer.value;
            }
            Object obj = this.bigValueCache.get(str);
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringFromFile = getStringFromFile(stringContainer, this.cipher);
            if (stringFromFile != null && !stringFromFile.isEmpty()) {
                this.bigValueCache.put(str, stringFromFile);
                return stringFromFile;
            }
            remove(str);
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> stringSet = getStringSet(str);
        return stringSet != null ? stringSet : set;
    }

    public final void error(Exception exc) {
        FastLogger fastLogger = this.logger;
        if (fastLogger != null) {
            fastLogger.mo1509e(this.name, exc);
        }
    }

    @Override // android.content.SharedPreferences
    public synchronized long getLong(String str, long j) {
        Container.LongContainer longContainer = (Container.LongContainer) this.data.get(str);
        if (longContainer != null) {
            j = longContainer.value;
        }
        return j;
    }

    public void putAll(Map<String, Object> map) {
        putAll(map, null);
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return this;
    }

    public void lockAndCheckUpdate() {
    }
}
