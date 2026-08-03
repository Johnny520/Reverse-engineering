package p001;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import java.io.InputStream;
import p001.C0481z7;

/* JADX INFO: renamed from: ۟.y8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0469y8 {
    /* JADX INFO: renamed from: ۥ */
    public static void m968(int i, int i2, int i3, int i4, BitmapFactory.Options options, C0443w8 c0443w8) {
        int iMax;
        double d;
        if (i4 > i2 || i3 > i) {
            if (i2 == 0) {
                d = i3 / i;
            } else if (i == 0) {
                d = i4 / i2;
            } else {
                int iFloor = (int) Math.floor(i4 / i2);
                int iFloor2 = (int) Math.floor(i3 / i);
                iMax = c0443w8.f1848 ? Math.max(iFloor, iFloor2) : Math.min(iFloor, iFloor2);
            }
            iMax = (int) Math.floor(d);
        } else {
            iMax = 1;
        }
        options.inSampleSize = iMax;
        options.inJustDecodeBounds = false;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static BitmapFactory.Options m1276(C0443w8 c0443w8) {
        boolean zM957 = c0443w8.m957();
        boolean z = c0443w8.f1853 != null;
        BitmapFactory.Options options = null;
        if (zM957 || z) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = zM957;
            if (z) {
                options.inPreferredConfig = c0443w8.f1853;
            }
        }
        return options;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract boolean mo831(C0443w8 c0443w8);

    /* JADX INFO: renamed from: ۥ۟۠ */
    public int mo1251() {
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟ۡ */
    public abstract a mo1030(C0443w8 c0443w8);

    /* JADX INFO: renamed from: ۥ۟ۢ */
    public boolean mo1252(NetworkInfo networkInfo) {
        return false;
    }

    /* JADX INFO: renamed from: ۟.y8$a */
    public static final class a {

        /* JADX INFO: renamed from: ۥ */
        public final C0481z7.e f1213;

        /* JADX INFO: renamed from: ۥ۟ */
        public final Bitmap f1214;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final InputStream f1875;

        /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
        public final int f1876;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: Illegal instructions before constructor call */
        public a(Bitmap bitmap) {
            C0481z7.e eVar = C0481z7.e.DISK;
            StringBuilder sb = C0259ic.f866;
            if (bitmap == null) {
                throw new NullPointerException("bitmap == null");
            }
            this(bitmap, null, eVar, 0);
        }

        public a(Bitmap bitmap, InputStream inputStream, C0481z7.e eVar, int i) {
            if (!((inputStream != null) ^ (bitmap != null))) {
                throw new AssertionError();
            }
            this.f1214 = bitmap;
            this.f1875 = inputStream;
            StringBuilder sb = C0259ic.f866;
            this.f1213 = eVar;
            this.f1876 = i;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(InputStream inputStream, C0481z7.e eVar) {
            this(null, inputStream, eVar, 0);
            StringBuilder sb = C0259ic.f866;
            if (inputStream == null) {
                throw new NullPointerException("stream == null");
            }
        }
    }
}
