package androidx.compose.foundation.gestures;

import androidx.compose.foundation.lazy.layout.C1565;
import androidx.compose.runtime.collection.C2059;
import androidx.window.area.AbstractC3400;
import java.util.concurrent.CancellationException;
import kotlin.C6008;
import kotlin.Result;
import kotlinx.coroutines.InterfaceC6279;
import p064.C7348;
import p192.AbstractC8570;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1382 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2059 f1912;

    public C1382(int i) {
        switch (i) {
            case 1:
                this.f1912 = new C2059(0, new C1565[16]);
                break;
            default:
                this.f1912 = new C2059(0, new C1376[16]);
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m1883() {
        C2059 c2059 = this.f1912;
        C7348 c7348M5627 = AbstractC3400.m5627(0, c2059.f3865);
        int i = c7348M5627.f18163;
        int i2 = c7348M5627.f18161;
        if (i <= i2) {
            while (true) {
                ((C1376) c2059.f3866[i]).f1903.resumeWith(Result.m9304constructorimpl(C6008.f15084));
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        c2059.m2612();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m1884(CancellationException cancellationException) {
        C2059 c2059 = this.f1912;
        int i = c2059.f3865;
        InterfaceC6279[] interfaceC6279Arr = new InterfaceC6279[i];
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC6279Arr[i2] = ((C1376) c2059.f3866[i2]).f1903;
        }
        for (int i3 = 0; i3 < i; i3++) {
            interfaceC6279Arr[i3].mo10994(cancellationException);
        }
        if (c2059.f3865 == 0) {
            return;
        }
        AbstractC8570.m13654("uncancelled requests present");
    }
}
