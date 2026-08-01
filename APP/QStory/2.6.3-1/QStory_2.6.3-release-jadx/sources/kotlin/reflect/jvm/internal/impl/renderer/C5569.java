package kotlin.reflect.jvm.internal.impl.renderer;

import androidx.activity.AbstractC0900;
import com.bumptech.glide.AbstractC3897;
import java.util.ArrayList;
import kotlin.collections.C5161;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5298;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.name.C5518;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import net.bytebuddy.pool.TypePool;
import p082.AbstractC7699;
import p095.AbstractC7815;
import p095.AbstractC7818;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5569 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f14175;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5569 f14174 = new C5569(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5569 f14173 = new C5569(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5569 f14172 = new C5569(2);

    public /* synthetic */ C5569(int i) {
        this.f14175 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m9985(InterfaceC5309 interfaceC5309) {
        String strM7373;
        C5523 name = interfaceC5309.getName();
        name.getClass();
        String strM7375 = AbstractC3897.m7375(name);
        if (!(interfaceC5309 instanceof InterfaceC5295)) {
            InterfaceC5331 interfaceC5331Mo9587 = interfaceC5309.mo9587();
            interfaceC5331Mo9587.getClass();
            if (interfaceC5331Mo9587 instanceof AbstractC7818) {
                strM7373 = m9985((InterfaceC5309) interfaceC5331Mo9587);
            } else if (interfaceC5331Mo9587 instanceof InterfaceC5298) {
                C5518 c5518 = ((AbstractC7815) ((InterfaceC5298) interfaceC5331Mo9587)).f19032.f14041;
                c5518.getClass();
                strM7373 = AbstractC3897.m7373(C5518.m9870(c5518));
            } else {
                strM7373 = null;
            }
            if (strM7373 != null && !strM7373.equals("")) {
                return AbstractC0900.m724(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, strM7373, strM7375);
            }
        }
        return strM7375;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪世兰哲苏, kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪苏哲世兰] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪苏哲世兰] */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪苏哲世兰] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String m9986(InterfaceC5309 interfaceC5309, C5576 c5576) {
        switch (this.f14175) {
            case 0:
                if (interfaceC5309 instanceof InterfaceC5295) {
                    C5523 name = ((InterfaceC5295) interfaceC5309).getName();
                    name.getClass();
                    return c5576.m10013(name, false);
                }
                C5518 c5518M12660 = AbstractC7699.m12660(interfaceC5309);
                c5518M12660.getClass();
                return c5576.m10037(AbstractC3897.m7373(C5518.m9870(c5518M12660)));
            case 1:
                if (interfaceC5309 instanceof InterfaceC5295) {
                    C5523 name2 = ((InterfaceC5295) interfaceC5309).getName();
                    name2.getClass();
                    return c5576.m10013(name2, false);
                }
                ArrayList arrayList = new ArrayList();
                do {
                    arrayList.add(interfaceC5309.getName());
                    interfaceC5309 = interfaceC5309.mo9587();
                } while (interfaceC5309 instanceof AbstractC7818);
                return AbstractC3897.m7373(new C5161(arrayList));
            default:
                return m9985(interfaceC5309);
        }
    }
}
