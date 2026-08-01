package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import p049.AbstractC6530;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4752 extends AbstractC4768 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f13897 = 1;

    public C4752(double d) {
        super(Double.valueOf(d));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4768
    public String toString() {
        int i = this.f13897;
        Object obj = this.f13905;
        switch (i) {
            case 1:
                return ((Number) obj).doubleValue() + ".toDouble()";
            case 2:
                return ((Number) obj).floatValue() + ".toFloat()";
            default:
                return super.toString();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4768
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC4882 mo9491(InterfaceC4486 interfaceC4486) {
        switch (this.f13897) {
            case 0:
                interfaceC4486.getClass();
                AbstractC6530 abstractC6530Mo9061 = interfaceC4486.mo9061();
                abstractC6530Mo9061.getClass();
                return abstractC6530Mo9061.m12027(PrimitiveType.BOOLEAN);
            case 1:
                interfaceC4486.getClass();
                AbstractC6530 abstractC6530Mo90612 = interfaceC4486.mo9061();
                abstractC6530Mo90612.getClass();
                return abstractC6530Mo90612.m12027(PrimitiveType.DOUBLE);
            default:
                interfaceC4486.getClass();
                AbstractC6530 abstractC6530Mo90613 = interfaceC4486.mo9061();
                abstractC6530Mo90613.getClass();
                return abstractC6530Mo90613.m12027(PrimitiveType.FLOAT);
        }
    }

    public /* synthetic */ C4752(Object obj) {
        super(obj);
    }

    public C4752(float f) {
        super(Float.valueOf(f));
    }
}
