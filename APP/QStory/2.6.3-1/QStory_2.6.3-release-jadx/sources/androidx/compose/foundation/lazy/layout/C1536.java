package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.C1603;
import androidx.compose.foundation.text.contextmenu.internal.AbstractC1642;
import androidx.compose.foundation.text.contextmenu.provider.InterfaceC1667;
import androidx.compose.foundation.text.selection.AbstractC1733;
import androidx.compose.foundation.text.selection.InterfaceC1756;
import androidx.compose.p001ui.InterfaceC2951;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.AbstractC2225;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.C2077;
import androidx.lifecycle.InterfaceC3221;
import androidx.lifecycle.compose.C3196;
import com.bumptech.glide.AbstractC3888;
import kotlin.C6008;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p132.C8168;
import p137.InterfaceC8221;
import p193.AbstractC8578;
import p193.C8575;
import p269.AbstractC9019;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1536 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2296;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f2297;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2298;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f2299;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2300;

    public /* synthetic */ C1536(InterfaceC2962 interfaceC2962, C8575 c8575, InterfaceC7387 interfaceC7387, int i, int i2) {
        this.f2300 = 8;
        this.f2297 = interfaceC2962;
        this.f2298 = c8575;
        this.f2296 = interfaceC7387;
        this.f2299 = i2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2300;
        int i2 = this.f2299;
        Object obj3 = this.f2296;
        Object obj4 = this.f2298;
        C6008 c6008 = C6008.f15084;
        Object obj5 = this.f2297;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM3031 = AbstractC2202.m3031(1);
                AbstractC1563.m2078((C1603) obj5, this.f2298, this.f2299, this.f2296, (InterfaceC2208) obj, iM3031);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((C1524) obj5).mo2042(obj4, (C2077) obj3, (InterfaceC2208) obj, AbstractC2202.m3031(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                AbstractC1642.m2188((InterfaceC8221) obj5, (InterfaceC1667) obj4, (InterfaceC7372) obj3, (InterfaceC2208) obj, AbstractC2202.m3031(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC3888.m7264((InterfaceC2962) obj5, (AbstractC2225) obj4, (C2077) obj3, (InterfaceC2208) obj, AbstractC2202.m3031(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC1733.m2366((InterfaceC1756) obj5, (InterfaceC2951) obj4, (C2077) obj3, (InterfaceC2208) obj, AbstractC2202.m3031(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((C2077) obj5).m2704(obj4, obj3, (InterfaceC2208) obj, AbstractC2202.m3031(i2) | 1);
                break;
            case 6:
                ((Integer) obj2).intValue();
                AbstractC9019.m14247((InterfaceC3221) obj5, (C3196) obj4, (InterfaceC7387) obj3, (InterfaceC2208) obj, AbstractC2202.m3031(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((C8168) obj5).mo2042(obj4, (C2077) obj3, (InterfaceC2208) obj, AbstractC2202.m3031(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                AbstractC8578.m13666((InterfaceC2962) obj5, (C8575) obj4, (InterfaceC7387) obj3, (InterfaceC2208) obj, AbstractC2202.m3031(1), this.f2299);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC8578.m13667((C8575) obj5, (InterfaceC2962) obj4, (C2077) obj3, (InterfaceC2208) obj, AbstractC2202.m3031(i2 | 1));
                break;
        }
        return c6008;
    }

    public /* synthetic */ C1536(C1603 c1603, Object obj, int i, Object obj2, int i2) {
        this.f2300 = 0;
        this.f2297 = c1603;
        this.f2298 = obj;
        this.f2299 = i;
        this.f2296 = obj2;
    }

    public /* synthetic */ C1536(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.f2300 = i2;
        this.f2297 = obj;
        this.f2298 = obj2;
        this.f2296 = obj3;
        this.f2299 = i;
    }
}
