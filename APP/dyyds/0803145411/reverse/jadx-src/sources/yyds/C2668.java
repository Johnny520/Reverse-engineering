package yyds;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* JADX INFO: renamed from: yyds.ᲈᛵᲁᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2668 extends AbstractC2134 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C1985 f13104;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final byte[] f13105;

    static {
        AbstractC2328.m4341(-716305628562286L);
        f13104 = new C1985(15);
        String strM4341 = AbstractC2328.m4341(-716627751109486L);
        Charset charset = StandardCharsets.UTF_8;
        AbstractC2328.m4341(-716949873656686L);
        byte[] bytes = strM4341.getBytes(charset);
        AbstractC2328.m4341(-716975643460462L);
        f13105 = bytes;
    }

    @Override // yyds.InterfaceC1410
    public final boolean equals(Object obj) {
        return obj instanceof C2668;
    }

    @Override // yyds.InterfaceC1410
    public final int hashCode() {
        return AbstractC2328.m4341(-715923376472942L).hashCode();
    }

    @Override // yyds.InterfaceC1410
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo1227(MessageDigest messageDigest) {
        AbstractC2328.m4341(-716245499020142L);
        messageDigest.update(f13105);
    }

    @Override // yyds.AbstractC2134
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final Bitmap mo1402(InterfaceC2587 interfaceC2587, Bitmap bitmap, int i, int i2) {
        Bitmap bitmapCopy;
        AbstractC2328.m4341(-715790232486766L);
        AbstractC2328.m4341(-715811707323246L);
        f13104.getClass();
        try {
            if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                if (bitmapCopy != null) {
                }
                return bitmap;
            }
            bitmapCopy = bitmap;
            C1446 c1446M4206 = AbstractC2217.m4206(bitmapCopy);
            if (c1446M4206 == null) {
                if (bitmapCopy != bitmap) {
                    bitmapCopy.recycle();
                }
                return bitmap;
            }
            Bitmap.Config config = bitmapCopy.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap bitmapMo1863 = interfaceC2587.mo1863(c1446M4206.m2945(), c1446M4206.m2944(), config);
            AbstractC2328.m4341(-715863246930798L);
            bitmapMo1863.setDensity(bitmap.getDensity());
            bitmapMo1863.setHasAlpha(bitmapCopy.hasAlpha());
            bitmapMo1863.eraseColor(0);
            new Canvas(bitmapMo1863).drawBitmap(bitmapCopy, new Rect(c1446M4206.f6860, c1446M4206.f6861, c1446M4206.f6862, c1446M4206.f6863), new Rect(0, 0, c1446M4206.m2945(), c1446M4206.m2944()), new Paint(7));
            if (bitmapCopy != bitmap) {
                bitmapCopy.recycle();
            }
            return bitmapMo1863;
        } catch (Throwable th) {
            if (bitmapCopy != bitmap) {
                bitmapCopy.recycle();
            }
            throw th;
        }
    }
}
