package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import androidx.compose.foundation.interaction.C0566;
import androidx.compose.foundation.interaction.C0572;
import androidx.compose.foundation.interaction.C0575;
import androidx.compose.foundation.interaction.C0576;
import androidx.compose.foundation.interaction.C0578;
import androidx.compose.foundation.interaction.InterfaceC0582;
import androidx.compose.runtime.AbstractC1346;
import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.InterfaceC1398;
import androidx.compose.ui.platform.C1868;
import kotlin.C5175;
import kotlin.coroutines.InterfaceC4356;
import kotlinx.coroutines.flow.InterfaceC5317;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0861 implements InterfaceC5317 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2416;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2417;

    public /* synthetic */ C0861(Object obj, int i) {
        this.f2417 = i;
        this.f2416 = obj;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5317
    public final Object emit(Object obj, InterfaceC4356 interfaceC4356) {
        int i = this.f2417;
        C5175 c5175 = C5175.f14739;
        Object obj2 = this.f2416;
        switch (i) {
            case 0:
                C0867 c0867 = (C0867) ((InterfaceC0863) obj2);
                if (Build.VERSION.SDK_INT >= 34) {
                    c0867.m1684().startStylusHandwriting(c0867.f2442);
                } else {
                    c0867.getClass();
                }
                return c5175;
            case 1:
                ((C0873) obj2).getClass();
                throw null;
            case 2:
                if (((InterfaceC0582) obj) instanceof C0576) {
                    ((InterfaceC6542) obj2).invoke();
                }
                return c5175;
            case 3:
                InterfaceC0582 interfaceC0582 = (InterfaceC0582) obj;
                InterfaceC1398 interfaceC1398 = (InterfaceC1398) obj2;
                if ((interfaceC0582 instanceof C0575) || (interfaceC0582 instanceof C0566)) {
                    AbstractC1346 abstractC1346 = (AbstractC1346) interfaceC1398;
                    abstractC1346.m2423(abstractC1346.m2422() + 1);
                } else if ((interfaceC0582 instanceof C0576) || (interfaceC0582 instanceof C0578) || (interfaceC0582 instanceof C0572)) {
                    ((AbstractC1346) interfaceC1398).m2423(r1.m2422() - 1);
                }
                return c5175;
            default:
                ((AbstractC1349) ((C1868) obj2).f5371).m2425(((Number) obj).floatValue());
                return c5175;
        }
    }
}
