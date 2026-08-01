package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.InterfaceC1013;
import androidx.compose.ui.input.pointer.AbstractC1646;
import androidx.compose.ui.input.pointer.C1643;
import kotlin.C5175;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0898 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1013 f2545;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2546;

    public /* synthetic */ C0898(InterfaceC1013 interfaceC1013, int i) {
        this.f2546 = i;
        this.f2545 = interfaceC1013;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f2546;
        C5175 c5175 = C5175.f14739;
        InterfaceC1013 interfaceC1013 = this.f2545;
        C1643 c1643 = (C1643) obj;
        switch (i) {
            case 0:
                interfaceC1013.mo1734(AbstractC1646.m3021(c1643, false));
                c1643.m3014();
                break;
            default:
                interfaceC1013.mo1734(AbstractC1646.m3021(c1643, false));
                c1643.m3014();
                break;
        }
        return c5175;
    }
}
