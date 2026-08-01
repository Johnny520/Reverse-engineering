package p226;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.C3031;
import com.bumptech.glide.load.resource.bitmap.C3036;
import com.bumptech.glide.load.resource.bitmap.C3039;
import p286.C8396;
import p286.C8397;

/* JADX INFO: renamed from: 飘花落叶言楪世子兰哲苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8004 implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f22109;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C3036 f22110;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final DecodeFormat f22111;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f22112;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f22113;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3031 f22114 = C3031.m6484();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final PreferredColorSpace f22115;

    public C8004(int i, int i2, C8396 c8396) {
        this.f22113 = i;
        this.f22112 = i2;
        this.f22111 = (DecodeFormat) c8396.m13947(C3039.f9675);
        this.f22110 = (C3036) c8396.m13947(C3036.f9669);
        C8397 c8397 = C3039.f9679;
        this.f22109 = c8396.m13947(c8397) != null && ((Boolean) c8396.m13947(c8397)).booleanValue();
        this.f22115 = (PreferredColorSpace) c8396.m13947(C3039.f9677);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        boolean z = this.f22109;
        C3031 c3031 = this.f22114;
        int width = this.f22113;
        int height = this.f22112;
        if (c3031.m6485(width, height, z, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f22111 == DecodeFormat.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C8005(this));
        Size size = imageInfo.getSize();
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fM6514 = this.f22110.m6514(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fM6514);
        int iRound2 = Math.round(size.getHeight() * fM6514);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fM6514);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        PreferredColorSpace preferredColorSpace = this.f22115;
        if (preferredColorSpace != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
