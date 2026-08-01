package androidx.compose.p001ui.layout;

import androidx.compose.p001ui.node.AbstractC2585;
import java.util.List;
import p068.InterfaceC7383;
import p221.C8727;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2508 extends AbstractC2585 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7383 f5243;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C2496 f5244;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2508(C2496 c2496, InterfaceC7383 interfaceC7383, String str) {
        super(str);
        this.f5244 = c2496;
        this.f5243 = interfaceC7383;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC2492 mo1666(InterfaceC2488 interfaceC2488, List list, long j) {
        C2496 c2496 = this.f5244;
        C2510 c2510 = c2496.f5213;
        c2510.f5253 = interfaceC2488.getLayoutDirection();
        c2510.f5251 = interfaceC2488.mo1816();
        c2510.f5252 = interfaceC2488.mo1817();
        boolean zMo2057 = interfaceC2488.mo2057();
        InterfaceC7383 interfaceC7383 = this.f5243;
        if (zMo2057 || c2496.f5219.f5465 == null) {
            c2496.f5212 = 0;
            InterfaceC2492 interfaceC2492 = (InterfaceC2492) interfaceC7383.invoke(c2510, new C8727(j));
            return new C2509(interfaceC2492, c2496, c2496.f5212, interfaceC2492, 1);
        }
        c2496.f5211 = 0;
        InterfaceC2492 interfaceC24922 = (InterfaceC2492) interfaceC7383.invoke(c2496.f5214, new C8727(j));
        return new C2509(interfaceC24922, c2496, c2496.f5211, interfaceC24922, 0);
    }
}
