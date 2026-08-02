package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.a;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class go implements g92 {
    public static final z8 f = new z8(9);
    public static final fo g = new fo(0);
    public final Context a;
    public final ArrayList b;
    public final sz0 e;
    public final z8 d = f;
    public final fo c = g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public go(Context context, ArrayList arrayList, zk zkVar, td1 td1Var) {
        this.a = context.getApplicationContext();
        this.b = arrayList;
        this.e = new sz0(19, zkVar, td1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int d(fp0 fp0Var, int i, int i2) {
        int iMin = Math.min(fp0Var.g / i2, fp0Var.f / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            StringBuilder sbK = hk1.k("Downsampling GIF, sampleSize: ", iMax, i, ", target dimens: [", "x");
            sbK.append(i2);
            sbK.append("], actual dimens: [");
            sbK.append(fp0Var.f);
            sbK.append("x");
            sbK.append(fp0Var.g);
            sbK.append("]");
            Log.v("BufferGifDecoder", sbK.toString());
        }
        return iMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.g92
    public final d92 a(Object obj, int i, int i2, ov1 ov1Var) {
        gp0 gp0Var;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        fo foVar = this.c;
        synchronized (foVar) {
            try {
                gp0 gp0Var2 = (gp0) foVar.a.poll();
                if (gp0Var2 == null) {
                    gp0Var2 = new gp0();
                }
                gp0Var = gp0Var2;
                gp0Var.b = null;
                Arrays.fill(gp0Var.a, (byte) 0);
                gp0Var.c = new fp0();
                gp0Var.d = 0;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                gp0Var.b = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                gp0Var.b.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return c(byteBuffer, i, i2, gp0Var, ov1Var);
        } finally {
            this.c.a(gp0Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.g92
    public final boolean b(Object obj, ov1 ov1Var) {
        return !((Boolean) ov1Var.c(hp0.b)).booleanValue() && se.J(this.b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final zo0 c(ByteBuffer byteBuffer, int i, int i2, gp0 gp0Var, ov1 ov1Var) {
        StringBuilder sb;
        int i3 = tc1.b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            fp0 fp0VarB = gp0Var.b();
            if (fp0VarB.c > 0 && fp0VarB.b == 0) {
                Bitmap.Config config = ov1Var.c(hp0.a) == s40.i ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iD = d(fp0VarB, i, i2);
                z8 z8Var = this.d;
                sz0 sz0Var = this.e;
                z8Var.getClass();
                bu2 bu2Var = new bu2(sz0Var, fp0VarB, byteBuffer, iD);
                bu2Var.c(config);
                bu2Var.k = (bu2Var.k + 1) % bu2Var.l.c;
                Bitmap bitmapB = bu2Var.b();
                if (bitmapB == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb = new StringBuilder("Decoded GIF from stream in ");
                        sb.append(tc1.a(jElapsedRealtimeNanos));
                        Log.v("BufferGifDecoder", sb.toString());
                        return null;
                    }
                    return null;
                }
                zo0 zo0Var = new zo0(new yo0(new xo0(new ep0(a.a(this.a), bu2Var, i, i2, bitmapB))), 0);
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + tc1.a(jElapsedRealtimeNanos));
                }
                return zo0Var;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(tc1.a(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb.toString());
                return null;
            }
            return null;
        } finally {
        }
    }
}
