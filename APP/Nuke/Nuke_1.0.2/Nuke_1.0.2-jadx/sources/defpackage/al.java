package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class al implements d92, fz0 {
    public final /* synthetic */ int h = 1;
    public final Object i;
    public final Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public al(zk zkVar, Bitmap bitmap) {
        fg1.q("Bitmap must not be null", bitmap);
        this.i = bitmap;
        fg1.q("BitmapPool must not be null", zkVar);
        this.j = zkVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static al c(zk zkVar, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new al(zkVar, bitmap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fz0
    public final void a() {
        switch (this.h) {
            case 0:
                ((Bitmap) this.i).prepareToDraw();
                break;
            default:
                d92 d92Var = (d92) this.j;
                if (d92Var instanceof fz0) {
                    ((fz0) d92Var).a();
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.d92
    public final int b() {
        switch (this.h) {
            case 0:
                return b93.c((Bitmap) this.i);
            default:
                return ((d92) this.j).b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.d92
    public final Class d() {
        switch (this.h) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.d92
    public final void e() {
        switch (this.h) {
            case 0:
                ((zk) this.j).h((Bitmap) this.i);
                break;
            default:
                ((d92) this.j).e();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.d92
    public final Object get() {
        switch (this.h) {
            case 0:
                return (Bitmap) this.i;
            default:
                return new BitmapDrawable((Resources) this.i, (Bitmap) ((d92) this.j).get());
        }
    }

    public al(Resources resources, d92 d92Var) {
        fg1.q("Argument must not be null", resources);
        this.i = resources;
        fg1.q("Argument must not be null", d92Var);
        this.j = d92Var;
    }
}
