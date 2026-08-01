package kotlin.reflect.jvm.internal.impl.types;

import java.io.IOException;
import java.util.Iterator;
import kotlin.collections.AbstractC5176;
import kotlin.reflect.jvm.internal.impl.renderer.C5576;
import net.bytebuddy.description.type.TypeDescription;
import p062.InterfaceC7307;
import p113.InterfaceC8055;
import p113.InterfaceC8056;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5710 extends AbstractC5746 implements InterfaceC8056, InterfaceC8055 {
    public String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", C5576.f14233.m10033((InterfaceC7307) it.next(), null), "] "};
            for (int i = 0; i < 3; i++) {
                sb.append(strArr[i]);
            }
        }
        sb.append(mo10281());
        if (!mo10285().isEmpty()) {
            AbstractC5176.m9368(mo10285(), sb, ", ", "<", ">", null, 112);
        }
        if (mo10284()) {
            sb.append(TypeDescription.Generic.OfWildcardType.SYMBOL);
        }
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5746
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC5710 mo10329(C5706 c5706);

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5746
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC5710 mo10290(boolean z);
}
