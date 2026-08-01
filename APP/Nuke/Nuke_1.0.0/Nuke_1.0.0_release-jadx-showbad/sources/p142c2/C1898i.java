package p142c2;

import android.util.Log;
import com.bumptech.glide.AbstractC1922d;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p078P1.C1147i;
import p078P1.InterfaceC1149k;
import p088R1.InterfaceC1194D;
import p093S1.C1294f;

/* JADX INFO: renamed from: c2.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1898i implements InterfaceC1149k {

    /* JADX INFO: renamed from: a */
    public final ArrayList f6462a;

    /* JADX INFO: renamed from: b */
    public final C1890a f6463b;

    /* JADX INFO: renamed from: c */
    public final C1294f f6464c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1898i(ArrayList arrayList, C1890a c1890a, C1294f c1294f) {
        this.f6462a = arrayList;
        this.f6463b = c1890a;
        this.f6464c = c1294f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // p078P1.InterfaceC1149k
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC1194D mo2202a(Object obj, int i5, int i6, C1147i c1147i) {
        byte[] byteArray;
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            bArr = new byte[16384];
        } catch (IOException e5) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e5);
            }
            byteArray = null;
        }
        while (true) {
            int i7 = inputStream.read(bArr);
            if (i7 == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i7);
            if (byteArray != null) {
                return null;
            }
            return this.f6463b.mo2202a(ByteBuffer.wrap(byteArray), i5, i6, c1147i);
        }
        byteArrayOutputStream.flush();
        byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray != null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p078P1.InterfaceC1149k
    /* JADX INFO: renamed from: b */
    public final boolean mo2203b(Object obj, C1147i c1147i) {
        return !((Boolean) c1147i.m2201c(AbstractC1897h.f6461b)).booleanValue() && AbstractC1922d.m3438u(this.f6462a, (InputStream) obj, this.f6464c) == ImageHeaderParser$ImageType.GIF;
    }
}
