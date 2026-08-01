package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.InterfaceC1013;
import androidx.compose.ui.input.pointer.AbstractC1646;
import androidx.compose.ui.input.pointer.C1643;
import kotlin.C5176;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0898 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1013 f2546;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2547;

    public /* synthetic */ C0898(InterfaceC1013 interfaceC1013, int i) {
        this.f2547 = i;
        this.f2546 = interfaceC1013;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f2547;
        C5176 c5176 = C5176.f14739;
        InterfaceC1013 interfaceC1013 = this.f2546;
        C1643 c1643 = (C1643) obj;
        switch (i) {
            case 0:
                interfaceC1013.mo1744(AbstractC1646.m3031(c1643, false));
                c1643.m3024();
                break;
            default:
                interfaceC1013.mo1744(AbstractC1646.m3031(c1643, false));
                c1643.m3024();
                break;
        }
        return c5176;
    }
}
