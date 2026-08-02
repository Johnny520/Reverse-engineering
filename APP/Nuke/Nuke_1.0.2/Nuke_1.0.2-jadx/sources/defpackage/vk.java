package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vk implements j92 {
    public static final mv1 i = mv1.a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
    public static final mv1 j = new mv1("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, mv1.e);
    public final td1 h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vk(td1 td1Var) {
        this.h = td1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.we0
    public final boolean c(Object obj, File file, ov1 ov1Var) throws Throwable {
        boolean z;
        Bitmap bitmap = (Bitmap) ((d92) obj).get();
        mv1 mv1Var = j;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) ov1Var.c(mv1Var);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i2 = tc1.b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) ov1Var.c(i)).intValue();
        OutputStream mnVar = null;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                td1 td1Var = this.h;
                if (td1Var != null) {
                    try {
                        mnVar = new mn(fileOutputStream, td1Var);
                    } catch (IOException e) {
                        e = e;
                        mnVar = fileOutputStream;
                        if (Log.isLoggable("BitmapEncoder", 3)) {
                            Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                        }
                        if (mnVar != null) {
                            try {
                                mnVar.close();
                            } catch (IOException unused) {
                            }
                        }
                        z = false;
                    } catch (Throwable th) {
                        th = th;
                        mnVar = fileOutputStream;
                        if (mnVar != null) {
                            try {
                                mnVar.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } else {
                    mnVar = fileOutputStream;
                }
                bitmap.compress(compressFormat, iIntValue, mnVar);
                mnVar.close();
                try {
                    mnVar.close();
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
            Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + b93.c(bitmap) + " in " + tc1.a(jElapsedRealtimeNanos) + ", options format: " + ov1Var.c(mv1Var) + ", hasAlpha: " + bitmap.hasAlpha());
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j92
    public final int h(ov1 ov1Var) {
        return 2;
    }
}
