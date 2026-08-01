package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.engine.InterfaceC3821;
import com.bumptech.glide.load.engine.InterfaceC3832;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3811;
import p238.AbstractC8818;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3858 implements InterfaceC3821, InterfaceC3832 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f9983;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f9984;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f9985 = 1;

    public C3858(Bitmap bitmap, InterfaceC3811 interfaceC3811) {
        AbstractC8818.m14028(bitmap, "Bitmap must not be null");
        this.f9983 = bitmap;
        AbstractC8818.m14028(interfaceC3811, "BitmapPool must not be null");
        this.f9984 = interfaceC3811;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C3858 m7096(Bitmap bitmap, InterfaceC3811 interfaceC3811) {
        if (bitmap == null) {
            return null;
        }
        return new C3858(bitmap, interfaceC3811);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3821
    public final Object get() {
        switch (this.f9985) {
            case 0:
                return (Bitmap) this.f9983;
            default:
                return new BitmapDrawable((Resources) this.f9983, (Bitmap) ((InterfaceC3821) this.f9984).get());
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3832
    public final void initialize() {
        switch (this.f9985) {
            case 0:
                ((Bitmap) this.f9983).prepareToDraw();
                break;
            default:
                InterfaceC3821 interfaceC3821 = (InterfaceC3821) this.f9984;
                if (interfaceC3821 instanceof InterfaceC3832) {
                    ((InterfaceC3832) interfaceC3821).initialize();
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3821
    public final void recycle() {
        switch (this.f9985) {
            case 0:
                ((InterfaceC3811) this.f9984).mo7015((Bitmap) this.f9983);
                break;
            default:
                ((InterfaceC3821) this.f9984).recycle();
                break;
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3821
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Class mo7030() {
        switch (this.f9985) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3821
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo7031() {
        switch (this.f9985) {
            case 0:
                return AbstractC8818.m14027((Bitmap) this.f9983);
            default:
                return ((InterfaceC3821) this.f9984).mo7031();
        }
    }

    public C3858(Resources resources, InterfaceC3821 interfaceC3821) {
        AbstractC8818.m14028(resources, "Argument must not be null");
        this.f9983 = resources;
        AbstractC8818.m14028(interfaceC3821, "Argument must not be null");
        this.f9984 = interfaceC3821;
    }
}
