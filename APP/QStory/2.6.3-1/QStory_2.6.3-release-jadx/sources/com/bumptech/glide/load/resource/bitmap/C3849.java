package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.InterfaceC3821;
import java.io.File;
import p250.C8910;
import p302.C9226;
import p302.InterfaceC9229;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3849 implements InterfaceC9229 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f9967;

    public /* synthetic */ C3849(int i) {
        this.f9967 = i;
    }

    @Override // p302.InterfaceC9229
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC3821 mo7084(Object obj, int i, int i2, C9226 c9226) {
        switch (this.f9967) {
            case 0:
                return new C3850((Bitmap) obj, 0);
            case 1:
                return new C3850((File) obj);
            default:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new C8910(drawable, 1);
                }
                return null;
        }
    }

    @Override // p302.InterfaceC9229
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ boolean mo7085(Object obj, C9226 c9226) {
        switch (this.f9967) {
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
