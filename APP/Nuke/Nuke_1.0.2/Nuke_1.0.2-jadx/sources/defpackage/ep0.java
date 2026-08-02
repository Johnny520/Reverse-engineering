package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.a;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ep0 {
    public final bu2 a;
    public final Handler b;
    public final ArrayList c;
    public final x82 d;
    public final zk e;
    public boolean f;
    public boolean g;
    public s82 h;
    public cp0 i;
    public boolean j;
    public cp0 k;
    public Bitmap l;
    public cp0 m;
    public int n;
    public int o;
    public int p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ep0(a aVar, bu2 bu2Var, int i, int i2, Bitmap bitmap) {
        zk zkVar = aVar.h;
        vp0 vp0Var = aVar.j;
        x82 x82VarC = a.c(vp0Var.getBaseContext());
        x82 x82VarC2 = a.c(vp0Var.getBaseContext());
        x82VarC2.getClass();
        s82 s82VarY = new s82(x82VarC2.h, x82VarC2, Bitmap.class, x82VarC2.i).a(x82.p).a(((z82) ((z82) ((z82) new z82().h(b90.b)).w()).s()).m(i, i2));
        this.c = new ArrayList();
        this.d = x82VarC;
        Handler handler = new Handler(Looper.getMainLooper(), new dp0(0, this));
        this.e = zkVar;
        this.b = handler;
        this.h = s82VarY;
        this.a = bu2Var;
        c(d83.b, bitmap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        int i;
        if (!this.f || this.g) {
            return;
        }
        cp0 cp0Var = this.m;
        if (cp0Var != null) {
            this.m = null;
            b(cp0Var);
            return;
        }
        this.g = true;
        bu2 bu2Var = this.a;
        fp0 fp0Var = bu2Var.l;
        int i2 = fp0Var.c;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) ((i2 <= 0 || (i = bu2Var.k) < 0) ? 0 : (i < 0 || i >= i2) ? -1 : ((bp0) fp0Var.e.get(i)).i));
        int i3 = (bu2Var.k + 1) % bu2Var.l.c;
        bu2Var.k = i3;
        this.k = new cp0(this.b, i3, jUptimeMillis);
        s82 s82VarD = this.h.a((z82) new z82().r(new is1(Double.valueOf(Math.random())))).D(bu2Var);
        s82VarD.B(this.k, s82VarD);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(cp0 cp0Var) {
        this.g = false;
        boolean z = this.j;
        Handler handler = this.b;
        if (z) {
            handler.obtainMessage(2, cp0Var).sendToTarget();
            return;
        }
        if (!this.f) {
            this.m = cp0Var;
            return;
        }
        if (cp0Var.n != null) {
            Bitmap bitmap = this.l;
            if (bitmap != null) {
                this.e.h(bitmap);
                this.l = null;
            }
            cp0 cp0Var2 = this.i;
            this.i = cp0Var;
            ArrayList arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                yo0 yo0Var = (yo0) arrayList.get(size);
                Object callback = yo0Var.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    yo0Var.stop();
                    yo0Var.invalidateSelf();
                } else {
                    yo0Var.invalidateSelf();
                    cp0 cp0Var3 = yo0Var.h.a.i;
                    if ((cp0Var3 != null ? cp0Var3.l : -1) == r5.a.l.c - 1) {
                        yo0Var.m++;
                    }
                    int i = yo0Var.n;
                    if (i != -1 && yo0Var.m >= i) {
                        yo0Var.stop();
                    }
                }
            }
            if (cp0Var2 != null) {
                handler.obtainMessage(2, cp0Var2).sendToTarget();
            }
        }
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(n33 n33Var, Bitmap bitmap) {
        fg1.q("Argument must not be null", n33Var);
        fg1.q("Argument must not be null", bitmap);
        this.l = bitmap;
        this.h = this.h.a(new z82().u(n33Var, true));
        this.n = b93.c(bitmap);
        this.o = bitmap.getWidth();
        this.p = bitmap.getHeight();
    }
}
