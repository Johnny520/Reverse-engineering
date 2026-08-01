package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import androidx.compose.foundation.interaction.C1407;
import androidx.compose.foundation.interaction.C1413;
import androidx.compose.foundation.interaction.C1416;
import androidx.compose.foundation.interaction.C1417;
import androidx.compose.foundation.interaction.C1419;
import androidx.compose.foundation.interaction.InterfaceC1423;
import androidx.compose.p001ui.platform.C2703;
import androidx.compose.runtime.AbstractC2181;
import androidx.compose.runtime.AbstractC2184;
import androidx.compose.runtime.InterfaceC2233;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlinx.coroutines.flow.InterfaceC6150;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1699 implements InterfaceC6150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2762;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2763;

    public /* synthetic */ C1699(Object obj, int i) {
        this.f2763 = i;
        this.f2762 = obj;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6150
    public final Object emit(Object obj, InterfaceC5189 interfaceC5189) {
        int i = this.f2763;
        C6008 c6008 = C6008.f15084;
        Object obj2 = this.f2762;
        switch (i) {
            case 0:
                C1705 c1705 = (C1705) ((InterfaceC1701) obj2);
                if (Build.VERSION.SDK_INT >= 34) {
                    c1705.m2254().startStylusHandwriting(c1705.f2788);
                } else {
                    c1705.getClass();
                }
                return c6008;
            case 1:
                ((C1711) obj2).getClass();
                throw null;
            case 2:
                if (((InterfaceC1423) obj) instanceof C1417) {
                    ((InterfaceC7372) obj2).invoke();
                }
                return c6008;
            case 3:
                InterfaceC1423 interfaceC1423 = (InterfaceC1423) obj;
                InterfaceC2233 interfaceC2233 = (InterfaceC2233) obj2;
                if ((interfaceC1423 instanceof C1416) || (interfaceC1423 instanceof C1407)) {
                    AbstractC2181 abstractC2181 = (AbstractC2181) interfaceC2233;
                    abstractC2181.m2993(abstractC2181.m2992() + 1);
                } else if ((interfaceC1423 instanceof C1417) || (interfaceC1423 instanceof C1419) || (interfaceC1423 instanceof C1413)) {
                    ((AbstractC2181) interfaceC2233).m2993(r1.m2992() - 1);
                }
                return c6008;
            default:
                ((AbstractC2184) ((C2703) obj2).f5717).m2995(((Number) obj).floatValue());
                return c6008;
        }
    }
}
