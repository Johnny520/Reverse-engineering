package androidx.compose.foundation.lazy.layout;

import androidx.activity.AbstractC0900;
import androidx.collection.AbstractC1132;
import androidx.collection.AbstractC1137;
import androidx.collection.C1082;
import androidx.collection.C1083;
import androidx.compose.foundation.lazy.C1590;
import androidx.compose.foundation.lazy.C1595;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.layout.AbstractC2559;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.AbstractC5168;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5179;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList f2352;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList f2353;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f2354;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1082 f2355;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C1519 f2356;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1083 f2357;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ArrayList f2358;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f2359;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC2962 f2360;

    public C1553() {
        long[] jArr = AbstractC1137.f1352;
        this.f2357 = new C1083();
        C1082 c1082 = AbstractC1132.f1342;
        this.f2355 = new C1082();
        this.f2354 = new ArrayList();
        this.f2353 = new ArrayList();
        this.f2352 = new ArrayList();
        this.f2359 = new ArrayList();
        this.f2358 = new ArrayList();
        this.f2360 = new C1558(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m2068(int[] iArr, C1590 c1590) {
        c1590.getClass();
        int i = iArr[0] + c1590.f2515;
        iArr[0] = i;
        return Math.max(0, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m2069(C1590 c1590, boolean z) {
        Object objM1317 = this.f2357.m1317(c1590.f2513);
        objM1317.getClass();
        AbstractC0900.m697(objM1317);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2070() {
        C1083 c1083 = this.f2357;
        if (c1083.m1321()) {
            Object[] objArr = c1083.f1224;
            long[] jArr = c1083.f1226;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                AbstractC0900.m697(objArr[(i << 3) + i3]);
                                throw null;
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            c1083.m1314();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a5  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2071(int i, int i2, ArrayList arrayList, C1519 c1519, C1595 c1595, boolean z, boolean z2, int i3, int i4) {
        Throwable th;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i5;
        int i6;
        C1082 c1082;
        C1519 c15192 = this.f2356;
        this.f2356 = c1519;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            C1590 c1590 = (C1590) arrayList.get(i7);
            int size2 = c1590.f2506.size();
            for (int i8 = 0; i8 < size2; i8++) {
                ((AbstractC2559) c1590.f2506.get(i8)).mo3616();
            }
        }
        C1083 c1083 = this.f2357;
        if (c1083.m1320()) {
            m2070();
            return;
        }
        boolean z3 = z || !z2;
        Object[] objArr = c1083.f1225;
        long[] jArr = c1083.f1226;
        int length = jArr.length - 2;
        C1082 c10822 = this.f2355;
        boolean z4 = z3;
        if (length >= 0) {
            int i9 = 0;
            while (true) {
                long j = jArr[i9];
                C1082 c10823 = c10822;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    long j2 = j;
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j2 & 255) < 128) {
                            c1082 = c10823;
                            c1082.m1301(objArr[(i9 << 3) + i11]);
                        } else {
                            c1082 = c10823;
                        }
                        j2 >>= 8;
                        i11++;
                        c10823 = c1082;
                    }
                    c10822 = c10823;
                    if (i10 != 8) {
                        break;
                    }
                } else {
                    c10822 = c10823;
                }
                if (i9 == length) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        int size3 = arrayList.size();
        for (int i12 = 0; i12 < size3; i12++) {
            C1590 c15902 = (C1590) arrayList.get(i12);
            c10822.m1306(c15902.f2513);
            List list = c15902.f2506;
            int size4 = list.size();
            for (int i13 = 0; i13 < size4; i13++) {
                ((AbstractC2559) list.get(i13)).mo3616();
            }
            AbstractC0900.m697(c1083.m1318(c15902.f2513));
        }
        int[] iArr = new int[1];
        ArrayList arrayList4 = this.f2353;
        ArrayList arrayList5 = this.f2354;
        if (!z4 || c15192 == null) {
            th = null;
        } else {
            if (arrayList5.isEmpty()) {
                i6 = 0;
            } else {
                if (arrayList5.size() > 1) {
                    AbstractC5168.m9325(arrayList5, new C1549(c15192, 2));
                }
                if (arrayList5.size() > 0) {
                    C1590 c15903 = (C1590) arrayList5.get(0);
                    m2068(iArr, c15903);
                    Object objM1317 = c1083.m1317(c15903.f2513);
                    objM1317.getClass();
                    AbstractC0900.m697(objM1317);
                    c15903.m2123(0);
                    throw null;
                }
                i6 = 0;
                AbstractC5179.m9389(iArr, 0, 0, 6);
            }
            if (!arrayList4.isEmpty()) {
                th = null;
                if (arrayList4.size() > 1) {
                    AbstractC5168.m9325(arrayList4, new C1549(c15192, i6));
                }
                if (arrayList4.size() > 0) {
                    C1590 c15904 = (C1590) arrayList4.get(i6);
                    m2068(iArr, c15904);
                    Object objM13172 = c1083.m1317(c15904.f2513);
                    objM13172.getClass();
                    AbstractC0900.m697(objM13172);
                    c15904.m2123(i6);
                    throw null;
                }
                AbstractC5179.m9389(iArr, i6, i6, 6);
            }
        }
        Object[] objArr2 = c10822.f1345;
        long[] jArr2 = c10822.f1346;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i14 = 0;
            while (true) {
                int i15 = length2;
                long j3 = jArr2[i14];
                arrayList2 = arrayList4;
                arrayList3 = arrayList5;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8 - ((~(i14 - i15)) >>> 31);
                    long j4 = j3;
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((j4 & 255) < 128) {
                            AbstractC0900.m697(c1083.m1317(objArr2[(i14 << 3) + i17]));
                        }
                        j4 >>= 8;
                    }
                    if (i16 != 8) {
                        break;
                    }
                    length2 = i15;
                    if (i14 == length2) {
                        break;
                    }
                    i14++;
                    arrayList4 = arrayList2;
                    arrayList5 = arrayList3;
                }
            }
        } else {
            arrayList2 = arrayList4;
            arrayList3 = arrayList5;
        }
        ArrayList arrayList6 = this.f2352;
        if (arrayList6.isEmpty()) {
            i5 = 1;
        } else {
            if (arrayList6.size() > 1) {
                AbstractC5168.m9325(arrayList6, new C1549(c1519, 3));
            }
            int size5 = arrayList6.size();
            for (int i18 = 0; i18 < size5; i18++) {
                C1590 c15905 = (C1590) arrayList6.get(i18);
                Object objM13173 = c1083.m1317(c15905.f2513);
                objM13173.getClass();
                AbstractC0900.m697(objM13173);
                c15905.m2121((z ? (int) (4294967295L & ((C1590) AbstractC5176.m9379(arrayList)).m2123(0)) : 0) - m2068(iArr, c15905), i, i2);
                if (z4) {
                    m2069(c15905, true);
                    throw th;
                }
            }
            i5 = 1;
            AbstractC5179.m9389(iArr, 0, 0, 6);
        }
        ArrayList arrayList7 = this.f2359;
        if (!arrayList7.isEmpty()) {
            if (arrayList7.size() > i5) {
                AbstractC5168.m9325(arrayList7, new C1549(c1519, i5));
            }
            int size6 = arrayList7.size();
            for (int i19 = 0; i19 < size6; i19++) {
                C1590 c15906 = (C1590) arrayList7.get(i19);
                Object objM13174 = c1083.m1317(c15906.f2513);
                objM13174.getClass();
                AbstractC0900.m697(objM13174);
                c15906.m2121((0 - c15906.f2515) + m2068(iArr, c15906), i, i2);
                if (z4) {
                    m2069(c15906, true);
                    throw th;
                }
            }
        }
        Collections.reverse(arrayList6);
        arrayList.addAll(0, arrayList6);
        arrayList.addAll(arrayList7);
        arrayList3.clear();
        arrayList2.clear();
        arrayList6.clear();
        arrayList7.clear();
        c10822.m1300();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long m2072() {
        ArrayList arrayList = this.f2358;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        AbstractC0900.m697(arrayList.get(0));
        throw null;
    }
}
