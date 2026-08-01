package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.data.C2964;
import com.bumptech.glide.load.engine.InterfaceC2989;
import com.bumptech.glide.load.engine.bitmap_recycle.C2974;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p222.AbstractC7986;
import p222.AbstractC7989;
import p286.C8397;
import p286.C8398;
import p286.InterfaceC8401;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3028 implements InterfaceC8401 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C8398 f9643 = C8398.m13965(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C8398 f9644 = new C8398("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, C8398.f23273);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2974 f9645;

    public C3028(C2974 c2974) {
        this.f9645 = c2974;
    }

    @Override // p286.InterfaceC8401
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final EncodeStrategy mo293(C8397 c8397) {
        return EncodeStrategy.TRANSFORMED;
    }

    @Override // p286.InterfaceC8396
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo299(Object obj, File file, C8397 c8397) throws Throwable {
        boolean z;
        Bitmap bitmap = (Bitmap) ((InterfaceC2989) obj).get();
        C8398 c8398 = f9644;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) c8397.m13964(c8398);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = AbstractC7986.f22064;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) c8397.m13964(f9643)).intValue();
        OutputStream c2964 = null;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                C2974 c2974 = this.f9645;
                if (c2974 != null) {
                    try {
                        c2964 = new C2964(fileOutputStream, c2974);
                    } catch (IOException e) {
                        e = e;
                        c2964 = fileOutputStream;
                        if (Log.isLoggable("BitmapEncoder", 3)) {
                            Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                        }
                        if (c2964 != null) {
                            try {
                                c2964.close();
                            } catch (IOException unused) {
                            }
                        }
                        z = false;
                    } catch (Throwable th) {
                        th = th;
                        c2964 = fileOutputStream;
                        if (c2964 != null) {
                            try {
                                c2964.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } else {
                    c2964 = fileOutputStream;
                }
                bitmap.compress(compressFormat, iIntValue, c2964);
                c2964.close();
                try {
                    c2964.close();
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
            Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + AbstractC7989.m13468(bitmap) + " in " + AbstractC7986.m13467(jElapsedRealtimeNanos) + ", options format: " + c8397.m13964(c8398) + ", hasAlpha: " + bitmap.hasAlpha());
        }
        return z;
    }
}
