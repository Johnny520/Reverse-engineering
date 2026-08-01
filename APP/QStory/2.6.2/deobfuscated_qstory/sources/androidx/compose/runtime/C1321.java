package androidx.compose.runtime;

import androidx.collection.C0246;
import androidx.compose.runtime.composer.gapbuffer.C1227;
import java.util.ArrayList;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import p127.C7459;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1321 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC5183 f3824;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C0246 f3825;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f3826;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f3827;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f3828;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f3829;

    public C1321(int i, ArrayList arrayList) {
        this.f3829 = arrayList;
        this.f3828 = i;
        if (i < 0) {
            AbstractC1392.m2528("Invalid start index");
        }
        this.f3826 = new ArrayList();
        C0246 c0246 = new C0246();
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C1227 c1227 = (C1227) this.f3829.get(i4);
            int i5 = c1227.f3525;
            int i6 = c1227.f3524;
            c0246.m789(i5, new C7459(i4, i3, i6));
            i3 += i6;
        }
        this.f3825 = c0246;
        this.f3824 = AbstractC5186.m10210(new C1322(this, i2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m2325(int i, int i2) {
        C7459 c7459;
        int i3;
        int i4;
        C0246 c0246 = this.f3825;
        C7459 c74592 = (C7459) c0246.m832(i);
        if (c74592 == null) {
            return false;
        }
        int i5 = c74592.f20181;
        int i6 = i2 - c74592.f20180;
        c74592.f20180 = i2;
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
                    if ((255 & j) < 128 && (i3 = (c7459 = (C7459) objArr[(i7 << 3) + i9]).f20181) >= i5 && c7459 != c74592 && (i4 = i3 + i6) >= 0) {
                        c7459.f20181 = i4;
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
