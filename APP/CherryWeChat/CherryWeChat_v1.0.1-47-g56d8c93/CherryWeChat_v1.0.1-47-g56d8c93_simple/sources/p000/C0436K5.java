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
    public static final C2601ut f1431b = null;

    /* JADX INFO: renamed from: c */
    public static final C2601ut f1432c = null;

    /* JADX INFO: renamed from: a */
    public final C2812zp f1433a;

    static {
        f1431b = C2601ut.m5116a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
        f1432c = new C2601ut("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, C2601ut.f8986e);
    }

    public C0436K5(C2812zp r1) {
        this.f1433a = r1;
    }

    @Override // p000.InterfaceC0667Pf
    /* JADX INFO: renamed from: c */
    public final boolean mo892c(Object r6, File r7, C2644vt r8) {
        Bitmap r62 = (Bitmap) ((InterfaceC2389pw) r6).get();
        C2601ut r0 = f1432c;
        Bitmap.CompressFormat r1 = (Bitmap.CompressFormat) r8.m5177c(r0);
        if (r1 == null) goto L6;
    L9:
        r62.getWidth();
        r62.getHeight();
        int r2 = AbstractC1510hp.f5351a;
        SystemClock.elapsedRealtimeNanos();
        int r22 = ((Integer) r8.m5177c(f1431b)).intValue();
        OutputStream r3 = null;
        FileOutputStream r4 = new FileOutputStream(r7);     // Catch: Throwable -> L25 IOException -> L40
        C2812zp r72 = this.f1433a;
        if (r72 != null) goto L49;
        r3 = r4;
    L19:
        r62.compress(r1, r22, r3);     // Catch: Throwable -> L25 IOException -> L40
        r3.close();     // Catch: Throwable -> L25 IOException -> L40
        r3.close();     // Catch: Throwable -> L22 IOException -> L38
    L24:
        boolean r73 = true;
    L35:
        if (Log.isLoggable("BitmapEncoder", 2) == false) goto L37;
        Objects.toString(r1);
        AbstractC2622vD.m5132c(r62);
        SystemClock.elapsedRealtimeNanos();
        Objects.toString(r8.m5177c(r0));
        r62.hasAlpha();
    L37:
        return r73;
        goto L29
    L49:
        r3 = new C1247c6(r4, r72);     // Catch: Throwable -> L15 IOException -> L17
    L17:
        r3 = r4;
    L15:
        th = th;
        r3 = r4;
    L26:
        if (r3 != null) goto L47;
    L28:
        throw th;
    L47:
        r3.close();     // Catch: Throwable -> L22 IOException -> L39
    L22:
        th = move-exception;
        throw th;
    L25:
        th = th;
    L29:
        if (r3 != null) goto L42;
    L33:
        r73 = false;
        goto L35
    L42:
        r3.close();     // Catch: Throwable -> L22 IOException -> L41
        goto L33
    L6:
        if (r62.hasAlpha() == false) goto L8;
        r1 = Bitmap.CompressFormat.PNG;
        goto L9
    L8:
        r1 = Bitmap.CompressFormat.JPEG;
        goto L9
    }

    @Override // p000.InterfaceC2647vw
    /* JADX INFO: renamed from: f */
    public final int mo893f(C2644vt r1) {
        return 2;
    }
}
