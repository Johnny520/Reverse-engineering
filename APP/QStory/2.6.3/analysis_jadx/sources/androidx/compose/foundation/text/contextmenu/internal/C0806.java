package androidx.compose.foundation.text.contextmenu.internal;

import android.graphics.drawable.Drawable;
import androidx.compose.foundation.text.contextmenu.provider.InterfaceC0827;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1373;
import kotlin.C5176;
import p052.InterfaceC6554;
import p121.C7388;
import p121.InterfaceC7392;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0806 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2302;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2303;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2304 = 2;

    public /* synthetic */ C0806(C0787 c0787, Drawable drawable, int i) {
        this.f2303 = c0787;
        this.f2302 = drawable;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2304;
        C5176 c5176 = C5176.f14739;
        Object obj3 = this.f2302;
        Object obj4 = this.f2303;
        switch (i) {
            case 0:
                InterfaceC0827 interfaceC0827 = (InterfaceC0827) obj4;
                InterfaceC7392 interfaceC7392 = (InterfaceC7392) obj3;
                InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1324 c1324 = (C1324) interfaceC1373;
                if (!c1324.m2343(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c1324.m2339();
                } else {
                    boolean zM2360 = c1324.m2360(interfaceC0827);
                    Object objM2345 = c1324.m2345();
                    if (zM2360 || objM2345 == C1369.f3974) {
                        objM2345 = AbstractC1367.m2496(new DefaultTextContextMenuDropdownProvider_androidKt$OpenContextMenu$2$data$2$1(interfaceC0827));
                        c1324.m2386(objM2345);
                    }
                    AbstractC0802.m1630(interfaceC7392, (C7388) ((InterfaceC1333) objM2345).getValue(), c1324, 0);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC0802.m1630((InterfaceC7392) obj3, (C7388) obj4, (InterfaceC1373) obj, AbstractC1367.m2471(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((C0787) obj4).m1594((Drawable) obj3, (InterfaceC1373) obj, AbstractC1367.m2471(49));
                break;
        }
        return c5176;
    }

    public /* synthetic */ C0806(InterfaceC0827 interfaceC0827, InterfaceC7392 interfaceC7392) {
        this.f2303 = interfaceC0827;
        this.f2302 = interfaceC7392;
    }

    public /* synthetic */ C0806(InterfaceC7392 interfaceC7392, C7388 c7388, int i) {
        this.f2302 = interfaceC7392;
        this.f2303 = c7388;
    }
}
