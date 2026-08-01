package androidx.compose.runtime;

import androidx.collection.C0246;
import androidx.compose.runtime.composer.gapbuffer.C1227;
import java.util.ArrayList;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import p127.C7460;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1321 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC5184 f3825;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C0246 f3826;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f3827;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f3828;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f3829;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f3830;

    public C1321(int i, ArrayList arrayList) {
        this.f3830 = arrayList;
        this.f3829 = i;
        if (i < 0) {
            AbstractC1392.m2538("Invalid start index");
        }
        this.f3827 = new ArrayList();
        C0246 c0246 = new C0246();
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C1227 c1227 = (C1227) this.f3830.get(i4);
            int i5 = c1227.f3526;
            int i6 = c1227.f3525;
            c0246.m790(i5, new C7460(i4, i3, i6));
            i3 += i6;
        }
        this.f3826 = c0246;
        this.f3825 = AbstractC5187.m10214(new C1322(this, i2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m2335(int i, int i2) {
        C7460 c7460;
        int i3;
        int i4;
        C0246 c0246 = this.f3826;
        C7460 c74602 = (C7460) c0246.m833(i);
        if (c74602 == null) {
            return false;
        }
        int i5 = c74602.f20176;
        int i6 = i2 - c74602.f20175;
        c74602.f20175 = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = c0246.f972;
        long[] jArr = c0246.f974;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (c7460 = (C7460) objArr[(i7 << 3) + i9]).f20176) >= i5 && c7460 != c74602 && (i4 = i3 + i6) >= 0) {
                        c7460.f20176 = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
