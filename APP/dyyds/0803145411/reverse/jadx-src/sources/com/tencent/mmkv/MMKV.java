package com.tencent.mmkv;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Process;
import android.util.Log;
import dalvik.annotation.optimization.FastNative;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import yyds.AbstractC2104;
import yyds.C0188;
import yyds.C1738;
import yyds.C1760;
import yyds.EnumC0161;
import yyds.EnumC0569;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class MMKV implements SharedPreferences, SharedPreferences.Editor {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final boolean f528;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static boolean f529;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final EnumMap f530;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final EnumMap f531;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static boolean f532;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final EnumC0161[] f533;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static String f534;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final HashSet f535;
    private final long nativeHandle;

    static {
        EnumMap enumMap = new EnumMap(EnumC0569.class);
        f530 = enumMap;
        enumMap.put(EnumC0569.f2746, 0);
        enumMap.put(EnumC0569.f2747, 1);
        EnumMap enumMap2 = new EnumMap(EnumC0161.class);
        f531 = enumMap2;
        EnumC0161 enumC0161 = EnumC0161.f978;
        enumMap2.put(enumC0161, 0);
        EnumC0161 enumC01612 = EnumC0161.f980;
        enumMap2.put(enumC01612, 1);
        EnumC0161 enumC01613 = EnumC0161.f976;
        enumMap2.put(enumC01613, 2);
        EnumC0161 enumC01614 = EnumC0161.f979;
        enumMap2.put(enumC01614, 3);
        EnumC0161 enumC01615 = EnumC0161.f977;
        enumMap2.put(enumC01615, 4);
        f533 = new EnumC0161[]{enumC0161, enumC01612, enumC01613, enumC01614, enumC01615};
        f535 = new HashSet();
        f529 = false;
        f534 = null;
        f532 = true;
        new HashMap();
        f528 = false;
    }

    public MMKV(long j) {
        this.nativeHandle = j;
    }

    private native long actualSize(long j);

    private native String[] allKeys(long j, boolean z);

    public static native long backupAllToDirectory(String str);

    public static native boolean backupOneToDirectory(String str, String str2, String str3);

    public static native boolean checkExist(String str, String str2);

    private static native boolean checkProcessMode(long j);

    private native boolean containsKey(long j, String str);

    private native long count(long j, boolean z);

    private static native long createNB(int i);

    private native boolean decodeBool(long j, String str, boolean z);

    private native byte[] decodeBytes(long j, String str);

    private native double decodeDouble(long j, String str, double d);

    private native float decodeFloat(long j, String str, float f);

    private native int decodeInt(long j, String str, int i);

    private native long decodeLong(long j, String str, long j2);

    private native String decodeString(long j, String str, String str2);

    private native String[] decodeStringSet(long j, String str);

    private static native void destroyNB(long j, int i);

    private native void doCheckReSetCryptKey(String str, boolean z);

    private native boolean doReKey(String str, boolean z);

    private static native void enableDisableProcessMode(boolean z);

    private native boolean encodeBool(long j, String str, boolean z);

    private native boolean encodeBool_2(long j, String str, boolean z, int i);

    private native boolean encodeBytes(long j, String str, byte[] bArr);

    private native boolean encodeBytes_2(long j, String str, byte[] bArr, int i);

    private native boolean encodeDouble(long j, String str, double d);

    private native boolean encodeDouble_2(long j, String str, double d, int i);

    private native boolean encodeFloat(long j, String str, float f);

    private native boolean encodeFloat_2(long j, String str, float f, int i);

    private native boolean encodeInt(long j, String str, int i);

    private native boolean encodeInt_2(long j, String str, int i, int i2);

    private native boolean encodeLong(long j, String str, long j2);

    private native boolean encodeLong_2(long j, String str, long j2, int i);

    private native boolean encodeSet(long j, String str, String[] strArr);

    private native boolean encodeSet_2(long j, String str, String[] strArr, int i);

    private native boolean encodeString(long j, String str, String str2);

    private native boolean encodeString_2(long j, String str, String str2, int i);

    private static native long getDefaultMMKV(int i, String str, long j, boolean z, int i2, int i3, boolean z2, int i4, int i5);

    private static native long getMMKVWithAshmemFD(String str, int i, int i2, String str2, boolean z);

    public static native long getMMKVWithID(String str, int i, String str2, String str3, long j, boolean z, int i2, int i3, boolean z2, int i4, int i5);

    private static native boolean getNameSpace(String str);

    private native long importFrom(long j, long j2);

    private native boolean isCompareBeforeSetEnabled();

    @FastNative
    private native boolean isEncryptionEnabled();

    @FastNative
    private native boolean isExpirationEnabled();

    public static native boolean isFileValid(String str, String str2);

    private static native void jniInitialize(String str, String str2, int i, boolean z, boolean z2, long j);

    private static void mmkvLogImp(int i, String str, int i2, String str2, String str3) {
        int iOrdinal = f533[i].ordinal();
        if (iOrdinal == 0) {
            Log.d("MMKV", str3);
            return;
        }
        if (iOrdinal == 1) {
            Log.i("MMKV", str3);
        } else if (iOrdinal == 2) {
            Log.w("MMKV", str3);
        } else {
            if (iOrdinal != 3) {
                return;
            }
            Log.e("MMKV", str3);
        }
    }

    public static MMKV mmkvWithID(String str) {
        return m365(str, new C1760(5, (byte) 0));
    }

    @FastNative
    private native void nativeEnableCompareBeforeSet();

    private static void onContentChangedByOuterProcess(String str) {
    }

    public static native void onExit();

    private static int onMMKVCRCCheckFail(String str) {
        StringBuilder sb = new StringBuilder("Recover strategic for ");
        sb.append(str);
        sb.append(" is ");
        EnumC0569 enumC0569 = EnumC0569.f2746;
        sb.append(enumC0569);
        m366(sb.toString());
        Integer num = (Integer) f530.get(enumC0569);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private static void onMMKVContentLoadSuccessfully(String str) {
    }

    private static int onMMKVFileLengthError(String str) {
        StringBuilder sb = new StringBuilder("Recover strategic for ");
        sb.append(str);
        sb.append(" is ");
        EnumC0569 enumC0569 = EnumC0569.f2746;
        sb.append(enumC0569);
        m366(sb.toString());
        Integer num = (Integer) f530.get(enumC0569);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static native int pageSize();

    public static native boolean removeStorage(String str, String str2);

    private native void removeValueForKey(long j, String str);

    public static native long restoreAllFromDirectory(String str);

    public static native boolean restoreOneMMKVFromDirectory(String str, String str2, String str3);

    private static native void setCallbackHandler(boolean z, boolean z2, long j);

    private static native void setLogLevel(int i);

    private static native void setWantsContentChangeNotify(boolean z);

    private native void sync(boolean z);

    private native long totalSize(long j);

    private native int valueSize(long j, String str, boolean z);

    public static native String version();

    private native int writeValueToNB(long j, String str, long j2, int i);

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m364(Application application, String str) {
        if (!Process.is64Bit()) {
            throw new C1738("MMKV 2.0+ requires 64-bit App, use 1.3.x instead.");
        }
        String absolutePath = application.getCacheDir().getAbsolutePath();
        boolean z = f528;
        if (!f529) {
            System.loadLibrary("mmkv");
            f529 = true;
        }
        jniInitialize(str, absolutePath, 1, z, false, 0L);
        f534 = str;
        if ((application.getApplicationInfo().flags & 2) == 0) {
            synchronized (f535) {
                f532 = false;
            }
            enableDisableProcessMode(false);
            Log.i("MMKV", "Disable checkProcessMode()");
            return;
        }
        synchronized (f535) {
            f532 = true;
        }
        enableDisableProcessMode(true);
        Log.i("MMKV", "Enable checkProcessMode()");
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static MMKV m365(String str, C1760 c1760) {
        String strConcat;
        if (f534 == null) {
            C0188.m800("You should Call MMKV.initialize() first.");
            return null;
        }
        Integer num = (Integer) f530.get(null);
        long mMKVWithID = getMMKVWithID(str, c1760.f8838, (String) c1760.f8839, null, 0L, false, -1, 0, false, num == null ? -1 : num.intValue(), 0);
        int i = c1760.f8838;
        if (mMKVWithID == 0) {
            throw new RuntimeException(AbstractC2104.m4014("Fail to create an MMKV instance [", str, "] in JNI"));
        }
        if (!f532) {
            return new MMKV(mMKVWithID);
        }
        HashSet hashSet = f535;
        synchronized (hashSet) {
            try {
                if (!hashSet.contains(Long.valueOf(mMKVWithID))) {
                    if (!checkProcessMode(mMKVWithID)) {
                        if (i == 1) {
                            strConcat = "Opening a multi-process MMKV instance [" + str + "] with SINGLE_PROCESS_MODE!";
                        } else {
                            strConcat = ("Opening an MMKV instance [" + str + "] with MULTI_PROCESS_MODE, ").concat("while it's already been opened with SINGLE_PROCESS_MODE by someone somewhere else!");
                        }
                        throw new IllegalArgumentException(strConcat);
                    }
                    hashSet.add(Long.valueOf(mMKVWithID));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return new MMKV(mMKVWithID);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static void m366(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[r0.length - 1];
        Integer num = (Integer) f531.get(EnumC0161.f980);
        mmkvLogImp(num == null ? 0 : num.intValue(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), stackTraceElement.getMethodName(), str);
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        sync(false);
    }

    public native int ashmemFD();

    public native int ashmemMetaFD();

    public native void checkContentChangedByOuterProcess();

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        clearAll();
        return this;
    }

    public native void clearAll();

    public native void clearAllWithKeepingSpace();

    public native void clearMemoryCache();

    public native void close();

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        sync(true);
        return true;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return containsKey(this.nativeHandle, str);
    }

    public native String cryptKey();

    public native boolean disableAutoKeyExpire();

    public native void disableCompareBeforeSet();

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return this;
    }

    public native boolean enableAutoKeyExpire(int i);

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        throw new UnsupportedOperationException("Intentionally Not Supported. Use allKeys() instead, getAll() not implement because type-erasure inside mmkv");
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        return decodeBool(this.nativeHandle, str, z);
    }

    public byte[] getBytes(String str, byte[] bArr) {
        byte[] bArrDecodeBytes = decodeBytes(this.nativeHandle, str);
        return bArrDecodeBytes != null ? bArrDecodeBytes : bArr;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        return decodeFloat(this.nativeHandle, str, f);
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        return decodeInt(this.nativeHandle, str, i);
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        return decodeLong(this.nativeHandle, str, j);
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        return decodeString(this.nativeHandle, str, str2);
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        String[] strArrDecodeStringSet = decodeStringSet(this.nativeHandle, str);
        if (strArrDecodeStringSet != null) {
            try {
                Set set2 = (Set) HashSet.class.newInstance();
                set2.addAll(Arrays.asList(strArrDecodeStringSet));
                return set2;
            } catch (IllegalAccessException | InstantiationException unused) {
            }
        }
        return set;
    }

    public native boolean isMultiProcess();

    public native boolean isReadOnly();

    public native void lock();

    public native String mmapID();

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        encodeBool(this.nativeHandle, str, z);
        return this;
    }

    public SharedPreferences.Editor putBytes(String str, byte[] bArr, int i) {
        encodeBytes_2(this.nativeHandle, str, bArr, i);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        encodeFloat(this.nativeHandle, str, f);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        encodeInt(this.nativeHandle, str, i);
        return this;
    }

    public SharedPreferences.Editor putLong(String str, long j, int i) {
        encodeLong_2(this.nativeHandle, str, j, i);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        encodeString(this.nativeHandle, str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        encodeSet(this.nativeHandle, str, set == null ? null : (String[]) set.toArray(new String[0]));
        return this;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        removeValueForKey(this.nativeHandle, str);
        return this;
    }

    public native void removeValuesForKeys(String[] strArr);

    public native void trim();

    public native boolean tryLock();

    public native void unlock();

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m367() {
        sync(true);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m368(String str) {
        encodeBool_2(this.nativeHandle, str, true, 1728000);
    }

    public SharedPreferences.Editor putBytes(String str, byte[] bArr) {
        encodeBytes(this.nativeHandle, str, bArr);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putLong(String str, long j) {
        encodeLong(this.nativeHandle, str, j);
        return this;
    }
}
