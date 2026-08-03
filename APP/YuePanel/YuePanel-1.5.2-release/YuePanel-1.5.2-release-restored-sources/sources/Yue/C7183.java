package Yue;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.Log;
import java.io.InputStream;

/* JADX INFO: renamed from: Yue.ۥۡۧ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7183 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f2721 = "RoundedBitmapDrawableFa";

    /* JADX INFO: renamed from: Yue.ۥۡۧ۠ۢ$ۥ */
    public static class C1200 extends AbstractC7182 {
        public C1200(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        @Override // Yue.AbstractC7182
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public void mo22484(int i, int i2, int i3, Rect rect, Rect rect2) {
            C5194.m1974(i, i2, i3, rect, rect2, 0);
        }

        @Override // Yue.AbstractC7182
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public boolean mo22485() {
            Bitmap bitmap = this.f2719;
            return bitmap != null && C3533.m9485(bitmap);
        }

        @Override // Yue.AbstractC7182
        /* JADX INFO: renamed from: ۥ۟۟۠ */
        public void mo22486(boolean z) {
            Bitmap bitmap = this.f2719;
            if (bitmap != null) {
                C3533.m9486(bitmap, z);
                invalidateSelf();
            }
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public static AbstractC7182 m3466(@InterfaceC6391 Resources resources, @InterfaceC6490 Bitmap bitmap) {
        return new C7181(resources, bitmap);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public static AbstractC7182 m3467(@InterfaceC6391 Resources resources, @InterfaceC6391 InputStream inputStream) {
        AbstractC7182 abstractC7182M3466 = m3466(resources, BitmapFactory.decodeStream(inputStream));
        if (abstractC7182M3466.m3465() == null) {
            Log.w(f2721, "RoundedBitmapDrawable cannot decode " + inputStream);
        }
        return abstractC7182M3466;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static AbstractC7182 m22502(@InterfaceC6391 Resources resources, @InterfaceC6391 String str) {
        AbstractC7182 abstractC7182M3466 = m3466(resources, BitmapFactory.decodeFile(str));
        if (abstractC7182M3466.m3465() == null) {
            Log.w(f2721, "RoundedBitmapDrawable cannot decode " + str);
        }
        return abstractC7182M3466;
    }
}
