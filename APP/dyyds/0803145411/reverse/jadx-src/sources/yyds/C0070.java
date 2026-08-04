package yyds;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: yyds.ᛱᛱᲈᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0070 implements InterfaceC0723 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C2267 f621;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final C2120 f620 = C2120.m4039(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final C2120 f619 = new C2120("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, C2120.f10466);

    public C0070(C2267 c2267) {
        this.f621 = c2267;
    }

    @Override // yyds.InterfaceC1081
    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final boolean mo443(Object obj, File file, C0822 c0822) throws Throwable {
        boolean z;
        Bitmap bitmap = (Bitmap) ((InterfaceC2162) obj).get();
        C2120 c2120 = f619;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) c0822.m1891(c2120);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = AbstractC1382.f6429;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) c0822.m1891(f620)).intValue();
        OutputStream c0402 = null;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                C2267 c2267 = this.f621;
                if (c2267 != null) {
                    try {
                        c0402 = new C0402(fileOutputStream, c2267);
                    } catch (IOException e) {
                        e = e;
                        c0402 = fileOutputStream;
                        if (Log.isLoggable("BitmapEncoder", 3)) {
                            Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                        }
                        if (c0402 != null) {
                            try {
                                c0402.close();
                            } catch (IOException unused) {
                            }
                        }
                        z = false;
                    } catch (Throwable th) {
                        th = th;
                        c0402 = fileOutputStream;
                        if (c0402 != null) {
                            try {
                                c0402.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } else {
                    c0402 = fileOutputStream;
                }
                bitmap.compress(compressFormat, iIntValue, c0402);
                c0402.close();
                try {
                    c0402.close();
                } catch (IOException unused3) {
                }
                z = true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
        if (Log.isLoggable("BitmapEncoder", 2)) {
            Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + AbstractC0181.m756(bitmap) + " in " + AbstractC1382.m2794(jElapsedRealtimeNanos) + ", options format: " + c0822.m1891(c2120) + ", hasAlpha: " + bitmap.hasAlpha());
        }
        return z;
    }

    @Override // yyds.InterfaceC0723
    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final int mo444(C0822 c0822) {
        return 2;
    }
}
