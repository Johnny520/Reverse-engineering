package com.alibaba.fastjson2.internal.trove.map.hash;

import bsh.org.objectweb.asm.Opcodes;
import java.util.Arrays;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class TLongIntHashMap {
    static final int largestPrime;
    static final int[] primeCapacities;
    protected boolean consumeFreeSlot;
    protected int free;
    protected int maxSize;
    protected long[] set;
    protected int size;
    protected int[] values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int[] iArr = {5, 11, 23, 47, 97, Opcodes.MULTIANEWARRAY, 397, 797, 1597, 3203, 6421, 12853, 25717, 51437, 102877, 205759, 411527, 823117, 1646237, 3292489, 6584983, 13169977, 26339969, 52679969, 105359939, 210719881, 421439783, 842879579, 1685759167, 433, 877, 1759, 3527, 7057, 14143, 28289, 56591, 113189, 226379, 452759, 905551, 1811107, 3622219, 7244441, 14488931, 28977863, 57955739, 115911563, 231823147, 463646329, 927292699, 1854585413, 953, 1907, 3821, 7643, 15287, 30577, 61169, 122347, 244703, 489407, 978821, 1957651, 3915341, 7830701, 15661423, 31322867, 62645741, 125291483, 250582987, 501165979, 1002331963, 2004663929, 1039, 2081, 4177, 8363, 16729, 33461, 66923, 133853, 267713, 535481, 1070981, 2141977, 4283963, 8567929, 17135863, 34271747, 68543509, 137087021, 274174111, 548348231, 1096696463, 31, 67, 137, 277, 557, 1117, 2237, 4481, 8963, 17929, 35863, 71741, 143483, 286973, 573953, 1147921, 2295859, 4591721, 9183457, 18366923, 36733847, 73467739, 146935499, 293871013, 587742049, 1175484103, 599, 1201, 2411, 4831, 9677, 19373, 38747, 77509, 155027, 310081, 620171, 1240361, 2480729, 4961459, 9922933, 19845871, 39691759, 79383533, 158767069, 317534141, 635068283, 1270136683, 311, 631, 1277, 2557, 5119, 10243, 20507, 41017, 82037, 164089, 328213, 656429, 1312867, 2625761, 5251529, 10503061, 21006137, 42012281, 84024581, 168049163, 336098327, 672196673, 1344393353, 3, 7, 17, 37, 79, Opcodes.IF_ICMPGT, 331, 673, 1361, 2729, 5471, 10949, 21911, 43853, 87719, 175447, 350899, 701819, 1403641, 2807303, 5614657, 11229331, 22458671, 44917381, 89834777, 179669557, 359339171, 718678369, 1437356741, 43, 89, Opcodes.PUTSTATIC, 359, 719, 1439, 2879, 5779, 11579, 23159, 46327, 92657, 185323, 370661, 741337, 1482707, 2965421, 5930887, 11861791, 23723597, 47447201, 94894427, 189788857, 379577741, 759155483, 1518310967, 379, 761, 1523, 3049, 6101, 12203, 24407, 48817, 97649, 195311, 390647, 781301, 1562611, 3125257, 6250537, 12501169, 25002389, 50004791, 100009607, 200019221, 400038451, 800076929, 1600153859};
        primeCapacities = iArr;
        Arrays.sort(iArr);
        largestPrime = iArr[iArr.length - 1];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TLongIntHashMap(long j3, int i9) {
        this.maxSize = 18;
        long[] jArr = new long[37];
        this.set = jArr;
        int[] iArr = new int[37];
        this.values = iArr;
        this.consumeFreeSlot = true;
        int length = (((int) ((j3 >>> 32) ^ j3)) & Integer.MAX_VALUE) % jArr.length;
        jArr[length] = j3;
        iArr[length] = i9;
        this.free = 36;
        this.size = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int nextPrime(int i9) {
        int i10 = largestPrime;
        if (i9 >= i10) {
            return i10;
        }
        int[] iArr = primeCapacities;
        int iBinarySearch = Arrays.binarySearch(iArr, i9);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        return iArr[iBinarySearch];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void rehash(int i9) {
        if (this.size > this.maxSize) {
            i9 = nextPrime(i9 << 1);
        }
        long[] jArr = this.set;
        int length = jArr.length;
        int[] iArr = this.values;
        this.set = new long[i9];
        this.values = new int[i9];
        while (true) {
            int i10 = length - 1;
            if (length <= 0) {
                return;
            }
            long j3 = jArr[i10];
            if (j3 != 0) {
                this.values[insertKey(j3)] = iArr[i10];
            }
            length = i10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int get(long j3) {
        long[] jArr = this.set;
        int i9 = ((int) ((j3 >>> 32) ^ j3)) & Integer.MAX_VALUE;
        int length = i9 % jArr.length;
        long j4 = jArr[length];
        if (j4 == 0) {
            return -1;
        }
        if (j4 == j3) {
            return this.values[length];
        }
        int length2 = jArr.length;
        int i10 = (i9 % (length2 - 2)) + 1;
        int i11 = length;
        do {
            i11 -= i10;
            if (i11 < 0) {
                i11 += length2;
            }
            long j5 = this.set[i11];
            if (j5 == 0) {
                return -1;
            }
            if (j3 == j5) {
                return this.values[i11];
            }
        } while (i11 != length);
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int insertKey(long j3) {
        int i9 = ((int) ((j3 >>> 32) ^ j3)) & Integer.MAX_VALUE;
        long[] jArr = this.set;
        int length = i9 % jArr.length;
        long j4 = jArr[length];
        boolean z9 = j4 != 0;
        this.consumeFreeSlot = false;
        if (!z9) {
            this.consumeFreeSlot = true;
            jArr[length] = j3;
            return length;
        }
        if (j4 == j3) {
            return (-length) - 1;
        }
        int length2 = jArr.length;
        int i10 = (i9 % (length2 - 2)) + 1;
        int i11 = length;
        do {
            i11 -= i10;
            if (i11 < 0) {
                i11 += length2;
            }
            long[] jArr2 = this.set;
            long j5 = jArr2[i11];
            if (j5 == 0) {
                this.consumeFreeSlot = true;
                jArr2[i11] = j3;
                return i11;
            }
            if (j5 == j3) {
                return (-i11) - 1;
            }
        } while (i11 != length);
        C2104o.m5276A("No free or removed slots available. Key set full?!!");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void put(long j3, int i9) {
        int i10;
        int i11 = ((int) ((j3 >>> 32) ^ j3)) & Integer.MAX_VALUE;
        long[] jArr = this.set;
        int length = i11 % jArr.length;
        long j4 = jArr[length];
        boolean z9 = false;
        this.consumeFreeSlot = false;
        if (j4 == 0) {
            this.consumeFreeSlot = true;
            jArr[length] = j3;
        } else {
            if (j4 == j3) {
                i10 = -length;
            } else {
                int length2 = jArr.length;
                int i12 = (i11 % (length2 - 2)) + 1;
                int i13 = length;
                while (true) {
                    i13 -= i12;
                    if (i13 < 0) {
                        i13 += length2;
                    }
                    long[] jArr2 = this.set;
                    long j5 = jArr2[i13];
                    if (j5 == 0) {
                        this.consumeFreeSlot = true;
                        jArr2[i13] = j3;
                        break;
                    } else if (j5 == j3) {
                        i10 = -i13;
                        break;
                    } else if (i13 == length) {
                        break;
                    }
                }
                length = i13;
            }
            length = i10 - 1;
        }
        if (length < 0) {
            length = (-length) - 1;
        } else {
            z9 = true;
        }
        this.values[length] = i9;
        if (!z9) {
            return;
        }
        if (this.consumeFreeSlot) {
            this.free--;
        }
        int i14 = this.size + 1;
        this.size = i14;
        int i15 = this.maxSize;
        if (i14 <= i15 && this.free != 0) {
            return;
        }
        int length3 = this.set.length;
        if (i14 > i15) {
            length3 = nextPrime(length3 << 1);
        }
        long[] jArr3 = this.set;
        int length4 = jArr3.length;
        int[] iArr = this.values;
        this.set = new long[length3];
        this.values = new int[length3];
        while (true) {
            int i16 = length4 - 1;
            if (length4 <= 0) {
                int length5 = this.set.length;
                this.maxSize = Math.min(length5 - 1, (int) (length5 * 0.5f));
                this.free = length5 - this.size;
                return;
            } else {
                long j10 = jArr3[i16];
                if (j10 != 0) {
                    this.values[insertKey(j10)] = iArr[i16];
                }
                length4 = i16;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int putIfAbsent(long j3, int i9) {
        int i10;
        int i11 = ((int) ((j3 >>> 32) ^ j3)) & Integer.MAX_VALUE;
        long[] jArr = this.set;
        int length = i11 % jArr.length;
        long j4 = jArr[length];
        this.consumeFreeSlot = false;
        if (j4 == 0) {
            this.consumeFreeSlot = true;
            jArr[length] = j3;
        } else {
            if (j4 == j3) {
                i10 = -length;
            } else {
                int length2 = length;
                while (true) {
                    long[] jArr2 = this.set;
                    length2 -= (i11 % (jArr2.length - 2)) + 1;
                    if (length2 < 0) {
                        length2 += jArr2.length;
                    }
                    long j5 = jArr2[length2];
                    if (j5 == 0) {
                        this.consumeFreeSlot = true;
                        jArr2[length2] = j3;
                        break;
                    }
                    if (j5 == j3) {
                        i10 = -length2;
                        break;
                    }
                    if (length2 == length) {
                        break;
                    }
                }
                length = length2;
            }
            length = i10 - 1;
        }
        int[] iArr = this.values;
        if (length < 0) {
            return iArr[(-length) - 1];
        }
        iArr[length] = i9;
        if (this.consumeFreeSlot) {
            this.free--;
        }
        int i12 = this.size + 1;
        this.size = i12;
        if (i12 <= this.maxSize && this.free != 0) {
            return i9;
        }
        rehash(this.set.length);
        int length3 = this.set.length;
        this.maxSize = Math.min(length3 - 1, (int) (length3 * 0.5f));
        this.free = length3 - this.size;
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        long[] jArr = this.set;
        int[] iArr = this.values;
        int length = jArr.length;
        boolean z9 = true;
        while (true) {
            int i9 = length - 1;
            if (length <= 0) {
                sb2.append('}');
                return sb2.toString();
            }
            long j3 = jArr[i9];
            if (j3 != 0) {
                int i10 = iArr[i9];
                if (z9) {
                    z9 = false;
                } else {
                    sb2.append(", ");
                }
                sb2.append(j3);
                sb2.append('=');
                sb2.append(i10);
            }
            length = i9;
        }
    }

    public TLongIntHashMap() {
        this.maxSize = 18;
        this.free = 37;
        this.set = new long[37];
        this.values = new int[37];
    }
}
