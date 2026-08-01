package androidx.compose.foundation.text.selection;

import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2208;
import kotlin.C6008;
import p068.InterfaceC7372;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1762 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2971;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f2972;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ boolean f2973;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f2974;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2975 = 0;

    public /* synthetic */ C1762(InterfaceC2962 interfaceC2962, InterfaceC7372 interfaceC7372, boolean z, int i) {
        this.f2972 = interfaceC2962;
        this.f2971 = interfaceC7372;
        this.f2973 = z;
        this.f2974 = i;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2975;
        C6008 c6008 = C6008.f15084;
        int i2 = this.f2974;
        Object obj3 = this.f2971;
        Object obj4 = this.f2972;
        boolean z = this.f2973;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC1733.m2364((InterfaceC2962) obj4, (InterfaceC7372) obj3, z, (InterfaceC2208) obj, AbstractC2202.m3031(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC1733.m2362(z, (ResolvedTextDirection) obj4, (C1720) obj3, (InterfaceC2208) obj, AbstractC2202.m3031(i2 | 1));
                break;
        }
        return c6008;
    }

    public /* synthetic */ C1762(boolean z, ResolvedTextDirection resolvedTextDirection, C1720 c1720, int i) {
        this.f2973 = z;
        this.f2972 = resolvedTextDirection;
        this.f2971 = c1720;
        this.f2974 = i;
    }
}
