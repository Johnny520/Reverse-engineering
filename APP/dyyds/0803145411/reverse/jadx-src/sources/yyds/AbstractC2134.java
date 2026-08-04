package yyds;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C0040;

/* JADX INFO: renamed from: yyds.ᲀᲈᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2134 implements InterfaceC0556 {
    @Override // yyds.InterfaceC0556
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final InterfaceC2162 mo1240(Context context, InterfaceC2162 interfaceC2162, int i, int i2) {
        if (!AbstractC0181.m751(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        InterfaceC2587 interfaceC2587 = ComponentCallbacks2C0040.m249(context).f383;
        Bitmap bitmap = (Bitmap) interfaceC2162.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapMo1402 = mo1402(interfaceC2587, bitmap, i, i2);
        return bitmap.equals(bitmapMo1402) ? interfaceC2162 : C0656.m1574(bitmapMo1402, interfaceC2587);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public abstract Bitmap mo1402(InterfaceC2587 interfaceC2587, Bitmap bitmap, int i, int i2);
}
