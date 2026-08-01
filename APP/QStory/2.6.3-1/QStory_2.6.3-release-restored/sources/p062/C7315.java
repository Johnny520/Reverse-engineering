package p062;

import androidx.compose.runtime.C2157;
import java.util.Map;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import p065.AbstractC7359;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲苏楪.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7315 implements InterfaceC7307 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC6016 f18119;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Map f18120;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5519 f18121;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC7359 f18122;

    public C7315(AbstractC7359 abstractC7359, C5519 c5519, Map map) {
        abstractC7359.getClass();
        c5519.getClass();
        this.f18122 = abstractC7359;
        this.f18121 = c5519;
        this.f18120 = map;
        this.f18119 = AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C2157(this, 11));
    }

    @Override // p062.InterfaceC7307
    public final AbstractC5714 getType() {
        Object value = this.f18119.getValue();
        value.getClass();
        return (AbstractC5714) value;
    }

    @Override // p062.InterfaceC7307
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Map mo9735() {
        return this.f18120;
    }

    @Override // p062.InterfaceC7307
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC5294 mo9736() {
        return InterfaceC5294.f13436;
    }

    @Override // p062.InterfaceC7307
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C5519 mo9737() {
        return this.f18121;
    }
}
