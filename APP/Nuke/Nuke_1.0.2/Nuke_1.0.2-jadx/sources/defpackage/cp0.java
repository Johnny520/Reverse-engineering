package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cp0 implements by2 {
    public final int h;
    public final int i;
    public l82 j;
    public final Handler k;
    public final int l;
    public final long m;
    public Bitmap n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public cp0(Handler handler, int i, long j) {
        if (!b93.i(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            s.j("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
            throw null;
        }
        this.h = Integer.MIN_VALUE;
        this.i = Integer.MIN_VALUE;
        this.k = handler;
        this.l = i;
        this.m = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.by2
    public final void m(yq2 yq2Var) throws Throwable {
        yq2Var.l(this.h, this.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.by2
    public final void o(l82 l82Var) {
        this.j = l82Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.by2
    public final l82 u() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.by2
    public final void v(Drawable drawable) {
        this.n = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.by2
    public final void w(Object obj) {
        this.n = (Bitmap) obj;
        Handler handler = this.k;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.m);
    }

    @Override // defpackage.ga1
    public final void x() {
    }

    @Override // defpackage.by2
    public final void f(Drawable drawable) {
    }

    @Override // defpackage.by2
    public final void g(yq2 yq2Var) {
    }

    @Override // defpackage.by2
    public final void p(Drawable drawable) {
    }
}
