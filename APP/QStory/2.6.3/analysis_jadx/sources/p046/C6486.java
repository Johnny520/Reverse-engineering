package p046;

import androidx.compose.runtime.C1322;
import java.util.Map;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import p049.AbstractC6530;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲苏楪.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6486 implements InterfaceC6478 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC5184 f17774;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Map f17775;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4687 f17776;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC6530 f17777;

    public C6486(AbstractC6530 abstractC6530, C4687 c4687, Map map) {
        abstractC6530.getClass();
        c4687.getClass();
        this.f17777 = abstractC6530;
        this.f17776 = c4687;
        this.f17775 = map;
        this.f17774 = AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C1322(this, 11));
    }

    @Override // p046.InterfaceC6478
    public final AbstractC4882 getType() {
        Object value = this.f17774.getValue();
        value.getClass();
        return (AbstractC4882) value;
    }

    @Override // p046.InterfaceC6478
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Map mo9176() {
        return this.f17775;
    }

    @Override // p046.InterfaceC6478
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC4462 mo9177() {
        return InterfaceC4462.f13091;
    }

    @Override // p046.InterfaceC6478
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C4687 mo9178() {
        return this.f17776;
    }
}
