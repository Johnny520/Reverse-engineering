package androidx.compose.material3;

import androidx.compose.runtime.C2159;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.C2077;
import kotlin.C6008;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1985 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C2077 f3653;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C2001 f3654;

    public C1985(C2001 c2001, C2077 c2077) {
        this.f3654 = c2001;
        this.f3653 = c2077;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2208 interfaceC2208 = (InterfaceC2208) obj;
        int iIntValue = ((Number) obj2).intValue();
        C2159 c2159 = (C2159) interfaceC2208;
        if (c2159.m2903(iIntValue & 1, (iIntValue & 3) != 2)) {
            AbstractC2003.m2586(this.f3654.f3698, this.f3653, c2159, 0);
        } else {
            c2159.m2899();
        }
        return C6008.f15084;
    }
}
