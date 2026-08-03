package com.alibaba.fastjson2.internal.trove.map.hash;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class TLongIntHashMap {
    static final int largestPrime = 0;
    static final int[] primeCapacities = null;
    protected boolean consumeFreeSlot;
    protected int free;
    protected int maxSize;
    protected long[] set;
    protected int size;
    protected int[] values;

    static {
            r0 = 244(0xf4, float:3.42E-43)
            int[] r0 = new int[r0]
            r0 = {x0014: FILL_ARRAY_DATA , data: [5, 11, 23, 47, 97, 197, 397, 797, 1597, 3203, 6421, 12853, 25717, 51437, 102877, 205759, 411527, 823117, 1646237, 3292489, 6584983, 13169977, 26339969, 52679969, 105359939, 210719881, 421439783, 842879579, 1685759167, 433, 877, 1759, 3527, 7057, 14143, 28289, 56591, 113189, 226379, 452759, 905551, 1811107, 3622219, 7244441, 14488931, 28977863, 57955739, 115911563, 231823147, 463646329, 927292699, 1854585413, 953, 1907, 3821, 7643, 15287, 30577, 61169, 122347, 244703, 489407, 978821, 1957651, 3915341, 7830701, 15661423, 31322867, 62645741, 125291483, 250582987, 501165979, 1002331963, 2004663929, 1039, 2081, 4177, 8363, 16729, 33461, 66923, 133853, 267713, 535481, 1070981, 2141977, 4283963, 8567929, 17135863, 34271747, 68543509, 137087021, 274174111, 548348231, 1096696463, 31, 67, 137, 277, 557, 1117, 2237, 4481, 8963, 17929, 35863, 71741, 143483, 286973, 573953, 1147921, 2295859, 4591721, 9183457, 18366923, 36733847, 73467739, 146935499, 293871013, 587742049, 1175484103, 599, 1201, 2411, 4831, 9677, 19373, 38747, 77509, 155027, 310081, 620171, 1240361, 2480729, 4961459, 9922933, 19845871, 39691759, 79383533, 158767069, 317534141, 635068283, 1270136683, 311, 631, 1277, 2557, 5119, 10243, 20507, 41017, 82037, 164089, 328213, 656429, 1312867, 2625761, 5251529, 10503061, 21006137, 42012281, 84024581, 168049163, 336098327, 672196673, 1344393353, 3, 7, 17, 37, 79, 163, 331, 673, 1361, 2729, 5471, 10949, 21911, 43853, 87719, 175447, 350899, 701819, 1403641, 2807303, 5614657, 11229331, 22458671, 44917381, 89834777, 179669557, 359339171, 718678369, 1437356741, 43, 89, 179, 359, 719, 1439, 2879, 5779, 11579, 23159, 46327, 92657, 185323, 370661, 741337, 1482707, 2965421, 5930887, 11861791, 23723597, 47447201, 94894427, 189788857, 379577741, 759155483, 1518310967, 379, 761, 1523, 3049, 6101, 12203, 24407, 48817, 97649, 195311, 390647, 781301, 1562611, 3125257, 6250537, 12501169, 25002389, 50004791, 100009607, 200019221, 400038451, 800076929, 1600153859} // fill-array
            com.alibaba.fastjson2.internal.trove.map.hash.TLongIntHashMap.primeCapacities = r0
            java.util.Arrays.sort(r0)
            int r1 = r0.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            com.alibaba.fastjson2.internal.trove.map.hash.TLongIntHashMap.largestPrime = r0
            return
    }

    public TLongIntHashMap() {
            r2 = this;
            r2.<init>()
            r0 = 18
            r2.maxSize = r0
            r0 = 37
            r2.free = r0
            long[] r1 = new long[r0]
            r2.set = r1
            int[] r0 = new int[r0]
            r2.values = r0
            return
    }

    public TLongIntHashMap(long r6, int r8) {
            r5 = this;
            r5.<init>()
            r0 = 18
            r5.maxSize = r0
            r0 = 37
            long[] r1 = new long[r0]
            r5.set = r1
            int[] r0 = new int[r0]
            r5.values = r0
            r2 = 1
            r5.consumeFreeSlot = r2
            r3 = 32
            long r3 = r6 >>> r3
            long r3 = r3 ^ r6
            int r3 = (int) r3
            r4 = 2147483647(0x7fffffff, float:NaN)
            r3 = r3 & r4
            int r4 = r1.length
            int r3 = r3 % r4
            r1[r3] = r6
            r0[r3] = r8
            r6 = 36
            r5.free = r6
            r5.size = r2
            return
    }

    public static int nextPrime(int r1) {
            int r0 = com.alibaba.fastjson2.internal.trove.map.hash.TLongIntHashMap.largestPrime
            if (r1 < r0) goto L5
            return r0
        L5:
            int[] r0 = com.alibaba.fastjson2.internal.trove.map.hash.TLongIntHashMap.primeCapacities
            int r1 = java.util.Arrays.binarySearch(r0, r1)
            if (r1 >= 0) goto L10
            int r1 = -r1
            int r1 = r1 + (-1)
        L10:
            r1 = r0[r1]
            return r1
    }

    private void rehash(int r8) {
            r7 = this;
            int r0 = r7.size
            int r1 = r7.maxSize
            if (r0 <= r1) goto Lc
            int r8 = r8 << 1
            int r8 = nextPrime(r8)
        Lc:
            long[] r0 = r7.set
            int r1 = r0.length
            int[] r2 = r7.values
            long[] r3 = new long[r8]
            r7.set = r3
            int[] r8 = new int[r8]
            r7.values = r8
        L19:
            int r8 = r1 + (-1)
            if (r1 <= 0) goto L31
            r3 = r0[r8]
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L2f
            int[] r1 = r7.values
            int r3 = r7.insertKey(r3)
            r4 = r2[r8]
            r1[r3] = r4
        L2f:
            r1 = r8
            goto L19
        L31:
            return
    }

    public int get(long r12) {
            r11 = this;
            long[] r0 = r11.set
            int r1 = r0.length
            r2 = 32
            long r2 = r12 >>> r2
            long r2 = r2 ^ r12
            int r2 = (int) r2
            r3 = 2147483647(0x7fffffff, float:NaN)
            r2 = r2 & r3
            int r1 = r2 % r1
            r3 = r0[r1]
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r8 = -1
            if (r7 != 0) goto L19
            return r8
        L19:
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 != 0) goto L22
            int[] r12 = r11.values
            r12 = r12[r1]
            return r12
        L22:
            int r0 = r0.length
            int r3 = r0 + (-2)
            int r2 = r2 % r3
            int r2 = r2 + 1
            r3 = r1
        L29:
            int r3 = r3 - r2
            if (r3 >= 0) goto L2d
            int r3 = r3 + r0
        L2d:
            long[] r4 = r11.set
            r9 = r4[r3]
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r4 != 0) goto L36
            return r8
        L36:
            int r4 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r4 != 0) goto L3f
            int[] r12 = r11.values
            r12 = r12[r3]
            return r12
        L3f:
            if (r3 != r1) goto L29
            return r8
    }

    public int insertKey(long r12) {
            r11 = this;
            r0 = 32
            long r0 = r12 >>> r0
            long r0 = r0 ^ r12
            int r0 = (int) r0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            long[] r1 = r11.set
            int r2 = r1.length
            int r2 = r0 % r2
            r3 = r1[r2]
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r8 = 0
            r9 = 1
            if (r7 == 0) goto L1b
            r7 = r9
            goto L1c
        L1b:
            r7 = r8
        L1c:
            r11.consumeFreeSlot = r8
            if (r7 != 0) goto L25
            r11.consumeFreeSlot = r9
            r1[r2] = r12
            return r2
        L25:
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 != 0) goto L2c
            int r12 = -r2
            int r12 = r12 - r9
            return r12
        L2c:
            int r1 = r1.length
            int r3 = r1 + (-2)
            int r0 = r0 % r3
            int r0 = r0 + r9
            r3 = r2
        L32:
            int r3 = r3 - r0
            if (r3 >= 0) goto L36
            int r3 = r3 + r1
        L36:
            long[] r4 = r11.set
            r7 = r4[r3]
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 == 0) goto L4f
            int r4 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r4 != 0) goto L45
            int r12 = -r3
            int r12 = r12 - r9
            return r12
        L45:
            if (r3 == r2) goto L48
            goto L32
        L48:
            java.lang.String r12 = "No free or removed slots available. Key set full?!!"
            j8.o.A(r12)
            r12 = 0
            return r12
        L4f:
            r11.consumeFreeSlot = r9
            r4[r3] = r12
            return r3
    }

    public void put(long r13, int r15) {
            r12 = this;
            r0 = 32
            long r0 = r13 >>> r0
            long r0 = r0 ^ r13
            int r0 = (int) r0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            long[] r1 = r12.set
            int r2 = r1.length
            int r2 = r0 % r2
            r3 = r1[r2]
            r5 = 0
            r12.consumeFreeSlot = r5
            r6 = 0
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            r9 = 1
            if (r8 != 0) goto L20
            r12.consumeFreeSlot = r9
            r1[r2] = r13
            goto L48
        L20:
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 != 0) goto L28
            int r13 = -r2
        L25:
            int r2 = r13 + (-1)
            goto L48
        L28:
            int r1 = r1.length
            int r3 = r1 + (-2)
            int r0 = r0 % r3
            int r0 = r0 + r9
            r3 = r2
        L2e:
            int r3 = r3 - r0
            if (r3 >= 0) goto L32
            int r3 = r3 + r1
        L32:
            long[] r4 = r12.set
            r10 = r4[r3]
            int r8 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r8 != 0) goto L3f
            r12.consumeFreeSlot = r9
            r4[r3] = r13
            goto L47
        L3f:
            int r4 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r4 != 0) goto L45
            int r13 = -r3
            goto L25
        L45:
            if (r3 != r2) goto L2e
        L47:
            r2 = r3
        L48:
            if (r2 >= 0) goto L4e
            int r13 = -r2
            int r2 = r13 + (-1)
            goto L4f
        L4e:
            r5 = r9
        L4f:
            int[] r13 = r12.values
            r13[r2] = r15
            if (r5 == 0) goto Lae
            boolean r13 = r12.consumeFreeSlot
            if (r13 == 0) goto L5e
            int r13 = r12.free
            int r13 = r13 - r9
            r12.free = r13
        L5e:
            int r13 = r12.size
            int r13 = r13 + r9
            r12.size = r13
            int r14 = r12.maxSize
            if (r13 > r14) goto L6b
            int r15 = r12.free
            if (r15 != 0) goto Lae
        L6b:
            long[] r15 = r12.set
            int r15 = r15.length
            if (r13 <= r14) goto L76
            int r13 = r15 << 1
            int r15 = nextPrime(r13)
        L76:
            long[] r13 = r12.set
            int r14 = r13.length
            int[] r0 = r12.values
            long[] r1 = new long[r15]
            r12.set = r1
            int[] r15 = new int[r15]
            r12.values = r15
        L83:
            int r15 = r14 + (-1)
            if (r14 <= 0) goto L99
            r1 = r13[r15]
            int r14 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r14 == 0) goto L97
            int r14 = r12.insertKey(r1)
            int[] r1 = r12.values
            r2 = r0[r15]
            r1[r14] = r2
        L97:
            r14 = r15
            goto L83
        L99:
            long[] r13 = r12.set
            int r13 = r13.length
            int r14 = r13 + (-1)
            float r15 = (float) r13
            r0 = 1056964608(0x3f000000, float:0.5)
            float r15 = r15 * r0
            int r15 = (int) r15
            int r14 = java.lang.Math.min(r14, r15)
            r12.maxSize = r14
            int r14 = r12.size
            int r13 = r13 - r14
            r12.free = r13
        Lae:
            return
    }

    public int putIfAbsent(long r12, int r14) {
            r11 = this;
            r0 = 32
            long r0 = r12 >>> r0
            long r0 = r0 ^ r12
            int r0 = (int) r0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            long[] r1 = r11.set
            int r2 = r1.length
            int r2 = r0 % r2
            r3 = r1[r2]
            r5 = 0
            r11.consumeFreeSlot = r5
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r8 = 1
            if (r7 != 0) goto L20
            r11.consumeFreeSlot = r8
            r1[r2] = r12
            goto L4a
        L20:
            int r1 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r1 != 0) goto L28
            int r12 = -r2
        L25:
            int r2 = r12 + (-1)
            goto L4a
        L28:
            r1 = r2
        L29:
            long[] r3 = r11.set
            int r4 = r3.length
            int r4 = r4 + (-2)
            int r4 = r0 % r4
            int r4 = r4 + r8
            int r1 = r1 - r4
            if (r1 >= 0) goto L36
            int r4 = r3.length
            int r1 = r1 + r4
        L36:
            r9 = r3[r1]
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r4 != 0) goto L41
            r11.consumeFreeSlot = r8
            r3[r1] = r12
            goto L49
        L41:
            int r3 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r3 != 0) goto L47
            int r12 = -r1
            goto L25
        L47:
            if (r1 != r2) goto L29
        L49:
            r2 = r1
        L4a:
            int[] r12 = r11.values
            if (r2 >= 0) goto L53
            int r13 = -r2
            int r13 = r13 - r8
            r12 = r12[r13]
            return r12
        L53:
            r12[r2] = r14
            boolean r12 = r11.consumeFreeSlot
            if (r12 == 0) goto L5e
            int r12 = r11.free
            int r12 = r12 - r8
            r11.free = r12
        L5e:
            int r12 = r11.size
            int r12 = r12 + r8
            r11.size = r12
            int r13 = r11.maxSize
            if (r12 > r13) goto L6d
            int r12 = r11.free
            if (r12 != 0) goto L6c
            goto L6d
        L6c:
            return r14
        L6d:
            long[] r12 = r11.set
            int r12 = r12.length
            r11.rehash(r12)
            long[] r12 = r11.set
            int r12 = r12.length
            int r13 = r12 + (-1)
            float r0 = (float) r12
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            int r0 = (int) r0
            int r13 = java.lang.Math.min(r13, r0)
            r11.maxSize = r13
            int r13 = r11.size
            int r12 = r12 - r13
            r11.free = r12
            return r14
    }

    public java.lang.String toString() {
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "{"
            r0.<init>(r1)
            long[] r1 = r10.set
            int[] r2 = r10.values
            int r3 = r1.length
            r4 = 1
        Ld:
            int r5 = r3 + (-1)
            if (r3 <= 0) goto L31
            r6 = r1[r5]
            r8 = 0
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 == 0) goto L2f
            r3 = r2[r5]
            if (r4 == 0) goto L1f
            r4 = 0
            goto L24
        L1f:
            java.lang.String r8 = ", "
            r0.append(r8)
        L24:
            r0.append(r6)
            r6 = 61
            r0.append(r6)
            r0.append(r3)
        L2f:
            r3 = r5
            goto Ld
        L31:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
