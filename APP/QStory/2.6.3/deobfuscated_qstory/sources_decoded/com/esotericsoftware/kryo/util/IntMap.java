package com.esotericsoftware.kryo.util;

import bsh.C2633;
import com.esotericsoftware.kryo.KryoException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p009.AbstractC6183;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class IntMap<V> implements Iterable<Entry<V>> {
    boolean hasZeroValue;
    int[] keyTable;
    private final float loadFactor;
    protected int mask;
    protected int shift;
    public int size;
    private int threshold;
    V[] valueTable;
    V zeroValue;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class Entry<V> {
        public int key;
        public V value;

        public String toString() {
            return this.key + "=" + this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class MapIterator<V> {
        private static final int INDEX_ILLEGAL = -2;
        static final int INDEX_ZERO = -1;
        int currentIndex;
        public boolean hasNext;
        final IntMap<V> map;
        int nextIndex;
        boolean valid = true;

        public MapIterator(IntMap<V> intMap) {
            this.map = intMap;
            reset();
        }

        public void findNextIndex() {
            int i;
            int[] iArr = this.map.keyTable;
            int length = iArr.length;
            do {
                i = this.nextIndex + 1;
                this.nextIndex = i;
                if (i >= length) {
                    this.hasNext = false;
                    return;
                }
            } while (iArr[i] == 0);
            this.hasNext = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void remove() {
            /*
                r9 = this;
                int r0 = r9.currentIndex
                r1 = -1
                r2 = 0
                if (r0 != r1) goto Lf
                com.esotericsoftware.kryo.util.IntMap<V> r1 = r9.map
                boolean r3 = r1.hasZeroValue
                if (r3 == 0) goto Lf
                r1.hasZeroValue = r2
                goto L44
            Lf:
                if (r0 < 0) goto L50
                com.esotericsoftware.kryo.util.IntMap<V> r1 = r9.map
                int[] r3 = r1.keyTable
                V[] r4 = r1.valueTable
                int r1 = r1.mask
                int r5 = r0 + 1
            L1b:
                r5 = r5 & r1
                r6 = r3[r5]
                if (r6 == 0) goto L38
                com.esotericsoftware.kryo.util.IntMap<V> r7 = r9.map
                int r7 = r7.place(r6)
                int r8 = r5 - r7
                r8 = r8 & r1
                int r7 = r0 - r7
                r7 = r7 & r1
                if (r8 <= r7) goto L35
                r3[r0] = r6
                r6 = r4[r5]
                r4[r0] = r6
                r0 = r5
            L35:
                int r5 = r5 + 1
                goto L1b
            L38:
                r3[r0] = r2
                int r1 = r9.currentIndex
                if (r0 == r1) goto L44
                int r0 = r9.nextIndex
                int r0 = r0 + (-1)
                r9.nextIndex = r0
            L44:
                r0 = -2
                r9.currentIndex = r0
                com.esotericsoftware.kryo.util.IntMap<V> r9 = r9.map
                int r0 = r9.size
                int r0 = r0 + (-1)
                r9.size = r0
                return
            L50:
                java.lang.String r9 = "next must be called before remove."
                top.suzhelan.qstory.hook.item.C5925.m11311(r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.util.IntMap.MapIterator.remove():void");
        }

        public void reset() {
            this.currentIndex = INDEX_ILLEGAL;
            this.nextIndex = -1;
            if (this.map.hasZeroValue) {
                this.hasNext = true;
            } else {
                findNextIndex();
            }
        }
    }

    public IntMap(int i, float f) {
        if (f <= 0.0f || f >= 1.0f) {
            C3076.m6901("loadFactor must be > 0 and < 1: ", f);
            throw null;
        }
        this.loadFactor = f;
        int iTableSize = ObjectMap.tableSize(i, f);
        this.threshold = (int) (iTableSize * f);
        int i2 = iTableSize - 1;
        this.mask = i2;
        this.shift = Long.numberOfLeadingZeros(i2);
        this.keyTable = new int[iTableSize];
        this.valueTable = (V[]) new Object[iTableSize];
    }

    private int locateKey(int i) {
        int[] iArr = this.keyTable;
        int iPlace = place(i);
        while (true) {
            int i2 = iArr[iPlace];
            if (i2 == 0) {
                return -(iPlace + 1);
            }
            if (i2 == i) {
                return iPlace;
            }
            iPlace = (iPlace + 1) & this.mask;
        }
    }

    private void putResize(int i, V v) {
        int[] iArr = this.keyTable;
        int iPlace = place(i);
        while (iArr[iPlace] != 0) {
            iPlace = (iPlace + 1) & this.mask;
        }
        iArr[iPlace] = i;
        this.valueTable[iPlace] = v;
    }

    private void resize(int i) {
        int length = this.keyTable.length;
        this.threshold = (int) (i * this.loadFactor);
        int i2 = i - 1;
        this.mask = i2;
        this.shift = Long.numberOfLeadingZeros(i2);
        int[] iArr = this.keyTable;
        V[] vArr = this.valueTable;
        this.keyTable = new int[i];
        this.valueTable = (V[]) new Object[i];
        if (this.size > 0) {
            for (int i3 = 0; i3 < length; i3++) {
                int i4 = iArr[i3];
                if (i4 != 0) {
                    putResize(i4, vArr[i3]);
                }
            }
        }
    }

    public void clear(int i) {
        int iTableSize = ObjectMap.tableSize(i, this.loadFactor);
        if (this.keyTable.length <= iTableSize) {
            clear();
            return;
        }
        this.size = 0;
        this.hasZeroValue = false;
        this.zeroValue = null;
        resize(iTableSize);
    }

    public boolean containsKey(int i) {
        return i == 0 ? this.hasZeroValue : locateKey(i) >= 0;
    }

    public boolean containsValue(Object obj, boolean z) {
        V[] vArr = this.valueTable;
        if (obj == null) {
            if (this.hasZeroValue && this.zeroValue == null) {
                return true;
            }
            int[] iArr = this.keyTable;
            for (int length = vArr.length - 1; length >= 0; length--) {
                if (iArr[length] != 0 && vArr[length] == null) {
                    return true;
                }
            }
            return false;
        }
        if (z) {
            if (obj == this.zeroValue) {
                return true;
            }
            for (int length2 = vArr.length - 1; length2 >= 0; length2--) {
                if (vArr[length2] == obj) {
                    return true;
                }
            }
            return false;
        }
        if (this.hasZeroValue && obj.equals(this.zeroValue)) {
            return true;
        }
        for (int length3 = vArr.length - 1; length3 >= 0; length3--) {
            if (obj.equals(vArr[length3])) {
                return true;
            }
        }
        return false;
    }

    public void ensureCapacity(int i) {
        int iTableSize = ObjectMap.tableSize(this.size + i, this.loadFactor);
        if (this.keyTable.length < iTableSize) {
            resize(iTableSize);
        }
    }

    public Entries<V> entries() {
        return new Entries<>(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntMap)) {
            return false;
        }
        IntMap intMap = (IntMap) obj;
        if (intMap.size != this.size) {
            return false;
        }
        boolean z = intMap.hasZeroValue;
        boolean z2 = this.hasZeroValue;
        if (z != z2) {
            return false;
        }
        if (z2) {
            V v = intMap.zeroValue;
            V v2 = this.zeroValue;
            if (v == null) {
                if (v2 != null) {
                    return false;
                }
            } else if (!v.equals(v2)) {
                return false;
            }
        }
        int[] iArr = this.keyTable;
        V[] vArr = this.valueTable;
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                V v3 = vArr[i];
                if (v3 == null) {
                    if (intMap.get(i2, ObjectMap.dummy) != null) {
                        return false;
                    }
                } else if (!v3.equals(intMap.get(i2))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equalsIdentity(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntMap)) {
            return false;
        }
        IntMap intMap = (IntMap) obj;
        if (intMap.size != this.size) {
            return false;
        }
        boolean z = intMap.hasZeroValue;
        boolean z2 = this.hasZeroValue;
        if (z != z2) {
            return false;
        }
        if (z2 && this.zeroValue != intMap.zeroValue) {
            return false;
        }
        int[] iArr = this.keyTable;
        V[] vArr = this.valueTable;
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (i2 != 0 && vArr[i] != intMap.get(i2, ObjectMap.dummy)) {
                return false;
            }
        }
        return true;
    }

    public int findKey(Object obj, boolean z, int i) {
        V[] vArr = this.valueTable;
        if (obj == null) {
            if (this.hasZeroValue && this.zeroValue == null) {
                return 0;
            }
            int[] iArr = this.keyTable;
            for (int length = vArr.length - 1; length >= 0; length--) {
                int i2 = iArr[length];
                if (i2 != 0 && vArr[length] == null) {
                    return i2;
                }
            }
        } else if (z) {
            if (obj == this.zeroValue) {
                return 0;
            }
            for (int length2 = vArr.length - 1; length2 >= 0; length2--) {
                if (vArr[length2] == obj) {
                    return this.keyTable[length2];
                }
            }
        } else {
            if (this.hasZeroValue && obj.equals(this.zeroValue)) {
                return 0;
            }
            for (int length3 = vArr.length - 1; length3 >= 0; length3--) {
                if (obj.equals(vArr[length3])) {
                    return this.keyTable[length3];
                }
            }
        }
        return i;
    }

    public V get(int i) {
        if (i == 0) {
            if (this.hasZeroValue) {
                return this.zeroValue;
            }
            return null;
        }
        int iPlace = place(i);
        while (true) {
            int i2 = this.keyTable[iPlace];
            if (i2 == 0) {
                return null;
            }
            if (i2 == i) {
                return this.valueTable[iPlace];
            }
            iPlace = (iPlace + 1) & this.mask;
        }
    }

    public int hashCode() {
        V v;
        int iHashCode = this.size;
        if (this.hasZeroValue && (v = this.zeroValue) != null) {
            iHashCode += v.hashCode();
        }
        int[] iArr = this.keyTable;
        V[] vArr = this.valueTable;
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                int i3 = (i2 * 31) + iHashCode;
                V v2 = vArr[i];
                iHashCode = v2 != null ? v2.hashCode() + i3 : i3;
            }
        }
        return iHashCode;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<Entry<V>> iterator() {
        return entries();
    }

    public Keys keys() {
        return new Keys(this);
    }

    public boolean notEmpty() {
        return this.size > 0;
    }

    public int place(int i) {
        return (int) ((((long) i) * (-7046029254386353131L)) >>> this.shift);
    }

    public V put(int i, V v) {
        if (i == 0) {
            V v2 = this.zeroValue;
            this.zeroValue = v;
            if (!this.hasZeroValue) {
                this.hasZeroValue = true;
                this.size++;
            }
            return v2;
        }
        int iLocateKey = locateKey(i);
        if (iLocateKey >= 0) {
            V[] vArr = this.valueTable;
            V v3 = vArr[iLocateKey];
            vArr[iLocateKey] = v;
            return v3;
        }
        int i2 = -(iLocateKey + 1);
        int[] iArr = this.keyTable;
        iArr[i2] = i;
        this.valueTable[i2] = v;
        int i3 = this.size + 1;
        this.size = i3;
        if (i3 < this.threshold) {
            return null;
        }
        resize(iArr.length << 1);
        return null;
    }

    public void putAll(IntMap<? extends V> intMap) {
        ensureCapacity(intMap.size);
        if (intMap.hasZeroValue) {
            put(0, intMap.zeroValue);
        }
        int[] iArr = intMap.keyTable;
        V[] vArr = intMap.valueTable;
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                put(i2, vArr[i]);
            }
        }
    }

    public V remove(int i) {
        if (i == 0) {
            if (!this.hasZeroValue) {
                return null;
            }
            this.hasZeroValue = false;
            V v = this.zeroValue;
            this.zeroValue = null;
            this.size--;
            return v;
        }
        int iLocateKey = locateKey(i);
        if (iLocateKey < 0) {
            return null;
        }
        int[] iArr = this.keyTable;
        V[] vArr = this.valueTable;
        V v2 = vArr[iLocateKey];
        int i2 = this.mask;
        int i3 = iLocateKey + 1;
        while (true) {
            int i4 = i3 & i2;
            int i5 = iArr[i4];
            if (i5 == 0) {
                iArr[iLocateKey] = 0;
                this.size--;
                return v2;
            }
            int iPlace = place(i5);
            if (((i4 - iPlace) & i2) > ((iLocateKey - iPlace) & i2)) {
                iArr[iLocateKey] = i5;
                vArr[iLocateKey] = vArr[i4];
                iLocateKey = i4;
            }
            i3 = i4 + 1;
        }
    }

    public void shrink(int i) {
        if (i < 0) {
            C5925.m11310(AbstractC6183.m11588(i, "maximumCapacity must be >= 0: "));
            return;
        }
        int iTableSize = ObjectMap.tableSize(i, this.loadFactor);
        if (this.keyTable.length > iTableSize) {
            resize(iTableSize);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003e -> B:16:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r6 = this;
            int r0 = r6.size
            if (r0 != 0) goto L7
            java.lang.String r6 = "[]"
            return r6
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 32
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            int[] r1 = r6.keyTable
            V[] r2 = r6.valueTable
            int r3 = r1.length
            boolean r4 = r6.hasZeroValue
            r5 = 61
            if (r4 == 0) goto L29
            java.lang.String r4 = "0="
            r0.append(r4)
            V r6 = r6.zeroValue
            r0.append(r6)
            goto L3f
        L29:
            int r6 = r3 + (-1)
            if (r3 <= 0) goto L3e
            r3 = r1[r6]
            if (r3 != 0) goto L33
            r3 = r6
            goto L29
        L33:
            r0.append(r3)
            r0.append(r5)
            r3 = r2[r6]
            r0.append(r3)
        L3e:
            r3 = r6
        L3f:
            int r6 = r3 + (-1)
            if (r3 <= 0) goto L59
            r3 = r1[r6]
            if (r3 != 0) goto L48
            goto L3e
        L48:
            java.lang.String r4 = ", "
            r0.append(r4)
            r0.append(r3)
            r0.append(r5)
            r3 = r2[r6]
            r0.append(r3)
            goto L3e
        L59:
            r6 = 93
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.util.IntMap.toString():java.lang.String");
    }

    public Values<V> values() {
        return new Values<>(this);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class Entries<V> extends MapIterator<V> implements Iterable<Entry<V>>, Iterator<Entry<V>> {
        private final Entry<V> entry;

        public Entries(IntMap intMap) {
            super(intMap);
            this.entry = new Entry<>();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.valid) {
                return this.hasNext;
            }
            throw new KryoException("#iterator() cannot be used nested.");
        }

        @Override // java.util.Iterator
        public Entry<V> next() {
            if (!this.hasNext) {
                C2633.m5336();
                return null;
            }
            if (!this.valid) {
                throw new KryoException("#iterator() cannot be used nested.");
            }
            IntMap<V> intMap = this.map;
            int[] iArr = intMap.keyTable;
            int i = this.nextIndex;
            Entry<V> entry = this.entry;
            if (i == -1) {
                entry.key = 0;
                entry.value = intMap.zeroValue;
            } else {
                entry.key = iArr[i];
                entry.value = intMap.valueTable[i];
            }
            this.currentIndex = i;
            findNextIndex();
            return this.entry;
        }

        @Override // com.esotericsoftware.kryo.util.IntMap.MapIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.esotericsoftware.kryo.util.IntMap.MapIterator
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        @Override // java.lang.Iterable
        public Iterator<Entry<V>> iterator() {
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class Values<V> extends MapIterator<V> implements Iterable<V>, Iterator<V> {
        public Values(IntMap<V> intMap) {
            super(intMap);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.hasNext;
        }

        @Override // java.util.Iterator
        public V next() {
            if (!this.hasNext) {
                C2633.m5336();
                return null;
            }
            int i = this.nextIndex;
            IntMap<V> intMap = this.map;
            V v = i == -1 ? intMap.zeroValue : intMap.valueTable[i];
            this.currentIndex = i;
            findNextIndex();
            return v;
        }

        @Override // com.esotericsoftware.kryo.util.IntMap.MapIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.esotericsoftware.kryo.util.IntMap.MapIterator
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        public ArrayList<V> toList() {
            ArrayList<V> arrayList = new ArrayList<>(this.map.size);
            while (this.hasNext) {
                arrayList.add(next());
            }
            return arrayList;
        }

        @Override // java.lang.Iterable
        public Iterator<V> iterator() {
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class Keys extends MapIterator {
        public Keys(IntMap intMap) {
            super(intMap);
        }

        public int next() {
            if (!this.hasNext) {
                C2633.m5336();
                return 0;
            }
            int i = this.nextIndex;
            int i2 = i == -1 ? 0 : this.map.keyTable[i];
            this.currentIndex = i;
            findNextIndex();
            return i2;
        }

        @Override // com.esotericsoftware.kryo.util.IntMap.MapIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.esotericsoftware.kryo.util.IntMap.MapIterator
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        public IntArray toArray() {
            IntArray intArray = new IntArray(true, this.map.size);
            while (this.hasNext) {
                intArray.add(next());
            }
            return intArray;
        }

        public IntArray toArray(IntArray intArray) {
            while (this.hasNext) {
                intArray.add(next());
            }
            return intArray;
        }
    }

    public void clear() {
        if (this.size == 0) {
            return;
        }
        this.size = 0;
        Arrays.fill(this.keyTable, 0);
        Arrays.fill(this.valueTable, (Object) null);
        this.zeroValue = null;
        this.hasZeroValue = false;
    }

    public V get(int i, V v) {
        if (i == 0) {
            if (this.hasZeroValue) {
                return this.zeroValue;
            }
            return null;
        }
        int iPlace = place(i);
        while (true) {
            int i2 = this.keyTable[iPlace];
            if (i2 == 0) {
                return v;
            }
            if (i2 == i) {
                return this.valueTable[iPlace];
            }
            iPlace = (iPlace + 1) & this.mask;
        }
    }

    public IntMap(int i) {
        this(i, 0.8f);
    }

    public IntMap() {
        this(51, 0.8f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IntMap(IntMap<? extends V> intMap) {
        float length = intMap.keyTable.length;
        float f = intMap.loadFactor;
        this((int) (length * f), f);
        int[] iArr = intMap.keyTable;
        System.arraycopy(iArr, 0, this.keyTable, 0, iArr.length);
        Object[] objArr = intMap.valueTable;
        System.arraycopy(objArr, 0, this.valueTable, 0, objArr.length);
        this.size = intMap.size;
        this.zeroValue = intMap.zeroValue;
        this.hasZeroValue = intMap.hasZeroValue;
    }
}
