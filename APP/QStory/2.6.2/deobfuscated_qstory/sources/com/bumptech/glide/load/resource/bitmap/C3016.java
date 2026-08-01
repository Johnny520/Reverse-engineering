package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.InterfaceC2988;
import java.io.File;
import p234.C8080;
import p286.C8396;
import p286.InterfaceC8399;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3016 implements InterfaceC8399 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f9620;

    public /* synthetic */ C3016(int i) {
        this.f9620 = i;
    }

    @Override // p286.InterfaceC8399
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC2988 mo6464(Object obj, int i, int i2, C8396 c8396) {
        switch (this.f9620) {
            case 0:
                return new C3017((Bitmap) obj, 0);
            case 1:
                return new C3017((File) obj);
            default:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new C8080(drawable, 1);
                }
                return null;
        }
    }

    @Override // p286.InterfaceC8399
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ boolean mo6465(Object obj, C8396 c8396) {
        switch (this.f9620) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }
}
