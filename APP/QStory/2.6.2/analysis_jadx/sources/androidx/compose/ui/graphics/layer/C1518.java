package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Picture;
import androidx.compose.ui.graphics.AbstractC1594;
import androidx.compose.ui.graphics.C1595;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1518 extends Picture {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1516 f4374;

    public C1518(C1516 c1516) {
        this.f4374 = c1516;
    }

    @Override // android.graphics.Picture
    public final Canvas beginRecording(int i, int i2) {
        return new Canvas();
    }

    @Override // android.graphics.Picture
    public final void draw(Canvas canvas) {
        Canvas canvas2 = AbstractC1594.f4686;
        C1595 c1595 = new C1595();
        c1595.f4689 = canvas;
        this.f4374.m2785(c1595, null);
    }

    @Override // android.graphics.Picture
    public final int getHeight() {
        return (int) (this.f4374.f4360 & 4294967295L);
    }

    @Override // android.graphics.Picture
    public final int getWidth() {
        return (int) (this.f4374.f4360 >> 32);
    }

    @Override // android.graphics.Picture
    public final boolean requiresHardwareAcceleration() {
        return true;
    }

    @Override // android.graphics.Picture
    public final void endRecording() {
    }
}
