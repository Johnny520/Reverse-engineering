package kotlin.reflect.jvm.internal.impl.types.checker;

import androidx.compose.runtime.C1322;
import com.alibaba.fastjson2.AbstractC2905;
import java.util.Collection;
import java.util.List;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4870;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import p049.AbstractC6530;
import p052.InterfaceC6543;
import p069.InterfaceC6896;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4862 implements InterfaceC6896 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC5184 f14144;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC4463 f14145;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public InterfaceC6543 f14146;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C4862 f14147;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC4870 f14148;

    public C4862(AbstractC4870 abstractC4870, InterfaceC6543 interfaceC6543, C4862 c4862, InterfaceC4463 interfaceC4463) {
        abstractC4870.getClass();
        this.f14148 = abstractC4870;
        this.f14146 = interfaceC6543;
        this.f14147 = c4862;
        this.f14145 = interfaceC4463;
        this.f14144 = AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C1322(this, 10));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C4862.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C4862 c4862 = (C4862) obj;
        C4862 c48622 = this.f14147;
        if (c48622 != null) {
            this = c48622;
        }
        C4862 c48623 = c4862.f14147;
        if (c48623 != null) {
            obj = c48623;
        }
        return this == obj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    public final List getParameters() {
        return EmptyList.INSTANCE;
    }

    public final int hashCode() {
        C4862 c4862 = this.f14147;
        return c4862 != null ? c4862.hashCode() : super.hashCode();
    }

    public final String toString() {
        return "CapturedType(" + this.f14148 + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC6530 mo9493() {
        AbstractC4882 abstractC4882Mo9741 = this.f14148.mo9741();
        abstractC4882Mo9741.getClass();
        return AbstractC2905.m6317(abstractC4882Mo9741);
    }

    @Override // p069.InterfaceC6896
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final AbstractC4870 mo9720() {
        return this.f14148;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final InterfaceC4477 mo9211() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo9212() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Collection mo9494() {
        List list = (List) this.f14144.getValue();
        return list == null ? EmptyList.INSTANCE : list;
    }

    public /* synthetic */ C4862(AbstractC4870 abstractC4870, C4865 c4865, InterfaceC4463 interfaceC4463, int i) {
        this(abstractC4870, (i & 2) != 0 ? null : c4865, (C4862) null, (i & 8) != 0 ? null : interfaceC4463);
    }
}
