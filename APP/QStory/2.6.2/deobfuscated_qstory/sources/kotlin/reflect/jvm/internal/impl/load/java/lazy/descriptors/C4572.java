package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.Set;
import kotlin.C5175;
import p052.InterfaceC6557;
import p079.AbstractC6988;
import p101.InterfaceC7253;
import p103.AbstractC7274;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4572 extends AbstractC7274 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6557 f13323;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Set f13324;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC6988 f13325;

    public C4572(AbstractC6988 abstractC6988, Set set, InterfaceC6557 interfaceC6557) {
        this.f13325 = abstractC6988;
        this.f13324 = set;
        this.f13323 = interfaceC6557;
    }

    @Override // p103.AbstractC7274
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo8965(Object obj) {
        AbstractC6988 abstractC6988 = (AbstractC6988) obj;
        abstractC6988.getClass();
        if (abstractC6988 == this.f13325) {
            return true;
        }
        InterfaceC7253 interfaceC7253Mo9016 = abstractC6988.mo9016();
        interfaceC7253Mo9016.getClass();
        if (!(interfaceC7253Mo9016 instanceof AbstractC4570)) {
            return true;
        }
        this.f13324.addAll((Collection) this.f13323.invoke(interfaceC7253Mo9016));
        return false;
    }

    @Override // p103.AbstractC7274
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final /* bridge */ /* synthetic */ Object mo8966() {
        return C5175.f14739;
    }
}
