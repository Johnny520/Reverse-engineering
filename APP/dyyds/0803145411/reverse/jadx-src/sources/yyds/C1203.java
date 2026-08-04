package yyds;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.util.Log;
import android.util.Size;

/* JADX INFO: renamed from: yyds.ᛵᲁᛶᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1203 implements ImageDecoder.OnHeaderDecodedListener {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C1268 f5476;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C0434 f5477 = C0434.m1208();

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int f5478;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final EnumC1891 f5479;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f5480;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final boolean f5481;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final EnumC1896 f5482;

    public C1203(int i, int i2, C0822 c0822) {
        this.f5478 = i;
        this.f5480 = i2;
        this.f5482 = (EnumC1896) c0822.m1891(C2707.f13284);
        this.f5476 = (C1268) c0822.m1891(C1268.f5842);
        C2120 c2120 = C2707.f13280;
        this.f5481 = c0822.m1891(c2120) != null && ((Boolean) c0822.m1891(c2120)).booleanValue();
        this.f5479 = (EnumC1891) c0822.m1891(C2707.f13281);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        C0434 c0434 = this.f5477;
        int width = this.f5478;
        int height = this.f5480;
        if (c0434.m1209(width, height, this.f5481, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f5482 == EnumC1896.f9606) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C1562());
        Size size = imageInfo.getSize();
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fM2542 = this.f5476.m2542(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fM2542);
        int iRound2 = Math.round(size.getHeight() * fM2542);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fM2542);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        EnumC1891 enumC1891 = this.f5479;
        if (enumC1891 != null) {
            imageDecoder.setTargetColorSpace(ColorSpace.get((enumC1891 == EnumC1891.f9531 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
        }
    }
}
