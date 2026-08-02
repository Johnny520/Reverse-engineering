package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: renamed from: al */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0022al implements d92, fz0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f240h = 1;

    /* JADX INFO: renamed from: i */
    public final Object f241i;

    /* JADX INFO: renamed from: j */
    public final Object f242j;

    public C0022al(InterfaceC0965zk interfaceC0965zk, Bitmap bitmap) {
        fg1.m1642q("Bitmap must not be null", bitmap);
        this.f241i = bitmap;
        fg1.m1642q("BitmapPool must not be null", interfaceC0965zk);
        this.f242j = interfaceC0965zk;
    }

    /* JADX INFO: renamed from: c */
    public static C0022al m188c(InterfaceC0965zk interfaceC0965zk, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new C0022al(interfaceC0965zk, bitmap);
    }

    @Override // p000.fz0
    /* JADX INFO: renamed from: a */
    public final void mo189a() {
        switch (this.f240h) {
            case 0:
                ((Bitmap) this.f241i).prepareToDraw();
                break;
            default:
                d92 d92Var = (d92) this.f242j;
                if (d92Var instanceof fz0) {
                    ((fz0) d92Var).mo189a();
                }
                break;
        }
    }

    @Override // p000.d92
    /* JADX INFO: renamed from: b */
    public final int mo190b() {
        switch (this.f240h) {
            case 0:
                return b93.m496c((Bitmap) this.f241i);
            default:
                return ((d92) this.f242j).mo190b();
        }
    }

    @Override // p000.d92
    /* JADX INFO: renamed from: d */
    public final Class mo191d() {
        switch (this.f240h) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // p000.d92
    /* JADX INFO: renamed from: e */
    public final void mo192e() {
        switch (this.f240h) {
            case 0:
                ((InterfaceC0965zk) this.f242j).mo1325h((Bitmap) this.f241i);
                break;
            default:
                ((d92) this.f242j).mo192e();
                break;
        }
    }

    @Override // p000.d92
    public final Object get() {
        switch (this.f240h) {
            case 0:
                return (Bitmap) this.f241i;
            default:
                return new BitmapDrawable((Resources) this.f241i, (Bitmap) ((d92) this.f242j).get());
        }
    }

    public C0022al(Resources resources, d92 d92Var) {
        fg1.m1642q("Argument must not be null", resources);
        this.f241i = resources;
        fg1.m1642q("Argument must not be null", d92Var);
        this.f242j = d92Var;
    }
}
