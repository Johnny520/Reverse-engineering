package Yue;

import java.util.ConcurrentModificationException;
import java.util.Map;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7467<K, V> {
    private static final int BASE_SIZE = 4;
    private static final int CACHE_SIZE = 10;
    private static final boolean CONCURRENT_MODIFICATION_EXCEPTIONS = true;
    private static final boolean DEBUG = false;
    private static final String TAG = "ArrayMap";

    @InterfaceC6490
    static Object[] mBaseCache;
    static int mBaseCacheSize;

    @InterfaceC6490
    static Object[] mTwiceBaseCache;
    static int mTwiceBaseCacheSize;
    Object[] mArray;
    int[] mHashes;
    int mSize;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7467() {
        this.mHashes = C4146.f712;
        this.mArray = C4146.f8480;
        this.mSize = 0;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static int m3664(int[] iArr, int i, int i2) {
        try {
            return C4146.m1100(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m23420(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C7467.class) {
                try {
                    if (mTwiceBaseCacheSize < 10) {
                        objArr[0] = mTwiceBaseCache;
                        objArr[1] = iArr;
                        for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        mTwiceBaseCache = objArr;
                        mTwiceBaseCacheSize++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C7467.class) {
                try {
                    if (mBaseCacheSize < 10) {
                        objArr[0] = mBaseCache;
                        objArr[1] = iArr;
                        for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        mBaseCache = objArr;
                        mBaseCacheSize++;
                    }
                } finally {
                }
            }
        }
    }

    public void clear() {
        int i = this.mSize;
        if (i > 0) {
            int[] iArr = this.mHashes;
            Object[] objArr = this.mArray;
            this.mHashes = C4146.f712;
            this.mArray = C4146.f8480;
            this.mSize = 0;
            m23420(iArr, objArr, i);
        }
        if (this.mSize > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(@InterfaceC6490 Object obj) {
        return indexOfKey(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return indexOfValue(obj) >= 0;
    }

    public void ensureCapacity(int i) {
        int i2 = this.mSize;
        int[] iArr = this.mHashes;
        if (iArr.length < i) {
            Object[] objArr = this.mArray;
            m3665(i);
            if (this.mSize > 0) {
                System.arraycopy(iArr, 0, this.mHashes, 0, i2);
                System.arraycopy(objArr, 0, this.mArray, 0, i2 << 1);
            }
            m23420(iArr, objArr, i2);
        }
        if (this.mSize != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7467) {
            C7467 c7467 = (C7467) obj;
            if (size() != c7467.size()) {
                return false;
            }
            for (int i = 0; i < this.mSize; i++) {
                try {
                    K kKeyAt = keyAt(i);
                    V vValueAt = valueAt(i);
                    Object obj2 = c7467.get(kKeyAt);
                    if (vValueAt == null) {
                        if (obj2 != null || !c7467.containsKey(kKeyAt)) {
                            return false;
                        }
                    } else if (!vValueAt.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.mSize; i2++) {
                try {
                    K kKeyAt2 = keyAt(i2);
                    V vValueAt2 = valueAt(i2);
                    Object obj3 = map.get(kKeyAt2);
                    if (vValueAt2 == null) {
                        if (obj3 != null || !map.containsKey(kKeyAt2)) {
                            return false;
                        }
                    } else if (!vValueAt2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    @InterfaceC6490
    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int iIndexOfKey = indexOfKey(obj);
        return iIndexOfKey >= 0 ? (V) this.mArray[(iIndexOfKey << 1) + 1] : v;
    }

    public int hashCode() {
        int[] iArr = this.mHashes;
        Object[] objArr = this.mArray;
        int i = this.mSize;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public int indexOf(Object obj, int i) {
        int i2 = this.mSize;
        if (i2 == 0) {
            return -1;
        }
        int iM3664 = m3664(this.mHashes, i2, i);
        if (iM3664 < 0 || obj.equals(this.mArray[iM3664 << 1])) {
            return iM3664;
        }
        int i3 = iM3664 + 1;
        while (i3 < i2 && this.mHashes[i3] == i) {
            if (obj.equals(this.mArray[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM3664 - 1; i4 >= 0 && this.mHashes[i4] == i; i4--) {
            if (obj.equals(this.mArray[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public int indexOfKey(@InterfaceC6490 Object obj) {
        return obj == null ? indexOfNull() : indexOf(obj, obj.hashCode());
    }

    public int indexOfNull() {
        int i = this.mSize;
        if (i == 0) {
            return -1;
        }
        int iM3664 = m3664(this.mHashes, i, 0);
        if (iM3664 < 0 || this.mArray[iM3664 << 1] == null) {
            return iM3664;
        }
        int i2 = iM3664 + 1;
        while (i2 < i && this.mHashes[i2] == 0) {
            if (this.mArray[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM3664 - 1; i3 >= 0 && this.mHashes[i3] == 0; i3--) {
            if (this.mArray[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public int indexOfValue(Object obj) {
        int i = this.mSize * 2;
        Object[] objArr = this.mArray;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.mSize <= 0;
    }

    public K keyAt(int i) {
        return (K) this.mArray[i << 1];
    }

    @InterfaceC6490
    public V put(K k, V v) {
        int i;
        int iIndexOf;
        int i2 = this.mSize;
        if (k == null) {
            iIndexOf = indexOfNull();
            i = 0;
        } else {
            int iHashCode = k.hashCode();
            i = iHashCode;
            iIndexOf = indexOf(k, iHashCode);
        }
        if (iIndexOf >= 0) {
            int i3 = (iIndexOf << 1) + 1;
            Object[] objArr = this.mArray;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = ~iIndexOf;
        int[] iArr = this.mHashes;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            Object[] objArr2 = this.mArray;
            m3665(i5);
            if (i2 != this.mSize) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.mHashes;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.mArray, 0, objArr2.length);
            }
            m23420(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.mHashes;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.mArray;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.mSize - i4) << 1);
        }
        int i7 = this.mSize;
        if (i2 == i7) {
            int[] iArr4 = this.mHashes;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.mArray;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.mSize = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void putAll(@InterfaceC6391 C7467<? extends K, ? extends V> c7467) {
        int i = c7467.mSize;
        ensureCapacity(this.mSize + i);
        if (this.mSize != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(c7467.keyAt(i2), c7467.valueAt(i2));
            }
        } else if (i > 0) {
            System.arraycopy(c7467.mHashes, 0, this.mHashes, 0, i);
            System.arraycopy(c7467.mArray, 0, this.mArray, 0, i << 1);
            this.mSize = i;
        }
    }

    @InterfaceC6490
    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6490
    public V remove(Object obj) {
        int iIndexOfKey = indexOfKey(obj);
        if (iIndexOfKey >= 0) {
            return removeAt(iIndexOfKey);
        }
        return null;
    }

    public V removeAt(int i) {
        Object[] objArr = this.mArray;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.mSize;
        int i4 = 0;
        if (i3 <= 1) {
            m23420(this.mHashes, objArr, i3);
            this.mHashes = C4146.f712;
            this.mArray = C4146.f8480;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.mHashes;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr2 = this.mArray;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.mArray;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                m3665(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.mSize) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.mHashes, 0, i);
                    System.arraycopy(objArr, 0, this.mArray, 0, i2);
                }
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, this.mHashes, i, i10);
                    System.arraycopy(objArr, i9 << 1, this.mArray, i2, i10 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 != this.mSize) {
            throw new ConcurrentModificationException();
        }
        this.mSize = i4;
        return v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6490
    public V replace(K k, V v) {
        int iIndexOfKey = indexOfKey(k);
        if (iIndexOfKey >= 0) {
            return setValueAt(iIndexOfKey, v);
        }
        return null;
    }

    public V setValueAt(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.mArray;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public int size() {
        return this.mSize;
    }

    public String toString() {
        if (isEmpty()) {
            return C6193.f15213;
        }
        StringBuilder sb = new StringBuilder(this.mSize * 28);
        sb.append(C6193.f1884);
        for (int i = 0; i < this.mSize; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K kKeyAt = keyAt(i);
            if (kKeyAt != this) {
                sb.append(kKeyAt);
            } else {
                sb.append("(this Map)");
            }
            sb.append(SignatureVisitor.INSTANCEOF);
            V vValueAt = valueAt(i);
            if (vValueAt != this) {
                sb.append(vValueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append(C6193.f1885);
        return sb.toString();
    }

    public V valueAt(int i) {
        return (V) this.mArray[(i << 1) + 1];
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m3665(int i) {
        if (i == 8) {
            synchronized (C7467.class) {
                try {
                    Object[] objArr = mTwiceBaseCache;
                    if (objArr != null) {
                        this.mArray = objArr;
                        mTwiceBaseCache = (Object[]) objArr[0];
                        this.mHashes = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        mTwiceBaseCacheSize--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (C7467.class) {
                try {
                    Object[] objArr2 = mBaseCache;
                    if (objArr2 != null) {
                        this.mArray = objArr2;
                        mBaseCache = (Object[]) objArr2[0];
                        this.mHashes = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        mBaseCacheSize--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.mHashes = new int[i];
        this.mArray = new Object[i << 1];
    }

    public boolean remove(Object obj, Object obj2) {
        int iIndexOfKey = indexOfKey(obj);
        if (iIndexOfKey < 0) {
            return false;
        }
        V vValueAt = valueAt(iIndexOfKey);
        if (obj2 != vValueAt && (obj2 == null || !obj2.equals(vValueAt))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public boolean replace(K k, V v, V v2) {
        int iIndexOfKey = indexOfKey(k);
        if (iIndexOfKey < 0) {
            return false;
        }
        V vValueAt = valueAt(iIndexOfKey);
        if (vValueAt != v && (v == null || !v.equals(vValueAt))) {
            return false;
        }
        setValueAt(iIndexOfKey, v2);
        return true;
    }

    public C7467(int i) {
        if (i == 0) {
            this.mHashes = C4146.f712;
            this.mArray = C4146.f8480;
        } else {
            m3665(i);
        }
        this.mSize = 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۢ۟ۡ<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public C7467(C7467<K, V> c7467) {
        this();
        if (c7467 != 0) {
            putAll(c7467);
        }
    }
}
