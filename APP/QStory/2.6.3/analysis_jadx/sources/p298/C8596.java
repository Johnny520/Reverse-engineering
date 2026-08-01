package p298;

import java.util.Arrays;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪子苏兰哲世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8596 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final int[] f24065;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final int f24066;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f24069;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f24070;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f24067 = 18;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f24068 = 37;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long[] f24071 = new long[37];

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int[] f24072 = new int[37];

    static {
        int[] iArr = {5, 11, 23, 47, 97, 197, 397, 797, 1597, 3203, 6421, 12853, 25717, 51437, 102877, 205759, 411527, 823117, 1646237, 3292489, 6584983, 13169977, 26339969, 52679969, 105359939, 210719881, 421439783, 842879579, 1685759167, 433, 877, 1759, 3527, 7057, 14143, 28289, 56591, 113189, 226379, 452759, 905551, 1811107, 3622219, 7244441, 14488931, 28977863, 57955739, 115911563, 231823147, 463646329, 927292699, 1854585413, 953, 1907, 3821, 7643, 15287, 30577, 61169, 122347, 244703, 489407, 978821, 1957651, 3915341, 7830701, 15661423, 31322867, 62645741, 125291483, 250582987, 501165979, 1002331963, 2004663929, 1039, 2081, 4177, 8363, 16729, 33461, 66923, 133853, 267713, 535481, 1070981, 2141977, 4283963, 8567929, 17135863, 34271747, 68543509, 137087021, 274174111, 548348231, 1096696463, 31, 67, 137, 277, 557, 1117, 2237, 4481, 8963, 17929, 35863, 71741, 143483, 286973, 573953, 1147921, 2295859, 4591721, 9183457, 18366923, 36733847, 73467739, 146935499, 293871013, 587742049, 1175484103, 599, 1201, 2411, 4831, 9677, 19373, 38747, 77509, 155027, 310081, 620171, 1240361, 2480729, 4961459, 9922933, 19845871, 39691759, 79383533, 158767069, 317534141, 635068283, 1270136683, 311, 631, 1277, 2557, 5119, 10243, 20507, 41017, 82037, 164089, 328213, 656429, 1312867, 2625761, 5251529, 10503061, 21006137, 42012281, 84024581, 168049163, 336098327, 672196673, 1344393353, 3, 7, 17, 37, 79, 163, 331, 673, 1361, 2729, 5471, 10949, 21911, 43853, 87719, 175447, 350899, 701819, 1403641, 2807303, 5614657, 11229331, 22458671, 44917381, 89834777, 179669557, 359339171, 718678369, 1437356741, 43, 89, 179, 359, 719, 1439, 2879, 5779, 11579, 23159, 46327, 92657, 185323, 370661, 741337, 1482707, 2965421, 5930887, 11861791, 23723597, 47447201, 94894427, 189788857, 379577741, 759155483, 1518310967, 379, 761, 1523, 3049, 6101, 12203, 24407, 48817, 97649, 195311, 390647, 781301, 1562611, 3125257, 6250537, 12501169, 25002389, 50004791, 100009607, 200019221, 400038451, 800076929, 1600153859};
        f24065 = iArr;
        Arrays.sort(iArr);
        f24066 = iArr[iArr.length - 1];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.f24071;
        int[] iArr = this.f24072;
        int length = jArr.length;
        boolean z = true;
        while (true) {
            int i = length - 1;
            if (length <= 0) {
                sb.append("}");
                return sb.toString();
            }
            if (this.f24071[i] != 0) {
                Long lValueOf = Long.valueOf(jArr[i]);
                Integer numValueOf = Integer.valueOf(iArr[i]);
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(lValueOf);
                sb.append("=");
                sb.append(numValueOf);
            }
            length = i;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m14231(int i, long j) {
        int i2;
        int i3 = ((int) ((j >>> 32) ^ j)) & Integer.MAX_VALUE;
        long[] jArr = this.f24071;
        int length = i3 % jArr.length;
        long j2 = jArr[length];
        this.f24070 = false;
        if (j2 == 0) {
            this.f24070 = true;
            jArr[length] = j;
        } else {
            if (j2 == j) {
                i2 = -length;
            } else {
                int length2 = length;
                while (true) {
                    long[] jArr2 = this.f24071;
                    length2 -= (i3 % (jArr2.length - 2)) + 1;
                    if (length2 < 0) {
                        length2 += jArr2.length;
                    }
                    long j3 = jArr2[length2];
                    if (j3 == 0) {
                        this.f24070 = true;
                        jArr2[length2] = j;
                        break;
                    }
                    if (j3 == j) {
                        i2 = -length2;
                        break;
                    }
                    if (length2 == length) {
                        break;
                    }
                }
                length = length2;
            }
            length = i2 - 1;
        }
        int[] iArr = this.f24072;
        if (length < 0) {
            return iArr[(-length) - 1];
        }
        iArr[length] = i;
        if (this.f24070) {
            this.f24068--;
        }
        int i4 = this.f24069 + 1;
        this.f24069 = i4;
        int i5 = this.f24067;
        if (i4 <= i5 && this.f24068 != 0) {
            return i;
        }
        int length3 = this.f24071.length;
        if (i4 > i5) {
            int i6 = length3 << 1;
            int i7 = f24066;
            if (i6 >= i7) {
                length3 = i7;
            } else {
                int[] iArr2 = f24065;
                int iBinarySearch = Arrays.binarySearch(iArr2, i6);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                length3 = iArr2[iBinarySearch];
            }
        }
        long[] jArr3 = this.f24071;
        int length4 = jArr3.length;
        int[] iArr3 = this.f24072;
        this.f24071 = new long[length3];
        this.f24072 = new int[length3];
        while (true) {
            int i8 = length4 - 1;
            if (length4 <= 0) {
                int length5 = this.f24071.length;
                this.f24067 = Math.min(length5 - 1, (int) (length5 * 0.5f));
                this.f24068 = length5 - this.f24069;
                return i;
            }
            long j4 = jArr3[i8];
            if (j4 != 0) {
                this.f24072[m14233(j4)] = iArr3[i8];
            }
            length4 = i8;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14232(int i, long j) {
        int i2;
        int i3 = ((int) ((j >>> 32) ^ j)) & Integer.MAX_VALUE;
        long[] jArr = this.f24071;
        int length = i3 % jArr.length;
        long j2 = jArr[length];
        boolean z = false;
        this.f24070 = false;
        if (j2 == 0) {
            this.f24070 = true;
            jArr[length] = j;
        } else {
            if (j2 == j) {
                i2 = -length;
            } else {
                int length2 = jArr.length;
                int i4 = (i3 % (length2 - 2)) + 1;
                int i5 = length;
                while (true) {
                    i5 -= i4;
                    if (i5 < 0) {
                        i5 += length2;
                    }
                    long[] jArr2 = this.f24071;
                    long j3 = jArr2[i5];
                    if (j3 == 0) {
                        this.f24070 = true;
                        jArr2[i5] = j;
                        break;
                    } else if (j3 == j) {
                        i2 = -i5;
                        break;
                    } else if (i5 == length) {
                        break;
                    }
                }
                length = i5;
            }
            length = i2 - 1;
        }
        if (length < 0) {
            length = (-length) - 1;
        } else {
            z = true;
        }
        this.f24072[length] = i;
        if (!z) {
            return;
        }
        if (this.f24070) {
            this.f24068--;
        }
        int i6 = this.f24069 + 1;
        this.f24069 = i6;
        int i7 = this.f24067;
        if (i6 <= i7 && this.f24068 != 0) {
            return;
        }
        int length3 = this.f24071.length;
        if (i6 > i7) {
            int i8 = length3 << 1;
            int i9 = f24066;
            if (i8 >= i9) {
                length3 = i9;
            } else {
                int[] iArr = f24065;
                int iBinarySearch = Arrays.binarySearch(iArr, i8);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                length3 = iArr[iBinarySearch];
            }
        }
        long[] jArr3 = this.f24071;
        int length4 = jArr3.length;
        int[] iArr2 = this.f24072;
        this.f24071 = new long[length3];
        this.f24072 = new int[length3];
        while (true) {
            int i10 = length4 - 1;
            if (length4 <= 0) {
                int length5 = this.f24071.length;
                this.f24067 = Math.min(length5 - 1, (int) (length5 * 0.5f));
                this.f24068 = length5 - this.f24069;
                return;
            } else {
                long j4 = jArr3[i10];
                if (j4 != 0) {
                    this.f24072[m14233(j4)] = iArr2[i10];
                }
                length4 = i10;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m14233(long j) {
        int i = ((int) ((j >>> 32) ^ j)) & Integer.MAX_VALUE;
        long[] jArr = this.f24071;
        int length = i % jArr.length;
        long j2 = jArr[length];
        boolean z = j2 != 0;
        this.f24070 = false;
        if (!z) {
            this.f24070 = true;
            jArr[length] = j;
            return length;
        }
        if (j2 == j) {
            return (-length) - 1;
        }
        int length2 = jArr.length;
        int i2 = (i % (length2 - 2)) + 1;
        int i3 = length;
        do {
            i3 -= i2;
            if (i3 < 0) {
                i3 += length2;
            }
            long[] jArr2 = this.f24071;
            long j3 = jArr2[i3];
            if (j3 == 0) {
                this.f24070 = true;
                jArr2[i3] = j;
                return i3;
            }
            if (j3 == j) {
                return (-i3) - 1;
            }
        } while (i3 != length);
        C5925.m11311("No free or removed slots available. Key set full?!!");
        return 0;
    }
}
