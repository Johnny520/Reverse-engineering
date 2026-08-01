package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.data.C3796;
import com.bumptech.glide.load.engine.InterfaceC3821;
import com.bumptech.glide.load.engine.bitmap_recycle.C3806;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p238.AbstractC8815;
import p238.AbstractC8818;
import p302.C9226;
import p302.C9227;
import p302.InterfaceC9230;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3860 implements InterfaceC9230 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C9227 f9988 = C9227.m14524(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C9227 f9989 = new C9227("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, C9227.f23618);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3806 f9990;

    public C3860(C3806 c3806) {
        this.f9990 = c3806;
    }

    @Override // p302.InterfaceC9230
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final EncodeStrategy mo853(C9226 c9226) {
        return EncodeStrategy.TRANSFORMED;
    }

    @Override // p302.InterfaceC9225
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo859(Object obj, File file, C9226 c9226) throws Throwable {
        boolean z;
        Bitmap bitmap = (Bitmap) ((InterfaceC3821) obj).get();
        C9227 c9227 = f9989;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) c9226.m14523(c9227);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = AbstractC8815.f22409;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) c9226.m14523(f9988)).intValue();
        OutputStream c3796 = null;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                C3806 c3806 = this.f9990;
                if (c3806 != null) {
                    try {
                        c3796 = new C3796(fileOutputStream, c3806);
                    } catch (IOException e) {
                        e = e;
                        c3796 = fileOutputStream;
                        if (Log.isLoggable("BitmapEncoder", 3)) {
                            Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                        }
                        if (c3796 != null) {
                            try {
                                c3796.close();
                            } catch (IOException unused) {
                            }
                        }
                        z = false;
                    } catch (Throwable th) {
                        th = th;
                        c3796 = fileOutputStream;
                        if (c3796 != null) {
                            try {
                                c3796.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } else {
                    c3796 = fileOutputStream;
                }
                bitmap.compress(compressFormat, iIntValue, c3796);
                c3796.close();
                try {
                    c3796.close();
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
            Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + AbstractC8818.m14027(bitmap) + " in " + AbstractC8815.m14026(jElapsedRealtimeNanos) + ", options format: " + c9226.m14523(c9227) + ", hasAlpha: " + bitmap.hasAlpha());
        }
        return z;
    }
}
