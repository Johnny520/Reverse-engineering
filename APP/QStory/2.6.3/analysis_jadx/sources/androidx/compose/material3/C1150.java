package androidx.compose.material3;

import androidx.compose.runtime.C1324;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1242;
import kotlin.C5176;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1150 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1242 f3308;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C1166 f3309;

    public C1150(C1166 c1166, C1242 c1242) {
        this.f3309 = c1166;
        this.f3308 = c1242;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj;
        int iIntValue = ((Number) obj2).intValue();
        C1324 c1324 = (C1324) interfaceC1373;
        if (c1324.m2343(iIntValue & 1, (iIntValue & 3) != 2)) {
            AbstractC1168.m2026(this.f3309.f3353, this.f3308, c1324, 0);
        } else {
            c1324.m2339();
        }
        return C5176.f14739;
    }
}
