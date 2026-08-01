package androidx.compose.runtime;

import androidx.collection.C1093;
import androidx.compose.runtime.composer.gapbuffer.C2062;
import java.util.ArrayList;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import p143.C8289;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2156 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC6016 f4170;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1093 f4171;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f4172;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f4173;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f4174;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f4175;

    public C2156(int i, ArrayList arrayList) {
        this.f4175 = arrayList;
        this.f4174 = i;
        if (i < 0) {
            AbstractC2227.m3098("Invalid start index");
        }
        this.f4172 = new ArrayList();
        C1093 c1093 = new C1093();
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C2062 c2062 = (C2062) this.f4175.get(i4);
            int i5 = c2062.f3871;
            int i6 = c2062.f3870;
            c1093.m1350(i5, new C8289(i4, i3, i6));
            i3 += i6;
        }
        this.f4171 = c1093;
        this.f4170 = AbstractC6019.m10773(new C2157(this, i2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m2895(int i, int i2) {
        C8289 c8289;
        int i3;
        int i4;
        C1093 c1093 = this.f4171;
        C8289 c82892 = (C8289) c1093.m1393(i);
        if (c82892 == null) {
            return false;
        }
        int i5 = c82892.f20521;
        int i6 = i2 - c82892.f20520;
        c82892.f20520 = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = c1093.f1317;
        long[] jArr = c1093.f1319;
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
                    if ((255 & j) < 128 && (i3 = (c8289 = (C8289) objArr[(i7 << 3) + i9]).f20521) >= i5 && c8289 != c82892 && (i4 = i3 + i6) >= 0) {
                        c8289.f20521 = i4;
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
