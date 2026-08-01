package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import androidx.compose.ui.graphics.AbstractC1594;
import androidx.compose.ui.graphics.C1595;
import kotlin.coroutines.InterfaceC4356;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1527 implements InterfaceC1526 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f4418;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1527 f4417 = new C1527(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1527 f4416 = new C1527(1);

    public /* synthetic */ C1527(int i) {
        this.f4418 = i;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1526
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo2796(C1516 c1516, InterfaceC4356 interfaceC4356) {
        switch (this.f4418) {
            case 0:
                long j = c1516.f4360;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (j >> 32), (int) (j & 4294967295L), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Canvas canvas2 = AbstractC1594.f4686;
                C1595 c1595 = new C1595();
                c1595.f4689 = canvas;
                c1516.m2785(c1595, null);
                return bitmapCreateBitmap;
            default:
                return Bitmap.createBitmap(new C1518(c1516));
        }
    }
}
