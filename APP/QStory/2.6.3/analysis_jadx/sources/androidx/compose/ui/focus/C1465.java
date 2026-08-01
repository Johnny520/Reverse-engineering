package androidx.compose.ui.focus;

import androidx.compose.ui.AbstractC2128;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.ui.focus.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1465 extends AbstractC2128 implements InterfaceC1462 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC6558 f4162;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public InterfaceC1456 f4163;

    @Override // androidx.compose.ui.focus.InterfaceC1462
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public final void mo1648(InterfaceC1456 interfaceC1456) {
        if (AbstractC4395.m8907(this.f4163, interfaceC1456)) {
            return;
        }
        this.f4163 = interfaceC1456;
        this.f4162.invoke(interfaceC1456);
    }
}
