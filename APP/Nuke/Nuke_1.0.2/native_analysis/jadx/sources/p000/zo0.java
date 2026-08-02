package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zo0 implements d92, fz0 {

    /* JADX INFO: renamed from: h */
    public final Drawable f13993h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f13994i;

    public zo0(Drawable drawable, int i) {
        this.f13994i = i;
        fg1.m1642q("Argument must not be null", drawable);
        this.f13993h = drawable;
    }

    @Override // p000.fz0
    /* JADX INFO: renamed from: a */
    public void mo189a() {
        int i = this.f13994i;
        Drawable drawable = this.f13993h;
        switch (i) {
            case 0:
                ((yo0) drawable).f13536h.f13087a.f2543l.prepareToDraw();
                break;
            default:
                if (drawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                } else if (drawable instanceof yo0) {
                    ((yo0) drawable).f13536h.f13087a.f2543l.prepareToDraw();
                }
                break;
        }
    }

    @Override // p000.d92
    /* JADX INFO: renamed from: b */
    public final int mo190b() {
        int i = this.f13994i;
        Drawable drawable = this.f13993h;
        switch (i) {
            case 0:
                ep0 ep0Var = ((yo0) drawable).f13536h.f13087a;
                bu2 bu2Var = ep0Var.f2532a;
                return (bu2Var.f1029j.length * 4) + bu2Var.f1023d.limit() + bu2Var.f1028i.length + ep0Var.f2545n;
            default:
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
        }
    }

    @Override // p000.d92
    /* JADX INFO: renamed from: d */
    public final Class mo191d() {
        switch (this.f13994i) {
            case 0:
                return yo0.class;
            default:
                return this.f13993h.getClass();
        }
    }

    @Override // p000.d92
    /* JADX INFO: renamed from: e */
    public final void mo192e() {
        td1 td1Var;
        td1 td1Var2;
        td1 td1Var3;
        switch (this.f13994i) {
            case 0:
                yo0 yo0Var = (yo0) this.f13993h;
                yo0Var.stop();
                yo0Var.f13539k = true;
                ep0 ep0Var = yo0Var.f13536h.f13087a;
                x82 x82Var = ep0Var.f2535d;
                ep0Var.f2534c.clear();
                Bitmap bitmap = ep0Var.f2543l;
                if (bitmap != null) {
                    ep0Var.f2536e.mo1325h(bitmap);
                    ep0Var.f2543l = null;
                }
                ep0Var.f2537f = false;
                cp0 cp0Var = ep0Var.f2540i;
                if (cp0Var != null) {
                    x82Var.m6048a(cp0Var);
                    ep0Var.f2540i = null;
                }
                cp0 cp0Var2 = ep0Var.f2542k;
                if (cp0Var2 != null) {
                    x82Var.m6048a(cp0Var2);
                    ep0Var.f2542k = null;
                }
                cp0 cp0Var3 = ep0Var.f2544m;
                if (cp0Var3 != null) {
                    x82Var.m6048a(cp0Var3);
                    ep0Var.f2544m = null;
                }
                bu2 bu2Var = ep0Var.f2532a;
                sz0 sz0Var = bu2Var.f1022c;
                bu2Var.f1031l = null;
                byte[] bArr = bu2Var.f1028i;
                if (bArr != null && (td1Var3 = (td1) sz0Var.f10437j) != null) {
                    td1Var3.m5171g(bArr);
                }
                int[] iArr = bu2Var.f1029j;
                if (iArr != null && (td1Var2 = (td1) sz0Var.f10437j) != null) {
                    td1Var2.m5171g(iArr);
                }
                Bitmap bitmap2 = bu2Var.f1032m;
                if (bitmap2 != null) {
                    ((InterfaceC0965zk) sz0Var.f10436i).mo1325h(bitmap2);
                }
                bu2Var.f1032m = null;
                bu2Var.f1023d = null;
                bu2Var.f1038s = null;
                byte[] bArr2 = bu2Var.f1024e;
                if (bArr2 != null && (td1Var = (td1) sz0Var.f10437j) != null) {
                    td1Var.m5171g(bArr2);
                }
                ep0Var.f2541j = true;
                break;
        }
    }

    @Override // p000.d92
    public final Object get() {
        Drawable drawable = this.f13993h;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    /* JADX INFO: renamed from: c */
    private final void m6479c() {
    }
}
