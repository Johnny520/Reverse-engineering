package androidx.compose.foundation.text.contextmenu.internal;

import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.runtime.InterfaceC2230;
import io.ktor.util.C5043;
import p068.InterfaceC7372;
import p192.AbstractC8570;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1652 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2230 f2661;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2662;

    public /* synthetic */ C1652(InterfaceC2230 interfaceC2230, int i) {
        this.f2662 = i;
        this.f2661 = interfaceC2230;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f2662;
        InterfaceC2230 interfaceC2230 = this.f2661;
        switch (i) {
            case 0:
                InterfaceC2530 interfaceC2530 = (InterfaceC2530) interfaceC2230.getValue();
                if (interfaceC2530 == null) {
                    AbstractC8570.m13653("Required value was null.");
                    C5043.m9161();
                }
                break;
            default:
                InterfaceC2530 interfaceC25302 = (InterfaceC2530) interfaceC2230.getValue();
                if (interfaceC25302 == null) {
                    AbstractC8570.m13653("Required value was null.");
                    C5043.m9161();
                }
                break;
        }
        return null;
    }
}
