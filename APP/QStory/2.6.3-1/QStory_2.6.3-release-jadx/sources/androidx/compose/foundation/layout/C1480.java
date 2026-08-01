package androidx.compose.foundation.layout;

import androidx.compose.foundation.C1915;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.layout.InterfaceC2493;
import java.util.List;
import kotlin.collections.AbstractC5171;
import p221.C8727;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1480 implements InterfaceC2493 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f2141;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1480 f2140 = new C1480(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1480 f2139 = new C1480(1);

    public /* synthetic */ C1480(int i) {
        this.f2141 = i;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC2492 mo1666(InterfaceC2488 interfaceC2488, List list, long j) {
        switch (this.f2141) {
            case 0:
                return interfaceC2488.mo2055(C8727.m13900(j), C8727.m13899(j), AbstractC5171.m9335(), new C1915(2));
            default:
                return interfaceC2488.mo2055(C8727.m13890(j) ? C8727.m13896(j) : 0, C8727.m13891(j) ? C8727.m13897(j) : 0, AbstractC5171.m9335(), new C1915(2));
        }
    }
}
