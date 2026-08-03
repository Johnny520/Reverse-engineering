package p000;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: renamed from: L5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0479L5 implements InterfaceC2518sw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1578a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0565N5 f1579b;

    public C0479L5() {
        this.f1578a = 0;
        this.f1579b = new C1456gf(24);
    }

    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: a */
    public final InterfaceC2389pw mo749a(Object obj, int i, int i2, C2644vt c2644vt) {
        switch (this.f1578a) {
            case 0:
                return m937c((ImageDecoder.Source) obj, i, i2, c2644vt);
            default:
                return C0608O5.m1187c(this.f1579b, ((C0986Wy) obj).m1864b());
        }
    }

    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo750b(Object obj, C2644vt c2644vt) {
        switch (this.f1578a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public C0608O5 m937c(ImageDecoder.Source source, int i, int i2, C2644vt c2644vt) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new C1454gd(i, i2, c2644vt));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            bitmapDecodeBitmap.getWidth();
            bitmapDecodeBitmap.getHeight();
        }
        return new C0608O5((C1456gf) this.f1579b, bitmapDecodeBitmap);
    }

    public C0479L5(InterfaceC0565N5 interfaceC0565N5) {
        this.f1578a = 1;
        this.f1579b = interfaceC0565N5;
    }
}
