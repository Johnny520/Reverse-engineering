package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Arrays;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import net.bytebuddy.description.type.TypeDescription;
import p049.AbstractC6529;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4749 extends AbstractC4762 {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4767
    public final String toString() {
        String strValueOf;
        Object obj = this.f13901;
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

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4767
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC4881 mo9501(InterfaceC4485 interfaceC4485) {
        interfaceC4485.getClass();
        AbstractC6529 abstractC6529Mo9071 = interfaceC4485.mo9071();
        abstractC6529Mo9071.getClass();
        return abstractC6529Mo9071.m11984(PrimitiveType.CHAR);
    }
}
