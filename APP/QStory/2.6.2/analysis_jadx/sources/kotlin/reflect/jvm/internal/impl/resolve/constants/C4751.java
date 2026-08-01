package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import p049.AbstractC6529;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4751 extends AbstractC4767 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f13893 = 1;

    public C4751(double d) {
        super(Double.valueOf(d));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4767
    public String toString() {
        int i = this.f13893;
        Object obj = this.f13901;
        switch (i) {
            case 1:
                return ((Number) obj).doubleValue() + ".toDouble()";
            case 2:
                return ((Number) obj).floatValue() + ".toFloat()";
            default:
                return super.toString();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4767
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC4881 mo9501(InterfaceC4485 interfaceC4485) {
        switch (this.f13893) {
            case 0:
                interfaceC4485.getClass();
                AbstractC6529 abstractC6529Mo9071 = interfaceC4485.mo9071();
                abstractC6529Mo9071.getClass();
                return abstractC6529Mo9071.m11984(PrimitiveType.BOOLEAN);
            case 1:
                interfaceC4485.getClass();
                AbstractC6529 abstractC6529Mo90712 = interfaceC4485.mo9071();
                abstractC6529Mo90712.getClass();
                return abstractC6529Mo90712.m11984(PrimitiveType.DOUBLE);
            default:
                interfaceC4485.getClass();
                AbstractC6529 abstractC6529Mo90713 = interfaceC4485.mo9071();
                abstractC6529Mo90713.getClass();
                return abstractC6529Mo90713.m11984(PrimitiveType.FLOAT);
        }
    }

    public /* synthetic */ C4751(Object obj) {
        super(obj);
    }

    public C4751(float f) {
        super(Float.valueOf(f));
    }
}
