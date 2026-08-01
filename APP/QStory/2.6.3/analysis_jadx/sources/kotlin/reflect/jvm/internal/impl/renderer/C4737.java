package kotlin.reflect.jvm.internal.impl.renderer;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3065;
import java.util.ArrayList;
import kotlin.collections.C4329;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4466;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import net.bytebuddy.pool.TypePool;
import p066.AbstractC6870;
import p079.AbstractC6986;
import p079.AbstractC6989;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4737 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f13830;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4737 f13829 = new C4737(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4737 f13828 = new C4737(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4737 f13827 = new C4737(2);

    public /* synthetic */ C4737(int i) {
        this.f13830 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m9426(InterfaceC4477 interfaceC4477) {
        String strM6813;
        C4691 name = interfaceC4477.getName();
        name.getClass();
        String strM6815 = AbstractC3065.m6815(name);
        if (!(interfaceC4477 instanceof InterfaceC4463)) {
            InterfaceC4499 interfaceC4499Mo9028 = interfaceC4477.mo9028();
            interfaceC4499Mo9028.getClass();
            if (interfaceC4499Mo9028 instanceof AbstractC6989) {
                strM6813 = m9426((InterfaceC4477) interfaceC4499Mo9028);
            } else if (interfaceC4499Mo9028 instanceof InterfaceC4466) {
                C4686 c4686 = ((AbstractC6986) ((InterfaceC4466) interfaceC4499Mo9028)).f18687.f13696;
                c4686.getClass();
                strM6813 = AbstractC3065.m6813(C4686.m9311(c4686));
            } else {
                strM6813 = null;
            }
            if (strM6813 != null && !strM6813.equals("")) {
                return AbstractC0053.m164(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, strM6813, strM6815);
            }
        }
        return strM6815;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪世兰哲苏, kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪苏哲世兰] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪苏哲世兰] */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪苏哲世兰] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String m9427(InterfaceC4477 interfaceC4477, C4744 c4744) {
        switch (this.f13830) {
            case 0:
                if (interfaceC4477 instanceof InterfaceC4463) {
                    C4691 name = ((InterfaceC4463) interfaceC4477).getName();
                    name.getClass();
                    return c4744.m9454(name, false);
                }
                C4686 c4686M12101 = AbstractC6870.m12101(interfaceC4477);
                c4686M12101.getClass();
                return c4744.m9478(AbstractC3065.m6813(C4686.m9311(c4686M12101)));
            case 1:
                if (interfaceC4477 instanceof InterfaceC4463) {
                    C4691 name2 = ((InterfaceC4463) interfaceC4477).getName();
                    name2.getClass();
                    return c4744.m9454(name2, false);
                }
                ArrayList arrayList = new ArrayList();
                do {
                    arrayList.add(interfaceC4477.getName());
                    interfaceC4477 = interfaceC4477.mo9028();
                } while (interfaceC4477 instanceof AbstractC6989);
                return AbstractC3065.m6813(new C4329(arrayList));
            default:
                return m9426(interfaceC4477);
        }
    }
}
