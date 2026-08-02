package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zo0 implements d92, fz0 {
    public final Drawable h;
    public final /* synthetic */ int i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zo0(Drawable drawable, int i) {
        this.i = i;
        fg1.q("Argument must not be null", drawable);
        this.h = drawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fz0
    public void a() {
        int i = this.i;
        Drawable drawable = this.h;
        switch (i) {
            case 0:
                ((yo0) drawable).h.a.l.prepareToDraw();
                break;
            default:
                if (drawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                } else if (drawable instanceof yo0) {
                    ((yo0) drawable).h.a.l.prepareToDraw();
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.d92
    public final int b() {
        int i = this.i;
        Drawable drawable = this.h;
        switch (i) {
            case 0:
                ep0 ep0Var = ((yo0) drawable).h.a;
                bu2 bu2Var = ep0Var.a;
                return (bu2Var.j.length * 4) + bu2Var.d.limit() + bu2Var.i.length + ep0Var.n;
            default:
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.d92
    public final Class d() {
        switch (this.i) {
            case 0:
                return yo0.class;
            default:
                return this.h.getClass();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.d92
    public final void e() {
        td1 td1Var;
        td1 td1Var2;
        td1 td1Var3;
        switch (this.i) {
            case 0:
                yo0 yo0Var = (yo0) this.h;
                yo0Var.stop();
                yo0Var.k = true;
                ep0 ep0Var = yo0Var.h.a;
                x82 x82Var = ep0Var.d;
                ep0Var.c.clear();
                Bitmap bitmap = ep0Var.l;
                if (bitmap != null) {
                    ep0Var.e.h(bitmap);
                    ep0Var.l = null;
                }
                ep0Var.f = false;
                cp0 cp0Var = ep0Var.i;
                if (cp0Var != null) {
                    x82Var.a(cp0Var);
                    ep0Var.i = null;
                }
                cp0 cp0Var2 = ep0Var.k;
                if (cp0Var2 != null) {
                    x82Var.a(cp0Var2);
                    ep0Var.k = null;
                }
                cp0 cp0Var3 = ep0Var.m;
                if (cp0Var3 != null) {
                    x82Var.a(cp0Var3);
                    ep0Var.m = null;
                }
                bu2 bu2Var = ep0Var.a;
                sz0 sz0Var = bu2Var.c;
                bu2Var.l = null;
                byte[] bArr = bu2Var.i;
                if (bArr != null && (td1Var3 = (td1) sz0Var.j) != null) {
                    td1Var3.g(bArr);
                }
                int[] iArr = bu2Var.j;
                if (iArr != null && (td1Var2 = (td1) sz0Var.j) != null) {
                    td1Var2.g(iArr);
                }
                Bitmap bitmap2 = bu2Var.m;
                if (bitmap2 != null) {
                    ((zk) sz0Var.i).h(bitmap2);
                }
                bu2Var.m = null;
                bu2Var.d = null;
                bu2Var.s = null;
                byte[] bArr2 = bu2Var.e;
                if (bArr2 != null && (td1Var = (td1) sz0Var.j) != null) {
                    td1Var.g(bArr2);
                }
                ep0Var.j = true;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.d92
    public final Object get() {
        Drawable drawable = this.h;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    private final void c() {
    }
}
