package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.a;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bl implements n33 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.n33
    public final d92 a(Context context, d92 d92Var, int i, int i2) {
        if (!b93.i(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        zk zkVar = a.a(context).h;
        Bitmap bitmap = (Bitmap) d92Var.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(zkVar, bitmap, i, i2);
        return bitmap.equals(bitmapC) ? d92Var : al.c(zkVar, bitmapC);
    }

    public abstract Bitmap c(zk zkVar, Bitmap bitmap, int i, int i2);
}
