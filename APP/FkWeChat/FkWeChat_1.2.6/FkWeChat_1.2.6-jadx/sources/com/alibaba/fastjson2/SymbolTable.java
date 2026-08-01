package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.Fnv;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class SymbolTable {
    private final long hashCode64;
    private final long[] hashCodes;
    private final long[] hashCodesOrigin;
    private final short[] mapping;
    private final String[] names;

    public SymbolTable(String... strArr) {
        String[] strArr2;
        TreeSet treeSet = new TreeSet(Arrays.asList(strArr));
        this.names = new String[treeSet.size()];
        Iterator it = treeSet.iterator();
        int i10 = 0;
        while (true) {
            strArr2 = this.names;
            if (i10 >= strArr2.length) {
                break;
            }
            if (it.hasNext()) {
                this.names[i10] = (String) it.next();
            }
            i10++;
        }
        int length = strArr2.length;
        long[] jArr = new long[length];
        int i11 = 0;
        while (true) {
            String[] strArr3 = this.names;
            if (i11 >= strArr3.length) {
                break;
            }
            jArr[i11] = Fnv.hashCode64(strArr3[i11]);
            i11++;
        }
        this.hashCodesOrigin = jArr;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length);
        this.hashCodes = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
        this.mapping = new short[jArrCopyOf.length];
        for (int i12 = 0; i12 < length; i12++) {
            this.mapping[Arrays.binarySearch(this.hashCodes, jArr[i12])] = (short) i12;
        }
        long j10 = Fnv.MAGIC_HASH_CODE;
        for (int i13 = 0; i13 < length; i13++) {
            j10 = (j10 ^ jArr[i13]) * Fnv.MAGIC_PRIME;
        }
        this.hashCode64 = j10;
    }

    private static String[] classNames(Class<?>... clsArr) {
        String[] strArr = new String[clsArr.length];
        for (int i10 = 0; i10 < clsArr.length; i10++) {
            strArr[i10] = clsArr[i10].getName();
        }
        return strArr;
    }

    public long getHashCode(int i10) {
        return this.hashCodesOrigin[i10 - 1];
    }

    public String getName(int i10) {
        return this.names[i10 - 1];
    }

    public String getNameByHashCode(long j10) {
        int iBinarySearch = Arrays.binarySearch(this.hashCodes, j10);
        if (iBinarySearch < 0) {
            return null;
        }
        return this.names[this.mapping[iBinarySearch]];
    }

    public int getOrdinal(String str) {
        int iBinarySearch = Arrays.binarySearch(this.hashCodes, Fnv.hashCode64(str));
        if (iBinarySearch < 0) {
            return -1;
        }
        return this.mapping[iBinarySearch] + 1;
    }

    public int getOrdinalByHashCode(long j10) {
        int iBinarySearch = Arrays.binarySearch(this.hashCodes, j10);
        if (iBinarySearch < 0) {
            return -1;
        }
        return this.mapping[iBinarySearch] + 1;
    }

    public long hashCode64() {
        return this.hashCode64;
    }

    public int size() {
        return this.names.length;
    }

    public SymbolTable(Class<?>... clsArr) {
        this(classNames(clsArr));
    }
}
