package androidx.compose.ui.text;

import kotlin.reflect.jvm.internal.impl.types.C4870;
import p052.InterfaceC6553;
import p116.C7340;
import p209.C7917;
import p209.C7924;
import p209.C7925;
import p253.AbstractC8189;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2042 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f6043;

    public /* synthetic */ C2042(int i) {
        this.f6043 = i;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        C7340 c7340 = (C7340) obj;
        switch (this.f6043) {
            case 0:
                C2036 c2036 = (C2036) obj2;
                C2047 c2047 = c2036.f6007;
                C4870 c4870 = AbstractC2037.f6032;
                return AbstractC8189.m13670(AbstractC2037.m3749(c2047, c4870, c7340), AbstractC2037.m3749(c2036.f6006, c4870, c7340), AbstractC2037.m3749(c2036.f6005, c4870, c7340), AbstractC2037.m3749(c2036.f6004, c4870, c7340));
            case 1:
                C2055 c2055 = (C2055) obj2;
                Boolean boolValueOf = Boolean.valueOf(c2055.f6090);
                C4870 c48702 = AbstractC2037.f6019;
                return AbstractC8189.m13670(boolValueOf, AbstractC2037.m3749(new C2071(c2055.f6089), AbstractC2048.f6070, c7340));
            case 2:
                return Integer.valueOf(((C2071) obj2).f6133);
            case 3:
                return Integer.valueOf(((C7917) obj2).f21942);
            case 4:
                C7925 c7925 = (C7925) obj2;
                return AbstractC8189.m13670(AbstractC2037.m3749(new C7924(c7925.f21953), AbstractC2048.f6067, c7340), Boolean.valueOf(c7925.f21952));
            default:
                return Integer.valueOf(((C7924) obj2).f21949);
        }
    }
}
