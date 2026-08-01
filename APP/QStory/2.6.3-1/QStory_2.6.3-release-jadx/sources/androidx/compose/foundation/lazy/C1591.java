package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.C1537;
import androidx.compose.foundation.lazy.layout.C1539;
import androidx.compose.foundation.lazy.layout.C1571;
import androidx.compose.foundation.lazy.layout.C1575;
import androidx.compose.runtime.snapshots.AbstractC2109;
import androidx.compose.runtime.snapshots.AbstractC2121;
import kotlin.C6008;
import net.bytebuddy.pool.TypePool;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1591 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f2518;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2519 = 1;

    public /* synthetic */ C1591(int i) {
        this.f2518 = i;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f2519;
        int i2 = this.f2518;
        switch (i) {
            case 0:
                C1539 c1539 = (C1539) obj;
                AbstractC2121 abstractC2121M2791 = AbstractC2109.m2791();
                AbstractC2109.m2797(abstractC2121M2791, AbstractC2109.m2803(abstractC2121M2791), abstractC2121M2791 != null ? abstractC2121M2791.mo2763() : null);
                int i3 = c1539.f2309;
                if (i3 == -1) {
                    i3 = 2;
                }
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = i2 + i4;
                    C1537 c1537 = c1539.f2307;
                    C1575 c1575 = c1537.f2304;
                    if (c1575 != null) {
                        c1539.f2308.add(new C1571(c1575, i5, c1537.f2305, null));
                    }
                }
                return C6008.f15084;
            default:
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + i2 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        }
    }

    public /* synthetic */ C1591(C1582 c1582, int i) {
        this.f2518 = i;
    }
}
