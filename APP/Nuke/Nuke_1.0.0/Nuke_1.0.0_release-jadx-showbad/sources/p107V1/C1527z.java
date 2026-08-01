package p107V1;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import me.dartcv.nuke.BuildConfig;
import p078P1.C1147i;
import p078P1.InterfaceC1140b;
import p195l2.AbstractC2498b;

/* JADX INFO: renamed from: V1.z */
/* JADX INFO: loaded from: classes.dex */
public final class C1527z implements InterfaceC1519r, InterfaceC1140b {

    /* JADX INFO: renamed from: e */
    public static final C1527z f5295e = new C1527z(0);

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5296d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [A.i0.<init>(int):void, V1.w.<clinit>():void, V1.z.<clinit>():void, V1.z.g(V1.w):V1.q, com.bumptech.glide.f.i(com.bumptech.glide.c, java.util.ArrayList):com.bumptech.glide.l] */
    public /* synthetic */ C1527z(int i5) {
        this.f5296d = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static ByteArrayInputStream m2792a(String str) {
        if (!str.startsWith("data:image")) {
            throw new IllegalArgumentException("Not a valid image data URL.");
        }
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        if (str.substring(0, iIndexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
        }
        throw new IllegalArgumentException("Not a base64 image data URL.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public Class m2793b() {
        switch (this.f5296d) {
            case BuildConfig.VERSION_CODE /* 1 */:
                return ByteBuffer.class;
            case 3:
                return InputStream.class;
            case 8:
                return ParcelFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p078P1.InterfaceC1140b
    /* JADX INFO: renamed from: c */
    public boolean mo34c(Object obj, File file, C1147i c1147i) throws Throwable {
        try {
            AbstractC2498b.m4441d((ByteBuffer) obj, file);
            return true;
        } catch (IOException e5) {
            if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            Log.d("ByteBufferEncoder", "Failed to write data", e5);
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p107V1.InterfaceC1519r
    /* JADX INFO: renamed from: g */
    public InterfaceC1518q mo68g(C1524w c1524w) {
        switch (this.f5296d) {
            case 0:
                return C1498A.f5226b;
            case 2:
                return new C1504c(0, new C1527z(1));
            case 4:
                return new C1504c(0, new C1527z(3));
            case 6:
                return new C1498A(1);
            case 11:
                return new C1526y(c1524w.m2789a(Uri.class, AssetFileDescriptor.class), 0);
            case 12:
                return new C1526y(c1524w.m2789a(Uri.class, ParcelFileDescriptor.class), 0);
            case 13:
                return new C1526y(c1524w.m2789a(Uri.class, InputStream.class), 0);
            default:
                return new C1501D(c1524w.m2789a(C1508g.class, InputStream.class));
        }
    }
}
