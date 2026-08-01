package kotlin.reflect.jvm.internal.impl.types;

import java.io.IOException;
import java.util.Iterator;
import kotlin.collections.AbstractC4343;
import kotlin.reflect.jvm.internal.impl.renderer.C4743;
import net.bytebuddy.description.type.TypeDescription;
import p046.InterfaceC6477;
import p097.InterfaceC7225;
import p097.InterfaceC7226;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4877 extends AbstractC4913 implements InterfaceC7226, InterfaceC7225 {
    public String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", C4743.f13884.m9484((InterfaceC6477) it.next(), null), "] "};
            for (int i = 0; i < 3; i++) {
                sb.append(strArr[i]);
            }
        }
        sb.append(mo9732());
        if (!mo9736().isEmpty()) {
            AbstractC4343.m8829(mo9736(), sb, ", ", "<", ">", null, 112);
        }
        if (mo9735()) {
            sb.append(TypeDescription.Generic.OfWildcardType.SYMBOL);
        }
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4913
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC4877 mo9776(C4873 c4873);

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4913
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC4877 mo9741(boolean z);
}
