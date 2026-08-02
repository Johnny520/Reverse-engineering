package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C0099a;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: go */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0247go implements g92 {

    /* JADX INFO: renamed from: f */
    public static final C0953z8 f3588f = new C0953z8(9);

    /* JADX INFO: renamed from: g */
    public static final C0210fo f3589g = new C0210fo(0);

    /* JADX INFO: renamed from: a */
    public final Context f3590a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f3591b;

    /* JADX INFO: renamed from: e */
    public final sz0 f3594e;

    /* JADX INFO: renamed from: d */
    public final C0953z8 f3593d = f3588f;

    /* JADX INFO: renamed from: c */
    public final C0210fo f3592c = f3589g;

    public C0247go(Context context, ArrayList arrayList, InterfaceC0965zk interfaceC0965zk, td1 td1Var) {
        this.f3590a = context.getApplicationContext();
        this.f3591b = arrayList;
        this.f3594e = new sz0(19, interfaceC0965zk, td1Var);
    }

    /* JADX INFO: renamed from: d */
    public static int m1942d(fp0 fp0Var, int i, int i2) {
        int iMin = Math.min(fp0Var.f3098g / i2, fp0Var.f3097f / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            StringBuilder sbM2212k = hk1.m2212k("Downsampling GIF, sampleSize: ", iMax, i, ", target dimens: [", "x");
            sbM2212k.append(i2);
            sbM2212k.append("], actual dimens: [");
            sbM2212k.append(fp0Var.f3097f);
            sbM2212k.append("x");
            sbM2212k.append(fp0Var.f3098g);
            sbM2212k.append("]");
            Log.v("BufferGifDecoder", sbM2212k.toString());
        }
        return iMax;
    }

    @Override // p000.g92
    /* JADX INFO: renamed from: a */
    public final d92 mo866a(Object obj, int i, int i2, ov1 ov1Var) {
        gp0 gp0Var;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        C0210fo c0210fo = this.f3592c;
        synchronized (c0210fo) {
            try {
                gp0 gp0Var2 = (gp0) c0210fo.f3076a.poll();
                if (gp0Var2 == null) {
                    gp0Var2 = new gp0();
                }
                gp0Var = gp0Var2;
                gp0Var.f3647b = null;
                Arrays.fill(gp0Var.f3646a, (byte) 0);
                gp0Var.f3648c = new fp0();
                gp0Var.f3649d = 0;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                gp0Var.f3647b = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                gp0Var.f3647b.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return m1943c(byteBuffer, i, i2, gp0Var, ov1Var);
        } finally {
            this.f3592c.m1698a(gp0Var);
        }
    }

    @Override // p000.g92
    /* JADX INFO: renamed from: b */
    public final boolean mo867b(Object obj, ov1 ov1Var) {
        return !((Boolean) ov1Var.m3643c(hp0.f4099b)).booleanValue() && AbstractC0691se.m4821J(this.f3591b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    /* JADX INFO: renamed from: c */
    public final zo0 m1943c(ByteBuffer byteBuffer, int i, int i2, gp0 gp0Var, ov1 ov1Var) {
        StringBuilder sb;
        int i3 = tc1.f10678b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            fp0 fp0VarM2009b = gp0Var.m2009b();
            if (fp0VarM2009b.f3094c > 0 && fp0VarM2009b.f3093b == 0) {
                Bitmap.Config config = ov1Var.m3643c(hp0.f4098a) == s40.f9903i ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iM1942d = m1942d(fp0VarM2009b, i, i2);
                C0953z8 c0953z8 = this.f3593d;
                sz0 sz0Var = this.f3594e;
                c0953z8.getClass();
                bu2 bu2Var = new bu2(sz0Var, fp0VarM2009b, byteBuffer, iM1942d);
                bu2Var.m595c(config);
                bu2Var.f1030k = (bu2Var.f1030k + 1) % bu2Var.f1031l.f3094c;
                Bitmap bitmapM594b = bu2Var.m594b();
                if (bitmapM594b == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb = new StringBuilder("Decoded GIF from stream in ");
                        sb.append(tc1.m5161a(jElapsedRealtimeNanos));
                        Log.v("BufferGifDecoder", sb.toString());
                        return null;
                    }
                    return null;
                }
                zo0 zo0Var = new zo0(new yo0(new xo0(new ep0(ComponentCallbacks2C0099a.m868a(this.f3590a), bu2Var, i, i2, bitmapM594b))), 0);
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + tc1.m5161a(jElapsedRealtimeNanos));
                }
                return zo0Var;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(tc1.m5161a(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb.toString());
                return null;
            }
            return null;
        } finally {
        }
    }
}
