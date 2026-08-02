package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.ComponentCallbacks2C0099a;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ep0 {

    /* JADX INFO: renamed from: a */
    public final bu2 f2532a;

    /* JADX INFO: renamed from: b */
    public final Handler f2533b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f2534c;

    /* JADX INFO: renamed from: d */
    public final x82 f2535d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0965zk f2536e;

    /* JADX INFO: renamed from: f */
    public boolean f2537f;

    /* JADX INFO: renamed from: g */
    public boolean f2538g;

    /* JADX INFO: renamed from: h */
    public s82 f2539h;

    /* JADX INFO: renamed from: i */
    public cp0 f2540i;

    /* JADX INFO: renamed from: j */
    public boolean f2541j;

    /* JADX INFO: renamed from: k */
    public cp0 f2542k;

    /* JADX INFO: renamed from: l */
    public Bitmap f2543l;

    /* JADX INFO: renamed from: m */
    public cp0 f2544m;

    /* JADX INFO: renamed from: n */
    public int f2545n;

    /* JADX INFO: renamed from: o */
    public int f2546o;

    /* JADX INFO: renamed from: p */
    public int f2547p;

    public ep0(ComponentCallbacks2C0099a componentCallbacks2C0099a, bu2 bu2Var, int i, int i2, Bitmap bitmap) {
        InterfaceC0965zk interfaceC0965zk = componentCallbacks2C0099a.f1643h;
        vp0 vp0Var = componentCallbacks2C0099a.f1645j;
        x82 x82VarM870c = ComponentCallbacks2C0099a.m870c(vp0Var.getBaseContext());
        x82 x82VarM870c2 = ComponentCallbacks2C0099a.m870c(vp0Var.getBaseContext());
        x82VarM870c2.getClass();
        s82 s82VarM4769y = new s82(x82VarM870c2.f12892h, x82VarM870c2, Bitmap.class, x82VarM870c2.f12893i).mo4766a(x82.f12891p).mo4766a(((z82) ((z82) ((z82) new z82().m5907h(b90.f742b)).m5921w()).m5917s()).m5911m(i, i2));
        this.f2534c = new ArrayList();
        this.f2535d = x82VarM870c;
        Handler handler = new Handler(Looper.getMainLooper(), new dp0(0, this));
        this.f2536e = interfaceC0965zk;
        this.f2533b = handler;
        this.f2539h = s82VarM4769y;
        this.f2532a = bu2Var;
        m1402c(d83.f1912b, bitmap);
    }

    /* JADX INFO: renamed from: a */
    public final void m1400a() {
        int i;
        if (!this.f2537f || this.f2538g) {
            return;
        }
        cp0 cp0Var = this.f2544m;
        if (cp0Var != null) {
            this.f2544m = null;
            m1401b(cp0Var);
            return;
        }
        this.f2538g = true;
        bu2 bu2Var = this.f2532a;
        fp0 fp0Var = bu2Var.f1031l;
        int i2 = fp0Var.f3094c;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) ((i2 <= 0 || (i = bu2Var.f1030k) < 0) ? 0 : (i < 0 || i >= i2) ? -1 : ((bp0) fp0Var.f3096e.get(i)).f976i));
        int i3 = (bu2Var.f1030k + 1) % bu2Var.f1031l.f3094c;
        bu2Var.f1030k = i3;
        this.f2542k = new cp0(this.f2533b, i3, jUptimeMillis);
        s82 s82VarM4765D = this.f2539h.mo4766a((z82) new z82().m5916r(new is1(Double.valueOf(Math.random())))).m4765D(bu2Var);
        s82VarM4765D.m4763B(this.f2542k, s82VarM4765D);
    }

    /* JADX INFO: renamed from: b */
    public final void m1401b(cp0 cp0Var) {
        this.f2538g = false;
        boolean z = this.f2541j;
        Handler handler = this.f2533b;
        if (z) {
            handler.obtainMessage(2, cp0Var).sendToTarget();
            return;
        }
        if (!this.f2537f) {
            this.f2544m = cp0Var;
            return;
        }
        if (cp0Var.f1659n != null) {
            Bitmap bitmap = this.f2543l;
            if (bitmap != null) {
                this.f2536e.mo1325h(bitmap);
                this.f2543l = null;
            }
            cp0 cp0Var2 = this.f2540i;
            this.f2540i = cp0Var;
            ArrayList arrayList = this.f2534c;
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
                    cp0 cp0Var3 = yo0Var.f13536h.f13087a.f2540i;
                    if ((cp0Var3 != null ? cp0Var3.f1657l : -1) == r5.f2532a.f1031l.f3094c - 1) {
                        yo0Var.f13541m++;
                    }
                    int i = yo0Var.f13542n;
                    if (i != -1 && yo0Var.f13541m >= i) {
                        yo0Var.stop();
                    }
                }
            }
            if (cp0Var2 != null) {
                handler.obtainMessage(2, cp0Var2).sendToTarget();
            }
        }
        m1400a();
    }

    /* JADX INFO: renamed from: c */
    public final void m1402c(n33 n33Var, Bitmap bitmap) {
        fg1.m1642q("Argument must not be null", n33Var);
        fg1.m1642q("Argument must not be null", bitmap);
        this.f2543l = bitmap;
        this.f2539h = this.f2539h.mo4766a(new z82().m5919u(n33Var, true));
        this.f2545n = b93.m496c(bitmap);
        this.f2546o = bitmap.getWidth();
        this.f2547p = bitmap.getHeight();
    }
}
