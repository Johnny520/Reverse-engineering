package p000;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: vk */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0813vk implements j92 {

    /* JADX INFO: renamed from: i */
    public static final mv1 f11998i = mv1.m3211a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* JADX INFO: renamed from: j */
    public static final mv1 f11999j = new mv1("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, mv1.f6895e);

    /* JADX INFO: renamed from: h */
    public final td1 f12000h;

    public C0813vk(td1 td1Var) {
        this.f12000h = td1Var;
    }

    @Override // p000.we0
    /* JADX INFO: renamed from: c */
    public final boolean mo2184c(Object obj, File file, ov1 ov1Var) throws Throwable {
        boolean z;
        Bitmap bitmap = (Bitmap) ((d92) obj).get();
        mv1 mv1Var = f11999j;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) ov1Var.m3643c(mv1Var);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = tc1.f10678b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) ov1Var.m3643c(f11998i)).intValue();
        OutputStream c0467mn = null;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                td1 td1Var = this.f12000h;
                if (td1Var != null) {
                    try {
                        c0467mn = new C0467mn(fileOutputStream, td1Var);
                    } catch (IOException e) {
                        e = e;
                        c0467mn = fileOutputStream;
                        if (Log.isLoggable("BitmapEncoder", 3)) {
                            Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                        }
                        if (c0467mn != null) {
                            try {
                                c0467mn.close();
                            } catch (IOException unused) {
                            }
                        }
                        z = false;
                    } catch (Throwable th) {
                        th = th;
                        c0467mn = fileOutputStream;
                        if (c0467mn != null) {
                            try {
                                c0467mn.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } else {
                    c0467mn = fileOutputStream;
                }
                bitmap.compress(compressFormat, iIntValue, c0467mn);
                c0467mn.close();
                try {
                    c0467mn.close();
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
            Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + b93.m496c(bitmap) + " in " + tc1.m5161a(jElapsedRealtimeNanos) + ", options format: " + ov1Var.m3643c(mv1Var) + ", hasAlpha: " + bitmap.hasAlpha());
        }
        return z;
    }

    @Override // p000.j92
    /* JADX INFO: renamed from: h */
    public final int mo2471h(ov1 ov1Var) {
        return 2;
    }
}
