package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: I5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0350I5 implements InterfaceC2518sw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1175a;

    /* JADX INFO: renamed from: b */
    public final Object f1176b;

    /* JADX INFO: renamed from: c */
    public final Object f1177c;

    public /* synthetic */ C0350I5(int i, Object obj, Object obj2) {
        this.f1175a = i;
        this.f1176b = obj;
        this.f1177c = obj2;
    }

    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: a */
    public final InterfaceC2389pw mo749a(Object obj, int i, int i2, C2644vt c2644vt) {
        boolean z;
        C1340dv c1340dv;
        C2631vg c2631vg;
        switch (this.f1175a) {
            case 0:
                InterfaceC2389pw interfaceC2389pwMo749a = ((InterfaceC2518sw) this.f1176b).mo749a(obj, i, i2, c2644vt);
                Resources resources = (Resources) this.f1177c;
                if (interfaceC2389pwMo749a == null) {
                    return null;
                }
                return new C0608O5(resources, interfaceC2389pwMo749a);
            case 1:
                InterfaceC2389pw interfaceC2389pwM5117c = ((C2604uw) this.f1176b).m5117c((Uri) obj, c2644vt);
                if (interfaceC2389pwM5117c == null) {
                    return null;
                }
                return AbstractC0148Dc.m271e((InterfaceC0565N5) this.f1177c, (Drawable) ((C0069Bj) interfaceC2389pwM5117c).get(), i, i2);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof C1340dv) {
                    c1340dv = (C1340dv) inputStream;
                    z = false;
                } else {
                    z = true;
                    c1340dv = new C1340dv(inputStream, (C2812zp) this.f1177c);
                }
                ArrayDeque arrayDeque = C2631vg.f9139c;
                synchronized (arrayDeque) {
                    c2631vg = (C2631vg) arrayDeque.poll();
                    break;
                }
                if (c2631vg == null) {
                    c2631vg = new C2631vg();
                }
                C2631vg c2631vg2 = c2631vg;
                c2631vg2.f9140a = c1340dv;
                C2641vq c2641vq = new C2641vq(c2631vg2);
                C0299Gy c0299Gy = new C0299Gy(2, c1340dv, c2631vg2);
                try {
                    C2543te c2543te = (C2543te) this.f1176b;
                    C0608O5 c0608o5M5024a = c2543te.m5024a(new C2656w4(c2641vq, c2543te.f8856d, c2543te.f8855c), i, i2, c2644vt, c0299Gy);
                    c2631vg2.f9141b = null;
                    c2631vg2.f9140a = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(c2631vg2);
                        break;
                    }
                    if (z) {
                        c1340dv.m2597f();
                    }
                    return c0608o5M5024a;
                } catch (Throwable th) {
                    c2631vg2.f9141b = null;
                    c2631vg2.f9140a = null;
                    ArrayDeque arrayDeque2 = C2631vg.f9139c;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(c2631vg2);
                        if (!z) {
                            throw th;
                        }
                        c1340dv.m2597f();
                        throw th;
                    }
                }
        }
    }

    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: b */
    public final boolean mo750b(Object obj, C2644vt c2644vt) {
        switch (this.f1175a) {
            case 0:
                return ((InterfaceC2518sw) this.f1176b).mo750b(obj, c2644vt);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                return true;
        }
    }

    public C0350I5(Resources resources, InterfaceC2518sw interfaceC2518sw) {
        this.f1175a = 0;
        this.f1177c = resources;
        this.f1176b = interfaceC2518sw;
    }
}
