package com.alibaba.fastjson2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class SymbolTable {
    private final long hashCode64;
    private final long[] hashCodes;
    private final long[] hashCodesOrigin;
    private final short[] mapping;
    private final java.lang.String[] names;

    public SymbolTable(java.lang.Class<?>... r1) {
            r0 = this;
            java.lang.String[] r1 = classNames(r1)
            r0.<init>(r1)
            return
    }

    public SymbolTable(java.lang.String... r8) {
            r7 = this;
            r7.<init>()
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            int r1 = r8.length
            r2 = 0
            r3 = r2
        Lb:
            if (r3 >= r1) goto L15
            r4 = r8[r3]
            r0.add(r4)
            int r3 = r3 + 1
            goto Lb
        L15:
            int r8 = r0.size()
            java.lang.String[] r8 = new java.lang.String[r8]
            r7.names = r8
            java.util.Iterator r8 = r0.iterator()
            r0 = r2
        L22:
            java.lang.String[] r1 = r7.names
            int r3 = r1.length
            if (r0 >= r3) goto L3a
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L37
            java.lang.String[] r1 = r7.names
            java.lang.Object r3 = r8.next()
            java.lang.String r3 = (java.lang.String) r3
            r1[r0] = r3
        L37:
            int r0 = r0 + 1
            goto L22
        L3a:
            int r8 = r1.length
            long[] r0 = new long[r8]
            r1 = r2
        L3e:
            java.lang.String[] r3 = r7.names
            int r4 = r3.length
            if (r1 >= r4) goto L4e
            r3 = r3[r1]
            long r3 = com.alibaba.fastjson2.util.Fnv.hashCode64(r3)
            r0[r1] = r3
            int r1 = r1 + 1
            goto L3e
        L4e:
            r7.hashCodesOrigin = r0
            long[] r1 = java.util.Arrays.copyOf(r0, r8)
            r7.hashCodes = r1
            java.util.Arrays.sort(r1)
            int r1 = r1.length
            short[] r1 = new short[r1]
            r7.mapping = r1
            r1 = r2
        L5f:
            if (r1 >= r8) goto L71
            r3 = r0[r1]
            long[] r5 = r7.hashCodes
            int r3 = java.util.Arrays.binarySearch(r5, r3)
            short[] r4 = r7.mapping
            short r5 = (short) r1
            r4[r3] = r5
            int r1 = r1 + 1
            goto L5f
        L71:
            r3 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
        L76:
            if (r2 >= r8) goto L84
            r5 = r0[r2]
            long r3 = r3 ^ r5
            r5 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            long r3 = r3 * r5
            int r2 = r2 + 1
            goto L76
        L84:
            r7.hashCode64 = r3
            return
    }

    private static java.lang.String[] classNames(java.lang.Class... r3) {
            int r0 = r3.length
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
        L4:
            int r2 = r3.length
            if (r1 >= r2) goto L12
            r2 = r3[r1]
            java.lang.String r2 = r2.getName()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            return r0
    }

    public long getHashCode(int r4) {
            r3 = this;
            long[] r0 = r3.hashCodesOrigin
            int r4 = r4 + (-1)
            r1 = r0[r4]
            return r1
    }

    public java.lang.String getName(int r2) {
            r1 = this;
            java.lang.String[] r0 = r1.names
            int r2 = r2 + (-1)
            r2 = r0[r2]
            return r2
    }

    public java.lang.String getNameByHashCode(long r2) {
            r1 = this;
            long[] r0 = r1.hashCodes
            int r2 = java.util.Arrays.binarySearch(r0, r2)
            if (r2 >= 0) goto La
            r2 = 0
            return r2
        La:
            short[] r3 = r1.mapping
            short r2 = r3[r2]
            java.lang.String[] r3 = r1.names
            r2 = r3[r2]
            return r2
    }

    public int getOrdinal(java.lang.String r4) {
            r3 = this;
            long[] r0 = r3.hashCodes
            long r1 = com.alibaba.fastjson2.util.Fnv.hashCode64(r4)
            int r4 = java.util.Arrays.binarySearch(r0, r1)
            if (r4 >= 0) goto Le
            r4 = -1
            return r4
        Le:
            short[] r0 = r3.mapping
            short r4 = r0[r4]
            int r4 = r4 + 1
            return r4
    }

    public int getOrdinalByHashCode(long r2) {
            r1 = this;
            long[] r0 = r1.hashCodes
            int r2 = java.util.Arrays.binarySearch(r0, r2)
            if (r2 >= 0) goto La
            r2 = -1
            return r2
        La:
            short[] r3 = r1.mapping
            short r2 = r3[r2]
            int r2 = r2 + 1
            return r2
    }

    public long hashCode64() {
            r2 = this;
            long r0 = r2.hashCode64
            return r0
    }

    public int size() {
            r1 = this;
            java.lang.String[] r0 = r1.names
            int r0 = r0.length
            return r0
    }
}
