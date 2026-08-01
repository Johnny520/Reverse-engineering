package p121Y1;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.data.C1932b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p078P1.C1146h;
import p078P1.C1147i;
import p078P1.InterfaceC1150l;
import p088R1.InterfaceC1194D;
import p093S1.C1294f;
import p195l2.AbstractC2505i;
import p195l2.AbstractC2511o;

/* JADX INFO: renamed from: Y1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1741b implements InterfaceC1150l {

    /* JADX INFO: renamed from: e */
    public static final C1146h f6010e = C1146h.m2200a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* JADX INFO: renamed from: f */
    public static final C1146h f6011f = new C1146h("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, C1146h.f3780e);

    /* JADX INFO: renamed from: d */
    public final C1294f f6012d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1741b(C1294f c1294f) {
        this.f6012d = c1294f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p078P1.InterfaceC1140b
    /* JADX INFO: renamed from: c */
    public final boolean mo34c(Object obj, File file, C1147i c1147i) throws Throwable {
        boolean z5;
        Bitmap bitmap = (Bitmap) ((InterfaceC1194D) obj).get();
        C1146h c1146h = f6011f;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) c1147i.m2201c(c1146h);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i5 = AbstractC2505i.f8018b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) c1147i.m2201c(f6010e)).intValue();
        OutputStream c1932b = null;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                C1294f c1294f = this.f6012d;
                if (c1294f != null) {
                    try {
                        c1932b = new C1932b(fileOutputStream, c1294f);
                    } catch (IOException e5) {
                        e = e5;
                        c1932b = fileOutputStream;
                        if (Log.isLoggable("BitmapEncoder", 3)) {
                            Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                        }
                        if (c1932b != null) {
                            try {
                                c1932b.close();
                            } catch (IOException unused) {
                            }
                        }
                        z5 = false;
                    } catch (Throwable th) {
                        th = th;
                        c1932b = fileOutputStream;
                        if (c1932b != null) {
                            try {
                                c1932b.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } else {
                    c1932b = fileOutputStream;
                }
                bitmap.compress(compressFormat, iIntValue, c1932b);
                c1932b.close();
                try {
                    c1932b.close();
                } catch (IOException unused3) {
                }
                z5 = true;
            } catch (IOException e6) {
                e = e6;
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + AbstractC2511o.m4454c(bitmap) + " in " + AbstractC2505i.m4446a(jElapsedRealtimeNanos) + ", options format: " + c1147i.m2201c(c1146h) + ", hasAlpha: " + bitmap.hasAlpha());
            }
            return z5;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p078P1.InterfaceC1150l
    /* JADX INFO: renamed from: h */
    public final int mo39h(C1147i c1147i) {
        return 2;
    }
}
