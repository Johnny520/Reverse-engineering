package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wk implements g92 {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public wk(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new wk(0);
                break;
            default:
                this.b = new eb(4);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.g92
    public final d92 a(Object obj, int i, int i2, ov1 ov1Var) {
        int i3 = this.a;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                return c(a4.e(obj), i, i2, ov1Var);
            case 1:
                return ((wk) obj2).c(ImageDecoder.createSource((ByteBuffer) obj), i, i2, ov1Var);
            default:
                return al.c((zk) obj2, ((bu2) obj).b());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.g92
    public final /* bridge */ /* synthetic */ boolean b(Object obj, ov1 ov1Var) {
        switch (this.a) {
            case 0:
                a4.v(obj);
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public al c(ImageDecoder.Source source, int i, int i2, ov1 ov1Var) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new a60(i, i2, ov1Var));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new al((eb) this.b, bitmapDecodeBitmap);
    }

    public wk(zk zkVar) {
        this.a = 2;
        this.b = zkVar;
    }
}
