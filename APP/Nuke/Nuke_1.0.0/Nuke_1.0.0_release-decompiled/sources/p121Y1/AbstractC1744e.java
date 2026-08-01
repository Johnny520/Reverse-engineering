package p121Y1;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C1921c;
import p078P1.InterfaceC1151m;
import p088R1.InterfaceC1194D;
import p093S1.InterfaceC1289a;
import p195l2.AbstractC2511o;

/* JADX INFO: renamed from: Y1.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1744e implements InterfaceC1151m {
    @Override // p078P1.InterfaceC1151m
    /* JADX INFO: renamed from: a */
    public final InterfaceC1194D mo2204a(Context context, InterfaceC1194D interfaceC1194D, int i5, int i6) {
        if (!AbstractC2511o.m4460i(i5, i6)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i5 + " or height: " + i6 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        InterfaceC1289a interfaceC1289a = ComponentCallbacks2C1921c.m3413a(context).f6514d;
        Bitmap bitmap = (Bitmap) interfaceC1194D.get();
        if (i5 == Integer.MIN_VALUE) {
            i5 = bitmap.getWidth();
        }
        if (i6 == Integer.MIN_VALUE) {
            i6 = bitmap.getHeight();
        }
        Bitmap bitmapMo3100c = mo3100c(interfaceC1289a, bitmap, i5, i6);
        return bitmap.equals(bitmapMo3100c) ? interfaceC1194D : C1743d.m3099b(interfaceC1289a, bitmapMo3100c);
    }

    /* JADX INFO: renamed from: c */
    public abstract Bitmap mo3100c(InterfaceC1289a interfaceC1289a, Bitmap bitmap, int i5, int i6);
}
