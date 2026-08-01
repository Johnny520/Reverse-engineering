package androidx.compose.foundation.text;

import androidx.compose.foundation.C1915;
import androidx.compose.p001ui.layout.AbstractC2523;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.layout.InterfaceC2493;
import androidx.compose.p001ui.layout.InterfaceC2534;
import androidx.compose.p001ui.text.C2865;
import androidx.compose.p001ui.text.C2867;
import androidx.compose.p001ui.text.C2868;
import androidx.compose.p001ui.text.C2896;
import androidx.compose.p001ui.text.C2902;
import androidx.compose.p001ui.text.font.InterfaceC2830;
import androidx.compose.p001ui.text.input.C2847;
import androidx.compose.p001ui.text.input.InterfaceC2856;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.internal.C2080;
import androidx.compose.runtime.snapshots.AbstractC2109;
import androidx.compose.runtime.snapshots.AbstractC2121;
import androidx.window.area.AbstractC3400;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.AbstractC5171;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7387;
import p069.AbstractC7390;
import p221.AbstractC8726;
import p221.C8722;
import p221.C8727;
import p221.InterfaceC8725;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1790 implements InterfaceC2493 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final /* synthetic */ int f3055;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8725 f3056;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2856 f3057;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ C2847 f3058;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7387 f3059;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C1781 f3060;

    public C1790(C1781 c1781, InterfaceC7387 interfaceC7387, C2847 c2847, InterfaceC2856 interfaceC2856, InterfaceC8725 interfaceC8725, int i) {
        this.f3060 = c1781;
        this.f3059 = interfaceC7387;
        this.f3058 = c2847;
        this.f3057 = interfaceC2856;
        this.f3056 = interfaceC8725;
        this.f3055 = i;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1665(InterfaceC2534 interfaceC2534, List list, int i) {
        C1781 c1781 = this.f3060;
        c1781.f3015.m2481(interfaceC2534.getLayoutDirection());
        C2080 c2080 = c1781.f3015.f3306;
        if (c2080 != null) {
            return AbstractC1821.m2472(c2080.mo2713());
        }
        C6755.m11870("layoutIntrinsics must be called first");
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021e  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [androidx.compose.ui.layout.飘花落叶言子楪兰苏哲世] */
    /* JADX WARN: Type inference failed for: r14v6 */
    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC2492 mo1666(InterfaceC2488 interfaceC2488, List list, long j) {
        long j2;
        C2867 c2867;
        LayoutDirection layoutDirection;
        int i;
        InterfaceC2492 interfaceC2492;
        C2867 c28672;
        C2867 c28673;
        int i2;
        C1790 c1790;
        C1781 c1781 = this.f3060;
        AbstractC2121 abstractC2121M2791 = AbstractC2109.m2791();
        InterfaceC7387 interfaceC7387Mo2763 = abstractC2121M2791 != null ? abstractC2121M2791.mo2763() : null;
        AbstractC2121 abstractC2121M2803 = AbstractC2109.m2803(abstractC2121M2791);
        try {
            C1801 c1801M2425 = c1781.m2425();
            C2867 c28674 = c1801M2425 != null ? c1801M2425.f3090 : null;
            C1847 c1847 = c1781.f3015;
            LayoutDirection layoutDirection2 = interfaceC2488.getLayoutDirection();
            int i3 = c1847.f3296;
            boolean z = c1847.f3297;
            int i4 = c1847.f3299;
            if (c28674 != null) {
                C2896 c2896 = c28674.f6335;
                C2868 c2868 = c28674.f6336;
                C2902 c2902 = c1847.f3301;
                C2865 c2865 = c1847.f3300;
                List list2 = c1847.f3305;
                interfaceC2492 = null;
                InterfaceC8725 interfaceC8725 = c1847.f3303;
                InterfaceC2830 interfaceC2830 = c1847.f3302;
                C2867 c28675 = c28674;
                if (c2896.f6450.mo2715()) {
                    j2 = j;
                    layoutDirection = layoutDirection2;
                } else {
                    C2902 c29022 = c2868.f6342;
                    long j3 = c2868.f6346;
                    if (AbstractC5227.m9466(c29022, c2902) && c2868.f6341.m4298(c2865) && AbstractC5227.m9466(c2868.f6340, list2) && c2868.f6339 == i4 && c2868.f6338 == z && c2868.f6337 == i3 && AbstractC5227.m9466(c2868.f6344, interfaceC8725)) {
                        layoutDirection = layoutDirection2;
                        if (c2868.f6343 != layoutDirection || !AbstractC5227.m9466(c2868.f6345, interfaceC2830) || C8727.m13900(j) != C8727.m13900(j3)) {
                            j2 = j;
                        } else {
                            if ((!z && i3 != 2) || (C8727.m13896(j) == C8727.m13896(j3) && C8727.m13897(j) == C8727.m13897(j3))) {
                                c2867 = c28675;
                                c28672 = new C2867(new C2868(c2868.f6342, c1847.f3300, c2868.f6340, c2868.f6339, c2868.f6338, c2868.f6337, c2868.f6344, c2868.f6343, c2868.f6345, j), c2896, AbstractC8726.m13881(j, (((long) AbstractC1821.m2472(c2896.f6446)) & 4294967295L) | (((long) AbstractC1821.m2472(c2896.f6447)) << 32)));
                                long j4 = c28672.f6334;
                                Triple triple = new Triple(Integer.valueOf((int) (j4 >> 32)), Integer.valueOf((int) (j4 & 4294967295L)), c28672);
                                int iIntValue = ((Number) triple.component1()).intValue();
                                int iIntValue2 = ((Number) triple.component2()).intValue();
                                c28673 = (C2867) triple.component3();
                                if (AbstractC5227.m9466(c2867, c28673)) {
                                    ((AbstractC2182) c1781.f3032).setValue(new C1801(c28673, c1801M2425 != null ? c1801M2425.f3088 : interfaceC2492));
                                    i2 = 0;
                                    c1781.f3027 = false;
                                    c1790 = this;
                                    c1790.f3059.invoke(c28673);
                                    AbstractC1821.m2460(c1781, c1790.f3058, c1790.f3057);
                                } else {
                                    i2 = 0;
                                    c1790 = this;
                                }
                                ((AbstractC2182) c1781.f3029).setValue(new C8722(c1790.f3056.mo1893(c1790.f3055 != 1 ? AbstractC1821.m2472(c28673.f6335.m4350(i2)) : i2)));
                                return interfaceC2488.mo2055(iIntValue, iIntValue2, AbstractC5171.m9333(new Pair(AbstractC2523.f5297, Integer.valueOf(Math.round(c28673.f6333))), new Pair(AbstractC2523.f5296, Integer.valueOf(Math.round(c28673.f6332)))), new C1915(2));
                            }
                            j2 = j;
                            i = 2;
                            c2867 = c28675;
                        }
                    } else {
                        j2 = j;
                        c2867 = c28675;
                        layoutDirection = layoutDirection2;
                        i = 2;
                    }
                }
                c2867 = c28675;
                i = 2;
            } else {
                j2 = j;
                c2867 = c28674;
                layoutDirection = layoutDirection2;
                i = 2;
                interfaceC2492 = null;
            }
            c1847.m2481(layoutDirection);
            int iM13900 = C8727.m13900(j2);
            int iM13896 = ((z || i3 == i) && C8727.m13892(j2)) ? C8727.m13896(j2) : Integer.MAX_VALUE;
            int i5 = (z || i3 != i) ? i4 : 1;
            if (iM13900 != iM13896) {
                C2080 c2080 = c1847.f3306;
                if (c2080 == null) {
                    C6755.m11870("layoutIntrinsics must be called first");
                    return interfaceC2492;
                }
                iM13896 = AbstractC3400.m5650(AbstractC1821.m2472(c2080.mo2713()), iM13900, iM13896);
            }
            C2080 c20802 = c1847.f3306;
            if (c20802 == null) {
                C6755.m11870("layoutIntrinsics must be called first");
                return interfaceC2492;
            }
            C2896 c28962 = new C2896(c20802, AbstractC7390.m12608(0, iM13896, 0, C8727.m13897(j2)), i5, c1847.f3296);
            c28672 = new C2867(new C2868(c1847.f3301, c1847.f3300, c1847.f3305, c1847.f3299, c1847.f3297, c1847.f3296, c1847.f3303, layoutDirection, c1847.f3302, j2), c28962, AbstractC8726.m13881(j2, (((long) AbstractC1821.m2472(c28962.f6447)) << 32) | (((long) AbstractC1821.m2472(c28962.f6446)) & 4294967295L)));
            long j42 = c28672.f6334;
            Triple triple2 = new Triple(Integer.valueOf((int) (j42 >> 32)), Integer.valueOf((int) (j42 & 4294967295L)), c28672);
            int iIntValue3 = ((Number) triple2.component1()).intValue();
            int iIntValue22 = ((Number) triple2.component2()).intValue();
            c28673 = (C2867) triple2.component3();
            if (AbstractC5227.m9466(c2867, c28673)) {
            }
            ((AbstractC2182) c1781.f3029).setValue(new C8722(c1790.f3056.mo1893(c1790.f3055 != 1 ? AbstractC1821.m2472(c28673.f6335.m4350(i2)) : i2)));
            return interfaceC2488.mo2055(iIntValue3, iIntValue22, AbstractC5171.m9333(new Pair(AbstractC2523.f5297, Integer.valueOf(Math.round(c28673.f6333))), new Pair(AbstractC2523.f5296, Integer.valueOf(Math.round(c28673.f6332)))), new C1915(2));
        } finally {
            AbstractC2109.m2797(abstractC2121M2791, abstractC2121M2803, interfaceC7387Mo2763);
        }
    }
}
