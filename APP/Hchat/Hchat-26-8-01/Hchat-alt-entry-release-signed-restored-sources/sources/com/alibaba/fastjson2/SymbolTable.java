package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.Fnv;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class SymbolTable {
    private final long hashCode64;
    private final long[] hashCodes;
    private final long[] hashCodesOrigin;
    private final short[] mapping;
    private final String[] names;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SymbolTable(String... strArr) {
        String[] strArr2;
        TreeSet treeSet = new TreeSet();
        for (String str : strArr) {
            treeSet.add(str);
        }
        this.names = new String[treeSet.size()];
        Iterator it = treeSet.iterator();
        int i9 = 0;
        while (true) {
            strArr2 = this.names;
            if (i9 >= strArr2.length) {
                break;
            }
            if (it.hasNext()) {
                this.names[i9] = (String) it.next();
            }
            i9++;
        }
        int length = strArr2.length;
        long[] jArr = new long[length];
        int i10 = 0;
        while (true) {
            String[] strArr3 = this.names;
            if (i10 >= strArr3.length) {
                break;
            }
            jArr[i10] = Fnv.hashCode64(strArr3[i10]);
            i10++;
        }
        this.hashCodesOrigin = jArr;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length);
        this.hashCodes = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
        this.mapping = new short[jArrCopyOf.length];
        for (int i11 = 0; i11 < length; i11++) {
            this.mapping[Arrays.binarySearch(this.hashCodes, jArr[i11])] = (short) i11;
        }
        long j3 = Fnv.MAGIC_HASH_CODE;
        for (int i12 = 0; i12 < length; i12++) {
            j3 = (j3 ^ jArr[i12]) * Fnv.MAGIC_PRIME;
        }
        this.hashCode64 = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String[] classNames(Class... clsArr) {
        String[] strArr = new String[clsArr.length];
        for (int i9 = 0; i9 < clsArr.length; i9++) {
            strArr[i9] = clsArr[i9].getName();
        }
        return strArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long getHashCode(int i9) {
        return this.hashCodesOrigin[i9 - 1];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getName(int i9) {
        return this.names[i9 - 1];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getNameByHashCode(long j3) {
        int iBinarySearch = Arrays.binarySearch(this.hashCodes, j3);
        if (iBinarySearch < 0) {
            return null;
        }
        return this.names[this.mapping[iBinarySearch]];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getOrdinal(String str) {
        int iBinarySearch = Arrays.binarySearch(this.hashCodes, Fnv.hashCode64(str));
        if (iBinarySearch < 0) {
            return -1;
        }
        return this.mapping[iBinarySearch] + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getOrdinalByHashCode(long j3) {
        int iBinarySearch = Arrays.binarySearch(this.hashCodes, j3);
        if (iBinarySearch < 0) {
            return -1;
        }
        return this.mapping[iBinarySearch] + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long hashCode64() {
        return this.hashCode64;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int size() {
        return this.names.length;
    }

    public SymbolTable(Class<?>... clsArr) {
        this(classNames(clsArr));
    }
}
