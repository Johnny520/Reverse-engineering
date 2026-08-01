package androidx.compose.foundation.gestures;

import androidx.compose.foundation.lazy.layout.C0724;
import androidx.compose.runtime.collection.C1224;
import androidx.window.area.AbstractC2567;
import java.util.concurrent.CancellationException;
import kotlin.C5176;
import kotlin.Result;
import kotlinx.coroutines.InterfaceC5447;
import p048.C6519;
import p176.AbstractC7741;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0541 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1224 f1567;

    public C0541(int i) {
        switch (i) {
            case 1:
                this.f1567 = new C1224(0, new C0724[16]);
                break;
            default:
                this.f1567 = new C1224(0, new C0535[16]);
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m1323() {
        C1224 c1224 = this.f1567;
        C6519 c6519M5067 = AbstractC2567.m5067(0, c1224.f3520);
        int i = c6519M5067.f17818;
        int i2 = c6519M5067.f17816;
        if (i <= i2) {
            while (true) {
                ((C0535) c1224.f3521[i]).f1558.resumeWith(Result.m8745constructorimpl(C5176.f14739));
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        c1224.m2052();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m1324(CancellationException cancellationException) {
        C1224 c1224 = this.f1567;
        int i = c1224.f3520;
        InterfaceC5447[] interfaceC5447Arr = new InterfaceC5447[i];
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC5447Arr[i2] = ((C0535) c1224.f3521[i2]).f1558;
        }
        for (int i3 = 0; i3 < i; i3++) {
            interfaceC5447Arr[i3].mo10435(cancellationException);
        }
        if (c1224.f3520 == 0) {
            return;
        }
        AbstractC7741.m13095("uncancelled requests present");
    }
}
