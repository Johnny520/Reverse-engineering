package androidx.compose.foundation.gestures;

import kotlinx.coroutines.channels.C5201;
import kotlinx.coroutines.channels.InterfaceC5206;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0558 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5206 f1605;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1606;

    public /* synthetic */ C0558(InterfaceC5206 interfaceC5206, int i) {
        this.f1606 = i;
        this.f1605 = interfaceC5206;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f1606;
        InterfaceC5206 interfaceC5206 = this.f1605;
        switch (i) {
            case 0:
                return (C0559) C5201.m10268(interfaceC5206.mo10251());
            default:
                return (C0505) C5201.m10268(interfaceC5206.mo10251());
        }
    }
}
