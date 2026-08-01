package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Arrays;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import net.bytebuddy.description.type.TypeDescription;
import p049.AbstractC6530;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4750 extends AbstractC4763 {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4768
    public final String toString() {
        String strValueOf;
        Object obj = this.f13905;
        Integer numValueOf = Integer.valueOf(((Character) obj).charValue());
        char cCharValue = ((Character) obj).charValue();
        switch (cCharValue) {
            case '\b':
                strValueOf = "\\b";
                break;
            case '\t':
                strValueOf = "\\t";
                break;
            case '\n':
                strValueOf = "\\n";
                break;
            case 11:
            default:
                byte type = (byte) Character.getType(cCharValue);
                strValueOf = (type != 0 && type != 13 && type != 14 && type != 15 && type != 16 && type != 18 && type != 19) ? String.valueOf(cCharValue) : TypeDescription.Generic.OfWildcardType.SYMBOL;
                break;
            case '\f':
                strValueOf = "\\f";
                break;
            case '\r':
                strValueOf = "\\r";
                break;
        }
        return String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{numValueOf, strValueOf}, 2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4768
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC4882 mo9491(InterfaceC4486 interfaceC4486) {
        interfaceC4486.getClass();
        AbstractC6530 abstractC6530Mo9061 = interfaceC4486.mo9061();
        abstractC6530Mo9061.getClass();
        return abstractC6530Mo9061.m12027(PrimitiveType.CHAR);
    }
}
