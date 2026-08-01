package androidx.compose.ui.text;

import kotlin.reflect.jvm.internal.impl.types.C4871;
import p034.AbstractC6347;
import p052.InterfaceC6554;
import p116.C7341;
import p209.C7918;
import p209.C7925;
import p209.C7926;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2042 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f6044;

    public /* synthetic */ C2042(int i) {
        this.f6044 = i;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        C7341 c7341 = (C7341) obj;
        switch (this.f6044) {
            case 0:
                C2036 c2036 = (C2036) obj2;
                C2047 c2047 = c2036.f6008;
                C4871 c4871 = AbstractC2037.f6033;
                return AbstractC6347.m11912(AbstractC2037.m3759(c2047, c4871, c7341), AbstractC2037.m3759(c2036.f6007, c4871, c7341), AbstractC2037.m3759(c2036.f6006, c4871, c7341), AbstractC2037.m3759(c2036.f6005, c4871, c7341));
            case 1:
                C2055 c2055 = (C2055) obj2;
                Boolean boolValueOf = Boolean.valueOf(c2055.f6091);
                C4871 c48712 = AbstractC2037.f6020;
                return AbstractC6347.m11912(boolValueOf, AbstractC2037.m3759(new C2071(c2055.f6090), AbstractC2048.f6071, c7341));
            case 2:
                return Integer.valueOf(((C2071) obj2).f6134);
            case 3:
                return Integer.valueOf(((C7918) obj2).f21939);
            case 4:
                C7926 c7926 = (C7926) obj2;
                return AbstractC6347.m11912(AbstractC2037.m3759(new C7925(c7926.f21950), AbstractC2048.f6068, c7341), Boolean.valueOf(c7926.f21949));
            default:
                return Integer.valueOf(((C7925) obj2).f21946);
        }
    }
}
