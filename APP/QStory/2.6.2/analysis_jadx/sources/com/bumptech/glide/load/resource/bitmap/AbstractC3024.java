package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C3057;
import com.bumptech.glide.load.engine.InterfaceC2988;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2978;
import io.ktor.util.C4210;
import p222.AbstractC7988;
import p286.InterfaceC8398;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3024 implements InterfaceC8398 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract Bitmap mo6471(InterfaceC2978 interfaceC2978, Bitmap bitmap, int i, int i2);

    @Override // p286.InterfaceC8398
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC2988 mo6475(Context context, InterfaceC2988 interfaceC2988, int i, int i2) {
        if (!AbstractC7988.m13449(i, i2)) {
            C4210.m8620("Cannot apply transformation on width: ", i, " or height: ", i2, " less than or equal to zero and not Target.SIZE_ORIGINAL");
            return null;
        }
        InterfaceC2978 interfaceC2978 = ComponentCallbacks2C3057.m6722(context).f9765;
        Bitmap bitmap = (Bitmap) interfaceC2988.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapMo6471 = mo6471(interfaceC2978, bitmap, i, i2);
        return bitmap.equals(bitmapMo6471) ? interfaceC2988 : C3025.m6476(bitmapMo6471, interfaceC2978);
    }
}
