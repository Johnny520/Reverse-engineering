package androidx.compose.animation.core;

import androidx.appcompat.widget.C0194;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1242;
import kotlin.C5176;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0356 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f1224;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f1225;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f1226;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1227;

    public /* synthetic */ C0356(int i, int i2, Object obj, Object obj2) {
        this.f1227 = i2;
        this.f1226 = obj;
        this.f1224 = obj2;
        this.f1225 = i;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f1227;
        C5176 c5176 = C5176.f14739;
        int i2 = this.f1225;
        Object obj3 = this.f1224;
        Object obj4 = this.f1226;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                ((C0364) obj4).m1068(obj3, (InterfaceC1373) obj, AbstractC1367.m2471(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                AbstractC1367.m2487((C0194) obj4, (InterfaceC6554) obj3, (InterfaceC1373) obj, AbstractC1367.m2471(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC1367.m2486((C0194[]) obj4, (InterfaceC6554) obj3, (InterfaceC1373) obj, AbstractC1367.m2471(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((C1242) obj4).m2146(obj3, (InterfaceC1373) obj, AbstractC1367.m2471(i2) | 1);
                break;
        }
        return c5176;
    }
}
