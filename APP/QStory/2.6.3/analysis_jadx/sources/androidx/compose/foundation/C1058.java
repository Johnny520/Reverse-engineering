package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C0573;
import androidx.compose.foundation.interaction.InterfaceC0580;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;
import p052.InterfaceC6543;
import p052.InterfaceC6551;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1058 implements InterfaceC6551 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6543 f3144;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6543 f3145;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1016 f3146;

    public C1058(InterfaceC1016 interfaceC1016, InterfaceC6543 interfaceC6543, InterfaceC6543 interfaceC65432) {
        this.f3146 = interfaceC1016;
        this.f3144 = interfaceC6543;
        this.f3145 = interfaceC65432;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        C1324 c1324 = (C1324) ((InterfaceC1373) obj2);
        c1324.m2392(-1525724089);
        Object objM2345 = c1324.m2345();
        if (objM2345 == C1369.f3974) {
            objM2345 = new C0573();
            c1324.m2386(objM2345);
        }
        InterfaceC0580 interfaceC0580 = (InterfaceC0580) objM2345;
        InterfaceC2129 interfaceC2129Mo3866 = AbstractC1092.m2004(C2125.f6276, interfaceC0580, this.f3146).mo3866(new C1031(null, interfaceC0580, this.f3144, this.f3145));
        c1324.m2377(false);
        return interfaceC2129Mo3866;
    }
}
