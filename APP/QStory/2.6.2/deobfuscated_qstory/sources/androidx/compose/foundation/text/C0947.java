package androidx.compose.foundation.text;

import io.ktor.util.C4210;
import kotlin.C5175;
import p052.InterfaceC6542;
import p176.AbstractC7740;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0947 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0949 f2694;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2695;

    public /* synthetic */ C0947(C0949 c0949, int i) {
        this.f2695 = i;
        this.f2694 = c0949;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f2695;
        C5175 c5175 = C5175.f14739;
        C0949 c0949 = this.f2694;
        switch (i) {
            case 0:
                if (c0949.f2700 == null) {
                    AbstractC7740.m13068("Font resolution state is not set.");
                    C4210.m8612();
                }
                break;
            default:
                if (c0949.f2700 == null) {
                    AbstractC7740.m13068("Font resolution state is not set.");
                    C4210.m8612();
                }
                break;
        }
        return null;
    }
}
