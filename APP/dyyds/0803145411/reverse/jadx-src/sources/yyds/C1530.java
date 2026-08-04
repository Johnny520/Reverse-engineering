package yyds;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: yyds.ᛷᛴᛴᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1530 implements InterfaceC0814 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f7361;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Object f7362;

    public C1530(int i) {
        this.f7361 = i;
        switch (i) {
            case 1:
                this.f7362 = new C1530(0);
                break;
            default:
                this.f7362 = new C0805(8);
                break;
        }
    }

    @Override // yyds.InterfaceC0814
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final boolean mo427(Object obj, C0822 c0822) {
        switch (this.f7361) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // yyds.InterfaceC0814
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final InterfaceC2162 mo428(Object obj, int i, int i2, C0822 c0822) {
        int i3 = this.f7361;
        Object obj2 = this.f7362;
        switch (i3) {
            case 0:
                return m3165((ImageDecoder.Source) obj, i, i2, c0822);
            case 1:
                return ((C1530) obj2).m3165(ImageDecoder.createSource((ByteBuffer) obj), i, i2, c0822);
            default:
                return C0656.m1574(((C1575) obj).m3219(), (InterfaceC2587) obj2);
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public C0656 m3165(ImageDecoder.Source source, int i, int i2, C0822 c0822) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new C1203(i, i2, c0822));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new C0656(bitmapDecodeBitmap, (C0805) this.f7362);
    }

    public C1530(InterfaceC2587 interfaceC2587) {
        this.f7361 = 2;
        this.f7362 = interfaceC2587;
    }
}
