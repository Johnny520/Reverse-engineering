package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.C1582;
import androidx.compose.foundation.lazy.C1603;
import androidx.compose.runtime.InterfaceC2230;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1526 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2260;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2261;

    public /* synthetic */ C1526(Object obj, int i) {
        this.f2261 = i;
        this.f2260 = obj;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f2261;
        Object obj = this.f2260;
        switch (i) {
            case 0:
                C1582 c1582 = ((C1521) obj).f2249.f2474;
                return Float.valueOf((c1582.f2450.m2120() * 500) + c1582.f2450.m2118());
            case 1:
                C1582 c15822 = ((C1521) obj).f2249.f2474;
                int iM2120 = c15822.f2450.m2120();
                int iM2118 = c15822.f2450.m2118();
                return Float.valueOf(c15822.mo1847() ? (iM2120 * 500) + iM2118 + 100.0f : (iM2120 * 500) + iM2118);
            case 2:
                C1521 c1521 = (C1521) obj;
                C1582 c15823 = c1521.f2249.f2474;
                int iM2126 = (int) (c15823.m2111().f2554 == Orientation.Vertical ? c15823.m2111().m2126() & 4294967295L : c15823.m2111().m2126() >> 32);
                C1582 c15824 = c1521.f2249.f2474;
                return Float.valueOf(iM2126 - ((-c15824.m2111().f2559) + c15824.m2111().f2555));
            default:
                return (C1603) ((InterfaceC7372) ((InterfaceC2230) obj).getValue()).invoke();
        }
    }
}
