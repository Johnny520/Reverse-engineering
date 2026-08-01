package top.suzhelan.qstory.ui.components;

import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.InterfaceC2129;
import java.util.List;
import kotlin.C5175;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p354.C8888;

/* JADX INFO: renamed from: top.suzhelan.qstory.ui.components.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5976 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ int f16235;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f16236;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ Object f16237;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ Object f16238;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2129 f16239;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ boolean f16240;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16241 = 1;

    public /* synthetic */ C5976(String str, InterfaceC2129 interfaceC2129, boolean z, InterfaceC6542 interfaceC6542, int i, int i2) {
        this.f16237 = str;
        this.f16239 = interfaceC2129;
        this.f16240 = z;
        this.f16238 = interfaceC6542;
        this.f16236 = i;
        this.f16235 = i2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f16241;
        C5175 c5175 = C5175.f14739;
        Object obj3 = this.f16238;
        Object obj4 = this.f16237;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM2460 = AbstractC1367.m2460(this.f16235 | 1);
                AbstractC5963.m11283((C8888) obj4, (List) obj3, this.f16236, this.f16240, this.f16239, (InterfaceC1373) obj, iM2460);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM24602 = AbstractC1367.m2460(this.f16236 | 1);
                AbstractC5963.m11288((String) obj4, this.f16239, this.f16240, (InterfaceC6542) obj3, (InterfaceC1373) obj, iM24602, this.f16235);
                break;
        }
        return c5175;
    }

    public /* synthetic */ C5976(C8888 c8888, List list, int i, boolean z, InterfaceC2129 interfaceC2129, int i2) {
        this.f16237 = c8888;
        this.f16238 = list;
        this.f16236 = i;
        this.f16240 = z;
        this.f16239 = interfaceC2129;
        this.f16235 = i2;
    }
}
