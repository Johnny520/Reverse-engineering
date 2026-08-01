package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import androidx.compose.ui.graphics.AbstractC1594;
import androidx.compose.ui.graphics.C1595;
import kotlin.coroutines.InterfaceC4357;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1527 implements InterfaceC1526 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f4419;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1527 f4418 = new C1527(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1527 f4417 = new C1527(1);

    public /* synthetic */ C1527(int i) {
        this.f4419 = i;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1526
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo2806(C1516 c1516, InterfaceC4357 interfaceC4357) {
        switch (this.f4419) {
            case 0:
                long j = c1516.f4361;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (j >> 32), (int) (j & 4294967295L), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Canvas canvas2 = AbstractC1594.f4687;
                C1595 c1595 = new C1595();
                c1595.f4690 = canvas;
                c1516.m2795(c1595, null);
                return bitmapCreateBitmap;
            default:
                return Bitmap.createBitmap(new C1518(c1516));
        }
    }
}
