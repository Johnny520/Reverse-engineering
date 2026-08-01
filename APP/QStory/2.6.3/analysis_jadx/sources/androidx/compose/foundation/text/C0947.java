package androidx.compose.foundation.text;

import io.ktor.util.C4211;
import kotlin.C5176;
import p052.InterfaceC6543;
import p176.AbstractC7741;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0947 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0949 f2695;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2696;

    public /* synthetic */ C0947(C0949 c0949, int i) {
        this.f2696 = i;
        this.f2695 = c0949;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f2696;
        C5176 c5176 = C5176.f14739;
        C0949 c0949 = this.f2695;
        switch (i) {
            case 0:
                if (c0949.f2701 == null) {
                    AbstractC7741.m13096("Font resolution state is not set.");
                    C4211.m8602();
                }
                break;
            default:
                if (c0949.f2701 == null) {
                    AbstractC7741.m13096("Font resolution state is not set.");
                    C4211.m8602();
                }
                break;
        }
        return null;
    }
}
