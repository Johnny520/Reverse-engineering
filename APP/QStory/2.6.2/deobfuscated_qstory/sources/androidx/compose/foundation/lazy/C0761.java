package androidx.compose.foundation.lazy;

import android.content.Context;
import androidx.compose.foundation.text.selection.C0922;
import androidx.compose.foundation.text.selection.SelectedTextType;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.InterfaceC1373;
import kotlin.C5175;
import kotlin.coroutines.InterfaceC4359;
import p052.InterfaceC6551;
import p194.C7831;
import top.suzhelan.qstory.ui.components.AbstractC5963;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0761 implements InterfaceC6551 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2224;

    public /* synthetic */ C0761(int i) {
        this.f2224 = i;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f2224) {
            case 0:
                C0745 c0745 = (C0745) obj;
                ((Integer) obj2).getClass();
                InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((C1324) interfaceC1373).m2350(c0745) ? 4 : 2;
                }
                C1324 c1324 = (C1324) interfaceC1373;
                if (c1324.m2333(iIntValue & 1, (iIntValue & 131) != 130)) {
                    AbstractC5963.f16173.invoke(c0745, c1324, Integer.valueOf(iIntValue & 14));
                } else {
                    c1324.m2329();
                }
                return C5175.f14739;
            default:
                return new C0922((InterfaceC4359) obj, (Context) obj2, (SelectedTextType) obj3, (C7831) obj4);
        }
    }
}
