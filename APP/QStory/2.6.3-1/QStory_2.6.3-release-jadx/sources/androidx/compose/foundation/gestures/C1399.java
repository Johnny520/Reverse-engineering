package androidx.compose.foundation.gestures;

import kotlinx.coroutines.channels.C6034;
import kotlinx.coroutines.channels.InterfaceC6039;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1399 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6039 f1951;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1952;

    public /* synthetic */ C1399(InterfaceC6039 interfaceC6039, int i) {
        this.f1952 = i;
        this.f1951 = interfaceC6039;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f1952;
        InterfaceC6039 interfaceC6039 = this.f1951;
        switch (i) {
            case 0:
                return (C1400) C6034.m10831(interfaceC6039.mo10814());
            default:
                return (C1346) C6034.m10831(interfaceC6039.mo10814());
        }
    }
}
