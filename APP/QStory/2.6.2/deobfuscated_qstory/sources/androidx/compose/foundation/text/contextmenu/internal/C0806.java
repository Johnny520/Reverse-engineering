package androidx.compose.foundation.text.contextmenu.internal;

import android.graphics.drawable.Drawable;
import androidx.compose.foundation.text.contextmenu.provider.InterfaceC0827;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1373;
import kotlin.C5175;
import p052.InterfaceC6553;
import p121.C7387;
import p121.InterfaceC7391;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0806 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2301;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2302;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2303 = 2;

    public /* synthetic */ C0806(C0787 c0787, Drawable drawable, int i) {
        this.f2302 = c0787;
        this.f2301 = drawable;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2303;
        C5175 c5175 = C5175.f14739;
        Object obj3 = this.f2301;
        Object obj4 = this.f2302;
        switch (i) {
            case 0:
                InterfaceC0827 interfaceC0827 = (InterfaceC0827) obj4;
                InterfaceC7391 interfaceC7391 = (InterfaceC7391) obj3;
                InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1324 c1324 = (C1324) interfaceC1373;
                if (!c1324.m2333(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c1324.m2329();
                } else {
                    boolean zM2350 = c1324.m2350(interfaceC0827);
                    Object objM2335 = c1324.m2335();
                    if (zM2350 || objM2335 == C1369.f3973) {
                        objM2335 = AbstractC1367.m2486(new DefaultTextContextMenuDropdownProvider_androidKt$OpenContextMenu$2$data$2$1(interfaceC0827));
                        c1324.m2376(objM2335);
                    }
                    AbstractC0802.m1620(interfaceC7391, (C7387) ((InterfaceC1333) objM2335).getValue(), c1324, 0);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC0802.m1620((InterfaceC7391) obj3, (C7387) obj4, (InterfaceC1373) obj, AbstractC1367.m2460(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((C0787) obj4).m1584((Drawable) obj3, (InterfaceC1373) obj, AbstractC1367.m2460(49));
                break;
        }
        return c5175;
    }

    public /* synthetic */ C0806(InterfaceC0827 interfaceC0827, InterfaceC7391 interfaceC7391) {
        this.f2302 = interfaceC0827;
        this.f2301 = interfaceC7391;
    }

    public /* synthetic */ C0806(InterfaceC7391 interfaceC7391, C7387 c7387, int i) {
        this.f2301 = interfaceC7391;
        this.f2302 = c7387;
    }
}
