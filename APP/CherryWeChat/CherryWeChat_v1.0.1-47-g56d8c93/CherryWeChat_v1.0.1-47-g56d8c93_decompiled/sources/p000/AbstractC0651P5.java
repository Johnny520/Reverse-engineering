package p000;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C1273a;

/* JADX INFO: renamed from: P5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0651P5 implements InterfaceC0098CB {
    @Override // p000.InterfaceC0098CB
    /* JADX INFO: renamed from: a */
    public final InterfaceC2389pw mo145a(Context context, InterfaceC2389pw interfaceC2389pw, int i, int i2) {
        if (!AbstractC2622vD.m5138i(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        InterfaceC0565N5 interfaceC0565N5 = ComponentCallbacks2C1273a.m2412a(context).f4337a;
        Bitmap bitmap = (Bitmap) interfaceC2389pw.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapMo1317c = mo1317c(interfaceC0565N5, bitmap, i, i2);
        return bitmap.equals(bitmapMo1317c) ? interfaceC2389pw : C0608O5.m1187c(interfaceC0565N5, bitmapMo1317c);
    }

    /* JADX INFO: renamed from: c */
    public abstract Bitmap mo1317c(InterfaceC0565N5 interfaceC0565N5, Bitmap bitmap, int i, int i2);
}
