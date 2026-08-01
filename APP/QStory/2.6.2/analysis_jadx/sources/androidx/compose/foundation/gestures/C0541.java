package androidx.compose.foundation.gestures;

import androidx.compose.foundation.lazy.layout.C0724;
import androidx.compose.runtime.collection.C1224;
import java.util.concurrent.CancellationException;
import kotlin.C5175;
import kotlin.Result;
import kotlinx.coroutines.InterfaceC5446;
import p000.AbstractC6087;
import p048.C6518;
import p176.AbstractC7740;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0541 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1224 f1566;

    public C0541(int i) {
        switch (i) {
            case 1:
                this.f1566 = new C1224(0, new C0724[16]);
                break;
            default:
                this.f1566 = new C1224(0, new C0535[16]);
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m1313() {
        C1224 c1224 = this.f1566;
        C6518 c6518M11422 = AbstractC6087.m11422(0, c1224.f3519);
        int i = c6518M11422.f17822;
        int i2 = c6518M11422.f17820;
        if (i <= i2) {
            while (true) {
                ((C0535) c1224.f3520[i]).f1557.resumeWith(Result.m8755constructorimpl(C5175.f14739));
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        c1224.m2042();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m1314(CancellationException cancellationException) {
        C1224 c1224 = this.f1566;
        int i = c1224.f3519;
        InterfaceC5446[] interfaceC5446Arr = new InterfaceC5446[i];
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC5446Arr[i2] = ((C0535) c1224.f3520[i2]).f1557;
        }
        for (int i3 = 0; i3 < i; i3++) {
            interfaceC5446Arr[i3].mo10431(cancellationException);
        }
        if (c1224.f3519 == 0) {
            return;
        }
        AbstractC7740.m13067("uncancelled requests present");
    }
}
