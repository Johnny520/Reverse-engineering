package androidx.compose.foundation.lazy;

import android.content.Context;
import androidx.compose.foundation.text.selection.C1760;
import androidx.compose.foundation.text.selection.SelectedTextType;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.InterfaceC2208;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5192;
import p068.InterfaceC7381;
import p210.C8661;
import top.suzhelan.qstory.p015ui.components.AbstractC6799;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1602 implements InterfaceC7381 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2570;

    public /* synthetic */ C1602(int i) {
        this.f2570 = i;
    }

    @Override // p068.InterfaceC7381
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f2570) {
            case 0:
                C1586 c1586 = (C1586) obj;
                ((Integer) obj2).getClass();
                InterfaceC2208 interfaceC2208 = (InterfaceC2208) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((C2159) interfaceC2208).m2920(c1586) ? 4 : 2;
                }
                C2159 c2159 = (C2159) interfaceC2208;
                if (c2159.m2903(iIntValue & 1, (iIntValue & 131) != 130)) {
                    AbstractC6799.f16527.invoke(c1586, c2159, Integer.valueOf(iIntValue & 14));
                } else {
                    c2159.m2899();
                }
                return C6008.f15084;
            default:
                return new C1760((InterfaceC5192) obj, (Context) obj2, (SelectedTextType) obj3, (C8661) obj4);
        }
    }
}
