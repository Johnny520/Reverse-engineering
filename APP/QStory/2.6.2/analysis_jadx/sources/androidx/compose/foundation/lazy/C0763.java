package androidx.compose.foundation.lazy;

import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.layout.InterfaceC1695;
import com.bumptech.glide.AbstractC3056;
import io.ktor.util.C4210;
import kotlin.C5175;
import p010.AbstractC6154;
import p052.InterfaceC6542;
import p176.AbstractC7740;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0763 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1395 f2229;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2230;

    public /* synthetic */ C0763(InterfaceC1395 interfaceC1395, int i) {
        this.f2230 = i;
        this.f2229 = interfaceC1395;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f2230;
        C5175 c5175 = C5175.f14739;
        InterfaceC1395 interfaceC1395 = this.f2229;
        switch (i) {
            case 0:
                break;
            case 1:
                InterfaceC1695 interfaceC1695 = (InterfaceC1695) interfaceC1395.getValue();
                if (interfaceC1695 == null) {
                    AbstractC7740.m13066("Required value was null.");
                    C4210.m8612();
                    break;
                }
                break;
            case 2:
                interfaceC1395.setValue(Boolean.TRUE);
                break;
            case 3:
                interfaceC1395.setValue(Boolean.FALSE);
                break;
            default:
                interfaceC1395.setValue(Boolean.FALSE);
                AbstractC6154.m11561(AbstractC3056.m6668(-3937690815229592999L));
                break;
        }
        return c5175;
    }
}
