package androidx.compose.foundation.text;

import androidx.compose.foundation.lazy.layout.C0713;
import androidx.compose.runtime.InterfaceC1395;
import kotlin.C5176;
import p052.InterfaceC6558;
import p112.C7329;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1004 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1395 f2943;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2944;

    public /* synthetic */ C1004(InterfaceC1395 interfaceC1395, int i) {
        this.f2944 = i;
        this.f2943 = interfaceC1395;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f2944;
        InterfaceC1395 interfaceC1395 = this.f2943;
        switch (i) {
            case 0:
                return new C0713(interfaceC1395, 4);
            default:
                ((InterfaceC6558) interfaceC1395.getValue()).invoke((C7329) obj);
                return C5176.f14739;
        }
    }
}
