package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.bumptech.glide.load.engine.InterfaceC3821;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3811;
import io.ktor.util.C5043;
import p238.AbstractC8818;
import p302.InterfaceC9228;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3857 implements InterfaceC9228 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract Bitmap mo7091(InterfaceC3811 interfaceC3811, Bitmap bitmap, int i, int i2);

    @Override // p302.InterfaceC9228
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC3821 mo7095(Context context, InterfaceC3821 interfaceC3821, int i, int i2) {
        if (!AbstractC8818.m14036(i, i2)) {
            C5043.m9169("Cannot apply transformation on width: ", i, " or height: ", i2, " less than or equal to zero and not Target.SIZE_ORIGINAL");
            return null;
        }
        InterfaceC3811 interfaceC3811 = ComponentCallbacks2C3890.m7327(context).f10119;
        Bitmap bitmap = (Bitmap) interfaceC3821.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapMo7091 = mo7091(interfaceC3811, bitmap, i, i2);
        return bitmap.equals(bitmapMo7091) ? interfaceC3821 : C3858.m7096(bitmapMo7091, interfaceC3811);
    }
}
