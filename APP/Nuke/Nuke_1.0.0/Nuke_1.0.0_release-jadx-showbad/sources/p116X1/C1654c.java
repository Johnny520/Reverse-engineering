package p116X1;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import p078P1.C1146h;
import p078P1.C1147i;
import p078P1.EnumC1139a;
import p078P1.EnumC1148j;
import p121Y1.C1755p;
import p121Y1.C1757r;
import p121Y1.C1765z;

/* JADX INFO: renamed from: X1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1654c implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a */
    public final C1765z f5676a = C1765z.m3152a();

    /* JADX INFO: renamed from: b */
    public final int f5677b;

    /* JADX INFO: renamed from: c */
    public final int f5678c;

    /* JADX INFO: renamed from: d */
    public final EnumC1139a f5679d;

    /* JADX INFO: renamed from: e */
    public final C1755p f5680e;

    /* JADX INFO: renamed from: f */
    public final boolean f5681f;

    /* JADX INFO: renamed from: g */
    public final EnumC1148j f5682g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1654c(int i5, int i6, C1147i c1147i) {
        this.f5677b = i5;
        this.f5678c = i6;
        this.f5679d = (EnumC1139a) c1147i.m2201c(C1757r.f6040f);
        this.f5680e = (C1755p) c1147i.m2201c(C1755p.f6037g);
        C1146h c1146h = C1757r.f6043i;
        this.f5681f = c1147i.m2201c(c1146h) != null && ((Boolean) c1147i.m2201c(c1146h)).booleanValue();
        this.f5682g = (EnumC1148j) c1147i.m2201c(C1757r.f6041g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f5676a.m3154c(this.f5677b, this.f5678c, this.f5681f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f5679d == EnumC1139a.f3775e) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C1653b());
        Size size = imageInfo.getSize();
        int width = this.f5677b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f5678c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fM3127b = this.f5680e.m3127b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fM3127b);
        int iRound2 = Math.round(size.getHeight() * fM3127b);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fM3127b);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        EnumC1148j enumC1148j = this.f5682g;
        if (enumC1148j != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((enumC1148j == EnumC1148j.f3786d && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
