package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: renamed from: O5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0608O5 implements InterfaceC2389pw, InterfaceC2284nl {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1948a;

    /* JADX INFO: renamed from: b */
    public final Object f1949b;

    /* JADX INFO: renamed from: c */
    public final Object f1950c;

    public C0608O5(InterfaceC0565N5 r2, Bitmap r3) {
        this.f1948a = 0;
        AbstractC0714Qj.m1488j("Bitmap must not be null", r3);
        this.f1949b = r3;
        AbstractC0714Qj.m1488j("BitmapPool must not be null", r2);
        this.f1950c = r2;
    }

    /* JADX INFO: renamed from: c */
    public static C0608O5 m1187c(InterfaceC0565N5 r1, Bitmap r2) {
        if (r2 != null) goto L6;
        return null;
    L6:
        return new C0608O5(r1, r2);
    }

    @Override // p000.InterfaceC2284nl
    /* JADX INFO: renamed from: a */
    public final void mo115a() {
        switch(this.f1948a) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        InterfaceC2389pw r0 = (InterfaceC2389pw) this.f1950c;
        if ((r0 instanceof InterfaceC2284nl) == false) goto L10;
        ((InterfaceC2284nl) r0).mo115a();
        return;
    L10:
        return;
    L8:
        ((Bitmap) this.f1949b).prepareToDraw();
    }

    @Override // p000.InterfaceC2389pw
    /* JADX INFO: renamed from: b */
    public final int mo116b() {
        switch(this.f1948a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((InterfaceC2389pw) this.f1950c).mo116b();
    L7:
        return AbstractC2622vD.m5132c((Bitmap) this.f1949b);
    }

    @Override // p000.InterfaceC2389pw
    /* JADX INFO: renamed from: d */
    public final Class mo117d() {
        switch(this.f1948a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return BitmapDrawable.class;
    L6:
        return Bitmap.class;
    }

    @Override // p000.InterfaceC2389pw
    /* JADX INFO: renamed from: e */
    public final void mo118e() {
        switch(this.f1948a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((InterfaceC2389pw) this.f1950c).mo118e();
        return;
    L6:
        ((InterfaceC0565N5) this.f1950c).mo53h((Bitmap) this.f1949b);
    }

    @Override // p000.InterfaceC2389pw
    public final Object get() {
        switch(this.f1948a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new BitmapDrawable((Resources) this.f1949b, (Bitmap) ((InterfaceC2389pw) this.f1950c).get());
    L7:
        return (Bitmap) this.f1949b;
    }

    public C0608O5(Resources r2, InterfaceC2389pw r3) {
        this.f1948a = 1;
        AbstractC0714Qj.m1488j("Argument must not be null", r2);
        this.f1949b = r2;
        AbstractC0714Qj.m1488j("Argument must not be null", r3);
        this.f1950c = r3;
    }
}
