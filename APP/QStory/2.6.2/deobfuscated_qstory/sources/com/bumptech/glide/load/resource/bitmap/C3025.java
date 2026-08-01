package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.engine.InterfaceC2988;
import com.bumptech.glide.load.engine.InterfaceC2999;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2978;
import p222.AbstractC7988;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3025 implements InterfaceC2988, InterfaceC2999 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f9636;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f9637;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f9638 = 1;

    public C3025(Bitmap bitmap, InterfaceC2978 interfaceC2978) {
        AbstractC7988.m13441(bitmap, "Bitmap must not be null");
        this.f9636 = bitmap;
        AbstractC7988.m13441(interfaceC2978, "BitmapPool must not be null");
        this.f9637 = interfaceC2978;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C3025 m6476(Bitmap bitmap, InterfaceC2978 interfaceC2978) {
        if (bitmap == null) {
            return null;
        }
        return new C3025(bitmap, interfaceC2978);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2988
    public final Object get() {
        switch (this.f9638) {
            case 0:
                return (Bitmap) this.f9636;
            default:
                return new BitmapDrawable((Resources) this.f9636, (Bitmap) ((InterfaceC2988) this.f9637).get());
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2999
    public final void initialize() {
        switch (this.f9638) {
            case 0:
                ((Bitmap) this.f9636).prepareToDraw();
                break;
            default:
                InterfaceC2988 interfaceC2988 = (InterfaceC2988) this.f9637;
                if (interfaceC2988 instanceof InterfaceC2999) {
                    ((InterfaceC2999) interfaceC2988).initialize();
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2988
    public final void recycle() {
        switch (this.f9638) {
            case 0:
                ((InterfaceC2978) this.f9637).mo6397((Bitmap) this.f9636);
                break;
            default:
                ((InterfaceC2988) this.f9637).recycle();
                break;
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2988
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Class mo6412() {
        switch (this.f9638) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2988
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo6413() {
        switch (this.f9638) {
            case 0:
                return AbstractC7988.m13440((Bitmap) this.f9636);
            default:
                return ((InterfaceC2988) this.f9637).mo6413();
        }
    }

    public C3025(Resources resources, InterfaceC2988 interfaceC2988) {
        AbstractC7988.m13441(resources, "Argument must not be null");
        this.f9636 = resources;
        AbstractC7988.m13441(interfaceC2988, "Argument must not be null");
        this.f9637 = interfaceC2988;
    }
}
