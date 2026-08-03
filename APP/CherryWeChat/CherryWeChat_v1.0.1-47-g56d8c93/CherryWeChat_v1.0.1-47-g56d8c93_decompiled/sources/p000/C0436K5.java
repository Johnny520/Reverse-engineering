package p000;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

/* JADX INFO: renamed from: K5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0436K5 implements InterfaceC2647vw {

    /* JADX INFO: renamed from: b */
    public static final C2601ut f1431b = C2601ut.m5116a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* JADX INFO: renamed from: c */
    public static final C2601ut f1432c = new C2601ut("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, C2601ut.f8986e);

    /* JADX INFO: renamed from: a */
    public final C2812zp f1433a;

    public C0436K5(C2812zp c2812zp) {
        this.f1433a = c2812zp;
    }

    @Override // p000.InterfaceC0667Pf
    /* JADX INFO: renamed from: c */
    public final boolean mo892c(Object obj, File file, C2644vt c2644vt) throws Throwable {
        boolean z;
        Bitmap bitmap = (Bitmap) ((InterfaceC2389pw) obj).get();
        C2601ut c2601ut = f1432c;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) c2644vt.m5177c(c2601ut);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = AbstractC1510hp.f5351a;
        SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) c2644vt.m5177c(f1431b)).intValue();
        OutputStream c1247c6 = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            C2812zp c2812zp = this.f1433a;
            if (c2812zp != null) {
                try {
                    c1247c6 = new C1247c6(fileOutputStream, c2812zp);
                } catch (IOException unused) {
                    c1247c6 = fileOutputStream;
                    if (c1247c6 != null) {
                        try {
                            c1247c6.close();
                        } catch (IOException unused2) {
                        }
                    }
                    z = false;
                } catch (Throwable th) {
                    th = th;
                    c1247c6 = fileOutputStream;
                    if (c1247c6 != null) {
                        try {
                            c1247c6.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } else {
                c1247c6 = fileOutputStream;
            }
            bitmap.compress(compressFormat, iIntValue, c1247c6);
            c1247c6.close();
            try {
                c1247c6.close();
            } catch (IOException unused4) {
            }
            z = true;
        } catch (IOException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
        if (Log.isLoggable("BitmapEncoder", 2)) {
            Objects.toString(compressFormat);
            AbstractC2622vD.m5132c(bitmap);
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(c2644vt.m5177c(c2601ut));
            bitmap.hasAlpha();
        }
        return z;
    }

    @Override // p000.InterfaceC2647vw
    /* JADX INFO: renamed from: f */
    public final int mo893f(C2644vt c2644vt) {
        return 2;
    }
}
