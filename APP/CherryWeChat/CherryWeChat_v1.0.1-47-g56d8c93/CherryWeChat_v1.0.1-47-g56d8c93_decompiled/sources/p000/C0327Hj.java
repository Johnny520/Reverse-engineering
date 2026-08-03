package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.ComponentCallbacks2C1273a;
import java.util.ArrayList;

/* JADX INFO: renamed from: Hj */
/* JADX INFO: loaded from: classes.dex */
public final class C0327Hj {

    /* JADX INFO: renamed from: a */
    public final C0986Wy f1113a;

    /* JADX INFO: renamed from: b */
    public final Handler f1114b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f1115c;

    /* JADX INFO: renamed from: d */
    public final ComponentCallbacks2C1473gw f1116d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0565N5 f1117e;

    /* JADX INFO: renamed from: f */
    public boolean f1118f;

    /* JADX INFO: renamed from: g */
    public boolean f1119g;

    /* JADX INFO: renamed from: h */
    public C1193aw f1120h;

    /* JADX INFO: renamed from: i */
    public C0198Ej f1121i;

    /* JADX INFO: renamed from: j */
    public boolean f1122j;

    /* JADX INFO: renamed from: k */
    public C0198Ej f1123k;

    /* JADX INFO: renamed from: l */
    public Bitmap f1124l;

    /* JADX INFO: renamed from: m */
    public C0198Ej f1125m;

    /* JADX INFO: renamed from: n */
    public int f1126n;

    /* JADX INFO: renamed from: o */
    public int f1127o;

    /* JADX INFO: renamed from: p */
    public int f1128p;

    public C0327Hj(ComponentCallbacks2C1273a componentCallbacks2C1273a, C0986Wy c0986Wy, int i, int i2, Bitmap bitmap) {
        InterfaceC0565N5 interfaceC0565N5 = componentCallbacks2C1273a.f4337a;
        C0756Rj c0756Rj = componentCallbacks2C1273a.f4339c;
        ComponentCallbacks2C1473gw componentCallbacks2C1473gwM2414c = ComponentCallbacks2C1273a.m2414c(c0756Rj.getBaseContext());
        ComponentCallbacks2C1473gw componentCallbacks2C1473gwM2414c2 = ComponentCallbacks2C1273a.m2414c(c0756Rj.getBaseContext());
        componentCallbacks2C1473gwM2414c2.getClass();
        C1193aw c1193awM2304w = new C1193aw(componentCallbacks2C1473gwM2414c2.f5216a, componentCallbacks2C1473gwM2414c2, Bitmap.class, componentCallbacks2C1473gwM2414c2.f5217b).mo2301a(ComponentCallbacks2C1473gw.f5215k).mo2301a(((C2252mw) ((C2252mw) ((C2252mw) new C2252mw().m5311e(C0922Vd.f2879c)).m5326u()).m5322q()).m5315j(i, i2));
        this.f1115c = new ArrayList();
        this.f1116d = componentCallbacks2C1473gwM2414c;
        Handler handler = new Handler(Looper.getMainLooper(), new C0284Gj(0, this));
        this.f1117e = interfaceC0565N5;
        this.f1114b = handler;
        this.f1120h = c1193awM2304w;
        this.f1113a = c0986Wy;
        m714c(C0958WC.f2994b, bitmap);
    }

    /* JADX INFO: renamed from: a */
    public final void m712a() {
        int i;
        if (!this.f1118f || this.f1119g) {
            return;
        }
        C0198Ej c0198Ej = this.f1125m;
        if (c0198Ej != null) {
            this.f1125m = null;
            m713b(c0198Ej);
            return;
        }
        this.f1119g = true;
        C0986Wy c0986Wy = this.f1113a;
        C0370Ij c0370Ij = c0986Wy.f3112l;
        int i2 = c0370Ij.f1287c;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) ((i2 <= 0 || (i = c0986Wy.f3111k) < 0) ? 0 : (i < 0 || i >= i2) ? -1 : ((C0155Dj) c0370Ij.f1289e.get(i)).f427i));
        int i3 = (c0986Wy.f3111k + 1) % c0986Wy.f3112l.f1287c;
        c0986Wy.f3111k = i3;
        this.f1123k = new C0198Ej(this.f1114b, i3, jUptimeMillis);
        C1193aw c1193awM2300C = this.f1120h.mo2301a((C2252mw) new C2252mw().m5321p(new C1382et(Double.valueOf(Math.random())))).m2300C(c0986Wy);
        c1193awM2300C.m2307z(this.f1123k, c1193awM2300C);
    }

    /* JADX INFO: renamed from: b */
    public final void m713b(C0198Ej c0198Ej) {
        this.f1119g = false;
        boolean z = this.f1122j;
        Handler handler = this.f1114b;
        if (z) {
            handler.obtainMessage(2, c0198Ej).sendToTarget();
            return;
        }
        if (!this.f1118f) {
            this.f1125m = c0198Ej;
            return;
        }
        if (c0198Ej.f602g != null) {
            Bitmap bitmap = this.f1124l;
            if (bitmap != null) {
                this.f1117e.mo53h(bitmap);
                this.f1124l = null;
            }
            C0198Ej c0198Ej2 = this.f1121i;
            this.f1121i = c0198Ej;
            ArrayList arrayList = this.f1115c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C0026Aj c0026Aj = (C0026Aj) ((InterfaceC0241Fj) arrayList.get(size));
                Object callback = c0026Aj.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    c0026Aj.stop();
                    c0026Aj.invalidateSelf();
                } else {
                    c0026Aj.invalidateSelf();
                    C0198Ej c0198Ej3 = ((C0327Hj) c0026Aj.f50a.f1572b).f1121i;
                    if ((c0198Ej3 != null ? c0198Ej3.f600e : -1) == r5.f1113a.f3112l.f1287c - 1) {
                        c0026Aj.f55f++;
                    }
                    int i = c0026Aj.f56g;
                    if (i != -1 && c0026Aj.f55f >= i) {
                        c0026Aj.stop();
                    }
                }
            }
            if (c0198Ej2 != null) {
                handler.obtainMessage(2, c0198Ej2).sendToTarget();
            }
        }
        m712a();
    }

    /* JADX INFO: renamed from: c */
    public final void m714c(InterfaceC0098CB interfaceC0098CB, Bitmap bitmap) {
        AbstractC0714Qj.m1488j("Argument must not be null", interfaceC0098CB);
        AbstractC0714Qj.m1488j("Argument must not be null", bitmap);
        this.f1124l = bitmap;
        this.f1120h = this.f1120h.mo2301a(new C2252mw().m5324s(interfaceC0098CB, true));
        this.f1126n = AbstractC2622vD.m5132c(bitmap);
        this.f1127o = bitmap.getWidth();
        this.f1128p = bitmap.getHeight();
    }
}
