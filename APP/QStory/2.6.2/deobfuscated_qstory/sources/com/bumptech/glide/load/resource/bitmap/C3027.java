package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.data.C2963;
import com.bumptech.glide.load.engine.InterfaceC2988;
import com.bumptech.glide.load.engine.bitmap_recycle.C2973;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p222.AbstractC7985;
import p222.AbstractC7988;
import p286.C8396;
import p286.C8397;
import p286.InterfaceC8400;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3027 implements InterfaceC8400 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C8397 f9641 = C8397.m13948(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C8397 f9642 = new C8397("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, C8397.f23274);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2973 f9643;

    public C3027(C2973 c2973) {
        this.f9643 = c2973;
    }

    @Override // p286.InterfaceC8400
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final EncodeStrategy mo292(C8396 c8396) {
        return EncodeStrategy.TRANSFORMED;
    }

    @Override // p286.InterfaceC8395
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo298(Object obj, File file, C8396 c8396) throws Throwable {
        boolean z;
        Bitmap bitmap = (Bitmap) ((InterfaceC2988) obj).get();
        C8397 c8397 = f9642;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) c8396.m13947(c8397);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = AbstractC7985.f22067;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) c8396.m13947(f9641)).intValue();
        OutputStream c2963 = null;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                C2973 c2973 = this.f9643;
                if (c2973 != null) {
                    try {
                        c2963 = new C2963(fileOutputStream, c2973);
                    } catch (IOException e) {
                        e = e;
                        c2963 = fileOutputStream;
                        if (Log.isLoggable("BitmapEncoder", 3)) {
                            Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                        }
                        if (c2963 != null) {
                            try {
                                c2963.close();
                            } catch (IOException unused) {
                            }
                        }
                        z = false;
                    } catch (Throwable th) {
                        th = th;
                        c2963 = fileOutputStream;
                        if (c2963 != null) {
                            try {
                                c2963.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } else {
                    c2963 = fileOutputStream;
                }
                bitmap.compress(compressFormat, iIntValue, c2963);
                c2963.close();
                try {
                    c2963.close();
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
            Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + AbstractC7988.m13440(bitmap) + " in " + AbstractC7985.m13439(jElapsedRealtimeNanos) + ", options format: " + c8396.m13947(c8397) + ", hasAlpha: " + bitmap.hasAlpha());
        }
        return z;
    }
}
