package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Arrays;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import net.bytebuddy.description.type.TypeDescription;
import p065.AbstractC7359;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5582 extends AbstractC5595 {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC5600
    public final String toString() {
        String strValueOf;
        Object obj = this.f14250;
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

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC5600
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC5714 mo10050(InterfaceC5318 interfaceC5318) {
        interfaceC5318.getClass();
        AbstractC7359 abstractC7359Mo9620 = interfaceC5318.mo9620();
        abstractC7359Mo9620.getClass();
        return abstractC7359Mo9620.m12586(PrimitiveType.CHAR);
    }
}
