package kotlin.reflect.jvm.internal.impl.types;

import java.io.IOException;
import java.util.Iterator;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.jvm.internal.impl.renderer.C4744;
import net.bytebuddy.description.type.TypeDescription;
import p046.InterfaceC6478;
import p097.InterfaceC7226;
import p097.InterfaceC7227;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4878 extends AbstractC4914 implements InterfaceC7227, InterfaceC7226 {
    public String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", C4744.f13888.m9474((InterfaceC6478) it.next(), null), "] "};
            for (int i = 0; i < 3; i++) {
                sb.append(strArr[i]);
            }
        }
        sb.append(mo9722());
        if (!mo9726().isEmpty()) {
            AbstractC4344.m8809(mo9726(), sb, ", ", "<", ">", null, 112);
        }
        if (mo9725()) {
            sb.append(TypeDescription.Generic.OfWildcardType.SYMBOL);
        }
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4914
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC4878 mo9770(C4874 c4874);

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4914
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC4878 mo9731(boolean z);
}
