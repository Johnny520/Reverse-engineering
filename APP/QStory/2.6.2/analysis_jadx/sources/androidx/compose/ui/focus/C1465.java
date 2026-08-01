package androidx.compose.ui.focus;

import androidx.compose.ui.AbstractC2128;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.ui.focus.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1465 extends AbstractC2128 implements InterfaceC1462 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC6557 f4161;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public InterfaceC1456 f4162;

    @Override // androidx.compose.ui.focus.InterfaceC1462
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public final void mo1638(InterfaceC1456 interfaceC1456) {
        if (AbstractC4394.m8917(this.f4162, interfaceC1456)) {
            return;
        }
        this.f4162 = interfaceC1456;
        this.f4161.invoke(interfaceC1456);
    }
}
