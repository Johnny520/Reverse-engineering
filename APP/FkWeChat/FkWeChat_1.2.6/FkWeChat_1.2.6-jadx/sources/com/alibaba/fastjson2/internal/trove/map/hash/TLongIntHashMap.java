package com.alibaba.fastjson2.internal.trove.map.hash;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.Arrays;
import java.util.function.BiFunction;
import p376zd.C10010p0;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class TLongIntHashMap {
    static final int largestPrime;
    static final int[] primeCapacities;
    private boolean consumeFreeSlot;
    private int free;
    private int maxSize;
    private long[] set;
    private int size;
    private int[] values;

    static {
        int[] iArr = {5, 11, 23, 47, 97, 197, 397, 797, 1597, 3203, 6421, 12853, 25717, 51437, 102877, 205759, 411527, 823117, 1646237, 3292489, 6584983, 13169977, 26339969, 52679969, 105359939, 210719881, 421439783, 842879579, 1685759167, 433, 877, 1759, 3527, 7057, 14143, 28289, 56591, 113189, 226379, 452759, 905551, 1811107, 3622219, 7244441, 14488931, 28977863, 57955739, 115911563, 231823147, 463646329, 927292699, 1854585413, 953, 1907, 3821, 7643, 15287, 30577, 61169, 122347, 244703, 489407, 978821, 1957651, 3915341, 7830701, 15661423, 31322867, 62645741, 125291483, 250582987, 501165979, 1002331963, 2004663929, 1039, 2081, 4177, 8363, 16729, 33461, 66923, 133853, 267713, 535481, 1070981, 2141977, 4283963, 8567929, 17135863, 34271747, 68543509, 137087021, 274174111, 548348231, 1096696463, 31, 67, 137, 277, 557, 1117, 2237, 4481, 8963, 17929, 35863, 71741, 143483, 286973, 573953, 1147921, 2295859, 4591721, 9183457, 18366923, 36733847, 73467739, 146935499, 293871013, 587742049, 1175484103, 599, 1201, 2411, 4831, 9677, 19373, 38747, 77509, 155027, 310081, 620171, 1240361, 2480729, 4961459, 9922933, 19845871, 39691759, 79383533, 158767069, 317534141, 635068283, 1270136683, 311, 631, 1277, 2557, 5119, 10243, 20507, 41017, 82037, 164089, 328213, 656429, 1312867, 2625761, 5251529, 10503061, 21006137, 42012281, 84024581, 168049163, 336098327, 672196673, 1344393353, 3, 7, 17, 37, 79, Opcodes.IF_ICMPGT, 331, 673, 1361, 2729, 5471, 10949, 21911, 43853, 87719, 175447, 350899, 701819, 1403641, 2807303, 5614657, 11229331, 22458671, 44917381, 89834777, 179669557, 359339171, 718678369, 1437356741, 43, 89, Opcodes.PUTSTATIC, 359, 719, 1439, 2879, 5779, 11579, 23159, 46327, 92657, 185323, 370661, 741337, 1482707, 2965421, 5930887, 11861791, 23723597, 47447201, 94894427, 189788857, 379577741, 759155483, 1518310967, 379, 761, 1523, 3049, 6101, 12203, 24407, 48817, 97649, 195311, 390647, 781301, 1562611, 3125257, 6250537, 12501169, 25002389, 50004791, 100009607, 200019221, 400038451, 800076929, 1600153859};
        primeCapacities = iArr;
        Arrays.sort(iArr);
        largestPrime = iArr[iArr.length - 1];
    }

    public TLongIntHashMap(long j10, int i10) {
        this.maxSize = 18;
        long[] jArr = new long[37];
        this.set = jArr;
        int[] iArr = new int[37];
        this.values = iArr;
        this.consumeFreeSlot = true;
        int length = (((int) ((j10 >>> 32) ^ j10)) & Integer.MAX_VALUE) % jArr.length;
        jArr[length] = j10;
        iArr[length] = i10;
        this.free = 36;
        this.size = 1;
    }

    private int insertKey(long j10) {
        int i10 = ((int) ((j10 >>> 32) ^ j10)) & Integer.MAX_VALUE;
        long[] jArr = this.set;
        int length = i10 % jArr.length;
        long j11 = jArr[length];
        boolean z10 = j11 != 0;
        this.consumeFreeSlot = false;
        if (!z10) {
            this.consumeFreeSlot = true;
            jArr[length] = j10;
            return length;
        }
        if (j11 == j10) {
            return (-length) - 1;
        }
        int length2 = jArr.length;
        int i11 = (i10 % (length2 - 2)) + 1;
        int i12 = length;
        do {
            i12 -= i11;
            if (i12 < 0) {
                i12 += length2;
            }
            long[] jArr2 = this.set;
            long j12 = jArr2[i12];
            if (j12 == 0) {
                this.consumeFreeSlot = true;
                jArr2[i12] = j10;
                return i12;
            }
            if (j12 == j10) {
                return (-i12) - 1;
            }
        } while (i12 != length);
        C10010p0.m38820a("No free or removed slots available. Key set full?!!");
        return 0;
    }

    public static int nextPrime(int i10) {
        int i11 = largestPrime;
        if (i10 >= i11) {
            return i11;
        }
        int[] iArr = primeCapacities;
        int iBinarySearch = Arrays.binarySearch(iArr, i10);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        return iArr[iBinarySearch];
    }

    private void rehash(int i10) {
        if (this.size > this.maxSize) {
            i10 = nextPrime(i10 << 1);
        }
        long[] jArr = this.set;
        int length = jArr.length;
        int[] iArr = this.values;
        this.set = new long[i10];
        this.values = new int[i10];
        while (true) {
            int i11 = length - 1;
            if (length <= 0) {
                return;
            }
            long j10 = jArr[i11];
            if (j10 != 0) {
                this.values[insertKey(j10)] = iArr[i11];
            }
            length = i11;
        }
    }

    public boolean forEachEntry(BiFunction<Long, Integer, Boolean> biFunction) {
        long[] jArr = this.set;
        int[] iArr = this.values;
        int length = jArr.length;
        while (true) {
            int i10 = length - 1;
            if (length <= 0) {
                return true;
            }
            if (this.set[i10] != 0 && !biFunction.apply(Long.valueOf(jArr[i10]), Integer.valueOf(iArr[i10])).booleanValue()) {
                return false;
            }
            length = i10;
        }
    }

    public int get(long j10) {
        long[] jArr = this.set;
        int i10 = ((int) ((j10 >>> 32) ^ j10)) & Integer.MAX_VALUE;
        int length = i10 % jArr.length;
        long j11 = jArr[length];
        if (j11 == 0) {
            return -1;
        }
        if (j11 == j10) {
            return this.values[length];
        }
        int length2 = jArr.length;
        int i11 = (i10 % (length2 - 2)) + 1;
        int i12 = length;
        do {
            i12 -= i11;
            if (i12 < 0) {
                i12 += length2;
            }
            long j12 = this.set[i12];
            if (j12 == 0) {
                return -1;
            }
            if (j10 == j12) {
                return this.values[i12];
            }
        } while (i12 != length);
        return -1;
    }

    public void put(long j10, int i10) {
        int i11;
        int i12 = ((int) ((j10 >>> 32) ^ j10)) & Integer.MAX_VALUE;
        long[] jArr = this.set;
        int length = i12 % jArr.length;
        long j11 = jArr[length];
        boolean z10 = false;
        this.consumeFreeSlot = false;
        if (j11 == 0) {
            this.consumeFreeSlot = true;
            jArr[length] = j10;
        } else {
            if (j11 == j10) {
                i11 = -length;
            } else {
                int length2 = jArr.length;
                int i13 = (i12 % (length2 - 2)) + 1;
                int i14 = length;
                while (true) {
                    i14 -= i13;
                    if (i14 < 0) {
                        i14 += length2;
                    }
                    long[] jArr2 = this.set;
                    long j12 = jArr2[i14];
                    if (j12 == 0) {
                        this.consumeFreeSlot = true;
                        jArr2[i14] = j10;
                        break;
                    } else if (j12 == j10) {
                        i11 = -i14;
                        break;
                    } else if (i14 == length) {
                        break;
                    }
                }
                length = i14;
            }
            length = i11 - 1;
        }
        if (length < 0) {
            length = (-length) - 1;
        } else {
            z10 = true;
        }
        this.values[length] = i10;
        if (!z10) {
            return;
        }
        if (this.consumeFreeSlot) {
            this.free--;
        }
        int i15 = this.size + 1;
        this.size = i15;
        int i16 = this.maxSize;
        if (i15 <= i16 && this.free != 0) {
            return;
        }
        int length3 = this.set.length;
        if (i15 > i16) {
            length3 = nextPrime(length3 << 1);
        }
        long[] jArr3 = this.set;
        int length4 = jArr3.length;
        int[] iArr = this.values;
        this.set = new long[length3];
        this.values = new int[length3];
        while (true) {
            int i17 = length4 - 1;
            if (length4 <= 0) {
                int length5 = this.set.length;
                this.maxSize = Math.min(length5 - 1, (int) (length5 * 0.5f));
                this.free = length5 - this.size;
                return;
            } else {
                long j13 = jArr3[i17];
                if (j13 != 0) {
                    this.values[insertKey(j13)] = iArr[i17];
                }
                length4 = i17;
            }
        }
    }

    public int putIfAbsent(long j10, int i10) {
        int i11;
        int i12 = ((int) ((j10 >>> 32) ^ j10)) & Integer.MAX_VALUE;
        long[] jArr = this.set;
        int length = i12 % jArr.length;
        long j11 = jArr[length];
        this.consumeFreeSlot = false;
        if (j11 == 0) {
            this.consumeFreeSlot = true;
            jArr[length] = j10;
        } else {
            if (j11 == j10) {
                i11 = -length;
            } else {
                int length2 = length;
                while (true) {
                    long[] jArr2 = this.set;
                    length2 -= (i12 % (jArr2.length - 2)) + 1;
                    if (length2 < 0) {
                        length2 += jArr2.length;
                    }
                    long j12 = jArr2[length2];
                    if (j12 == 0) {
                        this.consumeFreeSlot = true;
                        jArr2[length2] = j10;
                        break;
                    }
                    if (j12 == j10) {
                        i11 = -length2;
                        break;
                    }
                    if (length2 == length) {
                        break;
                    }
                }
                length = length2;
            }
            length = i11 - 1;
        }
        int[] iArr = this.values;
        if (length < 0) {
            return iArr[(-length) - 1];
        }
        iArr[length] = i10;
        if (this.consumeFreeSlot) {
            this.free--;
        }
        int i13 = this.size + 1;
        this.size = i13;
        if (i13 <= this.maxSize && this.free != 0) {
            return i10;
        }
        rehash(this.set.length);
        int length3 = this.set.length;
        this.maxSize = Math.min(length3 - 1, (int) (length3 * 0.5f));
        this.free = length3 - this.size;
        return i10;
    }

    public int size() {
        return this.size;
    }

    public String toString() {
        final StringBuilder sb2 = new StringBuilder("{");
        forEachEntry(new BiFunction<Long, Integer, Boolean>(this) { // from class: com.alibaba.fastjson2.internal.trove.map.hash.TLongIntHashMap.1
            private boolean first = true;
            final /* synthetic */ TLongIntHashMap this$0;

            {
                this.this$0 = this;
            }

            @Override // java.util.function.BiFunction
            public Boolean apply(Long l10, Integer num) {
                if (this.first) {
                    this.first = false;
                } else {
                    sb2.append(", ");
                }
                sb2.append(l10);
                sb2.append("=");
                sb2.append(num);
                return Boolean.TRUE;
            }
        });
        sb2.append("}");
        return sb2.toString();
    }

    public TLongIntHashMap() {
        this.maxSize = 18;
        this.free = 37;
        this.set = new long[37];
        this.values = new int[37];
    }
}
