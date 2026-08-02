package p000;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C0099a;

/* JADX INFO: renamed from: bl */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0059bl implements n33 {
    @Override // p000.n33
    /* JADX INFO: renamed from: a */
    public final d92 mo247a(Context context, d92 d92Var, int i, int i2) {
        if (!b93.m502i(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        InterfaceC0965zk interfaceC0965zk = ComponentCallbacks2C0099a.m868a(context).f1643h;
        Bitmap bitmap = (Bitmap) d92Var.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapMo258c = mo258c(interfaceC0965zk, bitmap, i, i2);
        return bitmap.equals(bitmapMo258c) ? d92Var : C0022al.m188c(interfaceC0965zk, bitmapMo258c);
    }

    /* JADX INFO: renamed from: c */
    public abstract Bitmap mo258c(InterfaceC0965zk interfaceC0965zk, Bitmap bitmap, int i, int i2);
}
