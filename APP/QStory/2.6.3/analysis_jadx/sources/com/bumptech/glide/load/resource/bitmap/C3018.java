package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.InterfaceC2989;
import java.io.File;
import p222.AbstractC7989;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3018 implements InterfaceC2989 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f9623;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f9624;

    public C3018(byte[] bArr) {
        this.f9624 = 3;
        AbstractC7989.m13469(bArr, "Argument must not be null");
        this.f9623 = bArr;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2989
    public final Object get() {
        switch (this.f9624) {
            case 0:
                return (Bitmap) this.f9623;
            case 1:
                return (File) this.f9623;
            case 2:
                return (AnimatedImageDrawable) this.f9623;
            default:
                return (byte[]) this.f9623;
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2989
    public final void recycle() {
        switch (this.f9624) {
            case 2:
                ((AnimatedImageDrawable) this.f9623).stop();
                ((AnimatedImageDrawable) this.f9623).clearAnimationCallbacks();
                break;
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2989
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Class mo6470() {
        switch (this.f9624) {
            case 0:
                return Bitmap.class;
            case 1:
                return ((File) this.f9623).getClass();
            case 2:
                return Drawable.class;
            default:
                return byte[].class;
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2989
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo6471() {
        switch (this.f9624) {
            case 0:
                return AbstractC7989.m13468((Bitmap) this.f9623);
            case 1:
                return 1;
            case 2:
                return AbstractC7989.m13475(Bitmap.Config.ARGB_8888) * ((AnimatedImageDrawable) this.f9623).getIntrinsicHeight() * ((AnimatedImageDrawable) this.f9623).getIntrinsicWidth() * 2;
            default:
                return ((byte[]) this.f9623).length;
        }
    }

    public /* synthetic */ C3018(Object obj, int i) {
        this.f9624 = i;
        this.f9623 = obj;
    }

    public C3018(File file) {
        this.f9624 = 1;
        AbstractC7989.m13469(file, "Argument must not be null");
        this.f9623 = file;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    private final void m6526() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    private final void m6527() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    private final void m6528() {
    }
}
