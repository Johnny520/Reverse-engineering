package androidx.compose.foundation.text.contextmenu.internal;

import android.graphics.drawable.Drawable;
import androidx.compose.foundation.text.contextmenu.provider.InterfaceC1667;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.InterfaceC2168;
import androidx.compose.runtime.InterfaceC2208;
import kotlin.C6008;
import p068.InterfaceC7383;
import p137.C8217;
import p137.InterfaceC8221;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1646 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2647;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2648;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2649 = 2;

    public /* synthetic */ C1646(C1627 c1627, Drawable drawable, int i) {
        this.f2648 = c1627;
        this.f2647 = drawable;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2649;
        C6008 c6008 = C6008.f15084;
        Object obj3 = this.f2647;
        Object obj4 = this.f2648;
        switch (i) {
            case 0:
                InterfaceC1667 interfaceC1667 = (InterfaceC1667) obj4;
                InterfaceC8221 interfaceC8221 = (InterfaceC8221) obj3;
                InterfaceC2208 interfaceC2208 = (InterfaceC2208) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C2159 c2159 = (C2159) interfaceC2208;
                if (!c2159.m2903(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c2159.m2899();
                } else {
                    boolean zM2920 = c2159.m2920(interfaceC1667);
                    Object objM2905 = c2159.m2905();
                    if (zM2920 || objM2905 == C2204.f4319) {
                        objM2905 = AbstractC2202.m3056(new C0093x33611b20(interfaceC1667));
                        c2159.m2946(objM2905);
                    }
                    AbstractC1642.m2190(interfaceC8221, (C8217) ((InterfaceC2168) objM2905).getValue(), c2159, 0);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC1642.m2190((InterfaceC8221) obj3, (C8217) obj4, (InterfaceC2208) obj, AbstractC2202.m3031(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((C1627) obj4).m2154((Drawable) obj3, (InterfaceC2208) obj, AbstractC2202.m3031(49));
                break;
        }
        return c6008;
    }

    public /* synthetic */ C1646(InterfaceC1667 interfaceC1667, InterfaceC8221 interfaceC8221) {
        this.f2648 = interfaceC1667;
        this.f2647 = interfaceC8221;
    }

    public /* synthetic */ C1646(InterfaceC8221 interfaceC8221, C8217 c8217, int i) {
        this.f2647 = interfaceC8221;
        this.f2648 = c8217;
    }
}
