package androidx.compose.p001ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Picture;
import androidx.compose.p001ui.graphics.AbstractC2429;
import androidx.compose.p001ui.graphics.C2430;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2353 extends Picture {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2351 f4720;

    public C2353(C2351 c2351) {
        this.f4720 = c2351;
    }

    @Override // android.graphics.Picture
    public final Canvas beginRecording(int i, int i2) {
        return new Canvas();
    }

    @Override // android.graphics.Picture
    public final void draw(Canvas canvas) {
        Canvas canvas2 = AbstractC2429.f5032;
        C2430 c2430 = new C2430();
        c2430.f5035 = canvas;
        this.f4720.m3355(c2430, null);
    }

    @Override // android.graphics.Picture
    public final int getHeight() {
        return (int) (this.f4720.f4706 & 4294967295L);
    }

    @Override // android.graphics.Picture
    public final int getWidth() {
        return (int) (this.f4720.f4706 >> 32);
    }

    @Override // android.graphics.Picture
    public final boolean requiresHardwareAcceleration() {
        return true;
    }

    @Override // android.graphics.Picture
    public final void endRecording() {
    }
}
