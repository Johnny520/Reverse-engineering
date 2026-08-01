package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C1414;
import androidx.compose.foundation.interaction.InterfaceC1421;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.InterfaceC2208;
import p068.InterfaceC7372;
import p068.InterfaceC7380;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1896 implements InterfaceC7380 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7372 f3489;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7372 f3490;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1854 f3491;

    public C1896(InterfaceC1854 interfaceC1854, InterfaceC7372 interfaceC7372, InterfaceC7372 interfaceC73722) {
        this.f3491 = interfaceC1854;
        this.f3489 = interfaceC7372;
        this.f3490 = interfaceC73722;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        C2159 c2159 = (C2159) ((InterfaceC2208) obj2);
        c2159.m2952(-1525724089);
        Object objM2905 = c2159.m2905();
        if (objM2905 == C2204.f4319) {
            objM2905 = new C1414();
            c2159.m2946(objM2905);
        }
        InterfaceC1421 interfaceC1421 = (InterfaceC1421) objM2905;
        InterfaceC2962 interfaceC2962Mo4426 = AbstractC1930.m2564(C2958.f6621, interfaceC1421, this.f3491).mo4426(new C1869(null, interfaceC1421, this.f3489, this.f3490));
        c2159.m2937(false);
        return interfaceC2962Mo4426;
    }
}
