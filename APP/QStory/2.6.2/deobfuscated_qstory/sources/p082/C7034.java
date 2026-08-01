package p082;

import androidx.collection.C0276;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.renderer.C4731;
import kotlin.reflect.jvm.internal.impl.renderer.C4743;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4869;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4895;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4913;
import kotlin.reflect.jvm.internal.impl.types.C4873;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4860;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4850;
import kotlin.text.AbstractC5143;
import org.slf4j.Marker;
import p079.AbstractC6988;
import p101.InterfaceC7253;
import p175.AbstractC7738;
import p253.AbstractC8189;

/* JADX INFO: renamed from: 飘花落叶言世楪苏兰子哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7034 extends AbstractC4895 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7034(AbstractC4877 abstractC4877, AbstractC4877 abstractC48772) {
        super(abstractC4877, abstractC48772);
        abstractC4877.getClass();
        abstractC48772.getClass();
        InterfaceC4850.f14129.m9608(abstractC4877, abstractC48772);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static final String m12344(String str, String str2) {
        if (!AbstractC5143.m10172(str, '<')) {
            return str;
        }
        return AbstractC5143.m10137(str, '<') + '<' + str2 + '>' + AbstractC5143.m10142(str, '>');
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public static final ArrayList m12345(C4743 c4743, AbstractC4881 abstractC4881) throws IOException {
        List<AbstractC4869> listMo9736 = abstractC4881.mo9736();
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(listMo9736, 10));
        for (AbstractC4869 abstractC4869 : listMo9736) {
            abstractC4869.getClass();
            StringBuilder sb = new StringBuilder();
            AbstractC4343.m8829(AbstractC8189.m13660(abstractC4869), sb, ", ", null, null, new C4731(c4743, 0), 60);
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final AbstractC4881 mo9731(AbstractC4860 abstractC4860) {
        abstractC4860.getClass();
        AbstractC4877 abstractC4877 = this.f14212;
        abstractC4877.getClass();
        AbstractC4877 abstractC48772 = this.f14213;
        abstractC48772.getClass();
        return new C7034(abstractC4877, abstractC48772);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4895, kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final InterfaceC7253 mo9734() {
        InterfaceC4476 interfaceC4476Mo9221 = mo9732().mo9221();
        AbstractC6988 abstractC6988 = interfaceC4476Mo9221 instanceof AbstractC6988 ? (AbstractC6988) interfaceC4476Mo9221 : null;
        if (abstractC6988 == null) {
            C0276.m844(mo9732().mo9221(), "Incorrect classifier: ");
            return null;
        }
        InterfaceC7253 interfaceC7253Mo12282 = abstractC6988.mo12282(new C7028());
        interfaceC7253Mo12282.getClass();
        return interfaceC7253Mo12282;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4895
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final String mo9841(C4743 c4743, C4743 c47432) throws IOException {
        AbstractC4877 abstractC4877 = this.f14212;
        String strM9496 = c4743.m9496(abstractC4877);
        AbstractC4877 abstractC48772 = this.f14213;
        String strM94962 = c4743.m9496(abstractC48772);
        if (c47432.f13888.m9452()) {
            return "raw (" + strM9496 + ".." + strM94962 + ')';
        }
        if (abstractC48772.mo9736().isEmpty()) {
            return c4743.m9479(strM9496, strM94962, AbstractC7738.m13053(this));
        }
        ArrayList arrayListM12345 = m12345(c4743, abstractC4877);
        ArrayList arrayListM123452 = m12345(c4743, abstractC48772);
        String strM8813 = AbstractC4343.m8813(arrayListM12345, ", ", null, null, C7035.f18885, 30);
        ArrayList<Pair> arrayListM8797 = AbstractC4343.m8797(arrayListM12345, arrayListM123452);
        if (arrayListM8797.isEmpty()) {
            strM94962 = m12344(strM94962, strM8813);
        } else {
            for (Pair pair : arrayListM8797) {
                String str = (String) pair.getFirst();
                String str2 = (String) pair.getSecond();
                if (!AbstractC4394.m8917(str, AbstractC5143.m10160(str2, "out ")) && !str2.equals(Marker.ANY_MARKER)) {
                    break;
                }
            }
            strM94962 = m12344(strM94962, strM8813);
        }
        String strM12344 = m12344(strM9496, strM8813);
        return strM12344.equals(strM94962) ? strM12344 : c4743.m9479(strM12344, strM94962, AbstractC7738.m13053(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4895
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final AbstractC4877 mo9842() {
        return this.f14212;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4913
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final AbstractC4913 mo9731(AbstractC4860 abstractC4860) {
        abstractC4860.getClass();
        AbstractC4877 abstractC4877 = this.f14212;
        abstractC4877.getClass();
        AbstractC4877 abstractC48772 = this.f14213;
        abstractC48772.getClass();
        return new C7034(abstractC4877, abstractC48772);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4913
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final AbstractC4913 mo9741(boolean z) {
        return new C7034(this.f14212.mo9741(z), this.f14213.mo9741(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4913
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final AbstractC4913 mo9776(C4873 c4873) {
        c4873.getClass();
        return new C7034(this.f14212.mo9776(c4873), this.f14213.mo9776(c4873));
    }
}
