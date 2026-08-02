package p000;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class a60 implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a */
    public final ds0 f72a = ds0.m1114a();

    /* JADX INFO: renamed from: b */
    public final int f73b;

    /* JADX INFO: renamed from: c */
    public final int f74c;

    /* JADX INFO: renamed from: d */
    public final s40 f75d;

    /* JADX INFO: renamed from: e */
    public final va0 f76e;

    /* JADX INFO: renamed from: f */
    public final boolean f77f;

    /* JADX INFO: renamed from: g */
    public final n22 f78g;

    public a60(int i, int i2, ov1 ov1Var) {
        this.f73b = i;
        this.f74c = i2;
        this.f75d = (s40) ov1Var.m3643c(xa0.f12918f);
        this.f76e = (va0) ov1Var.m3643c(va0.f11861g);
        mv1 mv1Var = xa0.f12921i;
        this.f77f = ov1Var.m3643c(mv1Var) != null && ((Boolean) ov1Var.m3643c(mv1Var)).booleanValue();
        this.f78g = (n22) ov1Var.m3643c(xa0.f12919g);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        boolean z = this.f77f;
        ds0 ds0Var = this.f72a;
        int width = this.f73b;
        int height = this.f74c;
        if (ds0Var.m1116c(width, height, z, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f75d == s40.f9903i) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new z50());
        Size size = imageInfo.getSize();
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fM5659b = this.f76e.m5659b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fM5659b);
        int iRound2 = Math.round(size.getHeight() * fM5659b);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fM5659b);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        n22 n22Var = this.f78g;
        if (n22Var != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((n22Var == n22.f6971h && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
