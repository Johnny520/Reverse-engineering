package p100;

import androidx.compose.runtime.AbstractC1332;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import p079.AbstractC6988;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪兰哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7246 extends AbstractC1332 implements InterfaceC7243 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f19311;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f19312 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C4690 f19313;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7246(InterfaceC4480 interfaceC4480, AbstractC4881 abstractC4881, C4690 c4690) {
        super(abstractC4881);
        interfaceC4480.getClass();
        abstractC4881.getClass();
        this.f19311 = interfaceC4480;
        this.f19313 = c4690;
    }

    public final String toString() {
        int i = this.f19312;
        Object obj = this.f19311;
        switch (i) {
            case 0:
                return getType() + ": Ctx { " + ((AbstractC6988) obj) + " }";
            default:
                return "Cxt { " + ((InterfaceC4480) obj) + " }";
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public final C4690 m12446() {
        switch (this.f19312) {
        }
        return this.f19313;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7246(AbstractC6988 abstractC6988, AbstractC4881 abstractC4881, C4690 c4690) {
        super(abstractC4881);
        abstractC4881.getClass();
        this.f19311 = abstractC6988;
        this.f19313 = c4690;
    }
}
