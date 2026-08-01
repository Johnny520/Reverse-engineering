package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import p065.AbstractC7359;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5584 extends AbstractC5600 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f14242 = 1;

    public C5584(double d) {
        super(Double.valueOf(d));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC5600
    public String toString() {
        int i = this.f14242;
        Object obj = this.f14250;
        switch (i) {
            case 1:
                return ((Number) obj).doubleValue() + ".toDouble()";
            case 2:
                return ((Number) obj).floatValue() + ".toFloat()";
            default:
                return super.toString();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC5600
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC5714 mo10050(InterfaceC5318 interfaceC5318) {
        switch (this.f14242) {
            case 0:
                interfaceC5318.getClass();
                AbstractC7359 abstractC7359Mo9620 = interfaceC5318.mo9620();
                abstractC7359Mo9620.getClass();
                return abstractC7359Mo9620.m12586(PrimitiveType.BOOLEAN);
            case 1:
                interfaceC5318.getClass();
                AbstractC7359 abstractC7359Mo96202 = interfaceC5318.mo9620();
                abstractC7359Mo96202.getClass();
                return abstractC7359Mo96202.m12586(PrimitiveType.DOUBLE);
            default:
                interfaceC5318.getClass();
                AbstractC7359 abstractC7359Mo96203 = interfaceC5318.mo9620();
                abstractC7359Mo96203.getClass();
                return abstractC7359Mo96203.m12586(PrimitiveType.FLOAT);
        }
    }

    public /* synthetic */ C5584(Object obj) {
        super(obj);
    }

    public C5584(float f) {
        super(Float.valueOf(f));
    }
}
