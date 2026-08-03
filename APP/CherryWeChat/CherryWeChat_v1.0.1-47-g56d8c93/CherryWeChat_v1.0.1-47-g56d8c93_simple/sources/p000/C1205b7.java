package p000;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* JADX INFO: renamed from: b7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1205b7 extends AbstractC0651P5 {

    /* JADX INFO: renamed from: b */
    public static final byte[] f4130b = null;

    static {
        f4130b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC0802Sm.f2524a);
    }

    @Override // p000.InterfaceC0802Sm
    /* JADX INFO: renamed from: b */
    public final void mo172b(MessageDigest r2) {
        r2.update(f4130b);
    }

    @Override // p000.AbstractC0651P5
    /* JADX INFO: renamed from: c */
    public final Bitmap mo1317c(InterfaceC0565N5 r8, Bitmap r9, int r10, int r11) {
        Paint r0 = AbstractC0184EB.f545a;
        if (r9.getWidth() == r10) goto L5;
    L7:
        Matrix r02 = new Matrix();
        float r3 = 0.0f;
        if ((r9.getWidth() * r11) <= (r9.getHeight() * r10)) goto L10;
        float r1 = r11 / r9.getHeight();
        r3 = (r10 - (r9.getWidth() * r1)) * 0.5f;
        float r2 = 0.0f;
    L11:
        r02.setScale(r1, r1);
        r02.postTranslate((int) (r3 + 0.5f), (int) (r2 + 0.5f));
        if (r9.getConfig() == null) goto L14;
        Bitmap.Config r12 = r9.getConfig();
    L15:
        Bitmap r82 = r8.mo52g(r10, r11, r12);
        r82.setHasAlpha(r9.hasAlpha());
        AbstractC0184EB.m384a(r9, r82, r02);
        return r82;
    L14:
        r12 = Bitmap.Config.ARGB_8888;
        goto L15
    L10:
        r1 = r10 / r9.getWidth();
        r2 = (r11 - (r9.getHeight() * r1)) * 0.5f;
        goto L11
    L5:
        if (r9.getHeight() != r11) goto L7;
        return r9;
    }

    @Override // p000.InterfaceC0802Sm
    public final boolean equals(Object r1) {
        return r1 instanceof C1205b7;
    }

    @Override // p000.InterfaceC0802Sm
    public final int hashCode() {
        return -599754482;
    }
}
