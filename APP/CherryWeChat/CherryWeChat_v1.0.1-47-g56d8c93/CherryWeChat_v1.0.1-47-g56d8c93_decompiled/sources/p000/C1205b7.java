package p000;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* JADX INFO: renamed from: b7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1205b7 extends AbstractC0651P5 {

    /* JADX INFO: renamed from: b */
    public static final byte[] f4130b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC0802Sm.f2524a);

    @Override // p000.InterfaceC0802Sm
    /* JADX INFO: renamed from: b */
    public final void mo172b(MessageDigest messageDigest) {
        messageDigest.update(f4130b);
    }

    @Override // p000.AbstractC0651P5
    /* JADX INFO: renamed from: c */
    public final Bitmap mo1317c(InterfaceC0565N5 interfaceC0565N5, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        Paint paint = AbstractC0184EB.f545a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            width2 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapMo52g = interfaceC0565N5.mo52g(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapMo52g.setHasAlpha(bitmap.hasAlpha());
        AbstractC0184EB.m384a(bitmap, bitmapMo52g, matrix);
        return bitmapMo52g;
    }

    @Override // p000.InterfaceC0802Sm
    public final boolean equals(Object obj) {
        return obj instanceof C1205b7;
    }

    @Override // p000.InterfaceC0802Sm
    public final int hashCode() {
        return -599754482;
    }
}
