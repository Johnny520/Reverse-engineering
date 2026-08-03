package p000;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;

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
    public final InterfaceC2389pw mo749a(Object r2, int r3, int r4, C2644vt r5) {
        switch(this.f1578a) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        Bitmap r22 = ((C0986Wy) r2).m1864b();
        return C0608O5.m1187c(this.f1579b, r22);
    L7:
        return m937c((ImageDecoder.Source) r2, r3, r4, r5);
    }

    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo750b(Object r1, C2644vt r2) {
        switch(this.f1578a) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        C0986Wy r12 = (C0986Wy) r1;
        return true;
    L7:
        ImageDecoder.Source r13 = (ImageDecoder.Source) r1;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public C0608O5 m937c(ImageDecoder.Source r2, int r3, int r4, C2644vt r5) {
        Bitmap r22 = ImageDecoder.decodeBitmap(r2, new C1454gd(r3, r4, r5));
        if (Log.isLoggable("BitmapImageDecoder", 2) == false) goto L6;
        r22.getWidth();
        r22.getHeight();
    L6:
        return new C0608O5((C1456gf) this.f1579b, r22);
    }

    public C0479L5(InterfaceC0565N5 r2) {
        this.f1578a = 1;
        this.f1579b = r2;
    }
}
