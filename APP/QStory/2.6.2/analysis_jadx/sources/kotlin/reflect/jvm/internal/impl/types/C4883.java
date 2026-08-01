package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4883 extends AbstractC4868 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ Object f14191;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f14192;

    public /* synthetic */ C4883(Object obj, int i) {
        this.f14192 = i;
        this.f14191 = obj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4915
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public boolean mo9744() {
        switch (this.f14192) {
            case 1:
                return ((Map) this.f14191).isEmpty();
            default:
                return super.mo9744();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4915
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public boolean mo9747() {
        switch (this.f14192) {
            case 1:
                return false;
            default:
                return super.mo9747();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4868
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final AbstractC4869 mo9748(InterfaceC4872 interfaceC4872) {
        int i = this.f14192;
        Object obj = this.f14191;
        interfaceC4872.getClass();
        switch (i) {
            case 0:
                if (!((ArrayList) obj).contains(interfaceC4872)) {
                    return null;
                }
                InterfaceC4476 interfaceC4476Mo9221 = interfaceC4872.mo9221();
                interfaceC4476Mo9221.getClass();
                return AbstractC4916.m9860((InterfaceC4462) interfaceC4476Mo9221);
            default:
                return (AbstractC4869) ((Map) obj).get(interfaceC4872);
        }
    }
}
