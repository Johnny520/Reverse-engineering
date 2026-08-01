package p226;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.C3032;
import com.bumptech.glide.load.resource.bitmap.C3037;
import com.bumptech.glide.load.resource.bitmap.C3040;
import p286.C8397;
import p286.C8398;

/* JADX INFO: renamed from: 飘花落叶言楪世子兰哲苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8005 implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f22106;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C3037 f22107;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final DecodeFormat f22108;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f22109;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f22110;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3032 f22111 = C3032.m6544();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final PreferredColorSpace f22112;

    public C8005(int i, int i2, C8397 c8397) {
        this.f22110 = i;
        this.f22109 = i2;
        this.f22108 = (DecodeFormat) c8397.m13964(C3040.f9677);
        this.f22107 = (C3037) c8397.m13964(C3037.f9671);
        C8398 c8398 = C3040.f9681;
        this.f22106 = c8397.m13964(c8398) != null && ((Boolean) c8397.m13964(c8398)).booleanValue();
        this.f22112 = (PreferredColorSpace) c8397.m13964(C3040.f9679);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        boolean z = this.f22106;
        C3032 c3032 = this.f22111;
        int width = this.f22110;
        int height = this.f22109;
        if (c3032.m6545(width, height, z, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f22108 == DecodeFormat.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C8006(this));
        Size size = imageInfo.getSize();
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fM6574 = this.f22107.m6574(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fM6574);
        int iRound2 = Math.round(size.getHeight() * fM6574);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fM6574);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        PreferredColorSpace preferredColorSpace = this.f22112;
        if (preferredColorSpace != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
