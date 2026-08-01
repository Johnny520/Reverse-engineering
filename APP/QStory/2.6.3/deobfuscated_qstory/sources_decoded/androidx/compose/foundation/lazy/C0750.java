package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.C0696;
import androidx.compose.foundation.lazy.layout.C0698;
import androidx.compose.foundation.lazy.layout.C0730;
import androidx.compose.foundation.lazy.layout.C0734;
import androidx.compose.runtime.snapshots.AbstractC1274;
import androidx.compose.runtime.snapshots.AbstractC1286;
import kotlin.C5176;
import net.bytebuddy.pool.TypePool;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0750 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f2173;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2174 = 1;

    public /* synthetic */ C0750(int i) {
        this.f2173 = i;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f2174;
        int i2 = this.f2173;
        switch (i) {
            case 0:
                C0698 c0698 = (C0698) obj;
                AbstractC1286 abstractC1286M2231 = AbstractC1274.m2231();
                AbstractC1274.m2237(abstractC1286M2231, AbstractC1274.m2243(abstractC1286M2231), abstractC1286M2231 != null ? abstractC1286M2231.mo2203() : null);
                int i3 = c0698.f1964;
                if (i3 == -1) {
                    i3 = 2;
                }
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = i2 + i4;
                    C0696 c0696 = c0698.f1962;
                    C0734 c0734 = c0696.f1959;
                    if (c0734 != null) {
                        c0698.f1963.add(new C0730(c0734, i5, c0696.f1960, null));
                    }
                }
                return C5176.f14739;
            default:
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + i2 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        }
    }

    public /* synthetic */ C0750(C0741 c0741, int i) {
        this.f2173 = i;
    }
}
