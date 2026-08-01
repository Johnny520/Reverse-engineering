package androidx.compose.p001ui.graphics.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import androidx.compose.p001ui.graphics.AbstractC2429;
import androidx.compose.p001ui.graphics.C2430;
import kotlin.coroutines.InterfaceC5189;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2362 implements InterfaceC2361 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f4764;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C2362 f4763 = new C2362(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2362 f4762 = new C2362(1);

    public /* synthetic */ C2362(int i) {
        this.f4764 = i;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2361
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo3366(C2351 c2351, InterfaceC5189 interfaceC5189) {
        switch (this.f4764) {
            case 0:
                long j = c2351.f4706;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (j >> 32), (int) (j & 4294967295L), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Canvas canvas2 = AbstractC2429.f5032;
                C2430 c2430 = new C2430();
                c2430.f5035 = canvas;
                c2351.m3355(c2430, null);
                return bitmapCreateBitmap;
            default:
                return Bitmap.createBitmap(new C2353(c2351));
        }
    }
}
