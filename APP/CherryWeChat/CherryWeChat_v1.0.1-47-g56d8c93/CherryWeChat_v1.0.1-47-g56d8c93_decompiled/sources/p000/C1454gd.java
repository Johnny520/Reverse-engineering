package p000;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.util.Log;
import android.util.Size;

/* JADX INFO: renamed from: gd */
/* JADX INFO: loaded from: classes.dex */
public final class C1454gd implements ImageDecoder.OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a */
    public final C2377pk f5150a = C2377pk.m4818a();

    /* JADX INFO: renamed from: b */
    public final int f5151b;

    /* JADX INFO: renamed from: c */
    public final int f5152c;

    /* JADX INFO: renamed from: d */
    public final EnumC0191Ec f5153d;

    /* JADX INFO: renamed from: e */
    public final C2457re f5154e;

    /* JADX INFO: renamed from: f */
    public final boolean f5155f;

    /* JADX INFO: renamed from: g */
    public final EnumC1383eu f5156g;

    public C1454gd(int i, int i2, C2644vt c2644vt) {
        this.f5151b = i;
        this.f5152c = i2;
        this.f5153d = (EnumC0191Ec) c2644vt.m5177c(C2543te.f8847f);
        this.f5154e = (C2457re) c2644vt.m5177c(C2457re.f8661g);
        C2601ut c2601ut = C2543te.f8850i;
        this.f5155f = c2644vt.m5177c(c2601ut) != null && ((Boolean) c2644vt.m5177c(c2601ut)).booleanValue();
        this.f5156g = (EnumC1383eu) c2644vt.m5177c(C2543te.f8848g);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        C2377pk c2377pk = this.f5150a;
        int width = this.f5151b;
        int height = this.f5152c;
        if (c2377pk.m4820c(width, height, this.f5155f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f5153d == EnumC0191Ec.f577b) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C1410fd());
        Size size = imageInfo.getSize();
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fM4949b = this.f5154e.m4949b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fM4949b);
        int iRound2 = Math.round(fM4949b * size.getHeight());
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        EnumC1383eu enumC1383eu = this.f5156g;
        if (enumC1383eu != null) {
            imageDecoder.setTargetColorSpace(ColorSpace.get((enumC1383eu == EnumC1383eu.f4928a && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
        }
    }
}
