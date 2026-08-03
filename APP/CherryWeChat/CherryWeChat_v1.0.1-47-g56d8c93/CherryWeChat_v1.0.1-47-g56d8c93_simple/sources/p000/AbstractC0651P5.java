package p000;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C1273a;

/* JADX INFO: renamed from: P5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0651P5 implements InterfaceC0098CB {
    @Override // p000.InterfaceC0098CB
    /* JADX INFO: renamed from: a */
    public final InterfaceC2389pw mo145a(Context r3, InterfaceC2389pw r4, int r5, int r6) {
        if (AbstractC2622vD.m5138i(r5, r6) == false) goto L15;
        InterfaceC0565N5 r32 = ComponentCallbacks2C1273a.m2412a(r3).f4337a;
        Bitmap r0 = (Bitmap) r4.get();
        if (r5 != Integer.MIN_VALUE) goto L7;
        r5 = r0.getWidth();
    L7:
        if (r6 != Integer.MIN_VALUE) goto L9;
        r6 = r0.getHeight();
    L9:
        Bitmap r52 = mo1317c(r32, r0, r5, r6);
        if (r0.equals(r52) == false) goto L13;
        return r4;
    L13:
        return C0608O5.m1187c(r32, r52);
    L15:
        throw new IllegalArgumentException("Cannot apply transformation on width: " + r5 + " or height: " + r6 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    /* JADX INFO: renamed from: c */
    public abstract Bitmap mo1317c(InterfaceC0565N5 r1, Bitmap r2, int r3, int r4);
}
