package androidx.compose.animation.core;

import androidx.appcompat.widget.C1041;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.C2077;
import kotlin.C6008;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1202 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f1569;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f1570;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f1571;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1572;

    public /* synthetic */ C1202(int i, int i2, Object obj, Object obj2) {
        this.f1572 = i2;
        this.f1571 = obj;
        this.f1569 = obj2;
        this.f1570 = i;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f1572;
        C6008 c6008 = C6008.f15084;
        int i2 = this.f1570;
        Object obj3 = this.f1569;
        Object obj4 = this.f1571;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                ((C1210) obj4).m1628(obj3, (InterfaceC2208) obj, AbstractC2202.m3031(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                AbstractC2202.m3047((C1041) obj4, (InterfaceC7383) obj3, (InterfaceC2208) obj, AbstractC2202.m3031(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC2202.m3046((C1041[]) obj4, (InterfaceC7383) obj3, (InterfaceC2208) obj, AbstractC2202.m3031(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((C2077) obj4).m2706(obj3, (InterfaceC2208) obj, AbstractC2202.m3031(i2) | 1);
                break;
        }
        return c6008;
    }
}
