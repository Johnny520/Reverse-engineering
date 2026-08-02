package defpackage;

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
    public final ArrayList a;
    public final go b;
    public final td1 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yu2(ArrayList arrayList, go goVar, td1 td1Var) {
        this.a = arrayList;
        this.b = goVar;
        this.c = td1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.g92
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d92 a(Object obj, int i, int i2, ov1 ov1Var) {
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
            return this.b.a(ByteBuffer.wrap(byteArray), i, i2, ov1Var);
        }
        byteArrayOutputStream.flush();
        byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray != null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.g92
    public final boolean b(Object obj, ov1 ov1Var) {
        return !((Boolean) ov1Var.c(hp0.b)).booleanValue() && se.I(this.a, (InputStream) obj, this.c) == ImageHeaderParser$ImageType.GIF;
    }
}
