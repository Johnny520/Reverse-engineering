package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C3058;
import com.bumptech.glide.load.engine.InterfaceC2989;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2979;
import io.ktor.util.C4211;
import p222.AbstractC7989;
import p286.InterfaceC8399;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3025 implements InterfaceC8399 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract Bitmap mo6531(InterfaceC2979 interfaceC2979, Bitmap bitmap, int i, int i2);

    @Override // p286.InterfaceC8399
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC2989 mo6535(Context context, InterfaceC2989 interfaceC2989, int i, int i2) {
        if (!AbstractC7989.m13477(i, i2)) {
            C4211.m8610("Cannot apply transformation on width: ", i, " or height: ", i2, " less than or equal to zero and not Target.SIZE_ORIGINAL");
            return null;
        }
        InterfaceC2979 interfaceC2979 = ComponentCallbacks2C3058.m6767(context).f9774;
        Bitmap bitmap = (Bitmap) interfaceC2989.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapMo6531 = mo6531(interfaceC2979, bitmap, i, i2);
        return bitmap.equals(bitmapMo6531) ? interfaceC2989 : C3026.m6536(bitmapMo6531, interfaceC2979);
    }
}
