package p000;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yu2 implements g92 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f13621a;

    /* JADX INFO: renamed from: b */
    public final C0247go f13622b;

    /* JADX INFO: renamed from: c */
    public final td1 f13623c;

    public yu2(ArrayList arrayList, C0247go c0247go, td1 td1Var) {
        this.f13621a = arrayList;
        this.f13622b = c0247go;
        this.f13623c = td1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // p000.g92
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d92 mo866a(Object obj, int i, int i2, ov1 ov1Var) {
        byte[] byteArray;
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            bArr = new byte[16384];
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            byteArray = null;
        }
        while (true) {
            int i3 = inputStream.read(bArr);
            if (i3 == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i3);
            if (byteArray != null) {
                return null;
            }
            return this.f13622b.mo866a(ByteBuffer.wrap(byteArray), i, i2, ov1Var);
        }
        byteArrayOutputStream.flush();
        byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray != null) {
        }
    }

    @Override // p000.g92
    /* JADX INFO: renamed from: b */
    public final boolean mo867b(Object obj, ov1 ov1Var) {
        return !((Boolean) ov1Var.m3643c(hp0.f4099b)).booleanValue() && AbstractC0691se.m4820I(this.f13621a, (InputStream) obj, this.f13623c) == ImageHeaderParser$ImageType.GIF;
    }
}
