package kotlin.reflect.jvm.internal.impl.renderer;

import androidx.activity.AbstractC0053;
import java.util.ArrayList;
import kotlin.collections.C4328;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4465;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.name.C4685;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import net.bytebuddy.pool.TypePool;
import p053.AbstractC6560;
import p066.AbstractC6869;
import p079.AbstractC6985;
import p079.AbstractC6988;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f13826;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4736 f13825 = new C4736(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4736 f13824 = new C4736(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4736 f13823 = new C4736(2);

    public /* synthetic */ C4736(int i) {
        this.f13826 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m9436(InterfaceC4476 interfaceC4476) {
        String strM12015;
        C4690 name = interfaceC4476.getName();
        name.getClass();
        String strM12017 = AbstractC6560.m12017(name);
        if (!(interfaceC4476 instanceof InterfaceC4462)) {
            InterfaceC4498 interfaceC4498Mo9038 = interfaceC4476.mo9038();
            interfaceC4498Mo9038.getClass();
            if (interfaceC4498Mo9038 instanceof AbstractC6988) {
                strM12015 = m9436((InterfaceC4476) interfaceC4498Mo9038);
            } else if (interfaceC4498Mo9038 instanceof InterfaceC4465) {
                C4685 c4685 = ((AbstractC6985) ((InterfaceC4465) interfaceC4498Mo9038)).f18692.f13692;
                c4685.getClass();
                strM12015 = AbstractC6560.m12015(C4685.m9321(c4685));
            } else {
                strM12015 = null;
            }
            if (strM12015 != null && !strM12015.equals("")) {
                return AbstractC0053.m163(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, strM12015, strM12017);
            }
        }
        return strM12017;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪世兰哲苏, kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪苏哲世兰] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪苏哲世兰] */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪苏哲世兰] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String m9437(InterfaceC4476 interfaceC4476, C4743 c4743) {
        switch (this.f13826) {
            case 0:
                if (interfaceC4476 instanceof InterfaceC4462) {
                    C4690 name = ((InterfaceC4462) interfaceC4476).getName();
                    name.getClass();
                    return c4743.m9464(name, false);
                }
                C4685 c4685M12073 = AbstractC6869.m12073(interfaceC4476);
                c4685M12073.getClass();
                return c4743.m9488(AbstractC6560.m12015(C4685.m9321(c4685M12073)));
            case 1:
                if (interfaceC4476 instanceof InterfaceC4462) {
                    C4690 name2 = ((InterfaceC4462) interfaceC4476).getName();
                    name2.getClass();
                    return c4743.m9464(name2, false);
                }
                ArrayList arrayList = new ArrayList();
                do {
                    arrayList.add(interfaceC4476.getName());
                    interfaceC4476 = interfaceC4476.mo9038();
                } while (interfaceC4476 instanceof AbstractC6988);
                return AbstractC6560.m12015(new C4328(arrayList));
            default:
                return m9436(interfaceC4476);
        }
    }
}
