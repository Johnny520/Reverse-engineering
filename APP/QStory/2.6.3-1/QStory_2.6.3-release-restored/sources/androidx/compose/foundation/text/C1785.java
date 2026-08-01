package androidx.compose.foundation.text;

import io.ktor.util.C5043;
import kotlin.C6008;
import p068.InterfaceC7372;
import p192.AbstractC8570;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1785 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1787 f3040;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3041;

    public /* synthetic */ C1785(C1787 c1787, int i) {
        this.f3041 = i;
        this.f3040 = c1787;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f3041;
        C6008 c6008 = C6008.f15084;
        C1787 c1787 = this.f3040;
        switch (i) {
            case 0:
                if (c1787.f3046 == null) {
                    AbstractC8570.m13655("Font resolution state is not set.");
                    C5043.m9161();
                }
                break;
            default:
                if (c1787.f3046 == null) {
                    AbstractC8570.m13655("Font resolution state is not set.");
                    C5043.m9161();
                }
                break;
        }
        return null;
    }
}
