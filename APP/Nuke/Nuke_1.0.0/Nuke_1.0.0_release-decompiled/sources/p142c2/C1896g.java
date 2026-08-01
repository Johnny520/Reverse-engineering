package p142c2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.C1927i;
import com.bumptech.glide.C1945n;
import com.bumptech.glide.ComponentCallbacks2C1921c;
import com.bumptech.glide.ComponentCallbacks2C1947p;
import java.util.ArrayList;
import p010B3.C0226e;
import p073O1.C1039a;
import p073O1.C1040b;
import p073O1.C1042d;
import p078P1.InterfaceC1151m;
import p088R1.C1211l;
import p093S1.InterfaceC1289a;
import p116X1.C1655d;
import p171h2.C2238e;
import p189k2.C2452b;
import p195l2.AbstractC2503g;
import p195l2.AbstractC2511o;

/* JADX INFO: renamed from: c2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1896g {

    /* JADX INFO: renamed from: a */
    public final C1042d f6444a;

    /* JADX INFO: renamed from: b */
    public final Handler f6445b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f6446c;

    /* JADX INFO: renamed from: d */
    public final ComponentCallbacks2C1947p f6447d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1289a f6448e;

    /* JADX INFO: renamed from: f */
    public boolean f6449f;

    /* JADX INFO: renamed from: g */
    public boolean f6450g;

    /* JADX INFO: renamed from: h */
    public C1945n f6451h;

    /* JADX INFO: renamed from: i */
    public C1894e f6452i;

    /* JADX INFO: renamed from: j */
    public boolean f6453j;

    /* JADX INFO: renamed from: k */
    public C1894e f6454k;

    /* JADX INFO: renamed from: l */
    public Bitmap f6455l;

    /* JADX INFO: renamed from: m */
    public C1894e f6456m;

    /* JADX INFO: renamed from: n */
    public int f6457n;

    /* JADX INFO: renamed from: o */
    public int f6458o;

    /* JADX INFO: renamed from: p */
    public int f6459p;

    public C1896g(ComponentCallbacks2C1921c componentCallbacks2C1921c, C1042d c1042d, int i5, int i6, Bitmap bitmap) {
        InterfaceC1289a interfaceC1289a = componentCallbacks2C1921c.f6514d;
        C1927i c1927i = componentCallbacks2C1921c.f6516f;
        ComponentCallbacks2C1947p componentCallbacks2C1947pM3415c = ComponentCallbacks2C1921c.m3415c(c1927i.getBaseContext());
        ComponentCallbacks2C1947p componentCallbacks2C1947pM3415c2 = ComponentCallbacks2C1921c.m3415c(c1927i.getBaseContext());
        componentCallbacks2C1947pM3415c2.getClass();
        C1945n c1945nM3608w = new C1945n(componentCallbacks2C1947pM3415c2.f6608d, componentCallbacks2C1947pM3415c2, Bitmap.class, componentCallbacks2C1947pM3415c2.f6609e).mo3605a(ComponentCallbacks2C1947p.f6607l).mo3605a(((C2238e) ((C2238e) ((C2238e) new C2238e().m4038h(C1211l.f4020b)).m4050u()).m4046q()).m4041l(i5, i6));
        this.f6446c = new ArrayList();
        this.f6447d = componentCallbacks2C1947pM3415c;
        Handler handler = new Handler(Looper.getMainLooper(), new C0226e(1, this));
        this.f6448e = interfaceC1289a;
        this.f6445b = handler;
        this.f6451h = c1945nM3608w;
        this.f6444a = c1042d;
        m3387c(C1655d.f5683b, bitmap);
    }

    /* JADX INFO: renamed from: a */
    public final void m3385a() {
        int i5;
        if (!this.f6449f || this.f6450g) {
            return;
        }
        C1894e c1894e = this.f6456m;
        if (c1894e != null) {
            this.f6456m = null;
            m3386b(c1894e);
            return;
        }
        this.f6450g = true;
        C1042d c1042d = this.f6444a;
        C1040b c1040b = c1042d.f3272l;
        int i6 = c1040b.f3248c;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) ((i6 <= 0 || (i5 = c1042d.f3271k) < 0) ? 0 : (i5 < 0 || i5 >= i6) ? -1 : ((C1039a) c1040b.f3250e.get(i5)).f3243i));
        int i7 = (c1042d.f3271k + 1) % c1042d.f3272l.f3248c;
        c1042d.f3271k = i7;
        this.f6454k = new C1894e(this.f6445b, i7, jUptimeMillis);
        C1945n c1945nM3604B = this.f6451h.mo3605a((C2238e) new C2238e().m4045p(new C2452b(Double.valueOf(Math.random())))).m3604B(c1042d);
        c1945nM3604B.m3603A(this.f6454k, c1945nM3604B);
    }

    /* JADX INFO: renamed from: b */
    public final void m3386b(C1894e c1894e) {
        this.f6450g = false;
        boolean z5 = this.f6453j;
        Handler handler = this.f6445b;
        if (z5) {
            handler.obtainMessage(2, c1894e).sendToTarget();
            return;
        }
        if (!this.f6449f) {
            this.f6456m = c1894e;
            return;
        }
        if (c1894e.f6443j != null) {
            Bitmap bitmap = this.f6455l;
            if (bitmap != null) {
                this.f6448e.mo154e(bitmap);
                this.f6455l = null;
            }
            C1894e c1894e2 = this.f6452i;
            this.f6452i = c1894e;
            ArrayList arrayList = this.f6446c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C1892c c1892c = (C1892c) ((InterfaceC1895f) arrayList.get(size));
                Object callback = c1892c.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    c1892c.stop();
                    c1892c.invalidateSelf();
                } else {
                    c1892c.invalidateSelf();
                    C1894e c1894e3 = c1892c.f6426d.f6425a.f6452i;
                    if ((c1894e3 != null ? c1894e3.f6441h : -1) == r5.f6444a.f3272l.f3248c - 1) {
                        c1892c.f6431i++;
                    }
                    int i5 = c1892c.f6432j;
                    if (i5 != -1 && c1892c.f6431i >= i5) {
                        c1892c.stop();
                    }
                }
            }
            if (c1894e2 != null) {
                handler.obtainMessage(2, c1894e2).sendToTarget();
            }
        }
        m3385a();
    }

    /* JADX INFO: renamed from: c */
    public final void m3387c(InterfaceC1151m interfaceC1151m, Bitmap bitmap) {
        AbstractC2503g.m4445c(interfaceC1151m, "Argument must not be null");
        AbstractC2503g.m4445c(bitmap, "Argument must not be null");
        this.f6455l = bitmap;
        this.f6451h = this.f6451h.mo3605a(new C2238e().m4047r(interfaceC1151m, true));
        this.f6457n = AbstractC2511o.m4454c(bitmap);
        this.f6458o = bitmap.getWidth();
        this.f6459p = bitmap.getHeight();
    }
}
