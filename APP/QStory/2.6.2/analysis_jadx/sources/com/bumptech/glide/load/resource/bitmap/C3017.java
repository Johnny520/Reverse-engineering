package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.InterfaceC2988;
import java.io.File;
import p222.AbstractC7988;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3017 implements InterfaceC2988 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f9621;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f9622;

    public C3017(byte[] bArr) {
        this.f9622 = 3;
        AbstractC7988.m13441(bArr, "Argument must not be null");
        this.f9621 = bArr;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2988
    public final Object get() {
        switch (this.f9622) {
            case 0:
                return (Bitmap) this.f9621;
            case 1:
                return (File) this.f9621;
            case 2:
                return (AnimatedImageDrawable) this.f9621;
            default:
                return (byte[]) this.f9621;
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2988
    public final void recycle() {
        switch (this.f9622) {
            case 2:
                ((AnimatedImageDrawable) this.f9621).stop();
                ((AnimatedImageDrawable) this.f9621).clearAnimationCallbacks();
                break;
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2988
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Class mo6412() {
        switch (this.f9622) {
            case 0:
                return Bitmap.class;
            case 1:
                return ((File) this.f9621).getClass();
            case 2:
                return Drawable.class;
            default:
                return byte[].class;
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2988
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo6413() {
        switch (this.f9622) {
            case 0:
                return AbstractC7988.m13440((Bitmap) this.f9621);
            case 1:
                return 1;
            case 2:
                return AbstractC7988.m13447(Bitmap.Config.ARGB_8888) * ((AnimatedImageDrawable) this.f9621).getIntrinsicHeight() * ((AnimatedImageDrawable) this.f9621).getIntrinsicWidth() * 2;
            default:
                return ((byte[]) this.f9621).length;
        }
    }

    public /* synthetic */ C3017(Object obj, int i) {
        this.f9622 = i;
        this.f9621 = obj;
    }

    public C3017(File file) {
        this.f9622 = 1;
        AbstractC7988.m13441(file, "Argument must not be null");
        this.f9621 = file;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    private final void m6466() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    private final void m6467() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    private final void m6468() {
    }
}
