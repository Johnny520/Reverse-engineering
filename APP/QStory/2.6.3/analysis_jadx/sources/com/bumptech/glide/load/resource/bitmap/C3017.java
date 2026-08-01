package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.InterfaceC2989;
import java.io.File;
import p234.C8081;
import p286.C8397;
import p286.InterfaceC8400;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3017 implements InterfaceC8400 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f9622;

    public /* synthetic */ C3017(int i) {
        this.f9622 = i;
    }

    @Override // p286.InterfaceC8400
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC2989 mo6524(Object obj, int i, int i2, C8397 c8397) {
        switch (this.f9622) {
            case 0:
                return new C3018((Bitmap) obj, 0);
            case 1:
                return new C3018((File) obj);
            default:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new C8081(drawable, 1);
                }
                return null;
        }
    }

    @Override // p286.InterfaceC8400
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ boolean mo6525(Object obj, C8397 c8397) {
        switch (this.f9622) {
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
