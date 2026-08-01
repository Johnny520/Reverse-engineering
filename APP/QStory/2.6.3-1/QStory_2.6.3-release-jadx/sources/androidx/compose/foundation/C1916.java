package androidx.compose.foundation;

import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.runtime.AbstractC2182;
import kotlin.C6008;
import p068.InterfaceC7372;
import p128.C8158;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1916 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1914 f3551;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3552;

    public /* synthetic */ C1916(C1914 c1914, int i) {
        this.f3552 = i;
        this.f3551 = c1914;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f3552;
        C1914 c1914 = this.f3551;
        switch (i) {
            case 0:
                c1914.m2556();
                return C6008.f15084;
            case 1:
                return new C8158(c1914.f3539);
            default:
                InterfaceC2530 interfaceC2530 = (InterfaceC2530) ((AbstractC2182) c1914.f3544).getValue();
                return new C8158(interfaceC2530 != null ? interfaceC2530.mo3636(0L) : 9205357640488583168L);
        }
    }
}
