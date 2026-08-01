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
import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlinx.coroutines.flow.InterfaceC5318;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0861 implements InterfaceC5318 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2417;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2418;

    public /* synthetic */ C0861(Object obj, int i) {
        this.f2418 = i;
        this.f2417 = obj;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5318
    public final Object emit(Object obj, InterfaceC4357 interfaceC4357) {
        int i = this.f2418;
        C5176 c5176 = C5176.f14739;
        Object obj2 = this.f2417;
        switch (i) {
            case 0:
                C0867 c0867 = (C0867) ((InterfaceC0863) obj2);
                if (Build.VERSION.SDK_INT >= 34) {
                    c0867.m1694().startStylusHandwriting(c0867.f2443);
                } else {
                    c0867.getClass();
                }
                return c5176;
            case 1:
                ((C0873) obj2).getClass();
                throw null;
            case 2:
                if (((InterfaceC0582) obj) instanceof C0576) {
                    ((InterfaceC6543) obj2).invoke();
                }
                return c5176;
            case 3:
                InterfaceC0582 interfaceC0582 = (InterfaceC0582) obj;
                InterfaceC1398 interfaceC1398 = (InterfaceC1398) obj2;
                if ((interfaceC0582 instanceof C0575) || (interfaceC0582 instanceof C0566)) {
                    AbstractC1346 abstractC1346 = (AbstractC1346) interfaceC1398;
                    abstractC1346.m2433(abstractC1346.m2432() + 1);
                } else if ((interfaceC0582 instanceof C0576) || (interfaceC0582 instanceof C0578) || (interfaceC0582 instanceof C0572)) {
                    ((AbstractC1346) interfaceC1398).m2433(r1.m2432() - 1);
                }
                return c5176;
            default:
                ((AbstractC1349) ((C1868) obj2).f5372).m2435(((Number) obj).floatValue());
                return c5176;
        }
    }
}
