package p121Y1;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;
import p002A1.C0115D;
import p073O1.C1042d;
import p078P1.C1147i;
import p078P1.InterfaceC1149k;
import p088R1.InterfaceC1194D;
import p093S1.InterfaceC1289a;
import p116X1.AbstractC1652a;
import p116X1.C1654c;

/* JADX INFO: renamed from: Y1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1742c implements InterfaceC1149k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6013a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1289a f6014b;

    public C1742c() {
        this.f6013a = 0;
        this.f6014b = new C0115D(22);
    }

    @Override // p078P1.InterfaceC1149k
    /* JADX INFO: renamed from: a */
    public final InterfaceC1194D mo2202a(Object obj, int i5, int i6, C1147i c1147i) {
        switch (this.f6013a) {
            case 0:
                return m3098c(AbstractC1652a.m2953e(obj), i5, i6, c1147i);
            default:
                return C1743d.m3099b(this.f6014b, ((C1042d) obj).m2120b());
        }
    }

    @Override // p078P1.InterfaceC1149k
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo2203b(Object obj, C1147i c1147i) {
        switch (this.f6013a) {
            case 0:
                AbstractC1652a.m2969u(obj);
                break;
            default:
                break;
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public C1743d m3098c(ImageDecoder.Source source, int i5, int i6, C1147i c1147i) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new C1654c(i5, i6, c1147i));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i5 + "x" + i6 + "]");
        }
        return new C1743d((C0115D) this.f6014b, bitmapDecodeBitmap);
    }

    public C1742c(InterfaceC1289a interfaceC1289a) {
        this.f6013a = 1;
        this.f6014b = interfaceC1289a;
    }
}
