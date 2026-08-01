package p046;

import androidx.compose.runtime.C1322;
import java.util.Map;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import p049.AbstractC6529;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲苏楪.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6485 implements InterfaceC6477 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC5183 f17778;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Map f17779;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4686 f17780;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC6529 f17781;

    public C6485(AbstractC6529 abstractC6529, C4686 c4686, Map map) {
        abstractC6529.getClass();
        c4686.getClass();
        this.f17781 = abstractC6529;
        this.f17780 = c4686;
        this.f17779 = map;
        this.f17778 = AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C1322(this, 11));
    }

    @Override // p046.InterfaceC6477
    public final AbstractC4881 getType() {
        Object value = this.f17778.getValue();
        value.getClass();
        return (AbstractC4881) value;
    }

    @Override // p046.InterfaceC6477
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Map mo9186() {
        return this.f17779;
    }

    @Override // p046.InterfaceC6477
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC4461 mo9187() {
        return InterfaceC4461.f13087;
    }

    @Override // p046.InterfaceC6477
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C4686 mo9188() {
        return this.f17780;
    }
}
