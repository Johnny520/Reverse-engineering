package p000;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: wk */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0850wk implements g92 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12549a;

    /* JADX INFO: renamed from: b */
    public final Object f12550b;

    public C0850wk(int i) {
        this.f12549a = i;
        switch (i) {
            case 1:
                this.f12550b = new C0850wk(0);
                break;
            default:
                this.f12550b = new C0160eb(4);
                break;
        }
    }

    @Override // p000.g92
    /* JADX INFO: renamed from: a */
    public final d92 mo866a(Object obj, int i, int i2, ov1 ov1Var) {
        int i3 = this.f12549a;
        Object obj2 = this.f12550b;
        switch (i3) {
            case 0:
                return m5939c(AbstractC0005a4.m34e(obj), i, i2, ov1Var);
            case 1:
                return ((C0850wk) obj2).m5939c(ImageDecoder.createSource((ByteBuffer) obj), i, i2, ov1Var);
            default:
                return C0022al.m188c((InterfaceC0965zk) obj2, ((bu2) obj).m594b());
        }
    }

    @Override // p000.g92
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo867b(Object obj, ov1 ov1Var) {
        switch (this.f12549a) {
            case 0:
                AbstractC0005a4.m51v(obj);
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public C0022al m5939c(ImageDecoder.Source source, int i, int i2, ov1 ov1Var) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new a60(i, i2, ov1Var));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new C0022al((C0160eb) this.f12550b, bitmapDecodeBitmap);
    }

    public C0850wk(InterfaceC0965zk interfaceC0965zk) {
        this.f12549a = 2;
        this.f12550b = interfaceC0965zk;
    }
}
