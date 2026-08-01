package p121Y1;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;
import p078P1.InterfaceC1144f;
import p093S1.InterfaceC1289a;

/* JADX INFO: renamed from: Y1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1747h extends AbstractC1744e {

    /* JADX INFO: renamed from: b */
    public static final byte[] f6022b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC1144f.f3779a);

    @Override // p078P1.InterfaceC1144f
    /* JADX INFO: renamed from: b */
    public final void mo2199b(MessageDigest messageDigest) {
        messageDigest.update(f6022b);
    }

    @Override // p121Y1.AbstractC1744e
    /* JADX INFO: renamed from: c */
    public final Bitmap mo3100c(InterfaceC1289a interfaceC1289a, Bitmap bitmap, int i5, int i6) {
        float width;
        float height;
        Paint paint = AbstractC1735C.f5992a;
        if (bitmap.getWidth() == i5 && bitmap.getHeight() == i6) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i6 > bitmap.getHeight() * i5) {
            width = i6 / bitmap.getHeight();
            width2 = (i5 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i5 / bitmap.getWidth();
            height = (i6 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapMo153d = interfaceC1289a.mo153d(i5, i6, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapMo153d.setHasAlpha(bitmap.hasAlpha());
        AbstractC1735C.m3092a(bitmap, bitmapMo153d, matrix);
        return bitmapMo153d;
    }

    @Override // p078P1.InterfaceC1144f
    public final boolean equals(Object obj) {
        return obj instanceof C1747h;
    }

    @Override // p078P1.InterfaceC1144f
    public final int hashCode() {
        return -599754482;
    }
}
