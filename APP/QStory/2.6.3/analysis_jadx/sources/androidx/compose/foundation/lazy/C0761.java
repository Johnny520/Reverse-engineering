package androidx.compose.foundation.lazy;

import android.content.Context;
import androidx.compose.foundation.text.selection.C0922;
import androidx.compose.foundation.text.selection.SelectedTextType;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.InterfaceC1373;
import kotlin.C5176;
import kotlin.coroutines.InterfaceC4360;
import p052.InterfaceC6552;
import p194.C7832;
import top.suzhelan.qstory.ui.components.AbstractC5969;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0761 implements InterfaceC6552 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2225;

    public /* synthetic */ C0761(int i) {
        this.f2225 = i;
    }

    @Override // p052.InterfaceC6552
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f2225) {
            case 0:
                C0745 c0745 = (C0745) obj;
                ((Integer) obj2).getClass();
                InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((C1324) interfaceC1373).m2360(c0745) ? 4 : 2;
                }
                C1324 c1324 = (C1324) interfaceC1373;
                if (c1324.m2343(iIntValue & 1, (iIntValue & 131) != 130)) {
                    AbstractC5969.f16182.invoke(c0745, c1324, Integer.valueOf(iIntValue & 14));
                } else {
                    c1324.m2339();
                }
                return C5176.f14739;
            default:
                return new C0922((InterfaceC4360) obj, (Context) obj2, (SelectedTextType) obj3, (C7832) obj4);
        }
    }
}
