package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C0573;
import androidx.compose.foundation.interaction.InterfaceC0580;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;
import p052.InterfaceC6542;
import p052.InterfaceC6550;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1058 implements InterfaceC6550 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6542 f3143;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6542 f3144;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1016 f3145;

    public C1058(InterfaceC1016 interfaceC1016, InterfaceC6542 interfaceC6542, InterfaceC6542 interfaceC65422) {
        this.f3145 = interfaceC1016;
        this.f3143 = interfaceC6542;
        this.f3144 = interfaceC65422;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        C1324 c1324 = (C1324) ((InterfaceC1373) obj2);
        c1324.m2382(-1525724089);
        Object objM2335 = c1324.m2335();
        if (objM2335 == C1369.f3973) {
            objM2335 = new C0573();
            c1324.m2376(objM2335);
        }
        InterfaceC0580 interfaceC0580 = (InterfaceC0580) objM2335;
        InterfaceC2129 interfaceC2129Mo3856 = AbstractC1092.m1994(C2125.f6275, interfaceC0580, this.f3145).mo3856(new C1031(null, interfaceC0580, this.f3143, this.f3144));
        c1324.m2367(false);
        return interfaceC2129Mo3856;
    }
}
