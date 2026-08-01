package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.engine.InterfaceC2989;
import com.bumptech.glide.load.engine.InterfaceC3000;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2979;
import p222.AbstractC7989;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3026 implements InterfaceC2989, InterfaceC3000 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f9638;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f9639;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f9640 = 1;

    public C3026(Bitmap bitmap, InterfaceC2979 interfaceC2979) {
        AbstractC7989.m13469(bitmap, "Bitmap must not be null");
        this.f9638 = bitmap;
        AbstractC7989.m13469(interfaceC2979, "BitmapPool must not be null");
        this.f9639 = interfaceC2979;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C3026 m6536(Bitmap bitmap, InterfaceC2979 interfaceC2979) {
        if (bitmap == null) {
            return null;
        }
        return new C3026(bitmap, interfaceC2979);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2989
    public final Object get() {
        switch (this.f9640) {
            case 0:
                return (Bitmap) this.f9638;
            default:
                return new BitmapDrawable((Resources) this.f9638, (Bitmap) ((InterfaceC2989) this.f9639).get());
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3000
    public final void initialize() {
        switch (this.f9640) {
            case 0:
                ((Bitmap) this.f9638).prepareToDraw();
                break;
            default:
                InterfaceC2989 interfaceC2989 = (InterfaceC2989) this.f9639;
                if (interfaceC2989 instanceof InterfaceC3000) {
                    ((InterfaceC3000) interfaceC2989).initialize();
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2989
    public final void recycle() {
        switch (this.f9640) {
            case 0:
                ((InterfaceC2979) this.f9639).mo6455((Bitmap) this.f9638);
                break;
            default:
                ((InterfaceC2989) this.f9639).recycle();
                break;
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2989
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Class mo6470() {
        switch (this.f9640) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2989
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo6471() {
        switch (this.f9640) {
            case 0:
                return AbstractC7989.m13468((Bitmap) this.f9638);
            default:
                return ((InterfaceC2989) this.f9639).mo6471();
        }
    }

    public C3026(Resources resources, InterfaceC2989 interfaceC2989) {
        AbstractC7989.m13469(resources, "Argument must not be null");
        this.f9638 = resources;
        AbstractC7989.m13469(interfaceC2989, "Argument must not be null");
        this.f9639 = interfaceC2989;
    }
}
