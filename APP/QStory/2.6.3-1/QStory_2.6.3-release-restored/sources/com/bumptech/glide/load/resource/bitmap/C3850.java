package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.InterfaceC3821;
import java.io.File;
import p238.AbstractC8818;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3850 implements InterfaceC3821 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f9968;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f9969;

    public C3850(byte[] bArr) {
        this.f9969 = 3;
        AbstractC8818.m14028(bArr, "Argument must not be null");
        this.f9968 = bArr;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3821
    public final Object get() {
        switch (this.f9969) {
            case 0:
                return (Bitmap) this.f9968;
            case 1:
                return (File) this.f9968;
            case 2:
                return (AnimatedImageDrawable) this.f9968;
            default:
                return (byte[]) this.f9968;
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3821
    public final void recycle() {
        switch (this.f9969) {
            case 2:
                ((AnimatedImageDrawable) this.f9968).stop();
                ((AnimatedImageDrawable) this.f9968).clearAnimationCallbacks();
                break;
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3821
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Class mo7030() {
        switch (this.f9969) {
            case 0:
                return Bitmap.class;
            case 1:
                return ((File) this.f9968).getClass();
            case 2:
                return Drawable.class;
            default:
                return byte[].class;
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3821
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo7031() {
        switch (this.f9969) {
            case 0:
                return AbstractC8818.m14027((Bitmap) this.f9968);
            case 1:
                return 1;
            case 2:
                return AbstractC8818.m14034(Bitmap.Config.ARGB_8888) * ((AnimatedImageDrawable) this.f9968).getIntrinsicHeight() * ((AnimatedImageDrawable) this.f9968).getIntrinsicWidth() * 2;
            default:
                return ((byte[]) this.f9968).length;
        }
    }

    public /* synthetic */ C3850(Object obj, int i) {
        this.f9969 = i;
        this.f9968 = obj;
    }

    public C3850(File file) {
        this.f9969 = 1;
        AbstractC8818.m14028(file, "Argument must not be null");
        this.f9968 = file;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    private final void m7086() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    private final void m7087() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    private final void m7088() {
    }
}
