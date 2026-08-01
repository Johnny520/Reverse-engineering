package androidx.compose.foundation.text;

import androidx.compose.foundation.lazy.layout.C1554;
import androidx.compose.runtime.InterfaceC2230;
import kotlin.C6008;
import p068.InterfaceC7387;
import p128.C8158;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1842 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2230 f3288;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3289;

    public /* synthetic */ C1842(InterfaceC2230 interfaceC2230, int i) {
        this.f3289 = i;
        this.f3288 = interfaceC2230;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f3289;
        InterfaceC2230 interfaceC2230 = this.f3288;
        switch (i) {
            case 0:
                return new C1554(interfaceC2230, 4);
            default:
                ((InterfaceC7387) interfaceC2230.getValue()).invoke((C8158) obj);
                return C6008.f15084;
        }
    }
}
