package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: renamed from: O5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0608O5 implements InterfaceC2389pw, InterfaceC2284nl {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1948a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f1949b;

    /* JADX INFO: renamed from: c */
    public final Object f1950c;

    public C0608O5(InterfaceC0565N5 interfaceC0565N5, Bitmap bitmap) {
        AbstractC0714Qj.m1488j("Bitmap must not be null", bitmap);
        this.f1949b = bitmap;
        AbstractC0714Qj.m1488j("BitmapPool must not be null", interfaceC0565N5);
        this.f1950c = interfaceC0565N5;
    }

    /* JADX INFO: renamed from: c */
    public static C0608O5 m1187c(InterfaceC0565N5 interfaceC0565N5, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new C0608O5(interfaceC0565N5, bitmap);
    }

    @Override // p000.InterfaceC2284nl
    /* JADX INFO: renamed from: a */
    public final void mo115a() {
        switch (this.f1948a) {
            case 0:
                ((Bitmap) this.f1949b).prepareToDraw();
                break;
            default:
                InterfaceC2389pw interfaceC2389pw = (InterfaceC2389pw) this.f1950c;
                if (interfaceC2389pw instanceof InterfaceC2284nl) {
                    ((InterfaceC2284nl) interfaceC2389pw).mo115a();
                }
                break;
        }
    }

    @Override // p000.InterfaceC2389pw
    /* JADX INFO: renamed from: b */
    public final int mo116b() {
        switch (this.f1948a) {
            case 0:
                return AbstractC2622vD.m5132c((Bitmap) this.f1949b);
            default:
                return ((InterfaceC2389pw) this.f1950c).mo116b();
        }
    }

    @Override // p000.InterfaceC2389pw
    /* JADX INFO: renamed from: d */
    public final Class mo117d() {
        switch (this.f1948a) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // p000.InterfaceC2389pw
    /* JADX INFO: renamed from: e */
    public final void mo118e() {
        switch (this.f1948a) {
            case 0:
                ((InterfaceC0565N5) this.f1950c).mo53h((Bitmap) this.f1949b);
                break;
            default:
                ((InterfaceC2389pw) this.f1950c).mo118e();
                break;
        }
    }

    @Override // p000.InterfaceC2389pw
    public final Object get() {
        switch (this.f1948a) {
            case 0:
                return (Bitmap) this.f1949b;
            default:
                return new BitmapDrawable((Resources) this.f1949b, (Bitmap) ((InterfaceC2389pw) this.f1950c).get());
        }
    }

    public C0608O5(Resources resources, InterfaceC2389pw interfaceC2389pw) {
        AbstractC0714Qj.m1488j("Argument must not be null", resources);
        this.f1949b = resources;
        AbstractC0714Qj.m1488j("Argument must not be null", interfaceC2389pw);
        this.f1950c = interfaceC2389pw;
    }
}
